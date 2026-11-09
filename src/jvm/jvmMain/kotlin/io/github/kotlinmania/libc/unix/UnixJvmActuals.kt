@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

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
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadKeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.ClockT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT

private object UnixJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_unix_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_unix_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_unix_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_unix_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_unix_islower(c: Int): Int

    @JvmStatic
    external fun libc_unix_isprint(c: Int): Int

    @JvmStatic
    external fun libc_unix_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_unix_isspace(c: Int): Int

    @JvmStatic
    external fun libc_unix_isupper(c: Int): Int

    @JvmStatic
    external fun libc_unix_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_unix_isblank(c: Int): Int

    @JvmStatic
    external fun libc_unix_tolower(c: Int): Int

    @JvmStatic
    external fun libc_unix_toupper(c: Int): Int

    @JvmStatic
    external fun libc_unix_qsort(base: Long, num: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libc_unix_bsearch(key: Long, base: Long, num: Long, size: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_fopen(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_freopen(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_unix_fflush(file: Long): Int

    @JvmStatic
    external fun libc_unix_fclose(file: Long): Int

    @JvmStatic
    external fun libc_unix_remove(filename: String?): Int

    @JvmStatic
    external fun libc_unix_rename(oldname: String?, newname: String?): Int

    @JvmStatic
    external fun libc_unix_tmpfile(): Long

    @JvmStatic
    external fun libc_unix_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_unix_setbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libc_unix_getchar(): Int

    @JvmStatic
    external fun libc_unix_putchar(c: Int): Int

    @JvmStatic
    external fun libc_unix_fgetc(stream: Long): Int

    @JvmStatic
    external fun libc_unix_fgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libc_unix_fputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_unix_fputs(s: String?, stream: Long): Int

    @JvmStatic
    external fun libc_unix_puts(s: String?): Int

    @JvmStatic
    external fun libc_unix_ungetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_unix_fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_fseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_unix_ftell(stream: Long): Long

    @JvmStatic
    external fun libc_unix_rewind(stream: Long)

    @JvmStatic
    external fun libc_unix_fgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_fsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_feof(stream: Long): Int

    @JvmStatic
    external fun libc_unix_ferror(stream: Long): Int

    @JvmStatic
    external fun libc_unix_clearerr(stream: Long)

    @JvmStatic
    external fun libc_unix_perror(s: String?)

    @JvmStatic
    external fun libc_unix_atof(s: String?): Double

    @JvmStatic
    external fun libc_unix_atoi(s: String?): Int

    @JvmStatic
    external fun libc_unix_atol(s: String?): Long

    @JvmStatic
    external fun libc_unix_atoll(s: String?): Long

    @JvmStatic
    external fun libc_unix_strtod(s: String?, endp: Long): Double

    @JvmStatic
    external fun libc_unix_strtof(s: String?, endp: Long): Float

    @JvmStatic
    external fun libc_unix_strtol(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_unix_strtoll(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_unix_strtoul(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_unix_strtoull(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_unix_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_malloc(size: Long): Long

    @JvmStatic
    external fun libc_unix_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_free(p: Long)

    @JvmStatic
    external fun libc_unix_abort()

    @JvmStatic
    external fun libc_unix_exit(status: Int)

    @JvmStatic
    external fun libc_unix_system(s: String?): Int

    @JvmStatic
    external fun libc_unix_getenv(s: String?): Long

    @JvmStatic
    external fun libc_unix_strcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_unix_strncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_unix_stpcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_unix_strcat(s: Long, ct: String?): Long

    @JvmStatic
    external fun libc_unix_strncat(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_unix_strcmp(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_unix_strncmp(cs: String?, ct: String?, n: Long): Int

    @JvmStatic
    external fun libc_unix_strcoll(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_unix_strchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_unix_strrchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_unix_strspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_unix_strcspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_unix_strdup(cs: String?): Long

    @JvmStatic
    external fun libc_unix_strndup(cs: String?, n: Long): Long

    @JvmStatic
    external fun libc_unix_strpbrk(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_unix_strstr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_unix_strcasecmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_unix_strncasecmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_unix_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_unix_strnlen(cs: String?, maxlen: Long): Long

    @JvmStatic
    external fun libc_unix_strerror(n: Int): Long

    @JvmStatic
    external fun libc_unix_strtok(s: Long, t: String?): Long

    @JvmStatic
    external fun libc_unix_strtokR(s: Long, t: String?, p: Long): Long

    @JvmStatic
    external fun libc_unix_strxfrm(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_unix_strsignal(sig: Int): Long

    @JvmStatic
    external fun libc_unix_wcslen(buf: Long): Long

    @JvmStatic
    external fun libc_unix_wcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_wmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_unix_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_memccpy(dest: Long, src: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_getpwnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_getpwuid(uid: Short): Long

    @JvmStatic
    external fun libc_unix_getcharUnlocked(): Int

    @JvmStatic
    external fun libc_unix_putcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libc_unix_socket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_unix_connect(socket: Int, address: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_listen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_unix_accept(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_unix_getpeername(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_unix_getsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_unix_setsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libc_unix_socketpair(domain: Int, type: Int, protocol: Int, socketVector: Long): Int

    @JvmStatic
    external fun libc_unix_sendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libc_unix_shutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libc_unix_chmod(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_fchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_fstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_mkdir(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_stat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_pclose(stream: Long): Int

    @JvmStatic
    external fun libc_unix_fdopen(fd: Int, mode: String?): Long

    @JvmStatic
    external fun libc_unix_fileno(stream: Long): Int

    @JvmStatic
    external fun libc_unix_creat(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_opendir(dirname: String?): Long

    @JvmStatic
    external fun libc_unix_readdir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_closedir(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_rewinddir(dirp: Long)

    @JvmStatic
    external fun libc_unix_fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_fchown(fd: Int, owner: Short, group: Short): Int

    @JvmStatic
    external fun libc_unix_fchownat(dirfd: Int, pathname: String?, owner: Short, group: Short, flags: Int): Int

    @JvmStatic
    external fun libc_unix_fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int

    @JvmStatic
    external fun libc_unix_symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int

    @JvmStatic
    external fun libc_unix_unlinkat(dirfd: Int, pathname: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_access(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_unix_alarm(seconds: Int): Int

    @JvmStatic
    external fun libc_unix_chdir(dir: String?): Int

    @JvmStatic
    external fun libc_unix_fchdir(dirfd: Int): Int

    @JvmStatic
    external fun libc_unix_chown(path: String?, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libc_unix_lchown(path: String?, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libc_unix_close(fd: Int): Int

    @JvmStatic
    external fun libc_unix_dup(fd: Int): Int

    @JvmStatic
    external fun libc_unix_dup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libc_unix_execv(prog: String?, argv: Long): Int

    @JvmStatic
    external fun libc_unix_execve(prog: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_execvp(c: String?, argv: Long): Int

    @JvmStatic
    external fun libc_unix_fork(): Int

    @JvmStatic
    external fun libc_unix_fpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libc_unix_getcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_getegid(): Short

    @JvmStatic
    external fun libc_unix_geteuid(): Short

    @JvmStatic
    external fun libc_unix_getgid(): Short

    @JvmStatic
    external fun libc_unix_getgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libc_unix_getlogin(): Long

    @JvmStatic
    external fun libc_unix_getopt(argc: Int, argv: Long, optstr: String?): Int

    @JvmStatic
    external fun libc_unix_getpgid(pid: Int): Int

    @JvmStatic
    external fun libc_unix_getpgrp(): Int

    @JvmStatic
    external fun libc_unix_getpid(): Int

    @JvmStatic
    external fun libc_unix_getppid(): Int

    @JvmStatic
    external fun libc_unix_getuid(): Short

    @JvmStatic
    external fun libc_unix_isatty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_link(src: String?, dst: String?): Int

    @JvmStatic
    external fun libc_unix_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_unix_pathconf(path: String?, name: Int): Long

    @JvmStatic
    external fun libc_unix_pipe(fds: Long): Int

    @JvmStatic
    external fun libc_unix_posixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_alignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_read(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_unix_seteuid(uid: Short): Int

    @JvmStatic
    external fun libc_unix_setegid(gid: Short): Int

    @JvmStatic
    external fun libc_unix_setgid(gid: Short): Int

    @JvmStatic
    external fun libc_unix_setpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libc_unix_setsid(): Int

    @JvmStatic
    external fun libc_unix_setuid(uid: Short): Int

    @JvmStatic
    external fun libc_unix_setreuid(ruid: Short, euid: Short): Int

    @JvmStatic
    external fun libc_unix_setregid(rgid: Short, egid: Short): Int

    @JvmStatic
    external fun libc_unix_sleep(secs: Int): Int

    @JvmStatic
    external fun libc_unix_nanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_tcgetpgrp(fd: Int): Int

    @JvmStatic
    external fun libc_unix_tcsetpgrp(fd: Int, pgrp: Int): Int

    @JvmStatic
    external fun libc_unix_ttyname(fd: Int): Long

    @JvmStatic
    external fun libc_unix_ttynameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_unlink(c: String?): Int

    @JvmStatic
    external fun libc_unix_wait(status: Long): Int

    @JvmStatic
    external fun libc_unix_waitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_write(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_pread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_umask(mask: Int): Int

    @JvmStatic
    external fun libc_unix_utime(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_kill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libc_unix_killpg(pgrp: Int, sig: Int): Int

    @JvmStatic
    external fun libc_unix_mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_mlockall(flags: Int): Int

    @JvmStatic
    external fun libc_unix_munlockall(): Int

    @JvmStatic
    external fun libc_unix_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_ifNametoindex(ifname: String?): Int

    @JvmStatic
    external fun libc_unix_ifIndextoname(ifindex: Int, ifname: Long): Long

    @JvmStatic
    external fun libc_unix_lstat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_fsync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_setenv(name: String?, value: String?, overwrite: Int): Int

    @JvmStatic
    external fun libc_unix_unsetenv(name: String?): Int

    @JvmStatic
    external fun libc_unix_symlink(path1: String?, path2: String?): Int

    @JvmStatic
    external fun libc_unix_truncate(path: String?, length: Long): Int

    @JvmStatic
    external fun libc_unix_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_unix_signal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libc_unix_getrusage(resource: Int, usage: Long): Int

    @JvmStatic
    external fun libc_unix_realpath(pathname: String?, resolved: Long): Long

    @JvmStatic
    external fun libc_unix_times(buf: Long): Long

    @JvmStatic
    external fun libc_unix_pthreadSelf(): Long

    @JvmStatic
    external fun libc_unix_pthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadExit(value: Long)

    @JvmStatic
    external fun libc_unix_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libc_unix_pthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libc_unix_schedYield(): Int

    @JvmStatic
    external fun libc_unix_pthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libc_unix_pthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libc_unix_pthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libc_unix_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_pthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_unix_raise(signum: Int): Int

    @JvmStatic
    external fun libc_unix_utimes(filename: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_dlopen(filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_unix_dlerror(): Long

    @JvmStatic
    external fun libc_unix_dlsym(handle: Long, symbol: String?): Long

    @JvmStatic
    external fun libc_unix_dlclose(handle: Long): Int

    @JvmStatic
    external fun libc_unix_getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_freeaddrinfo(res: Long)

    @JvmStatic
    external fun libc_unix_hstrerror(errcode: Int): Long

    @JvmStatic
    external fun libc_unix_gaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libc_unix_resInit(): Int

    @JvmStatic
    external fun libc_unix_gmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_unix_localtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_unix_mktime(tm: Long): Long

    @JvmStatic
    external fun libc_unix_time(time: Long): Long

    @JvmStatic
    external fun libc_unix_gmtime(timeP: Long): Long

    @JvmStatic
    external fun libc_unix_localtime(timeP: Long): Long

    @JvmStatic
    external fun libc_unix_difftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libc_unix_timegm(tm: Long): Long

    @JvmStatic
    external fun libc_unix_mknod(pathname: String?, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libc_unix_gethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_endservent()

    @JvmStatic
    external fun libc_unix_getservbyname(name: String?, proto: String?): Long

    @JvmStatic
    external fun libc_unix_getservbyport(port: Int, proto: String?): Long

    @JvmStatic
    external fun libc_unix_getservent(): Long

    @JvmStatic
    external fun libc_unix_setservent(stayopen: Int)

    @JvmStatic
    external fun libc_unix_getprotobyname(name: String?): Long

    @JvmStatic
    external fun libc_unix_getprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libc_unix_chroot(name: String?): Int

    @JvmStatic
    external fun libc_unix_usleep(secs: Int): Int

    @JvmStatic
    external fun libc_unix_usleep_2(secs: Int): Int

    @JvmStatic
    external fun libc_unix_send(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_recv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_putenv(string: Long): Int

    @JvmStatic
    external fun libc_unix_poll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_setlocale(category: Int, locale: String?): Long

    @JvmStatic
    external fun libc_unix_localeconv(): Long

    @JvmStatic
    external fun libc_unix_semWait(sem: Long): Int

    @JvmStatic
    external fun libc_unix_semTrywait(sem: Long): Int

    @JvmStatic
    external fun libc_unix_semPost(sem: Long): Int

    @JvmStatic
    external fun libc_unix_statvfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_fstatvfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_sigemptyset(set: Long): Int

    @JvmStatic
    external fun libc_unix_sigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_unix_sigfillset(set: Long): Int

    @JvmStatic
    external fun libc_unix_sigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_unix_sigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_unix_sigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_sigpending(set: Long): Int

    @JvmStatic
    external fun libc_unix_sysconf(name: Int): Long

    @JvmStatic
    external fun libc_unix_mkfifo(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_fseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_unix_ftello(stream: Long): Long

    @JvmStatic
    external fun libc_unix_tcdrain(fd: Int): Int

    @JvmStatic
    external fun libc_unix_cfgetispeed(termios: Long): Long

    @JvmStatic
    external fun libc_unix_cfgetospeed(termios: Long): Long

    @JvmStatic
    external fun libc_unix_cfsetispeed(termios: Long, speed: Long): Int

    @JvmStatic
    external fun libc_unix_cfsetospeed(termios: Long, speed: Long): Int

    @JvmStatic
    external fun libc_unix_tcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libc_unix_tcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libc_unix_tcflow(fd: Int, action: Int): Int

    @JvmStatic
    external fun libc_unix_tcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libc_unix_tcgetsid(fd: Int): Int

    @JvmStatic
    external fun libc_unix_tcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libc_unix_mkstemp(template: Long): Int

    @JvmStatic
    external fun libc_unix_mkdtemp(template: Long): Long

    @JvmStatic
    external fun libc_unix_tmpnam(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_openlog(ident: String?, logopt: Int, facility: Int)

    @JvmStatic
    external fun libc_unix_closelog()

    @JvmStatic
    external fun libc_unix_setlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libc_unix_nice(incr: Int): Int

    @JvmStatic
    external fun libc_unix_grantpt(fd: Int): Int

    @JvmStatic
    external fun libc_unix_posixOpenpt(flags: Int): Int

    @JvmStatic
    external fun libc_unix_ptsname(fd: Int): Long

    @JvmStatic
    external fun libc_unix_unlockpt(fd: Int): Int

    @JvmStatic
    external fun libc_unix_strcasestr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_unix_getline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_lockf(fd: Int, cmd: Int, len: Long): Int

    @JvmStatic
    external fun libc_unix_adjtime(delta: Long, olddelta: Long): Int

    @JvmStatic
    external fun libc_unix_stpncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_unix_confstr(name: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_dladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_flock(fd: Int, operation: Int): Int

    @JvmStatic
    external fun libc_unix_openWmemstream(ptr: Long, sizeloc: Long): Long

    @JvmStatic
    external fun libc_unix_getsid(pid: Int): Int

    @JvmStatic
    external fun libc_unix_pause(): Int

    @JvmStatic
    external fun libc_unix_mkdirat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_fdopendir(fd: Int): Long

    @JvmStatic
    external fun libc_unix_readdirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Int

    @JvmStatic
    external fun libc_unix_readlink(path: String?, buf: Long, bufsz: Long): Int

    @JvmStatic
    external fun libc_unix_pselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_sigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libc_unix_fmemopen(buf: Long, size: Long, mode: String?): Long

    @JvmStatic
    external fun libc_unix_openMemstream(ptr: Long, sizeloc: Long): Long

    @JvmStatic
    external fun libc_unix_atexit(cb: Long): Int

    @JvmStatic
    external fun libc_unix_cfmakeraw(termios: Long): Int

    @JvmStatic
    external fun libc_unix_cfsetspeed(termios: Long, speed: Long): Int

    @JvmStatic
    external fun libc_unix_fnmatch(pattern: String?, name: String?, flags: Int): Int
}

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = null as In6Addr

public actual val IN6ADDR_ANY: In6Addr
    get() = null as In6Addr

public actual fun isalnum(c: CInt): CInt =
    UnixJniBridge.libc_unix_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    UnixJniBridge.libc_unix_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    UnixJniBridge.libc_unix_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    UnixJniBridge.libc_unix_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    UnixJniBridge.libc_unix_isgraph(c)

public actual fun islower(c: CInt): CInt =
    UnixJniBridge.libc_unix_islower(c)

public actual fun isprint(c: CInt): CInt =
    UnixJniBridge.libc_unix_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    UnixJniBridge.libc_unix_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    UnixJniBridge.libc_unix_isspace(c)

public actual fun isupper(c: CInt): CInt =
    UnixJniBridge.libc_unix_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    UnixJniBridge.libc_unix_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    UnixJniBridge.libc_unix_isblank(c)

public actual fun tolower(c: CInt): CInt =
    UnixJniBridge.libc_unix_tolower(c)

public actual fun toupper(c: CInt): CInt =
    UnixJniBridge.libc_unix_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    UnixJniBridge.libc_unix_qsort((base?.value ?: 0L), num.toLong(), size.toLong(), 0L)
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? =
    UnixJniBridge.libc_unix_bsearch((key?.value ?: 0L), (base?.value ?: 0L), num.toLong(), size.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen(filename: String?, mode: String?): FILE? =
    UnixJniBridge.libc_unix_fopen(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    UnixJniBridge.libc_unix_freopen(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fflush(file: FILE?): CInt =
    UnixJniBridge.libc_unix_fflush((file?.handle ?: 0L))

public actual fun fclose(file: FILE?): CInt =
    UnixJniBridge.libc_unix_fclose((file?.handle ?: 0L))

public actual fun remove(filename: String?): CInt =
    UnixJniBridge.libc_unix_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    UnixJniBridge.libc_unix_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    UnixJniBridge.libc_unix_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    UnixJniBridge.libc_unix_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    UnixJniBridge.libc_unix_setbuf((stream?.handle ?: 0L), (buf?.value ?: 0L))
}

public actual fun getchar(): CInt =
    UnixJniBridge.libc_unix_getchar()

public actual fun putchar(c: CInt): CInt =
    UnixJniBridge.libc_unix_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    UnixJniBridge.libc_unix_fgetc((stream?.handle ?: 0L))

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    UnixJniBridge.libc_unix_fgets((buf?.value ?: 0L), n, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    UnixJniBridge.libc_unix_fputc(c, (stream?.handle ?: 0L))

public actual fun fputs(s: String?, stream: FILE?): CInt =
    UnixJniBridge.libc_unix_fputs(s, (stream?.handle ?: 0L))

public actual fun puts(s: String?): CInt =
    UnixJniBridge.libc_unix_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    UnixJniBridge.libc_unix_ungetc(c, (stream?.handle ?: 0L))

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixJniBridge.libc_unix_fread((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixJniBridge.libc_unix_fwrite((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    UnixJniBridge.libc_unix_fseek((stream?.handle ?: 0L), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    UnixJniBridge.libc_unix_ftell((stream?.handle ?: 0L))

public actual fun rewind(stream: FILE?) {
    UnixJniBridge.libc_unix_rewind((stream?.handle ?: 0L))
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_fgetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_fsetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun feof(stream: FILE?): CInt =
    UnixJniBridge.libc_unix_feof((stream?.handle ?: 0L))

public actual fun ferror(stream: FILE?): CInt =
    UnixJniBridge.libc_unix_ferror((stream?.handle ?: 0L))

public actual fun clearerr(stream: FILE?) {
    UnixJniBridge.libc_unix_clearerr((stream?.handle ?: 0L))
}

public actual fun perror(s: String?) {
    UnixJniBridge.libc_unix_perror(s)
}

public actual fun atof(s: String?): CDouble =
    UnixJniBridge.libc_unix_atof(s)

public actual fun atoi(s: String?): CInt =
    UnixJniBridge.libc_unix_atoi(s)

public actual fun atol(s: String?): CLong =
    UnixJniBridge.libc_unix_atol(s)

public actual fun atoll(s: String?): CLonglong =
    UnixJniBridge.libc_unix_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    UnixJniBridge.libc_unix_strtod(s, (endp?.value ?: 0L))

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    UnixJniBridge.libc_unix_strtof(s, (endp?.value ?: 0L))

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    UnixJniBridge.libc_unix_strtol(s, (endp?.value ?: 0L), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    UnixJniBridge.libc_unix_strtoll(s, (endp?.value ?: 0L), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    UnixJniBridge.libc_unix_strtoul(s, (endp?.value ?: 0L), base).toULong()

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    UnixJniBridge.libc_unix_strtoull(s, (endp?.value ?: 0L), base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    UnixJniBridge.libc_unix_free((p?.value ?: 0L))
}

public actual fun abort(): Nothing {
    UnixJniBridge.libc_unix_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    UnixJniBridge.libc_unix_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: String?): CInt =
    UnixJniBridge.libc_unix_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_strncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_stpcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strcat((s?.value ?: 0L), ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_strncat((s?.value ?: 0L), ct, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    UnixJniBridge.libc_unix_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    UnixJniBridge.libc_unix_strncmp(cs, ct, n.toLong())

public actual fun strcoll(cs: String?, ct: String?): CInt =
    UnixJniBridge.libc_unix_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    UnixJniBridge.libc_unix_strspn(cs, ct).toULong()

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    UnixJniBridge.libc_unix_strcspn(cs, ct).toULong()

public actual fun strdup(cs: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_strndup(cs, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    UnixJniBridge.libc_unix_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    UnixJniBridge.libc_unix_strncasecmp(s1, s2, n.toLong())

public actual fun strlen(cs: String?): SizeT =
    UnixJniBridge.libc_unix_strlen(cs).toULong()

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    UnixJniBridge.libc_unix_strnlen(cs, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strtok((s?.value ?: 0L), t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_strtokR((s?.value ?: 0L), t, (p?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    UnixJniBridge.libc_unix_strxfrm((s?.value ?: 0L), ct, n.toLong()).toULong()

public actual fun strsignal(sig: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_strsignal(sig).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    UnixJniBridge.libc_unix_wcslen((buf?.value ?: 0L)).toULong()

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    UnixJniBridge.libc_unix_wcstombs((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).toULong()

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_wmemchr((cx?.value ?: 0L), c.toInt(), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    UnixJniBridge.libc_unix_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_memccpy((dest?.value ?: 0L), (src?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwnam(name: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_getpwnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    UnixJniBridge.libc_unix_getpwuid(uid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

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
    UnixJniBridge.libc_unix_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    UnixJniBridge.libc_unix_putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    UnixJniBridge.libc_unix_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    UnixJniBridge.libc_unix_connect(socket, (address?.value ?: 0L), len.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    UnixJniBridge.libc_unix_listen(socket, backlog)

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_accept(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getpeername(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getsockname(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    UnixJniBridge.libc_unix_setsockopt(socket, level, name, (value?.value ?: 0L), optionLen.toInt())

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_socketpair(domain, type, protocol, (socketVector?.value ?: 0L))

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    UnixJniBridge.libc_unix_sendto(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), addrlen.toInt())

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    UnixJniBridge.libc_unix_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_chmod(path, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_fchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_fstat(fildes, (buf?.value ?: 0L))

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_mkdir(path, mode.toInt())

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_stat(path, (buf?.value ?: 0L))

public actual fun pclose(stream: FILE?): CInt =
    UnixJniBridge.libc_unix_pclose((stream?.handle ?: 0L))

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    UnixJniBridge.libc_unix_fdopen(fd, mode).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(stream: FILE?): CInt =
    UnixJniBridge.libc_unix_fileno((stream?.handle ?: 0L))

public actual fun open(path: String?, oflag: CInt): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_creat(path, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    UnixJniBridge.libc_unix_opendir(dirname).let { if (it == 0L) null else DIR(it) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    UnixJniBridge.libc_unix_readdir((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun closedir(dirp: DIR?): CInt =
    UnixJniBridge.libc_unix_closedir((dirp?.handle ?: 0L))

public actual fun rewinddir(dirp: DIR?) {
    UnixJniBridge.libc_unix_rewinddir((dirp?.handle ?: 0L))
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    UnixJniBridge.libc_unix_fchmodat(dirfd, pathname, mode.toInt(), flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    UnixJniBridge.libc_unix_fchown(fd, owner.toShort(), group.toShort())

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    UnixJniBridge.libc_unix_fchownat(dirfd, pathname, owner.toShort(), group.toShort(), flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    UnixJniBridge.libc_unix_fstatat(dirfd, pathname, (buf?.value ?: 0L), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    UnixJniBridge.libc_unix_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    UnixJniBridge.libc_unix_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    UnixJniBridge.libc_unix_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    UnixJniBridge.libc_unix_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    UnixJniBridge.libc_unix_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    UnixJniBridge.libc_unix_alarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: String?): CInt =
    UnixJniBridge.libc_unix_chdir(dir)

public actual fun fchdir(dirfd: CInt): CInt =
    UnixJniBridge.libc_unix_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libc_unix_chown(path, uid.toShort(), gid.toShort())

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libc_unix_lchown(path, uid.toShort(), gid.toShort())

public actual fun close(fd: CInt): CInt =
    UnixJniBridge.libc_unix_close(fd)

public actual fun dup(fd: CInt): CInt =
    UnixJniBridge.libc_unix_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    UnixJniBridge.libc_unix_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?): CInt =
    0

public actual fun execle(path: String?, arg0: String?): CInt =
    0

public actual fun execlp(file: String?, arg0: String?): CInt =
    0

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_execv(prog, (argv?.value ?: 0L))

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_execve(prog, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_execvp(c, (argv?.value ?: 0L))

public actual fun fork(): PidT =
    UnixJniBridge.libc_unix_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    UnixJniBridge.libc_unix_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_getcwd((buf?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getegid(): GidT =
    UnixJniBridge.libc_unix_getegid().toUShort()

public actual fun geteuid(): UidT =
    UnixJniBridge.libc_unix_geteuid().toUShort()

public actual fun getgid(): GidT =
    UnixJniBridge.libc_unix_getgid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getgroups(ngroupsMax, (groups?.value ?: 0L))

public actual fun getlogin(): COpaquePointer? =
    UnixJniBridge.libc_unix_getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    UnixJniBridge.libc_unix_getopt(argc, (argv?.value ?: 0L), optstr)

public actual fun getpgid(pid: PidT): PidT =
    UnixJniBridge.libc_unix_getpgid(pid)

public actual fun getpgrp(): PidT =
    UnixJniBridge.libc_unix_getpgrp()

public actual fun getpid(): PidT =
    UnixJniBridge.libc_unix_getpid()

public actual fun getppid(): PidT =
    UnixJniBridge.libc_unix_getppid()

public actual fun getuid(): UidT =
    UnixJniBridge.libc_unix_getuid().toUShort()

public actual fun isatty(fd: CInt): CInt =
    UnixJniBridge.libc_unix_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    UnixJniBridge.libc_unix_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixJniBridge.libc_unix_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    UnixJniBridge.libc_unix_pathconf(path, name)

public actual fun pipe(fds: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pipe((fds?.value ?: 0L))

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    UnixJniBridge.libc_unix_posixMemalign((memptr?.value ?: 0L), align.toLong(), size.toLong())

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_alignedAlloc(alignment.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnixJniBridge.libc_unix_read(fd, (buf?.value ?: 0L), count.toLong())

public actual fun rmdir(path: String?): CInt =
    UnixJniBridge.libc_unix_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    UnixJniBridge.libc_unix_seteuid(uid.toShort())

public actual fun setegid(gid: GidT): CInt =
    UnixJniBridge.libc_unix_setegid(gid.toShort())

public actual fun setgid(gid: GidT): CInt =
    UnixJniBridge.libc_unix_setgid(gid.toShort())

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    UnixJniBridge.libc_unix_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    UnixJniBridge.libc_unix_setsid()

public actual fun setuid(uid: UidT): CInt =
    UnixJniBridge.libc_unix_setuid(uid.toShort())

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    UnixJniBridge.libc_unix_setreuid(ruid.toShort(), euid.toShort())

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    UnixJniBridge.libc_unix_setregid(rgid.toShort(), egid.toShort())

public actual fun sleep(secs: CUint): CUint =
    UnixJniBridge.libc_unix_sleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_nanosleep((rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun tcgetpgrp(fd: CInt): PidT =
    UnixJniBridge.libc_unix_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    UnixJniBridge.libc_unix_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixJniBridge.libc_unix_ttynameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun unlink(c: String?): CInt =
    UnixJniBridge.libc_unix_unlink(c)

public actual fun wait(status: COpaquePointer?): PidT =
    UnixJniBridge.libc_unix_wait((status?.value ?: 0L))

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    UnixJniBridge.libc_unix_waitpid(pid, (status?.value ?: 0L), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnixJniBridge.libc_unix_write(fd, (buf?.value ?: 0L), count.toLong())

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libc_unix_pread(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libc_unix_pwrite(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun umask(mask: ModeT): ModeT =
    UnixJniBridge.libc_unix_umask(mask.toInt()).toUInt()

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_utime(file, (buf?.value ?: 0L))

public actual fun kill(pid: PidT, sig: CInt): CInt =
    UnixJniBridge.libc_unix_kill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    UnixJniBridge.libc_unix_killpg(pgrp, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    UnixJniBridge.libc_unix_mlock((addr?.value ?: 0L), len.toLong())

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    UnixJniBridge.libc_unix_munlock((addr?.value ?: 0L), len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    UnixJniBridge.libc_unix_mlockall(flags)

public actual fun munlockall(): CInt =
    UnixJniBridge.libc_unix_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    UnixJniBridge.libc_unix_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    UnixJniBridge.libc_unix_munmap((addr?.value ?: 0L), len.toLong())

public actual fun ifNametoindex(ifname: String?): CUint =
    UnixJniBridge.libc_unix_ifNametoindex(ifname).toUInt()

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_lstat(path, (buf?.value ?: 0L))

public actual fun fsync(fd: CInt): CInt =
    UnixJniBridge.libc_unix_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    UnixJniBridge.libc_unix_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    UnixJniBridge.libc_unix_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    UnixJniBridge.libc_unix_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    UnixJniBridge.libc_unix_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixJniBridge.libc_unix_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    UnixJniBridge.libc_unix_signal(signum, handler.toLong()).toULong()

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getrusage(resource, (usage?.value ?: 0L))

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_realpath(pathname, (resolved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun times(buf: COpaquePointer?): ClockT =
    UnixJniBridge.libc_unix_times((buf?.value ?: 0L))

public actual fun pthreadSelf(): PthreadT =
    UnixJniBridge.libc_unix_pthreadSelf().toULong()()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixJniBridge.libc_unix_pthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadJoin(native.toLong(), (value?.value ?: 0L))

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    UnixJniBridge.libc_unix_pthreadExit((value?.value ?: 0L))
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadAttrDestroy((attr?.value ?: 0L))

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadAttrGetstacksize((attr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    UnixJniBridge.libc_unix_pthreadAttrSetstacksize((attr?.value ?: 0L), stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    UnixJniBridge.libc_unix_pthreadAttrSetdetachstate((attr?.value ?: 0L), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    UnixJniBridge.libc_unix_pthreadDetach(thread.toLong())

public actual fun schedYield(): CInt =
    UnixJniBridge.libc_unix_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    UnixJniBridge.libc_unix_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    UnixJniBridge.libc_unix_pthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    UnixJniBridge.libc_unix_pthreadGetspecific(key.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadSetspecific(key.toInt(), (value?.value ?: 0L))

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexDestroy((lock?.value ?: 0L))

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexLock((lock?.value ?: 0L))

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexTrylock((lock?.value ?: 0L))

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexUnlock((lock?.value ?: 0L))

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    UnixJniBridge.libc_unix_pthreadMutexattrSettype((attr?.value ?: 0L), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondWait((cond?.value ?: 0L), (lock?.value ?: 0L))

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondTimedwait((cond?.value ?: 0L), (lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondattrInit((attr?.value ?: 0L))

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadCondattrDestroy((attr?.value ?: 0L))

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockDestroy((lock?.value ?: 0L))

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockRdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockTryrdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockWrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockTrywrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockUnlock((lock?.value ?: 0L))

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockattrInit((attr?.value ?: 0L))

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pthreadRwlockattrDestroy((attr?.value ?: 0L))

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getsockopt(sockfd, level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun raise(signum: CInt): CInt =
    UnixJniBridge.libc_unix_raise(signum)

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_utimes(filename, (times?.value ?: 0L))

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    UnixJniBridge.libc_unix_dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_dlsym((handle?.value ?: 0L), symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_dlclose((handle?.value ?: 0L))

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_getaddrinfo(node, service, (hints?.value ?: 0L), (res?.value ?: 0L))

public actual fun freeaddrinfo(res: COpaquePointer?) {
    UnixJniBridge.libc_unix_freeaddrinfo((res?.value ?: 0L))
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_hstrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resInit(): CInt =
    UnixJniBridge.libc_unix_resInit()

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_gmtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_localtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    UnixJniBridge.libc_unix_mktime((tm?.value ?: 0L))

public actual fun time(time: COpaquePointer?): TimeT =
    UnixJniBridge.libc_unix_time((time?.value ?: 0L))

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_gmtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_localtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    UnixJniBridge.libc_unix_difftime(time1, time0)

public actual fun timegm(tm: COpaquePointer?): TimeT =
    UnixJniBridge.libc_unix_timegm((tm?.value ?: 0L))

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixJniBridge.libc_unix_mknod(pathname, mode.toInt(), dev)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    UnixJniBridge.libc_unix_gethostname((name?.value ?: 0L), len.toLong())

public actual fun endservent() {
    UnixJniBridge.libc_unix_endservent()
}

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_getservbyname(name, proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getservbyport(port: CInt, proto: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_getservbyport(port, proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getservent(): COpaquePointer? =
    UnixJniBridge.libc_unix_getservent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setservent(stayopen: CInt) {
    UnixJniBridge.libc_unix_setservent(stayopen)
}

public actual fun getprotobyname(name: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_getprotobyname(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_getprotobynumber(proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chroot(name: String?): CInt =
    UnixJniBridge.libc_unix_chroot(name)

public actual fun usleep(secs: UsecondsT): CInt =
    UnixJniBridge.libc_unix_usleep(secs.toInt())

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libc_unix_send(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libc_unix_recv(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_putenv((string?.value ?: 0L))

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    UnixJniBridge.libc_unix_poll((fds?.value ?: 0L), nfds.toLong(), timeout)

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_select(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (errorfds?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): COpaquePointer? =
    UnixJniBridge.libc_unix_localeconv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semWait(sem: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_semWait((sem?.value ?: 0L))

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_semTrywait((sem?.value ?: 0L))

public actual fun semPost(sem: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_semPost((sem?.value ?: 0L))

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_statvfs(path, (buf?.value ?: 0L))

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_fstatvfs(fd, (buf?.value ?: 0L))

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_sigemptyset((set?.value ?: 0L))

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    UnixJniBridge.libc_unix_sigaddset((set?.value ?: 0L), signum)

public actual fun sigfillset(set: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_sigfillset((set?.value ?: 0L))

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    UnixJniBridge.libc_unix_sigdelset((set?.value ?: 0L), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    UnixJniBridge.libc_unix_sigismember((set?.value ?: 0L), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_sigprocmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun sigpending(set: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_sigpending((set?.value ?: 0L))

public actual fun sysconf(name: CInt): CLong =
    UnixJniBridge.libc_unix_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_mkfifo(path, mode.toInt())

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    UnixJniBridge.libc_unix_fseeko((stream?.handle ?: 0L), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    UnixJniBridge.libc_unix_ftello((stream?.handle ?: 0L))

public actual fun tcdrain(fd: CInt): CInt =
    UnixJniBridge.libc_unix_tcdrain(fd)

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    UnixJniBridge.libc_unix_cfgetispeed((termios?.value ?: 0L)).toULong()

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    UnixJniBridge.libc_unix_cfgetospeed((termios?.value ?: 0L)).toULong()

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    UnixJniBridge.libc_unix_cfsetispeed((termios?.value ?: 0L), speed.toLong())

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    UnixJniBridge.libc_unix_cfsetospeed((termios?.value ?: 0L), speed.toLong())

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_tcgetattr(fd, (termios?.value ?: 0L))

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_tcsetattr(fd, optionalActions, (termios?.value ?: 0L))

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libc_unix_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libc_unix_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    UnixJniBridge.libc_unix_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    UnixJniBridge.libc_unix_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_mkstemp((template?.value ?: 0L))

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_mkdtemp((template?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    UnixJniBridge.libc_unix_tmpnam((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    UnixJniBridge.libc_unix_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    UnixJniBridge.libc_unix_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    UnixJniBridge.libc_unix_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?) {
}

public actual fun nice(incr: CInt): CInt =
    UnixJniBridge.libc_unix_nice(incr)

public actual fun grantpt(fd: CInt): CInt =
    UnixJniBridge.libc_unix_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    UnixJniBridge.libc_unix_posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    UnixJniBridge.libc_unix_ptsname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlockpt(fd: CInt): CInt =
    UnixJniBridge.libc_unix_unlockpt(fd)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    UnixJniBridge.libc_unix_strcasestr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    UnixJniBridge.libc_unix_getline((lineptr?.value ?: 0L), (n?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    UnixJniBridge.libc_unix_lockf(fd, cmd, len)

public actual fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_adjtime((delta?.value ?: 0L), (olddelta?.value ?: 0L))

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    UnixJniBridge.libc_unix_stpncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    UnixJniBridge.libc_unix_confstr(name, (buf?.value ?: 0L), len.toLong()).toULong()

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_dladdr((addr?.value ?: 0L), (info?.value ?: 0L))

public actual fun flock(fd: CInt, operation: CInt): CInt =
    UnixJniBridge.libc_unix_flock(fd, operation)

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    UnixJniBridge.libc_unix_openWmemstream((ptr?.value ?: 0L), (sizeloc?.value ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun getsid(pid: PidT): PidT =
    UnixJniBridge.libc_unix_getsid(pid)

public actual fun pause(): CInt =
    UnixJniBridge.libc_unix_pause()

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixJniBridge.libc_unix_mkdirat(dirfd, pathname, mode.toInt())

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun fdopendir(fd: CInt): DIR? =
    UnixJniBridge.libc_unix_fdopendir(fd).let { if (it == 0L) null else DIR(it) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_readdirR((dirp?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    UnixJniBridge.libc_unix_readlinkat(dirfd, pathname, (buf?.value ?: 0L), bufsiz.toLong())

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    UnixJniBridge.libc_unix_readlink(path, (buf?.value ?: 0L), bufsz.toLong())

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_pselect(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (errorfds?.value ?: 0L), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_sigaction(signum, (act?.value ?: 0L), (oldact?.value ?: 0L))

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    UnixJniBridge.libc_unix_fmemopen((buf?.value ?: 0L), size.toLong(), mode).let { if (it == 0L) null else FILE(it) }

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    UnixJniBridge.libc_unix_openMemstream((ptr?.value ?: 0L), (sizeloc?.value ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun atexit(cb: AtexitCbCallback): CInt =
    UnixJniBridge.libc_unix_atexit(0L)

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    UnixJniBridge.libc_unix_cfmakeraw((termios?.value ?: 0L))

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    UnixJniBridge.libc_unix_cfsetspeed((termios?.value ?: 0L), speed.toLong())

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    UnixJniBridge.libc_unix_fnmatch(pattern, name, flags)
