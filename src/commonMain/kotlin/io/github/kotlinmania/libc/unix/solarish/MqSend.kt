package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mqSend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int
