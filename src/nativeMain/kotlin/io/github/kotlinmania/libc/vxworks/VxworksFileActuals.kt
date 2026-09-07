@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.FposT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fopen(filename: String?, mode: String?): FILE? {
    val result = libc.cinterop.libc_fopen(filename, mode)
    return result?.let { FILE(it.toLong()) }
}

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val filePtr: CPointer<ByteVar>? = file?.handle?.toCPointer()
    val result = libc.cinterop.libc_freopen(filename, mode, filePtr)
    return result?.let { FILE(it.toLong()) }
}

public actual fun fflush(file: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = file?.handle?.toCPointer()
    return libc.cinterop.libc_fflush(filePtr)
}

public actual fun fclose(file: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = file?.handle?.toCPointer()
    return libc.cinterop.libc_fclose(filePtr)
}

public actual fun tmpfile(): FILE? {
    val result = libc.cinterop.libc_tmpfile()
    return result?.let { FILE(it.toLong()) }
}

public actual fun fgetc(stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_fgetc(filePtr)
}

public actual fun fputc(c: CInt, stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_fputc(c, filePtr)
}

public actual fun fputs(s: String?, stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_fputs(s, filePtr)
}

public actual fun ungetc(c: CInt, stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_ungetc(c, filePtr)
}

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_fseek(filePtr, offset, whence)
}

public actual fun ftell(stream: FILE?): CLong {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_ftell(filePtr)
}

public actual fun feof(stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_feof(filePtr)
}

public actual fun ferror(stream: FILE?): CInt {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    return libc.cinterop.libc_ferror(filePtr)
}

public actual fun rewind(stream: FILE?) {
    val filePtr: CPointer<ByteVar>? = stream?.handle?.toCPointer()
    libc.cinterop.libc_rewind(filePtr)
}

public actual fun fdopen(fd: CInt, mode: String?): FILE? {
    val result = libc.cinterop.libc_fdopen(fd, mode)
    return result?.let { FILE(it.toLong()) }
}

public actual fun perror(s: String?) {
    libc.cinterop.libc_perror(s)
}

public actual fun remove(filename: String?): CInt = libc.cinterop.libc_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt = libc.cinterop.libc_rename(oldname, newname)

public actual fun getchar(): CInt = libc.cinterop.libc_getchar()

public actual fun putchar(c: CInt): CInt = libc.cinterop.libc_putchar(c)

public actual fun puts(s: String?): CInt = libc.cinterop.libc_puts(s)

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires CValuesRef bridge for buffer param")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires CValuesRef bridge for buf param")
}

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires COpaquePointer + FILE bridge")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires COpaquePointer + FILE bridge")

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires FposT bridge")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires FposT bridge")
