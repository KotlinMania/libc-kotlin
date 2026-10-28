package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public const val INT_MIN: Int = -2147483648

public const val INT_MAX: Int = 2147483647

public val SIG_DFL: ULong = 0.toULong()

public val SIG_IGN: ULong = 1.toULong()

public val SIG_ERR: ULong = 0.toULong().inv()

public val DT_UNKNOWN: UByte = (0).toUByte()

public val DT_FIFO: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (4).toUByte()

public val DT_BLK: UByte = (6).toUByte()

public val DT_REG: UByte = (8).toUByte()

public val DT_LNK: UByte = (10).toUByte()

public val DT_SOCK: UByte = (12).toUByte()

public const val FD_CLOEXEC: Int = 0x1

public const val USRQUOTA: Int = 0

public const val GRPQUOTA: Int = 1

public const val SIGIOT: Int = 6

public const val S_ISUID: UInt = 2048u

public const val S_ISGID: UInt = 1024u

public const val S_ISVTX: UInt = 512u

public const val IF_NAMESIZE: ULong = 16uL

public const val IFNAMSIZ: ULong = IF_NAMESIZE

public const val LOG_EMERG: Int = 0

public const val LOG_ALERT: Int = 1

public const val LOG_CRIT: Int = 2

public const val LOG_ERR: Int = 3

public const val LOG_WARNING: Int = 4

public const val LOG_NOTICE: Int = 5

public const val LOG_INFO: Int = 6

public const val LOG_DEBUG: Int = 7

public const val LOG_KERN: Int = 0

public val LOG_USER: Int = 1 shl 3

public val LOG_MAIL: Int = 2 shl 3

public val LOG_DAEMON: Int = 3 shl 3

public val LOG_AUTH: Int = 4 shl 3

public val LOG_SYSLOG: Int = 5 shl 3

public val LOG_LPR: Int = 6 shl 3

public val LOG_NEWS: Int = 7 shl 3

public val LOG_UUCP: Int = 8 shl 3

public val LOG_LOCAL0: Int = 16 shl 3

public val LOG_LOCAL1: Int = 17 shl 3

public val LOG_LOCAL2: Int = 18 shl 3

public val LOG_LOCAL3: Int = 19 shl 3

public val LOG_LOCAL4: Int = 20 shl 3

public val LOG_LOCAL5: Int = 21 shl 3

public val LOG_LOCAL6: Int = 22 shl 3

public val LOG_LOCAL7: Int = 23 shl 3

public const val LOG_PID: Int = 0x01

public const val LOG_CONS: Int = 0x02

public const val LOG_ODELAY: Int = 0x04

public const val LOG_NDELAY: Int = 0x08

public const val LOG_NOWAIT: Int = 0x10

public const val LOG_PRIMASK: Int = 7

public const val LOG_FACMASK: Int = 0x3f8

public const val PRIO_MIN: Int = -20

public const val PRIO_MAX: Int = 20

public const val IPPROTO_ICMP: Int = 1

public const val IPPROTO_ICMPV6: Int = 58

public const val IPPROTO_TCP: Int = 6

public const val IPPROTO_UDP: Int = 17

public const val IPPROTO_IP: Int = 0

public const val IPPROTO_IPV6: Int = 41

public const val INADDR_LOOPBACK: UInt = 2130706433u

public const val INADDR_ANY: UInt = 0u

public const val INADDR_BROADCAST: UInt = 4294967295u

public const val INADDR_NONE: UInt = 4294967295u

public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u))

public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val ARPOP_REQUEST: UShort = (1).toUShort()

public val ARPOP_REPLY: UShort = (2).toUShort()

public const val ATF_COM: Int = 0x02

public const val ATF_PERM: Int = 0x04

public const val ATF_PUBL: Int = 0x08

public const val ATF_USETRAILERS: Int = 0x10

public val FNM_PERIOD: Int = 1 shl 1

public const val FNM_NOMATCH: Int = 1

public val FNM_CASEFOLD: Int = 1 shl 3

public val FNM_PATHNAME: Int = 1 shl 1

public val FNM_NOESCAPE: Int = 1 shl 0
