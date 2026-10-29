package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: Int,
    val mntPassno: Int,
)
