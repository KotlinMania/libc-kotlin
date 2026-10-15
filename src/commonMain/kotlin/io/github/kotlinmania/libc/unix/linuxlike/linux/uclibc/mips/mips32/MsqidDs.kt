// port-lint: source unix/linux_like/linux/uclibc/mips/mips32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: Int,
    val msgRtime: Int,
    val msgCtime: Int,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgQbytes: ULong,
    val msgLspid: Int,
    val msgLrpid: Int,
)
