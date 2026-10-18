package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm

public data class SemidDs(
    val semPerm: IpcPerm,
    val semBase: CAnonymousSem?,
    val semNsems: UShort,
    val semOtime: Long,
    val semCtime: Long,
)
