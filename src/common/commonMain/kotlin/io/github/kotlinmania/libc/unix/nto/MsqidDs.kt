package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgFirst: Msg?,
    val msgLast: Msg?,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgQbytes: ULong,
    val msgLspid: Int,
    val msgLrpid: Int,
    val msgStime: Long,
    val msgRtime: Long,
    val msgCtime: Long,
)
