// port-lint: source Illumos.rs
package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on Android host — use androidNative target for FFI")

public actual fun epollPwait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("epollPwait not available on Android host — use androidNative target for FFI")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate not available on Android host — use androidNative target for FFI")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 not available on Android host — use androidNative target for FFI")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait not available on Android host — use androidNative target for FFI")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl not available on Android host — use androidNative target for FFI")

public actual fun mincore(addr: String?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore not available on Android host — use androidNative target for FFI")

public actual fun psetBindLwp(pset: Int, id: Int, pid: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetBindLwp not available on Android host — use androidNative target for FFI")

public actual fun psetGetloadavg(pset: Int, load: Double?, num: Int): Int =
    throw UnsupportedOperationException("psetGetloadavg not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetNp(thread: UInt, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrGetNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun getpagesizes2(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes2 not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on Android host — use androidNative target for FFI")

public actual fun ptsnameR(fildes: Int, name: String?, namelen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR not available on Android host — use androidNative target for FFI")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs not available on Android host — use androidNative target for FFI")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strcasecmpL not available on Android host — use androidNative target for FFI")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strncasecmpL not available on Android host — use androidNative target for FFI")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate not available on Android host — use androidNative target for FFI")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime not available on Android host — use androidNative target for FFI")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime not available on Android host — use androidNative target for FFI")
