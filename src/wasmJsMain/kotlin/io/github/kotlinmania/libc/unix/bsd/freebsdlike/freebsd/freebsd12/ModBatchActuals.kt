// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

