package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun gethostname(name: COpaquePointer?, namelen: SsizeT)

public expect fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt
