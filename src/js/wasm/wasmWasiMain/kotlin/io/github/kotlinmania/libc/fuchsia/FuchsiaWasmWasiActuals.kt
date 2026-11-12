@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsalnum")
private external fun wasiLibcFuchsiaIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcFuchsiaIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsalpha")
private external fun wasiLibcFuchsiaIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcFuchsiaIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIscntrl")
private external fun wasiLibcFuchsiaIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcFuchsiaIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsdigit")
private external fun wasiLibcFuchsiaIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcFuchsiaIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsgraph")
private external fun wasiLibcFuchsiaIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcFuchsiaIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIslower")
private external fun wasiLibcFuchsiaIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcFuchsiaIslower(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsprint")
private external fun wasiLibcFuchsiaIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcFuchsiaIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIspunct")
private external fun wasiLibcFuchsiaIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcFuchsiaIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsspace")
private external fun wasiLibcFuchsiaIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcFuchsiaIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsupper")
private external fun wasiLibcFuchsiaIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcFuchsiaIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsxdigit")
private external fun wasiLibcFuchsiaIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcFuchsiaIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsblank")
private external fun wasiLibcFuchsiaIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcFuchsiaIsblank(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTolower")
private external fun wasiLibcFuchsiaTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcFuchsiaTolower(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaToupper")
private external fun wasiLibcFuchsiaToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcFuchsiaToupper(c)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFopen")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFreopen")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFflush")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFclose")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRemove")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRename")

public actual fun tmpfile(): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTmpfile")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetvbuf")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetbuf")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetchar")
private external fun wasiLibcFuchsiaGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcFuchsiaGetchar()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPutchar")
private external fun wasiLibcFuchsiaPutchar(c: Int): Int

public actual fun putchar(c: CInt): CInt =
    wasiLibcFuchsiaPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFgetc")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFgets")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFputc")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFputs")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPuts")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUngetc")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFread")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFwrite")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFseek")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFtell")

public actual fun rewind(stream: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRewind")

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFgetpos")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFsetpos")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFeof")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFerror")

public actual fun perror(s: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPerror")

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAtof")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAtoi")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAtol")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAtoll")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtod")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtof")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtol")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtoll")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtoul")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtoull")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCalloc")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMalloc")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRealloc")

public actual fun free(p: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFree")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaAbort")
private external fun wasiLibcFuchsiaAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcFuchsiaAbort()
    error("C noreturn function libcFuchsiaAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcFuchsiaExit")
private external fun wasiLibcFuchsiaExit(status: Int): Unit

public actual fun exit(status: CInt): Nothing {
    wasiLibcFuchsiaExit(status)
    error("C noreturn function libcFuchsiaExit returned")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAtexit")

public actual fun system(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSystem")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetenv")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrcpy")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrncpy")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrcat")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrncat")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrcmp")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrncmp")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrcoll")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrchr")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrrchr")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrspn")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrcspn")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrdup")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrpbrk")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrstr")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrlen")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrnlen")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrerror")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrtok")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrxfrm")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWcslen")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWcstombs")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemchr")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWmemchr")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemcmp")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemcpy")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemmove")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemset")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaAbs")
private external fun wasiLibcFuchsiaAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcFuchsiaAbs(i)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaLabs")
private external fun wasiLibcFuchsiaLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcFuchsiaLabs(i)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaRand")
private external fun wasiLibcFuchsiaRand(): Int

public actual fun rand(): CInt =
    wasiLibcFuchsiaRand()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSrand")
private external fun wasiLibcFuchsiaSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcFuchsiaSrand(seed.toInt())

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpwnam")

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpwuid")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFprintf")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPrintf")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSnprintf")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSprintf")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFscanf")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaScanf")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSscanf")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetcharUnlocked")
private external fun wasiLibcFuchsiaGetcharUnlocked(): Int

public actual fun getcharUnlocked(): CInt =
    wasiLibcFuchsiaGetcharUnlocked()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPutcharUnlocked")
private external fun wasiLibcFuchsiaPutcharUnlocked(c: Int): Int

public actual fun putcharUnlocked(c: CInt): CInt =
    wasiLibcFuchsiaPutcharUnlocked(c)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSocket")
private external fun wasiLibcFuchsiaSocket(domain: Int, ty: Int, protocol: Int): Int

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    wasiLibcFuchsiaSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaConnect")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaListen")
private external fun wasiLibcFuchsiaListen(socket: Int, backlog: Int): Int

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    wasiLibcFuchsiaListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAccept")

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpeername")

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetsockname")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetsockopt")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSocketpair")

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSendto")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaShutdown")
private external fun wasiLibcFuchsiaShutdown(socket: Int, how: Int): Int

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    wasiLibcFuchsiaShutdown(socket, how)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaChmod")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFchmod")
private external fun wasiLibcFuchsiaFchmod(fd: Int, mode: Int): Int

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    wasiLibcFuchsiaFchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFstat")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkdir")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStat")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPclose")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFdopen")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFileno")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaOpen")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCreat")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFcntl")

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaOpendir")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaReaddir")

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaReaddirR")

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClosedir")

public actual fun rewinddir(dirp: MutPtr<DIR>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRewinddir")

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaOpenat")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFchmodat")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFchown")
private external fun wasiLibcFuchsiaFchown(fd: Int, owner: Int, group: Int): Int

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    wasiLibcFuchsiaFchown(fd, owner.toInt(), group.toInt())

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFchownat")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFstatat")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLinkat")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkdirat")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaReadlinkat")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRenameat")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSymlinkat")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUnlinkat")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAccess")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaAlarm")
private external fun wasiLibcFuchsiaAlarm(seconds: Int): Int

public actual fun alarm(seconds: CUint): CUint =
    wasiLibcFuchsiaAlarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaChdir")

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaChown")

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLchown")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaClose")
private external fun wasiLibcFuchsiaClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcFuchsiaClose(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaDup")
private external fun wasiLibcFuchsiaDup(fd: Int): Int

public actual fun dup(fd: CInt): CInt =
    wasiLibcFuchsiaDup(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaDup2")
private external fun wasiLibcFuchsiaDup2(src: Int, dst: Int): Int

public actual fun dup2(src: CInt, dst: CInt): CInt =
    wasiLibcFuchsiaDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecl")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecle")

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExeclp")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecv")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecve")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecvp")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFork")
private external fun wasiLibcFuchsiaFork(): Int

public actual fun fork(): PidT =
    wasiLibcFuchsiaFork()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFpathconf")
private external fun wasiLibcFuchsiaFpathconf(filedes: Int, name: Int): Long

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    wasiLibcFuchsiaFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetcwd")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetegid")
private external fun wasiLibcFuchsiaGetegid(): Int

public actual fun getegid(): GidT =
    wasiLibcFuchsiaGetegid().toUInt()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGeteuid")
private external fun wasiLibcFuchsiaGeteuid(): Int

public actual fun geteuid(): UidT =
    wasiLibcFuchsiaGeteuid().toUInt()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetgid")
private external fun wasiLibcFuchsiaGetgid(): Int

public actual fun getgid(): GidT =
    wasiLibcFuchsiaGetgid().toUInt()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgroups")

public actual fun getlogin(): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetlogin")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetopt")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetpgid")
private external fun wasiLibcFuchsiaGetpgid(pid: Int): Int

public actual fun getpgid(pid: PidT): PidT =
    wasiLibcFuchsiaGetpgid(pid)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetpgrp")
private external fun wasiLibcFuchsiaGetpgrp(): Int

public actual fun getpgrp(): PidT =
    wasiLibcFuchsiaGetpgrp()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetpid")
private external fun wasiLibcFuchsiaGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcFuchsiaGetpid()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetppid")
private external fun wasiLibcFuchsiaGetppid(): Int

public actual fun getppid(): PidT =
    wasiLibcFuchsiaGetppid()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetuid")
private external fun wasiLibcFuchsiaGetuid(): Int

public actual fun getuid(): UidT =
    wasiLibcFuchsiaGetuid().toUInt()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaIsatty")
private external fun wasiLibcFuchsiaIsatty(fd: Int): Int

public actual fun isatty(fd: CInt): CInt =
    wasiLibcFuchsiaIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLink")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaLseek")
private external fun wasiLibcFuchsiaLseek(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    wasiLibcFuchsiaLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPathconf")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPause")
private external fun wasiLibcFuchsiaPause(): Int

public actual fun pause(): CInt =
    wasiLibcFuchsiaPause()

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPipe")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPosixMemalign")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRead")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRmdir")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSeteuid")
private external fun wasiLibcFuchsiaSeteuid(uid: Int): Int

public actual fun seteuid(uid: UidT): CInt =
    wasiLibcFuchsiaSeteuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetegid")
private external fun wasiLibcFuchsiaSetegid(gid: Int): Int

public actual fun setegid(gid: GidT): CInt =
    wasiLibcFuchsiaSetegid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetgid")
private external fun wasiLibcFuchsiaSetgid(gid: Int): Int

public actual fun setgid(gid: GidT): CInt =
    wasiLibcFuchsiaSetgid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetpgid")
private external fun wasiLibcFuchsiaSetpgid(pid: Int, pgid: Int): Int

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    wasiLibcFuchsiaSetpgid(pid, pgid)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetsid")
private external fun wasiLibcFuchsiaSetsid(): Int

public actual fun setsid(): PidT =
    wasiLibcFuchsiaSetsid()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetuid")
private external fun wasiLibcFuchsiaSetuid(uid: Int): Int

public actual fun setuid(uid: UidT): CInt =
    wasiLibcFuchsiaSetuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSleep")
private external fun wasiLibcFuchsiaSleep(secs: Int): Int

public actual fun sleep(secs: CUint): CUint =
    wasiLibcFuchsiaSleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaNanosleep")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcgetpgrp")
private external fun wasiLibcFuchsiaTcgetpgrp(fd: Int): Int

public actual fun tcgetpgrp(fd: CInt): PidT =
    wasiLibcFuchsiaTcgetpgrp(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcsetpgrp")
private external fun wasiLibcFuchsiaTcsetpgrp(fd: Int, pgrp: Int): Int

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    wasiLibcFuchsiaTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTtyname")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUnlink")

public actual fun wait(status: MutPtr<CInt>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWait")

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWaitpid")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWrite")

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPread")

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPwrite")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaUmask")
private external fun wasiLibcFuchsiaUmask(mask: Int): Int

public actual fun umask(mask: ModeT): ModeT =
    wasiLibcFuchsiaUmask(mask.toInt()).toUInt()

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUtime")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaKill")
private external fun wasiLibcFuchsiaKill(pid: Int, sig: Int): Int

public actual fun kill(pid: PidT, sig: CInt): CInt =
    wasiLibcFuchsiaKill(pid, sig)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMlock")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMunlock")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaMlockall")
private external fun wasiLibcFuchsiaMlockall(flags: Int): Int

public actual fun mlockall(flags: CInt): CInt =
    wasiLibcFuchsiaMlockall(flags)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaMunlockall")
private external fun wasiLibcFuchsiaMunlockall(): Int

public actual fun munlockall(): CInt =
    wasiLibcFuchsiaMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMmap")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMunmap")

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaIfNametoindex")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaIfIndextoname")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLstat")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFsync")
private external fun wasiLibcFuchsiaFsync(fd: Int): Int

public actual fun fsync(fd: CInt): CInt =
    wasiLibcFuchsiaFsync(fd)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetenv")

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUnsetenv")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSymlink")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFtruncate")
private external fun wasiLibcFuchsiaFtruncate(fd: Int, length: Long): Int

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    wasiLibcFuchsiaFtruncate(fd, length)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSignal")
private external fun wasiLibcFuchsiaSignal(signum: Int, handler: Long): Long

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    wasiLibcFuchsiaSignal(signum, handler.toLong()).toULong()

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRealpath")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFlock")
private external fun wasiLibcFuchsiaFlock(fd: Int, operation: Int): Int

public actual fun flock(fd: CInt, operation: CInt): CInt =
    wasiLibcFuchsiaFlock(fd, operation)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGettimeofday")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTimes")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadSelf")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadJoin")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadExit")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrDestroy")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrGetstacksize")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrSetstacksize")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrSetdetachstate")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadDetach")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSchedYield")
private external fun wasiLibcFuchsiaSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcFuchsiaSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPthreadKeyDelete")
private external fun wasiLibcFuchsiaPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcFuchsiaPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadSetspecific")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexInit")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexDestroy")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexLock")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexUnlock")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexattrInit")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexattrDestroy")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexattrSettype")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondInit")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondTimedwait")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondSignal")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondBroadcast")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondDestroy")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondattrInit")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondattrDestroy")

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockInit")

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockDestroy")

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockRdlock")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockTryrdlock")

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockWrlock")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockTrywrlock")

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockUnlock")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockattrInit")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadRwlockattrDestroy")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadGetnameNp")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadSetnameNp")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStrerrorR")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetsockopt")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaRaise")
private external fun wasiLibcFuchsiaRaise(signum: Int): Int

public actual fun raise(signum: CInt): CInt =
    wasiLibcFuchsiaRaise(signum)

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigaction")

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUtimes")

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDlopen")

public actual fun dlerror(): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDlerror")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDlsym")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDlclose")

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDladdr")

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetaddrinfo")

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFreeaddrinfo")

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGaiStrerror")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaResInit")
private external fun wasiLibcFuchsiaResInit(): Int

public actual fun resInit(): CInt =
    wasiLibcFuchsiaResInit()

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGmtimeR")

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLocaltimeR")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMktime")

public actual fun time(time: MutPtr<TimeT>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTime")

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGmtime")

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLocaltime")

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMknod")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUname")

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGethostname")

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetservbyname")

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetprotobyname")

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetprotobynumber")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaUsleep")
private external fun wasiLibcFuchsiaUsleep(secs: Int): Int

public actual fun usleep(secs: CUint): CInt =
    wasiLibcFuchsiaUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSend")

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRecv")

public actual fun putenv(string: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPutenv")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPoll")

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSelect")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetlocale")

public actual fun localeconv(): MutPtr<Lconv> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLocaleconv")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemDestroy")

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemWait")

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemTrywait")

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemPost")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemInit")

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStatvfs")

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFstatvfs")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaReadlink")

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigemptyset")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigaddset")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigfillset")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigdelset")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigismember")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigprocmask")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigpending")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTimegm")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetsid")
private external fun wasiLibcFuchsiaGetsid(pid: Int): Int

public actual fun getsid(pid: PidT): PidT =
    wasiLibcFuchsiaGetsid(pid)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSysconf")
private external fun wasiLibcFuchsiaSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcFuchsiaSysconf(name)

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkfifo")

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPselect")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFseeko")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFtello")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcdrain")
private external fun wasiLibcFuchsiaTcdrain(fd: Int): Int

public actual fun tcdrain(fd: CInt): CInt =
    wasiLibcFuchsiaTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfgetispeed")

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfgetospeed")

public actual fun cfmakeraw(termios: MutPtr<Termios>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfmakeraw")

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfsetispeed")

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfsetospeed")

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaCfsetspeed")

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTcgetattr")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTcsetattr")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcflow")
private external fun wasiLibcFuchsiaTcflow(fd: Int, action: Int): Int

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    wasiLibcFuchsiaTcflow(fd, action)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcflush")
private external fun wasiLibcFuchsiaTcflush(fd: Int, action: Int): Int

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    wasiLibcFuchsiaTcflush(fd, action)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcgetsid")
private external fun wasiLibcFuchsiaTcgetsid(fd: Int): Int

public actual fun tcgetsid(fd: CInt): PidT =
    wasiLibcFuchsiaTcgetsid(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTcsendbreak")
private external fun wasiLibcFuchsiaTcsendbreak(fd: Int, duration: Int): Int

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    wasiLibcFuchsiaTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkstemp")

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkdtemp")

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTmpnam")

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaOpenlog")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaCloselog")
private external fun wasiLibcFuchsiaCloselog(): Unit

public actual fun closelog(): Unit =
    wasiLibcFuchsiaCloselog()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetlogmask")
private external fun wasiLibcFuchsiaSetlogmask(maskpri: Int): Int

public actual fun setlogmask(maskpri: CInt): CInt =
    wasiLibcFuchsiaSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSyslog")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGrantpt")
private external fun wasiLibcFuchsiaGrantpt(fd: Int): Int

public actual fun grantpt(fd: CInt): CInt =
    wasiLibcFuchsiaGrantpt(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPosixOpenpt")
private external fun wasiLibcFuchsiaPosixOpenpt(flags: Int): Int

public actual fun posixOpenpt(flags: CInt): CInt =
    wasiLibcFuchsiaPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPtsname")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaUnlockpt")
private external fun wasiLibcFuchsiaUnlockpt(fd: Int): Int

public actual fun unlockpt(fd: CInt): CInt =
    wasiLibcFuchsiaUnlockpt(fd)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFdatasync")
private external fun wasiLibcFuchsiaFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcFuchsiaFdatasync(fd)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClockGettime")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClockSettime")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDirfd")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadGetattrNp")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrGetstack")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemalign")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetgroups")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPipe2")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFstatfs")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMemrchr")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPosixFadvise")
private external fun wasiLibcFuchsiaPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcFuchsiaPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUtimensat")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUselocale")

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFdopendir")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMknodat")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondattrGetclock")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCondattrSetclock")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAccept4")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPtsnameR")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaClearenv")
private external fun wasiLibcFuchsiaClearenv(): Int

public actual fun clearenv(): CInt =
    wasiLibcFuchsiaClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWaitid")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetreuid")
private external fun wasiLibcFuchsiaSetreuid(ruid: Int, euid: Int): Int

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    wasiLibcFuchsiaSetreuid(ruid.toInt(), euid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetregid")
private external fun wasiLibcFuchsiaSetregid(rgid: Int, egid: Int): Int

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    wasiLibcFuchsiaSetregid(rgid.toInt(), egid.toInt())

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetresuid")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetresgid")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaAcct")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaBrk")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetresgid")
private external fun wasiLibcFuchsiaSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcFuchsiaSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetresuid")
private external fun wasiLibcFuchsiaSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcFuchsiaSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaOpenpty")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaExecvpe")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFexecve")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaIoctl")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaLutimes")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetpwent")
private external fun wasiLibcFuchsiaSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcFuchsiaSetpwent()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaEndpwent")
private external fun wasiLibcFuchsiaEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcFuchsiaEndpwent()

public actual fun getpwent(): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpwent")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaShmOpen")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaShmget")
private external fun wasiLibcFuchsiaShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcFuchsiaShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaShmat")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaShmctl")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFtok")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSemget")
private external fun wasiLibcFuchsiaSemget(key: Int, nsems: Int, semflag: Int): Int

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    wasiLibcFuchsiaSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemop")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemctl")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMsgctl")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaMsgget")
private external fun wasiLibcFuchsiaMsgget(key: Int, msgflg: Int): Int

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    wasiLibcFuchsiaMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMsgrcv")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMsgsnd")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMprotect")

public actual fun errnoLocation(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaErrnoLocation")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaFallocate")
private external fun wasiLibcFuchsiaFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcFuchsiaFallocate(fd, mode, offset, len)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPosixFallocate")
private external fun wasiLibcFuchsiaPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcFuchsiaPosixFallocate(fd, offset, len)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaReadahead")
private external fun wasiLibcFuchsiaReadahead(fd: Int, offset: Long, count: Long): Long

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    wasiLibcFuchsiaReadahead(fd, offset, count.toLong())

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSignalfd")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTimerfdCreate")
private external fun wasiLibcFuchsiaTimerfdCreate(clockid: Int, flags: Int): Int

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    wasiLibcFuchsiaTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTimerfdSettime")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPreadv")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaQuotactl")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaDup3")
private external fun wasiLibcFuchsiaDup3(oldfd: Int, newfd: Int, flags: Int): Int

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    wasiLibcFuchsiaDup3(oldfd, newfd, flags)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkostemp")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkostemps")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigtimedwait")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigwaitinfo")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaNlLanginfoL")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetnameinfo")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaReboot")
private external fun wasiLibcFuchsiaReboot(howTo: Int): Int

public actual fun reboot(howTo: CInt): CInt =
    wasiLibcFuchsiaReboot(howTo)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetfsgid")
private external fun wasiLibcFuchsiaSetfsgid(gid: Int): Int

public actual fun setfsgid(gid: GidT): CInt =
    wasiLibcFuchsiaSetfsgid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetfsuid")
private external fun wasiLibcFuchsiaSetfsuid(uid: Int): Int

public actual fun setfsuid(uid: UidT): CInt =
    wasiLibcFuchsiaSetfsuid(uid.toInt())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkfifoat")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaIfNameindex")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaIfFreenameindex")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSyncFileRange")
private external fun wasiLibcFuchsiaSyncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    wasiLibcFuchsiaSyncFileRange(fd, offset, nbytes, flags.toInt())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetifaddrs")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFreeifaddrs")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGlob")

public actual fun globfree(pglob: MutPtr<GlobT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGlobfree")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPosixMadvise")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaShmUnlink")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaTelldir")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMadvise")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMsync")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRecvfrom")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMkstemps")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFutimes")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaNlLanginfo")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaBind")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaWritev")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaReadv")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSendmsg")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRecvmsg")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetdomainname")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSetdomainname")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaVhangup")
private external fun wasiLibcFuchsiaVhangup(): Int

public actual fun vhangup(): CInt =
    wasiLibcFuchsiaVhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaRecvmmsg")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSync")
private external fun wasiLibcFuchsiaSync(): Unit

public actual fun sync(): Unit =
    wasiLibcFuchsiaSync()

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSyscall")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedSetaffinity")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUmount")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSchedGetPriorityMax")
private external fun wasiLibcFuchsiaSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcFuchsiaSchedGetPriorityMax(policy)

@kotlin.wasm.WasmImport("libc", "libcFuchsiaTee")
private external fun wasiLibcFuchsiaTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    wasiLibcFuchsiaTee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSettimeofday")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSplice")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaEventfd")
private external fun wasiLibcFuchsiaEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcFuchsiaEventfd(initval.toInt(), flags)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedRrGetInterval")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemTimedwait")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemGetvalue")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedSetparam")

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSwapoff")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaVmsplice")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaMount")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaPersonality")
private external fun wasiLibcFuchsiaPersonality(persona: Long): Int

public actual fun personality(persona: CUlong): CInt =
    wasiLibcFuchsiaPersonality(persona.toLong())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedGetparam")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPpoll")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadMutexTimedlock")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClone")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSchedGetscheduler")
private external fun wasiLibcFuchsiaSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcFuchsiaSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaClockNanosleep")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrGetguardsize")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAttrSetguardsize")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSethostname")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSchedGetPriorityMin")
private external fun wasiLibcFuchsiaSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcFuchsiaSchedGetPriorityMin(policy)

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaUmount2")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSwapon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSchedSetscheduler")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigsuspend")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrgidR")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigaltstack")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemClose")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaGetdtablesize")
private external fun wasiLibcFuchsiaGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcFuchsiaGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrnamR")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaInitgroups")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadSigmask")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemOpen")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrnam")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCancel")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadKill")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaDaemon")
private external fun wasiLibcFuchsiaDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcFuchsiaDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetpwuidR")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaSigwait")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadAtfork")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrgid")

@kotlin.wasm.WasmImport("libc", "libcFuchsiaSetgrent")
private external fun wasiLibcFuchsiaSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcFuchsiaSetgrent()

@kotlin.wasm.WasmImport("libc", "libcFuchsiaEndgrent")
private external fun wasiLibcFuchsiaEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcFuchsiaEndgrent()

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrent")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaGetgrouplist")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaFaccessat")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaPthreadCreate")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcFuchsiaDlIteratePhdr")
