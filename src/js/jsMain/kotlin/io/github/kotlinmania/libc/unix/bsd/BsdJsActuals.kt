@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.GlobT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadAttrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Tm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSetgroups(ngroups, ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlogin(name: ConstPtr<CChar>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSetlogin(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdKqueue() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmount(target: ConstPtr<CChar>, arg: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdUnmount(target.rawAddress.toString(), arg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSyscall(num, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr<CChar> =
    if (unixBsdNapiAddon != null) ConstPtr((unixBsdNapiAddon.libcUnixBsdGetprogname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: ConstPtr<CChar>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSetprogname(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdFutimes(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetitimer(which, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdArc4randomBuf(buf.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(l: UInt): UInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdArc4randomUniform(l.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixBsdNapiAddon != null) {
        unixBsdNapiAddon.libcUnixBsdLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdStrftime(buf.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, locale: LocaleT): SizeT =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdStrftimeL(buf.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString(), locale.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devname(dev: DevT, modeT: ModeT): MutPtr<CChar> =
    if (unixBsdNapiAddon != null) MutPtr((unixBsdNapiAddon.libcUnixBsdDevname(dev, modeT.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (unixBsdNapiAddon != null) (unixBsdNapiAddon.libcUnixBsdIssetugid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
