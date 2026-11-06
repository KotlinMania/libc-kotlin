@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_sendmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_recvmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_attr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_attr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_attr_getprocessorid_np(attr?.value?.toCPointer<ByteVar>(), processorId?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_attr_setprocessorid_np(attr?.value?.toCPointer<ByteVar>(), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_getschedparam(native.toInt(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_setschedparam(native.toInt(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pthread_getprocessorid_np()

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_vita_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)
