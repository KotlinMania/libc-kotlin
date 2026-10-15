// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int
