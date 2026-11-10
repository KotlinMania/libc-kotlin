@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fflush(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vprintf(format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewind(stream: FILE?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearerr(stream: FILE?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perror(s: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rename(old: String?, new: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
