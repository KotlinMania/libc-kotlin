package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: ConstPtr<PthreadAttrT>, processorId: MutPtr<CInt>): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: MutPtr<PthreadAttrT>, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt
