// port-lint: source new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

public data class Lastlog(
    val llTime: Long,
    val llLine: ByteArray,
    val llHost: ByteArray,
)

public data class Utmp(
    val utLine: ByteArray,
    val utName: ByteArray,
    val utHost: ByteArray,
    val utTime: Long,
)

public const val UT_NAMESIZE: ULong = 8uL
public const val UT_LINESIZE: ULong = 8uL
public const val UT_HOSTSIZE: ULong = 16uL

public expect fun utmpname(file: String?): Int

public expect fun setutent()

public expect fun getutent(): Utmp?

public expect fun endutent()
