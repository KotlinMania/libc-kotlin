package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun localtime(a: Long?): Tm?
