package com.mish.annottaions;

import java.lang.annotation.*;

/**
 * Imported prototype
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(ImportedPrototypes.class)
@Target({ElementType.TYPE, ElementType.PACKAGE})
public @interface ImportedPrototype {

    /**
     * Class reference
     *
     * @return Class reference
     */
    Class<?> ref();

    /**
     * Prototype definition
     *
     * @return Prototype definition
     */
    Prototype def();
}
