import java.lang.annotation.*;

@Inherited
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String param1() default "Hello";
    String param2();
}
