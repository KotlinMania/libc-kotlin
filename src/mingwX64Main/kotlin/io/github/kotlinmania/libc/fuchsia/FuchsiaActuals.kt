package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill is not available on Windows (mingwX64)")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise is not available on Windows (mingwX64)")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync is not available on Windows (mingwX64)")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise is not available on Windows (mingwX64)")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflow is not available on Windows (mingwX64)")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush is not available on Windows (mingwX64)")
