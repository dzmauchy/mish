package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Imported singletons collection
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface ImportedSingletons {

    /**
     * Imported singleton collection
     *
     * @return Imported singleton collection
     */
    ImportedSingleton[] value();
}
