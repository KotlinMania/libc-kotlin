package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
