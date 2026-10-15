// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public actual fun setgrent(): Int =
    throw UnsupportedOperationException("setgrent not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Int =
    throw UnsupportedOperationException("msgrcv not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on WASI — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR not available on WASI — no C library access")
