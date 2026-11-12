@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12QsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd12Setgrent
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeFreebsdFreebsd12Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd12Mprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd12Freelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd12Msgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd12Dirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd12Basename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd12QsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, arg.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}
