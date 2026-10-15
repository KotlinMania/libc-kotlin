// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_DATA requires N-API addon with socket control message support")

public actual fun cmsgFirstHdr(mhdr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_FIRSTHDR requires N-API addon with socket control message support")

public actual fun cmsgNextHdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_NXTHDR requires N-API addon with socket control message support")

public actual fun cmsgAlign(len: ULong): ULong =
    throw UnsupportedOperationException("CMSG_ALIGN requires N-API addon with socket support")

public actual fun cmsgSpace(length: UInt): UInt =
    throw UnsupportedOperationException("CMSG_SPACE requires N-API addon with socket support")

public actual fun cmsgLen(length: UInt): UInt =
    throw UnsupportedOperationException("CMSG_LEN requires N-API addon with socket support")
