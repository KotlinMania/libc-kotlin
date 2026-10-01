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

import libc.cinterop.libc_aligned_free
import libc.cinterop.libc_aligned_realloc

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    if (p == null) return malloc(size)
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    val res = if (p.allocationAlignment != 0uL) {
        libc.cinterop.libc_aligned_realloc(pPtr, size, p.allocationAlignment)
    } else {
        libc.cinterop.libc_realloc(pPtr, size)
    }
    return res?.let { COpaquePointer(it.toLong(), p.allocationAlignment) }
}

public actual fun free(p: COpaquePointer?) {
    if (p == null) return
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    if (p.allocationAlignment != 0uL) libc_aligned_free(pPtr) else libc_free(pPtr)
}

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val ptr = cx?.value?.toCPointer<ByteVar>() ?: return null
    return libc.cinterop.libc_memchr(ptr, c, n)?.let { COpaquePointer(it.toLong()) }
}

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt {
    val p1 = cx?.value?.toCPointer<ByteVar>()
    val p2 = ct?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_memcmp(p1, p2, n)
}

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val d = dest?.value?.toCPointer<ByteVar>()
    val s = src?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_memcpy(d, s, n)?.let { COpaquePointer(it.toLong()) }
}

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val d = dest?.value?.toCPointer<ByteVar>()
    val s = src?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_memccpy(d, s, c, n)?.let { COpaquePointer(it.toLong()) }
}

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    val d = dest?.value?.toCPointer<ByteVar>()
    val s = src?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_memmove(d, s, n)?.let { COpaquePointer(it.toLong()) }
}

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    val d = dest?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_memset(d, c, n)?.let { COpaquePointer(it.toLong()) }
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? {
    return libc.cinterop.libc_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong(), alignment) }
}