// port-lint: source Signal.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill not available on WASI — no C library access")

public actual fun raise(sig: CInt): CInt =
    throw UnsupportedOperationException("raise not available on WASI — no C library access")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause not available on WASI — no C library access")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset not available on WASI — no C library access")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset not available on WASI — no C library access")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset not available on WASI — no C library access")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset not available on WASI — no C library access")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember not available on WASI — no C library access")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask not available on WASI — no C library access")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending not available on WASI — no C library access")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction not available on WASI — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

