package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong
