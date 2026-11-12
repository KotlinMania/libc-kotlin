@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val solidNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual var OPTARG: MutPtr
    get() = if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetOPTARG() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetOPTARG(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTERR: CInt
    get() = if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetOPTERR() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetOPTERR(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTIND: CInt
    get() = if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetOPTIND() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetOPTIND(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTOPT: CInt
    get() = if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetOPTOPT() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetOPTOPT(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTRESET: CInt
    get() = if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetOPTRESET() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetOPTRESET(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var SUBOPTARG: MutPtr
    get() = if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetSUBOPTARG() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAddon != null) {
            solidNapiAddon.libcSolidSetSUBOPTARG(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun isalnum(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdioFile(fileno: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetStdioFile(fileno) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidClearerr(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fclose(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFclose(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFeof(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFerror(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFflush(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFgetc(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(arg1: MutPtr, arg2: CInt, arg3: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidFgets(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidFopen(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFputc(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFputs(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFread(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(arg1: ConstPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidFreopen(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(arg1: MutPtr, arg2: CLong, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFseek(arg1.rawAddress.toString(), arg2.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(arg1: MutPtr): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFtell(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(arg1: ConstPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFwrite(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetc(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(arg1: ConstPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidPerror(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun printf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPrintf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutc(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutchar(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPuts(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRemove(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidRewind(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidScanf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(arg1: MutPtr, arg2: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidSetbuf(arg1.rawAddress.toString(), arg2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setvbuf(arg1: MutPtr, arg2: MutPtr, arg3: CInt, arg4: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSetvbuf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(arg1: ConstPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidUngetc(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVfprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGets(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidTmpnam(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVsprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRename(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAsiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iprintf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIprintf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidIscanf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSniprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vasiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVasiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVfiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiscanf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVfiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viprintf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidViprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viscanf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidViscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVsiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiscanf(arg1: ConstPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVsiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVsniprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vdiprintf(arg1: CInt, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVdiprintf(arg1, arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diprintf(arg1: CInt, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDiprintf(arg1, arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos(arg1: MutPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFgetpos(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(arg1: MutPtr, arg2: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFsetpos(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(arg1: CInt, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidFdopen(arg1, arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFileno(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flockfile(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidFlockfile(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftrylockfile(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFtrylockfile(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun funlockfile(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidFunlockfile(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getcUnlocked(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetcUnlocked(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcUnlocked(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutcUnlocked(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutcharUnlocked(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSnprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidVsnprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getw(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetw(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putw(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutw(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tempnam(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidTempnam(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(arg1: ConstPtr): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtof(arg1.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(arg1: ConstPtr, arg2: MutPtr): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtod(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(arg1: MutPtr): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidErand48(arg1.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(arg1: ConstPtr, arg2: MutPtr): Float =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtof(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtold(arg1: ConstPtr, arg2: MutPtr): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtold(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtodL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtodL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtofL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Float =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtofL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoldL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoldL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(arg1: CInt): Nothing {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAbs(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtoi(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(arg1: ConstPtr): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtol(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itoa(arg1: CInt, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidItoa(arg1, arg2.rawAddress.toString(), arg3) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ltoa(arg1: CLong, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidLtoa(arg1.toString(), arg2.rawAddress.toString(), arg3) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ultoa(arg1: CUlong, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidUltoa(arg1.toString(), arg2.rawAddress.toString(), arg3) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidBsearch(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(arg1: SizeT, arg2: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidCalloc(arg1.toString(), arg2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidFree(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetenv(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(arg1: CLong): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidLabs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(arg1: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMalloc(arg1.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidQsort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rand(): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(arg1: MutPtr, arg2: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidRealloc(arg1.rawAddress.toString(), arg2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(arg1: CUint) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidSrand(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtol(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtol(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoul(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblen(arg1: ConstPtr, arg2: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMblen(arg1.rawAddress.toString(), arg2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMbstowcs(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctomb(arg1: MutPtr, arg2: WcharT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidWctomb(arg1.rawAddress.toString(), arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowc(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMbtowc(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidWcstombs(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRandR(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(arg1: MutPtr): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidJrand48(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(arg1: MutPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidLcong48(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(arg1: MutPtr): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidNrand48(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidSeed48(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(arg1: CLong) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidSrand48(arg1.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPutenv(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun a64l(arg1: ConstPtr): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidA64l(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64a(arg1: CLong): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidL64a(arg1.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRandom() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidSetstate(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initstate(arg1: CUint, arg2: MutPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidInitstate(arg1.toInt(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(arg1: CUint) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidSrandom(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkostemp(arg1: MutPtr, arg2: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMkostemp(arg1.rawAddress.toString(), arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(arg1: MutPtr, arg2: CInt, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMkostemps(arg1.rawAddress.toString(), arg2, arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMkdtemp(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(arg1: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMkstemp(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktemp(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMktemp(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(arg1: ConstPtr): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtoll(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(arg1: CLonglong): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidLlabs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoll(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoull(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidAlignedAlloc(arg1.toString(), arg2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAtQuickExit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(arg1: CInt) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidQuickExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setenv(arg1: ConstPtr, arg2: ConstPtr, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSetenv(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidUnsetenv(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun humanizeNumber(arg1: MutPtr, arg2: SizeT, arg3: Long, arg4: ConstPtr, arg5: CInt, arg6: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidHumanizeNumber(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString(), arg5, arg6) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dehumanizeNumber(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDehumanizeNumber(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenvR(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetenvR(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidHeapsort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergesort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMergesort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun radixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRadixsort(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString(), arg4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sradixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSradixsort(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString(), arg4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (solidNapiAddon != null) ConstPtr((solidNapiAddon.libcSolidGetprogname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(arg1: ConstPtr) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidSetprogname(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qabs(arg1: QuadT): QuadT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidQabs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): QuadT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoq(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): UQuadT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtouq(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftoll(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrsuftoll(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftollx(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr, arg6: SizeT): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrsuftollx(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString(), arg5.rawAddress.toString(), arg6.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64aR(arg1: CLong, arg2: MutPtr, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidL64aR(arg1.toString(), arg2.rawAddress.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtolL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtolL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoulL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoulL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtollL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtollL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoullL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlonglong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoullL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): QuadT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtoqL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): UQuadT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrtouqL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMbCurMaxL(arg1.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblenL(arg1: ConstPtr, arg2: SizeT, arg3: LocaleT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMblenL(arg1.rawAddress.toString(), arg2.toString(), arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMbstowcsL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctombL(arg1: MutPtr, arg2: WcharT, arg3: LocaleT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidWctombL(arg1.rawAddress.toString(), arg2.toInt(), arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowcL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMbtowcL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidWcstombsL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemchr(arg1.rawAddress.toString(), arg2, arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMemcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemmove(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemset(arg1.rawAddress.toString(), arg2, arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrcat(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrchr(arg1.rawAddress.toString(), arg2) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrcoll(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrcspn(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(arg1: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrerror(arg1) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(arg1: ConstPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrlen(arg1.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrncat(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrncmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrncpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrpbrk(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrrchr(arg1.rawAddress.toString(), arg2) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrspn(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrstr(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrtok(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrtokR(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(arg1: CInt, arg2: MutPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrerrorR(arg1, arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrxfrm(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(arg1: MutPtr, arg2: ConstPtr, arg3: CInt, arg4: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemccpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrdup(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStpcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStpncpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(arg1: ConstPtr, arg2: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrnlen(arg1.rawAddress.toString(), arg2.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(arg1: ConstPtr, arg2: SizeT, arg3: ConstPtr, arg4: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemmem(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrcasestr(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrlcat(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrlcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrsep(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stresep(arg1: MutPtr, arg2: ConstPtr, arg3: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStresep(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(arg1: ConstPtr, arg2: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrndup(arg1.rawAddress.toString(), arg2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemrchr(arg1.rawAddress.toString(), arg2, arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidExplicitMemset(arg1.rawAddress.toString(), arg2, arg3.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun consttimeMemequal(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidConsttimeMemequal(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcollL(arg1: ConstPtr, arg2: ConstPtr, arg3: LocaleT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrcollL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrmL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrxfrmL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidStrerrorL(arg1, arg2.toLong().toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidBcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcopy(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidBcopy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bzero(arg1: MutPtr, arg2: SizeT) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidBzero(arg1.rawAddress.toString(), arg2.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFfs(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount(arg1: CUint): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPopcount(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountl(arg1: CUlong): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPopcountl(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountll(arg1: CUlonglong): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPopcountll(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount32(arg1: UInt): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPopcount32(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount64(arg1: ULong): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidPopcount64(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rindex(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidRindex(arg1.rawAddress.toString(), arg2) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrcasecmp(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrncasecmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSignal(arg1, arg2.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRaise(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidAsctime(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidClock() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidCtime(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDifftime(arg1.toString(), arg2.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGmtime(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(arg1: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidLocaltime(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(arg1: MutPtr): TimeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidTime(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(arg1: MutPtr): TimeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMktime(arg1.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: ConstPtr): SizeT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStrftime(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidUtime(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidAsctimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidCtimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGmtimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidLocaltimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidStat(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidLstat(arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFstat(arg1, arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(arg1: ConstPtr, arg2: ModeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidChmod(arg1.rawAddress.toString(), arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(arg1: ConstPtr, arg2: ModeT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidMkdir(arg1.rawAddress.toString(), arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(arg1: ConstPtr, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidOpen(arg1.rawAddress.toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(arg1: ConstPtr, arg2: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidCreat(arg1.rawAddress.toString(), arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidClose(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(arg1: CInt, arg2: MutPtr, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRead(arg1, arg2.rawAddress.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(arg1: CInt, arg2: ConstPtr, arg3: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidWrite(arg1, arg2.rawAddress.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidUnlink(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tell(arg1: CInt): CLong =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidTell(arg1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(arg1: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDup(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDup2(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(arg1: ConstPtr, arg2: CInt): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidAccess(arg1.rawAddress.toString(), arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidRmdir(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(arg1: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidChdir(arg1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getwd(arg1: MutPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetwd(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(arg1: MutPtr, arg2: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidGetcwd(arg1.rawAddress.toString(), arg2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(arg1: CInt, arg2: MutPtr, arg3: ConstPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetopt(arg1, arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetsubopt(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidFcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(arg1: CUint): CUint =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidSleep(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(arg1: UsecondsT): CInt =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidUsleep(arg1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(arg1: CInt, arg2: ConstPtr): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidSetlocale(arg1, arg2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidDuplocale(arg1.toLong().toString()) as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(arg1: LocaleT) {
    if (solidNapiAddon != null) {
        solidNapiAddon.libcSolidFreelocale(arg1.toLong().toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(arg1: LocaleT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidLocaleconvL(arg1.toLong().toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(arg1: CInt, arg2: ConstPtr, arg3: LocaleT): LocaleT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidNewlocale(arg1, arg2.rawAddress.toString(), arg3.toLong().toString()) as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidNlLanginfo(item.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidNlLanginfoL(item.toString(), locale.toLong().toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (solidNapiAddon != null) MutPtr((solidNapiAddon.libcSolidMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    if (solidNapiAddon != null) (solidNapiAddon.libcSolidLseek(arg1, arg2.toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
