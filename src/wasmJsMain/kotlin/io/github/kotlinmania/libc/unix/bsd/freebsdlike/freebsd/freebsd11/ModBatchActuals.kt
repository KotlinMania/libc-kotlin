// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public actual fun setgrent(): CInt =
    throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")


public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsortR requires N-API addon")
}
