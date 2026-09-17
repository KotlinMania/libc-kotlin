// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUInt

public actual fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_DATA requires N-API addon with socket control message support")

public actual fun cMSGFIRSTHDR(mhdr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_FIRSTHDR requires N-API addon with socket control message support")

public actual fun cMSGNXTHDR(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("CMSG_NXTHDR requires N-API addon with socket control message support")

public actual fun cMSGALIGN(len: ULong): ULong =
    throw UnsupportedOperationException("CMSG_ALIGN requires N-API addon with socket support")

public actual fun cMSGSPACE(length: CUInt): CUInt =
    throw UnsupportedOperationException("CMSG_SPACE requires N-API addon with socket support")

public actual fun cMSGLEN(length: CUInt): CUInt =
    throw UnsupportedOperationException("CMSG_LEN requires N-API addon with socket support")
