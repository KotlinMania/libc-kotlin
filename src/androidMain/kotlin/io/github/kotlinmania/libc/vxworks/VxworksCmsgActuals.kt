package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_DATA not available on Android host — use androidNative target for FFI")

public actual fun cmsgFirstHdr(mhdr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_FIRSTHDR not available on Android host — use androidNative target for FFI")

public actual fun cmsgNextHdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_NXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cmsgAlign(len: ULong): ULong =
    throw UnsupportedOperationException("CMSG_ALIGN not available on Android host — use androidNative target for FFI")

public actual fun cmsgSpace(length: UInt): UInt =
    throw UnsupportedOperationException("CMSG_SPACE not available on Android host — use androidNative target for FFI")

public actual fun cmsgLen(length: UInt): UInt =
    throw UnsupportedOperationException("CMSG_LEN not available on Android host — use androidNative target for FFI")
