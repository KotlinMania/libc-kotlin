package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int
