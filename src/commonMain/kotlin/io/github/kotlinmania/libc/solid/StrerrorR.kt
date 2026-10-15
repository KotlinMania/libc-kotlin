// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun strerrorR(arg1: Int, arg2: String?, arg3: ULong): Int
