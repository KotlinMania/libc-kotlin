package io.github.kotlinmania.libc.unix.hurd

import CSchar

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadOnceRoutineCallback {
    public operator fun invoke()
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: SizeT, data: COpaquePointer?): CInt
}

// types
public typealias S16Type = CShort

public typealias U16Type = CUshort

public typealias S32Type = CInt

public typealias U32Type = CUint

public typealias SlongwordType = CLong

public typealias UlongwordType = CUlong

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias UInt = CUint

public typealias ULong = CUlong

public typealias Int8T = CSchar

public typealias Uint8T = CUchar

public typealias Int16T = CShort

public typealias Uint16T = CUshort

public typealias Int32T = CInt

public typealias Uint32T = CUint

public typealias IntLeast8T = Int8T

public typealias UintLeast8T = Uint8T

public typealias IntLeast16T = Int16T

public typealias UintLeast16T = Uint16T

public typealias IntLeast32T = Int32T

public typealias UintLeast32T = Uint32T

public typealias IntLeast64T = Int64T

public typealias UintLeast64T = Uint64T

public typealias DevT = UwordType

public typealias UidT = U32Type

public typealias GidT = U32Type

public typealias InoT = UlongwordType

public typealias Ino64T = UquadType

public typealias ModeT = U32Type

public typealias NlinkT = UwordType

public typealias OffT = SlongwordType

public typealias Off64T = SquadType

public typealias PidT = S32Type

public typealias RlimT = UlongwordType

public typealias Rlim64T = UquadType

public typealias BlkcntT = SlongwordType

public typealias Blkcnt64T = SquadType

public typealias FsblkcntT = UlongwordType

public typealias Fsblkcnt64T = UquadType

public typealias FsfilcntT = UlongwordType

public typealias Fsfilcnt64T = UquadType

public typealias FswordT = SwordType

public typealias IdT = U32Type

public typealias ClockT = SlongwordType

public typealias TimeT = SlongwordType

public typealias UsecondsT = U32Type

public typealias SusecondsT = SlongwordType

public typealias Suseconds64T = SquadType

public typealias DaddrT = S32Type

public typealias KeyT = S32Type

public typealias ClockidT = S32Type

public typealias TimerT = UwordType

public typealias BlksizeT = SlongwordType

public typealias FsidT = UquadType

public typealias SsizeT = SwordType

public typealias SyscallSlongT = SlongwordType

public typealias SyscallUlongT = UlongwordType

public typealias CpuMask = UlongwordType

public typealias LoffT = Off64T

public typealias CaddrT = COpaquePointer?

public typealias IntptrT = SwordType

public typealias PtrdiffT = SwordType

public typealias SocklenT = U32Type

public typealias SigAtomicT = CInt

public typealias Time64T = Int64T

public typealias WcharT = CInt

public typealias WintT = CUint

public typealias InAddrT = UInt

public typealias Float32 = Float

public typealias Float64 = Double

public typealias Float32x = Double

public typealias Float64x = Double

public typealias LocaleT = LocaleStruct?

public typealias Ulong = CUlong

public typealias Ushort = CUshort

public typealias Uint = CUint

public typealias UInt8T = Uint8T

public typealias UInt16T = Uint16T

public typealias UInt32T = Uint32T

public typealias UInt64T = Uint64T

public typealias RegisterT = CInt

public typealias SigsetT = CUlong

public typealias FdMask = CLong

public typealias PthreadSpinlockT = CInt

public typealias TssT = CInt

public typealias ThrdT = CLong

public typealias PthreadT = CLong

public typealias PthreadProcessShared = CUint

public typealias PthreadInheritsched = CUint

public typealias PthreadContentionscope = CUint

public typealias PthreadDetachstate = CUint

public typealias PthreadAttrT = PthreadAttr

public typealias PthreadMutexProtocol = CUint

public typealias PthreadMutexType = CUint

public typealias PthreadMutexRobustness = CUint

public typealias PthreadMutexattrT = PthreadMutexattr

public typealias PthreadMutexT = PthreadMutex

public typealias PthreadCondattrT = PthreadCondattr

public typealias PthreadCondT = PthreadCond

public typealias PthreadRwlockattrT = PthreadRwlockattr

public typealias PthreadRwlockT = PthreadRwlock

public typealias PthreadBarrierattrT = PthreadBarrierattr

public typealias PthreadBarrierT = PthreadBarrier

public typealias PthreadKey = CInt

public typealias PthreadKeyT = PthreadKey

public typealias PthreadOnceT = PthreadOnce

public typealias RlimitResource = CUint

public typealias RlimitResourceT = RlimitResource

public typealias RusageWho = CInt

public typealias PriorityWhich = CUint

public typealias SaFamilyT = CUchar

public typealias InPortT = UShort

public typealias SigvalT = Sigval

public typealias SigeventT = Sigevent

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias CcT = CUchar

public typealias SpeedT = CInt

public typealias GregT = CInt

public typealias GregsetT = List<GregT>

public typealias IoctlDir = CUint

public typealias IoctlDatum = CUint

public typealias ErrorTCodes = CInt

public typealias IntFast8T = CSchar

public typealias UintFast8T = CUchar

public typealias TcpSeq = UInt

public typealias TcpCaState = CUint

public typealias IdtypeT = CUint

public typealias MqdT = CInt

public typealias LmidT = CLong

public typealias RegoffT = CInt

public typealias NlItem = CInt

public typealias IconvT = COpaquePointer?

public fun SiginfoT.siAddr(): COpaquePointer? {
    return this.siAddr
}

public fun SiginfoT.siValue(): Sigval {
    return this.siValue
}

public fun SiginfoT.siPid(): PidT {
    return this.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.siStatus
}

// const
// aio.h
public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

// glob.h
public val GLOB_ERR: CInt = 1 shl 0

public val GLOB_MARK: CInt = 1 shl 1

public val GLOB_NOSORT: CInt = 1 shl 2

public val GLOB_DOOFFS: CInt = 1 shl 3

public val GLOB_NOCHECK: CInt = 1 shl 4

public val GLOB_APPEND: CInt = 1 shl 5

public val GLOB_NOESCAPE: CInt = 1 shl 6

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val GLOB_PERIOD: CInt = 1 shl 7

public val GLOB_ALTDIRFUNC: CInt = 1 shl 9

public val GLOB_BRACE: CInt = 1 shl 10

public val GLOB_NOMAGIC: CInt = 1 shl 11

public val GLOB_TILDE: CInt = 1 shl 12

public val GLOB_ONLYDIR: CInt = 1 shl 13

public val GLOB_TILDE_CHECK: CInt = 1 shl 14

// ipc.h
public val IPC_PRIVATE: KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_INFO: CInt = 3

public val MSG_STAT: CInt = 11

public val MSG_INFO: CInt = 12

public val MSG_NOERROR: CInt = 4096

public val MSG_EXCEPT: CInt = 8192

// shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

// unistd.h
public val FD_SETSIZE: Int = 256

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_OK: CInt = 0

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val L_SET: CInt = 0

public val L_INCR: CInt = 1

public val L_XTND: CInt = 2

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val CLOSE_RANGE_CLOEXEC: CInt = 4

// stdio.h
public val EOF: CInt = -1

// stdlib.h
public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WSTOPPED: CInt = 2

public val WCONTINUED: CInt = 4

public val WNOWAIT: CInt = 8

public val WEXITED: CInt = 16

public val W_CONTINUED: CInt = 65535

public val WCOREFLAG: CInt = 128

public val RAND_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val LITTLE_ENDIAN: Int = 1234

public val BIG_ENDIAN: Int = 4321

public val PDP_ENDIAN: Int = 3412

public val BYTE_ORDER: Int = 1234

public val FLOAT_WORD_ORDER: Int = 1234

public val LITTLE_ENDIAN1: Int = 1234

public val BIG_ENDIAN1: Int = 4321

public val PDP_ENDIAN1: Int = 3412

public val BYTE_ORDER1: Int = 1234

// sys/select.h
public val FD_SETSIZE1: Int = 256

public val SIZEOF_PTHREAD_MUTEX_T: Int = 32

public val SIZEOF_PTHREAD_ATTR_T: Int = 32

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 28

public val SIZEOF_PTHREAD_BARRIER_T: Int = 24

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 16

public val SIZEOF_PTHREAD_COND_T: Int = 20

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 8

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val SIZEOF_PTHREAD_ONCE_T: Int = 8

public val PTHREAD_SPIN_LOCK_INITIALIZER: CInt = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 0

// sys/resource.h
public val RLIM_INFINITY: RlimT = 2147483647uL

public val RLIM64_INFINITY: Rlim64T = 9223372036854775807

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

// pwd.h
public val NSS_BUFLEN_PASSWD: Int = 1024

// sys/socket.h
public val SOCK_TYPE_MASK: Int = 15

public val PF_UNSPEC: CInt = 0

public val PF_LOCAL: CInt = 1

public val PF_UNIX: CInt = 1

public val PF_FILE: CInt = 1

public val PF_INET: CInt = 2

public val PF_IMPLINK: CInt = 3

public val PF_PUP: CInt = 4

public val PF_CHAOS: CInt = 5

public val PF_NS: CInt = 6

public val PF_ISO: CInt = 7

public val PF_OSI: CInt = 7

public val PF_ECMA: CInt = 8

public val PF_DATAKIT: CInt = 9

public val PF_CCITT: CInt = 10

public val PF_SNA: CInt = 11

public val PF_DE_CNET: CInt = 12

public val PF_DLI: CInt = 13

public val PF_LAT: CInt = 14

public val PF_HYLINK: CInt = 15

public val PF_APPLETALK: CInt = 16

public val PF_ROUTE: CInt = 17

public val PF_XTP: CInt = 19

public val PF_COIP: CInt = 20

public val PF_CNT: CInt = 21

public val PF_RTIP: CInt = 22

public val PF_IPX: CInt = 23

public val PF_SIP: CInt = 24

public val PF_PIP: CInt = 25

public val PF_INET6: CInt = 26

public val PF_MAX: CInt = 27

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = 1

public val AF_FILE: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val PSEUDO_AF_XTP: CInt = 19

public val AF_COIP: CInt = 20

public val AF_CNT: CInt = 21

public val PSEUDO_AF_RTIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_SIP: CInt = 24

public val PSEUDO_AF_PIP: CInt = 25

public val AF_INET6: CInt = 26

public val AF_MAX: CInt = 27

public val SOMAXCONN: CInt = 4096

public val SS_SIZE: Int = 128

public val CMGROUP_MAX: Int = 16

public val SOL_SOCKET: CInt = 65535

// sys/time.h
public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

// netinet/in.h
public val SOL_IP: CInt = 0

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val SOL_IPV6: CInt = 41

public val SOL_ICMPV6: CInt = 58

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IPV6_ADDRFORM: CInt = 1

public val IPV6_2292PKTINFO: CInt = 2

public val IPV6_2292HOPOPTS: CInt = 3

public val IPV6_2292DSTOPTS: CInt = 4

public val IPV6_2292RTHDR: CInt = 5

public val IPV6_2292PKTOPTIONS: CInt = 6

public val IPV6_CHECKSUM: CInt = 7

public val IPV6_2292HOPLIMIT: CInt = 8

public val IPV6_RXINFO: CInt = 2

public val IPV6_TXINFO: CInt = 2

public val SCM_SRCINFO: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

public val IPV6_ROUTER_ALERT: CInt = 22

public val IPV6_MTU_DISCOVER: CInt = 23

public val IPV6_MTU: CInt = 24

public val IPV6_RECVERR: CInt = 25

public val IPV6_V6ONLY: CInt = 26

public val IPV6_JOIN_ANYCAST: CInt = 27

public val IPV6_LEAVE_ANYCAST: CInt = 28

public val IPV6_RECVPKTINFO: CInt = 49

public val IPV6_PKTINFO: CInt = 50

public val IPV6_RECVHOPLIMIT: CInt = 51

public val IPV6_HOPLIMIT: CInt = 52

public val IPV6_RECVHOPOPTS: CInt = 53

public val IPV6_HOPOPTS: CInt = 54

public val IPV6_RTHDRDSTOPTS: CInt = 55

public val IPV6_RECVRTHDR: CInt = 56

public val IPV6_RTHDR: CInt = 57

public val IPV6_RECVDSTOPTS: CInt = 58

public val IPV6_DSTOPTS: CInt = 59

public val IPV6_RECVPATHMTU: CInt = 60

public val IPV6_PATHMTU: CInt = 61

public val IPV6_DONTFRAG: CInt = 62

public val IPV6_RECVTCLASS: CInt = 66

public val IPV6_TCLASS: CInt = 67

public val IPV6_ADDR_PREFERENCES: CInt = 72

public val IPV6_MINHOPCOUNT: CInt = 73

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_RXHOPOPTS: CInt = 3

public val IPV6_RXDSTOPTS: CInt = 4

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IPV6_RTHDR_TYPE_0: CInt = 0

public val IN_CLASSA_NET: UInt = 4278190080u

public val IN_CLASSA_NSHIFT: Int = 24

public val IN_CLASSA_HOST: UInt = 16777215u

public val IN_CLASSA_MAX: UInt = 128u

public val IN_CLASSB_NET: UInt = 4294901760u

public val IN_CLASSB_NSHIFT: Int = 16

public val IN_CLASSB_HOST: UInt = 65535u

public val IN_CLASSB_MAX: UInt = 65536u

public val IN_CLASSC_NET: UInt = 4294967040u

public val IN_CLASSC_NSHIFT: Int = 8

public val IN_CLASSC_HOST: UInt = 255u

public val IN_LOOPBACKNET: UInt = 127u

public val INET_ADDRSTRLEN: Int = 16

public val INET6_ADDRSTRLEN: Int = 46

// netinet/ip.h
public val IPTOS_TOS_MASK: UByte = 0x1Eu

public val IPTOS_PREC_MASK: UByte = 0xE0u

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

public val IPTOS_LOWDELAY: UByte = 0x10u

public val IPTOS_THROUGHPUT: UByte = 0x08u

public val IPTOS_RELIABILITY: UByte = 0x04u

public val IPTOS_MINCOST: UByte = 0x02u

public val IPTOS_PREC_NETCONTROL: UByte = 0xe0u

public val IPTOS_PREC_INTERNETCONTROL: UByte = 0xc0u

public val IPTOS_PREC_CRITIC_ECP: UByte = 0xa0u

public val IPTOS_PREC_FLASHOVERRIDE: UByte = 0x80u

public val IPTOS_PREC_FLASH: UByte = 0x60u

public val IPTOS_PREC_IMMEDIATE: UByte = 0x40u

public val IPTOS_PREC_PRIORITY: UByte = 0x20u

public val IPTOS_PREC_ROUTINE: UByte = 0x00u

public val IPTOS_ECN_MASK: UByte = 0x03u

public val IPTOS_ECN_ECT1: UByte = 0x01u

public val IPTOS_ECN_ECT0: UByte = 0x02u

public val IPTOS_ECN_CE: UByte = 0x03u

public val IPOPT_COPY: UByte = 0x80u

public val IPOPT_CLASS_MASK: UByte = 0x60u

public val IPOPT_NUMBER_MASK: UByte = 0x1fu

public val IPOPT_CONTROL: UByte = 0x00u

public val IPOPT_RESERVED1: UByte = 0x20u

public val IPOPT_MEASUREMENT: UByte = 0x40u

public val IPOPT_RESERVED2: UByte = 0x60u

public val IPOPT_END: UByte = (0u or IPOPT_CONTROL).toUByte()

public val IPOPT_NOOP: UByte = (1u or IPOPT_CONTROL).toUByte()

public val IPOPT_SEC: UByte = (2u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_LSRR: UByte = (3u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_TIMESTAMP: UByte = (4u or IPOPT_MEASUREMENT).toUByte()

public val IPOPT_RR: UByte = (7u or IPOPT_CONTROL).toUByte()

public val IPOPT_SID: UByte = (8u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_SSRR: UByte = (9u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_RA: UByte = (20u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPVERSION: UByte = 4u

public val MAXTTL: UByte = 255u

public val IPDEFTTL: UByte = 64u

public val IPOPT_OPTVAL: UByte = 0u

public val IPOPT_OLEN: UByte = 1u

public val IPOPT_OFFSET: UByte = 2u

public val IPOPT_MINOFF: UByte = 4u

public val MAX_IPOPTLEN: UByte = 40u

public val IPOPT_NOP: UByte = IPOPT_NOOP

public val IPOPT_EOL: UByte = IPOPT_END

public val IPOPT_TS: UByte = IPOPT_TIMESTAMP

public val IPOPT_TS_TSONLY: UByte = 0u

public val IPOPT_TS_TSANDADDR: UByte = 1u

public val IPOPT_TS_PRESPEC: UByte = 3u

// net/ifArp.h
public val ARPOP_REQUEST: UShort = 1u

public val ARPOP_REPLY: UShort = 2u

public val ARPOP_RREQUEST: UShort = 3u

public val ARPOP_RREPLY: UShort = 4u

public val ARPOP_IN_REQUEST: UShort = 8u

public val ARPOP_IN_REPLY: UShort = 9u

public val ARPOP_NAK: UShort = 10u

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

public val ATF_NETMASK: CInt = 0x20

public val ATF_DONTPUB: CInt = 0x40

public val ARPHRD_NETROM: UShort = 0u

public val ARPHRD_ETHER: UShort = 1u

public val ARPHRD_EETHER: UShort = 2u

public val ARPHRD_AX25: UShort = 3u

public val ARPHRD_PRONET: UShort = 4u

public val ARPHRD_CHAOS: UShort = 5u

public val ARPHRD_IEEE802: UShort = 6u

public val ARPHRD_ARCNET: UShort = 7u

public val ARPHRD_APPLETLK: UShort = 8u

public val ARPHRD_DLCI: UShort = 15u

public val ARPHRD_ATM: UShort = 19u

public val ARPHRD_METRICOM: UShort = 23u

public val ARPHRD_IEEE1394: UShort = 24u

public val ARPHRD_EUI64: UShort = 27u

public val ARPHRD_INFINIBAND: UShort = 32u

public val ARPHRD_SLIP: UShort = 256u

public val ARPHRD_CSLIP: UShort = 257u

public val ARPHRD_SLIP6: UShort = 258u

public val ARPHRD_CSLIP6: UShort = 259u

public val ARPHRD_RSRVD: UShort = 260u

public val ARPHRD_ADAPT: UShort = 264u

public val ARPHRD_ROSE: UShort = 270u

public val ARPHRD_X25: UShort = 271u

public val ARPHRD_HWX25: UShort = 272u

public val ARPHRD_CAN: UShort = 280u

public val ARPHRD_PPP: UShort = 512u

public val ARPHRD_CISCO: UShort = 513u

public val ARPHRD_HDLC: UShort = ARPHRD_CISCO

public val ARPHRD_LAPB: UShort = 516u

public val ARPHRD_DDCMP: UShort = 517u

public val ARPHRD_RAWHDLC: UShort = 518u

public val ARPHRD_TUNNEL: UShort = 768u

public val ARPHRD_TUNNEL6: UShort = 769u

public val ARPHRD_FRAD: UShort = 770u

public val ARPHRD_SKIP: UShort = 771u

public val ARPHRD_LOOPBACK: UShort = 772u

public val ARPHRD_LOCALTLK: UShort = 773u

public val ARPHRD_FDDI: UShort = 774u

public val ARPHRD_BIF: UShort = 775u

public val ARPHRD_SIT: UShort = 776u

public val ARPHRD_IPDDP: UShort = 777u

public val ARPHRD_IPGRE: UShort = 778u

public val ARPHRD_PIMREG: UShort = 779u

public val ARPHRD_HIPPI: UShort = 780u

public val ARPHRD_ASH: UShort = 781u

public val ARPHRD_ECONET: UShort = 782u

public val ARPHRD_IRDA: UShort = 783u

public val ARPHRD_FCPP: UShort = 784u

public val ARPHRD_FCAL: UShort = 785u

public val ARPHRD_FCPL: UShort = 786u

public val ARPHRD_FCFABRIC: UShort = 787u

public val ARPHRD_IEEE802_TR: UShort = 800u

public val ARPHRD_IEEE80211: UShort = 801u

public val ARPHRD_IEEE80211_PRISM: UShort = 802u

public val ARPHRD_IEEE80211_RADIOTAP: UShort = 803u

public val ARPHRD_IEEE802154: UShort = 804u

public val ARPHRD_VOID: UShort = 0xFFFFu

public val ARPHRD_NONE: UShort = 0xFFFEu

// bits/posix1Lim.h
public val POSIX_AIO_LISTIO_MAX: Int = 2

public val POSIX_AIO_MAX: Int = 1

public val POSIX_ARG_MAX: Int = 4096

public val POSIX_CHILD_MAX: Int = 25

public val POSIX_DELAYTIMER_MAX: Int = 32

public val POSIX_HOST_NAME_MAX: Int = 255

public val POSIX_LINK_MAX: Int = 8

public val POSIX_LOGIN_NAME_MAX: Int = 9

public val POSIX_MAX_CANON: Int = 255

public val POSIX_MAX_INPUT: Int = 255

public val POSIX_MQ_OPEN_MAX: Int = 8

public val POSIX_MQ_PRIO_MAX: Int = 32

public val POSIX_NAME_MAX: Int = 14

public val POSIX_NGROUPS_MAX: Int = 8

public val POSIX_OPEN_MAX: Int = 20

public val POSIX_FD_SETSIZE: Int = 20

public val POSIX_PATH_MAX: Int = 256

public val POSIX_PIPE_BUF: Int = 512

public val POSIX_RE_DUP_MAX: Int = 255

public val POSIX_RTSIG_MAX: Int = 8

public val POSIX_SEM_NSEMS_MAX: Int = 256

public val POSIX_SEM_VALUE_MAX: Int = 32767

public val POSIX_SIGQUEUE_MAX: Int = 32

public val POSIX_SSIZE_MAX: Int = 32767

public val POSIX_STREAM_MAX: Int = 8

public val POSIX_SYMLINK_MAX: Int = 255

public val POSIX_SYMLOOP_MAX: Int = 8

public val POSIX_TIMER_MAX: Int = 32

public val POSIX_TTY_NAME_MAX: Int = 9

public val POSIX_TZNAME_MAX: Int = 6

public val POSIX_QLIMIT: Int = 1

public val POSIX_HIWAT: Int = 512

public val POSIX_UIO_MAXIOV: Int = 16

public val POSIX_CLOCKRES_MIN: Int = 20000000

public val NAME_MAX: Int = 255

public val NGROUPS_MAX: Int = 256

public val POSIX_THREAD_KEYS_MAX: Int = 128

public val POSIX_THREAD_DESTRUCTOR_ITERATIONS: Int = 4

public val POSIX_THREAD_THREADS_MAX: Int = 64

public val SEM_VALUE_MAX: CInt = 2147483647

public val MAXNAMLEN: Int = 255

// netdb.h
public val PATH_HEQUIV: List<UByte> = "/etc/hosts.equiv\u0000".encodeToByteArray()

public val PATH_HOSTS: List<UByte> = "/etc/hosts\u0000".encodeToByteArray()

public val PATH_NETWORKS: List<UByte> = "/etc/networks\u0000".encodeToByteArray()

public val PATH_NSSWITCH_CONF: List<UByte> = "/etc/nsswitch.conf\u0000".encodeToByteArray()

public val PATH_PROTOCOLS: List<UByte> = "/etc/protocols\u0000".encodeToByteArray()

public val PATH_SERVICES: List<UByte> = "/etc/services\u0000".encodeToByteArray()

public val HOST_NOT_FOUND: CInt = 1

public val TRY_AGAIN: CInt = 2

public val NO_RECOVERY: CInt = 3

public val NO_DATA: CInt = 4

public val NETDB_INTERNAL: CInt = -1

public val NETDB_SUCCESS: CInt = 0

public val NO_ADDRESS: CInt = 4

public val IPPORT_RESERVED: CInt = 1024

public val SCOPE_DELIMITER: UByte = 37u

public val GAI_WAIT: CInt = 0

public val GAI_NOWAIT: CInt = 1

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_V4MAPPED: CInt = 8

public val AI_ALL: CInt = 16

public val AI_ADDRCONFIG: CInt = 32

public val AI_IDN: CInt = 64

public val AI_CANONIDN: CInt = 128

public val AI_NUMERICSERV: CInt = 1024

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val EAI_NODATA: CInt = -5

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_INPROGRESS: CInt = -100

public val EAI_CANCELED: CInt = -101

public val EAI_NOTCANCELED: CInt = -102

public val EAI_ALLDONE: CInt = -103

public val EAI_INTR: CInt = -104

public val EAI_IDN_ENCODE: CInt = -105

public val NI_MAXHOST: Int = 1025

public val NI_MAXSERV: Int = 32

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_IDN: CInt = 32

// time.h
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val TIMER_ABSTIME: CInt = 1

public val TIME_UTC: CInt = 1

// sys/poll.h
public val POLLIN: Short = 1

public val POLLPRI: Short = 2

public val POLLOUT: Short = 4

public val POLLRDNORM: Short = 1

public val POLLRDBAND: Short = 2

public val POLLWRNORM: Short = 4

public val POLLWRBAND: Short = 4

public val POLLERR: Short = 8

public val POLLHUP: Short = 16

public val POLLNVAL: Short = 32

// locale.h
public val LC_CTYPE: Int = 0

public val LC_NUMERIC: Int = 1

public val LC_TIME: Int = 2

public val LC_COLLATE: Int = 3

public val LC_MONETARY: Int = 4

public val LC_MESSAGES: Int = 5

public val LC_ALL: Int = 6

public val LC_PAPER: Int = 7

public val LC_NAME: Int = 8

public val LC_ADDRESS: Int = 9

public val LC_TELEPHONE: Int = 10

public val LC_MEASUREMENT: Int = 11

public val LC_IDENTIFICATION: Int = 12

public val LC_CTYPE1: CInt = 0

public val LC_NUMERIC1: CInt = 1

public val LC_TIME1: CInt = 2

public val LC_COLLATE1: CInt = 3

public val LC_MONETARY1: CInt = 4

public val LC_MESSAGES1: CInt = 5

public val LC_ALL1: CInt = 6

public val LC_PAPER1: CInt = 7

public val LC_NAME1: CInt = 8

public val LC_ADDRESS1: CInt = 9

public val LC_TELEPHONE1: CInt = 10

public val LC_MEASUREMENT1: CInt = 11

public val LC_IDENTIFICATION1: CInt = 12

public val LC_CTYPE_MASK: CInt = 1

public val LC_NUMERIC_MASK: CInt = 2

public val LC_TIME_MASK: CInt = 4

public val LC_COLLATE_MASK: CInt = 8

public val LC_MONETARY_MASK: CInt = 16

public val LC_MESSAGES_MASK: CInt = 32

public val LC_PAPER_MASK: CInt = 128

public val LC_NAME_MASK: CInt = 256

public val LC_ADDRESS_MASK: CInt = 512

public val LC_TELEPHONE_MASK: CInt = 1024

public val LC_MEASUREMENT_MASK: CInt = 2048

public val LC_IDENTIFICATION_MASK: CInt = 4096

public val LC_ALL_MASK: CInt = 8127

public val ABDAY_1: NlItem = 0x20000

public val ABDAY_2: NlItem = 0x20001

public val ABDAY_3: NlItem = 0x20002

public val ABDAY_4: NlItem = 0x20003

public val ABDAY_5: NlItem = 0x20004

public val ABDAY_6: NlItem = 0x20005

public val ABDAY_7: NlItem = 0x20006

public val DAY_1: NlItem = 0x20007

public val DAY_2: NlItem = 0x20008

public val DAY_3: NlItem = 0x20009

public val DAY_4: NlItem = 0x2000A

public val DAY_5: NlItem = 0x2000B

public val DAY_6: NlItem = 0x2000C

public val DAY_7: NlItem = 0x2000D

public val ABMON_1: NlItem = 0x2000E

public val ABMON_2: NlItem = 0x2000F

public val ABMON_3: NlItem = 0x20010

public val ABMON_4: NlItem = 0x20011

public val ABMON_5: NlItem = 0x20012

public val ABMON_6: NlItem = 0x20013

public val ABMON_7: NlItem = 0x20014

public val ABMON_8: NlItem = 0x20015

public val ABMON_9: NlItem = 0x20016

public val ABMON_10: NlItem = 0x20017

public val ABMON_11: NlItem = 0x20018

public val ABMON_12: NlItem = 0x20019

public val MON_1: NlItem = 0x2001A

public val MON_2: NlItem = 0x2001B

public val MON_3: NlItem = 0x2001C

public val MON_4: NlItem = 0x2001D

public val MON_5: NlItem = 0x2001E

public val MON_6: NlItem = 0x2001F

public val MON_7: NlItem = 0x20020

public val MON_8: NlItem = 0x20021

public val MON_9: NlItem = 0x20022

public val MON_10: NlItem = 0x20023

public val MON_11: NlItem = 0x20024

public val MON_12: NlItem = 0x20025

public val AM_STR: NlItem = 0x20026

public val PM_STR: NlItem = 0x20027

public val D_T_FMT: NlItem = 0x20028

public val D_FMT: NlItem = 0x20029

public val T_FMT: NlItem = 0x2002A

public val T_FMT_AMPM: NlItem = 0x2002B

public val ERA: NlItem = 0x2002C

public val ERA_D_FMT: NlItem = 0x2002E

public val ALT_DIGITS: NlItem = 0x2002F

public val ERA_D_T_FMT: NlItem = 0x20030

public val ERA_T_FMT: NlItem = 0x20031

public val CODESET: NlItem = 14

public val CRNCYSTR: NlItem = 0x4000F

public val RADIXCHAR: NlItem = 0x10000

public val THOUSEP: NlItem = 0x10001

public val YESEXPR: NlItem = 0x50000

public val NOEXPR: NlItem = 0x50001

public val YESSTR: NlItem = 0x50002

public val NOSTR: NlItem = 0x50003

// reboot.h
public val RB_AUTOBOOT: CInt = 0x0

public val RB_ASKNAME: CInt = 0x1

public val RB_SINGLE: CInt = 0x2

public val RB_KBD: CInt = 0x4

public val RB_HALT: CInt = 0x8

public val RB_INITNAME: CInt = 0x10

public val RB_DFLTROOT: CInt = 0x20

public val RB_NOBOOTRC: CInt = 0x20

public val RB_ALTBOOT: CInt = 0x40

public val RB_UNIPROC: CInt = 0x80

public val RB_DEBUGGER: CInt = 0x1000

// semaphore.h
public val SIZEOF_SEM_T: Int = 20

public val SEM_FAILED: SemT? = null

// termios.h
public val IGNBRK: TcflagT = 1u

public val BRKINT: TcflagT = 2u

public val IGNPAR: TcflagT = 4u

public val PARMRK: TcflagT = 8u

public val INPCK: TcflagT = 16u

public val ISTRIP: TcflagT = 32u

public val INLCR: TcflagT = 64u

public val IGNCR: TcflagT = 128u

public val ICRNL: TcflagT = 256u

public val IXON: TcflagT = 512u

public val IXOFF: TcflagT = 1024u

public val IXANY: TcflagT = 2048u

public val IMAXBEL: TcflagT = 8192u

public val IUCLC: TcflagT = 16384u

public val OPOST: TcflagT = 1u

public val ONLCR: TcflagT = 2u

public val ONOEOT: TcflagT = 8u

public val OCRNL: TcflagT = 16u

public val ONOCR: TcflagT = 32u

public val ONLRET: TcflagT = 64u

public val NLDLY: TcflagT = 768u

public val NL0: TcflagT = 0u

public val NL1: TcflagT = 256u

public val TABDLY: TcflagT = 3076u

public val TAB0: TcflagT = 0u

public val TAB1: TcflagT = 1024u

public val TAB2: TcflagT = 2048u

public val TAB3: TcflagT = 4u

public val CRDLY: TcflagT = 12288u

public val CR0: TcflagT = 0u

public val CR1: TcflagT = 4096u

public val CR2: TcflagT = 8192u

public val CR3: TcflagT = 12288u

public val FFDLY: TcflagT = 16384u

public val FF0: TcflagT = 0u

public val FF1: TcflagT = 16384u

public val BSDLY: TcflagT = 32768u

public val BS0: TcflagT = 0u

public val BS1: TcflagT = 32768u

public val VTDLY: TcflagT = 65536u

public val VT0: TcflagT = 0u

public val VT1: TcflagT = 65536u

public val OLCUC: TcflagT = 131072u

public val OFILL: TcflagT = 262144u

public val OFDEL: TcflagT = 524288u

public val CIGNORE: TcflagT = 1u

public val CSIZE: TcflagT = 768u

public val CS5: TcflagT = 0u

public val CS6: TcflagT = 256u

public val CS7: TcflagT = 512u

public val CS8: TcflagT = 768u

public val CSTOPB: TcflagT = 1024u

public val CREAD: TcflagT = 2048u

public val PARENB: TcflagT = 4096u

public val PARODD: TcflagT = 8192u

public val HUPCL: TcflagT = 16384u

public val CLOCAL: TcflagT = 32768u

public val CRTSCTS: TcflagT = 65536u

public val CRTS_IFLOW: TcflagT = 65536u

public val CCTS_OFLOW: TcflagT = 65536u

public val CDTRCTS: TcflagT = 131072u

public val MDMBUF: TcflagT = 1048576u

public val CHWFLOW: TcflagT = 1245184u

public val ECHOKE: TcflagT = 1u

public val ECHOE: TcflagT = 2u

public val ECHOE1: TcflagT = 2u

public val ECHOK: TcflagT = 4u

public val ECHOK1: TcflagT = 4u

public val ECHO: TcflagT = 8u

public val ECHO1: TcflagT = 8u

public val ECHONL: TcflagT = 16u

public val ECHONL1: TcflagT = 16u

public val ECHOPRT: TcflagT = 32u

public val ECHOCTL: TcflagT = 64u

public val ISIG: TcflagT = 128u

public val ISIG1: TcflagT = 128u

public val ICANON: TcflagT = 256u

public val ICANON1: TcflagT = 256u

public val ALTWERASE: TcflagT = 512u

public val IEXTEN: TcflagT = 1024u

public val IEXTEN1: TcflagT = 1024u

public val EXTPROC: TcflagT = 2048u

public val TOSTOP: TcflagT = 4194304u

public val TOSTOP1: TcflagT = 4194304u

public val FLUSHO: TcflagT = 8388608u

public val NOKERNINFO: TcflagT = 33554432u

public val PENDIN: TcflagT = 536870912u

public val NOFLSH: TcflagT = 2147483648u

public val NOFLSH1: TcflagT = 2147483648u

public val VEOF: Int = 0

public val VEOL: Int = 1

public val VEOL2: Int = 2

public val VERASE: Int = 3

public val VWERASE: Int = 4

public val VKILL: Int = 5

public val VREPRINT: Int = 6

public val VINTR: Int = 8

public val VQUIT: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VLNEXT: Int = 14

public val VDISCARD: Int = 15

public val VMIN: Int = 16

public val VTIME: Int = 17

public val VSTATUS: Int = 18

public val NCCS: Int = 20

public val B0: SpeedT = 0

public val B50: SpeedT = 50

public val B75: SpeedT = 75

public val B110: SpeedT = 110

public val B134: SpeedT = 134

public val B150: SpeedT = 150

public val B200: SpeedT = 200

public val B300: SpeedT = 300

public val B600: SpeedT = 600

public val B1200: SpeedT = 1200

public val B1800: SpeedT = 1800

public val B2400: SpeedT = 2400

public val B4800: SpeedT = 4800

public val B9600: SpeedT = 9600

public val B7200: SpeedT = 7200

public val B14400: SpeedT = 14400

public val B19200: SpeedT = 19200

public val B28800: SpeedT = 28800

public val B38400: SpeedT = 38400

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 57600

public val B76800: SpeedT = 76800

public val B115200: SpeedT = 115200

public val B230400: SpeedT = 230400

public val B460800: SpeedT = 460800

public val B500000: SpeedT = 500000

public val B576000: SpeedT = 576000

public val B921600: SpeedT = 921600

public val B1000000: SpeedT = 1000000

public val B1152000: SpeedT = 1152000

public val B1500000: SpeedT = 1500000

public val B2000000: SpeedT = 2000000

public val B2500000: SpeedT = 2500000

public val B3000000: SpeedT = 3000000

public val B3500000: SpeedT = 3500000

public val B4000000: SpeedT = 4000000

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TCSASOFT: CInt = 16

public val TCIFLUSH: CInt = 1

public val TCOFLUSH: CInt = 2

public val TCIOFLUSH: CInt = 3

public val TCOOFF: CInt = 1

public val TCOON: CInt = 2

public val TCIOFF: CInt = 3

public val TCION: CInt = 4

public val TTYDEF_IFLAG: TcflagT = 11042u

public val TTYDEF_LFLAG: TcflagT = 1483u

public val TTYDEF_CFLAG: TcflagT = 23040u

public val TTYDEF_SPEED: TcflagT = 9600u

public val CEOL: UByte = 0u

public val CERASE: UByte = 127u

public val CMIN: UByte = 1u

public val CQUIT: UByte = 28u

public val CTIME: UByte = 0u

public val CBRK: UByte = 0u

// dlfcn.h
public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_BINDING_MASK: CInt = 3

public val RTLD_NOLOAD: CInt = 4

public val RTLD_DEEPBIND: CInt = 8

public val RTLD_GLOBAL: CInt = 256

public val RTLD_LOCAL: CInt = 0

public val RTLD_NODELETE: CInt = 4096

public val DLFO_STRUCT_HAS_EH_DBASE: Int = 1

public val DLFO_STRUCT_HAS_EH_COUNT: Int = 0

public val LM_ID_BASE: CLong = 0L

public val LM_ID_NEWLM: CLong = -1L

// bits/signumGeneric.h
public val SIGINT: CInt = 2

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGHUP: CInt = 1

public val SIGQUIT: CInt = 3

public val SIGTRAP: CInt = 5

public val SIGKILL: CInt = 9

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGIOT: CInt = 6

public val SIGBUS: CInt = 10

public val SIGSYS: CInt = 12

public val SIGEMT: CInt = 7

public val SIGINFO: CInt = 29

public val SIGLOST: CInt = 32

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGXFSZ: CInt = 25

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 23

public val SIGCLD: CInt = 20

public val SIGRTMIN: Int = 32

public val SIGRTMAX: Int = 32

public val NSIG: Int = 33

public val NSIG1: Int = 33

// bits/sigaction.h
public val SA_ONSTACK: CInt = 1

public val SA_RESTART: CInt = 2

public val SA_NODEFER: CInt = 16

public val SA_RESETHAND: CInt = 4

public val SA_NOCLDSTOP: CInt = 8

public val SA_SIGINFO: CInt = 64

public val SA_INTERRUPT: CInt = 0

public val SA_NOMASK: CInt = 16

public val SA_ONESHOT: CInt = 4

public val SA_STACK: CInt = 1

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

// bits/sigcontext.h
public val FPC_IE: UShort = 1u

public val FPC_IM: UShort = 1u

public val FPC_DE: UShort = 2u

public val FPC_DM: UShort = 2u

public val FPC_ZE: UShort = 4u

public val FPC_ZM: UShort = 4u

public val FPC_OE: UShort = 8u

public val FPC_OM: UShort = 8u

public val FPC_UE: UShort = 16u

public val FPC_PE: UShort = 32u

public val FPC_PC: UShort = 768u

public val FPC_PC_24: UShort = 0u

public val FPC_PC_53: UShort = 512u

public val FPC_PC_64: UShort = 768u

public val FPC_RC: UShort = 3072u

public val FPC_RC_RN: UShort = 0u

public val FPC_RC_RD: UShort = 1024u

public val FPC_RC_RU: UShort = 2048u

public val FPC_RC_CHOP: UShort = 3072u

public val FPC_IC: UShort = 4096u

public val FPC_IC_PROJ: UShort = 0u

public val FPC_IC_AFF: UShort = 4096u

public val FPS_IE: UShort = 1u

public val FPS_DE: UShort = 2u

public val FPS_ZE: UShort = 4u

public val FPS_OE: UShort = 8u

public val FPS_UE: UShort = 16u

public val FPS_PE: UShort = 32u

public val FPS_SF: UShort = 64u

public val FPS_ES: UShort = 128u

public val FPS_C0: UShort = 256u

public val FPS_C1: UShort = 512u

public val FPS_C2: UShort = 1024u

public val FPS_TOS: UShort = 14336u

public val FPS_TOS_SHIFT: UShort = 11u

public val FPS_C3: UShort = 16384u

public val FPS_BUSY: UShort = 32768u

public val FPE_INTOVF_TRAP: CInt = 1

public val FPE_INTDIV_FAULT: CInt = 2

public val FPE_FLTOVF_FAULT: CInt = 3

public val FPE_FLTDIV_FAULT: CInt = 4

public val FPE_FLTUND_FAULT: CInt = 5

public val FPE_SUBRNG_FAULT: CInt = 7

public val FPE_FLTDNR_FAULT: CInt = 8

public val FPE_FLTINX_FAULT: CInt = 9

public val FPE_EMERR_FAULT: CInt = 10

public val FPE_EMBND_FAULT: CInt = 11

public val ILL_INVOPR_FAULT: CInt = 1

public val ILL_STACK_FAULT: CInt = 2

public val ILL_FPEOPR_FAULT: CInt = 3

public val DBG_SINGLE_TRAP: CInt = 1

public val DBG_BRKPNT_FAULT: CInt = 2

public val NGREG: Int = 19

public val NGREG1: Int = 19

// bits/sigstack.h
public val MINSIGSTKSZ: Int = 8192

public val SIGSTKSZ: Int = 40960

// sys/stat.h
public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_INOCACHE: ModeT = 65536u

public val S_IUSEUNK: ModeT = 131072u

public val S_IUNKNOWN: ModeT = 1835008u

public val S_IUNKSHIFT: ModeT = 12u

public val S_IPTRANS: ModeT = 2097152u

public val S_IATRANS: ModeT = 4194304u

public val S_IROOT: ModeT = 8388608u

public val S_ITRANS: ModeT = 14680064u

public val S_IMMAP0: ModeT = 16777216u

public val CMASK: ModeT = 18u

public val UF_SETTABLE: CUint = 65535u

public val UF_NODUMP: CUint = 1u

public val UF_IMMUTABLE: CUint = 2u

public val UF_APPEND: CUint = 4u

public val UF_OPAQUE: CUint = 8u

public val UF_NOUNLINK: CUint = 16u

public val SF_SETTABLE: CUint = 4294901760u

public val SF_ARCHIVED: CUint = 65536u

public val SF_IMMUTABLE: CUint = 131072u

public val SF_APPEND: CUint = 262144u

public val SF_NOUNLINK: CUint = 1048576u

public val SF_SNAPSHOT: CUint = 2097152u

public val UTIME_NOW: CLong = -1L

public val UTIME_OMIT: CLong = -2L

public val S_IFMT1: ModeT = 61440u

public val S_IFDIR1: ModeT = 16384u

public val S_IFCHR1: ModeT = 8192u

public val S_IFBLK1: ModeT = 24576u

public val S_IFREG1: ModeT = 32768u

public val S_IFIFO1: ModeT = 4096u

public val S_IFLNK1: ModeT = 40960u

public val S_IFSOCK1: ModeT = 49152u

public val S_ISUID1: ModeT = 2048u

public val S_ISGID1: ModeT = 1024u

public val S_ISVTX1: ModeT = 512u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXU: ModeT = 448u

public val S_IREAD1: ModeT = 256u

public val S_IWRITE1: ModeT = 128u

public val S_IEXEC1: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXG: ModeT = 56u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val S_IRWXO: ModeT = 7u

public val ACCESSPERMS: ModeT = 511u

public val ALLPERMS: ModeT = 4095u

public val DEFFILEMODE: ModeT = 438u

public val S_BLKSIZE: Int = 512

public val STATX_TYPE: CUint = 1u

public val STATX_MODE: CUint = 2u

public val STATX_NLINK: CUint = 4u

public val STATX_UID: CUint = 8u

public val STATX_GID: CUint = 16u

public val STATX_ATIME: CUint = 32u

public val STATX_MTIME: CUint = 64u

public val STATX_CTIME: CUint = 128u

public val STATX_INO: CUint = 256u

public val STATX_SIZE: CUint = 512u

public val STATX_BLOCKS: CUint = 1024u

public val STATX_BASIC_STATS: CUint = 2047u

public val STATX_ALL: CUint = 4095u

public val STATX_BTIME: CUint = 2048u

public val STATX_MNT_ID: CUint = 4096u

public val STATX_DIOALIGN: CUint = 8192u

public val STATX__RESERVED: CUint = 2147483648u

public val STATX_ATTR_COMPRESSED: CUint = 4u

public val STATX_ATTR_IMMUTABLE: CUint = 16u

public val STATX_ATTR_APPEND: CUint = 32u

public val STATX_ATTR_NODUMP: CUint = 64u

public val STATX_ATTR_ENCRYPTED: CUint = 2048u

public val STATX_ATTR_AUTOMOUNT: CUint = 4096u

public val STATX_ATTR_MOUNT_ROOT: CUint = 8192u

public val STATX_ATTR_VERITY: CUint = 1048576u

public val STATX_ATTR_DAX: CUint = 2097152u

// sys/ioctl.h
public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = 64

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = 128

public val TIOCM_DSR: CInt = 256

public val TIOCPKT_DATA: CInt = 0

public val TIOCPKT_FLUSHREAD: CInt = 1

public val TIOCPKT_FLUSHWRITE: CInt = 2

public val TIOCPKT_STOP: CInt = 4

public val TIOCPKT_START: CInt = 8

public val TIOCPKT_NOSTOP: CInt = 16

public val TIOCPKT_DOSTOP: CInt = 32

public val TIOCPKT_IOCTL: CInt = 64

public val TTYDISC: CInt = 0

public val TABLDISC: CInt = 3

public val SLIPDISC: CInt = 4

public val TANDEM: TcflagT = 1u

public val CBREAK: TcflagT = 2u

public val LCASE: TcflagT = 4u

public val CRMOD: TcflagT = 16u

public val RAW: TcflagT = 32u

public val ODDP: TcflagT = 64u

public val EVENP: TcflagT = 128u

public val ANYP: TcflagT = 192u

public val NLDELAY: TcflagT = 768u

public val NL2: TcflagT = 512u

public val NL3: TcflagT = 768u

public val TBDELAY: TcflagT = 3072u

public val XTABS: TcflagT = 3072u

public val CRDELAY: TcflagT = 12288u

public val VTDELAY: TcflagT = 16384u

public val BSDELAY: TcflagT = 32768u

public val ALLDELAY: TcflagT = 65280u

public val CRTBS: TcflagT = 65536u

public val PRTERA: TcflagT = 131072u

public val CRTERA: TcflagT = 262144u

public val TILDE: TcflagT = 524288u

public val LITOUT: TcflagT = 2097152u

public val NOHANG: TcflagT = 16777216u

public val L001000: TcflagT = 33554432u

public val CRTKIL: TcflagT = 67108864u

public val PASS8: TcflagT = 134217728u

public val CTLECH: TcflagT = 268435456u

public val DECCTQ: TcflagT = 1073741824u

public val FIONBIO: CUlong = 0xa008007euL

public val FIONREAD: CUlong = 0x6008007fuL

public val TIOCSWINSZ: CUlong = 0x90200767uL

public val TIOCGWINSZ: CUlong = 0x50200768uL

public val TIOCEXCL: CUlong = 0x70duL

public val TIOCNXCL: CUlong = 0x70euL

public val TIOCSCTTY: CUlong = 0x761uL

public val FIOCLEX: CUlong = 1uL

// fcntl.h
public val O_EXEC: CInt = 4

public val O_NORW: CInt = 0

public val O_RDONLY: CInt = 1

public val O_WRONLY: CInt = 2

public val O_RDWR: CInt = 3

public val O_ACCMODE: CInt = 3

public val O_LARGEFILE: CInt = 0

public val O_CREAT: CInt = 16

public val O_EXCL: CInt = 32

public val O_NOLINK: CInt = 64

public val O_NOTRANS: CInt = 128

public val O_NOFOLLOW: CInt = 1048576

public val O_DIRECTORY: CInt = 2097152

public val O_APPEND: CInt = 256

public val O_ASYNC: CInt = 512

public val O_FSYNC: CInt = 1024

public val O_SYNC: CInt = 1024

public val O_NOATIME: CInt = 2048

public val O_SHLOCK: CInt = 131072

public val O_EXLOCK: CInt = 262144

public val O_DSYNC: CInt = 1024

public val O_RSYNC: CInt = 1024

public val O_NONBLOCK: CInt = 8

public val O_NDELAY: CInt = 8

public val O_HURD: CInt = 458751

public val O_TRUNC: CInt = 65536

public val O_CLOEXEC: CInt = 4194304

public val O_IGNORE_CTTY: CInt = 524288

public val O_TMPFILE: CInt = 8388608

public val O_NOCTTY: CInt = 0

public val FREAD: CInt = 1

public val FWRITE: CInt = 2

public val FASYNC: CInt = 512

public val FCREAT: CInt = 16

public val FEXCL: CInt = 32

public val FTRUNC: CInt = 65536

public val FNOCTTY: CInt = 0

public val FFSYNC: CInt = 1024

public val FSYNC: CInt = 1024

public val FAPPEND: CInt = 256

public val FNONBLOCK: CInt = 8

public val FNDELAY: CInt = 8

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_GETLK64: CInt = 10

public val F_SETLK64: CInt = 11

public val F_SETLKW64: CInt = 12

public val F_DUPFD_CLOEXEC: CInt = 1030

public val FD_CLOEXEC: CInt = 1

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 256

public val AT_REMOVEDIR: CInt = 512

public val AT_SYMLINK_FOLLOW: CInt = 1024

public val AT_NO_AUTOMOUNT: CInt = 2048

public val AT_EMPTY_PATH: CInt = 4096

public val AT_STATX_SYNC_TYPE: CInt = 24576

public val AT_STATX_SYNC_AS_STAT: CInt = 0

public val AT_STATX_FORCE_SYNC: CInt = 8192

public val AT_STATX_DONT_SYNC: CInt = 16384

public val AT_RECURSIVE: CInt = 32768

public val AT_EACCESS: CInt = 512

// sys/uio.h
public val RWF_HIPRI: CInt = 1

public val RWF_DSYNC: CInt = 2

public val RWF_SYNC: CInt = 4

public val RWF_NOWAIT: CInt = 8

public val RWF_APPEND: CInt = 16

// errno.h
public val EPERM: CInt = 1073741825

public val ENOENT: CInt = 1073741826

public val ESRCH: CInt = 1073741827

public val EINTR: CInt = 1073741828

public val EIO: CInt = 1073741829

public val ENXIO: CInt = 1073741830

public val E2BIG: CInt = 1073741831

public val ENOEXEC: CInt = 1073741832

public val EBADF: CInt = 1073741833

public val ECHILD: CInt = 1073741834

public val EDEADLK: CInt = 1073741835

public val ENOMEM: CInt = 1073741836

public val EACCES: CInt = 1073741837

public val EFAULT: CInt = 1073741838

public val ENOTBLK: CInt = 1073741839

public val EBUSY: CInt = 1073741840

public val EEXIST: CInt = 1073741841

public val EXDEV: CInt = 1073741842

public val ENODEV: CInt = 1073741843

public val ENOTDIR: CInt = 1073741844

public val EISDIR: CInt = 1073741845

public val EINVAL: CInt = 1073741846

public val EMFILE: CInt = 1073741848

public val ENFILE: CInt = 1073741847

public val ENOTTY: CInt = 1073741849

public val ETXTBSY: CInt = 1073741850

public val EFBIG: CInt = 1073741851

public val ENOSPC: CInt = 1073741852

public val ESPIPE: CInt = 1073741853

public val EROFS: CInt = 1073741854

public val EMLINK: CInt = 1073741855

public val EPIPE: CInt = 1073741856

public val EDOM: CInt = 1073741857

public val ERANGE: CInt = 1073741858

public val EAGAIN: CInt = 1073741859

public val EWOULDBLOCK: CInt = 1073741859

public val EINPROGRESS: CInt = 1073741860

public val EALREADY: CInt = 1073741861

public val ENOTSOCK: CInt = 1073741862

public val EMSGSIZE: CInt = 1073741864

public val EPROTOTYPE: CInt = 1073741865

public val ENOPROTOOPT: CInt = 1073741866

public val EPROTONOSUPPORT: CInt = 1073741867

public val ESOCKTNOSUPPORT: CInt = 1073741868

public val EOPNOTSUPP: CInt = 1073741869

public val EPFNOSUPPORT: CInt = 1073741870

public val EAFNOSUPPORT: CInt = 1073741871

public val EADDRINUSE: CInt = 1073741872

public val EADDRNOTAVAIL: CInt = 1073741873

public val ENETDOWN: CInt = 1073741874

public val ENETUNREACH: CInt = 1073741875

public val ENETRESET: CInt = 1073741876

public val ECONNABORTED: CInt = 1073741877

public val ECONNRESET: CInt = 1073741878

public val ENOBUFS: CInt = 1073741879

public val EISCONN: CInt = 1073741880

public val ENOTCONN: CInt = 1073741881

public val EDESTADDRREQ: CInt = 1073741863

public val ESHUTDOWN: CInt = 1073741882

public val ETOOMANYREFS: CInt = 1073741883

public val ETIMEDOUT: CInt = 1073741884

public val ECONNREFUSED: CInt = 1073741885

public val ELOOP: CInt = 1073741886

public val ENAMETOOLONG: CInt = 1073741887

public val EHOSTDOWN: CInt = 1073741888

public val EHOSTUNREACH: CInt = 1073741889

public val ENOTEMPTY: CInt = 1073741890

public val EPROCLIM: CInt = 1073741891

public val EUSERS: CInt = 1073741892

public val EDQUOT: CInt = 1073741893

public val ESTALE: CInt = 1073741894

public val EREMOTE: CInt = 1073741895

public val EBADRPC: CInt = 1073741896

public val ERPCMISMATCH: CInt = 1073741897

public val EPROGUNAVAIL: CInt = 1073741898

public val EPROGMISMATCH: CInt = 1073741899

public val EPROCUNAVAIL: CInt = 1073741900

public val ENOLCK: CInt = 1073741901

public val EFTYPE: CInt = 1073741903

public val EAUTH: CInt = 1073741904

public val ENEEDAUTH: CInt = 1073741905

public val ENOSYS: CInt = 1073741902

public val ELIBEXEC: CInt = 1073741907

public val ENOTSUP: CInt = 1073741942

public val EILSEQ: CInt = 1073741930

public val EBACKGROUND: CInt = 1073741924

public val EDIED: CInt = 1073741925

public val EGREGIOUS: CInt = 1073741927

public val EIEIO: CInt = 1073741928

public val EGRATUITOUS: CInt = 1073741929

public val EBADMSG: CInt = 1073741931

public val EIDRM: CInt = 1073741932

public val EMULTIHOP: CInt = 1073741933

public val ENODATA: CInt = 1073741934

public val ENOLINK: CInt = 1073741935

public val ENOMSG: CInt = 1073741936

public val ENOSR: CInt = 1073741937

public val ENOSTR: CInt = 1073741938

public val EOVERFLOW: CInt = 1073741939

public val EPROTO: CInt = 1073741940

public val ETIME: CInt = 1073741941

public val ECANCELED: CInt = 1073741943

public val EOWNERDEAD: CInt = 1073741944

public val ENOTRECOVERABLE: CInt = 1073741945

public val EMACH_SEND_IN_PROGRESS: CInt = 268435457

public val EMACH_SEND_INVALID_DATA: CInt = 268435458

public val EMACH_SEND_INVALID_DEST: CInt = 268435459

public val EMACH_SEND_TIMED_OUT: CInt = 268435460

public val EMACH_SEND_WILL_NOTIFY: CInt = 268435461

public val EMACH_SEND_NOTIFY_IN_PROGRESS: CInt = 268435462

public val EMACH_SEND_INTERRUPTED: CInt = 268435463

public val EMACH_SEND_MSG_TOO_SMALL: CInt = 268435464

public val EMACH_SEND_INVALID_REPLY: CInt = 268435465

public val EMACH_SEND_INVALID_RIGHT: CInt = 268435466

public val EMACH_SEND_INVALID_NOTIFY: CInt = 268435467

public val EMACH_SEND_INVALID_MEMORY: CInt = 268435468

public val EMACH_SEND_NO_BUFFER: CInt = 268435469

public val EMACH_SEND_NO_NOTIFY: CInt = 268435470

public val EMACH_SEND_INVALID_TYPE: CInt = 268435471

public val EMACH_SEND_INVALID_HEADER: CInt = 268435472

public val EMACH_RCV_IN_PROGRESS: CInt = 268451841

public val EMACH_RCV_INVALID_NAME: CInt = 268451842

public val EMACH_RCV_TIMED_OUT: CInt = 268451843

public val EMACH_RCV_TOO_LARGE: CInt = 268451844

public val EMACH_RCV_INTERRUPTED: CInt = 268451845

public val EMACH_RCV_PORT_CHANGED: CInt = 268451846

public val EMACH_RCV_INVALID_NOTIFY: CInt = 268451847

public val EMACH_RCV_INVALID_DATA: CInt = 268451848

public val EMACH_RCV_PORT_DIED: CInt = 268451849

public val EMACH_RCV_IN_SET: CInt = 268451850

public val EMACH_RCV_HEADER_ERROR: CInt = 268451851

public val EMACH_RCV_BODY_ERROR: CInt = 268451852

public val EKERN_INVALID_ADDRESS: CInt = 1

public val EKERN_PROTECTION_FAILURE: CInt = 2

public val EKERN_NO_SPACE: CInt = 3

public val EKERN_INVALID_ARGUMENT: CInt = 4

public val EKERN_FAILURE: CInt = 5

public val EKERN_RESOURCE_SHORTAGE: CInt = 6

public val EKERN_NOT_RECEIVER: CInt = 7

public val EKERN_NO_ACCESS: CInt = 8

public val EKERN_MEMORY_FAILURE: CInt = 9

public val EKERN_MEMORY_ERROR: CInt = 10

public val EKERN_NOT_IN_SET: CInt = 12

public val EKERN_NAME_EXISTS: CInt = 13

public val EKERN_ABORTED: CInt = 14

public val EKERN_INVALID_NAME: CInt = 15

public val EKERN_INVALID_TASK: CInt = 16

public val EKERN_INVALID_RIGHT: CInt = 17

public val EKERN_INVALID_VALUE: CInt = 18

public val EKERN_UREFS_OVERFLOW: CInt = 19

public val EKERN_INVALID_CAPABILITY: CInt = 20

public val EKERN_RIGHT_EXISTS: CInt = 21

public val EKERN_INVALID_HOST: CInt = 22

public val EKERN_MEMORY_PRESENT: CInt = 23

public val EKERN_WRITE_PROTECTION_FAILURE: CInt = 24

public val EKERN_TERMINATED: CInt = 26

public val EKERN_TIMEDOUT: CInt = 27

public val EKERN_INTERRUPTED: CInt = 28

public val EMIG_TYPE_ERROR: CInt = -300

public val EMIG_REPLY_MISMATCH: CInt = -301

public val EMIG_REMOTE_ERROR: CInt = -302

public val EMIG_BAD_ID: CInt = -303

public val EMIG_BAD_ARGUMENTS: CInt = -304

public val EMIG_NO_REPLY: CInt = -305

public val EMIG_EXCEPTION: CInt = -306

public val EMIG_ARRAY_TOO_LARGE: CInt = -307

public val EMIG_SERVER_DIED: CInt = -308

public val EMIG_DESTROY_REQUEST: CInt = -309

public val ED_IO_ERROR: CInt = 2500

public val ED_WOULD_BLOCK: CInt = 2501

public val ED_NO_SUCH_DEVICE: CInt = 2502

public val ED_ALREADY_OPEN: CInt = 2503

public val ED_DEVICE_DOWN: CInt = 2504

public val ED_INVALID_OPERATION: CInt = 2505

public val ED_INVALID_RECNUM: CInt = 2506

public val ED_INVALID_SIZE: CInt = 2507

public val ED_NO_MEMORY: CInt = 2508

public val ED_READ_ONLY: CInt = 2509

public val HURD_ERRNOS: Int = 122

// sched.h
public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val BITS_TYPES_STRUCT_SCHED_PARAM: Int = 1

public val CPU_SETSIZE: Int = 1024

public val CPU_SETSIZE1: Int = 1024

// pthread.h
public val PTHREAD_SPINLOCK_INITIALIZER: CInt = 0

public val PTHREAD_CANCEL_DISABLE: CInt = 0

public val PTHREAD_CANCEL_ENABLE: CInt = 1

public val PTHREAD_CANCEL_DEFERRED: CInt = 0

public val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 1

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

// netinet/tcp.h
public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_CORK: CInt = 3

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCP_SYNCNT: CInt = 7

public val TCP_LINGER2: CInt = 8

public val TCP_DEFER_ACCEPT: CInt = 9

public val TCP_WINDOW_CLAMP: CInt = 10

public val TCP_INFO: CInt = 11

public val TCP_QUICKACK: CInt = 12

public val TCP_CONGESTION: CInt = 13

public val TCP_MD5SIG: CInt = 14

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val TCP_THIN_LINEAR_TIMEOUTS: CInt = 16

public val TCP_THIN_DUPACK: CInt = 17

public val TCP_USER_TIMEOUT: CInt = 18

public val TCP_REPAIR: CInt = 19

public val TCP_REPAIR_QUEUE: CInt = 20

public val TCP_QUEUE_SEQ: CInt = 21

public val TCP_REPAIR_OPTIONS: CInt = 22

public val TCP_FASTOPEN: CInt = 23

public val TCP_TIMESTAMP: CInt = 24

public val TCP_NOTSENT_LOWAT: CInt = 25

public val TCP_CC_INFO: CInt = 26

public val TCP_SAVE_SYN: CInt = 27

public val TCP_SAVED_SYN: CInt = 28

public val TCP_REPAIR_WINDOW: CInt = 29

public val TCP_FASTOPEN_CONNECT: CInt = 30

public val TCP_ULP: CInt = 31

public val TCP_MD5SIG_EXT: CInt = 32

public val TCP_FASTOPEN_KEY: CInt = 33

public val TCP_FASTOPEN_NO_COOKIE: CInt = 34

public val TCP_ZEROCOPY_RECEIVE: CInt = 35

public val TCP_INQ: CInt = 36

public val TCP_CM_INQ: CInt = 36

public val TCP_TX_DELAY: CInt = 37

public val TCP_REPAIR_ON: CInt = 1

public val TCP_REPAIR_OFF: CInt = 0

public val TCP_REPAIR_OFF_NO_WP: CInt = -1

// stdint.h
public val INT8_MIN: Byte = -128

public val INT16_MIN: Short = -32768

public val INT32_MIN: Int = -2147483648

public val INT8_MAX: Byte = 127

public val INT16_MAX: Short = 32767

public val INT32_MAX: Int = 2147483647

public val UINT8_MAX: UByte = 255u

public val UINT16_MAX: UShort = 65535u

public val UINT32_MAX: UInt = 4294967295u

public val INT_LEAST8_MIN: IntLeast8T = -128

public val INT_LEAST16_MIN: IntLeast16T = -32768

public val INT_LEAST32_MIN: IntLeast32T = -2147483648

public val INT_LEAST8_MAX: IntLeast8T = 127

public val INT_LEAST16_MAX: IntLeast16T = 32767

public val INT_LEAST32_MAX: IntLeast32T = 2147483647

public val UINT_LEAST8_MAX: UintLeast8T = 255u

public val UINT_LEAST16_MAX: UintLeast16T = 65535u

public val UINT_LEAST32_MAX: UintLeast32T = 4294967295u

public val INT_FAST8_MIN: IntFast8T = -128

public val INT_FAST16_MIN: IntFast16T = -2147483648

public val INT_FAST32_MIN: IntFast32T = -2147483648

public val INT_FAST8_MAX: IntFast8T = 127

public val INT_FAST16_MAX: IntFast16T = 2147483647

public val INT_FAST32_MAX: IntFast32T = 2147483647

public val UINT_FAST8_MAX: UintFast8T = 255u

public val UINT_FAST16_MAX: UintFast16T = 4294967295

public val UINT_FAST32_MAX: UintFast32T = 4294967295

public val INTPTR_MIN: IntptrT = -2147483648L

public val INTPTR_MAX: IntptrT = 2147483647L

public val UINTPTR_MAX: Int = 4294967295

public val PTRDIFF_MIN: PtrdiffT = -2147483648L

public val PTRDIFF_MAX: PtrdiffT = 2147483647L

public val SIG_ATOMIC_MIN: SigAtomicT = -2147483648

public val SIG_ATOMIC_MAX: SigAtomicT = 2147483647

public val SIZE_MAX: Int = 4294967295

public val WINT_MIN: WintT = 0u

public val WINT_MAX: WintT = 4294967295u

public val INT8_WIDTH: Int = 8

public val UINT8_WIDTH: Int = 8

public val INT16_WIDTH: Int = 16

public val UINT16_WIDTH: Int = 16

public val INT32_WIDTH: Int = 32

public val UINT32_WIDTH: Int = 32

public val INT64_WIDTH: Int = 64

public val UINT64_WIDTH: Int = 64

public val INT_LEAST8_WIDTH: Int = 8

public val UINT_LEAST8_WIDTH: Int = 8

public val INT_LEAST16_WIDTH: Int = 16

public val UINT_LEAST16_WIDTH: Int = 16

public val INT_LEAST32_WIDTH: Int = 32

public val UINT_LEAST32_WIDTH: Int = 32

public val INT_LEAST64_WIDTH: Int = 64

public val UINT_LEAST64_WIDTH: Int = 64

public val INT_FAST8_WIDTH: Int = 8

public val UINT_FAST8_WIDTH: Int = 8

public val INT_FAST16_WIDTH: Int = 32

public val UINT_FAST16_WIDTH: Int = 32

public val INT_FAST32_WIDTH: Int = 32

public val UINT_FAST32_WIDTH: Int = 32

public val INT_FAST64_WIDTH: Int = 64

public val UINT_FAST64_WIDTH: Int = 64

public val INTPTR_WIDTH: Int = 32

public val UINTPTR_WIDTH: Int = 32

public val INTMAX_WIDTH: Int = 64

public val UINTMAX_WIDTH: Int = 64

public val PTRDIFF_WIDTH: Int = 32

public val SIG_ATOMIC_WIDTH: Int = 32

public val SIZE_WIDTH: Int = 32

public val WCHAR_WIDTH: Int = 32

public val WINT_WIDTH: Int = 32

public val TH_FIN: UByte = 1u

public val TH_SYN: UByte = 2u

public val TH_RST: UByte = 4u

public val TH_PUSH: UByte = 8u

public val TH_ACK: UByte = 16u

public val TH_URG: UByte = 32u

public val TCPOPT_EOL: UByte = 0u

public val TCPOPT_NOP: UByte = 1u

public val TCPOPT_MAXSEG: UByte = 2u

public val TCPOLEN_MAXSEG: UByte = 4u

public val TCPOPT_WINDOW: UByte = 3u

public val TCPOLEN_WINDOW: UByte = 3u

public val TCPOPT_SACK_PERMITTED: UByte = 4u

public val TCPOLEN_SACK_PERMITTED: UByte = 2u

public val TCPOPT_SACK: UByte = 5u

public val TCPOPT_TIMESTAMP: UByte = 8u

public val TCPOLEN_TIMESTAMP: UByte = 10u

public val TCPOLEN_TSTAMP_APPA: UByte = 12u

public val TCPOPT_TSTAMP_HDR: UInt = 16844810u

public val TCP_MSS: Int = 512

public val TCP_MAXWIN: Int = 65535

public val TCP_MAX_WINSHIFT: Int = 14

public val TCPI_OPT_TIMESTAMPS: UByte = 1u

public val TCPI_OPT_SACK: UByte = 2u

public val TCPI_OPT_WSCALE: UByte = 4u

public val TCPI_OPT_ECN: UByte = 8u

public val TCPI_OPT_ECN_SEEN: UByte = 16u

public val TCPI_OPT_SYN_DATA: UByte = 32u

public val TCP_MD5SIG_MAXKEYLEN: Int = 80

public val TCP_MD5SIG_FLAG_PREFIX: Int = 1

public val TCP_COOKIE_MIN: Int = 8

public val TCP_COOKIE_MAX: Int = 16

public val TCP_COOKIE_PAIR_SIZE: Int = 32

public val TCP_COOKIE_IN_ALWAYS: CInt = 1

public val TCP_COOKIE_OUT_NEVER: CInt = 2

public val TCP_S_DATA_IN: CInt = 4

public val TCP_S_DATA_OUT: CInt = 8

public val TCP_MSS_DEFAULT: Int = 536

public val TCP_MSS_DESIRED: Int = 1220

// sys/wait.h
public val WCOREFLAG1: CInt = 128

public val WAIT_ANY: PidT = -1

public val WAIT_MYPGRP: PidT = 0

// sys/file.h
public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_UN: CInt = 8

public val LOCK_NB: CInt = 4

// sys/mman.h
public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 4

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 1

public val MAP_FILE: CInt = 1

public val MAP_ANON: CInt = 2

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_TYPE: CInt = 15

public val MAP_COPY: CInt = 32

public val MAP_SHARED: CInt = 16

public val MAP_PRIVATE: CInt = 0

public val MAP_FIXED: CInt = 256

public val MAP_NOEXTEND: CInt = 512

public val MAP_HASSEMAPHORE: CInt = 1024

public val MAP_INHERIT: CInt = 2048

public val MAP_32BIT: CInt = 4096

public val MAP_EXCL: CInt = 16384

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_WONTNEED: CInt = 4

public val MS_ASYNC: CInt = 1

public val MS_SYNC: CInt = 0

public val MS_INVALIDATE: CInt = 2

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

// sys/xattr.h
public val XATTR_CREATE: CInt = 0x1

public val XATTR_REPLACE: CInt = 0x2

// spawn.h
public val POSIX_SPAWN_USEVFORK: CInt = 64

public val POSIX_SPAWN_SETSID: CInt = 128

// sys/syslog.h
public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

// net/if.h
public val IFF_UP: CInt = 0x1

public val IFF_BROADCAST: CInt = 0x2

public val IFF_DEBUG: CInt = 0x4

public val IFF_LOOPBACK: CInt = 0x8

public val IFF_POINTOPOINT: CInt = 0x10

public val IFF_NOTRAILERS: CInt = 0x20

public val IFF_RUNNING: CInt = 0x40

public val IFF_NOARP: CInt = 0x80

public val IFF_PROMISC: CInt = 0x100

public val IFF_ALLMULTI: CInt = 0x200

public val IFF_MASTER: CInt = 0x400

public val IFF_SLAVE: CInt = 0x800

public val IFF_MULTICAST: CInt = 0x1000

public val IFF_PORTSEL: CInt = 0x2000

public val IFF_AUTOMEDIA: CInt = 0x4000

public val IFF_DYNAMIC: CInt = 0x8000

// random.h
public val GRND_NONBLOCK: CUint = 1u

public val GRND_RANDOM: CUint = 2u

public val GRND_INSECURE: CUint = 4u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = 30

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EQUIV_CLASS_MAX: CInt = 41

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_CHARCLASS_NAME_MAX: CInt = 45

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_PII: CInt = 53

public val SC_PII_XTI: CInt = 54

public val SC_PII_SOCKET: CInt = 55

public val SC_PII_INTERNET: CInt = 56

public val SC_PII_OSI: CInt = 57

public val SC_POLL: CInt = 58

public val SC_SELECT: CInt = 59

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_PII_INTERNET_STREAM: CInt = 61

public val SC_PII_INTERNET_DGRAM: CInt = 62

public val SC_PII_OSI_COTS: CInt = 63

public val SC_PII_OSI_CLTS: CInt = 64

public val SC_PII_OSI_M: CInt = 65

public val SC_T_IOV_MAX: CInt = 66

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_C_VERSION: CInt = 96

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_CHAR_BIT: CInt = 101

public val SC_CHAR_MAX: CInt = 102

public val SC_CHAR_MIN: CInt = 103

public val SC_INT_MAX: CInt = 104

public val SC_INT_MIN: CInt = 105

public val SC_LONG_BIT: CInt = 106

public val SC_WORD_BIT: CInt = 107

public val SC_MB_LEN_MAX: CInt = 108

public val SC_NZERO: CInt = 109

public val SC_SSIZE_MAX: CInt = 110

public val SC_SCHAR_MAX: CInt = 111

public val SC_SCHAR_MIN: CInt = 112

public val SC_SHRT_MAX: CInt = 113

public val SC_SHRT_MIN: CInt = 114

public val SC_UCHAR_MAX: CInt = 115

public val SC_UINT_MAX: CInt = 116

public val SC_ULONG_MAX: CInt = 117

public val SC_USHRT_MAX: CInt = 118

public val SC_NL_ARGMAX: CInt = 119

public val SC_NL_LANGMAX: CInt = 120

public val SC_NL_MSGMAX: CInt = 121

public val SC_NL_NMAX: CInt = 122

public val SC_NL_SETMAX: CInt = 123

public val SC_NL_TEXTMAX: CInt = 124

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_BASE: CInt = 134

public val SC_C_LANG_SUPPORT: CInt = 135

public val SC_C_LANG_SUPPORT_R: CInt = 136

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_DEVICE_IO: CInt = 140

public val SC_DEVICE_SPECIFIC: CInt = 141

public val SC_DEVICE_SPECIFIC_R: CInt = 142

public val SC_FD_MGMT: CInt = 143

public val SC_FIFO: CInt = 144

public val SC_PIPE: CInt = 145

public val SC_FILE_ATTRIBUTES: CInt = 146

public val SC_FILE_LOCKING: CInt = 147

public val SC_FILE_SYSTEM: CInt = 148

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_MULTI_PROCESS: CInt = 150

public val SC_SINGLE_PROCESS: CInt = 151

public val SC_NETWORKING: CInt = 152

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_REGEX_VERSION: CInt = 156

public val SC_SHELL: CInt = 157

public val SC_SIGNALS: CInt = 158

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_SYSTEM_DATABASE: CInt = 162

public val SC_SYSTEM_DATABASE_R: CInt = 163

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_USER_GROUPS: CInt = 166

public val SC_USER_GROUPS_R: CInt = 167

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_LEVEL1_ICACHE_SIZE: CInt = 185

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 186

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 187

public val SC_LEVEL1_DCACHE_SIZE: CInt = 188

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 189

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 190

public val SC_LEVEL2_CACHE_SIZE: CInt = 191

public val SC_LEVEL2_CACHE_ASSOC: CInt = 192

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 193

public val SC_LEVEL3_CACHE_SIZE: CInt = 194

public val SC_LEVEL3_CACHE_ASSOC: CInt = 195

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 196

public val SC_LEVEL4_CACHE_SIZE: CInt = 197

public val SC_LEVEL4_CACHE_ASSOC: CInt = 198

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 199

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val SC_MINSIGSTKSZ: CInt = 249

public val SC_SIGSTKSZ: CInt = 250

public val CS_PATH: CInt = 0

public val CS_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_GNU_LIBC_VERSION: CInt = 2

public val CS_GNU_LIBPTHREAD_VERSION: CInt = 3

public val CS_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_LFS_CFLAGS: CInt = 1000

public val CS_LFS_LDFLAGS: CInt = 1001

public val CS_LFS_LIBS: CInt = 1002

public val CS_LFS_LINTFLAGS: CInt = 1003

public val CS_LFS64_CFLAGS: CInt = 1004

public val CS_LFS64_LDFLAGS: CInt = 1005

public val CS_LFS64_LIBS: CInt = 1006

public val CS_LFS64_LINTFLAGS: CInt = 1007

public val CS_XBS5_ILP32_OFF32_CFLAGS: CInt = 1100

public val CS_XBS5_ILP32_OFF32_LDFLAGS: CInt = 1101

public val CS_XBS5_ILP32_OFF32_LIBS: CInt = 1102

public val CS_XBS5_ILP32_OFF32_LINTFLAGS: CInt = 1103

public val CS_XBS5_ILP32_OFFBIG_CFLAGS: CInt = 1104

public val CS_XBS5_ILP32_OFFBIG_LDFLAGS: CInt = 1105

public val CS_XBS5_ILP32_OFFBIG_LIBS: CInt = 1106

public val CS_XBS5_ILP32_OFFBIG_LINTFLAGS: CInt = 1107

public val CS_XBS5_LP64_OFF64_CFLAGS: CInt = 1108

public val CS_XBS5_LP64_OFF64_LDFLAGS: CInt = 1109

public val CS_XBS5_LP64_OFF64_LIBS: CInt = 1110

public val CS_XBS5_LP64_OFF64_LINTFLAGS: CInt = 1111

public val CS_XBS5_LPBIG_OFFBIG_CFLAGS: CInt = 1112

public val CS_XBS5_LPBIG_OFFBIG_LDFLAGS: CInt = 1113

public val CS_XBS5_LPBIG_OFFBIG_LIBS: CInt = 1114

public val CS_XBS5_LPBIG_OFFBIG_LINTFLAGS: CInt = 1115

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val PTHREAD_PROCESS_PRIVATE: PthreadProcessShared = 0u

public val PTHREAD_PROCESS_SHARED: PthreadProcessShared = 1u

public val PTHREAD_EXPLICIT_SCHED: PthreadInheritsched = 0u

public val PTHREAD_INHERIT_SCHED: PthreadInheritsched = 1u

public val PTHREAD_SCOPE_SYSTEM: PthreadContentionscope = 0u

public val PTHREAD_SCOPE_PROCESS: PthreadContentionscope = 1u

public val PTHREAD_CREATE_JOINABLE: PthreadDetachstate = 0u

public val PTHREAD_CREATE_DETACHED: PthreadDetachstate = 1u

public val PTHREAD_PRIO_NONE: PthreadMutexProtocol = 0u

public val PTHREAD_PRIO_INHERIT: PthreadMutexProtocol = 1u

public val PTHREAD_PRIO_PROTECT: PthreadMutexProtocol = 2u

public val PTHREAD_MUTEX_TIMED: PthreadMutexType = 0u

public val PTHREAD_MUTEX_ERRORCHECK: PthreadMutexType = 1u

public val PTHREAD_MUTEX_RECURSIVE: PthreadMutexType = 2u

public val PTHREAD_MUTEX_STALLED: PthreadMutexRobustness = 0u

public val PTHREAD_MUTEX_ROBUST: PthreadMutexRobustness = 256u

public val RLIMIT_CPU: RlimitResourceT = 0u

public val RLIMIT_FSIZE: RlimitResourceT = 1u

public val RLIMIT_DATA: RlimitResourceT = 2u

public val RLIMIT_STACK: RlimitResourceT = 3u

public val RLIMIT_CORE: RlimitResourceT = 4u

public val RLIMIT_RSS: RlimitResourceT = 5u

public val RLIMIT_MEMLOCK: RlimitResourceT = 6u

public val RLIMIT_NPROC: RlimitResourceT = 7u

public val RLIMIT_OFILE: RlimitResourceT = 8u

public val RLIMIT_NOFILE: RlimitResourceT = 8u

public val RLIMIT_SBSIZE: RlimitResourceT = 9u

public val RLIMIT_AS: RlimitResourceT = 10u

public val RLIMIT_VMEM: RlimitResourceT = 10u

public val RLIMIT_NLIMITS: RlimitResourceT = 11u

public val RLIM_NLIMITS: RlimitResourceT = 11u

public val RUSAGE_SELF: RusageWho = 0

public val RUSAGE_CHILDREN: RusageWho = -1

public val PRIO_PROCESS: PriorityWhich = 0u

public val PRIO_PGRP: PriorityWhich = 1u

public val PRIO_USER: PriorityWhich = 2u

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_CLOEXEC: CInt = 4194304

public val SOCK_NONBLOCK: CInt = 2048

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTROUTE: CInt = 4

public val MSG_EOR: CInt = 8

public val MSG_TRUNC: CInt = 16

public val MSG_CTRUNC: CInt = 32

public val MSG_WAITALL: CInt = 64

public val MSG_DONTWAIT: CInt = 128

public val MSG_NOSIGNAL: CInt = 1024

public val MSG_CMSG_CLOEXEC: CInt = 0x40000000

public val SCM_RIGHTS: CInt = 1

public val SCM_TIMESTAMP: CInt = 2

public val SCM_CREDS: CInt = 3

public val SO_DEBUG: CInt = 1

public val SO_ACCEPTCONN: CInt = 2

public val SO_REUSEADDR: CInt = 4

public val SO_KEEPALIVE: CInt = 8

public val SO_DONTROUTE: CInt = 16

public val SO_BROADCAST: CInt = 32

public val SO_USELOOPBACK: CInt = 64

public val SO_LINGER: CInt = 128

public val SO_OOBINLINE: CInt = 256

public val SO_REUSEPORT: CInt = 512

public val SO_SNDBUF: CInt = 4097

public val SO_RCVBUF: CInt = 4098

public val SO_SNDLOWAT: CInt = 4099

public val SO_RCVLOWAT: CInt = 4100

public val SO_SNDTIMEO: CInt = 4101

public val SO_RCVTIMEO: CInt = 4102

public val SO_ERROR: CInt = 4103

public val SO_STYLE: CInt = 4104

public val SO_TYPE: CInt = 4104

public val IPPROTO_IP: CInt = 0

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_IPIP: CInt = 4

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_EGP: CInt = 8

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_TP: CInt = 29

public val IPPROTO_DCCP: CInt = 33

public val IPPROTO_IPV6: CInt = 41

public val IPPROTO_RSVP: CInt = 46

public val IPPROTO_GRE: CInt = 47

public val IPPROTO_ESP: CInt = 50

public val IPPROTO_AH: CInt = 51

public val IPPROTO_MTP: CInt = 92

public val IPPROTO_BEETPH: CInt = 94

public val IPPROTO_ENCAP: CInt = 98

public val IPPROTO_PIM: CInt = 103

public val IPPROTO_COMP: CInt = 108

public val IPPROTO_L2TP: CInt = 115

public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_UDPLITE: CInt = 136

public val IPPROTO_MPLS: CInt = 137

public val IPPROTO_ETHERNET: CInt = 143

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MPTCP: CInt = 262

public val IPPROTO_MAX: CInt = 263

public val IPPROTO_HOPOPTS: CInt = 0

public val IPPROTO_ROUTING: CInt = 43

public val IPPROTO_FRAGMENT: CInt = 44

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_NONE: CInt = 59

public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_MH: CInt = 135

public val IPPORT_ECHO: InPortT = 7u

public val IPPORT_DISCARD: InPortT = 9u

public val IPPORT_SYSTAT: InPortT = 11u

public val IPPORT_DAYTIME: InPortT = 13u

public val IPPORT_NETSTAT: InPortT = 15u

public val IPPORT_FTP: InPortT = 21u

public val IPPORT_TELNET: InPortT = 23u

public val IPPORT_SMTP: InPortT = 25u

public val IPPORT_TIMESERVER: InPortT = 37u

public val IPPORT_NAMESERVER: InPortT = 42u

public val IPPORT_WHOIS: InPortT = 43u

public val IPPORT_MTP: InPortT = 57u

public val IPPORT_TFTP: InPortT = 69u

public val IPPORT_RJE: InPortT = 77u

public val IPPORT_FINGER: InPortT = 79u

public val IPPORT_TTYLINK: InPortT = 87u

public val IPPORT_SUPDUP: InPortT = 95u

public val IPPORT_EXECSERVER: InPortT = 512u

public val IPPORT_LOGINSERVER: InPortT = 513u

public val IPPORT_CMDSERVER: InPortT = 514u

public val IPPORT_EFSSERVER: InPortT = 520u

public val IPPORT_BIFFUDP: InPortT = 512u

public val IPPORT_WHOSERVER: InPortT = 513u

public val IPPORT_ROUTESERVER: InPortT = 520u

public val IPPORT_USERRESERVED: InPortT = 5000u

public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

public val DT_WHT: CUchar = 14u

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_NOATIME: CUlong = 32uL

public val ST_RELATIME: CUlong = 64uL

public val RTLD_DI_LMID: CInt = 1

public val RTLD_DI_LINKMAP: CInt = 2

public val RTLD_DI_CONFIGADDR: CInt = 3

public val RTLD_DI_SERINFO: CInt = 4

public val RTLD_DI_SERINFOSIZE: CInt = 5

public val RTLD_DI_ORIGIN: CInt = 6

public val RTLD_DI_PROFILENAME: CInt = 7

public val RTLD_DI_PROFILEOUT: CInt = 8

public val RTLD_DI_TLS_MODID: CInt = 9

public val RTLD_DI_TLS_DATA: CInt = 10

public val RTLD_DI_PHDR: CInt = 11

public val RTLD_DI_MAX: CInt = 11

public val SI_ASYNCIO: CInt = -4

public val SI_MESGQ: CInt = -3

public val SI_TIMER: CInt = -2

public val SI_QUEUE: CInt = -1

public val SI_USER: CInt = 0

public val ILL_ILLOPC: CInt = 1

public val ILL_ILLOPN: CInt = 2

public val ILL_ILLADR: CInt = 3

public val ILL_ILLTRP: CInt = 4

public val ILL_PRVOPC: CInt = 5

public val ILL_PRVREG: CInt = 6

public val ILL_COPROC: CInt = 7

public val ILL_BADSTK: CInt = 8

public val FPE_INTDIV: CInt = 1

public val FPE_INTOVF: CInt = 2

public val FPE_FLTDIV: CInt = 3

public val FPE_FLTOVF: CInt = 4

public val FPE_FLTUND: CInt = 5

public val FPE_FLTRES: CInt = 6

public val FPE_FLTINV: CInt = 7

public val FPE_FLTSUB: CInt = 8

public val SEGV_MAPERR: CInt = 1

public val SEGV_ACCERR: CInt = 2

public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

public val TRAP_BRKPT: CInt = 1

public val TRAP_TRACE: CInt = 2

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val POLL_IN: CInt = 1

public val POLL_OUT: CInt = 2

public val POLL_MSG: CInt = 3

public val POLL_ERR: CInt = 4

public val POLL_PRI: CInt = 5

public val POLL_HUP: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val REG_GS: CUint = 0u

public val REG_FS: CUint = 1u

public val REG_ES: CUint = 2u

public val REG_DS: CUint = 3u

public val REG_EDI: CUint = 4u

public val REG_ESI: CUint = 5u

public val REG_EBP: CUint = 6u

public val REG_ESP: CUint = 7u

public val REG_EBX: CUint = 8u

public val REG_EDX: CUint = 9u

public val REG_ECX: CUint = 10u

public val REG_EAX: CUint = 11u

public val REG_TRAPNO: CUint = 12u

public val REG_ERR: CUint = 13u

public val REG_EIP: CUint = 14u

public val REG_CS: CUint = 15u

public val REG_EFL: CUint = 16u

public val REG_UESP: CUint = 17u

public val REG_SS: CUint = 18u

public val IOC_VOID: IoctlDir = 0u

public val IOC_OUT: IoctlDir = 1u

public val IOC_IN: IoctlDir = 2u

public val IOC_INOUT: IoctlDir = 3u

public val IOC_8: IoctlDatum = 0u

public val IOC_16: IoctlDatum = 1u

public val IOC_32: IoctlDatum = 2u

public val IOC_64: IoctlDatum = 3u

public val TCP_ESTABLISHED: CUint = 1u

public val TCP_SYN_SENT: CUint = 2u

public val TCP_SYN_RECV: CUint = 3u

public val TCP_FIN_WAIT1: CUint = 4u

public val TCP_FIN_WAIT2: CUint = 5u

public val TCP_TIME_WAIT: CUint = 6u

public val TCP_CLOSE: CUint = 7u

public val TCP_CLOSE_WAIT: CUint = 8u

public val TCP_LAST_ACK: CUint = 9u

public val TCP_LISTEN: CUint = 10u

public val TCP_CLOSING: CUint = 11u

public val TCP_CA_OPEN: TcpCaState = 0u

public val TCP_CA_DISORDER: TcpCaState = 1u

public val TCP_CA_CWR: TcpCaState = 2u

public val TCP_CA_RECOVERY: TcpCaState = 3u

public val TCP_CA_LOSS: TcpCaState = 4u

public val TCP_NO_QUEUE: CUint = 0u

public val TCP_RECV_QUEUE: CUint = 1u

public val TCP_SEND_QUEUE: CUint = 2u

public val TCP_QUEUES_NR: CUint = 3u

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 4

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(lock = 0, ownerId = 0, cnt = 0, shpid = 0, type = PTHREAD_MUTEX_TIMED.toInt(), flags = 0, reserved1 = 0, reserved2 = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(lock = PTHREAD_SPIN_LOCK_INITIALIZER, queue = null, attr = null, wrefs = 0, data = null)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(held = PTHREAD_SPIN_LOCK_INITIALIZER, lock = PTHREAD_SPIN_LOCK_INITIALIZER, readers = 0, readerqueue = null, writerqueue = null, attr = null, data = null)

public val PTHREAD_STACK_MIN: SizeT = 0uL

// Non-public helper constants
public val UTSNAME_LENGTH: Int = 1024

public fun cmsgAlign(len: Int): Int {
    return (len + sizeOf<Int>() - 1) and (sizeOf<Int>() - 1).inv()
}

public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lutimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun futimes(fd: CInt, times: Timeval?): CInt {
    return LibcDynamicFfi.invoke("futimes", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(fd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), __scratch_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun libcCurrentSigrtmin(): CInt {
    return LibcDynamicFfi.invoke("__libc_current_sigrtmin", -1, longArrayOf()).toInt()
}

public fun libcCurrentSigrtmax(): CInt {
    return LibcDynamicFfi.invoke("__libc_current_sigrtmax", -1, longArrayOf()).toInt()
}

public fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait4", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong(), rusage?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun sigwait(set: CUlong?, sig: CInt?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sigsuspend(mask: CUlong?): CInt {
    val __slot_0 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: Timespec?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(__slot_0, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(__slot_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(oldfd.toLong(), newfd.toLong(), flags.toLong())).toInt()
}

public fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("pread64", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("pwrite64", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun readv(fd: CInt, iovec: Iovec?, count: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iovec?.value ?: 0L, count.toLong()))
}

public fun writev(fd: CInt, iovec: Iovec?, count: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iovec?.value ?: 0L, count.toLong()))
}

public fun preadv(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iovec?.value ?: 0L, count.toLong(), offset))
}

public fun pwritev(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iovec?.value ?: 0L, count.toLong(), offset))
}

public fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("preadv64", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("pwritev64", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread_unlocked", -1, longArrayOf(buf?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun aioRead(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_read", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioWrite(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_write", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_fsync", -1, longArrayOf(op.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioError(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_error", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioReturn(aiocbp: Aiocb?): SsizeT {
    return LibcDynamicFfi.invoke("aio_return", -1, longArrayOf(aiocbp?.value ?: 0L))
}

public fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("aio_suspend", -1, longArrayOf(aiocbList?.value ?: 0L, nitems.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_cancel", -1, longArrayOf(fd.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("lio_listio", -1, longArrayOf(mode.toLong(), aiocbList?.value ?: 0L, nitems.toLong(), sevp?.value ?: 0L)).toInt()
}

public fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqClose(mqd: MqdT): CInt {
    return LibcDynamicFfi.invoke("mq_close", -1, longArrayOf(mqd.toLong())).toInt()
}

public fun mqUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT {
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_receive", -1, longArrayOf(mqd.toLong(), msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT {
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_timedreceive", -1, longArrayOf(mqd.toLong(), msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3, absTimeout?.value ?: 0L))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_send", -1, longArrayOf(mqd.toLong(), __cstr_1, msgLen.toLong(), msgPrio.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_timedsend", -1, longArrayOf(mqd.toLong(), __cstr_1, msgLen.toLong(), msgPrio.toLong(), absTimeout?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_getattr", -1, longArrayOf(mqd.toLong(), attr?.value ?: 0L)).toInt()
}

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_setattr", -1, longArrayOf(mqd.toLong(), newattr?.value ?: 0L, oldattr?.value ?: 0L)).toInt()
}

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T {
    return LibcDynamicFfi.invoke("lseek64", -1, longArrayOf(fd.toLong(), offset, whence.toLong()))
}

public fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT {
    return LibcDynamicFfi.invoke("lseek", -1, longArrayOf(fd.toLong(), offset, whence.toLong()))
}

public fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt {
    return LibcDynamicFfi.invoke("fgetpos64", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko64", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt {
    return LibcDynamicFfi.invoke("fsetpos64", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun ftello64(stream: FILE?): Off64T {
    return LibcDynamicFfi.invoke("ftello64", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(fd.toLong(), addr?.value ?: 0L, len.toLong())).toInt()
}

public fun accept4(fd: CInt, addr: Sockaddr?, len: CUint?, flg: CInt): CInt {
    val __slot_2 = if (len == null) 0L else LibcDynamicFfi.allocScalarSlot(len.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(fd.toLong(), addr?.value ?: 0L, __slot_2, flg.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: CUlong?): CInt {
    val __slot_3 = if (sigmask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigmask.toLong())
    try {
        return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(fd.toLong(), message?.value ?: 0L, flags.toLong()))
}

public fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(fd.toLong(), message?.value ?: 0L, flags.toLong()))
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT {
    val __slot_2 = if (offset == null) 0L else LibcDynamicFfi.allocScalarSlot(offset)
    try {
        return LibcDynamicFfi.invoke("sendfile", -1, longArrayOf(outFd.toLong(), inFd.toLong(), __slot_2, count.toLong()))
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sendfile64(outFd: CInt, inFd: CInt, offset: SquadType?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("sendfile64", -1, longArrayOf(outFd.toLong(), inFd.toLong(), offset?.value ?: 0L, count.toLong()))
}

public fun shutdown(fd: CInt, how: CInt): CInt {
    return LibcDynamicFfi.invoke("shutdown", -1, longArrayOf(fd.toLong(), how.toLong())).toInt()
}

public fun sethostname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getdomainname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("getdomainname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun setdomainname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setdomainname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun gethostid(): CLong {
    return LibcDynamicFfi.invoke("gethostid", -1, longArrayOf())
}

public fun sethostid(hostid: CLong): CInt {
    return LibcDynamicFfi.invoke("sethostid", -1, longArrayOf(hostid)).toInt()
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setspent() {
    LibcDynamicFfi.invoke("setspent", -1, longArrayOf())
}

public fun endspent() {
    LibcDynamicFfi.invoke("endspent", -1, longArrayOf())
}

public fun getspent(): Spwd? {
    val rawRet = LibcDynamicFfi.invoke("getspent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getspnam(name: String?): Spwd? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getspnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwent_r", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrent_r", -1, longArrayOf(grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetpwent_r", -1, longArrayOf(stream?.handle ?: 0L, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetgrent_r", -1, longArrayOf(stream?.handle ?: 0L, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun putpwent(p: Passwd?, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("putpwent", -1, longArrayOf(p?.value ?: 0L, stream?.handle ?: 0L)).toInt()
}

public fun putgrent(grp: Group?, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("putgrent", -1, longArrayOf(grp?.value ?: 0L, stream?.handle ?: 0L)).toInt()
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetspent_r", -1, longArrayOf(fp?.handle ?: 0L, spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
}

public fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("sgetspent_r", -1, longArrayOf(__cstr_0, spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getspent_r", -1, longArrayOf(spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
}

public fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getspnam_r", -1, longArrayOf(__cstr_0, spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// mntent.h
public fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent? {
    val rawRet = LibcDynamicFfi.invoke("getmntent_r", -1, longArrayOf(stream?.handle ?: 0L, mntbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun utmpname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun getresuid(ruid: CUint?, euid: CUint?, suid: CUint?): CInt {
    val __slot_0 = if (ruid == null) 0L else LibcDynamicFfi.allocScalarSlot(ruid.toLong())
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (suid == null) 0L else LibcDynamicFfi.allocScalarSlot(suid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresuid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getresgid(rgid: CUint?, egid: CUint?, sgid: CUint?): CInt {
    val __slot_0 = if (rgid == null) 0L else LibcDynamicFfi.allocScalarSlot(rgid.toLong())
    val __slot_1 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    val __slot_2 = if (sgid == null) 0L else LibcDynamicFfi.allocScalarSlot(sgid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresgid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt {
    return LibcDynamicFfi.invoke("setresuid", -1, longArrayOf(ruid.toLong(), euid.toLong(), suid.toLong())).toInt()
}

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt {
    return LibcDynamicFfi.invoke("setresgid", -1, longArrayOf(rgid.toLong(), egid.toLong(), sgid.toLong())).toInt()
}

public fun initgroups(user: String?, group: GidT): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, group.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrouplist(user: String?, group: GidT, groups: CUint?, ngroups: CInt?): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    val __slot_2 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    val __slot_3 = if (ngroups == null) 0L else LibcDynamicFfi.allocScalarSlot(ngroups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, group.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun setgroups(ngroups: SizeT, ptr: CUint?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun acct(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("acct", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setmntent(filename: String?, ty: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (ty == null) 0L else LibcDynamicFfi.allocUtf8CString(ty)
    try {
        val rawRet = LibcDynamicFfi.invoke("setmntent", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getmntent(stream: FILE?): Mntent? {
    val rawRet = LibcDynamicFfi.invoke("getmntent", -1, longArrayOf(stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun addmntent(stream: FILE?, mnt: Mntent?): CInt {
    return LibcDynamicFfi.invoke("addmntent", -1, longArrayOf(stream?.handle ?: 0L, mnt?.value ?: 0L)).toInt()
}

public fun endmntent(streamp: FILE?): CInt {
    return LibcDynamicFfi.invoke("endmntent", -1, longArrayOf(streamp?.handle ?: 0L)).toInt()
}

public fun hasmntopt(mnt: Mntent?, opt: String?): COpaquePointer? {
    val __cstr_1 = if (opt == null) 0L else LibcDynamicFfi.allocUtf8CString(opt)
    try {
        val rawRet = LibcDynamicFfi.invoke("hasmntopt", -1, longArrayOf(mnt?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadCreate(native: CLong?, attr: PthreadAttr?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (native == null) 0L else LibcDynamicFfi.allocScalarSlot(native)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadKill(threadid: PthreadT, signo: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(threadid, signo.toLong())).toInt()
}

public fun pthreadCancel(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_cancel", -1, longArrayOf(thread)).toInt()
}

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt {
    return LibcDynamicFfi.invoke("__pthread_equal", -1, longArrayOf(t1, t2)).toInt()
}

public fun pthreadGetattrNp(thr: PthreadT, attr: PthreadAttr?): CInt {
    return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(thr, attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetguardsize(attr: PthreadAttr?, guardsize: SizeT?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetguardsize(attr: PthreadAttr?, guardsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setguardsize", -1, longArrayOf(attr?.value ?: 0L, guardsize.toLong())).toInt()
}

public fun pthreadAttrGetstack(attr: PthreadAttr?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadMutexattrGetpshared(attr: PthreadMutexattr?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexattrSetpshared(attr: PthreadMutexattr?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadMutexTimedlock(lock: PthreadMutex?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattr?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattr?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun pthreadCondattrGetclock(attr: PthreadCondattr?, clockId: CInt?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattr?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun pthreadCondattrGetpshared(attr: PthreadCondattr?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetpshared(attr: PthreadCondattr?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadOnce(control: PthreadOnce?, routine: PthreadOnceRoutineCallback): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_once", -1, longArrayOf(control?.value ?: 0L, __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun pthreadBarrierattrInit(attr: PthreadBarrierattr?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadBarrierattrDestroy(attr: PthreadBarrierattr?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattr?, shared: CInt?): CInt {
    val __slot_1 = if (shared == null) 0L else LibcDynamicFfi.allocScalarSlot(shared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattr?, shared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, shared.toLong())).toInt()
}

public fun pthreadBarrierInit(barrier: PthreadBarrier?, attr: PthreadBarrierattr?, count: CUint): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_init", -1, longArrayOf(barrier?.value ?: 0L, attr?.value ?: 0L, count.toLong())).toInt()
}

public fun pthreadBarrierDestroy(barrier: PthreadBarrier?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_destroy", -1, longArrayOf(barrier?.value ?: 0L)).toInt()
}

public fun pthreadBarrierWait(barrier: PthreadBarrier?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_wait", -1, longArrayOf(barrier?.value ?: 0L)).toInt()
}

public fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(__slot_0, pshared.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinDestroy(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinLock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinTrylock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinUnlock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun pthreadSigmask(how: CInt, newmask: CUlong?, oldmask: CUlong?): CInt {
    val __slot_1 = if (newmask == null) 0L else LibcDynamicFfi.allocScalarSlot(newmask.toLong())
    val __slot_2 = if (oldmask == null) 0L else LibcDynamicFfi.allocScalarSlot(oldmask.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt {
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getschedparam", -1, longArrayOf(native, __slot_1, param?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_setschedparam", -1, longArrayOf(native, policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun pthreadGetcpuclockid(thread: PthreadT, clkId: CInt?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getcpuclockid", -1, longArrayOf(thread, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun clockGetres(clockId: ClockidT, res: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clockId.toLong(), res?.value ?: 0L)).toInt()
}

public fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(tm?.value ?: 0L, buf?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, buf?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(s?.value ?: 0L, max.toLong(), __cstr_2, tm?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        val rawRet = LibcDynamicFfi.invoke("strptime", -1, longArrayOf(__cstr_0, __cstr_1, tm?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: UwordType?): CInt {
    return LibcDynamicFfi.invoke("timer_create", -1, longArrayOf(clockid.toLong(), sevp?.value ?: 0L, timerid?.value ?: 0L)).toInt()
}

public fun timerDelete(timerid: TimerT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_delete", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerGetoverrun(timerid: TimerT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_getoverrun", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_gettime", -1, longArrayOf(__scratch_0, currValue?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_settime", -1, longArrayOf(__scratch_0, flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun fstat(fd: CInt, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun fstat64(fd: CInt, buf: Stat64?): CInt {
    return LibcDynamicFfi.invoke("fstat64", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt {
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("fstatat", -1, longArrayOf(fd.toLong(), __cstr_1, buf?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt {
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("fstatat64", -1, longArrayOf(fd.toLong(), __cstr_1, buf?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("statx", -1, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong(), mask.toLong(), statxbuf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun ftruncate(fd: CInt, length: OffT): CInt {
    return LibcDynamicFfi.invoke("ftruncate", -1, longArrayOf(fd.toLong(), length)).toInt()
}

public fun ftruncate64(fd: CInt, length: Off64T): CInt {
    return LibcDynamicFfi.invoke("ftruncate64", -1, longArrayOf(fd.toLong(), length)).toInt()
}

public fun truncate64(file: String?, length: Off64T): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("truncate64", -1, longArrayOf(__cstr_0, length)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lstat(file: String?, buf: Stat?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lstat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lstat64(file: String?, buf: Stat64?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lstat64", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun statfs(path: String?, buf: Statfs?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("statfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun statfs64(file: String?, buf: Statfs64?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("statfs64", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatfs(fd: CInt, buf: Statfs?): CInt {
    return LibcDynamicFfi.invoke("fstatfs", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt {
    return LibcDynamicFfi.invoke("fstatfs64", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun statvfs(file: String?, buf: Statvfs?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("statvfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun statvfs64(file: String?, buf: Statvfs64?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("statvfs64", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt {
    return LibcDynamicFfi.invoke("fstatvfs", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt {
    return LibcDynamicFfi.invoke("fstatvfs64", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun open(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun open64(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("open64", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun openat(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("openat", 3, longArrayOf(fd.toLong(), __cstr_1, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun openat64(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("openat64", 3, longArrayOf(fd.toLong(), __cstr_1, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fopen64(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen64", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen64", -1, longArrayOf(__cstr_0, __cstr_1, file?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun creat64(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("creat64", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun tmpfile64(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile64", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

// Added in `glibc` 2.34
public fun closeRange(first: CUint, last: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("close_range", -1, longArrayOf(first.toLong(), last.toLong(), flags.toLong())).toInt()
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getpt(): CInt {
    return LibcDynamicFfi.invoke("getpt", -1, longArrayOf()).toInt()
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun loginTty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("login_tty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun ctermid(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ctermid", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("execveat", -1, longArrayOf(dirfd.toLong(), __cstr_1, argv?.value ?: 0L, envp?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

// posix/spawn.h
public fun posixSpawn(pid: CInt?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnp(pid: CInt?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("posix_spawnp", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getflags", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setflags", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: CInt?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getpgroup", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setpgroup", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getschedpolicy", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedpolicy", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_init", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_destroy", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addopen", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), __cstr_2, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclose", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_adddup2", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), newfd.toLong())).toInt()
}

// Added in `glibc` 2.29
public fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir_np", -1, longArrayOf(actions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// Added in `glibc` 2.29
public fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir_np", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

// Added in `glibc` 2.34
public fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclosefrom_np", -1, longArrayOf(actions?.value ?: 0L, from.toLong())).toInt()
}

// Added in `glibc` 2.35
public fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addtcsetpgrp_np", -1, longArrayOf(actions?.value ?: 0L, tcfd.toLong())).toInt()
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun euidaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("euidaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun eaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("eaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun stat(file: String?, buf: Stat?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun stat64(file: String?, buf: Stat64?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("stat64", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun readdir(dirp: DIR?): Dirent? {
    val rawRet = LibcDynamicFfi.invoke("readdir", -1, longArrayOf(dirp?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun readdir64(dirp: DIR?): Dirent64? {
    val rawRet = LibcDynamicFfi.invoke("readdir64", -1, longArrayOf(dirp?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("readdir_r", -1, longArrayOf(dirp?.handle ?: 0L, entry?.value ?: 0L, result?.value ?: 0L)).toInt()
}

public fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("readdir64_r", -1, longArrayOf(dirp?.handle ?: 0L, entry?.value ?: 0L, result?.value ?: 0L)).toInt()
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("__xpg_strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap64", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mremap", 4, longArrayOf(addr?.value ?: 0L, len.toLong(), newLen.toLong(), flags.toLong()) + variadicArgs)
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun syncfs(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("syncfs", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt {
    return LibcDynamicFfi.invoke("fallocate64", -1, longArrayOf(fd.toLong(), mode.toLong(), offset, len)).toInt()
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate64", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
}

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise64", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("getrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("setrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getpriority(which: PriorityWhich, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buffer?.value ?: 0L, length.toLong(), flags.toLong()))
}

public fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buffer?.value ?: 0L, length.toLong())).toInt()
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strchrnul(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchrnul", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun drand48(): CDouble {
    return LibcDynamicFfi.invokeFp("drand48", 0, false, longArrayOf())
}

public fun erand48(xseed: CUshort?): CDouble {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invokeFp("erand48", 0, false, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lrand48(): CLong {
    return LibcDynamicFfi.invoke("lrand48", -1, longArrayOf())
}

public fun nrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("nrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mrand48(): CLong {
    return LibcDynamicFfi.invoke("mrand48", -1, longArrayOf())
}

public fun jrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("jrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun srand48(seed: CLong) {
    LibcDynamicFfi.invoke("srand48", -1, longArrayOf(seed))
}

public fun seed48(xseed: CUshort?): CUshort? {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("seed48", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lcong48(p: CUshort?) {
    val __slot_0 = if (p == null) 0L else LibcDynamicFfi.allocScalarSlot(p.toLong())
    try {
        LibcDynamicFfi.invoke("lcong48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    LibcDynamicFfi.invoke("qsort_r", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L, arg?.value ?: 0L))
}

public fun brk(addr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("brk", -1, longArrayOf(addr?.value ?: 0L)).toInt()
}

public fun sbrk(increment: IntptrT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sbrk", -1, longArrayOf(increment))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mallopt(param: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("mallopt", -1, longArrayOf(param.toLong(), value.toLong())).toInt()
}

public fun mallinfo(): Mallinfo {
    LibcDynamicFfi.invoke("mallinfo", -1, longArrayOf())
    return null as Mallinfo
}

public fun mallinfo2(): Mallinfo2 {
    LibcDynamicFfi.invoke("mallinfo2", -1, longArrayOf())
    return null as Mallinfo2
}

public fun mallocInfo(options: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("malloc_info", -1, longArrayOf(options.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun mallocTrim(pad: SizeT): CInt {
    return LibcDynamicFfi.invoke("malloc_trim", -1, longArrayOf(pad.toLong())).toInt()
}

public fun iconvOpen(tocode: String?, fromcode: String?): IconvT {
    val __cstr_0 = if (tocode == null) 0L else LibcDynamicFfi.allocUtf8CString(tocode)
    val __cstr_1 = if (fromcode == null) 0L else LibcDynamicFfi.allocUtf8CString(fromcode)
    try {
        val rawRet = LibcDynamicFfi.invoke("iconv_open", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT {
    val __slot_2 = if (inbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(inbytesleft.toLong())
    val __slot_4 = if (outbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(outbytesleft.toLong())
    try {
        return LibcDynamicFfi.invoke("iconv", -1, longArrayOf(cd?.value ?: 0L, inbuf?.value ?: 0L, __slot_2, outbuf?.value ?: 0L, __slot_4)).toULong()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun iconvClose(cd: IconvT): CInt {
    return LibcDynamicFfi.invoke("iconv_close", -1, longArrayOf(cd?.value ?: 0L)).toInt()
}

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt {
    val __cstr_2 = if (optstring == null) 0L else LibcDynamicFfi.allocUtf8CString(optstring)
    val __slot_4 = if (longindex == null) 0L else LibcDynamicFfi.allocScalarSlot(longindex.toLong())
    try {
        return LibcDynamicFfi.invoke("getopt_long", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2, longopts?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun backtrace(buf: COpaquePointer?, sz: CInt): CInt {
    return LibcDynamicFfi.invoke("backtrace", -1, longArrayOf(buf?.value ?: 0L, sz.toLong())).toInt()
}

public fun reboot(howTo: CInt): CInt {
    return LibcDynamicFfi.invoke("reboot", -1, longArrayOf(howTo.toLong())).toInt()
}

public fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt {
    val __slot_0 = if (loadavg == null) 0L else LibcDynamicFfi.allocScalarSlot(loadavg.toRawBits())
    try {
        return LibcDynamicFfi.invoke("getloadavg", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt {
    val __cstr_1 = if (input == null) 0L else LibcDynamicFfi.allocUtf8CString(input)
    try {
        return LibcDynamicFfi.invoke("regexec", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, nmatch.toLong(), pmatch?.value ?: 0L, eflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT {
    return LibcDynamicFfi.invoke("regerror", -1, longArrayOf(errcode.toLong(), preg?.value ?: 0L, errbuf?.value ?: 0L, errbufSize.toLong())).toULong()
}

public fun regfree(preg: RegexT?) {
    LibcDynamicFfi.invoke("regfree", -1, longArrayOf(preg?.value ?: 0L))
}

public fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree(pglob: GlobT?) {
    LibcDynamicFfi.invoke("globfree", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: Glob64T?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob64", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree64(pglob: Glob64T?) {
    LibcDynamicFfi.invoke("globfree64", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lgetxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fgetxattr", -1, longArrayOf(filedes.toLong(), __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lsetxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fsetxattr", -1, longArrayOf(filedes.toLong(), __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("listxattr", -1, longArrayOf(__cstr_0, list?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("llistxattr", -1, longArrayOf(__cstr_0, list?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("flistxattr", -1, longArrayOf(filedes.toLong(), list?.value ?: 0L, size.toLong()))
}

public fun removexattr(path: String?, name: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("removexattr", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lremovexattr(path: String?, name: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lremovexattr", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fremovexattr(filedes: CInt, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fremovexattr", -1, longArrayOf(filedes.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public fun posixBasename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("__xpg_basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public fun gnuBasename(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_1 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlmopen", -1, longArrayOf(lmid, __cstr_1, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dlinfo", -1, longArrayOf(handle?.value ?: 0L, request.toLong(), info?.value ?: 0L)).toInt()
}

public fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dladdr1", -1, longArrayOf(addr?.value ?: 0L, info?.value ?: 0L, extraInfo?.value ?: 0L, flags.toLong())).toInt()
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("newlocale", -1, longArrayOf(mask.toLong(), __cstr_1, base?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun uselocale(loc: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("uselocale", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item.toLong(), locale?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun gnuGetLibcRelease(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gnu_get_libc_release", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun gnuGetLibcVersion(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gnu_get_libc_version", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
