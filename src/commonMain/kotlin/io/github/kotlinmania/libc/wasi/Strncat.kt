package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strncat(s: String?, ct: String?, n: ULong): String?
