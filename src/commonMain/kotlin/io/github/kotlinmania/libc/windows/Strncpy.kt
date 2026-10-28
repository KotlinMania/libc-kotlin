package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun strncpy(dst: String?, src: String?, n: ULong): String?
