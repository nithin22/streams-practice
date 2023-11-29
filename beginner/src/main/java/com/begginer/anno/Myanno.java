package com.begginer.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Myanno {
    String str() default "Testing";
    int val() default 10;
}
