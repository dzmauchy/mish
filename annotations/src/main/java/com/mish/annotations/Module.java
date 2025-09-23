package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Module definition
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface Module {

    /**
     * Module name
     *
     * @return Module name
     */
    String name();

    /**
     * Module contents
     *
     * @return Module contents
     */
    Class<?>[] contents();
}
