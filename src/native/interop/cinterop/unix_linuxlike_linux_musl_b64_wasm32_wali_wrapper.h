#ifndef LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(int32_t a1, int32_t a2, uint32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(int32_t a1, int32_t a2, uint32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(int32_t a1, int64_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, int32_t a5, int64_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(int32_t a1, uint32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(int64_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(int32_t a1, uint32_t a2, uint32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(int32_t a1, int32_t a2, uint32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(int32_t a1, int32_t a2, uint32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(int32_t a1, int64_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(int32_t a1, uint32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(int32_t a1, int32_t a2, uint32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(uint32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(uint32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(int32_t a1, uint32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(int32_t a1, uint32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(int32_t a1, uint64_t a2, uint64_t a3, uint64_t a4, uint64_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid(void);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(int32_t a1, int64_t a2, int64_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(int32_t a1);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(int32_t a1, int32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(int32_t a1, int32_t a2);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(int32_t a1, uint32_t a2, int32_t a3);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H */
