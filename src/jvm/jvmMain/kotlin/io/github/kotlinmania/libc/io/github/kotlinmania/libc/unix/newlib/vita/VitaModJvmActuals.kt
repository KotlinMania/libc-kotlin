package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.COpaquePointer

internal object VitaModRawLibc {
    external fun futimens(fd: Int, times: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(s: Int, msg: Long, flags: Int): Long
    external fun recvmsg(s: Int, msg: Long, flags: Int): Long
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadAttrGetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrSetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int
    external fun pthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadGetprocessoridNp(): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
}

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    VitaModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    VitaModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    VitaModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    VitaModRawLibc.sendmsg(s, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    VitaModRawLibc.recvmsg(s, msg?.toLong() ?: 0L, flags)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    VitaModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    VitaModRawLibc.pthreadAttrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    VitaModRawLibc.pthreadAttrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt =
    VitaModRawLibc.pthreadAttrGetprocessoridNp(attr?.toLong() ?: 0L, processorId?.toLong() ?: 0L)

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt =
    VitaModRawLibc.pthreadAttrSetprocessoridNp(attr?.toLong() ?: 0L, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VitaModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VitaModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    VitaModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    VitaModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    VitaModRawLibc.pthreadGetprocessoridNp()

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    VitaModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    VitaModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)
