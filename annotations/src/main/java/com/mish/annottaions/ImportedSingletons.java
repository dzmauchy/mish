package com.mish.annottaions;

import java.lang.annotation.*;

/**
 * Imported singletons collection
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.PACKAGE})
public @interface ImportedSingletons {

    /**
     * Imported singleton collection
     * @return Imported singleton collection
     */
    ImportedSingleton[] value();
}
