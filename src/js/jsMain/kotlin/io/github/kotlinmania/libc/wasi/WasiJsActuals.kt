@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val wasiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual var ENVIRON: MutPtr<MutPtr<CChar>>
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

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiAlignedAlloc(a.toString(), b.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiCalloc(amt.toString(), amt2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: MutPtr<CVoid>) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(amt: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMalloc(amt.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, ptr: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRead(fd, ptr.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr<CVoid>, amt: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiRealloc(ptr.rawAddress.toString(), amt.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(k: ConstPtr<CChar>, v: ConstPtr<CChar>, a: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSetenv(k.rawAddress.toString(), v.rawAddress.toString(), a) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(k: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnsetenv(k.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, ptr: ConstPtr<CVoid>, size: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWrite(fd, ptr.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>): MutPtr<FILE> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFopen(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>, f: MutPtr<FILE>): MutPtr<FILE> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFreopen(a.rawAddress.toString(), b.rawAddress.toString(), f.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFclose(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(a: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRemove(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(a: ConstPtr<CChar>, b: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRename(a.rawAddress.toString(), b.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFeof(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFerror(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFflush(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(f: MutPtr<FILE>) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiClearerr(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fseek(f: MutPtr<FILE>, b: CLong, c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFseek(f.rawAddress.toString(), b.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(f: MutPtr<FILE>): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtell(f.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(f: MutPtr<FILE>) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiRewind(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(f: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFgetpos(f.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(f: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFsetpos(f.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(buf: MutPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFread(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(buf: ConstPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFwrite(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFgetc(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetc(f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(a: CInt, f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUngetc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(a: CInt, f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFputc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(a: CInt, f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutc(a, f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(a: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutchar(a) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(a: ConstPtr<CChar>, f: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFputs(a.rawAddress.toString(), f.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(a: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPuts(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(a: ConstPtr<CChar>) {
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

public actual fun posixMemalign(a: MutPtr<MutPtr<CVoid>>, b: SizeT, c: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixMemalign(a.rawAddress.toString(), b.toString(), c.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(a: MutPtr<CUint>): CInt =
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

public actual fun putenv(a: MutPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutenv(a.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClock() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(a: MutPtr<TimeT>): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTime(a.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiDifftime(a.toString(), b.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(a: MutPtr<Tm>): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMktime(a.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(a: MutPtr<CChar>, b: SizeT, c: ConstPtr<CChar>, d: ConstPtr<Tm>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrftime(a.rawAddress.toString(), b.toString(), c.rawAddress.toString(), d.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGmtime(a.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGmtimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaltime(a.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaltimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(a: ConstPtr<Tm>, b: MutPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiAsctimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(a: ConstPtr<TimeT>, b: MutPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiCtimeR(a.rawAddress.toString(), b.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(a: ConstPtr<Timespec>, b: MutPtr<Timespec>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiNanosleep(a.rawAddress.toString(), b.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(a: ClockidT, b: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(a: ClockidT, b: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr<Timespec>, c: MutPtr<Timespec>): CInt =
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

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrndup(cs.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrnlen(cs.rawAddress.toString(), maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiShutdown(socket, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiCreat(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiOpendir(dirname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiFdopendir(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClosedir(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUnlink(c.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTruncate(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetrusage(resource, usage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTimes(buf.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUsleep(secs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiRecv(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPoll(fds.rawAddress.toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr<Lconv> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiStrcasestr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
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

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiChdir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiNlLanginfoL(item, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcFdRenumber(fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcUnlinkat(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRmdirat(fd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFindRelpath(path: ConstPtr<CChar>, absPrefix: MutPtr<ConstPtr<CChar>>, relativePath: MutPtr<MutPtr<CChar>>, relativePathLen: ULong): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcFindRelpath(path.rawAddress.toString(), absPrefix.rawAddress.toString(), relativePath.rawAddress.toString(), relativePathLen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcTell(fd: CInt): OffT =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcTell(fd) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr<CChar>, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdSymlinkat(target.rawAddress.toString(), dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: ULong): Long =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr<CChar>): MutPtr<DIR> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcAccess(pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcAccess(pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcStat(pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcStat(pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUtimens(pathname: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcUtimens(pathname.rawAddress.toString(), times.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLink(oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLink(oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcLinkNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiWasilibcRenameNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(a: MutPtr<CVoid>, b: SizeT) {
    if (wasiNapiAddon != null) {
        wasiNapiAddon.libcWasiArc4randomBuf(a.rawAddress.toString(), b.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(a: UInt): UInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiArc4randomUniform(a.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiChmod(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiFchmod(fd, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiPthreadSelf() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadEqual(t1.rawAddress.toString(), t2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadJoin(native.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadDetach(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (wasiNapiAddon != null) MutPtr((wasiNapiAddon.libcWasiPthreadGetspecific(key.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadSetspecific(key.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadMutexattrSettype(attr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockRdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockTryrdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockWrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockTrywrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (wasiNapiAddon != null) (wasiNapiAddon.libcWasiPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
