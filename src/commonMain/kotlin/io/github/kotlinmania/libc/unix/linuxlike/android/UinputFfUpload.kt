package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class UinputFfUpload(
    val requestId: UInt,
    val retval: Int,
    val effect: FfEffect,
    val old: FfEffect,
)
