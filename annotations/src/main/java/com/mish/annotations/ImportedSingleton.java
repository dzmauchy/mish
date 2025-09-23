package com.mish.annotations;

import java.lang.annotation.*;

/**
 * An imported singleton
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(ImportedSingletons.class)
@Target({ElementType.TYPE, ElementType.PACKAGE})
public @interface ImportedSingleton {

    /**
     * A reference to a type
     * @return Reference to a type
     */
    Class<?> ref();

    /**
     * Singleton definition
     * @return Singleton definition
     */
    Singleton def();
}
