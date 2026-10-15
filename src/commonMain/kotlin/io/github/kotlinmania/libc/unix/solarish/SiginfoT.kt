// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siErrno: Int,
    val siPad: Int,
    val dataPad: IntArray,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: Int? = null,
    val siUid: UInt? = null,
    val siStatus: Int? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siValue(): Sigval? = siValue
    internal fun siPid(): Int = siPid ?: 0
    internal fun siUid(): UInt = siUid ?: 0u
    internal fun siStatus(): Int = siStatus ?: 0
    internal fun siUtime(): Long = siUtime ?: 0L
    internal fun siStime(): Long = siStime ?: 0L
}
