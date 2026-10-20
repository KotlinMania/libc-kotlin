@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.bsd.apple.Sigaction
import io.github.kotlinmania.libc.unix.bsd.apple.Stat
import io.github.kotlinmania.libc.unix.bsd.apple.Statvfs
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Dirent
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.FdSet
import io.github.kotlinmania.libc.unix.linuxlike.Lconv
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios
import kotlinx.cinterop.*
import libc.cinterop.libc_access
import libc.cinterop.libc_aligned_alloc
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_chdir
import libc.cinterop.libc_chmod
import libc.cinterop.libc_chown
import libc.cinterop.libc_chroot
import libc.cinterop.libc_clearerr
import libc.cinterop.libc_close
import libc.cinterop.libc_closedir
import libc.cinterop.libc_confstr
import libc.cinterop.libc_creat
import libc.cinterop.libc_dup
import libc.cinterop.libc_dup2
import libc.cinterop.libc_execv
import libc.cinterop.libc_execve
import libc.cinterop.libc_execvp
import libc.cinterop.libc_fchdir
import libc.cinterop.libc_fchmod
import libc.cinterop.libc_fchmodat
import libc.cinterop.libc_fchown
import libc.cinterop.libc_fclose
import libc.cinterop.libc_fdopen
import libc.cinterop.libc_feof
import libc.cinterop.libc_ferror
import libc.cinterop.libc_fflush
import libc.cinterop.libc_fgetc
import libc.cinterop.libc_fileno
import libc.cinterop.libc_flock
import libc.cinterop.libc_fnmatch
import libc.cinterop.libc_fopen
import libc.cinterop.libc_fork
import libc.cinterop.libc_fpathconf
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
import libc.cinterop.libc_fwrite
import libc.cinterop.libc_gai_strerror
import libc.cinterop.libc_getchar
import libc.cinterop.libc_getcwd
import libc.cinterop.libc_getenv
import libc.cinterop.libc_gethostname
import libc.cinterop.libc_getlogin
import libc.cinterop.libc_getpgid
import libc.cinterop.libc_getpgrp
import libc.cinterop.libc_getpid
import libc.cinterop.libc_getppid
import libc.cinterop.libc_getsid
import libc.cinterop.libc_grantpt
import libc.cinterop.libc_hstrerror
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
import libc.cinterop.libc_kill
import libc.cinterop.libc_killpg
import libc.cinterop.libc_lchown
import libc.cinterop.libc_link
import libc.cinterop.libc_linkat
import libc.cinterop.libc_listen
import libc.cinterop.libc_lockf
import libc.cinterop.libc_lseek
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memccpy
import libc.cinterop.libc_memchr
import libc.cinterop.libc_memcmp
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_memmove
import libc.cinterop.libc_memset
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_mkdirat
import libc.cinterop.libc_mkdtemp
import libc.cinterop.libc_mkfifo
import libc.cinterop.libc_mknod
import libc.cinterop.libc_mkstemp
import libc.cinterop.libc_mlockall
import libc.cinterop.libc_munlockall
import libc.cinterop.libc_munmap
import libc.cinterop.libc_nice
import libc.cinterop.libc_pathconf
import libc.cinterop.libc_pause
import libc.cinterop.libc_perror
import libc.cinterop.libc_pipe
import libc.cinterop.libc_poll
import libc.cinterop.libc_pread
import libc.cinterop.libc_putchar
import libc.cinterop.libc_putenv
import libc.cinterop.libc_puts
import libc.cinterop.libc_pwrite
import libc.cinterop.libc_raise
import libc.cinterop.libc_read
import libc.cinterop.libc_readlink
import libc.cinterop.libc_readlinkat
import libc.cinterop.libc_realloc
import libc.cinterop.libc_realpath
import libc.cinterop.libc_remove
import libc.cinterop.libc_rename
import libc.cinterop.libc_renameat
import libc.cinterop.libc_rewind
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_sched_yield
import libc.cinterop.libc_setegid
import libc.cinterop.libc_setenv
import libc.cinterop.libc_seteuid
import libc.cinterop.libc_setgid
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_setlogmask
import libc.cinterop.libc_setpgid
import libc.cinterop.libc_setregid
import libc.cinterop.libc_setreuid
import libc.cinterop.libc_setsid
import libc.cinterop.libc_setuid
import libc.cinterop.libc_setvbuf
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_socket
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
import libc.cinterop.libc_strncat
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_strncpy
import libc.cinterop.libc_strndup
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strsignal
import libc.cinterop.libc_strspn
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strtok
import libc.cinterop.libc_strtol
import libc.cinterop.libc_strtoll
import libc.cinterop.libc_strtoul
import libc.cinterop.libc_strtoull
import libc.cinterop.libc_strxfrm
import libc.cinterop.libc_symlink
import libc.cinterop.libc_symlinkat
import libc.cinterop.libc_sysconf
import libc.cinterop.libc_system
import libc.cinterop.libc_tcdrain
import libc.cinterop.libc_tcflow
import libc.cinterop.libc_tcflush
import libc.cinterop.libc_tcgetpgrp
import libc.cinterop.libc_tcgetsid
import libc.cinterop.libc_tcsendbreak
import libc.cinterop.libc_tcsetpgrp
import libc.cinterop.libc_tmpfile
import libc.cinterop.libc_tmpnam
import libc.cinterop.libc_tolower
import libc.cinterop.libc_toupper
import libc.cinterop.libc_truncate
import libc.cinterop.libc_ttyname
import libc.cinterop.libc_ungetc
import libc.cinterop.libc_unlink
import libc.cinterop.libc_unlinkat
import libc.cinterop.libc_unlockpt
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_usleep
import libc.cinterop.libc_write

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
    val result = libc_fopen(filename, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    if (mode == null) return null
    if (file == null) return null
    val filePtr: CPointer<ByteVar>? = file.handle.toCPointer()
    val result = libc_freopen(filename, mode, filePtr)
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
    val result = libc_tmpfile()
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")

public actual fun getchar(): Int = libc.cinterop.libc_getchar()

public actual fun putchar(c: Int): Int = libc.cinterop.libc_putchar(c)

public actual fun fgetc(stream: FILE?): Int =
    libc.cinterop.libc_fgetc(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? {
    if (stream == null || n <= 0) return null
    return memScoped {
        val rawBuf = allocArray<ByteVar>(n)
        val res = libc.cinterop.libc_fgets(rawBuf, n, stream.handle.toCPointer<ByteVar>())
        res?.reinterpret<ByteVar>()?.toKString()
    }
}

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

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    libc.cinterop.libc_fwrite(ptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), size, nobj, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseek(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): Long =
    libc.cinterop.libc_ftell(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewind(stream: FILE?) {
    if (stream == null) return
    val streamPtr: CPointer<ByteVar>? = stream.handle.toCPointer()
    libc_rewind(streamPtr)
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

public actual fun clearerr(stream: FILE?) {
    if (stream == null) return
    val streamPtr: CPointer<ByteVar>? = stream.handle.toCPointer()
    libc_clearerr(streamPtr)
}

public actual fun perror(s: String?) {
    if (s == null) return
    libc_perror(s)
}

public actual fun atoi(s: String?): Int {
    if (s == null) return 0
    return libc.cinterop.libc_atoi(s)
}

public actual fun atol(s: String?): Long =
    libc.cinterop.libc_atol(s)

public actual fun atoll(s: String?): Long {
    val result = libc_atoll(s)
    return result
}

public actual fun strtol(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    libc.cinterop.libc_strtol(s?.value?.toCPointer<ByteVar>(), endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)

public actual fun strtoll(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    libc.cinterop.libc_strtoll(s?.value?.toCPointer<ByteVar>(), endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)

public actual fun strtoul(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    libc.cinterop.libc_strtoul(s?.value?.toCPointer<ByteVar>(), endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)

public actual fun strtoull(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    libc.cinterop.libc_strtoull(s?.value?.toCPointer<ByteVar>(), endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

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
    val result = libc_getenv(s)
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

public actual fun stpcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("stpcpy requires manual FFI bridge — not yet implemented")

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
        val dup = libc_strdup(cstr)
        val result = dup?.toKString()
        if (dup != null) libc_free(dup)
        result
    }
}

public actual fun strndup(cs: String?, n: ULong): String? {
    if (cs == null) return null
    return memScoped {
        val duplicate = libc.cinterop.libc_strndup(cs.cstr.getPointer(this), n) ?: return@memScoped null
        try {
            duplicate.toKString()
        } finally {
            libc_free(duplicate)
        }
    }
}

public actual fun strpbrk(cs: String?, ct: String?): String? {
    if (cs == null) return null
    if (ct == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val caccept = ct.cstr.ptr
        val result = libc_strpbrk(cstr, caccept)
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
    val result = libc_strerror(n)
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

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong =
    memScoped {
        libc.cinterop.libc_strxfrm(s?.value?.toCPointer<ByteVar>(), ct?.cstr?.getPointer(this), n)
    }

public actual fun strsignal(sig: Int): String? =
    libc.cinterop.libc_strsignal(sig)?.toKString()

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memchr(cx?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    libc.cinterop.libc_memcmp(cx?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ct?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memcpy(dest?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), src?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memmove(dest?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), src?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memset(dest?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    libc.cinterop.libc_memccpy(dest?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), src?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwnam(name: String?): Passwd? {
    if (name == null) return null
    return memScoped {
        val nameBuf = allocArray<ByteVar>(1024)
        val passwdBuf = allocArray<ByteVar>(1024)
        val uidVar = alloc<UIntVar>()
        val gidVar = alloc<UIntVar>()
        val changeVar = alloc<LongVar>()
        val classBuf = allocArray<ByteVar>(1024)
        val gecosBuf = allocArray<ByteVar>(1024)
        val dirBuf = allocArray<ByteVar>(1024)
        val shellBuf = allocArray<ByteVar>(1024)
        val expireVar = alloc<LongVar>()
        val found =
            libc.cinterop.libc_getpwnam_fields(
                name,
                nameBuf,
                1024uL,
                passwdBuf,
                1024uL,
                uidVar.ptr,
                gidVar.ptr,
                changeVar.ptr,
                classBuf,
                1024uL,
                gecosBuf,
                1024uL,
                dirBuf,
                1024uL,
                shellBuf,
                1024uL,
                expireVar.ptr,
            )
        if (found == 0) {
            null
        } else {
            Passwd(
                pwName = nameBuf.toKString(),
                pwPasswd = passwdBuf.toKString(),
                pwUid = uidVar.value,
                pwGid = gidVar.value,
                pwGecos = gecosBuf.toKString(),
                pwDir = dirBuf.toKString(),
                pwShell = shellBuf.toKString(),
            )
        }
    }
}

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

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int = libc.cinterop.libc_socket(domain, ty, protocol)

public actual fun connect(socket: Int, address: Sockaddr?, len: UInt): Int =
    memScoped {
        if (address == null) {
            libc.cinterop.libc_connect(socket, null, len.toInt())
        } else {
            val buf = allocArray<ByteVar>(len.toInt().coerceAtLeast(16))
            buf[0] = (address.saFamily.toInt() and 0xFF).toByte()
            buf[1] = ((address.saFamily.toInt() shr 8) and 0xFF).toByte()
            val copyLen = minOf(address.saData.size, len.toInt() - 2)
            for (i in 0 until copyLen) {
                buf[i + 2] = address.saData[i]
            }
            libc.cinterop.libc_connect(socket, buf, len.toInt())
        }
    }

public actual fun listen(socket: Int, backlog: Int): Int = libc.cinterop.libc_listen(socket, backlog)

public actual fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    memScoped {
        if (address == null) {
            libc.cinterop.libc_accept(socket, null, null)
        } else {
            val lenVal = addressLen?.toInt() ?: 128
            val lenVar = alloc<IntVar>()
            lenVar.value = lenVal
            val buf = allocArray<ByteVar>(lenVal)
            val res = libc.cinterop.libc_accept(socket, buf, lenVar.ptr)
            if (res >= 0) {
                val copyLen = minOf(address.saData.size, lenVar.value - 2)
                for (i in 0 until copyLen) {
                    address.saData[i] = buf[i + 2]
                }
            }
            res
        }
    }

public actual fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    memScoped {
        if (address == null) {
            libc.cinterop.libc_getpeername(socket, null, null)
        } else {
            val lenVal = addressLen?.toInt() ?: 128
            val lenVar = alloc<IntVar>()
            lenVar.value = lenVal
            val buf = allocArray<ByteVar>(lenVal)
            val res = libc.cinterop.libc_getpeername(socket, buf, lenVar.ptr)
            if (res == 0) {
                val copyLen = minOf(address.saData.size, lenVar.value - 2)
                for (i in 0 until copyLen) {
                    address.saData[i] = buf[i + 2]
                }
            }
            res
        }
    }

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    memScoped {
        if (address == null) {
            libc.cinterop.libc_getsockname(socket, null, null)
        } else {
            val lenVal = addressLen?.toInt() ?: 128
            val lenVar = alloc<IntVar>()
            lenVar.value = lenVal
            val buf = allocArray<ByteVar>(lenVal)
            val res = libc.cinterop.libc_getsockname(socket, buf, lenVar.ptr)
            if (res == 0) {
                val copyLen = minOf(address.saData.size, lenVar.value - 2)
                for (i in 0 until copyLen) {
                    address.saData[i] = buf[i + 2]
                }
            }
            res
        }
    }

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    libc.cinterop.libc_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen.toInt())

public actual fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int =
    memScoped {
        val sv = allocArray<IntVar>(2)
        libc.cinterop.libc_socketpair(domain, type, protocol, sv)
    }

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    memScoped {
        val dest =
            if (addr != null) {
                val destBuf = allocArray<ByteVar>(addrlen.toInt().coerceAtLeast(16))
                destBuf[0] = (addr.saFamily.toInt() and 0xFF).toByte()
                destBuf[1] = ((addr.saFamily.toInt() shr 8) and 0xFF).toByte()
                val copyLen = minOf(addr.saData.size, addrlen.toInt() - 2)
                for (i in 0 until copyLen) {
                    destBuf[i + 2] = addr.saData[i]
                }
                destBuf
            } else {
                null
            }
        libc.cinterop.libc_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, dest, addrlen.toInt())
    }

public actual fun shutdown(socket: Int, how: Int): Int = libc.cinterop.libc_shutdown(socket, how)

public actual fun chmod(path: String?, mode: UInt): Int =
    libc.cinterop.libc_chmod(path, mode)

public actual fun fchmod(fd: Int, mode: UInt): Int =
    libc.cinterop.libc_fchmod(fd, mode)

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: UInt): Int {
    if (path == null) return -1
    return libc.cinterop.libc_mkdir(path, mode.toInt())
}

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun pclose(stream: FILE?): Int =
    libc.cinterop.libc_pclose(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fdopen(fd: Int, mode: String?): FILE? {
    val result = libc_fdopen(fd, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fileno(stream: FILE?): Int =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun open(path: String?, oflag: Int): Int = libc.cinterop.libc_open(path, oflag, 0u)

public actual fun open(path: String?, oflag: Int, mode: UInt): Int = libc.cinterop.libc_open(path, oflag, mode)

public actual fun creat(path: String?, mode: UInt): Int =
    libc.cinterop.libc_creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): Int =
    libc.cinterop.libc_closedir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int =
    libc.cinterop.libc_fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: Int, owner: UInt, group: UInt): Int =
    libc.cinterop.libc_fchown(fd, owner, group)

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UInt, group: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int {
    if (oldpath == null) return -1
    if (newpath == null) return -1
    return libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
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

public actual fun chdir(dir: String?): Int {
    if (dir == null) return -1
    return libc.cinterop.libc_chdir(dir)
}

public actual fun fchdir(dirfd: Int): Int = libc.cinterop.libc_fchdir(dirfd)

public actual fun chown(path: String?, uid: UInt, gid: UInt): Int =
    libc.cinterop.libc_chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UInt, gid: UInt): Int =
    libc.cinterop.libc_lchown(path, uid, gid)

public actual fun close(fd: Int): Int = libc.cinterop.libc_close(fd)

public actual fun dup(fd: Int): Int = libc.cinterop.libc_dup(fd)

public actual fun dup2(src: Int, dst: Int): Int = libc.cinterop.libc_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execl requires manual FFI bridge — not yet implemented")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execle requires manual FFI bridge — not yet implemented")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execlp requires manual FFI bridge — not yet implemented")

public actual fun execv(prog: String?, argv: COpaquePointer?): Int {
    if (prog == null) return -1
    return libc.cinterop.libc_execv(prog, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int {
    if (prog == null) return -1
    return libc.cinterop.libc_execve(prog, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), envp?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun execvp(c: String?, argv: COpaquePointer?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_execvp(c, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun fork(): Int =
    libc.cinterop.libc_fork()

public actual fun fpathconf(filedes: Int, name: Int): Long =
    libc.cinterop.libc_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: ULong): COpaquePointer? {
    val result = libc.cinterop.libc_getcwd(buf?.value?.toCPointer<ByteVar>(), size)
    return result?.let { COpaquePointer(it.toLong()) }
}

public actual fun getgroups(ngroupsMax: Int, groups: UInt?): Int =
    throw UnsupportedOperationException("getgroups requires manual FFI bridge — not yet implemented")

public actual fun getlogin(): String? {
    val result = libc_getlogin()
    return result?.toKString()
}

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getpgid(pid: Int): Int =
    libc.cinterop.libc_getpgid(pid)

public actual fun getpgrp(): Int =
    libc.cinterop.libc_getpgrp()

public actual fun getpid(): Int =
    libc.cinterop.libc_getpid()

public actual fun getppid(): Int =
    libc.cinterop.libc_getppid()

public actual fun geteuid(): UInt = libc.cinterop.libc_geteuid().toUInt()

public actual fun getegid(): UInt = libc.cinterop.libc_getegid().toUInt()

public actual fun getuid(): UInt = libc.cinterop.libc_getuid().toUInt()

public actual fun getgid(): UInt = libc.cinterop.libc_getgid().toUInt()

public actual fun isatty(fd: Int): Int = libc.cinterop.libc_isatty(fd)

public actual fun link(src: String?, dst: String?): Int {
    if (src == null) return -1
    if (dst == null) return -1
    return libc.cinterop.libc_link(src, dst)
}

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    libc.cinterop.libc_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: Int): Long =
    libc.cinterop.libc_pathconf(path, name)

public actual fun pipe(fds: Int?): Int =
    memScoped {
        if (fds == null) {
            val fdsArray = allocArray<IntVar>(2)
            libc.cinterop.libc_pipe(fdsArray)
        } else {
            val ptr = fds.toLong().toCPointer<IntVar>()
            libc.cinterop.libc_pipe(ptr)
        }
    }

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int {
    if (memptr == null) return 22 // EINVAL
    val allocPtr = libc.cinterop.libc_aligned_alloc(align, size) ?: return 12 // ENOMEM
    val outVar = memptr.value.toCPointer<CPointerVar<ByteVar>>()
    if (outVar != null) {
        outVar.pointed.value = allocPtr.reinterpret<ByteVar>()
    }
    return 0
}

public actual fun alignedFree(p: COpaquePointer?) {
    libc.cinterop.libc_aligned_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong(), alignment) }

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    libc.cinterop.libc_read(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count)

public actual fun rmdir(path: String?): Int {
    if (path == null) return -1
    return libc.cinterop.libc_rmdir(path)
}

public actual fun seteuid(uid: UInt): Int {
    val result = libc_seteuid(uid.toInt())
    return result
}

public actual fun setegid(gid: UInt): Int {
    val result = libc_setegid(gid.toInt())
    return result
}

public actual fun setgid(gid: UInt): Int {
    val result = libc_setgid(gid.toInt())
    return result
}

public actual fun setpgid(pid: Int, pgid: Int): Int =
    libc.cinterop.libc_setpgid(pid, pgid)

public actual fun setsid(): Int =
    libc.cinterop.libc_setsid()

public actual fun setuid(uid: UInt): Int {
    val result = libc_setuid(uid.toInt())
    return result
}

public actual fun setreuid(ruid: UInt, euid: UInt): Int =
    libc.cinterop.libc_setreuid(ruid, euid)

public actual fun setregid(rgid: UInt, egid: UInt): Int =
    libc.cinterop.libc_setregid(rgid, egid)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun tcgetpgrp(fd: Int): Int =
    libc.cinterop.libc_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: Int, pgrp: Int): Int =
    libc.cinterop.libc_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: Int): String? {
    val result = libc_ttyname(fd)
    return result?.toKString()
}

public actual fun ttynameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ttynameR requires manual FFI bridge — not yet implemented")

public actual fun unlink(c: String?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_unlink(c)
}

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires manual FFI bridge — not yet implemented")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge — not yet implemented")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    libc.cinterop.libc_write(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count)

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    libc.cinterop.libc_pread(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    libc.cinterop.libc_pwrite(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun kill(pid: Int, sig: Int): Int =
    libc.cinterop.libc_kill(pid, sig)

public actual fun killpg(pgrp: Int, sig: Int): Int =
    libc.cinterop.libc_killpg(pgrp, sig)

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    libc.cinterop.libc_mlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    libc.cinterop.libc_munlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)

public actual fun mlockall(flags: Int): Int = libc.cinterop.libc_mlockall(flags)

public actual fun munlockall(): Int = libc.cinterop.libc_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    libc.cinterop.libc_munmap(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)

public actual fun ifIndextoname(ifindex: UInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname requires manual FFI bridge — not yet implemented")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: Int): Int = libc.cinterop.libc_fsync(fd)

public actual fun setenv(name: String?, `val`: String?, overwrite: Int): Int {
    if (name == null) return -1
    return libc.cinterop.libc_setenv(name, `val`, overwrite)
}

public actual fun unsetenv(name: String?): Int {
    if (name == null) return -1
    return libc.cinterop.libc_unsetenv(name)
}

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

public actual fun realpath(pathname: String?, resolved: String?): String? {
    if (pathname == null) return null
    return memScoped {
        val pathBuf = pathname.cstr.ptr
        val resolvedBuf = allocArray<ByteVar>(4096)
        libc.cinterop.libc_realpath(pathBuf, resolvedBuf)?.toKString()
    }
}

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    libc.cinterop.libc_sched_yield()

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    libc.cinterop.libc_pthread_getspecific(key.toULong())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    libc.cinterop.libc_pthread_setspecific(key.toULong(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    memScoped {
        val lenVar = alloc<IntVar>()
        lenVar.value = optlen?.toInt() ?: 0
        libc.cinterop.libc_getsockopt(
            sockfd,
            level,
            optname,
            optval?.value?.toCPointer<ByteVar>(),
            if (optlen != null) lenVar.ptr else null,
        )
    }

public actual fun raise(signum: Int): Int = libc.cinterop.libc_raise(signum)

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    memScoped {
        val outLen = 16384
        val outBuf = allocArray<ByteVar>(outLen)
        val rc =
            libc.cinterop.libc_getaddrinfo_packed(
                node,
                service,
                if (hints != null) 1 else 0,
                hints?.aiFlags ?: 0,
                hints?.aiFamily ?: 0,
                hints?.aiSocktype ?: 0,
                hints?.aiProtocol ?: 0,
                outBuf,
                outLen.toULong(),
            )
        if (rc != 0) {
            res?.value = 0L
            return rc
        }
        AddrinfoRegistry.parsePackedResult(outBuf.toKString(), hints, res)
    }

public actual fun freeaddrinfo(res: Addrinfo?) {
    AddrinfoRegistry.freeChain(res)
}

public actual fun getnameinfo(
    sa: Sockaddr?,
    salen: UInt,
    host: ByteArray?,
    hostlen: UInt,
    serv: ByteArray?,
    servlen: UInt,
    flags: Int,
): Int =
    memScoped {
        if (sa == null) return -1
        val dataLen = sa.saData.size
        val dataBuf =
            if (dataLen > 0) {
                val b = allocArray<ByteVar>(dataLen)
                for (i in 0 until dataLen) {
                    b[i] = sa.saData[i]
                }
                b
            } else {
                null
            }
        val hLen = if (host != null && hostlen > 0u) minOf(host.size.toUInt(), hostlen) else 0u
        val sLen = if (serv != null && servlen > 0u) minOf(serv.size.toUInt(), servlen) else 0u
        val hBuf = if (hLen > 0u) allocArray<ByteVar>(hLen.toInt()) else null
        val sBuf = if (sLen > 0u) allocArray<ByteVar>(sLen.toInt()) else null
        val rc =
            libc.cinterop.libc_getnameinfo_packed(
                sa.saFamily.toInt(),
                dataBuf,
                dataLen.toUInt(),
                salen,
                hBuf,
                hLen,
                sBuf,
                sLen,
                flags,
            )
        if (rc == 0) {
            if (host != null && hBuf != null && hLen > 0u) {
                for (i in 0 until hLen.toInt()) {
                    host[i] = hBuf[i]
                }
            }
            if (serv != null && sBuf != null && sLen > 0u) {
                for (i in 0 until sLen.toInt()) {
                    serv[i] = sBuf[i]
                }
            }
        }
        rc
    }

public actual fun hstrerror(errcode: Int): String? =
    libc.cinterop.libc_hstrerror(errcode)?.toKString()

public actual fun gaiStrerror(errcode: Int): String? {
    val result = libc_gai_strerror(errcode)
    return result?.toKString()
}

public actual fun resInit(): Int =
    libc.cinterop.libc_res_init()

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun mknod(pathname: String?, mode: UInt, dev: ULong): Int =
    libc.cinterop.libc_mknod(pathname, mode, dev)

public actual fun gethostname(name: COpaquePointer?, len: ULong): Int {
    val rawPtr = name?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_gethostname(rawPtr, len)
}

public actual fun endservent(): Unit = throw UnsupportedOperationException("endservent requires manual FFI bridge — not yet implemented")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun getservbyport(port: Int, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport requires manual FFI bridge — not yet implemented")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent requires manual FFI bridge — not yet implemented")

public actual fun setservent(stayopen: Int): Unit = throw UnsupportedOperationException("setservent requires manual FFI bridge — not yet implemented")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge — not yet implemented")

public actual fun chroot(name: String?): Int {
    if (name == null) return -1
    return libc.cinterop.libc_chroot(name)
}

public actual fun usleep(secs: UInt): Int =
    libc.cinterop.libc_usleep(secs)

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    libc.cinterop.libc_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    libc.cinterop.libc_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: String?): Int =
    libc.cinterop.libc_putenv(string)

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int {
    require(nfds <= 1u && (nfds == 0u || fds != null)) {
        "Use the array overload when polling multiple descriptors"
    }
    return poll(if (nfds == 0u) emptyArray() else arrayOf(requireNotNull(fds)), timeout)
}

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    memScoped {
        val rset = if (readfds != null) libc.cinterop.libc_fd_set_alloc() else null
        val wset = if (writefds != null) libc.cinterop.libc_fd_set_alloc() else null
        val eset = if (errorfds != null) libc.cinterop.libc_fd_set_alloc() else null
        try {
            if (readfds != null && rset != null) {
                libc.cinterop.libc_fd_zero(rset)
                for (fd in 0 until nfds) {
                    val idx = fd / 64
                    val bit = fd % 64
                    if (idx < readfds.fdsBits.size && (readfds.fdsBits[idx] and (1uL shl bit)) != 0uL) {
                        libc.cinterop.libc_fd_set(fd, rset)
                    }
                }
            }
            if (writefds != null && wset != null) {
                libc.cinterop.libc_fd_zero(wset)
                for (fd in 0 until nfds) {
                    val idx = fd / 64
                    val bit = fd % 64
                    if (idx < writefds.fdsBits.size && (writefds.fdsBits[idx] and (1uL shl bit)) != 0uL) {
                        libc.cinterop.libc_fd_set(fd, wset)
                    }
                }
            }
            if (errorfds != null && eset != null) {
                libc.cinterop.libc_fd_zero(eset)
                for (fd in 0 until nfds) {
                    val idx = fd / 64
                    val bit = fd % 64
                    if (idx < errorfds.fdsBits.size && (errorfds.fdsBits[idx] and (1uL shl bit)) != 0uL) {
                        libc.cinterop.libc_fd_set(fd, eset)
                    }
                }
            }
            val ret =
                libc.cinterop.libc_select_timeout(
                    nfds,
                    rset,
                    wset,
                    eset,
                    if (timeout == null) 0 else 1,
                    timeout?.tvSec ?: 0L,
                    timeout?.tvUsec ?: 0L,
                )
            if (ret >= 0) {
                if (readfds != null && rset != null) {
                    for (fd in 0 until nfds) {
                        val idx = fd / 64
                        val bit = fd % 64
                        if (idx < readfds.fdsBits.size) {
                            if (libc.cinterop.libc_fd_isset(fd, rset) != 0) {
                                readfds.fdsBits[idx] = readfds.fdsBits[idx] or (1uL shl bit)
                            } else {
                                readfds.fdsBits[idx] = readfds.fdsBits[idx] and (1uL shl bit).inv()
                            }
                        }
                    }
                }
                if (writefds != null && wset != null) {
                    for (fd in 0 until nfds) {
                        val idx = fd / 64
                        val bit = fd % 64
                        if (idx < writefds.fdsBits.size) {
                            if (libc.cinterop.libc_fd_isset(fd, wset) != 0) {
                                writefds.fdsBits[idx] = writefds.fdsBits[idx] or (1uL shl bit)
                            } else {
                                writefds.fdsBits[idx] = writefds.fdsBits[idx] and (1uL shl bit).inv()
                            }
                        }
                    }
                }
                if (errorfds != null && eset != null) {
                    for (fd in 0 until nfds) {
                        val idx = fd / 64
                        val bit = fd % 64
                        if (idx < errorfds.fdsBits.size) {
                            if (libc.cinterop.libc_fd_isset(fd, eset) != 0) {
                                errorfds.fdsBits[idx] = errorfds.fdsBits[idx] or (1uL shl bit)
                            } else {
                                errorfds.fdsBits[idx] = errorfds.fdsBits[idx] and (1uL shl bit).inv()
                            }
                        }
                    }
                }
            }
            ret
        } finally {
            if (rset != null) libc.cinterop.libc_fd_set_free(rset)
            if (wset != null) libc.cinterop.libc_fd_set_free(wset)
            if (eset != null) libc.cinterop.libc_fd_set_free(eset)
        }
    }

public actual fun setlocale(category: Int, locale: String?): String? {
    val result = libc_setlocale(category, locale)
    return result?.toKString()
}

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun semWait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun statvfs(path: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs requires manual FFI bridge — not yet implemented")

public actual fun fstatvfs(fd: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs requires manual FFI bridge — not yet implemented")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: Int): Long =
    libc.cinterop.libc_sysconf(name)

public actual fun mkfifo(path: String?, mode: UInt): Int =
    libc.cinterop.libc_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): Long =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun tcdrain(fd: Int): Int =
    libc.cinterop.libc_tcdrain(fd)

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    memScoped {
        val buf = allocArray<ByteVar>(128)
        libc.cinterop.libc_tcgetattr(fd, buf)
    }

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    memScoped {
        val buf = allocArray<ByteVar>(128)
        libc.cinterop.libc_tcgetattr(fd, buf)
        libc.cinterop.libc_tcsetattr(fd, optionalActions, buf)
    }

public actual fun tcflow(fd: Int, action: Int): Int =
    libc.cinterop.libc_tcflow(fd, action)

public actual fun tcflush(fd: Int, action: Int): Int = libc.cinterop.libc_tcflush(fd, action)

public actual fun tcgetsid(fd: Int): Int =
    libc.cinterop.libc_tcgetsid(fd)

public actual fun tcsendbreak(fd: Int, duration: Int): Int = libc.cinterop.libc_tcsendbreak(fd, duration)

public actual fun mkstemp(template: String?): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemp(template)
}

public actual fun mkdtemp(template: String?): String? {
    if (template == null) return null
    return memScoped {
        val len = template.length + 1
        val buf = allocArray<ByteVar>(len)
        template.cstr.place(buf)
        libc.cinterop.libc_mkdtemp(buf)?.toKString()
    }
}

public actual fun tmpnam(ptr: String?): String? =
    memScoped {
        allocArray<ByteVar>(1024).let {
            libc.cinterop.libc_tmpnam(it)?.toKString()
        }
    }

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog requires manual FFI bridge — not yet implemented")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog requires manual FFI bridge — not yet implemented")

public actual fun setlogmask(maskpri: Int): Int = libc.cinterop.libc_setlogmask(maskpri)

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog requires manual FFI bridge — not yet implemented")

public actual fun nice(incr: Int): Int =
    libc.cinterop.libc_nice(incr)

public actual fun grantpt(fd: Int): Int =
    libc.cinterop.libc_grantpt(fd)

public actual fun posixOpenpt(flags: Int): Int =
    throw UnsupportedOperationException("posixOpenpt requires manual FFI bridge — not yet implemented")

public actual fun ptsname(fd: Int): String? =
    throw UnsupportedOperationException("ptsname requires manual FFI bridge — not yet implemented")

public actual fun unlockpt(fd: Int): Int =
    libc.cinterop.libc_unlockpt(fd)

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun lockf(fd: Int, cmd: Int, len: Long): Int =
    libc.cinterop.libc_lockf(fd, cmd, len)

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): Int =
    throw UnsupportedOperationException("adjtime requires manual FFI bridge — not yet implemented")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires manual FFI bridge — not yet implemented")

public actual fun confstr(name: Int, buf: COpaquePointer?, len: ULong): ULong {
    val rawPtr = buf?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_confstr(name, rawPtr, len)
}

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun flock(fd: Int, operation: Int): Int =
    libc.cinterop.libc_flock(fd, operation)

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream requires manual FFI bridge — not yet implemented")

public actual fun getsid(pid: Int): Int =
    libc.cinterop.libc_getsid(pid)

public actual fun pause(): Int = libc.cinterop.libc_pause()

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    libc.cinterop.libc_mkdirat(dirfd, pathname, mode)

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: COpaquePointer?, bufsiz: ULong): Int {
    val rawBuf = buf?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_readlinkat(dirfd, pathname, rawBuf, bufsiz).toInt()
}

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: ULong): Int {
    val rawBuf = buf?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_readlink(path, rawBuf, bufsz).toInt()
}

public actual fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("pselect requires manual FFI bridge — not yet implemented")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen requires manual FFI bridge — not yet implemented")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream requires manual FFI bridge — not yet implemented")

public actual fun cfmakeraw(termios: Termios?): Int =
    memScoped {
        val buf = allocArray<ByteVar>(128)
        libc.cinterop.libc_cfmakeraw(buf)
        0
    }

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed requires manual FFI bridge — not yet implemented")

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    libc.cinterop.libc_fnmatch(pattern, name, flags)

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: Int?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun sigqueue(pid: Int, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("sigqueue requires manual FFI bridge for ambiguous type")

public actual fun getpwuid(uid: UInt): Passwd? =
    memScoped {
        val nameBuf = allocArray<ByteVar>(1024)
        val passwdBuf = allocArray<ByteVar>(1024)
        val uidVar = alloc<UIntVar>()
        val gidVar = alloc<UIntVar>()
        val changeVar = alloc<LongVar>()
        val classBuf = allocArray<ByteVar>(1024)
        val gecosBuf = allocArray<ByteVar>(1024)
        val dirBuf = allocArray<ByteVar>(1024)
        val shellBuf = allocArray<ByteVar>(1024)
        val expireVar = alloc<LongVar>()
        val found =
            libc.cinterop.libc_getpwuid_fields(
                uid,
                nameBuf,
                1024uL,
                passwdBuf,
                1024uL,
                uidVar.ptr,
                gidVar.ptr,
                changeVar.ptr,
                classBuf,
                1024uL,
                gecosBuf,
                1024uL,
                dirBuf,
                1024uL,
                shellBuf,
                1024uL,
                expireVar.ptr,
            )
        if (found == 0) {
            null
        } else {
            Passwd(
                pwName = nameBuf.toKString(),
                pwPasswd = passwdBuf.toKString(),
                pwUid = uidVar.value,
                pwGid = gidVar.value,
                pwGecos = gecosBuf.toKString(),
                pwDir = dirBuf.toKString(),
                pwShell = shellBuf.toKString(),
            )
        }
    }
