@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private val _unixHaikuNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpriority(which, who) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_setpriority(which, who, priority) as Int) else 0

public actual fun endusershell() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_endusershell()
    }
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpass(prompt) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getusershell(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getusershell() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun issetugid(): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_issetugid() as Int) else 0

public actual fun setusershell() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_setusershell()
    }
}

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_utimensat(fd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun errnop(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_errnop() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun abs(i: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_srand(seed.toInt())
    }
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else 0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_freeifaddrs((ifa?.value ?: 0L).toString())
    }
}

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_ppoll((fds?.value ?: 0L).toString(), numfds.toString(), (timeout?.value ?: 0L).toString(), (sigMask?.value ?: 0L).toString()) as Int) else 0

public actual fun getspent(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getspent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getspentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun setspent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_setspent()
    }
}

public actual fun endspent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_endspent()
    }
}

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getspnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getspnamR(name, (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun sgetspent(line: String?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sgetspent(line) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sgetspentR(line, (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_fgetspent((file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_fgetspentR((file?.handle ?: 0L).toString(), (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_mknodat(dirfd, pathname, mode.toInt(), dev) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_valloc(numBytes.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_initgroups(name, basegid.toInt()) as Int) else 0

public actual fun ioctl(fd: CInt, request: CUlong): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_waitid(idtype, id, (infop?.value ?: 0L).toString(), options) as Int) else 0

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixFadvise(fd, offset.toString(), len.toString(), advice) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_shmUnlink(name) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else 0

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_accept4(socket, (address?.value ?: 0L).toString(), (addressLength?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_writev(fd, (iov?.value ?: 0L).toString(), count) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_readv(fd, (iov?.value ?: 0L).toString(), count) as String).toLong() else 0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_execvpe(file, (argv?.value ?: 0L).toString(), (environment?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrouplist(user, basegroup.toInt(), (grouplist?.value ?: 0L).toString(), (groupcount?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getdtablesize() as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadKill(thread.toLong().toString(), sig) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semUnlink(name) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwent(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setpwent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_endpwent()
    }
}

public actual fun endgrent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgrent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_setgrent()
    }
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sethostname(name, len.toString()) as Int) else 0

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun getutxent(): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutxent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_setutxent()
    }
}

public actual fun endutxent() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_endutxent()
    }
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else 0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else 0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else 0uL

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_regfree((preg?.value ?: 0L).toString())
    }
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_msgget(key, msgflg) as Int) else 0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtype.toString(), msgflg) as String).toLong() else 0L

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) as Int) else 0

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semget(key, nsems, semflg) as Int) else 0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else 0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_ftok(pathname, projId) as Int) else 0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_lsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_lfind((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun hcreate(nelt: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_hcreate(nelt.toString()) as Int) else 0

public actual fun hdestroy() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_hdestroy()
    }
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun drand48(): CDouble =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_drand48() as Double) else 0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_erand48((xseed?.value ?: 0L).toString()) as Double) else 0.0

public actual fun lrand48(): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_lrand48() as String).toLong() else 0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mrand48(): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_mrand48() as String).toLong() else 0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun srand48(seed: CLong) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_srand48(seed.toString())
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_lcong48((p?.value ?: 0L).toString())
    }
}

public actual fun clearenv(): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_clearenv() as Int) else 0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sync() {
    if (_unixHaikuNapiAddon != null) {
        _unixHaikuNapiAddon.libc_unix_haiku_sync()
    }
}

public actual fun getpagesize(): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getpagesize() as Int) else 0

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_brk((addr?.value ?: 0L).toString()) as Int) else 0

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnFileActionsInit((fileActions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L).toString(), fildes, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L).toString(), fildes) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L).toString(), fildes, newfildes) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), pgroup) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else 0

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_strcasecmpL(string1, string2, locale.toLong().toString()) as Int) else 0

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_strncasecmpL(string1, string2, length.toString(), locale.toLong().toString()) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_memmem((source?.value ?: 0L).toString(), sourceLength.toString(), (search?.value ?: 0L).toString(), searchLength.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadGetattrNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadGetnameNp(thread.toLong().toString(), (buffer?.value ?: 0L).toString(), length.toString()) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixHaikuNapiAddon != null) (_unixHaikuNapiAddon.libc_unix_haiku_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else 0
