package io.github.kotlinmania.libc.unix.linux_like.linux.uclibc.x86_64

import off64T

// Definitions for uclibc on 64bit systems

public typealias BlkcntT = Long

public typealias BlksizeT = Long

public typealias ClockT = Long

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias FswordT = CLong

public typealias InoT = CUlong

public typealias NlinkT = CUint

public typealias OffT = CLong

// [uClibc docs] Note stat64 has the same shape as stat for x86-64.
public typealias Stat64 = Stat

public typealias SusecondsT = CLong

public typealias TimeT = CInt

public typealias WcharT = CInt

public typealias PthreadT = CUlong

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias U64 = CUlong

public typealias S64 = CLong

// constants
public val ENAMETOOLONG: CInt = 36

// File name too long
public val ENOTEMPTY: CInt = 39

// Directory not empty
public val ELOOP: CInt = 40

// Too many symbolic links encountered
public val EADDRINUSE: CInt = 98

// Address already in use
public val EADDRNOTAVAIL: CInt = 99

// Cannot assign requested address
public val ENETDOWN: CInt = 100

// Network is down
public val ENETUNREACH: CInt = 101

// Network is unreachable
public val ECONNABORTED: CInt = 103

// Software caused connection abort
public val ECONNREFUSED: CInt = 111

// Connection refused
public val ECONNRESET: CInt = 104

// Connection reset by peer
public val EDEADLK: CInt = 35

// Resource deadlock would occur
public val ENOSYS: CInt = 38

// Function not implemented
public val ENOTCONN: CInt = 107

// Transport endpoint is not connected
public val ETIMEDOUT: CInt = 110

// connection timed out
public val ESTALE: CInt = 116

// Stale file handle
public val EHOSTUNREACH: CInt = 113

// No route to host
public val EDQUOT: CInt = 122

// Quota exceeded
public val EOPNOTSUPP: CInt = 0x5f

public val ENODATA: CInt = 0x3d

public val O_APPEND: CInt = 1024

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x80000

public val O_CREAT: CInt = 100

public val O_DIRECTORY: CInt = 65536

public val O_EXCL: CInt = 128

public val O_NOFOLLOW: CInt = 0x20000

public val O_NONBLOCK: CInt = 2048

public val O_TRUNC: CInt = 512

public val NCCS: Int = 32

public val SIG_SETMASK: CInt = 2

// Set the set of blocked signals
public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SOCK_DGRAM: CInt = 2

// connectionless, unreliable datagrams
public val SOCK_STREAM: CInt = 1

// …/common/bits/socketType.h
public val SIZEOF_PTHREAD_COND_T: Int = 48

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_STACK_MIN: Int = 16384
