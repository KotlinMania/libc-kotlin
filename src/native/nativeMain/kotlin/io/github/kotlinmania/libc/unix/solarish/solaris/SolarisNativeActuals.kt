@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_doorCall
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_doorCreate
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_doorReturn
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_euidaccess
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_fattach
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_fexecve
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_forkpty
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_mincore
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_openpty
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libc_unix_solarish_solaris_pthreadGetattrNp
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_solarish_solaris_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    libc_unix_solarish_solaris_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun doorCall(d: CInt, params: COpaquePointer?): CInt =
    libc_unix_solarish_solaris_doorCall(d, params?.value?.toCPointer<ByteVar>())

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt =
    libc_unix_solarish_solaris_doorReturn(dataPtr?.value?.toCPointer<ByteVar>(), dataSize, descPtr?.value?.toCPointer<ByteVar>(), numDesc)

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    libc_unix_solarish_solaris_doorCreate(0L.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>(), attributes)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    libc_unix_solarish_solaris_fattach(fildes, path)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    libc_unix_solarish_solaris_pthreadGetattrNp(thread.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    libc_unix_solarish_solaris_euidaccess(path, amode)

public actual fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    libc_unix_solarish_solaris_openpty(amain?.value?.toCPointer<ByteVar>(), asubord?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    libc_unix_solarish_solaris_forkpty(amain?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())
