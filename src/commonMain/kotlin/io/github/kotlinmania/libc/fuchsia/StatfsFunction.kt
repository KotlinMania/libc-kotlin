package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun statfs(path: String?, buf: Statfs?): Int
