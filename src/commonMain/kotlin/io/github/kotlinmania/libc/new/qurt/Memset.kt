package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun memset(s: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
