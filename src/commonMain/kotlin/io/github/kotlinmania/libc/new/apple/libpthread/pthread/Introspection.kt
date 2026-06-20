// port-lint: source new/apple/libpthread/pthread_/introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `pthread/introspection.h`.
 */

// Anonymous introspection event enum (repr c_uint), values auto-incremented from 1.
public const val PTHREAD_INTROSPECTION_THREAD_CREATE: CUInt = 1u
public const val PTHREAD_INTROSPECTION_THREAD_START: CUInt = 2u
public const val PTHREAD_INTROSPECTION_THREAD_TERMINATE: CUInt = 3u
public const val PTHREAD_INTROSPECTION_THREAD_DESTROY: CUInt = 4u

public typealias PthreadIntrospectionHookT = (event: CUInt, thread: PthreadT, addr: COpaquePointer?, size: ULong) -> Unit

// Available from Big Sur.
public expect fun pthreadIntrospectionHookInstall(
    hook: PthreadIntrospectionHookT,
): PthreadIntrospectionHookT

public expect fun pthreadIntrospectionSetspecificNp(
    thread: PthreadT,
    key: PthreadKeyT,
    value: COpaquePointer?,
): CInt

public expect fun pthreadIntrospectionGetspecificNp(
    thread: PthreadT,
    key: PthreadKeyT,
): COpaquePointer?
