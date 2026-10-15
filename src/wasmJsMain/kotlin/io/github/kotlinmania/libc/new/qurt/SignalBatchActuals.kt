// port-lint: source Signal.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun kill(pid: Int, sig: Int): Int =
    throw UnsupportedOperationException("kill requires N-API addon")

public actual fun raise(sig: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun sigaction(sig: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires N-API addon")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")
