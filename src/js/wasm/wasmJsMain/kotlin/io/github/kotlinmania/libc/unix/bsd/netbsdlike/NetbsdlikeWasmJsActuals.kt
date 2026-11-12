@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdNetbsdlikeNapiAddon(): Boolean

private val unixBsdNetbsdlikeNapiAvailable: Boolean = initUnixBsdNetbsdlikeNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSetgrent()")
private external fun wasmLibcUnixBsdNetbsdlikeSetgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSemDestroy(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSemInit(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeDaemon(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMincore(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeClockGetres(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeClockGettime(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeClockSettime(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeClockSettime(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeErrno()")
private external fun wasmLibcUnixBsdNetbsdlikeErrno(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMkostemp(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikePwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikePreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeFutimens(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeFdatasync(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeFdatasync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeLoginTty(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeLoginTty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeGetpriority(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSemTimedwait(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSemGetvalue(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSethostname(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeSethostname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSpinDestroy(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSpinLock(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSpinTrylock(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSpinUnlock(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikePthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePipe2(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikePpoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeInitgroups(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeGetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeSetdomainname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeUname(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeUname(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeShmget(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeShmget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeShmat(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeShmdt(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeShmctl(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrInit(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeReallocarray(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeGethostid()")
private external fun wasmLibcUnixBsdNetbsdlikeGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSethostid(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeSethostid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeFtok(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeFtok(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeDirname(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeBasename(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeBasename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeGetentropy(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeClosefrom(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeClosefrom(p0: Int): Int

public actual fun setgrent() {
    if (unixBsdNetbsdlikeNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePpoll(fds.rawAddress.toString(), nfds.toInt(), ts.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeInitgroups(name.rawAddress.toString(), basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeShmget(key.toString(), size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeWaitid(idtype, id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: ConstPtr, id: CInt): KeyT =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeFtok(path.rawAddress.toString(), id).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr): MutPtr =
    if (unixBsdNetbsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeSendmmsg(sockfd, mmsg.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeRecvmmsg(sockfd, mmsg.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (unixBsdNetbsdlikeNapiAvailable) wasmLibcUnixBsdNetbsdlikeClosefrom(lowfd) else throw UnsupportedOperationException("Native FFI addon is not available")
