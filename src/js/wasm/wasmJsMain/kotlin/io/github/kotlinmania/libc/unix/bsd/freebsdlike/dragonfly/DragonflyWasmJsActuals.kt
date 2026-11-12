@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdFreebsdlikeDragonflyNapiAddon(): Boolean

private val unixBsdFreebsdlikeDragonflyNapiAvailable: Boolean = initUnixBsdFreebsdlikeDragonflyNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyErrnoLocation()")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyErrnoLocation(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySetgrent()")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySetgrent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyMprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySetutxdb(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySetutxdb(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyDevnameR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyDevnameR(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyWaitid(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyFreelocale(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyFreelocale(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyLwpRtprio(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyLwpRtprio(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyStatfs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyFstatfs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyFstatfs(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUname(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUname(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySchedGetcpu()")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySchedGetcpu(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySetproctitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySetproctitle(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyShmget(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyShmget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyShmat(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyShmdt(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyShmctl(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyProcctl(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyProcctl(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUpdwtmpx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyGetlastlogx(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyGetlastlogx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUpdlastlogx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUtmpxname(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUtmpxname(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflySysCheckpoint(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflySysCheckpoint(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUmtxSleep(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUmtxSleep(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyUmtxWakeup(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyDirname(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyBasename(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyBasename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyGetmntinfo(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyGetmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyGetmntvinfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyClosefrom(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyClosefrom(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioCancel(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioError(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioFsync(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioRead(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioReturn(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyAioWrite(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyAioWrite(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyReallocf(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyReallocf(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyFreezero(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyFreezero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(p0: String, p1: String, p2: String): String

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeDragonflySetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CUint, file: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflySetutxdb(type.toInt(), file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: SizeT): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyDevnameR(dev.toInt(), mode.toInt(), buf.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyWaitid(idtype.toInt(), id.toString(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeDragonflyFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyLwpRtprio(function, pid, lwpid, rtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr<CpuSetT>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflySchedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeDragonflySetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyShmget(key.toString(), size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyProcctl(idtype.toInt(), id.toString(), cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file.rawAddress.toString(), ut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(name: ConstPtr<CChar>): Utmpx =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe, fd, pid, retval) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxSleep(ptr: ConstPtr<CInt>, value: CInt, timeout: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr.rawAddress.toString(), value, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxWakeup(ptr: ConstPtr<CInt>, count: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntvinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mntvbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp.rawAddress.toString(), mntvbufp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) wasmLibcUnixBsdFreebsdlikeDragonflyLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyReallocf(ptr.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeDragonflyFreezero(ptr.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmVmMapEntryFirst(kvm: MutPtr<KvmT>, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm.rawAddress.toString(), map.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmVmMapEntryNext(kvm: MutPtr<KvmT>, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    if (unixBsdFreebsdlikeDragonflyNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm.rawAddress.toString(), map.rawAddress.toString(), entry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
