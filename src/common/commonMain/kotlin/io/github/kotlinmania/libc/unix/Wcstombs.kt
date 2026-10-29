package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong
