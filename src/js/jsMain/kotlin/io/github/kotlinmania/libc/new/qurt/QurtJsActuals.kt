@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtOpendir(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: ConstPtr<DIR>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtClosedir(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr<ClockidT>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtClockGetcpuclockid(pid, clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtAlignedAlloc(alignment.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(s: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrlen(s.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrcpy(dest.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrncpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrcat(dest.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrncat(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrcmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrncmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrcoll(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrxfrm(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrchr(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrrchr(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrspn(s.rawAddress.toString(), accept.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(s: ConstPtr<CChar>, reject: ConstPtr<CChar>): SizeT =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtStrcspn(s.rawAddress.toString(), reject.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrpbrk(s.rawAddress.toString(), accept.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(haystack: ConstPtr<CChar>, needle: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrstr(haystack.rawAddress.toString(), needle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrtok(s.rawAddress.toString(), delim.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(errnum: CInt): MutPtr<CChar> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtStrerror(errnum) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(s: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtMemchr(s.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(s1: ConstPtr<CVoid>, s2: ConstPtr<CVoid>, n: SizeT): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtMemcmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(s: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (newQurtNapiAddon != null) MutPtr((newQurtNapiAddon.libcNewQurtMemset(s.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtFork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(filename: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtExecve(filename.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (newQurtNapiAddon != null) (newQurtNapiAddon.libcNewQurtToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
