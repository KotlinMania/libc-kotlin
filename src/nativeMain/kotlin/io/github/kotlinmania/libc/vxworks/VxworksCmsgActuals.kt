// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? {
    if (cmsg == null) return null
    val cPtr: CPointer<ByteVar>? = cmsg.value.toCPointer()
    if (cPtr == null) return null
    val result = libc_cmsg_data(cPtr)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun cmsgFirstHdr(mhdr: COpaquePointer?): COpaquePointer? {
    if (mhdr == null) return null
    val cPtr: CPointer<ByteVar>? = mhdr.value.toCPointer()
    if (cPtr == null) return null
    val result = libc_cmsg_firsthdr(cPtr)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun cmsgNextHdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? {
    if (mhdr == null) return null
    if (cmsg == null) return cmsgFirstHdr(mhdr)
    val mhdrPtr: CPointer<ByteVar>? = mhdr.value.toCPointer()
    val cmsgPtr: CPointer<ByteVar>? = cmsg.value.toCPointer()
    if (mhdrPtr == null || cmsgPtr == null) return null
    val result = libc_cmsg_nxthdr(mhdrPtr, cmsgPtr)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun cmsgAlign(len: ULong): ULong =
    throw UnsupportedOperationException("cMSGALIGN requires per-platform actual — size_t width differs across native targets")

public actual fun cmsgSpace(length: UInt): UInt =
    throw UnsupportedOperationException("cMSGSPACE requires per-platform actual — size_t width differs across native targets")

public actual fun cmsgLen(length: UInt): UInt =
    throw UnsupportedOperationException("cMSGLEN requires per-platform actual — size_t width differs across native targets")
