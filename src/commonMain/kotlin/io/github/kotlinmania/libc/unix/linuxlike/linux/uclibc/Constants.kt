package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public const val B19200: UInt = 19200u

public const val B38400: UInt = 38400u

public const val EDEADLK: Int = 35

public const val EOPNOTSUPP: Int = 95

public const val O_DIRECTORY: Int = 0x10000

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val SIGEV_THREAD_ID: Int = 4

public const val AF_VSOCK: Int = 40

public const val BINDERFS_SUPER_MAGIC: Long = 0x6c6f6f70

public const val XFS_SUPER_MAGIC: Long = 0x58465342

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

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 3

public const val LC_COLLATE: Int = 4

public const val LC_MONETARY: Int = 2

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = 6

public const val ENOTSUP: Int = EOPNOTSUPP

public const val IPV6_JOIN_GROUP: Int = 20

public const val IPV6_LEAVE_GROUP: Int = 21

public const val ABDAY_1: Int = 0x300

public const val ABDAY_2: Int = 0x301

public const val ABDAY_3: Int = 0x302

public const val ABDAY_4: Int = 0x303

public const val ABDAY_5: Int = 0x304

public const val ABDAY_6: Int = 0x305

public const val ABDAY_7: Int = 0x306

public const val DAY_1: Int = 0x307

public const val DAY_2: Int = 0x308

public const val DAY_3: Int = 0x309

public const val DAY_4: Int = 0x30A

public const val DAY_5: Int = 0x30B

public const val DAY_6: Int = 0x30C

public const val DAY_7: Int = 0x30D

public const val ABMON_1: Int = 0x30E

public const val ABMON_2: Int = 0x30F

public const val ABMON_3: Int = 0x310

public const val ABMON_4: Int = 0x311

public const val ABMON_5: Int = 0x312

public const val ABMON_6: Int = 0x313

public const val ABMON_7: Int = 0x314

public const val ABMON_8: Int = 0x315

public const val ABMON_9: Int = 0x316

public const val ABMON_10: Int = 0x317

public const val ABMON_11: Int = 0x318

public const val ABMON_12: Int = 0x319

public const val MON_1: Int = 0x31A

public const val MON_2: Int = 0x31B

public const val MON_3: Int = 0x31C

public const val MON_4: Int = 0x31D

public const val MON_5: Int = 0x31E

public const val MON_6: Int = 0x31F

public const val MON_7: Int = 0x320

public const val MON_8: Int = 0x321

public const val MON_9: Int = 0x322

public const val MON_10: Int = 0x323

public const val MON_11: Int = 0x324

public const val MON_12: Int = 0x325

public const val AM_STR: Int = 0x326

public const val PM_STR: Int = 0x327

public const val D_T_FMT: Int = 0x328

public const val D_FMT: Int = 0x329

public const val T_FMT: Int = 0x32A

public const val T_FMT_AMPM: Int = 0x32B

public const val ERA: Int = 0x32C

public const val ERA_D_FMT: Int = 0x32E

public const val ALT_DIGITS: Int = 0x32F

public const val ERA_D_T_FMT: Int = 0x330

public const val ERA_T_FMT: Int = 0x331

public const val CODESET: Int = 10

public const val CRNCYSTR: Int = 0x215

public const val RADIXCHAR: Int = 0x100

public const val THOUSEP: Int = 0x101

public const val NOEXPR: Int = 0x501

public const val YESSTR: Int = 0x502

public const val NOSTR: Int = 0x503

public const val FILENAME_MAX: UInt = 4095u

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val SOMAXCONN: Int = 128

public const val ST_RELATIME: ULong = 4096uL

public val AF_NFC: Int = PF_NFC

public const val BUFSIZ: Int = 4096

public const val EDEADLOCK: Int = EDEADLK

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val EXTPROC: UInt = 65536u

public const val FOPEN_MAX: Int = 16

public const val F_GETOWN: Int = 9

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val F_RDLCK: Int = 0

public const val F_SETOWN: Int = 8

public const val F_UNLCK: Int = 2

public const val F_WRLCK: Int = 1

public const val IPV6_MULTICAST_ALL: Int = 29

public const val IPV6_ROUTER_ALERT_ISOLATE: Int = 30

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

public const val MINSIGSTKSZ: Int = 2048

public const val MSG_COPY: Int = 16384

public const val NI_MAXHOST: UInt = 1025u

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val PACKET_MR_UNICAST: Int = 3

public const val PF_NFC: Int = 39

public const val PF_VSOCK: Int = 40

public const val PTRACE_EVENT_STOP: Int = 128

public const val PTRACE_GETSIGMASK: UInt = 0x420au

public const val PTRACE_PEEKSIGINFO: Int = 0x4209

public const val PTRACE_SETSIGMASK: UInt = 0x420bu

public const val RTLD_NOLOAD: Int = 0x00004

public const val RUSAGE_THREAD: Int = 1

public const val SHM_EXEC: Int = 32768

public const val SIGPOLL: Int = 29

public const val SOCK_DCCP: Int = 6

public const val SOCK_PACKET: Int = 10

public const val TCP_COOKIE_TRANSACTIONS: Int = 15

public const val UDP_GRO: Int = 104

public const val UDP_SEGMENT: Int = 103

public val YESEXPR: Int = ((5) shl 8) or (0)
