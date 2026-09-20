@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_calloc
import libc.cinterop.libc_free
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memccpy
import libc.cinterop.libc_memchr
import libc.cinterop.libc_memcmp
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_memmove
import libc.cinterop.libc_memset
import libc.cinterop.libc_realloc
import libc.cinterop.libc_aligned_alloc

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    throw UnsupportedOperationException("realloc requires per-platform actual — size_t width differs across native targets")
}

public actual fun free(p: COpaquePointer?) {
    if (p == null) return
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    libc_free(pPtr)
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    throw UnsupportedOperationException("memchr requires per-platform actual — size_t width differs across native targets")
}

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt {
    throw UnsupportedOperationException("memcmp requires per-platform actual — size_t width differs across native targets")
}

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    throw UnsupportedOperationException("memcpy requires per-platform actual — size_t width differs across native targets")
}

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires FFI bridge")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    throw UnsupportedOperationException("memmove requires per-platform actual — size_t width differs across native targets")
}

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    throw UnsupportedOperationException("memset requires per-platform actual — size_t width differs across native targets")
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? {
    throw UnsupportedOperationException("alignedAlloc requires per-platform actual — size_t width differs across native targets")
}