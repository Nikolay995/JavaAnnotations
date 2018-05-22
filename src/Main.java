import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        final Class<?> cls = AnotClass.class;
        if (cls.isAnnotationPresent(MyAnnotation.class)){
            System.out.println("Class has annotation");

            MyAnnotation an = cls.getAnnotation(MyAnnotation.class);
            System.out.println(an.param1() + ", " + an.param2());

            Method [] methods = cls.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MethodAnnotation.class)){
                    System.out.println("Method " + method.getName() + " is marked with MethodAnnotation");
                }

            }
        }

    }


}
