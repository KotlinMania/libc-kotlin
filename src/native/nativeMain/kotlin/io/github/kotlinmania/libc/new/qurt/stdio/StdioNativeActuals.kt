@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.FposT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioClearerr
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFclose
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFeof
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFerror
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFflush
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFgetc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFgetpos
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFgets
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFopen
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFputc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFputs
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFread
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFreopen
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFscanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFseek
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFsetpos
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFtell
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioFwrite
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioGetchar
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioGets
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioPerror
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioPrintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioPutchar
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioPuts
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioRemove
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioRename
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioRewind
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioScanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioSetbuf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioSetvbuf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioSnprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioSprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioSscanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioTmpfile
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioTmpnam
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioUngetc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioVfprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioVprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioVsnprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libcNewQurtStdioVsprintf
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcNewQurtStdioFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, stream: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcNewQurtStdioFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fclose(stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fflush(stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFflush(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    libcNewQurtStdioFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nmemb, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    libcNewQurtStdioFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nmemb, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libcNewQurtStdioGetchar()

public actual fun putchar(c: CInt): CInt =
    libcNewQurtStdioPutchar(c)

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(s: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcNewQurtStdioFgets(s.rawAddress.toCPointer<ByteVar>(), size, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun gets(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStdioGets(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun puts(s: ConstPtr<CChar>): CInt =
    libcNewQurtStdioPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vprintf(format: ConstPtr<CChar>, ap: VaList): CInt =
    libcNewQurtStdioVprintf(format.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun vfprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, ap: VaList): CInt =
    libcNewQurtStdioVfprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun vsprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, ap: VaList): CInt =
    libcNewQurtStdioVsprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, ap: VaList): CInt =
    libcNewQurtStdioVsnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcNewQurtStdioSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    libcNewQurtStdioFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    libcNewQurtStdioFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr<FILE>) {
    libcNewQurtStdioRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    libcNewQurtStdioFgetpos(stream.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    libcNewQurtStdioFsetpos(stream.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun clearerr(stream: MutPtr<FILE>) {
    libcNewQurtStdioClearerr(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun feof(stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    libcNewQurtStdioFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun perror(s: ConstPtr<CChar>) {
    libcNewQurtStdioPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    libcNewQurtStdioRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(old: ConstPtr<CChar>, new: ConstPtr<CChar>): CInt =
    libcNewQurtStdioRename(old.rawAddress.toCPointer<ByteVar>(), new.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(libcNewQurtStdioTmpfile()?.toLong() ?: 0L)

public actual fun tmpnam(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStdioTmpnam(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcNewQurtStdioSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>) {
    libcNewQurtStdioSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())
}
