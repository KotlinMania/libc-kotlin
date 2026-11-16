#ifndef LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H
#define LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint64_t libcNewQurtSignalSignal(int32_t sig, uint64_t handler);
int32_t libcNewQurtSignalKill(int32_t pid, int32_t sig);
int32_t libcNewQurtSignalRaise(int32_t sig);
uint32_t libcNewQurtSignalAlarm(uint32_t seconds);
int32_t libcNewQurtSignalPause(void);
int32_t libcNewQurtSignalSigemptyset(void* set);
int32_t libcNewQurtSignalSigfillset(void* set);
int32_t libcNewQurtSignalSigaddset(void* set, int32_t signum);
int32_t libcNewQurtSignalSigdelset(void* set, int32_t signum);
int32_t libcNewQurtSignalSigismember(void* set, int32_t signum);
int32_t libcNewQurtSignalSigprocmask(int32_t how, void* set, void* oldset);
int32_t libcNewQurtSignalSigpending(void* set);
int32_t libcNewQurtSignalSigsuspend(void* mask);
int32_t libcNewQurtSignalSigwait(void* set, void* sig);
int32_t libcNewQurtSignalSigaction(int32_t sig, void* act, void* oact);
int32_t libcNewQurtSignalSigtimedwait(void* set, void* info, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_SIGNAL_NEW_QURT_SIGNAL_WRAPPER_H */
