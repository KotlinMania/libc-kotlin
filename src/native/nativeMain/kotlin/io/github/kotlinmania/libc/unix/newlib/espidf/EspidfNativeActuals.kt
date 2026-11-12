@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfEventfd
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfGethostname
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfGetrandom
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfPthreadCreate
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfRecvmsg
import io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libcUnixNewlibEspidfSendmsg
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixNewlibEspidfPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixNewlibEspidfGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun gethostname(name: MutPtr<CChar>, namelen: SsizeT) {
    libcUnixNewlibEspidfGethostname(name.rawAddress.toCPointer<ByteVar>(), namelen)
}

public actual fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixNewlibEspidfSendmsg(s, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixNewlibEspidfRecvmsg(s, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcUnixNewlibEspidfEventfd(initval, flags)
