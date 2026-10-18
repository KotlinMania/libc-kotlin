package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer?
