package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun clockGetcpuclockid(pid: Int, clkId: Int?): Int
