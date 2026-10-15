package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 2147483647

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val L_SET: Int = SEEK_SET

public const val L_INCR: Int = SEEK_CUR

public const val L_XTND: Int = SEEK_END

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val F_DUPFD: Int = 0x0001

public const val F_GETFD: Int = 0x0002

public const val F_SETFD: Int = 0x0004

public const val F_GETFL: Int = 0x0008

public const val F_SETFL: Int = 0x0010

public const val F_GETLK: Int = 0x0020

public const val F_SETLK: Int = 0x0080

public const val F_SETLKW: Int = 0x0100

public const val F_DUPFD_CLOEXEC: Int = 0x0200

public const val F_RDLCK: Int = 0x0040

public const val F_UNLCK: Int = 0x0200

public const val F_WRLCK: Int = 0x0400

public const val AT_FDCWD: Int = -100

public const val AT_SYMLINK_NOFOLLOW: Int = 0x01

public const val AT_SYMLINK_FOLLOW: Int = 0x02

public const val AT_REMOVEDIR: Int = 0x04

public const val AT_EACCESS: Int = 0x08

public const val POLLIN: Short = 0x0001

public const val POLLOUT: Short = 0x0002

public const val POLLRDNORM: Short = POLLIN

public const val POLLWRNORM: Short = POLLOUT

public const val POLLRDBAND: Short = 0x0008

public const val POLLWRBAND: Short = 0x0010

public const val POLLPRI: Short = 0x0020

public const val POLLERR: Short = 0x0004

public const val POLLHUP: Short = 0x0080

public const val POLLNVAL: Short = 0x1000

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val CLOCK_REALTIME: Int = -1

public const val CLOCK_MONOTONIC: Int = 0

public const val CLOCK_PROCESS_CPUTIME_ID: Int = -2

public const val CLOCK_THREAD_CPUTIME_ID: Int = -3

public const val RLIMIT_CORE: Int = 0

public const val RLIMIT_CPU: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_FSIZE: Int = 3

public const val RLIMIT_NOFILE: Int = 4

public const val RLIMIT_STACK: Int = 5

public const val RLIMIT_AS: Int = 6

public const val RLIM_INFINITY: ULong = 0xffffffffuL

public const val RLIMIT_NOVMON: Int = 7

public const val RLIM_NLIMITS: Int = 8

public const val RUSAGE_SELF: Int = 0

public const val RTLD_LAZY: Int = 0

public const val NCCS: ULong = 11uL

public const val O_RDONLY: Int = 0x0000

public const val O_WRONLY: Int = 0x0001

public const val O_RDWR: Int = 0x0002

public const val O_ACCMODE: Int = 0x0003

public const val O_EXCL: Int = 0x0100

public const val O_CREAT: Int = 0x0200

public const val O_TRUNC: Int = 0x0400

public const val O_NOCTTY: Int = 0x1000

public const val O_NOTRAVERSE: Int = 0x2000

public const val O_CLOEXEC: Int = 0x00000040

public const val O_NONBLOCK: Int = 0x00000080

public const val O_APPEND: Int = 0x00000800

public const val O_SYNC: Int = 0x00010000

public const val O_RSYNC: Int = 0x00020000

public const val O_DSYNC: Int = 0x00040000

public const val O_NOFOLLOW: Int = 0x00080000

public const val O_NOCACHE: Int = 0x00100000

public const val O_DIRECTORY: Int = 0x00200000

public const val S_IFIFO: UInt = 4096u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFDIR: UInt = 16384u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFMT: UInt = 61440u

public const val S_IRWXU: UInt = 448u

public const val S_IRUSR: UInt = 256u

public const val S_IWUSR: UInt = 128u

public const val S_IXUSR: UInt = 64u

public const val S_IRWXG: UInt = 56u

public const val S_IRGRP: UInt = 32u

public const val S_IWGRP: UInt = 16u

public const val S_IXGRP: UInt = 8u

public const val S_IRWXO: UInt = 7u

public const val S_IROTH: UInt = 4u

public const val S_IWOTH: UInt = 2u

public const val S_IXOTH: UInt = 1u

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGCHLD: Int = 5

public const val SIGABRT: Int = 6

public const val SIGPIPE: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGSTOP: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGCONT: Int = 12

public const val SIGTSTP: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGTTIN: Int = 16

public const val SIGTTOU: Int = 17

public const val SIGUSR1: Int = 18

public const val SIGUSR2: Int = 19

public const val SIGWINCH: Int = 20

public const val SIGKILLTHR: Int = 21

public const val SIGTRAP: Int = 22

public const val SIGPOLL: Int = 23

public const val SIGPROF: Int = 24

public const val SIGSYS: Int = 25

public const val SIGURG: Int = 26

public const val SIGVTALRM: Int = 27

public const val SIGXCPU: Int = 28

public const val SIGXFSZ: Int = 29

public const val SIGBUS: Int = 30

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val SIG_SETMASK: Int = 3

public const val SIGEV_NONE: Int = 0

public const val SIGEV_SIGNAL: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val EAI_AGAIN: Int = 2

public const val EAI_BADFLAGS: Int = 3

public const val EAI_FAIL: Int = 4

public const val EAI_FAMILY: Int = 5

public const val EAI_MEMORY: Int = 6

public const val EAI_NODATA: Int = 7

public const val EAI_NONAME: Int = 8

public const val EAI_SERVICE: Int = 9

public const val EAI_SOCKTYPE: Int = 10

public const val EAI_SYSTEM: Int = 11

public const val EAI_OVERFLOW: Int = 14

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val LC_ALL: Int = 0

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MONETARY: Int = 3

public const val LC_NUMERIC: Int = 4

public const val LC_TIME: Int = 5

public const val LC_MESSAGES: Int = 6

public const val MAP_FILE: Int = 0x00

public const val MAP_SHARED: Int = 0x01

public const val MAP_PRIVATE: Int = 0x02

public const val MAP_FIXED: Int = 0x04

public const val MAP_ANONYMOUS: Int = 0x08

public const val MAP_NORESERVE: Int = 0x10

public const val MAP_ANON: Int = MAP_ANONYMOUS

public const val MS_ASYNC: Int = 0x01

public const val MS_INVALIDATE: Int = 0x04

public const val MS_SYNC: Int = 0x02

public const val E2BIG: Int = -2147454975

public const val ECHILD: Int = -2147454974

public const val EDEADLK: Int = -2147454973

public const val EFBIG: Int = -2147454972

public const val EMLINK: Int = -2147454971

public const val ENFILE: Int = -2147454970

public const val ENODEV: Int = -2147454969

public const val ENOLCK: Int = -2147454968

public const val ENOSYS: Int = -2147454967

public const val ENOTTY: Int = -2147454966

public const val ENXIO: Int = -2147454965

public const val ESPIPE: Int = -2147454964

public const val ESRCH: Int = -2147454963

public const val EFPOS: Int = -2147454962

public const val ESIGPARM: Int = -2147454961

public const val EDOM: Int = -2147454960

public const val ERANGE: Int = -2147454959

public const val EPROTOTYPE: Int = -2147454958

public const val EPROTONOSUPPORT: Int = -2147454957

public const val EPFNOSUPPORT: Int = -2147454956

public const val EAFNOSUPPORT: Int = -2147454955

public const val EADDRINUSE: Int = -2147454954

public const val EADDRNOTAVAIL: Int = -2147454953

public const val ENETDOWN: Int = -2147454952

public const val ENETUNREACH: Int = -2147454951

public const val ENETRESET: Int = -2147454950

public const val ECONNABORTED: Int = -2147454949

public const val ECONNRESET: Int = -2147454948

public const val EISCONN: Int = -2147454947

public const val ENOTCONN: Int = -2147454946

public const val ESHUTDOWN: Int = -2147454945

public const val ECONNREFUSED: Int = -2147454944

public const val EHOSTUNREACH: Int = -2147454943

public const val ENOPROTOOPT: Int = -2147454942

public const val ENOBUFS: Int = -2147454941

public const val EINPROGRESS: Int = -2147454940

public const val EALREADY: Int = -2147454939

public const val EILSEQ: Int = -2147454938

public const val ENOMSG: Int = -2147454937

public const val ESTALE: Int = -2147454936

public const val EOVERFLOW: Int = -2147454935

public const val EMSGSIZE: Int = -2147454934

public const val EOPNOTSUPP: Int = -2147454933

public const val ENOTSOCK: Int = -2147454932

public const val EHOSTDOWN: Int = -2147454931

public const val EBADMSG: Int = -2147454930

public const val ECANCELED: Int = -2147454929

public const val EDESTADDRREQ: Int = -2147454928

public const val EDQUOT: Int = -2147454927

public const val EIDRM: Int = -2147454926

public const val EMULTIHOP: Int = -2147454925

public const val ENODATA: Int = -2147454924

public const val ENOLINK: Int = -2147454923

public const val ENOSR: Int = -2147454922

public const val ENOSTR: Int = -2147454921

public const val ENOTSUP: Int = -2147454920

public const val EPROTO: Int = -2147454919

public const val ETIME: Int = -2147454918

public const val ETXTBSY: Int = -2147454917

public const val ENOATTR: Int = -2147454916

public const val ENOMEM: Int = -2147483648

public const val EACCES: Int = -2147483646

public const val EINTR: Int = -2147483638

public const val EIO: Int = -2147483647

public const val EBUSY: Int = -2147483634

public const val EFAULT: Int = -2147478783

public const val ETIMEDOUT: Int = -2147483639

public const val EAGAIN: Int = -2147483637

public const val EWOULDBLOCK: Int = -2147483637

public const val EBADF: Int = -2147459072

public const val EEXIST: Int = -2147459070

public const val EINVAL: Int = -2147483643

public const val ENAMETOOLONG: Int = -2147459068

public const val ENOENT: Int = -2147459069

public const val EPERM: Int = -2147483633

public const val ENOTDIR: Int = -2147459067

public const val EISDIR: Int = -2147459063

public const val ENOTEMPTY: Int = -2147459066

public const val ENOSPC: Int = -2147459065

public const val EROFS: Int = -2147459064

public const val EMFILE: Int = -2147459062

public const val EXDEV: Int = -2147459061

public const val ELOOP: Int = -2147459060

public const val ENOEXEC: Int = -2147478782

public const val EPIPE: Int = -2147459059

public const val IPPROTO_RAW: Int = 255

public const val MADV_NORMAL: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_RANDOM: Int = 3

public const val MADV_WILLNEED: Int = 4

public const val MADV_DONTNEED: Int = 5

public const val MADV_FREE: Int = 6

public const val IFF_UP: Int = 0x0001

public const val IFF_BROADCAST: Int = 0x0002

public const val IFF_LOOPBACK: Int = 0x0008

public const val IFF_POINTOPOINT: Int = 0x0010

public const val IFF_NOARP: Int = 0x0040

public const val IFF_AUTOUP: Int = 0x0080

public const val IFF_PROMISC: Int = 0x0100

public const val IFF_ALLMULTI: Int = 0x0200

public const val IFF_SIMPLEX: Int = 0x0800

public const val IFF_LINK: Int = 0x1000

public const val IFF_AUTO_CONFIGURED: Int = 0x2000

public const val IFF_CONFIGURING: Int = 0x4000

public const val IFF_MULTICAST: Int = 0x8000

public const val AF_UNSPEC: Int = 0

public const val AF_INET: Int = 1

public const val AF_APPLETALK: Int = 2

public const val AF_ROUTE: Int = 3

public const val AF_LINK: Int = 4

public const val AF_INET6: Int = 5

public const val AF_DLI: Int = 6

public const val AF_IPX: Int = 7

public const val AF_NOTIFY: Int = 8

public const val AF_LOCAL: Int = 9

public const val AF_UNIX: Int = AF_LOCAL

public const val AF_BLUETOOTH: Int = 10

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_INET: Int = AF_INET

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_LINK: Int = AF_LINK

public const val PF_INET6: Int = AF_INET6

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_UNIX: Int = AF_UNIX

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val IP_OPTIONS: Int = 1

public const val IP_HDRINCL: Int = 2

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_RECVOPTS: Int = 5

public const val IP_RECVRETOPTS: Int = 6

public const val IP_RECVDSTADDR: Int = 7

public const val IP_RETOPTS: Int = 8

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_BLOCK_SOURCE: Int = 14

public const val IP_UNBLOCK_SOURCE: Int = 15

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 16

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 17

public const val TCP_NODELAY: Int = 0x01

public const val TCP_MAXSEG: Int = 0x02

public const val TCP_NOPUSH: Int = 0x04

public const val TCP_NOOPT: Int = 0x08

public const val IF_NAMESIZE: ULong = 32uL

public const val IFNAMSIZ: ULong = IF_NAMESIZE

public const val IPV6_MULTICAST_IF: Int = 24

public const val IPV6_MULTICAST_HOPS: Int = 25

public const val IPV6_MULTICAST_LOOP: Int = 26

public const val IPV6_UNICAST_HOPS: Int = 27

public const val IPV6_JOIN_GROUP: Int = 28

public const val IPV6_LEAVE_GROUP: Int = 29

public const val IPV6_V6ONLY: Int = 30

public const val IPV6_PKTINFO: Int = 31

public const val IPV6_RECVPKTINFO: Int = 32

public const val IPV6_HOPLIMIT: Int = 33

public const val IPV6_RECVHOPLIMIT: Int = 34

public const val IPV6_HOPOPTS: Int = 35

public const val IPV6_DSTOPTS: Int = 36

public const val IPV6_RTHDR: Int = 37

public const val MSG_OOB: Int = 0x0001

public const val MSG_PEEK: Int = 0x0002

public const val MSG_DONTROUTE: Int = 0x0004

public const val MSG_EOR: Int = 0x0008

public const val MSG_TRUNC: Int = 0x0010

public const val MSG_CTRUNC: Int = 0x0020

public const val MSG_WAITALL: Int = 0x0040

public const val MSG_DONTWAIT: Int = 0x0080

public const val MSG_BCAST: Int = 0x0100

public const val MSG_MCAST: Int = 0x0200

public const val MSG_EOF: Int = 0x0400

public const val MSG_NOSIGNAL: Int = 0x0800

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val LOCK_SH: Int = 0x01

public const val LOCK_EX: Int = 0x02

public const val LOCK_NB: Int = 0x04

public const val LOCK_UN: Int = 0x08

public const val MINSIGSTKSZ: ULong = 8192uL

public const val SIGSTKSZ: ULong = 16384uL

public const val IOV_MAX: Int = 1024

public const val PATH_MAX: Int = 1024

public const val SA_NOCLDSTOP: Int = 0x01

public const val SA_NOCLDWAIT: Int = 0x02

public const val SA_RESETHAND: Int = 0x04

public const val SA_NODEFER: Int = 0x08

public const val SA_RESTART: Int = 0x10

public const val SA_ONSTACK: Int = 0x20

public const val SA_SIGINFO: Int = 0x40

public const val SA_NOMASK: Int = SA_NODEFER

public const val SA_STACK: Int = SA_ONSTACK

public const val SA_ONESHOT: Int = SA_RESETHAND

public const val SS_ONSTACK: Int = 0x1

public const val SS_DISABLE: Int = 0x2

public const val FD_SETSIZE: ULong = 1024uL

public const val RTLD_LOCAL: Int = 0x0

public const val RTLD_NOW: Int = 0x1

public const val RTLD_GLOBAL: Int = 0x2

public const val BUFSIZ: UInt = 8192u

public const val FILENAME_MAX: UInt = 256u

public const val FOPEN_MAX: UInt = 128u

public const val L_tmpnam: UInt = 512u

public const val TMP_MAX: UInt = 32768u

public const val _PC_CHOWN_RESTRICTED: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_NO_TRUNC: Int = 5

public const val _PC_PATH_MAX: Int = 6

public const val _PC_PIPE_BUF: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_LINK_MAX: Int = 25

public const val _PC_SYNC_IO: Int = 26

public const val _PC_ASYNC_IO: Int = 27

public const val _PC_PRIO_IO: Int = 28

public const val _PC_SOCK_MAXBUF: Int = 29

public const val _PC_FILESIZEBITS: Int = 30

public const val _PC_REC_INCR_XFER_SIZE: Int = 31

public const val _PC_REC_MAX_XFER_SIZE: Int = 32

public const val _PC_REC_MIN_XFER_SIZE: Int = 33

public const val _PC_REC_XFER_ALIGN: Int = 34

public const val _PC_ALLOC_SIZE_MIN: Int = 35

public const val _PC_SYMLINK_MAX: Int = 36

public const val _PC_2_SYMLINKS: Int = 37

public const val _PC_XATTR_EXISTS: Int = 38

public const val _PC_XATTR_ENABLED: Int = 39

public const val FIONBIO: ULong = 0xbe000000uL

public const val FIONREAD: ULong = 0xbe000001uL

public const val FIOSEEKDATA: ULong = 0xbe000002uL

public const val FIOSEEKHOLE: ULong = 0xbe000003uL

public const val _SC_ARG_MAX: Int = 15

public const val _SC_CHILD_MAX: Int = 16

public const val _SC_CLK_TCK: Int = 17

public const val _SC_JOB_CONTROL: Int = 18

public const val _SC_NGROUPS_MAX: Int = 19

public const val _SC_OPEN_MAX: Int = 20

public const val _SC_SAVED_IDS: Int = 21

public const val _SC_STREAM_MAX: Int = 22

public const val _SC_TZNAME_MAX: Int = 23

public const val _SC_VERSION: Int = 24

public const val _SC_GETGR_R_SIZE_MAX: Int = 25

public const val _SC_GETPW_R_SIZE_MAX: Int = 26

public const val _SC_PAGESIZE: Int = 27

public const val _SC_PAGE_SIZE: Int = 27

public const val _SC_SEM_NSEMS_MAX: Int = 28

public const val _SC_SEM_VALUE_MAX: Int = 29

public const val _SC_SEMAPHORES: Int = 30

public const val _SC_THREADS: Int = 31

public const val _SC_IOV_MAX: Int = 32

public const val _SC_UIO_MAXIOV: Int = 32

public const val _SC_NPROCESSORS_CONF: Int = 34

public const val _SC_NPROCESSORS_ONLN: Int = 35

public const val _SC_ATEXIT_MAX: Int = 37

public const val _SC_PASS_MAX: Int = 39

public const val _SC_PHYS_PAGES: Int = 40

public const val _SC_AVPHYS_PAGES: Int = 41

public const val _SC_PIPE: Int = 42

public const val _SC_SELECT: Int = 43

public const val _SC_POLL: Int = 44

public const val _SC_MAPPED_FILES: Int = 45

public const val _SC_THREAD_PROCESS_SHARED: Int = 46

public const val _SC_THREAD_STACK_MIN: Int = 47

public const val _SC_THREAD_ATTR_STACKADDR: Int = 48

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 49

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 50

public const val _SC_REALTIME_SIGNALS: Int = 51

public const val _SC_MEMORY_PROTECTION: Int = 52

public const val _SC_SIGQUEUE_MAX: Int = 53

public const val _SC_RTSIG_MAX: Int = 54

public const val _SC_MONOTONIC_CLOCK: Int = 55

public const val _SC_DELAYTIMER_MAX: Int = 56

public const val _SC_TIMER_MAX: Int = 57

public const val _SC_TIMERS: Int = 58

public const val _SC_CPUTIME: Int = 59

public const val _SC_THREAD_CPUTIME: Int = 60

public const val _SC_HOST_NAME_MAX: Int = 61

public const val _SC_REGEXP: Int = 62

public const val _SC_SYMLOOP_MAX: Int = 63

public const val _SC_SHELL: Int = 64

public const val _SC_TTY_NAME_MAX: Int = 65

public const val _SC_ADVISORY_INFO: Int = 66

public const val _SC_BARRIERS: Int = 67

public const val _SC_CLOCK_SELECTION: Int = 68

public const val _SC_FSYNC: Int = 69

public const val _SC_IPV6: Int = 70

public const val _SC_MEMLOCK: Int = 71

public const val _SC_MEMLOCK_RANGE: Int = 72

public const val _SC_MESSAGE_PASSING: Int = 73

public const val _SC_PRIORITIZED_IO: Int = 74

public const val _SC_PRIORITY_SCHEDULING: Int = 75

public const val _SC_READER_WRITER_LOCKS: Int = 76

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 77

public const val _SC_SPAWN: Int = 78

public const val _SC_SPIN_LOCKS: Int = 79

public const val _SC_SPORADIC_SERVER: Int = 80

public const val _SC_SYNCHRONIZED_IO: Int = 81

public const val _SC_THREAD_PRIO_INHERIT: Int = 82

public const val _SC_THREAD_PRIO_PROTECT: Int = 83

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 84

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 85

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 86

public const val _SC_THREAD_SPORADIC_SERVER: Int = 87

public const val _SC_TIMEOUTS: Int = 88

public const val _SC_TRACE: Int = 89

public const val _SC_TRACE_EVENT_FILTER: Int = 90

public const val _SC_TRACE_INHERIT: Int = 91

public const val _SC_TRACE_LOG: Int = 92

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 93

public const val _SC_V6_ILP32_OFF32: Int = 94

public const val _SC_V6_ILP32_OFFBIG: Int = 95

public const val _SC_V6_LP64_OFF64: Int = 96

public const val _SC_V6_LPBIG_OFFBIG: Int = 97

public const val _SC_V7_ILP32_OFF32: Int = 98

public const val _SC_V7_ILP32_OFFBIG: Int = 99

public const val _SC_V7_LP64_OFF64: Int = 100

public const val _SC_V7_LPBIG_OFFBIG: Int = 101

public const val _SC_2_C_BIND: Int = 102

public const val _SC_2_C_DEV: Int = 103

public const val _SC_2_CHAR_TERM: Int = 104

public const val _SC_2_FORT_DEV: Int = 105

public const val _SC_2_FORT_RUN: Int = 106

public const val _SC_2_LOCALEDEF: Int = 107

public const val _SC_2_PBS: Int = 108

public const val _SC_2_PBS_ACCOUNTING: Int = 109

public const val _SC_2_PBS_CHECKPOINT: Int = 110

public const val _SC_2_PBS_LOCATE: Int = 111

public const val _SC_2_PBS_MESSAGE: Int = 112

public const val _SC_2_PBS_TRACK: Int = 113

public const val _SC_2_SW_DEV: Int = 114

public const val _SC_2_UPE: Int = 115

public const val _SC_2_VERSION: Int = 116

public const val _SC_XOPEN_CRYPT: Int = 117

public const val _SC_XOPEN_ENH_I18N: Int = 118

public const val _SC_XOPEN_REALTIME: Int = 119

public const val _SC_XOPEN_REALTIME_THREADS: Int = 120

public const val _SC_XOPEN_SHM: Int = 121

public const val _SC_XOPEN_STREAMS: Int = 122

public const val _SC_XOPEN_UNIX: Int = 123

public const val _SC_XOPEN_UUCP: Int = 124

public const val _SC_XOPEN_VERSION: Int = 125

public const val _SC_BC_BASE_MAX: Int = 129

public const val _SC_BC_DIM_MAX: Int = 130

public const val _SC_BC_SCALE_MAX: Int = 131

public const val _SC_BC_STRING_MAX: Int = 132

public const val _SC_COLL_WEIGHTS_MAX: Int = 133

public const val _SC_EXPR_NEST_MAX: Int = 134

public const val _SC_LINE_MAX: Int = 135

public const val _SC_LOGIN_NAME_MAX: Int = 136

public const val _SC_MQ_OPEN_MAX: Int = 137

public const val _SC_MQ_PRIO_MAX: Int = 138

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 139

public const val _SC_THREAD_KEYS_MAX: Int = 140

public const val _SC_THREAD_THREADS_MAX: Int = 141

public const val _SC_RE_DUP_MAX: Int = 142

public const val PTHREAD_STACK_MIN: ULong = 8192uL

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(flags = 0u, lock = 0, owner = -1, ownerCount = 0)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { flags: 0, unused: Padding::uninit(), mutex: 0 as *mut _, waiter_count: 0, lock: 0, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { flags: 0, owner: -1, lock_sem: 0, lock_count: 0, reader_count: 0, writer_count: 0, waiters: [0 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_DEFAULT: Int = 0

public const val PTHREAD_MUTEX_NORMAL: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_RECURSIVE: Int = 3

public const val FIOCLEX: ULong = 0uL

public const val RUSAGE_CHILDREN: Int = -1

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_NONBLOCK: Int = 0x00040000

public const val SOCK_CLOEXEC: Int = 0x00080000

public const val SOL_SOCKET: Int = -1

public const val SO_ACCEPTCONN: Int = 0x00000001

public const val SO_BROADCAST: Int = 0x00000002

public const val SO_DEBUG: Int = 0x00000004

public const val SO_DONTROUTE: Int = 0x00000008

public const val SO_KEEPALIVE: Int = 0x00000010

public const val SO_OOBINLINE: Int = 0x00000020

public const val SO_REUSEADDR: Int = 0x00000040

public const val SO_REUSEPORT: Int = 0x00000080

public const val SO_USELOOPBACK: Int = 0x00000100

public const val SO_LINGER: Int = 0x00000200

public const val SO_SNDBUF: Int = 0x40000001

public const val SO_SNDLOWAT: Int = 0x40000002

public const val SO_SNDTIMEO: Int = 0x40000003

public const val SO_RCVBUF: Int = 0x40000004

public const val SO_RCVLOWAT: Int = 0x40000005

public const val SO_RCVTIMEO: Int = 0x40000006

public const val SO_ERROR: Int = 0x40000007

public const val SO_TYPE: Int = 0x40000008

public const val SO_NONBLOCK: Int = 0x40000009

public const val SO_BINDTODEVICE: Int = 0x4000000a

public const val SO_PEERCRED: Int = 0x4000000b

public const val SCM_RIGHTS: Int = 0x01

public const val SOMAXCONN: Int = 32

public const val NI_MAXHOST: ULong = 1025uL

public const val WNOHANG: Int = 0x01

public const val WUNTRACED: Int = 0x02

public const val WCONTINUED: Int = 0x04

public const val WEXITED: Int = 0x08

public const val WSTOPPED: Int = 0x10

public const val WNOWAIT: Int = 0x20

public const val BUS_ADRALN: Int = 40

public const val BUS_ADRERR: Int = 41

public const val BUS_OBJERR: Int = 42

public const val CLD_EXITED: Int = 60

public const val CLD_KILLED: Int = 61

public const val CLD_DUMPED: Int = 62

public const val CLD_TRAPPED: Int = 63

public const val CLD_STOPPED: Int = 64

public const val CLD_CONTINUED: Int = 65

public const val P_ALL: Int = 0.toInt()

public const val P_PID: Int = 1.toInt()

public const val P_PGID: Int = 2.toInt()

public const val UTIME_OMIT: Long = 1000000001

public const val UTIME_NOW: Long = 1000000000

public const val VINTR: ULong = 0uL

public const val VQUIT: ULong = 1uL

public const val VERASE: ULong = 2uL

public const val VKILL: ULong = 3uL

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 5uL

public const val VMIN: ULong = 4uL

public const val VTIME: ULong = 5uL

public const val VEOL2: ULong = 6uL

public const val VSWTCH: ULong = 7uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VSUSP: ULong = 10uL

public const val IGNBRK: UInt = 0x01u

public const val BRKINT: UInt = 0x02u

public const val IGNPAR: UInt = 0x04u

public const val PARMRK: UInt = 0x08u

public const val INPCK: UInt = 0x10u

public const val ISTRIP: UInt = 0x20u

public const val INLCR: UInt = 0x40u

public const val IGNCR: UInt = 0x80u

public const val ICRNL: UInt = 0x100u

public const val IUCLC: UInt = 0x200u

public const val IXON: UInt = 0x400u

public const val IXANY: UInt = 0x800u

public const val IXOFF: UInt = 0x1000u

public const val OPOST: UInt = 0x00000001u

public const val OLCUC: UInt = 0x00000002u

public const val ONLCR: UInt = 0x00000004u

public const val OCRNL: UInt = 0x00000008u

public const val ONOCR: UInt = 0x00000010u

public const val ONLRET: UInt = 0x00000020u

public const val OFILL: UInt = 0x00000040u

public const val OFDEL: UInt = 0x00000080u

public const val NLDLY: UInt = 0x00000100u

public const val NL0: UInt = 0x00000000u

public const val NL1: UInt = 0x00000100u

public const val CRDLY: UInt = 0x00000600u

public const val CR0: UInt = 0x00000000u

public const val CR1: UInt = 0x00000200u

public const val CR2: UInt = 0x00000400u

public const val CR3: UInt = 0x00000600u

public const val TABDLY: UInt = 0x00001800u

public const val TAB0: UInt = 0x00000000u

public const val TAB1: UInt = 0x00000800u

public const val TAB2: UInt = 0x00001000u

public const val TAB3: UInt = 0x00001800u

public const val BSDLY: UInt = 0x00002000u

public const val BS0: UInt = 0x00000000u

public const val BS1: UInt = 0x00002000u

public const val VTDLY: UInt = 0x00004000u

public const val VT0: UInt = 0x00000000u

public const val VT1: UInt = 0x00004000u

public const val FFDLY: UInt = 0x00008000u

public const val FF0: UInt = 0x00000000u

public const val FF1: UInt = 0x00008000u

public const val CSIZE: UInt = 0x00000020u

public const val CS5: UInt = 0x00000000u

public const val CS6: UInt = 0x00000000u

public const val CS7: UInt = 0x00000000u

public const val CS8: UInt = 0x00000020u

public const val CSTOPB: UInt = 0x00000040u

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val XLOBLK: UInt = 0x00001000u

public const val CTSFLOW: UInt = 0x00002000u

public const val RTSFLOW: UInt = 0x00004000u

public val CRTSCTS: UInt = RTSFLOW or CTSFLOW

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val XCASE: UInt = 0x00000004u

public const val ECHO: UInt = 0x00000008u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val NOFLSH: UInt = 0x00000080u

public const val TOSTOP: UInt = 0x00000100u

public const val IEXTEN: UInt = 0x00000200u

public const val ECHOCTL: UInt = 0x00000400u

public const val ECHOPRT: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00001000u

public const val FLUSHO: UInt = 0x00002000u

public const val PENDIN: UInt = 0x00004000u

public const val TCGB_CTS: Int = 0x01

public const val TCGB_DSR: Int = 0x02

public const val TCGB_RI: Int = 0x04

public const val TCGB_DCD: Int = 0x08

public const val TIOCM_CTS: Int = TCGB_CTS

public const val TIOCM_CD: Int = TCGB_DCD

public const val TIOCM_CAR: Int = TCGB_DCD

public const val TIOCM_RI: Int = TCGB_RI

public const val TIOCM_RNG: Int = TCGB_RI

public const val TIOCM_DSR: Int = TCGB_DSR

public const val TIOCM_DTR: Int = 0x10

public const val TIOCM_RTS: Int = 0x20

public const val B0: UByte = 0x00u

public const val B50: UByte = 0x01u

public const val B75: UByte = 0x02u

public const val B110: UByte = 0x03u

public const val B134: UByte = 0x04u

public const val B150: UByte = 0x05u

public const val B200: UByte = 0x06u

public const val B300: UByte = 0x07u

public const val B600: UByte = 0x08u

public const val B1200: UByte = 0x09u

public const val B1800: UByte = 0x0Au

public const val B2400: UByte = 0x0Bu

public const val B4800: UByte = 0x0Cu

public const val B9600: UByte = 0x0Du

public const val B19200: UByte = 0x0Eu

public const val B38400: UByte = 0x0Fu

public const val B57600: UByte = 0x10u

public const val B115200: UByte = 0x11u

public const val B230400: UByte = 0x12u

public const val B31250: UByte = 0x13u

public const val TCSANOW: Int = 0x01

public const val TCSADRAIN: Int = 0x02

public const val TCSAFLUSH: Int = 0x04

public const val TCOOFF: Int = 0x01

public const val TCOON: Int = 0x02

public const val TCIOFF: Int = 0x04

public const val TCION: Int = 0x08

public const val TCIFLUSH: Int = 0x01

public const val TCOFLUSH: Int = 0x02

public const val TCIOFLUSH: Int = 0x03

public const val TCGETA: ULong = 0x8000uL

public val TCSETA: ULong = TCGETA + 1u

public val TCSETAF: ULong = TCGETA + 2u

public val TCSETAW: ULong = TCGETA + 3u

public val TCSBRK: ULong = TCGETA + 5u

public val TCFLSH: ULong = TCGETA + 6u

public val TCXONC: ULong = TCGETA + 7u

public val TCGETBITS: ULong = TCGETA + 9u

public val TCSETDTR: ULong = TCGETA + 10u

public val TCSETRTS: ULong = TCGETA + 11u

public val TIOCGWINSZ: ULong = TCGETA + 12u

public val TIOCSWINSZ: ULong = TCGETA + 13u

public val TIOCGPGRP: ULong = TCGETA + 15u

public val TIOCSPGRP: ULong = TCGETA + 16u

public val TIOCSCTTY: ULong = TCGETA + 17u

public val TIOCMGET: ULong = TCGETA + 18u

public val TIOCMSET: ULong = TCGETA + 19u

public val TIOCSBRK: ULong = TCGETA + 20u

public val TIOCCBRK: ULong = TCGETA + 21u

public val TIOCMBIS: ULong = TCGETA + 22u

public val TIOCMBIC: ULong = TCGETA + 23u

public val TIOCGSID: ULong = TCGETA + 24u

public val TIOCOUTQ: ULong = TCGETA + 25u

public val TIOCEXCL: ULong = TCGETA + 26u

public val TIOCNXCL: ULong = TCGETA + 27u

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val EMPTY: Short = 0

public const val BOOT_TIME: Short = 1

public const val OLD_TIME: Short = 2

public const val NEW_TIME: Short = 3

public const val USER_PROCESS: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val DEAD_PROCESS: Short = 7

public val LOG_PID: Int = 1 shl 12

public val LOG_CONS: Int = 2 shl 12

public val LOG_ODELAY: Int = 4 shl 12

public val LOG_NDELAY: Int = 8 shl 12

public val LOG_SERIAL: Int = 16 shl 12

public val LOG_PERROR: Int = 32 shl 12

public val LOG_NOWAIT: Int = 64 shl 12

public const val POSIX_SPAWN_RESETIDS: Int = 0x01

public const val POSIX_SPAWN_SETPGROUP: Int = 0x02

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x10

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x20

public const val POSIX_SPAWN_SETSID: Int = 0x40
