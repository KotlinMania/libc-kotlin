@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixSolarishSolarisJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixSolarishSolarisFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorCall(d: Int, params: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorReturn(dataPtr: Long, dataSize: Long, descPtr: Long, numDesc: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorCreate(serverProcedure: Long, cookie: Long, attributes: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisFattach(fildes: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisPthreadGetattrNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisEuidaccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisOpenpty(amain: Long, asubord: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisForkpty(amain: Long, name: Long, termp: Long, winp: Long): Int
}

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun doorCall(d: CInt, params: MutPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorCall(d, params.rawAddress)

public actual fun doorReturn(dataPtr: MutPtr, dataSize: SizeT, descPtr: MutPtr, numDesc: CUint): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorReturn(dataPtr.rawAddress, dataSize.toLong(), descPtr.rawAddress, numDesc.toInt())

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr, attributes: DoorAttrT): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorCreate(0L, cookie.rawAddress, attributes.toInt())

public actual fun fattach(fildes: CInt, path: ConstPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisFattach(fildes, path.rawAddress)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisPthreadGetattrNp(thread.toLong(), attr.rawAddress)

public actual fun euidaccess(path: ConstPtr, amode: CInt): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisEuidaccess(path.rawAddress, amode)

public actual fun openpty(amain: MutPtr, asubord: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisOpenpty(amain.rawAddress, asubord.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amain: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisForkpty(amain.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)
