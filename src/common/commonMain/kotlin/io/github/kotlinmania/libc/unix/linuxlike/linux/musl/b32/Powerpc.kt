// port-lint: source unix/linux_like/linux/musl/b32/powerpc.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cCc: List<UByte>,
    val cLine: UByte,
    val cIspeed: UInt,
    val cOspeed: UInt,
)

// Stat, StackT, IpcPerm, ShmidDs, MsqidDs are defined in arm/Mod.kt (first definitions in this package).

public const val MADV_SOFT_OFFLINE: Int = 101
public const val MCL_CURRENT: Int = 0x2000
public const val MCL_FUTURE: Int = 0x4000
public const val MCL_ONFAULT: Int = 0x8000
public const val CBAUD: UInt = 255u
public const val TAB1: Int = 0x00000400
public const val TAB2: Int = 0x00000800
public const val TAB3: Int = 0x00000C00
public const val CR1: Int = 0x00001000
public const val CR2: Int = 0x00002000
public const val CR3: Int = 0x00003000
public const val FF1: Int = 0x00004000
public const val BS1: Int = 0x00008000
public const val VT1: Int = 0x00010000
public const val VWERASE: ULong = 10uL
public const val VREPRINT: ULong = 11uL
public const val VSUSP: ULong = 12uL
public const val VSTART: ULong = 13uL
public const val VSTOP: ULong = 14uL
public const val VDISCARD: ULong = 16uL
public const val VTIME: ULong = 7uL
public const val IXON: UInt = 0x00000200u
public const val IXOFF: UInt = 0x00000400u
public const val ONLCR: UInt = 0x00000002u
public const val CSIZE: UInt = 0x00000300u
public const val CS6: UInt = 0x00000100u
public const val CS7: UInt = 0x00000200u
public const val CS8: UInt = 0x00000300u
public const val CSTOPB: UInt = 0x00000400u
public const val CREAD: UInt = 0x00000800u
public const val PARENB: UInt = 0x00001000u
public const val PARODD: UInt = 0x00002000u
public const val HUPCL: UInt = 0x00004000u
public const val CLOCAL: UInt = 0x00008000u
public const val ECHOKE: UInt = 0x00000001u
public const val ECHOE: UInt = 0x00000002u
public const val ECHOK: UInt = 0x00000004u
public const val ECHONL: UInt = 0x00000010u
public const val ECHOPRT: UInt = 0x00000020u
public const val ECHOCTL: UInt = 0x00000040u
public const val ISIG: UInt = 0x00000080u
public const val ICANON: UInt = 0x00000100u
public const val PENDIN: UInt = 0x20000000u
public const val NOFLSH: UInt = 0x80000000u
public const val CIBAUD: UInt = 16711680u
public const val CBAUDEX: UInt = 16u
public const val VSWTC: ULong = 9uL
public const val OLCUC: UInt = 4u
public const val NLDLY: UInt = 768u
public const val CRDLY: UInt = 12288u
public const val TABDLY: UInt = 3072u
public const val BSDLY: UInt = 32768u
public const val FFDLY: UInt = 16384u
public const val VTDLY: UInt = 65536u
public const val XTABS: UInt = 3072u
public const val B57600: UInt = 16u
public const val B115200: UInt = 17u
public const val B230400: UInt = 18u
public const val B460800: UInt = 19u
public const val B500000: UInt = 20u
public const val B576000: UInt = 21u
public const val B921600: UInt = 22u
public const val B1000000: UInt = 23u
public const val B1152000: UInt = 24u
public const val B1500000: UInt = 25u
public const val B2000000: UInt = 26u
public const val B2500000: UInt = 27u
public const val B3000000: UInt = 28u
public const val B3500000: UInt = 29u
public const val B4000000: UInt = 30u
public const val O_RSYNC: Int = 1052672
public const val MAP_SYNC: Int = 0x080000
public const val PTRACE_SYSEMU: Int = 0x1d
public const val PTRACE_SYSEMU_SINGLESTEP: Int = 0x1e
public const val EBADFD: Int = 77
public const val EPROTOTYPE: Int = 91
public const val EPROTONOSUPPORT: Int = 93
public const val EREMOTEIO: Int = 121
public const val POLLWRNORM: Short = 0x100
public const val POLLWRBAND: Short = 0x200
public const val SYS_waitpid: Long = 7
public const val SYS_break: Long = 17
public const val SYS_oldstat: Long = 18
public const val SYS_stime: Long = 25
public const val SYS_oldfstat: Long = 28
public const val SYS_stty: Long = 31
public const val SYS_gtty: Long = 32
public const val SYS_nice: Long = 34
public const val SYS_ftime: Long = 35
public const val SYS_prof: Long = 44
public const val SYS_signal: Long = 48
public const val SYS_lock: Long = 53
public const val SYS_mpx: Long = 56
public const val SYS_ulimit: Long = 58
public const val SYS_oldolduname: Long = 59
public const val SYS_sigaction: Long = 67
public const val SYS_sgetmask: Long = 68
public const val SYS_ssetmask: Long = 69
public const val SYS_sigsuspend: Long = 72
public const val SYS_sigpending: Long = 73
public const val SYS_oldlstat: Long = 84
public const val SYS_readdir: Long = 89
public const val SYS_mmap: Long = 90
public const val SYS_profil: Long = 98
public const val SYS_statfs: Long = 99
public const val SYS_ioperm: Long = 101
public const val SYS_socketcall: Long = 102
public const val SYS_fstat: Long = 108
public const val SYS_olduname: Long = 109
public const val SYS_iopl: Long = 110
public const val SYS_idle: Long = 112
public const val SYS_vm86: Long = 113
public const val SYS_ipc: Long = 117
public const val SYS_sigreturn: Long = 119
public const val SYS_modify_ldt: Long = 123
public const val SYS_sigprocmask: Long = 126
public const val SYS_create_module: Long = 127
public const val SYS_get_kernel_syms: Long = 130
public const val SYS_sysfs: Long = 135
public const val SYS_afs_syscall: Long = 137
public const val SYS__newselect: Long = 142
public const val SYS_query_module: Long = 166
public const val SYS_getpmsg: Long = 187
public const val SYS_putpmsg: Long = 188
public const val SYS_ugetrlimit: Long = 190
public const val SYS_pciconfig_read: Long = 198
public const val SYS_pciconfig_write: Long = 199
public const val SYS_pciconfig_iobase: Long = 200
public const val SYS_multiplexer: Long = 201
public const val SYS_tuxcall: Long = 225
public const val SYS_fadvise64: Long = 233
public const val SYS_swapcontext: Long = 249
public const val SYS_rtas: Long = 255
public const val SYS_sys_debug_setcontext: Long = 256
public const val SYS_spu_run: Long = 278
public const val SYS_spu_create: Long = 279
public const val SYS_subpage_prot: Long = 310
public const val SYS_switch_endian: Long = 363
public const val SYS_userfaultfd: Long = 364
public const val SYS_membarrier: Long = 365
public const val SYS_mlock2: Long = 378
public const val SYS_preadv2: Long = 380
public const val SYS_pwritev2: Long = 381
public const val SYS_kexec_file_load: Long = 382
public const val SYS_pkey_alloc: Long = 384
public const val SYS_pkey_free: Long = 385
public const val SYS_pkey_mprotect: Long = 386
public const val SYS_quotactl_fd: Long = 443
public const val SYS_landlock_create_ruleset: Long = 444
public const val SYS_landlock_add_rule: Long = 445
public const val SYS_landlock_restrict_self: Long = 446
public const val SYS_memfd_secret: Long = 447
public const val SYS_process_mrelease: Long = 448
public const val SYS_futex_waitv: Long = 449
public const val SYS_set_mempolicy_home_node: Long = 450
public const val SYS_mseal: Long = 462
