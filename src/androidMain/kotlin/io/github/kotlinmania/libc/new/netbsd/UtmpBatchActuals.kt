// port-lint: source Utmp.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname not available on Android host — use androidNative target for FFI")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent not available on Android host — use androidNative target for FFI")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on Android host — use androidNative target for FFI")

public actual fun endutent() {
    throw UnsupportedOperationException("endutent not available on Android host — use androidNative target for FFI")
}

