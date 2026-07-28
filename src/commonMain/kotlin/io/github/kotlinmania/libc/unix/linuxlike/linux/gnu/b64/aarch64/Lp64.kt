// port-lint: source unix/linux_like/linux/gnu/b64/aarch64/lp64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 48uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ])
public const val SYS_renameat: CLong = 38
public const val SYS_sync_file_range: CLong = 84
public const val SYS_getrlimit: CLong = 163
public const val SYS_setrlimit: CLong = 164
