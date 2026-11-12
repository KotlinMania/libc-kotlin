@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixNewlibVitaJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNewlibVitaFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaSendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaRecvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libcUnixNewlibVitaGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPipe2(fds: Long, flags: Int): Int
}

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaFutimens(fd, times.rawAddress)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaSendmsg(s, msg.rawAddress, flags)

public actual fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaRecvmsg(s, msg.rawAddress, flags)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr<PthreadAttrT>, processorId: MutPtr<CInt>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr.rawAddress, processorId.rawAddress)

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr<PthreadAttrT>, processorId: CInt): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr.rawAddress, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadGetprocessoridNp()

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaGetentropy(buf.rawAddress, buflen.toLong())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPipe2(fds.rawAddress, flags)
