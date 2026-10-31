// port-lint: source unix/linux_like/linux/musl/b32/hexagon.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*

public typealias WcharT = UInt
public typealias Stat64 = Stat

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)

public data class IpcPerm(
    val key: Int,
    val ipcPermKey: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: UShort,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: ULong,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: Long,
    val msgRtime: Long,
    val msgCtime: Long,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgQbytes: ULong,
    val msgLspid: Int,
    val msgLrpid: Int,
)

public const val AF_FILE: Int = 1
public const val AF_KCM: Int = 41
public const val AF_MAX: Int = 43
public const val AF_QIPCRTR: Int = 42
public const val EADDRINUSE: Int = 98
public const val EADDRNOTAVAIL: Int = 99
public const val EAFNOSUPPORT: Int = 97
public const val EALREADY: Int = 114
public const val EBADE: Int = 52
public const val EBADMSG: Int = 74
public const val EBADR: Int = 53
public const val EBADRQC: Int = 56
public const val EBADSLT: Int = 57
public const val ECANCELED: Int = 125
public const val ECHRNG: Int = 44
public const val ECONNABORTED: Int = 103
public const val ECONNREFUSED: Int = 111
public const val ECONNRESET: Int = 104
public const val EDEADLK: Int = 35
public const val EDEADLOCK: Int = 35
public const val EDESTADDRREQ: Int = 89
public const val EDQUOT: Int = 122
public const val EHOSTDOWN: Int = 112
public const val EHOSTUNREACH: Int = 113
public const val EHWPOISON: Int = 133
public const val EIDRM: Int = 43
public const val EILSEQ: Int = 84
public const val EINPROGRESS: Int = 115
public const val EISCONN: Int = 106
public const val EISNAM: Int = 120
public const val EKEYEXPIRED: Int = 127
public const val EKEYREJECTED: Int = 129
public const val EKEYREVOKED: Int = 128
public const val EL2HLT: Int = 51
public const val EL2NSYNC: Int = 45
public const val EL3HLT: Int = 46
public const val EL3RST: Int = 47
public const val ELIBACC: Int = 79
public const val ELIBBAD: Int = 80
public const val ELIBEXEC: Int = 83
public const val ELIBMAX: Int = 82
public const val ELIBSCN: Int = 81
public const val ELNRNG: Int = 48
public const val ELOOP: Int = 40
public const val EMEDIUMTYPE: Int = 124
public const val EMSGSIZE: Int = 90
public const val EMULTIHOP: Int = 72
public const val ENAMETOOLONG: Int = 36
public const val ENAVAIL: Int = 119
public const val ENETDOWN: Int = 100
public const val ENETRESET: Int = 102
public const val ENETUNREACH: Int = 101
public const val ENOANO: Int = 55
public const val ENOBUFS: Int = 105
public const val ENOCSI: Int = 50
public const val ENOKEY: Int = 126
public const val ENOLCK: Int = 37
public const val ENOMEDIUM: Int = 123
public const val ENOMSG: Int = 42
public const val ENOPROTOOPT: Int = 92
public const val ENOSYS: Int = 38
public const val ENOTCONN: Int = 107
public const val ENOTEMPTY: Int = 39
public const val ENOTNAM: Int = 118
public const val ENOTRECOVERABLE: Int = 131
public const val ENOTSOCK: Int = 88
public const val ENOTSUP: Int = 95
public const val ENOTUNIQ: Int = 76
public const val EOPNOTSUPP: Int = 95
public const val EOVERFLOW: Int = 75
public const val EOWNERDEAD: Int = 130
public const val EPFNOSUPPORT: Int = 96
public const val EREMCHG: Int = 78
public const val ERESTART: Int = 85
public const val ERFKILL: Int = 132
public const val ESHUTDOWN: Int = 108
public const val ESOCKTNOSUPPORT: Int = 94
public const val ESTALE: Int = 116
public const val ESTRPIPE: Int = 86
public const val ETOOMANYREFS: Int = 109
public const val ETIMEDOUT: Int = 110
public const val EUCLEAN: Int = 117
public const val EUNATCH: Int = 49
public const val EUSERS: Int = 87
public const val EXFULL: Int = 54
public const val EXTPROC: Int = 65536
public const val F_EXLCK: Int = 4
public const val F_GETLK: Int = 12
public const val F_GETOWN: Int = 9
public const val F_GETOWNER_UIDS: Int = 17
public const val F_GETOWN_EX: Int = 16
public const val F_GETSIG: Int = 11
public const val F_LINUX_SPECIFIC_BASE: Int = 1024
public const val FLUSHO: Int = 4096
public const val F_OWNER_PGRP: Int = 2
public const val F_OWNER_PID: Int = 1
public const val F_OWNER_TID: Int = 0
public const val F_SETLK: Int = 13
public const val F_SETLKW: Int = 14
public const val F_SETOWN: Int = 8
public const val F_SETOWN_EX: Int = 15
public const val F_SETSIG: Int = 10
public const val F_SHLCK: Int = 8
public const val IEXTEN: Int = 32768
public const val MAP_ANON: Int = 32
public const val MAP_DENYWRITE: Int = 2048
public const val MAP_EXECUTABLE: Int = 4096
public const val MAP_GROWSDOWN: Int = 256
public const val MAP_HUGETLB: Int = 262144
public const val MAP_LOCKED: Int = 8192
public const val MAP_NONBLOCK: Int = 65536
public const val MAP_NORESERVE: Int = 16384
public const val MAP_POPULATE: Int = 32768
public const val MAP_STACK: Int = 131072
public const val MAP_UNINITIALIZED: Int = 0
public const val O_APPEND: Int = 1024
public const val O_ASYNC: Int = 8192
public const val O_CREAT: Int = 64
public const val O_DIRECT: Int = 16384
public const val O_DIRECTORY: Int = 65536
public const val O_DSYNC: Int = 4096
public const val O_EXCL: Int = 128
public const val O_LARGEFILE: Int = 32768
public const val O_NOCTTY: Int = 256
public const val O_NOFOLLOW: Int = 131072
public const val O_NONBLOCK: Int = 2048
public const val O_SYNC: Int = 1052672
public const val PF_FILE: Int = 1
public const val PF_KCM: Int = 41
public const val PF_MAX: Int = 43
public const val PF_QIPCRTR: Int = 42
public const val SA_ONSTACK: Int = 0x08000000
public const val SA_SIGINFO: Int = 0x00000004
public const val SA_NOCLDWAIT: Int = 0x00000002
public const val SIGBUS: Int = 7
public const val SIGCHLD: Int = 17
public const val SIGCONT: Int = 18
public const val SIGIO: Int = 29
public const val SIGPOLL: Int = 29
public const val SIGPROF: Int = 27
public const val SIGPWR: Int = 30
public const val SIGSTKFLT: Int = 16
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val SIGSTOP: Int = 19
public const val SIGSYS: Int = 31
public const val SIGTSTP: Int = 20
public const val SIGTTIN: Int = 21
public const val SIGTTOU: Int = 22
public const val SIGURG: Int = 23
public const val SIGUSR1: Int = 10
public const val SIGUSR2: Int = 12
public const val SIGVTALRM: Int = 26
public const val SIGWINCH: Int = 28
public const val SIGXCPU: Int = 24
public const val SIGXFSZ: Int = 25
public const val SIG_SETMASK: Int = 2
public const val SIG_BLOCK: Int = 0x000000
public const val SIG_UNBLOCK: Int = 0x01
public const val SOL_CAIF: Int = 278
public const val SOL_IUCV: Int = 277
public const val SOL_KCM: Int = 281
public const val SOL_NFC: Int = 280
public const val SOL_PNPIPE: Int = 275
public const val SOL_PPPOL2TP: Int = 273
public const val SOL_RDS: Int = 276
public const val SOL_RXRPC: Int = 272
public const val SYS3264_FADVISE64: Int = 223
public const val SYS3264_FCNTL: Int = 25
public const val SYS3264_FSTATAT: Int = 79
public const val SYS3264_FSTAT: Int = 80
public const val SYS3264_FSTATFS: Int = 44
public const val SYS3264_FTRUNCATE: Int = 46
public const val SYS3264_LSEEK: Int = 62
public const val SYS3264_LSTAT: Int = 1039
public const val SYS3264_MMAP: Int = 222
public const val SYS3264_SENDFILE: Int = 71
public const val SYS3264_STAT: Int = 1038
public const val SYS3264_STATFS: Int = 43
public const val SYS3264_TRUNCATE: Int = 45
public const val SYS_ACCEPT4: Int = 242
public const val SYS_ACCEPT: Int = 202
public const val SYS_ACCESS: Int = 1033
public const val SYS_ACCT: Int = 89
public const val SYS_ADD_KEY: Int = 217
public const val SYS_ADJTIMEX: Int = 171
public const val SYS_ALARM: Int = 1059
public const val SYS_ARCH_SPECIFIC_SYSCALL: Int = 244
public const val SYS_BDFLUSH: Int = 1075
public const val SYS_BIND: Int = 200
public const val SYS_BPF: Int = 280
public const val SYS_BRK: Int = 214
public const val SYS_CAPGET: Int = 90
public const val SYS_CAPSET: Int = 91
public const val SYS_CHDIR: Int = 49
public const val SYS_CHMOD: Int = 1028
public const val SYS_CHOWN: Int = 1029
public const val SYS_CHROOT: Int = 51
public const val SYS_CLOCK_ADJTIME: Int = 266
public const val SYS_CLOCK_GETRES: Int = 114
public const val SYS_CLOCK_GETTIME: Int = 113
public const val SYS_CLOCK_NANOSLEEP: Int = 115
public const val SYS_CLOCK_SETTIME: Int = 112
public const val SYS_CLONE: Int = 220
public const val SYS_CLOSE: Int = 57
public const val SYS_CONNECT: Int = 203
public const val SYS_COPY_FILE_RANGE: Int = -1
public const val SYS_CREAT: Int = 1064
public const val SYS_DELETE_MODULE: Int = 106
public const val SYS_DUP2: Int = 1041
public const val SYS_DUP3: Int = 24
public const val SYS_DUP: Int = 23
public const val SYS_EPOLL_CREATE1: Int = 20
public const val SYS_EPOLL_CREATE: Int = 1042
public const val SYS_EPOLL_CTL: Int = 21
public const val SYS_EPOLL_PWAIT: Int = 22
public const val SYS_EPOLL_WAIT: Int = 1069
public const val SYS_EVENTFD2: Int = 19
public const val SYS_EVENTFD: Int = 1044
public const val SYS_EXECVEAT: Int = 281
public const val SYS_EXECVE: Int = 221
public const val SYS_EXIT: Int = 93
public const val SYS_EXIT_GROUP: Int = 94
public const val SYS_FACCESSAT: Int = 48
public const val SYS_FADVISE64_64: Int = 223
public const val SYS_FALLOCATE: Int = 47
public const val SYS_FANOTIFY_INIT: Int = 262
public const val SYS_FANOTIFY_MARK: Int = 263
public const val SYS_FCHDIR: Int = 50
public const val SYS_FCHMODAT: Int = 53
public const val SYS_FCHMOD: Int = 52
public const val SYS_FCHOWNAT: Int = 54
public const val SYS_FCHOWN: Int = 55
public const val SYS_FCNTL64: Int = 25
public const val SYS_FCNTL: Int = 25
public const val SYS_FDATASYNC: Int = 83
public const val SYS_FGETXATTR: Int = 10
public const val SYS_FINIT_MODULE: Int = 273
public const val SYS_FLISTXATTR: Int = 13
public const val SYS_FLOCK: Int = 32
public const val SYS_FORK: Int = 1079
public const val SYS_FREMOVEXATTR: Int = 16
public const val SYS_FSETXATTR: Int = 7
public const val SYS_FSTAT64: Int = 80
public const val SYS_FSTATAT64: Int = 79
public const val SYS_FSTATFS64: Int = 44
public const val SYS_FSTATFS: Int = 44
public const val SYS_FSYNC: Int = 82
public const val SYS_FTRUNCATE64: Int = 46
public const val SYS_FTRUNCATE: Int = 46
public const val SYS_FUTEX: Int = 98
public const val SYS_FUTIMESAT: Int = 1066
public const val SYS_GETCPU: Int = 168
public const val SYS_GETCWD: Int = 17
public const val SYS_GETDENTS64: Int = 61
public const val SYS_GETDENTS: Int = 1065
public const val SYS_GETEGID: Int = 177
public const val SYS_GETEUID: Int = 175
public const val SYS_GETGID: Int = 176
public const val SYS_GETGROUPS: Int = 158
public const val SYS_GETITIMER: Int = 102
public const val SYS_GET_MEMPOLICY: Int = 236
public const val SYS_GETPEERNAME: Int = 205
public const val SYS_GETPGID: Int = 155
public const val SYS_GETPGRP: Int = 1060
public const val SYS_GETPID: Int = 172
public const val SYS_GETPPID: Int = 173
public const val SYS_GETPRIORITY: Int = 141
public const val SYS_GETRANDOM: Int = 278
public const val SYS_GETRESGID: Int = 150
public const val SYS_GETRESUID: Int = 148
public const val SYS_GETRLIMIT: Int = 163
public const val SYS_GET_ROBUST_LIST: Int = 100
public const val SYS_GETRUSAGE: Int = 165
public const val SYS_GETSID: Int = 156
public const val SYS_GETSOCKNAME: Int = 204
public const val SYS_GETSOCKOPT: Int = 209
public const val SYS_GETTID: Int = 178
public const val SYS_GETTIMEOFDAY: Int = 169
public const val SYS_GETUID: Int = 174
public const val SYS_GETXATTR: Int = 8
public const val SYS_INIT_MODULE: Int = 105
public const val SYS_INOTIFY_ADD_WATCH: Int = 27
public const val SYS_INOTIFY_INIT1: Int = 26
public const val SYS_INOTIFY_INIT: Int = 1043
public const val SYS_INOTIFY_RM_WATCH: Int = 28
public const val SYS_IO_CANCEL: Int = 3
public const val SYS_IOCTL: Int = 29
public const val SYS_IO_DESTROY: Int = 1
public const val SYS_IO_GETEVENTS: Int = 4
public const val SYS_IOPRIO_GET: Int = 31
public const val SYS_IOPRIO_SET: Int = 30
public const val SYS_IO_SETUP: Int = 0
public const val SYS_IO_SUBMIT: Int = 2
public const val SYS_KCMP: Int = 272
public const val SYS_KEXEC_LOAD: Int = 104
public const val SYS_KEYCTL: Int = 219
public const val SYS_KILL: Int = 129
public const val SYS_LCHOWN: Int = 1032
public const val SYS_LGETXATTR: Int = 9
public const val SYS_LINKAT: Int = 37
public const val SYS_LINK: Int = 1025
public const val SYS_LISTEN: Int = 201
public const val SYS_LISTXATTR: Int = 11
public const val SYS_LLISTXATTR: Int = 12
public const val SYS__LLSEEK: Int = 62
public const val SYS_LOOKUP_DCOOKIE: Int = 18
public const val SYS_LREMOVEXATTR: Int = 15
public const val SYS_LSEEK: Int = 62
public const val SYS_LSETXATTR: Int = 6
public const val SYS_LSTAT64: Int = 1039
public const val SYS_LSTAT: Int = 1039
public const val SYS_MADVISE: Int = 233
public const val SYS_MBIND: Int = 235
public const val SYS_MEMFD_CREATE: Int = 279
public const val SYS_MIGRATE_PAGES: Int = 238
public const val SYS_MINCORE: Int = 232
public const val SYS_MKDIRAT: Int = 34
public const val SYS_MKDIR: Int = 1030
public const val SYS_MKNODAT: Int = 33
public const val SYS_MKNOD: Int = 1027
public const val SYS_MLOCKALL: Int = 230
public const val SYS_MLOCK: Int = 228
public const val SYS_MMAP2: Int = 222
public const val SYS_MOUNT: Int = 40
public const val SYS_MOVE_PAGES: Int = 239
public const val SYS_MPROTECT: Int = 226
public const val SYS_MQ_GETSETATTR: Int = 185
public const val SYS_MQ_NOTIFY: Int = 184
public const val SYS_MQ_OPEN: Int = 180
public const val SYS_MQ_TIMEDRECEIVE: Int = 183
public const val SYS_MQ_TIMEDSEND: Int = 182
public const val SYS_MQ_UNLINK: Int = 181
public const val SYS_MREMAP: Int = 216
public const val SYS_MSGCTL: Int = 187
public const val SYS_MSGGET: Int = 186
public const val SYS_MSGRCV: Int = 188
public const val SYS_MSGSND: Int = 189
public const val SYS_MSYNC: Int = 227
public const val SYS_MUNLOCKALL: Int = 231
public const val SYS_MUNLOCK: Int = 229
public const val SYS_MUNMAP: Int = 215
public const val SYS_NAME_TO_HANDLE_AT: Int = 264
public const val SYS_NANOSLEEP: Int = 101
public const val SYS_NEWFSTATAT: Int = 79
public const val SYS_NFSSERVCTL: Int = 42
public const val SYS_OLDWAIT4: Int = 1072
public const val SYS_OPENAT: Int = 56
public const val SYS_OPEN_BY_HANDLE_AT: Int = 265
public const val SYS_OPEN: Int = 1024
public const val SYS_PAUSE: Int = 1061
public const val SYS_PERF_EVENT_OPEN: Int = 241
public const val SYS_PERSONALITY: Int = 92
public const val SYS_PIPE2: Int = 59
public const val SYS_PIPE: Int = 1040
public const val SYS_PIVOT_ROOT: Int = 41
public const val SYS_POLL: Int = 1068
public const val SYS_PPOLL: Int = 73
public const val SYS_PRCTL: Int = 167
public const val SYS_PREAD64: Int = 67
public const val SYS_PREADV: Int = 69
public const val SYS_PRLIMIT64: Int = 261
public const val SYS_PROCESS_VM_READV: Int = 270
public const val SYS_PROCESS_VM_WRITEV: Int = 271
public const val SYS_PSELECT6: Int = 72
public const val SYS_PTRACE: Int = 117
public const val SYS_PWRITE64: Int = 68
public const val SYS_PWRITEV: Int = 70
public const val SYS_QUOTACTL: Int = 60
public const val SYS_READAHEAD: Int = 213
public const val SYS_READ: Int = 63
public const val SYS_READLINKAT: Int = 78
public const val SYS_READLINK: Int = 1035
public const val SYS_READV: Int = 65
public const val SYS_REBOOT: Int = 142
public const val SYS_RECV: Int = 1073
public const val SYS_RECVFROM: Int = 207
public const val SYS_RECVMMSG: Int = 243
public const val SYS_RECVMSG: Int = 212
public const val SYS_REMAP_FILE_PAGES: Int = 234
public const val SYS_REMOVEXATTR: Int = 14
public const val SYS_RENAMEAT2: Int = 276
public const val SYS_RENAMEAT: Int = 38
public const val SYS_RENAME: Int = 1034
public const val SYS_REQUEST_KEY: Int = 218
public const val SYS_RESTART_SYSCALL: Int = 128
public const val SYS_RMDIR: Int = 1031
public const val SYS_RT_SIGACTION: Int = 134
public const val SYS_RT_SIGPENDING: Int = 136
public const val SYS_RT_SIGPROCMASK: Int = 135
public const val SYS_RT_SIGQUEUEINFO: Int = 138
public const val SYS_RT_SIGRETURN: Int = 139
public const val SYS_RT_SIGSUSPEND: Int = 133
public const val SYS_RT_SIGTIMEDWAIT: Int = 137
public const val SYS_RT_TGSIGQUEUEINFO: Int = 240
public const val SYS_SCHED_GETAFFINITY: Int = 123
public const val SYS_SCHED_GETATTR: Int = 275
public const val SYS_SCHED_GETPARAM: Int = 121
public const val SYS_SCHED_GET_PRIORITY_MAX: Int = 125
public const val SYS_SCHED_GET_PRIORITY_MIN: Int = 126
public const val SYS_SCHED_GETSCHEDULER: Int = 120
public const val SYS_SCHED_RR_GET_INTERVAL: Int = 127
public const val SYS_SCHED_SETAFFINITY: Int = 122
public const val SYS_SCHED_SETATTR: Int = 274
public const val SYS_SCHED_SETPARAM: Int = 118
public const val SYS_SCHED_SETSCHEDULER: Int = 119
public const val SYS_SCHED_YIELD: Int = 124
public const val SYS_SECCOMP: Int = 277
public const val SYS_SELECT: Int = 1067
public const val SYS_SEMCTL: Int = 191
public const val SYS_SEMGET: Int = 190
public const val SYS_SEMOP: Int = 193
public const val SYS_SEMTIMEDOP: Int = 192
public const val SYS_SEND: Int = 1074
public const val SYS_SENDFILE64: Int = 71
public const val SYS_SENDFILE: Int = 71
public const val SYS_SENDMMSG: Int = 269
public const val SYS_SENDMSG: Int = 211
public const val SYS_SENDTO: Int = 206
public const val SYS_SETDOMAINNAME: Int = 162
public const val SYS_SETFSGID: Int = 152
public const val SYS_SETFSUID: Int = 151
public const val SYS_SETGID: Int = 144
public const val SYS_SETGROUPS: Int = 159
public const val SYS_SETHOSTNAME: Int = 161
public const val SYS_SETITIMER: Int = 103
public const val SYS_SET_MEMPOLICY: Int = 237
public const val SYS_SETNS: Int = 268
public const val SYS_SETPGID: Int = 154
public const val SYS_SETPRIORITY: Int = 140
public const val SYS_SETREGID: Int = 143
public const val SYS_SETRESGID: Int = 149
public const val SYS_SETRESUID: Int = 147
public const val SYS_SETREUID: Int = 145
public const val SYS_SETRLIMIT: Int = 164
public const val SYS_SET_ROBUST_LIST: Int = 99
public const val SYS_SETSID: Int = 157
public const val SYS_SETSOCKOPT: Int = 208
public const val SYS_SET_TID_ADDRESS: Int = 96
public const val SYS_SETTIMEOFDAY: Int = 170
public const val SYS_SETUID: Int = 146
public const val SYS_SETXATTR: Int = 5
public const val SYS_SHMAT: Int = 196
public const val SYS_SHMCTL: Int = 195
public const val SYS_SHMDT: Int = 197
public const val SYS_SHMGET: Int = 194
public const val SYS_SHUTDOWN: Int = 210
public const val SYS_SIGALTSTACK: Int = 132
public const val SYS_SIGNALFD4: Int = 74
public const val SYS_SIGNALFD: Int = 1045
public const val SYS_SOCKET: Int = 198
public const val SYS_SOCKETPAIR: Int = 199
public const val SYS_SPLICE: Int = 76
public const val SYS_STAT64: Int = 1038
public const val SYS_STAT: Int = 1038
public const val SYS_STATFS64: Int = 43
public const val SYS_SWAPOFF: Int = 225
public const val SYS_SWAPON: Int = 224
public const val SYS_SYMLINKAT: Int = 36
public const val SYS_SYMLINK: Int = 1036
public const val SYS_SYNC: Int = 81
public const val SYS_SYNC_FILE_RANGE2: Int = 84
public const val SYS_SYNC_FILE_RANGE: Int = 84
public const val SYS_SYNCFS: Int = 267
public const val SYS_SYSCALLS: Int = 1080
public const val SYS__SYSCTL: Int = 1078
public const val SYS_SYSINFO: Int = 179
public const val SYS_SYSLOG: Int = 116
public const val SYS_TEE: Int = 77
public const val SYS_TGKILL: Int = 131
public const val SYS_TIME: Int = 1062
public const val SYS_TIMER_CREATE: Int = 107
public const val SYS_TIMER_DELETE: Int = 111
public const val SYS_TIMERFD_CREATE: Int = 85
public const val SYS_TIMERFD_GETTIME: Int = 87
public const val SYS_TIMERFD_SETTIME: Int = 86
public const val SYS_TIMER_GETOVERRUN: Int = 109
public const val SYS_TIMER_GETTIME: Int = 108
public const val SYS_TIMER_SETTIME: Int = 110
public const val SYS_TIMES: Int = 153
public const val SYS_TKILL: Int = 130
public const val SYS_TRUNCATE64: Int = 45
public const val SYS_TRUNCATE: Int = 45
public const val SYS_UMASK: Int = 166
public const val SYS_UMOUNT2: Int = 39
public const val SYS_UMOUNT: Int = 1076
public const val SYS_UNAME: Int = 160
public const val SYS_UNLINKAT: Int = 35
public const val SYS_UNLINK: Int = 1026
public const val SYS_UNSHARE: Int = 97
public const val SYS_USELIB: Int = 1077
public const val SYS_USTAT: Int = 1070
public const val SYS_UTIME: Int = 1063
public const val SYS_UTIMENSAT: Int = 88
public const val SYS_UTIMES: Int = 1037
public const val SYS_VFORK: Int = 1071
public const val SYS_VHANGUP: Int = 58
public const val SYS_VMSPLICE: Int = 75
public const val SYS_WAIT4: Int = 260
public const val SYS_WAITID: Int = 95
public const val SYS_WRITE: Int = 64
public const val SYS_WRITEV: Int = 66
public const val SYS_STATX: Int = 291
public const val SYS_PIDFD_SEND_SIGNAL: Long = 424
public const val SYS_IO_URING_SETUP: Long = 425
public const val SYS_IO_URING_ENTER: Long = 426
public const val SYS_IO_URING_REGISTER: Long = 427
public const val SYS_OPEN_TREE: Long = 428
public const val SYS_MOVE_MOUNT: Long = 429
public const val SYS_FSOPEN: Long = 430
public const val SYS_FSCONFIG: Long = 431
public const val SYS_FSMOUNT: Long = 432
public const val SYS_FSPICK: Long = 433
public const val SYS_PIDFD_OPEN: Long = 434
public const val SYS_CLONE3: Long = 435
public const val SYS_CLOSE_RANGE: Long = 436
public const val SYS_OPENAT2: Long = 437
public const val SYS_PIDFD_GETFD: Long = 438
public const val SYS_FACCESSAT2: Long = 439
public const val SYS_PROCESS_MADVISE: Long = 440
public const val SYS_EPOLL_PWAIT2: Long = 441
public const val SYS_MOUNT_SETATTR: Long = 442
public const val TIOCM_LOOP: Int = 32768
public const val TIOCM_OUT1: Int = 8192
public const val TIOCM_OUT2: Int = 16384
public const val TIOCSER_TEMT: Int = 1
public const val TOSTOP: Int = 256
public const val VEOF: Int = 4
public const val VEOL2: Int = 16
public const val VEOL: Int = 11
public const val VMIN: Int = 6
