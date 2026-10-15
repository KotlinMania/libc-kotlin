package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Ifconf(
    val ifcLen: Int,
    val ifcIfcu: CAnonymousIfcIfcu,
)
