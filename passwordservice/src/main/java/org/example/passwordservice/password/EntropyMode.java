package org.example.passwordservice.password;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EntropyMode {
    String value();
}
