package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
