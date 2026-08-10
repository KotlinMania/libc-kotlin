// port-lint: source unix/linux_like/linux/musl/b32/powerpc.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*


public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cLine: CcT,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
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
    val seq: CInt,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmSegsz: ULong,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: CULong,
    val shmAtime2: TimeT,
    val shmDtime2: TimeT,
    val shmCtime2: TimeT,
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
    val msgStime2: TimeT,
    val msgRtime2: TimeT,
    val msgCtime2: TimeT,
)

public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MCL_CURRENT: CInt = 0x2000
public const val MCL_FUTURE: CInt = 0x4000
public const val MCL_ONFAULT: CInt = 0x8000
public const val CBAUD: TcflagT = 255u
public const val TAB1: CInt = 0x00000400
public const val TAB2: CInt = 0x00000800
public const val TAB3: CInt = 0x00000C00
public const val CR1: CInt = 0x00001000
public const val CR2: CInt = 0x00002000
public const val CR3: CInt = 0x00003000
public const val FF1: CInt = 0x00004000
public const val BS1: CInt = 0x00008000
public const val VT1: CInt = 0x00010000
public const val VWERASE: ULong = 10uL
public const val VREPRINT: ULong = 11uL
public const val VSUSP: ULong = 12uL
public const val VSTART: ULong = 13uL
public const val VSTOP: ULong = 14uL
public const val VDISCARD: ULong = 16uL
public const val VTIME: ULong = 7uL
public const val IXON: TcflagT = 0x00000200u
public const val IXOFF: TcflagT = 0x00000400u
public const val ONLCR: TcflagT = 0x00000002u
public const val CSIZE: TcflagT = 0x00000300u
public const val CS6: TcflagT = 0x00000100u
public const val CS7: TcflagT = 0x00000200u
public const val CS8: TcflagT = 0x00000300u
public const val CSTOPB: TcflagT = 0x00000400u
public const val CREAD: TcflagT = 0x00000800u
public const val PARENB: TcflagT = 0x00001000u
public const val PARODD: TcflagT = 0x00002000u
public const val HUPCL: TcflagT = 0x00004000u
public const val CLOCAL: TcflagT = 0x00008000u
public const val ECHOKE: TcflagT = 0x00000001u
public const val ECHOE: TcflagT = 0x00000002u
public const val ECHOK: TcflagT = 0x00000004u
public const val ECHONL: TcflagT = 0x00000010u
public const val ECHOPRT: TcflagT = 0x00000020u
public const val ECHOCTL: TcflagT = 0x00000040u
public const val ISIG: TcflagT = 0x00000080u
public const val ICANON: TcflagT = 0x00000100u
public const val PENDIN: TcflagT = 0x20000000u
public const val NOFLSH: TcflagT = 0x80000000u
public const val CIBAUD: TcflagT = 16711680u
public const val CBAUDEX: TcflagT = 16u
public const val VSWTC: ULong = 9uL
public const val OLCUC: TcflagT = 4u
public const val NLDLY: TcflagT = 768u
public const val CRDLY: TcflagT = 12288u
public const val TABDLY: TcflagT = 3072u
public const val BSDLY: TcflagT = 32768u
public const val FFDLY: TcflagT = 16384u
public const val VTDLY: TcflagT = 65536u
public const val XTABS: TcflagT = 3072u
public const val B57600: SpeedT = 16u
public const val B115200: SpeedT = 17u
public const val B230400: SpeedT = 18u
public const val B460800: SpeedT = 19u
public const val B500000: SpeedT = 20u
public const val B576000: SpeedT = 21u
public const val B921600: SpeedT = 22u
public const val B1000000: SpeedT = 23u
public const val B1152000: SpeedT = 24u
public const val B1500000: SpeedT = 25u
public const val B2000000: SpeedT = 26u
public const val B2500000: SpeedT = 27u
public const val B3000000: SpeedT = 28u
public const val B3500000: SpeedT = 29u
public const val B4000000: SpeedT = 30u
public const val O_RSYNC: CInt = 1052672
public const val MAP_SYNC: CInt = 0x080000
public const val PTRACE_SYSEMU: CInt = 0x1d
public const val PTRACE_SYSEMU_SINGLESTEP: CInt = 0x1e
public const val EBADFD: CInt = 77
public const val EPROTOTYPE: CInt = 91
public const val EPROTONOSUPPORT: CInt = 93
public const val EREMOTEIO: CInt = 121
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val SYS_waitpid: CLong = 7
public const val SYS_break: CLong = 17
public const val SYS_oldstat: CLong = 18
public const val SYS_stime: CLong = 25
public const val SYS_oldfstat: CLong = 28
public const val SYS_stty: CLong = 31
public const val SYS_gtty: CLong = 32
public const val SYS_nice: CLong = 34
public const val SYS_ftime: CLong = 35
public const val SYS_prof: CLong = 44
public const val SYS_signal: CLong = 48
public const val SYS_lock: CLong = 53
public const val SYS_mpx: CLong = 56
public const val SYS_ulimit: CLong = 58
public const val SYS_oldolduname: CLong = 59
public const val SYS_sigaction: CLong = 67
public const val SYS_sgetmask: CLong = 68
public const val SYS_ssetmask: CLong = 69
public const val SYS_sigsuspend: CLong = 72
public const val SYS_sigpending: CLong = 73
public const val SYS_oldlstat: CLong = 84
public const val SYS_readdir: CLong = 89
public const val SYS_mmap: CLong = 90
public const val SYS_profil: CLong = 98
public const val SYS_statfs: CLong = 99
public const val SYS_ioperm: CLong = 101
public const val SYS_socketcall: CLong = 102
public const val SYS_fstat: CLong = 108
public const val SYS_olduname: CLong = 109
public const val SYS_iopl: CLong = 110
public const val SYS_idle: CLong = 112
public const val SYS_vm86: CLong = 113
public const val SYS_ipc: CLong = 117
public const val SYS_sigreturn: CLong = 119
public const val SYS_modify_ldt: CLong = 123
public const val SYS_sigprocmask: CLong = 126
public const val SYS_create_module: CLong = 127
public const val SYS_get_kernel_syms: CLong = 130
public const val SYS_sysfs: CLong = 135
public const val SYS_afs_syscall: CLong = 137
public const val SYS__newselect: CLong = 142
public const val SYS_query_module: CLong = 166
public const val SYS_getpmsg: CLong = 187
public const val SYS_putpmsg: CLong = 188
public const val SYS_ugetrlimit: CLong = 190
public const val SYS_pciconfig_read: CLong = 198
public const val SYS_pciconfig_write: CLong = 199
public const val SYS_pciconfig_iobase: CLong = 200
public const val SYS_multiplexer: CLong = 201
public const val SYS_tuxcall: CLong = 225
public const val SYS_fadvise64: CLong = 233
public const val SYS_swapcontext: CLong = 249
public const val SYS_rtas: CLong = 255
public const val SYS_sys_debug_setcontext: CLong = 256
public const val SYS_spu_run: CLong = 278
public const val SYS_spu_create: CLong = 279
public const val SYS_subpage_prot: CLong = 310
public const val SYS_switch_endian: CLong = 363
public const val SYS_userfaultfd: CLong = 364
public const val SYS_membarrier: CLong = 365
public const val SYS_mlock2: CLong = 378
public const val SYS_preadv2: CLong = 380
public const val SYS_pwritev2: CLong = 381
public const val SYS_kexec_file_load: CLong = 382
public const val SYS_pkey_alloc: CLong = 384
public const val SYS_pkey_free: CLong = 385
public const val SYS_pkey_mprotect: CLong = 386
public const val SYS_quotactl_fd: CLong = 443
public const val SYS_landlock_create_ruleset: CLong = 444
public const val SYS_landlock_add_rule: CLong = 445
public const val SYS_landlock_restrict_self: CLong = 446
public const val SYS_memfd_secret: CLong = 447
public const val SYS_process_mrelease: CLong = 448
public const val SYS_futex_waitv: CLong = 449
public const val SYS_set_mempolicy_home_node: CLong = 450
public const val SYS_mseal: CLong = 462
