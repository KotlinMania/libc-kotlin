// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.ByteVar

public actual fun setgrent(): CInt =
    libc.cinterop.libc_setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    libc.cinterop.libc_dirname(path)?.toKString()

public actual fun basename(path: String?): String? =
    libc.cinterop.libc_basename(path)?.toKString()

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
}
