package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer?
