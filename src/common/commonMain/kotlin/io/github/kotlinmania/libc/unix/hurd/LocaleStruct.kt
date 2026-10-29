package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class LocaleStruct(
    val locales: LongArray,
    val ctypeB: UShort?,
    val ctypeTolower: Int?,
    val ctypeToupper: Int?,
    val names: List<String>,
)
