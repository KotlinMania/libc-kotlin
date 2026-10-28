package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun randBytes(buf: COpaquePointer?, length: Int): Int
