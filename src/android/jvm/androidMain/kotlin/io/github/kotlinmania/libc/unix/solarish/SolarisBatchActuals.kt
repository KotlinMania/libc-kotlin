// port-lint: source Solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve not available on Android host — use androidNative target for FFI")

public actual fun doorCall(d: Int, params: DoorArgT?): Int =
    throw UnsupportedOperationException("doorCall not available on Android host — use androidNative target for FFI")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: UInt): Int =
    throw UnsupportedOperationException("doorReturn not available on Android host — use androidNative target for FFI")

public actual fun fattach(fildes: Int, path: String?): Int =
    throw UnsupportedOperationException("fattach not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetattrNp(thread: UInt, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp not available on Android host — use androidNative target for FFI")

public actual fun euidaccess(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("euidaccess not available on Android host — use androidNative target for FFI")

public actual fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, UInt) -> Unit)?, cookie: COpaquePointer?, attributes: UInt): Int =
    throw UnsupportedOperationException("doorCreate not available on Android host — use androidNative target for FFI")
