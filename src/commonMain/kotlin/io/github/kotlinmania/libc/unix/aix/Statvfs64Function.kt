package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun statvfs64(path: String?, buf: Statvfs64?): Int
