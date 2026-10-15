package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int
