@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadCondattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdNetbsdlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent() {
    if (unixBsdNetbsdlikeNapiAddon != null) {
        unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr<CInt> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeErrno() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePpoll(fds.rawAddress.toString(), nfds.toInt(), ts.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeGetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeShmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeWaitid(idtype, id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeFtok(path.rawAddress.toString(), id) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNapiAddon != null) MutPtr((unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeSendmmsg(sockfd, mmsg.rawAddress.toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeRecvmmsg(sockfd, mmsg.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAddon != null) (unixBsdNetbsdlikeNapiAddon.libcUnixBsdNetbsdlikeClosefrom(lowfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
