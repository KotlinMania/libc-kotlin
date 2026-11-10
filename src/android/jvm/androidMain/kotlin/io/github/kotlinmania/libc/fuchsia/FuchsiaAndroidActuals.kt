@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT

private object FuchsiaJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_fuchsia_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_islower(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isprint(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isspace(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isupper(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_isblank(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tolower(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_toupper(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fopen(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_fuchsia_freopen(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_fuchsia_fflush(file: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fclose(file: Long): Int

    @JvmStatic
    external fun libc_fuchsia_remove(filename: String?): Int

    @JvmStatic
    external fun libc_fuchsia_rename(oldname: String?, newname: String?): Int

    @JvmStatic
    external fun libc_fuchsia_tmpfile(): Long

    @JvmStatic
    external fun libc_fuchsia_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libc_fuchsia_getchar(): Int

    @JvmStatic
    external fun libc_fuchsia_putchar(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fgetc(stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libc_fuchsia_fputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fputs(s: String?, stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_puts(s: String?): Int

    @JvmStatic
    external fun libc_fuchsia_ungetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_fuchsia_fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_fuchsia_fseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ftell(stream: Long): Long

    @JvmStatic
    external fun libc_fuchsia_rewind(stream: Long)

    @JvmStatic
    external fun libc_fuchsia_fgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_feof(stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_ferror(stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_perror(s: String?)

    @JvmStatic
    external fun libc_fuchsia_atof(s: String?): Double

    @JvmStatic
    external fun libc_fuchsia_atoi(s: String?): Int

    @JvmStatic
    external fun libc_fuchsia_atol(s: String?): Long

    @JvmStatic
    external fun libc_fuchsia_atoll(s: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strtod(s: String?, endp: Long): Double

    @JvmStatic
    external fun libc_fuchsia_strtof(s: String?, endp: Long): Float

    @JvmStatic
    external fun libc_fuchsia_strtol(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strtoll(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strtoul(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strtoull(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_fuchsia_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_fuchsia_malloc(size: Long): Long

    @JvmStatic
    external fun libc_fuchsia_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_fuchsia_free(p: Long)

    @JvmStatic
    external fun libc_fuchsia_abort()

    @JvmStatic
    external fun libc_fuchsia_exit(status: Int)

    @JvmStatic
    external fun libc_fuchsia_atexit(cb: Long): Int

    @JvmStatic
    external fun libc_fuchsia_system(s: String?): Int

    @JvmStatic
    external fun libc_fuchsia_getenv(s: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_strcat(s: Long, ct: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strncat(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_strcmp(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_fuchsia_strncmp(cs: String?, ct: String?, n: Long): Int

    @JvmStatic
    external fun libc_fuchsia_strcoll(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_fuchsia_strchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strrchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strcspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strdup(cs: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strpbrk(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strstr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strnlen(cs: String?, maxlen: Long): Long

    @JvmStatic
    external fun libc_fuchsia_strerror(n: Int): Long

    @JvmStatic
    external fun libc_fuchsia_strtok(s: Long, t: String?): Long

    @JvmStatic
    external fun libc_fuchsia_strxfrm(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_wcslen(buf: Long): Long

    @JvmStatic
    external fun libc_fuchsia_wcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_wmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_fuchsia_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_abs(i: Int): Int

    @JvmStatic
    external fun libc_fuchsia_labs(i: Long): Long

    @JvmStatic
    external fun libc_fuchsia_rand(): Int

    @JvmStatic
    external fun libc_fuchsia_srand(seed: Int)

    @JvmStatic
    external fun libc_fuchsia_getpwnam(name: String?): Long

    @JvmStatic
    external fun libc_fuchsia_getpwuid(uid: Int): Long

    @JvmStatic
    external fun libc_fuchsia_getcharUnlocked(): Int

    @JvmStatic
    external fun libc_fuchsia_putcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libc_fuchsia_socket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_fuchsia_connect(socket: Int, address: Long, len: Int): Int

    @JvmStatic
    external fun libc_fuchsia_listen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_fuchsia_accept(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getpeername(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libc_fuchsia_socketpair(domain: Int, type: Int, protocol: Int, socketVector: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libc_fuchsia_shutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libc_fuchsia_chmod(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_mkdir(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_stat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pclose(stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fdopen(fd: Int, mode: String?): Long

    @JvmStatic
    external fun libc_fuchsia_fileno(stream: Long): Int

    @JvmStatic
    external fun libc_fuchsia_creat(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_opendir(dirname: String?): Long

    @JvmStatic
    external fun libc_fuchsia_readdir(dirp: Long): Long

    @JvmStatic
    external fun libc_fuchsia_readdirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_fuchsia_closedir(dirp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_rewinddir(dirp: Long)

    @JvmStatic
    external fun libc_fuchsia_fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fchown(fd: Int, owner: Int, group: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fchownat(dirfd: Int, pathname: String?, owner: Int, group: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mkdirat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Long

    @JvmStatic
    external fun libc_fuchsia_renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int

    @JvmStatic
    external fun libc_fuchsia_symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int

    @JvmStatic
    external fun libc_fuchsia_unlinkat(dirfd: Int, pathname: String?, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_access(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_alarm(seconds: Int): Int

    @JvmStatic
    external fun libc_fuchsia_chdir(dir: String?): Int

    @JvmStatic
    external fun libc_fuchsia_chown(path: String?, uid: Int, gid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_lchown(path: String?, uid: Int, gid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_close(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_dup(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_dup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libc_fuchsia_execv(prog: String?, argv: Long): Int

    @JvmStatic
    external fun libc_fuchsia_execve(prog: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_execvp(c: String?, argv: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fork(): Int

    @JvmStatic
    external fun libc_fuchsia_fpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libc_fuchsia_getcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libc_fuchsia_getegid(): Int

    @JvmStatic
    external fun libc_fuchsia_geteuid(): Int

    @JvmStatic
    external fun libc_fuchsia_getgid(): Int

    @JvmStatic
    external fun libc_fuchsia_getgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getlogin(): Long

    @JvmStatic
    external fun libc_fuchsia_getopt(argc: Int, argv: Long, optstr: String?): Int

    @JvmStatic
    external fun libc_fuchsia_getpgid(pid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_getpgrp(): Int

    @JvmStatic
    external fun libc_fuchsia_getpid(): Int

    @JvmStatic
    external fun libc_fuchsia_getppid(): Int

    @JvmStatic
    external fun libc_fuchsia_getuid(): Int

    @JvmStatic
    external fun libc_fuchsia_isatty(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_link(src: String?, dst: String?): Int

    @JvmStatic
    external fun libc_fuchsia_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_fuchsia_pathconf(path: String?, name: Int): Long

    @JvmStatic
    external fun libc_fuchsia_pause(): Int

    @JvmStatic
    external fun libc_fuchsia_pipe(fds: Long): Int

    @JvmStatic
    external fun libc_fuchsia_posixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libc_fuchsia_read(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_fuchsia_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_fuchsia_seteuid(uid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setegid(gid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setgid(gid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setsid(): Int

    @JvmStatic
    external fun libc_fuchsia_setuid(uid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sleep(secs: Int): Int

    @JvmStatic
    external fun libc_fuchsia_nanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_tcgetpgrp(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tcsetpgrp(fd: Int, pgrp: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ttyname(fd: Int): Long

    @JvmStatic
    external fun libc_fuchsia_unlink(c: String?): Int

    @JvmStatic
    external fun libc_fuchsia_wait(status: Long): Int

    @JvmStatic
    external fun libc_fuchsia_waitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libc_fuchsia_write(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_fuchsia_pread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_fuchsia_pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_fuchsia_umask(mask: Int): Int

    @JvmStatic
    external fun libc_fuchsia_utime(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_kill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_mlockall(flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_munlockall(): Int

    @JvmStatic
    external fun libc_fuchsia_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_fuchsia_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_ifNametoindex(ifname: String?): Int

    @JvmStatic
    external fun libc_fuchsia_ifIndextoname(ifindex: Int, ifname: Long): Long

    @JvmStatic
    external fun libc_fuchsia_lstat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fsync(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setenv(name: String?, value: String?, overwrite: Int): Int

    @JvmStatic
    external fun libc_fuchsia_unsetenv(name: String?): Int

    @JvmStatic
    external fun libc_fuchsia_symlink(path1: String?, path2: String?): Int

    @JvmStatic
    external fun libc_fuchsia_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_fuchsia_signal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libc_fuchsia_realpath(pathname: String?, resolved: Long): Long

    @JvmStatic
    external fun libc_fuchsia_flock(fd: Int, operation: Int): Int

    @JvmStatic
    external fun libc_fuchsia_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_fuchsia_times(buf: Long): Long

    @JvmStatic
    external fun libc_fuchsia_pthreadSelf(): Long

    @JvmStatic
    external fun libc_fuchsia_pthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadExit(value: Long)

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedYield(): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libc_fuchsia_pthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadSetnameNp(thread: Long, name: String?): Int

    @JvmStatic
    external fun libc_fuchsia_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_raise(signum: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libc_fuchsia_utimes(filename: String?, times: Long): Int

    @JvmStatic
    external fun libc_fuchsia_dlopen(filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_fuchsia_dlerror(): Long

    @JvmStatic
    external fun libc_fuchsia_dlsym(handle: Long, symbol: String?): Long

    @JvmStatic
    external fun libc_fuchsia_dlclose(handle: Long): Int

    @JvmStatic
    external fun libc_fuchsia_dladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int

    @JvmStatic
    external fun libc_fuchsia_freeaddrinfo(res: Long)

    @JvmStatic
    external fun libc_fuchsia_gaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libc_fuchsia_resInit(): Int

    @JvmStatic
    external fun libc_fuchsia_gmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_fuchsia_localtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libc_fuchsia_mktime(tm: Long): Long

    @JvmStatic
    external fun libc_fuchsia_time(time: Long): Long

    @JvmStatic
    external fun libc_fuchsia_gmtime(timeP: Long): Long

    @JvmStatic
    external fun libc_fuchsia_localtime(timeP: Long): Long

    @JvmStatic
    external fun libc_fuchsia_mknod(pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_fuchsia_uname(buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_gethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getservbyname(name: String?, proto: String?): Long

    @JvmStatic
    external fun libc_fuchsia_getprotobyname(name: String?): Long

    @JvmStatic
    external fun libc_fuchsia_getprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libc_fuchsia_usleep(secs: Int): Int

    @JvmStatic
    external fun libc_fuchsia_send(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_recv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_putenv(string: Long): Int

    @JvmStatic
    external fun libc_fuchsia_poll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libc_fuchsia_select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setlocale(category: Int, locale: String?): Long

    @JvmStatic
    external fun libc_fuchsia_localeconv(): Long

    @JvmStatic
    external fun libc_fuchsia_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semWait(sem: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semTrywait(sem: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semPost(sem: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_fuchsia_statvfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fstatvfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_readlink(path: String?, buf: Long, bufsz: Long): Long

    @JvmStatic
    external fun libc_fuchsia_sigemptyset(set: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sigfillset(set: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigpending(set: Long): Int

    @JvmStatic
    external fun libc_fuchsia_timegm(tm: Long): Long

    @JvmStatic
    external fun libc_fuchsia_getsid(pid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sysconf(name: Int): Long

    @JvmStatic
    external fun libc_fuchsia_mkfifo(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ftello(stream: Long): Long

    @JvmStatic
    external fun libc_fuchsia_tcdrain(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_cfgetispeed(termios: Long): Int

    @JvmStatic
    external fun libc_fuchsia_cfgetospeed(termios: Long): Int

    @JvmStatic
    external fun libc_fuchsia_cfmakeraw(termios: Long)

    @JvmStatic
    external fun libc_fuchsia_cfsetispeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libc_fuchsia_cfsetospeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libc_fuchsia_cfsetspeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libc_fuchsia_tcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libc_fuchsia_tcflow(fd: Int, action: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tcgetsid(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mkstemp(template: Long): Int

    @JvmStatic
    external fun libc_fuchsia_mkdtemp(template: Long): Long

    @JvmStatic
    external fun libc_fuchsia_tmpnam(ptr: Long): Long

    @JvmStatic
    external fun libc_fuchsia_openlog(ident: String?, logopt: Int, facility: Int)

    @JvmStatic
    external fun libc_fuchsia_closelog()

    @JvmStatic
    external fun libc_fuchsia_setlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libc_fuchsia_grantpt(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_posixOpenpt(flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ptsname(fd: Int): Long

    @JvmStatic
    external fun libc_fuchsia_unlockpt(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_fuchsia_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_fuchsia_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_fuchsia_setgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_fuchsia_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_fuchsia_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_fuchsia_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_fuchsia_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_fuchsia_freelocale(loc: Long)

    @JvmStatic
    external fun libc_fuchsia_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_fuchsia_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_fuchsia_fdopendir(fd: Int): Long

    @JvmStatic
    external fun libc_fuchsia_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_fuchsia_accept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_fuchsia_clearenv(): Int

    @JvmStatic
    external fun libc_fuchsia_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setreuid(ruid: Int, euid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setregid(rgid: Int, egid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_fuchsia_acct(filename: String?): Int

    @JvmStatic
    external fun libc_fuchsia_brk(addr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setpwent()

    @JvmStatic
    external fun libc_fuchsia_endpwent()

    @JvmStatic
    external fun libc_fuchsia_getpwent(): Long

    @JvmStatic
    external fun libc_fuchsia_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_shmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_fuchsia_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_fuchsia_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_fuchsia_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_ftok(pathname: String?, projId: Int): Int

    @JvmStatic
    external fun libc_fuchsia_semget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libc_fuchsia_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_fuchsia_msgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_fuchsia_msgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libc_fuchsia_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_fuchsia_msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_fuchsia_errnoLocation(): Long

    @JvmStatic
    external fun libc_fuchsia_fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_readahead(fd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_fuchsia_signalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_timerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_timerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_fuchsia_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_fuchsia_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_fuchsia_quotactl(cmd: Int, special: String?, id: Int, data: Long): Int

    @JvmStatic
    external fun libc_fuchsia_dup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_fuchsia_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_fuchsia_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_reboot(howTo: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setfsgid(gid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_setfsuid(uid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_fuchsia_ifNameindex(): Long

    @JvmStatic
    external fun libc_fuchsia_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_fuchsia_syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_fuchsia_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_fuchsia_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_fuchsia_globfree(pglob: Long)

    @JvmStatic
    external fun libc_fuchsia_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_fuchsia_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_fuchsia_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_fuchsia_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_fuchsia_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_fuchsia_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_fuchsia_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_fuchsia_futimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_fuchsia_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_fuchsia_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_fuchsia_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_fuchsia_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_fuchsia_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_setdomainname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_vhangup(): Int

    @JvmStatic
    external fun libc_fuchsia_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sync()

    @JvmStatic
    external fun libc_fuchsia_schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_fuchsia_umount(target: String?): Int

    @JvmStatic
    external fun libc_fuchsia_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_fuchsia_tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_fuchsia_splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_eventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_fuchsia_swapoff(puath: String?): Int

    @JvmStatic
    external fun libc_fuchsia_vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libc_fuchsia_mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int

    @JvmStatic
    external fun libc_fuchsia_personality(persona: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_fuchsia_ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_fuchsia_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_fuchsia_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_fuchsia_umount2(target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_swapon(path: String?, swapflags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_fuchsia_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getdtablesize(): Int

    @JvmStatic
    external fun libc_fuchsia_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_fuchsia_initgroups(user: String?, group: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_fuchsia_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_fuchsia_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_fuchsia_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_fuchsia_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_fuchsia_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_fuchsia_getgrgid(gid: Int): Long

    @JvmStatic
    external fun libc_fuchsia_setgrent()

    @JvmStatic
    external fun libc_fuchsia_endgrent()

    @JvmStatic
    external fun libc_fuchsia_getgrent(): Long

    @JvmStatic
    external fun libc_fuchsia_getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_fuchsia_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_fuchsia_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_fuchsia_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_fuchsia_dlIteratePhdr(callback: Long, data: Long): Int
}

public actual fun isalnum(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isgraph(c)

public actual fun islower(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_islower(c)

public actual fun isprint(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isspace(c)

public actual fun isupper(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isblank(c)

public actual fun tolower(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_tolower(c)

public actual fun toupper(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    FuchsiaJniBridge.libc_fuchsia_fopen(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    FuchsiaJniBridge.libc_fuchsia_freopen(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fflush(file: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fflush((file?.handle ?: 0L))

public actual fun fclose(file: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fclose((file?.handle ?: 0L))

public actual fun remove(filename: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    FuchsiaJniBridge.libc_fuchsia_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_setbuf((stream?.handle ?: 0L), (buf?.value ?: 0L))
}

public actual fun getchar(): CInt =
    FuchsiaJniBridge.libc_fuchsia_getchar()

public actual fun putchar(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fgetc((stream?.handle ?: 0L))

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_fgets((buf?.value ?: 0L), n, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fputc(c, (stream?.handle ?: 0L))

public actual fun fputs(s: String?, stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fputs(s, (stream?.handle ?: 0L))

public actual fun puts(s: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_ungetc(c, (stream?.handle ?: 0L))

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_fread((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_fwrite((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fseek((stream?.handle ?: 0L), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    FuchsiaJniBridge.libc_fuchsia_ftell((stream?.handle ?: 0L))

public actual fun rewind(stream: FILE?) {
    FuchsiaJniBridge.libc_fuchsia_rewind((stream?.handle ?: 0L))
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fgetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fsetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun feof(stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_feof((stream?.handle ?: 0L))

public actual fun ferror(stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_ferror((stream?.handle ?: 0L))

public actual fun perror(s: String?) {
    FuchsiaJniBridge.libc_fuchsia_perror(s)
}

public actual fun atof(s: String?): CDouble =
    FuchsiaJniBridge.libc_fuchsia_atof(s)

public actual fun atoi(s: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_atoi(s)

public actual fun atol(s: String?): CLong =
    FuchsiaJniBridge.libc_fuchsia_atol(s)

public actual fun atoll(s: String?): CLonglong =
    FuchsiaJniBridge.libc_fuchsia_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    FuchsiaJniBridge.libc_fuchsia_strtod(s, (endp?.value ?: 0L))

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    FuchsiaJniBridge.libc_fuchsia_strtof(s, (endp?.value ?: 0L))

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    FuchsiaJniBridge.libc_fuchsia_strtol(s, (endp?.value ?: 0L), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    FuchsiaJniBridge.libc_fuchsia_strtoll(s, (endp?.value ?: 0L), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    FuchsiaJniBridge.libc_fuchsia_strtoul(s, (endp?.value ?: 0L), base).toULong()

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    FuchsiaJniBridge.libc_fuchsia_strtoull(s, (endp?.value ?: 0L), base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_free((p?.value ?: 0L))
}

public actual fun abort(): Nothing {
    FuchsiaJniBridge.libc_fuchsia_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    FuchsiaJniBridge.libc_fuchsia_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    FuchsiaJniBridge.libc_fuchsia_atexit(0L)

public actual fun system(s: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strcat((s?.value ?: 0L), ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strncat((s?.value ?: 0L), ct, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_strncmp(cs, ct, n.toLong())

public actual fun strcoll(cs: String?, ct: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_strspn(cs, ct).toULong()

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_strcspn(cs, ct).toULong()

public actual fun strdup(cs: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_strlen(cs).toULong()

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    FuchsiaJniBridge.libc_fuchsia_strnlen(cs, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_strtok((s?.value ?: 0L), t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    FuchsiaJniBridge.libc_fuchsia_strxfrm((s?.value ?: 0L), ct, n.toLong()).toULong()

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    FuchsiaJniBridge.libc_fuchsia_wcslen((buf?.value ?: 0L)).toULong()

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    FuchsiaJniBridge.libc_fuchsia_wcstombs((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).toULong()

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_wmemchr((cx?.value ?: 0L), c.toInt(), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_abs(i)

public actual fun labs(i: CLong): CLong =
    FuchsiaJniBridge.libc_fuchsia_labs(i)

public actual fun rand(): CInt =
    FuchsiaJniBridge.libc_fuchsia_rand()

public actual fun srand(seed: CUint) {
    FuchsiaJniBridge.libc_fuchsia_srand(seed.toInt())
}

public actual fun getpwnam(name: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getpwnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getpwuid(uid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    FuchsiaJniBridge.libc_fuchsia_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    FuchsiaJniBridge.libc_fuchsia_connect(socket, (address?.value ?: 0L), len.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_listen(socket, backlog)

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_accept(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getpeername(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getsockname(socket, (address?.value ?: 0L), (addressLen?.value ?: 0L))

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setsockopt(socket, level, name, (value?.value ?: 0L), optionLen.toInt())

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_socketpair(domain, type, protocol, (socketVector?.value ?: 0L))

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_sendto(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), addrlen.toInt())

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_chmod(path, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_fchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fstat(fildes, (buf?.value ?: 0L))

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkdir(path, mode.toInt())

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_stat(path, (buf?.value ?: 0L))

public actual fun pclose(stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pclose((stream?.handle ?: 0L))

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    FuchsiaJniBridge.libc_fuchsia_fdopen(fd, mode).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(stream: FILE?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fileno((stream?.handle ?: 0L))

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_creat(path, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    FuchsiaJniBridge.libc_fuchsia_opendir(dirname).let { if (it == 0L) null else DIR(it) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_readdir((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_readdirR((dirp?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun closedir(dirp: DIR?): CInt =
    FuchsiaJniBridge.libc_fuchsia_closedir((dirp?.handle ?: 0L))

public actual fun rewinddir(dirp: DIR?) {
    FuchsiaJniBridge.libc_fuchsia_rewinddir((dirp?.handle ?: 0L))
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fchmodat(dirfd, pathname, mode.toInt(), flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_fchown(fd, owner.toInt(), group.toInt())

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fstatat(dirfd, pathname, (buf?.value ?: 0L), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkdirat(dirfd, pathname, mode.toInt())

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_readlinkat(dirfd, pathname, (buf?.value ?: 0L), bufsiz.toLong())

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    FuchsiaJniBridge.libc_fuchsia_alarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_chdir(dir)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_chown(path, uid.toInt(), gid.toInt())

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_lchown(path, uid.toInt(), gid.toInt())

public actual fun close(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_close(fd)

public actual fun dup(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_execv(prog, (argv?.value ?: 0L))

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_execve(prog, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_execvp(c, (argv?.value ?: 0L))

public actual fun fork(): PidT =
    FuchsiaJniBridge.libc_fuchsia_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    FuchsiaJniBridge.libc_fuchsia_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getcwd((buf?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getegid(): GidT =
    FuchsiaJniBridge.libc_fuchsia_getegid().toUInt()

public actual fun geteuid(): UidT =
    FuchsiaJniBridge.libc_fuchsia_geteuid().toUInt()

public actual fun getgid(): GidT =
    FuchsiaJniBridge.libc_fuchsia_getgid().toUInt()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getgroups(ngroupsMax, (groups?.value ?: 0L))

public actual fun getlogin(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getopt(argc, (argv?.value ?: 0L), optstr)

public actual fun getpgid(pid: PidT): PidT =
    FuchsiaJniBridge.libc_fuchsia_getpgid(pid)

public actual fun getpgrp(): PidT =
    FuchsiaJniBridge.libc_fuchsia_getpgrp()

public actual fun getpid(): PidT =
    FuchsiaJniBridge.libc_fuchsia_getpid()

public actual fun getppid(): PidT =
    FuchsiaJniBridge.libc_fuchsia_getppid()

public actual fun getuid(): UidT =
    FuchsiaJniBridge.libc_fuchsia_getuid().toUInt()

public actual fun isatty(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    FuchsiaJniBridge.libc_fuchsia_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    FuchsiaJniBridge.libc_fuchsia_pathconf(path, name)

public actual fun pause(): CInt =
    FuchsiaJniBridge.libc_fuchsia_pause()

public actual fun pipe(fds: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pipe((fds?.value ?: 0L))

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_posixMemalign((memptr?.value ?: 0L), align.toLong(), size.toLong())

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_read(fd, (buf?.value ?: 0L), count.toLong())

public actual fun rmdir(path: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_seteuid(uid.toInt())

public actual fun setegid(gid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setegid(gid.toInt())

public actual fun setgid(gid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setgid(gid.toInt())

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    FuchsiaJniBridge.libc_fuchsia_setsid()

public actual fun setuid(uid: UidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setuid(uid.toInt())

public actual fun sleep(secs: CUint): CUint =
    FuchsiaJniBridge.libc_fuchsia_sleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_nanosleep((rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun tcgetpgrp(fd: CInt): PidT =
    FuchsiaJniBridge.libc_fuchsia_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlink(c: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_unlink(c)

public actual fun wait(status: COpaquePointer?): PidT =
    FuchsiaJniBridge.libc_fuchsia_wait((status?.value ?: 0L))

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    FuchsiaJniBridge.libc_fuchsia_waitpid(pid, (status?.value ?: 0L), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_write(fd, (buf?.value ?: 0L), count.toLong())

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_pread(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_pwrite(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun umask(mask: ModeT): ModeT =
    FuchsiaJniBridge.libc_fuchsia_umask(mask.toInt()).toUInt()

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_utime(file, (buf?.value ?: 0L))

public actual fun kill(pid: PidT, sig: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_kill(pid, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mlock((addr?.value ?: 0L), len.toLong())

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_munlock((addr?.value ?: 0L), len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_mlockall(flags)

public actual fun munlockall(): CInt =
    FuchsiaJniBridge.libc_fuchsia_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_munmap((addr?.value ?: 0L), len.toLong())

public actual fun ifNametoindex(ifname: String?): CUint =
    FuchsiaJniBridge.libc_fuchsia_ifNametoindex(ifname).toUInt()

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_lstat(path, (buf?.value ?: 0L))

public actual fun fsync(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_symlink(path1, path2)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    FuchsiaJniBridge.libc_fuchsia_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    FuchsiaJniBridge.libc_fuchsia_signal(signum, handler.toLong()).toULong()

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_realpath(pathname, (resolved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun flock(fd: CInt, operation: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_flock(fd, operation)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun times(buf: COpaquePointer?): ClockT =
    FuchsiaJniBridge.libc_fuchsia_times((buf?.value ?: 0L))

public actual fun pthreadSelf(): PthreadT =
    FuchsiaJniBridge.libc_fuchsia_pthreadSelf().toULong()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadJoin(native.toLong(), (value?.value ?: 0L))

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    FuchsiaJniBridge.libc_fuchsia_pthreadExit((value?.value ?: 0L))
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrDestroy((attr?.value ?: 0L))

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrGetstacksize((attr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrSetstacksize((attr?.value ?: 0L), stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrSetdetachstate((attr?.value ?: 0L), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadDetach(thread.toLong())

public actual fun schedYield(): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_pthreadGetspecific(key.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadSetspecific(key.toInt(), (value?.value ?: 0L))

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexDestroy((lock?.value ?: 0L))

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexLock((lock?.value ?: 0L))

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexTrylock((lock?.value ?: 0L))

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexUnlock((lock?.value ?: 0L))

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexattrSettype((attr?.value ?: 0L), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondWait((cond?.value ?: 0L), (lock?.value ?: 0L))

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondTimedwait((cond?.value ?: 0L), (lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondattrInit((attr?.value ?: 0L))

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondattrDestroy((attr?.value ?: 0L))

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockDestroy((lock?.value ?: 0L))

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockRdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockTryrdlock((lock?.value ?: 0L))

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockWrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockTrywrlock((lock?.value ?: 0L))

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockUnlock((lock?.value ?: 0L))

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockattrInit((attr?.value ?: 0L))

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadRwlockattrDestroy((attr?.value ?: 0L))

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadSetnameNp(thread.toLong(), name)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getsockopt(sockfd, level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun raise(signum: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_raise(signum)

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigaction(signum, (act?.value ?: 0L), (oldact?.value ?: 0L))

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_utimes(filename, (times?.value ?: 0L))

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_dlsym((handle?.value ?: 0L), symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_dlclose((handle?.value ?: 0L))

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_dladdr((addr?.value ?: 0L), (info?.value ?: 0L))

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getaddrinfo(node, service, (hints?.value ?: 0L), (res?.value ?: 0L))

public actual fun freeaddrinfo(res: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_freeaddrinfo((res?.value ?: 0L))
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resInit(): CInt =
    FuchsiaJniBridge.libc_fuchsia_resInit()

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_gmtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_localtimeR((timeP?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    FuchsiaJniBridge.libc_fuchsia_mktime((tm?.value ?: 0L))

public actual fun time(time: COpaquePointer?): TimeT =
    FuchsiaJniBridge.libc_fuchsia_time((time?.value ?: 0L))

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_gmtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_localtime((timeP?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mknod(pathname, mode.toInt(), dev.toLong())

public actual fun uname(buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_uname((buf?.value ?: 0L))

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_gethostname((name?.value ?: 0L), len.toLong())

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getservbyname(name, proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprotobyname(name: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getprotobyname(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getprotobynumber(proto).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usleep(secs: CUint): CInt =
    FuchsiaJniBridge.libc_fuchsia_usleep(secs.toInt())

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_send(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_recv(socket, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_putenv((string?.value ?: 0L))

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_poll((fds?.value ?: 0L), nfds.toLong(), timeout)

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_select(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (errorfds?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_localeconv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semDestroy((sem?.value ?: 0L))

public actual fun semWait(sem: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semWait((sem?.value ?: 0L))

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semTrywait((sem?.value ?: 0L))

public actual fun semPost(sem: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semPost((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    FuchsiaJniBridge.libc_fuchsia_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_statvfs(path, (buf?.value ?: 0L))

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fstatvfs(fd, (buf?.value ?: 0L))

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_readlink(path, (buf?.value ?: 0L), bufsz.toLong())

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigemptyset((set?.value ?: 0L))

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigaddset((set?.value ?: 0L), signum)

public actual fun sigfillset(set: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigfillset((set?.value ?: 0L))

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigdelset((set?.value ?: 0L), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigismember((set?.value ?: 0L), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigprocmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun sigpending(set: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigpending((set?.value ?: 0L))

public actual fun timegm(tm: COpaquePointer?): TimeT =
    FuchsiaJniBridge.libc_fuchsia_timegm((tm?.value ?: 0L))

public actual fun getsid(pid: PidT): PidT =
    FuchsiaJniBridge.libc_fuchsia_getsid(pid)

public actual fun sysconf(name: CInt): CLong =
    FuchsiaJniBridge.libc_fuchsia_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkfifo(path, mode.toInt())

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pselect(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (errorfds?.value ?: 0L), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fseeko((stream?.handle ?: 0L), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    FuchsiaJniBridge.libc_fuchsia_ftello((stream?.handle ?: 0L))

public actual fun tcdrain(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcdrain(fd)

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    FuchsiaJniBridge.libc_fuchsia_cfgetispeed((termios?.value ?: 0L)).toUInt()

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    FuchsiaJniBridge.libc_fuchsia_cfgetospeed((termios?.value ?: 0L)).toUInt()

public actual fun cfmakeraw(termios: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_cfmakeraw((termios?.value ?: 0L))
}

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    FuchsiaJniBridge.libc_fuchsia_cfsetispeed((termios?.value ?: 0L), speed.toInt())

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    FuchsiaJniBridge.libc_fuchsia_cfsetospeed((termios?.value ?: 0L), speed.toInt())

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    FuchsiaJniBridge.libc_fuchsia_cfsetspeed((termios?.value ?: 0L), speed.toInt())

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcgetattr(fd, (termios?.value ?: 0L))

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcsetattr(fd, optionalActions, (termios?.value ?: 0L))

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    FuchsiaJniBridge.libc_fuchsia_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkstemp((template?.value ?: 0L))

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_mkdtemp((template?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_tmpnam((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    FuchsiaJniBridge.libc_fuchsia_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    FuchsiaJniBridge.libc_fuchsia_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
}

public actual fun grantpt(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_ptsname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlockpt(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_unlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_fdatasync(fd)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun dirfd(dirp: DIR?): CInt =
    FuchsiaJniBridge.libc_fuchsia_dirfd((dirp?.handle ?: 0L))

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadGetattrNp(native.toLong(), (attr?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_setgroups(ngroups.toLong(), (ptr?.value ?: 0L))

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_pipe2((fds?.value ?: 0L), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fstatfs(fd, (buf?.value ?: 0L))

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    FuchsiaJniBridge.libc_fuchsia_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT) {
    FuchsiaJniBridge.libc_fuchsia_freelocale((loc?.value ?: 0L))
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    FuchsiaJniBridge.libc_fuchsia_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    FuchsiaJniBridge.libc_fuchsia_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fdopendir(fd: CInt): DIR? =
    FuchsiaJniBridge.libc_fuchsia_fdopendir(fd).let { if (it == 0L) null else DIR(it) }

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mknodat(dirfd, pathname, mode.toInt(), dev.toLong())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_accept4(fd, (addr?.value ?: 0L), (len?.value ?: 0L), flg)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun clearenv(): CInt =
    FuchsiaJniBridge.libc_fuchsia_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L), options)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setreuid(ruid.toInt(), euid.toInt())

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setregid(rgid.toInt(), egid.toInt())

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun acct(filename: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_brk((addr?.value ?: 0L))

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_lutimes(file, (times?.value ?: 0L))

public actual fun setpwent() {
    FuchsiaJniBridge.libc_fuchsia_setpwent()
}

public actual fun endpwent() {
    FuchsiaJniBridge.libc_fuchsia_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_shmOpen(name, oflag, mode.toInt())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_shmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    FuchsiaJniBridge.libc_fuchsia_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_msgctl(msqid, cmd, (buf?.value ?: 0L))

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_msgsnd(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgflg)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun errnoLocation(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaJniBridge.libc_fuchsia_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaJniBridge.libc_fuchsia_posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_readahead(fd, offset, count.toLong())

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_signalfd(fd, (mask?.value ?: 0L), flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_timerfdGettime(fd, (currValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_quotactl(cmd, special, id, (data?.value ?: 0L))

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_dup3(oldfd, newfd, flags)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_nlLanginfoL(item, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun reboot(howTo: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setfsgid(gid.toInt())

public actual fun setfsuid(uid: UidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setfsuid(uid.toInt())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun ifNameindex(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    FuchsiaJniBridge.libc_fuchsia_syncFileRange(fd, offset, nbytes, flags.toInt())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    FuchsiaJniBridge.libc_fuchsia_globfree((pglob?.value ?: 0L))
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun shmUnlink(name: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    FuchsiaJniBridge.libc_fuchsia_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    FuchsiaJniBridge.libc_fuchsia_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_futimes(fd, (times?.value ?: 0L))

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    FuchsiaJniBridge.libc_fuchsia_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_setdomainname(name, len.toLong())

public actual fun vhangup(): CInt =
    FuchsiaJniBridge.libc_fuchsia_vhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags, (timeout?.value ?: 0L))

public actual fun sync() {
    FuchsiaJniBridge.libc_fuchsia_sync()
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    0L

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedGetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedSetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun umount(target: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_tee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_splice(fdIn, (offIn?.value ?: 0L), fdOut, (offOut?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_eventfd(initval.toInt(), flags)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedSetparam(pid, (param?.value ?: 0L))

public actual fun swapoff(puath: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    FuchsiaJniBridge.libc_fuchsia_vmsplice(fd, (iov?.value ?: 0L), nrSegs.toLong(), flags.toInt())

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_mount(src, target, fstype, flags.toLong(), (data?.value ?: 0L))

public actual fun personality(persona: CUlong): CInt =
    FuchsiaJniBridge.libc_fuchsia_personality(persona.toLong())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedGetparam(pid, (param?.value ?: 0L))

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_ppoll((fds?.value ?: 0L), nfds.toLong(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    FuchsiaJniBridge.libc_fuchsia_sethostname(name, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedGetPriorityMin(policy)

public actual fun umount2(target: String?, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigsuspend((mask?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getgrgidR(gid.toInt(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    FuchsiaJniBridge.libc_fuchsia_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun initgroups(user: String?, group: GidT): CInt =
    FuchsiaJniBridge.libc_fuchsia_initgroups(user, group.toInt())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: String?): CInt =
    FuchsiaJniBridge.libc_fuchsia_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getpwuidR(uid.toInt(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getgrgid(gid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    FuchsiaJniBridge.libc_fuchsia_setgrent()
}

public actual fun endgrent() {
    FuchsiaJniBridge.libc_fuchsia_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    FuchsiaJniBridge.libc_fuchsia_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_getgrouplist(user, group.toInt(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun popen(command: String?, mode: String?): FILE? =
    FuchsiaJniBridge.libc_fuchsia_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    FuchsiaJniBridge.libc_fuchsia_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    FuchsiaJniBridge.libc_fuchsia_dlIteratePhdr(0L, (data?.value ?: 0L))
