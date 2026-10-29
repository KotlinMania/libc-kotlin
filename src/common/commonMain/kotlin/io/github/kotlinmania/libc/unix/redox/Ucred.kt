package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Ucred(
    val pid: Int,
    val uid: Int,
    val gid: Int,
)
