@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private object UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd12_qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_freelocale(loc.toLong())
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd12JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd12_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), (arg?.value ?: 0L), 0L)
}
