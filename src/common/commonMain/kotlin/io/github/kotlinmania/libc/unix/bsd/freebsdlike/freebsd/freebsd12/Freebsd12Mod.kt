package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import offT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs in FreeBSD 12 that have changed since 11.
public typealias NlinkT = ULong

public typealias DevT = ULong

public typealias InoT = ULong

public typealias ShmattT = CUint

public val RAND_MAX: CInt = 0x7ffffffd

public val ELAST: CInt = 97

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 63

public val KI_NSPARE_PTR: Int = 6

public val MINCORE_SUPER: CInt = 0x20

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT {
    return LibcDynamicFfi.invoke("msgrcv", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgtyp, msgflg.toLong()))
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun basename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    LibcDynamicFfi.invoke("qsort_r@FBSD_1.0", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), arg?.value ?: 0L, compar?.value ?: 0L))
}
