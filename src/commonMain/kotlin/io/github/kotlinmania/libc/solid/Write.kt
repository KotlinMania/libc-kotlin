// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun write(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int
