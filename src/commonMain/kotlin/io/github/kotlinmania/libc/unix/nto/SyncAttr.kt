package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class SyncAttr(
    val protocol: Int,
    val flags: Int,
    val prioceiling: Int,
    val clockid: Int,
    val count: Int,
)
