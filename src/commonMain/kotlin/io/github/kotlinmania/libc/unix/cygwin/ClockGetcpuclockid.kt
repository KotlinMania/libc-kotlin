package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun clockGetcpuclockid(pid: Int, clkId: ULong?): Int
