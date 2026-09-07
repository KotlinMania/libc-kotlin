// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import platform.posix.aligned_alloc
import platform.posix.calloc
import platform.posix.free
import platform.posix.malloc
import platform.posix.memccpy
import platform.posix.memchr
import platform.posix.memcmp
import platform.posix.memcpy
import platform.posix.memmove
import platform.posix.memset
import platform.posix.realloc

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? {
    val result = platform.posix.calloc(nobj, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun malloc(size: ULong): COpaquePointer? {
    val result = platform.posix.malloc(size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    val cPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    val result = platform.posix.realloc(cPtr, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun free(p: COpaquePointer?) {
    val cPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    if (cPtr != null) {
        platform.posix.free(cPtr)
    }
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val cPtr: CPointer<ByteVar>? = cx?.value?.toCPointer()
    if (cPtr == null) return null
    val result = platform.posix.memchr(cPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt {
    val cPtr1: CPointer<ByteVar>? = cx?.value?.toCPointer()
    val cPtr2: CPointer<ByteVar>? = ct?.value?.toCPointer()
    if (cPtr1 == null || cPtr2 == null) return -1
    return platform.posix.memcmp(cPtr1, cPtr2, n)
}

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = platform.posix.memcpy(dPtr, sPtr, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = platform.posix.memccpy(dPtr, sPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    val sPtr: CPointer<ByteVar>? = src?.value?.toCPointer()
    if (dPtr == null || sPtr == null) return null
    val result = platform.posix.memmove(dPtr, sPtr, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val dPtr: CPointer<ByteVar>? = dest?.value?.toCPointer()
    if (dPtr == null) return null
    val result = platform.posix.memset(dPtr, c, n)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? {
    val result = platform.posix.aligned_alloc(alignment, size)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}
