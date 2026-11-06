package io.github.kotlinmania.libc

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public typealias BlkcntT = Int

public typealias BlksizeT = Int

public typealias ClockidT = CUlong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = UInt

public typealias IdT = UInt

public typealias KeyT = CInt

public typealias LoffT = CLonglong

public typealias ModeT = CUint

public typealias NfdsT = UInt

public typealias NlinkT = CUshort

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias RlimT = UInt

public typealias SocklenT = UInt

public typealias SpeedT = UInt

public typealias SusecondsT = Int

public typealias UsecondsT = UInt

// unverified constants
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { PTHREAD_INITIALIZER_BYTE })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { PTHREAD_INITIALIZER_BYTE })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(size = List(SIZEOF_PTHREAD_RWLOCK_T) { PTHREAD_INITIALIZER_BYTE })

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_MUTEX_HAVE_PREV: Int = 1

public val PTHREAD_RWLOCK_INT_FLAGS_SHARED: Int = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

// intentionally not public, only used for fdSet
public val ULONG_SIZE: Int = 32

// Other constants
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENOLINK: CInt = 67

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 74

public val EBADMSG: CInt = 77

public val EFTYPE: CInt = 79

public val ENOSYS: CInt = 88

public val ENOTEMPTY: CInt = 90

public val ENAMETOOLONG: CInt = 91

public val ELOOP: CInt = 92

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EAFNOSUPPORT: CInt = 106

public val EPROTOTYPE: CInt = 107

public val ENOTSOCK: CInt = 108

public val ENOPROTOOPT: CInt = 109

public val ECONNREFUSED: CInt = 111

public val EADDRINUSE: CInt = 112

public val ECONNABORTED: CInt = 113

public val ENETUNREACH: CInt = 114

public val ENETDOWN: CInt = 115

public val ETIMEDOUT: CInt = 116

public val EHOSTDOWN: CInt = 117

public val EHOSTUNREACH: CInt = 118

public val EINPROGRESS: CInt = 119

public val EALREADY: CInt = 120

public val EDESTADDRREQ: CInt = 121

public val EMSGSIZE: CInt = 122

public val EPROTONOSUPPORT: CInt = 123

public val EADDRNOTAVAIL: CInt = 125

public val ENETRESET: CInt = 126

public val EISCONN: CInt = 127

public val ENOTCONN: CInt = 128

public val ETOOMANYREFS: CInt = 129

public val EDQUOT: CInt = 132

public val ESTALE: CInt = 133

public val ENOTSUP: CInt = 134

public val EILSEQ: CInt = 138

public val EOVERFLOW: CInt = 139

public val ECANCELED: CInt = 140

public val ENOTRECOVERABLE: CInt = 141

public val EOWNERDEAD: CInt = 142

public val EWOULDBLOCK: CInt = 11

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_RGETLK: CInt = 10

public val F_RSETLK: CInt = 11

public val F_CNVT: CInt = 12

public val F_RSETLKW: CInt = 13

public val F_DUPFD_CLOEXEC: CInt = 14

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 512

public val O_TRUNC: CInt = 1024

public val O_EXCL: CInt = 2048

public val O_SYNC: CInt = 8192

public val O_NONBLOCK: CInt = 16384

public val O_ACCMODE: CInt = 3

public val RTLD_LAZY: CInt = 0x1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val FIOCLEX: CUlong = 0x20006601uL

public val FIONCLEX: CUlong = 0x20006602uL

public val S_BLKSIZE: ModeT = 1024u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_ENFMT: ModeT = 1024u

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val SOL_TCP: CInt = 6

public val PF_UNSPEC: CInt = 0

public val PF_INET: CInt = 2

public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 2

public val CLOCK_REALTIME: ClockidT = 1uL

public val CLOCK_MONOTONIC: ClockidT = 4uL

public val CLOCK_BOOTTIME: ClockidT = 4uL

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SO_BINTIME: CInt = 0x2000

public val SO_NO_OFFLOAD: CInt = 0x4000

public val SO_NO_DDP: CInt = 0x8000

public val SO_REUSEPORT_LB: CInt = 0x10000

public val SO_LABEL: CInt = 0x1009

public val SO_PEERLABEL: CInt = 0x1010

public val SO_LISTENQLIMIT: CInt = 0x1011

public val SO_LISTENQLEN: CInt = 0x1012

public val SO_LISTENINCQLEN: CInt = 0x1013

public val SO_SETFIB: CInt = 0x1014

public val SO_USER_COOKIE: CInt = 0x1015

public val SO_PROTOCOL: CInt = 0x1016

public val SO_PROTOTYPE: CInt = SO_PROTOCOL

public val SO_VENDOR: CInt = 0x80000000

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_NOSIGPIPE: CInt = 0x0800

public val SO_ACCEPTFILTER: CInt = 0x1000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_TYPE: CInt = 0x1008

public val SOCK_CLOEXEC: CInt = O_CLOEXEC

public val INET_ADDRSTRLEN: CInt = 16

// https://github.com/bminor/newlib/blob/HEAD/newlib/libc/sys/linux/include/net/if.h#L121
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_V6ONLY: CInt = 27

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

public val NO_ADDRESS: CInt = 2

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

public val NI_NOFQDN: CInt = 1

public val NI_NUMERICHOST: CInt = 2

public val NI_NAMEREQD: CInt = 4

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(fd.toLong(), addr?.value ?: 0L, len.toLong())).toInt()
}

public fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGetres(clockId: ClockidT, res: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clockId.toLong(), res?.value ?: 0L)).toInt()
}

public fun closesocket(sockfd: CInt): CInt {
    return LibcDynamicFfi.invoke("closesocket", -1, longArrayOf(sockfd.toLong())).toInt()
}

public fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: UInt?): Long {
    val __slot_5 = if (addrLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrLen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, n.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread.toLong(), sig.toLong())).toInt()
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(set?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}
