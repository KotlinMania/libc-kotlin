#ifndef LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H
#define LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(int32_t a1, int64_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, int32_t a5, int64_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(int32_t a1, uint32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(int64_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(int32_t a1, int32_t a2, uint32_t a3, int64_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(int32_t a1, uint32_t a2, uint32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(int32_t a1, int32_t a2, uint32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(int32_t a1, int64_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(int32_t a1, uint32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(int32_t a1, int32_t a2, uint32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(uint32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(uint32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(int32_t a1, uint32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(int32_t a1, uint32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(int32_t a1, uint64_t a2, uint64_t a3, uint64_t a4, uint64_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid(void);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(int32_t a1, int64_t a2, int64_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(int32_t a1, int32_t a2, int32_t a3, uint32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, int32_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(int32_t a1, uint32_t a2, int32_t a3, int32_t a4, uint32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5, uint32_t a6);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(int32_t a1);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(int32_t a1, int32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(int32_t a1, int32_t a2);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(int32_t a1, int32_t a2, int32_t a3, int32_t a4);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(int32_t a1, uint32_t a2, int32_t a3);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int32_t a5);
int64_t libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(int32_t a1, int32_t a2, int32_t a3, int32_t a4);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_UNIX_LINUXLIKE_LINUX_MUSL_B64_WASM32_WALI_WRAPPER_H */
