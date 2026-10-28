package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
)
