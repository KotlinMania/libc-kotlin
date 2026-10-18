package io.github.kotlinmania.libc.vxworks

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on Android host — use androidNative target for FFI")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on Android host — use androidNative target for FFI")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname not available on Android host — use androidNative target for FFI")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun gaiStrerror(errcode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror not available on Android host — use androidNative target for FFI")
