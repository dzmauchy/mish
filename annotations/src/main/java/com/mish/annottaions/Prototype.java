package com.mish.annottaions;

import java.lang.annotation.*;

/**
 * An annotation to register a prototype instance from a factory method or a class constructor
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Prototype {

    /**
     * Prototype name
     *
     * @return Prototype name
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
     * Order
     *
     * @return Order
     */
    String order() default "";
}
