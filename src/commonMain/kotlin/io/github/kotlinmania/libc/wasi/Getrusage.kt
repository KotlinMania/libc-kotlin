package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun getrusage(resource: Int, usage: Rusage?): Int
