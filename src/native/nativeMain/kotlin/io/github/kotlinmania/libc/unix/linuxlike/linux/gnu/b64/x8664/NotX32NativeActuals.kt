@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.cinterop.libc_not_x32_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)
