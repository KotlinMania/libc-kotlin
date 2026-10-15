// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.PTHREAD_PROCESS_PRIVATE

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EOPNOTSUPP: Int = 95

public const val O_DIRECTORY: Int = 0x10000

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val SIGEV_THREAD_ID: Int = 4

public const val AF_VSOCK: Int = 40

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 3

public const val LC_COLLATE: Int = 4

public const val LC_MONETARY: Int = 2

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = 6

public const val ENOTSUP: Int = EOPNOTSUPP

public const val IPV6_JOIN_GROUP: Int = 20

public const val IPV6_LEAVE_GROUP: Int = 21

public const val FILENAME_MAX: UInt = 4095u

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val SOMAXCONN: Int = 128

public const val ST_RELATIME: ULong = 4096uL

public const val SO_TIMESTAMP: Int = 29

public val RLIM_INFINITY: ULong = 0uL.inv()

public const val AF_NFC: Int = 39

public const val BUFSIZ: Int = 256

public const val EDEADLK: Int = 0x23

public const val EDEADLOCK: Int = EDEADLK

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val EXTPROC: UInt = 65536u

public const val FOPEN_MAX: Int = 16

public const val F_GETOWN: Int = 9

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val F_RDLCK: Int = 0

public const val F_SETOWN: Int = 8

public const val F_UNLCK: Int = 2

public const val F_WRLCK: Int = 1

public const val IPV6_MULTICAST_ALL: Int = 29

public const val IPV6_ROUTER_ALERT_ISOLATE: Int = 30

public const val MAP_HUGE_SHIFT: Int = 26

public const val MAP_HUGE_MASK: Int = 0x3f

public const val MSG_COPY: Int = 16384

public const val NI_MAXHOST: UInt = 1025u

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val PACKET_MR_UNICAST: Int = 3

public const val PF_NFC: Int = 39

public const val PF_VSOCK: Int = 40

public const val RTLD_NOLOAD: Int = 0x00004

public const val RUSAGE_THREAD: Int = 1

public const val SHM_EXEC: Int = 32768

public const val SOCK_DCCP: Int = 6

public const val SOCK_PACKET: Int = 10

public const val TCP_COOKIE_TRANSACTIONS: Int = 15

public const val UDP_GRO: Int = 104

public const val UDP_SEGMENT: Int = 103

public const val PTHREAD_RWLOCK_PREFER_READER_NP: Int = 0

public const val PTHREAD_RWLOCK_PREFER_WRITER_NP: Int = 1

public const val PTHREAD_RWLOCK_PREFER_WRITER_NONRECURSIVE_NP: Int = 2

public const val PTHREAD_RWLOCK_DEFAULT_NP: Int = PTHREAD_RWLOCK_PREFER_WRITER_NP

public const val PTHREAD_MUTEX_TIMED_NP: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE_NP: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK_NP: Int = 2

public const val PTHREAD_MUTEX_ADAPTIVE_NP: Int = 3

public const val __LT_SPINLOCK_INIT: Int = 0

public val __LOCK_INITIALIZER: PthreadFastlock = PthreadFastlock(status = 0, spinlock = __LT_SPINLOCK_INIT)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mReserved = 0, mCount = 0, mOwner = null, mKind = PTHREAD_MUTEX_TIMED_NP, mLock = __LOCK_INITIALIZER)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __c_lock: __LOCK_INITIALIZER, __c_waiting: core::ptr::null, __padding: [0 (initializer represented at the FFI boundary)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwLock = __LOCK_INITIALIZER, rwReaders = 0, rwWriter = null, rwReadWaiting = null, rwWriteWaiting = null, rwKind = PTHREAD_RWLOCK_DEFAULT_NP, rwPshared = PTHREAD_PROCESS_PRIVATE)
