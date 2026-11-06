// port-lint: source hermit.rs
package io.github.kotlinmania.libc

// Hermit C type definitions

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

public open class Addrinfo(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class Dirent64(
    public var dIno: ULong,
    public var dOff: Long,
    public var dReclen: UShort,
    public var dType: UByte,
    public var dName: List<CChar>,
)

public open class In6Addr(public var s6Addr: List<UByte>)

public open class InAddr(public var sAddr: InAddrT)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: Int)

public open class Pollfd(
    public var fd: Int,
    public var events: Short,
    public var revents: Short,
)

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<CChar>,
)

public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssAlign: Long,
    public var ssPad2: List<UByte>,
)

public open class Stat(
    public var stDev: ULong,
    public var stIno: ULong,
    public var stNlink: ULong,
    public var stMode: ModeT,
    public var stUid: UInt,
    public var stGid: UInt,
    public var stRdev: ULong,
    public var stSize: Long,
    public var stBlksize: Long,
    public var stBlocks: Long,
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: Int)

public val AF_UNSPEC: Int = 0

public val AF_INET: Int = 3

public val AF_INET6: Int = 1

public val AF_VSOCK: Int = 2

public val CLOCK_REALTIME: ClockidT = 1

public val CLOCK_MONOTONIC: ClockidT = 4

public val DT_UNKNOWN: UByte = 0u

public val DT_FIFO: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 4u

public val DT_BLK: UByte = 6u

public val DT_REG: UByte = 8u

public val DT_LNK: UByte = 10u

public val DT_SOCK: UByte = 12u

public val DT_WHT: UByte = 14u

public val EAI_AGAIN: Int = 2

public val EAI_BADFLAGS: Int = 3

public val EAI_FAIL: Int = 4

public val EAI_FAMILY: Int = 5

public val EAI_MEMORY: Int = 6

public val EAI_NODATA: Int = 7

public val EAI_NONAME: Int = 8

public val EAI_SERVICE: Int = 9

public val EAI_SOCKTYPE: Int = 10

public val EAI_SYSTEM: Int = 11

public val EAI_OVERFLOW: Int = 14

public val EFD_SEMAPHORE: Short = 1

public val EFD_NONBLOCK: Short = 2048

public val EFD_CLOEXEC: Short = 16384

public val F_DUPFD: Int = 0

public val F_GETFD: Int = 1

public val F_SETFD: Int = 2

public val F_GETFL: Int = 3

public val F_SETFL: Int = 4

public val FD_CLOEXEC: Int = 1

public val FIONBIO: Int = 0x8008667e

public val FUTEX_RELATIVE_TIMEOUT: UInt = 1u

public val IP_TOS: Int = 1

public val IP_TTL: Int = 2

public val IP_ADD_MEMBERSHIP: Int = 3

public val IP_DROP_MEMBERSHIP: Int = 4

public val IP_MULTICAST_TTL: Int = 5

public val IP_MULTICAST_LOOP: Int = 7

public val IPPROTO_IP: Int = 0

public val IPPROTO_TCP: Int = 6

public val IPPROTO_UDP: Int = 17

public val IPPROTO_IPV6: Int = 41

public val IPV6_ADD_MEMBERSHIP: Int = 12

public val IPV6_DROP_MEMBERSHIP: Int = 13

public val IPV6_MULTICAST_LOOP: Int = 19

public val IPV6_V6ONLY: Int = 27

public val MSG_PEEK: Int = 1

public val O_RDONLY: Int = 0

public val O_WRONLY: Int = 1

public val O_RDWR: Int = 2

public val O_CREAT: Int = 64

public val O_EXCL: Int = 128

public val O_TRUNC: Int = 512

public val O_APPEND: Int = 1024

public val O_NONBLOCK: Int = 2048

public val O_DIRECTORY: Int = 65536

public val POLLIN: Short = 0x1

public val POLLPRI: Short = 0x2

public val POLLOUT: Short = 0x4

public val POLLERR: Short = 0x8

public val POLLHUP: Short = 0x10

public val POLLNVAL: Short = 0x20

public val POLLRDNORM: Short = 0x040

public val POLLRDBAND: Short = 0x080

public val POLLWRNORM: Short = 0x0100

public val POLLWRBAND: Short = 0x0200

public val POLLRDHUP: Short = 0x2000

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val S_IFMT: ModeT = 61440u

public val S_IFSOCK: ModeT = 49152u

public val S_IFLNK: ModeT = 40960u

public val S_IFREG: ModeT = 32768u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFIFO: ModeT = 4096u

public val SHUT_RD: Int = 0

public val SHUT_WR: Int = 1

public val SHUT_RDWR: Int = 2

public val SO_REUSEADDR: Int = 0x0004

public val SO_KEEPALIVE: Int = 0x0008

public val SO_BROADCAST: Int = 0x0020

public val SO_LINGER: Int = 0x0080

public val SO_SNDBUF: Int = 0x1001

public val SO_RCVBUF: Int = 0x1002

public val SO_SNDTIMEO: Int = 0x1005

public val SO_RCVTIMEO: Int = 0x1006

public val SO_ERROR: Int = 0x1007

public val SOCK_STREAM: Int = 1

public val SOCK_DGRAM: Int = 2

public val SOCK_NONBLOCK: Int = 2048

public val SOCK_CLOEXEC: Int = 16384

public val SOL_SOCKET: Int = 4095

public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val TCP_NODELAY: Int = 1

public val EPERM: Int = 1

public val ENOENT: Int = 2

public val ESRCH: Int = 3

public val EINTR: Int = 4

public val EIO: Int = 5

public val ENXIO: Int = 6

public val E2BIG: Int = 7

public val ENOEXEC: Int = 8

public val EBADF: Int = 9

public val ECHILD: Int = 10

public val EAGAIN: Int = 11

public val ENOMEM: Int = 12

public val EACCES: Int = 13

public val EFAULT: Int = 14

public val ENOTBLK: Int = 15

public val EBUSY: Int = 16

public val EEXIST: Int = 17

public val EXDEV: Int = 18

public val ENODEV: Int = 19

public val ENOTDIR: Int = 20

public val EISDIR: Int = 21

public val EINVAL: Int = 22

public val ENFILE: Int = 23

public val EMFILE: Int = 24

public val ENOTTY: Int = 25

public val ETXTBSY: Int = 26

public val EFBIG: Int = 27

public val ENOSPC: Int = 28

public val ESPIPE: Int = 29

public val EROFS: Int = 30

public val EMLINK: Int = 31

public val EPIPE: Int = 32

public val EDOM: Int = 33

public val ERANGE: Int = 34

public val EDEADLK: Int = 35

public val ENAMETOOLONG: Int = 36

public val ENOLCK: Int = 37

public val ENOSYS: Int = 38

public val ENOTEMPTY: Int = 39

public val ELOOP: Int = 40

public val EWOULDBLOCK: Int = EAGAIN

public val ENOMSG: Int = 42

public val EIDRM: Int = 43

public val ECHRNG: Int = 44

public val EL2NSYNC: Int = 45

public val EL3HLT: Int = 46

public val EL3RST: Int = 47

public val ELNRNG: Int = 48

public val EUNATCH: Int = 49

public val ENOCSI: Int = 50

public val EL2HLT: Int = 51

public val EBADE: Int = 52

public val EBADR: Int = 53

public val EXFULL: Int = 54

public val ENOANO: Int = 55

public val EBADRQC: Int = 56

public val EBADSLT: Int = 57

public val EDEADLOCK: Int = EDEADLK

public val EBFONT: Int = 59

public val ENOSTR: Int = 60

public val ENODATA: Int = 61

public val ETIME: Int = 62

public val ENOSR: Int = 63

public val ENONET: Int = 64

public val ENOPKG: Int = 65

public val EREMOTE: Int = 66

public val ENOLINK: Int = 67

public val EADV: Int = 68

public val ESRMNT: Int = 69

public val ECOMM: Int = 70

public val EPROTO: Int = 71

public val EMULTIHOP: Int = 72

public val EDOTDOT: Int = 73

public val EBADMSG: Int = 74

public val EOVERFLOW: Int = 75

public val ENOTUNIQ: Int = 76

public val EBADFD: Int = 77

public val EREMCHG: Int = 78

public val ELIBACC: Int = 79

public val ELIBBAD: Int = 80

public val ELIBSCN: Int = 81

public val ELIBMAX: Int = 82

public val ELIBEXEC: Int = 83

public val EILSEQ: Int = 84

public val ERESTART: Int = 85

public val ESTRPIPE: Int = 86

public val EUSERS: Int = 87

public val ENOTSOCK: Int = 88

public val EDESTADDRREQ: Int = 89

public val EMSGSIZE: Int = 90

public val EPROTOTYPE: Int = 91

public val ENOPROTOOPT: Int = 92

public val EPROTONOSUPPORT: Int = 93

public val ESOCKTNOSUPPORT: Int = 94

public val EOPNOTSUPP: Int = 95

public val EPFNOSUPPORT: Int = 96

public val EAFNOSUPPORT: Int = 97

public val EADDRINUSE: Int = 98

public val EADDRNOTAVAIL: Int = 99

public val ENETDOWN: Int = 100

public val ENETUNREACH: Int = 101

public val ENETRESET: Int = 102

public val ECONNABORTED: Int = 103

public val ECONNRESET: Int = 104

public val ENOBUFS: Int = 105

public val EISCONN: Int = 106

public val ENOTCONN: Int = 107

public val ESHUTDOWN: Int = 108

public val ETOOMANYREFS: Int = 109

public val ETIMEDOUT: Int = 110

public val ECONNREFUSED: Int = 111

public val EHOSTDOWN: Int = 112

public val EHOSTUNREACH: Int = 113

public val EALREADY: Int = 114

public val EINPROGRESS: Int = 115

public val ESTALE: Int = 116

public val EUCLEAN: Int = 117

public val ENOTNAM: Int = 118

public val ENAVAIL: Int = 119

public val EISNAM: Int = 120

public val EREMOTEIO: Int = 121

public val EDQUOT: Int = 122

public val ENOMEDIUM: Int = 123

public val EMEDIUMTYPE: Int = 124

public val ECANCELED: Int = 125

public val ENOKEY: Int = 126

public val EKEYEXPIRED: Int = 127

public val EKEYREVOKED: Int = 128

public val EKEYREJECTED: Int = 129

public val EOWNERDEAD: Int = 130

public val ENOTRECOVERABLE: Int = 131

public val ERFKILL: Int = 132

public val EHWPOISON: Int = 133

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

public expect fun accept(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int

public expect fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long

public expect fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long

public expect fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long

public expect fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, tolen: SocklenT): Long

public expect fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int

public expect fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int

public expect fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int

public expect fun shutdown(sockfd: Int, how: Int): Int

public expect fun eventfd(initval: ULong, flags: Short): Int

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int
