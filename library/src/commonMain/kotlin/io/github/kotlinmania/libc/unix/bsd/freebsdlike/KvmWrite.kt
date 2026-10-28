package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun kvmWrite(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long
