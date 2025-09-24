package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Factory
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface Factory {

    /**
     * Factory name
     *
     * @return Factory name
     */
    String name();
}
