package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt
