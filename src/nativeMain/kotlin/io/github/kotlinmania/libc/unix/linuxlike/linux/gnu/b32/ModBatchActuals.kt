// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt {
    if (oldp == null) return -1
    val oldpPtr: CPointer<ByteVar>? = oldp.value.toCPointer()
    if (newp == null) return -1
    val newpPtr: CPointer<ByteVar>? = newp.value.toCPointer()
    val result = libc_sysctl(name, namelen, oldpPtr, oldlenp, newpPtr, newlen)
    return result
}
