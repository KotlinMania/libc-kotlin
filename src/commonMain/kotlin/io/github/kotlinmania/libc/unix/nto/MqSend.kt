package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqSend(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int
