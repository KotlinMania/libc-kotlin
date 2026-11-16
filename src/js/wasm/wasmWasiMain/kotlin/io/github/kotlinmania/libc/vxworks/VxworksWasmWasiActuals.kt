@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcVxworksIsalnum")
private external fun wasiLibcVxworksIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcVxworksIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsalpha")
private external fun wasiLibcVxworksIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcVxworksIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIscntrl")
private external fun wasiLibcVxworksIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcVxworksIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsdigit")
private external fun wasiLibcVxworksIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcVxworksIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsgraph")
private external fun wasiLibcVxworksIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcVxworksIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIslower")
private external fun wasiLibcVxworksIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcVxworksIslower(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsprint")
private external fun wasiLibcVxworksIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcVxworksIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIspunct")
private external fun wasiLibcVxworksIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcVxworksIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsspace")
private external fun wasiLibcVxworksIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcVxworksIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsupper")
private external fun wasiLibcVxworksIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcVxworksIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsxdigit")
private external fun wasiLibcVxworksIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcVxworksIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksIsblank")
private external fun wasiLibcVxworksIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcVxworksIsblank(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksTolower")
private external fun wasiLibcVxworksTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcVxworksTolower(c)

@kotlin.wasm.WasmImport("libc", "libcVxworksToupper")
private external fun wasiLibcVxworksToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcVxworksToupper(c)

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFopen")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFreopen")

public actual fun fflush(file: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFflush")

public actual fun fclose(file: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFclose")

public actual fun remove(filename: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRemove")

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRename")

public actual fun tmpfile(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTmpfile")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSetvbuf")

public actual fun setbuf(stream: MutPtr, buf: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSetbuf")

@kotlin.wasm.WasmImport("libc", "libcVxworksGetchar")
private external fun wasiLibcVxworksGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcVxworksGetchar()

@kotlin.wasm.WasmImport("libc", "libcVxworksPutchar")
private external fun wasiLibcVxworksPutchar(c: Int): Int

public actual fun putchar(c: CInt): CInt =
    wasiLibcVxworksPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFgetc")

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFgets")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFputc")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFputs")

public actual fun puts(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPuts")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUngetc")

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFread")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFwrite")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFseek")

public actual fun ftell(stream: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFtell")

public actual fun rewind(stream: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRewind")

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFgetpos")

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFsetpos")

public actual fun feof(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFeof")

public actual fun ferror(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFerror")

public actual fun perror(s: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPerror")

public actual fun atof(s: ConstPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAtof")

public actual fun atoi(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAtoi")

public actual fun atol(s: ConstPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAtol")

public actual fun atoll(s: ConstPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAtoll")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtod")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtof")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtol")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtoll")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtoul")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtoull")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCalloc")

public actual fun malloc(size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMalloc")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRealloc")

public actual fun free(p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFree")

@kotlin.wasm.WasmImport("libc", "libcVxworksAbort")
private external fun wasiLibcVxworksAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcVxworksAbort()
    error("C noreturn function libcVxworksAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcVxworksExit")
private external fun wasiLibcVxworksExit(status: Int): Unit

public actual fun exit(status: CInt): Nothing {
    wasiLibcVxworksExit(status)
    error("C noreturn function libcVxworksExit returned")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAtexit")

public actual fun system(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSystem")

public actual fun getenv(s: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetenv")

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCfgetospeed")

public actual fun cfmakeraw(termios: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCfmakeraw")

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCfsetispeed")

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCfsetospeed")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcpy")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrncpy")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcat")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrncat")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcmp")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrncmp")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcoll")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrchr")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrrchr")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrspn")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcspn")

public actual fun strdup(cs: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrdup")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrpbrk")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrstr")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrcasecmp")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrncasecmp")

public actual fun strlen(cs: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrlen")

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrnlen")

public actual fun strerror(n: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrerror")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrtok")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrxfrm")

public actual fun wcslen(buf: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWcslen")

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWcstombs")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemchr")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWmemchr")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemcmp")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemcpy")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemccpy")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemmove")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemset")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAlignedAlloc")

public actual fun uname(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUname")

public actual fun times(buf: MutPtr): ClockT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTimes")

@kotlin.wasm.WasmImport("libc", "libcVxworksTcflush")
private external fun wasiLibcVxworksTcflush(fd: Int, action: Int): Int

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    wasiLibcVxworksTcflush(fd, action)

public actual fun pclose(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPclose")

public actual fun mkdtemp(template: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMkdtemp")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLinkat")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUnlinkat")

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetprotobyname")

public actual fun getprotobynumber(proto: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetprotobynumber")

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetservbyname")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFchownat")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFprintf")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPrintf")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSnprintf")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSprintf")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFscanf")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksScanf")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSscanf")

@kotlin.wasm.WasmImport("libc", "libcVxworksGetcharUnlocked")
private external fun wasiLibcVxworksGetcharUnlocked(): Int

public actual fun getcharUnlocked(): CInt =
    wasiLibcVxworksGetcharUnlocked()

@kotlin.wasm.WasmImport("libc", "libcVxworksPutcharUnlocked")
private external fun wasiLibcVxworksPutcharUnlocked(c: Int): Int

public actual fun putcharUnlocked(c: CInt): CInt =
    wasiLibcVxworksPutcharUnlocked(c)

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStat")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFdopen")

public actual fun fileno(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFileno")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksCreat")

public actual fun rewinddir(dirp: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRewinddir")

@kotlin.wasm.WasmImport("libc", "libcVxworksFchown")
private external fun wasiLibcVxworksFchown(fd: Int, owner: Int, group: Int): Int

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    wasiLibcVxworksFchown(fd, owner.toInt(), group.toInt())

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAccess")

@kotlin.wasm.WasmImport("libc", "libcVxworksAlarm")
private external fun wasiLibcVxworksAlarm(seconds: Int): Int

public actual fun alarm(seconds: CUint): CUint =
    wasiLibcVxworksAlarm(seconds.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcVxworksFchdir")
private external fun wasiLibcVxworksFchdir(dirfd: Int): Int

public actual fun fchdir(dirfd: CInt): CInt =
    wasiLibcVxworksFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksChown")

@kotlin.wasm.WasmImport("libc", "libcVxworksFpathconf")
private external fun wasiLibcVxworksFpathconf(filedes: Int, name: Int): Long

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    wasiLibcVxworksFpathconf(filedes, name)

@kotlin.wasm.WasmImport("libc", "libcVxworksGetegid")
private external fun wasiLibcVxworksGetegid(): Int

public actual fun getegid(): GidT =
    wasiLibcVxworksGetegid().toUShort()

@kotlin.wasm.WasmImport("libc", "libcVxworksGeteuid")
private external fun wasiLibcVxworksGeteuid(): Int

public actual fun geteuid(): UidT =
    wasiLibcVxworksGeteuid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetgroups")

public actual fun getlogin(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetlogin")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetopt")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPathconf")

@kotlin.wasm.WasmImport("libc", "libcVxworksPause")
private external fun wasiLibcVxworksPause(): Int

public actual fun pause(): CInt =
    wasiLibcVxworksPause()

@kotlin.wasm.WasmImport("libc", "libcVxworksSeteuid")
private external fun wasiLibcVxworksSeteuid(uid: Int): Int

public actual fun seteuid(uid: UidT): CInt =
    wasiLibcVxworksSeteuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcVxworksSetegid")
private external fun wasiLibcVxworksSetegid(gid: Int): Int

public actual fun setegid(gid: GidT): CInt =
    wasiLibcVxworksSetegid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcVxworksSleep")
private external fun wasiLibcVxworksSleep(secs: Int): Int

public actual fun sleep(secs: CUint): CUint =
    wasiLibcVxworksSleep(secs.toInt()).toUInt()

public actual fun ttyname(fd: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTtyname")

public actual fun wait(status: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWait")

@kotlin.wasm.WasmImport("libc", "libcVxworksUmask")
private external fun wasiLibcVxworksUmask(mask: Int): Int

public actual fun umask(mask: ModeT): ModeT =
    wasiLibcVxworksUmask(mask)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMlock")

@kotlin.wasm.WasmImport("libc", "libcVxworksMlockall")
private external fun wasiLibcVxworksMlockall(flags: Int): Int

public actual fun mlockall(flags: CInt): CInt =
    wasiLibcVxworksMlockall(flags)

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMunlock")

@kotlin.wasm.WasmImport("libc", "libcVxworksMunlockall")
private external fun wasiLibcVxworksMunlockall(): Int

public actual fun munlockall(): CInt =
    wasiLibcVxworksMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMmap")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMunmap")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMprotect")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMsync")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTruncate")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksShmOpen")

public actual fun shmUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksShmUnlink")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGettimeofday")

public actual fun pthreadExit(value: MutPtr): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadExit")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrSetdetachstate")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadEqual")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksStrerrorR")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigaddset")

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigaction")

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUtimes")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUtimensat")

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksDlopen")

public actual fun dlerror(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksDlerror")

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksDlsym")

public actual fun dlclose(handle: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksDlclose")

public actual fun dladdr(addr: MutPtr, info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksDladdr")

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGmtimeR")

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLocaltimeR")

public actual fun mktime(tm: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMktime")

public actual fun time(time: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTime")

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGmtime")

public actual fun localtime(timeP: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLocaltime")

public actual fun timegm(tm: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTimegm")

@kotlin.wasm.WasmImport("libc", "libcVxworksDifftime")
private external fun wasiLibcVxworksDifftime(time1: Long, time0: Long): Double

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    wasiLibcVxworksDifftime(time1, time0)

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGethostname")

@kotlin.wasm.WasmImport("libc", "libcVxworksUsleep")
private external fun wasiLibcVxworksUsleep(secs: Long): Int

public actual fun usleep(secs: UsecondsT): CInt =
    wasiLibcVxworksUsleep(secs.toLong())

public actual fun putenv(string: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPutenv")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSetlocale")

public actual fun localeconv(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLocaleconv")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigprocmask")

public actual fun sigpending(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigpending")

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMkfifo")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFseeko")

public actual fun ftello(stream: MutPtr): OffT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFtello")

public actual fun mkstemp(template: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMkstemp")

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTmpnam")

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksOpenlog")

@kotlin.wasm.WasmImport("libc", "libcVxworksCloselog")
private external fun wasiLibcVxworksCloselog(): Unit

public actual fun closelog(): Unit =
    wasiLibcVxworksCloselog()

@kotlin.wasm.WasmImport("libc", "libcVxworksSetlogmask")
private external fun wasiLibcVxworksSetlogmask(maskpri: Int): Int

public actual fun setlogmask(maskpri: CInt): CInt =
    wasiLibcVxworksSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSyslog")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetline")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTcsetattr")

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTcgetattr")

@kotlin.wasm.WasmImport("libc", "libcVxworksTcsendbreak")
private external fun wasiLibcVxworksTcsendbreak(fd: Int, duration: Int): Int

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    wasiLibcVxworksTcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksConfstr")

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFnmatch")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSymlinkat")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFchmodat")

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUtime")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMemalign")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetcwd")

public actual fun chdir(attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksChdir")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexattrInit")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexattrDestroy")

public actual fun pthreadMutexattrSettype(pAttr: MutPtr, pType: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexattrSettype")

public actual fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexInit")

public actual fun pthreadMutexDestroy(mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexDestroy")

public actual fun pthreadMutexLock(mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexLock")

public actual fun pthreadMutexTrylock(mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexTrylock")

public actual fun pthreadMutexTimedlock(attr: MutPtr, spec: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexTimedlock")

public actual fun pthreadMutexUnlock(mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadMutexUnlock")

public actual fun pthreadAttrSetname(pAttr: MutPtr, name: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrSetname")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrSetstacksize")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrGetstacksize")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrInit")

public actual fun pthreadCreate(pThread: MutPtr, pAttr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCreate")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadSetschedparam")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadGetschedparam")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrSetinheritsched")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrSetschedpolicy")

public actual fun pthreadAttrDestroy(thread: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrDestroy")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadDetach")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAtfork")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFstat")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLstat")

@kotlin.wasm.WasmImport("libc", "libcVxworksFtruncate")
private external fun wasiLibcVxworksFtruncate(fd: Int, length: Long): Int

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    wasiLibcVxworksFtruncate(fd, length)

public actual fun readdirR(pDir: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksReaddirR")

public actual fun readdir(pDir: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksReaddir")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksOpen")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPoll")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondattrInit")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondattrDestroy")

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr, pClockId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondattrGetclock")

public actual fun pthreadCondattrSetclock(pAttr: MutPtr, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondattrSetclock")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondInit")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondDestroy")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondSignal")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondBroadcast")

public actual fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondWait")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockattrInit")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockattrDestroy")

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr, attr2: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockattrSetmaxreaders")

public actual fun pthreadRwlockInit(attr: MutPtr, host: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockInit")

public actual fun pthreadRwlockDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockDestroy")

public actual fun pthreadRwlockRdlock(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockRdlock")

public actual fun pthreadRwlockTryrdlock(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockTryrdlock")

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr, host: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockTimedrdlock")

public actual fun pthreadRwlockWrlock(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockWrlock")

public actual fun pthreadRwlockTrywrlock(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockTrywrlock")

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr, host: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockTimedwrlock")

public actual fun pthreadRwlockUnlock(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadRwlockUnlock")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcVxworksPthreadKeyDelete")
private external fun wasiLibcVxworksPthreadKeyDelete(key: Long): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcVxworksPthreadKeyDelete(key.toLong())

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadSetspecific")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadGetspecific")

public actual fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadCondTimedwait")

public actual fun pthreadAttrGetname(attr: MutPtr, name: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadAttrGetname")

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadJoin")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadSelf")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksClockGettime")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksClockSettime")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksClockGetres")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksClockNanosleep")

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksNanosleep")

public actual fun accept(s: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksAccept")

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksBind")

public actual fun connect(s: CInt, name: ConstPtr, namelen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksConnect")

public actual fun getpeername(s: CInt, name: MutPtr, namelen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetpeername")

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetsockname")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetsockopt")

@kotlin.wasm.WasmImport("libc", "libcVxworksListen")
private external fun wasiLibcVxworksListen(socket: Int, backlog: Int): Int

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    wasiLibcVxworksListen(socket, backlog)

public actual fun recv(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRecv")

public actual fun recvfrom(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt, from: MutPtr, pFromLen: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRecvfrom")

public actual fun recvmsg(socket: CInt, mp: MutPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRecvmsg")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSend")

public actual fun sendmsg(socket: CInt, mp: ConstPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSendmsg")

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSendto")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSetsockopt")

@kotlin.wasm.WasmImport("libc", "libcVxworksShutdown")
private external fun wasiLibcVxworksShutdown(s: Int, how: Int): Int

public actual fun shutdown(s: CInt, how: CInt): CInt =
    wasiLibcVxworksShutdown(s, how)

@kotlin.wasm.WasmImport("libc", "libcVxworksSocket")
private external fun wasiLibcVxworksSocket(domain: Int, type: Int, protocol: Int): Int

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    wasiLibcVxworksSocket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksIoctl")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFcntl")

public actual fun gaiStrerror(errcode: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGaiStrerror")

@kotlin.wasm.WasmImport("libc", "libcVxworksClose")
private external fun wasiLibcVxworksClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcVxworksClose(fd)

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRead")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWrite")

@kotlin.wasm.WasmImport("libc", "libcVxworksIsatty")
private external fun wasiLibcVxworksIsatty(fd: Int): Int

public actual fun isatty(fd: CInt): CInt =
    wasiLibcVxworksIsatty(fd)

@kotlin.wasm.WasmImport("libc", "libcVxworksDup")
private external fun wasiLibcVxworksDup(src: Int): Int

public actual fun dup(src: CInt): CInt =
    wasiLibcVxworksDup(src)

@kotlin.wasm.WasmImport("libc", "libcVxworksDup2")
private external fun wasiLibcVxworksDup2(src: Int, dst: Int): Int

public actual fun dup2(src: CInt, dst: CInt): CInt =
    wasiLibcVxworksDup2(src, dst)

public actual fun pipe(fds: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPipe")

public actual fun unlink(pathname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUnlink")

@kotlin.wasm.WasmImport("libc", "libcVxworksLseek")
private external fun wasiLibcVxworksLseek(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    wasiLibcVxworksLseek(fd, offset, whence)

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksGetaddrinfo")

public actual fun freeaddrinfo(res: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksFreeaddrinfo")

@kotlin.wasm.WasmImport("libc", "libcVxworksSignal")
private external fun wasiLibcVxworksSignal(signum: Int, handler: Long): Long

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    wasiLibcVxworksSignal(signum, handler.toLong()).toULong()

@kotlin.wasm.WasmImport("libc", "libcVxworksGetpid")
private external fun wasiLibcVxworksGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcVxworksGetpid()

@kotlin.wasm.WasmImport("libc", "libcVxworksGetppid")
private external fun wasiLibcVxworksGetppid(): Int

public actual fun getppid(): PidT =
    wasiLibcVxworksGetppid()

@kotlin.wasm.WasmImport("libc", "libcVxworksSetpgid")
private external fun wasiLibcVxworksSetpgid(pid: Int, pgid: Int): Int

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    wasiLibcVxworksSetpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWaitpid")

@kotlin.wasm.WasmImport("libc", "libcVxworksSysconf")
private external fun wasiLibcVxworksSysconf(attr: Int): Long

public actual fun sysconf(attr: CInt): CLong =
    wasiLibcVxworksSysconf(attr)

public actual fun setenv(envVarName: ConstPtr, envVarValue: ConstPtr, overwrite: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSetenv")

public actual fun unsetenv(envVarName: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksUnsetenv")

public actual fun realpath(fileName: ConstPtr, resolvedName: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRealpath")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksLink")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsize: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksReadlink")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSymlink")

public actual fun opendir(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksOpendir")

public actual fun rmdir(path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRmdir")

public actual fun mkdir(dirName: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMkdir")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksChmod")

@kotlin.wasm.WasmImport("libc", "libcVxworksFchmod")
private external fun wasiLibcVxworksFchmod(attr1: Int, attr2: Int): Int

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    wasiLibcVxworksFchmod(attr1, attr2)

@kotlin.wasm.WasmImport("libc", "libcVxworksFsync")
private external fun wasiLibcVxworksFsync(fd: Int): Int

public actual fun fsync(fd: CInt): CInt =
    wasiLibcVxworksFsync(fd)

public actual fun closedir(ptr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksClosedir")

@kotlin.wasm.WasmImport("libc", "libcVxworksSchedGetPriorityMax")
private external fun wasiLibcVxworksSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcVxworksSchedGetPriorityMax(policy)

@kotlin.wasm.WasmImport("libc", "libcVxworksSchedGetPriorityMin")
private external fun wasiLibcVxworksSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcVxworksSchedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSchedSetparam")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSchedGetparam")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSchedSetscheduler")

@kotlin.wasm.WasmImport("libc", "libcVxworksSchedGetscheduler")
private external fun wasiLibcVxworksSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcVxworksSchedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSchedRrGetInterval")

@kotlin.wasm.WasmImport("libc", "libcVxworksSchedYield")
private external fun wasiLibcVxworksSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcVxworksSchedYield()

@kotlin.wasm.WasmImport("libc", "libcVxworksErrnoSet")
private external fun wasiLibcVxworksErrnoSet(err: Int): Int

public actual fun errnoSet(err: CInt): CInt =
    wasiLibcVxworksErrnoSet(err)

@kotlin.wasm.WasmImport("libc", "libcVxworksErrnoGet")
private external fun wasiLibcVxworksErrnoGet(): Int

public actual fun errnoGet(): CInt =
    wasiLibcVxworksErrnoGet()

@kotlin.wasm.WasmImport("libc", "libcVxworksSetgid")
private external fun wasiLibcVxworksSetgid(gid: Int): Int

public actual fun setgid(gid: GidT): CInt =
    wasiLibcVxworksSetgid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcVxworksGetgid")
private external fun wasiLibcVxworksGetgid(): Int

public actual fun getgid(): GidT =
    wasiLibcVxworksGetgid().toUShort()

@kotlin.wasm.WasmImport("libc", "libcVxworksSetuid")
private external fun wasiLibcVxworksSetuid(uid: Int): Int

public actual fun setuid(uid: UidT): CInt =
    wasiLibcVxworksSetuid(uid.toInt())

@kotlin.wasm.WasmImport("libc", "libcVxworksGetuid")
private external fun wasiLibcVxworksGetuid(): Int

public actual fun getuid(): UidT =
    wasiLibcVxworksGetuid().toUShort()

public actual fun sigemptyset(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigemptyset")

public actual fun sigfillset(set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigfillset")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigdelset")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigismember")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPthreadSigmask")

@kotlin.wasm.WasmImport("libc", "libcVxworksKill")
private external fun wasiLibcVxworksKill(pid: Int, signo: Int): Int

public actual fun kill(pid: PidT, signo: CInt): CInt =
    wasiLibcVxworksKill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksSigqueue")

@kotlin.wasm.WasmImport("libc", "libcVxworksTaskKill")
private external fun wasiLibcVxworksTaskKill(taskId: Int, signo: Int): Int

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    wasiLibcVxworksTaskKill(taskId, signo)

@kotlin.wasm.WasmImport("libc", "libcVxworksRaise")
private external fun wasiLibcVxworksRaise(signo: Int): Int

public actual fun raise(signo: CInt): CInt =
    wasiLibcVxworksRaise(signo)

@kotlin.wasm.WasmImport("libc", "libcVxworksTaskIdSelf")
private external fun wasiLibcVxworksTaskIdSelf(): Int

public actual fun taskIdSelf(): TaskId =
    wasiLibcVxworksTaskIdSelf()

@kotlin.wasm.WasmImport("libc", "libcVxworksTaskDelay")
private external fun wasiLibcVxworksTaskDelay(ticks: Int): Int

public actual fun taskDelay(ticks: VxTicksT): CInt =
    wasiLibcVxworksTaskDelay(ticks.toInt())

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTaskNameSet")

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr, bufsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksTaskNameGet")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRtpInfoGet")

public actual fun rtpSpawn(pubrtpFileName: ConstPtr, argv: MutPtr, envp: MutPtr, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRtpSpawn")

public actual fun pathIsAbsolute(filepath: ConstPtr, pNameTail: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksPathIsAbsolute")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksWritev")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksReadv")

public actual fun randBytes(buf: MutPtr, length: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRandBytes")

public actual fun randABytes(buf: MutPtr, length: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRandABytes")

public actual fun randUBytes(buf: MutPtr, length: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksRandUBytes")

@kotlin.wasm.WasmImport("libc", "libcVxworksRandSecure")
private external fun wasiLibcVxworksRandSecure(): Int

public actual fun randSecure(): CInt =
    wasiLibcVxworksRandSecure()

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqOpen")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqClose")

public actual fun mqUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqUnlink")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqReceive")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqTimedreceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqSend")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqTimedsend")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqGetattr")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcVxworksMqSetattr")

@kotlin.wasm.WasmImport("libc", "libcVxworksVxCpuEnabledGet")
private external fun wasiLibcVxworksVxCpuEnabledGet(): Int

public actual fun vxCpuEnabledGet(): CpusetT =
    wasiLibcVxworksVxCpuEnabledGet().toUInt()

@kotlin.wasm.WasmImport("libc", "libcVxworksVxCpuConfiguredGet")
private external fun wasiLibcVxworksVxCpuConfiguredGet(): Int

public actual fun vxCpuConfiguredGet(): CpusetT =
    wasiLibcVxworksVxCpuConfiguredGet().toUInt()
