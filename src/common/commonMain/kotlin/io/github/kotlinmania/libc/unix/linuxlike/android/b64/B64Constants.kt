@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// These constants must be of the same type of sigaction.saFlags
public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SA_NODEFER: CInt = 0x40000000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_RESETHAND: CInt = 0x80000000.toInt()

public val SA_RESTART: CInt = 0x10000000

public val SA_SIGINFO: CInt = 0x00000004

public val RTLD_GLOBAL: CInt = 0x00100

public val RTLD_NOW: CInt = 2

public val PTHREAD_STACK_MIN: SizeT = 4096uL * 4uL

public val CPU_SETSIZE: SizeT = 1024uL

public val CPU_BITS: SizeT = 64uL

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public val RTLD_DEFAULT: MutPtr<CVoid> = MutPtr(0L)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(value = 0, reserved = UByteArray(0))

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(value = 0, reserved = UByteArray(0))

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0, reserved = UByteArray(0))
