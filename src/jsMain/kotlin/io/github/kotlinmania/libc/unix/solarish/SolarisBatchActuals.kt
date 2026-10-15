// port-lint: source Solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun doorCall(d: Int, params: DoorArgT?): Int =
    throw UnsupportedOperationException("doorCall requires N-API addon")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: UInt): Int =
    throw UnsupportedOperationException("doorReturn requires N-API addon")

public actual fun fattach(fildes: Int, path: String?): Int =
    throw UnsupportedOperationException("fattach requires N-API addon")

public actual fun pthreadGetattrNp(thread: UInt, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun euidaccess(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, UInt) -> Unit)?, cookie: COpaquePointer?, attributes: UInt): Int =
    throw UnsupportedOperationException("doorCreate requires N-API addon")
