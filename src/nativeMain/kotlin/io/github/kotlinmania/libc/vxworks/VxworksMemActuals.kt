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
    val result = libc.cinterop.libc_calloc(nobj, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun malloc(size: ULong): COpaquePointer? {
    val result = libc.cinterop.libc_malloc(size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    val cPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    val result = libc.cinterop.libc_realloc(cPtr, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun free(p: COpaquePointer?) {
    val cPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    if (cPtr != null) {
        libc.cinterop.libc_free(cPtr)
    }
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val cPtr: CPointer<ByteVar>? = cx?.value?.toCPointer()
    if (cPtr == null) return null
    val result = libc.cinterop.libc_memchr(cPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt {
    val cPtr1: CPointer<ByteVar>? = cx?.value?.toCPointer()
    val cPtr2: CPointer<ByteVar>? = ct?.value?.toCPointer()
    if (cPtr1 == null || cPtr2 == null) return -1
    return libc.cinterop.libc_memcmp(cPtr1, cPtr2, n)
}

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = libc.cinterop.libc_memcpy(dPtr, sPtr, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = libc.cinterop.libc_memccpy(dPtr, sPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = libc.cinterop.libc_memmove(dPtr, sPtr, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    if (dPtr == null) return null
    val result = libc.cinterop.libc_memset(dPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? {
    val result = libc.cinterop.libc_aligned_alloc(alignment, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}
