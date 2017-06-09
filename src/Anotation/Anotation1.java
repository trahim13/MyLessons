package Anotation;

import java.lang.annotation.*;

public class Anotation1 {
}
@Deprecated
class MyClass {
    @Deprecated
    MyClass() {

    }
    @Deprecated
            @MyAnn(a=9, value = false, stringMas = {"one", "two"})
    int a;

//    @MyAnn(a = 8, str="str", value = true)
    @Deprecated
    public void method(@Deprecated int z) {

        @Deprecated int loc;
    }
}
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
@interface MyAnn {
    int a();
    String str() default "String";
    boolean value();

    Class<?> sameClass() default Void.class;
    Override ov() default @Override();
    String[] stringMas();
}
