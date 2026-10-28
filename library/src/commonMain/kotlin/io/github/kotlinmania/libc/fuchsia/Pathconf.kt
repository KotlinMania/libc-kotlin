package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pathconf(path: String?, name: Int): Long
