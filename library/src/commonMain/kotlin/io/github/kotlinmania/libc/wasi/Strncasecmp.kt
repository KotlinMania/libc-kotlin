package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strncasecmp(s1: String?, s2: String?, n: ULong): Int
