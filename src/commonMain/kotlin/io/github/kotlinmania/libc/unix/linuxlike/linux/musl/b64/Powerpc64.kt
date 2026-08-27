// port-lint: source libc/src/unix/linux_like/linux/musl/b64/powerpc64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

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

// Stat, ShmidDs, IpcPerm are defined in Mips64.kt / Mod.kt (first definitions in this package).

public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MAP_32BIT: CInt = 0x0040
public const val MAP_SYNC: CInt = 0x080000
public const val PTRACE_SYSEMU: CInt = 0x1d
public const val PTRACE_SYSEMU_SINGLESTEP: CInt = 0x1e
public const val SIGSTKFLT: CInt = 16
public const val SYS_waitpid: CLong = 7
public const val SYS_time: CLong = 13
public const val SYS_break: CLong = 17
public const val SYS_oldstat: CLong = 18
public const val SYS_umount: CLong = 22
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
public const val SYS_select: CLong = 82
public const val SYS_oldlstat: CLong = 84
public const val SYS_uselib: CLong = 86
public const val SYS_readdir: CLong = 89
public const val SYS_profil: CLong = 98
public const val SYS_ioperm: CLong = 101
public const val SYS_socketcall: CLong = 102
public const val SYS_olduname: CLong = 109
public const val SYS_iopl: CLong = 110
public const val SYS_idle: CLong = 112
public const val SYS_vm86: CLong = 113
public const val SYS_ipc: CLong = 117
public const val SYS_sigreturn: CLong = 119
public const val SYS_modify_ldt: CLong = 123
public const val SYS_sigprocmask: CLong = 126
public const val SYS_bdflush: CLong = 134
public const val SYS__llseek: CLong = 140
public const val SYS_vfork: CLong = 189
public const val SYS_ugetrlimit: CLong = 190
public const val SYS_pciconfig_read: CLong = 198
public const val SYS_pciconfig_write: CLong = 199
public const val SYS_pciconfig_iobase: CLong = 200
public const val SYS_multiplexer: CLong = 201
public const val SYS_tuxcall: CLong = 225
public const val SYS_swapcontext: CLong = 249
public const val SYS_statfs64: CLong = 252
public const val SYS_fstatfs64: CLong = 253
public const val SYS_rtas: CLong = 255
public const val SYS_sys_debug_setcontext: CLong = 256
public const val SYS_spu_run: CLong = 278
public const val SYS_spu_create: CLong = 279
public const val SYS_sync_file_range2: CLong = 308
public const val SYS_subpage_prot: CLong = 310
public const val SYS_send: CLong = 334
public const val SYS_recv: CLong = 336
public const val SYS_switch_endian: CLong = 363
public const val SYS_kexec_file_load: CLong = 382
public const val SYS_rseq: CLong = 387
public const val SYS_io_pgetevents: CLong = 388
