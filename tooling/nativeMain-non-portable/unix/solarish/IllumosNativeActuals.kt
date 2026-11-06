@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_eventfd(initval, flags)

public actual fun epollPwait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_epoll_pwait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout, sigmask?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_epoll_create(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_epoll_create1(flags)

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_epoll_wait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_epoll_ctl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_mincore(addr.toInt(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pset_bind_lwp(pset.toInt(), id, pid, opset?.value?.toCPointer<ByteVar>())

public actual fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pset_getloadavg(pset.toInt(), load?.value?.toCPointer<ByteVar>(), num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pthread_attr_get_np(thread.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pthread_attr_getstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pthread_attr_setstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pthread_attr_setstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_posix_fadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getpagesizes2(pagesize: SizeT?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_getpagesizes2(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_posix_spawn_file_actions_addfchdir_np(fileActions?.value?.toCPointer<ByteVar>(), fd)

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_ptsname_r(fildes, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_syncfs(fd)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_strcasecmp_l(s1, s2, loc.toInt())

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_strncasecmp_l(s1, s2, n, loc.toInt())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_timerfd_create(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_timerfd_gettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_illumos_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())
