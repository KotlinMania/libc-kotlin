@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.FposT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtStdioJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = NewQurtStdioJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
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

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, stream: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFreopen(filename.rawAddress, mode.rawAddress, stream.rawAddress))

public actual fun fclose(stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFclose(stream.rawAddress)

public actual fun fflush(stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFflush(stream.rawAddress)

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    NewQurtStdioJniBridge.libcNewQurtStdioFread(ptr.rawAddress, size.toLong(), nmemb.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    NewQurtStdioJniBridge.libcNewQurtStdioFwrite(ptr.rawAddress, size.toLong(), nmemb.toLong(), stream.rawAddress).toULong()

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFgetc(stream.rawAddress)

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFputc(c, stream.rawAddress)

public actual fun getchar(): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioGetchar()

public actual fun putchar(c: CInt): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPutchar(c)

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioUngetc(c, stream.rawAddress)

public actual fun fgets(s: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioFgets(s.rawAddress, size, stream.rawAddress))

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFputs(s.rawAddress, stream.rawAddress)

public actual fun gets(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioGets(s.rawAddress))

public actual fun puts(s: ConstPtr<CChar>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPuts(s.rawAddress)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vprintf(format: ConstPtr<CChar>, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVprintf(format.rawAddress, ap.rawAddress)

public actual fun vfprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVfprintf(stream.rawAddress, format.rawAddress, ap.rawAddress)

public actual fun vsprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVsprintf(s.rawAddress, format.rawAddress, ap.rawAddress)

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, ap: VaList): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioVsnprintf(s.rawAddress, n.toLong(), format.rawAddress, ap.rawAddress)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    NewQurtStdioJniBridge.libcNewQurtStdioFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr<FILE>) {
    NewQurtStdioJniBridge.libcNewQurtStdioRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFgetpos(stream.rawAddress, pos.rawAddress)

public actual fun fsetpos(stream: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFsetpos(stream.rawAddress, pos.rawAddress)

public actual fun clearerr(stream: MutPtr<FILE>) {
    NewQurtStdioJniBridge.libcNewQurtStdioClearerr(stream.rawAddress)
}

public actual fun feof(stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioFerror(stream.rawAddress)

public actual fun perror(s: ConstPtr<CChar>) {
    NewQurtStdioJniBridge.libcNewQurtStdioPerror(s.rawAddress)
}

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioRemove(filename.rawAddress)

public actual fun rename(old: ConstPtr<CChar>, new: ConstPtr<CChar>): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioRename(old.rawAddress, new.rawAddress)

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioTmpfile())

public actual fun tmpnam(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(NewQurtStdioJniBridge.libcNewQurtStdioTmpnam(s.rawAddress))

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    NewQurtStdioJniBridge.libcNewQurtStdioSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>) {
    NewQurtStdioJniBridge.libcNewQurtStdioSetbuf(stream.rawAddress, buffer.rawAddress)
}
