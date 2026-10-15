package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int
