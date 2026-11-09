package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val O_DIRECT: CInt = 0x10000

public val O_DIRECTORY: CInt = 0x4000

public val O_NOFOLLOW: CInt = 0x8000

public val O_ASYNC: CInt = 0x2000

public val O_LARGEFILE: CInt = 131072

public val MADV_SOFT_OFFLINE: CInt = 101

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val CBAUD: TcflagT = 4111u

public val TAB1: CInt = 0x00000800

public val TAB2: CInt = 0x00001000

public val TAB3: CInt = 0x00001800

public val CR1: CInt = 0x00000200

public val CR2: CInt = 0x00000400

public val CR3: CInt = 0x00000600

public val FF1: CInt = 0x00008000

public val BS1: CInt = 0x00002000

public val VT1: CInt = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400u

public val IXOFF: TcflagT = 0x00001000u

public val ONLCR: TcflagT = 0x4u

public val CSIZE: TcflagT = 0x00000030u

public val CS6: TcflagT = 0x00000010u

public val CS7: TcflagT = 0x00000020u

public val CS8: TcflagT = 0x00000030u

public val CSTOPB: TcflagT = 0x00000040u

public val CREAD: TcflagT = 0x00000080u

public val PARENB: TcflagT = 0x00000100u

public val PARODD: TcflagT = 0x00000200u

public val HUPCL: TcflagT = 0x00000400u

public val CLOCAL: TcflagT = 0x00000800u

public val ECHOKE: TcflagT = 0x00000800u

public val ECHOE: TcflagT = 0x00000010u

public val ECHOK: TcflagT = 0x00000020u

public val ECHONL: TcflagT = 0x00000040u

public val ECHOPRT: TcflagT = 0x00000400u

public val ECHOCTL: TcflagT = 0x00000200u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val PENDIN: TcflagT = 0x00004000u

public val NOFLSH: TcflagT = 0x00000080u

public val CIBAUD: TcflagT = 269418496u

public val CBAUDEX: TcflagT = 4096u

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2u

public val NLDLY: TcflagT = 256u

public val CRDLY: TcflagT = 1536u

public val TABDLY: TcflagT = 6144u

public val BSDLY: TcflagT = 8192u

public val FFDLY: TcflagT = 32768u

public val VTDLY: TcflagT = 16384u

public val XTABS: TcflagT = 6144u

public val B57600: SpeedT = 4097u

public val B115200: SpeedT = 4098u

public val B230400: SpeedT = 4099u

public val B460800: SpeedT = 4100u

public val B500000: SpeedT = 4101u

public val B576000: SpeedT = 4102u

public val B921600: SpeedT = 4103u

public val B1000000: SpeedT = 4104u

public val B1152000: SpeedT = 4105u

public val B1500000: SpeedT = 4106u

public val B2000000: SpeedT = 4107u

public val B2500000: SpeedT = 4108u

public val B3000000: SpeedT = 4109u

public val B3500000: SpeedT = 4110u

public val B4000000: SpeedT = 4111u

public val O_APPEND: CInt = 1024

public val O_CREAT: CInt = 64

public val O_EXCL: CInt = 128

public val O_NOCTTY: CInt = 256

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 1052672

public val O_RSYNC: CInt = 1052672

public val O_DSYNC: CInt = 4096

public val MAP_ANON: CInt = 0x0020

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val MAP_SYNC: CInt = 0x080000

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EDEADLOCK: CInt = EDEADLK

public val EMULTIHOP: CInt = 72

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val EXTPROC: TcflagT = 0x00010000u

public val MAP_HUGETLB: CInt = 0x040000

public val F_GETLK: CInt = 12

public val F_GETOWN: CInt = 9

public val F_SETLK: CInt = 13

public val F_SETLKW: CInt = 14

public val F_SETOWN: CInt = 8

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000u

public val TOSTOP: TcflagT = 0x00000100u

public val FLUSHO: TcflagT = 0x00001000u

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

// Syscall table
public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECVE: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_MOUNT: CLong = 21L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_PTRACE: CLong = 26L

public val SYS_PAUSE: CLong = 29L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_RENAME: CLong = 38L

public val SYS_MKDIR: CLong = 39L

public val SYS_RMDIR: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_BRK: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_UMOUNT2: CLong = 52L

public val SYS_IOCTL: CLong = 54L

public val SYS_FCNTL: CLong = 55L

public val SYS_SETPGID: CLong = 57L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_USTAT: CLong = 62L

public val SYS_DUP2: CLong = 63L

public val SYS_GETPPID: CLong = 64L

public val SYS_GETPGRP: CLong = 65L

public val SYS_SETSID: CLong = 66L

public val SYS_SIGACTION: CLong = 67L

public val SYS_SETREUID: CLong = 70L

public val SYS_SETREGID: CLong = 71L

public val SYS_SIGSUSPEND: CLong = 72L

public val SYS_SIGPENDING: CLong = 73L

public val SYS_SETHOSTNAME: CLong = 74L

public val SYS_SETRLIMIT: CLong = 75L

public val SYS_GETRUSAGE: CLong = 77L

public val SYS_GETTIMEOFDAY: CLong = 78L

public val SYS_SETTIMEOFDAY: CLong = 79L

public val SYS_GETGROUPS: CLong = 80L

public val SYS_SETGROUPS: CLong = 81L

public val SYS_SYMLINK: CLong = 83L

public val SYS_READLINK: CLong = 85L

public val SYS_USELIB: CLong = 86L

public val SYS_SWAPON: CLong = 87L

public val SYS_REBOOT: CLong = 88L

public val SYS_MUNMAP: CLong = 91L

public val SYS_TRUNCATE: CLong = 92L

public val SYS_FTRUNCATE: CLong = 93L

public val SYS_FCHMOD: CLong = 94L

public val SYS_FCHOWN: CLong = 95L

public val SYS_GETPRIORITY: CLong = 96L

public val SYS_SETPRIORITY: CLong = 97L

public val SYS_STATFS: CLong = 99L

public val SYS_FSTATFS: CLong = 100L

public val SYS_SYSLOG: CLong = 103L

public val SYS_SETITIMER: CLong = 104L

public val SYS_GETITIMER: CLong = 105L

public val SYS_STAT: CLong = 106L

public val SYS_LSTAT: CLong = 107L

public val SYS_FSTAT: CLong = 108L

public val SYS_VHANGUP: CLong = 111L

public val SYS_WAIT4: CLong = 114L

public val SYS_SWAPOFF: CLong = 115L

public val SYS_SYSINFO: CLong = 116L

public val SYS_FSYNC: CLong = 118L

public val SYS_SIGRETURN: CLong = 119L

public val SYS_CLONE: CLong = 120L

public val SYS_SETDOMAINNAME: CLong = 121L

public val SYS_UNAME: CLong = 122L

public val SYS_ADJTIMEX: CLong = 124L

public val SYS_MPROTECT: CLong = 125L

public val SYS_SIGPROCMASK: CLong = 126L

public val SYS_INIT_MODULE: CLong = 128L

public val SYS_DELETE_MODULE: CLong = 129L

public val SYS_QUOTACTL: CLong = 131L

public val SYS_GETPGID: CLong = 132L

public val SYS_FCHDIR: CLong = 133L

public val SYS_BDFLUSH: CLong = 134L

public val SYS_SYSFS: CLong = 135L

public val SYS_PERSONALITY: CLong = 136L

public val SYS_SETFSUID: CLong = 138L

public val SYS_SETFSGID: CLong = 139L

public val SYS_LLSEEK: CLong = 140L

public val SYS_GETDENTS: CLong = 141L

public val SYS_NEWSELECT: CLong = 142L

public val SYS_FLOCK: CLong = 143L

public val SYS_MSYNC: CLong = 144L

public val SYS_READV: CLong = 145L

public val SYS_WRITEV: CLong = 146L

public val SYS_GETSID: CLong = 147L

public val SYS_FDATASYNC: CLong = 148L

public val SYS_SYSCTL: CLong = 149L

public val SYS_MLOCK: CLong = 150L

public val SYS_MUNLOCK: CLong = 151L

public val SYS_MLOCKALL: CLong = 152L

public val SYS_MUNLOCKALL: CLong = 153L

public val SYS_SCHED_SETPARAM: CLong = 154L

public val SYS_SCHED_GETPARAM: CLong = 155L

public val SYS_SCHED_SETSCHEDULER: CLong = 156L

public val SYS_SCHED_GETSCHEDULER: CLong = 157L

public val SYS_SCHED_YIELD: CLong = 158L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 159L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 160L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 161L

public val SYS_NANOSLEEP: CLong = 162L

public val SYS_MREMAP: CLong = 163L

public val SYS_SETRESUID: CLong = 164L

public val SYS_GETRESUID: CLong = 165L

public val SYS_POLL: CLong = 168L

public val SYS_NFSSERVCTL: CLong = 169L

public val SYS_SETRESGID: CLong = 170L

public val SYS_GETRESGID: CLong = 171L

public val SYS_PRCTL: CLong = 172L

public val SYS_RT_SIGRETURN: CLong = 173L

public val SYS_RT_SIGACTION: CLong = 174L

public val SYS_RT_SIGPROCMASK: CLong = 175L

public val SYS_RT_SIGPENDING: CLong = 176L

public val SYS_RT_SIGTIMEDWAIT: CLong = 177L

public val SYS_RT_SIGQUEUEINFO: CLong = 178L

public val SYS_RT_SIGSUSPEND: CLong = 179L

public val SYS_PREAD64: CLong = 180L

public val SYS_PWRITE64: CLong = 181L

public val SYS_CHOWN: CLong = 182L

public val SYS_GETCWD: CLong = 183L

public val SYS_CAPGET: CLong = 184L

public val SYS_CAPSET: CLong = 185L

public val SYS_SIGALTSTACK: CLong = 186L

public val SYS_SENDFILE: CLong = 187L

public val SYS_VFORK: CLong = 190L

public val SYS_UGETRLIMIT: CLong = 191L

public val SYS_MMAP2: CLong = 192L

public val SYS_TRUNCATE64: CLong = 193L

public val SYS_FTRUNCATE64: CLong = 194L

public val SYS_STAT64: CLong = 195L

public val SYS_LSTAT64: CLong = 196L

public val SYS_FSTAT64: CLong = 197L

public val SYS_LCHOWN32: CLong = 198L

public val SYS_GETUID32: CLong = 199L

public val SYS_GETGID32: CLong = 200L

public val SYS_GETEUID32: CLong = 201L

public val SYS_GETEGID32: CLong = 202L

public val SYS_SETREUID32: CLong = 203L

public val SYS_SETREGID32: CLong = 204L

public val SYS_GETGROUPS32: CLong = 205L

public val SYS_SETGROUPS32: CLong = 206L

public val SYS_FCHOWN32: CLong = 207L

public val SYS_SETRESUID32: CLong = 208L

public val SYS_GETRESUID32: CLong = 209L

public val SYS_SETRESGID32: CLong = 210L

public val SYS_GETRESGID32: CLong = 211L

public val SYS_CHOWN32: CLong = 212L

public val SYS_SETUID32: CLong = 213L

public val SYS_SETGID32: CLong = 214L

public val SYS_SETFSUID32: CLong = 215L

public val SYS_SETFSGID32: CLong = 216L

public val SYS_GETDENTS64: CLong = 217L

public val SYS_PIVOT_ROOT: CLong = 218L

public val SYS_MINCORE: CLong = 219L

public val SYS_MADVISE: CLong = 220L

public val SYS_FCNTL64: CLong = 221L

public val SYS_GETTID: CLong = 224L

public val SYS_READAHEAD: CLong = 225L

public val SYS_SETXATTR: CLong = 226L

public val SYS_LSETXATTR: CLong = 227L

public val SYS_FSETXATTR: CLong = 228L

public val SYS_GETXATTR: CLong = 229L

public val SYS_LGETXATTR: CLong = 230L

public val SYS_FGETXATTR: CLong = 231L

public val SYS_LISTXATTR: CLong = 232L

public val SYS_LLISTXATTR: CLong = 233L

public val SYS_FLISTXATTR: CLong = 234L

public val SYS_REMOVEXATTR: CLong = 235L

public val SYS_LREMOVEXATTR: CLong = 236L

public val SYS_FREMOVEXATTR: CLong = 237L

public val SYS_TKILL: CLong = 238L

public val SYS_SENDFILE64: CLong = 239L

public val SYS_FUTEX: CLong = 240L

public val SYS_SCHED_SETAFFINITY: CLong = 241L

public val SYS_SCHED_GETAFFINITY: CLong = 242L

public val SYS_IO_SETUP: CLong = 243L

public val SYS_IO_DESTROY: CLong = 244L

public val SYS_IO_GETEVENTS: CLong = 245L

public val SYS_IO_SUBMIT: CLong = 246L

public val SYS_IO_CANCEL: CLong = 247L

public val SYS_EXIT_GROUP: CLong = 248L

public val SYS_LOOKUP_DCOOKIE: CLong = 249L

public val SYS_EPOLL_CREATE: CLong = 250L

public val SYS_EPOLL_CTL: CLong = 251L

public val SYS_EPOLL_WAIT: CLong = 252L

public val SYS_REMAP_FILE_PAGES: CLong = 253L

public val SYS_SET_TID_ADDRESS: CLong = 256L

public val SYS_TIMER_CREATE: CLong = 257L

public val SYS_TIMER_SETTIME: CLong = 258L

public val SYS_TIMER_GETTIME: CLong = 259L

public val SYS_TIMER_GETOVERRUN: CLong = 260L

public val SYS_TIMER_DELETE: CLong = 261L

public val SYS_CLOCK_SETTIME: CLong = 262L

public val SYS_CLOCK_GETTIME: CLong = 263L

public val SYS_CLOCK_GETRES: CLong = 264L

public val SYS_CLOCK_NANOSLEEP: CLong = 265L

public val SYS_STATFS64: CLong = 266L

public val SYS_FSTATFS64: CLong = 267L

public val SYS_TGKILL: CLong = 268L

public val SYS_UTIMES: CLong = 269L

public val SYS_PCICONFIG_IOBASE: CLong = 271L

public val SYS_PCICONFIG_READ: CLong = 272L

public val SYS_PCICONFIG_WRITE: CLong = 273L

public val SYS_MQ_OPEN: CLong = 274L

public val SYS_MQ_UNLINK: CLong = 275L

public val SYS_MQ_TIMEDSEND: CLong = 276L

public val SYS_MQ_TIMEDRECEIVE: CLong = 277L

public val SYS_MQ_NOTIFY: CLong = 278L

public val SYS_MQ_GETSETATTR: CLong = 279L

public val SYS_WAITID: CLong = 280L

public val SYS_SOCKET: CLong = 281L

public val SYS_BIND: CLong = 282L

public val SYS_CONNECT: CLong = 283L

public val SYS_LISTEN: CLong = 284L

public val SYS_ACCEPT: CLong = 285L

public val SYS_GETSOCKNAME: CLong = 286L

public val SYS_GETPEERNAME: CLong = 287L

public val SYS_SOCKETPAIR: CLong = 288L

public val SYS_SEND: CLong = 289L

public val SYS_SENDTO: CLong = 290L

public val SYS_RECV: CLong = 291L

public val SYS_RECVFROM: CLong = 292L

public val SYS_SHUTDOWN: CLong = 293L

public val SYS_SETSOCKOPT: CLong = 294L

public val SYS_GETSOCKOPT: CLong = 295L

public val SYS_SENDMSG: CLong = 296L

public val SYS_RECVMSG: CLong = 297L

public val SYS_SEMOP: CLong = 298L

public val SYS_SEMGET: CLong = 299L

public val SYS_SEMCTL: CLong = 300L

public val SYS_MSGSND: CLong = 301L

public val SYS_MSGRCV: CLong = 302L

public val SYS_MSGGET: CLong = 303L

public val SYS_MSGCTL: CLong = 304L

public val SYS_SHMAT: CLong = 305L

public val SYS_SHMDT: CLong = 306L

public val SYS_SHMGET: CLong = 307L

public val SYS_SHMCTL: CLong = 308L

public val SYS_ADD_KEY: CLong = 309L

public val SYS_REQUEST_KEY: CLong = 310L

public val SYS_KEYCTL: CLong = 311L

public val SYS_SEMTIMEDOP: CLong = 312L

public val SYS_VSERVER: CLong = 313L

public val SYS_IOPRIO_SET: CLong = 314L

public val SYS_IOPRIO_GET: CLong = 315L

public val SYS_INOTIFY_INIT: CLong = 316L

public val SYS_INOTIFY_ADD_WATCH: CLong = 317L

public val SYS_INOTIFY_RM_WATCH: CLong = 318L

public val SYS_MBIND: CLong = 319L

public val SYS_GET_MEMPOLICY: CLong = 320L

public val SYS_SET_MEMPOLICY: CLong = 321L

public val SYS_OPENAT: CLong = 322L

public val SYS_MKDIRAT: CLong = 323L

public val SYS_MKNODAT: CLong = 324L

public val SYS_FCHOWNAT: CLong = 325L

public val SYS_FUTIMESAT: CLong = 326L

public val SYS_FSTATAT64: CLong = 327L

public val SYS_UNLINKAT: CLong = 328L

public val SYS_RENAMEAT: CLong = 329L

public val SYS_LINKAT: CLong = 330L

public val SYS_SYMLINKAT: CLong = 331L

public val SYS_READLINKAT: CLong = 332L

public val SYS_FCHMODAT: CLong = 333L

public val SYS_FACCESSAT: CLong = 334L

public val SYS_PSELECT6: CLong = 335L

public val SYS_PPOLL: CLong = 336L

public val SYS_UNSHARE: CLong = 337L

public val SYS_SET_ROBUST_LIST: CLong = 338L

public val SYS_GET_ROBUST_LIST: CLong = 339L

public val SYS_SPLICE: CLong = 340L

public val SYS_TEE: CLong = 342L

public val SYS_VMSPLICE: CLong = 343L

public val SYS_MOVE_PAGES: CLong = 344L

public val SYS_GETCPU: CLong = 345L

public val SYS_EPOLL_PWAIT: CLong = 346L

public val SYS_KEXEC_LOAD: CLong = 347L

public val SYS_UTIMENSAT: CLong = 348L

public val SYS_SIGNALFD: CLong = 349L

public val SYS_TIMERFD_CREATE: CLong = 350L

public val SYS_EVENTFD: CLong = 351L

public val SYS_FALLOCATE: CLong = 352L

public val SYS_TIMERFD_SETTIME: CLong = 353L

public val SYS_TIMERFD_GETTIME: CLong = 354L

public val SYS_SIGNALFD4: CLong = 355L

public val SYS_EVENTFD2: CLong = 356L

public val SYS_EPOLL_CREATE1: CLong = 357L

public val SYS_DUP3: CLong = 358L

public val SYS_PIPE2: CLong = 359L

public val SYS_INOTIFY_INIT1: CLong = 360L

public val SYS_PREADV: CLong = 361L

public val SYS_PWRITEV: CLong = 362L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 363L

public val SYS_PERF_EVENT_OPEN: CLong = 364L

public val SYS_RECVMMSG: CLong = 365L

public val SYS_ACCEPT4: CLong = 366L

public val SYS_FANOTIFY_INIT: CLong = 367L

public val SYS_FANOTIFY_MARK: CLong = 368L

public val SYS_PRLIMIT64: CLong = 369L

public val SYS_NAME_TO_HANDLE_AT: CLong = 370L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 371L

public val SYS_CLOCK_ADJTIME: CLong = 372L

public val SYS_SYNCFS: CLong = 373L

public val SYS_SENDMMSG: CLong = 374L

public val SYS_SETNS: CLong = 375L

public val SYS_PROCESS_VM_READV: CLong = 376L

public val SYS_PROCESS_VM_WRITEV: CLong = 377L

public val SYS_KCMP: CLong = 378L

public val SYS_FINIT_MODULE: CLong = 379L

public val SYS_SCHED_SETATTR: CLong = 380L

public val SYS_SCHED_GETATTR: CLong = 381L

public val SYS_RENAMEAT2: CLong = 382L

public val SYS_SECCOMP: CLong = 383L

public val SYS_GETRANDOM: CLong = 384L

public val SYS_MEMFD_CREATE: CLong = 385L

public val SYS_BPF: CLong = 386L

public val SYS_EXECVEAT: CLong = 387L

public val SYS_USERFAULTFD: CLong = 388L

public val SYS_MEMBARRIER: CLong = 389L

public val SYS_MLOCK2: CLong = 390L

public val SYS_COPY_FILE_RANGE: CLong = 391L

public val SYS_PREADV2: CLong = 392L

public val SYS_PWRITEV2: CLong = 393L

public val SYS_PKEY_MPROTECT: CLong = 394L

public val SYS_PKEY_ALLOC: CLong = 395L

public val SYS_PKEY_FREE: CLong = 396L

public val SYS_STATX: CLong = 397L

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

public val SYS_MSEAL: CLong = 462L
