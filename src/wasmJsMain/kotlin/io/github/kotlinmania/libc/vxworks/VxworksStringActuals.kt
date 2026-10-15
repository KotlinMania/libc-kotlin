// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon with stdlib support")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon with stdlib support")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon with stdlib support")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires N-API addon with stdlib support")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname requires N-API addon with stdlib support")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires N-API addon with stdlib support")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon with stdlib support")

public actual fun gaiStrerror(errcode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon with stdlib support")
