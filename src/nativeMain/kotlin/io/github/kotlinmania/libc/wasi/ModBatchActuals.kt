// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ShortVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abs
import libc.cinterop.libc_access
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_chdir
import libc.cinterop.libc_clearerr
import libc.cinterop.libc_close
import libc.cinterop.libc_closedir
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_faccessat
import libc.cinterop.libc_fclose
import libc.cinterop.libc_fdatasync
import libc.cinterop.libc_fdopen
import libc.cinterop.libc_feof
import libc.cinterop.libc_ferror
import libc.cinterop.libc_fflush
import libc.cinterop.libc_fgetc
import libc.cinterop.libc_fileno
import libc.cinterop.libc_fopen
import libc.cinterop.libc_fputc
import libc.cinterop.libc_fputs
import libc.cinterop.libc_free
import libc.cinterop.libc_freopen
import libc.cinterop.libc_fseek
import libc.cinterop.libc_fseeko
import libc.cinterop.libc_fsync
import libc.cinterop.libc_ftell
import libc.cinterop.libc_ftello
import libc.cinterop.libc_ftruncate
import libc.cinterop.libc_futimens
import libc.cinterop.libc_getc
import libc.cinterop.libc_getchar
import libc.cinterop.libc_getenv
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_isalnum
import libc.cinterop.libc_isalpha
import libc.cinterop.libc_isatty
import libc.cinterop.libc_isblank
import libc.cinterop.libc_iscntrl
import libc.cinterop.libc_isdigit
import libc.cinterop.libc_isgraph
import libc.cinterop.libc_islower
import libc.cinterop.libc_isprint
import libc.cinterop.libc_ispunct
import libc.cinterop.libc_isspace
import libc.cinterop.libc_isupper
import libc.cinterop.libc_isxdigit
import libc.cinterop.libc_labs
import libc.cinterop.libc_link
import libc.cinterop.libc_linkat
import libc.cinterop.libc_lseek
import libc.cinterop.libc_malloc
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_perror
import libc.cinterop.libc_poll
import libc.cinterop.libc_poll_single
import libc.cinterop.libc_pthread_getspecific
import libc.cinterop.libc_pthread_setspecific
import libc.cinterop.libc_putc
import libc.cinterop.libc_putchar
import libc.cinterop.libc_puts
import libc.cinterop.libc_rand
import libc.cinterop.libc_random
import libc.cinterop.libc_readlink
import libc.cinterop.libc_readlinkat
import libc.cinterop.libc_realpath
import libc.cinterop.libc_remove
import libc.cinterop.libc_rename
import libc.cinterop.libc_renameat
import libc.cinterop.libc_rewind
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_setenv
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_setvbuf
import libc.cinterop.libc_srand
import libc.cinterop.libc_strcasecmp
import libc.cinterop.libc_strcat
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strcspn
import libc.cinterop.libc_strdup
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strncasecmp
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strspn
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strtok
import libc.cinterop.libc_symlink
import libc.cinterop.libc_symlinkat
import libc.cinterop.libc_tolower
import libc.cinterop.libc_toupper
import libc.cinterop.libc_truncate
import libc.cinterop.libc_ungetc
import libc.cinterop.libc_unlink
import libc.cinterop.libc_unlinkat
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_usleep
import libc.cinterop.libc_utimensat

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires FFI bridge")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(amt, amt2)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    if (ptr == null) return
    val pPtr: CPointer<ByteVar>? = ptr.value.toCPointer()
    if (ptr.allocationAlignment != 0uL) libc.cinterop.libc_aligned_free(pPtr) else libc.cinterop.libc_free(pPtr)
}

public actual fun getenv(s: String?): String? {
    if (s == null) return null
    val result = libc.cinterop.libc_getenv(s)
    return result?.toKString()
}

public actual fun malloc(amt: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(amt)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun read(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("read requires FFI bridge")

public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires FFI bridge")

public actual fun setenv(k: String?, v: String?, a: Int): Int {
    if (k == null) return -1
    if (v == null) return -1
    return libc.cinterop.libc_setenv(k, v, a)
}

public actual fun unsetenv(k: String?): Int {
    if (k == null) return -1
    return libc.cinterop.libc_unsetenv(k)
}

public actual fun clearenv(): Int =
    libc.cinterop.libc_clearenv()

public actual fun write(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("write requires manual FFI bridge — type mismatch")

public actual fun fopen(a: String?, b: String?): FILE? {
    if (a == null) return null
    if (b == null) return null
    val result = libc.cinterop.libc_fopen(a, b)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? {
    if (b == null) return null
    if (f == null) return null
    val filePtr: CPointer<ByteVar>? = f.handle.toCPointer()
    val result = libc.cinterop.libc_freopen(a, b, filePtr)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fclose(f: FILE?): Int =
    libc.cinterop.libc_fclose(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun remove(a: String?): Int {
    if (a == null) return -1
    return libc.cinterop.libc_remove(a)
}

public actual fun rename(a: String?, b: String?): Int {
    if (a == null) return -1
    if (b == null) return -1
    return libc.cinterop.libc_rename(a, b)
}

public actual fun feof(f: FILE?): Int =
    libc.cinterop.libc_feof(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun ferror(f: FILE?): Int =
    libc.cinterop.libc_ferror(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fflush(f: FILE?): Int =
    libc.cinterop.libc_fflush(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clearerr(f: FILE?) {
    if (f == null) return
    val arg1Ptr: CPointer<ByteVar>? = f.handle.toCPointer()
    libc.cinterop.libc_clearerr(arg1Ptr)
}

public actual fun fseek(f: FILE?, b: Long, c: Int): Int =
    libc.cinterop.libc_fseek(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), b, c)

public actual fun ftell(f: FILE?): Long =
    libc.cinterop.libc_ftell(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewind(f: FILE?) {
    if (f == null) return
    val streamPtr: CPointer<ByteVar>? = f.handle.toCPointer()
    libc.cinterop.libc_rewind(streamPtr)
}

public actual fun fgetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires FFI bridge")

public actual fun fgetc(f: FILE?): Int =
    libc.cinterop.libc_fgetc(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getc(f: FILE?): Int =
    libc.cinterop.libc_getc(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getchar(): Int = libc.cinterop.libc_getchar()

public actual fun ungetc(a: Int, f: FILE?): Int =
    libc.cinterop.libc_ungetc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fputc(a: Int, f: FILE?): Int =
    libc.cinterop.libc_fputc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun putc(a: Int, f: FILE?): Int =
    libc.cinterop.libc_putc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun putchar(a: Int): Int = libc.cinterop.libc_putchar(a)

public actual fun fputs(a: String?, f: FILE?): Int {
    if (a == null) return -1
    return libc.cinterop.libc_fputs(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun puts(a: String?): Int {
    if (a == null) return -1
    return libc.cinterop.libc_puts(a)
}

public actual fun perror(a: String?) {
    if (a == null) return
    libc.cinterop.libc_perror(a)
}

public actual fun srand(a: UInt) {
    libc.cinterop.libc_srand(a)
}

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun randR(a: UInt?): Int =
    throw UnsupportedOperationException("randR requires manual FFI bridge — not yet implemented")

public actual fun random(): Long =
    libc.cinterop.libc_random()

public actual fun srandom(a: UInt): Unit = throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")

public actual fun putenv(a: String?): Int =
    libc.cinterop.libc_putenv(a)

public actual fun clock(): Long =
    throw UnsupportedOperationException("clock requires manual FFI bridge — not yet implemented")

public actual fun time(a: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun mktime(a: Tm?): Long =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun gmtime(a: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtime(a: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(a: Long?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun nanosleep(a: Timespec?, b: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(a: ClockidT, a2: Int, b: Timespec?, c: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires manual FFI bridge — not yet implemented")

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

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("strtol requires FFI bridge")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

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

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires FFI bridge")

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

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires FFI bridge")

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

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup requires manual FFI bridge — not yet implemented")

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

public actual fun strcasecmp(s1: String?, s2: String?): Int {
    if (s1 == null) return -1
    if (s2 == null) return -1
    return libc.cinterop.libc_strcasecmp(s1, s2)
}

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    libc.cinterop.libc_strncasecmp(s1, s2, n)

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
    throw UnsupportedOperationException("strxfrm requires FFI bridge")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires FFI bridge")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp requires FFI bridge")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires FFI bridge")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires FFI bridge")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires FFI bridge")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: UInt): Int {
    if (path == null) return -1
    return libc.cinterop.libc_mkdir(path, mode.toInt())
}

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: Int, mode: String?): FILE? {
    val result = libc.cinterop.libc_fdopen(fd, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fileno(stream: FILE?): Int =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires FFI bridge")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): Int =
    libc.cinterop.libc_closedir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires FFI bridge")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int {
    if (oldpath == null) return -1
    if (newpath == null) return -1
    return libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
}

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat requires FFI bridge")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: String?, bufsiz: ULong): Long =
    memScoped {
        libc.cinterop.libc_readlinkat(dirfd, pathname, buf?.cstr?.getPointer(this), bufsiz)
    }

public actual fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int {
    if (oldpath == null) return -1
    if (newpath == null) return -1
    return libc.cinterop.libc_renameat(olddirfd, oldpath, newdirfd, newpath)
}

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int {
    if (target == null) return -1
    if (linkpath == null) return -1
    return libc.cinterop.libc_symlinkat(target, newdirfd, linkpath)
}

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_unlinkat(dirfd, pathname, flags)
}

public actual fun access(path: String?, amode: Int): Int {
    if (path == null) return -1
    return libc.cinterop.libc_access(path, amode)
}

public actual fun close(fd: Int): Int = libc.cinterop.libc_close(fd)

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf requires FFI bridge")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun isatty(fd: Int): Int = libc.cinterop.libc_isatty(fd)

public actual fun link(src: String?, dst: String?): Int {
    if (src == null) return -1
    if (dst == null) return -1
    return libc.cinterop.libc_link(src, dst)
}

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    libc.cinterop.libc_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires FFI bridge")

public actual fun rmdir(path: String?): Int {
    if (path == null) return -1
    return libc.cinterop.libc_rmdir(path)
}

public actual fun unlink(c: String?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_unlink(c)
}

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread requires FFI bridge")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite requires FFI bridge")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: Int): Int = libc.cinterop.libc_fsync(fd)

public actual fun fdatasync(fd: Int): Int =
    libc.cinterop.libc_fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): Int {
    if (path1 == null) return -1
    if (path2 == null) return -1
    return libc.cinterop.libc_symlink(path1, path2)
}

public actual fun truncate(path: String?, length: Long): Int {
    if (path == null) return -1
    return libc.cinterop.libc_truncate(path, length)
}

public actual fun ftruncate(fd: Int, length: Long): Int =
    libc.cinterop.libc_ftruncate(fd, length)

public actual fun getrusage(resource: Int, usage: Rusage?): Int =
    throw UnsupportedOperationException("getrusage requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tvPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc.cinterop.libc_gettimeofday(tvPtr, tzPtr)
    return result
}

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun usleep(secs: UInt): Int = libc.cinterop.libc_usleep(secs)

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires manual FFI bridge — not yet implemented")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires manual FFI bridge — not yet implemented")

public actual fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int {
    if (fds == null || nfds == 0uL) {
        return libc_poll(null, 0u, timeout)
    }
    return memScoped {
        val revents = alloc<ShortVar>()
        libc_poll_single(fds.fd, fds.events, revents.ptr, timeout)
    }
}

public actual fun setlocale(category: Int, locale: String?): String? {
    val result = libc.cinterop.libc_setlocale(category, locale)
    return result?.toKString()
}

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): Long =
    memScoped {
        libc.cinterop.libc_readlink(path, buf?.cstr?.getPointer(this), bufsz)
    }

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires FFI bridge")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): Long =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
}

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc.cinterop.libc_futimens(fd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc.cinterop.libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun abs(i: Int): Int =
    libc.cinterop.libc_abs(i)

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires FFI bridge")

public actual fun chdir(dir: String?): Int {
    if (dir == null) return -1
    return libc.cinterop.libc_chdir(dir)
}

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRegisterPreopenedFd(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd requires manual FFI bridge — not yet implemented")

public actual fun wasilibcFdRenumber(fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("wasilibcFdRenumber requires manual FFI bridge — not yet implemented")

public actual fun wasilibcUnlinkat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcUnlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRmdirat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRmdirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): Int =
    throw UnsupportedOperationException("wasilibcFindRelpath requires manual FFI bridge — not yet implemented")

public actual fun wasilibcTell(fd: Int): Long =
    throw UnsupportedOperationException("wasilibcTell requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdLinkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdLinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdReadlinkat(dirfd: Int, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdRenameat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFstatat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdOpendirat(dirfd: Int, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcAccess(pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcAccess requires manual FFI bridge — not yet implemented")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcStat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcUtimens requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLink requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkOldat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkNewat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameOldat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameNewat requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod requires FFI bridge")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod requires FFI bridge")

public actual fun realpath(pathname: String?, resolved: String?): String? {
    if (pathname == null) return null
    return memScoped {
        val pathBuf = pathname.cstr.ptr
        val resolvedBuf = allocArray<ByteVar>(4096)
        libc.cinterop.libc_realpath(pathBuf, resolvedBuf)?.toKString()
    }
}

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.COpaquePointer?, t2: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.COpaquePointer?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    libc_pthread_getspecific(key.toULong())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    libc_pthread_setspecific(key.toULong(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun atexit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun atQuickExit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")
