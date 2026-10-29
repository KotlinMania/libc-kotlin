package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun vsprintf(s: String?, fmt: String?, ap: String?): Int
