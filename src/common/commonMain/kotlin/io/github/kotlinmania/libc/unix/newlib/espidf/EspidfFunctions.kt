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

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun gethostname(name: MutPtr<CChar>, namelen: SsizeT)

public expect fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt
