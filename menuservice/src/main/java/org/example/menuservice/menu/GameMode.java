package org.example.menuservice.menu;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(GameModes.class)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface GameMode {
    String value() default "endless";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface GameModes{
    GameMode[] value();
}
