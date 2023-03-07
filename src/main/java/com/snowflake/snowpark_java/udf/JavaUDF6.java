package com.snowflake.snowpark_java.udf;

import com.snowflake.snowpark_java.internal.JavaUDF;

/** A Java UDF interface that has 6 arguments. */
@FunctionalInterface
public interface JavaUDF6<A1, A2, A3, A4, A5, A6, RT> extends JavaUDF {
  RT call(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6);
}
