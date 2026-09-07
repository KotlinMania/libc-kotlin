@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.FposT
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import platform.posix.FILE as PlatformFile

public actual fun fopen(filename: String?, mode: String?): FILE? {
    val result = platform.posix.fopen(filename, mode)
    return result?.let { FILE(it.toLong()) }
}

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val filePtr: CPointer<PlatformFile>? = file?.handle?.toCPointer()
    val result = platform.posix.freopen(filename, mode, filePtr)
    return result?.let { FILE(it.toLong()) }
}

public actual fun fflush(file: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = file?.handle?.toCPointer()
    return platform.posix.fflush(filePtr)
}

public actual fun fclose(file: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = file?.handle?.toCPointer()
    return platform.posix.fclose(filePtr)
}

public actual fun tmpfile(): FILE? {
    val result = platform.posix.tmpfile()
    return result?.let { FILE(it.toLong()) }
}

public actual fun fgetc(stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.fgetc(filePtr)
}

public actual fun fputc(c: CInt, stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.fputc(c, filePtr)
}

public actual fun fputs(s: String?, stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.fputs(s, filePtr)
}

public actual fun ungetc(c: CInt, stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.ungetc(c, filePtr)
}

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.fseek(filePtr, offset, whence)
}

public actual fun ftell(stream: FILE?): CLong {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.ftell(filePtr)
}

public actual fun feof(stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.feof(filePtr)
}

public actual fun ferror(stream: FILE?): CInt {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    return platform.posix.ferror(filePtr)
}

public actual fun rewind(stream: FILE?) {
    val filePtr: CPointer<PlatformFile>? = stream?.handle?.toCPointer()
    platform.posix.rewind(filePtr)
}

public actual fun fdopen(fd: CInt, mode: String?): FILE? {
    val result = platform.posix.fdopen(fd, mode)
    return result?.let { FILE(it.toLong()) }
}

public actual fun perror(s: String?) {
    platform.posix.perror(s)
}

public actual fun remove(filename: String?): CInt = platform.posix.remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt = platform.posix.rename(oldname, newname)

public actual fun getchar(): CInt = platform.posix.getchar()

public actual fun putchar(c: CInt): CInt = platform.posix.putchar(c)

public actual fun puts(s: String?): CInt = platform.posix.puts(s)

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
