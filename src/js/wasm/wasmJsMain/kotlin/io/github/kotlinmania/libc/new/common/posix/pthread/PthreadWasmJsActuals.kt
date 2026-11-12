@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched.SchedParam
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadRwlockattrT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierattrT
import io.github.kotlinmania.libc.new.qurt.PthreadSpinlockT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewCommonPosixPthreadNapiAddon(): Boolean

private val newCommonPosixPthreadNapiAvailable: Boolean = initNewCommonPosixPthreadNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrGetinheritsched(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrGetinheritsched(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrGetschedparam(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrSetinheritsched(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrSetinheritsched(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrSetschedparam(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadAttrSetstack(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierDestroy(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierWait(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierattrDestroy(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierattrInit(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCancel(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcNewCommonPosixPthreadPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadKill(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexConsistent(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrGetprotocol(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrGetrobust(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadMutexattrSetrobust(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadOnce(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSetschedprio(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSpinDestroy(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSpinDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSpinInit(p0, p1)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSpinLock(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSpinTrylock(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewCommonPosixPthreadPthreadSpinUnlock(p0)")
private external fun wasmLibcNewCommonPosixPthreadPthreadSpinUnlock(p0: String): Int

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr.rawAddress.toString(), inheritsched.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexConsistent(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr.rawAddress.toString(), robustness.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr.rawAddress.toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadAtforkPrepareCallback): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadOnce(control.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (newCommonPosixPthreadNapiAvailable) wasmLibcNewCommonPosixPthreadPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
