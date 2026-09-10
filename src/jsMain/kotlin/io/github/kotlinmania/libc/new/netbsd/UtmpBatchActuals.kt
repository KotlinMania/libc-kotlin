// port-lint: source Utmp.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent requires N-API addon")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires N-API addon")

public actual fun endutent() {
    throw UnsupportedOperationException("endutent requires N-API addon")
}

