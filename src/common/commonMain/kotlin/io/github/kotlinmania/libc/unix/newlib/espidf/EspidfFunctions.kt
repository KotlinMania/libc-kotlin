package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun gethostname(name: MutPtr, namelen: SsizeT)

public expect fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt
