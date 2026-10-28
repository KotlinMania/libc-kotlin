package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv not available on WASI — no C library access")

public actual fun cpusetGetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.CAnonymousDomainset?, policy: Int?): Int =
    throw UnsupportedOperationException("cpusetGetdomain not available on WASI — no C library access")

public actual fun cpusetSetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.CAnonymousDomainset?, policy: Int): Int =
    throw UnsupportedOperationException("cpusetSetdomain not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on WASI — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR not available on WASI — no C library access")
