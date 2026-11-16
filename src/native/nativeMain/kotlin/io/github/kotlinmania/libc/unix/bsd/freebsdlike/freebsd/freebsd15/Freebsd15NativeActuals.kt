@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent()
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr, policy: MutPtr): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr, policy: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: MutPtr): KssizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp(kd.rawAddress.toCPointer<ByteVar>())
