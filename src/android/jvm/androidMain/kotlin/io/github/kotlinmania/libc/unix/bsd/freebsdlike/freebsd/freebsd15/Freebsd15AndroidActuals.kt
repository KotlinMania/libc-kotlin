@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale(loc.rawAddress)
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy.rawAddress)

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp(kd.rawAddress)
