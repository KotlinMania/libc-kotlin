@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixRedoxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSetresgid(rgid, egid, sgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSetresuid(ruid, euid, suid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): MutPtr<Group> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixRedoxNapiAddon != null) {
        unixRedoxNapiAddon.libcUnixRedoxSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixRedoxNapiAddon != null) {
        unixRedoxNapiAddon.libcUnixRedoxEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxGetgrgid(gid) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetgrgidR(gid, grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetgrouplist(user.rawAddress.toString(), group, groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(addr: ConstPtr<Sockaddr>, addrlen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetnameinfo(addr.rawAddress.toString(), addrlen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(tid: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, start: PthreadCreateStartCallback, arg: MutPtr<CVoid>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadCreate(tid.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixRedoxNapiAddon != null) {
        unixRedoxNapiAddon.libcUnixRedoxSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixRedoxNapiAddon != null) {
        unixRedoxNapiAddon.libcUnixRedoxEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetpwuidR(uid, pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadCancel(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPthreadKill(thread.rawAddress.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, sig: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSigtimedwait(set.rawAddress.toString(), sig.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(optionp: MutPtr<MutPtr<CChar>>, tokens: ConstPtr<MutPtr<CChar>>, valuep: MutPtr<MutPtr<CChar>>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetsubopt(optionp.rawAddress.toString(), tokens.rawAddress.toString(), valuep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(p: MutPtr<CVoid>, len: SizeT) {
    if (unixRedoxNapiAddon != null) {
        unixRedoxNapiAddon.libcUnixRedoxExplicitBzero(p.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxStrlcat(dst.rawAddress.toString(), src.rawAddress.toString(), siz.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxStrlcpy(dst.rawAddress.toString(), src.rawAddress.toString(), siz.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxEpollCreate(size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxEpollCreate1(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxEpollCtl(epfd, op, fd, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxShmOpen(name.rawAddress.toString(), oflag, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxCmsgData(cmsg.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxCmsgFirsthdr(mhdr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> =
    if (unixRedoxNapiAddon != null) MutPtr((unixRedoxNapiAddon.libcUnixRedoxCmsgNxthdr(mhdr.rawAddress.toString(), cmsg.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxRecvmsg(socket, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxSendmsg(socket, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(utsname: MutPtr<Utsname>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxUname(utsname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixRedoxNapiAddon != null) (unixRedoxNapiAddon.libcUnixRedoxLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
