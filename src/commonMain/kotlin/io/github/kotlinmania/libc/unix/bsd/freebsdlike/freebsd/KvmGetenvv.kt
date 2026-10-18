package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmGetenvv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer?
