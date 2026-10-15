// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val ptrMagic: UInt,
    val ptrInterlock: Byte,
    val ptrRblockedFirst: COpaquePointer?,
    val ptrRblockedLast: COpaquePointer?,
    val ptrWblockedFirst: COpaquePointer?,
    val ptrWblockedLast: COpaquePointer?,
    val ptrNreaders: UInt,
    val ptrOwner: ULong,
    val ptrPrivate: COpaquePointer?,
)
