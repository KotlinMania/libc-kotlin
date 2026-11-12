package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): CInt
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major
    val minor1 = minor
    return (major1 shl 8) or minor1
}

public fun major(dev: DevT): CInt = ((dev shr 8) and 0xffu).toInt()

public fun minor(dev: DevT): CInt = (dev and 0xffff00ffu).toInt()

// Return type cInt was removed in FreeBSD 12
public expect fun setgrent(): CInt

// Type of `addr` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun mprotect(addr: ConstPtr<CVoid>, len: SizeT, prot: CInt): CInt

// Return type cInt was removed in FreeBSD 12
public expect fun freelocale(loc: LocaleT): CInt

// Return type cInt changed to ssizeT in FreeBSD 12:
public expect fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt

// Type of `path` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun dirname(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: ConstPtr<CChar>): MutPtr<CChar>

// Argument order of the function pointer changed in FreeBSD 14. From 14 onwards the signature
// matches the POSIX specification by having the third argument be a mutable pointer, on
// earlier versions the first argument is the mutable pointer.
public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?)
