package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

internal object SolarisRawLibc {
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun doorCall(d: Int, params: Long): Int
    external fun doorReturn(dataPtr: Long, dataSize: Long, descPtr: Long, numDesc: Int): Int
    external fun doorCreate(serverProcedure: Long, cookie: Long, attributes: Long): Int
    external fun fattach(fildes: Int, path: String?): Int
    external fun pthreadGetattrNp(thread: Long, attr: Long): Int
    external fun euidaccess(path: String?, amode: Int): Int
    external fun openpty(amain: Long, asubord: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amain: Long, name: Long, termp: Long, winp: Long): Int
}

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    SolarisRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    SolarisRawLibc.mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    SolarisRawLibc.doorCall(d, params?.toLong() ?: 0L)

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: DoorDescT?, numDesc: CUint): CInt =
    SolarisRawLibc.doorReturn(dataPtr?.value ?: 0L, dataSize, descPtr?.toLong() ?: 0L, numDesc)

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    SolarisRawLibc.doorCreate(serverProcedure, cookie?.value ?: 0L, attributes)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    SolarisRawLibc.fattach(fildes, path)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    SolarisRawLibc.pthreadGetattrNp(thread, attr?.toLong() ?: 0L)

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    SolarisRawLibc.euidaccess(path, amode)

public actual fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    SolarisRawLibc.openpty(amain?.toLong() ?: 0L, asubord?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    SolarisRawLibc.forkpty(amain?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)
