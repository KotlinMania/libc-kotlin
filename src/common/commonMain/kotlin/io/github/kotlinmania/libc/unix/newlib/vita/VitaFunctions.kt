package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt
