package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun printf(format: String?, vararg args: Any?): Int
