package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun kill(pid: Int, sig: Int): Int =
    throw UnsupportedOperationException("kill is not available on Windows (mingwX64)")

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise is not available on Windows (mingwX64)")

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync is not available on Windows (mingwX64)")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise is not available on Windows (mingwX64)")

public actual fun tcflow(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflow is not available on Windows (mingwX64)")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush is not available on Windows (mingwX64)")
