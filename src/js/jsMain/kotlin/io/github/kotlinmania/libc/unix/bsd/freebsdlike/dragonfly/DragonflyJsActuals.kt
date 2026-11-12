@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeDragonflyNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CUint, file: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySetutxdb(type.toInt(), file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: SizeT): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyDevnameR(dev.toInt(), mode.toInt(), buf.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyWaitid(idtype.toInt(), id.toString(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyLwpRtprio(function, pid, lwpid, rtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr<CpuSetT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyShmget(key.toString(), size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyProcctl(idtype.toInt(), id.toString(), cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file.rawAddress.toString(), ut.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(name: ConstPtr<CChar>): Utmpx =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe, fd, pid, retval) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxSleep(ptr: ConstPtr<CInt>, value: CInt, timeout: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr.rawAddress.toString(), value, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxWakeup(ptr: ConstPtr<CInt>, count: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntvinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mntvbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp.rawAddress.toString(), mntvbufp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) (unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyReallocf(ptr.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) {
        unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyFreezero(ptr.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmVmMapEntryFirst(kvm: MutPtr<KvmT>, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm.rawAddress.toString(), map.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmVmMapEntryNext(kvm: MutPtr<KvmT>, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    if (unixBsdFreebsdlikeDragonflyNapiAddon != null) MutPtr((unixBsdFreebsdlikeDragonflyNapiAddon.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm.rawAddress.toString(), map.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
