#ifndef LIBC_SIGNAL_SIGNAL_WRAPPER_H
#define LIBC_SIGNAL_SIGNAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libc_signal_signal(int32_t sig, uint64_t handler);
int32_t libc_signal_kill(int32_t pid, int32_t sig);
int32_t libc_signal_raise(int32_t sig);
uint32_t libc_signal_alarm(uint32_t seconds);
int32_t libc_signal_pause(void);
int32_t libc_signal_sigemptyset(void* set);
int32_t libc_signal_sigfillset(void* set);
int32_t libc_signal_sigaddset(void* set, int32_t signum);
int32_t libc_signal_sigdelset(void* set, int32_t signum);
int32_t libc_signal_sigismember(void* set, int32_t signum);
int32_t libc_signal_sigprocmask(int32_t how, void* set, void* oldset);
int32_t libc_signal_sigpending(void* set);
int32_t libc_signal_sigsuspend(void* mask);
int32_t libc_signal_sigwait(void* set, void* sig);
int32_t libc_signal_sigaction(int32_t sig, void* act, void* oact);
int32_t libc_signal_sigtimedwait(void* set, void* info, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_SIGNAL_SIGNAL_WRAPPER_H */
