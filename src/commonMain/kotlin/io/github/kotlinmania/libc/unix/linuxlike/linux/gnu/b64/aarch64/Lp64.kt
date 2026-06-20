// port-lint: source unix/linux_like/linux/gnu/b64/aarch64/lp64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*

public const val __SIZEOF_PTHREAD_CONDATTR_T: Int = 8
public const val __SIZEOF_PTHREAD_MUTEX_T: Int = 48
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: Int = 8
public const val __SIZEOF_PTHREAD_RWLOCK_T: Int = 56
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: Int = 8
public const val __SIZEOF_PTHREAD_BARRIER_T: Int = 32

// Initializer `size` byte arrays are all-zero except the mutex-kind byte. On
// little-endian that byte is index 16; on big-endian it is index 19.
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(48).also { it[16] = 1 })
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(48).also { it[16] = 2 })
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(48).also { it[16] = 3 })

public const val SYS_renameat: CLong = 38
public const val SYS_sync_file_range: CLong = 84
public const val SYS_getrlimit: CLong = 163
public const val SYS_setrlimit: CLong = 164
