package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
