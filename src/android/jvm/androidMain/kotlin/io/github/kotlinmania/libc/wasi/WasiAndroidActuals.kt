@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

private object WasiJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_wasi_exit(code: Int)

    @JvmStatic
    external fun libc_wasi_abort()

    @JvmStatic
    external fun libc_wasi_alignedAlloc(a: Long, b: Long): Long

    @JvmStatic
    external fun libc_wasi_calloc(amt: Long, amt2: Long): Long

    @JvmStatic
    external fun libc_wasi_free(ptr: Long)

    @JvmStatic
    external fun libc_wasi_getenv(s: String?): Long

    @JvmStatic
    external fun libc_wasi_malloc(amt: Long): Long

    @JvmStatic
    external fun libc_wasi_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_wasi_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_wasi_rand(): Int

    @JvmStatic
    external fun libc_wasi_read(fd: Int, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_wasi_realloc(ptr: Long, amt: Long): Long

    @JvmStatic
    external fun libc_wasi_setenv(k: String?, v: String?, a: Int): Int

    @JvmStatic
    external fun libc_wasi_unsetenv(k: String?): Int

    @JvmStatic
    external fun libc_wasi_clearenv(): Int

    @JvmStatic
    external fun libc_wasi_write(fd: Int, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_wasi_fopen(a: String?, b: String?): Long

    @JvmStatic
    external fun libc_wasi_freopen(a: String?, b: String?, f: Long): Long

    @JvmStatic
    external fun libc_wasi_fclose(f: Long): Int

    @JvmStatic
    external fun libc_wasi_remove(a: String?): Int

    @JvmStatic
    external fun libc_wasi_rename(a: String?, b: String?): Int

    @JvmStatic
    external fun libc_wasi_feof(f: Long): Int

    @JvmStatic
    external fun libc_wasi_ferror(f: Long): Int

    @JvmStatic
    external fun libc_wasi_fflush(f: Long): Int

    @JvmStatic
    external fun libc_wasi_clearerr(f: Long)

    @JvmStatic
    external fun libc_wasi_fseek(f: Long, b: Long, c: Int): Int

    @JvmStatic
    external fun libc_wasi_ftell(f: Long): Long

    @JvmStatic
    external fun libc_wasi_rewind(f: Long)

    @JvmStatic
    external fun libc_wasi_fgetpos(f: Long, pos: Long): Int

    @JvmStatic
    external fun libc_wasi_fsetpos(f: Long, pos: Long): Int

    @JvmStatic
    external fun libc_wasi_fread(buf: Long, a: Long, b: Long, f: Long): Long

    @JvmStatic
    external fun libc_wasi_fwrite(buf: Long, a: Long, b: Long, f: Long): Long

    @JvmStatic
    external fun libc_wasi_fgetc(f: Long): Int

    @JvmStatic
    external fun libc_wasi_getc(f: Long): Int

    @JvmStatic
    external fun libc_wasi_getchar(): Int

    @JvmStatic
    external fun libc_wasi_ungetc(a: Int, f: Long): Int

    @JvmStatic
    external fun libc_wasi_fputc(a: Int, f: Long): Int

    @JvmStatic
    external fun libc_wasi_putc(a: Int, f: Long): Int

    @JvmStatic
    external fun libc_wasi_putchar(a: Int): Int

    @JvmStatic
    external fun libc_wasi_fputs(a: String?, f: Long): Int

    @JvmStatic
    external fun libc_wasi_puts(a: String?): Int

    @JvmStatic
    external fun libc_wasi_perror(a: String?)

    @JvmStatic
    external fun libc_wasi_srand(a: Int)

    @JvmStatic
    external fun libc_wasi_atexit(a: Long): Int

    @JvmStatic
    external fun libc_wasi_atQuickExit(a: Long): Int

    @JvmStatic
    external fun libc_wasi_quickExit(a: Int)

    @JvmStatic
    external fun libc_wasi_posixMemalign(a: Long, b: Long, c: Long): Int

    @JvmStatic
    external fun libc_wasi_randR(a: Long): Int

    @JvmStatic
    external fun libc_wasi_random(): Long

    @JvmStatic
    external fun libc_wasi_srandom(a: Int)

    @JvmStatic
    external fun libc_wasi_putenv(a: Long): Int

    @JvmStatic
    external fun libc_wasi_clock(): Long

    @JvmStatic
    external fun libc_wasi_time(a: Long): Long

    @JvmStatic
    external fun libc_wasi_difftime(a: Long, b: Long): Double

    @JvmStatic
    external fun libc_wasi_mktime(a: Long): Long

    @JvmStatic
    external fun libc_wasi_strftime(a: Long, b: Long, c: String?, d: Long): Long

    @JvmStatic
    external fun libc_wasi_gmtime(a: Long): Long

    @JvmStatic
    external fun libc_wasi_gmtimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libc_wasi_localtime(a: Long): Long

    @JvmStatic
    external fun libc_wasi_localtimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libc_wasi_asctimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libc_wasi_ctimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libc_wasi_nanosleep(a: Long, b: Long): Int

    @JvmStatic
    external fun libc_wasi_clockGetres(a: Int, b: Long): Int

    @JvmStatic
    external fun libc_wasi_clockGettime(a: Int, b: Long): Int

    @JvmStatic
    external fun libc_wasi_clockNanosleep(a: Int, a2: Int, b: Long, c: Long): Int

    @JvmStatic
    external fun libc_wasi_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_wasi_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_wasi_islower(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isprint(c: Int): Int

    @JvmStatic
    external fun libc_wasi_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isspace(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isupper(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_wasi_isblank(c: Int): Int

    @JvmStatic
    external fun libc_wasi_tolower(c: Int): Int

    @JvmStatic
    external fun libc_wasi_toupper(c: Int): Int

    @JvmStatic
    external fun libc_wasi_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_wasi_setbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libc_wasi_fgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libc_wasi_atof(s: String?): Double

    @JvmStatic
    external fun libc_wasi_atoi(s: String?): Int

    @JvmStatic
    external fun libc_wasi_atol(s: String?): Long

    @JvmStatic
    external fun libc_wasi_atoll(s: String?): Long

    @JvmStatic
    external fun libc_wasi_strtod(s: String?, endp: Long): Double

    @JvmStatic
    external fun libc_wasi_strtof(s: String?, endp: Long): Float

    @JvmStatic
    external fun libc_wasi_strtol(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_wasi_strtoll(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_wasi_strtoul(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_wasi_strtoull(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_wasi_strcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_wasi_strncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_wasi_strcat(s: Long, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_strncat(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_wasi_strcmp(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_wasi_strncmp(cs: String?, ct: String?, n: Long): Int

    @JvmStatic
    external fun libc_wasi_strcoll(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_wasi_strchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_wasi_strrchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_wasi_strspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_strcspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_strdup(cs: String?): Long

    @JvmStatic
    external fun libc_wasi_strndup(cs: String?, n: Long): Long

    @JvmStatic
    external fun libc_wasi_strpbrk(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_strstr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_strcasecmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_wasi_strncasecmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_wasi_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_wasi_strnlen(cs: String?, maxlen: Long): Long

    @JvmStatic
    external fun libc_wasi_strerror(n: Int): Long

    @JvmStatic
    external fun libc_wasi_strtok(s: Long, t: String?): Long

    @JvmStatic
    external fun libc_wasi_strxfrm(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_wasi_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_wasi_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_wasi_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_wasi_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_wasi_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_wasi_getcharUnlocked(): Int

    @JvmStatic
    external fun libc_wasi_putcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libc_wasi_shutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libc_wasi_fstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_wasi_mkdir(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_wasi_stat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_wasi_fdopen(fd: Int, mode: String?): Long

    @JvmStatic
    external fun libc_wasi_fileno(stream: Long): Int

    @JvmStatic
    external fun libc_wasi_creat(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_wasi_opendir(dirname: String?): Long

    @JvmStatic
    external fun libc_wasi_fdopendir(fd: Int): Long

    @JvmStatic
    external fun libc_wasi_readdir(dirp: Long): Long

    @JvmStatic
    external fun libc_wasi_closedir(dirp: Long): Int

    @JvmStatic
    external fun libc_wasi_rewinddir(dirp: Long)

    @JvmStatic
    external fun libc_wasi_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_wasi_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_wasi_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_wasi_fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_mkdirat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_wasi_readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Long

    @JvmStatic
    external fun libc_wasi_renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int

    @JvmStatic
    external fun libc_wasi_symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int

    @JvmStatic
    external fun libc_wasi_unlinkat(dirfd: Int, pathname: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_access(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_wasi_close(fd: Int): Int

    @JvmStatic
    external fun libc_wasi_fpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libc_wasi_getopt(argc: Int, argv: Long, optstr: String?): Int

    @JvmStatic
    external fun libc_wasi_isatty(fd: Int): Int

    @JvmStatic
    external fun libc_wasi_link(src: String?, dst: String?): Int

    @JvmStatic
    external fun libc_wasi_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_wasi_pathconf(path: String?, name: Int): Long

    @JvmStatic
    external fun libc_wasi_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_wasi_sleep(secs: Int): Int

    @JvmStatic
    external fun libc_wasi_unlink(c: String?): Int

    @JvmStatic
    external fun libc_wasi_pread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_wasi_pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_wasi_lstat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_wasi_fsync(fd: Int): Int

    @JvmStatic
    external fun libc_wasi_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_wasi_symlink(path1: String?, path2: String?): Int

    @JvmStatic
    external fun libc_wasi_truncate(path: String?, length: Long): Int

    @JvmStatic
    external fun libc_wasi_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_wasi_getrusage(resource: Int, usage: Long): Int

    @JvmStatic
    external fun libc_wasi_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_wasi_times(buf: Long): Long

    @JvmStatic
    external fun libc_wasi_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_wasi_usleep(secs: Int): Int

    @JvmStatic
    external fun libc_wasi_send(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_wasi_recv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_wasi_poll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libc_wasi_setlocale(category: Int, locale: String?): Long

    @JvmStatic
    external fun libc_wasi_localeconv(): Long

    @JvmStatic
    external fun libc_wasi_readlink(path: String?, buf: Long, bufsz: Long): Long

    @JvmStatic
    external fun libc_wasi_timegm(tm: Long): Long

    @JvmStatic
    external fun libc_wasi_sysconf(name: Int): Long

    @JvmStatic
    external fun libc_wasi_fseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_wasi_ftello(stream: Long): Long

    @JvmStatic
    external fun libc_wasi_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_wasi_strcasestr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_wasi_getline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libc_wasi_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_wasi_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_wasi_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_wasi_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_wasi_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_wasi_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_wasi_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_wasi_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_wasi_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_wasi_abs(i: Int): Int

    @JvmStatic
    external fun libc_wasi_labs(i: Long): Long

    @JvmStatic
    external fun libc_wasi_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_wasi_freelocale(loc: Long)

    @JvmStatic
    external fun libc_wasi_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_wasi_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_wasi_schedYield(): Int

    @JvmStatic
    external fun libc_wasi_getcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libc_wasi_chdir(dir: String?): Int

    @JvmStatic
    external fun libc_wasi_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_wasi_nlLanginfoL(item: Int, loc: Long): Long

    @JvmStatic
    external fun libc_wasi_select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_wasi_wasilibcRegisterPreopenedFd(fd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcFdRenumber(fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcUnlinkat(fd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcRmdirat(fd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcFindRelpath(path: String?, absPrefix: Long, relativePath: Long, relativePathLen: Long): Int

    @JvmStatic
    external fun libc_wasi_wasilibcTell(fd: Int): Long

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdLinkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdSymlinkat(target: String?, dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdReadlinkat(dirfd: Int, path: String?, buf: Long, bufsize: Long): Long

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdMkdiratNomode(dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcNocwdOpendirat(dirfd: Int, path: String?): Long

    @JvmStatic
    external fun libc_wasi_wasilibcAccess(pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcStat(pathname: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcUtimens(pathname: String?, times: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcLink(oldpath: String?, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int

    @JvmStatic
    external fun libc_wasi_wasilibcRenameNewat(oldpath: String?, newdirfd: Int, newpath: String?): Int

    @JvmStatic
    external fun libc_wasi_arc4random(): Int

    @JvmStatic
    external fun libc_wasi_arc4randomBuf(a: Long, b: Long)

    @JvmStatic
    external fun libc_wasi_arc4randomUniform(a: Int): Int

    @JvmStatic
    external fun libc_wasi_errnoLocation(): Long

    @JvmStatic
    external fun libc_wasi_chmod(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_wasi_fchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libc_wasi_realpath(pathname: String?, resolved: Long): Long

    @JvmStatic
    external fun libc_wasi_pthreadSelf(): Long

    @JvmStatic
    external fun libc_wasi_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libc_wasi_pthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libc_wasi_pthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libc_wasi_pthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_wasi_pthreadRwlockattrDestroy(attr: Long): Int
}

private var _ffi_static_ENVIRON: COpaquePointer? = null
public actual var ENVIRON: COpaquePointer?
    get() = _ffi_static_ENVIRON
    set(value) {
        _ffi_static_ENVIRON = value
    }

public actual val CLOCK_MONOTONIC: UByte
    get() = 0u

public actual val CLOCK_REALTIME: UByte
    get() = 0u

public actual fun exit(code: CInt): Nothing {
    WasiJniBridge.libc_wasi_exit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    WasiJniBridge.libc_wasi_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_alignedAlloc(a.toLong(), b.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_calloc(amt.toLong(), amt2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    WasiJniBridge.libc_wasi_free((ptr?.value ?: 0L))
}

public actual fun getenv(s: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_malloc(amt.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    WasiJniBridge.libc_wasi_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    WasiJniBridge.libc_wasi_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rand(): CInt =
    WasiJniBridge.libc_wasi_rand()

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    WasiJniBridge.libc_wasi_read(fd, (ptr?.value ?: 0L), size.toLong())

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_realloc((ptr?.value ?: 0L), amt.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    WasiJniBridge.libc_wasi_setenv(k, v, a)

public actual fun unsetenv(k: String?): CInt =
    WasiJniBridge.libc_wasi_unsetenv(k)

public actual fun clearenv(): CInt =
    WasiJniBridge.libc_wasi_clearenv()

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    WasiJniBridge.libc_wasi_write(fd, (ptr?.value ?: 0L), size.toLong())

public actual fun fopen(a: String?, b: String?): FILE? =
    WasiJniBridge.libc_wasi_fopen(a, b).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    WasiJniBridge.libc_wasi_freopen(a, b, (f?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fclose(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_fclose((f?.handle ?: 0L))

public actual fun remove(a: String?): CInt =
    WasiJniBridge.libc_wasi_remove(a)

public actual fun rename(a: String?, b: String?): CInt =
    WasiJniBridge.libc_wasi_rename(a, b)

public actual fun feof(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_feof((f?.handle ?: 0L))

public actual fun ferror(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_ferror((f?.handle ?: 0L))

public actual fun fflush(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_fflush((f?.handle ?: 0L))

public actual fun clearerr(f: FILE?) {
    WasiJniBridge.libc_wasi_clearerr((f?.handle ?: 0L))
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    WasiJniBridge.libc_wasi_fseek((f?.handle ?: 0L), b, c)

public actual fun ftell(f: FILE?): CLong =
    WasiJniBridge.libc_wasi_ftell((f?.handle ?: 0L))

public actual fun rewind(f: FILE?) {
    WasiJniBridge.libc_wasi_rewind((f?.handle ?: 0L))
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_fgetpos((f?.handle ?: 0L), (pos?.value ?: 0L))

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_fsetpos((f?.handle ?: 0L), (pos?.value ?: 0L))

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    WasiJniBridge.libc_wasi_fread((buf?.value ?: 0L), a.toLong(), b.toLong(), (f?.handle ?: 0L)).toULong()

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    WasiJniBridge.libc_wasi_fwrite((buf?.value ?: 0L), a.toLong(), b.toLong(), (f?.handle ?: 0L)).toULong()

public actual fun fgetc(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_fgetc((f?.handle ?: 0L))

public actual fun getc(f: FILE?): CInt =
    WasiJniBridge.libc_wasi_getc((f?.handle ?: 0L))

public actual fun getchar(): CInt =
    WasiJniBridge.libc_wasi_getchar()

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    WasiJniBridge.libc_wasi_ungetc(a, (f?.handle ?: 0L))

public actual fun fputc(a: CInt, f: FILE?): CInt =
    WasiJniBridge.libc_wasi_fputc(a, (f?.handle ?: 0L))

public actual fun putc(a: CInt, f: FILE?): CInt =
    WasiJniBridge.libc_wasi_putc(a, (f?.handle ?: 0L))

public actual fun putchar(a: CInt): CInt =
    WasiJniBridge.libc_wasi_putchar(a)

public actual fun fputs(a: String?, f: FILE?): CInt =
    WasiJniBridge.libc_wasi_fputs(a, (f?.handle ?: 0L))

public actual fun puts(a: String?): CInt =
    WasiJniBridge.libc_wasi_puts(a)

public actual fun perror(a: String?) {
    WasiJniBridge.libc_wasi_perror(a)
}

public actual fun srand(a: CUint) {
    WasiJniBridge.libc_wasi_srand(a.toInt())
}

public actual fun atexit(a: AtexitACallback): CInt =
    WasiJniBridge.libc_wasi_atexit(0L)

public actual fun atQuickExit(a: AtexitACallback): CInt =
    WasiJniBridge.libc_wasi_atQuickExit(0L)

public actual fun quickExit(a: CInt): Nothing {
    WasiJniBridge.libc_wasi_quickExit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    WasiJniBridge.libc_wasi_posixMemalign((a?.value ?: 0L), b.toLong(), c.toLong())

public actual fun randR(a: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_randR((a?.value ?: 0L))

public actual fun random(): CLong =
    WasiJniBridge.libc_wasi_random()

public actual fun srandom(a: CUint) {
    WasiJniBridge.libc_wasi_srandom(a.toInt())
}

public actual fun putenv(a: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_putenv((a?.value ?: 0L))

public actual fun clock(): ClockT =
    WasiJniBridge.libc_wasi_clock()

public actual fun time(a: COpaquePointer?): TimeT =
    WasiJniBridge.libc_wasi_time((a?.value ?: 0L))

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    WasiJniBridge.libc_wasi_difftime(a, b)

public actual fun mktime(a: COpaquePointer?): TimeT =
    WasiJniBridge.libc_wasi_mktime((a?.value ?: 0L))

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    WasiJniBridge.libc_wasi_strftime((a?.value ?: 0L), b.toLong(), c, (d?.value ?: 0L)).toULong()

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_gmtime((a?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_gmtimeR((a?.value ?: 0L), (b?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_localtime((a?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_localtimeR((a?.value ?: 0L), (b?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_asctimeR((a?.value ?: 0L), (b?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_ctimeR((a?.value ?: 0L), (b?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_nanosleep((a?.value ?: 0L), (b?.value ?: 0L))

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_clockGetres(a, (b?.value ?: 0L))

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_clockGettime(a, (b?.value ?: 0L))

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_clockNanosleep(a, a2, (b?.value ?: 0L), (c?.value ?: 0L))

public actual fun isalnum(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WasiJniBridge.libc_wasi_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isgraph(c)

public actual fun islower(c: CInt): CInt =
    WasiJniBridge.libc_wasi_islower(c)

public actual fun isprint(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    WasiJniBridge.libc_wasi_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isspace(c)

public actual fun isupper(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WasiJniBridge.libc_wasi_isblank(c)

public actual fun tolower(c: CInt): CInt =
    WasiJniBridge.libc_wasi_tolower(c)

public actual fun toupper(c: CInt): CInt =
    WasiJniBridge.libc_wasi_toupper(c)

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    WasiJniBridge.libc_wasi_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    WasiJniBridge.libc_wasi_setbuf((stream?.handle ?: 0L), (buf?.value ?: 0L))
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    WasiJniBridge.libc_wasi_fgets((buf?.value ?: 0L), n, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atof(s: String?): CDouble =
    WasiJniBridge.libc_wasi_atof(s)

public actual fun atoi(s: String?): CInt =
    WasiJniBridge.libc_wasi_atoi(s)

public actual fun atol(s: String?): CLong =
    WasiJniBridge.libc_wasi_atol(s)

public actual fun atoll(s: String?): CLonglong =
    WasiJniBridge.libc_wasi_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    WasiJniBridge.libc_wasi_strtod(s, (endp?.value ?: 0L))

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    WasiJniBridge.libc_wasi_strtof(s, (endp?.value ?: 0L))

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    WasiJniBridge.libc_wasi_strtol(s, (endp?.value ?: 0L), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    WasiJniBridge.libc_wasi_strtoll(s, (endp?.value ?: 0L), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    WasiJniBridge.libc_wasi_strtoul(s, (endp?.value ?: 0L), base).toULong()

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    WasiJniBridge.libc_wasi_strtoull(s, (endp?.value ?: 0L), base).toULong()

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_strncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strcat((s?.value ?: 0L), ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_strncat((s?.value ?: 0L), ct, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    WasiJniBridge.libc_wasi_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    WasiJniBridge.libc_wasi_strncmp(cs, ct, n.toLong())

public actual fun strcoll(cs: String?, ct: String?): CInt =
    WasiJniBridge.libc_wasi_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    WasiJniBridge.libc_wasi_strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    WasiJniBridge.libc_wasi_strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    WasiJniBridge.libc_wasi_strspn(cs, ct).toULong()

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    WasiJniBridge.libc_wasi_strcspn(cs, ct).toULong()

public actual fun strdup(cs: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_strndup(cs, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    WasiJniBridge.libc_wasi_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    WasiJniBridge.libc_wasi_strncasecmp(s1, s2, n.toLong())

public actual fun strlen(cs: String?): SizeT =
    WasiJniBridge.libc_wasi_strlen(cs).toULong()

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    WasiJniBridge.libc_wasi_strnlen(cs, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): COpaquePointer? =
    WasiJniBridge.libc_wasi_strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strtok((s?.value ?: 0L), t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    WasiJniBridge.libc_wasi_strxfrm((s?.value ?: 0L), ct, n.toLong()).toULong()

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    WasiJniBridge.libc_wasi_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fprintf(stream: FILE?, format: String?): CInt =
    0

public actual fun printf(format: String?): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?): CInt =
    0

public actual fun scanf(format: String?): CInt =
    0

public actual fun sscanf(s: String?, format: String?): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    WasiJniBridge.libc_wasi_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    WasiJniBridge.libc_wasi_putcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    WasiJniBridge.libc_wasi_shutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_fstat(fildes, (buf?.value ?: 0L))

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    WasiJniBridge.libc_wasi_mkdir(path, mode.toInt())

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_stat(path, (buf?.value ?: 0L))

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    WasiJniBridge.libc_wasi_fdopen(fd, mode).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(stream: FILE?): CInt =
    WasiJniBridge.libc_wasi_fileno((stream?.handle ?: 0L))

public actual fun open(path: String?, oflag: CInt): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    WasiJniBridge.libc_wasi_creat(path, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    WasiJniBridge.libc_wasi_opendir(dirname).let { if (it == 0L) null else DIR(it) }

public actual fun fdopendir(fd: CInt): DIR? =
    WasiJniBridge.libc_wasi_fdopendir(fd).let { if (it == 0L) null else DIR(it) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    WasiJniBridge.libc_wasi_readdir((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun closedir(dirp: DIR?): CInt =
    WasiJniBridge.libc_wasi_closedir((dirp?.handle ?: 0L))

public actual fun rewinddir(dirp: DIR?) {
    WasiJniBridge.libc_wasi_rewinddir((dirp?.handle ?: 0L))
}

public actual fun dirfd(dirp: DIR?): CInt =
    WasiJniBridge.libc_wasi_dirfd((dirp?.handle ?: 0L))

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    WasiJniBridge.libc_wasi_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    WasiJniBridge.libc_wasi_telldir((dirp?.handle ?: 0L))

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_fstatat(dirfd, pathname, (buf?.value ?: 0L), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    WasiJniBridge.libc_wasi_mkdirat(dirfd, pathname, mode.toInt())

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    WasiJniBridge.libc_wasi_readlinkat(dirfd, pathname, (buf?.value ?: 0L), bufsiz.toLong())

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiJniBridge.libc_wasi_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    WasiJniBridge.libc_wasi_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    WasiJniBridge.libc_wasi_access(path, amode)

public actual fun close(fd: CInt): CInt =
    WasiJniBridge.libc_wasi_close(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    WasiJniBridge.libc_wasi_fpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    WasiJniBridge.libc_wasi_getopt(argc, (argv?.value ?: 0L), optstr)

public actual fun isatty(fd: CInt): CInt =
    WasiJniBridge.libc_wasi_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    WasiJniBridge.libc_wasi_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    WasiJniBridge.libc_wasi_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    WasiJniBridge.libc_wasi_pathconf(path, name)

public actual fun rmdir(path: String?): CInt =
    WasiJniBridge.libc_wasi_rmdir(path)

public actual fun sleep(secs: CUint): CUint =
    WasiJniBridge.libc_wasi_sleep(secs.toInt()).toUInt()

public actual fun unlink(c: String?): CInt =
    WasiJniBridge.libc_wasi_unlink(c)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    WasiJniBridge.libc_wasi_pread(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    WasiJniBridge.libc_wasi_pwrite(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_lstat(path, (buf?.value ?: 0L))

public actual fun fsync(fd: CInt): CInt =
    WasiJniBridge.libc_wasi_fsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    WasiJniBridge.libc_wasi_fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): CInt =
    WasiJniBridge.libc_wasi_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    WasiJniBridge.libc_wasi_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    WasiJniBridge.libc_wasi_ftruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_getrusage(resource, (usage?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun times(buf: COpaquePointer?): ClockT =
    WasiJniBridge.libc_wasi_times((buf?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    WasiJniBridge.libc_wasi_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun usleep(secs: CUint): CInt =
    WasiJniBridge.libc_wasi_usleep(secs.toInt())

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    WasiJniBridge.libc_wasi_send(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    WasiJniBridge.libc_wasi_recv(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    WasiJniBridge.libc_wasi_poll((fds?.value ?: 0L), nfds.toLong(), timeout)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): COpaquePointer? =
    WasiJniBridge.libc_wasi_localeconv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    WasiJniBridge.libc_wasi_readlink(path, (buf?.value ?: 0L), bufsz.toLong())

public actual fun timegm(tm: COpaquePointer?): TimeT =
    WasiJniBridge.libc_wasi_timegm((tm?.value ?: 0L))

public actual fun sysconf(name: CInt): CLong =
    WasiJniBridge.libc_wasi_sysconf(name)

public actual fun ioctl(fd: CInt, request: CInt): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    WasiJniBridge.libc_wasi_fseeko((stream?.handle ?: 0L), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    WasiJniBridge.libc_wasi_ftello((stream?.handle ?: 0L))

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    WasiJniBridge.libc_wasi_posixFallocate(fd, offset, len)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    WasiJniBridge.libc_wasi_strcasestr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    WasiJniBridge.libc_wasi_getline((lineptr?.value ?: 0L), (n?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_faccessat(dirfd, pathname, mode, flags)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    WasiJniBridge.libc_wasi_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    WasiJniBridge.libc_wasi_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    WasiJniBridge.libc_wasi_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    WasiJniBridge.libc_wasi_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    WasiJniBridge.libc_wasi_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    WasiJniBridge.libc_wasi_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    WasiJniBridge.libc_wasi_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    WasiJniBridge.libc_wasi_abs(i)

public actual fun labs(i: CLong): CLong =
    WasiJniBridge.libc_wasi_labs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    WasiJniBridge.libc_wasi_duplocale(base.toLong()).toULong()()

public actual fun freelocale(loc: LocaleT) {
    WasiJniBridge.libc_wasi_freelocale(loc.toLong())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    WasiJniBridge.libc_wasi_newlocale(mask, locale, base.toLong()).toULong()()

public actual fun uselocale(loc: LocaleT): LocaleT =
    WasiJniBridge.libc_wasi_uselocale(loc.toLong()).toULong()()

public actual fun schedYield(): CInt =
    WasiJniBridge.libc_wasi_schedYield()

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    WasiJniBridge.libc_wasi_getcwd((buf?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(dir: String?): CInt =
    WasiJniBridge.libc_wasi_chdir(dir)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    WasiJniBridge.libc_wasi_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    WasiJniBridge.libc_wasi_nlLanginfoL(item, loc.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_select(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (errorfds?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcRegisterPreopenedFd(fd, path)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcUnlinkat(fd, path)

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcRmdirat(fd, path)

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    WasiJniBridge.libc_wasi_wasilibcFindRelpath(path, (absPrefix?.value ?: 0L), (relativePath?.value ?: 0L), relativePathLen.toLong())

public actual fun wasilibcTell(fd: CInt): OffT =
    WasiJniBridge.libc_wasi_wasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd, path)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd, path)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdSymlinkat(target, dirfd, path)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    WasiJniBridge.libc_wasi_wasilibcNocwdReadlinkat(dirfd, path, (buf?.value ?: 0L), bufsize.toLong())

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdFaccessat(dirfd, path, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdOpenatNomode(dirfd, path, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdFstatat(dirfd, path, (buf?.value ?: 0L), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdMkdiratNomode(dirfd, path)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcNocwdUtimensat(dirfd, path, (times?.value ?: 0L), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    WasiJniBridge.libc_wasi_wasilibcNocwdOpendirat(dirfd, path).let { if (it == 0L) null else DIR(it) }

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcAccess(pathname, mode, flags)

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcStat(pathname, (buf?.value ?: 0L), flags)

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcUtimens(pathname, (times?.value ?: 0L), flags)

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcLink(oldpath, newpath, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcLinkOldat(olddirfd, oldpath, newpath, flags)

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiJniBridge.libc_wasi_wasilibcLinkNewat(oldpath, newdirfd, newpath, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcRenameOldat(olddirfd, oldpath, newpath)

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiJniBridge.libc_wasi_wasilibcRenameNewat(oldpath, newdirfd, newpath)

public actual fun arc4random(): UInt =
    WasiJniBridge.libc_wasi_arc4random().toUInt()

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    WasiJniBridge.libc_wasi_arc4randomBuf((a?.value ?: 0L), b.toLong())
}

public actual fun arc4randomUniform(a: UInt): UInt =
    WasiJniBridge.libc_wasi_arc4randomUniform(a.toInt()).toUInt()

public actual fun errnoLocation(): COpaquePointer? =
    WasiJniBridge.libc_wasi_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chmod(path: String?, mode: ModeT): CInt =
    WasiJniBridge.libc_wasi_chmod(path, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    WasiJniBridge.libc_wasi_fchmod(fd, mode.toInt())

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    WasiJniBridge.libc_wasi_realpath(pathname, (resolved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    WasiJniBridge.libc_wasi_pthreadSelf().toULong()()

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    WasiJniBridge.libc_wasi_pthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadJoin(native.toLong(), (value?.value ?: 0L))

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadAttrDestroy((attr?.value ?: 0L))

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadAttrGetstacksize((attr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    WasiJniBridge.libc_wasi_pthreadAttrSetstacksize((attr?.value ?: 0L), stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    WasiJniBridge.libc_wasi_pthreadAttrSetdetachstate((attr?.value ?: 0L), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    WasiJniBridge.libc_wasi_pthreadDetach(thread.toLong())

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    WasiJniBridge.libc_wasi_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    WasiJniBridge.libc_wasi_pthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    WasiJniBridge.libc_wasi_pthreadGetspecific(key.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadSetspecific(key.toInt(), (value?.value ?: 0L))

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexDestroy((lock?.value ?: 0L))

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexLock((lock?.value ?: 0L))

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexTrylock((lock?.value ?: 0L))

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexUnlock((lock?.value ?: 0L))

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    WasiJniBridge.libc_wasi_pthreadMutexattrSettype((attr?.value ?: 0L), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondWait((cond?.value ?: 0L), (lock?.value ?: 0L))

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondTimedwait((cond?.value ?: 0L), (lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondattrInit((attr?.value ?: 0L))

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadCondattrDestroy((attr?.value ?: 0L))

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockDestroy((lock?.value ?: 0L))

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockRdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockTryrdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockWrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockTrywrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockUnlock((lock?.value ?: 0L))

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockattrInit((attr?.value ?: 0L))

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    WasiJniBridge.libc_wasi_pthreadRwlockattrDestroy((attr?.value ?: 0L))
