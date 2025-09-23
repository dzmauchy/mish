package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Pre destroy method
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface PreDestroy {
}
