package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun mqTimedreceive(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long
