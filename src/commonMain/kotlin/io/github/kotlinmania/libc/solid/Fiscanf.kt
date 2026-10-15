// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int
