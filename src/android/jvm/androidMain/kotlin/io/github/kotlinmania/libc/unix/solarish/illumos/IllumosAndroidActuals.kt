@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
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

private object UnixSolarishIllumosJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_solarish_illumos_eventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_epollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_epollCreate(size: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_epollCreate1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_psetBindLwp(pset: Int, id: Int, pid: Int, opset: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_psetGetloadavg(pset: Int, load: Long, num: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_pthreadAttrGetNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_illumos_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_illumos_getpagesizes2(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp(fileActions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_ptsnameR(fildes: Int, name: Long, namelen: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_syncfs(fd: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_strcasecmpL(s1: String?, s2: String?, loc: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_strncasecmpL(s1: String?, s2: String?, n: Long, loc: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_timerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_timerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_illumos_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
}

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_eventfd(initval.toInt(), flags)

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_epollPwait(epfd, (events?.value ?: 0L), maxevents, timeout, (sigmask?.value ?: 0L))

public actual fun epollCreate(size: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_epollWait(epfd, (events?.value ?: 0L), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_epollCtl(epfd, op, fd, (event?.value ?: 0L))

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_psetBindLwp(pset, id, pid, (opset?.value ?: 0L))

public actual fun psetGetloadavg(pset: PsetidT, load: COpaquePointer?, num: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_psetGetloadavg(pset, (load?.value ?: 0L), num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_pthreadAttrGetNp(thread.toLong(), (attr?.value ?: 0L))

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_pthreadAttrGetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_pthreadAttrSetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), stacksize.toLong())

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_pthreadAttrSetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_posixFadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun getpagesizes2(pagesize: COpaquePointer?, nelem: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_getpagesizes2((pagesize?.value ?: 0L), nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: COpaquePointer?, fd: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp((fileActions?.value ?: 0L), fd)

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_ptsnameR(fildes, (name?.value ?: 0L), namelen.toLong())

public actual fun syncfs(fd: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_syncfs(fd)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_strcasecmpL(s1, s2, loc.toLong())

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_strncasecmpL(s1, s2, n.toLong(), loc.toLong())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_timerfdGettime(fd, (currValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixSolarishIllumosJniBridge.libc_unix_solarish_illumos_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))
