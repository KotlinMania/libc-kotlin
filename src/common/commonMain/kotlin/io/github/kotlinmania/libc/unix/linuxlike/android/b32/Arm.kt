// port-lint: source unix/linux_like/android/b32/arm.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT

public typealias WcharT = UInt
public typealias GregT = Int
public typealias McontextT = Sigcontext

public data class Sigcontext(
    val trapNo: ULong,
    val errorCode: ULong,
    val oldmask: ULong,
    val armR0: ULong,
    val armR1: ULong,
    val armR2: ULong,
    val armR3: ULong,
    val armR4: ULong,
    val armR5: ULong,
    val armR6: ULong,
    val armR7: ULong,
    val armR8: ULong,
    val armR9: ULong,
    val armR10: ULong,
    val armFp: ULong,
    val armIp: ULong,
    val armSp: ULong,
    val armLr: ULong,
    val armPc: ULong,
    val armCpsr: ULong,
    val faultAddress: ULong,
)

public data class CAnonymousUcSigmaskWithPadding(
    val ucSigmask: ULong,
)

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: io.github.kotlinmania.libc.unix.linuxlike.android.b32.Sigcontext,
    val ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    val align: LongArray,
    val ucRegspace: ULongArray,
)

// C union; only one variant is valid at a time.
public data class CAnonymousUcSigmask(
    val ucSigmask: CAnonymousUcSigmaskWithPadding? = null,
    val ucSigmask64: Sigset64T? = null,
)

public const val O_DIRECT: Int = 0x10000
public const val O_DIRECTORY: Int = 0x4000
public const val O_NOFOLLOW: Int = 0x8000
public const val O_LARGEFILE: Int = 131072
public const val SYS_RESTART_SYSCALL: Long = 0
public const val SYS_EXIT: Long = 1
public const val SYS_FORK: Long = 2
public const val SYS_READ: Long = 3
public const val SYS_WRITE: Long = 4
public const val SYS_OPEN: Long = 5
public const val SYS_CLOSE: Long = 6
public const val SYS_CREAT: Long = 8
public const val SYS_LINK: Long = 9
public const val SYS_UNLINK: Long = 10
public const val SYS_EXECVE: Long = 11
public const val SYS_CHDIR: Long = 12
public const val SYS_MKNOD: Long = 14
public const val SYS_CHMOD: Long = 15
public const val SYS_LCHOWN: Long = 16
public const val SYS_LSEEK: Long = 19
public const val SYS_GETPID: Long = 20
public const val SYS_MOUNT: Long = 21
public const val SYS_SETUID: Long = 23
public const val SYS_GETUID: Long = 24
public const val SYS_PTRACE: Long = 26
public const val SYS_PAUSE: Long = 29
public const val SYS_ACCESS: Long = 33
public const val SYS_NICE: Long = 34
public const val SYS_SYNC: Long = 36
public const val SYS_KILL: Long = 37
public const val SYS_RENAME: Long = 38
public const val SYS_MKDIR: Long = 39
public const val SYS_RMDIR: Long = 40
public const val SYS_DUP: Long = 41
public const val SYS_PIPE: Long = 42
public const val SYS_TIMES: Long = 43
public const val SYS_BRK: Long = 45
public const val SYS_SETGID: Long = 46
public const val SYS_GETGID: Long = 47
public const val SYS_GETEUID: Long = 49
public const val SYS_GETEGID: Long = 50
public const val SYS_ACCT: Long = 51
public const val SYS_UMOUNT2: Long = 52
public const val SYS_IOCTL: Long = 54
public const val SYS_FCNTL: Long = 55
public const val SYS_SETPGID: Long = 57
public const val SYS_UMASK: Long = 60
public const val SYS_CHROOT: Long = 61
public const val SYS_USTAT: Long = 62
public const val SYS_DUP2: Long = 63
public const val SYS_GETPPID: Long = 64
public const val SYS_GETPGRP: Long = 65
public const val SYS_SETSID: Long = 66
public const val SYS_SIGACTION: Long = 67
public const val SYS_SETREUID: Long = 70
public const val SYS_SETREGID: Long = 71
public const val SYS_SIGSUSPEND: Long = 72
public const val SYS_SIGPENDING: Long = 73
public const val SYS_SETHOSTNAME: Long = 74
public const val SYS_SETRLIMIT: Long = 75
public const val SYS_GETRUSAGE: Long = 77
public const val SYS_GETTIMEOFDAY: Long = 78
public const val SYS_SETTIMEOFDAY: Long = 79
public const val SYS_GETGROUPS: Long = 80
public const val SYS_SETGROUPS: Long = 81
public const val SYS_SYMLINK: Long = 83
public const val SYS_READLINK: Long = 85
public const val SYS_USELIB: Long = 86
public const val SYS_SWAPON: Long = 87
public const val SYS_REBOOT: Long = 88
public const val SYS_MUNMAP: Long = 91
public const val SYS_TRUNCATE: Long = 92
public const val SYS_FTRUNCATE: Long = 93
public const val SYS_FCHMOD: Long = 94
public const val SYS_FCHOWN: Long = 95
public const val SYS_GETPRIORITY: Long = 96
public const val SYS_SETPRIORITY: Long = 97
public const val SYS_STATFS: Long = 99
public const val SYS_FSTATFS: Long = 100
public const val SYS_SYSLOG: Long = 103
public const val SYS_SETITIMER: Long = 104
public const val SYS_GETITIMER: Long = 105
public const val SYS_STAT: Long = 106
public const val SYS_LSTAT: Long = 107
public const val SYS_FSTAT: Long = 108
public const val SYS_VHANGUP: Long = 111
public const val SYS_WAIT4: Long = 114
public const val SYS_SWAPOFF: Long = 115
public const val SYS_SYSINFO: Long = 116
public const val SYS_FSYNC: Long = 118
public const val SYS_SIGRETURN: Long = 119
public const val SYS_CLONE: Long = 120
public const val SYS_SETDOMAINNAME: Long = 121
public const val SYS_UNAME: Long = 122
public const val SYS_ADJTIMEX: Long = 124
public const val SYS_MPROTECT: Long = 125
public const val SYS_SIGPROCMASK: Long = 126
public const val SYS_INIT_MODULE: Long = 128
public const val SYS_DELETE_MODULE: Long = 129
public const val SYS_QUOTACTL: Long = 131
public const val SYS_GETPGID: Long = 132
public const val SYS_FCHDIR: Long = 133
public const val SYS_BDFLUSH: Long = 134
public const val SYS_SYSFS: Long = 135
public const val SYS_PERSONALITY: Long = 136
public const val SYS_SETFSUID: Long = 138
public const val SYS_SETFSGID: Long = 139
public const val SYS_GETDENTS: Long = 141
public const val SYS_FLOCK: Long = 143
public const val SYS_MSYNC: Long = 144
public const val SYS_READV: Long = 145
public const val SYS_WRITEV: Long = 146
public const val SYS_GETSID: Long = 147
public const val SYS_FDATASYNC: Long = 148
public const val SYS_MLOCK: Long = 150
public const val SYS_MUNLOCK: Long = 151
public const val SYS_MLOCKALL: Long = 152
public const val SYS_MUNLOCKALL: Long = 153
public const val SYS_SCHED_SETPARAM: Long = 154
public const val SYS_SCHED_GETPARAM: Long = 155
public const val SYS_SCHED_SETSCHEDULER: Long = 156
public const val SYS_SCHED_GETSCHEDULER: Long = 157
public const val SYS_SCHED_YIELD: Long = 158
public const val SYS_SCHED_GET_PRIORITY_MAX: Long = 159
public const val SYS_SCHED_GET_PRIORITY_MIN: Long = 160
public const val SYS_SCHED_RR_GET_INTERVAL: Long = 161
public const val SYS_NANOSLEEP: Long = 162
public const val SYS_MREMAP: Long = 163
public const val SYS_SETRESUID: Long = 164
public const val SYS_GETRESUID: Long = 165
public const val SYS_POLL: Long = 168
public const val SYS_NFSSERVCTL: Long = 169
public const val SYS_SETRESGID: Long = 170
public const val SYS_GETRESGID: Long = 171
public const val SYS_PRCTL: Long = 172
public const val SYS_RT_SIGRETURN: Long = 173
public const val SYS_RT_SIGACTION: Long = 174
public const val SYS_RT_SIGPROCMASK: Long = 175
public const val SYS_RT_SIGPENDING: Long = 176
public const val SYS_RT_SIGTIMEDWAIT: Long = 177
public const val SYS_RT_SIGQUEUEINFO: Long = 178
public const val SYS_RT_SIGSUSPEND: Long = 179
public const val SYS_PREAD64: Long = 180
public const val SYS_PWRITE64: Long = 181
public const val SYS_CHOWN: Long = 182
public const val SYS_GETCWD: Long = 183
public const val SYS_CAPGET: Long = 184
public const val SYS_CAPSET: Long = 185
public const val SYS_SIGALTSTACK: Long = 186
public const val SYS_SENDFILE: Long = 187
public const val SYS_VFORK: Long = 190
public const val SYS_UGETRLIMIT: Long = 191
public const val SYS_MMAP2: Long = 192
public const val SYS_TRUNCATE64: Long = 193
public const val SYS_FTRUNCATE64: Long = 194
public const val SYS_STAT64: Long = 195
public const val SYS_LSTAT64: Long = 196
public const val SYS_FSTAT64: Long = 197
public const val SYS_LCHOWN32: Long = 198
public const val SYS_GETUID32: Long = 199
public const val SYS_GETGID32: Long = 200
public const val SYS_GETEUID32: Long = 201
public const val SYS_GETEGID32: Long = 202
public const val SYS_SETREUID32: Long = 203
public const val SYS_SETREGID32: Long = 204
public const val SYS_GETGROUPS32: Long = 205
public const val SYS_SETGROUPS32: Long = 206
public const val SYS_FCHOWN32: Long = 207
public const val SYS_SETRESUID32: Long = 208
public const val SYS_GETRESUID32: Long = 209
public const val SYS_SETRESGID32: Long = 210
public const val SYS_GETRESGID32: Long = 211
public const val SYS_CHOWN32: Long = 212
public const val SYS_SETUID32: Long = 213
public const val SYS_SETGID32: Long = 214
public const val SYS_SETFSUID32: Long = 215
public const val SYS_SETFSGID32: Long = 216
public const val SYS_GETDENTS64: Long = 217
public const val SYS_PIVOT_ROOT: Long = 218
public const val SYS_MINCORE: Long = 219
public const val SYS_MADVISE: Long = 220
public const val SYS_FCNTL64: Long = 221
public const val SYS_GETTID: Long = 224
public const val SYS_READAHEAD: Long = 225
public const val SYS_SETXATTR: Long = 226
public const val SYS_LSETXATTR: Long = 227
public const val SYS_FSETXATTR: Long = 228
public const val SYS_GETXATTR: Long = 229
public const val SYS_LGETXATTR: Long = 230
public const val SYS_FGETXATTR: Long = 231
public const val SYS_LISTXATTR: Long = 232
public const val SYS_LLISTXATTR: Long = 233
public const val SYS_FLISTXATTR: Long = 234
public const val SYS_REMOVEXATTR: Long = 235
public const val SYS_LREMOVEXATTR: Long = 236
public const val SYS_FREMOVEXATTR: Long = 237
public const val SYS_TKILL: Long = 238
public const val SYS_SENDFILE64: Long = 239
public const val SYS_FUTEX: Long = 240
public const val SYS_SCHED_SETAFFINITY: Long = 241
public const val SYS_SCHED_GETAFFINITY: Long = 242
public const val SYS_IO_SETUP: Long = 243
public const val SYS_IO_DESTROY: Long = 244
public const val SYS_IO_GETEVENTS: Long = 245
public const val SYS_IO_SUBMIT: Long = 246
public const val SYS_IO_CANCEL: Long = 247
public const val SYS_EXIT_GROUP: Long = 248
public const val SYS_LOOKUP_DCOOKIE: Long = 249
public const val SYS_EPOLL_CREATE: Long = 250
public const val SYS_EPOLL_CTL: Long = 251
public const val SYS_EPOLL_WAIT: Long = 252
public const val SYS_REMAP_FILE_PAGES: Long = 253
public const val SYS_SET_TID_ADDRESS: Long = 256
public const val SYS_TIMER_CREATE: Long = 257
public const val SYS_TIMER_SETTIME: Long = 258
public const val SYS_TIMER_GETTIME: Long = 259
public const val SYS_TIMER_GETOVERRUN: Long = 260
public const val SYS_TIMER_DELETE: Long = 261
public const val SYS_CLOCK_SETTIME: Long = 262
public const val SYS_CLOCK_GETTIME: Long = 263
public const val SYS_CLOCK_GETRES: Long = 264
public const val SYS_CLOCK_NANOSLEEP: Long = 265
public const val SYS_STATFS64: Long = 266
public const val SYS_FSTATFS64: Long = 267
public const val SYS_TGKILL: Long = 268
public const val SYS_UTIMES: Long = 269
public const val SYS_ARM_FADVISE64_64: Long = 270
public const val SYS_PCICONFIG_IOBASE: Long = 271
public const val SYS_PCICONFIG_READ: Long = 272
public const val SYS_PCICONFIG_WRITE: Long = 273
public const val SYS_MQ_OPEN: Long = 274
public const val SYS_MQ_UNLINK: Long = 275
public const val SYS_MQ_TIMEDSEND: Long = 276
public const val SYS_MQ_TIMEDRECEIVE: Long = 277
public const val SYS_MQ_NOTIFY: Long = 278
public const val SYS_MQ_GETSETATTR: Long = 279
public const val SYS_WAITID: Long = 280
public const val SYS_SOCKET: Long = 281
public const val SYS_BIND: Long = 282
public const val SYS_CONNECT: Long = 283
public const val SYS_LISTEN: Long = 284
public const val SYS_ACCEPT: Long = 285
public const val SYS_GETSOCKNAME: Long = 286
public const val SYS_GETPEERNAME: Long = 287
public const val SYS_SOCKETPAIR: Long = 288
public const val SYS_SEND: Long = 289
public const val SYS_SENDTO: Long = 290
public const val SYS_RECV: Long = 291
public const val SYS_RECVFROM: Long = 292
public const val SYS_SHUTDOWN: Long = 293
public const val SYS_SETSOCKOPT: Long = 294
public const val SYS_GETSOCKOPT: Long = 295
public const val SYS_SENDMSG: Long = 296
public const val SYS_RECVMSG: Long = 297
public const val SYS_SEMOP: Long = 298
public const val SYS_SEMGET: Long = 299
public const val SYS_SEMCTL: Long = 300
public const val SYS_MSGSND: Long = 301
public const val SYS_MSGRCV: Long = 302
public const val SYS_MSGGET: Long = 303
public const val SYS_MSGCTL: Long = 304
public const val SYS_SHMAT: Long = 305
public const val SYS_SHMDT: Long = 306
public const val SYS_SHMGET: Long = 307
public const val SYS_SHMCTL: Long = 308
public const val SYS_ADD_KEY: Long = 309
public const val SYS_REQUEST_KEY: Long = 310
public const val SYS_KEYCTL: Long = 311
public const val SYS_SEMTIMEDOP: Long = 312
public const val SYS_VSERVER: Long = 313
public const val SYS_IOPRIO_SET: Long = 314
public const val SYS_IOPRIO_GET: Long = 315
public const val SYS_INOTIFY_INIT: Long = 316
public const val SYS_INOTIFY_ADD_WATCH: Long = 317
public const val SYS_INOTIFY_RM_WATCH: Long = 318
public const val SYS_MBIND: Long = 319
public const val SYS_GET_MEMPOLICY: Long = 320
public const val SYS_SET_MEMPOLICY: Long = 321
public const val SYS_OPENAT: Long = 322
public const val SYS_MKDIRAT: Long = 323
public const val SYS_MKNODAT: Long = 324
public const val SYS_FCHOWNAT: Long = 325
public const val SYS_FUTIMESAT: Long = 326
public const val SYS_FSTATAT64: Long = 327
public const val SYS_UNLINKAT: Long = 328
public const val SYS_RENAMEAT: Long = 329
public const val SYS_LINKAT: Long = 330
public const val SYS_SYMLINKAT: Long = 331
public const val SYS_READLINKAT: Long = 332
public const val SYS_FCHMODAT: Long = 333
public const val SYS_FACCESSAT: Long = 334
public const val SYS_PSELECT6: Long = 335
public const val SYS_PPOLL: Long = 336
public const val SYS_UNSHARE: Long = 337
public const val SYS_SET_ROBUST_LIST: Long = 338
public const val SYS_GET_ROBUST_LIST: Long = 339
public const val SYS_SPLICE: Long = 340
public const val SYS_ARM_SYNC_FILE_RANGE: Long = 341
public const val SYS_TEE: Long = 342
public const val SYS_VMSPLICE: Long = 343
public const val SYS_MOVE_PAGES: Long = 344
public const val SYS_GETCPU: Long = 345
public const val SYS_EPOLL_PWAIT: Long = 346
public const val SYS_KEXEC_LOAD: Long = 347
public const val SYS_UTIMENSAT: Long = 348
public const val SYS_SIGNALFD: Long = 349
public const val SYS_TIMERFD_CREATE: Long = 350
public const val SYS_EVENTFD: Long = 351
public const val SYS_FALLOCATE: Long = 352
public const val SYS_TIMERFD_SETTIME: Long = 353
public const val SYS_TIMERFD_GETTIME: Long = 354
public const val SYS_SIGNALFD4: Long = 355
public const val SYS_EVENTFD2: Long = 356
public const val SYS_EPOLL_CREATE1: Long = 357
public const val SYS_DUP3: Long = 358
public const val SYS_PIPE2: Long = 359
public const val SYS_INOTIFY_INIT1: Long = 360
public const val SYS_PREADV: Long = 361
public const val SYS_PWRITEV: Long = 362
public const val SYS_RT_TGSIGQUEUEINFO: Long = 363
public const val SYS_PERF_EVENT_OPEN: Long = 364
public const val SYS_RECVMMSG: Long = 365
public const val SYS_ACCEPT4: Long = 366
public const val SYS_FANOTIFY_INIT: Long = 367
public const val SYS_FANOTIFY_MARK: Long = 368
public const val SYS_PRLIMIT64: Long = 369
public const val SYS_NAME_TO_HANDLE_AT: Long = 370
public const val SYS_OPEN_BY_HANDLE_AT: Long = 371
public const val SYS_CLOCK_ADJTIME: Long = 372
public const val SYS_SYNCFS: Long = 373
public const val SYS_SENDMMSG: Long = 374
public const val SYS_SETNS: Long = 375
public const val SYS_PROCESS_VM_READV: Long = 376
public const val SYS_PROCESS_VM_WRITEV: Long = 377
public const val SYS_KCMP: Long = 378
public const val SYS_FINIT_MODULE: Long = 379
public const val SYS_SCHED_SETATTR: Long = 380
public const val SYS_SCHED_GETATTR: Long = 381
public const val SYS_RENAMEAT2: Long = 382
public const val SYS_SECCOMP: Long = 383
public const val SYS_GETRANDOM: Long = 384
public const val SYS_MEMFD_CREATE: Long = 385
public const val SYS_BPF: Long = 386
public const val SYS_EXECVEAT: Long = 387
public const val SYS_USERFAULTFD: Long = 388
public const val SYS_MEMBARRIER: Long = 389
public const val SYS_MLOCK2: Long = 390
public const val SYS_COPY_FILE_RANGE: Long = 391
public const val SYS_PREADV2: Long = 392
public const val SYS_PWRITEV2: Long = 393
public const val SYS_PKEY_MPROTECT: Long = 394
public const val SYS_PKEY_ALLOC: Long = 395
public const val SYS_PKEY_FREE: Long = 396
public const val SYS_STATX: Long = 397
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
public const val SYS_QUOTACTL_FD: Long = 443
public const val SYS_LANDLOCK_CREATE_RULESET: Long = 444
public const val SYS_LANDLOCK_ADD_RULE: Long = 445
public const val SYS_LANDLOCK_RESTRICT_SELF: Long = 446
public const val SYS_PROCESS_MRELEASE: Long = 448
public const val SYS_FUTEX_WAITV: Long = 449
public const val SYS_SET_MEMPOLICY_HOME_NODE: Long = 450
public const val REG_R0: Int = 0
public const val REG_R1: Int = 1
public const val REG_R2: Int = 2
public const val REG_R3: Int = 3
public const val REG_R4: Int = 4
public const val REG_R5: Int = 5
public const val REG_R6: Int = 6
public const val REG_R7: Int = 7
public const val REG_R8: Int = 8
public const val REG_R9: Int = 9
public const val REG_R10: Int = 10
public const val REG_R11: Int = 11
public const val REG_R12: Int = 12
public const val REG_R13: Int = 13
public const val REG_R14: Int = 14
public const val REG_R15: Int = 15
public const val NGREG: Int = 18
public const val AT_SYSINFO_EHDR: ULong = 33uL

public expect fun accept4(fd: Int, addr: Sockaddr?, len: Int?, flg: Int): Int
