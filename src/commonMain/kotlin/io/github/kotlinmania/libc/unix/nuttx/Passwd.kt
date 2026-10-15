package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UInt,
    val pwGid: UInt,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)
