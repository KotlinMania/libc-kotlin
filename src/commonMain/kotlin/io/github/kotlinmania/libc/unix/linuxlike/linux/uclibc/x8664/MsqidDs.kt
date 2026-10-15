// port-lint: source unix/linux_like/linux/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

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
    val ignored1: ULong,
    val ignored2: ULong,
)
