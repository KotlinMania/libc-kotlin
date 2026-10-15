// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun setvbuf(arg1: FILE?, arg2: String?, arg3: Int, arg4: ULong): Int
