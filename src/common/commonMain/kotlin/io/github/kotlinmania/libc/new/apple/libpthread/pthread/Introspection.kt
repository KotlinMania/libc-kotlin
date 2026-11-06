// port-lint: source new/apple/libpthread/pthread_/introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.SizeT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT

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
public fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("pthread_introspection_hook_install", -1, longArrayOf(__scratch_0))
        return PthreadIntrospectionHookT { _, _, _, _ ->  }
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_introspection_setspecific_np", -1, longArrayOf(thread.toLong(), key.toLong(), value?.value ?: 0L)).toInt()
}

public fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_introspection_getspecific_np", -1, longArrayOf(thread.toLong(), key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
