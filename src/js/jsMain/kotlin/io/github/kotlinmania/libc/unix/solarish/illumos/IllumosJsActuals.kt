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

private val _unixSolarishIllumosNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_eventfd(initval.toInt(), flags) as Int) else 0

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_epollPwait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout, (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun epollCreate(size: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_epollCreate(size) as Int) else 0

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_epollCreate1(flags) as Int) else 0

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) as Int) else 0

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else 0

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_psetBindLwp(pset, id, pid, (opset?.value ?: 0L).toString()) as Int) else 0

public actual fun psetGetloadavg(pset: PsetidT, load: COpaquePointer?, num: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_psetGetloadavg(pset, (load?.value ?: 0L).toString(), num) as Int) else 0

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_pthreadAttrGetNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_pthreadAttrGetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) as Int) else 0

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_pthreadAttrSetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_posixFadvise(fd, offset.toString(), len.toString(), advice) as Int) else 0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun getpagesizes2(pagesize: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_getpagesizes2((pagesize?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: COpaquePointer?, fd: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp((fileActions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_ptsnameR(fildes, (name?.value ?: 0L).toString(), namelen.toString()) as Int) else 0

public actual fun syncfs(fd: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_syncfs(fd) as Int) else 0

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_strcasecmpL(s1, s2, loc.toLong().toString()) as Int) else 0

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_strncasecmpL(s1, s2, n.toString(), loc.toLong().toString()) as Int) else 0

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_timerfdCreate(clockid, flags) as Int) else 0

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAddon != null) (_unixSolarishIllumosNapiAddon.libc_unix_solarish_illumos_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0
