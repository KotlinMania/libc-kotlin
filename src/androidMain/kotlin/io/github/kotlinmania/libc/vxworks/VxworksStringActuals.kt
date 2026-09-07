// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on Android host — use androidNative target for FFI")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on Android host — use androidNative target for FFI")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname not available on Android host — use androidNative target for FFI")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror not available on Android host — use androidNative target for FFI")
