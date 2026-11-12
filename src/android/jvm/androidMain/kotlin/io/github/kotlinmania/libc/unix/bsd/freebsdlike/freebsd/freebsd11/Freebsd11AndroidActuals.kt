@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent(): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent()

public actual fun mprotect(addr: ConstPtr, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc.rawAddress)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun dirname(path: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path.rawAddress))

public actual fun basename(path: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base.rawAddress, num.toLong(), size.toLong(), arg.rawAddress, 0L)
}
