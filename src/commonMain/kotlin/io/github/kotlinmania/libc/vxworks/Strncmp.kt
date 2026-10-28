package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun strncmp(cs: String?, ct: String?, n: ULong): Int
