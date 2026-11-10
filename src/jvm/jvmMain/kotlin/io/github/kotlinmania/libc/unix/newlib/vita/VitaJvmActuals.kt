@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

private object UnixNewlibVitaJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_newlib_vita_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_vita_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_vita_sendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_vita_recvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_vita_pipe2(fds: Long, flags: Int): Int
}

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_futimens(fd, (times?.value ?: 0L))

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_sendmsg(s, (msg?.value ?: 0L), flags)

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_recvmsg(s, (msg?.value ?: 0L), flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadAttrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadAttrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadAttrGetprocessoridNp((attr?.value ?: 0L), (processorId?.value ?: 0L))

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadAttrSetprocessoridNp((attr?.value ?: 0L), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadCondattrSetclock((attr?.value ?: 0L), clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pthreadGetprocessoridNp()

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixNewlibVitaJniBridge.libc_unix_newlib_vita_pipe2((fds?.value ?: 0L), flags)
