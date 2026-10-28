package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong
