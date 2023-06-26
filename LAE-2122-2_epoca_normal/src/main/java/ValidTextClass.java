import java.io.ObjectStreamException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ValidTextClass {
    public static void checkAndSet(Object obj, String propName, String setValue) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Field field = obj.getClass().getField(propName);
        String fieldName = field.getName();

        if (Arrays.asList(field.getAnnotation(ValidText.class).values()).contains(setValue)) {
            obj.getClass().getMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1),
                    String.class).invoke(obj, setValue);
        } else {
            throw new IllegalArgumentException();
        }

    }

}
