// port-lint: source Mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyCreate(key: ULong?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on Android host — use androidNative target for FFI")

public actual fun sigqueue(pid: Int, signo: Int, value: Sigval): Int =
    throw UnsupportedOperationException("sigqueue not available on Android host — use androidNative target for FFI")

public actual fun sigqueue(rtpId: Int, signo: Int, pValue: Sigval?, sigCode: Int): Int =
    throw UnsupportedOperationException("sigqueue (rtpId overload) not available on Android host — use androidNative target for FFI")
