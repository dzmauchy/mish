package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Application
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface Application {

    /**
     * Application name
     *
     * @return Application name
     */
    String name();

    /**
     * Application contents
     *
     * @return Application contents
     */
    Class<?>[] contents();
}
