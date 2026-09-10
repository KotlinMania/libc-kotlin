// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on WASI — no C library access")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on WASI — no C library access")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on WASI — no C library access")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on WASI — no C library access")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on WASI — no C library access")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on WASI — no C library access")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on WASI — no C library access")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on WASI — no C library access")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on WASI — no C library access")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on WASI — no C library access")

public actual fun realpath(fileName: String?, resolvedName: String?): String? =
    throw UnsupportedOperationException("realpath not available on WASI — no C library access")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on WASI — no C library access")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on WASI — no C library access")
