// port-lint: source Illumos.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait requires N-API addon")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires N-API addon")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires N-API addon")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires N-API addon")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires N-API addon")

public actual fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetBindLwp requires N-API addon")

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    throw UnsupportedOperationException("psetGetloadavg requires N-API addon")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp requires N-API addon")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires N-API addon")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun getpagesizes2(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes2 requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun ptsnameR(fildes: CInt, name: String?, namelen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs requires N-API addon")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL requires N-API addon")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL requires N-API addon")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

