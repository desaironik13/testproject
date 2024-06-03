package com.trial.testproject.annotations.processors;

import com.trial.testproject.annotations.IntegerDataCreator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.lang.reflect.Field;
import java.util.Map;

import static com.trial.testproject.TestprojectApplication.CONSTANT_VALUES;
import static java.util.Objects.requireNonNull;

public class IntegerDataCreatorProcessor {

    public static Object generateInteger(Object object) throws Exception {

        try {
            Class<?> objectClass = requireNonNull(object).getClass();

            for (Field field: objectClass.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(IntegerDataCreator.class)) {
                    field.set(object, getRandomNumber(field));
                }
            }

            return object;
        }
        catch (IllegalAccessException e) {
            throw new Exception();
        }
    }

    private static int getRandomNumber(Field field) {
        IntegerDataCreator integerDataCreator = field.getAnnotation(IntegerDataCreator.class);
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        if(StringUtils.isNotBlank(integerDataCreator.constant())) {
            Map<Integer, Integer> integerIntegerMap = (Map<Integer, Integer>) CONSTANT_VALUES.get(integerDataCreator.constant());
            Object[] values = integerIntegerMap.values().toArray();
            return (Integer) values[randomDataGenerator.nextInt(0, values.length)];
        }
        return randomDataGenerator.nextInt(integerDataCreator.min(), integerDataCreator.max());
    }
}
