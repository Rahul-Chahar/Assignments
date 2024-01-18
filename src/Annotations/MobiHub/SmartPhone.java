package Annotations.MobiHub;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os() default "IOS";
    int version() default 6;
}

interface Type {
    // Default methods
    default String os() {
        return "IOS";
    }

    default int version() {
        return 6;
    }
}

