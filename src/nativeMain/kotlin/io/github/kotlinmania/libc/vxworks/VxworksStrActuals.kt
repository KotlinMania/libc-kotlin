// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strcat
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strncat
import libc.cinterop.libc_strncpy

public actual fun strchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    val result = libc.cinterop.libc_strchr(cs, c)
    return result?.toKString()
}

public actual fun strrchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    val result = libc.cinterop.libc_strrchr(cs, c)
    return result?.toKString()
}

public actual fun strpbrk(cs: String?, ct: String?): String? {
    if (cs == null || ct == null) return null
    val result = libc.cinterop.libc_strpbrk(cs, ct)
    return result?.toKString()
}

public actual fun strstr(cs: String?, ct: String?): String? {
    if (cs == null || ct == null) return null
    val result = libc.cinterop.libc_strstr(cs, ct)
    return result?.toKString()
}

// String mutation functions require mutable char* buffers. Kotlin String
// is immutable. These need COpaquePointer params to work correctly.
public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strcpy(dst: String?, src: String?): String? {
    val result = libc_strcpy(dst, src)
    return result?.toKString()
}
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? {
    val result = libc_strncpy(dst, src, n)
    return result?.toKString()
}
public actual fun strcat(s: String?, ct: String?): String? {
    val result = libc_strcat(s, ct)
    return result?.toKString()
}
public actual fun strncat(s: String?, ct: String?, n: ULong): String? {
    val result = libc_strncat(s, ct, n)
    return result?.toKString()
}
public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires mutable buffer (COpaquePointer), not immutable String")

public actual fun realpath(fileName: String?, resolvedName: String?): String? =
    throw UnsupportedOperationException("realpath requires mutable buffer (COpaquePointer), not immutable String")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires mutable buffer (COpaquePointer), not immutable String")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires mutable buffer (COpaquePointer), not immutable String")
