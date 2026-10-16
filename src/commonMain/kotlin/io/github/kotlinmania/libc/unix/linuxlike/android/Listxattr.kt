package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun listxattr(path: String?, list: String?, size: ULong): Long
