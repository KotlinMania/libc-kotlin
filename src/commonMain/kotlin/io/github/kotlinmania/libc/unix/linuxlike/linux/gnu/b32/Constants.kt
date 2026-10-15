// port-lint: source unix/linux_like/linux/gnu/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 20uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val O_NOATIME: Int = 0x200000

public const val O_PATH: Int = 0x1000000

public val O_TMPFILE: Int = 0x2000000 or O_DIRECTORY

public const val SA_ONSTACK: Int = 1

public const val PTRACE_DETACH: UInt = 11u

public const val F_RDLCK: Int = 1

public const val F_WRLCK: Int = 2

public const val F_UNLCK: Int = 3

public const val SFD_CLOEXEC: Int = 0x400000

public const val NCCS: ULong = 17uL

public const val O_TRUNC: Int = 0x400

public const val O_CLOEXEC: Int = 0x400000

public const val EBFONT: Int = 109

public const val ENOSTR: Int = 72

public const val ENODATA: Int = 111

public const val ETIME: Int = 73

public const val ENOSR: Int = 74

public const val ENONET: Int = 80

public const val ENOPKG: Int = 113

public const val EREMOTE: Int = 71

public const val ENOLINK: Int = 82

public const val EADV: Int = 83

public const val ESRMNT: Int = 84

public const val ECOMM: Int = 85

public const val EPROTO: Int = 86

public const val EDOTDOT: Int = 88

public const val SA_NODEFER: Int = 0x20

public const val SA_RESETHAND: Int = 0x4

public const val SA_RESTART: Int = 0x2

public const val SA_NOCLDSTOP: Int = 0x00000008

public const val EPOLL_CLOEXEC: Int = 0x400000

public const val EFD_CLOEXEC: Int = 0x400000

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public const val PTRACE_GETFPREGS: UInt = 14u

public const val PTRACE_SETFPREGS: UInt = 15u

public const val PTRACE_GETREGS: UInt = 12u

public const val PTRACE_SETREGS: UInt = 13u
