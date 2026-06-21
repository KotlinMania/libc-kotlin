// port-lint: source unix/linux_like/android/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64.riscv64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = UInt
public typealias GregT = Long
public typealias U64 = CULongLong
public typealias S64 = CLongLong

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: CUInt,
    val stNlink: CUInt,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: Off64T,
    val stBlksize: CInt,
    val stBlocks: CLong,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class Stat64(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: CUInt,
    val stNlink: CUInt,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: Off64T,
    val stBlksize: CInt,
    val stBlocks: CLong,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class MaxAlignT(
    val priv: List<Float>,
)

public const val O_DIRECT: CInt = 0x40000
public const val O_DIRECTORY: CInt = 0x200000
public const val O_NOFOLLOW: CInt = 0x400000
public const val O_LARGEFILE: CInt = 0x100000
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public val COMPAT_HWCAP_ISA_I: CULong = 1 shl (b'I' - b'A')
public val COMPAT_HWCAP_ISA_M: CULong = 1 shl (b'M' - b'A')
public val COMPAT_HWCAP_ISA_A: CULong = 1 shl (b'A' - b'A')
public val COMPAT_HWCAP_ISA_F: CULong = 1 shl (b'F' - b'A')
public val COMPAT_HWCAP_ISA_D: CULong = 1 shl (b'D' - b'A')
public val COMPAT_HWCAP_ISA_C: CULong = 1 shl (b'C' - b'A')
public const val SYS_io_setup: CLong = 0
public const val SYS_io_destroy: CLong = 1
public const val SYS_io_submit: CLong = 2
public const val SYS_io_cancel: CLong = 3
public const val SYS_io_getevents: CLong = 4
public const val SYS_setxattr: CLong = 5
public const val SYS_lsetxattr: CLong = 6
public const val SYS_fsetxattr: CLong = 7
public const val SYS_getxattr: CLong = 8
public const val SYS_lgetxattr: CLong = 9
public const val SYS_fgetxattr: CLong = 10
public const val SYS_listxattr: CLong = 11
public const val SYS_llistxattr: CLong = 12
public const val SYS_flistxattr: CLong = 13
public const val SYS_removexattr: CLong = 14
public const val SYS_lremovexattr: CLong = 15
public const val SYS_fremovexattr: CLong = 16
public const val SYS_getcwd: CLong = 17
public const val SYS_lookup_dcookie: CLong = 18
public const val SYS_eventfd2: CLong = 19
public const val SYS_epoll_create1: CLong = 20
public const val SYS_epoll_ctl: CLong = 21
public const val SYS_epoll_pwait: CLong = 22
public const val SYS_dup: CLong = 23
public const val SYS_dup3: CLong = 24
public const val SYS_inotify_init1: CLong = 26
public const val SYS_inotify_add_watch: CLong = 27
public const val SYS_inotify_rm_watch: CLong = 28
public const val SYS_ioctl: CLong = 29
public const val SYS_ioprio_set: CLong = 30
public const val SYS_ioprio_get: CLong = 31
public const val SYS_flock: CLong = 32
public const val SYS_mknodat: CLong = 33
public const val SYS_mkdirat: CLong = 34
public const val SYS_unlinkat: CLong = 35
public const val SYS_symlinkat: CLong = 36
public const val SYS_linkat: CLong = 37
public const val SYS_renameat: CLong = 38
public const val SYS_umount2: CLong = 39
public const val SYS_mount: CLong = 40
public const val SYS_pivot_root: CLong = 41
public const val SYS_nfsservctl: CLong = 42
public const val SYS_fallocate: CLong = 47
public const val SYS_faccessat: CLong = 48
public const val SYS_chdir: CLong = 49
public const val SYS_fchdir: CLong = 50
public const val SYS_chroot: CLong = 51
public const val SYS_fchmod: CLong = 52
public const val SYS_fchmodat: CLong = 53
public const val SYS_fchownat: CLong = 54
public const val SYS_fchown: CLong = 55
public const val SYS_openat: CLong = 56
public const val SYS_close: CLong = 57
public const val SYS_vhangup: CLong = 58
public const val SYS_pipe2: CLong = 59
public const val SYS_quotactl: CLong = 60
public const val SYS_getdents64: CLong = 61
public const val SYS_read: CLong = 63
public const val SYS_write: CLong = 64
public const val SYS_readv: CLong = 65
public const val SYS_writev: CLong = 66
public const val SYS_pread64: CLong = 67
public const val SYS_pwrite64: CLong = 68
public const val SYS_preadv: CLong = 69
public const val SYS_pwritev: CLong = 70
public const val SYS_pselect6: CLong = 72
public const val SYS_ppoll: CLong = 73
public const val SYS_signalfd4: CLong = 74
public const val SYS_vmsplice: CLong = 75
public const val SYS_splice: CLong = 76
public const val SYS_tee: CLong = 77
public const val SYS_readlinkat: CLong = 78
public const val SYS_sync: CLong = 81
public const val SYS_fsync: CLong = 82
public const val SYS_fdatasync: CLong = 83
public const val SYS_sync_file_range: CLong = 84
public const val SYS_timerfd_create: CLong = 85
public const val SYS_timerfd_settime: CLong = 86
public const val SYS_timerfd_gettime: CLong = 87
public const val SYS_utimensat: CLong = 88
public const val SYS_acct: CLong = 89
public const val SYS_capget: CLong = 90
public const val SYS_capset: CLong = 91
public const val SYS_personality: CLong = 92
public const val SYS_exit: CLong = 93
public const val SYS_exit_group: CLong = 94
public const val SYS_waitid: CLong = 95
public const val SYS_set_tid_address: CLong = 96
public const val SYS_unshare: CLong = 97
public const val SYS_futex: CLong = 98
public const val SYS_set_robust_list: CLong = 99
public const val SYS_get_robust_list: CLong = 100
public const val SYS_nanosleep: CLong = 101
public const val SYS_getitimer: CLong = 102
public const val SYS_setitimer: CLong = 103
public const val SYS_kexec_load: CLong = 104
public const val SYS_init_module: CLong = 105
public const val SYS_delete_module: CLong = 106
public const val SYS_timer_create: CLong = 107
public const val SYS_timer_gettime: CLong = 108
public const val SYS_timer_getoverrun: CLong = 109
public const val SYS_timer_settime: CLong = 110
public const val SYS_timer_delete: CLong = 111
public const val SYS_clock_settime: CLong = 112
public const val SYS_clock_gettime: CLong = 113
public const val SYS_clock_getres: CLong = 114
public const val SYS_clock_nanosleep: CLong = 115
public const val SYS_syslog: CLong = 116
public const val SYS_ptrace: CLong = 117
public const val SYS_sched_setparam: CLong = 118
public const val SYS_sched_setscheduler: CLong = 119
public const val SYS_sched_getscheduler: CLong = 120
public const val SYS_sched_getparam: CLong = 121
public const val SYS_sched_setaffinity: CLong = 122
public const val SYS_sched_getaffinity: CLong = 123
public const val SYS_sched_yield: CLong = 124
public const val SYS_sched_get_priority_max: CLong = 125
public const val SYS_sched_get_priority_min: CLong = 126
public const val SYS_sched_rr_get_interval: CLong = 127
public const val SYS_restart_syscall: CLong = 128
public const val SYS_kill: CLong = 129
public const val SYS_tkill: CLong = 130
public const val SYS_tgkill: CLong = 131
public const val SYS_sigaltstack: CLong = 132
public const val SYS_rt_sigsuspend: CLong = 133
public const val SYS_rt_sigaction: CLong = 134
public const val SYS_rt_sigprocmask: CLong = 135
public const val SYS_rt_sigpending: CLong = 136
public const val SYS_rt_sigtimedwait: CLong = 137
public const val SYS_rt_sigqueueinfo: CLong = 138
public const val SYS_rt_sigreturn: CLong = 139
public const val SYS_setpriority: CLong = 140
public const val SYS_getpriority: CLong = 141
public const val SYS_reboot: CLong = 142
public const val SYS_setregid: CLong = 143
public const val SYS_setgid: CLong = 144
public const val SYS_setreuid: CLong = 145
public const val SYS_setuid: CLong = 146
public const val SYS_setresuid: CLong = 147
public const val SYS_getresuid: CLong = 148
public const val SYS_setresgid: CLong = 149
public const val SYS_getresgid: CLong = 150
public const val SYS_setfsuid: CLong = 151
public const val SYS_setfsgid: CLong = 152
public const val SYS_times: CLong = 153
public const val SYS_setpgid: CLong = 154
public const val SYS_getpgid: CLong = 155
public const val SYS_getsid: CLong = 156
public const val SYS_setsid: CLong = 157
public const val SYS_getgroups: CLong = 158
public const val SYS_setgroups: CLong = 159
public const val SYS_uname: CLong = 160
public const val SYS_sethostname: CLong = 161
public const val SYS_setdomainname: CLong = 162
public const val SYS_getrlimit: CLong = 163
public const val SYS_setrlimit: CLong = 164
public const val SYS_getrusage: CLong = 165
public const val SYS_umask: CLong = 166
public const val SYS_prctl: CLong = 167
public const val SYS_getcpu: CLong = 168
public const val SYS_gettimeofday: CLong = 169
public const val SYS_settimeofday: CLong = 170
public const val SYS_adjtimex: CLong = 171
public const val SYS_getpid: CLong = 172
public const val SYS_getppid: CLong = 173
public const val SYS_getuid: CLong = 174
public const val SYS_geteuid: CLong = 175
public const val SYS_getgid: CLong = 176
public const val SYS_getegid: CLong = 177
public const val SYS_gettid: CLong = 178
public const val SYS_sysinfo: CLong = 179
public const val SYS_mq_open: CLong = 180
public const val SYS_mq_unlink: CLong = 181
public const val SYS_mq_timedsend: CLong = 182
public const val SYS_mq_timedreceive: CLong = 183
public const val SYS_mq_notify: CLong = 184
public const val SYS_mq_getsetattr: CLong = 185
public const val SYS_msgget: CLong = 186
public const val SYS_msgctl: CLong = 187
public const val SYS_msgrcv: CLong = 188
public const val SYS_msgsnd: CLong = 189
public const val SYS_semget: CLong = 190
public const val SYS_semctl: CLong = 191
public const val SYS_semtimedop: CLong = 192
public const val SYS_semop: CLong = 193
public const val SYS_shmget: CLong = 194
public const val SYS_shmctl: CLong = 195
public const val SYS_shmat: CLong = 196
public const val SYS_shmdt: CLong = 197
public const val SYS_socket: CLong = 198
public const val SYS_socketpair: CLong = 199
public const val SYS_bind: CLong = 200
public const val SYS_listen: CLong = 201
public const val SYS_accept: CLong = 202
public const val SYS_connect: CLong = 203
public const val SYS_getsockname: CLong = 204
public const val SYS_getpeername: CLong = 205
public const val SYS_sendto: CLong = 206
public const val SYS_recvfrom: CLong = 207
public const val SYS_setsockopt: CLong = 208
public const val SYS_getsockopt: CLong = 209
public const val SYS_shutdown: CLong = 210
public const val SYS_sendmsg: CLong = 211
public const val SYS_recvmsg: CLong = 212
public const val SYS_readahead: CLong = 213
public const val SYS_brk: CLong = 214
public const val SYS_munmap: CLong = 215
public const val SYS_mremap: CLong = 216
public const val SYS_add_key: CLong = 217
public const val SYS_request_key: CLong = 218
public const val SYS_keyctl: CLong = 219
public const val SYS_clone: CLong = 220
public const val SYS_execve: CLong = 221
public const val SYS_swapon: CLong = 224
public const val SYS_swapoff: CLong = 225
public const val SYS_mprotect: CLong = 226
public const val SYS_msync: CLong = 227
public const val SYS_mlock: CLong = 228
public const val SYS_munlock: CLong = 229
public const val SYS_mlockall: CLong = 230
public const val SYS_munlockall: CLong = 231
public const val SYS_mincore: CLong = 232
public const val SYS_madvise: CLong = 233
public const val SYS_remap_file_pages: CLong = 234
public const val SYS_mbind: CLong = 235
public const val SYS_get_mempolicy: CLong = 236
public const val SYS_set_mempolicy: CLong = 237
public const val SYS_migrate_pages: CLong = 238
public const val SYS_move_pages: CLong = 239
public const val SYS_rt_tgsigqueueinfo: CLong = 240
public const val SYS_perf_event_open: CLong = 241
public const val SYS_accept4: CLong = 242
public const val SYS_recvmmsg: CLong = 243
public const val SYS_arch_specific_syscall: CLong = 244
public const val SYS_wait4: CLong = 260
public const val SYS_prlimit64: CLong = 261
public const val SYS_fanotify_init: CLong = 262
public const val SYS_fanotify_mark: CLong = 263
public const val SYS_name_to_handle_at: CLong = 264
public const val SYS_open_by_handle_at: CLong = 265
public const val SYS_clock_adjtime: CLong = 266
public const val SYS_syncfs: CLong = 267
public const val SYS_setns: CLong = 268
public const val SYS_sendmmsg: CLong = 269
public const val SYS_process_vm_readv: CLong = 270
public const val SYS_process_vm_writev: CLong = 271
public const val SYS_kcmp: CLong = 272
public const val SYS_finit_module: CLong = 273
public const val SYS_sched_setattr: CLong = 274
public const val SYS_sched_getattr: CLong = 275
public const val SYS_renameat2: CLong = 276
public const val SYS_seccomp: CLong = 277
public const val SYS_getrandom: CLong = 278
public const val SYS_memfd_create: CLong = 279
public const val SYS_bpf: CLong = 280
public const val SYS_execveat: CLong = 281
public const val SYS_userfaultfd: CLong = 282
public const val SYS_membarrier: CLong = 283
public const val SYS_mlock2: CLong = 284
public const val SYS_copy_file_range: CLong = 285
public const val SYS_preadv2: CLong = 286
public const val SYS_pwritev2: CLong = 287
public const val SYS_pkey_mprotect: CLong = 288
public const val SYS_pkey_alloc: CLong = 289
public const val SYS_pkey_free: CLong = 290
public const val SYS_statx: CLong = 291
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
public const val SYS_memfd_secret: CLong = 447
public const val SYS_process_mrelease: CLong = 448
public const val SYS_futex_waitv: CLong = 449
public const val SYS_set_mempolicy_home_node: CLong = 450
public const val AT_SYSINFO_EHDR: CULong = 33uL
public const val AT_L1I_CACHESIZE: CULong = 40uL
public const val AT_L1I_CACHEGEOMETRY: CULong = 41uL
public const val AT_L1D_CACHESIZE: CULong = 42uL
public const val AT_L1D_CACHEGEOMETRY: CULong = 43uL
public const val AT_L2_CACHESIZE: CULong = 44uL
public const val AT_L2_CACHEGEOMETRY: CULong = 45uL
public const val AT_L3_CACHESIZE: CULong = 46uL
public const val AT_L3_CACHEGEOMETRY: CULong = 47uL
public const val AT_VECTOR_SIZE_ARCH: CULong = 9uL
