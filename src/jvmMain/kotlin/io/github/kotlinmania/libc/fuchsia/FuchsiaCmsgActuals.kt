// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.COpaquePointer

public actual fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_DATA not available on JVM — no C library access")

public actual fun cMSGFIRSTHDR(mhdr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_FIRSTHDR not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_NXTHDR not available on JVM — no C library access")
