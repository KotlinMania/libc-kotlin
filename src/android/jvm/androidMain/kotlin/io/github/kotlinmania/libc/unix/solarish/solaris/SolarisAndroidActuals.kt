@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT

private object UnixSolarishSolarisJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_solarish_solaris_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_doorCall(d: Int, params: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_doorReturn(dataPtr: Long, dataSize: Long, descPtr: Long, numDesc: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_doorCreate(serverProcedure: Long, cookie: Long, attributes: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_fattach(fildes: Int, path: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_pthreadGetattrNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_euidaccess(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_openpty(amain: Long, asubord: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_solaris_forkpty(amain: Long, name: Long, termp: Long, winp: Long): Int
}

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun doorCall(d: CInt, params: COpaquePointer?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_doorCall(d, (params?.value ?: 0L))

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_doorReturn((dataPtr?.value ?: 0L), dataSize.toLong(), (descPtr?.value ?: 0L), numDesc.toInt())

public actual fun doorCreate(serverProcedure: FnCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_doorCreate(0L, (cookie?.value ?: 0L), attributes.toInt())

public actual fun fattach(fildes: CInt, path: String?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_fattach(fildes, path)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_pthreadGetattrNp(thread.toLong(), (attr?.value ?: 0L))

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_euidaccess(path, amode)

public actual fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_openpty((amain?.value ?: 0L), (asubord?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixSolarishSolarisJniBridge.libc_unix_solarish_solaris_forkpty((amain?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))
