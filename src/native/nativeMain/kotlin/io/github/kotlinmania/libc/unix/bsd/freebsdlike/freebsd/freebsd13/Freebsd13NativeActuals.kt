@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, arg.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(kd.rawAddress.toCPointer<ByteVar>())
