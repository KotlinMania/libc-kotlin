@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_socket

private fun wasiToHostShutdownHow(how: CInt): CInt = when (how) {
    1 -> 0 // SHUT_RD: WASI=1, Linux=0
    2 -> 1 // SHUT_WR: WASI=2, Linux=1
    3 -> 2 // SHUT_RDWR: WASI=3, Linux=2
    else -> how
}

private fun wasiToLinuxDomain(domain: CInt): CInt = when (domain) {
    1 -> 2  // AF_INET: WASI=1, Linux=2
    2 -> 10 // AF_INET6: WASI=2, Linux=10
    else -> domain
}

private fun wasiToLinuxType(type: CInt): CInt {
    val base = type and 0xF
    var hostType = when (base) {
        5 -> 2 // SOCK_DGRAM: WASI=5, Linux=2
        6 -> 1 // SOCK_STREAM: WASI=6, Linux=1
        else -> base
    }
    if ((type and 0x4000) != 0) {
        hostType = hostType or 0x800 // SOCK_NONBLOCK: WASI=0x4000, Linux=0x800
    }
    return hostType
}

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libc.cinterop.libc_shutdown(socket, wasiToHostShutdownHow(how))

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc.cinterop.libc_socket(wasiToLinuxDomain(domain), wasiToLinuxType(type), protocol)
