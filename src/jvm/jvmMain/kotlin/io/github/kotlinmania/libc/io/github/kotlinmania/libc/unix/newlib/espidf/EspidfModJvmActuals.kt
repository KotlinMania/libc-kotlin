package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.COpaquePointer

internal object EspidfModRawLibc {
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun gethostname(name: Long, namelen: Long)
    external fun sendmsg(s: Int, msg: Long, flags: Int): Long
    external fun recvmsg(s: Int, msg: Long, flags: Int): Long
    external fun eventfd(initval: Int, flags: Int): Int
}

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    EspidfModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    EspidfModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    EspidfModRawLibc.gethostname(name?.value ?: 0L, namelen)
}

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    EspidfModRawLibc.sendmsg(s, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    EspidfModRawLibc.recvmsg(s, msg?.toLong() ?: 0L, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    EspidfModRawLibc.eventfd(initval, flags)
