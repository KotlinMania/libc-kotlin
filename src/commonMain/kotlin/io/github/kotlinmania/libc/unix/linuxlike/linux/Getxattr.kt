package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long
