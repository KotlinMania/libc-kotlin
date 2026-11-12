@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp(kd.rawAddress.toCPointer<ByteVar>())
