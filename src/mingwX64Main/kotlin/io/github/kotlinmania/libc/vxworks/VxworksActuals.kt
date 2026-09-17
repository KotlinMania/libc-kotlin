package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun kill(pid: PidT, signo: CInt): CInt =
    throw UnsupportedOperationException("kill is not available on Windows (mingwX64)")

public actual fun raise(signo: CInt): CInt =
    throw UnsupportedOperationException("raise is not available on Windows (mingwX64)")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync is not available on Windows (mingwX64)")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush is not available on Windows (mingwX64)")
