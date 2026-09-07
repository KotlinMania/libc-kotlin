// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

public actual fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_DATA not available on JVM — no C library access")

public actual fun cMSGFIRSTHDR(mhdr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_FIRSTHDR not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_NXTHDR not available on JVM — no C library access")

public actual fun cMSGALIGN(len: ULong): ULong =
    throw UnsupportedOperationException("CMSG_ALIGN not available on JVM — no C library access")

public actual fun cMSGSPACE(length: CUInt): CUInt =
    throw UnsupportedOperationException("CMSG_SPACE not available on JVM — no C library access")

public actual fun cMSGLEN(length: CUInt): CUInt =
    throw UnsupportedOperationException("CMSG_LEN not available on JVM — no C library access")
