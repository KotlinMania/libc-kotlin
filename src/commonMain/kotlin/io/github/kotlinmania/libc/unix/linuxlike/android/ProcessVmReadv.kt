package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun processVmReadv(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long
