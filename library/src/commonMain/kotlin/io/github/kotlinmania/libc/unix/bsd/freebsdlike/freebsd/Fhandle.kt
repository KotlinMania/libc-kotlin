package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Fhandle(
    val fhFsid: ULong,
    val fhFid: Fid,
)
