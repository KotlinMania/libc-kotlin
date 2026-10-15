// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun mbstowcsL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): ULong
