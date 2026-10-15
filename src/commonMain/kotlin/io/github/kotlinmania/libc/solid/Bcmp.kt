// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int
