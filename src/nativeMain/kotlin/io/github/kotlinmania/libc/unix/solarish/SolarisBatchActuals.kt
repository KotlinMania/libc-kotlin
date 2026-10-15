// port-lint: source Solaris.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun doorCall(d: Int, params: DoorArgT?): Int =
    throw UnsupportedOperationException("doorCall requires manual FFI bridge — not yet implemented")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: UInt): Int =
    throw UnsupportedOperationException("doorReturn requires manual FFI bridge — not yet implemented")

public actual fun fattach(fildes: Int, path: String?): Int =
    throw UnsupportedOperationException("fattach requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(thread: UInt, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, UInt) -> Unit)?, cookie: COpaquePointer?, attributes: UInt): Int =
    throw UnsupportedOperationException("doorCreate requires manual FFI bridge — not yet implemented")
