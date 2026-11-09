@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private object UnixNewlibEspidfJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_newlib_espidf_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_espidf_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_espidf_gethostname(name: Long, namelen: Long)

    @JvmStatic
    external fun libc_unix_newlib_espidf_sendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_espidf_recvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_espidf_eventfd(initval: Int, flags: Int): Int
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_gethostname((name?.value ?: 0L), namelen)
}

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_sendmsg(s, (msg?.value ?: 0L), flags)

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_recvmsg(s, (msg?.value ?: 0L), flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixNewlibEspidfJniBridge.libc_unix_newlib_espidf_eventfd(initval.toInt(), flags)
