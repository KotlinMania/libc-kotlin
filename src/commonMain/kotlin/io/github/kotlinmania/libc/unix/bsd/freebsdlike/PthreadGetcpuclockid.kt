package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int
