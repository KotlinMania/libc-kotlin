package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun readlink(path: String?, buf: String?, bufsz: ULong): Long
