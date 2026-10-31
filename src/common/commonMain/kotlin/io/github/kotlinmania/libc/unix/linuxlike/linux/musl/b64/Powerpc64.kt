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

public const val MADV_SOFT_OFFLINE: Int = 101
public const val MAP_32BIT: Int = 0x0040
public const val MAP_SYNC: Int = 0x080000
public const val PTRACE_SYSEMU: Int = 0x1d
public const val PTRACE_SYSEMU_SINGLESTEP: Int = 0x1e
public const val SIGSTKFLT: Int = 16
public const val SYS_WAITPID: Long = 7
public const val SYS_TIME: Long = 13
public const val SYS_BREAK: Long = 17
public const val SYS_OLDSTAT: Long = 18
public const val SYS_UMOUNT: Long = 22
public const val SYS_STIME: Long = 25
public const val SYS_OLDFSTAT: Long = 28
public const val SYS_STTY: Long = 31
public const val SYS_GTTY: Long = 32
public const val SYS_NICE: Long = 34
public const val SYS_FTIME: Long = 35
public const val SYS_PROF: Long = 44
public const val SYS_SIGNAL: Long = 48
public const val SYS_LOCK: Long = 53
public const val SYS_MPX: Long = 56
public const val SYS_ULIMIT: Long = 58
public const val SYS_OLDOLDUNAME: Long = 59
public const val SYS_SIGACTION: Long = 67
public const val SYS_SGETMASK: Long = 68
public const val SYS_SSETMASK: Long = 69
public const val SYS_SIGSUSPEND: Long = 72
public const val SYS_SIGPENDING: Long = 73
public const val SYS_SELECT: Long = 82
public const val SYS_OLDLSTAT: Long = 84
public const val SYS_USELIB: Long = 86
public const val SYS_READDIR: Long = 89
public const val SYS_PROFIL: Long = 98
public const val SYS_IOPERM: Long = 101
public const val SYS_SOCKETCALL: Long = 102
public const val SYS_OLDUNAME: Long = 109
public const val SYS_IOPL: Long = 110
public const val SYS_IDLE: Long = 112
public const val SYS_VM86: Long = 113
public const val SYS_IPC: Long = 117
public const val SYS_SIGRETURN: Long = 119
public const val SYS_MODIFY_LDT: Long = 123
public const val SYS_SIGPROCMASK: Long = 126
public const val SYS_BDFLUSH: Long = 134
public const val SYS__LLSEEK: Long = 140
public const val SYS_VFORK: Long = 189
public const val SYS_UGETRLIMIT: Long = 190
public const val SYS_PCICONFIG_READ: Long = 198
public const val SYS_PCICONFIG_WRITE: Long = 199
public const val SYS_PCICONFIG_IOBASE: Long = 200
public const val SYS_MULTIPLEXER: Long = 201
public const val SYS_TUXCALL: Long = 225
public const val SYS_SWAPCONTEXT: Long = 249
public const val SYS_STATFS64: Long = 252
public const val SYS_FSTATFS64: Long = 253
public const val SYS_RTAS: Long = 255
public const val SYS_SYS_DEBUG_SETCONTEXT: Long = 256
public const val SYS_SPU_RUN: Long = 278
public const val SYS_SPU_CREATE: Long = 279
public const val SYS_SYNC_FILE_RANGE2: Long = 308
public const val SYS_SUBPAGE_PROT: Long = 310
public const val SYS_SEND: Long = 334
public const val SYS_RECV: Long = 336
public const val SYS_SWITCH_ENDIAN: Long = 363
public const val SYS_KEXEC_FILE_LOAD: Long = 382
public const val SYS_RSEQ: Long = 387
public const val SYS_IO_PGETEVENTS: Long = 388
