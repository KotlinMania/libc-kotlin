package io.github.kotlinmania.libc.unix.linux_like.l4re.uclibc

import Off64T

public typealias ShmattT = CUlong

public typealias RegoffT = CInt

public typealias RlimT = CUlong

public typealias RlimitResourceT = CInt

public typealias PriorityWhichT = CUint

public typealias PthreadDescr = COpaquePointer?

public typealias PthreadCondAlignT = CLong

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (if (fromRef(this) == null) null else SiginfoSigfault()).siAddr
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoSiValue(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siTimerid: CInt,
        public var siOverrun: CInt,
        public var siValue: Sigval,
    )
    return (if (fromRef(this) == null) null else SiginfoSiValue()).siValue
}

public fun SiginfoT.sifields(): Sifields {
    return (if (fromRef(this) == null) null else SiginfoF()).sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}

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

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 256

public val EDEADLK: CInt = 0x23

public val EDEADLOCK: CInt = EDEADLK

public val EXTA: CUint = B19200

public val EXTB: CUint = B38400

public val EXTPROC: TcflagT = 65536

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

public val PF_NFC: CInt = 39

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

public val LOCK_INITIALIZER: PthreadFastlock = pthreadFastlock(status = 0, spinlock = LT_SPINLOCK_INIT)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(mReserved = 0, mCount = 0, mOwner = null, mKind = PTHREAD_MUTEX_TIMED_NP, mLock = LOCK_INITIALIZER)

public val PTHREAD_COND_PADDING_SIZE: Int = 48 - sizeOf<PthreadFastlock>() - sizeOf<PthreadDescr>() - sizeOf<PthreadCondAlignT>()

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(cLock = LOCK_INITIALIZER, cWaiting = null, padding = List(PTHREAD_COND_PADDING_SIZE) { 0 }, align = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(rwLock = LOCK_INITIALIZER, rwReaders = 0, rwWriter = null, rwReadWaiting = null, rwWriteWaiting = null, rwKind = PTHREAD_RWLOCK_DEFAULT_NP, rwPshared = PTHREAD_PROCESS_PRIVATE)

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getkind_np", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setkind_np", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("getrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("setrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}
