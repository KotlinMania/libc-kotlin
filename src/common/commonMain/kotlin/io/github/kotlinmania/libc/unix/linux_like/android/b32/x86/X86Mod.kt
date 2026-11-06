package io.github.kotlinmania.libc.unix.linux_like.android.b32.x86

public typealias WcharT = Int

public typealias GregT = Int

public val O_DIRECT: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_LARGEFILE: CInt = 32768

public val MAP_32BIT: CInt = 0x40

// Syscall table
public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_WAITPID: CLong = 7L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECVE: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_TIME: CLong = 13L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_BREAK: CLong = 17L

public val SYS_OLDSTAT: CLong = 18L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_MOUNT: CLong = 21L

public val SYS_UMOUNT: CLong = 22L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_STIME: CLong = 25L

public val SYS_PTRACE: CLong = 26L

public val SYS_ALARM: CLong = 27L

public val SYS_OLDFSTAT: CLong = 28L

public val SYS_PAUSE: CLong = 29L

public val SYS_UTIME: CLong = 30L

public val SYS_STTY: CLong = 31L

public val SYS_GTTY: CLong = 32L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_FTIME: CLong = 35L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_RENAME: CLong = 38L

public val SYS_MKDIR: CLong = 39L

public val SYS_RMDIR: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_PROF: CLong = 44L

public val SYS_BRK: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_SIGNAL: CLong = 48L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_UMOUNT2: CLong = 52L

public val SYS_LOCK: CLong = 53L

public val SYS_IOCTL: CLong = 54L

public val SYS_FCNTL: CLong = 55L

public val SYS_MPX: CLong = 56L

public val SYS_SETPGID: CLong = 57L

public val SYS_ULIMIT: CLong = 58L

public val SYS_OLDOLDUNAME: CLong = 59L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_USTAT: CLong = 62L

public val SYS_DUP2: CLong = 63L

public val SYS_GETPPID: CLong = 64L

public val SYS_GETPGRP: CLong = 65L

public val SYS_SETSID: CLong = 66L

public val SYS_SIGACTION: CLong = 67L

public val SYS_SGETMASK: CLong = 68L

public val SYS_SSETMASK: CLong = 69L

public val SYS_SETREUID: CLong = 70L

public val SYS_SETREGID: CLong = 71L

public val SYS_SIGSUSPEND: CLong = 72L

public val SYS_SIGPENDING: CLong = 73L

public val SYS_SETHOSTNAME: CLong = 74L

public val SYS_SETRLIMIT: CLong = 75L

public val SYS_GETRLIMIT: CLong = 76L

public val SYS_GETRUSAGE: CLong = 77L

public val SYS_GETTIMEOFDAY: CLong = 78L

public val SYS_SETTIMEOFDAY: CLong = 79L

public val SYS_GETGROUPS: CLong = 80L

public val SYS_SETGROUPS: CLong = 81L

public val SYS_SELECT: CLong = 82L

public val SYS_SYMLINK: CLong = 83L

public val SYS_OLDLSTAT: CLong = 84L

public val SYS_READLINK: CLong = 85L

public val SYS_USELIB: CLong = 86L

public val SYS_SWAPON: CLong = 87L

public val SYS_REBOOT: CLong = 88L

public val SYS_READDIR: CLong = 89L

public val SYS_MMAP: CLong = 90L

public val SYS_MUNMAP: CLong = 91L

public val SYS_TRUNCATE: CLong = 92L

public val SYS_FTRUNCATE: CLong = 93L

public val SYS_FCHMOD: CLong = 94L

public val SYS_FCHOWN: CLong = 95L

public val SYS_GETPRIORITY: CLong = 96L

public val SYS_SETPRIORITY: CLong = 97L

public val SYS_PROFIL: CLong = 98L

public val SYS_STATFS: CLong = 99L

public val SYS_FSTATFS: CLong = 100L

public val SYS_IOPERM: CLong = 101L

public val SYS_SOCKETCALL: CLong = 102L

public val SYS_SYSLOG: CLong = 103L

public val SYS_SETITIMER: CLong = 104L

public val SYS_GETITIMER: CLong = 105L

public val SYS_STAT: CLong = 106L

public val SYS_LSTAT: CLong = 107L

public val SYS_FSTAT: CLong = 108L

public val SYS_OLDUNAME: CLong = 109L

public val SYS_IOPL: CLong = 110L

public val SYS_VHANGUP: CLong = 111L

public val SYS_IDLE: CLong = 112L

public val SYS_VM86OLD: CLong = 113L

public val SYS_WAIT4: CLong = 114L

public val SYS_SWAPOFF: CLong = 115L

public val SYS_SYSINFO: CLong = 116L

public val SYS_IPC: CLong = 117L

public val SYS_FSYNC: CLong = 118L

public val SYS_SIGRETURN: CLong = 119L

public val SYS_CLONE: CLong = 120L

public val SYS_SETDOMAINNAME: CLong = 121L

public val SYS_UNAME: CLong = 122L

public val SYS_MODIFY_LDT: CLong = 123L

public val SYS_ADJTIMEX: CLong = 124L

public val SYS_MPROTECT: CLong = 125L

public val SYS_SIGPROCMASK: CLong = 126L

public val SYS_CREATE_MODULE: CLong = 127L

public val SYS_INIT_MODULE: CLong = 128L

public val SYS_DELETE_MODULE: CLong = 129L

public val SYS_GET_KERNEL_SYMS: CLong = 130L

public val SYS_QUOTACTL: CLong = 131L

public val SYS_GETPGID: CLong = 132L

public val SYS_FCHDIR: CLong = 133L

public val SYS_BDFLUSH: CLong = 134L

public val SYS_SYSFS: CLong = 135L

public val SYS_PERSONALITY: CLong = 136L

public val SYS_AFS_SYSCALL: CLong = 137L

public val SYS_SETFSUID: CLong = 138L

public val SYS_SETFSGID: CLong = 139L

// Note(android): SysLlseek is in the NDK sources but for some reason is
// not available in the tests
// pub const SysLlseek: cLong = 140;
public val SYS_GETDENTS: CLong = 141L

// Note(android): SysNewselect is in the NDK sources but for some reason is
// not available in the tests
// pub const SysNewselect: cLong = 142;
public val SYS_FLOCK: CLong = 143L

public val SYS_MSYNC: CLong = 144L

public val SYS_READV: CLong = 145L

public val SYS_WRITEV: CLong = 146L

public val SYS_GETSID: CLong = 147L

public val SYS_FDATASYNC: CLong = 148L

// Note(android): SysLlseek is in the NDK sources but for some reason is
// not available in the tests
// pub const SysSysctl: cLong = 149;
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

public val SYS_VM86: CLong = 166L

public val SYS_QUERY_MODULE: CLong = 167L

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

public val SYS_GETPMSG: CLong = 188L

public val SYS_PUTPMSG: CLong = 189L

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

public val SYS_PIVOT_ROOT: CLong = 217L

public val SYS_MINCORE: CLong = 218L

public val SYS_MADVISE: CLong = 219L

public val SYS_GETDENTS64: CLong = 220L

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

public val SYS_SET_THREAD_AREA: CLong = 243L

public val SYS_GET_THREAD_AREA: CLong = 244L

public val SYS_IO_SETUP: CLong = 245L

public val SYS_IO_DESTROY: CLong = 246L

public val SYS_IO_GETEVENTS: CLong = 247L

public val SYS_IO_SUBMIT: CLong = 248L

public val SYS_IO_CANCEL: CLong = 249L

public val SYS_FADVISE64: CLong = 250L

public val SYS_EXIT_GROUP: CLong = 252L

public val SYS_LOOKUP_DCOOKIE: CLong = 253L

public val SYS_EPOLL_CREATE: CLong = 254L

public val SYS_EPOLL_CTL: CLong = 255L

public val SYS_EPOLL_WAIT: CLong = 256L

public val SYS_REMAP_FILE_PAGES: CLong = 257L

public val SYS_SET_TID_ADDRESS: CLong = 258L

public val SYS_TIMER_CREATE: CLong = 259L

public val SYS_TIMER_SETTIME: CLong = 260L

public val SYS_TIMER_GETTIME: CLong = 261L

public val SYS_TIMER_GETOVERRUN: CLong = 262L

public val SYS_TIMER_DELETE: CLong = 263L

public val SYS_CLOCK_SETTIME: CLong = 264L

public val SYS_CLOCK_GETTIME: CLong = 265L

public val SYS_CLOCK_GETRES: CLong = 266L

public val SYS_CLOCK_NANOSLEEP: CLong = 267L

public val SYS_STATFS64: CLong = 268L

public val SYS_FSTATFS64: CLong = 269L

public val SYS_TGKILL: CLong = 270L

public val SYS_UTIMES: CLong = 271L

public val SYS_FADVISE64_64: CLong = 272L

public val SYS_VSERVER: CLong = 273L

public val SYS_MBIND: CLong = 274L

public val SYS_GET_MEMPOLICY: CLong = 275L

public val SYS_SET_MEMPOLICY: CLong = 276L

public val SYS_MQ_OPEN: CLong = 277L

public val SYS_MQ_UNLINK: CLong = 278L

public val SYS_MQ_TIMEDSEND: CLong = 279L

public val SYS_MQ_TIMEDRECEIVE: CLong = 280L

public val SYS_MQ_NOTIFY: CLong = 281L

public val SYS_MQ_GETSETATTR: CLong = 282L

public val SYS_KEXEC_LOAD: CLong = 283L

public val SYS_WAITID: CLong = 284L

public val SYS_ADD_KEY: CLong = 286L

public val SYS_REQUEST_KEY: CLong = 287L

public val SYS_KEYCTL: CLong = 288L

public val SYS_IOPRIO_SET: CLong = 289L

public val SYS_IOPRIO_GET: CLong = 290L

public val SYS_INOTIFY_INIT: CLong = 291L

public val SYS_INOTIFY_ADD_WATCH: CLong = 292L

public val SYS_INOTIFY_RM_WATCH: CLong = 293L

public val SYS_MIGRATE_PAGES: CLong = 294L

public val SYS_OPENAT: CLong = 295L

public val SYS_MKDIRAT: CLong = 296L

public val SYS_MKNODAT: CLong = 297L

public val SYS_FCHOWNAT: CLong = 298L

public val SYS_FUTIMESAT: CLong = 299L

public val SYS_FSTATAT64: CLong = 300L

public val SYS_UNLINKAT: CLong = 301L

public val SYS_RENAMEAT: CLong = 302L

public val SYS_LINKAT: CLong = 303L

public val SYS_SYMLINKAT: CLong = 304L

public val SYS_READLINKAT: CLong = 305L

public val SYS_FCHMODAT: CLong = 306L

public val SYS_FACCESSAT: CLong = 307L

public val SYS_PSELECT6: CLong = 308L

public val SYS_PPOLL: CLong = 309L

public val SYS_UNSHARE: CLong = 310L

public val SYS_SET_ROBUST_LIST: CLong = 311L

public val SYS_GET_ROBUST_LIST: CLong = 312L

public val SYS_SPLICE: CLong = 313L

public val SYS_SYNC_FILE_RANGE: CLong = 314L

public val SYS_TEE: CLong = 315L

public val SYS_VMSPLICE: CLong = 316L

public val SYS_MOVE_PAGES: CLong = 317L

public val SYS_GETCPU: CLong = 318L

public val SYS_EPOLL_PWAIT: CLong = 319L

public val SYS_UTIMENSAT: CLong = 320L

public val SYS_SIGNALFD: CLong = 321L

public val SYS_TIMERFD_CREATE: CLong = 322L

public val SYS_EVENTFD: CLong = 323L

public val SYS_FALLOCATE: CLong = 324L

public val SYS_TIMERFD_SETTIME: CLong = 325L

public val SYS_TIMERFD_GETTIME: CLong = 326L

public val SYS_SIGNALFD4: CLong = 327L

public val SYS_EVENTFD2: CLong = 328L

public val SYS_EPOLL_CREATE1: CLong = 329L

public val SYS_DUP3: CLong = 330L

public val SYS_PIPE2: CLong = 331L

public val SYS_INOTIFY_INIT1: CLong = 332L

public val SYS_PREADV: CLong = 333L

public val SYS_PWRITEV: CLong = 334L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 335L

public val SYS_PERF_EVENT_OPEN: CLong = 336L

public val SYS_RECVMMSG: CLong = 337L

public val SYS_FANOTIFY_INIT: CLong = 338L

public val SYS_FANOTIFY_MARK: CLong = 339L

public val SYS_PRLIMIT64: CLong = 340L

public val SYS_NAME_TO_HANDLE_AT: CLong = 341L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 342L

public val SYS_CLOCK_ADJTIME: CLong = 343L

public val SYS_SYNCFS: CLong = 344L

public val SYS_SENDMMSG: CLong = 345L

public val SYS_SETNS: CLong = 346L

public val SYS_PROCESS_VM_READV: CLong = 347L

public val SYS_PROCESS_VM_WRITEV: CLong = 348L

public val SYS_KCMP: CLong = 349L

public val SYS_FINIT_MODULE: CLong = 350L

public val SYS_SCHED_SETATTR: CLong = 351L

public val SYS_SCHED_GETATTR: CLong = 352L

public val SYS_RENAMEAT2: CLong = 353L

public val SYS_SECCOMP: CLong = 354L

public val SYS_GETRANDOM: CLong = 355L

public val SYS_MEMFD_CREATE: CLong = 356L

public val SYS_BPF: CLong = 357L

public val SYS_EXECVEAT: CLong = 358L

public val SYS_SOCKET: CLong = 359L

public val SYS_SOCKETPAIR: CLong = 360L

public val SYS_BIND: CLong = 361L

public val SYS_CONNECT: CLong = 362L

public val SYS_LISTEN: CLong = 363L

public val SYS_ACCEPT4: CLong = 364L

public val SYS_GETSOCKOPT: CLong = 365L

public val SYS_SETSOCKOPT: CLong = 366L

public val SYS_GETSOCKNAME: CLong = 367L

public val SYS_GETPEERNAME: CLong = 368L

public val SYS_SENDTO: CLong = 369L

public val SYS_SENDMSG: CLong = 370L

public val SYS_RECVFROM: CLong = 371L

public val SYS_RECVMSG: CLong = 372L

public val SYS_SHUTDOWN: CLong = 373L

public val SYS_USERFAULTFD: CLong = 374L

public val SYS_MEMBARRIER: CLong = 375L

public val SYS_MLOCK2: CLong = 376L

public val SYS_COPY_FILE_RANGE: CLong = 377L

public val SYS_PREADV2: CLong = 378L

public val SYS_PWRITEV2: CLong = 379L

public val SYS_PKEY_MPROTECT: CLong = 380L

public val SYS_PKEY_ALLOC: CLong = 381L

public val SYS_PKEY_FREE: CLong = 382L

public val SYS_STATX: CLong = 383L

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

// offsets in userRegsStructs, from sys/reg.h
public val EBX: CInt = 0

public val ECX: CInt = 1

public val EDX: CInt = 2

public val ESI: CInt = 3

public val EDI: CInt = 4

public val EBP: CInt = 5

public val EAX: CInt = 6

public val DS: CInt = 7

public val ES: CInt = 8

public val FS: CInt = 9

public val GS: CInt = 10

public val ORIG_EAX: CInt = 11

public val EIP: CInt = 12

public val CS: CInt = 13

public val EFL: CInt = 14

public val UESP: CInt = 15

public val SS: CInt = 16

// offsets in mcontextT.gregs from sys/ucontext.h
public val REG_GS: CInt = 0

public val REG_FS: CInt = 1

public val REG_ES: CInt = 2

public val REG_DS: CInt = 3

public val REG_EDI: CInt = 4

public val REG_ESI: CInt = 5

public val REG_EBP: CInt = 6

public val REG_ESP: CInt = 7

public val REG_EBX: CInt = 8

public val REG_EDX: CInt = 9

public val REG_ECX: CInt = 10

public val REG_EAX: CInt = 11

public val REG_TRAPNO: CInt = 12

public val REG_ERR: CInt = 13

public val REG_EIP: CInt = 14

public val REG_CS: CInt = 15

public val REG_EFL: CInt = 16

public val REG_UESP: CInt = 17

public val REG_SS: CInt = 18

// From NDK's asm/auxvec.h
public val AT_SYSINFO: CUlong = 32uL

public val AT_SYSINFO_EHDR: CUlong = 33uL

public val AT_VECTOR_SIZE_ARCH: CUlong = 3uL

// socketcall values from linux/net.h (only the needed ones, and not public)
public val SYS_ACCEPT41: CInt = 18
