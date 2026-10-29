package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
