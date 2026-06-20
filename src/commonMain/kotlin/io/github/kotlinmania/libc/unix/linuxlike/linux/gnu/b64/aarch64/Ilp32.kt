// port-lint: source unix/linux_like/linux/gnu/b64/aarch64/ilp32.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*

public const val __SIZEOF_PTHREAD_CONDATTR_T: Int = 4
public const val __SIZEOF_PTHREAD_MUTEX_T: Int = 32
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4
public const val __SIZEOF_PTHREAD_RWLOCK_T: Int = 48
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4
public const val __SIZEOF_PTHREAD_BARRIER_T: Int = 20

// Initializer `size` byte arrays are all-zero except the mutex-kind byte. On
// little-endian that byte is index 12; on big-endian it is index 15.
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(32).also { it[12] = 1 })
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(32).also { it[12] = 2 })
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT =
    PthreadMutexT(size = ByteArray(32).also { it[12] = 3 })

public const val SYS_sync_file_range2: CLong = 84
