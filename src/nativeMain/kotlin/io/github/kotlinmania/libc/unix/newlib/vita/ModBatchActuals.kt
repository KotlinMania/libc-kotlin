// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_getentropy

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    libc.cinterop.libc_futimens(fd, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_writev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_readv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT, processorId: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT, processorId: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetprocessoridNp(): CInt =
    throw UnsupportedOperationException("pthreadGetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getentropy(cPtr, buflen)
}

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
