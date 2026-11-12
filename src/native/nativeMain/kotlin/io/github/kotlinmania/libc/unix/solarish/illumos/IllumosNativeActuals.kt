@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.Itimerspec
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEpollCreate
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEpollCreate1
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEpollCtl
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEpollPwait
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEpollWait
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosEventfd
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosGetpagesizes2
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosMincore
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPosixFadvise
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPreadv
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPsetBindLwp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPsetGetloadavg
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPthreadAttrGetNp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPthreadAttrGetstackaddr
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPthreadAttrSetstack
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPthreadAttrSetstackaddr
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPtsnameR
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosPwritev
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosStrcasecmpL
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosStrncasecmpL
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosSyncfs
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosTimerfdCreate
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosTimerfdGettime
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libcUnixSolarishIllumosTimerfdSettime
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcUnixSolarishIllumosEventfd(initval, flags)

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixSolarishIllumosEpollPwait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout, sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    libcUnixSolarishIllumosEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libcUnixSolarishIllumosEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    libcUnixSolarishIllumosEpollWait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    libcUnixSolarishIllumosEpollCtl(epfd, op, fd, event.rawAddress.toCPointer<ByteVar>())

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    libcUnixSolarishIllumosMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr<PsetidT>): CInt =
    libcUnixSolarishIllumosPsetBindLwp(pset, id, pid, opset.rawAddress.toCPointer<ByteVar>())

public actual fun psetGetloadavg(pset: PsetidT, load: MutPtr<CDouble>, num: CInt): CInt =
    libcUnixSolarishIllumosPsetGetloadavg(pset, load.rawAddress.toCPointer<ByteVar>(), num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixSolarishIllumosPthreadAttrGetNp(thread.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixSolarishIllumosPthreadAttrGetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    libcUnixSolarishIllumosPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    libcUnixSolarishIllumosPthreadAttrSetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    libcUnixSolarishIllumosPosixFadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixSolarishIllumosPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixSolarishIllumosPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getpagesizes2(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    libcUnixSolarishIllumosGetpagesizes2(pagesize.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(fileActions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun ptsnameR(fildes: CInt, name: MutPtr<CChar>, namelen: SizeT): CInt =
    libcUnixSolarishIllumosPtsnameR(fildes, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun syncfs(fd: CInt): CInt =
    libcUnixSolarishIllumosSyncfs(fd)

public actual fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt =
    libcUnixSolarishIllumosStrcasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), loc.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt =
    libcUnixSolarishIllumosStrncasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n, loc.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    libcUnixSolarishIllumosTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixSolarishIllumosTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixSolarishIllumosTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())
