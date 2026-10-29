package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.x86

import io.github.kotlinmania.libc.*

public data class UserFpxregsStruct(
    val cwd: UShort,
    val swd: UShort,
    val twd: UShort,
    val fop: UShort,
    val fip: Long,
    val fcs: Long,
    val foo: Long,
    val fos: Long,
    val mxcsr: Long,
    val stSpace: LongArray,
    val xmmSpace: LongArray,
)
