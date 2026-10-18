package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Ifconf(
    val ifcLen: Int,
    val ifcIfcu: CAnonymousIfcIfcu,
)
