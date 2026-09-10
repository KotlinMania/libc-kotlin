// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv not available on Android host — use androidNative target for FFI")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on Android host — use androidNative target for FFI")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on Android host — use androidNative target for FFI")


public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsortR not available on Android host — use androidNative target for FFI")
}
