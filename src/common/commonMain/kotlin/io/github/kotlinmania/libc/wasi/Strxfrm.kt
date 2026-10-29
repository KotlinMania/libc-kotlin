package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong
