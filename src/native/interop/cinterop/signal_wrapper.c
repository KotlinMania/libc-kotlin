#include "signal_wrapper.h"
#include <errno.h>
#include <signal.h>
#if !defined(_WIN32)
#include <unistd.h>
#endif

uint64_t libc_signal_signal(int32_t sig, uint64_t handler) {
    return (uint64_t)(uintptr_t)signal(sig, (void (*)(int))(uintptr_t)handler);
}

int32_t libc_signal_kill(int32_t pid, int32_t sig) {
    return (int32_t)kill(pid, sig);
}

int32_t libc_signal_raise(int32_t sig) {
    return (int32_t)raise(sig);
}

uint32_t libc_signal_alarm(uint32_t seconds) {
#if !defined(_WIN32)
    return (uint32_t)alarm(seconds);
#else
    (void)seconds;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t libc_signal_pause(void) {
#if !defined(_WIN32)
    return (int32_t)pause();
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigemptyset(void* set) {
#if !defined(_WIN32)
    return (int32_t)sigemptyset((sigset_t*)set);
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigfillset(void* set) {
#if !defined(_WIN32)
    return (int32_t)sigfillset((sigset_t*)set);
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigaddset(void* set, int32_t signum) {
#if !defined(_WIN32)
    return (int32_t)sigaddset((sigset_t*)set, signum);
#else
    (void)set; (void)signum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigdelset(void* set, int32_t signum) {
#if !defined(_WIN32)
    return (int32_t)sigdelset((sigset_t*)set, signum);
#else
    (void)set; (void)signum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigismember(void* set, int32_t signum) {
#if !defined(_WIN32)
    return (int32_t)sigismember((sigset_t*)set, signum);
#else
    (void)set; (void)signum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigprocmask(int32_t how, void* set, void* oldset) {
#if !defined(_WIN32)
    return (int32_t)sigprocmask(how, (sigset_t*)set, (sigset_t*)oldset);
#else
    (void)how; (void)set; (void)oldset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigpending(void* set) {
#if !defined(_WIN32)
    return (int32_t)sigpending((sigset_t*)set);
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigsuspend(void* mask) {
#if !defined(_WIN32)
    return (int32_t)sigsuspend((sigset_t*)mask);
#else
    (void)mask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigwait(void* set, void* sig) {
#if !defined(_WIN32)
    return (int32_t)sigwait((sigset_t*)set, (int*)sig);
#else
    (void)set; (void)sig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigaction(int32_t sig, void* act, void* oact) {
#if !defined(_WIN32)
    return (int32_t)sigaction(sig, (struct sigaction*)act, (struct sigaction*)oact);
#else
    (void)sig; (void)act; (void)oact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_signal_sigtimedwait(void* set, void* info, void* timeout) {
#if defined(__linux__)
    return (int32_t)sigtimedwait((sigset_t*)set, (siginfo_t*)info, (struct timespec*)timeout);
#else
    (void)set; (void)info; (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}
