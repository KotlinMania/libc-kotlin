// port-lint: source Solaris.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    throw UnsupportedOperationException("doorCall requires manual FFI bridge — not yet implemented")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: CUInt): CInt =
    throw UnsupportedOperationException("doorReturn requires manual FFI bridge — not yet implemented")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, CUInt) -> Unit)?, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    throw UnsupportedOperationException("doorCreate requires manual FFI bridge — not yet implemented")
