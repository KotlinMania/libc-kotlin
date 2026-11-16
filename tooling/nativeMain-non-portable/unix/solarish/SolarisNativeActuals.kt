@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_door_call(d, params?.value?.toCPointer<ByteVar>())

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: DoorDescT?, numDesc: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_door_return(dataPtr?.value?.toCPointer<ByteVar>(), dataSize, descPtr?.value?.toCPointer<ByteVar>(), numDesc)

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_door_create(serverProcedure.toInt(), cookie?.value?.toCPointer<ByteVar>(), attributes)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_fattach(fildes, path)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_pthread_getattr_np(thread.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_euidaccess(path, amode)

public actual fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_openpty(amain?.value?.toCPointer<ByteVar>(), asubord?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solaris_forkpty(amain?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())
