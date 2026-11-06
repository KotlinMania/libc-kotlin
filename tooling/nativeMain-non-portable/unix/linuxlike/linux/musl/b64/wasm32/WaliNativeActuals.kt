@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_read(a1, a2, a3)

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_write(a1, a2, a3)

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_open(a1, a2, a3)

public actual fun syscallSysClose(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_close(a1)

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_stat(a1, a2)

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fstat(a1, a2)

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_lstat(a1, a2)

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_poll(a1, a2, a3)

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_lseek(a1, a2, a3)

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_mmap(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_mprotect(a1, a2, a3)

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_munmap(a1, a2)

public actual fun syscallSysBrk(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_brk(a1)

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rt_sigaction(a1, a2, a3, a4)

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rt_sigprocmask(a1, a2, a3, a4)

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rt_sigreturn(a1)

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_ioctl(a1, a2, a3)

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_pread64(a1, a2, a3, a4)

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_pwrite64(a1, a2, a3, a4)

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_readv(a1, a2, a3)

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_writev(a1, a2, a3)

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_access(a1, a2)

public actual fun syscallSysPipe(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_pipe(a1)

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_select(a1, a2, a3, a4, a5)

public actual fun syscallSysSchedYield(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sched_yield()

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_mremap(a1, a2, a3, a4, a5)

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_msync(a1, a2, a3)

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_madvise(a1, a2, a3)

public actual fun syscallSysDup(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_dup(a1)

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_dup2(a1, a2)

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_nanosleep(a1, a2)

public actual fun syscallSysAlarm(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_alarm(a1)

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setitimer(a1, a2, a3)

public actual fun syscallSysGetpid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getpid()

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_socket(a1, a2, a3)

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_connect(a1, a2, a3)

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_accept(a1, a2, a3)

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sendto(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_recvfrom(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sendmsg(a1, a2, a3)

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_recvmsg(a1, a2, a3)

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_shutdown(a1, a2)

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_bind(a1, a2, a3)

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_listen(a1, a2)

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getsockname(a1, a2, a3)

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getpeername(a1, a2, a3)

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_socketpair(a1, a2, a3, a4)

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysFork(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fork()

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_execve(a1, a2, a3)

public actual fun syscallSysExit(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_exit(a1)

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_wait4(a1, a2, a3, a4)

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_kill(a1, a2)

public actual fun syscallSysUname(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_uname(a1)

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fcntl(a1, a2, a3)

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_flock(a1, a2)

public actual fun syscallSysFsync(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fsync(a1)

public actual fun syscallSysFdatasync(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fdatasync(a1)

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_ftruncate(a1, a2)

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getdents(a1, a2, a3)

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getcwd(a1, a2)

public actual fun syscallSysChdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_chdir(a1)

public actual fun syscallSysFchdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fchdir(a1)

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rename(a1, a2)

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_mkdir(a1, a2)

public actual fun syscallSysRmdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rmdir(a1)

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_link(a1, a2)

public actual fun syscallSysUnlink(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_unlink(a1)

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_symlink(a1, a2)

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_readlink(a1, a2, a3)

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_chmod(a1, a2)

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fchmod(a1, a2)

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_chown(a1, a2, a3)

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fchown(a1, a2, a3)

public actual fun syscallSysUmask(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_umask(a1)

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getrlimit(a1, a2)

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getrusage(a1, a2)

public actual fun syscallSysSysinfo(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sysinfo(a1)

public actual fun syscallSysGetuid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getuid()

public actual fun syscallSysGetgid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getgid()

public actual fun syscallSysSetuid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setuid(a1)

public actual fun syscallSysSetgid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setgid(a1)

public actual fun syscallSysGeteuid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_geteuid()

public actual fun syscallSysGetegid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getegid()

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setpgid(a1, a2)

public actual fun syscallSysGetppid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getppid()

public actual fun syscallSysSetsid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setsid()

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setreuid(a1, a2)

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setregid(a1, a2)

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getgroups(a1, a2)

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setgroups(a1, a2)

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setresuid(a1, a2, a3)

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setresgid(a1, a2, a3)

public actual fun syscallSysGetpgid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getpgid(a1)

public actual fun syscallSysGetsid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getsid(a1)

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rt_sigpending(a1, a2)

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_rt_sigsuspend(a1, a2)

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sigaltstack(a1, a2)

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_utime(a1, a2)

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_statfs(a1, a2)

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fstatfs(a1, a2)

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_prctl(a1, a2, a3, a4, a5)

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_setrlimit(a1, a2)

public actual fun syscallSysChroot(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_chroot(a1)

public actual fun syscallSysGettid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_gettid()

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_tkill(a1, a2)

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_futex(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_sched_getaffinity(a1, a2, a3)

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getdents64(a1, a2, a3)

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_set_tid_address(a1)

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fadvise(a1, a2, a3, a4)

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_clock_gettime(a1, a2)

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_clock_getres(a1, a2)

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_clock_nanosleep(a1, a2, a3, a4)

public actual fun syscallSysExitGroup(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_exit_group(a1)

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_epoll_ctl(a1, a2, a3, a4)

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_openat(a1, a2, a3, a4)

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_mkdirat(a1, a2, a3)

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fchownat(a1, a2, a3, a4, a5)

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fstatat(a1, a2, a3, a4)

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_unlinkat(a1, a2, a3)

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_linkat(a1, a2, a3, a4, a5)

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_symlinkat(a1, a2, a3)

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_readlinkat(a1, a2, a3, a4)

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_fchmodat(a1, a2, a3, a4)

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_faccessat(a1, a2, a3, a4)

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_pselect6(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_ppoll(a1, a2, a3, a4, a5)

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_utimensat(a1, a2, a3, a4)

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_epoll_pwait(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysEventfd(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_eventfd(a1)

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_accept4(a1, a2, a3, a4)

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_eventfd2(a1, a2)

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_epoll_create1(a1)

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_dup3(a1, a2, a3)

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_pipe2(a1, a2)

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_prlimit64(a1, a2, a3, a4)

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_renameat2(a1, a2, a3, a4, a5)

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_getrandom(a1, a2, a3)

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_statx(a1, a2, a3, a4, a5)

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.cinterop.libc_wali_syscall_sys_faccessat2(a1, a2, a3, a4)
