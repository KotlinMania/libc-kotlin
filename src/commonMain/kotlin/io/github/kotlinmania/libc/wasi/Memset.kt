package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
