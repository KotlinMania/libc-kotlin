package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: String?): Int
