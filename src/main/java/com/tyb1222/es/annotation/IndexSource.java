package com.tyb1222.es.annotation;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IndexSource {
    String indexName();

//    String[] indexNames() ;
}
