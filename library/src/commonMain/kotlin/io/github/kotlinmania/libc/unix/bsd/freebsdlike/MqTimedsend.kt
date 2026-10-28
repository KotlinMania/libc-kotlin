package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int
