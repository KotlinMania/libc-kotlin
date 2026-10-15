// port-lint: source new/apple/libpthread/pthread_/pthread.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public const val PTHREAD_CREATE_JOINABLE: Int = 1
public const val PTHREAD_CREATE_DETACHED: Int = 2
public const val PTHREAD_INHERIT_SCHED: Int = 1
public const val PTHREAD_EXPLICIT_SCHED: Int = 2
public const val PTHREAD_CANCEL_ENABLE: Int = 0x01
public const val PTHREAD_CANCEL_DISABLE: Int = 0x00
public const val PTHREAD_CANCEL_DEFERRED: Int = 0x02
public const val PTHREAD_CANCEL_ASYNCHRONOUS: Int = 0x00
public const val PTHREAD_SCOPE_SYSTEM: Int = 1
public const val PTHREAD_SCOPE_PROCESS: Int = 2
public const val PTHREAD_PROCESS_SHARED: Int = 1
public const val PTHREAD_PROCESS_PRIVATE: Int = 2
public const val PTHREAD_PRIO_NONE: Int = 0
public const val PTHREAD_PRIO_INHERIT: Int = 1
public const val PTHREAD_PRIO_PROTECT: Int = 2
public const val PTHREAD_MUTEX_NORMAL: Int = 0
public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1
public const val PTHREAD_MUTEX_RECURSIVE: Int = 2
public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { __sig: _PTHREAD_RWLOCK_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { __sig: _PTHREAD_MUTEX_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __sig: _PTHREAD_COND_SIG_init, __opaque: [0 (initializer represented at the FFI boundary)
// PTHREAD_ONCE_INIT: PthreadOnceT = crate::pthread_once_t { __sig: _PTHREAD_ONCE_SIG_INIT, __opaque: [0 (initializer represented at the FFI boundary)
