// port-lint: source Illumos.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on Android host — use androidNative target for FFI")

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait not available on Android host — use androidNative target for FFI")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate not available on Android host — use androidNative target for FFI")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 not available on Android host — use androidNative target for FFI")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait not available on Android host — use androidNative target for FFI")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl not available on Android host — use androidNative target for FFI")

public actual fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore not available on Android host — use androidNative target for FFI")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetBindLwp not available on Android host — use androidNative target for FFI")

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    throw UnsupportedOperationException("psetGetloadavg not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun getpagesizes2(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes2 not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on Android host — use androidNative target for FFI")

public actual fun ptsnameR(fildes: CInt, name: String?, namelen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR not available on Android host — use androidNative target for FFI")

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs not available on Android host — use androidNative target for FFI")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL not available on Android host — use androidNative target for FFI")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL not available on Android host — use androidNative target for FFI")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate not available on Android host — use androidNative target for FFI")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime not available on Android host — use androidNative target for FFI")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime not available on Android host — use androidNative target for FFI")

