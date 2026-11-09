@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT

private val _newQurtSignalNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_signal(sig, handler.toString()) as String).toULong() else 0uL

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_kill(pid, sig) as Int) else 0

public actual fun raise(sig: CInt): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_raise(sig) as Int) else 0

public actual fun alarm(seconds: CUint): CUint =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_alarm(seconds.toInt()) as Int).toUInt() else 0u

public actual fun pause(): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_pause() as Int) else 0

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigemptyset((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigfillset((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigaddset((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigdelset((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigismember((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigpending((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigaction(sig, (act?.value ?: 0L).toString(), (oact?.value ?: 0L).toString()) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAddon != null) (_newQurtSignalNapiAddon.libc_new_qurt_signal_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0
