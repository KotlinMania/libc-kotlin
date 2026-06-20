// port-lint: source new/apple/libpthread/pthread_/pthread_impl.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public const val PTHREAD_MUTEX_SIG_INIT: CLong = 0x32AAABA7
public const val PTHREAD_COND_SIG_INIT: CLong = 0x3CB0B1BB
internal const val PTHREAD_ONCE_SIG_INIT: CLong = 0x30B1BCBA
public const val PTHREAD_RWLOCK_SIG_INIT: CLong = 0x2DA8B3B4

public const val SCHED_OTHER: CInt = 1
public const val SCHED_FIFO: CInt = 4
public const val SCHED_RR: CInt = 2
