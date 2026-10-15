// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import libc.cinterop.libc_basename
import libc.cinterop.libc_dirname
import libc.cinterop.libc_setgrent

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun cpusetGetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.CAnonymousDomainset?, policy: Int?): Int =
    throw UnsupportedOperationException("cpusetGetdomain requires manual FFI bridge — not yet implemented")

public actual fun cpusetSetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.CAnonymousDomainset?, policy: Int): Int =
    throw UnsupportedOperationException("cpusetSetdomain requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    if (path == null) return null
    return libc.cinterop.libc_dirname(path)?.toKString()
}

public actual fun basename(path: String?): String? {
    if (path == null) return null
    return libc.cinterop.libc_basename(path)?.toKString()
}

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
