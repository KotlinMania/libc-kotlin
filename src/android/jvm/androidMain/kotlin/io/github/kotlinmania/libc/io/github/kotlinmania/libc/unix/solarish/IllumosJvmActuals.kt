package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

internal object IllumosRawLibc {
    external fun eventfd(initval: Int, flags: Int): Int
    external fun epollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int
    external fun epollCreate(size: Int): Int
    external fun epollCreate1(flags: Int): Int
    external fun epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int
    external fun epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun psetBindLwp(pset: Long, id: Long, pid: Int, opset: Long): Int
    external fun psetGetloadavg(pset: Long, load: Long, num: Int): Int
    external fun pthreadAttrGetNp(thread: Long, attr: Long): Int
    external fun pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int
    external fun pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun getpagesizes2(pagesize: Long, nelem: Int): Int
    external fun posixSpawnFileActionsAddfchdirNp(fileActions: Long, fd: Int): Int
    external fun ptsnameR(fildes: Int, name: Long, namelen: Long): Int
    external fun syncfs(fd: Int): Int
    external fun strcasecmpL(s1: String?, s2: String?, loc: Long): Int
    external fun strncasecmpL(s1: String?, s2: String?, n: Long, loc: Long): Int
    external fun timerfdCreate(clockid: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
}

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    IllumosRawLibc.eventfd(initval, flags)

public actual fun epollPwait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    IllumosRawLibc.epollPwait(epfd, events?.toLong() ?: 0L, maxevents, timeout, sigmask?.toLong() ?: 0L)

public actual fun epollCreate(size: CInt): CInt =
    IllumosRawLibc.epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    IllumosRawLibc.epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    IllumosRawLibc.epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    IllumosRawLibc.epollCtl(epfd, op, fd, event?.toLong() ?: 0L)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    IllumosRawLibc.mincore(addr, len, vec?.value ?: 0L)

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    IllumosRawLibc.psetBindLwp(pset, id, pid, opset?.toLong() ?: 0L)

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    IllumosRawLibc.psetGetloadavg(pset, load?.toLong() ?: 0L, num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    IllumosRawLibc.pthreadAttrGetNp(thread, attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    IllumosRawLibc.pthreadAttrGetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    IllumosRawLibc.pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    IllumosRawLibc.pthreadAttrSetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    IllumosRawLibc.posixFadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    IllumosRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    IllumosRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun getpagesizes2(pagesize: SizeT?, nelem: CInt): CInt =
    IllumosRawLibc.getpagesizes2(pagesize?.toLong() ?: 0L, nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    IllumosRawLibc.posixSpawnFileActionsAddfchdirNp(fileActions?.toLong() ?: 0L, fd)

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    IllumosRawLibc.ptsnameR(fildes, name?.value ?: 0L, namelen)

public actual fun syncfs(fd: CInt): CInt =
    IllumosRawLibc.syncfs(fd)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    IllumosRawLibc.strcasecmpL(s1, s2, loc)

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    IllumosRawLibc.strncasecmpL(s1, s2, n, loc)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    IllumosRawLibc.timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    IllumosRawLibc.timerfdGettime(fd, currValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    IllumosRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)
