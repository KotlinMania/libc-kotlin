package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.bsd.O_NONBLOCK
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_MONOTONIC_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_REALTIME_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_UPTIME

public val RTM_VERSION: CInt = 5

public val RTAX_MAX: CInt = 8

// sys/signal.h
public val SIGTHR: CInt = 32

public val SIGLWP: CInt = SIGTHR

public val SIGLIBRT: CInt = 33

// netinet/sctp.h
public val SCTP_FUTURE_ASSOC: CInt = 0

public val SCTP_CURRENT_ASSOC: CInt = 1

public val SCTP_ALL_ASSOC: CInt = 2

public val SCTP_NO_NEXT_MSG: CInt = 0x0000

public val SCTP_NEXT_MSG_AVAIL: CInt = 0x0001

public val SCTP_NEXT_MSG_ISCOMPLETE: CInt = 0x0002

public val SCTP_NEXT_MSG_IS_UNORDERED: CInt = 0x0004

public val SCTP_NEXT_MSG_IS_NOTIFICATION: CInt = 0x0008

public val SCTP_RECVV_NOINFO: CInt = 0

public val SCTP_RECVV_RCVINFO: CInt = 1

public val SCTP_RECVV_NXTINFO: CInt = 2

public val SCTP_RECVV_RN: CInt = 3

public val SCTP_SENDV_NOINFO: CInt = 0

public val SCTP_SENDV_SNDINFO: CInt = 1

public val SCTP_SENDV_PRINFO: CInt = 2

public val SCTP_SENDV_AUTHINFO: CInt = 3

public val SCTP_SENDV_SPA: CInt = 4

public val SCTP_SEND_SNDINFO_VALID: CInt = 0x00000001

public val SCTP_SEND_PRINFO_VALID: CInt = 0x00000002

public val SCTP_SEND_AUTHINFO_VALID: CInt = 0x00000004

public val SCTP_NOTIFICATION: CInt = 0x0010

public val SCTP_COMPLETE: CInt = 0x0020

public val SCTP_EOF: CInt = 0x0100

public val SCTP_ABORT: CInt = 0x0200

public val SCTP_UNORDERED: CInt = 0x0400

public val SCTP_ADDR_OVER: CInt = 0x0800

public val SCTP_SENDALL: CInt = 0x1000

public val SCTP_EOR: CInt = 0x2000

public val SCTP_SACK_IMMEDIATELY: CInt = 0x4000

public val SCTP_PR_SCTP_NONE: CInt = 0x0000

public val SCTP_PR_SCTP_TTL: CInt = 0x0001

public val SCTP_PR_SCTP_PRIO: CInt = 0x0002

public val SCTP_PR_SCTP_BUF: CInt = SCTP_PR_SCTP_PRIO

public val SCTP_PR_SCTP_RTX: CInt = 0x0003

public val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_RTX

public val SCTP_PR_SCTP_ALL: CInt = 0x000f

public val SCTP_INIT: CInt = 0x0001

public val SCTP_SNDRCV: CInt = 0x0002

public val SCTP_EXTRCV: CInt = 0x0003

public val SCTP_SNDINFO: CInt = 0x0004

public val SCTP_RCVINFO: CInt = 0x0005

public val SCTP_NXTINFO: CInt = 0x0006

public val SCTP_PRINFO: CInt = 0x0007

public val SCTP_AUTHINFO: CInt = 0x0008

public val SCTP_DSTADDRV4: CInt = 0x0009

public val SCTP_DSTADDRV6: CInt = 0x000a

public val SCTP_RTOINFO: CInt = 0x00000001

public val SCTP_ASSOCINFO: CInt = 0x00000002

public val SCTP_INITMSG: CInt = 0x00000003

public val SCTP_NODELAY: CInt = 0x00000004

public val SCTP_AUTOCLOSE: CInt = 0x00000005

public val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 0x00000006

public val SCTP_PRIMARY_ADDR: CInt = 0x00000007

public val SCTP_ADAPTATION_LAYER: CInt = 0x00000008

public val SCTP_ADAPTION_LAYER: CInt = 0x00000008

public val SCTP_DISABLE_FRAGMENTS: CInt = 0x00000009

public val SCTP_PEER_ADDR_PARAMS: CInt = 0x0000000a

public val SCTP_DEFAULT_SEND_PARAM: CInt = 0x0000000b

public val SCTP_EVENTS: CInt = 0x0000000c

public val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 0x0000000d

public val SCTP_MAXSEG: CInt = 0x0000000e

public val SCTP_DELAYED_SACK: CInt = 0x0000000f

public val SCTP_FRAGMENT_INTERLEAVE: CInt = 0x00000010

public val SCTP_PARTIAL_DELIVERY_POINT: CInt = 0x00000011

public val SCTP_AUTH_CHUNK: CInt = 0x00000012

public val SCTP_AUTH_KEY: CInt = 0x00000013

public val SCTP_HMAC_IDENT: CInt = 0x00000014

public val SCTP_AUTH_ACTIVE_KEY: CInt = 0x00000015

public val SCTP_AUTH_DELETE_KEY: CInt = 0x00000016

public val SCTP_USE_EXT_RCVINFO: CInt = 0x00000017

public val SCTP_AUTO_ASCONF: CInt = 0x00000018

public val SCTP_MAXBURST: CInt = 0x00000019

public val SCTP_MAX_BURST: CInt = 0x00000019

public val SCTP_CONTEXT: CInt = 0x0000001a

public val SCTP_EXPLICIT_EOR: CInt = 0x00000001b

public val SCTP_REUSE_PORT: CInt = 0x00000001c

public val SCTP_AUTH_DEACTIVATE_KEY: CInt = 0x00000001d

public val SCTP_EVENT: CInt = 0x0000001e

public val SCTP_RECVRCVINFO: CInt = 0x0000001f

public val SCTP_RECVNXTINFO: CInt = 0x00000020

public val SCTP_DEFAULT_SNDINFO: CInt = 0x00000021

public val SCTP_DEFAULT_PRINFO: CInt = 0x00000022

public val SCTP_PEER_ADDR_THLDS: CInt = 0x00000023

public val SCTP_REMOTE_UDP_ENCAPS_PORT: CInt = 0x00000024

public val SCTP_ECN_SUPPORTED: CInt = 0x00000025

public val SCTP_AUTH_SUPPORTED: CInt = 0x00000027

public val SCTP_ASCONF_SUPPORTED: CInt = 0x00000028

public val SCTP_RECONFIG_SUPPORTED: CInt = 0x00000029

public val SCTP_NRSACK_SUPPORTED: CInt = 0x00000030

public val SCTP_PKTDROP_SUPPORTED: CInt = 0x00000031

public val SCTP_MAX_CWND: CInt = 0x00000032

public val SCTP_STATUS: CInt = 0x00000100

public val SCTP_GET_PEER_ADDR_INFO: CInt = 0x00000101

public val SCTP_PEER_AUTH_CHUNKS: CInt = 0x00000102

public val SCTP_LOCAL_AUTH_CHUNKS: CInt = 0x00000103

public val SCTP_GET_ASSOC_NUMBER: CInt = 0x00000104

public val SCTP_GET_ASSOC_ID_LIST: CInt = 0x00000105

public val SCTP_TIMEOUTS: CInt = 0x00000106

public val SCTP_PR_STREAM_STATUS: CInt = 0x00000107

public val SCTP_PR_ASSOC_STATUS: CInt = 0x00000108

public val SCTP_COMM_UP: CInt = 0x0001

public val SCTP_COMM_LOST: CInt = 0x0002

public val SCTP_RESTART: CInt = 0x0003

public val SCTP_SHUTDOWN_COMP: CInt = 0x0004

public val SCTP_CANT_STR_ASSOC: CInt = 0x0005

public val SCTP_ASSOC_SUPPORTS_PR: CInt = 0x01

public val SCTP_ASSOC_SUPPORTS_AUTH: CInt = 0x02

public val SCTP_ASSOC_SUPPORTS_ASCONF: CInt = 0x03

public val SCTP_ASSOC_SUPPORTS_MULTIBUF: CInt = 0x04

public val SCTP_ASSOC_SUPPORTS_RE_CONFIG: CInt = 0x05

public val SCTP_ASSOC_SUPPORTS_INTERLEAVING: CInt = 0x06

public val SCTP_ASSOC_SUPPORTS_MAX: CInt = 0x06

public val SCTP_ADDR_AVAILABLE: CInt = 0x0001

public val SCTP_ADDR_UNREACHABLE: CInt = 0x0002

public val SCTP_ADDR_REMOVED: CInt = 0x0003

public val SCTP_ADDR_ADDED: CInt = 0x0004

public val SCTP_ADDR_MADE_PRIM: CInt = 0x0005

public val SCTP_ADDR_CONFIRMED: CInt = 0x0006

public val SCTP_ACTIVE: CInt = 0x0001

public val SCTP_INACTIVE: CInt = 0x0002

public val SCTP_UNCONFIRMED: CInt = 0x0200

public val SCTP_DATA_UNSENT: CInt = 0x0001

public val SCTP_DATA_SENT: CInt = 0x0002

public val SCTP_PARTIAL_DELIVERY_ABORTED: CInt = 0x0001

public val SCTP_AUTH_NEW_KEY: CInt = 0x0001

public val SCTP_AUTH_NEWKEY: CInt = SCTP_AUTH_NEW_KEY

public val SCTP_AUTH_NO_AUTH: CInt = 0x0002

public val SCTP_AUTH_FREE_KEY: CInt = 0x0003

public val SCTP_STREAM_RESET_INCOMING_SSN: CInt = 0x0001

public val SCTP_STREAM_RESET_OUTGOING_SSN: CInt = 0x0002

public val SCTP_STREAM_RESET_DENIED: CInt = 0x0004

public val SCTP_STREAM_RESET_FAILED: CInt = 0x0008

public val SCTP_ASSOC_RESET_DENIED: CInt = 0x0004

public val SCTP_ASSOC_RESET_FAILED: CInt = 0x0008

public val SCTP_STREAM_CHANGE_DENIED: CInt = 0x0004

public val SCTP_STREAM_CHANGE_FAILED: CInt = 0x0008

public val KENV_DUMP_LOADER: CInt = 4

public val KENV_DUMP_STATIC: CInt = 5

public val RB_PAUSE: CInt = 0x100000

public val RB_REROOT: CInt = 0x200000

public val RB_POWERCYCLE: CInt = 0x400000

public val RB_PROBE: CInt = 0x10000000

public val RB_MULTIPLE: CInt = 0x20000000

// netinet/inPcb.h
public val INC_ISIPV6: CUchar = 0x01u

public val INC_IPV6MINMTU: CUchar = 0x02u

// sys/time.h
public val CLOCK_BOOTTIME: ClockidT = CLOCK_UPTIME

public val CLOCK_REALTIME_COARSE: ClockidT = CLOCK_REALTIME_FAST

public val CLOCK_MONOTONIC_COARSE: ClockidT = CLOCK_MONOTONIC_FAST

// sys/timerfd.h
public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_TIMER_ABSTIME: CInt = 0x01

public val TFD_TIMER_CANCEL_ON_SET: CInt = 0x02

// sys/unistd.h
public val CLOSE_RANGE_CLOEXEC: CUint = 1u shl 2

public val KCMP_FILE: CInt = 100

public val KCMP_FILEOBJ: CInt = 101

public val KCMP_FILES: CInt = 102

public val KCMP_SIGHAND: CInt = 103

public val KCMP_VM: CInt = 104
