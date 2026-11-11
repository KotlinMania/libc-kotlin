@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent(): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale(loc?.value?.toCPointer<ByteVar>())

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: String?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}
