package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun estrlcat(dst: String?, src: String?, len: ULong): ULong
