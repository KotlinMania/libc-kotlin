// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on JVM — no C library access")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on JVM — no C library access")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on JVM — no C library access")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname not available on JVM — no C library access")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on JVM — no C library access")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on JVM — no C library access")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror not available on JVM — no C library access")
