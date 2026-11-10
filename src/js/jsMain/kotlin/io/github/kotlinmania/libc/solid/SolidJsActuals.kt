@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT

private val _solidNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual var OPTARG: COpaquePointer?
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_OPTARG() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_OPTARG((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTERR: CInt
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_OPTERR() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_OPTERR(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTIND: CInt
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_OPTIND() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_OPTIND(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTOPT: CInt
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_OPTOPT() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_OPTOPT(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTRESET: CInt
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_OPTRESET() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_OPTRESET(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var SUBOPTARG: COpaquePointer?
    get() = if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_get_SUBOPTARG() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAddon != null) {
            _solidNapiAddon.libc_solid_set_SUBOPTARG((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun isalnum(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_iscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_islower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ispunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_isblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_tolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_toupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdioFile(fileno: CInt): FILE? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getStdioFile(fileno) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(arg1: FILE?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_clearerr((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fclose(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fclose((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_feof((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ferror((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fflush((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fgetc((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fgets((arg1?.value ?: 0L).toString(), arg2, (arg3?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fopen(arg1, arg2) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fprintf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fputc(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fputs(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fread((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), (arg4?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_freopen(arg1, arg2, (arg3?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fscanf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fseek((arg1?.handle ?: 0L).toString(), arg2.toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(arg1: FILE?): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ftell((arg1?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fwrite((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), (arg4?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getc((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(arg1: String?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_perror(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_printf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putc(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putchar(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_puts(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_remove(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(arg1: FILE?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_rewind((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_scanf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_setbuf((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_setvbuf((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3, arg4.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_sscanf(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ungetc(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vfprintf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vprintf(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_gets((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_sprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_tmpnam(arg1) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vsprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_rename(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_asiprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fiprintf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fiscanf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_iprintf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_iscanf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_siprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_siscanf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_sniprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vasiprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vfiprintf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vfiscanf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_viprintf(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_viscanf(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vsiprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vsiscanf(arg1, arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vsniprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vdiprintf(arg1, arg2, (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_diprintf(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fgetpos((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fsetpos((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fdopen(arg1, arg2) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fileno((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flockfile(arg1: FILE?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_flockfile((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ftrylockfile((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun funlockfile(arg1: FILE?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_funlockfile((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getcUnlocked((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putcUnlocked(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putcharUnlocked(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_snprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_vsnprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getw(arg1: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getw((arg1?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putw(arg1, (arg2?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_tempnam(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ftello((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(arg1: String?): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atof(arg1) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtod(arg1, (arg2?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_drand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(arg1: COpaquePointer?): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_erand48((arg1?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtof(arg1, (arg2?.value ?: 0L).toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtold(arg1, (arg2?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtodL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtofL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoldL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(arg1: CInt): Nothing {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_exit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_abs(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atoi(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(arg1: String?): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atol(arg1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_itoa(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ltoa(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ultoa(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_bsearch((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString(), arg4.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_calloc(arg1.toString(), arg2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(arg1: COpaquePointer?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_free((arg1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getenv(arg1) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(arg1: CLong): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_labs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_malloc(arg1.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_qsort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rand(): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_rand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_realloc((arg1?.value ?: 0L).toString(), arg2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(arg1: CUint) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_srand(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtol(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoul(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mblen(arg1, arg2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mbstowcs((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_wctomb((arg1?.value ?: 0L).toString(), arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mbtowc((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_wcstombs((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(arg1: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_randR((arg1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_jrand48((arg1?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(arg1: COpaquePointer?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_lcong48((arg1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_lrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_nrand48((arg1?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_seed48((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(arg1: CLong) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_srand48(arg1.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_putenv((arg1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun a64l(arg1: String?): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_a64l(arg1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64a(arg1: CLong): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_l64a(arg1.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_random() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_setstate((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_initstate(arg1.toInt(), (arg2?.value ?: 0L).toString(), arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(arg1: CUint) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_srandom(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mkostemp((arg1?.value ?: 0L).toString(), arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mkostemps((arg1?.value ?: 0L).toString(), arg2, arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mkdtemp((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mkstemp((arg1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mktemp((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(arg1: String?): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atoll(arg1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(arg1: CLonglong): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_llabs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoll(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoull(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_alignedAlloc(arg1.toString(), arg2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_atQuickExit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(arg1: CInt) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_quickExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_setenv(arg1, arg2, arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_unsetenv(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_humanizeNumber((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), arg4, arg5, arg6) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_dehumanizeNumber(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getenvR(arg1, (arg2?.value ?: 0L).toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_heapsort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mergesort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_radixsort((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString(), arg4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_sradixsort((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString(), arg4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getprogname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(arg1: String?) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_setprogname(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qabs(arg1: QuadT): QuadT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_qabs(arg1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoq(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtouq(arg1, (arg2?.value ?: 0L).toString(), arg3) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strsuftoll(arg1, arg2, arg3.toString(), arg4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strsuftollx(arg1, arg2, arg3.toString(), arg4.toString(), (arg5?.value ?: 0L).toString(), arg6.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_l64aR(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtolL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoulL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtollL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoullL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtoqL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtouqL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mbCurMaxL(arg1.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mblenL(arg1, arg2.toString(), arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mbstowcsL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_wctombL((arg1?.value ?: 0L).toString(), arg2.toInt(), arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mbtowcL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_wcstombsL((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memchr((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memcmp((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memcpy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memmove((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memset((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcat((arg1?.value ?: 0L).toString(), arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strchr(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcmp(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcoll(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcpy((arg1?.value ?: 0L).toString(), arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcspn(arg1, arg2) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(arg1: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strerror(arg1) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(arg1: String?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strlen(arg1) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strncat((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strncmp(arg1, arg2, arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strncpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strpbrk(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strrchr(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strspn(arg1, arg2) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strstr(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtok((arg1?.value ?: 0L).toString(), arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strtokR((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strerrorR(arg1, (arg2?.value ?: 0L).toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strxfrm((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memccpy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3, arg4.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(arg1: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strdup(arg1) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_stpcpy((arg1?.value ?: 0L).toString(), arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_stpncpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strnlen(arg1, arg2.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memmem((arg1?.value ?: 0L).toString(), arg2.toString(), (arg3?.value ?: 0L).toString(), arg4.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcasestr(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strlcat((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strlcpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strsep((arg1?.value ?: 0L).toString(), arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_stresep((arg1?.value ?: 0L).toString(), arg2, arg3) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strndup(arg1, arg2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memrchr((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_explicitMemset((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_consttimeMemequal((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcollL(arg1, arg2, arg3.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strxfrmL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strerrorL(arg1, arg2.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_bcmp((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_bcopy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_bzero((arg1?.value ?: 0L).toString(), arg2.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ffs(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount(arg1: CUint): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_popcount(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountl(arg1: CUlong): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_popcountl(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountll(arg1: CUlonglong): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_popcountll(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount32(arg1: UInt): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_popcount32(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount64(arg1: ULong): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_popcount64(arg1.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_rindex(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strcasecmp(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strncasecmp(arg1, arg2, arg3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_signal(arg1, arg2.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_raise(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_asctime((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_clock() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ctime((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_difftime(arg1.toString(), arg2.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_gmtime((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_localtime((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(arg1: COpaquePointer?): TimeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_time((arg1?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mktime((arg1?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_strftime((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_utime(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_asctimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_ctimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_gmtimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_localtimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_stat(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_lstat(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fstat(arg1, (arg2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_chmod(arg1, arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_mkdir(arg1, arg2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_open(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_creat(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_close(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_read(arg1, (arg2?.value ?: 0L).toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_write(arg1, (arg2?.value ?: 0L).toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_unlink(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tell(arg1: CInt): CLong =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_tell(arg1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(arg1: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_dup(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_dup2(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(arg1: String?, arg2: CInt): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_access(arg1, arg2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_rmdir(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(arg1: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_chdir(arg1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getwd((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getcwd((arg1?.value ?: 0L).toString(), arg2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getopt(arg1, (arg2?.value ?: 0L).toString(), arg3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getsubopt((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), (arg3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_fcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_getpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(arg1: CUint): CUint =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_sleep(arg1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(arg1: UsecondsT): CInt =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_usleep(arg1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_localeconv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_setlocale(arg1, arg2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_duplocale(arg1.toLong().toString()) as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(arg1: LocaleT) {
    if (_solidNapiAddon != null) {
        _solidNapiAddon.libc_solid_freelocale(arg1.toLong().toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_localeconvL(arg1.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_newlocale(arg1, arg2, arg3.toLong().toString()) as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_nlLanginfo(item.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_nlLanginfoL(item.toString(), locale.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    if (_solidNapiAddon != null) (_solidNapiAddon.libc_solid_lseek(arg1, arg2.toString(), arg3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
