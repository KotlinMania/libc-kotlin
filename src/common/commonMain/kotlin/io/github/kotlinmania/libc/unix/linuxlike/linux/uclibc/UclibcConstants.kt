package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.linuxlike.MS_I_VERSION
import io.github.kotlinmania.libc.unix.linuxlike.MS_MANDLOCK
import io.github.kotlinmania.libc.unix.linuxlike.MS_RDONLY
import io.github.kotlinmania.libc.unix.linuxlike.MS_SYNCHRONOUS
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm.B19200
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm.B38400
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm.SIGIO
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.EDEADLK
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.EOPNOTSUPP
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.O_DIRECTORY

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val SIGEV_THREAD_ID: CInt = 4

public val AF_VSOCK: CInt = 40

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70L

public val XFS_SUPER_MAGIC: CLong = 0x58465342L

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_GETFPXREGS: CInt = 18

public val PTRACE_SETFPXREGS: CInt = 19

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SEIZE: CInt = 0x4206

public val PTRACE_INTERRUPT: CInt = 0x4207

public val PTRACE_LISTEN: CInt = 0x4208

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

// These are different than GNU!
public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 3

public val LC_COLLATE: CInt = 4

public val LC_MONETARY: CInt = 2

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

// end different section
// MS_ flags for mount(2)
public val MS_RMT_MASK: CUlong = MS_RDONLY or MS_SYNCHRONOUS or MS_MANDLOCK or MS_I_VERSION

public val ENOTSUP: CInt = EOPNOTSUPP

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

// These are different from GNU
public val ABDAY_1: NlItem = 0x300

public val ABDAY_2: NlItem = 0x301

public val ABDAY_3: NlItem = 0x302

public val ABDAY_4: NlItem = 0x303

public val ABDAY_5: NlItem = 0x304

public val ABDAY_6: NlItem = 0x305

public val ABDAY_7: NlItem = 0x306

public val DAY_1: NlItem = 0x307

public val DAY_2: NlItem = 0x308

public val DAY_3: NlItem = 0x309

public val DAY_4: NlItem = 0x30A

public val DAY_5: NlItem = 0x30B

public val DAY_6: NlItem = 0x30C

public val DAY_7: NlItem = 0x30D

public val ABMON_1: NlItem = 0x30E

public val ABMON_2: NlItem = 0x30F

public val ABMON_3: NlItem = 0x310

public val ABMON_4: NlItem = 0x311

public val ABMON_5: NlItem = 0x312

public val ABMON_6: NlItem = 0x313

public val ABMON_7: NlItem = 0x314

public val ABMON_8: NlItem = 0x315

public val ABMON_9: NlItem = 0x316

public val ABMON_10: NlItem = 0x317

public val ABMON_11: NlItem = 0x318

public val ABMON_12: NlItem = 0x319

public val MON_1: NlItem = 0x31A

public val MON_2: NlItem = 0x31B

public val MON_3: NlItem = 0x31C

public val MON_4: NlItem = 0x31D

public val MON_5: NlItem = 0x31E

public val MON_6: NlItem = 0x31F

public val MON_7: NlItem = 0x320

public val MON_8: NlItem = 0x321

public val MON_9: NlItem = 0x322

public val MON_10: NlItem = 0x323

public val MON_11: NlItem = 0x324

public val MON_12: NlItem = 0x325

public val AM_STR: NlItem = 0x326

public val PM_STR: NlItem = 0x327

public val D_T_FMT: NlItem = 0x328

public val D_FMT: NlItem = 0x329

public val T_FMT: NlItem = 0x32A

public val T_FMT_AMPM: NlItem = 0x32B

public val ERA: NlItem = 0x32C

public val ERA_D_FMT: NlItem = 0x32E

public val ALT_DIGITS: NlItem = 0x32F

public val ERA_D_T_FMT: NlItem = 0x330

public val ERA_T_FMT: NlItem = 0x331

public val CODESET: NlItem = 10

public val CRNCYSTR: NlItem = 0x215

public val RADIXCHAR: NlItem = 0x100

public val THOUSEP: NlItem = 0x101

public val NOEXPR: NlItem = 0x501

public val YESSTR: NlItem = 0x502

public val NOSTR: NlItem = 0x503

// Different than Gnu.
public val FILENAME_MAX: CUint = 4095u

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public val ST_RELATIME: CUlong = 4096uL

public val PF_NFC: CInt = 39

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 4096

public val EDEADLOCK: CInt = EDEADLK

public val EXTA: CUint = B19200

public val EXTB: CUint = B38400

public val EXTPROC: TcflagT = 65536u

public val FOPEN_MAX: CInt = 16

public val F_GETOWN: CInt = 9

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_SETOWN: CInt = 8

public val F_UNLCK: CInt = 2

public val F_WRLCK: CInt = 1

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val MAP_HUGE_SHIFT: CInt = 26

public val MAP_HUGE_MASK: CInt = 0x3f

public val MAP_HUGE_64KB: CInt = 16 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512KB: CInt = 19 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1MB: CInt = 20 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2MB: CInt = 21 shl MAP_HUGE_SHIFT

public val MAP_HUGE_8MB: CInt = 23 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16MB: CInt = 24 shl MAP_HUGE_SHIFT

public val MAP_HUGE_32MB: CInt = 25 shl MAP_HUGE_SHIFT

public val MAP_HUGE_256MB: CInt = 28 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512MB: CInt = 29 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1GB: CInt = 30 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2GB: CInt = 31 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16GB: CInt = 34 shl MAP_HUGE_SHIFT

public val MINSIGSTKSZ: CInt = 2048

public val MSG_COPY: CInt = 16384

public val NI_MAXHOST: SocklenT = 1025u

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val PACKET_MR_UNICAST: CInt = 3

public val PF_VSOCK: CInt = 40

public val PTRACE_EVENT_STOP: CInt = 128

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val PTRACE_SETSIGMASK: CUint = 0x420bu

public val RTLD_NOLOAD: CInt = 0x00004

public val RUSAGE_THREAD: CInt = 1

public val SHM_EXEC: CInt = 32768

public val SIGPOLL: CInt = SIGIO

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val UDP_GRO: CInt = 104

public val UDP_SEGMENT: CInt = 103

public val YESEXPR: CInt = ((5) shl 8) or (0)
