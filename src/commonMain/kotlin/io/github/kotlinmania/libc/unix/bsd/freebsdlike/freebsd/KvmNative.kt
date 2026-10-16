package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmNative(kd: io.github.kotlinmania.libc.COpaquePointer?): Int
