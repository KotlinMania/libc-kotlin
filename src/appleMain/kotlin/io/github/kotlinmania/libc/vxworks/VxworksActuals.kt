@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_kill
import libc.cinterop.libc_msync
import libc.cinterop.libc_raise
import libc.cinterop.libc_socket
import libc.cinterop.libc_tcflush

// VxWorks signals: SIGBUS(10), SIGSTOP(17), SIGTSTP(18), SIGCONT(19), SIGCHLD(20),
// SIGUSR1(30), SIGUSR2(31) match Darwin natively. Map signals >= 32.
private fun vxworksToDarwinSignal(sig: CInt): CInt = when (sig) {
    33 -> 27 // SIGPROF: VxWorks=33, Darwin=27
    34 -> 12 // SIGSYS: VxWorks=34, Darwin=12
    35 -> 16 // SIGURG: VxWorks=35, Darwin=16
    36 -> 26 // SIGVTALRM: VxWorks=36, Darwin=26
    37 -> 24 // SIGXCPU: VxWorks=37, Darwin=24
    38 -> 25 // SIGXFSZ: VxWorks=38, Darwin=25
    48 -> 23 // SIGIO: VxWorks=48, Darwin=23
    53 -> 28 // SIGWINCH: VxWorks=53, Darwin=28
    else -> sig
}

private fun vxworksToDarwinDomain(domain: CInt): CInt = when (domain) {
    28 -> 30 // AF_INET6: VxWorks=28, Darwin=30
    else -> domain
}

private fun vxworksToDarwinMsyncFlags(flags: CInt): CInt {
    var hostFlags = 0
    if ((flags and 1) != 0) hostFlags = hostFlags or 16 // MS_SYNC: VxWorks=1, Darwin=16 (0x0010)
    if ((flags and 2) != 0) hostFlags = hostFlags or 1  // MS_ASYNC: VxWorks=2, Darwin=1 (0x0001)
    if ((flags and 4) != 0) hostFlags = hostFlags or 2  // MS_INVALIDATE: VxWorks=4, Darwin=2 (0x0002)
    return hostFlags
}

private fun vxworksToDarwinAction(action: CInt): CInt = when (action) {
    0 -> 1 // TCIFLUSH: VxWorks=0, Darwin=1
    1 -> 2 // TCOFLUSH: VxWorks=1, Darwin=2
    2 -> 3 // TCIOFLUSH: VxWorks=2, Darwin=3
    else -> action
}

public actual fun kill(pid: PidT, signo: CInt): CInt =
    libc.cinterop.libc_kill(pid, vxworksToDarwinSignal(signo))

public actual fun raise(signo: CInt): CInt =
    libc.cinterop.libc_raise(vxworksToDarwinSignal(signo))

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc.cinterop.libc_socket(vxworksToDarwinDomain(domain), type and 0xF, protocol)

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<ByteVar>(), len, vxworksToDarwinMsyncFlags(flags))

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libc.cinterop.libc_tcflush(fd, vxworksToDarwinAction(action))
