// port-lint: source new/apple/libpthread/pthread_/pthread_impl.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadimpl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong

// Note(apple): these should all be `public(crate)`
public val PTHREAD_MUTEX_SIG_INIT: CLong = 0x32AAABA7L

public val PTHREAD_COND_SIG_INIT: CLong = 0x3CB0B1BBL

internal val PTHREAD_ONCE_SIG_INIT: CLong = 0x30B1BCBAL

public val PTHREAD_RWLOCK_SIG_INIT: CLong = 0x2DA8B3B4L

public val SCHED_OTHER: CInt = 1

public val SCHED_FIFO: CInt = 4

public val SCHED_RR: CInt = 2
