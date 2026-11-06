package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt

public actual fun epollPwait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollPwait(epfd, events?.toLong() ?: 0L, maxevents, timeout, sigmask?.toLong() ?: 0L)") as CInt

public actual fun epollCreate(size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate(size)") as CInt

public actual fun epollCreate1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate1(flags)") as CInt

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)") as CInt

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCtl(epfd, op, fd, event?.toLong() ?: 0L)") as CInt

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr, len, vec?.value ?: 0L)") as CInt

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetBindLwp(pset, id, pid, opset?.toLong() ?: 0L)") as CInt

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetGetloadavg(pset, load?.toLong() ?: 0L, num)") as CInt

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetNp(thread, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)") as CInt

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advice)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun getpagesizes2(pagesize: SizeT?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesizes2(pagesize?.toLong() ?: 0L, nelem)") as CInt

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddfchdirNp(fileActions?.toLong() ?: 0L, fd)") as CInt

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fildes, name?.value ?: 0L, namelen)") as CInt

public actual fun syncfs(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncfs(fd)") as CInt

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmpL(s1, s2, loc)") as CInt

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmpL(s1, s2, n, loc)") as CInt

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clockid, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt
