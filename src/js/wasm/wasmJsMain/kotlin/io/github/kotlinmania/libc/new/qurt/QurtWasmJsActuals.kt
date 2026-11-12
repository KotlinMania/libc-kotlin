@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtNapiAddon(): Boolean

private val newQurtNapiAvailable: Boolean = initNewQurtNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtOpendir(p0)")
private external fun wasmLibcNewQurtOpendir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtReaddir(p0)")
private external fun wasmLibcNewQurtReaddir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtClosedir(p0)")
private external fun wasmLibcNewQurtClosedir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtMkdir(p0, p1)")
private external fun wasmLibcNewQurtMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadAttrSetstack(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtClockGetcpuclockid(p0, p1)")
private external fun wasmLibcNewQurtClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcNewQurtSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcNewQurtSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSemClose(p0)")
private external fun wasmLibcNewQurtSemClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSemUnlink(p0)")
private external fun wasmLibcNewQurtSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtAlignedAlloc(p0, p1)")
private external fun wasmLibcNewQurtAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStrlen(p0)")
private external fun wasmLibcNewQurtStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrcpy(p0, p1)")
private external fun wasmLibcNewQurtStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStrncpy(p0, p1, p2)")
private external fun wasmLibcNewQurtStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrcat(p0, p1)")
private external fun wasmLibcNewQurtStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStrncat(p0, p1, p2)")
private external fun wasmLibcNewQurtStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrcmp(p0, p1)")
private external fun wasmLibcNewQurtStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStrncmp(p0, p1, p2)")
private external fun wasmLibcNewQurtStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrcoll(p0, p1)")
private external fun wasmLibcNewQurtStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStrxfrm(p0, p1, p2)")
private external fun wasmLibcNewQurtStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrchr(p0, p1)")
private external fun wasmLibcNewQurtStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrrchr(p0, p1)")
private external fun wasmLibcNewQurtStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrspn(p0, p1)")
private external fun wasmLibcNewQurtStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrcspn(p0, p1)")
private external fun wasmLibcNewQurtStrcspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrpbrk(p0, p1)")
private external fun wasmLibcNewQurtStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrstr(p0, p1)")
private external fun wasmLibcNewQurtStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStrtok(p0, p1)")
private external fun wasmLibcNewQurtStrtok(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStrerror(p0)")
private external fun wasmLibcNewQurtStrerror(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtMemchr(p0, p1, p2)")
private external fun wasmLibcNewQurtMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtMemcmp(p0, p1, p2)")
private external fun wasmLibcNewQurtMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtMemcpy(p0, p1, p2)")
private external fun wasmLibcNewQurtMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtMemmove(p0, p1, p2)")
private external fun wasmLibcNewQurtMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtMemset(p0, p1, p2)")
private external fun wasmLibcNewQurtMemset(p0: String, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtFork()")
private external fun wasmLibcNewQurtFork(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtExecve(p0, p1, p2)")
private external fun wasmLibcNewQurtExecve(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsalnum(p0)")
private external fun wasmLibcNewQurtIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsalpha(p0)")
private external fun wasmLibcNewQurtIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIscntrl(p0)")
private external fun wasmLibcNewQurtIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsdigit(p0)")
private external fun wasmLibcNewQurtIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsgraph(p0)")
private external fun wasmLibcNewQurtIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIslower(p0)")
private external fun wasmLibcNewQurtIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsprint(p0)")
private external fun wasmLibcNewQurtIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIspunct(p0)")
private external fun wasmLibcNewQurtIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsspace(p0)")
private external fun wasmLibcNewQurtIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsupper(p0)")
private external fun wasmLibcNewQurtIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtIsxdigit(p0)")
private external fun wasmLibcNewQurtIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTolower(p0)")
private external fun wasmLibcNewQurtTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtToupper(p0)")
private external fun wasmLibcNewQurtToupper(p0: Int): Int

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtOpendir(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtReaddir(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: ConstPtr<DIR>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtClosedir(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtMkdir(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr<ClockidT>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtClockGetcpuclockid(pid, clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtAlignedAlloc(alignment.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(s: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrlen(s.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrcpy(dest.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrncpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrcat(dest.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrncat(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrcmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrncmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrcoll(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrxfrm(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrchr(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrrchr(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrspn(s.rawAddress.toString(), accept.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(s: ConstPtr<CChar>, reject: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAvailable) wasmLibcNewQurtStrcspn(s.rawAddress.toString(), reject.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrpbrk(s.rawAddress.toString(), accept.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(haystack: ConstPtr<CChar>, needle: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrstr(haystack.rawAddress.toString(), needle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrtok(s.rawAddress.toString(), delim.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(errnum: CInt): MutPtr<CChar> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtStrerror(errnum).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(s: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtMemchr(s.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(s1: ConstPtr<CVoid>, s2: ConstPtr<CVoid>, n: SizeT): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtMemcmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(s: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAvailable) MutPtr(wasmLibcNewQurtMemset(s.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (newQurtNapiAvailable) wasmLibcNewQurtFork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(filename: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtExecve(filename.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (newQurtNapiAvailable) wasmLibcNewQurtToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")
