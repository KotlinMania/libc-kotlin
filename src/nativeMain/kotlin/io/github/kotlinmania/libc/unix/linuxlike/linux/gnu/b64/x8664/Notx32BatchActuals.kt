// port-lint: source NotX32.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_sysctl

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt {
    if (oldp == null) return -1
    val oldpPtr: CPointer<ByteVar>? = oldp.value.toCPointer()
    if (newp == null) return -1
    val newpPtr: CPointer<ByteVar>? = newp.value.toCPointer()
    val result = libc_sysctl(name, namelen.toUInt(), oldpPtr, oldlenp, newpPtr, newlen)
    return result
}
