package io.github.kotlinmania.libc.unix.linux_like.android.b64.aarch64

import off64T

public typealias WcharT = UInt

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public val O_DIRECT: CInt = 0x10000

public val O_DIRECTORY: CInt = 0x4000

public val O_NOFOLLOW: CInt = 0x8000

public val O_LARGEFILE: CInt = 131072

public val SIGSTKSZ: SizeT = 16384uL

public val MINSIGSTKSZ: SizeT = 5120uL

// From NDK's asm/hwcap.h
public val HWCAP_FP: CUlong = 1uL shl 0

public val HWCAP_ASIMD: CUlong = 1uL shl 1

public val HWCAP_EVTSTRM: CUlong = 1uL shl 2

public val HWCAP_AES: CUlong = 1uL shl 3

public val HWCAP_PMULL: CUlong = 1uL shl 4

public val HWCAP_SHA1: CUlong = 1uL shl 5

public val HWCAP_SHA2: CUlong = 1uL shl 6

public val HWCAP_CRC32: CUlong = 1uL shl 7

public val HWCAP_ATOMICS: CUlong = 1uL shl 8

public val HWCAP_FPHP: CUlong = 1uL shl 9

public val HWCAP_ASIMDHP: CUlong = 1uL shl 10

public val HWCAP_CPUID: CUlong = 1uL shl 11

public val HWCAP_ASIMDRDM: CUlong = 1uL shl 12

public val HWCAP_JSCVT: CUlong = 1uL shl 13

public val HWCAP_FCMA: CUlong = 1uL shl 14

public val HWCAP_LRCPC: CUlong = 1uL shl 15

public val HWCAP_DCPOP: CUlong = 1uL shl 16

public val HWCAP_SHA3: CUlong = 1uL shl 17

public val HWCAP_SM3: CUlong = 1uL shl 18

public val HWCAP_SM4: CUlong = 1uL shl 19

public val HWCAP_ASIMDDP: CUlong = 1uL shl 20

public val HWCAP_SHA512: CUlong = 1uL shl 21

public val HWCAP_SVE: CUlong = 1uL shl 22

public val HWCAP_ASIMDFHM: CUlong = 1uL shl 23

public val HWCAP_DIT: CUlong = 1uL shl 24

public val HWCAP_USCAT: CUlong = 1uL shl 25

public val HWCAP_ILRCPC: CUlong = 1uL shl 26

public val HWCAP_FLAGM: CUlong = 1uL shl 27

public val HWCAP_SSBS: CUlong = 1uL shl 28

public val HWCAP_SB: CUlong = 1uL shl 29

public val HWCAP_PACA: CUlong = 1uL shl 30

public val HWCAP_PACG: CUlong = 1uL shl 31

public val HWCAP2_DCPODP: CUlong = 1uL shl 0

public val HWCAP2_SVE2: CUlong = 1uL shl 1

public val HWCAP2_SVEAES: CUlong = 1uL shl 2

public val HWCAP2_SVEPMULL: CUlong = 1uL shl 3

public val HWCAP2_SVEBITPERM: CUlong = 1uL shl 4

public val HWCAP2_SVESHA3: CUlong = 1uL shl 5

public val HWCAP2_SVESM4: CUlong = 1uL shl 6

public val HWCAP2_FLAGM2: CUlong = 1uL shl 7

public val HWCAP2_FRINT: CUlong = 1uL shl 8

public val HWCAP2_SVEI8MM: CUlong = 1uL shl 9

public val HWCAP2_SVEF32MM: CUlong = 1uL shl 10

public val HWCAP2_SVEF64MM: CUlong = 1uL shl 11

public val HWCAP2_SVEBF16: CUlong = 1uL shl 12

public val HWCAP2_I8MM: CUlong = 1uL shl 13

public val HWCAP2_BF16: CUlong = 1uL shl 14

public val HWCAP2_DGH: CUlong = 1uL shl 15

public val HWCAP2_RNG: CUlong = 1uL shl 16

public val HWCAP2_BTI: CUlong = 1uL shl 17

public val HWCAP2_MTE: CUlong = 1uL shl 18

public val HWCAP2_ECV: CUlong = 1uL shl 19

public val HWCAP2_AFP: CUlong = 1uL shl 20

public val HWCAP2_RPRES: CUlong = 1uL shl 21

public val HWCAP2_MTE3: CUlong = 1uL shl 22

public val HWCAP2_SME: CUlong = 1uL shl 23

public val HWCAP2_SME_I16I64: CUlong = 1uL shl 24

public val HWCAP2_SME_F64F64: CUlong = 1uL shl 25

public val HWCAP2_SME_I8I32: CUlong = 1uL shl 26

public val HWCAP2_SME_F16F32: CUlong = 1uL shl 27

public val HWCAP2_SME_B16F32: CUlong = 1uL shl 28

public val HWCAP2_SME_F32F32: CUlong = 1uL shl 29

public val HWCAP2_SME_FA64: CUlong = 1uL shl 30

public val HWCAP2_WFXT: CUlong = 1uL shl 31

public val HWCAP2_EBF16: CUlong = 1uL shl 32

public val HWCAP2_SVE_EBF16: CUlong = 1uL shl 33

public val SYS_IO_SETUP: CLong = 0L

public val SYS_IO_DESTROY: CLong = 1L

public val SYS_IO_SUBMIT: CLong = 2L

public val SYS_IO_CANCEL: CLong = 3L

public val SYS_IO_GETEVENTS: CLong = 4L

public val SYS_SETXATTR: CLong = 5L

public val SYS_LSETXATTR: CLong = 6L

public val SYS_FSETXATTR: CLong = 7L

public val SYS_GETXATTR: CLong = 8L

public val SYS_LGETXATTR: CLong = 9L

public val SYS_FGETXATTR: CLong = 10L

public val SYS_LISTXATTR: CLong = 11L

public val SYS_LLISTXATTR: CLong = 12L

public val SYS_FLISTXATTR: CLong = 13L

public val SYS_REMOVEXATTR: CLong = 14L

public val SYS_LREMOVEXATTR: CLong = 15L

public val SYS_FREMOVEXATTR: CLong = 16L

public val SYS_GETCWD: CLong = 17L

public val SYS_LOOKUP_DCOOKIE: CLong = 18L

public val SYS_EVENTFD2: CLong = 19L

public val SYS_EPOLL_CREATE1: CLong = 20L

public val SYS_EPOLL_CTL: CLong = 21L

public val SYS_EPOLL_PWAIT: CLong = 22L

public val SYS_DUP: CLong = 23L

public val SYS_DUP3: CLong = 24L

public val SYS_FCNTL: CLong = 25L

public val SYS_INOTIFY_INIT1: CLong = 26L

public val SYS_INOTIFY_ADD_WATCH: CLong = 27L

public val SYS_INOTIFY_RM_WATCH: CLong = 28L

public val SYS_IOCTL: CLong = 29L

public val SYS_IOPRIO_SET: CLong = 30L

public val SYS_IOPRIO_GET: CLong = 31L

public val SYS_FLOCK: CLong = 32L

public val SYS_MKNODAT: CLong = 33L

public val SYS_MKDIRAT: CLong = 34L

public val SYS_UNLINKAT: CLong = 35L

public val SYS_SYMLINKAT: CLong = 36L

public val SYS_LINKAT: CLong = 37L

public val SYS_RENAMEAT: CLong = 38L

public val SYS_UMOUNT2: CLong = 39L

public val SYS_MOUNT: CLong = 40L

public val SYS_PIVOT_ROOT: CLong = 41L

public val SYS_NFSSERVCTL: CLong = 42L

public val SYS_FALLOCATE: CLong = 47L

public val SYS_FACCESSAT: CLong = 48L

public val SYS_CHDIR: CLong = 49L

public val SYS_FCHDIR: CLong = 50L

public val SYS_CHROOT: CLong = 51L

public val SYS_FCHMOD: CLong = 52L

public val SYS_FCHMODAT: CLong = 53L

public val SYS_FCHOWNAT: CLong = 54L

public val SYS_FCHOWN: CLong = 55L

public val SYS_OPENAT: CLong = 56L

public val SYS_CLOSE: CLong = 57L

public val SYS_VHANGUP: CLong = 58L

public val SYS_PIPE2: CLong = 59L

public val SYS_QUOTACTL: CLong = 60L

public val SYS_GETDENTS64: CLong = 61L

public val SYS_LSEEK: CLong = 62L

public val SYS_READ: CLong = 63L

public val SYS_WRITE: CLong = 64L

public val SYS_READV: CLong = 65L

public val SYS_WRITEV: CLong = 66L

public val SYS_PREAD64: CLong = 67L

public val SYS_PWRITE64: CLong = 68L

public val SYS_PREADV: CLong = 69L

public val SYS_PWRITEV: CLong = 70L

public val SYS_PSELECT6: CLong = 72L

public val SYS_PPOLL: CLong = 73L

public val SYS_SIGNALFD4: CLong = 74L

public val SYS_VMSPLICE: CLong = 75L

public val SYS_SPLICE: CLong = 76L

public val SYS_TEE: CLong = 77L

public val SYS_READLINKAT: CLong = 78L

public val SYS_SYNC: CLong = 81L

public val SYS_FSYNC: CLong = 82L

public val SYS_FDATASYNC: CLong = 83L

public val SYS_SYNC_FILE_RANGE: CLong = 84L

public val SYS_TIMERFD_CREATE: CLong = 85L

public val SYS_TIMERFD_SETTIME: CLong = 86L

public val SYS_TIMERFD_GETTIME: CLong = 87L

public val SYS_UTIMENSAT: CLong = 88L

public val SYS_ACCT: CLong = 89L

public val SYS_CAPGET: CLong = 90L

public val SYS_CAPSET: CLong = 91L

public val SYS_PERSONALITY: CLong = 92L

public val SYS_EXIT: CLong = 93L

public val SYS_EXIT_GROUP: CLong = 94L

public val SYS_WAITID: CLong = 95L

public val SYS_SET_TID_ADDRESS: CLong = 96L

public val SYS_UNSHARE: CLong = 97L

public val SYS_FUTEX: CLong = 98L

public val SYS_SET_ROBUST_LIST: CLong = 99L

public val SYS_GET_ROBUST_LIST: CLong = 100L

public val SYS_NANOSLEEP: CLong = 101L

public val SYS_GETITIMER: CLong = 102L

public val SYS_SETITIMER: CLong = 103L

public val SYS_KEXEC_LOAD: CLong = 104L

public val SYS_INIT_MODULE: CLong = 105L

public val SYS_DELETE_MODULE: CLong = 106L

public val SYS_TIMER_CREATE: CLong = 107L

public val SYS_TIMER_GETTIME: CLong = 108L

public val SYS_TIMER_GETOVERRUN: CLong = 109L

public val SYS_TIMER_SETTIME: CLong = 110L

public val SYS_TIMER_DELETE: CLong = 111L

public val SYS_CLOCK_SETTIME: CLong = 112L

public val SYS_CLOCK_GETTIME: CLong = 113L

public val SYS_CLOCK_GETRES: CLong = 114L

public val SYS_CLOCK_NANOSLEEP: CLong = 115L

public val SYS_SYSLOG: CLong = 116L

public val SYS_PTRACE: CLong = 117L

public val SYS_SCHED_SETPARAM: CLong = 118L

public val SYS_SCHED_SETSCHEDULER: CLong = 119L

public val SYS_SCHED_GETSCHEDULER: CLong = 120L

public val SYS_SCHED_GETPARAM: CLong = 121L

public val SYS_SCHED_SETAFFINITY: CLong = 122L

public val SYS_SCHED_GETAFFINITY: CLong = 123L

public val SYS_SCHED_YIELD: CLong = 124L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 125L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 126L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 127L

public val SYS_RESTART_SYSCALL: CLong = 128L

public val SYS_KILL: CLong = 129L

public val SYS_TKILL: CLong = 130L

public val SYS_TGKILL: CLong = 131L

public val SYS_SIGALTSTACK: CLong = 132L

public val SYS_RT_SIGSUSPEND: CLong = 133L

public val SYS_RT_SIGACTION: CLong = 134L

public val SYS_RT_SIGPROCMASK: CLong = 135L

public val SYS_RT_SIGPENDING: CLong = 136L

public val SYS_RT_SIGTIMEDWAIT: CLong = 137L

public val SYS_RT_SIGQUEUEINFO: CLong = 138L

public val SYS_RT_SIGRETURN: CLong = 139L

public val SYS_SETPRIORITY: CLong = 140L

public val SYS_GETPRIORITY: CLong = 141L

public val SYS_REBOOT: CLong = 142L

public val SYS_SETREGID: CLong = 143L

public val SYS_SETGID: CLong = 144L

public val SYS_SETREUID: CLong = 145L

public val SYS_SETUID: CLong = 146L

public val SYS_SETRESUID: CLong = 147L

public val SYS_GETRESUID: CLong = 148L

public val SYS_SETRESGID: CLong = 149L

public val SYS_GETRESGID: CLong = 150L

public val SYS_SETFSUID: CLong = 151L

public val SYS_SETFSGID: CLong = 152L

public val SYS_TIMES: CLong = 153L

public val SYS_SETPGID: CLong = 154L

public val SYS_GETPGID: CLong = 155L

public val SYS_GETSID: CLong = 156L

public val SYS_SETSID: CLong = 157L

public val SYS_GETGROUPS: CLong = 158L

public val SYS_SETGROUPS: CLong = 159L

public val SYS_UNAME: CLong = 160L

public val SYS_SETHOSTNAME: CLong = 161L

public val SYS_SETDOMAINNAME: CLong = 162L

public val SYS_GETRLIMIT: CLong = 163L

public val SYS_SETRLIMIT: CLong = 164L

public val SYS_GETRUSAGE: CLong = 165L

public val SYS_UMASK: CLong = 166L

public val SYS_PRCTL: CLong = 167L

public val SYS_GETCPU: CLong = 168L

public val SYS_GETTIMEOFDAY: CLong = 169L

public val SYS_SETTIMEOFDAY: CLong = 170L

public val SYS_ADJTIMEX: CLong = 171L

public val SYS_GETPID: CLong = 172L

public val SYS_GETPPID: CLong = 173L

public val SYS_GETUID: CLong = 174L

public val SYS_GETEUID: CLong = 175L

public val SYS_GETGID: CLong = 176L

public val SYS_GETEGID: CLong = 177L

public val SYS_GETTID: CLong = 178L

public val SYS_SYSINFO: CLong = 179L

public val SYS_MQ_OPEN: CLong = 180L

public val SYS_MQ_UNLINK: CLong = 181L

public val SYS_MQ_TIMEDSEND: CLong = 182L

public val SYS_MQ_TIMEDRECEIVE: CLong = 183L

public val SYS_MQ_NOTIFY: CLong = 184L

public val SYS_MQ_GETSETATTR: CLong = 185L

public val SYS_MSGGET: CLong = 186L

public val SYS_MSGCTL: CLong = 187L

public val SYS_MSGRCV: CLong = 188L

public val SYS_MSGSND: CLong = 189L

public val SYS_SEMGET: CLong = 190L

public val SYS_SEMCTL: CLong = 191L

public val SYS_SEMTIMEDOP: CLong = 192L

public val SYS_SEMOP: CLong = 193L

public val SYS_SHMGET: CLong = 194L

public val SYS_SHMCTL: CLong = 195L

public val SYS_SHMAT: CLong = 196L

public val SYS_SHMDT: CLong = 197L

public val SYS_SOCKET: CLong = 198L

public val SYS_SOCKETPAIR: CLong = 199L

public val SYS_BIND: CLong = 200L

public val SYS_LISTEN: CLong = 201L

public val SYS_ACCEPT: CLong = 202L

public val SYS_CONNECT: CLong = 203L

public val SYS_GETSOCKNAME: CLong = 204L

public val SYS_GETPEERNAME: CLong = 205L

public val SYS_SENDTO: CLong = 206L

public val SYS_RECVFROM: CLong = 207L

public val SYS_SETSOCKOPT: CLong = 208L

public val SYS_GETSOCKOPT: CLong = 209L

public val SYS_SHUTDOWN: CLong = 210L

public val SYS_SENDMSG: CLong = 211L

public val SYS_RECVMSG: CLong = 212L

public val SYS_READAHEAD: CLong = 213L

public val SYS_BRK: CLong = 214L

public val SYS_MUNMAP: CLong = 215L

public val SYS_MREMAP: CLong = 216L

public val SYS_ADD_KEY: CLong = 217L

public val SYS_REQUEST_KEY: CLong = 218L

public val SYS_KEYCTL: CLong = 219L

public val SYS_CLONE: CLong = 220L

public val SYS_EXECVE: CLong = 221L

public val SYS_MMAP: CLong = 222L

public val SYS_SWAPON: CLong = 224L

public val SYS_SWAPOFF: CLong = 225L

public val SYS_MPROTECT: CLong = 226L

public val SYS_MSYNC: CLong = 227L

public val SYS_MLOCK: CLong = 228L

public val SYS_MUNLOCK: CLong = 229L

public val SYS_MLOCKALL: CLong = 230L

public val SYS_MUNLOCKALL: CLong = 231L

public val SYS_MINCORE: CLong = 232L

public val SYS_MADVISE: CLong = 233L

public val SYS_REMAP_FILE_PAGES: CLong = 234L

public val SYS_MBIND: CLong = 235L

public val SYS_GET_MEMPOLICY: CLong = 236L

public val SYS_SET_MEMPOLICY: CLong = 237L

public val SYS_MIGRATE_PAGES: CLong = 238L

public val SYS_MOVE_PAGES: CLong = 239L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 240L

public val SYS_PERF_EVENT_OPEN: CLong = 241L

public val SYS_ACCEPT4: CLong = 242L

public val SYS_RECVMMSG: CLong = 243L

public val SYS_ARCH_SPECIFIC_SYSCALL: CLong = 244L

public val SYS_WAIT4: CLong = 260L

public val SYS_PRLIMIT64: CLong = 261L

public val SYS_FANOTIFY_INIT: CLong = 262L

public val SYS_FANOTIFY_MARK: CLong = 263L

public val SYS_NAME_TO_HANDLE_AT: CLong = 264L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 265L

public val SYS_CLOCK_ADJTIME: CLong = 266L

public val SYS_SYNCFS: CLong = 267L

public val SYS_SETNS: CLong = 268L

public val SYS_SENDMMSG: CLong = 269L

public val SYS_PROCESS_VM_READV: CLong = 270L

public val SYS_PROCESS_VM_WRITEV: CLong = 271L

public val SYS_KCMP: CLong = 272L

public val SYS_FINIT_MODULE: CLong = 273L

public val SYS_SCHED_SETATTR: CLong = 274L

public val SYS_SCHED_GETATTR: CLong = 275L

public val SYS_RENAMEAT2: CLong = 276L

public val SYS_SECCOMP: CLong = 277L

public val SYS_GETRANDOM: CLong = 278L

public val SYS_MEMFD_CREATE: CLong = 279L

public val SYS_BPF: CLong = 280L

public val SYS_EXECVEAT: CLong = 281L

public val SYS_USERFAULTFD: CLong = 282L

public val SYS_MEMBARRIER: CLong = 283L

public val SYS_MLOCK2: CLong = 284L

public val SYS_COPY_FILE_RANGE: CLong = 285L

public val SYS_PREADV2: CLong = 286L

public val SYS_PWRITEV2: CLong = 287L

public val SYS_PKEY_MPROTECT: CLong = 288L

public val SYS_PKEY_ALLOC: CLong = 289L

public val SYS_PKEY_FREE: CLong = 290L

public val SYS_STATX: CLong = 291L

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

public val SYS_SYSCALLS: CLong = 451L

public val PROT_BTI: CInt = 0x10

public val PROT_MTE: CInt = 0x20

// From NDK's asm/auxvec.h
public val AT_SYSINFO_EHDR: CUlong = 33uL

public val AT_VECTOR_SIZE_ARCH: CUlong = 2uL
