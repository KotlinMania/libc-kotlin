package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqReceive(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long
