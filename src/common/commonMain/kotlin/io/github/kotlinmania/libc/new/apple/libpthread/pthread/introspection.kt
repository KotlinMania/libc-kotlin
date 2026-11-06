// port-lint: source new/apple/libpthread/pthread_/introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// Header: `pthread / introspection.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/introspection.h>

public val PTHREAD_INTROSPECTION_THREAD_CREATE: CUint = 1u

public val PTHREAD_INTROSPECTION_THREAD_START: CUint = PTHREAD_INTROSPECTION_THREAD_CREATE + 1u

public val PTHREAD_INTROSPECTION_THREAD_TERMINATE: CUint = PTHREAD_INTROSPECTION_THREAD_START + 1u

public val PTHREAD_INTROSPECTION_THREAD_DESTROY: CUint = PTHREAD_INTROSPECTION_THREAD_TERMINATE + 1u

public fun interface PthreadIntrospectionHookT {
    public operator fun invoke(event: CUint, thread: PthreadT, addr: COpaquePointer?, size: SizeT)
}

// Available from Big Sur
public expect fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT

public expect fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer?
