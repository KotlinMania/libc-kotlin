// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_sysctl

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt {
    val oldPtr: CPointer<ByteVar>? = oldp?.value?.toCPointer()
    val newPtr: CPointer<ByteVar>? = newp?.value?.toCPointer()
    return libc.cinterop.libc_sysctl(name, namelen.toUInt(), oldPtr, oldlenp, newPtr, newlen)
}
