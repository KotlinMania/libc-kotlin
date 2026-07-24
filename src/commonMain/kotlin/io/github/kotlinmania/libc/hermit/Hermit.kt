// port-lint: source hermit.rs
package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SizeT = ULong
public typealias SsizeT = Long
public typealias PtrdiffT = Long
public typealias ClockidT = Int
public typealias InAddrT = UInt
public typealias InPortT = UShort
public typealias ModeT = UInt
public typealias NfdsT = ULong
public typealias PidT = Int
public typealias SaFamilyT = UByte
public typealias SocklenT = UInt
public typealias TimeT = Long

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: SocklenT,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class Dirent64(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class In6Addr(
    val s6Addr: UByteArray,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Pollfd(
    val fd: Int,
    val events: Short,
    val revents: Short,
)

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: ModeT,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: Int,
)

public const val AF_UNSPEC: Int = 0
public const val AF_INET: Int = 3
public const val AF_INET6: Int = 1
public const val AF_VSOCK: Int = 2
public const val CLOCK_REALTIME: ClockidT = 1
public const val CLOCK_MONOTONIC: ClockidT = 4
public val DT_UNKNOWN: UByte = (0).toUByte()
public val DT_FIFO: UByte = (1).toUByte()
public val DT_CHR: UByte = (2).toUByte()
public val DT_DIR: UByte = (4).toUByte()
public val DT_BLK: UByte = (6).toUByte()
public val DT_REG: UByte = (8).toUByte()
public val DT_LNK: UByte = (10).toUByte()
public val DT_SOCK: UByte = (12).toUByte()
public val DT_WHT: UByte = (14).toUByte()
public const val EAI_AGAIN: Int = 2
public const val EAI_BADFLAGS: Int = 3
public const val EAI_FAIL: Int = 4
public const val EAI_FAMILY: Int = 5
public const val EAI_MEMORY: Int = 6
public const val EAI_NODATA: Int = 7
public const val EAI_NONAME: Int = 8
public const val EAI_SERVICE: Int = 9
public const val EAI_SOCKTYPE: Int = 10
public const val EAI_SYSTEM: Int = 11
public const val EAI_OVERFLOW: Int = 14
public const val EFD_SEMAPHORE: Short = 1
public const val EFD_NONBLOCK: Short = 2048
public const val EFD_CLOEXEC: Short = 16384
public const val F_DUPFD: Int = 0
public const val F_GETFD: Int = 1
public const val F_SETFD: Int = 2
public const val F_GETFL: Int = 3
public const val F_SETFL: Int = 4
public const val FD_CLOEXEC: Int = 1
public const val FIONBIO: Int = 0x8008667e
public const val FUTEX_RELATIVE_TIMEOUT: UInt = 1u
public const val IP_TOS: Int = 1
public const val IP_TTL: Int = 2
public const val IP_ADD_MEMBERSHIP: Int = 3
public const val IP_DROP_MEMBERSHIP: Int = 4
public const val IP_MULTICAST_TTL: Int = 5
public const val IP_MULTICAST_LOOP: Int = 7
public const val IPPROTO_IP: Int = 0
public const val IPPROTO_TCP: Int = 6
public const val IPPROTO_UDP: Int = 17
public const val IPPROTO_IPV6: Int = 41
public const val IPV6_ADD_MEMBERSHIP: Int = 12
public const val IPV6_DROP_MEMBERSHIP: Int = 13
public const val IPV6_MULTICAST_LOOP: Int = 19
public const val IPV6_V6ONLY: Int = 27
public const val MSG_PEEK: Int = 1
public const val O_RDONLY: Int = 0
public const val O_WRONLY: Int = 1
public const val O_RDWR: Int = 2
public const val O_CREAT: Int = 64
public const val O_EXCL: Int = 128
public const val O_TRUNC: Int = 512
public const val O_APPEND: Int = 1024
public const val O_NONBLOCK: Int = 2048
public const val O_DIRECTORY: Int = 65536
public const val POLLIN: Short = 0x1
public const val POLLPRI: Short = 0x2
public const val POLLOUT: Short = 0x4
public const val POLLERR: Short = 0x8
public const val POLLHUP: Short = 0x10
public const val POLLNVAL: Short = 0x20
public const val POLLRDNORM: Short = 0x040
public const val POLLRDBAND: Short = 0x080
public const val POLLWRNORM: Short = 0x0100
public const val POLLWRBAND: Short = 0x0200
public const val POLLRDHUP: Short = 0x2000
public const val S_IRWXU: ModeT = 448u
public const val S_IRUSR: ModeT = 256u
public const val S_IWUSR: ModeT = 128u
public const val S_IXUSR: ModeT = 64u
public const val S_IRWXG: ModeT = 56u
public const val S_IRGRP: ModeT = 32u
public const val S_IWGRP: ModeT = 16u
public const val S_IXGRP: ModeT = 8u
public const val S_IRWXO: ModeT = 7u
public const val S_IROTH: ModeT = 4u
public const val S_IWOTH: ModeT = 2u
public const val S_IXOTH: ModeT = 1u
public const val S_IFMT: ModeT = 61440u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFREG: ModeT = 32768u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFIFO: ModeT = 4096u
public const val SHUT_RD: Int = 0
public const val SHUT_WR: Int = 1
public const val SHUT_RDWR: Int = 2
public const val SO_REUSEADDR: Int = 0x0004
public const val SO_KEEPALIVE: Int = 0x0008
public const val SO_BROADCAST: Int = 0x0020
public const val SO_LINGER: Int = 0x0080
public const val SO_SNDBUF: Int = 0x1001
public const val SO_RCVBUF: Int = 0x1002
public const val SO_SNDTIMEO: Int = 0x1005
public const val SO_RCVTIMEO: Int = 0x1006
public const val SO_ERROR: Int = 0x1007
public const val SOCK_STREAM: Int = 1
public const val SOCK_DGRAM: Int = 2
public const val SOCK_NONBLOCK: Int = 2048
public const val SOCK_CLOEXEC: Int = 16384
public const val SOL_SOCKET: Int = 4095
public const val STDIN_FILENO: CInt = 0
public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2
public const val TCP_NODELAY: Int = 1
public const val EPERM: Int = 1
public const val ENOENT: Int = 2
public const val ESRCH: Int = 3
public const val EINTR: Int = 4
public const val EIO: Int = 5
public const val ENXIO: Int = 6
public const val E2BIG: Int = 7
public const val ENOEXEC: Int = 8
public const val EBADF: Int = 9
public const val ECHILD: Int = 10
public const val EAGAIN: Int = 11
public const val ENOMEM: Int = 12
public const val EACCES: Int = 13
public const val EFAULT: Int = 14
public const val ENOTBLK: Int = 15
public const val EBUSY: Int = 16
public const val EEXIST: Int = 17
public const val EXDEV: Int = 18
public const val ENODEV: Int = 19
public const val ENOTDIR: Int = 20
public const val EISDIR: Int = 21
public const val EINVAL: Int = 22
public const val ENFILE: Int = 23
public const val EMFILE: Int = 24
public const val ENOTTY: Int = 25
public const val ETXTBSY: Int = 26
public const val EFBIG: Int = 27
public const val ENOSPC: Int = 28
public const val ESPIPE: Int = 29
public const val EROFS: Int = 30
public const val EMLINK: Int = 31
public const val EPIPE: Int = 32
public const val EDOM: Int = 33
public const val ERANGE: Int = 34
public const val EDEADLK: Int = 35
public const val ENAMETOOLONG: Int = 36
public const val ENOLCK: Int = 37
public const val ENOSYS: Int = 38
public const val ENOTEMPTY: Int = 39
public const val ELOOP: Int = 40
public const val EWOULDBLOCK: Int = EAGAIN
public const val ENOMSG: Int = 42
public const val EIDRM: Int = 43
public const val ECHRNG: Int = 44
public const val EL2NSYNC: Int = 45
public const val EL3HLT: Int = 46
public const val EL3RST: Int = 47
public const val ELNRNG: Int = 48
public const val EUNATCH: Int = 49
public const val ENOCSI: Int = 50
public const val EL2HLT: Int = 51
public const val EBADE: Int = 52
public const val EBADR: Int = 53
public const val EXFULL: Int = 54
public const val ENOANO: Int = 55
public const val EBADRQC: Int = 56
public const val EBADSLT: Int = 57
public const val EDEADLOCK: Int = EDEADLK
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
public const val EMULTIHOP: Int = 72
public const val EDOTDOT: Int = 73
public const val EBADMSG: Int = 74
public const val EOVERFLOW: Int = 75
public const val ENOTUNIQ: Int = 76
public const val EBADFD: Int = 77
public const val EREMCHG: Int = 78
public const val ELIBACC: Int = 79
public const val ELIBBAD: Int = 80
public const val ELIBSCN: Int = 81
public const val ELIBMAX: Int = 82
public const val ELIBEXEC: Int = 83
public const val EILSEQ: Int = 84
public const val ERESTART: Int = 85
public const val ESTRPIPE: Int = 86
public const val EUSERS: Int = 87
public const val ENOTSOCK: Int = 88
public const val EDESTADDRREQ: Int = 89
public const val EMSGSIZE: Int = 90
public const val EPROTOTYPE: Int = 91
public const val ENOPROTOOPT: Int = 92
public const val EPROTONOSUPPORT: Int = 93
public const val ESOCKTNOSUPPORT: Int = 94
public const val EOPNOTSUPP: Int = 95
public const val EPFNOSUPPORT: Int = 96
public const val EAFNOSUPPORT: Int = 97
public const val EADDRINUSE: Int = 98
public const val EADDRNOTAVAIL: Int = 99
public const val ENETDOWN: Int = 100
public const val ENETUNREACH: Int = 101
public const val ENETRESET: Int = 102
public const val ECONNABORTED: Int = 103
public const val ECONNRESET: Int = 104
public const val ENOBUFS: Int = 105
public const val EISCONN: Int = 106
public const val ENOTCONN: Int = 107
public const val ESHUTDOWN: Int = 108
public const val ETOOMANYREFS: Int = 109
public const val ETIMEDOUT: Int = 110
public const val ECONNREFUSED: Int = 111
public const val EHOSTDOWN: Int = 112
public const val EHOSTUNREACH: Int = 113
public const val EALREADY: Int = 114
public const val EINPROGRESS: Int = 115
public const val ESTALE: Int = 116
public const val EUCLEAN: Int = 117
public const val ENOTNAM: Int = 118
public const val ENAVAIL: Int = 119
public const val EISNAM: Int = 120
public const val EREMOTEIO: Int = 121
public const val EDQUOT: Int = 122
public const val ENOMEDIUM: Int = 123
public const val EMEDIUMTYPE: Int = 124
public const val ECANCELED: Int = 125
public const val ENOKEY: Int = 126
public const val EKEYEXPIRED: Int = 127
public const val EKEYREVOKED: Int = 128
public const val EKEYREJECTED: Int = 129
public const val EOWNERDEAD: Int = 130
public const val ENOTRECOVERABLE: Int = 131
public const val ERFKILL: Int = 132
public const val EHWPOISON: Int = 133

public expect fun alloc(size: ULong, align: ULong): COpaquePointer?

public expect fun allocZeroed(size: ULong, align: ULong): COpaquePointer?

public expect fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer?

public expect fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong)

public expect fun exit(status: Int): Nothing

public expect fun abort(): Nothing

public expect fun errno(): Int

public expect fun clockGettime(clockid: ClockidT, tp: Timespec?): Int

public expect fun nanosleep(req: Timespec?): Int

public expect fun availableParallelism(): ULong

public expect fun futexWait(address: UInt?, expected: UInt, timeout: Timespec?, flags: UInt): Int

public expect fun futexWake(address: UInt?, count: Int): Int

public expect fun stat(path: String?, stat: Stat?): Int

public expect fun fstat(fd: Int, stat: Stat?): Int

public expect fun lstat(path: String?, stat: Stat?): Int

public expect fun open(path: String?, flags: Int, mode: ModeT): Int

public expect fun unlink(path: String?): Int

public expect fun mkdir(path: String?, mode: ModeT): Int

public expect fun rmdir(path: String?): Int

public expect fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long

public expect fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: ULong): Long

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: ULong): Long

public expect fun close(fd: Int): Int

public expect fun dup(fd: Int): Int

public expect fun fcntl(fd: Int, cmd: Int, arg: Int): Int

public expect fun getdents64(fd: Int, dirp: Dirent64?, count: ULong): Long

public expect fun getaddrinfo(nodename: String?, servname: String?, hints: Addrinfo?, res: COpaquePointer?): Int

public expect fun freeaddrinfo(ai: Addrinfo?)

public expect fun socket(domain: Int, ty: Int, protocol: Int): Int

public expect fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int

public expect fun listen(sockfd: Int, backlog: Int): Int

public expect fun accept(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT?): Int

public expect fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int

public expect fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long

public expect fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: SocklenT?): Long

public expect fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long

public expect fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, tolen: SocklenT): Long

public expect fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT?): Int

public expect fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT?): Int

public expect fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT?): Int

public expect fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int

public expect fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int

public expect fun shutdown(sockfd: Int, how: Int): Int

public expect fun eventfd(initval: ULong, flags: Short): Int

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int
