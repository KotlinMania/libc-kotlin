#ifndef LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H
#define LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libc_new_qurt_signal_signal(int32_t sig, uint64_t handler);
int32_t libc_new_qurt_signal_kill(int32_t pid, int32_t sig);
int32_t libc_new_qurt_signal_raise(int32_t sig);
uint32_t libc_new_qurt_signal_alarm(uint32_t seconds);
int32_t libc_new_qurt_signal_pause(void);
int32_t libc_new_qurt_signal_sigemptyset(void* set);
int32_t libc_new_qurt_signal_sigfillset(void* set);
int32_t libc_new_qurt_signal_sigaddset(void* set, int32_t signum);
int32_t libc_new_qurt_signal_sigdelset(void* set, int32_t signum);
int32_t libc_new_qurt_signal_sigismember(void* set, int32_t signum);
int32_t libc_new_qurt_signal_sigprocmask(int32_t how, void* set, void* oldset);
int32_t libc_new_qurt_signal_sigpending(void* set);
int32_t libc_new_qurt_signal_sigsuspend(void* mask);
int32_t libc_new_qurt_signal_sigwait(void* set, void* sig);
int32_t libc_new_qurt_signal_sigaction(int32_t sig, void* act, void* oact);
int32_t libc_new_qurt_signal_sigtimedwait(void* set, void* info, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H */
