// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: ULong?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun sigqueue(pid: Int, signo: Int, value: Sigval): Int =
    throw UnsupportedOperationException("sigqueue requires manual FFI bridge for ambiguous type")

public actual fun sigqueue(rtpId: Int, signo: Int, pValue: Sigval?, sigCode: Int): Int =
    throw UnsupportedOperationException("sigqueue (rtpId overload) requires manual FFI bridge for ambiguous type")
