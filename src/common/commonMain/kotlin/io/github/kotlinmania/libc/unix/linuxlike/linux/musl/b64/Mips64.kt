// port-lint: source unix/linux_like/linux/musl/b64/mips64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*

public typealias WcharT = Int
public typealias U64 = ULong
public typealias S64 = Long
public typealias NlinkT = UInt
public typealias BlksizeT = Long
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
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stBlksize: Long,
    val stBlocks: Long,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: Int,
)

public data class IpcPerm(
    val key: Int,
    val ipcPermKey: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: Int,
)

public data class Statfs(
    val fType: ULong,
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fBavail: ULong,
    val fFsid: ULong,
    val fNamelen: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)

public data class Statfs64(
    val fType: ULong,
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fBavail: ULong,
    val fFsid: ULong,
    val fNamelen: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)

public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val SYS_READ: Long = 5000 + 0
public const val SYS_WRITE: Long = 5000 + 1
public const val SYS_OPEN: Long = 5000 + 2
public const val SYS_CLOSE: Long = 5000 + 3
public const val SYS_STAT: Long = 5000 + 4
public const val SYS_FSTAT: Long = 5000 + 5
public const val SYS_LSTAT: Long = 5000 + 6
public const val SYS_POLL: Long = 5000 + 7
public const val SYS_LSEEK: Long = 5000 + 8
public const val SYS_MMAP: Long = 5000 + 9
public const val SYS_MPROTECT: Long = 5000 + 10
public const val SYS_MUNMAP: Long = 5000 + 11
public const val SYS_BRK: Long = 5000 + 12
public const val SYS_RT_SIGACTION: Long = 5000 + 13
public const val SYS_RT_SIGPROCMASK: Long = 5000 + 14
public const val SYS_IOCTL: Long = 5000 + 15
public const val SYS_PREAD64: Long = 5000 + 16
public const val SYS_PWRITE64: Long = 5000 + 17
public const val SYS_READV: Long = 5000 + 18
public const val SYS_WRITEV: Long = 5000 + 19
public const val SYS_ACCESS: Long = 5000 + 20
public const val SYS_PIPE: Long = 5000 + 21
public const val SYS__NEWSELECT: Long = 5000 + 22
public const val SYS_SCHED_YIELD: Long = 5000 + 23
public const val SYS_MREMAP: Long = 5000 + 24
public const val SYS_MSYNC: Long = 5000 + 25
public const val SYS_MINCORE: Long = 5000 + 26
public const val SYS_MADVISE: Long = 5000 + 27
public const val SYS_SHMGET: Long = 5000 + 28
public const val SYS_SHMAT: Long = 5000 + 29
public const val SYS_SHMCTL: Long = 5000 + 30
public const val SYS_DUP: Long = 5000 + 31
public const val SYS_DUP2: Long = 5000 + 32
public const val SYS_PAUSE: Long = 5000 + 33
public const val SYS_NANOSLEEP: Long = 5000 + 34
public const val SYS_GETITIMER: Long = 5000 + 35
public const val SYS_SETITIMER: Long = 5000 + 36
public const val SYS_ALARM: Long = 5000 + 37
public const val SYS_GETPID: Long = 5000 + 38
public const val SYS_SENDFILE: Long = 5000 + 39
public const val SYS_SOCKET: Long = 5000 + 40
public const val SYS_CONNECT: Long = 5000 + 41
public const val SYS_ACCEPT: Long = 5000 + 42
public const val SYS_SENDTO: Long = 5000 + 43
public const val SYS_RECVFROM: Long = 5000 + 44
public const val SYS_SENDMSG: Long = 5000 + 45
public const val SYS_RECVMSG: Long = 5000 + 46
public const val SYS_SHUTDOWN: Long = 5000 + 47
public const val SYS_BIND: Long = 5000 + 48
public const val SYS_LISTEN: Long = 5000 + 49
public const val SYS_GETSOCKNAME: Long = 5000 + 50
public const val SYS_GETPEERNAME: Long = 5000 + 51
public const val SYS_SOCKETPAIR: Long = 5000 + 52
public const val SYS_SETSOCKOPT: Long = 5000 + 53
public const val SYS_GETSOCKOPT: Long = 5000 + 54
public const val SYS_CLONE: Long = 5000 + 55
public const val SYS_FORK: Long = 5000 + 56
public const val SYS_EXECVE: Long = 5000 + 57
public const val SYS_EXIT: Long = 5000 + 58
public const val SYS_WAIT4: Long = 5000 + 59
public const val SYS_KILL: Long = 5000 + 60
public const val SYS_UNAME: Long = 5000 + 61
public const val SYS_SEMGET: Long = 5000 + 62
public const val SYS_SEMOP: Long = 5000 + 63
public const val SYS_SEMCTL: Long = 5000 + 64
public const val SYS_SHMDT: Long = 5000 + 65
public const val SYS_MSGGET: Long = 5000 + 66
public const val SYS_MSGSND: Long = 5000 + 67
public const val SYS_MSGRCV: Long = 5000 + 68
public const val SYS_MSGCTL: Long = 5000 + 69
public const val SYS_FCNTL: Long = 5000 + 70
public const val SYS_FLOCK: Long = 5000 + 71
public const val SYS_FSYNC: Long = 5000 + 72
public const val SYS_FDATASYNC: Long = 5000 + 73
public const val SYS_TRUNCATE: Long = 5000 + 74
public const val SYS_FTRUNCATE: Long = 5000 + 75
public const val SYS_GETDENTS: Long = 5000 + 76
public const val SYS_GETCWD: Long = 5000 + 77
public const val SYS_CHDIR: Long = 5000 + 78
public const val SYS_FCHDIR: Long = 5000 + 79
public const val SYS_RENAME: Long = 5000 + 80
public const val SYS_MKDIR: Long = 5000 + 81
public const val SYS_RMDIR: Long = 5000 + 82
public const val SYS_CREAT: Long = 5000 + 83
public const val SYS_LINK: Long = 5000 + 84
public const val SYS_UNLINK: Long = 5000 + 85
public const val SYS_SYMLINK: Long = 5000 + 86
public const val SYS_READLINK: Long = 5000 + 87
public const val SYS_CHMOD: Long = 5000 + 88
public const val SYS_FCHMOD: Long = 5000 + 89
public const val SYS_CHOWN: Long = 5000 + 90
public const val SYS_FCHOWN: Long = 5000 + 91
public const val SYS_LCHOWN: Long = 5000 + 92
public const val SYS_UMASK: Long = 5000 + 93
public const val SYS_GETTIMEOFDAY: Long = 5000 + 94
public const val SYS_GETRLIMIT: Long = 5000 + 95
public const val SYS_GETRUSAGE: Long = 5000 + 96
public const val SYS_SYSINFO: Long = 5000 + 97
public const val SYS_TIMES: Long = 5000 + 98
public const val SYS_PTRACE: Long = 5000 + 99
public const val SYS_GETUID: Long = 5000 + 100
public const val SYS_SYSLOG: Long = 5000 + 101
public const val SYS_GETGID: Long = 5000 + 102
public const val SYS_SETUID: Long = 5000 + 103
public const val SYS_SETGID: Long = 5000 + 104
public const val SYS_GETEUID: Long = 5000 + 105
public const val SYS_GETEGID: Long = 5000 + 106
public const val SYS_SETPGID: Long = 5000 + 107
public const val SYS_GETPPID: Long = 5000 + 108
public const val SYS_GETPGRP: Long = 5000 + 109
public const val SYS_SETSID: Long = 5000 + 110
public const val SYS_SETREUID: Long = 5000 + 111
public const val SYS_SETREGID: Long = 5000 + 112
public const val SYS_GETGROUPS: Long = 5000 + 113
public const val SYS_SETGROUPS: Long = 5000 + 114
public const val SYS_SETRESUID: Long = 5000 + 115
public const val SYS_GETRESUID: Long = 5000 + 116
public const val SYS_SETRESGID: Long = 5000 + 117
public const val SYS_GETRESGID: Long = 5000 + 118
public const val SYS_GETPGID: Long = 5000 + 119
public const val SYS_SETFSUID: Long = 5000 + 120
public const val SYS_SETFSGID: Long = 5000 + 121
public const val SYS_GETSID: Long = 5000 + 122
public const val SYS_CAPGET: Long = 5000 + 123
public const val SYS_CAPSET: Long = 5000 + 124
public const val SYS_RT_SIGPENDING: Long = 5000 + 125
public const val SYS_RT_SIGTIMEDWAIT: Long = 5000 + 126
public const val SYS_RT_SIGQUEUEINFO: Long = 5000 + 127
public const val SYS_RT_SIGSUSPEND: Long = 5000 + 128
public const val SYS_SIGALTSTACK: Long = 5000 + 129
public const val SYS_UTIME: Long = 5000 + 130
public const val SYS_MKNOD: Long = 5000 + 131
public const val SYS_PERSONALITY: Long = 5000 + 132
public const val SYS_USTAT: Long = 5000 + 133
public const val SYS_STATFS: Long = 5000 + 134
public const val SYS_FSTATFS: Long = 5000 + 135
public const val SYS_SYSFS: Long = 5000 + 136
public const val SYS_GETPRIORITY: Long = 5000 + 137
public const val SYS_SETPRIORITY: Long = 5000 + 138
public const val SYS_SCHED_SETPARAM: Long = 5000 + 139
public const val SYS_SCHED_GETPARAM: Long = 5000 + 140
public const val SYS_SCHED_SETSCHEDULER: Long = 5000 + 141
public const val SYS_SCHED_GETSCHEDULER: Long = 5000 + 142
public const val SYS_SCHED_GET_PRIORITY_MAX: Long = 5000 + 143
public const val SYS_SCHED_GET_PRIORITY_MIN: Long = 5000 + 144
public const val SYS_SCHED_RR_GET_INTERVAL: Long = 5000 + 145
public const val SYS_MLOCK: Long = 5000 + 146
public const val SYS_MUNLOCK: Long = 5000 + 147
public const val SYS_MLOCKALL: Long = 5000 + 148
public const val SYS_MUNLOCKALL: Long = 5000 + 149
public const val SYS_VHANGUP: Long = 5000 + 150
public const val SYS_PIVOT_ROOT: Long = 5000 + 151
public const val SYS__SYSCTL: Long = 5000 + 152
public const val SYS_PRCTL: Long = 5000 + 153
public const val SYS_ADJTIMEX: Long = 5000 + 154
public const val SYS_SETRLIMIT: Long = 5000 + 155
public const val SYS_CHROOT: Long = 5000 + 156
public const val SYS_SYNC: Long = 5000 + 157
public const val SYS_ACCT: Long = 5000 + 158
public const val SYS_SETTIMEOFDAY: Long = 5000 + 159
public const val SYS_MOUNT: Long = 5000 + 160
public const val SYS_UMOUNT2: Long = 5000 + 161
public const val SYS_SWAPON: Long = 5000 + 162
public const val SYS_SWAPOFF: Long = 5000 + 163
public const val SYS_REBOOT: Long = 5000 + 164
public const val SYS_SETHOSTNAME: Long = 5000 + 165
public const val SYS_SETDOMAINNAME: Long = 5000 + 166
public const val SYS_CREATE_MODULE: Long = 5000 + 167
public const val SYS_INIT_MODULE: Long = 5000 + 168
public const val SYS_DELETE_MODULE: Long = 5000 + 169
public const val SYS_GET_KERNEL_SYMS: Long = 5000 + 170
public const val SYS_QUERY_MODULE: Long = 5000 + 171
public const val SYS_QUOTACTL: Long = 5000 + 172
public const val SYS_NFSSERVCTL: Long = 5000 + 173
public const val SYS_GETPMSG: Long = 5000 + 174
public const val SYS_PUTPMSG: Long = 5000 + 175
public const val SYS_AFS_SYSCALL: Long = 5000 + 176
public const val SYS_GETTID: Long = 5000 + 178
public const val SYS_READAHEAD: Long = 5000 + 179
public const val SYS_SETXATTR: Long = 5000 + 180
public const val SYS_LSETXATTR: Long = 5000 + 181
public const val SYS_FSETXATTR: Long = 5000 + 182
public const val SYS_GETXATTR: Long = 5000 + 183
public const val SYS_LGETXATTR: Long = 5000 + 184
public const val SYS_FGETXATTR: Long = 5000 + 185
public const val SYS_LISTXATTR: Long = 5000 + 186
public const val SYS_LLISTXATTR: Long = 5000 + 187
public const val SYS_FLISTXATTR: Long = 5000 + 188
public const val SYS_REMOVEXATTR: Long = 5000 + 189
public const val SYS_LREMOVEXATTR: Long = 5000 + 190
public const val SYS_FREMOVEXATTR: Long = 5000 + 191
public const val SYS_TKILL: Long = 5000 + 192
public const val SYS_FUTEX: Long = 5000 + 194
public const val SYS_SCHED_SETAFFINITY: Long = 5000 + 195
public const val SYS_SCHED_GETAFFINITY: Long = 5000 + 196
public const val SYS_CACHEFLUSH: Long = 5000 + 197
public const val SYS_CACHECTL: Long = 5000 + 198
public const val SYS_SYSMIPS: Long = 5000 + 199
public const val SYS_IO_SETUP: Long = 5000 + 200
public const val SYS_IO_DESTROY: Long = 5000 + 201
public const val SYS_IO_GETEVENTS: Long = 5000 + 202
public const val SYS_IO_SUBMIT: Long = 5000 + 203
public const val SYS_IO_CANCEL: Long = 5000 + 204
public const val SYS_EXIT_GROUP: Long = 5000 + 205
public const val SYS_LOOKUP_DCOOKIE: Long = 5000 + 206
public const val SYS_EPOLL_CREATE: Long = 5000 + 207
public const val SYS_EPOLL_CTL: Long = 5000 + 208
public const val SYS_EPOLL_WAIT: Long = 5000 + 209
public const val SYS_REMAP_FILE_PAGES: Long = 5000 + 210
public const val SYS_RT_SIGRETURN: Long = 5000 + 211
public const val SYS_SET_TID_ADDRESS: Long = 5000 + 212
public const val SYS_RESTART_SYSCALL: Long = 5000 + 213
public const val SYS_SEMTIMEDOP: Long = 5000 + 214
public const val SYS_FADVISE64: Long = 5000 + 215
public const val SYS_TIMER_CREATE: Long = 5000 + 216
public const val SYS_TIMER_SETTIME: Long = 5000 + 217
public const val SYS_TIMER_GETTIME: Long = 5000 + 218
public const val SYS_TIMER_GETOVERRUN: Long = 5000 + 219
public const val SYS_TIMER_DELETE: Long = 5000 + 220
public const val SYS_CLOCK_SETTIME: Long = 5000 + 221
public const val SYS_CLOCK_GETTIME: Long = 5000 + 222
public const val SYS_CLOCK_GETRES: Long = 5000 + 223
public const val SYS_CLOCK_NANOSLEEP: Long = 5000 + 224
public const val SYS_TGKILL: Long = 5000 + 225
public const val SYS_UTIMES: Long = 5000 + 226
public const val SYS_MBIND: Long = 5000 + 227
public const val SYS_GET_MEMPOLICY: Long = 5000 + 228
public const val SYS_SET_MEMPOLICY: Long = 5000 + 229
public const val SYS_MQ_OPEN: Long = 5000 + 230
public const val SYS_MQ_UNLINK: Long = 5000 + 231
public const val SYS_MQ_TIMEDSEND: Long = 5000 + 232
public const val SYS_MQ_TIMEDRECEIVE: Long = 5000 + 233
public const val SYS_MQ_NOTIFY: Long = 5000 + 234
public const val SYS_MQ_GETSETATTR: Long = 5000 + 235
public const val SYS_VSERVER: Long = 5000 + 236
public const val SYS_WAITID: Long = 5000 + 237
public const val SYS_SYS_SETALTROOT: Long = 5000 + 238
public const val SYS_ADD_KEY: Long = 5000 + 239
public const val SYS_REQUEST_KEY: Long = 5000 + 240
public const val SYS_KEYCTL: Long = 5000 + 241
public const val SYS_SET_THREAD_AREA: Long = 5000 + 242
public const val SYS_INOTIFY_INIT: Long = 5000 + 243
public const val SYS_INOTIFY_ADD_WATCH: Long = 5000 + 244
public const val SYS_INOTIFY_RM_WATCH: Long = 5000 + 245
public const val SYS_MIGRATE_PAGES: Long = 5000 + 246
public const val SYS_OPENAT: Long = 5000 + 247
public const val SYS_MKDIRAT: Long = 5000 + 248
public const val SYS_MKNODAT: Long = 5000 + 249
public const val SYS_FCHOWNAT: Long = 5000 + 250
public const val SYS_FUTIMESAT: Long = 5000 + 251
public const val SYS_NEWFSTATAT: Long = 5000 + 252
public const val SYS_UNLINKAT: Long = 5000 + 253
public const val SYS_RENAMEAT: Long = 5000 + 254
public const val SYS_LINKAT: Long = 5000 + 255
public const val SYS_SYMLINKAT: Long = 5000 + 256
public const val SYS_READLINKAT: Long = 5000 + 257
public const val SYS_FCHMODAT: Long = 5000 + 258
public const val SYS_FACCESSAT: Long = 5000 + 259
public const val SYS_PSELECT6: Long = 5000 + 260
public const val SYS_PPOLL: Long = 5000 + 261
public const val SYS_UNSHARE: Long = 5000 + 262
public const val SYS_SPLICE: Long = 5000 + 263
public const val SYS_SYNC_FILE_RANGE: Long = 5000 + 264
public const val SYS_TEE: Long = 5000 + 265
public const val SYS_VMSPLICE: Long = 5000 + 266
public const val SYS_MOVE_PAGES: Long = 5000 + 267
public const val SYS_SET_ROBUST_LIST: Long = 5000 + 268
public const val SYS_GET_ROBUST_LIST: Long = 5000 + 269
public const val SYS_KEXEC_LOAD: Long = 5000 + 270
public const val SYS_GETCPU: Long = 5000 + 271
public const val SYS_EPOLL_PWAIT: Long = 5000 + 272
public const val SYS_IOPRIO_SET: Long = 5000 + 273
public const val SYS_IOPRIO_GET: Long = 5000 + 274
public const val SYS_UTIMENSAT: Long = 5000 + 275
public const val SYS_SIGNALFD: Long = 5000 + 276
public const val SYS_TIMERFD: Long = 5000 + 277
public const val SYS_EVENTFD: Long = 5000 + 278
public const val SYS_FALLOCATE: Long = 5000 + 279
public const val SYS_TIMERFD_CREATE: Long = 5000 + 280
public const val SYS_TIMERFD_GETTIME: Long = 5000 + 281
public const val SYS_TIMERFD_SETTIME: Long = 5000 + 282
public const val SYS_SIGNALFD4: Long = 5000 + 283
public const val SYS_EVENTFD2: Long = 5000 + 284
public const val SYS_EPOLL_CREATE1: Long = 5000 + 285
public const val SYS_DUP3: Long = 5000 + 286
public const val SYS_PIPE2: Long = 5000 + 287
public const val SYS_INOTIFY_INIT1: Long = 5000 + 288
public const val SYS_PREADV: Long = 5000 + 289
public const val SYS_PWRITEV: Long = 5000 + 290
public const val SYS_RT_TGSIGQUEUEINFO: Long = 5000 + 291
public const val SYS_PERF_EVENT_OPEN: Long = 5000 + 292
public const val SYS_ACCEPT4: Long = 5000 + 293
public const val SYS_RECVMMSG: Long = 5000 + 294
public const val SYS_FANOTIFY_INIT: Long = 5000 + 295
public const val SYS_FANOTIFY_MARK: Long = 5000 + 296
public const val SYS_PRLIMIT64: Long = 5000 + 297
public const val SYS_NAME_TO_HANDLE_AT: Long = 5000 + 298
public const val SYS_OPEN_BY_HANDLE_AT: Long = 5000 + 299
public const val SYS_CLOCK_ADJTIME: Long = 5000 + 300
public const val SYS_SYNCFS: Long = 5000 + 301
public const val SYS_SENDMMSG: Long = 5000 + 302
public const val SYS_SETNS: Long = 5000 + 303
public const val SYS_PROCESS_VM_READV: Long = 5000 + 304
public const val SYS_PROCESS_VM_WRITEV: Long = 5000 + 305
public const val SYS_KCMP: Long = 5000 + 306
public const val SYS_FINIT_MODULE: Long = 5000 + 307
public const val SYS_GETDENTS64: Long = 5000 + 308
public const val SYS_SCHED_SETATTR: Long = 5000 + 309
public const val SYS_SCHED_GETATTR: Long = 5000 + 310
public const val SYS_RENAMEAT2: Long = 5000 + 311
public const val SYS_SECCOMP: Long = 5000 + 312
public const val SYS_GETRANDOM: Long = 5000 + 313
public const val SYS_MEMFD_CREATE: Long = 5000 + 314
public const val SYS_BPF: Long = 5000 + 315
public const val SYS_EXECVEAT: Long = 5000 + 316
public const val SYS_USERFAULTFD: Long = 5000 + 317
public const val SYS_MEMBARRIER: Long = 5000 + 318
public const val SYS_MLOCK2: Long = 5000 + 319
public const val SYS_COPY_FILE_RANGE: Long = 5000 + 320
public const val SYS_PREADV2: Long = 5000 + 321
public const val SYS_PWRITEV2: Long = 5000 + 322
public const val SYS_PKEY_MPROTECT: Long = 5000 + 323
public const val SYS_PKEY_ALLOC: Long = 5000 + 324
public const val SYS_PKEY_FREE: Long = 5000 + 325
public const val SYS_STATX: Long = 5000 + 326
public const val SYS_PIDFD_SEND_SIGNAL: Long = 5000 + 424
public const val SYS_IO_URING_SETUP: Long = 5000 + 425
public const val SYS_IO_URING_ENTER: Long = 5000 + 426
public const val SYS_IO_URING_REGISTER: Long = 5000 + 427
public const val SYS_OPEN_TREE: Long = 5000 + 428
public const val SYS_MOVE_MOUNT: Long = 5000 + 429
public const val SYS_FSOPEN: Long = 5000 + 430
public const val SYS_FSCONFIG: Long = 5000 + 431
public const val SYS_FSMOUNT: Long = 5000 + 432
public const val SYS_FSPICK: Long = 5000 + 433
public const val SYS_PIDFD_OPEN: Long = 5000 + 434
public const val SYS_CLONE3: Long = 5000 + 435
public const val SYS_CLOSE_RANGE: Long = 5000 + 436
public const val SYS_OPENAT2: Long = 5000 + 437
public const val SYS_PIDFD_GETFD: Long = 5000 + 438
public const val SYS_FACCESSAT2: Long = 5000 + 439
public const val SYS_PROCESS_MADVISE: Long = 5000 + 440
public const val SYS_EPOLL_PWAIT2: Long = 5000 + 441
public const val SYS_MOUNT_SETATTR: Long = 5000 + 442
public const val SYS_QUOTACTL_FD: Long = 5000 + 443
public const val SYS_LANDLOCK_CREATE_RULESET: Long = 5000 + 444
public const val SYS_LANDLOCK_ADD_RULE: Long = 5000 + 445
public const val SYS_LANDLOCK_RESTRICT_SELF: Long = 5000 + 446
public const val SYS_MEMFD_SECRET: Long = 5000 + 447
public const val SYS_PROCESS_MRELEASE: Long = 5000 + 448
public const val SYS_FUTEX_WAITV: Long = 5000 + 449
public const val SYS_SET_MEMPOLICY_HOME_NODE: Long = 5000 + 450
public const val O_DIRECT: Int = 0x8000
public const val O_DIRECTORY: Int = 0x10000
public const val O_NOFOLLOW: Int = 0x20000
public const val O_APPEND: Int = 8
public const val O_CREAT: Int = 256
public const val O_EXCL: Int = 1024
public const val O_NOCTTY: Int = 2048
public const val O_NONBLOCK: Int = 128
public const val O_SYNC: Int = 0x4010
public const val O_RSYNC: Int = 0x4010
public const val O_DSYNC: Int = 0x10
public const val O_ASYNC: Int = 0x1000
public const val O_LARGEFILE: Int = 0x2000
public const val EDEADLK: Int = 45
public const val ENAMETOOLONG: Int = 78
public const val ENOLCK: Int = 46
public const val ENOSYS: Int = 89
public const val ENOTEMPTY: Int = 93
public const val ELOOP: Int = 90
public const val ENOMSG: Int = 35
public const val EIDRM: Int = 36
public const val ECHRNG: Int = 37
public const val EL2NSYNC: Int = 38
public const val EL3HLT: Int = 39
public const val EL3RST: Int = 40
public const val ELNRNG: Int = 41
public const val EUNATCH: Int = 42
public const val ENOCSI: Int = 43
public const val EL2HLT: Int = 44
public const val EBADE: Int = 50
public const val EBADR: Int = 51
public const val EXFULL: Int = 52
public const val ENOANO: Int = 53
public const val EBADRQC: Int = 54
public const val EBADSLT: Int = 55
public const val EDEADLOCK: Int = 56
public const val EMULTIHOP: Int = 74
public const val EOVERFLOW: Int = 79
public const val ENOTUNIQ: Int = 80
public const val EBADFD: Int = 81
public const val EBADMSG: Int = 77
public const val EREMCHG: Int = 82
public const val ELIBACC: Int = 83
public const val ELIBBAD: Int = 84
public const val ELIBSCN: Int = 85
public const val ELIBMAX: Int = 86
public const val ELIBEXEC: Int = 87
public const val EILSEQ: Int = 88
public const val ERESTART: Int = 91
public const val ESTRPIPE: Int = 92
public const val EUSERS: Int = 94
public const val ENOTSOCK: Int = 95
public const val EDESTADDRREQ: Int = 96
public const val EMSGSIZE: Int = 97
public const val EPROTOTYPE: Int = 98
public const val ENOPROTOOPT: Int = 99
public const val EPROTONOSUPPORT: Int = 120
public const val ESOCKTNOSUPPORT: Int = 121
public const val EOPNOTSUPP: Int = 122
public const val ENOTSUP: Int = EOPNOTSUPP
public const val EPFNOSUPPORT: Int = 123
public const val EAFNOSUPPORT: Int = 124
public const val EADDRINUSE: Int = 125
public const val EADDRNOTAVAIL: Int = 126
public const val ENETDOWN: Int = 127
public const val ENETUNREACH: Int = 128
public const val ENETRESET: Int = 129
public const val ECONNABORTED: Int = 130
public const val ECONNRESET: Int = 131
public const val ENOBUFS: Int = 132
public const val EISCONN: Int = 133
public const val ENOTCONN: Int = 134
public const val ESHUTDOWN: Int = 143
public const val ETOOMANYREFS: Int = 144
public const val ETIMEDOUT: Int = 145
public const val ECONNREFUSED: Int = 146
public const val EHOSTDOWN: Int = 147
public const val EHOSTUNREACH: Int = 148
public const val EALREADY: Int = 149
public const val EINPROGRESS: Int = 150
public const val ESTALE: Int = 151
public const val EUCLEAN: Int = 135
public const val ENOTNAM: Int = 137
public const val ENAVAIL: Int = 138
public const val EISNAM: Int = 139
public const val EREMOTEIO: Int = 140
public const val EDQUOT: Int = 1133
public const val ENOMEDIUM: Int = 159
public const val EMEDIUMTYPE: Int = 160
public const val ECANCELED: Int = 158
public const val ENOKEY: Int = 161
public const val EKEYEXPIRED: Int = 162
public const val EKEYREVOKED: Int = 163
public const val EKEYREJECTED: Int = 164
public const val EOWNERDEAD: Int = 165
public const val ENOTRECOVERABLE: Int = 166
public const val ERFKILL: Int = 167
public const val MAP_ANON: Int = 0x800
public const val MAP_GROWSDOWN: Int = 0x1000
public const val MAP_DENYWRITE: Int = 0x2000
public const val MAP_EXECUTABLE: Int = 0x4000
public const val MAP_LOCKED: Int = 0x8000
public const val MAP_NORESERVE: Int = 0x400
public const val MAP_POPULATE: Int = 0x10000
public const val MAP_NONBLOCK: Int = 0x20000
public const val MAP_STACK: Int = 0x40000
public const val MAP_HUGETLB: Int = 0x080000
public const val SA_ONSTACK: Int = 0x08000000
public const val SA_SIGINFO: Int = 0x00000008
public const val SA_NOCLDWAIT: Int = 0x00010000
public const val SIGEMT: Int = 7
public const val SIGCHLD: Int = 18
public const val SIGBUS: Int = 10
public const val SIGTTIN: Int = 26
public const val SIGTTOU: Int = 27
public const val SIGXCPU: Int = 30
public const val SIGXFSZ: Int = 31
public const val SIGVTALRM: Int = 28
public const val SIGPROF: Int = 29
public const val SIGWINCH: Int = 20
public const val SIGUSR1: Int = 16
public const val SIGUSR2: Int = 17
public const val SIGCONT: Int = 25
public const val SIGSTOP: Int = 23
public const val SIGTSTP: Int = 24
public const val SIGURG: Int = 21
public const val SIGIO: Int = 22
public const val SIGSYS: Int = 12
public const val SIGPOLL: Int = 22
public const val SIGPWR: Int = 19
public const val SIG_SETMASK: Int = 3
public const val SIG_BLOCK: Int = 0x1
public const val SIG_UNBLOCK: Int = 0x2
public const val POLLWRNORM: Short = 0x004
public const val POLLWRBAND: Short = 0x100
public const val VEOF: ULong = 16uL
public const val VEOL: ULong = 17uL
public const val VEOL2: ULong = 6uL
public const val VMIN: ULong = 4uL
public const val IEXTEN: UInt = 0x00000100u
public const val TOSTOP: UInt = 0x00008000u
public const val FLUSHO: UInt = 0x00002000u
public const val EXTPROC: UInt = 65536u
public const val F_GETLK: Int = 14
public const val F_GETOWN: Int = 23
public const val F_SETOWN: Int = 24
public const val F_SETLK: Int = 6
public const val F_SETLKW: Int = 7
public const val MCL_CURRENT: Int = 0x0001
public const val MCL_FUTURE: Int = 0x0002
public const val MCL_ONFAULT: Int = 0x0004
public const val CBAUD: UInt = 4111u
public const val TAB1: UInt = 0x00000800u
public const val TAB2: UInt = 0x00001000u
public const val TAB3: UInt = 0x00001800u
public const val CR1: UInt = 0x00000200u
public const val CR2: UInt = 0x00000400u
public const val CR3: UInt = 0x00000600u
public const val FF1: UInt = 0x00008000u
public const val BS1: UInt = 0x00002000u
public const val VT1: UInt = 0x00004000u
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IXON: UInt = 0x00000400u
public const val IXOFF: UInt = 0x00001000u
public const val ONLCR: UInt = 0x4u
public const val CSIZE: UInt = 0x00000030u
public const val CS6: UInt = 0x00000010u
public const val CS7: UInt = 0x00000020u
public const val CS8: UInt = 0x00000030u
public const val CSTOPB: UInt = 0x00000040u
public const val CREAD: UInt = 0x00000080u
public const val PARENB: UInt = 0x00000100u
public const val PARODD: UInt = 0x00000200u
public const val HUPCL: UInt = 0x00000400u
public const val CLOCAL: UInt = 0x00000800u
public const val ECHOKE: UInt = 0x00000800u
public const val ECHOE: UInt = 0x00000010u
public const val ECHOK: UInt = 0x00000020u
public const val ECHONL: UInt = 0x00000040u
public const val ECHOPRT: UInt = 0x00000400u
public const val ECHOCTL: UInt = 0x00000200u
public const val ISIG: UInt = 0x00000001u
public const val ICANON: UInt = 0x00000002u
public const val PENDIN: UInt = 0x00004000u
public const val NOFLSH: UInt = 0x00000080u
public const val CIBAUD: UInt = 269418496u
public const val CBAUDEX: UInt = 4096u
public const val VSWTC: ULong = 7uL
public const val OLCUC: UInt = 2u
public const val NLDLY: UInt = 256u
public const val CRDLY: UInt = 1536u
public const val TABDLY: UInt = 6144u
public const val BSDLY: UInt = 8192u
public const val FFDLY: UInt = 32768u
public const val VTDLY: UInt = 16384u
public const val XTABS: UInt = 6144u
public const val B57600: UInt = 4097u
public const val B115200: UInt = 4098u
public const val B230400: UInt = 4099u
public const val B460800: UInt = 4100u
public const val B500000: UInt = 4101u
public const val B576000: UInt = 4102u
public const val B921600: UInt = 4103u
public const val B1000000: UInt = 4104u
public const val B1152000: UInt = 4105u
public const val B1500000: UInt = 4106u
public const val B2000000: UInt = 4107u
public const val B2500000: UInt = 4108u
public const val B3000000: UInt = 4109u
public const val B3500000: UInt = 4110u
public const val B4000000: UInt = 4111u
public const val EHWPOISON: Int = 168
