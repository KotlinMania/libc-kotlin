@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_freelocale(loc.toInt())

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_dirname(path)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.cinterop.libc_freebsd11_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), compar?.value?.toCPointer<ByteVar>())
}
