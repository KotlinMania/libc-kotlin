// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siPid: Int,
    val siUid: UInt,
    val siErrno: Int,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siStatus: Int? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siValue(): Sigval? = siValue
    internal fun siPid(): Int = siPid
    internal fun siUid(): UInt = siUid
    internal fun siStatus(): Int = siStatus ?: 0
    internal fun siUtime(): Long = siUtime ?: 0L
    internal fun siStime(): Long = siStime ?: 0L
}
