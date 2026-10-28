package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun statx(path: String?, buf: Stat?, length: Int, command: Int): Int
