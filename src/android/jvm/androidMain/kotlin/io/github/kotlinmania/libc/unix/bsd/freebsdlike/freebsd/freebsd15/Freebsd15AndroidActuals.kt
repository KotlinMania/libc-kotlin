@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT

private object UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale((loc?.value ?: 0L))
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(level, which, id, setsize.toLong(), (mask?.value ?: 0L), (policy?.value ?: 0L))

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(level, which, id, setsize.toLong(), (mask?.value ?: 0L), policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd15JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp((kd?.value ?: 0L))
