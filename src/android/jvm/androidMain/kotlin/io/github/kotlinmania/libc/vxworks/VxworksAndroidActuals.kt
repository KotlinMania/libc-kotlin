@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

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
import io.github.kotlinmania.libc.errnoGet
import io.github.kotlinmania.libc.errnoSet
import io.github.kotlinmania.libc.unix.newlib.memalign
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT

private object VxworksJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_vxworks_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_islower(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isprint(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isspace(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isupper(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_isblank(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_tolower(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_toupper(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_fopen(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_vxworks_freopen(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_vxworks_fflush(file: Long): Int

    @JvmStatic
    external fun libc_vxworks_fclose(file: Long): Int

    @JvmStatic
    external fun libc_vxworks_remove(filename: String?): Int

    @JvmStatic
    external fun libc_vxworks_rename(oldname: String?, newname: String?): Int

    @JvmStatic
    external fun libc_vxworks_tmpfile(): Long

    @JvmStatic
    external fun libc_vxworks_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_vxworks_setbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libc_vxworks_getchar(): Int

    @JvmStatic
    external fun libc_vxworks_putchar(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_fgetc(stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_fgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_fputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_fputs(s: String?, stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_puts(s: String?): Int

    @JvmStatic
    external fun libc_vxworks_ungetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_fseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_vxworks_ftell(stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_rewind(stream: Long)

    @JvmStatic
    external fun libc_vxworks_fgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_vxworks_fsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_vxworks_feof(stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_ferror(stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_perror(s: String?)

    @JvmStatic
    external fun libc_vxworks_atof(s: String?): Double

    @JvmStatic
    external fun libc_vxworks_atoi(s: String?): Int

    @JvmStatic
    external fun libc_vxworks_atol(s: String?): Long

    @JvmStatic
    external fun libc_vxworks_atoll(s: String?): Long

    @JvmStatic
    external fun libc_vxworks_strtod(s: String?, endp: Long): Double

    @JvmStatic
    external fun libc_vxworks_strtof(s: String?, endp: Long): Float

    @JvmStatic
    external fun libc_vxworks_strtol(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_vxworks_strtoll(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_vxworks_strtoul(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_vxworks_strtoull(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_vxworks_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_vxworks_malloc(size: Long): Long

    @JvmStatic
    external fun libc_vxworks_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_vxworks_free(p: Long)

    @JvmStatic
    external fun libc_vxworks_abort()

    @JvmStatic
    external fun libc_vxworks_exit(status: Int)

    @JvmStatic
    external fun libc_vxworks_atexit(cb: Long): Int

    @JvmStatic
    external fun libc_vxworks_system(s: String?): Int

    @JvmStatic
    external fun libc_vxworks_getenv(s: String?): Long

    @JvmStatic
    external fun libc_vxworks_cfgetospeed(termios: Long): Int

    @JvmStatic
    external fun libc_vxworks_cfmakeraw(termios: Long): Int

    @JvmStatic
    external fun libc_vxworks_cfsetispeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libc_vxworks_cfsetospeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libc_vxworks_strcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_vxworks_strncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_strcat(s: Long, ct: String?): Long

    @JvmStatic
    external fun libc_vxworks_strncat(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_strcmp(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_vxworks_strncmp(cs: String?, ct: String?, n: Long): Int

    @JvmStatic
    external fun libc_vxworks_strcoll(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_vxworks_strchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_vxworks_strrchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_vxworks_strspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_vxworks_strcspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_vxworks_strdup(cs: String?): Long

    @JvmStatic
    external fun libc_vxworks_strpbrk(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_vxworks_strstr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_vxworks_strcasecmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_vxworks_strncasecmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_vxworks_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_vxworks_strnlen(cs: String?, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_strerror(n: Int): Long

    @JvmStatic
    external fun libc_vxworks_strtok(s: Long, t: String?): Long

    @JvmStatic
    external fun libc_vxworks_strxfrm(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_wcslen(buf: Long): Long

    @JvmStatic
    external fun libc_vxworks_wcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_wmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_vxworks_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_memccpy(dest: Long, src: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_vxworks_alignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libc_vxworks_uname(buf: Long): Int

    @JvmStatic
    external fun libc_vxworks_times(buf: Long): Long

    @JvmStatic
    external fun libc_vxworks_tcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libc_vxworks_pclose(stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_mkdtemp(template: Long): Long

    @JvmStatic
    external fun libc_vxworks_linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_unlinkat(dirfd: Int, pathname: String?, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_getprotobyname(name: String?): Long

    @JvmStatic
    external fun libc_vxworks_getprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libc_vxworks_getservbyname(name: String?, proto: String?): Long

    @JvmStatic
    external fun libc_vxworks_fchownat(dirfd: Int, pathname: String?, owner: Short, group: Short, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_getcharUnlocked(): Int

    @JvmStatic
    external fun libc_vxworks_putcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libc_vxworks_stat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_vxworks_fdopen(fd: Int, mode: String?): Long

    @JvmStatic
    external fun libc_vxworks_fileno(stream: Long): Int

    @JvmStatic
    external fun libc_vxworks_creat(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_vxworks_rewinddir(dirp: Long)

    @JvmStatic
    external fun libc_vxworks_fchown(fd: Int, owner: Short, group: Short): Int

    @JvmStatic
    external fun libc_vxworks_access(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_vxworks_alarm(seconds: Int): Int

    @JvmStatic
    external fun libc_vxworks_fchdir(dirfd: Int): Int

    @JvmStatic
    external fun libc_vxworks_chown(path: String?, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libc_vxworks_fpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libc_vxworks_getegid(): Short

    @JvmStatic
    external fun libc_vxworks_geteuid(): Short

    @JvmStatic
    external fun libc_vxworks_getgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libc_vxworks_getlogin(): Long

    @JvmStatic
    external fun libc_vxworks_getopt(argc: Int, argv: Long, optstr: String?): Int

    @JvmStatic
    external fun libc_vxworks_pathconf(path: String?, name: Int): Long

    @JvmStatic
    external fun libc_vxworks_pause(): Int

    @JvmStatic
    external fun libc_vxworks_seteuid(uid: Short): Int

    @JvmStatic
    external fun libc_vxworks_setegid(gid: Short): Int

    @JvmStatic
    external fun libc_vxworks_sleep(secs: Int): Int

    @JvmStatic
    external fun libc_vxworks_ttyname(fd: Int): Long

    @JvmStatic
    external fun libc_vxworks_wait(status: Long): Int

    @JvmStatic
    external fun libc_vxworks_umask(mask: Int): Int

    @JvmStatic
    external fun libc_vxworks_mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_vxworks_mlockall(flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_vxworks_munlockall(): Int

    @JvmStatic
    external fun libc_vxworks_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_vxworks_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_vxworks_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_vxworks_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_truncate(path: String?, length: Long): Int

    @JvmStatic
    external fun libc_vxworks_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_vxworks_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_vxworks_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadExit(value: Long)

    @JvmStatic
    external fun libc_vxworks_pthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libc_vxworks_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_vxworks_sigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_vxworks_sigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libc_vxworks_utimes(filename: String?, times: Long): Int

    @JvmStatic
    external fun libc_vxworks_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_vxworks_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_vxworks_dlopen(filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_vxworks_dlerror(): Long

    @JvmStatic
    external fun libc_vxworks_dlsym(handle: Long, symbol: String?): Long

    @JvmStatic
    external fun libc_vxworks_dlclose(handle: Long): Int

    @JvmStatic
    external fun libc_vxworks_dladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libc_vxworks_gmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_vxworks_localtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_vxworks_mktime(tm: Long): Long

    @JvmStatic
    external fun libc_vxworks_time(time: Long): Long

    @JvmStatic
    external fun libc_vxworks_gmtime(timeP: Long): Long

    @JvmStatic
    external fun libc_vxworks_localtime(timeP: Long): Long

    @JvmStatic
    external fun libc_vxworks_timegm(tm: Long): Long

    @JvmStatic
    external fun libc_vxworks_difftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libc_vxworks_gethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_vxworks_usleep(secs: Long): Int

    @JvmStatic
    external fun libc_vxworks_putenv(string: Long): Int

    @JvmStatic
    external fun libc_vxworks_setlocale(category: Int, locale: String?): Long

    @JvmStatic
    external fun libc_vxworks_localeconv(): Long

    @JvmStatic
    external fun libc_vxworks_sigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_vxworks_sigpending(set: Long): Int

    @JvmStatic
    external fun libc_vxworks_mkfifo(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_vxworks_fseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_vxworks_ftello(stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_mkstemp(template: Long): Int

    @JvmStatic
    external fun libc_vxworks_tmpnam(ptr: Long): Long

    @JvmStatic
    external fun libc_vxworks_openlog(ident: String?, logopt: Int, facility: Int)

    @JvmStatic
    external fun libc_vxworks_closelog()

    @JvmStatic
    external fun libc_vxworks_setlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libc_vxworks_getline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libc_vxworks_tcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libc_vxworks_tcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libc_vxworks_tcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libc_vxworks_confstr(name: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libc_vxworks_fnmatch(pattern: String?, name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int

    @JvmStatic
    external fun libc_vxworks_fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_vxworks_utime(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_vxworks_memalign(blockSize: Long, sizeArg: Long): Long

    @JvmStatic
    external fun libc_vxworks_getcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libc_vxworks_chdir(attr: String?): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexattrSettype(pAttr: Long, pType: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexInit(mutex: Long, attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexDestroy(mutex: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexLock(mutex: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexTrylock(mutex: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexTimedlock(attr: Long, spec: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadMutexUnlock(mutex: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrSetname(pAttr: Long, name: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrSetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrGetstacksize(attr: Long, size: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCreate(pThread: Long, pAttr: Long, startRoutine: Long, value: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrDestroy(thread: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_vxworks_fstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_vxworks_lstat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_vxworks_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_vxworks_readdirR(pDir: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_vxworks_readdir(pDir: Long): Long

    @JvmStatic
    external fun libc_vxworks_poll(fds: Long, nfds: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondattrGetclock(pAttr: Long, pClockId: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondattrSetclock(pAttr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadCondWait(cond: Long, mutex: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockattrSetmaxreaders(attr: Long, attr2: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockInit(attr: Long, host: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockRdlock(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockTryrdlock(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockTimedrdlock(attr: Long, host: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockWrlock(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockTrywrlock(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockTimedwrlock(attr: Long, host: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadRwlockUnlock(attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadKeyDelete(key: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadSetspecific(key: Long, value: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadGetspecific(key: Long): Long

    @JvmStatic
    external fun libc_vxworks_pthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadAttrGetname(attr: Long, name: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadJoin(thread: Long, status: Long): Int

    @JvmStatic
    external fun libc_vxworks_pthreadSelf(): Long

    @JvmStatic
    external fun libc_vxworks_clockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_vxworks_clockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_vxworks_clockGetres(clockId: Int, res: Long): Int

    @JvmStatic
    external fun libc_vxworks_clockNanosleep(clockId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_vxworks_nanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_vxworks_accept(s: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_vxworks_bind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libc_vxworks_connect(s: Int, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libc_vxworks_getpeername(s: Int, name: Long, namelen: Long): Int

    @JvmStatic
    external fun libc_vxworks_getsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_vxworks_getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_vxworks_listen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_vxworks_recv(s: Int, buf: Long, bufLen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_vxworks_recvfrom(s: Int, buf: Long, bufLen: Long, flags: Int, from: Long, pFromLen: Long): Long

    @JvmStatic
    external fun libc_vxworks_recvmsg(socket: Int, mp: Long, flags: Int): Long

    @JvmStatic
    external fun libc_vxworks_send(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_vxworks_sendmsg(socket: Int, mp: Long, flags: Int): Long

    @JvmStatic
    external fun libc_vxworks_sendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libc_vxworks_setsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libc_vxworks_shutdown(s: Int, how: Int): Int

    @JvmStatic
    external fun libc_vxworks_socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_vxworks_gaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libc_vxworks_close(fd: Int): Int

    @JvmStatic
    external fun libc_vxworks_read(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_vxworks_write(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_vxworks_isatty(fd: Int): Int

    @JvmStatic
    external fun libc_vxworks_dup(src: Int): Int

    @JvmStatic
    external fun libc_vxworks_dup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libc_vxworks_pipe(fds: Long): Int

    @JvmStatic
    external fun libc_vxworks_unlink(pathname: String?): Int

    @JvmStatic
    external fun libc_vxworks_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_vxworks_getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int

    @JvmStatic
    external fun libc_vxworks_freeaddrinfo(res: Long)

    @JvmStatic
    external fun libc_vxworks_signal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libc_vxworks_getpid(): Int

    @JvmStatic
    external fun libc_vxworks_getppid(): Int

    @JvmStatic
    external fun libc_vxworks_setpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libc_vxworks_waitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libc_vxworks_sysconf(attr: Int): Long

    @JvmStatic
    external fun libc_vxworks_setenv(envVarName: String?, envVarValue: String?, overwrite: Int): Int

    @JvmStatic
    external fun libc_vxworks_unsetenv(envVarName: String?): Int

    @JvmStatic
    external fun libc_vxworks_realpath(fileName: String?, resolvedName: Long): Long

    @JvmStatic
    external fun libc_vxworks_link(src: String?, dst: String?): Int

    @JvmStatic
    external fun libc_vxworks_readlink(path: String?, buf: Long, bufsize: Long): Long

    @JvmStatic
    external fun libc_vxworks_symlink(path1: String?, path2: String?): Int

    @JvmStatic
    external fun libc_vxworks_opendir(name: String?): Long

    @JvmStatic
    external fun libc_vxworks_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_vxworks_mkdir(dirName: String?, mode: Int): Int

    @JvmStatic
    external fun libc_vxworks_chmod(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_vxworks_fchmod(attr1: Int, attr2: Int): Int

    @JvmStatic
    external fun libc_vxworks_fsync(fd: Int): Int

    @JvmStatic
    external fun libc_vxworks_closedir(ptr: Long): Int

    @JvmStatic
    external fun libc_vxworks_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_vxworks_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_vxworks_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_vxworks_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_vxworks_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_vxworks_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_vxworks_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_vxworks_schedYield(): Int

    @JvmStatic
    external fun libc_vxworks_errnoSet(err: Int): Int

    @JvmStatic
    external fun libc_vxworks_errnoGet(): Int

    @JvmStatic
    external fun libc_vxworks_setgid(gid: Short): Int

    @JvmStatic
    external fun libc_vxworks_getgid(): Short

    @JvmStatic
    external fun libc_vxworks_setuid(uid: Short): Int

    @JvmStatic
    external fun libc_vxworks_getuid(): Short

    @JvmStatic
    external fun libc_vxworks_sigemptyset(set: Long): Int

    @JvmStatic
    external fun libc_vxworks_sigfillset(set: Long): Int

    @JvmStatic
    external fun libc_vxworks_sigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_vxworks_sigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_vxworks_pthreadSigmask(how: Int, set: Long, oset: Long): Int

    @JvmStatic
    external fun libc_vxworks_kill(pid: Int, signo: Int): Int

    @JvmStatic
    external fun libc_vxworks_sigqueue_2(rtpId: Int, signo: Int, pValue: Long, sigCode: Int): Int

    @JvmStatic
    external fun libc_vxworks_taskKill(taskId: Int, signo: Int): Int

    @JvmStatic
    external fun libc_vxworks_raise(signo: Int): Int

    @JvmStatic
    external fun libc_vxworks_taskIdSelf(): Int

    @JvmStatic
    external fun libc_vxworks_taskDelay(ticks: Int): Int

    @JvmStatic
    external fun libc_vxworks_taskNameSet(taskId: Int, taskName: Long): Int

    @JvmStatic
    external fun libc_vxworks_taskNameGet(taskId: Int, bufName: Long, bufsize: Long): Int

    @JvmStatic
    external fun libc_vxworks_rtpInfoGet(rtpId: Int, rtpStruct: Long): Int

    @JvmStatic
    external fun libc_vxworks_rtpSpawn(pubrtpFileName: String?, argv: Long, envp: Long, priority: Int, uStackSize: Long, options: Int, taskOptions: Int): Int

    @JvmStatic
    external fun libc_vxworks_pathIsAbsolute(filepath: String?, pNameTail: Long): Int

    @JvmStatic
    external fun libc_vxworks_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_vxworks_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_vxworks_randBytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libc_vxworks_randABytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libc_vxworks_randUBytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libc_vxworks_randSecure(): Int

    @JvmStatic
    external fun libc_vxworks_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_vxworks_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_vxworks_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_vxworks_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_vxworks_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_vxworks_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_vxworks_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_vxworks_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_vxworks_vxCpuEnabledGet(): Int

    @JvmStatic
    external fun libc_vxworks_vxCpuConfiguredGet(): Int
}

public actual fun isalnum(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isgraph(c)

public actual fun islower(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_islower(c)

public actual fun isprint(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isspace(c)

public actual fun isupper(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isblank(c)

public actual fun tolower(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_tolower(c)

public actual fun toupper(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    VxworksJniBridge.libc_vxworks_fopen(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    VxworksJniBridge.libc_vxworks_freopen(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fflush(file: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fflush((file?.handle ?: 0L))

public actual fun fclose(file: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fclose((file?.handle ?: 0L))

public actual fun remove(filename: String?): CInt =
    VxworksJniBridge.libc_vxworks_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    VxworksJniBridge.libc_vxworks_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    VxworksJniBridge.libc_vxworks_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    VxworksJniBridge.libc_vxworks_setbuf((stream?.handle ?: 0L), (buf?.value ?: 0L))
}

public actual fun getchar(): CInt =
    VxworksJniBridge.libc_vxworks_getchar()

public actual fun putchar(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fgetc((stream?.handle ?: 0L))

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_fgets((buf?.value ?: 0L), n, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fputc(c, (stream?.handle ?: 0L))

public actual fun fputs(s: String?, stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fputs(s, (stream?.handle ?: 0L))

public actual fun puts(s: String?): CInt =
    VxworksJniBridge.libc_vxworks_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_ungetc(c, (stream?.handle ?: 0L))

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    VxworksJniBridge.libc_vxworks_fread((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    VxworksJniBridge.libc_vxworks_fwrite((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fseek((stream?.handle ?: 0L), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    VxworksJniBridge.libc_vxworks_ftell((stream?.handle ?: 0L))

public actual fun rewind(stream: FILE?) {
    VxworksJniBridge.libc_vxworks_rewind((stream?.handle ?: 0L))
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_fgetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_fsetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun feof(stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_feof((stream?.handle ?: 0L))

public actual fun ferror(stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_ferror((stream?.handle ?: 0L))

public actual fun perror(s: String?) {
    VxworksJniBridge.libc_vxworks_perror(s)
}

public actual fun atof(s: String?): CDouble =
    VxworksJniBridge.libc_vxworks_atof(s)

public actual fun atoi(s: String?): CInt =
    VxworksJniBridge.libc_vxworks_atoi(s)

public actual fun atol(s: String?): CLong =
    VxworksJniBridge.libc_vxworks_atol(s)

public actual fun atoll(s: String?): CLonglong =
    VxworksJniBridge.libc_vxworks_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    VxworksJniBridge.libc_vxworks_strtod(s, (endp?.value ?: 0L))

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    VxworksJniBridge.libc_vxworks_strtof(s, (endp?.value ?: 0L))

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    VxworksJniBridge.libc_vxworks_strtol(s, (endp?.value ?: 0L), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    VxworksJniBridge.libc_vxworks_strtoll(s, (endp?.value ?: 0L), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    VxworksJniBridge.libc_vxworks_strtoul(s, (endp?.value ?: 0L), base).toULong()

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    VxworksJniBridge.libc_vxworks_strtoull(s, (endp?.value ?: 0L), base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    VxworksJniBridge.libc_vxworks_free((p?.value ?: 0L))
}

public actual fun abort(): Nothing {
    VxworksJniBridge.libc_vxworks_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    VxworksJniBridge.libc_vxworks_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    VxworksJniBridge.libc_vxworks_atexit(0L)

public actual fun system(s: String?): CInt =
    VxworksJniBridge.libc_vxworks_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    VxworksJniBridge.libc_vxworks_cfgetospeed((termios?.value ?: 0L)).toUInt()

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_cfmakeraw((termios?.value ?: 0L))

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    VxworksJniBridge.libc_vxworks_cfsetispeed((termios?.value ?: 0L), speed.toInt())

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    VxworksJniBridge.libc_vxworks_cfsetospeed((termios?.value ?: 0L), speed.toInt())

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strcat((s?.value ?: 0L), ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strncat((s?.value ?: 0L), ct, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    VxworksJniBridge.libc_vxworks_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_strncmp(cs, ct, n.toLong())

public actual fun strcoll(cs: String?, ct: String?): CInt =
    VxworksJniBridge.libc_vxworks_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    VxworksJniBridge.libc_vxworks_strspn(cs, ct).toULong()

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    VxworksJniBridge.libc_vxworks_strcspn(cs, ct).toULong()

public actual fun strdup(cs: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    VxworksJniBridge.libc_vxworks_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_strncasecmp(s1, s2, n.toLong())

public actual fun strlen(cs: String?): SizeT =
    VxworksJniBridge.libc_vxworks_strlen(cs).toULong()

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    VxworksJniBridge.libc_vxworks_strnlen(cs, n.toLong()).toULong()

public actual fun strerror(n: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_strtok((s?.value ?: 0L), t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    VxworksJniBridge.libc_vxworks_strxfrm((s?.value ?: 0L), ct, n.toLong()).toULong()

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    VxworksJniBridge.libc_vxworks_wcslen((buf?.value ?: 0L)).toULong()

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    VxworksJniBridge.libc_vxworks_wcstombs((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).toULong()

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_wmemchr((cx?.value ?: 0L), c.toInt(), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memccpy((dest?.value ?: 0L), (src?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_alignedAlloc(alignment.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uname(buf: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_uname((buf?.value ?: 0L))

public actual fun times(buf: COpaquePointer?): ClockT =
    VxworksJniBridge.libc_vxworks_times((buf?.value ?: 0L))

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    VxworksJniBridge.libc_vxworks_tcflush(fd, action)

public actual fun pclose(stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_pclose((stream?.handle ?: 0L))

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_mkdtemp((template?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_unlinkat(dirfd, pathname, flags)

public actual fun getprotobyname(name: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getprotobyname(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getprotobynumber(proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getservbyname(name, proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fchownat(dirfd, pathname, owner.toShort(), group.toShort(), flags)

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
    VxworksJniBridge.libc_vxworks_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    VxworksJniBridge.libc_vxworks_putcharUnlocked(c)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_stat(path, (buf?.value ?: 0L))

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    VxworksJniBridge.libc_vxworks_fdopen(fd, mode).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(stream: FILE?): CInt =
    VxworksJniBridge.libc_vxworks_fileno((stream?.handle ?: 0L))

public actual fun creat(path: String?, mode: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_creat(path, mode)

public actual fun rewinddir(dirp: DIR?) {
    VxworksJniBridge.libc_vxworks_rewinddir((dirp?.handle ?: 0L))
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    VxworksJniBridge.libc_vxworks_fchown(fd, owner.toShort(), group.toShort())

public actual fun access(path: String?, amode: CInt): CInt =
    VxworksJniBridge.libc_vxworks_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    VxworksJniBridge.libc_vxworks_alarm(seconds.toInt()).toUInt()

public actual fun fchdir(dirfd: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    VxworksJniBridge.libc_vxworks_chown(path, uid.toShort(), gid.toShort())

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    VxworksJniBridge.libc_vxworks_fpathconf(filedes, name)

public actual fun getegid(): GidT =
    VxworksJniBridge.libc_vxworks_getegid().toUShort()

public actual fun geteuid(): UidT =
    VxworksJniBridge.libc_vxworks_geteuid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_getgroups(ngroupsMax, (groups?.value ?: 0L))

public actual fun getlogin(): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    VxworksJniBridge.libc_vxworks_getopt(argc, (argv?.value ?: 0L), optstr)

public actual fun pathconf(path: String?, name: CInt): CLong =
    VxworksJniBridge.libc_vxworks_pathconf(path, name)

public actual fun pause(): CInt =
    VxworksJniBridge.libc_vxworks_pause()

public actual fun seteuid(uid: UidT): CInt =
    VxworksJniBridge.libc_vxworks_seteuid(uid.toShort())

public actual fun setegid(gid: GidT): CInt =
    VxworksJniBridge.libc_vxworks_setegid(gid.toShort())

public actual fun sleep(secs: CUint): CUint =
    VxworksJniBridge.libc_vxworks_sleep(secs.toInt()).toUInt()

public actual fun ttyname(fd: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wait(status: COpaquePointer?): PidT =
    VxworksJniBridge.libc_vxworks_wait((status?.value ?: 0L))

public actual fun umask(mask: ModeT): ModeT =
    VxworksJniBridge.libc_vxworks_umask(mask)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_mlock((addr?.value ?: 0L), len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_munlock((addr?.value ?: 0L), len.toLong())

public actual fun munlockall(): CInt =
    VxworksJniBridge.libc_vxworks_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_munmap((addr?.value ?: 0L), len.toLong())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    VxworksJniBridge.libc_vxworks_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun truncate(path: String?, length: OffT): CInt =
    VxworksJniBridge.libc_vxworks_truncate(path, length)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    VxworksJniBridge.libc_vxworks_shmUnlink(name)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    VxworksJniBridge.libc_vxworks_pthreadExit((value?.value ?: 0L))
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrSetdetachstate((attr?.value ?: 0L), state)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    VxworksJniBridge.libc_vxworks_pthreadEqual(t1.toLong(), t2.toLong())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    VxworksJniBridge.libc_vxworks_sigaddset((set?.value ?: 0L), signum)

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_sigaction(signum, (act?.value ?: 0L), (oldact?.value ?: 0L))

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_utimes(filename, (times?.value ?: 0L))

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    VxworksJniBridge.libc_vxworks_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_dlsym((handle?.value ?: 0L), symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_dlclose((handle?.value ?: 0L))

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_dladdr((addr?.value ?: 0L), (info?.value ?: 0L))

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_gmtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_localtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    VxworksJniBridge.libc_vxworks_mktime((tm?.value ?: 0L))

public actual fun time(time: COpaquePointer?): TimeT =
    VxworksJniBridge.libc_vxworks_time((time?.value ?: 0L))

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_gmtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_localtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun timegm(tm: COpaquePointer?): TimeT =
    VxworksJniBridge.libc_vxworks_timegm((tm?.value ?: 0L))

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    VxworksJniBridge.libc_vxworks_difftime(time1, time0)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_gethostname((name?.value ?: 0L), len.toLong())

public actual fun usleep(secs: UsecondsT): CInt =
    VxworksJniBridge.libc_vxworks_usleep(secs.toLong())

public actual fun putenv(string: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_putenv((string?.value ?: 0L))

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_localeconv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_sigprocmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun sigpending(set: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_sigpending((set?.value ?: 0L))

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fseeko((stream?.handle ?: 0L), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    VxworksJniBridge.libc_vxworks_ftello((stream?.handle ?: 0L))

public actual fun mkstemp(template: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_mkstemp((template?.value ?: 0L))

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_tmpnam((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    VxworksJniBridge.libc_vxworks_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    VxworksJniBridge.libc_vxworks_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    VxworksJniBridge.libc_vxworks_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?) {
}

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    VxworksJniBridge.libc_vxworks_getline((lineptr?.value ?: 0L), (n?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_tcsetattr(fd, optionalActions, (termios?.value ?: 0L))

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_tcgetattr(fd, (termios?.value ?: 0L))

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    VxworksJniBridge.libc_vxworks_tcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    VxworksJniBridge.libc_vxworks_confstr(name, (buf?.value ?: 0L), len.toLong()).toULong()

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fnmatch(pattern, name, flags)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    VxworksJniBridge.libc_vxworks_symlinkat(target, newdirfd, linkpath)

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fchmodat(dirfd, pathname, mode, flags)

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_utime(file, (buf?.value ?: 0L))

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_memalign(blockSize.toLong(), sizeArg.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_getcwd((buf?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(attr: String?): CInt =
    VxworksJniBridge.libc_vxworks_chdir(attr)

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexattrSettype((pAttr?.value ?: 0L), pType)

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexInit((mutex?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexDestroy((mutex?.value ?: 0L))

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexLock((mutex?.value ?: 0L))

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexTrylock((mutex?.value ?: 0L))

public actual fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexTimedlock((attr?.value ?: 0L), (spec?.value ?: 0L))

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadMutexUnlock((mutex?.value ?: 0L))

public actual fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrSetname((pAttr?.value ?: 0L), (name?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrSetstacksize((attr?.value ?: 0L), stacksize.toLong())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrGetstacksize((attr?.value ?: 0L), (size?.value ?: 0L))

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCreate((pThread?.value ?: 0L), (pAttr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrSetinheritsched((attr?.value ?: 0L), inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrSetschedpolicy((attr?.value ?: 0L), policy)

public actual fun pthreadAttrDestroy(thread: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrDestroy((thread?.value ?: 0L))

public actual fun pthreadDetach(thread: PthreadT): CInt =
    VxworksJniBridge.libc_vxworks_pthreadDetach(thread.toLong())

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAtfork(0L, 0L, 0L)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_fstat(fildes, (buf?.value ?: 0L))

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_lstat(path, (buf?.value ?: 0L))

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    VxworksJniBridge.libc_vxworks_ftruncate(fd, length)

public actual fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_readdirR((pDir?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun readdir(pDir: DIR?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_readdir((pDir?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun open(path: String?, oflag: CInt): CInt =
    0

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    VxworksJniBridge.libc_vxworks_poll((fds?.value ?: 0L), nfds.toInt(), timeout)

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondattrInit((attr?.value ?: 0L))

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondattrDestroy((attr?.value ?: 0L))

public actual fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondattrGetclock((pAttr?.value ?: 0L), (pClockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondattrSetclock((pAttr?.value ?: 0L), clockId)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondWait((cond?.value ?: 0L), (mutex?.value ?: 0L))

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockattrInit((attr?.value ?: 0L))

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockattrDestroy((attr?.value ?: 0L))

public actual fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockattrSetmaxreaders((attr?.value ?: 0L), attr2.toInt())

public actual fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockInit((attr?.value ?: 0L), (host?.value ?: 0L))

public actual fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockDestroy((attr?.value ?: 0L))

public actual fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockRdlock((attr?.value ?: 0L))

public actual fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockTryrdlock((attr?.value ?: 0L))

public actual fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockTimedrdlock((attr?.value ?: 0L), (host?.value ?: 0L))

public actual fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockWrlock((attr?.value ?: 0L))

public actual fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockTrywrlock((attr?.value ?: 0L))

public actual fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockTimedwrlock((attr?.value ?: 0L), (host?.value ?: 0L))

public actual fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadRwlockUnlock((attr?.value ?: 0L))

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    VxworksJniBridge.libc_vxworks_pthreadKeyDelete(key.toLong())

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadSetspecific(key.toLong(), (value?.value ?: 0L))

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_pthreadGetspecific(key.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadCondTimedwait((cond?.value ?: 0L), (mutex?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadAttrGetname((attr?.value ?: 0L), (name?.value ?: 0L))

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadJoin(thread.toLong(), (status?.value ?: 0L))

public actual fun pthreadSelf(): PthreadT =
    VxworksJniBridge.libc_vxworks_pthreadSelf().toULong()()

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_clockGettime(clockId, (tp?.value ?: 0L))

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_clockSettime(clockId, (tp?.value ?: 0L))

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_clockGetres(clockId, (res?.value ?: 0L))

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_clockNanosleep(clockId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_nanosleep((rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_accept(s, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    VxworksJniBridge.libc_vxworks_bind(fd, (addr?.value ?: 0L), len.toInt())

public actual fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt =
    VxworksJniBridge.libc_vxworks_connect(s, (name?.value ?: 0L), namelen.toInt())

public actual fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_getpeername(s, (name?.value ?: 0L), (namelen?.value ?: 0L))

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_getsockname(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_getsockopt(sockfd, level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    VxworksJniBridge.libc_vxworks_listen(socket, backlog)

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_recv(s, (buf?.value ?: 0L), bufLen.toLong(), flags)

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT =
    VxworksJniBridge.libc_vxworks_recvfrom(s, (buf?.value ?: 0L), bufLen.toLong(), flags, (from?.value ?: 0L), (pFromLen?.value ?: 0L))

public actual fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_recvmsg(socket, (mp?.value ?: 0L), flags)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_send(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_sendmsg(socket, (mp?.value ?: 0L), flags)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    VxworksJniBridge.libc_vxworks_sendto(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), addrlen.toInt())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    VxworksJniBridge.libc_vxworks_setsockopt(socket, level, name, (value?.value ?: 0L), optionLen.toInt())

public actual fun shutdown(s: CInt, how: CInt): CInt =
    VxworksJniBridge.libc_vxworks_shutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    VxworksJniBridge.libc_vxworks_socket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt): CInt =
    0

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun close(fd: CInt): CInt =
    VxworksJniBridge.libc_vxworks_close(fd)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    VxworksJniBridge.libc_vxworks_read(fd, (buf?.value ?: 0L), count.toLong())

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    VxworksJniBridge.libc_vxworks_write(fd, (buf?.value ?: 0L), count.toLong())

public actual fun isatty(fd: CInt): CInt =
    VxworksJniBridge.libc_vxworks_isatty(fd)

public actual fun dup(src: CInt): CInt =
    VxworksJniBridge.libc_vxworks_dup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    VxworksJniBridge.libc_vxworks_dup2(src, dst)

public actual fun pipe(fds: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pipe((fds?.value ?: 0L))

public actual fun unlink(pathname: String?): CInt =
    VxworksJniBridge.libc_vxworks_unlink(pathname)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    VxworksJniBridge.libc_vxworks_lseek(fd, offset, whence)

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_getaddrinfo(node, service, (hints?.value ?: 0L), (res?.value ?: 0L))

public actual fun freeaddrinfo(res: COpaquePointer?) {
    VxworksJniBridge.libc_vxworks_freeaddrinfo((res?.value ?: 0L))
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    VxworksJniBridge.libc_vxworks_signal(signum, handler.toLong()).toULong()

public actual fun getpid(): PidT =
    VxworksJniBridge.libc_vxworks_getpid()

public actual fun getppid(): PidT =
    VxworksJniBridge.libc_vxworks_getppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    VxworksJniBridge.libc_vxworks_setpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    VxworksJniBridge.libc_vxworks_waitpid(pid, (status?.value ?: 0L), options)

public actual fun sysconf(attr: CInt): CLong =
    VxworksJniBridge.libc_vxworks_sysconf(attr)

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    VxworksJniBridge.libc_vxworks_setenv(envVarName, envVarValue, overwrite)

public actual fun unsetenv(envVarName: String?): CInt =
    VxworksJniBridge.libc_vxworks_unsetenv(envVarName)

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    VxworksJniBridge.libc_vxworks_realpath(fileName, (resolvedName?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun link(src: String?, dst: String?): CInt =
    VxworksJniBridge.libc_vxworks_link(src, dst)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    VxworksJniBridge.libc_vxworks_readlink(path, (buf?.value ?: 0L), bufsize.toLong())

public actual fun symlink(path1: String?, path2: String?): CInt =
    VxworksJniBridge.libc_vxworks_symlink(path1, path2)

public actual fun opendir(name: String?): DIR? =
    VxworksJniBridge.libc_vxworks_opendir(name).let { if (it == 0L) null else DIR(it) }

public actual fun rmdir(path: String?): CInt =
    VxworksJniBridge.libc_vxworks_rmdir(path)

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_mkdir(dirName, mode)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_chmod(path, mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    VxworksJniBridge.libc_vxworks_fchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    VxworksJniBridge.libc_vxworks_fsync(fd)

public actual fun closedir(ptr: DIR?): CInt =
    VxworksJniBridge.libc_vxworks_closedir((ptr?.handle ?: 0L))

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    VxworksJniBridge.libc_vxworks_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    VxworksJniBridge.libc_vxworks_schedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    VxworksJniBridge.libc_vxworks_schedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun schedYield(): CInt =
    VxworksJniBridge.libc_vxworks_schedYield()

public actual fun errnoSet(err: CInt): CInt =
    VxworksJniBridge.libc_vxworks_errnoSet(err)

public actual fun errnoGet(): CInt =
    VxworksJniBridge.libc_vxworks_errnoGet()

public actual fun setgid(gid: GidT): CInt =
    VxworksJniBridge.libc_vxworks_setgid(gid.toShort())

public actual fun getgid(): GidT =
    VxworksJniBridge.libc_vxworks_getgid().toUShort()

public actual fun setuid(uid: UidT): CInt =
    VxworksJniBridge.libc_vxworks_setuid(uid.toShort())

public actual fun getuid(): UidT =
    VxworksJniBridge.libc_vxworks_getuid().toUShort()

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_sigemptyset((set?.value ?: 0L))

public actual fun sigfillset(set: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_sigfillset((set?.value ?: 0L))

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    VxworksJniBridge.libc_vxworks_sigdelset((set?.value ?: 0L), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    VxworksJniBridge.libc_vxworks_sigismember((set?.value ?: 0L), signum)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_pthreadSigmask(how, (set?.value ?: 0L), (oset?.value ?: 0L))

public actual fun kill(pid: PidT, signo: CInt): CInt =
    VxworksJniBridge.libc_vxworks_kill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    0

public actual fun sigqueue(rtpId: RtpId, signo: CInt, pValue: COpaquePointer?, sigCode: CInt): CInt =
    VxworksJniBridge.libc_vxworks_sigqueue_2(rtpId, signo, (pValue?.value ?: 0L), sigCode)

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    VxworksJniBridge.libc_vxworks_taskKill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    VxworksJniBridge.libc_vxworks_raise(signo)

public actual fun taskIdSelf(): TaskId =
    VxworksJniBridge.libc_vxworks_taskIdSelf()

public actual fun taskDelay(ticks: VxTicksT): CInt =
    VxworksJniBridge.libc_vxworks_taskDelay(ticks.toInt())

public actual fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_taskNameSet(taskId, (taskName?.value ?: 0L))

public actual fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    VxworksJniBridge.libc_vxworks_taskNameGet(taskId, (bufName?.value ?: 0L), bufsize.toLong())

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_rtpInfoGet(rtpId, (rtpStruct?.value ?: 0L))

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    VxworksJniBridge.libc_vxworks_rtpSpawn(pubrtpFileName, (argv?.value ?: 0L), (envp?.value ?: 0L), priority, uStackSize.toLong(), options, taskOptions)

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    VxworksJniBridge.libc_vxworks_pathIsAbsolute(filepath, (pNameTail?.value ?: 0L))

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    VxworksJniBridge.libc_vxworks_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    VxworksJniBridge.libc_vxworks_randBytes((buf?.value ?: 0L), length)

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    VxworksJniBridge.libc_vxworks_randABytes((buf?.value ?: 0L), length)

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    VxworksJniBridge.libc_vxworks_randUBytes((buf?.value ?: 0L), length)

public actual fun randSecure(): CInt =
    VxworksJniBridge.libc_vxworks_randSecure()

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    VxworksJniBridge.libc_vxworks_mqClose(mqd.toLong())

public actual fun mqUnlink(name: String?): CInt =
    VxworksJniBridge.libc_vxworks_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    VxworksJniBridge.libc_vxworks_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    VxworksJniBridge.libc_vxworks_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    VxworksJniBridge.libc_vxworks_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    VxworksJniBridge.libc_vxworks_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun vxCpuEnabledGet(): CpusetT =
    VxworksJniBridge.libc_vxworks_vxCpuEnabledGet().toUInt()

public actual fun vxCpuConfiguredGet(): CpusetT =
    VxworksJniBridge.libc_vxworks_vxCpuConfiguredGet().toUInt()
