package org.example.passwordservice.password;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EntropyModes.class)
public @interface EntropyMode {
    String value() default "letters";
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface EntropyModes{
    EntropyMode[] value();
}
