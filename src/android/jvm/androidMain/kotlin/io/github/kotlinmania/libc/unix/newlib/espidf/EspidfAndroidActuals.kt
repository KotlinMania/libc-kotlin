@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibEspidfJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNewlibEspidfPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibEspidfGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfGethostname(name: Long, namelen: Long)

    @JvmStatic
    external fun libcUnixNewlibEspidfSendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfRecvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfEventfd(initval: Int, flags: Int): Int
}

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun gethostname(name: MutPtr<CChar>, namelen: SsizeT) {
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfGethostname(name.rawAddress, namelen)
}

public actual fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfSendmsg(s, msg.rawAddress, flags)

public actual fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfRecvmsg(s, msg.rawAddress, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfEventfd(initval.toInt(), flags)
