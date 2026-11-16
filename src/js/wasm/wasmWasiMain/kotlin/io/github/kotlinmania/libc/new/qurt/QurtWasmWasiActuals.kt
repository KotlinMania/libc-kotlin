@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun opendir(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtOpendir")

public actual fun readdir(dirp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtReaddir")

public actual fun closedir(dirp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtClosedir")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMkdir")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadAttrGetstack")

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadAttrSetstack")

public actual fun clockGetcpuclockid(pid: PidT, clockId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtClockGetcpuclockid")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSemOpen")

public actual fun semClose(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSemClose")

public actual fun semUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSemUnlink")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtAlignedAlloc")

public actual fun strlen(s: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrlen")

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrcpy")

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrncpy")

public actual fun strcat(dest: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrcat")

public actual fun strncat(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrncat")

public actual fun strcmp(s1: ConstPtr, s2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrcmp")

public actual fun strncmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrncmp")

public actual fun strcoll(s1: ConstPtr, s2: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrcoll")

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrxfrm")

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrchr")

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrrchr")

public actual fun strspn(s: ConstPtr, accept: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrspn")

public actual fun strcspn(s: ConstPtr, reject: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrcspn")

public actual fun strpbrk(s: ConstPtr, accept: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrpbrk")

public actual fun strstr(haystack: ConstPtr, needle: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrstr")

public actual fun strtok(s: MutPtr, delim: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrtok")

public actual fun strerror(errnum: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStrerror")

public actual fun memchr(s: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMemchr")

public actual fun memcmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMemcmp")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMemcpy")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMemmove")

public actual fun memset(s: MutPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtMemset")

@kotlin.wasm.WasmImport("libc", "libcNewQurtFork")
private external fun wasiLibcNewQurtFork(): Int

public actual fun fork(): PidT =
    wasiLibcNewQurtFork()

public actual fun execve(filename: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtExecve")

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsalnum")
private external fun wasiLibcNewQurtIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcNewQurtIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsalpha")
private external fun wasiLibcNewQurtIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcNewQurtIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIscntrl")
private external fun wasiLibcNewQurtIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcNewQurtIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsdigit")
private external fun wasiLibcNewQurtIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcNewQurtIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsgraph")
private external fun wasiLibcNewQurtIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcNewQurtIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIslower")
private external fun wasiLibcNewQurtIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcNewQurtIslower(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsprint")
private external fun wasiLibcNewQurtIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcNewQurtIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIspunct")
private external fun wasiLibcNewQurtIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcNewQurtIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsspace")
private external fun wasiLibcNewQurtIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcNewQurtIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsupper")
private external fun wasiLibcNewQurtIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcNewQurtIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtIsxdigit")
private external fun wasiLibcNewQurtIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcNewQurtIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtTolower")
private external fun wasiLibcNewQurtTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcNewQurtTolower(c)

@kotlin.wasm.WasmImport("libc", "libcNewQurtToupper")
private external fun wasiLibcNewQurtToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcNewQurtToupper(c)
