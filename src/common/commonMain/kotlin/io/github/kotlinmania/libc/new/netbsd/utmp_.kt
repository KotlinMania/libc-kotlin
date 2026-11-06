// port-lint: source new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.TimeT

// Header: `utmp.h`
//
// <https://github.com/NetBSD/src/blob/master/include/utmp.h>

public val UT_NAMESIZE: Int = 8

public val UT_LINESIZE: Int = 8

public val UT_HOSTSIZE: Int = 16

public open class Lastlog(
    public var llTime: TimeT,
    public var llLine: List<CChar>,
    public var llHost: List<CChar>,
)

public open class Utmp(
    public var utLine: List<CChar>,
    public var utName: List<CChar>,
    public var utHost: List<CChar>,
    public var utTime: TimeT,
)

public expect fun utmpname(file: String?): CInt

public expect fun setutent()

public expect fun getutent(): Utmp?

public expect fun endutent()
