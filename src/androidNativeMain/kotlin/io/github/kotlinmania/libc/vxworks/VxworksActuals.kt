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

// VxWorks signals -> Android (Linux ABI) host signals.
private fun vxworksToLinuxSignal(sig: CInt): CInt = when (sig) {
    10 -> 7   // SIGBUS: VxWorks=10, Linux=7
    17 -> 19  // SIGSTOP: VxWorks=17, Linux=19
    18 -> 20  // SIGTSTP: VxWorks=18, Linux=20
    19 -> 18  // SIGCONT: VxWorks=19, Linux=18
    20 -> 17  // SIGCHLD: VxWorks=20, Linux=17
    30 -> 10  // SIGUSR1: VxWorks=30, Linux=10
    31 -> 12  // SIGUSR2: VxWorks=31, Linux=12
    32 -> 29  // SIGPOLL: VxWorks=32, Linux=29
    33 -> 27  // SIGPROF: VxWorks=33, Linux=27
    34 -> 31  // SIGSYS: VxWorks=34, Linux=31
    35 -> 23  // SIGURG: VxWorks=35, Linux=23
    36 -> 26  // SIGVTALRM: VxWorks=36, Linux=26
    37 -> 24  // SIGXCPU: VxWorks=37, Linux=24
    38 -> 25  // SIGXFSZ: VxWorks=38, Linux=25
    48 -> 29  // SIGIO: VxWorks=48, Linux=29
    53 -> 28  // SIGWINCH: VxWorks=53, Linux=28
    else -> sig
}

private fun vxworksToLinuxDomain(domain: CInt): CInt = when (domain) {
    28 -> 10 // AF_INET6: VxWorks=28, Linux=10
    19 -> 17 // AF_PACKET: VxWorks=19, Linux=17
    else -> domain
}

private fun vxworksToLinuxMsyncFlags(flags: CInt): CInt {
    var hostFlags = 0
    if ((flags and 1) != 0) hostFlags = hostFlags or 4 // MS_SYNC: VxWorks=1, Linux=4
    if ((flags and 2) != 0) hostFlags = hostFlags or 1 // MS_ASYNC: VxWorks=2, Linux=1
    if ((flags and 4) != 0) hostFlags = hostFlags or 2 // MS_INVALIDATE: VxWorks=4, Linux=2
    return hostFlags
}

public actual fun kill(pid: PidT, signo: CInt): CInt =
    libc.cinterop.libc_kill(pid, vxworksToLinuxSignal(signo))

public actual fun raise(signo: CInt): CInt =
    libc.cinterop.libc_raise(vxworksToLinuxSignal(signo))

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc.cinterop.libc_socket(vxworksToLinuxDomain(domain), type, protocol)

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<ByteVar>(), len, vxworksToLinuxMsyncFlags(flags))

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libc.cinterop.libc_tcflush(fd, action)
