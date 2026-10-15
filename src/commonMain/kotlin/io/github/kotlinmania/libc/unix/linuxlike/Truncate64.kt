package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun truncate64(path: String?, length: Long): Int
