package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.COpaquePointer?, clkId: ULong?): Int
