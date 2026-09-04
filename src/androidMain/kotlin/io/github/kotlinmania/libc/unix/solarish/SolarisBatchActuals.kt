// port-lint: source Solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on Android host — use androidNative target for FFI")

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    throw UnsupportedOperationException("doorCall not available on Android host — use androidNative target for FFI")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: CUInt): CInt =
    throw UnsupportedOperationException("doorReturn not available on Android host — use androidNative target for FFI")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on Android host — use androidNative target for FFI")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess not available on Android host — use androidNative target for FFI")

