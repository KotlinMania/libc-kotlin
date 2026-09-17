@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_socket

private fun wasiToHostShutdownHow(how: CInt): CInt = when (how) {
    1 -> 0 // SHUT_RD: WASI=1, Host=0
    2 -> 1 // SHUT_WR: WASI=2, Host=1
    3 -> 2 // SHUT_RDWR: WASI=3, Host=2
    else -> how
}

private fun wasiToDarwinDomain(domain: CInt): CInt = when (domain) {
    1 -> 2  // AF_INET: WASI=1, Darwin=2
    2 -> 30 // AF_INET6: WASI=2, Darwin=30
    else -> domain
}

private fun wasiToDarwinType(type: CInt): CInt {
    val base = type and 0xF
    return when (base) {
        5 -> 2 // SOCK_DGRAM: WASI=5, Darwin=2
        6 -> 1 // SOCK_STREAM: WASI=6, Darwin=1
        else -> base
    }
}

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libc.cinterop.libc_shutdown(socket, wasiToHostShutdownHow(how))

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc.cinterop.libc_socket(wasiToDarwinDomain(domain), wasiToDarwinType(type), protocol)
