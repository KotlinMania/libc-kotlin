@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT

private val _unixBsdFreebsdlikeDragonflyNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        _unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_setutxdb(type.toInt(), (file?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete((iocbp?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_devnameR(dev.toInt(), mode.toInt(), (buf?.value ?: 0L).toString(), len.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_waitid(idtype.toInt(), id.toString(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        _unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio(function, pid, lwpid, (rtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_statfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity(pid, cpusetsize.toString(), (mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity(pid, cpusetsize.toString(), (mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        _unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_setproctitle(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_shmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_procctl(idtype.toInt(), id.toString(), cmd, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_updwtmpx(file, (ut?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_getlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_updlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(name: String?): Utmpx =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: String?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_utmpxname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint(tpe, fd, pid, retval) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_umtxSleep((ptr?.value ?: 0L).toString(), value, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup((ptr?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_getmntinfo((mntbufp?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo((mntbufp?.value ?: 0L).toString(), (mntvbufp?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_closefrom(lowfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioError((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_reallocf((ptr?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        _unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_freezero((ptr?.value ?: 0L).toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst((kvm?.value ?: 0L).toString(), (map?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    if (_unixBsdFreebsdlikeDragonflyNapiAddon != null) (_unixBsdFreebsdlikeDragonflyNapiAddon.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext((kvm?.value ?: 0L).toString(), (map?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
