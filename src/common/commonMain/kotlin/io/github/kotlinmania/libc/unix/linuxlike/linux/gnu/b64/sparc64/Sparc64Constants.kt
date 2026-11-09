@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.sparc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val VEOF: Int = 4

public val RTLD_DEEPBIND: CInt = 0x8

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val O_APPEND: CInt = 0x8

public val O_CREAT: CInt = 0x200

public val O_EXCL: CInt = 0x800

public val O_NOCTTY: CInt = 0x8000

public val O_NONBLOCK: CInt = 0x4000

public val O_SYNC: CInt = 0x802000

public val O_RSYNC: CInt = 0x802000

public val O_DSYNC: CInt = 0x2000

public val O_FSYNC: CInt = 0x802000

public val O_NOATIME: CInt = 0x200000

public val O_PATH: CInt = 0x1000000

public val O_DIRECTORY: CInt = 65536

public val O_TMPFILE: CInt = 0x2000000 or O_DIRECTORY

public val MADV_SOFT_OFFLINE: CInt = 101

public val MAP_GROWSDOWN: CInt = 0x0200

public val MAP_ANON: CInt = 0x0020

public val MAP_ANONYMOUS: CInt = 0x0020

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val MAP_HUGETLB: CInt = 0x040000

public val MAP_SYNC: CInt = 0x080000

public val EDEADLK: CInt = 78

public val ENAMETOOLONG: CInt = 63

public val ENOLCK: CInt = 79

public val ENOSYS: CInt = 90

public val ENOTEMPTY: CInt = 66

public val ELOOP: CInt = 62

public val ENOMSG: CInt = 75

public val EIDRM: CInt = 77

public val ECHRNG: CInt = 94

public val EL2NSYNC: CInt = 95

public val EL3HLT: CInt = 96

public val EL3RST: CInt = 97

public val ELNRNG: CInt = 98

public val EUNATCH: CInt = 99

public val ENOCSI: CInt = 100

public val EL2HLT: CInt = 101

public val EBADE: CInt = 102

public val EBADR: CInt = 103

public val EXFULL: CInt = 104

public val ENOANO: CInt = 105

public val EBADRQC: CInt = 106

public val EBADSLT: CInt = 107

public val EMULTIHOP: CInt = 87

public val EOVERFLOW: CInt = 92

public val ENOTUNIQ: CInt = 115

public val EBADFD: CInt = 93

public val EBADMSG: CInt = 76

public val EREMCHG: CInt = 89

public val ELIBACC: CInt = 114

public val ELIBBAD: CInt = 112

public val ELIBSCN: CInt = 124

public val ELIBMAX: CInt = 123

public val ELIBEXEC: CInt = 110

public val EILSEQ: CInt = 122

public val ERESTART: CInt = 116

public val ESTRPIPE: CInt = 91

public val EUSERS: CInt = 68

public val ENOTSOCK: CInt = 38

public val EDESTADDRREQ: CInt = 39

public val EMSGSIZE: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val EOPNOTSUPP: CInt = 45

public val EPFNOSUPPORT: CInt = 46

public val EAFNOSUPPORT: CInt = 47

public val EADDRINUSE: CInt = 48

public val EADDRNOTAVAIL: CInt = 49

public val ENETDOWN: CInt = 50

public val ENETUNREACH: CInt = 51

public val ENETRESET: CInt = 52

public val ECONNABORTED: CInt = 53

public val ECONNRESET: CInt = 54

public val ENOBUFS: CInt = 55

public val EISCONN: CInt = 56

public val ENOTCONN: CInt = 57

public val ESHUTDOWN: CInt = 58

public val ETOOMANYREFS: CInt = 59

public val ETIMEDOUT: CInt = 60

public val ECONNREFUSED: CInt = 61

public val EHOSTDOWN: CInt = 64

public val EHOSTUNREACH: CInt = 65

public val EALREADY: CInt = 37

public val EINPROGRESS: CInt = 36

public val ESTALE: CInt = 70

public val EDQUOT: CInt = 69

public val ENOMEDIUM: CInt = 125

public val EMEDIUMTYPE: CInt = 126

public val ECANCELED: CInt = 127

public val ENOKEY: CInt = 128

public val EKEYEXPIRED: CInt = 129

public val EKEYREVOKED: CInt = 130

public val EKEYREJECTED: CInt = 131

public val EOWNERDEAD: CInt = 132

public val ENOTRECOVERABLE: CInt = 133

public val EHWPOISON: CInt = 135

public val ERFKILL: CInt = 134

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SA_ONSTACK: CInt = 1

public val SA_SIGINFO: CInt = 0x200

public val SA_NOCLDWAIT: CInt = 0x100

public val SIGEMT: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGCHLD: CInt = 20

public val SIGBUS: CInt = 10

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGCONT: CInt = 19

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGURG: CInt = 16

public val SIGIO: CInt = 23

public val SIGSYS: CInt = 12

public val SIGPOLL: CInt = 23

public val SIGPWR: CInt = 29

public val SIG_SETMASK: CInt = 4

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val POLLWRNORM: CShort = 4

public val POLLWRBAND: CShort = 0x100

public val O_ASYNC: CInt = 0x40

public val O_NDELAY: CInt = 0x4004

public val PTRACE_DETACH: CUint = 17u

public val EFD_NONBLOCK: CInt = 0x4000

public val F_GETLK: CInt = 7

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val SFD_NONBLOCK: CInt = 0x4000

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val SFD_CLOEXEC: CInt = 0x400000

public val NCCS: Int = 17

public val O_TRUNC: CInt = 0x400

public val O_CLOEXEC: CInt = 0x400000

public val EBFONT: CInt = 109

public val ENOSTR: CInt = 72

public val ENODATA: CInt = 111

public val ETIME: CInt = 73

public val ENOSR: CInt = 74

public val ENONET: CInt = 80

public val ENOPKG: CInt = 113

public val EREMOTE: CInt = 71

public val ENOLINK: CInt = 82

public val EADV: CInt = 83

public val ESRMNT: CInt = 84

public val ECOMM: CInt = 85

public val EPROTO: CInt = 86

public val EDOTDOT: CInt = 88

public val SA_NODEFER: CInt = 0x20

public val SA_RESETHAND: CInt = 0x4

public val SA_RESTART: CInt = 0x2

public val SA_NOCLDSTOP: CInt = 0x00000008

public val EPOLL_CLOEXEC: CInt = 0x400000

public val EFD_CLOEXEC: CInt = 0x400000

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 2u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 3u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val O_NOFOLLOW: CInt = 131072

public val O_DIRECT: CInt = 0x100000

public val MAP_LOCKED: CInt = 0x0100

public val MAP_NORESERVE: CInt = 0x00040

public val EDEADLOCK: CInt = 108

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val MCL_CURRENT: CInt = 0x2000

public val MCL_FUTURE: CInt = 0x4000

public val MCL_ONFAULT: CInt = 0x8000

public val SIGSTKSZ: SizeT = 16384uL

public val MINSIGSTKSZ: SizeT = 4096uL

public val CBAUD: TcflagT = 0x0000100fu

public val TAB1: TcflagT = 0x800u

public val TAB2: TcflagT = 0x1000u

public val TAB3: TcflagT = 0x1800u

public val CR1: TcflagT = 0x200u

public val CR2: TcflagT = 0x400u

public val CR3: TcflagT = 0x600u

public val FF1: TcflagT = 0x8000u

public val BS1: TcflagT = 0x2000u

public val VT1: TcflagT = 0x4000u

public val VWERASE: Int = 0xe

public val VREPRINT: Int = 0xc

public val VSUSP: Int = 0xa

public val VSTART: Int = 0x8

public val VSTOP: Int = 0x9

public val VDISCARD: Int = 0xd

public val VTIME: Int = 0x5

public val IXON: TcflagT = 0x400u

public val IXOFF: TcflagT = 0x1000u

public val ONLCR: TcflagT = 0x4u

public val CSIZE: TcflagT = 0x30u

public val CS6: TcflagT = 0x10u

public val CS7: TcflagT = 0x20u

public val CS8: TcflagT = 0x30u

public val CSTOPB: TcflagT = 0x40u

public val CREAD: TcflagT = 0x80u

public val PARENB: TcflagT = 0x100u

public val PARODD: TcflagT = 0x200u

public val HUPCL: TcflagT = 0x400u

public val CLOCAL: TcflagT = 0x800u

public val ECHOKE: TcflagT = 0x800u

public val ECHOE: TcflagT = 0x10u

public val ECHOK: TcflagT = 0x20u

public val ECHONL: TcflagT = 0x40u

public val ECHOPRT: TcflagT = 0x400u

public val ECHOCTL: TcflagT = 0x200u

public val ISIG: TcflagT = 0x1u

public val ICANON: TcflagT = 0x2u

public val PENDIN: TcflagT = 0x4000u

public val NOFLSH: TcflagT = 0x80u

public val CIBAUD: TcflagT = 269418496u

public val CBAUDEX: TcflagT = 0x00001000u

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2u

public val NLDLY: TcflagT = 256u

public val CRDLY: TcflagT = 1536u

public val TABDLY: TcflagT = 6144u

public val BSDLY: TcflagT = 8192u

public val FFDLY: TcflagT = 32768u

public val VTDLY: TcflagT = 16384u

public val XTABS: TcflagT = 6144u

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

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 0x1001u

public val B115200: SpeedT = 0x1002u

public val B230400: SpeedT = 0x1003u

public val B460800: SpeedT = 0x1004u

public val B76800: SpeedT = 0x1005u

public val B153600: SpeedT = 0x1006u

public val B307200: SpeedT = 0x1007u

public val B614400: SpeedT = 0x1008u

public val B921600: SpeedT = 0x1009u

public val B500000: SpeedT = 0x100au

public val B576000: SpeedT = 0x100bu

public val B1000000: SpeedT = 0x100cu

public val B1152000: SpeedT = 0x100du

public val B1500000: SpeedT = 0x100eu

public val B2000000: SpeedT = 0x100fu

public val VEOL: Int = 5

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val IEXTEN: TcflagT = 0x8000u

public val TOSTOP: TcflagT = 0x100u

public val FLUSHO: TcflagT = 0x1000u

public val EXTPROC: TcflagT = 0x10000u

public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_WAIT4: CLong = 7L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECV: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_CHOWN: CLong = 13L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_BRK: CLong = 17L

public val SYS_PERFCTR: CLong = 18L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_CAPGET: CLong = 21L

public val SYS_CAPSET: CLong = 22L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_VMSPLICE: CLong = 25L

public val SYS_PTRACE: CLong = 26L

public val SYS_ALARM: CLong = 27L

public val SYS_SIGALTSTACK: CLong = 28L

public val SYS_PAUSE: CLong = 29L

public val SYS_UTIME: CLong = 30L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_STAT: CLong = 38L

public val SYS_SENDFILE: CLong = 39L

public val SYS_LSTAT: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_UMOUNT2: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_SIGNAL: CLong = 48L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_MEMORY_ORDERING: CLong = 52L

public val SYS_IOCTL: CLong = 54L

public val SYS_REBOOT: CLong = 55L

public val SYS_SYMLINK: CLong = 57L

public val SYS_READLINK: CLong = 58L

public val SYS_EXECVE: CLong = 59L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_FSTAT: CLong = 62L

public val SYS_FSTAT64: CLong = 63L

public val SYS_GETPAGESIZE: CLong = 64L

public val SYS_MSYNC: CLong = 65L

public val SYS_VFORK: CLong = 66L

public val SYS_PREAD64: CLong = 67L

public val SYS_PWRITE64: CLong = 68L

public val SYS_MMAP: CLong = 71L

public val SYS_MUNMAP: CLong = 73L

public val SYS_MPROTECT: CLong = 74L

public val SYS_MADVISE: CLong = 75L

public val SYS_VHANGUP: CLong = 76L

public val SYS_MINCORE: CLong = 78L

public val SYS_GETGROUPS: CLong = 79L

public val SYS_SETGROUPS: CLong = 80L

public val SYS_GETPGRP: CLong = 81L

public val SYS_SETITIMER: CLong = 83L

public val SYS_SWAPON: CLong = 85L

public val SYS_GETITIMER: CLong = 86L

public val SYS_SETHOSTNAME: CLong = 88L

public val SYS_DUP2: CLong = 90L

public val SYS_FCNTL: CLong = 92L

public val SYS_SELECT: CLong = 93L

public val SYS_FSYNC: CLong = 95L

public val SYS_SETPRIORITY: CLong = 96L

public val SYS_SOCKET: CLong = 97L

public val SYS_CONNECT: CLong = 98L

public val SYS_ACCEPT: CLong = 99L

public val SYS_GETPRIORITY: CLong = 100L

public val SYS_RT_SIGRETURN: CLong = 101L

public val SYS_RT_SIGACTION: CLong = 102L

public val SYS_RT_SIGPROCMASK: CLong = 103L

public val SYS_RT_SIGPENDING: CLong = 104L

public val SYS_RT_SIGTIMEDWAIT: CLong = 105L

public val SYS_RT_SIGQUEUEINFO: CLong = 106L

public val SYS_RT_SIGSUSPEND: CLong = 107L

public val SYS_SETRESUID: CLong = 108L

public val SYS_GETRESUID: CLong = 109L

public val SYS_SETRESGID: CLong = 110L

public val SYS_GETRESGID: CLong = 111L

public val SYS_RECVMSG: CLong = 113L

public val SYS_SENDMSG: CLong = 114L

public val SYS_GETTIMEOFDAY: CLong = 116L

public val SYS_GETRUSAGE: CLong = 117L

public val SYS_GETSOCKOPT: CLong = 118L

public val SYS_GETCWD: CLong = 119L

public val SYS_READV: CLong = 120L

public val SYS_WRITEV: CLong = 121L

public val SYS_SETTIMEOFDAY: CLong = 122L

public val SYS_FCHOWN: CLong = 123L

public val SYS_FCHMOD: CLong = 124L

public val SYS_RECVFROM: CLong = 125L

public val SYS_SETREUID: CLong = 126L

public val SYS_SETREGID: CLong = 127L

public val SYS_RENAME: CLong = 128L

public val SYS_TRUNCATE: CLong = 129L

public val SYS_FTRUNCATE: CLong = 130L

public val SYS_FLOCK: CLong = 131L

public val SYS_LSTAT64: CLong = 132L

public val SYS_SENDTO: CLong = 133L

public val SYS_SHUTDOWN: CLong = 134L

public val SYS_SOCKETPAIR: CLong = 135L

public val SYS_MKDIR: CLong = 136L

public val SYS_RMDIR: CLong = 137L

public val SYS_UTIMES: CLong = 138L

public val SYS_STAT64: CLong = 139L

public val SYS_SENDFILE64: CLong = 140L

public val SYS_GETPEERNAME: CLong = 141L

public val SYS_FUTEX: CLong = 142L

public val SYS_GETTID: CLong = 143L

public val SYS_GETRLIMIT: CLong = 144L

public val SYS_SETRLIMIT: CLong = 145L

public val SYS_PIVOT_ROOT: CLong = 146L

public val SYS_PRCTL: CLong = 147L

public val SYS_PCICONFIG_READ: CLong = 148L

public val SYS_PCICONFIG_WRITE: CLong = 149L

public val SYS_GETSOCKNAME: CLong = 150L

public val SYS_INOTIFY_INIT: CLong = 151L

public val SYS_INOTIFY_ADD_WATCH: CLong = 152L

public val SYS_POLL: CLong = 153L

public val SYS_GETDENTS64: CLong = 154L

public val SYS_INOTIFY_RM_WATCH: CLong = 156L

public val SYS_STATFS: CLong = 157L

public val SYS_FSTATFS: CLong = 158L

public val SYS_UMOUNT: CLong = 159L

public val SYS_SCHED_SET_AFFINITY: CLong = 160L

public val SYS_SCHED_GET_AFFINITY: CLong = 161L

public val SYS_GETDOMAINNAME: CLong = 162L

public val SYS_SETDOMAINNAME: CLong = 163L

public val SYS_UTRAP_INSTALL: CLong = 164L

public val SYS_QUOTACTL: CLong = 165L

public val SYS_SET_TID_ADDRESS: CLong = 166L

public val SYS_MOUNT: CLong = 167L

public val SYS_USTAT: CLong = 168L

public val SYS_SETXATTR: CLong = 169L

public val SYS_LSETXATTR: CLong = 170L

public val SYS_FSETXATTR: CLong = 171L

public val SYS_GETXATTR: CLong = 172L

public val SYS_LGETXATTR: CLong = 173L

public val SYS_GETDENTS: CLong = 174L

public val SYS_SETSID: CLong = 175L

public val SYS_FCHDIR: CLong = 176L

public val SYS_FGETXATTR: CLong = 177L

public val SYS_LISTXATTR: CLong = 178L

public val SYS_LLISTXATTR: CLong = 179L

public val SYS_FLISTXATTR: CLong = 180L

public val SYS_REMOVEXATTR: CLong = 181L

public val SYS_LREMOVEXATTR: CLong = 182L

public val SYS_SIGPENDING: CLong = 183L

public val SYS_QUERY_MODULE: CLong = 184L

public val SYS_SETPGID: CLong = 185L

public val SYS_FREMOVEXATTR: CLong = 186L

public val SYS_TKILL: CLong = 187L

public val SYS_EXIT_GROUP: CLong = 188L

public val SYS_UNAME: CLong = 189L

public val SYS_INIT_MODULE: CLong = 190L

public val SYS_PERSONALITY: CLong = 191L

public val SYS_REMAP_FILE_PAGES: CLong = 192L

public val SYS_EPOLL_CREATE: CLong = 193L

public val SYS_EPOLL_CTL: CLong = 194L

public val SYS_EPOLL_WAIT: CLong = 195L

public val SYS_IOPRIO_SET: CLong = 196L

public val SYS_GETPPID: CLong = 197L

public val SYS_SIGACTION: CLong = 198L

public val SYS_SGETMASK: CLong = 199L

public val SYS_SSETMASK: CLong = 200L

public val SYS_SIGSUSPEND: CLong = 201L

public val SYS_OLDLSTAT: CLong = 202L

public val SYS_USELIB: CLong = 203L

public val SYS_READDIR: CLong = 204L

public val SYS_READAHEAD: CLong = 205L

public val SYS_SOCKETCALL: CLong = 206L

public val SYS_SYSLOG: CLong = 207L

public val SYS_LOOKUP_DCOOKIE: CLong = 208L

public val SYS_FADVISE64: CLong = 209L

public val SYS_FADVISE64_64: CLong = 210L

public val SYS_TGKILL: CLong = 211L

public val SYS_WAITPID: CLong = 212L

public val SYS_SWAPOFF: CLong = 213L

public val SYS_SYSINFO: CLong = 214L

public val SYS_IPC: CLong = 215L

public val SYS_SIGRETURN: CLong = 216L

public val SYS_CLONE: CLong = 217L

public val SYS_IOPRIO_GET: CLong = 218L

public val SYS_ADJTIMEX: CLong = 219L

public val SYS_SIGPROCMASK: CLong = 220L

public val SYS_CREATE_MODULE: CLong = 221L

public val SYS_DELETE_MODULE: CLong = 222L

public val SYS_GET_KERNEL_SYMS: CLong = 223L

public val SYS_GETPGID: CLong = 224L

public val SYS_BDFLUSH: CLong = 225L

public val SYS_SYSFS: CLong = 226L

public val SYS_AFS_SYSCALL: CLong = 227L

public val SYS_SETFSUID: CLong = 228L

public val SYS_SETFSGID: CLong = 229L

public val SYS_NEWSELECT: CLong = 230L

public val SYS_SPLICE: CLong = 232L

public val SYS_STIME: CLong = 233L

public val SYS_STATFS64: CLong = 234L

public val SYS_FSTATFS64: CLong = 235L

public val SYS_LLSEEK: CLong = 236L

public val SYS_MLOCK: CLong = 237L

public val SYS_MUNLOCK: CLong = 238L

public val SYS_MLOCKALL: CLong = 239L

public val SYS_MUNLOCKALL: CLong = 240L

public val SYS_SCHED_SETPARAM: CLong = 241L

public val SYS_SCHED_GETPARAM: CLong = 242L

public val SYS_SCHED_SETSCHEDULER: CLong = 243L

public val SYS_SCHED_GETSCHEDULER: CLong = 244L

public val SYS_SCHED_YIELD: CLong = 245L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 246L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 247L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 248L

public val SYS_NANOSLEEP: CLong = 249L

public val SYS_MREMAP: CLong = 250L

public val SYS_SYSCTL: CLong = 251L

public val SYS_GETSID: CLong = 252L

public val SYS_FDATASYNC: CLong = 253L

public val SYS_NFSSERVCTL: CLong = 254L

public val SYS_SYNC_FILE_RANGE: CLong = 255L

public val SYS_CLOCK_SETTIME: CLong = 256L

public val SYS_CLOCK_GETTIME: CLong = 257L

public val SYS_CLOCK_GETRES: CLong = 258L

public val SYS_CLOCK_NANOSLEEP: CLong = 259L

public val SYS_SCHED_GETAFFINITY: CLong = 260L

public val SYS_SCHED_SETAFFINITY: CLong = 261L

public val SYS_TIMER_SETTIME: CLong = 262L

public val SYS_TIMER_GETTIME: CLong = 263L

public val SYS_TIMER_GETOVERRUN: CLong = 264L

public val SYS_TIMER_DELETE: CLong = 265L

public val SYS_TIMER_CREATE: CLong = 266L

public val SYS_IO_SETUP: CLong = 268L

public val SYS_IO_DESTROY: CLong = 269L

public val SYS_IO_SUBMIT: CLong = 270L

public val SYS_IO_CANCEL: CLong = 271L

public val SYS_IO_GETEVENTS: CLong = 272L

public val SYS_MQ_OPEN: CLong = 273L

public val SYS_MQ_UNLINK: CLong = 274L

public val SYS_MQ_TIMEDSEND: CLong = 275L

public val SYS_MQ_TIMEDRECEIVE: CLong = 276L

public val SYS_MQ_NOTIFY: CLong = 277L

public val SYS_MQ_GETSETATTR: CLong = 278L

public val SYS_WAITID: CLong = 279L

public val SYS_TEE: CLong = 280L

public val SYS_ADD_KEY: CLong = 281L

public val SYS_REQUEST_KEY: CLong = 282L

public val SYS_KEYCTL: CLong = 283L

public val SYS_OPENAT: CLong = 284L

public val SYS_MKDIRAT: CLong = 285L

public val SYS_MKNODAT: CLong = 286L

public val SYS_FCHOWNAT: CLong = 287L

public val SYS_FUTIMESAT: CLong = 288L

public val SYS_FSTATAT64: CLong = 289L

public val SYS_UNLINKAT: CLong = 290L

public val SYS_RENAMEAT: CLong = 291L

public val SYS_LINKAT: CLong = 292L

public val SYS_SYMLINKAT: CLong = 293L

public val SYS_READLINKAT: CLong = 294L

public val SYS_FCHMODAT: CLong = 295L

public val SYS_FACCESSAT: CLong = 296L

public val SYS_PSELECT6: CLong = 297L

public val SYS_PPOLL: CLong = 298L

public val SYS_UNSHARE: CLong = 299L

public val SYS_SET_ROBUST_LIST: CLong = 300L

public val SYS_GET_ROBUST_LIST: CLong = 301L

public val SYS_MIGRATE_PAGES: CLong = 302L

public val SYS_MBIND: CLong = 303L

public val SYS_GET_MEMPOLICY: CLong = 304L

public val SYS_SET_MEMPOLICY: CLong = 305L

public val SYS_KEXEC_LOAD: CLong = 306L

public val SYS_MOVE_PAGES: CLong = 307L

public val SYS_GETCPU: CLong = 308L

public val SYS_EPOLL_PWAIT: CLong = 309L

public val SYS_UTIMENSAT: CLong = 310L

public val SYS_SIGNALFD: CLong = 311L

public val SYS_TIMERFD_CREATE: CLong = 312L

public val SYS_EVENTFD: CLong = 313L

public val SYS_FALLOCATE: CLong = 314L

public val SYS_TIMERFD_SETTIME: CLong = 315L

public val SYS_TIMERFD_GETTIME: CLong = 316L

public val SYS_SIGNALFD4: CLong = 317L

public val SYS_EVENTFD2: CLong = 318L

public val SYS_EPOLL_CREATE1: CLong = 319L

public val SYS_DUP3: CLong = 320L

public val SYS_PIPE2: CLong = 321L

public val SYS_INOTIFY_INIT1: CLong = 322L

public val SYS_ACCEPT4: CLong = 323L

public val SYS_PREADV: CLong = 324L

public val SYS_PWRITEV: CLong = 325L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 326L

public val SYS_PERF_EVENT_OPEN: CLong = 327L

public val SYS_RECVMMSG: CLong = 328L

public val SYS_FANOTIFY_INIT: CLong = 329L

public val SYS_FANOTIFY_MARK: CLong = 330L

public val SYS_PRLIMIT64: CLong = 331L

public val SYS_NAME_TO_HANDLE_AT: CLong = 332L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 333L

public val SYS_CLOCK_ADJTIME: CLong = 334L

public val SYS_SYNCFS: CLong = 335L

public val SYS_SENDMMSG: CLong = 336L

public val SYS_SETNS: CLong = 337L

public val SYS_PROCESS_VM_READV: CLong = 338L

public val SYS_PROCESS_VM_WRITEV: CLong = 339L

public val SYS_KERN_FEATURES: CLong = 340L

public val SYS_KCMP: CLong = 341L

public val SYS_FINIT_MODULE: CLong = 342L

public val SYS_SCHED_SETATTR: CLong = 343L

public val SYS_SCHED_GETATTR: CLong = 344L

public val SYS_RENAMEAT2: CLong = 345L

public val SYS_SECCOMP: CLong = 346L

public val SYS_GETRANDOM: CLong = 347L

public val SYS_MEMFD_CREATE: CLong = 348L

public val SYS_BPF: CLong = 349L

public val SYS_EXECVEAT: CLong = 350L

public val SYS_MEMBARRIER: CLong = 351L

public val SYS_USERFAULTFD: CLong = 352L

public val SYS_BIND: CLong = 353L

public val SYS_LISTEN: CLong = 354L

public val SYS_SETSOCKOPT: CLong = 355L

public val SYS_MLOCK2: CLong = 356L

public val SYS_COPY_FILE_RANGE: CLong = 357L

public val SYS_PREADV2: CLong = 358L

public val SYS_PWRITEV2: CLong = 359L

public val SYS_STATX: CLong = 360L

public val SYS_RSEQ: CLong = 365L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 424L

public val SYS_IO_URING_SETUP: CLong = 425L

public val SYS_IO_URING_ENTER: CLong = 426L

public val SYS_IO_URING_REGISTER: CLong = 427L

public val SYS_OPEN_TREE: CLong = 428L

public val SYS_MOVE_MOUNT: CLong = 429L

public val SYS_FSOPEN: CLong = 430L

public val SYS_FSCONFIG: CLong = 431L

public val SYS_FSMOUNT: CLong = 432L

public val SYS_FSPICK: CLong = 433L

public val SYS_PIDFD_OPEN: CLong = 434L

// Reserved in the kernel, but not actually implemented yet
public val SYS_CLONE3: CLong = 435L

public val SYS_CLOSE_RANGE: CLong = 436L

public val SYS_OPENAT2: CLong = 437L

public val SYS_PIDFD_GETFD: CLong = 438L

public val SYS_FACCESSAT2: CLong = 439L

public val SYS_PROCESS_MADVISE: CLong = 440L

public val SYS_EPOLL_PWAIT2: CLong = 441L

public val SYS_MOUNT_SETATTR: CLong = 442L

public val SYS_QUOTACTL_FD: CLong = 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 446L

public val SYS_MEMFD_SECRET: CLong = 447L

public val SYS_PROCESS_MRELEASE: CLong = 448L

public val SYS_FUTEX_WAITV: CLong = 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 450L
