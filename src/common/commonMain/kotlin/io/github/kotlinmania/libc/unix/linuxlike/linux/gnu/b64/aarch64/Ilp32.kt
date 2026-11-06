// port-lint: source unix/linux_like/linux/gnu/b64/aarch64/ilp32.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.pthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T: Int = 32

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 48

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 2u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 3u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val SYS_SYNC_FILE_RANGE2: CLong = 84L
