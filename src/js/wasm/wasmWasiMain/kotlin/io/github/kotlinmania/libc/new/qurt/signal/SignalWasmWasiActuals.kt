@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    0uL

public actual fun kill(pid: PidT, sig: CInt): CInt =
    0

public actual fun raise(sig: CInt): CInt =
    0

public actual fun alarm(seconds: CUint): CUint =
    0u

public actual fun pause(): CInt =
    0

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    0

public actual fun sigfillset(set: COpaquePointer?): CInt =
    0

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun sigpending(set: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0
