package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    js("require('@kotlinmania/libc-native-bindings').signal(sig, handler)") as SighandlerT

public actual fun kill(pid: PidT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kill(pid, sig)") as CInt

public actual fun raise(sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').raise(sig)") as CInt

public actual fun alarm(seconds: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').alarm(seconds)") as CUint

public actual fun pause(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pause()") as CInt

public actual fun sigemptyset(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigemptyset(set?.toLong() ?: 0L)") as CInt

public actual fun sigfillset(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigfillset(set?.toLong() ?: 0L)") as CInt

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaddset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigdelset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigismember(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun sigpending(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigpending(set?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaction(sig, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt
