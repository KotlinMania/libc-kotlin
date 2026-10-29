package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun truncate64(path: String?, length: Long): Int
