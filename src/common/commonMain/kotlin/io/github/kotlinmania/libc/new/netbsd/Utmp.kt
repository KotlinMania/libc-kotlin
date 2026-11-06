// port-lint: source new/netbsd/utmp_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
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

public fun utmpname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setutent() {
    LibcDynamicFfi.invoke("setutent", -1, longArrayOf())
}

public fun getutent(): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("__getutent50", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun endutent() {
    LibcDynamicFfi.invoke("endutent", -1, longArrayOf())
}
