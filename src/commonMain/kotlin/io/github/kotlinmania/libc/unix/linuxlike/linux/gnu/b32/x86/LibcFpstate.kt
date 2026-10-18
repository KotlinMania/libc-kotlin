package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class LibcFpstate(
    val cw: ULong,
    val sw: ULong,
    val tag: ULong,
    val ipoff: ULong,
    val cssel: ULong,
    val dataoff: ULong,
    val datasel: ULong,
    val st: List<LibcFpreg>,
    val status: ULong,
)
