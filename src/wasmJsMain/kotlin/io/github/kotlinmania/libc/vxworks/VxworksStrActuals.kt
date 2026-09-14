// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires N-API addon with string support")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon with string support")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon with string support")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon with string support")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon with string support")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon with string support")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon with string support")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon with string support")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon with string support")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon with string support")

public actual fun realpath(fileName: String?, resolvedName: String?): String? =
    throw UnsupportedOperationException("realpath requires N-API addon with string support")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires N-API addon with string support")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires N-API addon with string support")
