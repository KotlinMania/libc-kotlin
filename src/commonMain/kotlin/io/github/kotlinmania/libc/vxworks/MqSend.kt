package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int
