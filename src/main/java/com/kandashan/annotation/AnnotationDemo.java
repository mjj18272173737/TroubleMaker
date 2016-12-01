package com.kandashan.annotation;



/**
 * Created by CPR199 on 2016-12-01.
 */

public @interface AnnotationDemo {

    public enum Severity { CRITICAL, IMPORTANT, TRIVIAL, DOCUMENTATION };


    Severity severity() default Severity.IMPORTANT;

    String item();

    String assignedTo();

    String dateAssigned();

}
