package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun sprintf(s: String?, fmt: String?, vararg args: Any?): Int
