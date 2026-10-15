// port-lint: source unix/linux_like/linux/musl/b32/hexagon.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*

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
public const val SYS3264_fadvise64: Int = 223
public const val SYS3264_fcntl: Int = 25
public const val SYS3264_fstatat: Int = 79
public const val SYS3264_fstat: Int = 80
public const val SYS3264_fstatfs: Int = 44
public const val SYS3264_ftruncate: Int = 46
public const val SYS3264_lseek: Int = 62
public const val SYS3264_lstat: Int = 1039
public const val SYS3264_mmap: Int = 222
public const val SYS3264_sendfile: Int = 71
public const val SYS3264_stat: Int = 1038
public const val SYS3264_statfs: Int = 43
public const val SYS3264_truncate: Int = 45
public const val SYS_accept4: Int = 242
public const val SYS_accept: Int = 202
public const val SYS_access: Int = 1033
public const val SYS_acct: Int = 89
public const val SYS_add_key: Int = 217
public const val SYS_adjtimex: Int = 171
public const val SYS_alarm: Int = 1059
public const val SYS_arch_specific_syscall: Int = 244
public const val SYS_bdflush: Int = 1075
public const val SYS_bind: Int = 200
public const val SYS_bpf: Int = 280
public const val SYS_brk: Int = 214
public const val SYS_capget: Int = 90
public const val SYS_capset: Int = 91
public const val SYS_chdir: Int = 49
public const val SYS_chmod: Int = 1028
public const val SYS_chown: Int = 1029
public const val SYS_chroot: Int = 51
public const val SYS_clock_adjtime: Int = 266
public const val SYS_clock_getres: Int = 114
public const val SYS_clock_gettime: Int = 113
public const val SYS_clock_nanosleep: Int = 115
public const val SYS_clock_settime: Int = 112
public const val SYS_clone: Int = 220
public const val SYS_close: Int = 57
public const val SYS_connect: Int = 203
public const val SYS_copy_file_range: Int = -1
public const val SYS_creat: Int = 1064
public const val SYS_delete_module: Int = 106
public const val SYS_dup2: Int = 1041
public const val SYS_dup3: Int = 24
public const val SYS_dup: Int = 23
public const val SYS_epoll_create1: Int = 20
public const val SYS_epoll_create: Int = 1042
public const val SYS_epoll_ctl: Int = 21
public const val SYS_epoll_pwait: Int = 22
public const val SYS_epoll_wait: Int = 1069
public const val SYS_eventfd2: Int = 19
public const val SYS_eventfd: Int = 1044
public const val SYS_execveat: Int = 281
public const val SYS_execve: Int = 221
public const val SYS_exit: Int = 93
public const val SYS_exit_group: Int = 94
public const val SYS_faccessat: Int = 48
public const val SYS_fadvise64_64: Int = 223
public const val SYS_fallocate: Int = 47
public const val SYS_fanotify_init: Int = 262
public const val SYS_fanotify_mark: Int = 263
public const val SYS_fchdir: Int = 50
public const val SYS_fchmodat: Int = 53
public const val SYS_fchmod: Int = 52
public const val SYS_fchownat: Int = 54
public const val SYS_fchown: Int = 55
public const val SYS_fcntl64: Int = 25
public const val SYS_fcntl: Int = 25
public const val SYS_fdatasync: Int = 83
public const val SYS_fgetxattr: Int = 10
public const val SYS_finit_module: Int = 273
public const val SYS_flistxattr: Int = 13
public const val SYS_flock: Int = 32
public const val SYS_fork: Int = 1079
public const val SYS_fremovexattr: Int = 16
public const val SYS_fsetxattr: Int = 7
public const val SYS_fstat64: Int = 80
public const val SYS_fstatat64: Int = 79
public const val SYS_fstatfs64: Int = 44
public const val SYS_fstatfs: Int = 44
public const val SYS_fsync: Int = 82
public const val SYS_ftruncate64: Int = 46
public const val SYS_ftruncate: Int = 46
public const val SYS_futex: Int = 98
public const val SYS_futimesat: Int = 1066
public const val SYS_getcpu: Int = 168
public const val SYS_getcwd: Int = 17
public const val SYS_getdents64: Int = 61
public const val SYS_getdents: Int = 1065
public const val SYS_getegid: Int = 177
public const val SYS_geteuid: Int = 175
public const val SYS_getgid: Int = 176
public const val SYS_getgroups: Int = 158
public const val SYS_getitimer: Int = 102
public const val SYS_get_mempolicy: Int = 236
public const val SYS_getpeername: Int = 205
public const val SYS_getpgid: Int = 155
public const val SYS_getpgrp: Int = 1060
public const val SYS_getpid: Int = 172
public const val SYS_getppid: Int = 173
public const val SYS_getpriority: Int = 141
public const val SYS_getrandom: Int = 278
public const val SYS_getresgid: Int = 150
public const val SYS_getresuid: Int = 148
public const val SYS_getrlimit: Int = 163
public const val SYS_get_robust_list: Int = 100
public const val SYS_getrusage: Int = 165
public const val SYS_getsid: Int = 156
public const val SYS_getsockname: Int = 204
public const val SYS_getsockopt: Int = 209
public const val SYS_gettid: Int = 178
public const val SYS_gettimeofday: Int = 169
public const val SYS_getuid: Int = 174
public const val SYS_getxattr: Int = 8
public const val SYS_init_module: Int = 105
public const val SYS_inotify_add_watch: Int = 27
public const val SYS_inotify_init1: Int = 26
public const val SYS_inotify_init: Int = 1043
public const val SYS_inotify_rm_watch: Int = 28
public const val SYS_io_cancel: Int = 3
public const val SYS_ioctl: Int = 29
public const val SYS_io_destroy: Int = 1
public const val SYS_io_getevents: Int = 4
public const val SYS_ioprio_get: Int = 31
public const val SYS_ioprio_set: Int = 30
public const val SYS_io_setup: Int = 0
public const val SYS_io_submit: Int = 2
public const val SYS_kcmp: Int = 272
public const val SYS_kexec_load: Int = 104
public const val SYS_keyctl: Int = 219
public const val SYS_kill: Int = 129
public const val SYS_lchown: Int = 1032
public const val SYS_lgetxattr: Int = 9
public const val SYS_linkat: Int = 37
public const val SYS_link: Int = 1025
public const val SYS_listen: Int = 201
public const val SYS_listxattr: Int = 11
public const val SYS_llistxattr: Int = 12
public const val SYS__llseek: Int = 62
public const val SYS_lookup_dcookie: Int = 18
public const val SYS_lremovexattr: Int = 15
public const val SYS_lseek: Int = 62
public const val SYS_lsetxattr: Int = 6
public const val SYS_lstat64: Int = 1039
public const val SYS_lstat: Int = 1039
public const val SYS_madvise: Int = 233
public const val SYS_mbind: Int = 235
public const val SYS_memfd_create: Int = 279
public const val SYS_migrate_pages: Int = 238
public const val SYS_mincore: Int = 232
public const val SYS_mkdirat: Int = 34
public const val SYS_mkdir: Int = 1030
public const val SYS_mknodat: Int = 33
public const val SYS_mknod: Int = 1027
public const val SYS_mlockall: Int = 230
public const val SYS_mlock: Int = 228
public const val SYS_mmap2: Int = 222
public const val SYS_mount: Int = 40
public const val SYS_move_pages: Int = 239
public const val SYS_mprotect: Int = 226
public const val SYS_mq_getsetattr: Int = 185
public const val SYS_mq_notify: Int = 184
public const val SYS_mq_open: Int = 180
public const val SYS_mq_timedreceive: Int = 183
public const val SYS_mq_timedsend: Int = 182
public const val SYS_mq_unlink: Int = 181
public const val SYS_mremap: Int = 216
public const val SYS_msgctl: Int = 187
public const val SYS_msgget: Int = 186
public const val SYS_msgrcv: Int = 188
public const val SYS_msgsnd: Int = 189
public const val SYS_msync: Int = 227
public const val SYS_munlockall: Int = 231
public const val SYS_munlock: Int = 229
public const val SYS_munmap: Int = 215
public const val SYS_name_to_handle_at: Int = 264
public const val SYS_nanosleep: Int = 101
public const val SYS_newfstatat: Int = 79
public const val SYS_nfsservctl: Int = 42
public const val SYS_oldwait4: Int = 1072
public const val SYS_openat: Int = 56
public const val SYS_open_by_handle_at: Int = 265
public const val SYS_open: Int = 1024
public const val SYS_pause: Int = 1061
public const val SYS_perf_event_open: Int = 241
public const val SYS_personality: Int = 92
public const val SYS_pipe2: Int = 59
public const val SYS_pipe: Int = 1040
public const val SYS_pivot_root: Int = 41
public const val SYS_poll: Int = 1068
public const val SYS_ppoll: Int = 73
public const val SYS_prctl: Int = 167
public const val SYS_pread64: Int = 67
public const val SYS_preadv: Int = 69
public const val SYS_prlimit64: Int = 261
public const val SYS_process_vm_readv: Int = 270
public const val SYS_process_vm_writev: Int = 271
public const val SYS_pselect6: Int = 72
public const val SYS_ptrace: Int = 117
public const val SYS_pwrite64: Int = 68
public const val SYS_pwritev: Int = 70
public const val SYS_quotactl: Int = 60
public const val SYS_readahead: Int = 213
public const val SYS_read: Int = 63
public const val SYS_readlinkat: Int = 78
public const val SYS_readlink: Int = 1035
public const val SYS_readv: Int = 65
public const val SYS_reboot: Int = 142
public const val SYS_recv: Int = 1073
public const val SYS_recvfrom: Int = 207
public const val SYS_recvmmsg: Int = 243
public const val SYS_recvmsg: Int = 212
public const val SYS_remap_file_pages: Int = 234
public const val SYS_removexattr: Int = 14
public const val SYS_renameat2: Int = 276
public const val SYS_renameat: Int = 38
public const val SYS_rename: Int = 1034
public const val SYS_request_key: Int = 218
public const val SYS_restart_syscall: Int = 128
public const val SYS_rmdir: Int = 1031
public const val SYS_rt_sigaction: Int = 134
public const val SYS_rt_sigpending: Int = 136
public const val SYS_rt_sigprocmask: Int = 135
public const val SYS_rt_sigqueueinfo: Int = 138
public const val SYS_rt_sigreturn: Int = 139
public const val SYS_rt_sigsuspend: Int = 133
public const val SYS_rt_sigtimedwait: Int = 137
public const val SYS_rt_tgsigqueueinfo: Int = 240
public const val SYS_sched_getaffinity: Int = 123
public const val SYS_sched_getattr: Int = 275
public const val SYS_sched_getparam: Int = 121
public const val SYS_sched_get_priority_max: Int = 125
public const val SYS_sched_get_priority_min: Int = 126
public const val SYS_sched_getscheduler: Int = 120
public const val SYS_sched_rr_get_interval: Int = 127
public const val SYS_sched_setaffinity: Int = 122
public const val SYS_sched_setattr: Int = 274
public const val SYS_sched_setparam: Int = 118
public const val SYS_sched_setscheduler: Int = 119
public const val SYS_sched_yield: Int = 124
public const val SYS_seccomp: Int = 277
public const val SYS_select: Int = 1067
public const val SYS_semctl: Int = 191
public const val SYS_semget: Int = 190
public const val SYS_semop: Int = 193
public const val SYS_semtimedop: Int = 192
public const val SYS_send: Int = 1074
public const val SYS_sendfile64: Int = 71
public const val SYS_sendfile: Int = 71
public const val SYS_sendmmsg: Int = 269
public const val SYS_sendmsg: Int = 211
public const val SYS_sendto: Int = 206
public const val SYS_setdomainname: Int = 162
public const val SYS_setfsgid: Int = 152
public const val SYS_setfsuid: Int = 151
public const val SYS_setgid: Int = 144
public const val SYS_setgroups: Int = 159
public const val SYS_sethostname: Int = 161
public const val SYS_setitimer: Int = 103
public const val SYS_set_mempolicy: Int = 237
public const val SYS_setns: Int = 268
public const val SYS_setpgid: Int = 154
public const val SYS_setpriority: Int = 140
public const val SYS_setregid: Int = 143
public const val SYS_setresgid: Int = 149
public const val SYS_setresuid: Int = 147
public const val SYS_setreuid: Int = 145
public const val SYS_setrlimit: Int = 164
public const val SYS_set_robust_list: Int = 99
public const val SYS_setsid: Int = 157
public const val SYS_setsockopt: Int = 208
public const val SYS_set_tid_address: Int = 96
public const val SYS_settimeofday: Int = 170
public const val SYS_setuid: Int = 146
public const val SYS_setxattr: Int = 5
public const val SYS_shmat: Int = 196
public const val SYS_shmctl: Int = 195
public const val SYS_shmdt: Int = 197
public const val SYS_shmget: Int = 194
public const val SYS_shutdown: Int = 210
public const val SYS_sigaltstack: Int = 132
public const val SYS_signalfd4: Int = 74
public const val SYS_signalfd: Int = 1045
public const val SYS_socket: Int = 198
public const val SYS_socketpair: Int = 199
public const val SYS_splice: Int = 76
public const val SYS_stat64: Int = 1038
public const val SYS_stat: Int = 1038
public const val SYS_statfs64: Int = 43
public const val SYS_swapoff: Int = 225
public const val SYS_swapon: Int = 224
public const val SYS_symlinkat: Int = 36
public const val SYS_symlink: Int = 1036
public const val SYS_sync: Int = 81
public const val SYS_sync_file_range2: Int = 84
public const val SYS_sync_file_range: Int = 84
public const val SYS_syncfs: Int = 267
public const val SYS_syscalls: Int = 1080
public const val SYS__sysctl: Int = 1078
public const val SYS_sysinfo: Int = 179
public const val SYS_syslog: Int = 116
public const val SYS_tee: Int = 77
public const val SYS_tgkill: Int = 131
public const val SYS_time: Int = 1062
public const val SYS_timer_create: Int = 107
public const val SYS_timer_delete: Int = 111
public const val SYS_timerfd_create: Int = 85
public const val SYS_timerfd_gettime: Int = 87
public const val SYS_timerfd_settime: Int = 86
public const val SYS_timer_getoverrun: Int = 109
public const val SYS_timer_gettime: Int = 108
public const val SYS_timer_settime: Int = 110
public const val SYS_times: Int = 153
public const val SYS_tkill: Int = 130
public const val SYS_truncate64: Int = 45
public const val SYS_truncate: Int = 45
public const val SYS_umask: Int = 166
public const val SYS_umount2: Int = 39
public const val SYS_umount: Int = 1076
public const val SYS_uname: Int = 160
public const val SYS_unlinkat: Int = 35
public const val SYS_unlink: Int = 1026
public const val SYS_unshare: Int = 97
public const val SYS_uselib: Int = 1077
public const val SYS_ustat: Int = 1070
public const val SYS_utime: Int = 1063
public const val SYS_utimensat: Int = 88
public const val SYS_utimes: Int = 1037
public const val SYS_vfork: Int = 1071
public const val SYS_vhangup: Int = 58
public const val SYS_vmsplice: Int = 75
public const val SYS_wait4: Int = 260
public const val SYS_waitid: Int = 95
public const val SYS_write: Int = 64
public const val SYS_writev: Int = 66
public const val SYS_statx: Int = 291
public const val SYS_pidfd_send_signal: Long = 424
public const val SYS_io_uring_setup: Long = 425
public const val SYS_io_uring_enter: Long = 426
public const val SYS_io_uring_register: Long = 427
public const val SYS_open_tree: Long = 428
public const val SYS_move_mount: Long = 429
public const val SYS_fsopen: Long = 430
public const val SYS_fsconfig: Long = 431
public const val SYS_fsmount: Long = 432
public const val SYS_fspick: Long = 433
public const val SYS_pidfd_open: Long = 434
public const val SYS_clone3: Long = 435
public const val SYS_close_range: Long = 436
public const val SYS_openat2: Long = 437
public const val SYS_pidfd_getfd: Long = 438
public const val SYS_faccessat2: Long = 439
public const val SYS_process_madvise: Long = 440
public const val SYS_epoll_pwait2: Long = 441
public const val SYS_mount_setattr: Long = 442
public const val TIOCM_LOOP: Int = 32768
public const val TIOCM_OUT1: Int = 8192
public const val TIOCM_OUT2: Int = 16384
public const val TIOCSER_TEMT: Int = 1
public const val TOSTOP: Int = 256
public const val VEOF: Int = 4
public const val VEOL2: Int = 16
public const val VEOL: Int = 11
public const val VMIN: Int = 6
