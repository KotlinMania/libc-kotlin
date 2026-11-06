package io.github.kotlinmania.libc.unix.linux_like.android.b32

// The following definitions are correct for arm and i686,
// but may be wrong for mips
public typealias ModeT = UShort

public typealias Off64T = CLonglong

public typealias SigsetT = CUlong

public typealias SocklenT = Int

public typealias Time64T = Long

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

// These constants must be of the same type of sigaction.saFlags
public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SA_NODEFER: CInt = 0x40000000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_SIGINFO: CInt = 0x00000004

public val RTLD_GLOBAL: CInt = 2

public val RTLD_NOW: CInt = 0

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-1).toLong())

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(value = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(value = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(lock = PTHREAD_MUTEX_INITIALIZER, cond = PTHREAD_COND_INITIALIZER, numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0, reserved = 0)

public val PTHREAD_STACK_MIN: SizeT = 4096uL * 2uL

public val CPU_SETSIZE: SizeT = 32uL

public val CPU_BITS: SizeT = 32uL

public val UT_LINESIZE: Int = 8

public val UT_NAMESIZE: Int = 8

public val UT_HOSTSIZE: Int = 16

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public fun timegm64(tm: Tm?): Time64T {
    return LibcDynamicFfi.invoke("timegm64", -1, longArrayOf(tm?.value ?: 0L))
}
