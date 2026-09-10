// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on Android host — use androidNative target for FFI")
