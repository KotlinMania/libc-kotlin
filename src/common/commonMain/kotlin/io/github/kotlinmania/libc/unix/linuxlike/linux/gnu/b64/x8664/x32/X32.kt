// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/x32.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.x32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.pthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsfilcntT

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fSpare: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public val SIZEOF_PTHREAD_MUTEX_T: Int = 32

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 44

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 2u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 3u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

// Syscall table
public val X32_SYSCALL_BIT: CLong = 0x40000000L

public val SYS_READ: CLong = X32_SYSCALL_BIT + 0L

public val SYS_WRITE: CLong = X32_SYSCALL_BIT + 1L

public val SYS_OPEN: CLong = X32_SYSCALL_BIT + 2L

public val SYS_CLOSE: CLong = X32_SYSCALL_BIT + 3L

public val SYS_STAT: CLong = X32_SYSCALL_BIT + 4L

public val SYS_FSTAT: CLong = X32_SYSCALL_BIT + 5L

public val SYS_LSTAT: CLong = X32_SYSCALL_BIT + 6L

public val SYS_POLL: CLong = X32_SYSCALL_BIT + 7L

public val SYS_LSEEK: CLong = X32_SYSCALL_BIT + 8L

public val SYS_MMAP: CLong = X32_SYSCALL_BIT + 9L

public val SYS_MPROTECT: CLong = X32_SYSCALL_BIT + 10L

public val SYS_MUNMAP: CLong = X32_SYSCALL_BIT + 11L

public val SYS_BRK: CLong = X32_SYSCALL_BIT + 12L

public val SYS_RT_SIGPROCMASK: CLong = X32_SYSCALL_BIT + 14L

public val SYS_PREAD64: CLong = X32_SYSCALL_BIT + 17L

public val SYS_PWRITE64: CLong = X32_SYSCALL_BIT + 18L

public val SYS_ACCESS: CLong = X32_SYSCALL_BIT + 21L

public val SYS_PIPE: CLong = X32_SYSCALL_BIT + 22L

public val SYS_SELECT: CLong = X32_SYSCALL_BIT + 23L

public val SYS_SCHED_YIELD: CLong = X32_SYSCALL_BIT + 24L

public val SYS_MREMAP: CLong = X32_SYSCALL_BIT + 25L

public val SYS_MSYNC: CLong = X32_SYSCALL_BIT + 26L

public val SYS_MINCORE: CLong = X32_SYSCALL_BIT + 27L

public val SYS_MADVISE: CLong = X32_SYSCALL_BIT + 28L

public val SYS_SHMGET: CLong = X32_SYSCALL_BIT + 29L

public val SYS_SHMAT: CLong = X32_SYSCALL_BIT + 30L

public val SYS_SHMCTL: CLong = X32_SYSCALL_BIT + 31L

public val SYS_DUP: CLong = X32_SYSCALL_BIT + 32L

public val SYS_DUP2: CLong = X32_SYSCALL_BIT + 33L

public val SYS_PAUSE: CLong = X32_SYSCALL_BIT + 34L

public val SYS_NANOSLEEP: CLong = X32_SYSCALL_BIT + 35L

public val SYS_GETITIMER: CLong = X32_SYSCALL_BIT + 36L

public val SYS_ALARM: CLong = X32_SYSCALL_BIT + 37L

public val SYS_SETITIMER: CLong = X32_SYSCALL_BIT + 38L

public val SYS_GETPID: CLong = X32_SYSCALL_BIT + 39L

public val SYS_SENDFILE: CLong = X32_SYSCALL_BIT + 40L

public val SYS_SOCKET: CLong = X32_SYSCALL_BIT + 41L

public val SYS_CONNECT: CLong = X32_SYSCALL_BIT + 42L

public val SYS_ACCEPT: CLong = X32_SYSCALL_BIT + 43L

public val SYS_SENDTO: CLong = X32_SYSCALL_BIT + 44L

public val SYS_SHUTDOWN: CLong = X32_SYSCALL_BIT + 48L

public val SYS_BIND: CLong = X32_SYSCALL_BIT + 49L

public val SYS_LISTEN: CLong = X32_SYSCALL_BIT + 50L

public val SYS_GETSOCKNAME: CLong = X32_SYSCALL_BIT + 51L

public val SYS_GETPEERNAME: CLong = X32_SYSCALL_BIT + 52L

public val SYS_SOCKETPAIR: CLong = X32_SYSCALL_BIT + 53L

public val SYS_CLONE: CLong = X32_SYSCALL_BIT + 56L

public val SYS_FORK: CLong = X32_SYSCALL_BIT + 57L

public val SYS_VFORK: CLong = X32_SYSCALL_BIT + 58L

public val SYS_EXIT: CLong = X32_SYSCALL_BIT + 60L

public val SYS_WAIT4: CLong = X32_SYSCALL_BIT + 61L

public val SYS_KILL: CLong = X32_SYSCALL_BIT + 62L

public val SYS_UNAME: CLong = X32_SYSCALL_BIT + 63L

public val SYS_SEMGET: CLong = X32_SYSCALL_BIT + 64L

public val SYS_SEMOP: CLong = X32_SYSCALL_BIT + 65L

public val SYS_SEMCTL: CLong = X32_SYSCALL_BIT + 66L

public val SYS_SHMDT: CLong = X32_SYSCALL_BIT + 67L

public val SYS_MSGGET: CLong = X32_SYSCALL_BIT + 68L

public val SYS_MSGSND: CLong = X32_SYSCALL_BIT + 69L

public val SYS_MSGRCV: CLong = X32_SYSCALL_BIT + 70L

public val SYS_MSGCTL: CLong = X32_SYSCALL_BIT + 71L

public val SYS_FCNTL: CLong = X32_SYSCALL_BIT + 72L

public val SYS_FLOCK: CLong = X32_SYSCALL_BIT + 73L

public val SYS_FSYNC: CLong = X32_SYSCALL_BIT + 74L

public val SYS_FDATASYNC: CLong = X32_SYSCALL_BIT + 75L

public val SYS_TRUNCATE: CLong = X32_SYSCALL_BIT + 76L

public val SYS_FTRUNCATE: CLong = X32_SYSCALL_BIT + 77L

public val SYS_GETDENTS: CLong = X32_SYSCALL_BIT + 78L

public val SYS_GETCWD: CLong = X32_SYSCALL_BIT + 79L

public val SYS_CHDIR: CLong = X32_SYSCALL_BIT + 80L

public val SYS_FCHDIR: CLong = X32_SYSCALL_BIT + 81L

public val SYS_RENAME: CLong = X32_SYSCALL_BIT + 82L

public val SYS_MKDIR: CLong = X32_SYSCALL_BIT + 83L

public val SYS_RMDIR: CLong = X32_SYSCALL_BIT + 84L

public val SYS_CREAT: CLong = X32_SYSCALL_BIT + 85L

public val SYS_LINK: CLong = X32_SYSCALL_BIT + 86L

public val SYS_UNLINK: CLong = X32_SYSCALL_BIT + 87L

public val SYS_SYMLINK: CLong = X32_SYSCALL_BIT + 88L

public val SYS_READLINK: CLong = X32_SYSCALL_BIT + 89L

public val SYS_CHMOD: CLong = X32_SYSCALL_BIT + 90L

public val SYS_FCHMOD: CLong = X32_SYSCALL_BIT + 91L

public val SYS_CHOWN: CLong = X32_SYSCALL_BIT + 92L

public val SYS_FCHOWN: CLong = X32_SYSCALL_BIT + 93L

public val SYS_LCHOWN: CLong = X32_SYSCALL_BIT + 94L

public val SYS_UMASK: CLong = X32_SYSCALL_BIT + 95L

public val SYS_GETTIMEOFDAY: CLong = X32_SYSCALL_BIT + 96L

public val SYS_GETRLIMIT: CLong = X32_SYSCALL_BIT + 97L

public val SYS_GETRUSAGE: CLong = X32_SYSCALL_BIT + 98L

public val SYS_SYSINFO: CLong = X32_SYSCALL_BIT + 99L

public val SYS_TIMES: CLong = X32_SYSCALL_BIT + 100L

public val SYS_GETUID: CLong = X32_SYSCALL_BIT + 102L

public val SYS_SYSLOG: CLong = X32_SYSCALL_BIT + 103L

public val SYS_GETGID: CLong = X32_SYSCALL_BIT + 104L

public val SYS_SETUID: CLong = X32_SYSCALL_BIT + 105L

public val SYS_SETGID: CLong = X32_SYSCALL_BIT + 106L

public val SYS_GETEUID: CLong = X32_SYSCALL_BIT + 107L

public val SYS_GETEGID: CLong = X32_SYSCALL_BIT + 108L

public val SYS_SETPGID: CLong = X32_SYSCALL_BIT + 109L

public val SYS_GETPPID: CLong = X32_SYSCALL_BIT + 110L

public val SYS_GETPGRP: CLong = X32_SYSCALL_BIT + 111L

public val SYS_SETSID: CLong = X32_SYSCALL_BIT + 112L

public val SYS_SETREUID: CLong = X32_SYSCALL_BIT + 113L

public val SYS_SETREGID: CLong = X32_SYSCALL_BIT + 114L

public val SYS_GETGROUPS: CLong = X32_SYSCALL_BIT + 115L

public val SYS_SETGROUPS: CLong = X32_SYSCALL_BIT + 116L

public val SYS_SETRESUID: CLong = X32_SYSCALL_BIT + 117L

public val SYS_GETRESUID: CLong = X32_SYSCALL_BIT + 118L

public val SYS_SETRESGID: CLong = X32_SYSCALL_BIT + 119L

public val SYS_GETRESGID: CLong = X32_SYSCALL_BIT + 120L

public val SYS_GETPGID: CLong = X32_SYSCALL_BIT + 121L

public val SYS_SETFSUID: CLong = X32_SYSCALL_BIT + 122L

public val SYS_SETFSGID: CLong = X32_SYSCALL_BIT + 123L

public val SYS_GETSID: CLong = X32_SYSCALL_BIT + 124L

public val SYS_CAPGET: CLong = X32_SYSCALL_BIT + 125L

public val SYS_CAPSET: CLong = X32_SYSCALL_BIT + 126L

public val SYS_RT_SIGSUSPEND: CLong = X32_SYSCALL_BIT + 130L

public val SYS_UTIME: CLong = X32_SYSCALL_BIT + 132L

public val SYS_MKNOD: CLong = X32_SYSCALL_BIT + 133L

public val SYS_PERSONALITY: CLong = X32_SYSCALL_BIT + 135L

public val SYS_USTAT: CLong = X32_SYSCALL_BIT + 136L

public val SYS_STATFS: CLong = X32_SYSCALL_BIT + 137L

public val SYS_FSTATFS: CLong = X32_SYSCALL_BIT + 138L

public val SYS_SYSFS: CLong = X32_SYSCALL_BIT + 139L

public val SYS_GETPRIORITY: CLong = X32_SYSCALL_BIT + 140L

public val SYS_SETPRIORITY: CLong = X32_SYSCALL_BIT + 141L

public val SYS_SCHED_SETPARAM: CLong = X32_SYSCALL_BIT + 142L

public val SYS_SCHED_GETPARAM: CLong = X32_SYSCALL_BIT + 143L

public val SYS_SCHED_SETSCHEDULER: CLong = X32_SYSCALL_BIT + 144L

public val SYS_SCHED_GETSCHEDULER: CLong = X32_SYSCALL_BIT + 145L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = X32_SYSCALL_BIT + 146L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = X32_SYSCALL_BIT + 147L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = X32_SYSCALL_BIT + 148L

public val SYS_MLOCK: CLong = X32_SYSCALL_BIT + 149L

public val SYS_MUNLOCK: CLong = X32_SYSCALL_BIT + 150L

public val SYS_MLOCKALL: CLong = X32_SYSCALL_BIT + 151L

public val SYS_MUNLOCKALL: CLong = X32_SYSCALL_BIT + 152L

public val SYS_VHANGUP: CLong = X32_SYSCALL_BIT + 153L

public val SYS_MODIFY_LDT: CLong = X32_SYSCALL_BIT + 154L

public val SYS_PIVOT_ROOT: CLong = X32_SYSCALL_BIT + 155L

public val SYS_PRCTL: CLong = X32_SYSCALL_BIT + 157L

public val SYS_ARCH_PRCTL: CLong = X32_SYSCALL_BIT + 158L

public val SYS_ADJTIMEX: CLong = X32_SYSCALL_BIT + 159L

public val SYS_SETRLIMIT: CLong = X32_SYSCALL_BIT + 160L

public val SYS_CHROOT: CLong = X32_SYSCALL_BIT + 161L

public val SYS_SYNC: CLong = X32_SYSCALL_BIT + 162L

public val SYS_ACCT: CLong = X32_SYSCALL_BIT + 163L

public val SYS_SETTIMEOFDAY: CLong = X32_SYSCALL_BIT + 164L

public val SYS_MOUNT: CLong = X32_SYSCALL_BIT + 165L

public val SYS_UMOUNT2: CLong = X32_SYSCALL_BIT + 166L

public val SYS_SWAPON: CLong = X32_SYSCALL_BIT + 167L

public val SYS_SWAPOFF: CLong = X32_SYSCALL_BIT + 168L

public val SYS_REBOOT: CLong = X32_SYSCALL_BIT + 169L

public val SYS_SETHOSTNAME: CLong = X32_SYSCALL_BIT + 170L

public val SYS_SETDOMAINNAME: CLong = X32_SYSCALL_BIT + 171L

public val SYS_IOPL: CLong = X32_SYSCALL_BIT + 172L

public val SYS_IOPERM: CLong = X32_SYSCALL_BIT + 173L

public val SYS_INIT_MODULE: CLong = X32_SYSCALL_BIT + 175L

public val SYS_DELETE_MODULE: CLong = X32_SYSCALL_BIT + 176L

public val SYS_QUOTACTL: CLong = X32_SYSCALL_BIT + 179L

public val SYS_GETPMSG: CLong = X32_SYSCALL_BIT + 181L

public val SYS_PUTPMSG: CLong = X32_SYSCALL_BIT + 182L

public val SYS_AFS_SYSCALL: CLong = X32_SYSCALL_BIT + 183L

public val SYS_TUXCALL: CLong = X32_SYSCALL_BIT + 184L

public val SYS_SECURITY: CLong = X32_SYSCALL_BIT + 185L

public val SYS_GETTID: CLong = X32_SYSCALL_BIT + 186L

public val SYS_READAHEAD: CLong = X32_SYSCALL_BIT + 187L

public val SYS_SETXATTR: CLong = X32_SYSCALL_BIT + 188L

public val SYS_LSETXATTR: CLong = X32_SYSCALL_BIT + 189L

public val SYS_FSETXATTR: CLong = X32_SYSCALL_BIT + 190L

public val SYS_GETXATTR: CLong = X32_SYSCALL_BIT + 191L

public val SYS_LGETXATTR: CLong = X32_SYSCALL_BIT + 192L

public val SYS_FGETXATTR: CLong = X32_SYSCALL_BIT + 193L

public val SYS_LISTXATTR: CLong = X32_SYSCALL_BIT + 194L

public val SYS_LLISTXATTR: CLong = X32_SYSCALL_BIT + 195L

public val SYS_FLISTXATTR: CLong = X32_SYSCALL_BIT + 196L

public val SYS_REMOVEXATTR: CLong = X32_SYSCALL_BIT + 197L

public val SYS_LREMOVEXATTR: CLong = X32_SYSCALL_BIT + 198L

public val SYS_FREMOVEXATTR: CLong = X32_SYSCALL_BIT + 199L

public val SYS_TKILL: CLong = X32_SYSCALL_BIT + 200L

public val SYS_TIME: CLong = X32_SYSCALL_BIT + 201L

public val SYS_FUTEX: CLong = X32_SYSCALL_BIT + 202L

public val SYS_SCHED_SETAFFINITY: CLong = X32_SYSCALL_BIT + 203L

public val SYS_SCHED_GETAFFINITY: CLong = X32_SYSCALL_BIT + 204L

public val SYS_IO_DESTROY: CLong = X32_SYSCALL_BIT + 207L

public val SYS_IO_GETEVENTS: CLong = X32_SYSCALL_BIT + 208L

public val SYS_IO_CANCEL: CLong = X32_SYSCALL_BIT + 210L

public val SYS_LOOKUP_DCOOKIE: CLong = X32_SYSCALL_BIT + 212L

public val SYS_EPOLL_CREATE: CLong = X32_SYSCALL_BIT + 213L

public val SYS_REMAP_FILE_PAGES: CLong = X32_SYSCALL_BIT + 216L

public val SYS_GETDENTS64: CLong = X32_SYSCALL_BIT + 217L

public val SYS_SET_TID_ADDRESS: CLong = X32_SYSCALL_BIT + 218L

public val SYS_RESTART_SYSCALL: CLong = X32_SYSCALL_BIT + 219L

public val SYS_SEMTIMEDOP: CLong = X32_SYSCALL_BIT + 220L

public val SYS_FADVISE64: CLong = X32_SYSCALL_BIT + 221L

public val SYS_TIMER_SETTIME: CLong = X32_SYSCALL_BIT + 223L

public val SYS_TIMER_GETTIME: CLong = X32_SYSCALL_BIT + 224L

public val SYS_TIMER_GETOVERRUN: CLong = X32_SYSCALL_BIT + 225L

public val SYS_TIMER_DELETE: CLong = X32_SYSCALL_BIT + 226L

public val SYS_CLOCK_SETTIME: CLong = X32_SYSCALL_BIT + 227L

public val SYS_CLOCK_GETTIME: CLong = X32_SYSCALL_BIT + 228L

public val SYS_CLOCK_GETRES: CLong = X32_SYSCALL_BIT + 229L

public val SYS_CLOCK_NANOSLEEP: CLong = X32_SYSCALL_BIT + 230L

public val SYS_EXIT_GROUP: CLong = X32_SYSCALL_BIT + 231L

public val SYS_EPOLL_WAIT: CLong = X32_SYSCALL_BIT + 232L

public val SYS_EPOLL_CTL: CLong = X32_SYSCALL_BIT + 233L

public val SYS_TGKILL: CLong = X32_SYSCALL_BIT + 234L

public val SYS_UTIMES: CLong = X32_SYSCALL_BIT + 235L

public val SYS_MBIND: CLong = X32_SYSCALL_BIT + 237L

public val SYS_SET_MEMPOLICY: CLong = X32_SYSCALL_BIT + 238L

public val SYS_GET_MEMPOLICY: CLong = X32_SYSCALL_BIT + 239L

public val SYS_MQ_OPEN: CLong = X32_SYSCALL_BIT + 240L

public val SYS_MQ_UNLINK: CLong = X32_SYSCALL_BIT + 241L

public val SYS_MQ_TIMEDSEND: CLong = X32_SYSCALL_BIT + 242L

public val SYS_MQ_TIMEDRECEIVE: CLong = X32_SYSCALL_BIT + 243L

public val SYS_MQ_GETSETATTR: CLong = X32_SYSCALL_BIT + 245L

public val SYS_ADD_KEY: CLong = X32_SYSCALL_BIT + 248L

public val SYS_REQUEST_KEY: CLong = X32_SYSCALL_BIT + 249L

public val SYS_KEYCTL: CLong = X32_SYSCALL_BIT + 250L

public val SYS_IOPRIO_SET: CLong = X32_SYSCALL_BIT + 251L

public val SYS_IOPRIO_GET: CLong = X32_SYSCALL_BIT + 252L

public val SYS_INOTIFY_INIT: CLong = X32_SYSCALL_BIT + 253L

public val SYS_INOTIFY_ADD_WATCH: CLong = X32_SYSCALL_BIT + 254L

public val SYS_INOTIFY_RM_WATCH: CLong = X32_SYSCALL_BIT + 255L

public val SYS_MIGRATE_PAGES: CLong = X32_SYSCALL_BIT + 256L

public val SYS_OPENAT: CLong = X32_SYSCALL_BIT + 257L

public val SYS_MKDIRAT: CLong = X32_SYSCALL_BIT + 258L

public val SYS_MKNODAT: CLong = X32_SYSCALL_BIT + 259L

public val SYS_FCHOWNAT: CLong = X32_SYSCALL_BIT + 260L

public val SYS_FUTIMESAT: CLong = X32_SYSCALL_BIT + 261L

public val SYS_NEWFSTATAT: CLong = X32_SYSCALL_BIT + 262L

public val SYS_UNLINKAT: CLong = X32_SYSCALL_BIT + 263L

public val SYS_RENAMEAT: CLong = X32_SYSCALL_BIT + 264L

public val SYS_LINKAT: CLong = X32_SYSCALL_BIT + 265L

public val SYS_SYMLINKAT: CLong = X32_SYSCALL_BIT + 266L

public val SYS_READLINKAT: CLong = X32_SYSCALL_BIT + 267L

public val SYS_FCHMODAT: CLong = X32_SYSCALL_BIT + 268L

public val SYS_FACCESSAT: CLong = X32_SYSCALL_BIT + 269L

public val SYS_PSELECT6: CLong = X32_SYSCALL_BIT + 270L

public val SYS_PPOLL: CLong = X32_SYSCALL_BIT + 271L

public val SYS_UNSHARE: CLong = X32_SYSCALL_BIT + 272L

public val SYS_SPLICE: CLong = X32_SYSCALL_BIT + 275L

public val SYS_TEE: CLong = X32_SYSCALL_BIT + 276L

public val SYS_SYNC_FILE_RANGE: CLong = X32_SYSCALL_BIT + 277L

public val SYS_UTIMENSAT: CLong = X32_SYSCALL_BIT + 280L

public val SYS_EPOLL_PWAIT: CLong = X32_SYSCALL_BIT + 281L

public val SYS_SIGNALFD: CLong = X32_SYSCALL_BIT + 282L

public val SYS_TIMERFD_CREATE: CLong = X32_SYSCALL_BIT + 283L

public val SYS_EVENTFD: CLong = X32_SYSCALL_BIT + 284L

public val SYS_FALLOCATE: CLong = X32_SYSCALL_BIT + 285L

public val SYS_TIMERFD_SETTIME: CLong = X32_SYSCALL_BIT + 286L

public val SYS_TIMERFD_GETTIME: CLong = X32_SYSCALL_BIT + 287L

public val SYS_ACCEPT4: CLong = X32_SYSCALL_BIT + 288L

public val SYS_SIGNALFD4: CLong = X32_SYSCALL_BIT + 289L

public val SYS_EVENTFD2: CLong = X32_SYSCALL_BIT + 290L

public val SYS_EPOLL_CREATE1: CLong = X32_SYSCALL_BIT + 291L

public val SYS_DUP3: CLong = X32_SYSCALL_BIT + 292L

public val SYS_PIPE2: CLong = X32_SYSCALL_BIT + 293L

public val SYS_INOTIFY_INIT1: CLong = X32_SYSCALL_BIT + 294L

public val SYS_PERF_EVENT_OPEN: CLong = X32_SYSCALL_BIT + 298L

public val SYS_FANOTIFY_INIT: CLong = X32_SYSCALL_BIT + 300L

public val SYS_FANOTIFY_MARK: CLong = X32_SYSCALL_BIT + 301L

public val SYS_PRLIMIT64: CLong = X32_SYSCALL_BIT + 302L

public val SYS_NAME_TO_HANDLE_AT: CLong = X32_SYSCALL_BIT + 303L

public val SYS_OPEN_BY_HANDLE_AT: CLong = X32_SYSCALL_BIT + 304L

public val SYS_CLOCK_ADJTIME: CLong = X32_SYSCALL_BIT + 305L

public val SYS_SYNCFS: CLong = X32_SYSCALL_BIT + 306L

public val SYS_SETNS: CLong = X32_SYSCALL_BIT + 308L

public val SYS_GETCPU: CLong = X32_SYSCALL_BIT + 309L

public val SYS_KCMP: CLong = X32_SYSCALL_BIT + 312L

public val SYS_FINIT_MODULE: CLong = X32_SYSCALL_BIT + 313L

public val SYS_SCHED_SETATTR: CLong = X32_SYSCALL_BIT + 314L

public val SYS_SCHED_GETATTR: CLong = X32_SYSCALL_BIT + 315L

public val SYS_RENAMEAT2: CLong = X32_SYSCALL_BIT + 316L

public val SYS_SECCOMP: CLong = X32_SYSCALL_BIT + 317L

public val SYS_GETRANDOM: CLong = X32_SYSCALL_BIT + 318L

public val SYS_MEMFD_CREATE: CLong = X32_SYSCALL_BIT + 319L

public val SYS_KEXEC_FILE_LOAD: CLong = X32_SYSCALL_BIT + 320L

public val SYS_BPF: CLong = X32_SYSCALL_BIT + 321L

public val SYS_USERFAULTFD: CLong = X32_SYSCALL_BIT + 323L

public val SYS_MEMBARRIER: CLong = X32_SYSCALL_BIT + 324L

public val SYS_MLOCK2: CLong = X32_SYSCALL_BIT + 325L

public val SYS_COPY_FILE_RANGE: CLong = X32_SYSCALL_BIT + 326L

public val SYS_PKEY_MPROTECT: CLong = X32_SYSCALL_BIT + 329L

public val SYS_PKEY_ALLOC: CLong = X32_SYSCALL_BIT + 330L

public val SYS_PKEY_FREE: CLong = X32_SYSCALL_BIT + 331L

public val SYS_STATX: CLong = X32_SYSCALL_BIT + 332L

public val SYS_RSEQ: CLong = X32_SYSCALL_BIT + 334L

public val SYS_PIDFD_SEND_SIGNAL: CLong = X32_SYSCALL_BIT + 424L

public val SYS_IO_URING_SETUP: CLong = X32_SYSCALL_BIT + 425L

public val SYS_IO_URING_ENTER: CLong = X32_SYSCALL_BIT + 426L

public val SYS_IO_URING_REGISTER: CLong = X32_SYSCALL_BIT + 427L

public val SYS_OPEN_TREE: CLong = X32_SYSCALL_BIT + 428L

public val SYS_MOVE_MOUNT: CLong = X32_SYSCALL_BIT + 429L

public val SYS_FSOPEN: CLong = X32_SYSCALL_BIT + 430L

public val SYS_FSCONFIG: CLong = X32_SYSCALL_BIT + 431L

public val SYS_FSMOUNT: CLong = X32_SYSCALL_BIT + 432L

public val SYS_FSPICK: CLong = X32_SYSCALL_BIT + 433L

public val SYS_PIDFD_OPEN: CLong = X32_SYSCALL_BIT + 434L

public val SYS_CLONE3: CLong = X32_SYSCALL_BIT + 435L

public val SYS_CLOSE_RANGE: CLong = X32_SYSCALL_BIT + 436L

public val SYS_OPENAT2: CLong = X32_SYSCALL_BIT + 437L

public val SYS_PIDFD_GETFD: CLong = X32_SYSCALL_BIT + 438L

public val SYS_FACCESSAT2: CLong = X32_SYSCALL_BIT + 439L

public val SYS_PROCESS_MADVISE: CLong = X32_SYSCALL_BIT + 440L

public val SYS_EPOLL_PWAIT2: CLong = X32_SYSCALL_BIT + 441L

public val SYS_MOUNT_SETATTR: CLong = X32_SYSCALL_BIT + 442L

public val SYS_QUOTACTL_FD: CLong = X32_SYSCALL_BIT + 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = X32_SYSCALL_BIT + 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = X32_SYSCALL_BIT + 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = X32_SYSCALL_BIT + 446L

public val SYS_MEMFD_SECRET: CLong = X32_SYSCALL_BIT + 447L

public val SYS_PROCESS_MRELEASE: CLong = X32_SYSCALL_BIT + 448L

public val SYS_FUTEX_WAITV: CLong = X32_SYSCALL_BIT + 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = X32_SYSCALL_BIT + 450L

public val SYS_FCHMODAT2: CLong = X32_SYSCALL_BIT + 452L

public val SYS_RT_SIGACTION: CLong = X32_SYSCALL_BIT + 512L

public val SYS_RT_SIGRETURN: CLong = X32_SYSCALL_BIT + 513L

public val SYS_IOCTL: CLong = X32_SYSCALL_BIT + 514L

public val SYS_READV: CLong = X32_SYSCALL_BIT + 515L

public val SYS_WRITEV: CLong = X32_SYSCALL_BIT + 516L

public val SYS_RECVFROM: CLong = X32_SYSCALL_BIT + 517L

public val SYS_SENDMSG: CLong = X32_SYSCALL_BIT + 518L

public val SYS_RECVMSG: CLong = X32_SYSCALL_BIT + 519L

public val SYS_EXECVE: CLong = X32_SYSCALL_BIT + 520L

public val SYS_PTRACE: CLong = X32_SYSCALL_BIT + 521L

public val SYS_RT_SIGPENDING: CLong = X32_SYSCALL_BIT + 522L

public val SYS_RT_SIGTIMEDWAIT: CLong = X32_SYSCALL_BIT + 523L

public val SYS_RT_SIGQUEUEINFO: CLong = X32_SYSCALL_BIT + 524L

public val SYS_SIGALTSTACK: CLong = X32_SYSCALL_BIT + 525L

public val SYS_TIMER_CREATE: CLong = X32_SYSCALL_BIT + 526L

public val SYS_MQ_NOTIFY: CLong = X32_SYSCALL_BIT + 527L

public val SYS_KEXEC_LOAD: CLong = X32_SYSCALL_BIT + 528L

public val SYS_WAITID: CLong = X32_SYSCALL_BIT + 529L

public val SYS_SET_ROBUST_LIST: CLong = X32_SYSCALL_BIT + 530L

public val SYS_GET_ROBUST_LIST: CLong = X32_SYSCALL_BIT + 531L

public val SYS_VMSPLICE: CLong = X32_SYSCALL_BIT + 532L

public val SYS_MOVE_PAGES: CLong = X32_SYSCALL_BIT + 533L

public val SYS_PREADV: CLong = X32_SYSCALL_BIT + 534L

public val SYS_PWRITEV: CLong = X32_SYSCALL_BIT + 535L

public val SYS_RT_TGSIGQUEUEINFO: CLong = X32_SYSCALL_BIT + 536L

public val SYS_RECVMMSG: CLong = X32_SYSCALL_BIT + 537L

public val SYS_SENDMMSG: CLong = X32_SYSCALL_BIT + 538L

public val SYS_PROCESS_VM_READV: CLong = X32_SYSCALL_BIT + 539L

public val SYS_PROCESS_VM_WRITEV: CLong = X32_SYSCALL_BIT + 540L

public val SYS_SETSOCKOPT: CLong = X32_SYSCALL_BIT + 541L

public val SYS_GETSOCKOPT: CLong = X32_SYSCALL_BIT + 542L

public val SYS_IO_SETUP: CLong = X32_SYSCALL_BIT + 543L

public val SYS_IO_SUBMIT: CLong = X32_SYSCALL_BIT + 544L

public val SYS_EXECVEAT: CLong = X32_SYSCALL_BIT + 545L

public val SYS_PREADV2: CLong = X32_SYSCALL_BIT + 546L

public val SYS_PWRITEV2: CLong = X32_SYSCALL_BIT + 547L
