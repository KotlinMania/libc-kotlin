package io.github.kotlinmania.libc.unix.linuxlike.android.b64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 not available on JVM — no C library access")
