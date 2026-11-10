@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private val _unixNtoNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

private var _ffi_static_SYSPAGE_PTR: COpaquePointer? = null
public actual var SYSPAGE_PTR: COpaquePointer?
    get() = _ffi_static_SYSPAGE_PTR
    set(value) {
        _ffi_static_SYSPAGE_PTR = value
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt()) as Int) else 0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_fdatasync(fd) as Int) else 0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpriority(which, who) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_setpriority(which, who, prio) as Int) else 0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mknodat(fd, pathname, mode.toInt(), dev.toInt()) as Int) else 0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun clearenv(): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clearenv() as Int) else 0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_waitid(idtype.toInt(), id, (infop?.value ?: 0L).toString(), options) as Int) else 0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else 0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else 0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_freeifaddrs((ifa?.value ?: 0L).toString())
    }
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun loginTty(fd: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_loginTty(fd) as Int) else 0

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_srand(seed.toInt())
    }
}

public actual fun setpwent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_endpwent()
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgrent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_setgrent()
    }
}

public actual fun endgrent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setspent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_setspent()
    }
}

public actual fun endspent() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_endspent()
    }
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_ftok(pathname, projId) as Int).toUInt() else 0u

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSetschedprio(native.toLong().toString(), priority) as Int) else 0

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_ifFreenameindex((ptr?.value ?: 0L).toString())
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_shmUnlink(name) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_setdomainname(name, len.toString()) as Int) else 0

public actual fun sync() {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_sync()
    }
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun umount(target: String?, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_umount(target, flags) as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedGetPriorityMax(policy) as Int) else 0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mount(specialDevice, mountDirectory, flags, mountType, (mountData?.value ?: 0L).toString(), mountDatalen) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexConsistent((mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadBarrierWait((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedGetscheduler(pid) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else 0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sethostname(name, len.toString()) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedGetPriorityMin(policy) as Int) else 0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getdtablesize() as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_initgroups(user, group.toInt()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCancel(thread.toLong().toString()) as Int) else 0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadKill(thread.toLong().toString(), sig) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_semUnlink(name) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_daemon(nochdir, noclose) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexattrGetrobust((attr?.value ?: 0L).toString(), (robustness?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robustness) as Int) else 0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_setitimer(which, (value?.value ?: 0L).toString(), (ovalue?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_inotifyRmWatch(fd, wd) as Int) else 0

public actual fun inotifyInit(): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_inotifyInit() as Int) else 0

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_inotifyAddWatch(fd, path, mask.toInt()) as Int) else 0

public actual fun gettid(): PidT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_gettid() as Int) else 0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadGetcpuclockid(thread.toLong().toString(), (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun mallopt(param: CInt, value: Long): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mallopt(param, value.toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufsize, (result?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else 0

public actual fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_sysctl((arg0?.value ?: 0L).toString(), arg1.toInt(), (arg2?.value ?: 0L).toString(), (arg3?.value ?: 0L).toString(), (arg4?.value ?: 0L).toString(), arg5.toString()) as Int) else 0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_setrlimit(resource, (rlp?.value ?: 0L).toString()) as Int) else 0

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_lioListio(mode, (list?.value ?: 0L).toString(), nent, (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) as Int) else 0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else 0

public actual fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_regexec((preg?.value ?: 0L).toString(), str, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else 0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else 0uL

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_regfree((preg?.value ?: 0L).toString())
    }
}

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioError((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioFsync(operation, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioReturn(aiocpb: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioReturn((aiocpb?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioSuspend((list?.value ?: 0L).toString(), nent, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun aioWrite(aiocpb: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_aioWrite((aiocpb?.value ?: 0L).toString()) as Int) else 0

public actual fun mqClose(mqdes: MqdT): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqClose(mqdes.toLong().toString()) as Int) else 0

public actual fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqGetattr(mqdes.toLong().toString(), (mqstat?.value ?: 0L).toString()) as Int) else 0

public actual fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqNotify(mqdes.toLong().toString(), (notification?.value ?: 0L).toString()) as Int) else 0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqReceive(mqdes.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqSend(mqdes.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else 0

public actual fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqSetattr(mqdes.toLong().toString(), (mqstat?.value ?: 0L).toString(), (omqstat?.value ?: 0L).toString()) as Int) else 0

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqTimedreceive(mqdes.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqTimedsend(mqdes.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mqUnlink(name: String?): CInt =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_mqUnlink(name) as Int) else 0

public actual fun getErrnoPtr(): COpaquePointer? =
    if (_unixNtoNapiAddon != null) (_unixNtoNapiAddon.libc_unix_nto_getErrnoPtr() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    if (_unixNtoNapiAddon != null) {
        _unixNtoNapiAddon.libc_unix_nto_myThreadExit((valuePtr?.value ?: 0L).toString())
    }
}
