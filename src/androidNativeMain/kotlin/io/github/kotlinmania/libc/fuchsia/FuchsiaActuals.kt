@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_kill
import libc.cinterop.libc_madvise
import libc.cinterop.libc_msync
import libc.cinterop.libc_raise
import libc.cinterop.libc_socket
import libc.cinterop.libc_tcflow
import libc.cinterop.libc_tcflush

// Fuchsia ABI is identical to Linux/Android Bionic ABI for signals, address families, msync, and madvise.
public actual fun kill(pid: Int, sig: Int): Int =
    libc.cinterop.libc_kill(pid, sig)

public actual fun raise(signum: Int): Int =
    libc.cinterop.libc_raise(signum)

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    libc.cinterop.libc_socket(domain, ty, protocol)

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun tcflow(fd: Int, action: Int): Int =
    libc.cinterop.libc_tcflow(fd, action)

public actual fun tcflush(fd: Int, action: Int): Int =
    libc.cinterop.libc_tcflush(fd, action)
