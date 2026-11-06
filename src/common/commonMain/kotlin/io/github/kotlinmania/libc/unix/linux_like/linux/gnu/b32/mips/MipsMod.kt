package io.github.kotlinmania.libc.unix.linux_like.linux.gnu.b32.mips

import off64T
import offT

public typealias WcharT = Int

public val O_LARGEFILE: CInt = 0x2000

public val SYS_SYSCALL: CLong = 4000L + 0L

public val SYS_EXIT: CLong = 4000L + 1L

public val SYS_FORK: CLong = 4000L + 2L

public val SYS_READ: CLong = 4000L + 3L

public val SYS_WRITE: CLong = 4000L + 4L

public val SYS_OPEN: CLong = 4000L + 5L

public val SYS_CLOSE: CLong = 4000L + 6L

public val SYS_WAITPID: CLong = 4000L + 7L

public val SYS_CREAT: CLong = 4000L + 8L

public val SYS_LINK: CLong = 4000L + 9L

public val SYS_UNLINK: CLong = 4000L + 10L

public val SYS_EXECVE: CLong = 4000L + 11L

public val SYS_CHDIR: CLong = 4000L + 12L

public val SYS_TIME: CLong = 4000L + 13L

public val SYS_MKNOD: CLong = 4000L + 14L

public val SYS_CHMOD: CLong = 4000L + 15L

public val SYS_LCHOWN: CLong = 4000L + 16L

public val SYS_BREAK: CLong = 4000L + 17L

public val SYS_LSEEK: CLong = 4000L + 19L

public val SYS_GETPID: CLong = 4000L + 20L

public val SYS_MOUNT: CLong = 4000L + 21L

public val SYS_UMOUNT: CLong = 4000L + 22L

public val SYS_SETUID: CLong = 4000L + 23L

public val SYS_GETUID: CLong = 4000L + 24L

public val SYS_STIME: CLong = 4000L + 25L

public val SYS_PTRACE: CLong = 4000L + 26L

public val SYS_ALARM: CLong = 4000L + 27L

public val SYS_PAUSE: CLong = 4000L + 29L

public val SYS_UTIME: CLong = 4000L + 30L

public val SYS_STTY: CLong = 4000L + 31L

public val SYS_GTTY: CLong = 4000L + 32L

public val SYS_ACCESS: CLong = 4000L + 33L

public val SYS_NICE: CLong = 4000L + 34L

public val SYS_FTIME: CLong = 4000L + 35L

public val SYS_SYNC: CLong = 4000L + 36L

public val SYS_KILL: CLong = 4000L + 37L

public val SYS_RENAME: CLong = 4000L + 38L

public val SYS_MKDIR: CLong = 4000L + 39L

public val SYS_RMDIR: CLong = 4000L + 40L

public val SYS_DUP: CLong = 4000L + 41L

public val SYS_PIPE: CLong = 4000L + 42L

public val SYS_TIMES: CLong = 4000L + 43L

public val SYS_PROF: CLong = 4000L + 44L

public val SYS_BRK: CLong = 4000L + 45L

public val SYS_SETGID: CLong = 4000L + 46L

public val SYS_GETGID: CLong = 4000L + 47L

public val SYS_SIGNAL: CLong = 4000L + 48L

public val SYS_GETEUID: CLong = 4000L + 49L

public val SYS_GETEGID: CLong = 4000L + 50L

public val SYS_ACCT: CLong = 4000L + 51L

public val SYS_UMOUNT2: CLong = 4000L + 52L

public val SYS_LOCK: CLong = 4000L + 53L

public val SYS_IOCTL: CLong = 4000L + 54L

public val SYS_FCNTL: CLong = 4000L + 55L

public val SYS_MPX: CLong = 4000L + 56L

public val SYS_SETPGID: CLong = 4000L + 57L

public val SYS_ULIMIT: CLong = 4000L + 58L

public val SYS_UMASK: CLong = 4000L + 60L

public val SYS_CHROOT: CLong = 4000L + 61L

public val SYS_USTAT: CLong = 4000L + 62L

public val SYS_DUP2: CLong = 4000L + 63L

public val SYS_GETPPID: CLong = 4000L + 64L

public val SYS_GETPGRP: CLong = 4000L + 65L

public val SYS_SETSID: CLong = 4000L + 66L

public val SYS_SIGACTION: CLong = 4000L + 67L

public val SYS_SGETMASK: CLong = 4000L + 68L

public val SYS_SSETMASK: CLong = 4000L + 69L

public val SYS_SETREUID: CLong = 4000L + 70L

public val SYS_SETREGID: CLong = 4000L + 71L

public val SYS_SIGSUSPEND: CLong = 4000L + 72L

public val SYS_SIGPENDING: CLong = 4000L + 73L

public val SYS_SETHOSTNAME: CLong = 4000L + 74L

public val SYS_SETRLIMIT: CLong = 4000L + 75L

public val SYS_GETRLIMIT: CLong = 4000L + 76L

public val SYS_GETRUSAGE: CLong = 4000L + 77L

public val SYS_GETTIMEOFDAY: CLong = 4000L + 78L

public val SYS_SETTIMEOFDAY: CLong = 4000L + 79L

public val SYS_GETGROUPS: CLong = 4000L + 80L

public val SYS_SETGROUPS: CLong = 4000L + 81L

public val SYS_SYMLINK: CLong = 4000L + 83L

public val SYS_READLINK: CLong = 4000L + 85L

public val SYS_USELIB: CLong = 4000L + 86L

public val SYS_SWAPON: CLong = 4000L + 87L

public val SYS_REBOOT: CLong = 4000L + 88L

public val SYS_READDIR: CLong = 4000L + 89L

public val SYS_MMAP: CLong = 4000L + 90L

public val SYS_MUNMAP: CLong = 4000L + 91L

public val SYS_TRUNCATE: CLong = 4000L + 92L

public val SYS_FTRUNCATE: CLong = 4000L + 93L

public val SYS_FCHMOD: CLong = 4000L + 94L

public val SYS_FCHOWN: CLong = 4000L + 95L

public val SYS_GETPRIORITY: CLong = 4000L + 96L

public val SYS_SETPRIORITY: CLong = 4000L + 97L

public val SYS_PROFIL: CLong = 4000L + 98L

public val SYS_STATFS: CLong = 4000L + 99L

public val SYS_FSTATFS: CLong = 4000L + 100L

public val SYS_IOPERM: CLong = 4000L + 101L

public val SYS_SOCKETCALL: CLong = 4000L + 102L

public val SYS_SYSLOG: CLong = 4000L + 103L

public val SYS_SETITIMER: CLong = 4000L + 104L

public val SYS_GETITIMER: CLong = 4000L + 105L

public val SYS_STAT: CLong = 4000L + 106L

public val SYS_LSTAT: CLong = 4000L + 107L

public val SYS_FSTAT: CLong = 4000L + 108L

public val SYS_IOPL: CLong = 4000L + 110L

public val SYS_VHANGUP: CLong = 4000L + 111L

public val SYS_IDLE: CLong = 4000L + 112L

public val SYS_VM86: CLong = 4000L + 113L

public val SYS_WAIT4: CLong = 4000L + 114L

public val SYS_SWAPOFF: CLong = 4000L + 115L

public val SYS_SYSINFO: CLong = 4000L + 116L

public val SYS_IPC: CLong = 4000L + 117L

public val SYS_FSYNC: CLong = 4000L + 118L

public val SYS_SIGRETURN: CLong = 4000L + 119L

public val SYS_CLONE: CLong = 4000L + 120L

public val SYS_SETDOMAINNAME: CLong = 4000L + 121L

public val SYS_UNAME: CLong = 4000L + 122L

public val SYS_MODIFY_LDT: CLong = 4000L + 123L

public val SYS_ADJTIMEX: CLong = 4000L + 124L

public val SYS_MPROTECT: CLong = 4000L + 125L

public val SYS_SIGPROCMASK: CLong = 4000L + 126L

public val SYS_CREATE_MODULE: CLong = 4000L + 127L

public val SYS_INIT_MODULE: CLong = 4000L + 128L

public val SYS_DELETE_MODULE: CLong = 4000L + 129L

public val SYS_GET_KERNEL_SYMS: CLong = 4000L + 130L

public val SYS_QUOTACTL: CLong = 4000L + 131L

public val SYS_GETPGID: CLong = 4000L + 132L

public val SYS_FCHDIR: CLong = 4000L + 133L

public val SYS_BDFLUSH: CLong = 4000L + 134L

public val SYS_SYSFS: CLong = 4000L + 135L

public val SYS_PERSONALITY: CLong = 4000L + 136L

public val SYS_AFS_SYSCALL: CLong = 4000L + 137L

public val SYS_SETFSUID: CLong = 4000L + 138L

public val SYS_SETFSGID: CLong = 4000L + 139L

public val SYS_LLSEEK: CLong = 4000L + 140L

public val SYS_GETDENTS: CLong = 4000L + 141L

public val SYS_NEWSELECT: CLong = 4000L + 142L

public val SYS_FLOCK: CLong = 4000L + 143L

public val SYS_MSYNC: CLong = 4000L + 144L

public val SYS_READV: CLong = 4000L + 145L

public val SYS_WRITEV: CLong = 4000L + 146L

public val SYS_CACHEFLUSH: CLong = 4000L + 147L

public val SYS_CACHECTL: CLong = 4000L + 148L

public val SYS_SYSMIPS: CLong = 4000L + 149L

public val SYS_GETSID: CLong = 4000L + 151L

public val SYS_FDATASYNC: CLong = 4000L + 152L

public val SYS_SYSCTL: CLong = 4000L + 153L

public val SYS_MLOCK: CLong = 4000L + 154L

public val SYS_MUNLOCK: CLong = 4000L + 155L

public val SYS_MLOCKALL: CLong = 4000L + 156L

public val SYS_MUNLOCKALL: CLong = 4000L + 157L

public val SYS_SCHED_SETPARAM: CLong = 4000L + 158L

public val SYS_SCHED_GETPARAM: CLong = 4000L + 159L

public val SYS_SCHED_SETSCHEDULER: CLong = 4000L + 160L

public val SYS_SCHED_GETSCHEDULER: CLong = 4000L + 161L

public val SYS_SCHED_YIELD: CLong = 4000L + 162L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 4000L + 163L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 4000L + 164L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 4000L + 165L

public val SYS_NANOSLEEP: CLong = 4000L + 166L

public val SYS_MREMAP: CLong = 4000L + 167L

public val SYS_ACCEPT: CLong = 4000L + 168L

public val SYS_BIND: CLong = 4000L + 169L

public val SYS_CONNECT: CLong = 4000L + 170L

public val SYS_GETPEERNAME: CLong = 4000L + 171L

public val SYS_GETSOCKNAME: CLong = 4000L + 172L

public val SYS_GETSOCKOPT: CLong = 4000L + 173L

public val SYS_LISTEN: CLong = 4000L + 174L

public val SYS_RECV: CLong = 4000L + 175L

public val SYS_RECVFROM: CLong = 4000L + 176L

public val SYS_RECVMSG: CLong = 4000L + 177L

public val SYS_SEND: CLong = 4000L + 178L

public val SYS_SENDMSG: CLong = 4000L + 179L

public val SYS_SENDTO: CLong = 4000L + 180L

public val SYS_SETSOCKOPT: CLong = 4000L + 181L

public val SYS_SHUTDOWN: CLong = 4000L + 182L

public val SYS_SOCKET: CLong = 4000L + 183L

public val SYS_SOCKETPAIR: CLong = 4000L + 184L

public val SYS_SETRESUID: CLong = 4000L + 185L

public val SYS_GETRESUID: CLong = 4000L + 186L

public val SYS_QUERY_MODULE: CLong = 4000L + 187L

public val SYS_POLL: CLong = 4000L + 188L

public val SYS_NFSSERVCTL: CLong = 4000L + 189L

public val SYS_SETRESGID: CLong = 4000L + 190L

public val SYS_GETRESGID: CLong = 4000L + 191L

public val SYS_PRCTL: CLong = 4000L + 192L

public val SYS_RT_SIGRETURN: CLong = 4000L + 193L

public val SYS_RT_SIGACTION: CLong = 4000L + 194L

public val SYS_RT_SIGPROCMASK: CLong = 4000L + 195L

public val SYS_RT_SIGPENDING: CLong = 4000L + 196L

public val SYS_RT_SIGTIMEDWAIT: CLong = 4000L + 197L

public val SYS_RT_SIGQUEUEINFO: CLong = 4000L + 198L

public val SYS_RT_SIGSUSPEND: CLong = 4000L + 199L

public val SYS_PREAD64: CLong = 4000L + 200L

public val SYS_PWRITE64: CLong = 4000L + 201L

public val SYS_CHOWN: CLong = 4000L + 202L

public val SYS_GETCWD: CLong = 4000L + 203L

public val SYS_CAPGET: CLong = 4000L + 204L

public val SYS_CAPSET: CLong = 4000L + 205L

public val SYS_SIGALTSTACK: CLong = 4000L + 206L

public val SYS_SENDFILE: CLong = 4000L + 207L

public val SYS_GETPMSG: CLong = 4000L + 208L

public val SYS_PUTPMSG: CLong = 4000L + 209L

public val SYS_MMAP2: CLong = 4000L + 210L

public val SYS_TRUNCATE64: CLong = 4000L + 211L

public val SYS_FTRUNCATE64: CLong = 4000L + 212L

public val SYS_STAT64: CLong = 4000L + 213L

public val SYS_LSTAT64: CLong = 4000L + 214L

public val SYS_FSTAT64: CLong = 4000L + 215L

public val SYS_PIVOT_ROOT: CLong = 4000L + 216L

public val SYS_MINCORE: CLong = 4000L + 217L

public val SYS_MADVISE: CLong = 4000L + 218L

public val SYS_GETDENTS64: CLong = 4000L + 219L

public val SYS_FCNTL64: CLong = 4000L + 220L

public val SYS_GETTID: CLong = 4000L + 222L

public val SYS_READAHEAD: CLong = 4000L + 223L

public val SYS_SETXATTR: CLong = 4000L + 224L

public val SYS_LSETXATTR: CLong = 4000L + 225L

public val SYS_FSETXATTR: CLong = 4000L + 226L

public val SYS_GETXATTR: CLong = 4000L + 227L

public val SYS_LGETXATTR: CLong = 4000L + 228L

public val SYS_FGETXATTR: CLong = 4000L + 229L

public val SYS_LISTXATTR: CLong = 4000L + 230L

public val SYS_LLISTXATTR: CLong = 4000L + 231L

public val SYS_FLISTXATTR: CLong = 4000L + 232L

public val SYS_REMOVEXATTR: CLong = 4000L + 233L

public val SYS_LREMOVEXATTR: CLong = 4000L + 234L

public val SYS_FREMOVEXATTR: CLong = 4000L + 235L

public val SYS_TKILL: CLong = 4000L + 236L

public val SYS_SENDFILE64: CLong = 4000L + 237L

public val SYS_FUTEX: CLong = 4000L + 238L

public val SYS_SCHED_SETAFFINITY: CLong = 4000L + 239L

public val SYS_SCHED_GETAFFINITY: CLong = 4000L + 240L

public val SYS_IO_SETUP: CLong = 4000L + 241L

public val SYS_IO_DESTROY: CLong = 4000L + 242L

public val SYS_IO_GETEVENTS: CLong = 4000L + 243L

public val SYS_IO_SUBMIT: CLong = 4000L + 244L

public val SYS_IO_CANCEL: CLong = 4000L + 245L

public val SYS_EXIT_GROUP: CLong = 4000L + 246L

public val SYS_LOOKUP_DCOOKIE: CLong = 4000L + 247L

public val SYS_EPOLL_CREATE: CLong = 4000L + 248L

public val SYS_EPOLL_CTL: CLong = 4000L + 249L

public val SYS_EPOLL_WAIT: CLong = 4000L + 250L

public val SYS_REMAP_FILE_PAGES: CLong = 4000L + 251L

public val SYS_SET_TID_ADDRESS: CLong = 4000L + 252L

public val SYS_RESTART_SYSCALL: CLong = 4000L + 253L

public val SYS_FADVISE64: CLong = 4000L + 254L

public val SYS_STATFS64: CLong = 4000L + 255L

public val SYS_FSTATFS64: CLong = 4000L + 256L

public val SYS_TIMER_CREATE: CLong = 4000L + 257L

public val SYS_TIMER_SETTIME: CLong = 4000L + 258L

public val SYS_TIMER_GETTIME: CLong = 4000L + 259L

public val SYS_TIMER_GETOVERRUN: CLong = 4000L + 260L

public val SYS_TIMER_DELETE: CLong = 4000L + 261L

public val SYS_CLOCK_SETTIME: CLong = 4000L + 262L

public val SYS_CLOCK_GETTIME: CLong = 4000L + 263L

public val SYS_CLOCK_GETRES: CLong = 4000L + 264L

public val SYS_CLOCK_NANOSLEEP: CLong = 4000L + 265L

public val SYS_TGKILL: CLong = 4000L + 266L

public val SYS_UTIMES: CLong = 4000L + 267L

public val SYS_MBIND: CLong = 4000L + 268L

public val SYS_GET_MEMPOLICY: CLong = 4000L + 269L

public val SYS_SET_MEMPOLICY: CLong = 4000L + 270L

public val SYS_MQ_OPEN: CLong = 4000L + 271L

public val SYS_MQ_UNLINK: CLong = 4000L + 272L

public val SYS_MQ_TIMEDSEND: CLong = 4000L + 273L

public val SYS_MQ_TIMEDRECEIVE: CLong = 4000L + 274L

public val SYS_MQ_NOTIFY: CLong = 4000L + 275L

public val SYS_MQ_GETSETATTR: CLong = 4000L + 276L

public val SYS_VSERVER: CLong = 4000L + 277L

public val SYS_WAITID: CLong = 4000L + 278L

// pub const SysSysSetaltroot: cLong = 4000 + 279;
public val SYS_ADD_KEY: CLong = 4000L + 280L

public val SYS_REQUEST_KEY: CLong = 4000L + 281L

public val SYS_KEYCTL: CLong = 4000L + 282L

public val SYS_SET_THREAD_AREA: CLong = 4000L + 283L

public val SYS_INOTIFY_INIT: CLong = 4000L + 284L

public val SYS_INOTIFY_ADD_WATCH: CLong = 4000L + 285L

public val SYS_INOTIFY_RM_WATCH: CLong = 4000L + 286L

public val SYS_MIGRATE_PAGES: CLong = 4000L + 287L

public val SYS_OPENAT: CLong = 4000L + 288L

public val SYS_MKDIRAT: CLong = 4000L + 289L

public val SYS_MKNODAT: CLong = 4000L + 290L

public val SYS_FCHOWNAT: CLong = 4000L + 291L

public val SYS_FUTIMESAT: CLong = 4000L + 292L

public val SYS_FSTATAT64: CLong = 4000L + 293L

public val SYS_UNLINKAT: CLong = 4000L + 294L

public val SYS_RENAMEAT: CLong = 4000L + 295L

public val SYS_LINKAT: CLong = 4000L + 296L

public val SYS_SYMLINKAT: CLong = 4000L + 297L

public val SYS_READLINKAT: CLong = 4000L + 298L

public val SYS_FCHMODAT: CLong = 4000L + 299L

public val SYS_FACCESSAT: CLong = 4000L + 300L

public val SYS_PSELECT6: CLong = 4000L + 301L

public val SYS_PPOLL: CLong = 4000L + 302L

public val SYS_UNSHARE: CLong = 4000L + 303L

public val SYS_SPLICE: CLong = 4000L + 304L

public val SYS_SYNC_FILE_RANGE: CLong = 4000L + 305L

public val SYS_TEE: CLong = 4000L + 306L

public val SYS_VMSPLICE: CLong = 4000L + 307L

public val SYS_MOVE_PAGES: CLong = 4000L + 308L

public val SYS_SET_ROBUST_LIST: CLong = 4000L + 309L

public val SYS_GET_ROBUST_LIST: CLong = 4000L + 310L

public val SYS_KEXEC_LOAD: CLong = 4000L + 311L

public val SYS_GETCPU: CLong = 4000L + 312L

public val SYS_EPOLL_PWAIT: CLong = 4000L + 313L

public val SYS_IOPRIO_SET: CLong = 4000L + 314L

public val SYS_IOPRIO_GET: CLong = 4000L + 315L

public val SYS_UTIMENSAT: CLong = 4000L + 316L

public val SYS_SIGNALFD: CLong = 4000L + 317L

public val SYS_TIMERFD: CLong = 4000L + 318L

public val SYS_EVENTFD: CLong = 4000L + 319L

public val SYS_FALLOCATE: CLong = 4000L + 320L

public val SYS_TIMERFD_CREATE: CLong = 4000L + 321L

public val SYS_TIMERFD_GETTIME: CLong = 4000L + 322L

public val SYS_TIMERFD_SETTIME: CLong = 4000L + 323L

public val SYS_SIGNALFD4: CLong = 4000L + 324L

public val SYS_EVENTFD2: CLong = 4000L + 325L

public val SYS_EPOLL_CREATE1: CLong = 4000L + 326L

public val SYS_DUP3: CLong = 4000L + 327L

public val SYS_PIPE2: CLong = 4000L + 328L

public val SYS_INOTIFY_INIT1: CLong = 4000L + 329L

public val SYS_PREADV: CLong = 4000L + 330L

public val SYS_PWRITEV: CLong = 4000L + 331L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 4000L + 332L

public val SYS_PERF_EVENT_OPEN: CLong = 4000L + 333L

public val SYS_ACCEPT4: CLong = 4000L + 334L

public val SYS_RECVMMSG: CLong = 4000L + 335L

public val SYS_FANOTIFY_INIT: CLong = 4000L + 336L

public val SYS_FANOTIFY_MARK: CLong = 4000L + 337L

public val SYS_PRLIMIT64: CLong = 4000L + 338L

public val SYS_NAME_TO_HANDLE_AT: CLong = 4000L + 339L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 4000L + 340L

public val SYS_CLOCK_ADJTIME: CLong = 4000L + 341L

public val SYS_SYNCFS: CLong = 4000L + 342L

public val SYS_SENDMMSG: CLong = 4000L + 343L

public val SYS_SETNS: CLong = 4000L + 344L

public val SYS_PROCESS_VM_READV: CLong = 4000L + 345L

public val SYS_PROCESS_VM_WRITEV: CLong = 4000L + 346L

public val SYS_KCMP: CLong = 4000L + 347L

public val SYS_FINIT_MODULE: CLong = 4000L + 348L

public val SYS_SCHED_SETATTR: CLong = 4000L + 349L

public val SYS_SCHED_GETATTR: CLong = 4000L + 350L

public val SYS_RENAMEAT2: CLong = 4000L + 351L

public val SYS_SECCOMP: CLong = 4000L + 352L

public val SYS_GETRANDOM: CLong = 4000L + 353L

public val SYS_MEMFD_CREATE: CLong = 4000L + 354L

public val SYS_BPF: CLong = 4000L + 355L

public val SYS_EXECVEAT: CLong = 4000L + 356L

public val SYS_USERFAULTFD: CLong = 4000L + 357L

public val SYS_MEMBARRIER: CLong = 4000L + 358L

public val SYS_MLOCK2: CLong = 4000L + 359L

public val SYS_COPY_FILE_RANGE: CLong = 4000L + 360L

public val SYS_PREADV2: CLong = 4000L + 361L

public val SYS_PWRITEV2: CLong = 4000L + 362L

public val SYS_PKEY_MPROTECT: CLong = 4000L + 363L

public val SYS_PKEY_ALLOC: CLong = 4000L + 364L

public val SYS_PKEY_FREE: CLong = 4000L + 365L

public val SYS_STATX: CLong = 4000L + 366L

public val SYS_RSEQ: CLong = 4000L + 367L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 4000L + 424L

public val SYS_IO_URING_SETUP: CLong = 4000L + 425L

public val SYS_IO_URING_ENTER: CLong = 4000L + 426L

public val SYS_IO_URING_REGISTER: CLong = 4000L + 427L

public val SYS_OPEN_TREE: CLong = 4000L + 428L

public val SYS_MOVE_MOUNT: CLong = 4000L + 429L

public val SYS_FSOPEN: CLong = 4000L + 430L

public val SYS_FSCONFIG: CLong = 4000L + 431L

public val SYS_FSMOUNT: CLong = 4000L + 432L

public val SYS_FSPICK: CLong = 4000L + 433L

public val SYS_PIDFD_OPEN: CLong = 4000L + 434L

public val SYS_CLONE3: CLong = 4000L + 435L

public val SYS_CLOSE_RANGE: CLong = 4000L + 436L

public val SYS_OPENAT2: CLong = 4000L + 437L

public val SYS_PIDFD_GETFD: CLong = 4000L + 438L

public val SYS_FACCESSAT2: CLong = 4000L + 439L

public val SYS_PROCESS_MADVISE: CLong = 4000L + 440L

public val SYS_EPOLL_PWAIT2: CLong = 4000L + 441L

public val SYS_MOUNT_SETATTR: CLong = 4000L + 442L

public val SYS_QUOTACTL_FD: CLong = 4000L + 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 4000L + 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 4000L + 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 4000L + 446L

public val SYS_MEMFD_SECRET: CLong = 4000L + 447L

public val SYS_PROCESS_MRELEASE: CLong = 4000L + 448L

public val SYS_FUTEX_WAITV: CLong = 4000L + 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 4000L + 450L

public val O_DIRECT: CInt = 0x8000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_NONBLOCK: CInt = 128

public val O_SYNC: CInt = 0x4010

public val O_RSYNC: CInt = 0x4010

public val O_DSYNC: CInt = 0x10

public val O_FSYNC: CInt = 0x4010

public val O_ASYNC: CInt = 0x1000

public val O_NDELAY: CInt = 0x80

public val EDEADLK: CInt = 45

public val ENAMETOOLONG: CInt = 78

public val ENOLCK: CInt = 46

public val ENOSYS: CInt = 89

public val ENOTEMPTY: CInt = 93

public val ELOOP: CInt = 90

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

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EMULTIHOP: CInt = 74

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EBADMSG: CInt = 77

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

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

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

public val EUCLEAN: CInt = 135

public val ENOTNAM: CInt = 137

public val ENAVAIL: CInt = 138

public val EISNAM: CInt = 139

public val EREMOTEIO: CInt = 140

public val EDQUOT: CInt = 1133

public val ENOMEDIUM: CInt = 159

public val EMEDIUMTYPE: CInt = 160

public val ECANCELED: CInt = 158

public val ENOKEY: CInt = 161

public val EKEYEXPIRED: CInt = 162

public val EKEYREVOKED: CInt = 163

public val EKEYREJECTED: CInt = 164

public val EOWNERDEAD: CInt = 165

public val ENOTRECOVERABLE: CInt = 166

public val ERFKILL: CInt = 167

public val MAP_NORESERVE: CInt = 0x400

public val MAP_ANON: CInt = 0x800

public val MAP_ANONYMOUS: CInt = 0x800

public val MAP_GROWSDOWN: CInt = 0x1000

public val MAP_DENYWRITE: CInt = 0x2000

public val MAP_EXECUTABLE: CInt = 0x4000

public val MAP_LOCKED: CInt = 0x8000

public val MAP_POPULATE: CInt = 0x10000

public val MAP_NONBLOCK: CInt = 0x20000

public val MAP_STACK: CInt = 0x40000

public val SOCK_STREAM: CInt = 2

public val SOCK_DGRAM: CInt = 1

public val SA_SIGINFO: CInt = 0x00000008

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SIGEMT: CInt = 7

public val SIGCHLD: CInt = 18

public val SIGBUS: CInt = 10

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGWINCH: CInt = 20

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGCONT: CInt = 25

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGURG: CInt = 21

public val SIGIO: CInt = 22

public val SIGSYS: CInt = 12

public val SIGPOLL: CInt = 22

public val SIGPWR: CInt = 19

public val SIG_SETMASK: CInt = 3

public val SIG_BLOCK: CInt = 0x1

public val SIG_UNBLOCK: CInt = 0x2

public val POLLWRNORM: CShort = 0x004

public val POLLWRBAND: CShort = 0x100

public val VEOF: Int = 16

public val VEOL: Int = 17

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val IEXTEN: TcflagT = 0x00000100

public val TOSTOP: TcflagT = 0x00008000

public val FLUSHO: TcflagT = 0x00002000

public val EXTPROC: TcflagT = 65536

public val TCSANOW: CInt = 0x540e

public val TCSADRAIN: CInt = 0x540f

public val TCSAFLUSH: CInt = 0x5410

public val PTRACE_GETFPXREGS: CUint = 18u

public val PTRACE_SETFPXREGS: CUint = 19u

public val MAP_HUGETLB: CInt = 0x080000

public val EFD_NONBLOCK: CInt = 0x80

public val F_GETOWN: CInt = 23

public val F_SETOWN: CInt = 24

public val SFD_NONBLOCK: CInt = 0x80

public val RTLD_DEEPBIND: CInt = 0x10

public val RTLD_GLOBAL: CInt = 0x4

public val RTLD_NOLOAD: CInt = 0x8

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val CBAUD: TcflagT = 4111

public val TAB1: TcflagT = 0x00000800

public val TAB2: TcflagT = 0x00001000

public val TAB3: TcflagT = 0x00001800

public val CR1: TcflagT = 0x00000200

public val CR2: TcflagT = 0x00000400

public val CR3: TcflagT = 0x00000600

public val FF1: TcflagT = 0x00008000

public val BS1: TcflagT = 0x00002000

public val VT1: TcflagT = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400

public val IXOFF: TcflagT = 0x00001000

public val ONLCR: TcflagT = 0x4

public val CSIZE: TcflagT = 0x00000030

public val CS6: TcflagT = 0x00000010

public val CS7: TcflagT = 0x00000020

public val CS8: TcflagT = 0x00000030

public val CSTOPB: TcflagT = 0x00000040

public val CREAD: TcflagT = 0x00000080

public val PARENB: TcflagT = 0x00000100

public val PARODD: TcflagT = 0x00000200

public val HUPCL: TcflagT = 0x00000400

public val CLOCAL: TcflagT = 0x00000800

public val ECHOKE: TcflagT = 0x00000800

public val ECHOE: TcflagT = 0x00000010

public val ECHOK: TcflagT = 0x00000020

public val ECHONL: TcflagT = 0x00000040

public val ECHOPRT: TcflagT = 0x00000400

public val ECHOCTL: TcflagT = 0x00000200

public val ISIG: TcflagT = 0x00000001

public val ICANON: TcflagT = 0x00000002

public val PENDIN: TcflagT = 0x00004000

public val NOFLSH: TcflagT = 0x00000080

public val CIBAUD: TcflagT = 269418496

public val CBAUDEX: TcflagT = 4096

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2

public val NLDLY: TcflagT = 256

public val CRDLY: TcflagT = 1536

public val TABDLY: TcflagT = 6144

public val BSDLY: TcflagT = 8192

public val FFDLY: TcflagT = 32768

public val VTDLY: TcflagT = 16384

public val XTABS: TcflagT = 6144

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 4097

public val B115200: SpeedT = 4098

public val B230400: SpeedT = 4099

public val B460800: SpeedT = 4100

public val B500000: SpeedT = 4101

public val B576000: SpeedT = 4102

public val B921600: SpeedT = 4103

public val B1000000: SpeedT = 4104

public val B1152000: SpeedT = 4105

public val B1500000: SpeedT = 4106

public val B2000000: SpeedT = 4107

public val B2500000: SpeedT = 4108

public val B3000000: SpeedT = 4109

public val B3500000: SpeedT = 4110

public val B4000000: SpeedT = 4111

public val EHWPOISON: CInt = 168
