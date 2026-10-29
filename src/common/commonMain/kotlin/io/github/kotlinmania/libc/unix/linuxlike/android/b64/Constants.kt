package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SA_NODEFER: Int = 0x40000000

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_SIGINFO: Int = 0x00000004

public const val RTLD_GLOBAL: Int = 0x00100

public const val RTLD_NOW: Int = 2

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(value = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(value = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0)

public val PTHREAD_STACK_MIN: ULong = 4096uL * 4uL

public const val CPU_SETSIZE: ULong = 1024uL

public const val __CPU_BITS: ULong = 64uL

public const val UT_LINESIZE: ULong = 32uL

public const val UT_NAMESIZE: ULong = 32uL

public const val UT_HOSTSIZE: ULong = 256uL
