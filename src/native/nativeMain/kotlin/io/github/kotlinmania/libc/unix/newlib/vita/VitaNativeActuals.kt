@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_futimens
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_getentropy
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pipe2
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadAttrGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadAttrSetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadCreate
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadGetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_pthreadSetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_readv
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_recvmsg
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_sendmsg
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libc_unix_newlib_vita_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_newlib_vita_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_newlib_vita_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_newlib_vita_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_newlib_vita_sendmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_newlib_vita_recvmsg(s, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadAttrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadAttrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadAttrGetprocessoridNp(attr?.value?.toCPointer<ByteVar>(), processorId?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    libc_unix_newlib_vita_pthreadAttrSetprocessoridNp(attr?.value?.toCPointer<ByteVar>(), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_unix_newlib_vita_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_newlib_vita_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    libc_unix_newlib_vita_pthreadGetprocessoridNp()

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_newlib_vita_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    libc_unix_newlib_vita_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)
