@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixSolarishNapiAddon(): Boolean

private val unixSolarishNapiAvailable: Boolean = initUnixSolarishNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetrlimit(p0, p1)")
private external fun wasmLibcUnixSolarishGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSetrlimit(p0, p1)")
private external fun wasmLibcUnixSolarishSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixSolarishStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSemDestroy(p0)")
private external fun wasmLibcUnixSolarishSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSemInit(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAbs(p0)")
private external fun wasmLibcUnixSolarishAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAcct(p0)")
private external fun wasmLibcUnixSolarishAcct(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishDirfd(p0)")
private external fun wasmLibcUnixSolarishDirfd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLabs(p0)")
private external fun wasmLibcUnixSolarishLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishRand()")
private external fun wasmLibcUnixSolarishRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSrand(p0)")
private external fun wasmLibcUnixSolarishSrand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetentropy(p0, p1)")
private external fun wasmLibcUnixSolarishGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixSolarishGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGettimeofday(p0, p1)")
private external fun wasmLibcUnixSolarishGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSettimeofday(p0, p1)")
private external fun wasmLibcUnixSolarishSettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetifaddrs(p0)")
private external fun wasmLibcUnixSolarishGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishFreeifaddrs(p0)")
private external fun wasmLibcUnixSolarishFreeifaddrs(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishStackGetbounds(p0)")
private external fun wasmLibcUnixSolarishStackGetbounds(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishInitgroups(p0, p1)")
private external fun wasmLibcUnixSolarishInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSetgroups(p0, p1)")
private external fun wasmLibcUnixSolarishSetgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSolarishIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSolarishIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMprotect(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishErrno()")
private external fun wasmLibcUnixSolarishErrno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishClockGetres(p0, p1)")
private external fun wasmLibcUnixSolarishClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishClockGettime(p0, p1)")
private external fun wasmLibcUnixSolarishClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishClockSettime(p0, p1)")
private external fun wasmLibcUnixSolarishClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSolarishGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSolarishGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishSetpwent()")
private external fun wasmLibcUnixSolarishSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishEndpwent()")
private external fun wasmLibcUnixSolarishEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetpwent()")
private external fun wasmLibcUnixSolarishGetpwent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishFdatasync(p0)")
private external fun wasmLibcUnixSolarishFdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixSolarishNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishDuplocale(p0)")
private external fun wasmLibcUnixSolarishDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishFreelocale(p0)")
private external fun wasmLibcUnixSolarishFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixSolarishNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUselocale(p0)")
private external fun wasmLibcUnixSolarishUselocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetprogname()")
private external fun wasmLibcUnixSolarishGetprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSetprogname(p0)")
private external fun wasmLibcUnixSolarishSetprogname(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetloadavg(p0, p1)")
private external fun wasmLibcUnixSolarishGetloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetpriority(p0, p1)")
private external fun wasmLibcUnixSolarishGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishMknodat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSethostname(p0, p1)")
private external fun wasmLibcUnixSolarishSethostname(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishIfNameindex()")
private external fun wasmLibcUnixSolarishIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishIfFreenameindex(p0)")
private external fun wasmLibcUnixSolarishIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixSolarishPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixSolarishPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSemTimedwait(p0, p1)")
private external fun wasmLibcUnixSolarishSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSemGetvalue(p0, p1)")
private external fun wasmLibcUnixSolarishSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixSolarishPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixSolarishPthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGlobfree(p0)")
private external fun wasmLibcUnixSolarishGlobfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixSolarishPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixSolarishPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddchdir(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddchdir(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddchdirNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnFileActionsAddfchdir(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnFileActionsAddfchdir(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixSolarishPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixSolarishPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetsigignoreNp(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetsigignoreNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetsigignoreNp(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetsigignoreNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixSolarishPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishShmat(p0, p1, p2)")
private external fun wasmLibcUnixSolarishShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishShmctl(p0, p1, p2)")
private external fun wasmLibcUnixSolarishShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishShmdt(p0)")
private external fun wasmLibcUnixSolarishShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishShmget(p0, p1, p2)")
private external fun wasmLibcUnixSolarishShmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixSolarishShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishShmUnlink(p0)")
private external fun wasmLibcUnixSolarishShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSeekdir(p0, p1)")
private external fun wasmLibcUnixSolarishSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishTelldir(p0)")
private external fun wasmLibcUnixSolarishTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMadvise(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMsync(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishMemalign(p0, p1)")
private external fun wasmLibcUnixSolarishMemalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixSolarishRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixSolarishRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishMkstemps(p0, p1)")
private external fun wasmLibcUnixSolarishMkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishFutimesat(p0, p1, p2)")
private external fun wasmLibcUnixSolarishFutimesat(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishFutimens(p0, p1)")
private external fun wasmLibcUnixSolarishFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishNlLanginfo(p0)")
private external fun wasmLibcUnixSolarishNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishBind(p0, p1, p2)")
private external fun wasmLibcUnixSolarishBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishWritev(p0, p1, p2)")
private external fun wasmLibcUnixSolarishWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishReadv(p0, p1, p2)")
private external fun wasmLibcUnixSolarishReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixSolarishRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSolarishMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSolarishMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishMqClose(p0)")
private external fun wasmLibcUnixSolarishMqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishMqUnlink(p0)")
private external fun wasmLibcUnixSolarishMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishMqGetattr(p0, p1)")
private external fun wasmLibcUnixSolarishMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishPortCreate()")
private external fun wasmLibcUnixSolarishPortCreate(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishPortAssociate(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishPortAssociate(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPortDissociate(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPortDissociate(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPortGet(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPortGet(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishPortGetn(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishPortGetn(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPortSend(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPortSend(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishPortSendn(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishPortSendn(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSigaltstack(p0, p1)")
private external fun wasmLibcUnixSolarishSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSigsuspend(p0)")
private external fun wasmLibcUnixSolarishSigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSemClose(p0)")
private external fun wasmLibcUnixSolarishSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetdtablesize()")
private external fun wasmLibcUnixSolarishGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishThrSelf()")
private external fun wasmLibcUnixSolarishThrSelf(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSolarishSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSolarishSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetgrnam(p0)")
private external fun wasmLibcUnixSolarishGetgrnam(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPthreadKill(p0, p1)")
private external fun wasmLibcUnixSolarishPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixSolarishSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixSolarishSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSchedGetparam(p0, p1)")
private external fun wasmLibcUnixSolarishSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSchedSetparam(p0, p1)")
private external fun wasmLibcUnixSolarishSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSchedGetscheduler(p0)")
private external fun wasmLibcUnixSolarishSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSemUnlink(p0)")
private external fun wasmLibcUnixSolarishSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishDaemon(p0, p1)")
private external fun wasmLibcUnixSolarishDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishNativeGetpwentR(p0, p1, p2)")
private external fun wasmLibcUnixSolarishNativeGetpwentR(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishNativeGetgrentR(p0, p1, p2)")
private external fun wasmLibcUnixSolarishNativeGetgrentR(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSigwait(p0, p1)")
private external fun wasmLibcUnixSolarishSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetgrgid(p0)")
private external fun wasmLibcUnixSolarishGetgrgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishSetgrent()")
private external fun wasmLibcUnixSolarishSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishEndgrent()")
private external fun wasmLibcUnixSolarishEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetgrent()")
private external fun wasmLibcUnixSolarishGetgrent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPopen(p0, p1)")
private external fun wasmLibcUnixSolarishPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishDup3(p0, p1, p2)")
private external fun wasmLibcUnixSolarishDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUname(p0)")
private external fun wasmLibcUnixSolarishUname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPipe2(p0, p1)")
private external fun wasmLibcUnixSolarishPipe2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishMakeutx(p0)")
private external fun wasmLibcUnixSolarishMakeutx(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishModutx(p0)")
private external fun wasmLibcUnixSolarishModutx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishUpdwtmpx(p0, p1)")
private external fun wasmLibcUnixSolarishUpdwtmpx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUtmpxname(p0)")
private external fun wasmLibcUnixSolarishUtmpxname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetutxent()")
private external fun wasmLibcUnixSolarishGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetutxid(p0)")
private external fun wasmLibcUnixSolarishGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetutxline(p0)")
private external fun wasmLibcUnixSolarishGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPututxline(p0)")
private external fun wasmLibcUnixSolarishPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishSetutxent()")
private external fun wasmLibcUnixSolarishSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishEndutxent()")
private external fun wasmLibcUnixSolarishEndutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishEndutent()")
private external fun wasmLibcUnixSolarishEndutent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetutent()")
private external fun wasmLibcUnixSolarishGetutent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetutid(p0)")
private external fun wasmLibcUnixSolarishGetutid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetutline(p0)")
private external fun wasmLibcUnixSolarishGetutline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPututline(p0)")
private external fun wasmLibcUnixSolarishPututline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishSetutent()")
private external fun wasmLibcUnixSolarishSetutent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUtmpname(p0)")
private external fun wasmLibcUnixSolarishUtmpname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetutmp(p0, p1)")
private external fun wasmLibcUnixSolarishGetutmp(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetutmpx(p0, p1)")
private external fun wasmLibcUnixSolarishGetutmpx(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishUpdwtmp(p0, p1)")
private external fun wasmLibcUnixSolarishUpdwtmp(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishNtpAdjtime(p0)")
private external fun wasmLibcUnixSolarishNtpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishNtpGettime(p0)")
private external fun wasmLibcUnixSolarishNtpGettime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixSolarishTimerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishTimerDelete(p0)")
private external fun wasmLibcUnixSolarishTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishTimerGetoverrun(p0)")
private external fun wasmLibcUnixSolarishTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishTimerGettime(p0, p1)")
private external fun wasmLibcUnixSolarishTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGet(p0)")
private external fun wasmLibcUnixSolarishUcredGet(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetpeerucred(p0, p1)")
private external fun wasmLibcUnixSolarishGetpeerucred(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredFree(p0)")
private external fun wasmLibcUnixSolarishUcredFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGeteuid(p0)")
private external fun wasmLibcUnixSolarishUcredGeteuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetruid(p0)")
private external fun wasmLibcUnixSolarishUcredGetruid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetsuid(p0)")
private external fun wasmLibcUnixSolarishUcredGetsuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetegid(p0)")
private external fun wasmLibcUnixSolarishUcredGetegid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetrgid(p0)")
private external fun wasmLibcUnixSolarishUcredGetrgid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetsgid(p0)")
private external fun wasmLibcUnixSolarishUcredGetsgid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetgroups(p0, p1)")
private external fun wasmLibcUnixSolarishUcredGetgroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetpid(p0)")
private external fun wasmLibcUnixSolarishUcredGetpid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetprojid(p0)")
private external fun wasmLibcUnixSolarishUcredGetprojid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetzoneid(p0)")
private external fun wasmLibcUnixSolarishUcredGetzoneid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishUcredGetpflags(p0, p1)")
private external fun wasmLibcUnixSolarishUcredGetpflags(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishUcredSize()")
private external fun wasmLibcUnixSolarishUcredSize(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPsetCreate(p0)")
private external fun wasmLibcUnixSolarishPsetCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishPsetDestroy(p0)")
private external fun wasmLibcUnixSolarishPsetDestroy(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishPsetAssign(p0, p1, p2)")
private external fun wasmLibcUnixSolarishPsetAssign(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishPsetInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishPsetInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishPsetBind(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishPsetBind(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPsetList(p0, p1)")
private external fun wasmLibcUnixSolarishPsetList(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPsetSetattr(p0, p1)")
private external fun wasmLibcUnixSolarishPsetSetattr(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPsetGetattr(p0, p1)")
private external fun wasmLibcUnixSolarishPsetGetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishProcessorBind(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishProcessorBind(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishPOnline(p0, p1)")
private external fun wasmLibcUnixSolarishPOnline(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishProcessorInfo(p0, p1)")
private external fun wasmLibcUnixSolarishProcessorInfo(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetexecname()")
private external fun wasmLibcUnixSolarishGetexecname(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGethostid()")
private external fun wasmLibcUnixSolarishGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishGetpflags(p0)")
private external fun wasmLibcUnixSolarishGetpflags(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSetpflags(p0, p1)")
private external fun wasmLibcUnixSolarishSetpflags(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSysinfo(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSysinfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixSolarishDlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishGetpagesize()")
private external fun wasmLibcUnixSolarishGetpagesize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetpagesizes(p0, p1)")
private external fun wasmLibcUnixSolarishGetpagesizes(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishMmapobj(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishMmapobj(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixSolarishMeminfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixSolarishMeminfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishStrsep(p0, p1)")
private external fun wasmLibcUnixSolarishStrsep(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishGetisax(p0, p1)")
private external fun wasmLibcUnixSolarishGetisax(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishBacktrace(p0, p1)")
private external fun wasmLibcUnixSolarishBacktrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixSolarishBacktraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixSolarishBacktraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishSync()")
private external fun wasmLibcUnixSolarishSync()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishAioCancel(p0, p1)")
private external fun wasmLibcUnixSolarishAioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAioError(p0)")
private external fun wasmLibcUnixSolarishAioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishAioFsync(p0, p1)")
private external fun wasmLibcUnixSolarishAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAioRead(p0)")
private external fun wasmLibcUnixSolarishAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAioReturn(p0)")
private external fun wasmLibcUnixSolarishAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixSolarishAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishAioWaitn(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishAioWaitn(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishAioWrite(p0)")
private external fun wasmLibcUnixSolarishAioWrite(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishMajor(p0, p1)")
private external fun wasmLibcUnixSolarishMajor(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishMinor(p0, p1)")
private external fun wasmLibcUnixSolarishMinor(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishMakedev(p0, p1, p2)")
private external fun wasmLibcUnixSolarishMakedev(p0: Int, p1: Int, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixSolarishArc4random()")
private external fun wasmLibcUnixSolarishArc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixSolarishArc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishArc4randomUniform(p0)")
private external fun wasmLibcUnixSolarishArc4randomUniform(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishSecureGetenv(p0)")
private external fun wasmLibcUnixSolarishSecureGetenv(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishStrftimeL(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishStrftimeL(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishSendfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishSendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishSendfilev(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishSendfilev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpInit(p0)")
private external fun wasmLibcUnixSolarishLgrpInit(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpFini(p0)")
private external fun wasmLibcUnixSolarishLgrpFini(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishLgrpAffinityGet(p0, p1, p2)")
private external fun wasmLibcUnixSolarishLgrpAffinityGet(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishLgrpAffinitySet(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishLgrpAffinitySet(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishLgrpCpus(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishLgrpCpus(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishLgrpMemSize(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishLgrpMemSize(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpNlgrps(p0)")
private external fun wasmLibcUnixSolarishLgrpNlgrps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpView(p0)")
private external fun wasmLibcUnixSolarishLgrpView(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishLgrpHome(p0, p1)")
private external fun wasmLibcUnixSolarishLgrpHome(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpVersion(p0)")
private external fun wasmLibcUnixSolarishLgrpVersion(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishLgrpResources(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishLgrpResources(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishLgrpRoot(p0)")
private external fun wasmLibcUnixSolarishLgrpRoot(p0: String): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(bbuf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetrandom(bbuf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stackGetbounds(sp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishStackGetbounds(sp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishInitgroups(name.rawAddress.toString(), basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (unixSolarishNapiAvailable) ConstPtr(wasmLibcUnixSolarishGetprogname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: ConstPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSetprogname(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSetpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSethostname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(tid: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadGetnameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadSetnameNp(tid.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishWaitid(idtype.toInt(), id, infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsInit(fileActions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsDestroy(fileActions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr, fildes: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddopen(fileActions.rawAddress.toString(), fildes, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr, fildes: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddclose(fileActions.rawAddress.toString(), fildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr, fildes: CInt, newfildes: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toString(), fildes, newfildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr, lowfiledes: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddclosefromNp(fileActions.rawAddress.toString(), lowfiledes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(fileActions: MutPtr, path: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddchdir(fileActions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr, path: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddchdirNp(fileActions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr, fd: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnFileActionsAddfchdir(fileActions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, pgroup: PidT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetpgroup(attr.rawAddress.toString(), pgroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, pgroup: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetpgroup(attr.rawAddress.toString(), pgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, sigdefault: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, sigdefault: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigignoreNp(attr: MutPtr, sigignore: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetsigignoreNp(attr.rawAddress.toString(), sigignore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigignoreNp(attr: ConstPtr, sigignore: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetsigignoreNp(attr.rawAddress.toString(), sigignore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, sigmask: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrSetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, sigmask: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPosixSpawnattrGetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishShmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishFutimesat(fd, path.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(dirfd: CInt, times: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishFutimens(dirfd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, address: MutPtr, addressLen: MutPtr, flags: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAccept4(fd, address.rawAddress.toString(), addressLen.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqClose(mqd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqReceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqTimedreceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqSend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqTimedsend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqGetattr(mqd.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMqSetattr(mqd.rawAddress.toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCreate(): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortCreate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortAssociate(port, source, obj.toString(), events, user.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortDissociate(port, source, obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGet(port: CInt, pe: MutPtr, timeout: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortGet(port, pe.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portGetn(port: CInt, peList: MutPtr, max: CUint, nget: MutPtr, timeout: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortGetn(port, peList.rawAddress.toString(), max.toInt(), nget.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSend(port: CInt, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortSend(port, events, user.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portSendn(portList: MutPtr, errorList: MutPtr, nent: CUint, events: CInt, user: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPortSendn(portList.rawAddress.toString(), errorList.rawAddress.toString(), nent.toInt(), events, user.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishThrSelf().toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetpwentR(pwd: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishNativeGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nativeGetgrentR(grp: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishNativeGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishDup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeutx(ux: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishMakeutx(ux.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modutx(ux: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishModutx(ux.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr, ut: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishUpdwtmpx(file.rawAddress.toString(), ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishEndutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutid(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishGetutline(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishPututline(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpname(file: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUtmpname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishGetutmp(ux.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishGetutmpx(u.rawAddress.toString(), ux.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updwtmp(file: ConstPtr, u: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishUpdwtmp(file.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishNtpAdjtime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishNtpGettime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTimerCreate(clockId, evp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTimerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTimerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTimerGettime(timerid.toLong().toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishTimerSettime(timerid.toLong().toString(), flags, value.rawAddress.toString(), ovalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGet(pid: PidT): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishUcredGet(pid).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeerucred(fd: CInt, ucred: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpeerucred(fd, ucred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredFree(ucred: MutPtr) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishUcredFree(ucred.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucredGeteuid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGeteuid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetruid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetruid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsuid(ucred: ConstPtr): UidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetsuid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetegid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetegid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetrgid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetrgid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetsgid(ucred: ConstPtr): GidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetsgid(ucred.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetgroups(ucred: ConstPtr, groups: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetgroups(ucred.rawAddress.toString(), groups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpid(ucred: ConstPtr): PidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetpid(ucred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetprojid(ucred: ConstPtr): ProjidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetprojid(ucred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetzoneid(ucred: ConstPtr): ZoneidT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetzoneid(ucred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredGetpflags(ucred: ConstPtr, flags: CUint): CUint =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredGetpflags(ucred.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucredSize(): SizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishUcredSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetCreate(newpset: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetCreate(newpset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetDestroy(pset: PsetidT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetDestroy(pset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetAssign(pset, cpu, opset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetInfo(pset: PsetidT, tpe: MutPtr, numcpus: MutPtr, cpulist: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetInfo(pset, tpe.rawAddress.toString(), numcpus.rawAddress.toString(), cpulist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetBind(pset, idtype.toInt(), id, opset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetList(pset: MutPtr, numpsets: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetList(pset.rawAddress.toString(), numpsets.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetSetattr(pset, attr.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetattr(pset: PsetidT, attr: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPsetGetattr(pset, attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishProcessorBind(idtype.toInt(), id, newBinding, oldBinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishPOnline(processorid, flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processorInfo(processorid: ProcessoridT, infop: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishProcessorInfo(processorid, infop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getexecname(): ConstPtr =
    if (unixSolarishNapiAvailable) ConstPtr(wasmLibcUnixSolarishGetexecname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpflags(flags: CUint): CUint =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpflags(flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSetpflags(flags.toInt(), value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(command: CInt, buf: MutPtr, count: CLong): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSysinfo(command, buf.rawAddress.toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(fd: CInt, path: ConstPtr, amode: CInt, flag: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishFaccessat(fd, path.rawAddress.toString(), amode, flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetpagesizes(pagesize.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr, elements: MutPtr, arg: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMmapobj(fd, flags.toInt(), storage.rawAddress.toString(), elements.rawAddress.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun meminfo(inaddr: ConstPtr, addrCount: CInt, infoReq: ConstPtr, infoCount: CInt, outdata: MutPtr, validity: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMeminfo(inaddr.rawAddress.toString(), addrCount, infoReq.rawAddress.toString(), infoCount, outdata.rawAddress.toString(), validity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delim: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishStrsep(string.rawAddress.toString(), delim.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getisax(array: MutPtr, n: CUint): CUint =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetisax(array.rawAddress.toString(), n.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buffer: MutPtr, size: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishBacktrace(buffer.rawAddress.toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: ConstPtr, size: CInt): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishBacktraceSymbols(buffer.rawAddress.toString(), size).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: ConstPtr, size: CInt, fd: CInt) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishBacktraceSymbolsFd(buffer.rawAddress.toString(), size, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitn(aiocbList: MutPtr, nent: CUint, nwait: MutPtr, timeout: ConstPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioWaitn(aiocbList.rawAddress.toString(), nent.toInt(), nwait.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun major(version: CInt, devnum: DevT): MajorT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMajor(version, devnum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMinor(version, devnum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishMakedev(version, majdev.toInt(), mindev.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, nbytes: SizeT) {
    if (unixSolarishNapiAvailable) {
        wasmLibcUnixSolarishArc4randomBuf(buf.rawAddress.toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishArc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secureGetenv(name: ConstPtr): MutPtr =
    if (unixSolarishNapiAvailable) MutPtr(wasmLibcUnixSolarishSecureGetenv(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishStrftime(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, loc: LocaleT): SizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishStrftimeL(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString(), loc.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr, len: SizeT): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSendfile(outFd, inFd, off.rawAddress.toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfilev(fildes: CInt, vec: ConstPtr, sfvcnt: CInt, xferred: MutPtr): SsizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishSendfilev(fildes, vec.rawAddress.toString(), sfvcnt, xferred.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpInit(view.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpFini(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpAffinityGet(idtype.toInt(), id, lgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpAffinitySet(idtype.toInt(), id, lgrp, aff) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr, count: CUint, content: LgrpContentT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpCpus(cookie.toString(), lgrp, cpuids.rawAddress.toString(), count.toInt(), content.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpMemSize(cookie.toString(), lgrp, tpe.toInt(), content.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpNlgrps(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpView(cookie.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpHome(idtype.toInt(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpVersion(version: CInt): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpVersion(version) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr, count: CUint, tpe: LgrpRsrcT): CInt =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpResources(cookie.toString(), lgrp, lgrps.rawAddress.toString(), count.toInt(), tpe) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    if (unixSolarishNapiAvailable) wasmLibcUnixSolarishLgrpRoot(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
