// port-lint: source new/apple/libpthread/pthread_/pthread.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadCondT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadRwlockT

/**
 * Header: `pthread.h` (or `pthread/pthread.h`).
 */

public const val PTHREAD_CREATE_JOINABLE: CInt = 1
public const val PTHREAD_CREATE_DETACHED: CInt = 2

public const val PTHREAD_INHERIT_SCHED: CInt = 1
public const val PTHREAD_EXPLICIT_SCHED: CInt = 2

public const val PTHREAD_CANCEL_ENABLE: CInt = 0x01
public const val PTHREAD_CANCEL_DISABLE: CInt = 0x00
public const val PTHREAD_CANCEL_DEFERRED: CInt = 0x02
public const val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 0x00

// PTHREAD_CANCELED is the sentinel pointer value `1 as *mut c_void`; a cast
// integer-to-pointer constant cannot be expressed in common Kotlin.

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

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT =
    PthreadRwlockT(PTHREAD_RWLOCK_SIG_INIT, ByteArray(192))

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT =
    PthreadMutexT(PTHREAD_MUTEX_SIG_INIT, ByteArray(56))

public val PTHREAD_COND_INITIALIZER: PthreadCondT =
    PthreadCondT(PTHREAD_COND_SIG_INIT, ByteArray(40))

public val PTHREAD_ONCE_INIT: PthreadOnceT =
    PthreadOnceT(PTHREAD_ONCE_SIG_INIT, ByteArray(8))
