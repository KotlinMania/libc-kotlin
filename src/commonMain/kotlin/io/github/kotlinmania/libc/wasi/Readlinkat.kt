package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun readlinkat(dirfd: Int, pathname: String?, buf: String?, bufsiz: ULong): Long
