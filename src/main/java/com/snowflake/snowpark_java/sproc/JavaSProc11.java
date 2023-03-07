package com.snowflake.snowpark_java.sproc;

import com.snowflake.snowpark_java.Session;
import com.snowflake.snowpark_java.internal.JavaSProc;

/** A Java SProc interface that has 11 arguments. */
@FunctionalInterface
public interface JavaSProc11<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, RT> extends JavaSProc {
  RT call(
      Session session,
      A1 arg1,
      A2 arg2,
      A3 arg3,
      A4 arg4,
      A5 arg5,
      A6 arg6,
      A7 arg7,
      A8 arg8,
      A9 arg9,
      A10 arg10,
      A11 arg11);
}
