// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import platform.posix.strchr
import platform.posix.strpbrk
import platform.posix.strrchr
import platform.posix.strstr

public actual fun strchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    val result = platform.posix.strchr(cs, c)
    return result?.toKString()
}

public actual fun strrchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    val result = platform.posix.strrchr(cs, c)
    return result?.toKString()
}

public actual fun strpbrk(cs: String?, ct: String?): String? {
    if (cs == null || ct == null) return null
    val result = platform.posix.strpbrk(cs, ct)
    return result?.toKString()
}

public actual fun strstr(cs: String?, ct: String?): String? {
    if (cs == null || ct == null) return null
    val result = platform.posix.strstr(cs, ct)
    return result?.toKString()
}

// String mutation functions require mutable char* buffers. Kotlin String
// is immutable. These need COpaquePointer params to work correctly.
public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires mutable buffer (COpaquePointer), not immutable String")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires mutable buffer (COpaquePointer), not immutable String")

public actual fun realpath(fileName: String?, resolvedName: String?): String? =
    throw UnsupportedOperationException("realpath requires mutable buffer (COpaquePointer), not immutable String")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires mutable buffer (COpaquePointer), not immutable String")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires mutable buffer (COpaquePointer), not immutable String")
