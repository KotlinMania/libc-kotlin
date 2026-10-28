package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun readlink(path: String?, buf: String?, bufsize: ULong): Long
