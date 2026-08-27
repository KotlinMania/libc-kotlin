// port-lint: source libc/src/new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

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

public fun utmpname(file: String?): CInt = -1

public fun setutent() { }

public fun getutent(): Utmp? = null

public fun endutent() { }
