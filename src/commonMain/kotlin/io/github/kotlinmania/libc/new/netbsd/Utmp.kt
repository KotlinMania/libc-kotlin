// port-lint: source new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

/**
 * Header: `utmp.h`.
 */

public const val UT_NAMESIZE: Int = 8
public const val UT_LINESIZE: Int = 8
public const val UT_HOSTSIZE: Int = 16

public data class Lastlog(
    val llTime: TimeT,
    val llLine: ByteArray,
    val llHost: ByteArray,
) {
    init {
        require(llLine.size == UT_LINESIZE) { "ll_line must be $UT_LINESIZE bytes" }
        require(llHost.size == UT_HOSTSIZE) { "ll_host must be $UT_HOSTSIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Lastlog
        if (llTime != other.llTime) return false
        if (!llLine.contentEquals(other.llLine)) return false
        if (!llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = llTime.hashCode()
        result = 31 * result + llLine.contentHashCode()
        result = 31 * result + llHost.contentHashCode()
        return result
    }
}

public data class Utmp(
    val utLine: ByteArray,
    val utName: ByteArray,
    val utHost: ByteArray,
    val utTime: TimeT,
) {
    init {
        require(utLine.size == UT_LINESIZE) { "ut_line must be $UT_LINESIZE bytes" }
        require(utName.size == UT_NAMESIZE) { "ut_name must be $UT_NAMESIZE bytes" }
        require(utHost.size == UT_HOSTSIZE) { "ut_host must be $UT_HOSTSIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Utmp
        if (!utLine.contentEquals(other.utLine)) return false
        if (!utName.contentEquals(other.utName)) return false
        if (!utHost.contentEquals(other.utHost)) return false
        if (utTime != other.utTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = utLine.contentHashCode()
        result = 31 * result + utName.contentHashCode()
        result = 31 * result + utHost.contentHashCode()
        result = 31 * result + utTime.hashCode()
        return result
    }
}

// Linked against "util". getutent is linked as "__getutent50".
public expect fun utmpname(file: String?): CInt

public expect fun setutent()

public expect fun getutent(): Utmp?

public expect fun endutent()
