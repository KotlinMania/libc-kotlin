// port-lint: source new/apple/libpthread/pthread_/pthread.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.PthreadOnceT
import io.github.kotlinmania.libc.pthreadOnceT

// Header: `pthread.h` or `pthread / pthread.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/pthread.h>

public val PTHREAD_CREATE_JOINABLE: CInt = 1

public val PTHREAD_CREATE_DETACHED: CInt = 2

public val PTHREAD_INHERIT_SCHED: CInt = 1

public val PTHREAD_EXPLICIT_SCHED: CInt = 2

public val PTHREAD_CANCEL_ENABLE: CInt = 0x01

public val PTHREAD_CANCEL_DISABLE: CInt = 0x00

public val PTHREAD_CANCEL_DEFERRED: CInt = 0x02

public val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 0x00

public val PTHREAD_CANCELED: COpaquePointer? = null

public val PTHREAD_SCOPE_SYSTEM: CInt = 1

public val PTHREAD_SCOPE_PROCESS: CInt = 2

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CInt = 2

public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL


public val PTHREAD_RWLOCK_SIZE: Int = 0
public val PTHREAD_MUTEX_SIZE: Int = 0
public val PTHREAD_COND_SIZE: Int = 0
public val PTHREAD_ONCE_SIZE: Int = 0
public val pthreadRwlockSigInit: Int = 0
public val pthreadMutexSigInit: Int = 0
public val pthreadCondSigInit: Int = 0


public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = null

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = null

public val PTHREAD_COND_INITIALIZER: PthreadCondT = null

public val PTHREAD_ONCE_INIT: PthreadOnceT = null
