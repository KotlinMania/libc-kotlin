// port-lint: source new/apple/libpthread/pthread_/pthread.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadimpl.PTHREAD_COND_SIG_INIT
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadimpl.PTHREAD_MUTEX_SIG_INIT
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadimpl.PTHREAD_ONCE_SIG_INIT
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadimpl.PTHREAD_RWLOCK_SIG_INIT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PTHREAD_COND_SIZE
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PTHREAD_MUTEX_SIZE
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PTHREAD_ONCE_SIZE
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PTHREAD_RWLOCK_SIZE
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadRwlockT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public val PTHREAD_CANCELED: MutPtr<CVoid> = MutPtr<CVoid>(1.toLong())

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

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(sig = PTHREAD_RWLOCK_SIG_INIT, opaque = UByteArray(PTHREAD_RWLOCK_SIZE) { 0u.toUByte() })

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(sig = PTHREAD_MUTEX_SIG_INIT, opaque = UByteArray(PTHREAD_MUTEX_SIZE) { 0u.toUByte() })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(sig = PTHREAD_COND_SIG_INIT, opaque = UByteArray(PTHREAD_COND_SIZE) { 0u.toUByte() })

public val PTHREAD_ONCE_INIT: PthreadOnceT = PthreadOnceT(sig = PTHREAD_ONCE_SIG_INIT, opaque = UByteArray(PTHREAD_ONCE_SIZE) { 0u.toUByte() })
