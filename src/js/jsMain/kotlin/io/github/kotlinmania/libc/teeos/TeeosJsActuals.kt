@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

private val _teeosNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_alignedAlloc(align.toString(), len.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_teeosNapiAddon != null) {
        _teeosNapiAddon.libc_teeos_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_teeosNapiAddon != null) {
        _teeosNapiAddon.libc_teeos_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrSettee((attr?.value ?: 0L).toString(), ca, taskId, shadow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_schedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadGetspecific(key.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robustness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSetschedprio(native.toLong().toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadOnce((pot?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadEqual(p1.toLong().toString(), p2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadMutexattrSetprotocol((a?.value ?: 0L).toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stack?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadSetaffinityNp(td.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pthreadGetaffinityNp(td.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_printf(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_scanf(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_snprintf((s?.value ?: 0L).toString(), n.toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_sprintf((s?.value ?: 0L).toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_vsnprintf((s?.value ?: 0L).toString(), n.toString(), fmt, (ap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_vsprintf((s?.value ?: 0L).toString(), fmt, (ap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abort(): Nothing {
    if (_teeosNapiAddon != null) {
        _teeosNapiAddon.libc_teeos_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_sysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_munmap((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(e: CInt): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strerror(e) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_clockGettime(clockId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_getpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_gettimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strftime((restrict?.value ?: 0L).toString(), sz.toString(), restrict_2, (restrict_3?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(t: COpaquePointer?): TimeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_time((t?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semClose((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semDestroy((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semGetvalue((sem?.value ?: 0L).toString(), (valp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semOpen(name, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semPost((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_semWait((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_setlocale(cat, name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(l: String?, r: String?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strcoll(l, r) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strxfrm((dest?.value ?: 0L).toString(), src, n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strtod(s, (p?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_mbrtowc((wc?.value ?: 0L).toString(), src, n.toString(), (st?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wcrtomb((s?.value ?: 0L).toString(), wc.toInt(), (st?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctob(c: WintT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wctob(c.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(seed: CUint) {
    if (_teeosNapiAddon != null) {
        _teeosNapiAddon.libc_teeos_srandom(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_initstate(seed.toInt(), (state?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_setstate((state?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_random() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strchr(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strlen(cs) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(l: String?, r: String?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strcmp(l, r) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strcpy((dest?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strncmp(l, r, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strncpy((dest?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strnlen(cs, n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strrchr(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strstr(h, n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wcschr((s?.value ?: 0L).toString(), c.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(s: COpaquePointer?): SizeT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wcslen((s?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_isalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isascii(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_isascii(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_isdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_islower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_isprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_isspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_iswctype(wc.toInt(), ttype.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswdigit(wc: WintT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_iswdigit(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswlower(wc: WintT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_iswlower(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswspace(wc: WintT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_iswspace(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswupper(wc: WintT): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_iswupper(wc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towupper(wc: WintT): WintT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_towupper(wc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towlower(wc: WintT): WintT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_towlower(wc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atan(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_atan(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceil(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_ceil(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceilf(x: CFloat): CFloat =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_ceilf(x.toDouble()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exp(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_exp(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fabs(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_fabs(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floor(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_floor(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_frexp(x, (e?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_log(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log2(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_log2(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_pow(x, y) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundf(x: CFloat): CFloat =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_roundf(x.toDouble()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_scalbn(x, n) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sqrt(x: CDouble): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_sqrt(x) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(x: CInt): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_abs(x) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: String?): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_atof(s) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_atoi(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_atol(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_atoll(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), nel.toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_ecvt(x, n, (dp?.value ?: 0L).toString(), (sign?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_imaxabs(a.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(a: CLonglong): CLonglong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_llabs(a.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    if (_teeosNapiAddon != null) {
        _teeosNapiAddon.libc_teeos_qsort((base?.value ?: 0L).toString(), nel.toString(), width.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strtoul(s, (p?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_strtol(s, (p?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    if (_teeosNapiAddon != null) (_teeosNapiAddon.libc_teeos_wcstod((s?.value ?: 0L).toString(), (p?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")
