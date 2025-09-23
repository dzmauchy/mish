package com.mish.annotations;

import java.lang.annotation.*;

/**
 * An annotation to register a singleton instance from a factory method or a class constructor
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Singleton {

    /**
     * Unique singleton name
     *
     * @return Singleton name
     */
    String name();

    /**
     * List of all destroyer methods to call before bean destruction
     *
     * @return Destroyer method names
     */
    String[] destroyers() default {""};

    /**
     * List of all initializer method names after bean creation
     *
     * @return Initializer method names
     */
    String[] initializers() default {""};

    /**
     * MBean domain
     *
     * @return MBean domain
     */
    String[] domain() default {};

    /**
     * MBean attributes
     *
     * @return MBean attributes (key-value pairs)
     */
    String[] attributes() default {};

    /**
     * Order
     *
     * @return Order
     */
    String order() default "";

    /**
     * Lazy initialization flag
     *
     * @return Lazy initialization flag value
     */
    boolean lazy() default true;
}
