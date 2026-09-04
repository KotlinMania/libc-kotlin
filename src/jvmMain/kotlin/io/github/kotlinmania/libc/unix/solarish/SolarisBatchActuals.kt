// port-lint: source Solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on JVM — no C library access")

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    throw UnsupportedOperationException("doorCall not available on JVM — no C library access")

public actual fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: CUInt): CInt =
    throw UnsupportedOperationException("doorReturn not available on JVM — no C library access")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach not available on JVM — no C library access")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess not available on JVM — no C library access")


public actual fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, CUInt) -> Unit)?, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    throw UnsupportedOperationException("doorCreate not available on JVM — no C library access")
