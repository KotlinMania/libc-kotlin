@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixSolarishNapiAddon(): Boolean

private val _unixSolarishNapiAvailable: Boolean = _initUnixSolarishNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_solarish_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_solarish_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_semDestroy(p0)")
private external fun _wasm_libc_unix_solarish_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_abs(p0)")
private external fun _wasm_libc_unix_solarish_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_acct(p0)")
private external fun _wasm_libc_unix_solarish_acct(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_dirfd(p0)")
private external fun _wasm_libc_unix_solarish_dirfd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_labs(p0)")
private external fun _wasm_libc_unix_solarish_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_rand()")
private external fun _wasm_libc_unix_solarish_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_srand(p0)")
private external fun _wasm_libc_unix_solarish_srand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getentropy(p0, p1)")
private external fun _wasm_libc_unix_solarish_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_solarish_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_solarish_settimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getifaddrs(p0)")
private external fun _wasm_libc_unix_solarish_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_freeifaddrs(p0)")
private external fun _wasm_libc_unix_solarish_freeifaddrs(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_stackGetbounds(p0)")
private external fun _wasm_libc_unix_solarish_stackGetbounds(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_initgroups(p0, p1)")
private external fun _wasm_libc_unix_solarish_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_setgroups(p0, p1)")
private external fun _wasm_libc_unix_solarish_setgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_solarish_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_solarish_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_errno()")
private external fun _wasm_libc_unix_solarish_errno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_solarish_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_solarish_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_solarish_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_solarish_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_solarish_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_setpwent()")
private external fun _wasm_libc_unix_solarish_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_endpwent()")
private external fun _wasm_libc_unix_solarish_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getpwent()")
private external fun _wasm_libc_unix_solarish_getpwent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_fdatasync(p0)")
private external fun _wasm_libc_unix_solarish_fdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_unix_solarish_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_duplocale(p0)")
private external fun _wasm_libc_unix_solarish_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_freelocale(p0)")
private external fun _wasm_libc_unix_solarish_freelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_uselocale(p0)")
private external fun _wasm_libc_unix_solarish_uselocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getprogname()")
private external fun _wasm_libc_unix_solarish_getprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_setprogname(p0)")
private external fun _wasm_libc_unix_solarish_setprogname(p0: String?)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_solarish_getloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getpriority(p0, p1)")
private external fun _wasm_libc_unix_solarish_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_mknodat(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_sethostname(p0, p1)")
private external fun _wasm_libc_unix_solarish_sethostname(p0: String?, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_ifNameindex()")
private external fun _wasm_libc_unix_solarish_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ifFreenameindex(p0)")
private external fun _wasm_libc_unix_solarish_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_solarish_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_solarish_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_solarish_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_solarish_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_solarish_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_globfree(p0)")
private external fun _wasm_libc_unix_solarish_globfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_solarish_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_solarish_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddchdir(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddchdir(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddchdirNp(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnFileActionsAddfchdir(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnFileActionsAddfchdir(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetsigignoreNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetsigignoreNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetsigignoreNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetsigignoreNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_solarish_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_shmat(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_shmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_shmctl(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_shmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_shmdt(p0)")
private external fun _wasm_libc_unix_solarish_shmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_shmget(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_shmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_shmUnlink(p0)")
private external fun _wasm_libc_unix_solarish_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_seekdir(p0, p1)")
private external fun _wasm_libc_unix_solarish_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_telldir(p0)")
private external fun _wasm_libc_unix_solarish_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_memalign(p0, p1)")
private external fun _wasm_libc_unix_solarish_memalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_solarish_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_solarish_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_solarish_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_futimesat(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_futimesat(p0: Int, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_futimens(p0, p1)")
private external fun _wasm_libc_unix_solarish_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_nlLanginfo(p0)")
private external fun _wasm_libc_unix_solarish_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_solarish_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_solarish_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_mqClose(p0)")
private external fun _wasm_libc_unix_solarish_mqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_mqUnlink(p0)")
private external fun _wasm_libc_unix_solarish_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_solarish_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_portCreate()")
private external fun _wasm_libc_unix_solarish_portCreate(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_portAssociate(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_portAssociate(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_portDissociate(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_portDissociate(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_portGet(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_portGet(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_portGetn(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_portGetn(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_portSend(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_portSend(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_portSendn(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_portSendn(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_solarish_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_sigsuspend(p0)")
private external fun _wasm_libc_unix_solarish_sigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_semClose(p0)")
private external fun _wasm_libc_unix_solarish_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getdtablesize()")
private external fun _wasm_libc_unix_solarish_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_thrSelf()")
private external fun _wasm_libc_unix_solarish_thrSelf(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_solarish_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_solarish_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getgrnam(p0)")
private external fun _wasm_libc_unix_solarish_getgrnam(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_solarish_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_solarish_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_solarish_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_solarish_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_solarish_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_solarish_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_semUnlink(p0)")
private external fun _wasm_libc_unix_solarish_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_daemon(p0, p1)")
private external fun _wasm_libc_unix_solarish_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_nativeGetpwentR(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_nativeGetpwentR(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_nativeGetgrentR(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_nativeGetgrentR(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_sigwait(p0, p1)")
private external fun _wasm_libc_unix_solarish_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getgrgid(p0)")
private external fun _wasm_libc_unix_solarish_getgrgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_setgrent()")
private external fun _wasm_libc_unix_solarish_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_endgrent()")
private external fun _wasm_libc_unix_solarish_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getgrent()")
private external fun _wasm_libc_unix_solarish_getgrent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_popen(p0, p1)")
private external fun _wasm_libc_unix_solarish_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_uname(p0)")
private external fun _wasm_libc_unix_solarish_uname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pipe2(p0, p1)")
private external fun _wasm_libc_unix_solarish_pipe2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_makeutx(p0)")
private external fun _wasm_libc_unix_solarish_makeutx(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_modutx(p0)")
private external fun _wasm_libc_unix_solarish_modutx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_updwtmpx(p0, p1)")
private external fun _wasm_libc_unix_solarish_updwtmpx(p0: String?, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_utmpxname(p0)")
private external fun _wasm_libc_unix_solarish_utmpxname(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getutxent()")
private external fun _wasm_libc_unix_solarish_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getutxid(p0)")
private external fun _wasm_libc_unix_solarish_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getutxline(p0)")
private external fun _wasm_libc_unix_solarish_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_pututxline(p0)")
private external fun _wasm_libc_unix_solarish_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_setutxent()")
private external fun _wasm_libc_unix_solarish_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_endutxent()")
private external fun _wasm_libc_unix_solarish_endutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_endutent()")
private external fun _wasm_libc_unix_solarish_endutent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getutent()")
private external fun _wasm_libc_unix_solarish_getutent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getutid(p0)")
private external fun _wasm_libc_unix_solarish_getutid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getutline(p0)")
private external fun _wasm_libc_unix_solarish_getutline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_pututline(p0)")
private external fun _wasm_libc_unix_solarish_pututline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_setutent()")
private external fun _wasm_libc_unix_solarish_setutent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_utmpname(p0)")
private external fun _wasm_libc_unix_solarish_utmpname(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getutmp(p0, p1)")
private external fun _wasm_libc_unix_solarish_getutmp(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getutmpx(p0, p1)")
private external fun _wasm_libc_unix_solarish_getutmpx(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_updwtmp(p0, p1)")
private external fun _wasm_libc_unix_solarish_updwtmp(p0: String?, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ntpAdjtime(p0)")
private external fun _wasm_libc_unix_solarish_ntpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ntpGettime(p0)")
private external fun _wasm_libc_unix_solarish_ntpGettime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_timerCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_timerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_timerDelete(p0)")
private external fun _wasm_libc_unix_solarish_timerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_timerGetoverrun(p0)")
private external fun _wasm_libc_unix_solarish_timerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_timerGettime(p0, p1)")
private external fun _wasm_libc_unix_solarish_timerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_timerSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_timerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGet(p0)")
private external fun _wasm_libc_unix_solarish_ucredGet(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getpeerucred(p0, p1)")
private external fun _wasm_libc_unix_solarish_getpeerucred(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredFree(p0)")
private external fun _wasm_libc_unix_solarish_ucredFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGeteuid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGeteuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetruid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetruid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetsuid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetsuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetegid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetegid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetrgid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetrgid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetsgid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetsgid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetgroups(p0, p1)")
private external fun _wasm_libc_unix_solarish_ucredGetgroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetpid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetpid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetprojid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetprojid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetzoneid(p0)")
private external fun _wasm_libc_unix_solarish_ucredGetzoneid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_ucredGetpflags(p0, p1)")
private external fun _wasm_libc_unix_solarish_ucredGetpflags(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_ucredSize()")
private external fun _wasm_libc_unix_solarish_ucredSize(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_psetCreate(p0)")
private external fun _wasm_libc_unix_solarish_psetCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_psetDestroy(p0)")
private external fun _wasm_libc_unix_solarish_psetDestroy(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_psetAssign(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_psetAssign(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_psetInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_psetInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_psetBind(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_psetBind(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_psetList(p0, p1)")
private external fun _wasm_libc_unix_solarish_psetList(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_psetSetattr(p0, p1)")
private external fun _wasm_libc_unix_solarish_psetSetattr(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_psetGetattr(p0, p1)")
private external fun _wasm_libc_unix_solarish_psetGetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_processorBind(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_processorBind(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_pOnline(p0, p1)")
private external fun _wasm_libc_unix_solarish_pOnline(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_processorInfo(p0, p1)")
private external fun _wasm_libc_unix_solarish_processorInfo(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getexecname()")
private external fun _wasm_libc_unix_solarish_getexecname(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_gethostid()")
private external fun _wasm_libc_unix_solarish_gethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_getpflags(p0)")
private external fun _wasm_libc_unix_solarish_getpflags(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_setpflags(p0, p1)")
private external fun _wasm_libc_unix_solarish_setpflags(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_sysinfo(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_sysinfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_solarish_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_getpagesize()")
private external fun _wasm_libc_unix_solarish_getpagesize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getpagesizes(p0, p1)")
private external fun _wasm_libc_unix_solarish_getpagesizes(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_mmapobj(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_mmapobj(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_solarish_meminfo(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_solarish_meminfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_strsep(p0, p1)")
private external fun _wasm_libc_unix_solarish_strsep(p0: String, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_getisax(p0, p1)")
private external fun _wasm_libc_unix_solarish_getisax(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_backtrace(p0, p1)")
private external fun _wasm_libc_unix_solarish_backtrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_backtraceSymbols(p0, p1)")
private external fun _wasm_libc_unix_solarish_backtraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_backtraceSymbolsFd(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_backtraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_sync()")
private external fun _wasm_libc_unix_solarish_sync()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_solarish_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_aioError(p0)")
private external fun _wasm_libc_unix_solarish_aioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_solarish_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_aioRead(p0)")
private external fun _wasm_libc_unix_solarish_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_aioReturn(p0)")
private external fun _wasm_libc_unix_solarish_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_aioWaitn(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_aioWaitn(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_aioWrite(p0)")
private external fun _wasm_libc_unix_solarish_aioWrite(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_major(p0, p1)")
private external fun _wasm_libc_unix_solarish_major(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_minor(p0, p1)")
private external fun _wasm_libc_unix_solarish_minor(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_makedev(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_makedev(p0: Int, p1: Int, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_solarish_arc4random()")
private external fun _wasm_libc_unix_solarish_arc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_solarish_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_arc4randomUniform(p0)")
private external fun _wasm_libc_unix_solarish_arc4randomUniform(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_secureGetenv(p0)")
private external fun _wasm_libc_unix_solarish_secureGetenv(p0: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_strftimeL(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_strftimeL(p0: String, p1: String, p2: String?, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_sendfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_sendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_sendfilev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_sendfilev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpInit(p0)")
private external fun _wasm_libc_unix_solarish_lgrpInit(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpFini(p0)")
private external fun _wasm_libc_unix_solarish_lgrpFini(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpAffinityGet(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_lgrpAffinityGet(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpAffinitySet(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_lgrpAffinitySet(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpCpus(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_lgrpCpus(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpMemSize(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_lgrpMemSize(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpNlgrps(p0)")
private external fun _wasm_libc_unix_solarish_lgrpNlgrps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpView(p0)")
private external fun _wasm_libc_unix_solarish_lgrpView(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpHome(p0, p1)")
private external fun _wasm_libc_unix_solarish_lgrpHome(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpVersion(p0)")
private external fun _wasm_libc_unix_solarish_lgrpVersion(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpResources(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_lgrpResources(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_lgrpRoot(p0)")
private external fun _wasm_libc_unix_solarish_lgrpRoot(p0: String): Int

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_acct(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getrandom((bbuf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_settimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stackGetbounds(sp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_stackGetbounds((sp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_initgroups(name, basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_setgroups(ngroups, (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ioctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_errno().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getprogname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: String?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_setprogname(name)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_setpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sethostname(name, len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadGetnameNp(tid.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadSetnameNp(tid.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_waitid(idtype.toInt(), id, (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsInit((fileActions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L).toString(), fildes, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L).toString(), fildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L).toString(), fildes, newfildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddclosefromNp((fileActions?.value ?: 0L).toString(), lowfiledes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddchdir((fileActions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddchdirNp((fileActions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnFileActionsAddfchdir((fileActions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), pgroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetsigignoreNp((attr?.value ?: 0L).toString(), (sigignore?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetsigignoreNp((attr?.value ?: 0L).toString(), (sigignore?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmdt((shmaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_futimesat(fd, path, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(dirfd: CInt, times: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_futimens(dirfd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_accept4(fd, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqClose((mqd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqReceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqTimedreceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqSend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqTimedsend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqGetattr((mqd?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mqSetattr((mqd?.value ?: 0L).toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCreate(): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portCreate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portAssociate(port, source, obj.toString(), events, (user?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portDissociate(port, source, obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portGet(port, (pe?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portGetn(port, (peList?.value ?: 0L).toString(), max.toInt(), (nget?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portSend(port, events, (user?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_portSendn((portList?.value ?: 0L).toString(), (errorList?.value ?: 0L).toString(), nent.toInt(), events, (user?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_thrSelf().toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_nativeGetpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_nativeGetgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_dup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeutx(ux: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_makeutx((ux?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modutx(ux: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_modutx((ux?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: String?, ut: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_updwtmpx(file, (ut?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_endutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutid((u?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getutline((u?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pututline((u?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_setutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpname(file: String?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_utmpname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_getutmp((ux?.value ?: 0L).toString(), (u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_getutmpx((u?.value ?: 0L).toString(), (ux?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_updwtmp(file, (u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ntpAdjtime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ntpGettime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_timerCreate(clockId, (evp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_timerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_timerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_timerGettime(timerid.toLong().toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_timerSettime(timerid.toLong().toString(), flags, (value?.value ?: 0L).toString(), (ovalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGet(pid: PidT): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGet(pid).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpeerucred(fd, (ucred?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredFree(ucred: COpaquePointer?) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_ucredFree((ucred?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucredGeteuid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGeteuid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetruid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetruid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsuid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetsuid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetegid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetegid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetrgid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetrgid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsgid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetsgid((ucred?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetgroups((ucred?.value ?: 0L).toString(), (groups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpid(ucred: COpaquePointer?): PidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetpid((ucred?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetprojid(ucred: COpaquePointer?): ProjidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetprojid((ucred?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetzoneid((ucred?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredGetpflags((ucred?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredSize(): SizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_ucredSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetCreate(newpset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetCreate((newpset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetDestroy(pset: PsetidT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetDestroy(pset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetAssign(pset, cpu, (opset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetInfo(pset, (tpe?.value ?: 0L).toString(), (numcpus?.value ?: 0L).toString(), (cpulist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetBind(pset, idtype.toInt(), id, (opset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetList((pset?.value ?: 0L).toString(), (numpsets?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetSetattr(pset, attr.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_psetGetattr(pset, (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_processorBind(idtype.toInt(), id, newBinding, (oldBinding?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_pOnline(processorid, flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_processorInfo(processorid, (infop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getexecname(): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getexecname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpflags(flags: CUint): CUint =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpflags(flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_setpflags(flags.toInt(), value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sysinfo(command, (buf?.value ?: 0L).toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_faccessat(fd, path, amode, flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getpagesizes((pagesize?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_mmapobj(fd, flags.toInt(), (storage?.value ?: 0L).toString(), (elements?.value ?: 0L).toString(), (arg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_meminfo((inaddr?.value ?: 0L).toString(), addrCount, (infoReq?.value ?: 0L).toString(), infoCount, (outdata?.value ?: 0L).toString(), (validity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_strsep((string?.value ?: 0L).toString(), delim).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getisax(array: COpaquePointer?, n: CUint): CUint =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getisax((array?.value ?: 0L).toString(), n.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_backtrace((buffer?.value ?: 0L).toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_backtraceSymbols((buffer?.value ?: 0L).toString(), size).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_backtraceSymbolsFd((buffer?.value ?: 0L).toString(), size, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioFsync(op, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioReturn((aiocbp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioWaitn((aiocbList?.value ?: 0L).toString(), nent.toInt(), (nwait?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_aioWrite((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun major(version: CInt, devnum: DevT): MajorT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_major(version, devnum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_minor(version, devnum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_makedev(version, majdev.toInt(), mindev.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    if (_unixSolarishNapiAvailable) {
        _wasm_libc_unix_solarish_arc4randomBuf((buf?.value ?: 0L).toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_arc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secureGetenv(name: String?): COpaquePointer? =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_secureGetenv(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_strftime((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_strftimeL((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString(), (loc?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sendfile(outFd, inFd, (off?.value ?: 0L).toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_sendfilev(fildes, (vec?.value ?: 0L).toString(), sfvcnt, (xferred?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpInit(view.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpFini(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpAffinityGet(idtype.toInt(), id, lgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpAffinitySet(idtype.toInt(), id, lgrp, aff) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpCpus(cookie.toString(), lgrp, (cpuids?.value ?: 0L).toString(), count.toInt(), content.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpMemSize(cookie.toString(), lgrp, tpe.toInt(), content.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpNlgrps(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpView(cookie.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpHome(idtype.toInt(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpVersion(version: CInt): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpVersion(version) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpResources(cookie.toString(), lgrp, (lgrps?.value ?: 0L).toString(), count.toInt(), tpe) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    if (_unixSolarishNapiAvailable) _wasm_libc_unix_solarish_lgrpRoot(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
