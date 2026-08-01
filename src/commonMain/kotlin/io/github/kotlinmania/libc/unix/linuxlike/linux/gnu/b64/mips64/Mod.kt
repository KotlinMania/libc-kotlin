// port-lint: source unix/linux_like/linux/gnu/b64/mips64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.mips64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public typealias BlksizeT = Long
public typealias NlinkT = ULong
public typealias SusecondsT = Long
public typealias WcharT = Int
public typealias U64 = CULong
public typealias S64 = CLong

public data class Stat(
    val stDev: CULong,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val stSize: OffT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
)

public data class Statfs(
    val fType: CLong,
    val fBsize: CLong,
    val fFrsize: CLong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fFiles: FsblkcntT,
    val fFfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFsid: FsidT,
    val fNamelen: CLong,
    val fSpare: LongArray,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Flock64(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: Off64T,
    val lLen: Off64T,
    val lPid: PidT,
)

public data class Stat64(
    val stDev: CULong,
    val stIno: Ino64T,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val stSize: Off64T,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
)

public data class Statfs64(
    val fType: CLong,
    val fBsize: CLong,
    val fFrsize: CLong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fBavail: ULong,
    val fFsid: FsidT,
    val fNamelen: CLong,
    val fFlags: CLong,
    val fSpare: LongArray,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class PthreadAttrT(
    val size: ULongArray,
)

public data class Sigaction(
    val saFlags: CInt,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saRestorer: (() -> Unit)?,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
)

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUInt,
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
    val shmNattch: ShmattT,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public const val SYS_read: CLong = 5000 + 0
public const val SYS_write: CLong = 5000 + 1
public const val SYS_open: CLong = 5000 + 2
public const val SYS_close: CLong = 5000 + 3
public const val SYS_stat: CLong = 5000 + 4
public const val SYS_fstat: CLong = 5000 + 5
public const val SYS_lstat: CLong = 5000 + 6
public const val SYS_poll: CLong = 5000 + 7
public const val SYS_lseek: CLong = 5000 + 8
public const val SYS_mmap: CLong = 5000 + 9
public const val SYS_mprotect: CLong = 5000 + 10
public const val SYS_munmap: CLong = 5000 + 11
public const val SYS_brk: CLong = 5000 + 12
public const val SYS_rt_sigaction: CLong = 5000 + 13
public const val SYS_rt_sigprocmask: CLong = 5000 + 14
public const val SYS_ioctl: CLong = 5000 + 15
public const val SYS_pread64: CLong = 5000 + 16
public const val SYS_pwrite64: CLong = 5000 + 17
public const val SYS_readv: CLong = 5000 + 18
public const val SYS_writev: CLong = 5000 + 19
public const val SYS_access: CLong = 5000 + 20
public const val SYS_pipe: CLong = 5000 + 21
public const val SYS__newselect: CLong = 5000 + 22
public const val SYS_sched_yield: CLong = 5000 + 23
public const val SYS_mremap: CLong = 5000 + 24
public const val SYS_msync: CLong = 5000 + 25
public const val SYS_mincore: CLong = 5000 + 26
public const val SYS_madvise: CLong = 5000 + 27
public const val SYS_shmget: CLong = 5000 + 28
public const val SYS_shmat: CLong = 5000 + 29
public const val SYS_shmctl: CLong = 5000 + 30
public const val SYS_dup: CLong = 5000 + 31
public const val SYS_dup2: CLong = 5000 + 32
public const val SYS_pause: CLong = 5000 + 33
public const val SYS_nanosleep: CLong = 5000 + 34
public const val SYS_getitimer: CLong = 5000 + 35
public const val SYS_setitimer: CLong = 5000 + 36
public const val SYS_alarm: CLong = 5000 + 37
public const val SYS_getpid: CLong = 5000 + 38
public const val SYS_sendfile: CLong = 5000 + 39
public const val SYS_socket: CLong = 5000 + 40
public const val SYS_connect: CLong = 5000 + 41
public const val SYS_accept: CLong = 5000 + 42
public const val SYS_sendto: CLong = 5000 + 43
public const val SYS_recvfrom: CLong = 5000 + 44
public const val SYS_sendmsg: CLong = 5000 + 45
public const val SYS_recvmsg: CLong = 5000 + 46
public const val SYS_shutdown: CLong = 5000 + 47
public const val SYS_bind: CLong = 5000 + 48
public const val SYS_listen: CLong = 5000 + 49
public const val SYS_getsockname: CLong = 5000 + 50
public const val SYS_getpeername: CLong = 5000 + 51
public const val SYS_socketpair: CLong = 5000 + 52
public const val SYS_setsockopt: CLong = 5000 + 53
public const val SYS_getsockopt: CLong = 5000 + 54
public const val SYS_clone: CLong = 5000 + 55
public const val SYS_fork: CLong = 5000 + 56
public const val SYS_execve: CLong = 5000 + 57
public const val SYS_exit: CLong = 5000 + 58
public const val SYS_wait4: CLong = 5000 + 59
public const val SYS_kill: CLong = 5000 + 60
public const val SYS_uname: CLong = 5000 + 61
public const val SYS_semget: CLong = 5000 + 62
public const val SYS_semop: CLong = 5000 + 63
public const val SYS_semctl: CLong = 5000 + 64
public const val SYS_shmdt: CLong = 5000 + 65
public const val SYS_msgget: CLong = 5000 + 66
public const val SYS_msgsnd: CLong = 5000 + 67
public const val SYS_msgrcv: CLong = 5000 + 68
public const val SYS_msgctl: CLong = 5000 + 69
public const val SYS_fcntl: CLong = 5000 + 70
public const val SYS_flock: CLong = 5000 + 71
public const val SYS_fsync: CLong = 5000 + 72
public const val SYS_fdatasync: CLong = 5000 + 73
public const val SYS_truncate: CLong = 5000 + 74
public const val SYS_ftruncate: CLong = 5000 + 75
public const val SYS_getdents: CLong = 5000 + 76
public const val SYS_getcwd: CLong = 5000 + 77
public const val SYS_chdir: CLong = 5000 + 78
public const val SYS_fchdir: CLong = 5000 + 79
public const val SYS_rename: CLong = 5000 + 80
public const val SYS_mkdir: CLong = 5000 + 81
public const val SYS_rmdir: CLong = 5000 + 82
public const val SYS_creat: CLong = 5000 + 83
public const val SYS_link: CLong = 5000 + 84
public const val SYS_unlink: CLong = 5000 + 85
public const val SYS_symlink: CLong = 5000 + 86
public const val SYS_readlink: CLong = 5000 + 87
public const val SYS_chmod: CLong = 5000 + 88
public const val SYS_fchmod: CLong = 5000 + 89
public const val SYS_chown: CLong = 5000 + 90
public const val SYS_fchown: CLong = 5000 + 91
public const val SYS_lchown: CLong = 5000 + 92
public const val SYS_umask: CLong = 5000 + 93
public const val SYS_gettimeofday: CLong = 5000 + 94
public const val SYS_getrlimit: CLong = 5000 + 95
public const val SYS_getrusage: CLong = 5000 + 96
public const val SYS_sysinfo: CLong = 5000 + 97
public const val SYS_times: CLong = 5000 + 98
public const val SYS_ptrace: CLong = 5000 + 99
public const val SYS_getuid: CLong = 5000 + 100
public const val SYS_syslog: CLong = 5000 + 101
public const val SYS_getgid: CLong = 5000 + 102
public const val SYS_setuid: CLong = 5000 + 103
public const val SYS_setgid: CLong = 5000 + 104
public const val SYS_geteuid: CLong = 5000 + 105
public const val SYS_getegid: CLong = 5000 + 106
public const val SYS_setpgid: CLong = 5000 + 107
public const val SYS_getppid: CLong = 5000 + 108
public const val SYS_getpgrp: CLong = 5000 + 109
public const val SYS_setsid: CLong = 5000 + 110
public const val SYS_setreuid: CLong = 5000 + 111
public const val SYS_setregid: CLong = 5000 + 112
public const val SYS_getgroups: CLong = 5000 + 113
public const val SYS_setgroups: CLong = 5000 + 114
public const val SYS_setresuid: CLong = 5000 + 115
public const val SYS_getresuid: CLong = 5000 + 116
public const val SYS_setresgid: CLong = 5000 + 117
public const val SYS_getresgid: CLong = 5000 + 118
public const val SYS_getpgid: CLong = 5000 + 119
public const val SYS_setfsuid: CLong = 5000 + 120
public const val SYS_setfsgid: CLong = 5000 + 121
public const val SYS_getsid: CLong = 5000 + 122
public const val SYS_capget: CLong = 5000 + 123
public const val SYS_capset: CLong = 5000 + 124
public const val SYS_rt_sigpending: CLong = 5000 + 125
public const val SYS_rt_sigtimedwait: CLong = 5000 + 126
public const val SYS_rt_sigqueueinfo: CLong = 5000 + 127
public const val SYS_rt_sigsuspend: CLong = 5000 + 128
public const val SYS_sigaltstack: CLong = 5000 + 129
public const val SYS_utime: CLong = 5000 + 130
public const val SYS_mknod: CLong = 5000 + 131
public const val SYS_personality: CLong = 5000 + 132
public const val SYS_ustat: CLong = 5000 + 133
public const val SYS_statfs: CLong = 5000 + 134
public const val SYS_fstatfs: CLong = 5000 + 135
public const val SYS_sysfs: CLong = 5000 + 136
public const val SYS_getpriority: CLong = 5000 + 137
public const val SYS_setpriority: CLong = 5000 + 138
public const val SYS_sched_setparam: CLong = 5000 + 139
public const val SYS_sched_getparam: CLong = 5000 + 140
public const val SYS_sched_setscheduler: CLong = 5000 + 141
public const val SYS_sched_getscheduler: CLong = 5000 + 142
public const val SYS_sched_get_priority_max: CLong = 5000 + 143
public const val SYS_sched_get_priority_min: CLong = 5000 + 144
public const val SYS_sched_rr_get_interval: CLong = 5000 + 145
public const val SYS_mlock: CLong = 5000 + 146
public const val SYS_munlock: CLong = 5000 + 147
public const val SYS_mlockall: CLong = 5000 + 148
public const val SYS_munlockall: CLong = 5000 + 149
public const val SYS_vhangup: CLong = 5000 + 150
public const val SYS_pivot_root: CLong = 5000 + 151
public const val SYS__sysctl: CLong = 5000 + 152
public const val SYS_prctl: CLong = 5000 + 153
public const val SYS_adjtimex: CLong = 5000 + 154
public const val SYS_setrlimit: CLong = 5000 + 155
public const val SYS_chroot: CLong = 5000 + 156
public const val SYS_sync: CLong = 5000 + 157
public const val SYS_acct: CLong = 5000 + 158
public const val SYS_settimeofday: CLong = 5000 + 159
public const val SYS_mount: CLong = 5000 + 160
public const val SYS_umount2: CLong = 5000 + 161
public const val SYS_swapon: CLong = 5000 + 162
public const val SYS_swapoff: CLong = 5000 + 163
public const val SYS_reboot: CLong = 5000 + 164
public const val SYS_sethostname: CLong = 5000 + 165
public const val SYS_setdomainname: CLong = 5000 + 166
public const val SYS_create_module: CLong = 5000 + 167
public const val SYS_init_module: CLong = 5000 + 168
public const val SYS_delete_module: CLong = 5000 + 169
public const val SYS_get_kernel_syms: CLong = 5000 + 170
public const val SYS_query_module: CLong = 5000 + 171
public const val SYS_quotactl: CLong = 5000 + 172
public const val SYS_nfsservctl: CLong = 5000 + 173
public const val SYS_getpmsg: CLong = 5000 + 174
public const val SYS_putpmsg: CLong = 5000 + 175
public const val SYS_afs_syscall: CLong = 5000 + 176
public const val SYS_gettid: CLong = 5000 + 178
public const val SYS_readahead: CLong = 5000 + 179
public const val SYS_setxattr: CLong = 5000 + 180
public const val SYS_lsetxattr: CLong = 5000 + 181
public const val SYS_fsetxattr: CLong = 5000 + 182
public const val SYS_getxattr: CLong = 5000 + 183
public const val SYS_lgetxattr: CLong = 5000 + 184
public const val SYS_fgetxattr: CLong = 5000 + 185
public const val SYS_listxattr: CLong = 5000 + 186
public const val SYS_llistxattr: CLong = 5000 + 187
public const val SYS_flistxattr: CLong = 5000 + 188
public const val SYS_removexattr: CLong = 5000 + 189
public const val SYS_lremovexattr: CLong = 5000 + 190
public const val SYS_fremovexattr: CLong = 5000 + 191
public const val SYS_tkill: CLong = 5000 + 192
public const val SYS_futex: CLong = 5000 + 194
public const val SYS_sched_setaffinity: CLong = 5000 + 195
public const val SYS_sched_getaffinity: CLong = 5000 + 196
public const val SYS_cacheflush: CLong = 5000 + 197
public const val SYS_cachectl: CLong = 5000 + 198
public const val SYS_sysmips: CLong = 5000 + 199
public const val SYS_io_setup: CLong = 5000 + 200
public const val SYS_io_destroy: CLong = 5000 + 201
public const val SYS_io_getevents: CLong = 5000 + 202
public const val SYS_io_submit: CLong = 5000 + 203
public const val SYS_io_cancel: CLong = 5000 + 204
public const val SYS_exit_group: CLong = 5000 + 205
public const val SYS_lookup_dcookie: CLong = 5000 + 206
public const val SYS_epoll_create: CLong = 5000 + 207
public const val SYS_epoll_ctl: CLong = 5000 + 208
public const val SYS_epoll_wait: CLong = 5000 + 209
public const val SYS_remap_file_pages: CLong = 5000 + 210
public const val SYS_rt_sigreturn: CLong = 5000 + 211
public const val SYS_set_tid_address: CLong = 5000 + 212
public const val SYS_restart_syscall: CLong = 5000 + 213
public const val SYS_semtimedop: CLong = 5000 + 214
public const val SYS_fadvise64: CLong = 5000 + 215
public const val SYS_timer_create: CLong = 5000 + 216
public const val SYS_timer_settime: CLong = 5000 + 217
public const val SYS_timer_gettime: CLong = 5000 + 218
public const val SYS_timer_getoverrun: CLong = 5000 + 219
public const val SYS_timer_delete: CLong = 5000 + 220
public const val SYS_clock_settime: CLong = 5000 + 221
public const val SYS_clock_gettime: CLong = 5000 + 222
public const val SYS_clock_getres: CLong = 5000 + 223
public const val SYS_clock_nanosleep: CLong = 5000 + 224
public const val SYS_tgkill: CLong = 5000 + 225
public const val SYS_utimes: CLong = 5000 + 226
public const val SYS_mbind: CLong = 5000 + 227
public const val SYS_get_mempolicy: CLong = 5000 + 228
public const val SYS_set_mempolicy: CLong = 5000 + 229
public const val SYS_mq_open: CLong = 5000 + 230
public const val SYS_mq_unlink: CLong = 5000 + 231
public const val SYS_mq_timedsend: CLong = 5000 + 232
public const val SYS_mq_timedreceive: CLong = 5000 + 233
public const val SYS_mq_notify: CLong = 5000 + 234
public const val SYS_mq_getsetattr: CLong = 5000 + 235
public const val SYS_vserver: CLong = 5000 + 236
public const val SYS_waitid: CLong = 5000 + 237
public const val SYS_sys_setaltroot: CLong = 5000 + 238
public const val SYS_add_key: CLong = 5000 + 239
public const val SYS_request_key: CLong = 5000 + 240
public const val SYS_keyctl: CLong = 5000 + 241
public const val SYS_set_thread_area: CLong = 5000 + 242
public const val SYS_inotify_init: CLong = 5000 + 243
public const val SYS_inotify_add_watch: CLong = 5000 + 244
public const val SYS_inotify_rm_watch: CLong = 5000 + 245
public const val SYS_migrate_pages: CLong = 5000 + 246
public const val SYS_openat: CLong = 5000 + 247
public const val SYS_mkdirat: CLong = 5000 + 248
public const val SYS_mknodat: CLong = 5000 + 249
public const val SYS_fchownat: CLong = 5000 + 250
public const val SYS_futimesat: CLong = 5000 + 251
public const val SYS_newfstatat: CLong = 5000 + 252
public const val SYS_unlinkat: CLong = 5000 + 253
public const val SYS_renameat: CLong = 5000 + 254
public const val SYS_linkat: CLong = 5000 + 255
public const val SYS_symlinkat: CLong = 5000 + 256
public const val SYS_readlinkat: CLong = 5000 + 257
public const val SYS_fchmodat: CLong = 5000 + 258
public const val SYS_faccessat: CLong = 5000 + 259
public const val SYS_pselect6: CLong = 5000 + 260
public const val SYS_ppoll: CLong = 5000 + 261
public const val SYS_unshare: CLong = 5000 + 262
public const val SYS_splice: CLong = 5000 + 263
public const val SYS_sync_file_range: CLong = 5000 + 264
public const val SYS_tee: CLong = 5000 + 265
public const val SYS_vmsplice: CLong = 5000 + 266
public const val SYS_move_pages: CLong = 5000 + 267
public const val SYS_set_robust_list: CLong = 5000 + 268
public const val SYS_get_robust_list: CLong = 5000 + 269
public const val SYS_kexec_load: CLong = 5000 + 270
public const val SYS_getcpu: CLong = 5000 + 271
public const val SYS_epoll_pwait: CLong = 5000 + 272
public const val SYS_ioprio_set: CLong = 5000 + 273
public const val SYS_ioprio_get: CLong = 5000 + 274
public const val SYS_utimensat: CLong = 5000 + 275
public const val SYS_signalfd: CLong = 5000 + 276
public const val SYS_timerfd: CLong = 5000 + 277
public const val SYS_eventfd: CLong = 5000 + 278
public const val SYS_fallocate: CLong = 5000 + 279
public const val SYS_timerfd_create: CLong = 5000 + 280
public const val SYS_timerfd_gettime: CLong = 5000 + 281
public const val SYS_timerfd_settime: CLong = 5000 + 282
public const val SYS_signalfd4: CLong = 5000 + 283
public const val SYS_eventfd2: CLong = 5000 + 284
public const val SYS_epoll_create1: CLong = 5000 + 285
public const val SYS_dup3: CLong = 5000 + 286
public const val SYS_pipe2: CLong = 5000 + 287
public const val SYS_inotify_init1: CLong = 5000 + 288
public const val SYS_preadv: CLong = 5000 + 289
public const val SYS_pwritev: CLong = 5000 + 290
public const val SYS_rt_tgsigqueueinfo: CLong = 5000 + 291
public const val SYS_perf_event_open: CLong = 5000 + 292
public const val SYS_accept4: CLong = 5000 + 293
public const val SYS_recvmmsg: CLong = 5000 + 294
public const val SYS_fanotify_init: CLong = 5000 + 295
public const val SYS_fanotify_mark: CLong = 5000 + 296
public const val SYS_prlimit64: CLong = 5000 + 297
public const val SYS_name_to_handle_at: CLong = 5000 + 298
public const val SYS_open_by_handle_at: CLong = 5000 + 299
public const val SYS_clock_adjtime: CLong = 5000 + 300
public const val SYS_syncfs: CLong = 5000 + 301
public const val SYS_sendmmsg: CLong = 5000 + 302
public const val SYS_setns: CLong = 5000 + 303
public const val SYS_process_vm_readv: CLong = 5000 + 304
public const val SYS_process_vm_writev: CLong = 5000 + 305
public const val SYS_kcmp: CLong = 5000 + 306
public const val SYS_finit_module: CLong = 5000 + 307
public const val SYS_getdents64: CLong = 5000 + 308
public const val SYS_sched_setattr: CLong = 5000 + 309
public const val SYS_sched_getattr: CLong = 5000 + 310
public const val SYS_renameat2: CLong = 5000 + 311
public const val SYS_seccomp: CLong = 5000 + 312
public const val SYS_getrandom: CLong = 5000 + 313
public const val SYS_memfd_create: CLong = 5000 + 314
public const val SYS_bpf: CLong = 5000 + 315
public const val SYS_execveat: CLong = 5000 + 316
public const val SYS_userfaultfd: CLong = 5000 + 317
public const val SYS_membarrier: CLong = 5000 + 318
public const val SYS_mlock2: CLong = 5000 + 319
public const val SYS_copy_file_range: CLong = 5000 + 320
public const val SYS_preadv2: CLong = 5000 + 321
public const val SYS_pwritev2: CLong = 5000 + 322
public const val SYS_pkey_mprotect: CLong = 5000 + 323
public const val SYS_pkey_alloc: CLong = 5000 + 324
public const val SYS_pkey_free: CLong = 5000 + 325
public const val SYS_statx: CLong = 5000 + 326
public const val SYS_rseq: CLong = 5000 + 327
public const val SYS_pidfd_send_signal: CLong = 5000 + 424
public const val SYS_io_uring_setup: CLong = 5000 + 425
public const val SYS_io_uring_enter: CLong = 5000 + 426
public const val SYS_io_uring_register: CLong = 5000 + 427
public const val SYS_open_tree: CLong = 5000 + 428
public const val SYS_move_mount: CLong = 5000 + 429
public const val SYS_fsopen: CLong = 5000 + 430
public const val SYS_fsconfig: CLong = 5000 + 431
public const val SYS_fsmount: CLong = 5000 + 432
public const val SYS_fspick: CLong = 5000 + 433
public const val SYS_pidfd_open: CLong = 5000 + 434
public const val SYS_clone3: CLong = 5000 + 435
public const val SYS_close_range: CLong = 5000 + 436
public const val SYS_openat2: CLong = 5000 + 437
public const val SYS_pidfd_getfd: CLong = 5000 + 438
public const val SYS_faccessat2: CLong = 5000 + 439
public const val SYS_process_madvise: CLong = 5000 + 440
public const val SYS_epoll_pwait2: CLong = 5000 + 441
public const val SYS_mount_setattr: CLong = 5000 + 442
public const val SYS_quotactl_fd: CLong = 5000 + 443
public const val SYS_landlock_create_ruleset: CLong = 5000 + 444
public const val SYS_landlock_add_rule: CLong = 5000 + 445
public const val SYS_landlock_restrict_self: CLong = 5000 + 446
public const val SYS_memfd_secret: CLong = 5000 + 447
public const val SYS_process_mrelease: CLong = 5000 + 448
public const val SYS_futex_waitv: CLong = 5000 + 449
public const val SYS_set_mempolicy_home_node: CLong = 5000 + 450
public const val SFD_CLOEXEC: CInt = 0x080000
public const val NCCS: ULong = 32uL
public const val O_TRUNC: CInt = 512
public const val O_NOATIME: CInt = 262144
public const val O_CLOEXEC: CInt = 0x80000
public const val O_PATH: CInt = 2097152
public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EDOTDOT: CInt = 73
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_RESETHAND: CInt = -2147483648
public const val SA_RESTART: CInt = 0x10000000
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EFD_CLOEXEC: CInt = 0x80000
public const val O_DIRECT: CInt = 0x8000
public const val O_DIRECTORY: CInt = 0x10000
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_APPEND: CInt = 8
public const val O_CREAT: CInt = 256
public const val O_EXCL: CInt = 1024
public const val O_NOCTTY: CInt = 2048
public const val O_NONBLOCK: CInt = 128
public const val O_SYNC: CInt = 0x4010
public const val O_RSYNC: CInt = 0x4010
public const val O_DSYNC: CInt = 0x10
public const val O_FSYNC: CInt = 0x4010
public const val O_ASYNC: CInt = 0x1000
public const val O_NDELAY: CInt = 0x80
public const val EDEADLK: CInt = 45
public const val ENAMETOOLONG: CInt = 78
public const val ENOLCK: CInt = 46
public const val ENOSYS: CInt = 89
public const val ENOTEMPTY: CInt = 93
public const val ELOOP: CInt = 90
public const val ENOMSG: CInt = 35
public const val EIDRM: CInt = 36
public const val ECHRNG: CInt = 37
public const val EL2NSYNC: CInt = 38
public const val EL3HLT: CInt = 39
public const val EL3RST: CInt = 40
public const val ELNRNG: CInt = 41
public const val EUNATCH: CInt = 42
public const val ENOCSI: CInt = 43
public const val EL2HLT: CInt = 44
public const val EBADE: CInt = 50
public const val EBADR: CInt = 51
public const val EXFULL: CInt = 52
public const val ENOANO: CInt = 53
public const val EBADRQC: CInt = 54
public const val EBADSLT: CInt = 55
public const val EDEADLOCK: CInt = 56
public const val EMULTIHOP: CInt = 74
public const val EOVERFLOW: CInt = 79
public const val ENOTUNIQ: CInt = 80
public const val EBADFD: CInt = 81
public const val EBADMSG: CInt = 77
public const val EREMCHG: CInt = 82
public const val ELIBACC: CInt = 83
public const val ELIBBAD: CInt = 84
public const val ELIBSCN: CInt = 85
public const val ELIBMAX: CInt = 86
public const val ELIBEXEC: CInt = 87
public const val EILSEQ: CInt = 88
public const val ERESTART: CInt = 91
public const val ESTRPIPE: CInt = 92
public const val EUSERS: CInt = 94
public const val ENOTSOCK: CInt = 95
public const val EDESTADDRREQ: CInt = 96
public const val EMSGSIZE: CInt = 97
public const val EPROTOTYPE: CInt = 98
public const val ENOPROTOOPT: CInt = 99
public const val EPROTONOSUPPORT: CInt = 120
public const val ESOCKTNOSUPPORT: CInt = 121
public const val EOPNOTSUPP: CInt = 122
public const val EPFNOSUPPORT: CInt = 123
public const val EAFNOSUPPORT: CInt = 124
public const val EADDRINUSE: CInt = 125
public const val EADDRNOTAVAIL: CInt = 126
public const val ENETDOWN: CInt = 127
public const val ENETUNREACH: CInt = 128
public const val ENETRESET: CInt = 129
public const val ECONNABORTED: CInt = 130
public const val ECONNRESET: CInt = 131
public const val ENOBUFS: CInt = 132
public const val EISCONN: CInt = 133
public const val ENOTCONN: CInt = 134
public const val ESHUTDOWN: CInt = 143
public const val ETOOMANYREFS: CInt = 144
public const val ETIMEDOUT: CInt = 145
public const val ECONNREFUSED: CInt = 146
public const val EHOSTDOWN: CInt = 147
public const val EHOSTUNREACH: CInt = 148
public const val EALREADY: CInt = 149
public const val EINPROGRESS: CInt = 150
public const val ESTALE: CInt = 151
public const val EUCLEAN: CInt = 135
public const val ENOTNAM: CInt = 137
public const val ENAVAIL: CInt = 138
public const val EISNAM: CInt = 139
public const val EREMOTEIO: CInt = 140
public const val EDQUOT: CInt = 1133
public const val ENOMEDIUM: CInt = 159
public const val EMEDIUMTYPE: CInt = 160
public const val ECANCELED: CInt = 158
public const val ENOKEY: CInt = 161
public const val EKEYEXPIRED: CInt = 162
public const val EKEYREVOKED: CInt = 163
public const val EKEYREJECTED: CInt = 164
public const val EOWNERDEAD: CInt = 165
public const val ENOTRECOVERABLE: CInt = 166
public const val ERFKILL: CInt = 167
public const val MAP_NORESERVE: CInt = 0x400
public const val MAP_ANON: CInt = 0x800
public const val MAP_ANONYMOUS: CInt = 0x800
public const val MAP_GROWSDOWN: CInt = 0x1000
public const val MAP_DENYWRITE: CInt = 0x2000
public const val MAP_EXECUTABLE: CInt = 0x4000
public const val MAP_LOCKED: CInt = 0x8000
public const val MAP_POPULATE: CInt = 0x10000
public const val MAP_NONBLOCK: CInt = 0x20000
public const val MAP_STACK: CInt = 0x40000
public const val MAP_HUGETLB: CInt = 0x080000
public const val SOCK_STREAM: CInt = 2
public const val SOCK_DGRAM: CInt = 1
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_SIGINFO: CInt = 0x00000008
public const val SA_NOCLDWAIT: CInt = 0x00010000
public const val SIGEMT: CInt = 7
public const val SIGCHLD: CInt = 18
public const val SIGBUS: CInt = 10
public const val SIGTTIN: CInt = 26
public const val SIGTTOU: CInt = 27
public const val SIGXCPU: CInt = 30
public const val SIGXFSZ: CInt = 31
public const val SIGVTALRM: CInt = 28
public const val SIGPROF: CInt = 29
public const val SIGWINCH: CInt = 20
public const val SIGUSR1: CInt = 16
public const val SIGUSR2: CInt = 17
public const val SIGCONT: CInt = 25
public const val SIGSTOP: CInt = 23
public const val SIGTSTP: CInt = 24
public const val SIGURG: CInt = 21
public const val SIGIO: CInt = 22
public const val SIGSYS: CInt = 12
public const val SIGPOLL: CInt = 22
public const val SIGPWR: CInt = 19
public const val SIG_SETMASK: CInt = 3
public const val SIG_BLOCK: CInt = 0x1
public const val SIG_UNBLOCK: CInt = 0x2
public const val POLLWRNORM: CShort = 0x004
public const val POLLWRBAND: CShort = 0x100
public const val VEOF: ULong = 16uL
public const val VEOL: ULong = 17uL
public const val VEOL2: ULong = 6uL
public const val VMIN: ULong = 4uL
public const val IEXTEN: TcflagT = 0x00000100u
public const val TOSTOP: TcflagT = 0x00008000u
public const val FLUSHO: TcflagT = 0x00002000u
public const val EXTPROC: TcflagT = 65536u
public const val TCSANOW: CInt = 0x540e
public const val TCSADRAIN: CInt = 0x540f
public const val TCSAFLUSH: CInt = 0x5410
public const val PTRACE_GETFPREGS: CUInt = 14u
public const val PTRACE_SETFPREGS: CUInt = 15u
public const val PTRACE_DETACH: CUInt = 17u
public const val PTRACE_GETFPXREGS: CUInt = 18u
public const val PTRACE_SETFPXREGS: CUInt = 19u
public const val PTRACE_GETREGS: CUInt = 12u
public const val PTRACE_SETREGS: CUInt = 13u
public const val EFD_NONBLOCK: CInt = 0x80
public const val F_RDLCK: CInt = 0
public const val F_WRLCK: CInt = 1
public const val F_UNLCK: CInt = 2
public const val F_GETLK: CInt = 14
public const val F_GETOWN: CInt = 23
public const val F_SETOWN: CInt = 24
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val SFD_NONBLOCK: CInt = 0x80
public const val RTLD_DEEPBIND: CInt = 0x10
public const val RTLD_GLOBAL: CInt = 0x4
public const val RTLD_NOLOAD: CInt = 0x8
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val CBAUD: TcflagT = 4111u
public const val TAB1: TcflagT = 0x00000800u
public const val TAB2: TcflagT = 0x00001000u
public const val TAB3: TcflagT = 0x00001800u
public const val CR1: TcflagT = 0x00000200u
public const val CR2: TcflagT = 0x00000400u
public const val CR3: TcflagT = 0x00000600u
public const val FF1: TcflagT = 0x00008000u
public const val BS1: TcflagT = 0x00002000u
public const val VT1: TcflagT = 0x00004000u
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IXON: TcflagT = 0x00000400u
public const val IXOFF: TcflagT = 0x00001000u
public const val ONLCR: TcflagT = 0x4u
public const val CSIZE: TcflagT = 0x00000030u
public const val CS6: TcflagT = 0x00000010u
public const val CS7: TcflagT = 0x00000020u
public const val CS8: TcflagT = 0x00000030u
public const val CSTOPB: TcflagT = 0x00000040u
public const val CREAD: TcflagT = 0x00000080u
public const val PARENB: TcflagT = 0x00000100u
public const val PARODD: TcflagT = 0x00000200u
public const val HUPCL: TcflagT = 0x00000400u
public const val CLOCAL: TcflagT = 0x00000800u
public const val ECHOKE: TcflagT = 0x00000800u
public const val ECHOE: TcflagT = 0x00000010u
public const val ECHOK: TcflagT = 0x00000020u
public const val ECHONL: TcflagT = 0x00000040u
public const val ECHOPRT: TcflagT = 0x00000400u
public const val ECHOCTL: TcflagT = 0x00000200u
public const val ISIG: TcflagT = 0x00000001u
public const val ICANON: TcflagT = 0x00000002u
public const val PENDIN: TcflagT = 0x00004000u
public const val NOFLSH: TcflagT = 0x00000080u
public const val CIBAUD: TcflagT = 269418496u
public const val CBAUDEX: TcflagT = 4096u
public const val VSWTC: ULong = 7uL
public const val OLCUC: TcflagT = 2u
public const val NLDLY: TcflagT = 256u
public const val CRDLY: TcflagT = 1536u
public const val TABDLY: TcflagT = 6144u
public const val BSDLY: TcflagT = 8192u
public const val FFDLY: TcflagT = 32768u
public const val VTDLY: TcflagT = 16384u
public const val XTABS: TcflagT = 6144u
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 1u
public const val B75: SpeedT = 2u
public const val B110: SpeedT = 3u
public const val B134: SpeedT = 4u
public const val B150: SpeedT = 5u
public const val B200: SpeedT = 6u
public const val B300: SpeedT = 7u
public const val B600: SpeedT = 8u
public const val B1200: SpeedT = 9u
public const val B1800: SpeedT = 10u
public const val B2400: SpeedT = 11u
public const val B4800: SpeedT = 12u
public const val B9600: SpeedT = 13u
public const val B19200: SpeedT = 14u
public const val B38400: SpeedT = 15u
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val B57600: SpeedT = 4097u
public const val B115200: SpeedT = 4098u
public const val B230400: SpeedT = 4099u
public const val B460800: SpeedT = 4100u
public const val B500000: SpeedT = 4101u
public const val B576000: SpeedT = 4102u
public const val B921600: SpeedT = 4103u
public const val B1000000: SpeedT = 4104u
public const val B1152000: SpeedT = 4105u
public const val B1500000: SpeedT = 4106u
public const val B2000000: SpeedT = 4107u
public const val B2500000: SpeedT = 4108u
public const val B3000000: SpeedT = 4109u
public const val B3500000: SpeedT = 4110u
public const val B4000000: SpeedT = 4111u
public const val EHWPOISON: CInt = 168

public expect fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt
