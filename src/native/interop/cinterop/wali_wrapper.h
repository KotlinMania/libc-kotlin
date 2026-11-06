#ifndef LIBC_WALI_WALI_WRAPPER_H
#define LIBC_WALI_WALI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libc_wali_syscall_sys_read(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_wali_syscall_sys_write(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_wali_syscall_sys_open(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_close(int32_t a1);
int64_t libc_wali_syscall_sys_stat(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_fstat(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_lstat(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_poll(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_lseek(int32_t a1, int64_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_mmap(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, int32_t a5, int64_t a6);
int64_t libc_wali_syscall_sys_mprotect(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_munmap(int32_t a1, uint32_t a2);
int64_t libc_wali_syscall_sys_brk(int32_t a1);
int64_t libc_wali_syscall_sys_rt_sigaction(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_wali_syscall_sys_rt_sigprocmask(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_wali_syscall_sys_rt_sigreturn(int64_t a1);
int64_t libc_wali_syscall_sys_ioctl(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_pread64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libc_wali_syscall_sys_pwrite64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libc_wali_syscall_sys_readv(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_writev(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_access(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_pipe(int32_t a1);
int64_t libc_wali_syscall_sys_select(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_sched_yield(void);
int64_t libc_wali_syscall_sys_mremap(int32_t a1, uint32_t a2, uint32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_msync(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_madvise(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_dup(int32_t a1);
int64_t libc_wali_syscall_sys_dup2(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_nanosleep(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_alarm(int32_t a1);
int64_t libc_wali_syscall_sys_setitimer(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_getpid(void);
int64_t libc_wali_syscall_sys_socket(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_connect(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_wali_syscall_sys_accept(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_sendto(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libc_wali_syscall_sys_recvfrom(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_wali_syscall_sys_sendmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_recvmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_shutdown(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_bind(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_wali_syscall_sys_listen(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_getsockname(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_getpeername(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_socketpair(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_setsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libc_wali_syscall_sys_getsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_fork(void);
int64_t libc_wali_syscall_sys_execve(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_exit(int32_t a1);
int64_t libc_wali_syscall_sys_wait4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_kill(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_uname(int32_t a1);
int64_t libc_wali_syscall_sys_fcntl(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_flock(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_fsync(int32_t a1);
int64_t libc_wali_syscall_sys_fdatasync(int32_t a1);
int64_t libc_wali_syscall_sys_ftruncate(int32_t a1, int64_t a2);
int64_t libc_wali_syscall_sys_getdents(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_getcwd(int32_t a1, uint32_t a2);
int64_t libc_wali_syscall_sys_chdir(int32_t a1);
int64_t libc_wali_syscall_sys_fchdir(int32_t a1);
int64_t libc_wali_syscall_sys_rename(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_mkdir(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_rmdir(int32_t a1);
int64_t libc_wali_syscall_sys_link(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_unlink(int32_t a1);
int64_t libc_wali_syscall_sys_symlink(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_readlink(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_wali_syscall_sys_chmod(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_fchmod(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_chown(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_fchown(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_umask(int32_t a1);
int64_t libc_wali_syscall_sys_getrlimit(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_getrusage(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_sysinfo(int32_t a1);
int64_t libc_wali_syscall_sys_getuid(void);
int64_t libc_wali_syscall_sys_getgid(void);
int64_t libc_wali_syscall_sys_setuid(int32_t a1);
int64_t libc_wali_syscall_sys_setgid(int32_t a1);
int64_t libc_wali_syscall_sys_geteuid(void);
int64_t libc_wali_syscall_sys_getegid(void);
int64_t libc_wali_syscall_sys_setpgid(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_getppid(void);
int64_t libc_wali_syscall_sys_setsid(void);
int64_t libc_wali_syscall_sys_setreuid(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_setregid(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_getgroups(uint32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_setgroups(uint32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_setresuid(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_setresgid(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_getpgid(int32_t a1);
int64_t libc_wali_syscall_sys_getsid(int32_t a1);
int64_t libc_wali_syscall_sys_rt_sigpending(int32_t a1, uint32_t a2);
int64_t libc_wali_syscall_sys_rt_sigsuspend(int32_t a1, uint32_t a2);
int64_t libc_wali_syscall_sys_sigaltstack(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_utime(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_statfs(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_fstatfs(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_prctl(int32_t a1, uint64_t a2, uint64_t a3, uint64_t a4, uint64_t a5);
int64_t libc_wali_syscall_sys_setrlimit(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_chroot(int32_t a1);
int64_t libc_wali_syscall_sys_gettid(void);
int64_t libc_wali_syscall_sys_tkill(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_futex(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_wali_syscall_sys_sched_getaffinity(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_getdents64(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_set_tid_address(int32_t a1);
int64_t libc_wali_syscall_sys_fadvise(int32_t a1, int64_t a2, int64_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_clock_gettime(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_clock_getres(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_clock_nanosleep(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_exit_group(int32_t a1);
int64_t libc_wali_syscall_sys_epoll_ctl(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_openat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_mkdirat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_fchownat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_fstatat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_unlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_linkat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_symlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_readlinkat(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_wali_syscall_sys_fchmodat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_faccessat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_pselect6(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_wali_syscall_sys_ppoll(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libc_wali_syscall_sys_utimensat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_epoll_pwait(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libc_wali_syscall_sys_eventfd(int32_t a1);
int64_t libc_wali_syscall_sys_accept4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_eventfd2(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_epoll_create1(int32_t a1);
int64_t libc_wali_syscall_sys_dup3(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_pipe2(int32_t a1, int32_t a2);
int64_t libc_wali_syscall_sys_prlimit64(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_wali_syscall_sys_renameat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_getrandom(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_wali_syscall_sys_statx(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_wali_syscall_sys_faccessat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_WALI_WALI_WRAPPER_H */
