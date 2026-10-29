package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun statfs(path: String?, buf: Statfs?): Int
