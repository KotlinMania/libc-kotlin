@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtStdioJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtStdioFopen(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioFreopen(filename: Long, mode: Long, stream: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioFclose(stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFflush(stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFread(ptr: Long, size: Long, nmemb: Long, stream: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioFwrite(ptr: Long, size: Long, nmemb: Long, stream: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioFgetc(stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioGetchar(): Int

    @JvmStatic
    external fun libcNewQurtStdioPutchar(c: Int): Int

    @JvmStatic
    external fun libcNewQurtStdioUngetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFgets(s: Long, size: Int, stream: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioFputs(s: Long, stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioGets(s: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioPuts(s: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioSprintf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioSnprintf(s: Long, n: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioVprintf(format: Long, ap: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioVfprintf(stream: Long, format: Long, ap: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioVsprintf(s: Long, format: Long, ap: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioVsnprintf(s: Long, n: Long, format: Long, ap: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioScanf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFscanf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioSscanf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcNewQurtStdioFtell(stream: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioRewind(stream: Long)

    @JvmStatic
    external fun libcNewQurtStdioFgetpos(stream: Long, pos: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFsetpos(stream: Long, pos: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioClearerr(stream: Long)

    @JvmStatic
    external fun libcNewQurtStdioFeof(stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioFerror(stream: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioPerror(s: Long)

    @JvmStatic
    external fun libcNewQurtStdioRemove(filename: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioRename(old: Long, new: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioTmpfile(): Long

    @JvmStatic
    external fun libcNewQurtStdioTmpnam(s: Long): Long

    @JvmStatic
    external fun libcNewQurtStdioSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcNewQurtStdioSetbuf(stream: Long, buffer: Long)
}

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, stream: MutPtr): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFreopen(filename.rawAddress, mode.rawAddress, stream.rawAddress))

public actual fun fclose(stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFclose(stream.rawAddress)

public actual fun fflush(stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFflush(stream.rawAddress)

public actual fun fread(ptr: MutPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT =
    NewQurtStdioJniBridge.libcNewQurtStdioFread(ptr.rawAddress, size.toLong(), nmemb.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT =
    NewQurtStdioJniBridge.libcNewQurtStdioFwrite(ptr.rawAddress, size.toLong(), nmemb.toLong(), stream.rawAddress).toULong()

public actual fun fgetc(stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFgetc(stream.rawAddress)

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFputc(c, stream.rawAddress)

public actual fun getchar(): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioGetchar()

public actual fun putchar(c: CInt): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPutchar(c)

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioUngetc(c, stream.rawAddress)

public actual fun fgets(s: MutPtr, size: CInt, stream: MutPtr): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFgets(s.rawAddress, size, stream.rawAddress))

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFputs(s.rawAddress, stream.rawAddress)

public actual fun gets(s: MutPtr): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioGets(s.rawAddress))

public actual fun puts(s: ConstPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPuts(s.rawAddress)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vprintf(format: ConstPtr, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVprintf(format.rawAddress, ap.rawAddress)

public actual fun vfprintf(stream: MutPtr, format: ConstPtr, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVfprintf(stream.rawAddress, format.rawAddress, ap.rawAddress)

public actual fun vsprintf(s: MutPtr, format: ConstPtr, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVsprintf(s.rawAddress, format.rawAddress, ap.rawAddress)

public actual fun vsnprintf(s: MutPtr, n: SizeT, format: ConstPtr, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVsnprintf(s.rawAddress, n.toLong(), format.rawAddress, ap.rawAddress)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr): CLong =
    NewQurtStdioJniBridge.libcNewQurtStdioFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr) {
    NewQurtStdioJniBridge.libcNewQurtStdioRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr, pos: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFgetpos(stream.rawAddress, pos.rawAddress)

public actual fun fsetpos(stream: MutPtr, pos: ConstPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFsetpos(stream.rawAddress, pos.rawAddress)

public actual fun clearerr(stream: MutPtr) {
    NewQurtStdioJniBridge.libcNewQurtStdioClearerr(stream.rawAddress)
}

public actual fun feof(stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFerror(stream.rawAddress)

public actual fun perror(s: ConstPtr) {
    NewQurtStdioJniBridge.libcNewQurtStdioPerror(s.rawAddress)
}

public actual fun remove(filename: ConstPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioRemove(filename.rawAddress)

public actual fun rename(old: ConstPtr, new: ConstPtr): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioRename(old.rawAddress, new.rawAddress)

public actual fun tmpfile(): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioTmpfile())

public actual fun tmpnam(s: MutPtr): MutPtr =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioTmpnam(s.rawAddress))

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr, buffer: MutPtr) {
    NewQurtStdioJniBridge.libcNewQurtStdioSetbuf(stream.rawAddress, buffer.rawAddress)
}
