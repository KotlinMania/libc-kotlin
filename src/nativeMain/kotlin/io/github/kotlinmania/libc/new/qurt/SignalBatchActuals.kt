// port-lint: source Signal.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill requires manual FFI bridge — not yet implemented")

public actual fun raise(sig: CInt): CInt =
    throw UnsupportedOperationException("raise requires manual FFI bridge — not yet implemented")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause requires manual FFI bridge — not yet implemented")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")
