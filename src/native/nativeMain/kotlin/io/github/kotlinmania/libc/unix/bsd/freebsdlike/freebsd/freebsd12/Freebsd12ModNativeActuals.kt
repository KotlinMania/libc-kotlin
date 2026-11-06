@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_freelocale(loc.toInt())
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12.cinterop.libc_freebsd12_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), compar?.value?.toCPointer<ByteVar>())
}
