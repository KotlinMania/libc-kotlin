@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

private object NewQurtStdioJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_stdio_fopen(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_freopen(filename: String?, mode: String?, stream: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_fclose(stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fflush(stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fread(ptr: Long, size: Long, nmemb: Long, stream: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_fwrite(ptr: Long, size: Long, nmemb: Long, stream: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_fgetc(stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_getchar(): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_putchar(c: Int): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_ungetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fgets(s: Long, size: Int, stream: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_fputs(s: String?, stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_gets(s: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_puts(s: String?): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_vprintf(format: String?, ap: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_vfprintf(stream: Long, format: String?, ap: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_vsprintf(s: Long, format: String?, ap: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_vsnprintf(s: Long, n: Long, format: String?, ap: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_ftell(stream: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_rewind(stream: Long)

    @JvmStatic
    external fun libc_new_qurt_stdio_fgetpos(stream: Long, pos: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_fsetpos(stream: Long, pos: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_clearerr(stream: Long)

    @JvmStatic
    external fun libc_new_qurt_stdio_feof(stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_ferror(stream: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_perror(s: String?)

    @JvmStatic
    external fun libc_new_qurt_stdio_remove(filename: String?): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_rename(old: String?, new: String?): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_tmpfile(): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_tmpnam(s: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdio_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdio_setbuf(stream: Long, buffer: Long)
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fopen(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_freopen(filename, mode, (stream?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fclose(stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fclose((stream?.handle ?: 0L))

public actual fun fflush(stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fflush((stream?.handle ?: 0L))

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fread((ptr?.value ?: 0L), size.toLong(), nmemb.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fwrite((ptr?.value ?: 0L), size.toLong(), nmemb.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fgetc(stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fgetc((stream?.handle ?: 0L))

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fputc(c, (stream?.handle ?: 0L))

public actual fun getchar(): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_getchar()

public actual fun putchar(c: CInt): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_putchar(c)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_ungetc(c, (stream?.handle ?: 0L))

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fgets((s?.value ?: 0L), size, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputs(s: String?, stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fputs(s, (stream?.handle ?: 0L))

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_gets((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun puts(s: String?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_puts(s)

public actual fun printf(format: String?): CInt =
    0

public actual fun fprintf(stream: FILE?, format: String?): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?): CInt =
    0

public actual fun vprintf(format: String?, ap: VaList): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_vprintf(format, (ap?.value ?: 0L))

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_vfprintf((stream?.handle ?: 0L), format, (ap?.value ?: 0L))

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_vsprintf((s?.value ?: 0L), format, (ap?.value ?: 0L))

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_vsnprintf((s?.value ?: 0L), n.toLong(), format, (ap?.value ?: 0L))

public actual fun scanf(format: String?): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?): CInt =
    0

public actual fun sscanf(s: String?, format: String?): CInt =
    0

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fseek((stream?.handle ?: 0L), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_ftell((stream?.handle ?: 0L))

public actual fun rewind(stream: FILE?) {
    NewQurtStdioJniBridge.libc_new_qurt_stdio_rewind((stream?.handle ?: 0L))
}

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fgetpos((stream?.handle ?: 0L), (pos?.value ?: 0L))

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_fsetpos((stream?.handle ?: 0L), (pos?.value ?: 0L))

public actual fun clearerr(stream: FILE?) {
    NewQurtStdioJniBridge.libc_new_qurt_stdio_clearerr((stream?.handle ?: 0L))
}

public actual fun feof(stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_feof((stream?.handle ?: 0L))

public actual fun ferror(stream: FILE?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_ferror((stream?.handle ?: 0L))

public actual fun perror(s: String?) {
    NewQurtStdioJniBridge.libc_new_qurt_stdio_perror(s)
}

public actual fun remove(filename: String?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_remove(filename)

public actual fun rename(old: String?, new: String?): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_rename(old, new)

public actual fun tmpfile(): FILE? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_tmpnam((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    NewQurtStdioJniBridge.libc_new_qurt_stdio_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    NewQurtStdioJniBridge.libc_new_qurt_stdio_setbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L))
}
