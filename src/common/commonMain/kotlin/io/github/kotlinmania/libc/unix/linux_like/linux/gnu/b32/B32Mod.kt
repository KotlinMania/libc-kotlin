package io.github.kotlinmania.libc.unix.linux_like.linux.gnu.b32

import pthreadMutexT

// 32-bit specific definitions for linux-like values

public typealias ClockT = Int

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias NlinkT = UInt

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public typealias FswordT = Int

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias SyscallUlongT = CUlong

public typealias Suseconds64T = Long

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T: Int = 24

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 32

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTRACE_GETFPREGS: CUint = 14u

public val PTRACE_SETFPREGS: CUint = 15u

public val PTRACE_GETREGS: CUint = 12u

public val PTRACE_SETREGS: CUint = 13u

public fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __slot_0 = if (name == null) 0L else LibcDynamicFfi.allocScalarSlot(name.toLong())
    val __slot_3 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctl", -1, longArrayOf(__slot_0, namelen.toLong(), oldp?.value ?: 0L, __slot_3, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}
