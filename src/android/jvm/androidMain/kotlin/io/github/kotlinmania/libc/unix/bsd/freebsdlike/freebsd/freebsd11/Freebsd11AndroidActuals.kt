@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT

private object UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale(loc: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent(): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun freelocale(loc: LocaleT): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale((loc?.value ?: 0L))

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun dirname(path: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: FnCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), (arg?.value ?: 0L), 0L)
}
