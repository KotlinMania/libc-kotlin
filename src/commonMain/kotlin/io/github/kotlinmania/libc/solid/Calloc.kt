// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun calloc(arg1: ULong, arg2: ULong): COpaquePointer?
