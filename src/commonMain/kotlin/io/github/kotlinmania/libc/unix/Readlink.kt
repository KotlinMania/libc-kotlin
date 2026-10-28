package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: ULong): Int
