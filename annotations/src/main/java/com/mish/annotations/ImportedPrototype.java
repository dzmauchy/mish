package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Imported prototype
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(ImportedPrototypes.class)
@Target({ElementType.TYPE})
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
