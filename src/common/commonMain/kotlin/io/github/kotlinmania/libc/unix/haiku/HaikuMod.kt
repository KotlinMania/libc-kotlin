package io.github.kotlinmania.libc.unix.haiku

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

// This module contains bindings to the native Haiku API. The Haiku API
// originates from BeOS, and it was the original way to perform low level
// system and IO operations. The POSIX API was in that era was like a
// compatibility layer. In current Haiku development, both the POSIX API and
// the Haiku API are considered to be co-equal status. However, they are not
// integrated like they are on other UNIX platforms, which means that for many
// low level concepts there are two versions, like processes (POSIX) and
// teams (Haiku), or pthreads and native threads.
//
// Both the POSIX API and the Haiku API live in libroot.so, the library that is
// linked to any binary by default. Additionally, Haiku supports several
// non-POSIX APIs from BSD and GNU, which live in libbsd.so and libgnu.so. These
// modules are also supported.
//
// The module is comprised of the following files:
// - `mod.rs` (this file) implements the C11 and POSIX API found in
// `headers / posix`
// - `b32.rs`, `b64.rs` and `x8664.rs` contain platform-specific definitions
// of the C11 and POSIX APIs
// - `native.rs` defines the native Haiku API that is implemented in
// `libroot.so` and that are found in `headers / os`.
// - `bsd.rs` defines the BSD customizations available on Haiku found in
// `headers / compatibility / bsd`
public typealias RlimT = UintptrT

public typealias SaFamilyT = UByte

public typealias PthreadKeyT = CInt

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias SpeedT = CUchar

public typealias ClockT = Int

public typealias ClockidT = Int

public typealias SusecondsT = Int

public typealias WcharT = Int

public typealias OffT = Long

public typealias InoT = Long

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = Int

public typealias ModeT = UInt

public typealias NlinkT = Int

public typealias UsecondsT = UInt

public typealias SocklenT = UInt

public typealias PthreadT = UintptrT

public typealias PthreadCondattrT = UintptrT

public typealias PthreadMutexattrT = UintptrT

public typealias PthreadRwlockattrT = UintptrT

public typealias SigsetT = ULong

public typealias FsblkcntT = Long

public typealias FsfilcntT = Long

public typealias PthreadAttrT = COpaquePointer?

public typealias NlItem = CInt

public typealias IdT = Int

public typealias IdtypeT = CInt

public typealias FdMask = UInt

public typealias RegoffT = CInt

public typealias KeyT = Int

public typealias MsgqnumT = UInt

public typealias MsglenT = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias Action = CInt

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public fun SiginfoT.siAddr(): COpaquePointer? {
    return this.siAddr
}

public fun SiginfoT.siPid(): PidT {
    return this.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.siStatus
}

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val L_SET: CInt = SEEK_SET

public val L_INCR: CInt = SEEK_CUR

public val L_XTND: CInt = SEEK_END

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_DUPFD: CInt = 0x0001

public val F_GETFD: CInt = 0x0002

public val F_SETFD: CInt = 0x0004

public val F_GETFL: CInt = 0x0008

public val F_SETFL: CInt = 0x0010

public val F_GETLK: CInt = 0x0020

public val F_SETLK: CInt = 0x0080

public val F_SETLKW: CInt = 0x0100

public val F_DUPFD_CLOEXEC: CInt = 0x0200

public val F_RDLCK: CInt = 0x0040

public val F_UNLCK: CInt = 0x0200

public val F_WRLCK: CInt = 0x0400

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x01

public val AT_SYMLINK_FOLLOW: CInt = 0x02

public val AT_REMOVEDIR: CInt = 0x04

public val AT_EACCESS: CInt = 0x08

public val POLLIN: CShort = 0x0001

public val POLLOUT: CShort = 0x0002

public val POLLRDNORM: CShort = POLLIN

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0008

public val POLLWRBAND: CShort = 0x0010

public val POLLPRI: CShort = 0x0020

public val POLLERR: CShort = 0x0004

public val POLLHUP: CShort = 0x0080

public val POLLNVAL: CShort = 0x1000

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val CLOCK_REALTIME: CInt = -1

public val CLOCK_MONOTONIC: CInt = 0

public val CLOCK_PROCESS_CPUTIME_ID: CInt = -2

public val CLOCK_THREAD_CPUTIME_ID: CInt = -3

public val RLIMIT_CORE: CInt = 0

public val RLIMIT_CPU: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_FSIZE: CInt = 3

public val RLIMIT_NOFILE: CInt = 4

public val RLIMIT_STACK: CInt = 5

public val RLIMIT_AS: CInt = 6

public val RLIM_INFINITY: RlimT = 0xffffffffuL

// Haiku specific
public val RLIMIT_NOVMON: CInt = 7

public val RLIM_NLIMITS: CInt = 8

public val RUSAGE_SELF: CInt = 0

public val RTLD_LAZY: CInt = 0

public val NCCS: Int = 11

public val O_RDONLY: CInt = 0x0000

public val O_WRONLY: CInt = 0x0001

public val O_RDWR: CInt = 0x0002

public val O_ACCMODE: CInt = 0x0003

public val O_EXCL: CInt = 0x0100

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_NOCTTY: CInt = 0x1000

public val O_NOTRAVERSE: CInt = 0x2000

public val O_CLOEXEC: CInt = 0x00000040

public val O_NONBLOCK: CInt = 0x00000080

public val O_APPEND: CInt = 0x00000800

public val O_SYNC: CInt = 0x00010000

public val O_RSYNC: CInt = 0x00020000

public val O_DSYNC: CInt = 0x00040000

public val O_NOFOLLOW: CInt = 0x00080000

public val O_NOCACHE: CInt = 0x00100000

public val O_DIRECTORY: CInt = 0x00200000

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGCHLD: CInt = 5

public val SIGABRT: CInt = 6

public val SIGPIPE: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSTOP: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGCONT: CInt = 12

public val SIGTSTP: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGTTIN: CInt = 16

public val SIGTTOU: CInt = 17

public val SIGUSR1: CInt = 18

public val SIGUSR2: CInt = 19

public val SIGWINCH: CInt = 20

public val SIGKILLTHR: CInt = 21

public val SIGTRAP: CInt = 22

public val SIGPOLL: CInt = 23

public val SIGPROF: CInt = 24

public val SIGSYS: CInt = 25

public val SIGURG: CInt = 26

public val SIGVTALRM: CInt = 27

public val SIGXCPU: CInt = 28

public val SIGXFSZ: CInt = 29

public val SIGBUS: CInt = 30

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

// Note(haiku): Haiku does not have MAP_FILE, but library/std/os.rs requires it
public val MAP_FILE: CInt = 0x00

public val MAP_SHARED: CInt = 0x01

public val MAP_PRIVATE: CInt = 0x02

public val MAP_FIXED: CInt = 0x04

public val MAP_ANONYMOUS: CInt = 0x08

public val MAP_NORESERVE: CInt = 0x10

public val MAP_ANON: CInt = MAP_ANONYMOUS

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MS_ASYNC: CInt = 0x01

public val MS_INVALIDATE: CInt = 0x04

public val MS_SYNC: CInt = 0x02

public val E2BIG: CInt = -2147454975

public val ECHILD: CInt = -2147454974

public val EDEADLK: CInt = -2147454973

public val EFBIG: CInt = -2147454972

public val EMLINK: CInt = -2147454971

public val ENFILE: CInt = -2147454970

public val ENODEV: CInt = -2147454969

public val ENOLCK: CInt = -2147454968

public val ENOSYS: CInt = -2147454967

public val ENOTTY: CInt = -2147454966

public val ENXIO: CInt = -2147454965

public val ESPIPE: CInt = -2147454964

public val ESRCH: CInt = -2147454963

public val EFPOS: CInt = -2147454962

public val ESIGPARM: CInt = -2147454961

public val EDOM: CInt = -2147454960

public val ERANGE: CInt = -2147454959

public val EPROTOTYPE: CInt = -2147454958

public val EPROTONOSUPPORT: CInt = -2147454957

public val EPFNOSUPPORT: CInt = -2147454956

public val EAFNOSUPPORT: CInt = -2147454955

public val EADDRINUSE: CInt = -2147454954

public val EADDRNOTAVAIL: CInt = -2147454953

public val ENETDOWN: CInt = -2147454952

public val ENETUNREACH: CInt = -2147454951

public val ENETRESET: CInt = -2147454950

public val ECONNABORTED: CInt = -2147454949

public val ECONNRESET: CInt = -2147454948

public val EISCONN: CInt = -2147454947

public val ENOTCONN: CInt = -2147454946

public val ESHUTDOWN: CInt = -2147454945

public val ECONNREFUSED: CInt = -2147454944

public val EHOSTUNREACH: CInt = -2147454943

public val ENOPROTOOPT: CInt = -2147454942

public val ENOBUFS: CInt = -2147454941

public val EINPROGRESS: CInt = -2147454940

public val EALREADY: CInt = -2147454939

public val EILSEQ: CInt = -2147454938

public val ENOMSG: CInt = -2147454937

public val ESTALE: CInt = -2147454936

public val EOVERFLOW: CInt = -2147454935

public val EMSGSIZE: CInt = -2147454934

public val EOPNOTSUPP: CInt = -2147454933

public val ENOTSOCK: CInt = -2147454932

public val EHOSTDOWN: CInt = -2147454931

public val EBADMSG: CInt = -2147454930

public val ECANCELED: CInt = -2147454929

public val EDESTADDRREQ: CInt = -2147454928

public val EDQUOT: CInt = -2147454927

public val EIDRM: CInt = -2147454926

public val EMULTIHOP: CInt = -2147454925

public val ENODATA: CInt = -2147454924

public val ENOLINK: CInt = -2147454923

public val ENOSR: CInt = -2147454922

public val ENOSTR: CInt = -2147454921

public val ENOTSUP: CInt = -2147454920

public val EPROTO: CInt = -2147454919

public val ETIME: CInt = -2147454918

public val ETXTBSY: CInt = -2147454917

public val ENOATTR: CInt = -2147454916

// INT_MIN
public val ENOMEM: CInt = -2147483648

// POSIX errors that can be mapped to BeOS error codes
public val EACCES: CInt = -2147483646

public val EINTR: CInt = -2147483638

public val EIO: CInt = -2147483647

public val EBUSY: CInt = -2147483634

public val EFAULT: CInt = -2147478783

public val ETIMEDOUT: CInt = -2147483639

public val EAGAIN: CInt = -2147483637

public val EWOULDBLOCK: CInt = -2147483637

public val EBADF: CInt = -2147459072

public val EEXIST: CInt = -2147459070

public val EINVAL: CInt = -2147483643

public val ENAMETOOLONG: CInt = -2147459068

public val ENOENT: CInt = -2147459069

public val EPERM: CInt = -2147483633

public val ENOTDIR: CInt = -2147459067

public val EISDIR: CInt = -2147459063

public val ENOTEMPTY: CInt = -2147459066

public val ENOSPC: CInt = -2147459065

public val EROFS: CInt = -2147459064

public val EMFILE: CInt = -2147459062

public val EXDEV: CInt = -2147459061

public val ELOOP: CInt = -2147459060

public val ENOEXEC: CInt = -2147478782

public val EPIPE: CInt = -2147459059

public val IPPROTO_RAW: CInt = 255

// These are prefixed with POSIX_ on Haiku
public val MADV_NORMAL: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_RANDOM: CInt = 3

public val MADV_WILLNEED: CInt = 4

public val MADV_DONTNEED: CInt = 5

public val MADV_FREE: CInt = 6

// https://github.com/haiku/haiku/blob/HEAD/headers/posix/net/if.h#L80
public val IFF_UP: CInt = 0x0001

public val IFF_BROADCAST: CInt = 0x0002

// valid broadcast address
public val IFF_LOOPBACK: CInt = 0x0008

public val IFF_POINTOPOINT: CInt = 0x0010

// point-to-point link
public val IFF_NOARP: CInt = 0x0040

// no address resolution
public val IFF_AUTOUP: CInt = 0x0080

// auto dial
public val IFF_PROMISC: CInt = 0x0100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x0200

// receive all multicast packets
public val IFF_SIMPLEX: CInt = 0x0800

// doesn't receive own transmissions
public val IFF_LINK: CInt = 0x1000

// has link
public val IFF_AUTO_CONFIGURED: CInt = 0x2000

public val IFF_CONFIGURING: CInt = 0x4000

public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 1

public val AF_APPLETALK: CInt = 2

public val AF_ROUTE: CInt = 3

public val AF_LINK: CInt = 4

public val AF_INET6: CInt = 5

public val AF_DLI: CInt = 6

public val AF_IPX: CInt = 7

public val AF_NOTIFY: CInt = 8

public val AF_LOCAL: CInt = 9

public val AF_UNIX: CInt = AF_LOCAL

public val AF_BLUETOOTH: CInt = 10

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_INET: CInt = AF_INET

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_INET6: CInt = AF_INET6

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = AF_UNIX

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_BLOCK_SOURCE: CInt = 14

public val IP_UNBLOCK_SOURCE: CInt = 15

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 16

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 17

public val TCP_NODELAY: CInt = 0x01

public val TCP_MAXSEG: CInt = 0x02

public val TCP_NOPUSH: CInt = 0x04

public val TCP_NOOPT: CInt = 0x08

public val IF_NAMESIZE: SizeT = 32uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val IPV6_MULTICAST_IF: CInt = 24

public val IPV6_MULTICAST_HOPS: CInt = 25

public val IPV6_MULTICAST_LOOP: CInt = 26

public val IPV6_UNICAST_HOPS: CInt = 27

public val IPV6_JOIN_GROUP: CInt = 28

public val IPV6_LEAVE_GROUP: CInt = 29

public val IPV6_V6ONLY: CInt = 30

public val IPV6_PKTINFO: CInt = 31

public val IPV6_RECVPKTINFO: CInt = 32

public val IPV6_HOPLIMIT: CInt = 33

public val IPV6_RECVHOPLIMIT: CInt = 34

public val IPV6_HOPOPTS: CInt = 35

public val IPV6_DSTOPTS: CInt = 36

public val IPV6_RTHDR: CInt = 37

public val MSG_OOB: CInt = 0x0001

public val MSG_PEEK: CInt = 0x0002

public val MSG_DONTROUTE: CInt = 0x0004

public val MSG_EOR: CInt = 0x0008

public val MSG_TRUNC: CInt = 0x0010

public val MSG_CTRUNC: CInt = 0x0020

public val MSG_WAITALL: CInt = 0x0040

public val MSG_DONTWAIT: CInt = 0x0080

public val MSG_BCAST: CInt = 0x0100

public val MSG_MCAST: CInt = 0x0200

public val MSG_EOF: CInt = 0x0400

public val MSG_NOSIGNAL: CInt = 0x0800

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 0x01

public val LOCK_EX: CInt = 0x02

public val LOCK_NB: CInt = 0x04

public val LOCK_UN: CInt = 0x08

public val MINSIGSTKSZ: SizeT = 8192uL

public val SIGSTKSZ: SizeT = 16384uL

public val IOV_MAX: CInt = 1024

public val PATH_MAX: CInt = 1024

public val SA_NOCLDSTOP: CInt = 0x01

public val SA_NOCLDWAIT: CInt = 0x02

public val SA_RESETHAND: CInt = 0x04

public val SA_NODEFER: CInt = 0x08

public val SA_RESTART: CInt = 0x10

public val SA_ONSTACK: CInt = 0x20

public val SA_SIGINFO: CInt = 0x40

public val SA_NOMASK: CInt = SA_NODEFER

public val SA_STACK: CInt = SA_ONSTACK

public val SA_ONESHOT: CInt = SA_RESETHAND

public val SS_ONSTACK: CInt = 0x1

public val SS_DISABLE: CInt = 0x2

// DIFF(main): changed to `cInt` in 500365e1
public val FD_SETSIZE: Int = 1024

public val RTLD_LOCAL: CInt = 0x0

public val RTLD_NOW: CInt = 0x1

public val RTLD_GLOBAL: CInt = 0x2

public val RTLD_DEFAULT: COpaquePointer? = null

public val BUFSIZ: CUint = 8192u

public val FILENAME_MAX: CUint = 256u

public val FOPEN_MAX: CUint = 128u

public val L_TMPNAM: CUint = 512u

public val TMP_MAX: CUint = 32768u

public val PC_CHOWN_RESTRICTED: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_NO_TRUNC: CInt = 5

public val PC_PATH_MAX: CInt = 6

public val PC_PIPE_BUF: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_LINK_MAX: CInt = 25

public val PC_SYNC_IO: CInt = 26

public val PC_ASYNC_IO: CInt = 27

public val PC_PRIO_IO: CInt = 28

public val PC_SOCK_MAXBUF: CInt = 29

public val PC_FILESIZEBITS: CInt = 30

public val PC_REC_INCR_XFER_SIZE: CInt = 31

public val PC_REC_MAX_XFER_SIZE: CInt = 32

public val PC_REC_MIN_XFER_SIZE: CInt = 33

public val PC_REC_XFER_ALIGN: CInt = 34

public val PC_ALLOC_SIZE_MIN: CInt = 35

public val PC_SYMLINK_MAX: CInt = 36

public val PC_2_SYMLINKS: CInt = 37

public val PC_XATTR_EXISTS: CInt = 38

public val PC_XATTR_ENABLED: CInt = 39

public val FIONBIO: CUlong = 0xbe000000uL

public val FIONREAD: CUlong = 0xbe000001uL

public val FIOSEEKDATA: CUlong = 0xbe000002uL

public val FIOSEEKHOLE: CUlong = 0xbe000003uL

public val SC_ARG_MAX: CInt = 15

public val SC_CHILD_MAX: CInt = 16

public val SC_CLK_TCK: CInt = 17

public val SC_JOB_CONTROL: CInt = 18

public val SC_NGROUPS_MAX: CInt = 19

public val SC_OPEN_MAX: CInt = 20

public val SC_SAVED_IDS: CInt = 21

public val SC_STREAM_MAX: CInt = 22

public val SC_TZNAME_MAX: CInt = 23

public val SC_VERSION: CInt = 24

public val SC_GETGR_R_SIZE_MAX: CInt = 25

public val SC_GETPW_R_SIZE_MAX: CInt = 26

public val SC_PAGESIZE: CInt = 27

public val SC_PAGE_SIZE: CInt = 27

public val SC_SEM_NSEMS_MAX: CInt = 28

public val SC_SEM_VALUE_MAX: CInt = 29

public val SC_SEMAPHORES: CInt = 30

public val SC_THREADS: CInt = 31

public val SC_IOV_MAX: CInt = 32

public val SC_UIO_MAXIOV: CInt = 32

public val SC_NPROCESSORS_CONF: CInt = 34

public val SC_NPROCESSORS_ONLN: CInt = 35

public val SC_ATEXIT_MAX: CInt = 37

public val SC_PASS_MAX: CInt = 39

public val SC_PHYS_PAGES: CInt = 40

public val SC_AVPHYS_PAGES: CInt = 41

public val SC_PIPE: CInt = 42

public val SC_SELECT: CInt = 43

public val SC_POLL: CInt = 44

public val SC_MAPPED_FILES: CInt = 45

public val SC_THREAD_PROCESS_SHARED: CInt = 46

public val SC_THREAD_STACK_MIN: CInt = 47

public val SC_THREAD_ATTR_STACKADDR: CInt = 48

public val SC_THREAD_ATTR_STACKSIZE: CInt = 49

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 50

public val SC_REALTIME_SIGNALS: CInt = 51

public val SC_MEMORY_PROTECTION: CInt = 52

public val SC_SIGQUEUE_MAX: CInt = 53

public val SC_RTSIG_MAX: CInt = 54

public val SC_MONOTONIC_CLOCK: CInt = 55

public val SC_DELAYTIMER_MAX: CInt = 56

public val SC_TIMER_MAX: CInt = 57

public val SC_TIMERS: CInt = 58

public val SC_CPUTIME: CInt = 59

public val SC_THREAD_CPUTIME: CInt = 60

public val SC_HOST_NAME_MAX: CInt = 61

public val SC_REGEXP: CInt = 62

public val SC_SYMLOOP_MAX: CInt = 63

public val SC_SHELL: CInt = 64

public val SC_TTY_NAME_MAX: CInt = 65

public val SC_ADVISORY_INFO: CInt = 66

public val SC_BARRIERS: CInt = 67

public val SC_CLOCK_SELECTION: CInt = 68

public val SC_FSYNC: CInt = 69

public val SC_IPV6: CInt = 70

public val SC_MEMLOCK: CInt = 71

public val SC_MEMLOCK_RANGE: CInt = 72

public val SC_MESSAGE_PASSING: CInt = 73

public val SC_PRIORITIZED_IO: CInt = 74

public val SC_PRIORITY_SCHEDULING: CInt = 75

public val SC_READER_WRITER_LOCKS: CInt = 76

public val SC_SHARED_MEMORY_OBJECTS: CInt = 77

public val SC_SPAWN: CInt = 78

public val SC_SPIN_LOCKS: CInt = 79

public val SC_SPORADIC_SERVER: CInt = 80

public val SC_SYNCHRONIZED_IO: CInt = 81

public val SC_THREAD_PRIO_INHERIT: CInt = 82

public val SC_THREAD_PRIO_PROTECT: CInt = 83

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 84

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 85

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 86

public val SC_THREAD_SPORADIC_SERVER: CInt = 87

public val SC_TIMEOUTS: CInt = 88

public val SC_TRACE: CInt = 89

public val SC_TRACE_EVENT_FILTER: CInt = 90

public val SC_TRACE_INHERIT: CInt = 91

public val SC_TRACE_LOG: CInt = 92

public val SC_TYPED_MEMORY_OBJECTS: CInt = 93

public val SC_V6_ILP32_OFF32: CInt = 94

public val SC_V6_ILP32_OFFBIG: CInt = 95

public val SC_V6_LP64_OFF64: CInt = 96

public val SC_V6_LPBIG_OFFBIG: CInt = 97

public val SC_V7_ILP32_OFF32: CInt = 98

public val SC_V7_ILP32_OFFBIG: CInt = 99

public val SC_V7_LP64_OFF64: CInt = 100

public val SC_V7_LPBIG_OFFBIG: CInt = 101

public val SC_2_C_BIND: CInt = 102

public val SC_2_C_DEV: CInt = 103

public val SC_2_CHAR_TERM: CInt = 104

public val SC_2_FORT_DEV: CInt = 105

public val SC_2_FORT_RUN: CInt = 106

public val SC_2_LOCALEDEF: CInt = 107

public val SC_2_PBS: CInt = 108

public val SC_2_PBS_ACCOUNTING: CInt = 109

public val SC_2_PBS_CHECKPOINT: CInt = 110

public val SC_2_PBS_LOCATE: CInt = 111

public val SC_2_PBS_MESSAGE: CInt = 112

public val SC_2_PBS_TRACK: CInt = 113

public val SC_2_SW_DEV: CInt = 114

public val SC_2_UPE: CInt = 115

public val SC_2_VERSION: CInt = 116

public val SC_XOPEN_CRYPT: CInt = 117

public val SC_XOPEN_ENH_I18N: CInt = 118

public val SC_XOPEN_REALTIME: CInt = 119

public val SC_XOPEN_REALTIME_THREADS: CInt = 120

public val SC_XOPEN_SHM: CInt = 121

public val SC_XOPEN_STREAMS: CInt = 122

public val SC_XOPEN_UNIX: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_XOPEN_VERSION: CInt = 125

public val SC_BC_BASE_MAX: CInt = 129

public val SC_BC_DIM_MAX: CInt = 130

public val SC_BC_SCALE_MAX: CInt = 131

public val SC_BC_STRING_MAX: CInt = 132

public val SC_COLL_WEIGHTS_MAX: CInt = 133

public val SC_EXPR_NEST_MAX: CInt = 134

public val SC_LINE_MAX: CInt = 135

public val SC_LOGIN_NAME_MAX: CInt = 136

public val SC_MQ_OPEN_MAX: CInt = 137

public val SC_MQ_PRIO_MAX: CInt = 138

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 139

public val SC_THREAD_KEYS_MAX: CInt = 140

public val SC_THREAD_THREADS_MAX: CInt = 141

public val SC_RE_DUP_MAX: CInt = 142

public val PTHREAD_STACK_MIN: SizeT = 8192uL

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(flags = 0, lock = 0, unused = 0, owner = -1, ownerCount = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(flags = 0, unused = 0, mutex = null, waiterCount = 0, lock = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(flags = 0, owner = -1, lockSem = 0, lockCount = 0, readerCount = 0, writerCount = 0, waiters = List(2) { null })

public val PTHREAD_MUTEX_DEFAULT: CInt = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 3

public val FIOCLEX: CUlong = 0uL

// Note(haiku): does not exist on Haiku!
public val RUSAGE_CHILDREN: CInt = -1

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_NONBLOCK: CInt = 0x00040000

public val SOCK_CLOEXEC: CInt = 0x00080000

public val SOL_SOCKET: CInt = -1

public val SO_ACCEPTCONN: CInt = 0x00000001

public val SO_BROADCAST: CInt = 0x00000002

public val SO_DEBUG: CInt = 0x00000004

public val SO_DONTROUTE: CInt = 0x00000008

public val SO_KEEPALIVE: CInt = 0x00000010

public val SO_OOBINLINE: CInt = 0x00000020

public val SO_REUSEADDR: CInt = 0x00000040

public val SO_REUSEPORT: CInt = 0x00000080

public val SO_USELOOPBACK: CInt = 0x00000100

public val SO_LINGER: CInt = 0x00000200

public val SO_SNDBUF: CInt = 0x40000001

public val SO_SNDLOWAT: CInt = 0x40000002

public val SO_SNDTIMEO: CInt = 0x40000003

public val SO_RCVBUF: CInt = 0x40000004

public val SO_RCVLOWAT: CInt = 0x40000005

public val SO_RCVTIMEO: CInt = 0x40000006

public val SO_ERROR: CInt = 0x40000007

public val SO_TYPE: CInt = 0x40000008

public val SO_NONBLOCK: CInt = 0x40000009

public val SO_BINDTODEVICE: CInt = 0x4000000a

public val SO_PEERCRED: CInt = 0x4000000b

public val SCM_RIGHTS: CInt = 0x01

public val SOMAXCONN: CInt = 32

public val NI_MAXHOST: SizeT = 1025uL

public val WNOHANG: CInt = 0x01

public val WUNTRACED: CInt = 0x02

public val WCONTINUED: CInt = 0x04

public val WEXITED: CInt = 0x08

public val WSTOPPED: CInt = 0x10

public val WNOWAIT: CInt = 0x20

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 40

public val BUS_ADRERR: CInt = 41

public val BUS_OBJERR: CInt = 42

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 60

public val CLD_KILLED: CInt = 61

public val CLD_DUMPED: CInt = 62

public val CLD_TRAPPED: CInt = 63

public val CLD_STOPPED: CInt = 64

public val CLD_CONTINUED: CInt = 65

public val P_ALL: IdtypeT = 0

public val P_PID: IdtypeT = 1

public val P_PGID: IdtypeT = 2

public val UTIME_OMIT: CLong = 1000000001L

public val UTIME_NOW: CLong = 1000000000L

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VEOL2: Int = 6

public val VSWTCH: Int = 7

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VSUSP: Int = 10

public val IGNBRK: TcflagT = 0x01u

public val BRKINT: TcflagT = 0x02u

public val IGNPAR: TcflagT = 0x04u

public val PARMRK: TcflagT = 0x08u

public val INPCK: TcflagT = 0x10u

public val ISTRIP: TcflagT = 0x20u

public val INLCR: TcflagT = 0x40u

public val IGNCR: TcflagT = 0x80u

public val ICRNL: TcflagT = 0x100u

public val IUCLC: TcflagT = 0x200u

public val IXON: TcflagT = 0x400u

public val IXANY: TcflagT = 0x800u

public val IXOFF: TcflagT = 0x1000u

public val OPOST: TcflagT = 0x00000001u

public val OLCUC: TcflagT = 0x00000002u

public val ONLCR: TcflagT = 0x00000004u

public val OCRNL: TcflagT = 0x00000008u

public val ONOCR: TcflagT = 0x00000010u

public val ONLRET: TcflagT = 0x00000020u

public val OFILL: TcflagT = 0x00000040u

public val OFDEL: TcflagT = 0x00000080u

public val NLDLY: TcflagT = 0x00000100u

public val NL0: TcflagT = 0x00000000u

public val NL1: TcflagT = 0x00000100u

public val CRDLY: TcflagT = 0x00000600u

public val CR0: TcflagT = 0x00000000u

public val CR1: TcflagT = 0x00000200u

public val CR2: TcflagT = 0x00000400u

public val CR3: TcflagT = 0x00000600u

public val TABDLY: TcflagT = 0x00001800u

public val TAB0: TcflagT = 0x00000000u

public val TAB1: TcflagT = 0x00000800u

public val TAB2: TcflagT = 0x00001000u

public val TAB3: TcflagT = 0x00001800u

public val BSDLY: TcflagT = 0x00002000u

public val BS0: TcflagT = 0x00000000u

public val BS1: TcflagT = 0x00002000u

public val VTDLY: TcflagT = 0x00004000u

public val VT0: TcflagT = 0x00000000u

public val VT1: TcflagT = 0x00004000u

public val FFDLY: TcflagT = 0x00008000u

public val FF0: TcflagT = 0x00000000u

public val FF1: TcflagT = 0x00008000u

public val CSIZE: TcflagT = 0x00000020u

public val CS5: TcflagT = 0x00000000u

public val CS6: TcflagT = 0x00000000u

public val CS7: TcflagT = 0x00000000u

public val CS8: TcflagT = 0x00000020u

public val CSTOPB: TcflagT = 0x00000040u

public val CREAD: TcflagT = 0x00000080u

public val PARENB: TcflagT = 0x00000100u

public val PARODD: TcflagT = 0x00000200u

public val HUPCL: TcflagT = 0x00000400u

public val CLOCAL: TcflagT = 0x00000800u

public val XLOBLK: TcflagT = 0x00001000u

public val CTSFLOW: TcflagT = 0x00002000u

public val RTSFLOW: TcflagT = 0x00004000u

public val CRTSCTS: TcflagT = RTSFLOW or CTSFLOW

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val XCASE: TcflagT = 0x00000004u

public val ECHO: TcflagT = 0x00000008u

public val ECHOE: TcflagT = 0x00000010u

public val ECHOK: TcflagT = 0x00000020u

public val ECHONL: TcflagT = 0x00000040u

public val NOFLSH: TcflagT = 0x00000080u

public val TOSTOP: TcflagT = 0x00000100u

public val IEXTEN: TcflagT = 0x00000200u

public val ECHOCTL: TcflagT = 0x00000400u

public val ECHOPRT: TcflagT = 0x00000800u

public val ECHOKE: TcflagT = 0x00001000u

public val FLUSHO: TcflagT = 0x00002000u

public val PENDIN: TcflagT = 0x00004000u

public val TCGB_CTS: CInt = 0x01

public val TCGB_DSR: CInt = 0x02

public val TCGB_RI: CInt = 0x04

public val TCGB_DCD: CInt = 0x08

public val TIOCM_CTS: CInt = TCGB_CTS

public val TIOCM_CD: CInt = TCGB_DCD

public val TIOCM_CAR: CInt = TCGB_DCD

public val TIOCM_RI: CInt = TCGB_RI

public val TIOCM_RNG: CInt = TCGB_RI

public val TIOCM_DSR: CInt = TCGB_DSR

public val TIOCM_DTR: CInt = 0x10

public val TIOCM_RTS: CInt = 0x20

public val B0: SpeedT = 0x00u

public val B50: SpeedT = 0x01u

public val B75: SpeedT = 0x02u

public val B110: SpeedT = 0x03u

public val B134: SpeedT = 0x04u

public val B150: SpeedT = 0x05u

public val B200: SpeedT = 0x06u

public val B300: SpeedT = 0x07u

public val B600: SpeedT = 0x08u

public val B1200: SpeedT = 0x09u

public val B1800: SpeedT = 0x0Au

public val B2400: SpeedT = 0x0Bu

public val B4800: SpeedT = 0x0Cu

public val B9600: SpeedT = 0x0Du

public val B19200: SpeedT = 0x0Eu

public val B38400: SpeedT = 0x0Fu

public val B57600: SpeedT = 0x10u

public val B115200: SpeedT = 0x11u

public val B230400: SpeedT = 0x12u

public val B31250: SpeedT = 0x13u

public val TCSANOW: CInt = 0x01

public val TCSADRAIN: CInt = 0x02

public val TCSAFLUSH: CInt = 0x04

public val TCOOFF: CInt = 0x01

public val TCOON: CInt = 0x02

public val TCIOFF: CInt = 0x04

public val TCION: CInt = 0x08

public val TCIFLUSH: CInt = 0x01

public val TCOFLUSH: CInt = 0x02

public val TCIOFLUSH: CInt = 0x03

public val TCGETA: CUlong = 0x8000uL

public val TCSETA: CUlong = TCGETA + 1uL

public val TCSETAF: CUlong = TCGETA + 2uL

public val TCSETAW: CUlong = TCGETA + 3uL

public val TCSBRK: CUlong = TCGETA + 5uL

public val TCFLSH: CUlong = TCGETA + 6uL

public val TCXONC: CUlong = TCGETA + 7uL

public val TCGETBITS: CUlong = TCGETA + 9uL

public val TCSETDTR: CUlong = TCGETA + 10uL

public val TCSETRTS: CUlong = TCGETA + 11uL

public val TIOCGWINSZ: CUlong = TCGETA + 12uL

public val TIOCSWINSZ: CUlong = TCGETA + 13uL

public val TIOCGPGRP: CUlong = TCGETA + 15uL

public val TIOCSPGRP: CUlong = TCGETA + 16uL

public val TIOCSCTTY: CUlong = TCGETA + 17uL

public val TIOCMGET: CUlong = TCGETA + 18uL

public val TIOCMSET: CUlong = TCGETA + 19uL

public val TIOCSBRK: CUlong = TCGETA + 20uL

public val TIOCCBRK: CUlong = TCGETA + 21uL

public val TIOCMBIS: CUlong = TCGETA + 22uL

public val TIOCMBIC: CUlong = TCGETA + 23uL

public val TIOCGSID: CUlong = TCGETA + 24uL

public val TIOCOUTQ: CUlong = TCGETA + 25uL

public val TIOCEXCL: CUlong = TCGETA + 26uL

public val TIOCNXCL: CUlong = TCGETA + 27uL

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

// utmpx entry types
public val EMPTY: CShort = 0

public val BOOT_TIME: CShort = 1

public val OLD_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val USER_PROCESS: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val DEAD_PROCESS: CShort = 7

public val LOG_PID: CInt = 1 shl 12

public val LOG_CONS: CInt = 2 shl 12

public val LOG_ODELAY: CInt = 4 shl 12

public val LOG_NDELAY: CInt = 8 shl 12

public val LOG_SERIAL: CInt = 16 shl 12

public val LOG_PERROR: CInt = 32 shl 12

public val LOG_NOWAIT: CInt = 64 shl 12

// spawn.h
// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x10

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public val POSIX_SPAWN_SETSID: CInt = 0x40

public fun cmsgAlign(len: Int): Int {
    return len + sizeOf<Int>() - 1 and (sizeOf<Int>() - 1).inv()
}

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getpriority(which: CInt, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: IdT, priority: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), priority.toLong())).toInt()
}

public fun endusershell() {
    LibcDynamicFfi.invoke("endusershell", -1, longArrayOf())
}

public fun getpass(prompt: String?): COpaquePointer? {
    val __cstr_0 = if (prompt == null) 0L else LibcDynamicFfi.allocUtf8CString(prompt)
    try {
        val rawRet = LibcDynamicFfi.invoke("getpass", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getusershell(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getusershell", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun issetugid(): CInt {
    return LibcDynamicFfi.invoke("issetugid", -1, longArrayOf()).toInt()
}

public fun setusershell() {
    LibcDynamicFfi.invoke("setusershell", -1, longArrayOf())
}

public fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(fd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun errnop(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("_errnop", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
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

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
}

public fun ppoll(fds: Pollfd?, numfds: NfdsT, timeout: Timespec?, sigMask: ULong?): CInt {
    val __slot_3 = if (sigMask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigMask.toLong())
    try {
        return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, numfds.toLong(), timeout?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun getspent(): Spwd? {
    val rawRet = LibcDynamicFfi.invoke("getspent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getspentR(pwd: Spwd?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getspent_r", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, bufferSize.toLong(), res?.value ?: 0L)).toInt()
}

public fun setspent() {
    LibcDynamicFfi.invoke("setspent", -1, longArrayOf())
}

public fun endspent() {
    LibcDynamicFfi.invoke("endspent", -1, longArrayOf())
}

public fun getspnam(name: String?): Spwd? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getspnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getspnamR(name: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getspnam_r", -1, longArrayOf(__cstr_0, spwd?.value ?: 0L, buffer?.value ?: 0L, bufferSize.toLong(), res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sgetspent(line: String?): Spwd? {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    try {
        val rawRet = LibcDynamicFfi.invoke("sgetspent", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sgetspentR(line: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    try {
        return LibcDynamicFfi.invoke("sgetspent_r", -1, longArrayOf(__cstr_0, spwd?.value ?: 0L, buffer?.value ?: 0L, bufferSize.toLong(), res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fgetspent(file: FILE?): Spwd? {
    val rawRet = LibcDynamicFfi.invoke("fgetspent", -1, longArrayOf(file?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetspent_r", -1, longArrayOf(file?.handle ?: 0L, spwd?.value ?: 0L, buffer?.value ?: 0L, bufferSize.toLong(), res?.value ?: 0L)).toInt()
}

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), dev.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGetcpuclockid(pid: PidT, clkId: Int?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCreate(thread: UintptrT?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (thread == null) 0L else LibcDynamicFfi.allocScalarSlot(thread.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setguardsize", -1, longArrayOf(attr?.value ?: 0L, guardsize.toLong())).toInt()
}

public fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadCondattrGetclock(attr: UintptrT?, clockId: Int?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: UintptrT?, clockId: ClockidT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(__slot_0, clockId.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun valloc(numBytes: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("valloc", -1, longArrayOf(numBytes.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgroups(ngroups: CInt, ptr: GidT?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun initgroups(name: String?, basegid: GidT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, basegid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_sigqueue", -1, longArrayOf(thread.toLong(), sig.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(lock?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree(pglob: GlobT?) {
    LibcDynamicFfi.invoke("globfree", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advice.toLong())).toInt()
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun accept4(socket: CInt, address: Sockaddr?, addressLength: UInt?, flags: CInt): CInt {
    val __slot_2 = if (addressLength == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLength.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2, flags.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, count.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, count.toLong()))
}

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, environment?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    val __slot_2 = if (grouplist == null) 0L else LibcDynamicFfi.allocScalarSlot(grouplist.toLong())
    val __slot_3 = if (groupcount == null) 0L else LibcDynamicFfi.allocScalarSlot(groupcount.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, basegroup.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun sigsuspend(mask: ULong?): CInt {
    val __slot_0 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
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

public fun pthreadSigmask(how: CInt, set: ULong?, oldset: ULong?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
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

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun sigwait(set: ULong?, sig: CInt?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
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

public fun sethostname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(__slot_0, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigwaitinfo(set: ULong?, info: SiginfoT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(__slot_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getitimer(which: CInt, currValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("getitimer", -1, longArrayOf(which.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("setitimer", -1, longArrayOf(which.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt {
    val __cstr_1 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("regcomp", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, cflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt {
    val __cstr_1 = if (input == null) 0L else LibcDynamicFfi.allocUtf8CString(input)
    try {
        return LibcDynamicFfi.invoke("regexec", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, nmatch.toLong(), pmatch?.value ?: 0L, eflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT {
    return LibcDynamicFfi.invoke("regerror", -1, longArrayOf(errcode.toLong(), preg?.value ?: 0L, errbuf?.value ?: 0L, errbufSize.toLong())).toULong()
}

public fun regfree(preg: RegexT?) {
    LibcDynamicFfi.invoke("regfree", -1, longArrayOf(preg?.value ?: 0L))
}

public fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt {
    return LibcDynamicFfi.invoke("msgctl", -1, longArrayOf(msqid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun msgget(key: KeyT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgget", -1, longArrayOf(key.toLong(), msgflg.toLong())).toInt()
}

public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT {
    return LibcDynamicFfi.invoke("msgrcv", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgtype, msgflg.toLong()))
}

public fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgsnd", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgflg.toLong())).toInt()
}

public fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt {
    return LibcDynamicFfi.invoke("semget", -1, longArrayOf(key.toLong(), nsems.toLong(), semflg.toLong())).toInt()
}

public fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("semctl", 3, longArrayOf(semid.toLong(), semnum.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

public fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt {
    return LibcDynamicFfi.invoke("semop", -1, longArrayOf(semid.toLong(), sops?.value ?: 0L, nsops.toLong())).toInt()
}

public fun ftok(pathname: String?, projId: CInt): KeyT {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("ftok", -1, longArrayOf(__cstr_0, projId.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? {
    val __slot_2 = if (nelp == null) 0L else LibcDynamicFfi.allocScalarSlot(nelp.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("lsearch", -1, longArrayOf(key?.value ?: 0L, base?.value ?: 0L, __slot_2, width.toLong(), compar?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? {
    val __slot_2 = if (nelp == null) 0L else LibcDynamicFfi.allocScalarSlot(nelp.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("lfind", -1, longArrayOf(key?.value ?: 0L, base?.value ?: 0L, __slot_2, width.toLong(), compar?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun hcreate(nelt: SizeT): CInt {
    return LibcDynamicFfi.invoke("hcreate", -1, longArrayOf(nelt.toLong())).toInt()
}

public fun hdestroy() {
    LibcDynamicFfi.invoke("hdestroy", -1, longArrayOf())
}

public fun hsearch(entry: Entry, action: Action): Entry? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("hsearch", -1, longArrayOf(__scratch_0, action.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun drand48(): CDouble {
    return LibcDynamicFfi.invokeFp("drand48", 0, false, longArrayOf())
}

public fun erand48(xseed: CUshort?): CDouble {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invokeFp("erand48", 0, false, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lrand48(): CLong {
    return LibcDynamicFfi.invoke("lrand48", -1, longArrayOf())
}

public fun nrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("nrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mrand48(): CLong {
    return LibcDynamicFfi.invoke("mrand48", -1, longArrayOf())
}

public fun jrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("jrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun srand48(seed: CLong) {
    LibcDynamicFfi.invoke("srand48", -1, longArrayOf(seed))
}

public fun seed48(xseed: CUshort?): CUshort? {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("seed48", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lcong48(p: CUshort?) {
    val __slot_0 = if (p == null) 0L else LibcDynamicFfi.allocScalarSlot(p.toLong())
    try {
        LibcDynamicFfi.invoke("lcong48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun ctermid(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ctermid", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun getpagesize(): CInt {
    return LibcDynamicFfi.invoke("getpagesize", -1, longArrayOf()).toInt()
}

public fun brk(addr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("brk", -1, longArrayOf(addr?.value ?: 0L)).toInt()
}

public fun sbrk(increment: IntptrT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sbrk", -1, longArrayOf(increment))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("posix_spawnp", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_init", -1, longArrayOf(fileActions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_destroy", -1, longArrayOf(fileActions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addopen", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong(), __cstr_2, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclose", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong())).toInt()
}

public fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_adddup2", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong(), newfildes.toLong())).toInt()
}

public fun posixSpawnattrInit(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getflags", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setflags", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt {
    val __slot_1 = if (pgroup == null) 0L else LibcDynamicFfi.allocScalarSlot(pgroup.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getpgroup", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setpgroup", -1, longArrayOf(attr?.value ?: 0L, pgroup.toLong())).toInt()
}

public fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt {
    val __slot_1 = if (sigdefault == null) 0L else LibcDynamicFfi.allocScalarSlot(sigdefault.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt {
    val __slot_1 = if (sigdefault == null) 0L else LibcDynamicFfi.allocScalarSlot(sigdefault.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt {
    val __slot_1 = if (sigmask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigmask.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt {
    val __slot_1 = if (sigmask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigmask.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt {
    val __cstr_2 = if (optstring == null) 0L else LibcDynamicFfi.allocUtf8CString(optstring)
    val __slot_4 = if (longindex == null) 0L else LibcDynamicFfi.allocScalarSlot(longindex.toLong())
    try {
        return LibcDynamicFfi.invoke("getopt_long", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2, longopts?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt {
    val __cstr_0 = if (string1 == null) 0L else LibcDynamicFfi.allocUtf8CString(string1)
    val __cstr_1 = if (string2 == null) 0L else LibcDynamicFfi.allocUtf8CString(string2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, locale?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt {
    val __cstr_0 = if (string1 == null) 0L else LibcDynamicFfi.allocUtf8CString(string1)
    val __cstr_1 = if (string2 == null) 0L else LibcDynamicFfi.allocUtf8CString(string2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, length.toLong(), locale?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(source?.value ?: 0L, sourceLength.toLong(), search?.value ?: 0L, searchLength.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(thread.toLong(), attr?.value ?: 0L)).toInt()
}

public fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(thread.toLong(), buffer?.value ?: 0L, length.toLong())).toInt()
}

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(thread.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}
