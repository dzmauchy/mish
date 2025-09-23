package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Imported prototypes
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.PACKAGE})
public @interface ImportedPrototypes {

    /**
     * Imported prototypes
     *
     * @return Imported prototypes
     */
    ImportedPrototype[] value();
}
