package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE?
