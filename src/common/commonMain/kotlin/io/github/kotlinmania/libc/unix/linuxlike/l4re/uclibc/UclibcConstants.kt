@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.linuxlike.MS_I_VERSION
import io.github.kotlinmania.libc.unix.linuxlike.MS_MANDLOCK
import io.github.kotlinmania.libc.unix.linuxlike.MS_RDONLY
import io.github.kotlinmania.libc.unix.linuxlike.MS_SYNCHRONOUS
import io.github.kotlinmania.libc.unix.linuxlike.PTHREAD_PROCESS_PRIVATE
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.B19200
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.B38400
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.EOPNOTSUPP
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.O_DIRECTORY
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val SIGEV_THREAD_ID: CInt = 4

public val AF_VSOCK: CInt = 40

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

// These are different than GNU!
public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 3

public val LC_COLLATE: CInt = 4

public val LC_MONETARY: CInt = 2

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

// end different section
// MS_ flags for mount(2)
public val MS_RMT_MASK: CUlong = MS_RDONLY or MS_SYNCHRONOUS or MS_MANDLOCK or MS_I_VERSION

public val ENOTSUP: CInt = EOPNOTSUPP

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

// Different than Gnu.
public val FILENAME_MAX: CUint = 4095u

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public val ST_RELATIME: CUlong = 4096uL

public val SO_TIMESTAMP: CInt = 29

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val PF_NFC: CInt = 39

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 256

public val EDEADLK: CInt = 0x23

public val EDEADLOCK: CInt = EDEADLK

public val EXTA: CUint = B19200

public val EXTB: CUint = B38400

public val EXTPROC: TcflagT = 65536u

public val FOPEN_MAX: CInt = 16

public val F_GETOWN: CInt = 9

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_SETOWN: CInt = 8

public val F_UNLCK: CInt = 2

public val F_WRLCK: CInt = 1

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val MAP_HUGE_SHIFT: CInt = 26

public val MAP_HUGE_MASK: CInt = 0x3f

public val MSG_COPY: CInt = 16384

public val NI_MAXHOST: SocklenT = 1025u

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val PACKET_MR_UNICAST: CInt = 3

public val PF_VSOCK: CInt = 40

public val RTLD_NOLOAD: CInt = 0x00004

public val RUSAGE_THREAD: CInt = 1

public val SHM_EXEC: CInt = 32768

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val UDP_GRO: CInt = 104

public val UDP_SEGMENT: CInt = 103

public val PTHREAD_RWLOCK_PREFER_READER_NP: CInt = 0

public val PTHREAD_RWLOCK_PREFER_WRITER_NP: CInt = 1

public val PTHREAD_RWLOCK_PREFER_WRITER_NONRECURSIVE_NP: CInt = 2

public val PTHREAD_RWLOCK_DEFAULT_NP: CInt = PTHREAD_RWLOCK_PREFER_WRITER_NP

public val PTHREAD_MUTEX_TIMED_NP: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE_NP: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK_NP: CInt = 2

public val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3

public val LT_SPINLOCK_INIT: CInt = 0

public val LOCK_INITIALIZER: PthreadFastlock = PthreadFastlock(status = 0L, spinlock = LT_SPINLOCK_INIT)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mReserved = 0, mCount = 0, mOwner = MutPtr(0L), mKind = PTHREAD_MUTEX_TIMED_NP, mLock = LOCK_INITIALIZER)

public val PTHREAD_COND_PADDING_SIZE: Int = 48 - sizeOf<PthreadFastlock>(typeLayoutT = PthreadFastlock.typeLayout()) - sizeOf<PthreadDescr>(typeLayoutT = PrimitiveLayouts.mutPtrLayout<CVoid>(64L)) - sizeOf<PthreadCondAlignT>(typeLayoutT = PrimitiveLayouts.I64)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(cLock = LOCK_INITIALIZER, cWaiting = MutPtr(0L), padding = UByteArray(PTHREAD_COND_PADDING_SIZE) { 0u.toUByte() }, align = 0L)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwLock = LOCK_INITIALIZER, rwReaders = 0, rwWriter = MutPtr(0L), rwReadWaiting = MutPtr(0L), rwWriteWaiting = MutPtr(0L), rwKind = PTHREAD_RWLOCK_DEFAULT_NP, rwPshared = PTHREAD_PROCESS_PRIVATE)
