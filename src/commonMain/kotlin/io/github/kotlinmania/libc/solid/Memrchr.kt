// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun memrchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer?
