package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UInt,
    val pwGid: UInt,
    val pwDir: String?,
    val pwShell: String?,
    val pwGecos: String?,
)
