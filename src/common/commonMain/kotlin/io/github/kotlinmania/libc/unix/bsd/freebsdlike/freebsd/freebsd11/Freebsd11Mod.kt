package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs that were changed after FreeBSD 11
// The type of `nlinkT` changed from `UShort` to `ULong` in FreeBSD 12:
public typealias NlinkT = UShort

// Type of `devT` changed from `UInt` to `ULong` in FreeBSD 12:
public typealias DevT = UInt

// Type of `inoT` changed from `__uint32_t` to `__uint64_t` in FreeBSD 12:
public typealias InoT = UInt

public val ELAST: CInt = 96

public val RAND_MAX: CInt = 0x7ffffffd

public val KI_NSPARE_PTR: Int = 6

public val MINCORE_SUPER: CInt = 0x20

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 63

// Return type cInt was removed in FreeBSD 12
public fun setgrent(): CInt {
    return LibcDynamicFfi.invoke("setgrent", -1, longArrayOf()).toInt()
}

// Type of `addr` argument changed from `const void *` to `void *`
// in FreeBSD 12
public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

// Return type cInt was removed in FreeBSD 12
public fun freelocale(loc: LocaleT): CInt {
    return LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L)).toInt()
}

// Return type cInt changed to ssizeT in FreeBSD 12:
public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgrcv", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgtyp, msgflg.toLong())).toInt()
}

// Type of `path` argument changed from `const void *` to `void *`
// in FreeBSD 12
public fun dirname(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun basename(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Argument order of the function pointer changed in FreeBSD 14. From 14 onwards the signature
// matches the POSIX specification by having the third argument be a mutable pointer, on
// earlier versions the first argument is the mutable pointer.
public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    LibcDynamicFfi.invoke("qsort_r@FBSD_1.0", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), arg?.value ?: 0L, compar?.value ?: 0L))
}
