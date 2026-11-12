@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Setgrent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Freelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd12QsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Setgrent()
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Freelocale(loc.rawAddress)
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Dirname(path.rawAddress))

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd12QsortR(base.rawAddress, num.toLong(), size.toLong(), arg.rawAddress, 0L)
}
