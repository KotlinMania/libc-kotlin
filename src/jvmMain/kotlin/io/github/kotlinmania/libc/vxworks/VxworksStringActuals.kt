// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on JVM — no C library access")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on JVM — no C library access")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on JVM — no C library access")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname not available on JVM — no C library access")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on JVM — no C library access")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on JVM — no C library access")

public actual fun gaiStrerror(errcode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror not available on JVM — no C library access")
