package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long
