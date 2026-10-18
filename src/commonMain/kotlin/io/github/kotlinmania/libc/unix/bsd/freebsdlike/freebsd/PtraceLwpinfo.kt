package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT

import io.github.kotlinmania.libc.*

public data class PtraceLwpinfo(
    val plLwpid: Int,
    val plEvent: Int,
    val plFlags: Int,
    val plSigmask: ULong,
    val plSiglist: ULong,
    val plSiginfo: SiginfoT,
    val plTdname: ByteArray,
    val plChildPid: Int,
    val plSyscallCode: UInt,
    val plSyscallNarg: UInt,
)
