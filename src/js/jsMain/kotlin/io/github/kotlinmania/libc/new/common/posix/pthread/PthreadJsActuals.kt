@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newCommonPosixPthreadNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr, inheritsched: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr.rawAddress.toString(), inheritsched.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexConsistent(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr.rawAddress.toString(), robustness.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr.rawAddress.toString(), robustness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: MutPtr, routine: PthreadAtforkPrepareCallback): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadOnce(control.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSetschedprio(native.toLong().toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (newCommonPosixPthreadNapiAddon != null) (newCommonPosixPthreadNapiAddon.libcNewCommonPosixPthreadPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
