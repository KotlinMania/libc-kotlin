@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

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

private object UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetGetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetSetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd13_kvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_freelocale((loc?.value ?: 0L))
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetGetdomain(level, which, id, setsize.toLong(), (mask?.value ?: 0L), (policy?.value ?: 0L))

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetSetdomain(level, which, id, setsize.toLong(), (mask?.value ?: 0L), policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: FnCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), (arg?.value ?: 0L), 0L)
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd13JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd13_kvmKerndisp((kd?.value ?: 0L))
