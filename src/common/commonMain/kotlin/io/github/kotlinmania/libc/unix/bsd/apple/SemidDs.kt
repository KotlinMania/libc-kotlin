package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SemidDs(
    val semPerm: IpcPerm,
    val semBase: Int,
    val semNsems: UShort,
    val semOtime: Long,
    val semPad1: Int,
    val semCtime: Long,
    val semPad2: Int,
    val semPad3: IntArray,
)
