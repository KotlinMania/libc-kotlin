package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun strlcpy(dst: String?, src: String?, siz: ULong): ULong
