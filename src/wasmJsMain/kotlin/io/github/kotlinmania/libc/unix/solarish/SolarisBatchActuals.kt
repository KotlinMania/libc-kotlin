// port-lint: source Solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    throw UnsupportedOperationException("doorCall requires N-API addon")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: CUInt): CInt =
    throw UnsupportedOperationException("doorReturn requires N-API addon")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach requires N-API addon")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

