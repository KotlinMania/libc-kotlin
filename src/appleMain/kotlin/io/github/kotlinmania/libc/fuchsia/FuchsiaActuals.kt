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

// Fuchsia signals match Linux definitions; translate Linux -> Darwin host signals.
private fun fuchsiaToDarwinSignal(sig: CInt): CInt = when (sig) {
    7 -> 10   // SIGBUS: Fuchsia=7, Darwin=10
    10 -> 30  // SIGUSR1: Fuchsia=10, Darwin=30
    12 -> 31  // SIGUSR2: Fuchsia=12, Darwin=31
    17 -> 20  // SIGCHLD: Fuchsia=17, Darwin=20
    18 -> 19  // SIGCONT: Fuchsia=18, Darwin=19
    19 -> 17  // SIGSTOP: Fuchsia=19, Darwin=17
    20 -> 18  // SIGTSTP: Fuchsia=20, Darwin=18
    23 -> 16  // SIGURG: Fuchsia=23, Darwin=16
    29 -> 23  // SIGIO/SIGPOLL: Fuchsia=29, Darwin=23
    31 -> 12  // SIGSYS: Fuchsia=31, Darwin=12
    else -> sig
}

// Fuchsia address families match Linux; translate differing constants to Darwin.
private fun fuchsiaToDarwinDomain(domain: CInt): CInt = when (domain) {
    10 -> 30 // AF_INET6: Fuchsia(Linux)=10, Darwin=30
    4 -> 23  // AF_IPX: Fuchsia=4, Darwin=23
    5 -> 16  // AF_APPLETALK: Fuchsia=5, Darwin=16
    34 -> 28 // AF_ISDN: Fuchsia=34, Darwin=28
    else -> domain
}

private fun fuchsiaToDarwinMsyncFlags(flags: CInt): CInt {
    var hostFlags = 0
    if ((flags and 1) != 0) hostFlags = hostFlags or 1  // MS_ASYNC: Fuchsia=1, Darwin=1
    if ((flags and 2) != 0) hostFlags = hostFlags or 2  // MS_INVALIDATE: Fuchsia=2, Darwin=2
    if ((flags and 4) != 0) hostFlags = hostFlags or 16 // MS_SYNC: Fuchsia=4, Darwin=16 (0x0010)
    return hostFlags
}

private fun fuchsiaToDarwinMadvise(advice: CInt): CInt = when (advice) {
    8 -> 5 // MADV_FREE: Fuchsia(Linux)=8, Darwin=5 (Darwin 8 is MADV_FREE_REUSE)
    else -> advice
}

private fun fuchsiaToDarwinAction(action: CInt): CInt = when (action) {
    0 -> 1 // TCIFLUSH / TCOOFF: Fuchsia=0, Darwin=1
    1 -> 2 // TCOFLUSH / TCOON: Fuchsia=1, Darwin=2
    2 -> 3 // TCIOFLUSH / TCIOFF: Fuchsia=2, Darwin=3
    3 -> 4 // TCION: Fuchsia=3, Darwin=4
    else -> action
}

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libc.cinterop.libc_kill(pid, fuchsiaToDarwinSignal(sig))

public actual fun raise(signum: CInt): CInt =
    libc.cinterop.libc_raise(fuchsiaToDarwinSignal(signum))

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    libc.cinterop.libc_socket(fuchsiaToDarwinDomain(domain), ty and 0xF, protocol)

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires per-platform actual — size_t width differs across Apple targets")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires per-platform actual — size_t width differs across Apple targets")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libc.cinterop.libc_tcflow(fd, fuchsiaToDarwinAction(action))

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libc.cinterop.libc_tcflush(fd, fuchsiaToDarwinAction(action))
