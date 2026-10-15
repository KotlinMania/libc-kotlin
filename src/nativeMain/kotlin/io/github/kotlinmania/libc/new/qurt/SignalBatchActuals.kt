// port-lint: source Signal.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_kill
import libc.cinterop.libc_pause
import libc.cinterop.libc_raise

public actual fun kill(pid: Int, sig: Int): Int =
    libc.cinterop.libc_kill(pid, sig)

public actual fun raise(sig: Int): Int = libc.cinterop.libc_raise(sig)

public actual fun pause(): Int = libc.cinterop.libc_pause()

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun sigaction(sig: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")
