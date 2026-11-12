@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisDoorCall
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisDoorCreate
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisDoorReturn
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisEuidaccess
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisFattach
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisFexecve
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisForkpty
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisMincore
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisOpenpty
import io.github.kotlinmania.libc.unix.solarish.solaris.cinterop.libcUnixSolarishSolarisPthreadGetattrNp
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixSolarishSolarisFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    libcUnixSolarishSolarisMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun doorCall(d: CInt, params: MutPtr): CInt =
    libcUnixSolarishSolarisDoorCall(d, params.rawAddress.toCPointer<ByteVar>())

public actual fun doorReturn(dataPtr: MutPtr, dataSize: SizeT, descPtr: MutPtr, numDesc: CUint): CInt =
    libcUnixSolarishSolarisDoorReturn(dataPtr.rawAddress.toCPointer<ByteVar>(), dataSize, descPtr.rawAddress.toCPointer<ByteVar>(), numDesc)

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr, attributes: DoorAttrT): CInt =
    libcUnixSolarishSolarisDoorCreate(0L.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>(), attributes)

public actual fun fattach(fildes: CInt, path: ConstPtr): CInt =
    libcUnixSolarishSolarisFattach(fildes, path.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr): CInt =
    libcUnixSolarishSolarisPthreadGetattrNp(thread.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun euidaccess(path: ConstPtr, amode: CInt): CInt =
    libcUnixSolarishSolarisEuidaccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun openpty(amain: MutPtr, asubord: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    libcUnixSolarishSolarisOpenpty(amain.rawAddress.toCPointer<ByteVar>(), asubord.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amain: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    libcUnixSolarishSolarisForkpty(amain.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())
