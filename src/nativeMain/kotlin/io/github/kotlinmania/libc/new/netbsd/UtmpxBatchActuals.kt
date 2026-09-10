// port-lint: source ../../../src/commonMain/kotlin/io/github/kotlinmania/libc/new/netbsd/Utmpx.kt.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    throw UnsupportedOperationException("updwtmpx requires manual FFI bridge — not yet implemented")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx requires manual FFI bridge — not yet implemented")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    throw UnsupportedOperationException("updlastlogx requires manual FFI bridge — not yet implemented")

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    throw UnsupportedOperationException("getutmp requires manual FFI bridge — not yet implemented")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    throw UnsupportedOperationException("getutmpx requires manual FFI bridge — not yet implemented")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")
