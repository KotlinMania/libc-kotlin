@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val wasiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual var ENVIRON: MutPtr
    get() = if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGetENVIRON() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (wasiNapiAddon != null) {
            wasiNapiAddon.libcWasiSetENVIRON(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetCLOCKMONOTONIC1() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual val CLOCK_REALTIME1: UByte
    get() = if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetCLOCKREALTIME1() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(code: CInt): Nothing {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiExit(code)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiAlignedAlloc(a.toString(), b.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiCalloc(amt.toString(), amt2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: MutPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(s: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(amt: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMalloc(amt.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, ptr: MutPtr, size: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRead(fd, ptr.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr, amt: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiRealloc(ptr.rawAddress.toString(), amt.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(k: ConstPtr, v: ConstPtr, a: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSetenv(k.rawAddress.toString(), v.rawAddress.toString(), a) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(k: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnsetenv(k.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, ptr: ConstPtr, size: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWrite(fd, ptr.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(a: ConstPtr, b: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFopen(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(a: ConstPtr, b: ConstPtr, f: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFreopen(a.rawAddress.toString(), b.rawAddress.toString(), f.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFclose(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(a: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRemove(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(a: ConstPtr, b: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRename(a.rawAddress.toString(), b.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFeof(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFerror(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFflush(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(f: MutPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiClearerr(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fseek(f: MutPtr, b: CLong, c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFseek(f.rawAddress.toString(), b.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(f: MutPtr): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtell(f.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(f: MutPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiRewind(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(f: MutPtr, pos: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFgetpos(f.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(f: MutPtr, pos: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFsetpos(f.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(buf: MutPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFread(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(buf: ConstPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFwrite(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFgetc(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetc(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUngetc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFputc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(a: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutchar(a) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(a: ConstPtr, f: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFputs(a.rawAddress.toString(), f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(a: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPuts(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(a: ConstPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiPerror(a.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand(a: CUint) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSrand(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atexit(a: AtexitACallback): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(a: AtexitACallback): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtQuickExit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(a: CInt): Nothing {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiQuickExit(a)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: MutPtr, b: SizeT, c: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixMemalign(a.rawAddress.toString(), b.toString(), c.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(a: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRandR(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRandom() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(a: CUint) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSrandom(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(a: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutenv(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClock() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(a: MutPtr): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTime(a.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiDifftime(a.toString(), b.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(a: MutPtr): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMktime(a.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(a: MutPtr, b: SizeT, c: ConstPtr, d: ConstPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrftime(a.rawAddress.toString(), b.toString(), c.rawAddress.toString(), d.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(a: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGmtime(a.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGmtimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(a: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaltime(a.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaltimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiAsctimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiCtimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(a: ConstPtr, b: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiNanosleep(a.rawAddress.toString(), b.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(a: ClockidT, b: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(a: ClockidT, b: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr, c: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: ConstPtr): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrndup(cs.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrnlen(cs.rawAddress.toString(), maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiShutdown(socket, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiCreat(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiOpendir(dirname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFdopendir(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClosedir(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnlink(c.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTruncate(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetrusage(resource, usage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr): ClockT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTimes(buf.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUsleep(secs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRecv(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPoll(fds.rawAddress.toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcasestr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiChdir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNlLanginfoL(item, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcFdRenumber(fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcUnlinkat(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRmdirat(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFindRelpath(path: ConstPtr, absPrefix: MutPtr, relativePath: MutPtr, relativePathLen: ULong): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcFindRelpath(path.rawAddress.toString(), absPrefix.rawAddress.toString(), relativePath.rawAddress.toString(), relativePathLen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcTell(fd: CInt): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcTell(fd) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr, dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdSymlinkat(target.rawAddress.toString(), dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr, buf: MutPtr, bufsize: ULong): Long =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcAccess(pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcAccess(pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcStat(pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcStat(pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUtimens(pathname: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcUtimens(pathname.rawAddress.toString(), times.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLink(oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLink(oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLinkNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRenameNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(a: MutPtr, b: SizeT) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiArc4randomBuf(a.rawAddress.toString(), b.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(a: UInt): UInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiArc4randomUniform(a.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiChmod(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFchmod(fd, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiPthreadSelf() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadEqual(t1.rawAddress.toString(), t2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadJoin(native.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadDetach(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiPthreadGetspecific(key.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadSetspecific(key.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrSettype(attr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockRdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockTryrdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockWrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockTrywrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
