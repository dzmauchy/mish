package com.mish.annotations;

import java.lang.annotation.*;

/**
 * Post construct method
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface PostConstruct {
}
