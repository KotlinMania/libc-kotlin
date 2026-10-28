package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strncpy(dst: String?, src: String?, n: ULong): String?
