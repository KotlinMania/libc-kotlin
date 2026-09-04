// port-lint: source Utmpx.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on Android host — use androidNative target for FFI")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on Android host — use androidNative target for FFI")
}

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on Android host — use androidNative target for FFI")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on Android host — use androidNative target for FFI")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on Android host — use androidNative target for FFI")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on Android host — use androidNative target for FFI")

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    throw UnsupportedOperationException("updwtmpx not available on Android host — use androidNative target for FFI")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx not available on Android host — use androidNative target for FFI")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    throw UnsupportedOperationException("updlastlogx not available on Android host — use androidNative target for FFI")

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    throw UnsupportedOperationException("getutmp not available on Android host — use androidNative target for FFI")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    throw UnsupportedOperationException("getutmpx not available on Android host — use androidNative target for FFI")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on Android host — use androidNative target for FFI")

