@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

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
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_epollCreate
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_epollCreate1
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_epollCtl
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_epollPwait
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_epollWait
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_eventfd
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_getpagesizes2
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_mincore
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_posixFadvise
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_preadv
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_psetBindLwp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_psetGetloadavg
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_pthreadAttrGetNp
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_pthreadAttrGetstackaddr
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_pthreadAttrSetstack
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_pthreadAttrSetstackaddr
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_ptsnameR
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_pwritev
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_strcasecmpL
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_strncasecmpL
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_syncfs
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_timerfdCreate
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_timerfdGettime
import io.github.kotlinmania.libc.unix.solarish.illumos.cinterop.libc_unix_solarish_illumos_timerfdSettime
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libc_unix_solarish_illumos_eventfd(initval, flags)

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_epollPwait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout, sigmask?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    libc_unix_solarish_illumos_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libc_unix_solarish_illumos_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    libc_unix_solarish_illumos_epollWait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_epollCtl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_psetBindLwp(pset, id, pid, opset?.value?.toCPointer<ByteVar>())

public actual fun psetGetloadavg(pset: PsetidT, load: COpaquePointer?, num: CInt): CInt =
    libc_unix_solarish_illumos_psetGetloadavg(pset, load?.value?.toCPointer<ByteVar>(), num)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_pthreadAttrGetNp(thread.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_pthreadAttrGetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    libc_unix_solarish_illumos_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_pthreadAttrSetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    libc_unix_solarish_illumos_posixFadvise(fd, offset, len, advice)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_solarish_illumos_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_solarish_illumos_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getpagesizes2(pagesize: COpaquePointer?, nelem: CInt): CInt =
    libc_unix_solarish_illumos_getpagesizes2(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp(fileActions?.value?.toCPointer<ByteVar>(), fd)

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    libc_unix_solarish_illumos_ptsnameR(fildes, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun syncfs(fd: CInt): CInt =
    libc_unix_solarish_illumos_syncfs(fd)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    libc_unix_solarish_illumos_strcasecmpL(s1, s2, loc?.value?.toCPointer<ByteVar>())

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    libc_unix_solarish_illumos_strncasecmpL(s1, s2, n, loc?.value?.toCPointer<ByteVar>())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    libc_unix_solarish_illumos_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_solarish_illumos_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())
