@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_gethostname(name?.value?.toCPointer<ByteVar>(), namelen)
}

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_sendmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_recvmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.espidf.cinterop.libc_espidf_mod_eventfd(initval, flags)
