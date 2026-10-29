package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
