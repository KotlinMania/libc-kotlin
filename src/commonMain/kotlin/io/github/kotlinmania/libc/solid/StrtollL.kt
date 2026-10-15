// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long
