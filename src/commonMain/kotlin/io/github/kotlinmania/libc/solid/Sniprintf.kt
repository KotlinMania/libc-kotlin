// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int
