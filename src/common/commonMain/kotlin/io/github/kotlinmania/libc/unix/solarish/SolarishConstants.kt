@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT

public val SIGINFO_DATA_SIZE: Int = 60

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK

public val DAY_1: NlItem = 1

public val DAY_2: NlItem = 2

public val DAY_3: NlItem = 3

public val DAY_4: NlItem = 4

public val DAY_5: NlItem = 5

public val DAY_6: NlItem = 6

public val DAY_7: NlItem = 7

public val ABDAY_1: NlItem = 8

public val ABDAY_2: NlItem = 9

public val ABDAY_3: NlItem = 10

public val ABDAY_4: NlItem = 11

public val ABDAY_5: NlItem = 12

public val ABDAY_6: NlItem = 13

public val ABDAY_7: NlItem = 14

public val MON_1: NlItem = 15

public val MON_2: NlItem = 16

public val MON_3: NlItem = 17

public val MON_4: NlItem = 18

public val MON_5: NlItem = 19

public val MON_6: NlItem = 20

public val MON_7: NlItem = 21

public val MON_8: NlItem = 22

public val MON_9: NlItem = 23

public val MON_10: NlItem = 24

public val MON_11: NlItem = 25

public val MON_12: NlItem = 26

public val ABMON_1: NlItem = 27

public val ABMON_2: NlItem = 28

public val ABMON_3: NlItem = 29

public val ABMON_4: NlItem = 30

public val ABMON_5: NlItem = 31

public val ABMON_6: NlItem = 32

public val ABMON_7: NlItem = 33

public val ABMON_8: NlItem = 34

public val ABMON_9: NlItem = 35

public val ABMON_10: NlItem = 36

public val ABMON_11: NlItem = 37

public val ABMON_12: NlItem = 38

public val RADIXCHAR: NlItem = 39

public val THOUSEP: NlItem = 40

public val YESSTR: NlItem = 41

public val NOSTR: NlItem = 42

public val CRNCYSTR: NlItem = 43

public val D_T_FMT: NlItem = 44

public val D_FMT: NlItem = 45

public val T_FMT: NlItem = 46

public val AM_STR: NlItem = 47

public val PM_STR: NlItem = 48

public val CODESET: NlItem = 49

public val T_FMT_AMPM: NlItem = 50

public val ERA: NlItem = 51

public val ERA_D_FMT: NlItem = 52

public val ERA_D_T_FMT: NlItem = 53

public val ERA_T_FMT: NlItem = 54

public val ALT_DIGITS: NlItem = 55

public val YESEXPR: NlItem = 56

public val NOEXPR: NlItem = 57

public val DATE_FMT: NlItem = 58

public val MAXSTRMSG: NlItem = 58

public val PATH_MAX: CInt = 1024

public val SA_ONSTACK: CInt = 0x00000001

public val SA_RESETHAND: CInt = 0x00000002

public val SA_RESTART: CInt = 0x00000004

public val SA_SIGINFO: CInt = 0x00000008

public val SA_NODEFER: CInt = 0x00000010

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SA_NOCLDSTOP: CInt = 0x00020000

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val FIOCLEX: CInt = 0x20006601

public val FIONCLEX: CInt = 0x20006602

public val FIONREAD: CInt = 0x4004667f

public val FIONBIO: CInt = 0x8004667e.toInt()

public val FIOASYNC: CInt = 0x8004667d.toInt()

public val FIOSETOWN: CInt = 0x8004667c.toInt()

public val FIOGETOWN: CInt = 0x4004667b

public val SIGCHLD: CInt = 18

public val SIGCLD: CInt = SIGCHLD

public val SIGBUS: CInt = 10

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val AIO_CANCELED: CInt = 0

public val AIO_ALLDONE: CInt = 1

public val AIO_NOTCANCELED: CInt = 2

public val LIO_NOP: CInt = 0

public val LIO_READ: CInt = 1

public val LIO_WRITE: CInt = 2

public val LIO_NOWAIT: CInt = 0

public val LIO_WAIT: CInt = 1

public val SIGEV_NONE: CInt = 1

public val SIGEV_SIGNAL: CInt = 2

public val SIGEV_THREAD: CInt = 3

public val SIGEV_PORT: CInt = 4

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val IP_RECVDSTADDR: CInt = 0x7

public val IP_PKTINFO: CInt = 0x1a

public val IP_DONTFRAG: CInt = 0x1b

public val IP_SEC_OPT: CInt = 0x22

public val IPV6_UNICAST_HOPS: CInt = 0x5

public val IPV6_MULTICAST_IF: CInt = 0x6

public val IPV6_MULTICAST_HOPS: CInt = 0x7

public val IPV6_MULTICAST_LOOP: CInt = 0x8

public val IPV6_PKTINFO: CInt = 0xb

public val IPV6_RECVPKTINFO: CInt = 0x12

public val IPV6_RECVTCLASS: CInt = 0x19

public val IPV6_DONTFRAG: CInt = 0x21

public val IPV6_SEC_OPT: CInt = 0x22

public val IPV6_TCLASS: CInt = 0x26

public val IPV6_V6ONLY: CInt = 0x27

public val IPV6_BOUND_IF: CInt = 0x41

public val FD_SETSIZE: Int = 65536

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 25u

public val TMP_MAX: CUint = 17576u

public val PIPE_BUF: CInt = 5120

public val GRND_NONBLOCK: CUint = 0x0001u

public val GRND_RANDOM: CUint = 0x0002u

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_NDELAY: CInt = 0x04

public val O_APPEND: CInt = 8

public val O_DSYNC: CInt = 0x40

public val O_RSYNC: CInt = 0x8000

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_TRUNC: CInt = 512

public val O_NOFOLLOW: CInt = 0x20000

public val O_SEARCH: CInt = 0x200000

public val O_EXEC: CInt = 0x400000

public val O_CLOEXEC: CInt = 0x800000

public val O_ACCMODE: CInt = 0x600003

public val O_XATTR: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x1000000

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_GETLK: CInt = 14

public val F_ALLOCSP: CInt = 10

public val F_FREESP: CInt = 11

public val F_BLOCKS: CInt = 18

public val F_BLKSIZE: CInt = 19

public val F_SHARE: CInt = 40

public val F_UNSHARE: CInt = 41

public val F_ISSTREAM: CInt = 13

public val F_PRIV: CInt = 15

public val F_NPRIV: CInt = 16

public val F_QUOTACTL: CInt = 17

public val F_GETOWN: CInt = 23

public val F_SETOWN: CInt = 24

public val F_REVOKE: CInt = 25

public val F_HASREMOTELOCKS: CInt = 26

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGPWR: CInt = 19

public val SIGWINCH: CInt = 20

public val SIGURG: CInt = 21

public val SIGPOLL: CInt = 22

public val SIGIO: CInt = SIGPOLL

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGCONT: CInt = 25

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val WNOHANG: CInt = 0x40

public val WUNTRACED: CInt = 0x04

public val WEXITED: CInt = 0x01

public val WTRAPPED: CInt = 0x02

public val WSTOPPED: CInt = WUNTRACED

public val WCONTINUED: CInt = 0x08

public val WNOWAIT: CInt = 0x80

public val AT_FDCWD: CInt = 0xffd19553.toInt()

public val AT_SYMLINK_NOFOLLOW: CInt = 0x1000

public val AT_SYMLINK_FOLLOW: CInt = 0x2000

public val AT_REMOVEDIR: CInt = 0x1

public val AT_TRIGGER: CInt = 0x2

public val AT_EACCESS: CInt = 0x4

public val P_PID: IdtypeT = 0u

public val P_PPID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val P_SID: IdtypeT = 3u

public val P_CID: IdtypeT = 4u

public val P_UID: IdtypeT = 5u

public val P_GID: IdtypeT = 6u

public val P_ALL: IdtypeT = 7u

public val P_LWPID: IdtypeT = 8u

public val P_TASKID: IdtypeT = 9u

public val P_PROJID: IdtypeT = 10u

public val P_POOLID: IdtypeT = 11u

public val P_ZONEID: IdtypeT = 12u

public val P_CTID: IdtypeT = 13u

public val P_CPUID: IdtypeT = 14u

public val P_PSETID: IdtypeT = 15u

public val PBIND_NONE: ProcessoridT = -1

public val PBIND_QUERY: ProcessoridT = -2

public val PS_NONE: CInt = -1

public val PS_QUERY: CInt = -2

public val PS_MYID: CInt = -3

public val PS_SOFT: CInt = -4

public val PS_HARD: CInt = -5

public val PS_QUERY_TYPE: CInt = -6

public val PS_PRIVATE: CInt = 2

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_NORESERVE: CInt = 0x40

public val MAP_ANON: CInt = 0x0100

public val MAP_ANONYMOUS: CInt = 0x0100

public val MAP_RENAME: CInt = 0x20

public val MAP_ALIGN: CInt = 0x200

public val MAP_TEXT: CInt = 0x400

public val MAP_INITDATA: CInt = 0x800

public val MAP_FAILED: COpaquePointer? = COpaquePointer((0.inv()).toLong())

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MMOBJ_PADDING: CUint = 0x10000u

public val MMOBJ_INTERPRET: CUint = 0x20000u

public val MR_PADDING: CUint = 0x1u

public val MR_HDR_ELF: CUint = 0x2u

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

public val ENOTBLK: CInt = 15

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

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ECANCELED: CInt = 47

public val ENOTSUP: CInt = 48

public val EDQUOT: CInt = 49

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

public val EOWNERDEAD: CInt = 58

public val ENOTRECOVERABLE: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val ELOCKUNMAPPED: CInt = 72

public val ENOTACTIVE: CInt = 73

public val EMULTIHOP: CInt = 74

public val EADI: CInt = 75

public val EBADMSG: CInt = 77

public val ENAMETOOLONG: CInt = 78

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ENOSYS: CInt = 89

public val ELOOP: CInt = 90

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val ENOTEMPTY: CInt = 93

public val EUSERS: CInt = 94

public val ENOTSOCK: CInt = 95

public val EDESTADDRREQ: CInt = 96

public val EMSGSIZE: CInt = 97

public val EPROTOTYPE: CInt = 98

public val ENOPROTOOPT: CInt = 99

public val EPROTONOSUPPORT: CInt = 120

public val ESOCKTNOSUPPORT: CInt = 121

public val EOPNOTSUPP: CInt = 122

public val EPFNOSUPPORT: CInt = 123

public val EAFNOSUPPORT: CInt = 124

public val EADDRINUSE: CInt = 125

public val EADDRNOTAVAIL: CInt = 126

public val ENETDOWN: CInt = 127

public val ENETUNREACH: CInt = 128

public val ENETRESET: CInt = 129

public val ECONNABORTED: CInt = 130

public val ECONNRESET: CInt = 131

public val ENOBUFS: CInt = 132

public val EISCONN: CInt = 133

public val ENOTCONN: CInt = 134

public val ESHUTDOWN: CInt = 143

public val ETOOMANYREFS: CInt = 144

public val ETIMEDOUT: CInt = 145

public val ECONNREFUSED: CInt = 146

public val EHOSTDOWN: CInt = 147

public val EHOSTUNREACH: CInt = 148

public val EWOULDBLOCK: CInt = EAGAIN

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

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

public val EAI_OVERFLOW: CInt = 12

public val NI_NOFQDN: CUint = 0x0001u

public val NI_NUMERICHOST: CUint = 0x0002u

public val NI_NAMEREQD: CUint = 0x0004u

public val NI_NUMERICSERV: CUint = 0x0008u

public val NI_DGRAM: CUint = 0x0010u

public val NI_WITHSCOPEID: CUint = 0x0020u

public val NI_NUMERICSCOPE: CUint = 0x0040u

public val F_DUPFD: CInt = 0

public val F_DUP2FD: CInt = 9

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETXFL: CInt = 45

public val SIGTRAP: CInt = 5

public val GLOB_APPEND: CInt = 32

public val GLOB_DOOFFS: CInt = 16

public val GLOB_ERR: CInt = 1

public val GLOB_MARK: CInt = 2

public val GLOB_NOCHECK: CInt = 8

public val GLOB_NOSORT: CInt = 4

public val GLOB_NOESCAPE: CInt = 64

public val GLOB_NOSPACE: CInt = -2

public val GLOB_ABORTED: CInt = -1

public val GLOB_NOMATCH: CInt = -3

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLNORM: CShort = 0x0040

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = 0x4

// POLLOUT
public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val POSIX_SPAWN_RESETIDS: CShort = 0x1

public val POSIX_SPAWN_SETPGROUP: CShort = 0x2

public val POSIX_SPAWN_SETSIGDEF: CShort = 0x4

public val POSIX_SPAWN_SETSIGMASK: CShort = 0x8

public val POSIX_SPAWN_SETSCHEDPARAM: CShort = 0x10

public val POSIX_SPAWN_SETSCHEDULER: CShort = 0x20

public val POSIX_SPAWN_SETSIGIGN_NP: CShort = 0x800

public val POSIX_SPAWN_NOSIGCHLD_NP: CShort = 0x1000

public val POSIX_SPAWN_WAITPID_NP: CShort = 0x2000

public val POSIX_SPAWN_NOEXECERR_NP: CShort = 0x4000

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 0x40

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CUshort = 0u

public val PTHREAD_STACK_MIN: SizeT = 4096uL

public val SIGSTKSZ: SizeT = 8192uL

// https://illumos.org/man/3c/clockGettime
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/lib/libc/amd64/sys/__clock_gettime.s
// clockGettime(3c) doesn't seem to accept anything other than CLOCK_REALTIME
// or __CLOCK_REALTIME0
//
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/uts/common/sys/timeImpl.h
// Confusing! CLOCK_HIGHRES==CLOCK_MONOTONIC==4
// __CLOCK_REALTIME0==0 is an obsoleted version of CLOCK_REALTIME==3
public val CLOCK_REALTIME: ClockidT = 3

public val CLOCK_MONOTONIC: ClockidT = 4

public val TIMER_RELTIME: CInt = 0

public val TIMER_ABSTIME: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_VMEM: CInt = 6

public val RLIMIT_AS: CInt = RLIMIT_VMEM

public val RLIM_NLIMITS: RlimT = 7uL

public val RLIM_INFINITY: RlimT = 0xfffffffffffffffduL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_ACCESS_DEFAULT: CInt = 6

public val MADV_ACCESS_LWP: CInt = 7

public val MADV_ACCESS_MANY: CInt = 8

public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_NBS: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_NIT: CInt = 17

public val AF_802: CInt = 18

public val AF_OSI: CInt = 19

public val AF_X25: CInt = 20

public val AF_OSINET: CInt = 21

public val AF_GOSIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_ROUTE: CInt = 24

public val AF_LINK: CInt = 25

public val AF_INET6: CInt = 26

public val AF_KEY: CInt = 27

public val AF_POLICY: CInt = 29

public val AF_INET_OFFLOAD: CInt = 30

public val AF_TRILL: CInt = 31

public val AF_PACKET: CInt = 32

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_LOCAL: CInt = PF_UNIX

public val PF_FILE: CInt = PF_UNIX

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_NBS: CInt = AF_NBS

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NIT: CInt = AF_NIT

public val PF_802: CInt = AF_802

public val PF_OSI: CInt = AF_OSI

public val PF_X25: CInt = AF_X25

public val PF_OSINET: CInt = AF_OSINET

public val PF_GOSIP: CInt = AF_GOSIP

public val PF_IPX: CInt = AF_IPX

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_INET6: CInt = AF_INET6

public val PF_KEY: CInt = AF_KEY

public val PF_POLICY: CInt = AF_POLICY

public val PF_INET_OFFLOAD: CInt = AF_INET_OFFLOAD

public val PF_TRILL: CInt = AF_TRILL

public val PF_PACKET: CInt = AF_PACKET

public val SOCK_DGRAM: CInt = 1

public val SOCK_STREAM: CInt = 2

public val SOCK_RAW: CInt = 4

public val SOCK_RDM: CInt = 5

public val SOCK_SEQPACKET: CInt = 6

public val IP_MULTICAST_IF: CInt = 16

public val IP_MULTICAST_TTL: CInt = 17

public val IP_MULTICAST_LOOP: CInt = 18

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_ADD_MEMBERSHIP: CInt = 19

public val IP_DROP_MEMBERSHIP: CInt = 20

public val IPV6_JOIN_GROUP: CInt = 9

public val IPV6_LEAVE_GROUP: CInt = 10

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 23

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 24

public val IP_BLOCK_SOURCE: CInt = 21

public val IP_UNBLOCK_SOURCE: CInt = 22

public val IP_BOUND_IF: CInt = 0x41

// These TCP socket options are common between illumos and Solaris, while higher
// numbers have generally diverged:
public val TCP_NODELAY: CInt = 0x1

public val TCP_MAXSEG: CInt = 0x2

public val TCP_KEEPALIVE: CInt = 0x8

public val TCP_NOTIFY_THRESHOLD: CInt = 0x10

public val TCP_ABORT_THRESHOLD: CInt = 0x11

public val TCP_CONN_NOTIFY_THRESHOLD: CInt = 0x12

public val TCP_CONN_ABORT_THRESHOLD: CInt = 0x13

public val TCP_RECVDSTADDR: CInt = 0x14

public val TCP_INIT_CWND: CInt = 0x15

public val TCP_KEEPALIVE_THRESHOLD: CInt = 0x16

public val TCP_KEEPALIVE_ABORT_THRESHOLD: CInt = 0x17

public val TCP_CORK: CInt = 0x18

public val TCP_RTO_INITIAL: CInt = 0x19

public val TCP_RTO_MIN: CInt = 0x1a

public val TCP_RTO_MAX: CInt = 0x1b

public val TCP_LINGER2: CInt = 0x1c

public val UDP_NAT_T_ENDPOINT: CInt = 0x0103

public val SOMAXCONN: CInt = 128

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_PROTOTYPE: CInt = 0x1009

public val SO_DOMAIN: CInt = 0x100c

public val SO_TIMESTAMP: CInt = 0x1013

public val SO_EXCLBIND: CInt = 0x1015

public val SCM_RIGHTS: CInt = 0x1010

public val SCM_UCRED: CInt = 0x1012

public val SCM_TIMESTAMP: CInt = SO_TIMESTAMP

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_CTRUNC: CInt = 0x10

public val MSG_TRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_NOTIFICATION: CInt = 0x100

public val MSG_NOSIGNAL: CInt = 0x200

public val MSG_DUPCTRL: CInt = 0x800

public val MSG_XPG4_2: CInt = 0x8000

public val MSG_MAXIOVLEN: CInt = 16

public val IF_NAMESIZE: SizeT = 32uL

public val IFNAMSIZ: SizeT = 16uL

// https://docs.oracle.com/cd/E23824_01/html/821-1475/if-7p.html
public val IFF_UP: CInt = 0x0000000001

// Address is up
public val IFF_BROADCAST: CInt = 0x0000000002

// Broadcast address valid
public val IFF_DEBUG: CInt = 0x0000000004

// Turn on debugging
public val IFF_LOOPBACK: CInt = 0x0000000008

// Loopback net
public val IFF_POINTOPOINT: CInt = 0x0000000010

// Interface is p-to-p
public val IFF_NOTRAILERS: CInt = 0x0000000020

// Avoid use of trailers
public val IFF_RUNNING: CInt = 0x0000000040

// Resources allocated
public val IFF_NOARP: CInt = 0x0000000080

// No address res. protocol
public val IFF_PROMISC: CInt = 0x0000000100

// Receive all packets
public val IFF_ALLMULTI: CInt = 0x0000000200

// Receive all multicast pkts
public val IFF_INTELLIGENT: CInt = 0x0000000400

// Protocol code on board
public val IFF_MULTICAST: CInt = 0x0000000800

// Supports multicast
// Multicast using broadcst. add.
public val IFF_MULTI_BCAST: CInt = 0x0000001000

public val IFF_UNNUMBERED: CInt = 0x0000002000

// Non-unique address
public val IFF_DHCPRUNNING: CInt = 0x0000004000

// DHCP controls interface
public val IFF_PRIVATE: CInt = 0x0000008000

// Do not advertise
public val IFF_NOXMIT: CInt = 0x0000010000

// Do not transmit pkts
// No address - just on-link subnet
public val IFF_NOLOCAL: CInt = 0x0000020000

public val IFF_DEPRECATED: CInt = 0x0000040000

// Address is deprecated
public val IFF_ADDRCONF: CInt = 0x0000080000

// Addr. from stateless addrconf
public val IFF_ROUTER: CInt = 0x0000100000

// Router on interface
public val IFF_NONUD: CInt = 0x0000200000

// No NUD on interface
public val IFF_ANYCAST: CInt = 0x0000400000

// Anycast address
public val IFF_NORTEXCH: CInt = 0x0000800000

// Don't xchange rout. info
public val IFF_IPV4: CInt = 0x0001000000

// IPv4 interface
public val IFF_IPV6: CInt = 0x0002000000

// IPv6 interface
public val IFF_NOFAILOVER: CInt = 0x0008000000

// in.mpathd test address
public val IFF_FAILED: CInt = 0x0010000000

// Interface has failed
public val IFF_STANDBY: CInt = 0x0020000000

// Interface is a hot-spare
public val IFF_INACTIVE: CInt = 0x0040000000

// Functioning but not used
public val IFF_OFFLINE: CInt = 0x0080000000.toInt()

// Interface is offline
// If CoS marking is supported
public val IFF_COS_ENABLED: CLonglong = 0x0200000000L

public val IFF_PREFERRED: CLonglong = 0x0400000000L

// Prefer as source addr.
public val IFF_TEMPORARY: CLonglong = 0x0800000000L

// RFC3041
public val IFF_FIXEDMTU: CLonglong = 0x1000000000L

// MTU set with SIOCSLIFMTU
public val IFF_VIRTUAL: CLonglong = 0x2000000000L

// Cannot send/receive pkts
public val IFF_DUPLICATE: CLonglong = 0x4000000000L

// Local address in use
public val IFF_IPMP: CLonglong = 0x8000000000L

// IPMP IP interface
// sys/ipc.h:
public val IPC_ALLOC: CInt = 0x8000

public val IPC_CREAT: CInt = 0x200

public val IPC_EXCL: CInt = 0x400

public val IPC_NOWAIT: CInt = 0x800

public val IPC_PRIVATE: KeyT = 0

public val IPC_RMID: CInt = 10

public val IPC_SET: CInt = 11

public val IPC_SEAT: CInt = 12

// sys/shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_SHARE_MMU: CInt = 16384

public val SHM_PAGEABLE: CInt = 32768

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val F_RDLCK: CShort = 1

public val F_WRLCK: CShort = 2

public val F_UNLCK: CShort = 3

public val O_SYNC: CInt = 16

public val O_NONBLOCK: CInt = 128

public val IPPROTO_RAW: CInt = 255

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_CHOWN_RESTRICTED: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SYNC_IO: CInt = 12

public val PC_ALLOC_SIZE_MIN: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_SYMLINK_MAX: CInt = 18

public val PC_2_SYMLINKS: CInt = 19

public val PC_ACL_ENABLED: CInt = 20

public val PC_MIN_HOLE_SIZE: CInt = 21

public val PC_CASE_BEHAVIOR: CInt = 22

public val PC_SATTR_ENABLED: CInt = 23

public val PC_SATTR_EXISTS: CInt = 24

public val PC_ACCESS_FILTERING: CInt = 25

public val PC_TIMESTAMP_RESOLUTION: CInt = 26

public val PC_FILESIZEBITS: CInt = 67

public val PC_XATTR_ENABLED: CInt = 100

public val PC_XATTR_EXISTS: CInt = 101

public val POSIX_VDISABLE: CcT = 0u

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_PASS_MAX: CInt = 9

public val SC_LOGNAME_MAX: CInt = 10

public val SC_PAGESIZE: CInt = 11

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_XOPEN_VERSION: CInt = 12

public val SC_NPROCESSORS_CONF: CInt = 14

public val SC_NPROCESSORS_ONLN: CInt = 15

public val SC_STREAM_MAX: CInt = 16

public val SC_TZNAME_MAX: CInt = 17

public val SC_AIO_LISTIO_MAX: CInt = 18

public val SC_AIO_MAX: CInt = 19

public val SC_AIO_PRIO_DELTA_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_DELAYTIMER_MAX: CInt = 22

public val SC_FSYNC: CInt = 23

public val SC_MAPPED_FILES: CInt = 24

public val SC_MEMLOCK: CInt = 25

public val SC_MEMLOCK_RANGE: CInt = 26

public val SC_MEMORY_PROTECTION: CInt = 27

public val SC_MESSAGE_PASSING: CInt = 28

public val SC_MQ_OPEN_MAX: CInt = 29

public val SC_MQ_PRIO_MAX: CInt = 30

public val SC_PRIORITIZED_IO: CInt = 31

public val SC_PRIORITY_SCHEDULING: CInt = 32

public val SC_REALTIME_SIGNALS: CInt = 33

public val SC_RTSIG_MAX: CInt = 34

public val SC_SEMAPHORES: CInt = 35

public val SC_SEM_NSEMS_MAX: CInt = 36

public val SC_SEM_VALUE_MAX: CInt = 37

public val SC_SHARED_MEMORY_OBJECTS: CInt = 38

public val SC_SIGQUEUE_MAX: CInt = 39

public val SC_SIGRT_MIN: CInt = 40

public val SC_SIGRT_MAX: CInt = 41

public val SC_SYNCHRONIZED_IO: CInt = 42

public val SC_TIMERS: CInt = 43

public val SC_TIMER_MAX: CInt = 44

public val SC_2_C_BIND: CInt = 45

public val SC_2_C_DEV: CInt = 46

public val SC_2_C_VERSION: CInt = 47

public val SC_2_FORT_DEV: CInt = 48

public val SC_2_FORT_RUN: CInt = 49

public val SC_2_LOCALEDEF: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_UPE: CInt = 52

public val SC_2_VERSION: CInt = 53

public val SC_BC_BASE_MAX: CInt = 54

public val SC_BC_DIM_MAX: CInt = 55

public val SC_BC_SCALE_MAX: CInt = 56

public val SC_BC_STRING_MAX: CInt = 57

public val SC_COLL_WEIGHTS_MAX: CInt = 58

public val SC_EXPR_NEST_MAX: CInt = 59

public val SC_LINE_MAX: CInt = 60

public val SC_RE_DUP_MAX: CInt = 61

public val SC_XOPEN_CRYPT: CInt = 62

public val SC_XOPEN_ENH_I18N: CInt = 63

public val SC_XOPEN_SHM: CInt = 64

public val SC_2_CHAR_TERM: CInt = 66

public val SC_XOPEN_XCU_VERSION: CInt = 67

public val SC_ATEXIT_MAX: CInt = 76

public val SC_IOV_MAX: CInt = 77

public val SC_XOPEN_UNIX: CInt = 78

public val SC_T_IOV_MAX: CInt = 79

public val SC_PHYS_PAGES: CInt = 500

public val SC_AVPHYS_PAGES: CInt = 501

public val SC_COHER_BLKSZ: CInt = 503

public val SC_SPLIT_CACHE: CInt = 504

public val SC_ICACHE_SZ: CInt = 505

public val SC_DCACHE_SZ: CInt = 506

public val SC_ICACHE_LINESZ: CInt = 507

public val SC_DCACHE_LINESZ: CInt = 508

public val SC_ICACHE_BLKSZ: CInt = 509

public val SC_DCACHE_BLKSZ: CInt = 510

public val SC_DCACHE_TBLKSZ: CInt = 511

public val SC_ICACHE_ASSOC: CInt = 512

public val SC_DCACHE_ASSOC: CInt = 513

public val SC_MAXPID: CInt = 514

public val SC_STACK_PROT: CInt = 515

public val SC_NPROCESSORS_MAX: CInt = 516

public val SC_CPUID_MAX: CInt = 517

public val SC_EPHID_MAX: CInt = 518

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 568

public val SC_GETGR_R_SIZE_MAX: CInt = 569

public val SC_GETPW_R_SIZE_MAX: CInt = 570

public val SC_LOGIN_NAME_MAX: CInt = 571

public val SC_THREAD_KEYS_MAX: CInt = 572

public val SC_THREAD_STACK_MIN: CInt = 573

public val SC_THREAD_THREADS_MAX: CInt = 574

public val SC_TTY_NAME_MAX: CInt = 575

public val SC_THREADS: CInt = 576

public val SC_THREAD_ATTR_STACKADDR: CInt = 577

public val SC_THREAD_ATTR_STACKSIZE: CInt = 578

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 579

public val SC_THREAD_PRIO_INHERIT: CInt = 580

public val SC_THREAD_PRIO_PROTECT: CInt = 581

public val SC_THREAD_PROCESS_SHARED: CInt = 582

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 583

public val SC_XOPEN_LEGACY: CInt = 717

public val SC_XOPEN_REALTIME: CInt = 718

public val SC_XOPEN_REALTIME_THREADS: CInt = 719

public val SC_XBS5_ILP32_OFF32: CInt = 720

public val SC_XBS5_ILP32_OFFBIG: CInt = 721

public val SC_XBS5_LP64_OFF64: CInt = 722

public val SC_XBS5_LPBIG_OFFBIG: CInt = 723

public val SC_2_PBS: CInt = 724

public val SC_2_PBS_ACCOUNTING: CInt = 725

public val SC_2_PBS_CHECKPOINT: CInt = 726

public val SC_2_PBS_LOCATE: CInt = 728

public val SC_2_PBS_MESSAGE: CInt = 729

public val SC_2_PBS_TRACK: CInt = 730

public val SC_ADVISORY_INFO: CInt = 731

public val SC_BARRIERS: CInt = 732

public val SC_CLOCK_SELECTION: CInt = 733

public val SC_CPUTIME: CInt = 734

public val SC_HOST_NAME_MAX: CInt = 735

public val SC_MONOTONIC_CLOCK: CInt = 736

public val SC_READER_WRITER_LOCKS: CInt = 737

public val SC_REGEXP: CInt = 738

public val SC_SHELL: CInt = 739

public val SC_SPAWN: CInt = 740

public val SC_SPIN_LOCKS: CInt = 741

public val SC_SPORADIC_SERVER: CInt = 742

public val SC_SS_REPL_MAX: CInt = 743

public val SC_SYMLOOP_MAX: CInt = 744

public val SC_THREAD_CPUTIME: CInt = 745

public val SC_THREAD_SPORADIC_SERVER: CInt = 746

public val SC_TIMEOUTS: CInt = 747

public val SC_TRACE: CInt = 748

public val SC_TRACE_EVENT_FILTER: CInt = 749

public val SC_TRACE_EVENT_NAME_MAX: CInt = 750

public val SC_TRACE_INHERIT: CInt = 751

public val SC_TRACE_LOG: CInt = 752

public val SC_TRACE_NAME_MAX: CInt = 753

public val SC_TRACE_SYS_MAX: CInt = 754

public val SC_TRACE_USER_EVENT_MAX: CInt = 755

public val SC_TYPED_MEMORY_OBJECTS: CInt = 756

public val SC_V6_ILP32_OFF32: CInt = 757

public val SC_V6_ILP32_OFFBIG: CInt = 758

public val SC_V6_LP64_OFF64: CInt = 759

public val SC_V6_LPBIG_OFFBIG: CInt = 760

public val SC_XOPEN_STREAMS: CInt = 761

public val SC_IPV6: CInt = 762

public val SC_RAW_SOCKETS: CInt = 763

public val ST_FSTYPSZ: CInt = 16

public val MUTEX_MAGIC: UShort = 0x4d58u

// MX
public val COND_MAGIC: UShort = 0x4356u

// CV
public val RWL_MAGIC: UShort = 0x5257u

// RW
public val NCCS: Int = 19

public val LOG_CRON: CInt = 15 shl 3

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(pthreadMutexFlag1 = 0u, pthreadMutexFlag2 = 0u, pthreadMutexCeiling = 0u, pthreadMutexType = PTHREAD_PROCESS_PRIVATE, pthreadMutexMagic = MUTEX_MAGIC, pthreadMutexLock = 0uL, pthreadMutexData = 0uL)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(pthreadCondFlag = UByteArray(4) { 0u.toUByte() }, pthreadCondType = PTHREAD_PROCESS_PRIVATE, pthreadCondMagic = COND_MAGIC, pthreadCondData = 0uL)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(pthreadRwlockReaders = 0, pthreadRwlockType = PTHREAD_PROCESS_PRIVATE, pthreadRwlockMagic = RWL_MAGIC, pthreadRwlockMutex = PTHREAD_MUTEX_INITIALIZER, pthreadRwlockReadercv = PTHREAD_COND_INITIALIZER, pthreadRwlockWritercv = PTHREAD_COND_INITIALIZER)

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 4

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1).toLong())

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

public val RTLD_SELF: COpaquePointer? = COpaquePointer((-3).toLong())

public val RTLD_PROBE: COpaquePointer? = COpaquePointer((-4).toLong())

public val RTLD_LAZY: CInt = 0x1

public val RTLD_NOW: CInt = 0x2

public val RTLD_NOLOAD: CInt = 0x4

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_LOCAL: CInt = 0x0

public val RTLD_PARENT: CInt = 0x200

public val RTLD_GROUP: CInt = 0x400

public val RTLD_WORLD: CInt = 0x800

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_FIRST: CInt = 0x2000

public val RTLD_CONFGEN: CInt = 0x10000

public val PORT_SOURCE_AIO: CInt = 1

public val PORT_SOURCE_TIMER: CInt = 2

public val PORT_SOURCE_USER: CInt = 3

public val PORT_SOURCE_FD: CInt = 4

public val PORT_SOURCE_ALERT: CInt = 5

public val PORT_SOURCE_MQ: CInt = 6

public val PORT_SOURCE_FILE: CInt = 7

public val NONROOT_USR: CShort = 2

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val DOWN_TIME: CShort = 10

public val TIOC1: CInt = ('T'.code) shl 8

public val T_IOC: CInt = ('t'.code) shl 8

public val TCGETA: CInt = TIOC1 or 1

public val TCSETA: CInt = TIOC1 or 2

public val TCSETAW: CInt = TIOC1 or 3

public val TCSETAF: CInt = TIOC1 or 4

public val TCSBRK: CInt = TIOC1 or 5

public val TCXONC: CInt = TIOC1 or 6

public val TCFLSH: CInt = TIOC1 or 7

public val TCDSET: CInt = TIOC1 or 32

public val TCGETS: CInt = TIOC1 or 13

public val TCSETS: CInt = TIOC1 or 14

public val TCSANOW: CInt = TIOC1 or 14

public val TCSETSW: CInt = TIOC1 or 15

public val TCSADRAIN: CInt = TIOC1 or 15

public val TCSETSF: CInt = TIOC1 or 16

public val TCSAFLUSH: CInt = TIOC1 or 16

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TIOC: CInt = TIOC1

public val TIOCKBON: CInt = TIOC1 or 8

public val TIOCKBOF: CInt = TIOC1 or 9

public val TIOCGWINSZ: CInt = TIOC1 or 104

public val TIOCSWINSZ: CInt = TIOC1 or 103

public val TIOCGSOFTCAR: CInt = TIOC1 or 105

public val TIOCSSOFTCAR: CInt = TIOC1 or 106

public val TIOCGPPS: CInt = TIOC1 or 125

public val TIOCSPPS: CInt = TIOC1 or 126

public val TIOCGPPSEV: CInt = TIOC1 or 127

public val TIOCGETD: CInt = T_IOC or 0

public val TIOCSETD: CInt = T_IOC or 1

public val TIOCHPCL: CInt = T_IOC or 2

public val TIOCGETP: CInt = T_IOC or 8

public val TIOCSETP: CInt = T_IOC or 9

public val TIOCSETN: CInt = T_IOC or 10

public val TIOCEXCL: CInt = T_IOC or 13

public val TIOCNXCL: CInt = T_IOC or 14

public val TIOCFLUSH: CInt = T_IOC or 16

public val TIOCSETC: CInt = T_IOC or 17

public val TIOCGETC: CInt = T_IOC or 18

public val TIOCLBIS: CInt = T_IOC or 127

public val TIOCLBIC: CInt = T_IOC or 126

public val TIOCLSET: CInt = T_IOC or 125

public val TIOCLGET: CInt = T_IOC or 124

public val TIOCSBRK: CInt = T_IOC or 123

public val TIOCCBRK: CInt = T_IOC or 122

public val TIOCSDTR: CInt = T_IOC or 121

public val TIOCCDTR: CInt = T_IOC or 120

public val TIOCSLTC: CInt = T_IOC or 117

public val TIOCGLTC: CInt = T_IOC or 116

public val TIOCOUTQ: CInt = T_IOC or 115

public val TIOCNOTTY: CInt = T_IOC or 113

public val TIOCSCTTY: CInt = T_IOC or 132

public val TIOCSTOP: CInt = T_IOC or 111

public val TIOCSTART: CInt = T_IOC or 110

public val TIOCSILOOP: CInt = T_IOC or 109

public val TIOCCILOOP: CInt = T_IOC or 108

public val TIOCGPGRP: CInt = T_IOC or 20

public val TIOCSPGRP: CInt = T_IOC or 21

public val TIOCGSID: CInt = T_IOC or 22

public val TIOCSTI: CInt = T_IOC or 23

public val TIOCMSET: CInt = T_IOC or 26

public val TIOCMBIS: CInt = T_IOC or 27

public val TIOCMBIC: CInt = T_IOC or 28

public val TIOCMGET: CInt = T_IOC or 29

public val TIOCREMOTE: CInt = T_IOC or 30

public val TIOCSIGNAL: CInt = T_IOC or 31

public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = TIOCM_RNG

public val TIOCM_DSR: CInt = 256

// termios
public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val B57600: SpeedT = 16u

public val B76800: SpeedT = 17u

public val B115200: SpeedT = 18u

public val B153600: SpeedT = 19u

public val B230400: SpeedT = 20u

public val B307200: SpeedT = 21u

public val B460800: SpeedT = 22u

public val B921600: SpeedT = 23u

public val CSTART: TcflagT = 17u

public val CSTOP: TcflagT = 19u

public val CSWTCH: TcflagT = 26u

public val CBAUD: TcflagT = 15u

public val CIBAUD: TcflagT = 983040u

public val CBAUDEXT: TcflagT = 2097152u

public val CIBAUDEXT: TcflagT = 4194304u

public val CSIZE: TcflagT = 48u

public val CS5: TcflagT = 0u

public val CS6: TcflagT = 16u

public val CS7: TcflagT = 32u

public val CS8: TcflagT = 48u

public val CSTOPB: TcflagT = 64u

public val ECHO: TcflagT = 8u

public val ECHOE: TcflagT = 16u

public val ECHOK: TcflagT = 32u

public val ECHONL: TcflagT = 64u

public val ECHOCTL: TcflagT = 512u

public val ECHOPRT: TcflagT = 1024u

public val ECHOKE: TcflagT = 2048u

public val EXTPROC: TcflagT = 65536u

public val IGNBRK: TcflagT = 1u

public val BRKINT: TcflagT = 2u

public val IGNPAR: TcflagT = 4u

public val PARMRK: TcflagT = 8u

public val INPCK: TcflagT = 16u

public val ISTRIP: TcflagT = 32u

public val INLCR: TcflagT = 64u

public val IGNCR: TcflagT = 128u

public val ICRNL: TcflagT = 256u

public val IUCLC: TcflagT = 512u

public val IXON: TcflagT = 1024u

public val IXOFF: TcflagT = 4096u

public val IXANY: TcflagT = 2048u

public val IMAXBEL: TcflagT = 8192u

public val DOSMODE: TcflagT = 32768u

public val OPOST: TcflagT = 1u

public val OLCUC: TcflagT = 2u

public val ONLCR: TcflagT = 4u

public val OCRNL: TcflagT = 8u

public val ONOCR: TcflagT = 16u

public val ONLRET: TcflagT = 32u

public val OFILL: TcflagT = 64u

public val OFDEL: TcflagT = 128u

public val CREAD: TcflagT = 128u

public val PARENB: TcflagT = 256u

public val PARODD: TcflagT = 512u

public val HUPCL: TcflagT = 1024u

public val CLOCAL: TcflagT = 2048u

public val CRTSXOFF: TcflagT = 1073741824u

public val CRTSCTS: TcflagT = 2147483648u

public val ISIG: TcflagT = 1u

public val ICANON: TcflagT = 2u

public val IEXTEN: TcflagT = 32768u

public val TOSTOP: TcflagT = 256u

public val FLUSHO: TcflagT = 8192u

public val PENDIN: TcflagT = 16384u

public val NOFLSH: TcflagT = 128u

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VSWTCH: Int = 7

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VREPRINT: Int = 12

public val VDISCARD: Int = 13

public val VWERASE: Int = 14

public val VLNEXT: Int = 15

// <sys/stropts.h>
public val STR: CInt = (83u.toInt()) shl 8

public val I_NREAD: CInt = STR or 1

public val I_PUSH: CInt = STR or 2

public val I_POP: CInt = STR or 3

public val I_LOOK: CInt = STR or 4

public val I_FLUSH: CInt = STR or 5

public val I_SRDOPT: CInt = STR or 6

public val I_GRDOPT: CInt = STR or 7

public val I_STR: CInt = STR or 8

public val I_SETSIG: CInt = STR or 9

public val I_GETSIG: CInt = STR or 10

public val I_FIND: CInt = STR or 11

public val I_LINK: CInt = STR or 12

public val I_UNLINK: CInt = STR or 13

public val I_PEEK: CInt = STR or 15

public val I_FDINSERT: CInt = STR or 16

public val I_SENDFD: CInt = STR or 17

public val I_RECVFD: CInt = STR or 14

public val I_SWROPT: CInt = STR or 19

public val I_GWROPT: CInt = STR or 20

public val I_LIST: CInt = STR or 21

public val I_PLINK: CInt = STR or 22

public val I_PUNLINK: CInt = STR or 23

public val I_ANCHOR: CInt = STR or 24

public val I_FLUSHBAND: CInt = STR or 28

public val I_CKBAND: CInt = STR or 29

public val I_GETBAND: CInt = STR or 30

public val I_ATMARK: CInt = STR or 31

public val I_SETCLTIME: CInt = STR or 32

public val I_GETCLTIME: CInt = STR or 33

public val I_CANPUT: CInt = STR or 34

public val I_SERROPT: CInt = STR or 35

public val I_GERROPT: CInt = STR or 36

public val I_ESETSIG: CInt = STR or 37

public val I_EGETSIG: CInt = STR or 38

public val I_PUSH_NOCTTY: CInt = STR or 39

// 3SOCKET flags
public val SOCK_CLOEXEC: CInt = 0x080000

public val SOCK_NONBLOCK: CInt = 0x100000

public val SOCK_NDELAY: CInt = 0x200000

// <sys/timex.h>
public val SCALE_KG: CInt = 1 shl 6

public val SCALE_KF: CInt = 1 shl 16

public val SCALE_KH: CInt = 1 shl 2

public val MAXTC: CInt = 1 shl 6

public val SCALE_PHASE: CInt = 1 shl 22

public val SCALE_USEC: CInt = 1 shl 16

public val SCALE_UPDATE: CInt = SCALE_KG * MAXTC

public val FINEUSEC: CInt = 1 shl 22

public val MAXPHASE: CInt = 512000

public val MAXFREQ: CInt = 512 * SCALE_USEC

public val PPS_AVG: CInt = 2

public val MAXTIME: CInt = 200 shl PPS_AVG

public val MINSEC: CInt = 16

public val MAXSEC: CInt = 1200

public val PPS_SHIFT: CInt = 2

public val PPS_SHIFTMAX: CInt = 8

public val PPS_VALID: CInt = 120

public val MAXGLITCH: CInt = 30

public val MOD_OFFSET: UInt = 0x0001u

public val MOD_FREQUENCY: UInt = 0x0002u

public val MOD_MAXERROR: UInt = 0x0004u

public val MOD_ESTERROR: UInt = 0x0008u

public val MOD_STATUS: UInt = 0x0010u

public val MOD_TIMECONST: UInt = 0x0020u

public val MOD_CLKB: UInt = 0x4000u

public val MOD_CLKA: UInt = 0x8000u

public val STA_PLL: UInt = 0x0001u

public val STA_PPSFREQ: Int = 0x0002

public val STA_PPSTIME: Int = 0x0004

public val STA_FLL: Int = 0x0008

public val STA_INS: Int = 0x0010

public val STA_DEL: Int = 0x0020

public val STA_UNSYNC: Int = 0x0040

public val STA_FREQHOLD: Int = 0x0080

public val STA_PPSSIGNAL: Int = 0x0100

public val STA_PPSJITTER: Int = 0x0200

public val STA_PPSWANDER: Int = 0x0400

public val STA_PPSERROR: Int = 0x0800

public val STA_CLOCKERR: Int = 0x1000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR

public val TIME_OK: Int = 0

public val TIME_INS: Int = 1

public val TIME_DEL: Int = 2

public val TIME_OOP: Int = 3

public val TIME_WAIT: Int = 4

public val TIME_ERROR: Int = 5

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_SYS: CInt = 3

public val SCHED_IA: CInt = 4

public val SCHED_FSS: CInt = 5

public val SCHED_FX: CInt = 6

// sys/priv.h
public val PRIV_DEBUG: CUint = 0x0001u

public val PRIV_AWARE: CUint = 0x0002u

public val PRIV_AWARE_INHERIT: CUint = 0x0004u

public val PROC_PROTECT: CUint = 0x0008u

public val NET_MAC_AWARE: CUint = 0x0010u

public val NET_MAC_AWARE_INHERIT: CUint = 0x0020u

public val PRIV_AWARE_RESET: CUint = 0x0040u

public val PRIV_XPOLICY: CUint = 0x0080u

public val PRIV_PFEXEC: CUint = 0x0100u

// sys/systeminfo.h
public val SI_SYSNAME: CInt = 1

public val SI_HOSTNAME: CInt = 2

public val SI_RELEASE: CInt = 3

public val SI_VERSION: CInt = 4

public val SI_MACHINE: CInt = 5

public val SI_ARCHITECTURE: CInt = 6

public val SI_HW_SERIAL: CInt = 7

public val SI_HW_PROVIDER: CInt = 8

public val SI_SET_HOSTNAME: CInt = 258

public val SI_SET_SRPC_DOMAIN: CInt = 265

public val SI_PLATFORM: CInt = 513

public val SI_ISALIST: CInt = 514

public val SI_DHCP_CACHE: CInt = 515

public val SI_ARCHITECTURE_32: CInt = 516

public val SI_ARCHITECTURE_64: CInt = 517

public val SI_ARCHITECTURE_K: CInt = 518

public val SI_ARCHITECTURE_NATIVE: CInt = 519

// sys/lgrpUser.h
public val LGRP_COOKIE_NONE: LgrpCookieT = 0uL

public val LGRP_AFF_NONE: LgrpAffinityT = 0x0

public val LGRP_AFF_WEAK: LgrpAffinityT = 0x10

public val LGRP_AFF_STRONG: LgrpAffinityT = 0x100

public val LGRP_CONTENT_ALL: LgrpContentT = 0u

public val LGRP_CONTENT_HIERARCHY: LgrpContentT = LGRP_CONTENT_ALL

public val LGRP_CONTENT_DIRECT: LgrpContentT = 1u

public val LGRP_LAT_CPU_TO_MEM: LgrpLatBetweenT = 0u

public val LGRP_MEM_SZ_FREE: LgrpMemSizeFlagT = 0u

public val LGRP_MEM_SZ_INSTALLED: LgrpMemSizeFlagT = 1u

public val LGRP_VIEW_CALLER: LgrpViewT = 0u

public val LGRP_VIEW_OS: LgrpViewT = 1u

// sys/processor.h
public val P_OFFLINE: CInt = 0x001

public val P_ONLINE: CInt = 0x002

public val P_STATUS: CInt = 0x003

public val P_FAULTED: CInt = 0x004

public val P_POWEROFF: CInt = 0x005

public val P_NOINTR: CInt = 0x006

public val P_SPARE: CInt = 0x007

public val P_FORCED: CInt = 0x10000000

public val PI_TYPELEN: CInt = 16

public val PI_FPUTYPE: CInt = 32

// sys/auxv.h
public val AT_SUN_HWCAP: CUint = 2009u

// As per sys/socket.h, header alignment must be 8 bytes on SPARC
// and 4 bytes everywhere else:
public val CMSG_HDR_ALIGNMENT: Int = 8

public val CMSG_DATA_ALIGNMENT: Int = 8

public val NEWDEV: CInt = 1

// sys/sendfile.h
public val SFV_FD_SELF: CInt = -2
