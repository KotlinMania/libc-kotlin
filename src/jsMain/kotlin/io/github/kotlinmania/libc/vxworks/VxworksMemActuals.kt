// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.callocNapi
import io.github.kotlinmania.libc.freeNapi
import io.github.kotlinmania.libc.mallocNapi
import io.github.kotlinmania.libc.reallocNapi

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    callocNapi(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    mallocNapi(size)

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    reallocNapi(p, size)

public actual fun free(p: COpaquePointer?) {
    freeNapi(p)
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon with stdlib support")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires N-API addon with stdlib support")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon with stdlib support")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires N-API addon with stdlib support")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon with stdlib support")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon with stdlib support")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon with stdlib support")
