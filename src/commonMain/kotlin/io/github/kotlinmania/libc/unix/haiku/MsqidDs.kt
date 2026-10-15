// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgQnum: UInt,
    val msgQbytes: UInt,
    val msgLspid: Int,
    val msgLrpid: Int,
    val msgStime: Int,
    val msgRtime: Int,
    val msgCtime: Int,
)
