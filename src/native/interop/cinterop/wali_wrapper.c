#include "wali_wrapper.h"
#include <errno.h>

int64_t libc_wali_syscall_sys_read(int32_t a1, int32_t a2, uint32_t a3) {
    return (int64_t)SYS_read(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_write(int32_t a1, int32_t a2, uint32_t a3) {
    return (int64_t)SYS_write(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_open(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_open(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_close(int32_t a1) {
    return (int64_t)SYS_close(a1);
}

int64_t libc_wali_syscall_sys_stat(int32_t a1, int32_t a2) {
    return (int64_t)SYS_stat(a1, a2);
}

int64_t libc_wali_syscall_sys_fstat(int32_t a1, int32_t a2) {
    return (int64_t)SYS_fstat(a1, a2);
}

int64_t libc_wali_syscall_sys_lstat(int32_t a1, int32_t a2) {
    return (int64_t)SYS_lstat(a1, a2);
}

int64_t libc_wali_syscall_sys_poll(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_poll(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_lseek(int32_t a1, int64_t a2, int32_t a3) {
    return (int64_t)SYS_lseek(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_mmap(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, int32_t a5, int64_t a6) {
    return (int64_t)SYS_mmap(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_mprotect(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_mprotect(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_munmap(int32_t a1, uint32_t a2) {
    return (int64_t)SYS_munmap(a1, a2);
}

int64_t libc_wali_syscall_sys_brk(int32_t a1) {
    return (int64_t)SYS_brk(a1);
}

int64_t libc_wali_syscall_sys_rt_sigaction(int32_t a1, int32_t a2, int32_t a3, uint32_t a4) {
    return (int64_t)SYS_rt_sigaction(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_rt_sigprocmask(int32_t a1, int32_t a2, int32_t a3, uint32_t a4) {
    return (int64_t)SYS_rt_sigprocmask(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_rt_sigreturn(int64_t a1) {
    return (int64_t)SYS_rt_sigreturn(a1);
}

int64_t libc_wali_syscall_sys_ioctl(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_ioctl(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_pread64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4) {
    return (int64_t)SYS_pread64(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_pwrite64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4) {
    return (int64_t)SYS_pwrite64(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_readv(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_readv(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_writev(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_writev(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_access(int32_t a1, int32_t a2) {
    return (int64_t)SYS_access(a1, a2);
}

int64_t libc_wali_syscall_sys_pipe(int32_t a1) {
    return (int64_t)SYS_pipe(a1);
}

int64_t libc_wali_syscall_sys_select(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_select(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_sched_yield(void) {
    return (int64_t)SYS_sched_yield();
}

int64_t libc_wali_syscall_sys_mremap(int32_t a1, uint32_t a2, uint32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_mremap(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_msync(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_msync(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_madvise(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_madvise(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_dup(int32_t a1) {
    return (int64_t)SYS_dup(a1);
}

int64_t libc_wali_syscall_sys_dup2(int32_t a1, int32_t a2) {
    return (int64_t)SYS_dup2(a1, a2);
}

int64_t libc_wali_syscall_sys_nanosleep(int32_t a1, int32_t a2) {
    return (int64_t)SYS_nanosleep(a1, a2);
}

int64_t libc_wali_syscall_sys_alarm(int32_t a1) {
    return (int64_t)SYS_alarm(a1);
}

int64_t libc_wali_syscall_sys_setitimer(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_setitimer(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_getpid(void) {
    return (int64_t)SYS_getpid();
}

int64_t libc_wali_syscall_sys_socket(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_socket(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_connect(int32_t a1, int32_t a2, uint32_t a3) {
    return (int64_t)SYS_connect(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_accept(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_accept(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_sendto(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, uint32_t a6) {
    return (int64_t)SYS_sendto(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_recvfrom(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, int32_t a6) {
    return (int64_t)SYS_recvfrom(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_sendmsg(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_sendmsg(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_recvmsg(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_recvmsg(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_shutdown(int32_t a1, int32_t a2) {
    return (int64_t)SYS_shutdown(a1, a2);
}

int64_t libc_wali_syscall_sys_bind(int32_t a1, int32_t a2, uint32_t a3) {
    return (int64_t)SYS_bind(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_listen(int32_t a1, int32_t a2) {
    return (int64_t)SYS_listen(a1, a2);
}

int64_t libc_wali_syscall_sys_getsockname(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_getsockname(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_getpeername(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_getpeername(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_socketpair(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_socketpair(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_setsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, uint32_t a5) {
    return (int64_t)SYS_setsockopt(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_getsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_getsockopt(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_fork(void) {
    return (int64_t)SYS_fork();
}

int64_t libc_wali_syscall_sys_execve(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_execve(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_exit(int32_t a1) {
    return (int64_t)SYS_exit(a1);
}

int64_t libc_wali_syscall_sys_wait4(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_wait4(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_kill(int32_t a1, int32_t a2) {
    return (int64_t)SYS_kill(a1, a2);
}

int64_t libc_wali_syscall_sys_uname(int32_t a1) {
    return (int64_t)SYS_uname(a1);
}

int64_t libc_wali_syscall_sys_fcntl(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_fcntl(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_flock(int32_t a1, int32_t a2) {
    return (int64_t)SYS_flock(a1, a2);
}

int64_t libc_wali_syscall_sys_fsync(int32_t a1) {
    return (int64_t)SYS_fsync(a1);
}

int64_t libc_wali_syscall_sys_fdatasync(int32_t a1) {
    return (int64_t)SYS_fdatasync(a1);
}

int64_t libc_wali_syscall_sys_ftruncate(int32_t a1, int64_t a2) {
    return (int64_t)SYS_ftruncate(a1, a2);
}

int64_t libc_wali_syscall_sys_getdents(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_getdents(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_getcwd(int32_t a1, uint32_t a2) {
    return (int64_t)SYS_getcwd(a1, a2);
}

int64_t libc_wali_syscall_sys_chdir(int32_t a1) {
    return (int64_t)SYS_chdir(a1);
}

int64_t libc_wali_syscall_sys_fchdir(int32_t a1) {
    return (int64_t)SYS_fchdir(a1);
}

int64_t libc_wali_syscall_sys_rename(int32_t a1, int32_t a2) {
    return (int64_t)SYS_rename(a1, a2);
}

int64_t libc_wali_syscall_sys_mkdir(int32_t a1, int32_t a2) {
    return (int64_t)SYS_mkdir(a1, a2);
}

int64_t libc_wali_syscall_sys_rmdir(int32_t a1) {
    return (int64_t)SYS_rmdir(a1);
}

int64_t libc_wali_syscall_sys_link(int32_t a1, int32_t a2) {
    return (int64_t)SYS_link(a1, a2);
}

int64_t libc_wali_syscall_sys_unlink(int32_t a1) {
    return (int64_t)SYS_unlink(a1);
}

int64_t libc_wali_syscall_sys_symlink(int32_t a1, int32_t a2) {
    return (int64_t)SYS_symlink(a1, a2);
}

int64_t libc_wali_syscall_sys_readlink(int32_t a1, int32_t a2, uint32_t a3) {
    return (int64_t)SYS_readlink(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_chmod(int32_t a1, int32_t a2) {
    return (int64_t)SYS_chmod(a1, a2);
}

int64_t libc_wali_syscall_sys_fchmod(int32_t a1, int32_t a2) {
    return (int64_t)SYS_fchmod(a1, a2);
}

int64_t libc_wali_syscall_sys_chown(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_chown(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_fchown(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_fchown(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_umask(int32_t a1) {
    return (int64_t)SYS_umask(a1);
}

int64_t libc_wali_syscall_sys_getrlimit(int32_t a1, int32_t a2) {
    return (int64_t)SYS_getrlimit(a1, a2);
}

int64_t libc_wali_syscall_sys_getrusage(int32_t a1, int32_t a2) {
    return (int64_t)SYS_getrusage(a1, a2);
}

int64_t libc_wali_syscall_sys_sysinfo(int32_t a1) {
    return (int64_t)SYS_sysinfo(a1);
}

int64_t libc_wali_syscall_sys_getuid(void) {
    return (int64_t)SYS_getuid();
}

int64_t libc_wali_syscall_sys_getgid(void) {
    return (int64_t)SYS_getgid();
}

int64_t libc_wali_syscall_sys_setuid(int32_t a1) {
    return (int64_t)SYS_setuid(a1);
}

int64_t libc_wali_syscall_sys_setgid(int32_t a1) {
    return (int64_t)SYS_setgid(a1);
}

int64_t libc_wali_syscall_sys_geteuid(void) {
    return (int64_t)SYS_geteuid();
}

int64_t libc_wali_syscall_sys_getegid(void) {
    return (int64_t)SYS_getegid();
}

int64_t libc_wali_syscall_sys_setpgid(int32_t a1, int32_t a2) {
    return (int64_t)SYS_setpgid(a1, a2);
}

int64_t libc_wali_syscall_sys_getppid(void) {
    return (int64_t)SYS_getppid();
}

int64_t libc_wali_syscall_sys_setsid(void) {
    return (int64_t)SYS_setsid();
}

int64_t libc_wali_syscall_sys_setreuid(int32_t a1, int32_t a2) {
    return (int64_t)SYS_setreuid(a1, a2);
}

int64_t libc_wali_syscall_sys_setregid(int32_t a1, int32_t a2) {
    return (int64_t)SYS_setregid(a1, a2);
}

int64_t libc_wali_syscall_sys_getgroups(uint32_t a1, int32_t a2) {
    return (int64_t)SYS_getgroups(a1, a2);
}

int64_t libc_wali_syscall_sys_setgroups(uint32_t a1, int32_t a2) {
    return (int64_t)SYS_setgroups(a1, a2);
}

int64_t libc_wali_syscall_sys_setresuid(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_setresuid(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_setresgid(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_setresgid(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_getpgid(int32_t a1) {
    return (int64_t)SYS_getpgid(a1);
}

int64_t libc_wali_syscall_sys_getsid(int32_t a1) {
    return (int64_t)SYS_getsid(a1);
}

int64_t libc_wali_syscall_sys_rt_sigpending(int32_t a1, uint32_t a2) {
    return (int64_t)SYS_rt_sigpending(a1, a2);
}

int64_t libc_wali_syscall_sys_rt_sigsuspend(int32_t a1, uint32_t a2) {
    return (int64_t)SYS_rt_sigsuspend(a1, a2);
}

int64_t libc_wali_syscall_sys_sigaltstack(int32_t a1, int32_t a2) {
    return (int64_t)SYS_sigaltstack(a1, a2);
}

int64_t libc_wali_syscall_sys_utime(int32_t a1, int32_t a2) {
    return (int64_t)SYS_utime(a1, a2);
}

int64_t libc_wali_syscall_sys_statfs(int32_t a1, int32_t a2) {
    return (int64_t)SYS_statfs(a1, a2);
}

int64_t libc_wali_syscall_sys_fstatfs(int32_t a1, int32_t a2) {
    return (int64_t)SYS_fstatfs(a1, a2);
}

int64_t libc_wali_syscall_sys_prctl(int32_t a1, uint64_t a2, uint64_t a3, uint64_t a4, uint64_t a5) {
    return (int64_t)SYS_prctl(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_setrlimit(int32_t a1, int32_t a2) {
    return (int64_t)SYS_setrlimit(a1, a2);
}

int64_t libc_wali_syscall_sys_chroot(int32_t a1) {
    return (int64_t)SYS_chroot(a1);
}

int64_t libc_wali_syscall_sys_gettid(void) {
    return (int64_t)SYS_gettid();
}

int64_t libc_wali_syscall_sys_tkill(int32_t a1, int32_t a2) {
    return (int64_t)SYS_tkill(a1, a2);
}

int64_t libc_wali_syscall_sys_futex(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6) {
    return (int64_t)SYS_futex(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_sched_getaffinity(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_sched_getaffinity(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_getdents64(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_getdents64(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_set_tid_address(int32_t a1) {
    return (int64_t)SYS_set_tid_address(a1);
}

int64_t libc_wali_syscall_sys_fadvise(int32_t a1, int64_t a2, int64_t a3, int32_t a4) {
    return (int64_t)SYS_fadvise(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_clock_gettime(int32_t a1, int32_t a2) {
    return (int64_t)SYS_clock_gettime(a1, a2);
}

int64_t libc_wali_syscall_sys_clock_getres(int32_t a1, int32_t a2) {
    return (int64_t)SYS_clock_getres(a1, a2);
}

int64_t libc_wali_syscall_sys_clock_nanosleep(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_clock_nanosleep(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_exit_group(int32_t a1) {
    return (int64_t)SYS_exit_group(a1);
}

int64_t libc_wali_syscall_sys_epoll_ctl(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_epoll_ctl(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_openat(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_openat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_mkdirat(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_mkdirat(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_fchownat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_fchownat(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_fstatat(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_fstatat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_unlinkat(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_unlinkat(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_linkat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_linkat(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_symlinkat(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_symlinkat(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_readlinkat(int32_t a1, int32_t a2, int32_t a3, uint32_t a4) {
    return (int64_t)SYS_readlinkat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_fchmodat(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_fchmodat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_faccessat(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_faccessat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_pselect6(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6) {
    return (int64_t)SYS_pselect6(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_ppoll(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, uint32_t a5) {
    return (int64_t)SYS_ppoll(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_utimensat(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_utimensat(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_epoll_pwait(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, uint32_t a6) {
    return (int64_t)SYS_epoll_pwait(a1, a2, a3, a4, a5, a6);
}

int64_t libc_wali_syscall_sys_eventfd(int32_t a1) {
    return (int64_t)SYS_eventfd(a1);
}

int64_t libc_wali_syscall_sys_accept4(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_accept4(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_eventfd2(int32_t a1, int32_t a2) {
    return (int64_t)SYS_eventfd2(a1, a2);
}

int64_t libc_wali_syscall_sys_epoll_create1(int32_t a1) {
    return (int64_t)SYS_epoll_create1(a1);
}

int64_t libc_wali_syscall_sys_dup3(int32_t a1, int32_t a2, int32_t a3) {
    return (int64_t)SYS_dup3(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_pipe2(int32_t a1, int32_t a2) {
    return (int64_t)SYS_pipe2(a1, a2);
}

int64_t libc_wali_syscall_sys_prlimit64(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_prlimit64(a1, a2, a3, a4);
}

int64_t libc_wali_syscall_sys_renameat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_renameat2(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_getrandom(int32_t a1, uint32_t a2, int32_t a3) {
    return (int64_t)SYS_getrandom(a1, a2, a3);
}

int64_t libc_wali_syscall_sys_statx(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5) {
    return (int64_t)SYS_statx(a1, a2, a3, a4, a5);
}

int64_t libc_wali_syscall_sys_faccessat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4) {
    return (int64_t)SYS_faccessat2(a1, a2, a3, a4);
}

