package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toUInt()
    val minor1 = minor.toUInt()
    return (major1 shl 8) or minor1
}

public fun major(dev: DevT): CInt {
    return ((dev shr 8) and 0xffu).toInt()
}

public fun minor(dev: DevT): CInt {
    return (dev and 0xffff00ffu).toInt()
}

// Return type cInt was removed in FreeBSD 12
public expect fun setgrent(): CInt

// Type of `addr` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

// Return type cInt was removed in FreeBSD 12
public expect fun freelocale(loc: LocaleT): CInt

// Return type cInt changed to ssizeT in FreeBSD 12:
public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt

// Type of `path` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun dirname(path: String?): COpaquePointer?

public expect fun basename(path: String?): COpaquePointer?

// Argument order of the function pointer changed in FreeBSD 14. From 14 onwards the signature
// matches the POSIX specification by having the third argument be a mutable pointer, on
// earlier versions the first argument is the mutable pointer.
public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?)
