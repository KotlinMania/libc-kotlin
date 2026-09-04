// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun setgrent(): CInt =
    throw UnsupportedOperationException("setgrent requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires manual FFI bridge — not yet implemented")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires manual FFI bridge — not yet implemented")
