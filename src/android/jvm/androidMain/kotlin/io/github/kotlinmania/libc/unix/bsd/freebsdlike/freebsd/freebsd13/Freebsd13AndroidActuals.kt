@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

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

private object UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(loc.rawAddress)
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy.rawAddress)

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(base.rawAddress, num.toLong(), size.toLong(), arg.rawAddress, 0L)
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(kd.rawAddress)
