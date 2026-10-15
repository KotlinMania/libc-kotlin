// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): Int
