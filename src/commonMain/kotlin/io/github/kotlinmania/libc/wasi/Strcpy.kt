package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strcpy(dst: String?, src: String?): String?
