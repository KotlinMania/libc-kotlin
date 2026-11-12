@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaFutimens
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaGetentropy
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPipe2
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadAttrGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadAttrSetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadCreate
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadGetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaPthreadSetschedparam
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaReadv
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaRecvmsg
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaSendmsg
import io.github.kotlinmania.libc.unix.newlib.vita.cinterop.libcUnixNewlibVitaWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixNewlibVitaFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixNewlibVitaWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixNewlibVitaReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    libcUnixNewlibVitaSendmsg(s, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT =
    libcUnixNewlibVitaRecvmsg(s, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixNewlibVitaPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixNewlibVitaPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixNewlibVitaPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    libcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr.rawAddress.toCPointer<ByteVar>(), processorId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    libcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr.rawAddress.toCPointer<ByteVar>(), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcUnixNewlibVitaPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcUnixNewlibVitaPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixNewlibVitaPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixNewlibVitaPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    libcUnixNewlibVitaPthreadGetprocessoridNp()

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixNewlibVitaGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    libcUnixNewlibVitaPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)
