@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT

private val _unixBsdNetbsdlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent() {
    if (_unixBsdNetbsdlikeNapiAddon != null) {
        _unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_semDestroy((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_daemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_shmOpen(name, oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_fdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_loginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_getpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_setpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_mknodat(dirfd, pathname, mode.toInt(), dev) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_sethostname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (ts?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_initgroups(name, basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_setdomainname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_shmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_waitid(idtype, id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_gethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_sethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: String?, id: CInt): KeyT =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_ftok(path, id) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_sendmmsg(sockfd, (mmsg?.value ?: 0L).toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_recvmmsg(sockfd, (mmsg?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAddon != null) (_unixBsdNetbsdlikeNapiAddon.libc_unix_bsd_netbsdlike_closefrom(lowfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
