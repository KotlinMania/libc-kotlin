// port-lint: source unix/linux_like/linux/uclibc/mips/mips32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32
import io.github.kotlinmania.libc.unix.Sigval

import io.github.kotlinmania.libc.*

public typealias ClockT = Int
public typealias TimeT = Int
public typealias SusecondsT = Int
public typealias WcharT = Int
public typealias OffT = Int
public typealias InoT = UInt
public typealias BlkcntT = Int
public typealias BlksizeT = Int
public typealias NlinkT = UInt
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias U64 = CULongLong
public typealias S64 = CLongLong
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stPad2: LongArray,
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

public data class Stat64(
    val stDev: DevT,
    val stIno: Ino64T,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
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

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFavail: Fsfilcnt64T,
    val fFsid: CULong,
    val fUnused: CInt,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class PthreadAttrT(
    val size: UIntArray,
)

public data class Sigaction(
    val saFlags: CUInt,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val restorer: COpaquePointer?,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class SigsetT(
    val `val`: ULongArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val pad: IntArray,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
) {
    public fun siAddr(): COpaquePointer? = siAddr
    public fun siValue(): Sigval? = siValue
    public fun siPid(): PidT = siPid ?: 0
    public fun siUid(): UidT = siUid ?: 0u
    public fun siStatus(): CInt = siStatus ?: 0
    public fun siUtime(): CLong = siUtime ?: 0L
    public fun siStime(): CLong = siStime ?: 0L
}

public data class Glob64T(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
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

public data class Statfs64(
    val fType: CLong,
    val fBsize: CLong,
    val fFrsize: CLong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fFiles: Fsblkcnt64T,
    val fFfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFsid: FsidT,
    val fNamelen: CLong,
    val fFlags: CLong,
    val fSpare: LongArray,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lSysid: CLong,
    val lPid: PidT,
)

public data class Sysinfo(
    val uptime: CLong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
    val f: ByteArray,
)

public data class SemT(
    val size: ByteArray,
    val size2: ByteArray,
)

public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 36uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 20uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val SYS_syscall: CLong = 4000 + 0
public const val SYS_exit: CLong = 4000 + 1
public const val SYS_fork: CLong = 4000 + 2
public const val SYS_read: CLong = 4000 + 3
public const val SYS_write: CLong = 4000 + 4
public const val SYS_open: CLong = 4000 + 5
public const val SYS_close: CLong = 4000 + 6
public const val SYS_waitpid: CLong = 4000 + 7
public const val SYS_creat: CLong = 4000 + 8
public const val SYS_link: CLong = 4000 + 9
public const val SYS_unlink: CLong = 4000 + 10
public const val SYS_execve: CLong = 4000 + 11
public const val SYS_chdir: CLong = 4000 + 12
public const val SYS_time: CLong = 4000 + 13
public const val SYS_mknod: CLong = 4000 + 14
public const val SYS_chmod: CLong = 4000 + 15
public const val SYS_lchown: CLong = 4000 + 16
public const val SYS_break: CLong = 4000 + 17
public const val SYS_lseek: CLong = 4000 + 19
public const val SYS_getpid: CLong = 4000 + 20
public const val SYS_mount: CLong = 4000 + 21
public const val SYS_umount: CLong = 4000 + 22
public const val SYS_setuid: CLong = 4000 + 23
public const val SYS_getuid: CLong = 4000 + 24
public const val SYS_stime: CLong = 4000 + 25
public const val SYS_ptrace: CLong = 4000 + 26
public const val SYS_alarm: CLong = 4000 + 27
public const val SYS_pause: CLong = 4000 + 29
public const val SYS_utime: CLong = 4000 + 30
public const val SYS_stty: CLong = 4000 + 31
public const val SYS_gtty: CLong = 4000 + 32
public const val SYS_access: CLong = 4000 + 33
public const val SYS_nice: CLong = 4000 + 34
public const val SYS_ftime: CLong = 4000 + 35
public const val SYS_sync: CLong = 4000 + 36
public const val SYS_kill: CLong = 4000 + 37
public const val SYS_rename: CLong = 4000 + 38
public const val SYS_mkdir: CLong = 4000 + 39
public const val SYS_rmdir: CLong = 4000 + 40
public const val SYS_dup: CLong = 4000 + 41
public const val SYS_pipe: CLong = 4000 + 42
public const val SYS_times: CLong = 4000 + 43
public const val SYS_prof: CLong = 4000 + 44
public const val SYS_brk: CLong = 4000 + 45
public const val SYS_setgid: CLong = 4000 + 46
public const val SYS_getgid: CLong = 4000 + 47
public const val SYS_signal: CLong = 4000 + 48
public const val SYS_geteuid: CLong = 4000 + 49
public const val SYS_getegid: CLong = 4000 + 50
public const val SYS_acct: CLong = 4000 + 51
public const val SYS_umount2: CLong = 4000 + 52
public const val SYS_lock: CLong = 4000 + 53
public const val SYS_ioctl: CLong = 4000 + 54
public const val SYS_fcntl: CLong = 4000 + 55
public const val SYS_mpx: CLong = 4000 + 56
public const val SYS_setpgid: CLong = 4000 + 57
public const val SYS_ulimit: CLong = 4000 + 58
public const val SYS_umask: CLong = 4000 + 60
public const val SYS_chroot: CLong = 4000 + 61
public const val SYS_ustat: CLong = 4000 + 62
public const val SYS_dup2: CLong = 4000 + 63
public const val SYS_getppid: CLong = 4000 + 64
public const val SYS_getpgrp: CLong = 4000 + 65
public const val SYS_setsid: CLong = 4000 + 66
public const val SYS_sigaction: CLong = 4000 + 67
public const val SYS_sgetmask: CLong = 4000 + 68
public const val SYS_ssetmask: CLong = 4000 + 69
public const val SYS_setreuid: CLong = 4000 + 70
public const val SYS_setregid: CLong = 4000 + 71
public const val SYS_sigsuspend: CLong = 4000 + 72
public const val SYS_sigpending: CLong = 4000 + 73
public const val SYS_sethostname: CLong = 4000 + 74
public const val SYS_setrlimit: CLong = 4000 + 75
public const val SYS_getrlimit: CLong = 4000 + 76
public const val SYS_getrusage: CLong = 4000 + 77
public const val SYS_gettimeofday: CLong = 4000 + 78
public const val SYS_settimeofday: CLong = 4000 + 79
public const val SYS_getgroups: CLong = 4000 + 80
public const val SYS_setgroups: CLong = 4000 + 81
public const val SYS_symlink: CLong = 4000 + 83
public const val SYS_readlink: CLong = 4000 + 85
public const val SYS_uselib: CLong = 4000 + 86
public const val SYS_swapon: CLong = 4000 + 87
public const val SYS_reboot: CLong = 4000 + 88
public const val SYS_readdir: CLong = 4000 + 89
public const val SYS_mmap: CLong = 4000 + 90
public const val SYS_munmap: CLong = 4000 + 91
public const val SYS_truncate: CLong = 4000 + 92
public const val SYS_ftruncate: CLong = 4000 + 93
public const val SYS_fchmod: CLong = 4000 + 94
public const val SYS_fchown: CLong = 4000 + 95
public const val SYS_getpriority: CLong = 4000 + 96
public const val SYS_setpriority: CLong = 4000 + 97
public const val SYS_profil: CLong = 4000 + 98
public const val SYS_statfs: CLong = 4000 + 99
public const val SYS_fstatfs: CLong = 4000 + 100
public const val SYS_ioperm: CLong = 4000 + 101
public const val SYS_socketcall: CLong = 4000 + 102
public const val SYS_syslog: CLong = 4000 + 103
public const val SYS_setitimer: CLong = 4000 + 104
public const val SYS_getitimer: CLong = 4000 + 105
public const val SYS_stat: CLong = 4000 + 106
public const val SYS_lstat: CLong = 4000 + 107
public const val SYS_fstat: CLong = 4000 + 108
public const val SYS_iopl: CLong = 4000 + 110
public const val SYS_vhangup: CLong = 4000 + 111
public const val SYS_idle: CLong = 4000 + 112
public const val SYS_vm86: CLong = 4000 + 113
public const val SYS_wait4: CLong = 4000 + 114
public const val SYS_swapoff: CLong = 4000 + 115
public const val SYS_sysinfo: CLong = 4000 + 116
public const val SYS_ipc: CLong = 4000 + 117
public const val SYS_fsync: CLong = 4000 + 118
public const val SYS_sigreturn: CLong = 4000 + 119
public const val SYS_clone: CLong = 4000 + 120
public const val SYS_setdomainname: CLong = 4000 + 121
public const val SYS_uname: CLong = 4000 + 122
public const val SYS_modify_ldt: CLong = 4000 + 123
public const val SYS_adjtimex: CLong = 4000 + 124
public const val SYS_mprotect: CLong = 4000 + 125
public const val SYS_sigprocmask: CLong = 4000 + 126
public const val SYS_create_module: CLong = 4000 + 127
public const val SYS_init_module: CLong = 4000 + 128
public const val SYS_delete_module: CLong = 4000 + 129
public const val SYS_get_kernel_syms: CLong = 4000 + 130
public const val SYS_quotactl: CLong = 4000 + 131
public const val SYS_getpgid: CLong = 4000 + 132
public const val SYS_fchdir: CLong = 4000 + 133
public const val SYS_bdflush: CLong = 4000 + 134
public const val SYS_sysfs: CLong = 4000 + 135
public const val SYS_personality: CLong = 4000 + 136
public const val SYS_afs_syscall: CLong = 4000 + 137
public const val SYS_setfsuid: CLong = 4000 + 138
public const val SYS_setfsgid: CLong = 4000 + 139
public const val SYS__llseek: CLong = 4000 + 140
public const val SYS_getdents: CLong = 4000 + 141
public const val SYS__newselect: CLong = 4000 + 142
public const val SYS_flock: CLong = 4000 + 143
public const val SYS_msync: CLong = 4000 + 144
public const val SYS_readv: CLong = 4000 + 145
public const val SYS_writev: CLong = 4000 + 146
public const val SYS_cacheflush: CLong = 4000 + 147
public const val SYS_cachectl: CLong = 4000 + 148
public const val SYS_sysmips: CLong = 4000 + 149
public const val SYS_getsid: CLong = 4000 + 151
public const val SYS_fdatasync: CLong = 4000 + 152
public const val SYS__sysctl: CLong = 4000 + 153
public const val SYS_mlock: CLong = 4000 + 154
public const val SYS_munlock: CLong = 4000 + 155
public const val SYS_mlockall: CLong = 4000 + 156
public const val SYS_munlockall: CLong = 4000 + 157
public const val SYS_sched_setparam: CLong = 4000 + 158
public const val SYS_sched_getparam: CLong = 4000 + 159
public const val SYS_sched_setscheduler: CLong = 4000 + 160
public const val SYS_sched_getscheduler: CLong = 4000 + 161
public const val SYS_sched_yield: CLong = 4000 + 162
public const val SYS_sched_get_priority_max: CLong = 4000 + 163
public const val SYS_sched_get_priority_min: CLong = 4000 + 164
public const val SYS_sched_rr_get_interval: CLong = 4000 + 165
public const val SYS_nanosleep: CLong = 4000 + 166
public const val SYS_mremap: CLong = 4000 + 167
public const val SYS_accept: CLong = 4000 + 168
public const val SYS_bind: CLong = 4000 + 169
public const val SYS_connect: CLong = 4000 + 170
public const val SYS_getpeername: CLong = 4000 + 171
public const val SYS_getsockname: CLong = 4000 + 172
public const val SYS_getsockopt: CLong = 4000 + 173
public const val SYS_listen: CLong = 4000 + 174
public const val SYS_recv: CLong = 4000 + 175
public const val SYS_recvfrom: CLong = 4000 + 176
public const val SYS_recvmsg: CLong = 4000 + 177
public const val SYS_send: CLong = 4000 + 178
public const val SYS_sendmsg: CLong = 4000 + 179
public const val SYS_sendto: CLong = 4000 + 180
public const val SYS_setsockopt: CLong = 4000 + 181
public const val SYS_shutdown: CLong = 4000 + 182
public const val SYS_socket: CLong = 4000 + 183
public const val SYS_socketpair: CLong = 4000 + 184
public const val SYS_setresuid: CLong = 4000 + 185
public const val SYS_getresuid: CLong = 4000 + 186
public const val SYS_query_module: CLong = 4000 + 187
public const val SYS_poll: CLong = 4000 + 188
public const val SYS_nfsservctl: CLong = 4000 + 189
public const val SYS_setresgid: CLong = 4000 + 190
public const val SYS_getresgid: CLong = 4000 + 191
public const val SYS_prctl: CLong = 4000 + 192
public const val SYS_rt_sigreturn: CLong = 4000 + 193
public const val SYS_rt_sigaction: CLong = 4000 + 194
public const val SYS_rt_sigprocmask: CLong = 4000 + 195
public const val SYS_rt_sigpending: CLong = 4000 + 196
public const val SYS_rt_sigtimedwait: CLong = 4000 + 197
public const val SYS_rt_sigqueueinfo: CLong = 4000 + 198
public const val SYS_rt_sigsuspend: CLong = 4000 + 199
public const val SYS_pread64: CLong = 4000 + 200
public const val SYS_pwrite64: CLong = 4000 + 201
public const val SYS_chown: CLong = 4000 + 202
public const val SYS_getcwd: CLong = 4000 + 203
public const val SYS_capget: CLong = 4000 + 204
public const val SYS_capset: CLong = 4000 + 205
public const val SYS_sigaltstack: CLong = 4000 + 206
public const val SYS_sendfile: CLong = 4000 + 207
public const val SYS_getpmsg: CLong = 4000 + 208
public const val SYS_putpmsg: CLong = 4000 + 209
public const val SYS_mmap2: CLong = 4000 + 210
public const val SYS_truncate64: CLong = 4000 + 211
public const val SYS_ftruncate64: CLong = 4000 + 212
public const val SYS_stat64: CLong = 4000 + 213
public const val SYS_lstat64: CLong = 4000 + 214
public const val SYS_fstat64: CLong = 4000 + 215
public const val SYS_pivot_root: CLong = 4000 + 216
public const val SYS_mincore: CLong = 4000 + 217
public const val SYS_madvise: CLong = 4000 + 218
public const val SYS_getdents64: CLong = 4000 + 219
public const val SYS_fcntl64: CLong = 4000 + 220
public const val SYS_gettid: CLong = 4000 + 222
public const val SYS_readahead: CLong = 4000 + 223
public const val SYS_setxattr: CLong = 4000 + 224
public const val SYS_lsetxattr: CLong = 4000 + 225
public const val SYS_fsetxattr: CLong = 4000 + 226
public const val SYS_getxattr: CLong = 4000 + 227
public const val SYS_lgetxattr: CLong = 4000 + 228
public const val SYS_fgetxattr: CLong = 4000 + 229
public const val SYS_listxattr: CLong = 4000 + 230
public const val SYS_llistxattr: CLong = 4000 + 231
public const val SYS_flistxattr: CLong = 4000 + 232
public const val SYS_removexattr: CLong = 4000 + 233
public const val SYS_lremovexattr: CLong = 4000 + 234
public const val SYS_fremovexattr: CLong = 4000 + 235
public const val SYS_tkill: CLong = 4000 + 236
public const val SYS_sendfile64: CLong = 4000 + 237
public const val SYS_futex: CLong = 4000 + 238
public const val SYS_sched_setaffinity: CLong = 4000 + 239
public const val SYS_sched_getaffinity: CLong = 4000 + 240
public const val SYS_io_setup: CLong = 4000 + 241
public const val SYS_io_destroy: CLong = 4000 + 242
public const val SYS_io_getevents: CLong = 4000 + 243
public const val SYS_io_submit: CLong = 4000 + 244
public const val SYS_io_cancel: CLong = 4000 + 245
public const val SYS_exit_group: CLong = 4000 + 246
public const val SYS_lookup_dcookie: CLong = 4000 + 247
public const val SYS_epoll_create: CLong = 4000 + 248
public const val SYS_epoll_ctl: CLong = 4000 + 249
public const val SYS_epoll_wait: CLong = 4000 + 250
public const val SYS_remap_file_pages: CLong = 4000 + 251
public const val SYS_set_tid_address: CLong = 4000 + 252
public const val SYS_restart_syscall: CLong = 4000 + 253
public const val SYS_fadvise64: CLong = 4000 + 254
public const val SYS_statfs64: CLong = 4000 + 255
public const val SYS_fstatfs64: CLong = 4000 + 256
public const val SYS_timer_create: CLong = 4000 + 257
public const val SYS_timer_settime: CLong = 4000 + 258
public const val SYS_timer_gettime: CLong = 4000 + 259
public const val SYS_timer_getoverrun: CLong = 4000 + 260
public const val SYS_timer_delete: CLong = 4000 + 261
public const val SYS_clock_settime: CLong = 4000 + 262
public const val SYS_clock_gettime: CLong = 4000 + 263
public const val SYS_clock_getres: CLong = 4000 + 264
public const val SYS_clock_nanosleep: CLong = 4000 + 265
public const val SYS_tgkill: CLong = 4000 + 266
public const val SYS_utimes: CLong = 4000 + 267
public const val SYS_mbind: CLong = 4000 + 268
public const val SYS_get_mempolicy: CLong = 4000 + 269
public const val SYS_set_mempolicy: CLong = 4000 + 270
public const val SYS_mq_open: CLong = 4000 + 271
public const val SYS_mq_unlink: CLong = 4000 + 272
public const val SYS_mq_timedsend: CLong = 4000 + 273
public const val SYS_mq_timedreceive: CLong = 4000 + 274
public const val SYS_mq_notify: CLong = 4000 + 275
public const val SYS_mq_getsetattr: CLong = 4000 + 276
public const val SYS_vserver: CLong = 4000 + 277
public const val SYS_waitid: CLong = 4000 + 278
public const val SYS_sys_setaltroot: CLong = 4000 + 279
public const val SYS_add_key: CLong = 4000 + 280
public const val SYS_request_key: CLong = 4000 + 281
public const val SYS_keyctl: CLong = 4000 + 282
public const val SYS_set_thread_area: CLong = 4000 + 283
public const val SYS_inotify_init: CLong = 4000 + 284
public const val SYS_inotify_add_watch: CLong = 4000 + 285
public const val SYS_inotify_rm_watch: CLong = 4000 + 286
public const val SYS_migrate_pages: CLong = 4000 + 287
public const val SYS_openat: CLong = 4000 + 288
public const val SYS_mkdirat: CLong = 4000 + 289
public const val SYS_mknodat: CLong = 4000 + 290
public const val SYS_fchownat: CLong = 4000 + 291
public const val SYS_futimesat: CLong = 4000 + 292
public const val SYS_fstatat64: CLong = 4000 + 293
public const val SYS_unlinkat: CLong = 4000 + 294
public const val SYS_renameat: CLong = 4000 + 295
public const val SYS_linkat: CLong = 4000 + 296
public const val SYS_symlinkat: CLong = 4000 + 297
public const val SYS_readlinkat: CLong = 4000 + 298
public const val SYS_fchmodat: CLong = 4000 + 299
public const val SYS_faccessat: CLong = 4000 + 300
public const val SYS_pselect6: CLong = 4000 + 301
public const val SYS_ppoll: CLong = 4000 + 302
public const val SYS_unshare: CLong = 4000 + 303
public const val SYS_splice: CLong = 4000 + 304
public const val SYS_sync_file_range: CLong = 4000 + 305
public const val SYS_tee: CLong = 4000 + 306
public const val SYS_vmsplice: CLong = 4000 + 307
public const val SYS_move_pages: CLong = 4000 + 308
public const val SYS_set_robust_list: CLong = 4000 + 309
public const val SYS_get_robust_list: CLong = 4000 + 310
public const val SYS_kexec_load: CLong = 4000 + 311
public const val SYS_getcpu: CLong = 4000 + 312
public const val SYS_epoll_pwait: CLong = 4000 + 313
public const val SYS_ioprio_set: CLong = 4000 + 314
public const val SYS_ioprio_get: CLong = 4000 + 315
public const val SYS_utimensat: CLong = 4000 + 316
public const val SYS_signalfd: CLong = 4000 + 317
public const val SYS_timerfd: CLong = 4000 + 318
public const val SYS_eventfd: CLong = 4000 + 319
public const val SYS_fallocate: CLong = 4000 + 320
public const val SYS_timerfd_create: CLong = 4000 + 321
public const val SYS_timerfd_gettime: CLong = 4000 + 322
public const val SYS_timerfd_settime: CLong = 4000 + 323
public const val SYS_signalfd4: CLong = 4000 + 324
public const val SYS_eventfd2: CLong = 4000 + 325
public const val SYS_epoll_create1: CLong = 4000 + 326
public const val SYS_dup3: CLong = 4000 + 327
public const val SYS_pipe2: CLong = 4000 + 328
public const val SYS_inotify_init1: CLong = 4000 + 329
public const val SYS_preadv: CLong = 4000 + 330
public const val SYS_pwritev: CLong = 4000 + 331
public const val SYS_rt_tgsigqueueinfo: CLong = 4000 + 332
public const val SYS_perf_event_open: CLong = 4000 + 333
public const val SYS_accept4: CLong = 4000 + 334
public const val SYS_recvmmsg: CLong = 4000 + 335
public const val SYS_fanotify_init: CLong = 4000 + 336
public const val SYS_fanotify_mark: CLong = 4000 + 337
public const val SYS_prlimit64: CLong = 4000 + 338
public const val SYS_name_to_handle_at: CLong = 4000 + 339
public const val SYS_open_by_handle_at: CLong = 4000 + 340
public const val SYS_clock_adjtime: CLong = 4000 + 341
public const val SYS_syncfs: CLong = 4000 + 342
public const val SYS_sendmmsg: CLong = 4000 + 343
public const val SYS_setns: CLong = 4000 + 344
public const val SYS_process_vm_readv: CLong = 4000 + 345
public const val SYS_process_vm_writev: CLong = 4000 + 346
public const val SYS_kcmp: CLong = 4000 + 347
public const val SYS_finit_module: CLong = 4000 + 348
public const val SYS_sched_setattr: CLong = 4000 + 349
public const val SYS_sched_getattr: CLong = 4000 + 350
public const val SYS_renameat2: CLong = 4000 + 351
public const val SYS_seccomp: CLong = 4000 + 352
public const val SYS_getrandom: CLong = 4000 + 353
public const val SYS_memfd_create: CLong = 4000 + 354
public const val SYS_bpf: CLong = 4000 + 355
public const val SYS_execveat: CLong = 4000 + 356
public const val SYS_userfaultfd: CLong = 4000 + 357
public const val SYS_membarrier: CLong = 4000 + 358
public const val SYS_mlock2: CLong = 4000 + 359
public const val SYS_copy_file_range: CLong = 4000 + 360
public const val SYS_preadv2: CLong = 4000 + 361
public const val SYS_pwritev2: CLong = 4000 + 362
public const val SYS_pkey_mprotect: CLong = 4000 + 363
public const val SYS_pkey_alloc: CLong = 4000 + 364
public const val SYS_pkey_free: CLong = 4000 + 365
public const val SYS_statx: CLong = 4000 + 366
public const val SYS_pidfd_send_signal: CLong = 4000 + 424
public const val SYS_io_uring_setup: CLong = 4000 + 425
public const val SYS_io_uring_enter: CLong = 4000 + 426
public const val SYS_io_uring_register: CLong = 4000 + 427
public const val SYS_open_tree: CLong = 4000 + 428
public const val SYS_move_mount: CLong = 4000 + 429
public const val SYS_fsopen: CLong = 4000 + 430
public const val SYS_fsconfig: CLong = 4000 + 431
public const val SYS_fsmount: CLong = 4000 + 432
public const val SYS_fspick: CLong = 4000 + 433
public const val SYS_pidfd_open: CLong = 4000 + 434
public const val SYS_clone3: CLong = 4000 + 435
public const val SYS_close_range: CLong = 4000 + 436
public const val SYS_openat2: CLong = 4000 + 437
public const val SYS_pidfd_getfd: CLong = 4000 + 438
public const val SYS_faccessat2: CLong = 4000 + 439
public const val SYS_process_madvise: CLong = 4000 + 440
public const val SYS_epoll_pwait2: CLong = 4000 + 441
public const val SYS_mount_setattr: CLong = 4000 + 442
public const val SYS_quotactl_fd: CLong = 4000 + 443
public const val SYS_landlock_create_ruleset: CLong = 4000 + 444
public const val SYS_landlock_add_rule: CLong = 4000 + 445
public const val SYS_landlock_restrict_self: CLong = 4000 + 446
public const val SYS_memfd_secret: CLong = 4000 + 447
public const val SYS_process_mrelease: CLong = 4000 + 448
public const val SYS_futex_waitv: CLong = 4000 + 449
public const val SYS_set_mempolicy_home_node: CLong = 4000 + 450

public expect fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt

public expect fun globfree64(pglob: Glob64T?)

public expect fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt

public expect fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt
