@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = throw UnsupportedOperationException("WasmWasi foreign static in6addr_loopback requires a host memory/aggregate ABI adapter")

public actual val IN6ADDR_ANY: In6Addr
    get() = throw UnsupportedOperationException("WasmWasi foreign static in6addr_any requires a host memory/aggregate ABI adapter")

@kotlin.wasm.WasmImport("libc", "libcUnixIsalnum")
private external fun wasiLibcUnixIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcUnixIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsalpha")
private external fun wasiLibcUnixIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcUnixIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIscntrl")
private external fun wasiLibcUnixIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcUnixIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsdigit")
private external fun wasiLibcUnixIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcUnixIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsgraph")
private external fun wasiLibcUnixIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcUnixIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIslower")
private external fun wasiLibcUnixIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcUnixIslower(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsprint")
private external fun wasiLibcUnixIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcUnixIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIspunct")
private external fun wasiLibcUnixIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcUnixIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsspace")
private external fun wasiLibcUnixIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcUnixIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsupper")
private external fun wasiLibcUnixIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcUnixIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsxdigit")
private external fun wasiLibcUnixIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcUnixIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcUnixIsblank")
private external fun wasiLibcUnixIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcUnixIsblank(c)

@kotlin.wasm.WasmImport("libc", "libcUnixTolower")
private external fun wasiLibcUnixTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcUnixTolower(c)

@kotlin.wasm.WasmImport("libc", "libcUnixToupper")
private external fun wasiLibcUnixToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcUnixToupper(c)

public actual fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixQsort")

public actual fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsearch")

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFopen")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFreopen")

public actual fun fflush(file: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFflush")

public actual fun fclose(file: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFclose")

public actual fun remove(filename: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRemove")

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRename")

public actual fun tmpfile(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTmpfile")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSetvbuf")

public actual fun setbuf(stream: MutPtr, buf: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSetbuf")

@kotlin.wasm.WasmImport("libc", "libcUnixGetchar")
private external fun wasiLibcUnixGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcUnixGetchar()

@kotlin.wasm.WasmImport("libc", "libcUnixPutchar")
private external fun wasiLibcUnixPutchar(c: Int): Int

public actual fun putchar(c: CInt): CInt =
    wasiLibcUnixPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFgetc")

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFgets")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFputc")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFputs")

public actual fun puts(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPuts")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUngetc")

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFread")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFwrite")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFseek")

public actual fun ftell(stream: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFtell")

public actual fun rewind(stream: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRewind")

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFgetpos")

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFsetpos")

public actual fun feof(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFeof")

public actual fun ferror(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFerror")

public actual fun clearerr(stream: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixClearerr")

public actual fun perror(s: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPerror")

public actual fun atof(s: ConstPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAtof")

public actual fun atoi(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAtoi")

public actual fun atol(s: ConstPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAtol")

public actual fun atoll(s: ConstPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAtoll")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtod")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtof")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtol")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtoll")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtoul")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtoull")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCalloc")

public actual fun malloc(size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMalloc")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRealloc")

public actual fun free(p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFree")

@kotlin.wasm.WasmImport("libc", "libcUnixAbort")
private external fun wasiLibcUnixAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcUnixAbort()
    error("C noreturn function libcUnixAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcUnixExit")
private external fun wasiLibcUnixExit(status: Int): Unit

public actual fun exit(status: CInt): Nothing {
    wasiLibcUnixExit(status)
    error("C noreturn function libcUnixExit returned")
}

public actual fun system(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSystem")

public actual fun getenv(s: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetenv")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcpy")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrncpy")

public actual fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStpcpy")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcat")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrncat")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcmp")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrncmp")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcoll")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrchr")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrrchr")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrspn")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcspn")

public actual fun strdup(cs: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrdup")

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrndup")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrpbrk")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrstr")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcasecmp")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrncasecmp")

public actual fun strlen(cs: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrlen")

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrnlen")

public actual fun strerror(n: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrerror")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtok")

public actual fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrtokR")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrxfrm")

public actual fun strsignal(sig: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrsignal")

public actual fun wcslen(buf: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWcslen")

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWcstombs")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemchr")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWmemchr")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemcmp")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemcpy")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemmove")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemset")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMemccpy")

public actual fun getpwnam(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetpwnam")

public actual fun getpwuid(uid: UidT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetpwuid")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFprintf")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPrintf")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSnprintf")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSprintf")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFscanf")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixScanf")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSscanf")

@kotlin.wasm.WasmImport("libc", "libcUnixGetcharUnlocked")
private external fun wasiLibcUnixGetcharUnlocked(): Int

public actual fun getcharUnlocked(): CInt =
    wasiLibcUnixGetcharUnlocked()

@kotlin.wasm.WasmImport("libc", "libcUnixPutcharUnlocked")
private external fun wasiLibcUnixPutcharUnlocked(c: Int): Int

public actual fun putcharUnlocked(c: CInt): CInt =
    wasiLibcUnixPutcharUnlocked(c)

@kotlin.wasm.WasmImport("libc", "libcUnixSocket")
private external fun wasiLibcUnixSocket(domain: Int, ty: Int, protocol: Int): Int

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    wasiLibcUnixSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixConnect")

@kotlin.wasm.WasmImport("libc", "libcUnixListen")
private external fun wasiLibcUnixListen(socket: Int, backlog: Int): Int

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    wasiLibcUnixListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAccept")

public actual fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetpeername")

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetsockname")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSetsockopt")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSocketpair")

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSendto")

@kotlin.wasm.WasmImport("libc", "libcUnixShutdown")
private external fun wasiLibcUnixShutdown(socket: Int, how: Int): Int

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    wasiLibcUnixShutdown(socket, how)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixChmod")

@kotlin.wasm.WasmImport("libc", "libcUnixFchmod")
private external fun wasiLibcUnixFchmod(fd: Int, mode: Int): Int

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    wasiLibcUnixFchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFstat")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMkdir")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStat")

public actual fun pclose(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPclose")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFdopen")

public actual fun fileno(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFileno")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpen")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCreat")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFcntl")

public actual fun opendir(dirname: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpendir")

public actual fun readdir(dirp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixReaddir")

public actual fun closedir(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixClosedir")

public actual fun rewinddir(dirp: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRewinddir")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFchmodat")

@kotlin.wasm.WasmImport("libc", "libcUnixFchown")
private external fun wasiLibcUnixFchown(fd: Int, owner: Int, group: Int): Int

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    wasiLibcUnixFchown(fd, owner.toInt(), group.toInt())

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFchownat")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFstatat")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinkat")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRenameat")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSymlinkat")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUnlinkat")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAccess")

@kotlin.wasm.WasmImport("libc", "libcUnixAlarm")
private external fun wasiLibcUnixAlarm(seconds: Int): Int

public actual fun alarm(seconds: CUint): CUint =
    wasiLibcUnixAlarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixChdir")

@kotlin.wasm.WasmImport("libc", "libcUnixFchdir")
private external fun wasiLibcUnixFchdir(dirfd: Int): Int

public actual fun fchdir(dirfd: CInt): CInt =
    wasiLibcUnixFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixChown")

public actual fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLchown")

@kotlin.wasm.WasmImport("libc", "libcUnixClose")
private external fun wasiLibcUnixClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcUnixClose(fd)

@kotlin.wasm.WasmImport("libc", "libcUnixDup")
private external fun wasiLibcUnixDup(fd: Int): Int

public actual fun dup(fd: CInt): CInt =
    wasiLibcUnixDup(fd)

@kotlin.wasm.WasmImport("libc", "libcUnixDup2")
private external fun wasiLibcUnixDup2(src: Int, dst: Int): Int

public actual fun dup2(src: CInt, dst: CInt): CInt =
    wasiLibcUnixDup2(src, dst)

public actual fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExecl")

public actual fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExecle")

public actual fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExeclp")

public actual fun execv(prog: ConstPtr, argv: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExecv")

public actual fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExecve")

public actual fun execvp(c: ConstPtr, argv: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixExecvp")

@kotlin.wasm.WasmImport("libc", "libcUnixFork")
private external fun wasiLibcUnixFork(): Int

public actual fun fork(): PidT =
    wasiLibcUnixFork()

@kotlin.wasm.WasmImport("libc", "libcUnixFpathconf")
private external fun wasiLibcUnixFpathconf(filedes: Int, name: Int): Long

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    wasiLibcUnixFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetcwd")

@kotlin.wasm.WasmImport("libc", "libcUnixGetegid")
private external fun wasiLibcUnixGetegid(): Int

public actual fun getegid(): GidT =
    wasiLibcUnixGetegid().toUShort()

@kotlin.wasm.WasmImport("libc", "libcUnixGeteuid")
private external fun wasiLibcUnixGeteuid(): Int

public actual fun geteuid(): UidT =
    wasiLibcUnixGeteuid().toUShort()

@kotlin.wasm.WasmImport("libc", "libcUnixGetgid")
private external fun wasiLibcUnixGetgid(): Int

public actual fun getgid(): GidT =
    wasiLibcUnixGetgid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetgroups")

public actual fun getlogin(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetlogin")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetopt")

@kotlin.wasm.WasmImport("libc", "libcUnixGetpgid")
private external fun wasiLibcUnixGetpgid(pid: Int): Int

public actual fun getpgid(pid: PidT): PidT =
    wasiLibcUnixGetpgid(pid)

@kotlin.wasm.WasmImport("libc", "libcUnixGetpgrp")
private external fun wasiLibcUnixGetpgrp(): Int

public actual fun getpgrp(): PidT =
    wasiLibcUnixGetpgrp()

@kotlin.wasm.WasmImport("libc", "libcUnixGetpid")
private external fun wasiLibcUnixGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcUnixGetpid()

@kotlin.wasm.WasmImport("libc", "libcUnixGetppid")
private external fun wasiLibcUnixGetppid(): Int

public actual fun getppid(): PidT =
    wasiLibcUnixGetppid()

@kotlin.wasm.WasmImport("libc", "libcUnixGetuid")
private external fun wasiLibcUnixGetuid(): Int

public actual fun getuid(): UidT =
    wasiLibcUnixGetuid().toUShort()

@kotlin.wasm.WasmImport("libc", "libcUnixIsatty")
private external fun wasiLibcUnixIsatty(fd: Int): Int

public actual fun isatty(fd: CInt): CInt =
    wasiLibcUnixIsatty(fd)

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLink")

@kotlin.wasm.WasmImport("libc", "libcUnixLseek")
private external fun wasiLibcUnixLseek(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    wasiLibcUnixLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPathconf")

public actual fun pipe(fds: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPipe")

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPosixMemalign")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAlignedAlloc")

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRead")

public actual fun rmdir(path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRmdir")

@kotlin.wasm.WasmImport("libc", "libcUnixSeteuid")
private external fun wasiLibcUnixSeteuid(uid: Int): Int

public actual fun seteuid(uid: UidT): CInt =
    wasiLibcUnixSeteuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSetegid")
private external fun wasiLibcUnixSetegid(gid: Int): Int

public actual fun setegid(gid: GidT): CInt =
    wasiLibcUnixSetegid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSetgid")
private external fun wasiLibcUnixSetgid(gid: Int): Int

public actual fun setgid(gid: GidT): CInt =
    wasiLibcUnixSetgid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSetpgid")
private external fun wasiLibcUnixSetpgid(pid: Int, pgid: Int): Int

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    wasiLibcUnixSetpgid(pid, pgid)

@kotlin.wasm.WasmImport("libc", "libcUnixSetsid")
private external fun wasiLibcUnixSetsid(): Int

public actual fun setsid(): PidT =
    wasiLibcUnixSetsid()

@kotlin.wasm.WasmImport("libc", "libcUnixSetuid")
private external fun wasiLibcUnixSetuid(uid: Int): Int

public actual fun setuid(uid: UidT): CInt =
    wasiLibcUnixSetuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSetreuid")
private external fun wasiLibcUnixSetreuid(ruid: Int, euid: Int): Int

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    wasiLibcUnixSetreuid(ruid.toInt(), euid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSetregid")
private external fun wasiLibcUnixSetregid(rgid: Int, egid: Int): Int

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    wasiLibcUnixSetregid(rgid.toInt(), egid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSleep")
private external fun wasiLibcUnixSleep(secs: Int): Int

public actual fun sleep(secs: CUint): CUint =
    wasiLibcUnixSleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNanosleep")

@kotlin.wasm.WasmImport("libc", "libcUnixTcgetpgrp")
private external fun wasiLibcUnixTcgetpgrp(fd: Int): Int

public actual fun tcgetpgrp(fd: CInt): PidT =
    wasiLibcUnixTcgetpgrp(fd)

@kotlin.wasm.WasmImport("libc", "libcUnixTcsetpgrp")
private external fun wasiLibcUnixTcsetpgrp(fd: Int, pgrp: Int): Int

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    wasiLibcUnixTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTtyname")

public actual fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTtynameR")

public actual fun unlink(c: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUnlink")

public actual fun wait(status: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWait")

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWaitpid")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixWrite")

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPread")

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPwrite")

@kotlin.wasm.WasmImport("libc", "libcUnixUmask")
private external fun wasiLibcUnixUmask(mask: Int): Int

public actual fun umask(mask: ModeT): ModeT =
    wasiLibcUnixUmask(mask.toInt()).toUInt()

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUtime")

@kotlin.wasm.WasmImport("libc", "libcUnixKill")
private external fun wasiLibcUnixKill(pid: Int, sig: Int): Int

public actual fun kill(pid: PidT, sig: CInt): CInt =
    wasiLibcUnixKill(pid, sig)

@kotlin.wasm.WasmImport("libc", "libcUnixKillpg")
private external fun wasiLibcUnixKillpg(pgrp: Int, sig: Int): Int

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    wasiLibcUnixKillpg(pgrp, sig)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMlock")

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMunlock")

@kotlin.wasm.WasmImport("libc", "libcUnixMlockall")
private external fun wasiLibcUnixMlockall(flags: Int): Int

public actual fun mlockall(flags: CInt): CInt =
    wasiLibcUnixMlockall(flags)

@kotlin.wasm.WasmImport("libc", "libcUnixMunlockall")
private external fun wasiLibcUnixMunlockall(): Int

public actual fun munlockall(): CInt =
    wasiLibcUnixMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMmap")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMunmap")

public actual fun ifNametoindex(ifname: ConstPtr): CUint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixIfNametoindex")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixIfIndextoname")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLstat")

@kotlin.wasm.WasmImport("libc", "libcUnixFsync")
private external fun wasiLibcUnixFsync(fd: Int): Int

public actual fun fsync(fd: CInt): CInt =
    wasiLibcUnixFsync(fd)

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSetenv")

public actual fun unsetenv(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUnsetenv")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSymlink")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTruncate")

@kotlin.wasm.WasmImport("libc", "libcUnixFtruncate")
private external fun wasiLibcUnixFtruncate(fd: Int, length: Long): Int

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    wasiLibcUnixFtruncate(fd, length)

@kotlin.wasm.WasmImport("libc", "libcUnixSignal")
private external fun wasiLibcUnixSignal(signum: Int, handler: Long): Long

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    wasiLibcUnixSignal(signum, handler.toLong()).toULong()

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetrusage")

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRealpath")

public actual fun times(buf: MutPtr): ClockT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTimes")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadSelf")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadEqual")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadJoin")

public actual fun pthreadExit(value: MutPtr): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadExit")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadAttrDestroy")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadAttrGetstacksize")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadAttrSetstacksize")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadAttrSetdetachstate")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadDetach")

@kotlin.wasm.WasmImport("libc", "libcUnixSchedYield")
private external fun wasiLibcUnixSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcUnixSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcUnixPthreadKeyDelete")
private external fun wasiLibcUnixPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcUnixPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadSetspecific")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexInit")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexDestroy")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexLock")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexUnlock")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexattrInit")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexattrDestroy")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadMutexattrSettype")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondInit")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondTimedwait")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondSignal")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondBroadcast")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondDestroy")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondattrInit")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadCondattrDestroy")

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockInit")

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockDestroy")

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockRdlock")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockTryrdlock")

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockWrlock")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockTrywrlock")

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockUnlock")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockattrInit")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPthreadRwlockattrDestroy")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetsockopt")

@kotlin.wasm.WasmImport("libc", "libcUnixRaise")
private external fun wasiLibcUnixRaise(signum: Int): Int

public actual fun raise(signum: CInt): CInt =
    wasiLibcUnixRaise(signum)

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixUtimes")

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixDlopen")

public actual fun dlerror(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixDlerror")

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixDlsym")

public actual fun dlclose(handle: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixDlclose")

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetaddrinfo")

public actual fun freeaddrinfo(res: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFreeaddrinfo")

public actual fun hstrerror(errcode: CInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHstrerror")

public actual fun gaiStrerror(errcode: CInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGaiStrerror")

@kotlin.wasm.WasmImport("libc", "libcUnixResInit")
private external fun wasiLibcUnixResInit(): Int

public actual fun resInit(): CInt =
    wasiLibcUnixResInit()

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGmtimeR")

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLocaltimeR")

public actual fun mktime(tm: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMktime")

public actual fun time(time: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTime")

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGmtime")

public actual fun localtime(timeP: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLocaltime")

@kotlin.wasm.WasmImport("libc", "libcUnixDifftime")
private external fun wasiLibcUnixDifftime(time1: Long, time0: Long): Double

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    wasiLibcUnixDifftime(time1, time0)

public actual fun timegm(tm: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTimegm")

public actual fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMknod")

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixEndservent")
private external fun wasiLibcUnixEndservent(): Unit

public actual fun endservent(): Unit =
    wasiLibcUnixEndservent()

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetservbyname")

public actual fun getservbyport(port: CInt, proto: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetservbyport")

public actual fun getservent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetservent")

@kotlin.wasm.WasmImport("libc", "libcUnixSetservent")
private external fun wasiLibcUnixSetservent(stayopen: Int): Unit

public actual fun setservent(stayopen: CInt): Unit =
    wasiLibcUnixSetservent(stayopen)

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetprotobyname")

public actual fun getprotobynumber(proto: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetprotobynumber")

public actual fun chroot(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixChroot")

@kotlin.wasm.WasmImport("libc", "libcUnixUsleep")
private external fun wasiLibcUnixUsleep(secs: Int): Int

public actual fun usleep(secs: UsecondsT): CInt =
    wasiLibcUnixUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSend")

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRecv")

public actual fun putenv(string: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPutenv")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPoll")

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSelect")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSetlocale")

public actual fun localeconv(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLocaleconv")

public actual fun semWait(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSemWait")

public actual fun semTrywait(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSemTrywait")

public actual fun semPost(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSemPost")

public actual fun statvfs(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStatvfs")

public actual fun fstatvfs(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFstatvfs")

public actual fun sigemptyset(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigemptyset")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigaddset")

public actual fun sigfillset(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigfillset")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigdelset")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigismember")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigprocmask")

public actual fun sigpending(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigpending")

@kotlin.wasm.WasmImport("libc", "libcUnixSysconf")
private external fun wasiLibcUnixSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcUnixSysconf(name)

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMkfifo")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFseeko")

public actual fun ftello(stream: MutPtr): OffT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFtello")

@kotlin.wasm.WasmImport("libc", "libcUnixTcdrain")
private external fun wasiLibcUnixTcdrain(fd: Int): Int

public actual fun tcdrain(fd: CInt): CInt =
    wasiLibcUnixTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr): SpeedT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfgetispeed")

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfgetospeed")

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfsetispeed")

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfsetospeed")

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTcgetattr")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTcsetattr")

@kotlin.wasm.WasmImport("libc", "libcUnixTcflow")
private external fun wasiLibcUnixTcflow(fd: Int, action: Int): Int

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    wasiLibcUnixTcflow(fd, action)

@kotlin.wasm.WasmImport("libc", "libcUnixTcflush")
private external fun wasiLibcUnixTcflush(fd: Int, action: Int): Int

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    wasiLibcUnixTcflush(fd, action)

@kotlin.wasm.WasmImport("libc", "libcUnixTcgetsid")
private external fun wasiLibcUnixTcgetsid(fd: Int): Int

public actual fun tcgetsid(fd: CInt): PidT =
    wasiLibcUnixTcgetsid(fd)

@kotlin.wasm.WasmImport("libc", "libcUnixTcsendbreak")
private external fun wasiLibcUnixTcsendbreak(fd: Int, duration: Int): Int

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    wasiLibcUnixTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMkstemp")

public actual fun mkdtemp(template: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMkdtemp")

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixTmpnam")

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpenlog")

@kotlin.wasm.WasmImport("libc", "libcUnixCloselog")
private external fun wasiLibcUnixCloselog(): Unit

public actual fun closelog(): Unit =
    wasiLibcUnixCloselog()

@kotlin.wasm.WasmImport("libc", "libcUnixSetlogmask")
private external fun wasiLibcUnixSetlogmask(maskpri: Int): Int

public actual fun setlogmask(maskpri: CInt): CInt =
    wasiLibcUnixSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSyslog")

@kotlin.wasm.WasmImport("libc", "libcUnixNice")
private external fun wasiLibcUnixNice(incr: Int): Int

public actual fun nice(incr: CInt): CInt =
    wasiLibcUnixNice(incr)

@kotlin.wasm.WasmImport("libc", "libcUnixGrantpt")
private external fun wasiLibcUnixGrantpt(fd: Int): Int

public actual fun grantpt(fd: CInt): CInt =
    wasiLibcUnixGrantpt(fd)

@kotlin.wasm.WasmImport("libc", "libcUnixPosixOpenpt")
private external fun wasiLibcUnixPosixOpenpt(flags: Int): Int

public actual fun posixOpenpt(flags: CInt): CInt =
    wasiLibcUnixPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPtsname")

@kotlin.wasm.WasmImport("libc", "libcUnixUnlockpt")
private external fun wasiLibcUnixUnlockpt(fd: Int): Int

public actual fun unlockpt(fd: CInt): CInt =
    wasiLibcUnixUnlockpt(fd)

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStrcasestr")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixGetline")

@kotlin.wasm.WasmImport("libc", "libcUnixLockf")
private external fun wasiLibcUnixLockf(fd: Int, cmd: Int, len: Long): Int

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    wasiLibcUnixLockf(fd, cmd, len)

public actual fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAdjtime")

public actual fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixStpncpy")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigqueue")

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixConfstr")

public actual fun dladdr(addr: ConstPtr, info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixDladdr")

@kotlin.wasm.WasmImport("libc", "libcUnixFlock")
private external fun wasiLibcUnixFlock(fd: Int, operation: Int): Int

public actual fun flock(fd: CInt, operation: CInt): CInt =
    wasiLibcUnixFlock(fd, operation)

public actual fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpenWmemstream")

@kotlin.wasm.WasmImport("libc", "libcUnixGetsid")
private external fun wasiLibcUnixGetsid(pid: Int): Int

public actual fun getsid(pid: PidT): PidT =
    wasiLibcUnixGetsid(pid)

@kotlin.wasm.WasmImport("libc", "libcUnixPause")
private external fun wasiLibcUnixPause(): Int

public actual fun pause(): CInt =
    wasiLibcUnixPause()

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixMkdirat")

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpenat")

public actual fun fdopendir(fd: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFdopendir")

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixReaddirR")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixReadlinkat")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixReadlink")

public actual fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixPselect")

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSigaction")

public actual fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFmemopen")

public actual fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixOpenMemstream")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAtexit")

public actual fun cfmakeraw(termios: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfmakeraw")

public actual fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixCfsetspeed")

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixFnmatch")
