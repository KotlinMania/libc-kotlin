// port-lint: source new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class Lastlog(
    val llTime: TimeT,
    val llLine: ByteArray,
    val llHost: ByteArray,
)

public data class Utmp(
    val utLine: ByteArray,
    val utName: ByteArray,
    val utHost: ByteArray,
    val utTime: TimeT,
)

public const val UT_NAMESIZE: ULong = 8uL
public const val UT_LINESIZE: ULong = 8uL
public const val UT_HOSTSIZE: ULong = 16uL

public expect fun utmpname(file: String?): CInt
public expect fun setutent()
public expect fun getutent(): Utmp?
public expect fun endutent()
