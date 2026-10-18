package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.O_NONBLOCK

public const val MAP_ANON: Int = 0x0020

public const val O_DIRECTORY: Int = 0x10000

public const val MAP_HUGE_SHIFT: Int = 26

public const val MAP_HUGE_MASK: Int = 0x3f

public val MAP_HUGE_64KB: Int = 16 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512KB: Int = 19 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1MB: Int = 20 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2MB: Int = 21 shl MAP_HUGE_SHIFT

public val MAP_HUGE_8MB: Int = 23 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16MB: Int = 24 shl MAP_HUGE_SHIFT

public val MAP_HUGE_32MB: Int = 25 shl MAP_HUGE_SHIFT

public val MAP_HUGE_256MB: Int = 28 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512MB: Int = 29 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1GB: Int = 30 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2GB: Int = 31 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16GB: Int = 34 shl MAP_HUGE_SHIFT

public const val MS_RMT_MASK: ULong = 0x02800051uL

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val NEW_TIME: Short = 3

public const val OLD_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9

public const val SFD_CLOEXEC: Int = 0x080000

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 512

public const val O_NOATIME: Int = 262144

public const val O_CLOEXEC: Int = 0x80000

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val EBFONT: Int = 59

public const val ENOSTR: Int = 60

public const val ENODATA: Int = 61

public const val ETIME: Int = 62

public const val ENOSR: Int = 63

public const val ENONET: Int = 64

public const val ENOPKG: Int = 65

public const val EREMOTE: Int = 66

public const val ENOLINK: Int = 67

public const val EADV: Int = 68

public const val ESRMNT: Int = 69

public const val ECOMM: Int = 70

public const val EPROTO: Int = 71

public const val EDOTDOT: Int = 73

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val F_RDLCK: Int = 0

public const val F_WRLCK: Int = 1

public const val F_UNLCK: Int = 2

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val BUFSIZ: UInt = 1024u

public const val TMP_MAX: UInt = 10000u

public const val FOPEN_MAX: UInt = 1000u

public const val FILENAME_MAX: UInt = 4096u

public const val O_PATH: Int = 2097152

public const val O_EXEC: Int = 2097152

public const val O_SEARCH: Int = 2097152

public const val O_ACCMODE: Int = 2097155

public const val O_NDELAY: Int = O_NONBLOCK

public const val NI_MAXHOST: UInt = 255u

public const val PTHREAD_STACK_MIN: ULong = 2048uL

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_DCCP: Int = 6

public const val SOCK_NONBLOCK: Int = O_NONBLOCK

public const val SOCK_PACKET: Int = 10

public const val SOMAXCONN: Int = 128

public const val SIGUNUSED: Int = 31

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

// CPU_SETSIZE is 1024 on musl_v1_2_3 targets.
public const val CPU_SETSIZE: Int = 128

public const val PTRACE_TRACEME: Int = 0

public const val PTRACE_PEEKTEXT: Int = 1

public const val PTRACE_PEEKDATA: Int = 2

public const val PTRACE_PEEKUSER: Int = 3

public const val PTRACE_POKETEXT: Int = 4

public const val PTRACE_POKEDATA: Int = 5

public const val PTRACE_POKEUSER: Int = 6

public const val PTRACE_CONT: Int = 7

public const val PTRACE_KILL: Int = 8

public const val PTRACE_SINGLESTEP: Int = 9

public const val PTRACE_GETREGS: Int = 12

public const val PTRACE_SETREGS: Int = 13

public const val PTRACE_GETFPREGS: Int = 14

public const val PTRACE_SETFPREGS: Int = 15

public const val PTRACE_ATTACH: Int = 16

public const val PTRACE_DETACH: Int = 17

public const val PTRACE_GETFPXREGS: Int = 18

public const val PTRACE_SETFPXREGS: Int = 19

public const val PTRACE_SYSCALL: Int = 24

public const val PTRACE_SETOPTIONS: Int = 0x4200

public const val PTRACE_GETEVENTMSG: Int = 0x4201

public const val PTRACE_GETSIGINFO: Int = 0x4202

public const val PTRACE_SETSIGINFO: Int = 0x4203

public const val PTRACE_GETREGSET: Int = 0x4204

public const val PTRACE_SETREGSET: Int = 0x4205

public const val PTRACE_SEIZE: Int = 0x4206

public const val PTRACE_INTERRUPT: Int = 0x4207

public const val PTRACE_LISTEN: Int = 0x4208

public const val PTRACE_PEEKSIGINFO: Int = 0x4209

public const val PTRACE_GETSIGMASK: UInt = 0x420au

public const val PTRACE_SETSIGMASK: UInt = 0x420bu

public const val AF_IB: Int = 27

public const val AF_MPLS: Int = 28

public const val AF_NFC: Int = 39

public const val AF_VSOCK: Int = 40

public const val AF_XDP: Int = 44

public const val PF_IB: Int = AF_IB

public const val PF_MPLS: Int = AF_MPLS

public const val PF_NFC: Int = AF_NFC

public const val PF_VSOCK: Int = AF_VSOCK

public const val PF_XDP: Int = AF_XDP

public const val EFD_NONBLOCK: Int = O_NONBLOCK

public const val SFD_NONBLOCK: Int = O_NONBLOCK

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val CLOCK_SGI_CYCLE: Int = 10

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val REG_OK: Int = 0

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val ADJ_OFFSET: UInt = 0x0001u

public const val ADJ_FREQUENCY: UInt = 0x0002u

public const val ADJ_MAXERROR: UInt = 0x0004u

public const val ADJ_ESTERROR: UInt = 0x0008u

public const val ADJ_STATUS: UInt = 0x0010u

public const val ADJ_TIMECONST: UInt = 0x0020u

public const val ADJ_TAI: UInt = 0x0080u

public const val ADJ_SETOFFSET: UInt = 0x0100u

public const val ADJ_MICRO: UInt = 0x1000u

public const val ADJ_NANO: UInt = 0x2000u

public const val ADJ_TICK: UInt = 0x4000u

public const val ADJ_OFFSET_SINGLESHOT: UInt = 0x8001u

public const val ADJ_OFFSET_SS_READ: UInt = 0xa001u

public const val MOD_OFFSET: UInt = ADJ_OFFSET

public const val MOD_FREQUENCY: UInt = ADJ_FREQUENCY

public const val MOD_MAXERROR: UInt = ADJ_MAXERROR

public const val MOD_ESTERROR: UInt = ADJ_ESTERROR

public const val MOD_STATUS: UInt = ADJ_STATUS

public const val MOD_TIMECONST: UInt = ADJ_TIMECONST

public const val MOD_CLKB: UInt = ADJ_TICK

public const val MOD_CLKA: UInt = ADJ_OFFSET_SINGLESHOT

public const val MOD_TAI: UInt = ADJ_TAI

public const val MOD_MICRO: UInt = ADJ_MICRO

public const val MOD_NANO: UInt = ADJ_NANO

public const val STA_PLL: Int = 0x0001

public const val STA_PPSFREQ: Int = 0x0002

public const val STA_PPSTIME: Int = 0x0004

public const val STA_FLL: Int = 0x0008

public const val STA_INS: Int = 0x0010

public const val STA_DEL: Int = 0x0020

public const val STA_UNSYNC: Int = 0x0040

public const val STA_FREQHOLD: Int = 0x0080

public const val STA_PPSSIGNAL: Int = 0x0100

public const val STA_PPSJITTER: Int = 0x0200

public const val STA_PPSWANDER: Int = 0x0400

public const val STA_PPSERROR: Int = 0x0800

public const val STA_CLOCKERR: Int = 0x1000

public const val STA_NANO: Int = 0x2000

public const val STA_MODE: Int = 0x4000

public const val STA_CLK: Int = 0x8000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public const val TIME_OK: Int = 0

public const val TIME_INS: Int = 1

public const val TIME_DEL: Int = 2

public const val TIME_OOP: Int = 3

public const val TIME_WAIT: Int = 4

public const val TIME_ERROR: Int = 5

public const val TIME_BAD: Int = TIME_ERROR

public const val MAXTC: Long = 6

public const val _CS_V6_ENV: Int = 1148

public const val _CS_V7_ENV: Int = 1149

public const val CLONE_NEWTIME: Int = 0x80

public const val UT_HOSTSIZE: ULong = 256uL

public const val UT_LINESIZE: ULong = 32uL

public const val UT_NAMESIZE: ULong = 32uL

public const val POSIX_FADV_DONTNEED: Int = 6

public const val POSIX_FADV_NOREUSE: Int = 7
