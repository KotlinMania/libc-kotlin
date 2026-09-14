// port-lint: source ../../../src/commonMain/kotlin/io/github/kotlinmania/libc/new/netbsd/Utmp.kt.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent requires manual FFI bridge — not yet implemented")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires manual FFI bridge — not yet implemented")

public actual fun endutent() {
    throw UnsupportedOperationException("endutent requires manual FFI bridge — not yet implemented")
}
