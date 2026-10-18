@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.*
import libc.cinterop.*

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun isalnum(c: Int): Int = libc.cinterop.libc_isalnum(c)

public actual fun isalpha(c: Int): Int = libc.cinterop.libc_isalpha(c)

public actual fun iscntrl(c: Int): Int = libc.cinterop.libc_iscntrl(c)

public actual fun isdigit(c: Int): Int = libc.cinterop.libc_isdigit(c)

public actual fun isgraph(c: Int): Int = libc.cinterop.libc_isgraph(c)

public actual fun islower(c: Int): Int = libc.cinterop.libc_islower(c)

public actual fun isprint(c: Int): Int = libc.cinterop.libc_isprint(c)

public actual fun ispunct(c: Int): Int = libc.cinterop.libc_ispunct(c)

public actual fun isspace(c: Int): Int = libc.cinterop.libc_isspace(c)

public actual fun isupper(c: Int): Int = libc.cinterop.libc_isupper(c)

public actual fun isxdigit(c: Int): Int = libc.cinterop.libc_isxdigit(c)

public actual fun isblank(c: Int): Int = libc.cinterop.libc_isblank(c)

public actual fun tolower(c: Int): Int = libc.cinterop.libc_tolower(c)

public actual fun toupper(c: Int): Int = libc.cinterop.libc_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? {
    if (filename == null) return null
    if (mode == null) return null
    val result = libc.cinterop.libc_fopen(filename, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    if (mode == null) return null
    if (file == null) return null
    val filePtr: CPointer<ByteVar>? = file.handle.toCPointer()
    val result = libc.cinterop.libc_freopen(filename, mode, filePtr)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fflush(file: FILE?): Int =
    libc.cinterop.libc_fflush(file?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fclose(file: FILE?): Int =
    libc.cinterop.libc_fclose(file?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun remove(filename: String?): Int {
    if (filename == null) return -1
    return libc.cinterop.libc_remove(filename)
}

public actual fun rename(oldname: String?, newname: String?): Int {
    if (oldname == null) return -1
    if (newname == null) return -1
    return libc.cinterop.libc_rename(oldname, newname)
}

public actual fun tmpfile(): FILE? {
    val result = libc.cinterop.libc_tmpfile()
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")

public actual fun getchar(): Int = libc.cinterop.libc_getchar()

public actual fun putchar(c: Int): Int = libc.cinterop.libc_putchar(c)

public actual fun fgetc(stream: FILE?): Int =
    libc.cinterop.libc_fgetc(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: Int, stream: FILE?): Int =
    libc.cinterop.libc_fputc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): Int {
    if (s == null) return -1
    return libc.cinterop.libc_fputs(s, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun puts(s: String?): Int {
    if (s == null) return -1
    return libc.cinterop.libc_puts(s)
}

public actual fun ungetc(c: Int, stream: FILE?): Int =
    libc.cinterop.libc_ungetc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong {
    if (stream == null) return 0uL
    return libc.cinterop.libc_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream.handle.toCPointer<ByteVar>())
}

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseek(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): Long =
    libc.cinterop.libc_ftell(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewind(stream: FILE?) {
    if (stream == null) return
    val streamPtr: CPointer<ByteVar>? = stream.handle.toCPointer()
    libc.cinterop.libc_rewind(streamPtr)
}

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int {
    if (stream == null) return -1
    return memScoped {
        val posVar = alloc<LongVar>()
        if (ptr != null) posVar.value = ptr
        libc.cinterop.libc_fgetpos(stream.handle.toCPointer<ByteVar>(), posVar.ptr)
    }
}

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int {
    if (stream == null || ptr == null) return -1
    return memScoped {
        val posVar = alloc<LongVar>()
        posVar.value = ptr
        libc.cinterop.libc_fsetpos(stream.handle.toCPointer<ByteVar>(), posVar.ptr)
    }
}

public actual fun feof(stream: FILE?): Int =
    libc.cinterop.libc_feof(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun ferror(stream: FILE?): Int =
    libc.cinterop.libc_ferror(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun perror(s: String?) {
    if (s == null) return
    libc.cinterop.libc_perror(s)
}

public actual fun atoi(s: String?): Int {
    if (s == null) return 0
    return libc.cinterop.libc_atoi(s)
}

public actual fun atol(s: String?): Long =
    libc.cinterop.libc_atol(s)

public actual fun atoll(s: String?): Long {
    val result = libc.cinterop.libc_atoll(s)
    return result
}

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    memScoped {
        libc.cinterop.libc_strtol(s?.cstr?.getPointer(this), endp?.value?.toCPointer<ByteVar>(), base)
    }

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    memScoped {
        libc.cinterop.libc_strtoll(s?.cstr?.getPointer(this), endp?.value?.toCPointer<ByteVar>(), base)
    }

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    memScoped {
        libc.cinterop.libc_strtoul(s?.cstr?.getPointer(this), endp?.value?.toCPointer<ByteVar>(), base)
    }

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    memScoped {
        libc.cinterop.libc_strtoull(s?.cstr?.getPointer(this), endp?.value?.toCPointer<ByteVar>(), base)
    }

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize requires manual FFI bridge — not yet implemented")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    val pointer = p?.value?.toCPointer<ByteVar>()
    val alignment = p?.allocationAlignment ?: 0uL
    val result =
        if (alignment != 0uL) {
            libc.cinterop.libc_aligned_realloc(pointer, size, alignment)
        } else {
            libc.cinterop.libc_realloc(pointer, size)
        }
    return result?.let { COpaquePointer(it.toLong(), alignment) }
}

public actual fun free(p: COpaquePointer?) {
    if (p == null) return
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    if (p.allocationAlignment != 0uL) libc.cinterop.libc_aligned_free(pPtr) else libc.cinterop.libc_free(pPtr)
}

public actual fun system(s: String?): Int {
    if (s == null) return -1
    return libc.cinterop.libc_system(s)
}

public actual fun getenv(s: String?): String? {
    if (s == null) return null
    val result = libc.cinterop.libc_getenv(s)
    return result?.toKString()
}

public actual fun strcpy(dst: String?, src: String?): String? {
    if (src == null) return null
    return memScoped {
        val srcBuf = src.cstr.ptr
        val len = src.length + 1
        val dstBuf = allocArray<ByteVar>(len)
        libc.cinterop.libc_strcpy(dstBuf, srcBuf)
        dstBuf.toKString()
    }
}

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? {
    if (src == null) return null
    return memScoped {
        val count = n.toInt()
        val dstBuf = allocArray<ByteVar>(count + 1)
        val srcBuf = src.cstr.ptr
        libc.cinterop.libc_strncpy(dstBuf, srcBuf, n)
        dstBuf[count] = 0.toByte()
        dstBuf.toKString()
    }
}

public actual fun strcat(s: String?, ct: String?): String? {
    if (s == null) return null
    if (ct == null) return s
    return memScoped {
        val totalLen = s.length + ct.length + 1
        val buf = allocArray<ByteVar>(totalLen)
        s.cstr.place(buf)
        val ctBuf = ct.cstr.ptr
        libc.cinterop.libc_strcat(buf, ctBuf)
        buf.toKString()
    }
}

public actual fun strncat(s: String?, ct: String?, n: ULong): String? {
    if (s == null) return null
    if (ct == null) return s
    return memScoped {
        val totalLen = s.length + minOf(ct.length, n.toInt()) + 1
        val buf = allocArray<ByteVar>(totalLen)
        s.cstr.place(buf)
        val ctBuf = ct.cstr.ptr
        libc.cinterop.libc_strncat(buf, ctBuf, n)
        buf.toKString()
    }
}

public actual fun strcmp(cs: String?, ct: String?): Int {
    if (cs == null) return -1
    if (ct == null) return -1
    return libc.cinterop.libc_strcmp(cs, ct)
}

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    libc.cinterop.libc_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): Int {
    if (cs == null) return -1
    if (ct == null) return -1
    return libc.cinterop.libc_strcoll(cs, ct)
}

public actual fun strchr(cs: String?, c: Int): String? {
    if (cs == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val result = libc.cinterop.libc_strchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strrchr(cs: String?, c: Int): String? {
    if (cs == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val result = libc.cinterop.libc_strrchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strcspn(cs, ct)

public actual fun strdup(cs: String?): String? {
    if (cs == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val dup = libc.cinterop.libc_strdup(cstr)
        val result = dup?.toKString()
        if (dup != null) libc.cinterop.libc_free(dup)
        result
    }
}

public actual fun strpbrk(cs: String?, ct: String?): String? {
    if (cs == null) return null
    if (ct == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val caccept = ct.cstr.ptr
        val result = libc.cinterop.libc_strpbrk(cstr, caccept)
        result?.toKString()
    }
}

public actual fun strstr(cs: String?, ct: String?): String? {
    if (cs == null) return null
    if (ct == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val nstr = ct.cstr.ptr
        val result = libc.cinterop.libc_strstr(cstr, nstr)
        result?.toKString()
    }
}

public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, maxlen)

public actual fun strerror(n: Int): String? {
    val result = libc.cinterop.libc_strerror(n)
    return result?.toKString()
}

public actual fun strtok(s: String?, t: String?): String? {
    if (t == null) return null
    val sBuf: CPointer<ByteVar>? =
        if (s != null) {
            nativeHeap.allocArray<ByteVar>(s.length + 1).also { s.cstr.place(it) }
        } else {
            null
        }
    return memScoped {
        val tBuf = t.cstr.ptr
        libc.cinterop.libc_strtok(sBuf, tBuf)?.toKString()
    }
}

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    memScoped {
        libc.cinterop.libc_strxfrm(s?.cstr?.getPointer(this), ct?.cstr?.getPointer(this), n)
    }

public actual fun wcslen(buf: UShort?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcsnlen(str: UShort?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: UShort?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    libc.cinterop.libc_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: Int): Int =
    libc.cinterop.libc_abs(i)

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc.cinterop.libc_srand(seed)
}

public actual fun raise(signum: Int): Int = libc.cinterop.libc_raise(signum)

public actual fun clock(): Int =
    throw UnsupportedOperationException("clock requires manual FFI bridge — not yet implemented")

public actual fun ctime(sourceTime: Long?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): Int =
    throw UnsupportedOperationException("gmtimeS requires manual FFI bridge — not yet implemented")

public actual fun getDaylight(hours: Int?): Int =
    throw UnsupportedOperationException("getDaylight requires manual FFI bridge — not yet implemented")

public actual fun getDstbias(seconds: Long?): Int =
    throw UnsupportedOperationException("getDstbias requires manual FFI bridge — not yet implemented")

public actual fun getTimezone(seconds: Long?): Int =
    throw UnsupportedOperationException("getTimezone requires manual FFI bridge — not yet implemented")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: Int): Int =
    throw UnsupportedOperationException("getTzname requires manual FFI bridge — not yet implemented")

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): Int =
    throw UnsupportedOperationException("localtimeS requires manual FFI bridge — not yet implemented")

public actual fun time(destTime: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun tzset(): Unit = throw UnsupportedOperationException("tzset requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: Int): Int =
    libc.cinterop.libc_chmod(path, mode.toUInt())

public actual fun wchmod(path: UShort?, mode: Int): Int =
    throw UnsupportedOperationException("wchmod requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?): Int =
    libc.cinterop.libc_mkdir(path, 0)

public actual fun wrmdir(path: UShort?): Int =
    throw UnsupportedOperationException("wrmdir requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun wstat(path: UShort?, buf: Stat?): Int =
    throw UnsupportedOperationException("wstat requires manual FFI bridge — not yet implemented")

public actual fun wutime(file: UShort?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("wutime requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? {
    if (command == null) return null
    if (mode == null) return null
    return libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }
}

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: Int, mode: String?): FILE? {
    val result = libc.cinterop.libc_fdopen(fd, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fileno(stream: FILE?): Int =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun wopen(path: UShort?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("wopen requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: Int): Int =
    libc.cinterop.libc_creat(path, mode.toUInt())

public actual fun access(path: String?, amode: Int): Int {
    if (path == null) return -1
    return libc.cinterop.libc_access(path, amode)
}

public actual fun chdir(dir: String?): Int {
    if (dir == null) return -1
    return libc.cinterop.libc_chdir(dir)
}

public actual fun close(fd: Int): Int = libc.cinterop.libc_close(fd)

public actual fun dup(fd: Int): Int = libc.cinterop.libc_dup(fd)

public actual fun dup2(src: Int, dst: Int): Int = libc.cinterop.libc_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execl requires manual FFI bridge — not yet implemented")

public actual fun wexecl(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecl requires manual FFI bridge — not yet implemented")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execle requires manual FFI bridge — not yet implemented")

public actual fun wexecle(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecle requires manual FFI bridge — not yet implemented")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlp requires manual FFI bridge — not yet implemented")

public actual fun wexeclp(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclp requires manual FFI bridge — not yet implemented")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlpe requires manual FFI bridge — not yet implemented")

public actual fun wexeclpe(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclpe requires manual FFI bridge — not yet implemented")

public actual fun execv(prog: String?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("execv requires manual FFI bridge — type mismatch")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int {
    if (prog == null) return -1
    return libc.cinterop.libc_execve(prog, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), envp?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun execvp(c: String?, argv: COpaquePointer?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_execvp(c, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecv requires manual FFI bridge — not yet implemented")

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecve requires manual FFI bridge — not yet implemented")

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvp requires manual FFI bridge — not yet implemented")

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvpe requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: Int): String? =
    memScoped {
        val dest = if (size > 0) allocArray<ByteVar>(size) else null
        val result = libc.cinterop.libc_getcwd(dest, size.toULong())
        result?.toKString()
    }

public actual fun getpid(): Int = libc.cinterop.libc_getpid()

public actual fun isatty(fd: Int): Int = libc.cinterop.libc_isatty(fd)

public actual fun lseek(fd: Int, offset: Long, origin: Int): Long =
    libc.cinterop.libc_lseek(fd, offset, origin)

public actual fun lseek64(fd: Int, offset: Long, origin: Int): Long =
    throw UnsupportedOperationException("lseek64 requires manual FFI bridge — not yet implemented")

public actual fun pipe(fds: Int?, psize: UInt, textmode: Int): Int =
    memScoped {
        if (fds == null) {
            val fdsArray = allocArray<IntVar>(2)
            libc.cinterop.libc_pipe(fdsArray)
        } else {
            val ptr = fds.toLong().toCPointer<IntVar>()
            libc.cinterop.libc_pipe(ptr)
        }
    }

public actual fun read(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    libc.cinterop.libc_read(fd, buf?.value?.toCPointer<ByteVar>(), count.toULong()).toInt()

public actual fun rmdir(path: String?): Int {
    if (path == null) return -1
    return libc.cinterop.libc_rmdir(path)
}

public actual fun unlink(c: String?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_unlink(c)
}

public actual fun write(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    libc.cinterop.libc_write(fd, buf?.value?.toCPointer<ByteVar>(), count.toULong()).toInt()

public actual fun commit(fd: Int): Int =
    throw UnsupportedOperationException("commit requires manual FFI bridge — not yet implemented")

public actual fun getOsfhandle(fd: Int): Long =
    throw UnsupportedOperationException("getOsfhandle requires manual FFI bridge — not yet implemented")

public actual fun openOsfhandle(osfhandle: Long, flags: Int): Int =
    throw UnsupportedOperationException("openOsfhandle requires manual FFI bridge — not yet implemented")

public actual fun setlocale(category: Int, locale: String?): String? {
    val result = libc.cinterop.libc_setlocale(category, locale)
    return result?.toKString()
}

public actual fun wsetlocale(category: Int, locale: UShort?): UShort? =
    throw UnsupportedOperationException("wsetlocale requires manual FFI bridge — not yet implemented")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    libc.cinterop.libc_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong(), alignment) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    libc.cinterop.libc_aligned_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    libc.cinterop.libc_aligned_realloc(memblock?.value?.toCPointer<ByteVar>(), size, alignment)?.let { COpaquePointer(it.toLong(), alignment) }

public actual fun putenv(envstring: String?): Int {
    if (envstring == null) return -1
    return libc.cinterop.libc_putenv(envstring)
}

public actual fun wputenv(envstring: UShort?): Int =
    throw UnsupportedOperationException("wputenv requires manual FFI bridge — not yet implemented")

public actual fun putenvS(envstring: String?, valueString: String?): Int =
    libc.cinterop.libc_putenv_s(envstring, valueString)

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): Int =
    throw UnsupportedOperationException("wputenvS requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")

public actual fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortS requires manual FFI bridge — not yet implemented")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")
