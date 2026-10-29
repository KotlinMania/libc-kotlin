package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): Int
