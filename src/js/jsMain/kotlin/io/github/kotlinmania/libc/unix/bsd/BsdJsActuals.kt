@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.ModeT
import io.github.kotlinmania.libc.unix.bsd.apple.NlItem

private val _unixBsdNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_srand(seed.toInt())
    }
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else 0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_freeifaddrs((ifa?.value ?: 0L).toString())
    }
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun setlogin(name: String?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_setlogin(name) as Int) else 0

public actual fun ioctl(fd: CInt, request: CUlong): CInt =
    0

public actual fun kqueue(): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_kqueue() as Int) else 0

public actual fun unmount(target: String?, arg: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_unmount(target, arg) as Int) else 0

public actual fun syscall(num: CInt): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setpwent() {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_endpwent()
    }
}

public actual fun endgrent() {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getprogname(): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getprogname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setprogname(name: String?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_setprogname(name)
    }
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_ifFreenameindex((ptr?.value ?: 0L).toString())
    }
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) as Int) else 0

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_shmUnlink(name) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_futimes(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun sync() {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_sync()
    }
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getdtablesize() as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_pthreadCancel(thread.toLong().toString()) as Int) else 0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_pthreadKill(thread.toLong().toString(), sig) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_schedGetPriorityMin(policy) as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_schedGetPriorityMax(policy) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_semUnlink(name) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun acct(filename: String?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_acct(filename) as Int) else 0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else 0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else 0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else 0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else 0uL

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_regfree((preg?.value ?: 0L).toString())
    }
}

public actual fun arc4random(): UInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_arc4randomBuf((buf?.value ?: 0L).toString(), size.toString())
    }
}

public actual fun arc4randomUniform(l: UInt): UInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_arc4randomUniform(l.toInt()) as Int).toUInt() else 0u

public actual fun drand48(): CDouble =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_drand48() as Double) else 0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_erand48((xseed?.value ?: 0L).toString()) as Double) else 0.0

public actual fun lrand48(): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_lrand48() as String).toLong() else 0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mrand48(): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_mrand48() as String).toLong() else 0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun srand48(seed: CLong) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_srand48(seed.toString())
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixBsdNapiAddon != null) {
        _unixBsdNapiAddon.libc_unix_bsd_lcong48((p?.value ?: 0L).toString())
    }
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else 0

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_strftime((buf?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_strftimeL((buf?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString(), locale.toLong().toString()) as String).toULong() else 0uL

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_devname(dev, modeT.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun issetugid(): CInt =
    if (_unixBsdNapiAddon != null) (_unixBsdNapiAddon.libc_unix_bsd_issetugid() as Int) else 0
