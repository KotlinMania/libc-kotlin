package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun mqTimedreceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long
