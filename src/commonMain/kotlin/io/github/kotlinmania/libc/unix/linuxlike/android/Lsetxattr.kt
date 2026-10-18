package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int
