package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun processVmWritev(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long
