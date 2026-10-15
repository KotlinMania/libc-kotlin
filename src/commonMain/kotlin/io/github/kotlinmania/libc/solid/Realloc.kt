// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer?
