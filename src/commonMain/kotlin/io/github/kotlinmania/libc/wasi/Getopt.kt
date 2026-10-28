package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int
