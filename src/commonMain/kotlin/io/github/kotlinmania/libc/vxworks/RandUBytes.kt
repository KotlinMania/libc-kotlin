package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun randUBytes(buf: COpaquePointer?, length: Int): Int
