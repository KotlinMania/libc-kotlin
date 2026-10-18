package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
