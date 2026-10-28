package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun strncpy(dest: String?, src: String?, n: ULong): String?
