@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_gethostname(name?.value?.toCPointer<ByteVar>(), namelen)
}

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_sendmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_recvmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_unix_newlib_espidf_eventfd(initval, flags)
