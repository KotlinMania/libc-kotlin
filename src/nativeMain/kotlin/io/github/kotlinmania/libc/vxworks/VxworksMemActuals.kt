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

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? {
    val result = libc_calloc(nobj, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun malloc(size: ULong): COpaquePointer? {
    val result = libc_malloc(size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    if (p == null) return malloc(size)
    val cPtr: CPointer<ByteVar>? = p.value.toCPointer()
    val result = libc_realloc(cPtr, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun free(p: COpaquePointer?) {
    val cPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    if (cPtr != null) {
        libc_free(cPtr)
    }
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (cx == null) return null
    val cPtr: CPointer<ByteVar>? = cx.value.toCPointer()
    val result = libc_memchr(cPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt {
    if (cx == null || ct == null) return -1
    val cxPtr: CPointer<ByteVar>? = cx.value.toCPointer()
    val ctPtr: CPointer<ByteVar>? = ct.value.toCPointer()
    return libc_memcmp(cxPtr, ctPtr, n)
}

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null || src == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memcpy(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires FFI bridge")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null || src == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memmove(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    val result = libc_memset(destPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? {
    val result = libc_aligned_alloc(alignment, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}