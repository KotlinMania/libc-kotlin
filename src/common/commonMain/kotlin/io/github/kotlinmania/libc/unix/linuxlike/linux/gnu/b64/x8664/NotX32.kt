// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/not_x32.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.pthreadMutexT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsfilcntT

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 2u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 3u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

// Syscall table
public val SYS_READ: CLong = 0L

public val SYS_WRITE: CLong = 1L

public val SYS_OPEN: CLong = 2L

public val SYS_CLOSE: CLong = 3L

public val SYS_STAT: CLong = 4L

public val SYS_FSTAT: CLong = 5L

public val SYS_LSTAT: CLong = 6L

public val SYS_POLL: CLong = 7L

public val SYS_LSEEK: CLong = 8L

public val SYS_MMAP: CLong = 9L

public val SYS_MPROTECT: CLong = 10L

public val SYS_MUNMAP: CLong = 11L

public val SYS_BRK: CLong = 12L

public val SYS_RT_SIGACTION: CLong = 13L

public val SYS_RT_SIGPROCMASK: CLong = 14L

public val SYS_RT_SIGRETURN: CLong = 15L

public val SYS_IOCTL: CLong = 16L

public val SYS_PREAD64: CLong = 17L

public val SYS_PWRITE64: CLong = 18L

public val SYS_READV: CLong = 19L

public val SYS_WRITEV: CLong = 20L

public val SYS_ACCESS: CLong = 21L

public val SYS_PIPE: CLong = 22L

public val SYS_SELECT: CLong = 23L

public val SYS_SCHED_YIELD: CLong = 24L

public val SYS_MREMAP: CLong = 25L

public val SYS_MSYNC: CLong = 26L

public val SYS_MINCORE: CLong = 27L

public val SYS_MADVISE: CLong = 28L

public val SYS_SHMGET: CLong = 29L

public val SYS_SHMAT: CLong = 30L

public val SYS_SHMCTL: CLong = 31L

public val SYS_DUP: CLong = 32L

public val SYS_DUP2: CLong = 33L

public val SYS_PAUSE: CLong = 34L

public val SYS_NANOSLEEP: CLong = 35L

public val SYS_GETITIMER: CLong = 36L

public val SYS_ALARM: CLong = 37L

public val SYS_SETITIMER: CLong = 38L

public val SYS_GETPID: CLong = 39L

public val SYS_SENDFILE: CLong = 40L

public val SYS_SOCKET: CLong = 41L

public val SYS_CONNECT: CLong = 42L

public val SYS_ACCEPT: CLong = 43L

public val SYS_SENDTO: CLong = 44L

public val SYS_RECVFROM: CLong = 45L

public val SYS_SENDMSG: CLong = 46L

public val SYS_RECVMSG: CLong = 47L

public val SYS_SHUTDOWN: CLong = 48L

public val SYS_BIND: CLong = 49L

public val SYS_LISTEN: CLong = 50L

public val SYS_GETSOCKNAME: CLong = 51L

public val SYS_GETPEERNAME: CLong = 52L

public val SYS_SOCKETPAIR: CLong = 53L

public val SYS_SETSOCKOPT: CLong = 54L

public val SYS_GETSOCKOPT: CLong = 55L

public val SYS_CLONE: CLong = 56L

public val SYS_FORK: CLong = 57L

public val SYS_VFORK: CLong = 58L

public val SYS_EXECVE: CLong = 59L

public val SYS_EXIT: CLong = 60L

public val SYS_WAIT4: CLong = 61L

public val SYS_KILL: CLong = 62L

public val SYS_UNAME: CLong = 63L

public val SYS_SEMGET: CLong = 64L

public val SYS_SEMOP: CLong = 65L

public val SYS_SEMCTL: CLong = 66L

public val SYS_SHMDT: CLong = 67L

public val SYS_MSGGET: CLong = 68L

public val SYS_MSGSND: CLong = 69L

public val SYS_MSGRCV: CLong = 70L

public val SYS_MSGCTL: CLong = 71L

public val SYS_FCNTL: CLong = 72L

public val SYS_FLOCK: CLong = 73L

public val SYS_FSYNC: CLong = 74L

public val SYS_FDATASYNC: CLong = 75L

public val SYS_TRUNCATE: CLong = 76L

public val SYS_FTRUNCATE: CLong = 77L

public val SYS_GETDENTS: CLong = 78L

public val SYS_GETCWD: CLong = 79L

public val SYS_CHDIR: CLong = 80L

public val SYS_FCHDIR: CLong = 81L

public val SYS_RENAME: CLong = 82L

public val SYS_MKDIR: CLong = 83L

public val SYS_RMDIR: CLong = 84L

public val SYS_CREAT: CLong = 85L

public val SYS_LINK: CLong = 86L

public val SYS_UNLINK: CLong = 87L

public val SYS_SYMLINK: CLong = 88L

public val SYS_READLINK: CLong = 89L

public val SYS_CHMOD: CLong = 90L

public val SYS_FCHMOD: CLong = 91L

public val SYS_CHOWN: CLong = 92L

public val SYS_FCHOWN: CLong = 93L

public val SYS_LCHOWN: CLong = 94L

public val SYS_UMASK: CLong = 95L

public val SYS_GETTIMEOFDAY: CLong = 96L

public val SYS_GETRLIMIT: CLong = 97L

public val SYS_GETRUSAGE: CLong = 98L

public val SYS_SYSINFO: CLong = 99L

public val SYS_TIMES: CLong = 100L

public val SYS_PTRACE: CLong = 101L

public val SYS_GETUID: CLong = 102L

public val SYS_SYSLOG: CLong = 103L

public val SYS_GETGID: CLong = 104L

public val SYS_SETUID: CLong = 105L

public val SYS_SETGID: CLong = 106L

public val SYS_GETEUID: CLong = 107L

public val SYS_GETEGID: CLong = 108L

public val SYS_SETPGID: CLong = 109L

public val SYS_GETPPID: CLong = 110L

public val SYS_GETPGRP: CLong = 111L

public val SYS_SETSID: CLong = 112L

public val SYS_SETREUID: CLong = 113L

public val SYS_SETREGID: CLong = 114L

public val SYS_GETGROUPS: CLong = 115L

public val SYS_SETGROUPS: CLong = 116L

public val SYS_SETRESUID: CLong = 117L

public val SYS_GETRESUID: CLong = 118L

public val SYS_SETRESGID: CLong = 119L

public val SYS_GETRESGID: CLong = 120L

public val SYS_GETPGID: CLong = 121L

public val SYS_SETFSUID: CLong = 122L

public val SYS_SETFSGID: CLong = 123L

public val SYS_GETSID: CLong = 124L

public val SYS_CAPGET: CLong = 125L

public val SYS_CAPSET: CLong = 126L

public val SYS_RT_SIGPENDING: CLong = 127L

public val SYS_RT_SIGTIMEDWAIT: CLong = 128L

public val SYS_RT_SIGQUEUEINFO: CLong = 129L

public val SYS_RT_SIGSUSPEND: CLong = 130L

public val SYS_SIGALTSTACK: CLong = 131L

public val SYS_UTIME: CLong = 132L

public val SYS_MKNOD: CLong = 133L

public val SYS_USELIB: CLong = 134L

public val SYS_PERSONALITY: CLong = 135L

public val SYS_USTAT: CLong = 136L

public val SYS_STATFS: CLong = 137L

public val SYS_FSTATFS: CLong = 138L

public val SYS_SYSFS: CLong = 139L

public val SYS_GETPRIORITY: CLong = 140L

public val SYS_SETPRIORITY: CLong = 141L

public val SYS_SCHED_SETPARAM: CLong = 142L

public val SYS_SCHED_GETPARAM: CLong = 143L

public val SYS_SCHED_SETSCHEDULER: CLong = 144L

public val SYS_SCHED_GETSCHEDULER: CLong = 145L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 146L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 147L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 148L

public val SYS_MLOCK: CLong = 149L

public val SYS_MUNLOCK: CLong = 150L

public val SYS_MLOCKALL: CLong = 151L

public val SYS_MUNLOCKALL: CLong = 152L

public val SYS_VHANGUP: CLong = 153L

public val SYS_MODIFY_LDT: CLong = 154L

public val SYS_PIVOT_ROOT: CLong = 155L

public val SYS_SYSCTL: CLong = 156L

public val SYS_PRCTL: CLong = 157L

public val SYS_ARCH_PRCTL: CLong = 158L

public val SYS_ADJTIMEX: CLong = 159L

public val SYS_SETRLIMIT: CLong = 160L

public val SYS_CHROOT: CLong = 161L

public val SYS_SYNC: CLong = 162L

public val SYS_ACCT: CLong = 163L

public val SYS_SETTIMEOFDAY: CLong = 164L

public val SYS_MOUNT: CLong = 165L

public val SYS_UMOUNT2: CLong = 166L

public val SYS_SWAPON: CLong = 167L

public val SYS_SWAPOFF: CLong = 168L

public val SYS_REBOOT: CLong = 169L

public val SYS_SETHOSTNAME: CLong = 170L

public val SYS_SETDOMAINNAME: CLong = 171L

public val SYS_IOPL: CLong = 172L

public val SYS_IOPERM: CLong = 173L

public val SYS_CREATE_MODULE: CLong = 174L

public val SYS_INIT_MODULE: CLong = 175L

public val SYS_DELETE_MODULE: CLong = 176L

public val SYS_GET_KERNEL_SYMS: CLong = 177L

public val SYS_QUERY_MODULE: CLong = 178L

public val SYS_QUOTACTL: CLong = 179L

public val SYS_NFSSERVCTL: CLong = 180L

public val SYS_GETPMSG: CLong = 181L

public val SYS_PUTPMSG: CLong = 182L

public val SYS_AFS_SYSCALL: CLong = 183L

public val SYS_TUXCALL: CLong = 184L

public val SYS_SECURITY: CLong = 185L

public val SYS_GETTID: CLong = 186L

public val SYS_READAHEAD: CLong = 187L

public val SYS_SETXATTR: CLong = 188L

public val SYS_LSETXATTR: CLong = 189L

public val SYS_FSETXATTR: CLong = 190L

public val SYS_GETXATTR: CLong = 191L

public val SYS_LGETXATTR: CLong = 192L

public val SYS_FGETXATTR: CLong = 193L

public val SYS_LISTXATTR: CLong = 194L

public val SYS_LLISTXATTR: CLong = 195L

public val SYS_FLISTXATTR: CLong = 196L

public val SYS_REMOVEXATTR: CLong = 197L

public val SYS_LREMOVEXATTR: CLong = 198L

public val SYS_FREMOVEXATTR: CLong = 199L

public val SYS_TKILL: CLong = 200L

public val SYS_TIME: CLong = 201L

public val SYS_FUTEX: CLong = 202L

public val SYS_SCHED_SETAFFINITY: CLong = 203L

public val SYS_SCHED_GETAFFINITY: CLong = 204L

public val SYS_SET_THREAD_AREA: CLong = 205L

public val SYS_IO_SETUP: CLong = 206L

public val SYS_IO_DESTROY: CLong = 207L

public val SYS_IO_GETEVENTS: CLong = 208L

public val SYS_IO_SUBMIT: CLong = 209L

public val SYS_IO_CANCEL: CLong = 210L

public val SYS_GET_THREAD_AREA: CLong = 211L

public val SYS_LOOKUP_DCOOKIE: CLong = 212L

public val SYS_EPOLL_CREATE: CLong = 213L

public val SYS_EPOLL_CTL_OLD: CLong = 214L

public val SYS_EPOLL_WAIT_OLD: CLong = 215L

public val SYS_REMAP_FILE_PAGES: CLong = 216L

public val SYS_GETDENTS64: CLong = 217L

public val SYS_SET_TID_ADDRESS: CLong = 218L

public val SYS_RESTART_SYSCALL: CLong = 219L

public val SYS_SEMTIMEDOP: CLong = 220L

public val SYS_FADVISE64: CLong = 221L

public val SYS_TIMER_CREATE: CLong = 222L

public val SYS_TIMER_SETTIME: CLong = 223L

public val SYS_TIMER_GETTIME: CLong = 224L

public val SYS_TIMER_GETOVERRUN: CLong = 225L

public val SYS_TIMER_DELETE: CLong = 226L

public val SYS_CLOCK_SETTIME: CLong = 227L

public val SYS_CLOCK_GETTIME: CLong = 228L

public val SYS_CLOCK_GETRES: CLong = 229L

public val SYS_CLOCK_NANOSLEEP: CLong = 230L

public val SYS_EXIT_GROUP: CLong = 231L

public val SYS_EPOLL_WAIT: CLong = 232L

public val SYS_EPOLL_CTL: CLong = 233L

public val SYS_TGKILL: CLong = 234L

public val SYS_UTIMES: CLong = 235L

public val SYS_VSERVER: CLong = 236L

public val SYS_MBIND: CLong = 237L

public val SYS_SET_MEMPOLICY: CLong = 238L

public val SYS_GET_MEMPOLICY: CLong = 239L

public val SYS_MQ_OPEN: CLong = 240L

public val SYS_MQ_UNLINK: CLong = 241L

public val SYS_MQ_TIMEDSEND: CLong = 242L

public val SYS_MQ_TIMEDRECEIVE: CLong = 243L

public val SYS_MQ_NOTIFY: CLong = 244L

public val SYS_MQ_GETSETATTR: CLong = 245L

public val SYS_KEXEC_LOAD: CLong = 246L

public val SYS_WAITID: CLong = 247L

public val SYS_ADD_KEY: CLong = 248L

public val SYS_REQUEST_KEY: CLong = 249L

public val SYS_KEYCTL: CLong = 250L

public val SYS_IOPRIO_SET: CLong = 251L

public val SYS_IOPRIO_GET: CLong = 252L

public val SYS_INOTIFY_INIT: CLong = 253L

public val SYS_INOTIFY_ADD_WATCH: CLong = 254L

public val SYS_INOTIFY_RM_WATCH: CLong = 255L

public val SYS_MIGRATE_PAGES: CLong = 256L

public val SYS_OPENAT: CLong = 257L

public val SYS_MKDIRAT: CLong = 258L

public val SYS_MKNODAT: CLong = 259L

public val SYS_FCHOWNAT: CLong = 260L

public val SYS_FUTIMESAT: CLong = 261L

public val SYS_NEWFSTATAT: CLong = 262L

public val SYS_UNLINKAT: CLong = 263L

public val SYS_RENAMEAT: CLong = 264L

public val SYS_LINKAT: CLong = 265L

public val SYS_SYMLINKAT: CLong = 266L

public val SYS_READLINKAT: CLong = 267L

public val SYS_FCHMODAT: CLong = 268L

public val SYS_FACCESSAT: CLong = 269L

public val SYS_PSELECT6: CLong = 270L

public val SYS_PPOLL: CLong = 271L

public val SYS_UNSHARE: CLong = 272L

public val SYS_SET_ROBUST_LIST: CLong = 273L

public val SYS_GET_ROBUST_LIST: CLong = 274L

public val SYS_SPLICE: CLong = 275L

public val SYS_TEE: CLong = 276L

public val SYS_SYNC_FILE_RANGE: CLong = 277L

public val SYS_VMSPLICE: CLong = 278L

public val SYS_MOVE_PAGES: CLong = 279L

public val SYS_UTIMENSAT: CLong = 280L

public val SYS_EPOLL_PWAIT: CLong = 281L

public val SYS_SIGNALFD: CLong = 282L

public val SYS_TIMERFD_CREATE: CLong = 283L

public val SYS_EVENTFD: CLong = 284L

public val SYS_FALLOCATE: CLong = 285L

public val SYS_TIMERFD_SETTIME: CLong = 286L

public val SYS_TIMERFD_GETTIME: CLong = 287L

public val SYS_ACCEPT4: CLong = 288L

public val SYS_SIGNALFD4: CLong = 289L

public val SYS_EVENTFD2: CLong = 290L

public val SYS_EPOLL_CREATE1: CLong = 291L

public val SYS_DUP3: CLong = 292L

public val SYS_PIPE2: CLong = 293L

public val SYS_INOTIFY_INIT1: CLong = 294L

public val SYS_PREADV: CLong = 295L

public val SYS_PWRITEV: CLong = 296L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 297L

public val SYS_PERF_EVENT_OPEN: CLong = 298L

public val SYS_RECVMMSG: CLong = 299L

public val SYS_FANOTIFY_INIT: CLong = 300L

public val SYS_FANOTIFY_MARK: CLong = 301L

public val SYS_PRLIMIT64: CLong = 302L

public val SYS_NAME_TO_HANDLE_AT: CLong = 303L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 304L

public val SYS_CLOCK_ADJTIME: CLong = 305L

public val SYS_SYNCFS: CLong = 306L

public val SYS_SENDMMSG: CLong = 307L

public val SYS_SETNS: CLong = 308L

public val SYS_GETCPU: CLong = 309L

public val SYS_PROCESS_VM_READV: CLong = 310L

public val SYS_PROCESS_VM_WRITEV: CLong = 311L

public val SYS_KCMP: CLong = 312L

public val SYS_FINIT_MODULE: CLong = 313L

public val SYS_SCHED_SETATTR: CLong = 314L

public val SYS_SCHED_GETATTR: CLong = 315L

public val SYS_RENAMEAT2: CLong = 316L

public val SYS_SECCOMP: CLong = 317L

public val SYS_GETRANDOM: CLong = 318L

public val SYS_MEMFD_CREATE: CLong = 319L

public val SYS_KEXEC_FILE_LOAD: CLong = 320L

public val SYS_BPF: CLong = 321L

public val SYS_EXECVEAT: CLong = 322L

public val SYS_USERFAULTFD: CLong = 323L

public val SYS_MEMBARRIER: CLong = 324L

public val SYS_MLOCK2: CLong = 325L

public val SYS_COPY_FILE_RANGE: CLong = 326L

public val SYS_PREADV2: CLong = 327L

public val SYS_PWRITEV2: CLong = 328L

public val SYS_PKEY_MPROTECT: CLong = 329L

public val SYS_PKEY_ALLOC: CLong = 330L

public val SYS_PKEY_FREE: CLong = 331L

public val SYS_STATX: CLong = 332L

public val SYS_RSEQ: CLong = 334L

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

public val SYS_FCHMODAT2: CLong = 452L

public val SYS_MSEAL: CLong = 462L

public fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __slot_0 = if (name == null) 0L else LibcDynamicFfi.allocScalarSlot(name.toLong())
    val __slot_3 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctl", -1, longArrayOf(__slot_0, namelen.toLong(), oldp?.value ?: 0L, __slot_3, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}
