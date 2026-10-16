package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun backtrace(buf: COpaquePointer?, sz: Int): Int
