package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmGetcptime(kd: io.github.kotlinmania.libc.COpaquePointer?, cpTime: Long?): Int
