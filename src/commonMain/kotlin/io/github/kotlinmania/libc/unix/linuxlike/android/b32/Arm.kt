// port-lint: source unix/linux_like/android/b32/arm.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public typealias WcharT = UInt
public typealias GregT = Int
public typealias McontextT = Sigcontext

public data class Sigcontext(
    val trapNo: CULong,
    val errorCode: CULong,
    val oldmask: CULong,
    val armR0: CULong,
    val armR1: CULong,
    val armR2: CULong,
    val armR3: CULong,
    val armR4: CULong,
    val armR5: CULong,
    val armR6: CULong,
    val armR7: CULong,
    val armR8: CULong,
    val armR9: CULong,
    val armR10: CULong,
    val armFp: CULong,
    val armIp: CULong,
    val armSp: CULong,
    val armLr: CULong,
    val armPc: CULong,
    val armCpsr: CULong,
    val faultAddress: CULong,
)

public data class CAnonymousUcSigmaskWithPadding(
    val ucSigmask: SigsetT,
)

public data class UcontextT(
    val ucFlags: CULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    val align: LongArray,
    val ucRegspace: ULongArray,
)

// C union; only one variant is valid at a time.
public data class CAnonymousUcSigmask(
    val ucSigmask: CAnonymousUcSigmaskWithPadding? = null,
    val ucSigmask64: Sigset64T? = null,
)

public const val O_DIRECT: CInt = 0x10000
public const val O_DIRECTORY: CInt = 0x4000
public const val O_NOFOLLOW: CInt = 0x8000
public const val O_LARGEFILE: CInt = 131072
public const val SYS_restart_syscall: CLong = 0
public const val SYS_exit: CLong = 1
public const val SYS_fork: CLong = 2
public const val SYS_read: CLong = 3
public const val SYS_write: CLong = 4
public const val SYS_open: CLong = 5
public const val SYS_close: CLong = 6
public const val SYS_creat: CLong = 8
public const val SYS_link: CLong = 9
public const val SYS_unlink: CLong = 10
public const val SYS_execve: CLong = 11
public const val SYS_chdir: CLong = 12
public const val SYS_mknod: CLong = 14
public const val SYS_chmod: CLong = 15
public const val SYS_lchown: CLong = 16
public const val SYS_lseek: CLong = 19
public const val SYS_getpid: CLong = 20
public const val SYS_mount: CLong = 21
public const val SYS_setuid: CLong = 23
public const val SYS_getuid: CLong = 24
public const val SYS_ptrace: CLong = 26
public const val SYS_pause: CLong = 29
public const val SYS_access: CLong = 33
public const val SYS_nice: CLong = 34
public const val SYS_sync: CLong = 36
public const val SYS_kill: CLong = 37
public const val SYS_rename: CLong = 38
public const val SYS_mkdir: CLong = 39
public const val SYS_rmdir: CLong = 40
public const val SYS_dup: CLong = 41
public const val SYS_pipe: CLong = 42
public const val SYS_times: CLong = 43
public const val SYS_brk: CLong = 45
public const val SYS_setgid: CLong = 46
public const val SYS_getgid: CLong = 47
public const val SYS_geteuid: CLong = 49
public const val SYS_getegid: CLong = 50
public const val SYS_acct: CLong = 51
public const val SYS_umount2: CLong = 52
public const val SYS_ioctl: CLong = 54
public const val SYS_fcntl: CLong = 55
public const val SYS_setpgid: CLong = 57
public const val SYS_umask: CLong = 60
public const val SYS_chroot: CLong = 61
public const val SYS_ustat: CLong = 62
public const val SYS_dup2: CLong = 63
public const val SYS_getppid: CLong = 64
public const val SYS_getpgrp: CLong = 65
public const val SYS_setsid: CLong = 66
public const val SYS_sigaction: CLong = 67
public const val SYS_setreuid: CLong = 70
public const val SYS_setregid: CLong = 71
public const val SYS_sigsuspend: CLong = 72
public const val SYS_sigpending: CLong = 73
public const val SYS_sethostname: CLong = 74
public const val SYS_setrlimit: CLong = 75
public const val SYS_getrusage: CLong = 77
public const val SYS_gettimeofday: CLong = 78
public const val SYS_settimeofday: CLong = 79
public const val SYS_getgroups: CLong = 80
public const val SYS_setgroups: CLong = 81
public const val SYS_symlink: CLong = 83
public const val SYS_readlink: CLong = 85
public const val SYS_uselib: CLong = 86
public const val SYS_swapon: CLong = 87
public const val SYS_reboot: CLong = 88
public const val SYS_munmap: CLong = 91
public const val SYS_truncate: CLong = 92
public const val SYS_ftruncate: CLong = 93
public const val SYS_fchmod: CLong = 94
public const val SYS_fchown: CLong = 95
public const val SYS_getpriority: CLong = 96
public const val SYS_setpriority: CLong = 97
public const val SYS_statfs: CLong = 99
public const val SYS_fstatfs: CLong = 100
public const val SYS_syslog: CLong = 103
public const val SYS_setitimer: CLong = 104
public const val SYS_getitimer: CLong = 105
public const val SYS_stat: CLong = 106
public const val SYS_lstat: CLong = 107
public const val SYS_fstat: CLong = 108
public const val SYS_vhangup: CLong = 111
public const val SYS_wait4: CLong = 114
public const val SYS_swapoff: CLong = 115
public const val SYS_sysinfo: CLong = 116
public const val SYS_fsync: CLong = 118
public const val SYS_sigreturn: CLong = 119
public const val SYS_clone: CLong = 120
public const val SYS_setdomainname: CLong = 121
public const val SYS_uname: CLong = 122
public const val SYS_adjtimex: CLong = 124
public const val SYS_mprotect: CLong = 125
public const val SYS_sigprocmask: CLong = 126
public const val SYS_init_module: CLong = 128
public const val SYS_delete_module: CLong = 129
public const val SYS_quotactl: CLong = 131
public const val SYS_getpgid: CLong = 132
public const val SYS_fchdir: CLong = 133
public const val SYS_bdflush: CLong = 134
public const val SYS_sysfs: CLong = 135
public const val SYS_personality: CLong = 136
public const val SYS_setfsuid: CLong = 138
public const val SYS_setfsgid: CLong = 139
public const val SYS_getdents: CLong = 141
public const val SYS_flock: CLong = 143
public const val SYS_msync: CLong = 144
public const val SYS_readv: CLong = 145
public const val SYS_writev: CLong = 146
public const val SYS_getsid: CLong = 147
public const val SYS_fdatasync: CLong = 148
public const val SYS_mlock: CLong = 150
public const val SYS_munlock: CLong = 151
public const val SYS_mlockall: CLong = 152
public const val SYS_munlockall: CLong = 153
public const val SYS_sched_setparam: CLong = 154
public const val SYS_sched_getparam: CLong = 155
public const val SYS_sched_setscheduler: CLong = 156
public const val SYS_sched_getscheduler: CLong = 157
public const val SYS_sched_yield: CLong = 158
public const val SYS_sched_get_priority_max: CLong = 159
public const val SYS_sched_get_priority_min: CLong = 160
public const val SYS_sched_rr_get_interval: CLong = 161
public const val SYS_nanosleep: CLong = 162
public const val SYS_mremap: CLong = 163
public const val SYS_setresuid: CLong = 164
public const val SYS_getresuid: CLong = 165
public const val SYS_poll: CLong = 168
public const val SYS_nfsservctl: CLong = 169
public const val SYS_setresgid: CLong = 170
public const val SYS_getresgid: CLong = 171
public const val SYS_prctl: CLong = 172
public const val SYS_rt_sigreturn: CLong = 173
public const val SYS_rt_sigaction: CLong = 174
public const val SYS_rt_sigprocmask: CLong = 175
public const val SYS_rt_sigpending: CLong = 176
public const val SYS_rt_sigtimedwait: CLong = 177
public const val SYS_rt_sigqueueinfo: CLong = 178
public const val SYS_rt_sigsuspend: CLong = 179
public const val SYS_pread64: CLong = 180
public const val SYS_pwrite64: CLong = 181
public const val SYS_chown: CLong = 182
public const val SYS_getcwd: CLong = 183
public const val SYS_capget: CLong = 184
public const val SYS_capset: CLong = 185
public const val SYS_sigaltstack: CLong = 186
public const val SYS_sendfile: CLong = 187
public const val SYS_vfork: CLong = 190
public const val SYS_ugetrlimit: CLong = 191
public const val SYS_mmap2: CLong = 192
public const val SYS_truncate64: CLong = 193
public const val SYS_ftruncate64: CLong = 194
public const val SYS_stat64: CLong = 195
public const val SYS_lstat64: CLong = 196
public const val SYS_fstat64: CLong = 197
public const val SYS_lchown32: CLong = 198
public const val SYS_getuid32: CLong = 199
public const val SYS_getgid32: CLong = 200
public const val SYS_geteuid32: CLong = 201
public const val SYS_getegid32: CLong = 202
public const val SYS_setreuid32: CLong = 203
public const val SYS_setregid32: CLong = 204
public const val SYS_getgroups32: CLong = 205
public const val SYS_setgroups32: CLong = 206
public const val SYS_fchown32: CLong = 207
public const val SYS_setresuid32: CLong = 208
public const val SYS_getresuid32: CLong = 209
public const val SYS_setresgid32: CLong = 210
public const val SYS_getresgid32: CLong = 211
public const val SYS_chown32: CLong = 212
public const val SYS_setuid32: CLong = 213
public const val SYS_setgid32: CLong = 214
public const val SYS_setfsuid32: CLong = 215
public const val SYS_setfsgid32: CLong = 216
public const val SYS_getdents64: CLong = 217
public const val SYS_pivot_root: CLong = 218
public const val SYS_mincore: CLong = 219
public const val SYS_madvise: CLong = 220
public const val SYS_fcntl64: CLong = 221
public const val SYS_gettid: CLong = 224
public const val SYS_readahead: CLong = 225
public const val SYS_setxattr: CLong = 226
public const val SYS_lsetxattr: CLong = 227
public const val SYS_fsetxattr: CLong = 228
public const val SYS_getxattr: CLong = 229
public const val SYS_lgetxattr: CLong = 230
public const val SYS_fgetxattr: CLong = 231
public const val SYS_listxattr: CLong = 232
public const val SYS_llistxattr: CLong = 233
public const val SYS_flistxattr: CLong = 234
public const val SYS_removexattr: CLong = 235
public const val SYS_lremovexattr: CLong = 236
public const val SYS_fremovexattr: CLong = 237
public const val SYS_tkill: CLong = 238
public const val SYS_sendfile64: CLong = 239
public const val SYS_futex: CLong = 240
public const val SYS_sched_setaffinity: CLong = 241
public const val SYS_sched_getaffinity: CLong = 242
public const val SYS_io_setup: CLong = 243
public const val SYS_io_destroy: CLong = 244
public const val SYS_io_getevents: CLong = 245
public const val SYS_io_submit: CLong = 246
public const val SYS_io_cancel: CLong = 247
public const val SYS_exit_group: CLong = 248
public const val SYS_lookup_dcookie: CLong = 249
public const val SYS_epoll_create: CLong = 250
public const val SYS_epoll_ctl: CLong = 251
public const val SYS_epoll_wait: CLong = 252
public const val SYS_remap_file_pages: CLong = 253
public const val SYS_set_tid_address: CLong = 256
public const val SYS_timer_create: CLong = 257
public const val SYS_timer_settime: CLong = 258
public const val SYS_timer_gettime: CLong = 259
public const val SYS_timer_getoverrun: CLong = 260
public const val SYS_timer_delete: CLong = 261
public const val SYS_clock_settime: CLong = 262
public const val SYS_clock_gettime: CLong = 263
public const val SYS_clock_getres: CLong = 264
public const val SYS_clock_nanosleep: CLong = 265
public const val SYS_statfs64: CLong = 266
public const val SYS_fstatfs64: CLong = 267
public const val SYS_tgkill: CLong = 268
public const val SYS_utimes: CLong = 269
public const val SYS_arm_fadvise64_64: CLong = 270
public const val SYS_pciconfig_iobase: CLong = 271
public const val SYS_pciconfig_read: CLong = 272
public const val SYS_pciconfig_write: CLong = 273
public const val SYS_mq_open: CLong = 274
public const val SYS_mq_unlink: CLong = 275
public const val SYS_mq_timedsend: CLong = 276
public const val SYS_mq_timedreceive: CLong = 277
public const val SYS_mq_notify: CLong = 278
public const val SYS_mq_getsetattr: CLong = 279
public const val SYS_waitid: CLong = 280
public const val SYS_socket: CLong = 281
public const val SYS_bind: CLong = 282
public const val SYS_connect: CLong = 283
public const val SYS_listen: CLong = 284
public const val SYS_accept: CLong = 285
public const val SYS_getsockname: CLong = 286
public const val SYS_getpeername: CLong = 287
public const val SYS_socketpair: CLong = 288
public const val SYS_send: CLong = 289
public const val SYS_sendto: CLong = 290
public const val SYS_recv: CLong = 291
public const val SYS_recvfrom: CLong = 292
public const val SYS_shutdown: CLong = 293
public const val SYS_setsockopt: CLong = 294
public const val SYS_getsockopt: CLong = 295
public const val SYS_sendmsg: CLong = 296
public const val SYS_recvmsg: CLong = 297
public const val SYS_semop: CLong = 298
public const val SYS_semget: CLong = 299
public const val SYS_semctl: CLong = 300
public const val SYS_msgsnd: CLong = 301
public const val SYS_msgrcv: CLong = 302
public const val SYS_msgget: CLong = 303
public const val SYS_msgctl: CLong = 304
public const val SYS_shmat: CLong = 305
public const val SYS_shmdt: CLong = 306
public const val SYS_shmget: CLong = 307
public const val SYS_shmctl: CLong = 308
public const val SYS_add_key: CLong = 309
public const val SYS_request_key: CLong = 310
public const val SYS_keyctl: CLong = 311
public const val SYS_semtimedop: CLong = 312
public const val SYS_vserver: CLong = 313
public const val SYS_ioprio_set: CLong = 314
public const val SYS_ioprio_get: CLong = 315
public const val SYS_inotify_init: CLong = 316
public const val SYS_inotify_add_watch: CLong = 317
public const val SYS_inotify_rm_watch: CLong = 318
public const val SYS_mbind: CLong = 319
public const val SYS_get_mempolicy: CLong = 320
public const val SYS_set_mempolicy: CLong = 321
public const val SYS_openat: CLong = 322
public const val SYS_mkdirat: CLong = 323
public const val SYS_mknodat: CLong = 324
public const val SYS_fchownat: CLong = 325
public const val SYS_futimesat: CLong = 326
public const val SYS_fstatat64: CLong = 327
public const val SYS_unlinkat: CLong = 328
public const val SYS_renameat: CLong = 329
public const val SYS_linkat: CLong = 330
public const val SYS_symlinkat: CLong = 331
public const val SYS_readlinkat: CLong = 332
public const val SYS_fchmodat: CLong = 333
public const val SYS_faccessat: CLong = 334
public const val SYS_pselect6: CLong = 335
public const val SYS_ppoll: CLong = 336
public const val SYS_unshare: CLong = 337
public const val SYS_set_robust_list: CLong = 338
public const val SYS_get_robust_list: CLong = 339
public const val SYS_splice: CLong = 340
public const val SYS_arm_sync_file_range: CLong = 341
public const val SYS_tee: CLong = 342
public const val SYS_vmsplice: CLong = 343
public const val SYS_move_pages: CLong = 344
public const val SYS_getcpu: CLong = 345
public const val SYS_epoll_pwait: CLong = 346
public const val SYS_kexec_load: CLong = 347
public const val SYS_utimensat: CLong = 348
public const val SYS_signalfd: CLong = 349
public const val SYS_timerfd_create: CLong = 350
public const val SYS_eventfd: CLong = 351
public const val SYS_fallocate: CLong = 352
public const val SYS_timerfd_settime: CLong = 353
public const val SYS_timerfd_gettime: CLong = 354
public const val SYS_signalfd4: CLong = 355
public const val SYS_eventfd2: CLong = 356
public const val SYS_epoll_create1: CLong = 357
public const val SYS_dup3: CLong = 358
public const val SYS_pipe2: CLong = 359
public const val SYS_inotify_init1: CLong = 360
public const val SYS_preadv: CLong = 361
public const val SYS_pwritev: CLong = 362
public const val SYS_rt_tgsigqueueinfo: CLong = 363
public const val SYS_perf_event_open: CLong = 364
public const val SYS_recvmmsg: CLong = 365
public const val SYS_accept4: CLong = 366
public const val SYS_fanotify_init: CLong = 367
public const val SYS_fanotify_mark: CLong = 368
public const val SYS_prlimit64: CLong = 369
public const val SYS_name_to_handle_at: CLong = 370
public const val SYS_open_by_handle_at: CLong = 371
public const val SYS_clock_adjtime: CLong = 372
public const val SYS_syncfs: CLong = 373
public const val SYS_sendmmsg: CLong = 374
public const val SYS_setns: CLong = 375
public const val SYS_process_vm_readv: CLong = 376
public const val SYS_process_vm_writev: CLong = 377
public const val SYS_kcmp: CLong = 378
public const val SYS_finit_module: CLong = 379
public const val SYS_sched_setattr: CLong = 380
public const val SYS_sched_getattr: CLong = 381
public const val SYS_renameat2: CLong = 382
public const val SYS_seccomp: CLong = 383
public const val SYS_getrandom: CLong = 384
public const val SYS_memfd_create: CLong = 385
public const val SYS_bpf: CLong = 386
public const val SYS_execveat: CLong = 387
public const val SYS_userfaultfd: CLong = 388
public const val SYS_membarrier: CLong = 389
public const val SYS_mlock2: CLong = 390
public const val SYS_copy_file_range: CLong = 391
public const val SYS_preadv2: CLong = 392
public const val SYS_pwritev2: CLong = 393
public const val SYS_pkey_mprotect: CLong = 394
public const val SYS_pkey_alloc: CLong = 395
public const val SYS_pkey_free: CLong = 396
public const val SYS_statx: CLong = 397
public const val SYS_pidfd_send_signal: CLong = 424
public const val SYS_io_uring_setup: CLong = 425
public const val SYS_io_uring_enter: CLong = 426
public const val SYS_io_uring_register: CLong = 427
public const val SYS_open_tree: CLong = 428
public const val SYS_move_mount: CLong = 429
public const val SYS_fsopen: CLong = 430
public const val SYS_fsconfig: CLong = 431
public const val SYS_fsmount: CLong = 432
public const val SYS_fspick: CLong = 433
public const val SYS_pidfd_open: CLong = 434
public const val SYS_clone3: CLong = 435
public const val SYS_close_range: CLong = 436
public const val SYS_openat2: CLong = 437
public const val SYS_pidfd_getfd: CLong = 438
public const val SYS_faccessat2: CLong = 439
public const val SYS_process_madvise: CLong = 440
public const val SYS_epoll_pwait2: CLong = 441
public const val SYS_mount_setattr: CLong = 442
public const val SYS_quotactl_fd: CLong = 443
public const val SYS_landlock_create_ruleset: CLong = 444
public const val SYS_landlock_add_rule: CLong = 445
public const val SYS_landlock_restrict_self: CLong = 446
public const val SYS_process_mrelease: CLong = 448
public const val SYS_futex_waitv: CLong = 449
public const val SYS_set_mempolicy_home_node: CLong = 450
public const val REG_R0: CInt = 0
public const val REG_R1: CInt = 1
public const val REG_R2: CInt = 2
public const val REG_R3: CInt = 3
public const val REG_R4: CInt = 4
public const val REG_R5: CInt = 5
public const val REG_R6: CInt = 6
public const val REG_R7: CInt = 7
public const val REG_R8: CInt = 8
public const val REG_R9: CInt = 9
public const val REG_R10: CInt = 10
public const val REG_R11: CInt = 11
public const val REG_R12: CInt = 12
public const val REG_R13: CInt = 13
public const val REG_R14: CInt = 14
public const val REG_R15: CInt = 15
public const val NGREG: CInt = 18
public const val AT_SYSINFO_EHDR: CULong = 33uL

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt
