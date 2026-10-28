// port-lint: source Signal.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun kill(pid: Int, sig: Int): Int =
    throw UnsupportedOperationException("kill not available on Android host — use androidNative target for FFI")

public actual fun raise(sig: Int): Int =
    throw UnsupportedOperationException("raise not available on Android host — use androidNative target for FFI")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause not available on Android host — use androidNative target for FFI")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset not available on Android host — use androidNative target for FFI")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset not available on Android host — use androidNative target for FFI")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset not available on Android host — use androidNative target for FFI")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset not available on Android host — use androidNative target for FFI")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember not available on Android host — use androidNative target for FFI")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask not available on Android host — use androidNative target for FFI")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun sigaction(sig: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction not available on Android host — use androidNative target for FFI")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on Android host — use androidNative target for FFI")
