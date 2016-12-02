package com.kandashan.annotation.demo;

import java.lang.annotation.*;

/**
 * Created by CPR199 on 2016-12-02.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    String value() default "";
}
