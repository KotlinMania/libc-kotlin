@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.fuchsia
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ShortVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abs
import libc.cinterop.libc_access
import libc.cinterop.libc_acct
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_chdir
import libc.cinterop.libc_close
import libc.cinterop.libc_closedir
import libc.cinterop.libc_daemon
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_dup
import libc.cinterop.libc_dup2
import libc.cinterop.libc_endgrent
import libc.cinterop.libc_endpwent
import libc.cinterop.libc_execv
import libc.cinterop.libc_execve
import libc.cinterop.libc_execvp
import libc.cinterop.libc_faccessat
import libc.cinterop.libc_fclose
import libc.cinterop.libc_fdatasync
import libc.cinterop.libc_fdopen
import libc.cinterop.libc_feof
import libc.cinterop.libc_ferror
import libc.cinterop.libc_fflush
import libc.cinterop.libc_fgetc
import libc.cinterop.libc_fileno
import libc.cinterop.libc_flock
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
import libc.cinterop.libc_futimens
import libc.cinterop.libc_gai_strerror
import libc.cinterop.libc_getchar
import libc.cinterop.libc_getdomainname
import libc.cinterop.libc_getdtablesize
import libc.cinterop.libc_getenv
import libc.cinterop.libc_gethostname
import libc.cinterop.libc_getlogin
import libc.cinterop.libc_getpgid
import libc.cinterop.libc_getpgrp
import libc.cinterop.libc_getpid
import libc.cinterop.libc_getppid
import libc.cinterop.libc_getsid
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_grantpt
import libc.cinterop.libc_initgroups
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
import libc.cinterop.libc_listen
import libc.cinterop.libc_lseek
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memalign
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_mknodat
import libc.cinterop.libc_mkostemp
import libc.cinterop.libc_mkostemps
import libc.cinterop.libc_mkstemp
import libc.cinterop.libc_mkstemps
import libc.cinterop.libc_mlockall
import libc.cinterop.libc_munlockall
import libc.cinterop.libc_pathconf
import libc.cinterop.libc_pause
import libc.cinterop.libc_perror
import libc.cinterop.libc_poll
import libc.cinterop.libc_poll_single
import libc.cinterop.libc_popen
import libc.cinterop.libc_pthread_getspecific
import libc.cinterop.libc_pthread_setspecific
import libc.cinterop.libc_putchar
import libc.cinterop.libc_putenv
import libc.cinterop.libc_puts
import libc.cinterop.libc_rand
import libc.cinterop.libc_readlink
import libc.cinterop.libc_readlinkat
import libc.cinterop.libc_realpath
import libc.cinterop.libc_reboot
import libc.cinterop.libc_remove
import libc.cinterop.libc_rename
import libc.cinterop.libc_renameat
import libc.cinterop.libc_rewind
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_sched_get_priority_max
import libc.cinterop.libc_sched_get_priority_min
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setdomainname
import libc.cinterop.libc_setegid
import libc.cinterop.libc_setenv
import libc.cinterop.libc_seteuid
import libc.cinterop.libc_setgid
import libc.cinterop.libc_setgrent
import libc.cinterop.libc_sethostname
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_setlogmask
import libc.cinterop.libc_setpgid
import libc.cinterop.libc_setpwent
import libc.cinterop.libc_setsid
import libc.cinterop.libc_settimeofday
import libc.cinterop.libc_setuid
import libc.cinterop.libc_setvbuf
import libc.cinterop.libc_shm_open
import libc.cinterop.libc_shm_unlink
import libc.cinterop.libc_shmdt
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_srand
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strcspn
import libc.cinterop.libc_strdup
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strspn
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strxfrm
import libc.cinterop.libc_symlink
import libc.cinterop.libc_symlinkat
import libc.cinterop.libc_sysconf
import libc.cinterop.libc_system
import libc.cinterop.libc_tcdrain
import libc.cinterop.libc_tcgetpgrp
import libc.cinterop.libc_tcgetsid
import libc.cinterop.libc_tcsendbreak
import libc.cinterop.libc_tcsetpgrp
import libc.cinterop.libc_tmpfile
import libc.cinterop.libc_tmpnam
import libc.cinterop.libc_tolower
import libc.cinterop.libc_toupper
import libc.cinterop.libc_ttyname
import libc.cinterop.libc_uname
import libc.cinterop.libc_ungetc
import libc.cinterop.libc_unlink
import libc.cinterop.libc_unlinkat
import libc.cinterop.libc_unlockpt
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_usleep
import libc.cinterop.libc_utimensat

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

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

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires manual FFI bridge — not yet implemented")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseek(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): Long =
    libc.cinterop.libc_ftell(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewind(stream: FILE?) {
    if (stream == null) return
    val streamPtr: CPointer<ByteVar>? = stream.handle.toCPointer()
    libc_rewind(streamPtr)
}

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun feof(stream: FILE?): Int =
    libc.cinterop.libc_feof(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun ferror(stream: FILE?): Int =
    libc.cinterop.libc_ferror(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

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

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires manual FFI bridge — not yet implemented")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — not yet implemented")

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

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — not yet implemented")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires FFI bridge")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — not yet implemented")

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

public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, maxlen)

public actual fun strerror(n: Int): String? {
    val result = libc_strerror(n)
    return result?.toKString()
}

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires FFI bridge")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong =
    memScoped {
        libc.cinterop.libc_strxfrm(s?.value?.toCPointer<ByteVar>(), ct?.cstr?.getPointer(this), n)
    }

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — not yet implemented")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp requires manual FFI bridge — not yet implemented")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — not yet implemented")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — not yet implemented")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — not yet implemented")

public actual fun abs(i: Int): Int =
    libc.cinterop.libc_abs(i)

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc_srand(seed)
}

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam requires manual FFI bridge — not yet implemented")

public actual fun getpwuid(uid: UInt): Passwd? =
    throw UnsupportedOperationException("getpwuid requires manual FFI bridge — not yet implemented")

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

public actual fun connect(socket: Int, address: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: Int, backlog: Int): Int = libc.cinterop.libc_listen(socket, backlog)

public actual fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int =
    throw UnsupportedOperationException("socketpair requires manual FFI bridge — not yet implemented")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires manual FFI bridge — not yet implemented")

public actual fun shutdown(socket: Int, how: Int): Int = libc.cinterop.libc_shutdown(socket, how)

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — not yet implemented")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: UInt): Int {
    if (path == null) return -1
    return libc.cinterop.libc_mkdir(path, mode.toInt())
}

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: Int, mode: String?): FILE? {
    val result = libc_fdopen(fd, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fileno(stream: FILE?): Int =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires manual FFI bridge — not yet implemented")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): Int =
    libc.cinterop.libc_closedir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat requires manual FFI bridge — not yet implemented")

public actual fun fchown(fd: Int, owner: UInt, group: UInt): Int =
    throw UnsupportedOperationException("fchown requires manual FFI bridge — not yet implemented")

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UInt, group: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int {
    if (oldpath == null) return -1
    if (newpath == null) return -1
    return libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
}

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat requires manual FFI bridge — not yet implemented")

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

public actual fun chdir(dir: String?): Int {
    if (dir == null) return -1
    return libc.cinterop.libc_chdir(dir)
}

public actual fun chown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("chown requires manual FFI bridge — not yet implemented")

public actual fun lchown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("lchown requires manual FFI bridge — not yet implemented")

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

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

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

public actual fun pause(): Int = libc.cinterop.libc_pause()

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("read requires manual FFI bridge — not yet implemented")

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

public actual fun unlink(c: String?): Int {
    if (c == null) return -1
    return libc.cinterop.libc_unlink(c)
}

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires manual FFI bridge — not yet implemented")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge — not yet implemented")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread requires manual FFI bridge — not yet implemented")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite requires manual FFI bridge — not yet implemented")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock requires manual FFI bridge — not yet implemented")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock requires manual FFI bridge — not yet implemented")

public actual fun mlockall(flags: Int): Int = libc.cinterop.libc_mlockall(flags)

public actual fun munlockall(): Int = libc.cinterop.libc_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires manual FFI bridge — not yet implemented")

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

public actual fun ftruncate(fd: Int, length: Long): Int =
    libc.cinterop.libc_ftruncate(fd, length)

public actual fun realpath(pathname: String?, resolved: String?): String? {
    if (pathname == null) return null
    return memScoped {
        val pathBuf = pathname.cstr.ptr
        val resolvedBuf = allocArray<ByteVar>(4096)
        val result = libc.cinterop.libc_realpath(pathBuf, resolvedBuf)
        result?.toKString()
    }
}

public actual fun flock(fd: Int, operation: Int): Int =
    libc.cinterop.libc_flock(fd, operation)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
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

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

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

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: ULong, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires FFI bridge")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires FFI bridge")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(res: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun gaiStrerror(errcode: Int): String? {
    val result = libc_gai_strerror(errcode)
    return result?.toKString()
}

public actual fun resInit(): Int =
    throw UnsupportedOperationException("resInit requires manual FFI bridge — not yet implemented")

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

public actual fun mknod(pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknod requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun gethostname(name: String?, len: ULong): Int =
    memScoped {
        libc.cinterop.libc_gethostname(name?.cstr?.getPointer(this), len)
    }

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge — not yet implemented")

public actual fun usleep(secs: UInt): Int = libc.cinterop.libc_usleep(secs)

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires manual FFI bridge — not yet implemented")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires manual FFI bridge — not yet implemented")

public actual fun putenv(string: String?): Int =
    libc_putenv(string)

public actual fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int {
    if (fds == null || nfds == 0uL) {
        return libc_poll(null, 0u, timeout)
    }
    return memScoped {
        val revents = alloc<ShortVar>()
        libc_poll_single(fds.fd, fds.events, revents.ptr, timeout)
    }
}

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select requires manual FFI bridge — not yet implemented")

public actual fun setlocale(category: Int, locale: String?): String? {
    val result = libc_setlocale(category, locale)
    return result?.toKString()
}

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semWait(sem: SemT?): Int =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: SemT?): Int =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT?): Int =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun statvfs(path: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs requires manual FFI bridge — not yet implemented")

public actual fun fstatvfs(fd: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs requires manual FFI bridge — not yet implemented")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): Long =
    memScoped {
        libc.cinterop.libc_readlink(path, buf?.cstr?.getPointer(this), bufsz)
    }

public actual fun sigemptyset(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun getsid(pid: Int): Int =
    libc.cinterop.libc_getsid(pid)

public actual fun sysconf(name: Int): Long =
    libc.cinterop.libc_sysconf(name)

public actual fun mkfifo(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifo requires manual FFI bridge — not yet implemented")

public actual fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("pselect requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): Long =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun tcdrain(fd: Int): Int =
    libc.cinterop.libc_tcdrain(fd)

public actual fun cfmakeraw(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr requires manual FFI bridge — not yet implemented")

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr requires manual FFI bridge — not yet implemented")

public actual fun tcgetsid(fd: Int): Int =
    libc.cinterop.libc_tcgetsid(fd)

public actual fun tcsendbreak(fd: Int, duration: Int): Int = libc.cinterop.libc_tcsendbreak(fd, duration)

public actual fun mkstemp(template: String?): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemp(template)
}

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires FFI bridge")

public actual fun tmpnam(ptr: String?): String? =
    memScoped {
        val buf = allocArray<ByteVar>(1024)
        val result = libc.cinterop.libc_tmpnam(buf)
        result?.toKString()
    }

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog requires manual FFI bridge — not yet implemented")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog requires manual FFI bridge — not yet implemented")

public actual fun setlogmask(maskpri: Int): Int = libc.cinterop.libc_setlogmask(maskpri)

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog requires manual FFI bridge — not yet implemented")

public actual fun grantpt(fd: Int): Int =
    libc.cinterop.libc_grantpt(fd)

public actual fun posixOpenpt(flags: Int): Int =
    throw UnsupportedOperationException("posixOpenpt requires manual FFI bridge — not yet implemented")

public actual fun ptsname(fd: Int): String? =
    throw UnsupportedOperationException("ptsname requires manual FFI bridge — not yet implemented")

public actual fun unlockpt(fd: Int): Int =
    libc.cinterop.libc_unlockpt(fd)

public actual fun fdatasync(fd: Int): Int =
    libc.cinterop.libc_fdatasync(fd)

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires FFI bridge")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires FFI bridge")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: ULong, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    libc.cinterop.libc_mknodat(dirfd, pathname, mode.toInt(), dev)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun setreuid(ruid: UInt, euid: UInt): Int =
    throw UnsupportedOperationException("setreuid requires manual FFI bridge — not yet implemented")

public actual fun setregid(rgid: UInt, egid: UInt): Int =
    throw UnsupportedOperationException("setregid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun acct(filename: String?): Int {
    if (filename == null) return -1
    return libc.cinterop.libc_acct(filename)
}

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk requires manual FFI bridge — not yet implemented")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun setpwent() {
    libc_setpwent()
}

public actual fun endpwent() {
    libc_endpwent()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int {
    val result = libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun semget(key: Int, nsems: Int, semflag: Int): Int =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl requires manual FFI bridge — not yet implemented")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun readahead(fd: Int, offset: Long, count: ULong): Long =
    throw UnsupportedOperationException("readahead requires manual FFI bridge — not yet implemented")

public actual fun signalfd(fd: Int, mask: SigsetT?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun quotactl(cmd: Int, special: String?, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl requires manual FFI bridge — not yet implemented")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun mkostemp(template: String?, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemp(template, flags)
}

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemps(template, suffixlen, flags)
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun reboot(howTo: Int): Int =
    libc.cinterop.libc_reboot(howTo)

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid requires manual FFI bridge — not yet implemented")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires manual FFI bridge — not yet implemented")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")

public actual fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: UInt): Int =
    throw UnsupportedOperationException("syncFileRange requires manual FFI bridge — not yet implemented")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires FFI bridge")

public actual fun shmUnlink(name: String?): Int {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemps(template, suffixlen)
}

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun getdomainname(name: String?, len: ULong): Int =
    libc.cinterop.libc_getdomainname(name, len)

public actual fun setdomainname(name: String?, len: ULong): Int =
    libc.cinterop.libc_setdomainname(name, len)

public actual fun vhangup(): Int =
    throw UnsupportedOperationException("vhangup requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: Int): Int {
    val result = libc_sched_get_priority_max(policy)
    return result
}

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun swapoff(puath: String?): Int =
    throw UnsupportedOperationException("swapoff requires manual FFI bridge — not yet implemented")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun personality(persona: ULong): Int =
    throw UnsupportedOperationException("personality requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: ULong, timeout: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc_sched_getscheduler(pid)
    return result
}

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): Int =
    libc.cinterop.libc_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: Int): Int {
    val result = libc_sched_get_priority_min(policy)
    return result
}

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 requires manual FFI bridge — not yet implemented")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): Int =
    libc.cinterop.libc_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: UInt): Int {
    val result = libc_initgroups(user, group.toInt())
    return result
}

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): Int {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    libc_setgrent()
}

public actual fun endgrent() {
    libc_endgrent()
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? {
    val result = libc_popen(command, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
}
