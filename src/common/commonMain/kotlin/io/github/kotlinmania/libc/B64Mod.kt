package io.github.kotlinmania.libc

// 64-bit specific Apple (ios/darwin) definitions

public val NET_RT_MAXID: CInt = 11

public val TIOCTIMESTAMP: CUlong = 0x40107459uL

public val TIOCDCDTIMESTAMP: CUlong = 0x40107458uL

public val BIOCSETF: CUlong = 0x80104267uL

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val BIOCSETFNR: CUlong = 0x8010427euL

public fun exchangedata(path1: String?, path2: String?, options: CUint): CInt {
    val __cstr_0 = if (path1 == null) 0L else LibcDynamicFfi.allocUtf8CString(path1)
    val __cstr_1 = if (path2 == null) 0L else LibcDynamicFfi.allocUtf8CString(path2)
    try {
        return LibcDynamicFfi.invoke("exchangedata", -1, longArrayOf(__cstr_0, __cstr_1, options.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}
