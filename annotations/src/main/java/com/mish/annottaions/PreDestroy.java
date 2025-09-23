package com.mish.annottaions;

import java.lang.annotation.*;

/**
 * Pre destroy method
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface PreDestroy {
}
