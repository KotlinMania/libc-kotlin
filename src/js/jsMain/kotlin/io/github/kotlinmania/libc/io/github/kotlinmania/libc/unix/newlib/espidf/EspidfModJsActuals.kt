package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    js("require('@kotlinmania/libc-native-bindings').gethostname(name?.value ?: 0L, namelen)")
}

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(s, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(s, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt
