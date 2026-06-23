// port-lint: source new/apple/libpthread/pthread_/pthread.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public const val PTHREAD_CREATE_JOINABLE: CInt = 1
public const val PTHREAD_CREATE_DETACHED: CInt = 2
public const val PTHREAD_INHERIT_SCHED: CInt = 1
public const val PTHREAD_EXPLICIT_SCHED: CInt = 2
public const val PTHREAD_CANCEL_ENABLE: CInt = 0x01
public const val PTHREAD_CANCEL_DISABLE: CInt = 0x00
public const val PTHREAD_CANCEL_DEFERRED: CInt = 0x02
public const val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 0x00
public const val PTHREAD_SCOPE_SYSTEM: CInt = 1
public const val PTHREAD_SCOPE_PROCESS: CInt = 2
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val PTHREAD_PROCESS_PRIVATE: CInt = 2
public const val PTHREAD_PRIO_NONE: CInt = 0
public const val PTHREAD_PRIO_INHERIT: CInt = 1
public const val PTHREAD_PRIO_PROTECT: CInt = 2
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { __sig: _PTHREAD_RWLOCK_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { __sig: _PTHREAD_MUTEX_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __sig: _PTHREAD_COND_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_ONCE_INIT: PthreadOnceT = crate::pthread_once_t { __sig: _PTHREAD_ONCE_SIG_INIT, __opaque: [0 (initializer represented at the FFI boundary)
