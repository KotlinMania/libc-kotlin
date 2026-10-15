package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pathconf(path: String?, name: Int): Long
