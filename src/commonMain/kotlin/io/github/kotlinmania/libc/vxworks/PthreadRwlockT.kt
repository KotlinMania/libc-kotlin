// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val rwlockSemId: io.github.kotlinmania.libc.COpaquePointer?,
    val rwlockReadersRefCount: UInt,
    val rwlockValid: Int,
    val rwlockInitted: Int,
    val rwlockAttr: PthreadRwlockattrT,
    val rwlockSemName: ByteArray,
)
