import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarUtils {

    public static Method[] getPublicVarGettersOf(Object obj) {
        List<Method> resultMethods = new ArrayList<>();
        Method[] methods = obj.getClass().getMethods();

        for (Method m: methods) {
            if (!m.isAnnotationPresent(DontRead.class)) {
                if (m.getName().startsWith("get") && Arrays.stream(methods).anyMatch(method ->
                        !method.getName().equals(m.getName()) &&
                        method.getName().endsWith(m.getName().substring(3)))) {
                    resultMethods.add(m);
                }
            }
        }

        return resultMethods.toArray(new Method[0]);
    }

    public static void showVars(Object obj) throws InvocationTargetException, IllegalAccessException {
        System.out.print(obj.getClass().getName());
        System.out.println("{");
        Method[] publicMethods = getPublicVarGettersOf(obj);
        for (Method m: publicMethods) {
            System.out.print("\t var ");
            System.out.print(m.getName().substring(3).toLowerCase());
            System.out.print(" : ");
            System.out.print(m.getReturnType().getSimpleName());
            System.out.print(" = ");
            System.out.println(m.invoke(obj));
        }
        System.out.println("}");

    }
}
