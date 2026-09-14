// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon with stdlib support")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon with stdlib support")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires N-API addon with stdlib support")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires N-API addon with stdlib support")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname requires N-API addon with stdlib support")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires N-API addon with stdlib support")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon with stdlib support")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon with stdlib support")
