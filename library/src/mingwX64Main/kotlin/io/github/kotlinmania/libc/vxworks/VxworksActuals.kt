package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun kill(pid: Int, signo: Int): Int =
    throw UnsupportedOperationException("kill is not available on Windows (mingwX64)")

public actual fun raise(signo: Int): Int =
    throw UnsupportedOperationException("raise is not available on Windows (mingwX64)")

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync is not available on Windows (mingwX64)")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush is not available on Windows (mingwX64)")
