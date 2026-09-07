@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.toKString
import libc.cinterop.libc_dlerror
import libc.cinterop.libc_gai_strerror
import libc.cinterop.libc_getenv
import libc.cinterop.libc_getlogin
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_strdup
import libc.cinterop.libc_strerror
import libc.cinterop.libc_ttyname

public actual fun getenv(s: String?): String? {
    if (s == null) return null
    val result = libc.cinterop.libc_getenv(s)
    return result?.toKString()
}

public actual fun strdup(cs: String?): String? {
    if (cs == null) return null
    val result = libc.cinterop.libc_strdup(cs)
    return result?.toKString()
}

public actual fun strerror(n: CInt): String? {
    val result = libc.cinterop.libc_strerror(n)
    return result?.toKString()
}

public actual fun getlogin(): String? {
    val result = libc.cinterop.libc_getlogin()
    return result?.toKString()
}

public actual fun ttyname(fd: CInt): String? {
    val result = libc.cinterop.libc_ttyname(fd)
    return result?.toKString()
}

public actual fun dlerror(): String? {
    val result = libc.cinterop.libc_dlerror()
    return result?.toKString()
}

public actual fun setlocale(category: CInt, locale: String?): String? {
    val result = libc.cinterop.libc_setlocale(category, locale)
    return result?.toKString()
}

public actual fun gaiStrerror(errcode: CInt): String? {
    val result = libc.cinterop.libc_gai_strerror(errcode)
    return result?.toKString()
}
