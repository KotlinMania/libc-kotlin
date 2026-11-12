@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val teeosNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosAlignedAlloc(align.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (teeosNapiAddon != null) {
        teeosNapiAddon.libcTeeosFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    if (teeosNapiAddon != null) {
        teeosNapiAddon.libcTeeosPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrGetstacksize(attr.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSettee(attr: MutPtr<PthreadAttrT>, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrSettee(attr.rawAddress.toString(), ca, taskId, shadow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosPthreadGetspecific(key.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSetspecific(key.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrSettype(attr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrSetrobust(attr.rawAddress.toString(), robustness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSetschedprio(native.toLong().toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(pot: MutPtr<PthreadOnceT>, f: OnceFn?): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadOnce(pot.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadEqual(p1.toLong().toString(), p2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(a: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadMutexattrSetprotocol(a.rawAddress.toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stack: MutPtr<CVoid>, size: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadAttrSetstack(attr.rawAddress.toString(), stack.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr<CpuSetT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadSetaffinityNp(td.toLong().toString(), size.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr<CpuSetT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPthreadGetaffinityNp(td.toLong().toString(), size.toString(), set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPrintf(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosScanf(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSnprintf(s.rawAddress.toString(), n.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSprintf(s.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosVsnprintf(s.rawAddress.toString(), n.toString(), fmt.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosVsprintf(s.rawAddress.toString(), fmt.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abort(): Nothing {
    if (teeosNapiAddon != null) {
        teeosNapiAddon.libcTeeosAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosMunmap(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(e: CInt): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrerror(e) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosClockGettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tv: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosGettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(restrict: MutPtr<CChar>, sz: SizeT, restrict_2: ConstPtr<CChar>, restrict_3: ConstPtr<Tm>): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrftime(restrict.rawAddress.toString(), sz.toString(), restrict_2.rawAddress.toString(), restrict_3.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(t: MutPtr<TimeT>): TimeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosTime(t.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, valp: MutPtr<CInt>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemGetvalue(sem.rawAddress.toString(), valp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosSemOpen(name.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemPost(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSemWait(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(cat: CInt, name: ConstPtr<CChar>): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosSetlocale(cat, name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrcoll(l.rawAddress.toString(), r.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrxfrm(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrtod(s.rawAddress.toString(), p.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbrtowc(wc: MutPtr<WcharT>, src: ConstPtr<CChar>, n: SizeT, st: MutPtr<MbstateT>): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosMbrtowc(wc.rawAddress.toString(), src.rawAddress.toString(), n.toString(), st.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcrtomb(s: MutPtr<CChar>, wc: WcharT, st: MutPtr<MbstateT>): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosWcrtomb(s.rawAddress.toString(), wc.toInt(), st.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctob(c: WintT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosWctob(c.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(seed: CUint) {
    if (teeosNapiAddon != null) {
        teeosNapiAddon.libcTeeosSrandom(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initstate(seed: CUint, state: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosInitstate(seed.toInt(), state.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(state: MutPtr<CChar>): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosSetstate(state.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosRandom() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrchr(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrcmp(l.rawAddress.toString(), r.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrcpy(dest.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>, n: SizeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrncmp(l.rawAddress.toString(), r.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrncpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrnlen(cs.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrrchr(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(h: ConstPtr<CChar>, n: ConstPtr<CChar>): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosStrstr(h.rawAddress.toString(), n.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcschr(s: ConstPtr<WcharT>, c: WcharT): MutPtr<WcharT> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosWcschr(s.rawAddress.toString(), c.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(s: ConstPtr<WcharT>): SizeT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosWcslen(s.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isascii(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIsascii(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIswctype(wc.toInt(), ttype.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswdigit(wc: WintT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIswdigit(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswlower(wc: WintT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIswlower(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswspace(wc: WintT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIswspace(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswupper(wc: WintT): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosIswupper(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towupper(wc: WintT): WintT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosTowupper(wc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towlower(wc: WintT): WintT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosTowlower(wc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atan(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAtan(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceil(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosCeil(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceilf(x: CFloat): CFloat =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosCeilf(x.toDouble()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exp(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosExp(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fabs(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosFabs(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floor(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosFloor(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frexp(x: CDouble, e: MutPtr<CInt>): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosFrexp(x, e.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosLog(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log2(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosLog2(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosPow(x, y) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundf(x: CFloat): CFloat =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosRoundf(x.toDouble()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosScalbn(x, n) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sqrt(x: CDouble): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosSqrt(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(x: CInt): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAbs(x) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr<CVoid> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosBsearch(key.rawAddress.toString(), base.rawAddress.toString(), nel.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr<CInt>, sign: MutPtr<CInt>): MutPtr<CChar> =
    if (teeosNapiAddon != null) MutPtr((teeosNapiAddon.libcTeeosEcvt(x, n, dp.rawAddress.toString(), sign.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosImaxabs(a.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(a: CLonglong): CLonglong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosLlabs(a.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    if (teeosNapiAddon != null) {
        teeosNapiAddon.libcTeeosQsort(base.rawAddress.toString(), nel.toString(), width.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtoul(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrtoul(s.rawAddress.toString(), p.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosStrtol(s.rawAddress.toString(), p.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstod(s: ConstPtr<WcharT>, p: MutPtr<MutPtr<WcharT>>): CDouble =
    if (teeosNapiAddon != null) (teeosNapiAddon.libcTeeosWcstod(s.rawAddress.toString(), p.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")
