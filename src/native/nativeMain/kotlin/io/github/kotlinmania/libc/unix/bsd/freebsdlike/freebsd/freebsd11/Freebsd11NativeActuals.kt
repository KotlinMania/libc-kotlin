@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale(loc.toLong().toCPointer<ByteVar>())

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}
