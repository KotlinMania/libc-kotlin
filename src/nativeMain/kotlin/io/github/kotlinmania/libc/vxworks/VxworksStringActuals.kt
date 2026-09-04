@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.toKString
import platform.posix.dlerror
import platform.posix.gai_strerror
import platform.posix.getenv
import platform.posix.getlogin
import platform.posix.setlocale
import platform.posix.strdup
import platform.posix.strerror
import platform.posix.ttyname

public actual fun getenv(s: String?): String? {
    if (s == null) return null
    val result = platform.posix.getenv(s)
    return result?.toKString()
}

public actual fun strdup(cs: String?): String? {
    if (cs == null) return null
    val result = platform.posix.strdup(cs)
    return result?.toKString()
}

public actual fun strerror(n: CInt): String? {
    val result = platform.posix.strerror(n)
    return result?.toKString()
}

public actual fun getlogin(): String? {
    val result = platform.posix.getlogin()
    return result?.toKString()
}

public actual fun ttyname(fd: CInt): String? {
    val result = platform.posix.ttyname(fd)
    return result?.toKString()
}

public actual fun dlerror(): String? {
    val result = platform.posix.dlerror()
    return result?.toKString()
}

public actual fun setlocale(category: CInt, locale: String?): String? {
    val result = platform.posix.setlocale(category, locale)
    return result?.toKString()
}

public actual fun gaiStrerror(errcode: CInt): String? {
    val result = platform.posix.gai_strerror(errcode)
    return result?.toKString()
}
