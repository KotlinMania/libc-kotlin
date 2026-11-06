#include "signal_wrapper.h"
#include <errno.h>
#include <signal.h>

uint64_t libc_signal_signal(int32_t sig, uint64_t handler) {
    return (uint64_t)signal(sig, handler);
}

int32_t libc_signal_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_signal_raise(int32_t sig) {
    return (int32_t)raise(sig);
}

uint32_t libc_signal_alarm(uint32_t seconds) {
    return (uint32_t)alarm(seconds);
}

int32_t libc_signal_pause(void) {
    return (int32_t)pause();
}

int32_t libc_signal_sigemptyset(void* set) {
    return (int32_t)sigemptyset(set);
}

int32_t libc_signal_sigfillset(void* set) {
    return (int32_t)sigfillset(set);
}

int32_t libc_signal_sigaddset(void* set, int32_t signum) {
    return (int32_t)sigaddset(set, signum);
}

int32_t libc_signal_sigdelset(void* set, int32_t signum) {
    return (int32_t)sigdelset(set, signum);
}

int32_t libc_signal_sigismember(void* set, int32_t signum) {
    return (int32_t)sigismember(set, signum);
}

int32_t libc_signal_sigprocmask(int32_t how, void* set, void* oldset) {
    return (int32_t)sigprocmask(how, set, oldset);
}

int32_t libc_signal_sigpending(void* set) {
    return (int32_t)sigpending(set);
}

int32_t libc_signal_sigsuspend(void* mask) {
    return (int32_t)sigsuspend(mask);
}

int32_t libc_signal_sigwait(void* set, void* sig) {
    return (int32_t)sigwait(set, sig);
}

int32_t libc_signal_sigaction(int32_t sig, void* act, void* oact) {
    return (int32_t)_sigaction(sig, act, oact);
}

int32_t libc_signal_sigtimedwait(void* set, void* info, void* timeout) {
    return (int32_t)sigtimedwait(set, info, timeout);
}

