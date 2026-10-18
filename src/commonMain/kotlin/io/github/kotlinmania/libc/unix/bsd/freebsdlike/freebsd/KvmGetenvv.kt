package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc

public expect fun kvmGetenvv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer?
