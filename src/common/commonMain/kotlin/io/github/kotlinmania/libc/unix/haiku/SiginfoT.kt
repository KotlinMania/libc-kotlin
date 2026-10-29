package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siErrno: Int,
    val siPid: Int,
    val siUid: UInt,
    val siAddr: COpaquePointer?,
    val siStatus: Int,
    val siBand: Long,
    val sigval: COpaquePointer?,
    val siValue: Sigval? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siPid(): Int = siPid
    internal fun siUid(): UInt = siUid
    internal fun siStatus(): Int = siStatus
}
