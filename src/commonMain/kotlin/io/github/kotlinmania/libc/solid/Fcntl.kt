// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun fcntl(arg1: Int, arg2: Int, vararg args: Any?): Int
