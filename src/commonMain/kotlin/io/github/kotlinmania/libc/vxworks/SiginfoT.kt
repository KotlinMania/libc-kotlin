// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siValue: Sigval,
    val siErrno: Int,
    val siStatus: Int,
    val siAddr: COpaquePointer?,
    val siUid: UShort,
    val siPid: Int,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siValue(): Sigval = siValue
    internal fun siPid(): Int = siPid
    internal fun siUid(): UShort = siUid
    internal fun siStatus(): Int = siStatus
}
