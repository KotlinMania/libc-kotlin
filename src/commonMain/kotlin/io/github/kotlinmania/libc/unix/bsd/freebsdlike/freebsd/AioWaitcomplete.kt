package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Long
