package io.github.kotlinmania.libc.unix.linux_like.android.b64

// The following definitions are correct for aarch64 and x8664,
// but may be wrong for mips64
public typealias ModeT = UInt

public typealias Off64T = Long

public typealias SocklenT = UInt

// These constants must be of the same type of sigaction.saFlags
public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SA_NODEFER: CInt = 0x40000000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_SIGINFO: CInt = 0x00000004

public val RTLD_GLOBAL: CInt = 0x00100

public val RTLD_NOW: CInt = 2

public val RTLD_DEFAULT: COpaquePointer? = null

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(value = 0, reserved = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(value = 0, reserved = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0, reserved = 0)

public val PTHREAD_STACK_MIN: SizeT = 4096uL * 4uL

public val CPU_SETSIZE: SizeT = 1024uL

public val CPU_BITS: SizeT = 64uL

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean {
    val __slot_2 = if (newSerialPtr == null) 0L else LibcDynamicFfi.allocScalarSlot(newSerialPtr.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("__system_property_wait", -1, longArrayOf(pi?.value ?: 0L, oldSerial.toLong(), __slot_2, relativeTimeout?.value ?: 0L))
        return (rawRet and 0xFFL) != 0L
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}
