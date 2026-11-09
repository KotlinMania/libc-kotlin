@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

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

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    0

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    0

public actual fun epollCreate(size: CInt): CInt =
    0

public actual fun epollCreate1(flags: CInt): CInt =
    0

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    0

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    0

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    0

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: COpaquePointer?): CInt =
    0

public actual fun psetGetloadavg(pset: PsetidT, load: COpaquePointer?, num: CInt): CInt =
    0

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    0

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun getpagesizes2(pagesize: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    0

public actual fun syncfs(fd: CInt): CInt =
    0

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    0

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    0

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    0

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0
