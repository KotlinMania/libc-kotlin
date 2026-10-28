// port-lint: source unix/linux_like/linux/musl/b64/powerpc64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

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

// Stat, ShmidDs, IpcPerm are defined in Mips64.kt / Mod.kt (first definitions in this package).

public const val MADV_SOFT_OFFLINE: Int = 101
public const val MAP_32BIT: Int = 0x0040
public const val MAP_SYNC: Int = 0x080000
public const val PTRACE_SYSEMU: Int = 0x1d
public const val PTRACE_SYSEMU_SINGLESTEP: Int = 0x1e
public const val SIGSTKFLT: Int = 16
public const val SYS_waitpid: Long = 7
public const val SYS_time: Long = 13
public const val SYS_break: Long = 17
public const val SYS_oldstat: Long = 18
public const val SYS_umount: Long = 22
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
public const val SYS_select: Long = 82
public const val SYS_oldlstat: Long = 84
public const val SYS_uselib: Long = 86
public const val SYS_readdir: Long = 89
public const val SYS_profil: Long = 98
public const val SYS_ioperm: Long = 101
public const val SYS_socketcall: Long = 102
public const val SYS_olduname: Long = 109
public const val SYS_iopl: Long = 110
public const val SYS_idle: Long = 112
public const val SYS_vm86: Long = 113
public const val SYS_ipc: Long = 117
public const val SYS_sigreturn: Long = 119
public const val SYS_modify_ldt: Long = 123
public const val SYS_sigprocmask: Long = 126
public const val SYS_bdflush: Long = 134
public const val SYS__llseek: Long = 140
public const val SYS_vfork: Long = 189
public const val SYS_ugetrlimit: Long = 190
public const val SYS_pciconfig_read: Long = 198
public const val SYS_pciconfig_write: Long = 199
public const val SYS_pciconfig_iobase: Long = 200
public const val SYS_multiplexer: Long = 201
public const val SYS_tuxcall: Long = 225
public const val SYS_swapcontext: Long = 249
public const val SYS_statfs64: Long = 252
public const val SYS_fstatfs64: Long = 253
public const val SYS_rtas: Long = 255
public const val SYS_sys_debug_setcontext: Long = 256
public const val SYS_spu_run: Long = 278
public const val SYS_spu_create: Long = 279
public const val SYS_sync_file_range2: Long = 308
public const val SYS_subpage_prot: Long = 310
public const val SYS_send: Long = 334
public const val SYS_recv: Long = 336
public const val SYS_switch_endian: Long = 363
public const val SYS_kexec_file_load: Long = 382
public const val SYS_rseq: Long = 387
public const val SYS_io_pgetevents: Long = 388
