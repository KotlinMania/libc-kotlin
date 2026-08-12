@file:OptIn(ExperimentalForeignApi::class)
package io.github.kotlinmania.libc

import kotlinx.cinterop.*
import platform.posix.*

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    calloc(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    malloc(size)

public actual fun free(p: COpaquePointer?) {
    if (p != null) free(p)
}

public actual fun close(fd: CInt): CInt = close(fd)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    write(fd, buf, count)

public actual fun strlen(cs: String?): ULong =
    if (cs != null) strlen(cs) else 0uL
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    realloc(p, size)
