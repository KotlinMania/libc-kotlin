// port-lint: source unix/linux_like/linux/musl/b32/hexagon.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*

public typealias WcharT = UInt
public typealias Stat64 = Stat

public data class Stat(
    val stDev: DevT,
    val stIno: CULongLong,
    val stMode: CUInt,
    val stNlink: CUInt,
    val stUid: CUInt,
    val stGid: CUInt,
    val stRdev: CULongLong,
    val stSize: CLongLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class IpcPerm(
    val key: KeyT,
    val ipcPermKey: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUShort,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: CULong,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: CULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
)

public const val AF_FILE: CInt = 1
public const val AF_KCM: CInt = 41
public const val AF_MAX: CInt = 43
public const val AF_QIPCRTR: CInt = 42
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val EAFNOSUPPORT: CInt = 97
public const val EALREADY: CInt = 114
public const val EBADE: CInt = 52
public const val EBADMSG: CInt = 74
public const val EBADR: CInt = 53
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val ECANCELED: CInt = 125
public const val ECHRNG: CInt = 44
public const val ECONNABORTED: CInt = 103
public const val ECONNREFUSED: CInt = 111
public const val ECONNRESET: CInt = 104
public const val EDEADLK: CInt = 35
public const val EDEADLOCK: CInt = 35
public const val EDESTADDRREQ: CInt = 89
public const val EDQUOT: CInt = 122
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EHWPOISON: CInt = 133
public const val EIDRM: CInt = 43
public const val EILSEQ: CInt = 84
public const val EINPROGRESS: CInt = 115
public const val EISCONN: CInt = 106
public const val EISNAM: CInt = 120
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREJECTED: CInt = 129
public const val EKEYREVOKED: CInt = 128
public const val EL2HLT: CInt = 51
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBEXEC: CInt = 83
public const val ELIBMAX: CInt = 82
public const val ELIBSCN: CInt = 81
public const val ELNRNG: CInt = 48
public const val ELOOP: CInt = 40
public const val EMEDIUMTYPE: CInt = 124
public const val EMSGSIZE: CInt = 90
public const val EMULTIHOP: CInt = 72
public const val ENAMETOOLONG: CInt = 36
public const val ENAVAIL: CInt = 119
public const val ENETDOWN: CInt = 100
public const val ENETRESET: CInt = 102
public const val ENETUNREACH: CInt = 101
public const val ENOANO: CInt = 55
public const val ENOBUFS: CInt = 105
public const val ENOCSI: CInt = 50
public const val ENOKEY: CInt = 126
public const val ENOLCK: CInt = 37
public const val ENOMEDIUM: CInt = 123
public const val ENOMSG: CInt = 42
public const val ENOPROTOOPT: CInt = 92
public const val ENOSYS: CInt = 38
public const val ENOTCONN: CInt = 107
public const val ENOTEMPTY: CInt = 39
public const val ENOTNAM: CInt = 118
public const val ENOTRECOVERABLE: CInt = 131
public const val ENOTSOCK: CInt = 88
public const val ENOTSUP: CInt = 95
public const val ENOTUNIQ: CInt = 76
public const val EOPNOTSUPP: CInt = 95
public const val EOVERFLOW: CInt = 75
public const val EOWNERDEAD: CInt = 130
public const val EPFNOSUPPORT: CInt = 96
public const val EREMCHG: CInt = 78
public const val ERESTART: CInt = 85
public const val ERFKILL: CInt = 132
public const val ESHUTDOWN: CInt = 108
public const val ESOCKTNOSUPPORT: CInt = 94
public const val ESTALE: CInt = 116
public const val ESTRPIPE: CInt = 86
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val EUCLEAN: CInt = 117
public const val EUNATCH: CInt = 49
public const val EUSERS: CInt = 87
public const val EXFULL: CInt = 54
public const val EXTPROC: CInt = 65536
public const val F_EXLCK: CInt = 4
public const val F_GETLK: CInt = 12
public const val F_GETOWN: CInt = 9
public const val F_GETOWNER_UIDS: CInt = 17
public const val F_GETOWN_EX: CInt = 16
public const val F_GETSIG: CInt = 11
public const val F_LINUX_SPECIFIC_BASE: CInt = 1024
public const val FLUSHO: CInt = 4096
public const val F_OWNER_PGRP: CInt = 2
public const val F_OWNER_PID: CInt = 1
public const val F_OWNER_TID: CInt = 0
public const val F_SETLK: CInt = 13
public const val F_SETLKW: CInt = 14
public const val F_SETOWN: CInt = 8
public const val F_SETOWN_EX: CInt = 15
public const val F_SETSIG: CInt = 10
public const val F_SHLCK: CInt = 8
public const val IEXTEN: CInt = 32768
public const val MAP_ANON: CInt = 32
public const val MAP_DENYWRITE: CInt = 2048
public const val MAP_EXECUTABLE: CInt = 4096
public const val MAP_GROWSDOWN: CInt = 256
public const val MAP_HUGETLB: CInt = 262144
public const val MAP_LOCKED: CInt = 8192
public const val MAP_NONBLOCK: CInt = 65536
public const val MAP_NORESERVE: CInt = 16384
public const val MAP_POPULATE: CInt = 32768
public const val MAP_STACK: CInt = 131072
public const val MAP_UNINITIALIZED: CInt = 0
public const val O_APPEND: CInt = 1024
public const val O_ASYNC: CInt = 8192
public const val O_CREAT: CInt = 64
public const val O_DIRECT: CInt = 16384
public const val O_DIRECTORY: CInt = 65536
public const val O_DSYNC: CInt = 4096
public const val O_EXCL: CInt = 128
public const val O_LARGEFILE: CInt = 32768
public const val O_NOCTTY: CInt = 256
public const val O_NOFOLLOW: CInt = 131072
public const val O_NONBLOCK: CInt = 2048
public const val O_SYNC: CInt = 1052672
public const val PF_FILE: CInt = 1
public const val PF_KCM: CInt = 41
public const val PF_MAX: CInt = 43
public const val PF_QIPCRTR: CInt = 42
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_SIGINFO: CInt = 0x00000004
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SIGBUS: CInt = 7
public const val SIGCHLD: CInt = 17
public const val SIGCONT: CInt = 18
public const val SIGIO: CInt = 29
public const val SIGPOLL: CInt = 29
public const val SIGPROF: CInt = 27
public const val SIGPWR: CInt = 30
public const val SIGSTKFLT: CInt = 16
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val SIGSTOP: CInt = 19
public const val SIGSYS: CInt = 31
public const val SIGTSTP: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGURG: CInt = 23
public const val SIGUSR1: CInt = 10
public const val SIGUSR2: CInt = 12
public const val SIGVTALRM: CInt = 26
public const val SIGWINCH: CInt = 28
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0x000000
public const val SIG_UNBLOCK: CInt = 0x01
public const val SOL_CAIF: CInt = 278
public const val SOL_IUCV: CInt = 277
public const val SOL_KCM: CInt = 281
public const val SOL_NFC: CInt = 280
public const val SOL_PNPIPE: CInt = 275
public const val SOL_PPPOL2TP: CInt = 273
public const val SOL_RDS: CInt = 276
public const val SOL_RXRPC: CInt = 272
public const val SYS3264_fadvise64: CInt = 223
public const val SYS3264_fcntl: CInt = 25
public const val SYS3264_fstatat: CInt = 79
public const val SYS3264_fstat: CInt = 80
public const val SYS3264_fstatfs: CInt = 44
public const val SYS3264_ftruncate: CInt = 46
public const val SYS3264_lseek: CInt = 62
public const val SYS3264_lstat: CInt = 1039
public const val SYS3264_mmap: CInt = 222
public const val SYS3264_sendfile: CInt = 71
public const val SYS3264_stat: CInt = 1038
public const val SYS3264_statfs: CInt = 43
public const val SYS3264_truncate: CInt = 45
public const val SYS_accept4: CInt = 242
public const val SYS_accept: CInt = 202
public const val SYS_access: CInt = 1033
public const val SYS_acct: CInt = 89
public const val SYS_add_key: CInt = 217
public const val SYS_adjtimex: CInt = 171
public const val SYS_alarm: CInt = 1059
public const val SYS_arch_specific_syscall: CInt = 244
public const val SYS_bdflush: CInt = 1075
public const val SYS_bind: CInt = 200
public const val SYS_bpf: CInt = 280
public const val SYS_brk: CInt = 214
public const val SYS_capget: CInt = 90
public const val SYS_capset: CInt = 91
public const val SYS_chdir: CInt = 49
public const val SYS_chmod: CInt = 1028
public const val SYS_chown: CInt = 1029
public const val SYS_chroot: CInt = 51
public const val SYS_clock_adjtime: CInt = 266
public const val SYS_clock_getres: CInt = 114
public const val SYS_clock_gettime: CInt = 113
public const val SYS_clock_nanosleep: CInt = 115
public const val SYS_clock_settime: CInt = 112
public const val SYS_clone: CInt = 220
public const val SYS_close: CInt = 57
public const val SYS_connect: CInt = 203
public const val SYS_copy_file_range: CInt = -1
public const val SYS_creat: CInt = 1064
public const val SYS_delete_module: CInt = 106
public const val SYS_dup2: CInt = 1041
public const val SYS_dup3: CInt = 24
public const val SYS_dup: CInt = 23
public const val SYS_epoll_create1: CInt = 20
public const val SYS_epoll_create: CInt = 1042
public const val SYS_epoll_ctl: CInt = 21
public const val SYS_epoll_pwait: CInt = 22
public const val SYS_epoll_wait: CInt = 1069
public const val SYS_eventfd2: CInt = 19
public const val SYS_eventfd: CInt = 1044
public const val SYS_execveat: CInt = 281
public const val SYS_execve: CInt = 221
public const val SYS_exit: CInt = 93
public const val SYS_exit_group: CInt = 94
public const val SYS_faccessat: CInt = 48
public const val SYS_fadvise64_64: CInt = 223
public const val SYS_fallocate: CInt = 47
public const val SYS_fanotify_init: CInt = 262
public const val SYS_fanotify_mark: CInt = 263
public const val SYS_fchdir: CInt = 50
public const val SYS_fchmodat: CInt = 53
public const val SYS_fchmod: CInt = 52
public const val SYS_fchownat: CInt = 54
public const val SYS_fchown: CInt = 55
public const val SYS_fcntl64: CInt = 25
public const val SYS_fcntl: CInt = 25
public const val SYS_fdatasync: CInt = 83
public const val SYS_fgetxattr: CInt = 10
public const val SYS_finit_module: CInt = 273
public const val SYS_flistxattr: CInt = 13
public const val SYS_flock: CInt = 32
public const val SYS_fork: CInt = 1079
public const val SYS_fremovexattr: CInt = 16
public const val SYS_fsetxattr: CInt = 7
public const val SYS_fstat64: CInt = 80
public const val SYS_fstatat64: CInt = 79
public const val SYS_fstatfs64: CInt = 44
public const val SYS_fstatfs: CInt = 44
public const val SYS_fsync: CInt = 82
public const val SYS_ftruncate64: CInt = 46
public const val SYS_ftruncate: CInt = 46
public const val SYS_futex: CInt = 98
public const val SYS_futimesat: CInt = 1066
public const val SYS_getcpu: CInt = 168
public const val SYS_getcwd: CInt = 17
public const val SYS_getdents64: CInt = 61
public const val SYS_getdents: CInt = 1065
public const val SYS_getegid: CInt = 177
public const val SYS_geteuid: CInt = 175
public const val SYS_getgid: CInt = 176
public const val SYS_getgroups: CInt = 158
public const val SYS_getitimer: CInt = 102
public const val SYS_get_mempolicy: CInt = 236
public const val SYS_getpeername: CInt = 205
public const val SYS_getpgid: CInt = 155
public const val SYS_getpgrp: CInt = 1060
public const val SYS_getpid: CInt = 172
public const val SYS_getppid: CInt = 173
public const val SYS_getpriority: CInt = 141
public const val SYS_getrandom: CInt = 278
public const val SYS_getresgid: CInt = 150
public const val SYS_getresuid: CInt = 148
public const val SYS_getrlimit: CInt = 163
public const val SYS_get_robust_list: CInt = 100
public const val SYS_getrusage: CInt = 165
public const val SYS_getsid: CInt = 156
public const val SYS_getsockname: CInt = 204
public const val SYS_getsockopt: CInt = 209
public const val SYS_gettid: CInt = 178
public const val SYS_gettimeofday: CInt = 169
public const val SYS_getuid: CInt = 174
public const val SYS_getxattr: CInt = 8
public const val SYS_init_module: CInt = 105
public const val SYS_inotify_add_watch: CInt = 27
public const val SYS_inotify_init1: CInt = 26
public const val SYS_inotify_init: CInt = 1043
public const val SYS_inotify_rm_watch: CInt = 28
public const val SYS_io_cancel: CInt = 3
public const val SYS_ioctl: CInt = 29
public const val SYS_io_destroy: CInt = 1
public const val SYS_io_getevents: CInt = 4
public const val SYS_ioprio_get: CInt = 31
public const val SYS_ioprio_set: CInt = 30
public const val SYS_io_setup: CInt = 0
public const val SYS_io_submit: CInt = 2
public const val SYS_kcmp: CInt = 272
public const val SYS_kexec_load: CInt = 104
public const val SYS_keyctl: CInt = 219
public const val SYS_kill: CInt = 129
public const val SYS_lchown: CInt = 1032
public const val SYS_lgetxattr: CInt = 9
public const val SYS_linkat: CInt = 37
public const val SYS_link: CInt = 1025
public const val SYS_listen: CInt = 201
public const val SYS_listxattr: CInt = 11
public const val SYS_llistxattr: CInt = 12
public const val SYS__llseek: CInt = 62
public const val SYS_lookup_dcookie: CInt = 18
public const val SYS_lremovexattr: CInt = 15
public const val SYS_lseek: CInt = 62
public const val SYS_lsetxattr: CInt = 6
public const val SYS_lstat64: CInt = 1039
public const val SYS_lstat: CInt = 1039
public const val SYS_madvise: CInt = 233
public const val SYS_mbind: CInt = 235
public const val SYS_memfd_create: CInt = 279
public const val SYS_migrate_pages: CInt = 238
public const val SYS_mincore: CInt = 232
public const val SYS_mkdirat: CInt = 34
public const val SYS_mkdir: CInt = 1030
public const val SYS_mknodat: CInt = 33
public const val SYS_mknod: CInt = 1027
public const val SYS_mlockall: CInt = 230
public const val SYS_mlock: CInt = 228
public const val SYS_mmap2: CInt = 222
public const val SYS_mount: CInt = 40
public const val SYS_move_pages: CInt = 239
public const val SYS_mprotect: CInt = 226
public const val SYS_mq_getsetattr: CInt = 185
public const val SYS_mq_notify: CInt = 184
public const val SYS_mq_open: CInt = 180
public const val SYS_mq_timedreceive: CInt = 183
public const val SYS_mq_timedsend: CInt = 182
public const val SYS_mq_unlink: CInt = 181
public const val SYS_mremap: CInt = 216
public const val SYS_msgctl: CInt = 187
public const val SYS_msgget: CInt = 186
public const val SYS_msgrcv: CInt = 188
public const val SYS_msgsnd: CInt = 189
public const val SYS_msync: CInt = 227
public const val SYS_munlockall: CInt = 231
public const val SYS_munlock: CInt = 229
public const val SYS_munmap: CInt = 215
public const val SYS_name_to_handle_at: CInt = 264
public const val SYS_nanosleep: CInt = 101
public const val SYS_newfstatat: CInt = 79
public const val SYS_nfsservctl: CInt = 42
public const val SYS_oldwait4: CInt = 1072
public const val SYS_openat: CInt = 56
public const val SYS_open_by_handle_at: CInt = 265
public const val SYS_open: CInt = 1024
public const val SYS_pause: CInt = 1061
public const val SYS_perf_event_open: CInt = 241
public const val SYS_personality: CInt = 92
public const val SYS_pipe2: CInt = 59
public const val SYS_pipe: CInt = 1040
public const val SYS_pivot_root: CInt = 41
public const val SYS_poll: CInt = 1068
public const val SYS_ppoll: CInt = 73
public const val SYS_prctl: CInt = 167
public const val SYS_pread64: CInt = 67
public const val SYS_preadv: CInt = 69
public const val SYS_prlimit64: CInt = 261
public const val SYS_process_vm_readv: CInt = 270
public const val SYS_process_vm_writev: CInt = 271
public const val SYS_pselect6: CInt = 72
public const val SYS_ptrace: CInt = 117
public const val SYS_pwrite64: CInt = 68
public const val SYS_pwritev: CInt = 70
public const val SYS_quotactl: CInt = 60
public const val SYS_readahead: CInt = 213
public const val SYS_read: CInt = 63
public const val SYS_readlinkat: CInt = 78
public const val SYS_readlink: CInt = 1035
public const val SYS_readv: CInt = 65
public const val SYS_reboot: CInt = 142
public const val SYS_recv: CInt = 1073
public const val SYS_recvfrom: CInt = 207
public const val SYS_recvmmsg: CInt = 243
public const val SYS_recvmsg: CInt = 212
public const val SYS_remap_file_pages: CInt = 234
public const val SYS_removexattr: CInt = 14
public const val SYS_renameat2: CInt = 276
public const val SYS_renameat: CInt = 38
public const val SYS_rename: CInt = 1034
public const val SYS_request_key: CInt = 218
public const val SYS_restart_syscall: CInt = 128
public const val SYS_rmdir: CInt = 1031
public const val SYS_rt_sigaction: CInt = 134
public const val SYS_rt_sigpending: CInt = 136
public const val SYS_rt_sigprocmask: CInt = 135
public const val SYS_rt_sigqueueinfo: CInt = 138
public const val SYS_rt_sigreturn: CInt = 139
public const val SYS_rt_sigsuspend: CInt = 133
public const val SYS_rt_sigtimedwait: CInt = 137
public const val SYS_rt_tgsigqueueinfo: CInt = 240
public const val SYS_sched_getaffinity: CInt = 123
public const val SYS_sched_getattr: CInt = 275
public const val SYS_sched_getparam: CInt = 121
public const val SYS_sched_get_priority_max: CInt = 125
public const val SYS_sched_get_priority_min: CInt = 126
public const val SYS_sched_getscheduler: CInt = 120
public const val SYS_sched_rr_get_interval: CInt = 127
public const val SYS_sched_setaffinity: CInt = 122
public const val SYS_sched_setattr: CInt = 274
public const val SYS_sched_setparam: CInt = 118
public const val SYS_sched_setscheduler: CInt = 119
public const val SYS_sched_yield: CInt = 124
public const val SYS_seccomp: CInt = 277
public const val SYS_select: CInt = 1067
public const val SYS_semctl: CInt = 191
public const val SYS_semget: CInt = 190
public const val SYS_semop: CInt = 193
public const val SYS_semtimedop: CInt = 192
public const val SYS_send: CInt = 1074
public const val SYS_sendfile64: CInt = 71
public const val SYS_sendfile: CInt = 71
public const val SYS_sendmmsg: CInt = 269
public const val SYS_sendmsg: CInt = 211
public const val SYS_sendto: CInt = 206
public const val SYS_setdomainname: CInt = 162
public const val SYS_setfsgid: CInt = 152
public const val SYS_setfsuid: CInt = 151
public const val SYS_setgid: CInt = 144
public const val SYS_setgroups: CInt = 159
public const val SYS_sethostname: CInt = 161
public const val SYS_setitimer: CInt = 103
public const val SYS_set_mempolicy: CInt = 237
public const val SYS_setns: CInt = 268
public const val SYS_setpgid: CInt = 154
public const val SYS_setpriority: CInt = 140
public const val SYS_setregid: CInt = 143
public const val SYS_setresgid: CInt = 149
public const val SYS_setresuid: CInt = 147
public const val SYS_setreuid: CInt = 145
public const val SYS_setrlimit: CInt = 164
public const val SYS_set_robust_list: CInt = 99
public const val SYS_setsid: CInt = 157
public const val SYS_setsockopt: CInt = 208
public const val SYS_set_tid_address: CInt = 96
public const val SYS_settimeofday: CInt = 170
public const val SYS_setuid: CInt = 146
public const val SYS_setxattr: CInt = 5
public const val SYS_shmat: CInt = 196
public const val SYS_shmctl: CInt = 195
public const val SYS_shmdt: CInt = 197
public const val SYS_shmget: CInt = 194
public const val SYS_shutdown: CInt = 210
public const val SYS_sigaltstack: CInt = 132
public const val SYS_signalfd4: CInt = 74
public const val SYS_signalfd: CInt = 1045
public const val SYS_socket: CInt = 198
public const val SYS_socketpair: CInt = 199
public const val SYS_splice: CInt = 76
public const val SYS_stat64: CInt = 1038
public const val SYS_stat: CInt = 1038
public const val SYS_statfs64: CInt = 43
public const val SYS_swapoff: CInt = 225
public const val SYS_swapon: CInt = 224
public const val SYS_symlinkat: CInt = 36
public const val SYS_symlink: CInt = 1036
public const val SYS_sync: CInt = 81
public const val SYS_sync_file_range2: CInt = 84
public const val SYS_sync_file_range: CInt = 84
public const val SYS_syncfs: CInt = 267
public const val SYS_syscalls: CInt = 1080
public const val SYS__sysctl: CInt = 1078
public const val SYS_sysinfo: CInt = 179
public const val SYS_syslog: CInt = 116
public const val SYS_tee: CInt = 77
public const val SYS_tgkill: CInt = 131
public const val SYS_time: CInt = 1062
public const val SYS_timer_create: CInt = 107
public const val SYS_timer_delete: CInt = 111
public const val SYS_timerfd_create: CInt = 85
public const val SYS_timerfd_gettime: CInt = 87
public const val SYS_timerfd_settime: CInt = 86
public const val SYS_timer_getoverrun: CInt = 109
public const val SYS_timer_gettime: CInt = 108
public const val SYS_timer_settime: CInt = 110
public const val SYS_times: CInt = 153
public const val SYS_tkill: CInt = 130
public const val SYS_truncate64: CInt = 45
public const val SYS_truncate: CInt = 45
public const val SYS_umask: CInt = 166
public const val SYS_umount2: CInt = 39
public const val SYS_umount: CInt = 1076
public const val SYS_uname: CInt = 160
public const val SYS_unlinkat: CInt = 35
public const val SYS_unlink: CInt = 1026
public const val SYS_unshare: CInt = 97
public const val SYS_uselib: CInt = 1077
public const val SYS_ustat: CInt = 1070
public const val SYS_utime: CInt = 1063
public const val SYS_utimensat: CInt = 88
public const val SYS_utimes: CInt = 1037
public const val SYS_vfork: CInt = 1071
public const val SYS_vhangup: CInt = 58
public const val SYS_vmsplice: CInt = 75
public const val SYS_wait4: CInt = 260
public const val SYS_waitid: CInt = 95
public const val SYS_write: CInt = 64
public const val SYS_writev: CInt = 66
public const val SYS_statx: CInt = 291
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
public const val TIOCM_LOOP: CInt = 32768
public const val TIOCM_OUT1: CInt = 8192
public const val TIOCM_OUT2: CInt = 16384
public const val TIOCSER_TEMT: CInt = 1
public const val TOSTOP: CInt = 256
public const val VEOF: CInt = 4
public const val VEOL2: CInt = 16
public const val VEOL: CInt = 11
public const val VMIN: CInt = 6
