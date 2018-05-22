package saveAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Container c = new Container();
        Class cls = c.getClass();

        if (!cls.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Error");
            return;
        }
        SaveTo saveTo = (SaveTo) cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)){
                method.invoke(c,path);
                break;
            }

        }

    }
}

