package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun stpncpy(dst: String?, src: String?, n: ULong): String?
