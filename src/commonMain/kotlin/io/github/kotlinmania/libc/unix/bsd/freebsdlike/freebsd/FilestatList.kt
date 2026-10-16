package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class FilestatList(
    val stqhFirst: Filestat?,
    val stqhLast: COpaquePointer?,
)
