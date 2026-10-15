// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import libc.cinterop.libc_basename
import libc.cinterop.libc_dirname

public actual fun setgrent(): Int =
    throw UnsupportedOperationException("setgrent requires FFI bridge")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Int =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    val result = libc_dirname(path)
    return result?.toKString()
}

public actual fun basename(path: String?): String? {
    val result = libc_basename(path)
    return result?.toKString()
}

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
