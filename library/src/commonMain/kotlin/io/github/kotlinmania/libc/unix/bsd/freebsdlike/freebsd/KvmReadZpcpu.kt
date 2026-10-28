package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmReadZpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong, buf: COpaquePointer?, size: ULong, cpu: Int): Long
