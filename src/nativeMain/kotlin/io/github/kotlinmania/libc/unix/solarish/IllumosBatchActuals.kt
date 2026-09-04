// port-lint: source Illumos.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait requires manual FFI bridge — not yet implemented")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires manual FFI bridge — not yet implemented")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires manual FFI bridge — not yet implemented")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires manual FFI bridge — not yet implemented")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires manual FFI bridge — not yet implemented")

public actual fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires manual FFI bridge — not yet implemented")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetBindLwp requires manual FFI bridge — not yet implemented")

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    throw UnsupportedOperationException("psetGetloadavg requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires manual FFI bridge — not yet implemented")

public actual fun getpagesizes2(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes2 requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fildes: CInt, name: String?, namelen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs requires manual FFI bridge — not yet implemented")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL requires manual FFI bridge — not yet implemented")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")
