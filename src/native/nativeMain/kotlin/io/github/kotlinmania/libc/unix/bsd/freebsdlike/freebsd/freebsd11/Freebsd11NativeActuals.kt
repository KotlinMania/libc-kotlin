@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent(): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent()

public actual fun mprotect(addr: ConstPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc.rawAddress.toCPointer<ByteVar>())

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, arg.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}
