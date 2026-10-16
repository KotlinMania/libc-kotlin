package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun llistxattr(path: String?, list: String?, size: ULong): Long
