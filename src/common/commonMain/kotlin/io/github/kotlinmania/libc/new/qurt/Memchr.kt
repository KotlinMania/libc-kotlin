package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun memchr(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
