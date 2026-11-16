@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixSolarishIllumosJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixSolarishIllumosEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosEpollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosEpollCreate(size: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosEpollCreate1(flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosEpollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosEpollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPsetBindLwp(pset: Int, id: Int, pid: Int, opset: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPsetGetloadavg(pset: Int, load: Long, num: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPthreadAttrGetNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPosixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixSolarishIllumosPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixSolarishIllumosGetpagesizes2(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(fileActions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosPtsnameR(fildes: Int, name: Long, namelen: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosSyncfs(fd: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosStrcasecmpL(s1: Long, s2: Long, loc: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosStrncasecmpL(s1: Long, s2: Long, n: Long, loc: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIllumosTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
}

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEventfd(initval.toInt(), flags)

public actual fun epollPwait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt, sigmask: ConstPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEpollPwait(epfd, events.rawAddress, maxevents, timeout, sigmask.rawAddress)

public actual fun epollCreate(size: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEpollWait(epfd, events.rawAddress, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosEpollCtl(epfd, op, fd, event.rawAddress)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPsetBindLwp(pset, id, pid, opset.rawAddress)

public actual fun psetGetloadavg(pset: PsetidT, load: MutPtr, num: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPsetGetloadavg(pset, load.rawAddress, num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPthreadAttrGetNp(thread.toLong(), attr.rawAddress)

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPthreadAttrGetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPthreadAttrSetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.toLong())

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPthreadAttrSetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPosixFadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun getpagesizes2(pagesize: MutPtr, nelem: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosGetpagesizes2(pagesize.rawAddress, nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr, fd: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(fileActions.rawAddress, fd)

public actual fun ptsnameR(fildes: CInt, name: MutPtr, namelen: SizeT): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosPtsnameR(fildes, name.rawAddress, namelen.toLong())

public actual fun syncfs(fd: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosSyncfs(fd)

public actual fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosStrcasecmpL(s1.rawAddress, s2.rawAddress, loc.rawAddress)

public actual fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosStrncasecmpL(s1.rawAddress, s2.rawAddress, n.toLong(), loc.rawAddress)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixSolarishIllumosJniBridge.libcUnixSolarishIllumosTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)
