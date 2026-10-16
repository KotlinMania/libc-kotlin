package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.m68k

import io.github.kotlinmania.libc.*

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: Long,
    val msgRtime: Long,
    val msgCtime: Long,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgQbytes: ULong,
    val msgLspid: Int,
    val msgLrpid: Int,
)
