// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import kotlinx.cinterop.ExperimentalForeignApi


public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("sigqueue requires manual FFI bridge for ambiguous type")

public actual fun sigqueue(rtpId: RTPID, signo: CInt, pValue: Sigval?, sigCode: CInt): CInt =
    throw UnsupportedOperationException("sigqueue (rtpId overload) requires manual FFI bridge for ambiguous type")
