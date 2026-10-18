package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.COpaquePointer?, retval: COpaquePointer?, abstime: Timespec?): Int
