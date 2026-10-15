package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __val: [0 (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { __val: [0 (initializer represented at the FFI boundary)
public const val EXIT_SUCCESS: Int = 0

public const val EXIT_FAILURE: Int = 1

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 1

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

public const val ELBIN: Int = 134

public const val EFTYPE: Int = 135

public const val ENMFILE: Int = 136

public const val EPROCLIM: Int = 137

public const val ENOTSUP: Int = 138

public const val ENOSHARE: Int = 139

public const val ECASECLASH: Int = 140

public const val FIOCLEX: Int = 0x30b

public const val F_SETFL: Int = 0x9

public const val F_DUPFD_CLOEXEC: Int = 0x12

public const val F_GETFD: Int = 0x1

public const val F_GETFL: Int = 0x2

public const val O_RDONLY: Int = 0x1

public const val O_WRONLY: Int = 0x2

public const val O_RDWR: Int = 0x3

public const val O_CREAT: Int = 0x4

public const val O_EXCL: Int = 0x8

public const val O_NOCTTY: Int = 0x0

public const val O_TRUNC: Int = 0x20

public const val O_APPEND: Int = 0x10

public const val O_NONBLOCK: Int = 0x40

public const val O_DSYNC: Int = 0x80

public const val O_DIRECT: Int = 0x200

public const val O_LARGEFILE: Int = 0x2000

public const val O_DIRECTORY: Int = 0x800

public const val O_NOFOLLOW: Int = 0x1000

public const val O_NOATIME: Int = 0x40000

public const val O_CLOEXEC: Int = 0x400

public const val O_ACCMODE: Int = 0x0003

public const val AT_FDCWD: Int = -100

public const val AT_REMOVEDIR: Int = 0x200

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val S_IFDIR: UInt = 0x4000u

public const val S_IFLNK: UInt = 0xA000u

public const val S_IFREG: UInt = 0x8000u

public const val S_IFMT: UInt = 0xF000u

public const val S_IFIFO: UInt = 0x1000u

public const val S_IFSOCK: UInt = 0xc000u

public const val S_IFBLK: UInt = 0x6000u

public const val S_IFCHR: UInt = 0x2000u

public const val S_IRUSR: UInt = 0x100u

public const val S_IWUSR: UInt = 0x80u

public const val S_IXUSR: UInt = 0x40u

public const val S_IRGRP: UInt = 0x20u

public const val S_IWGRP: UInt = 0x10u

public const val S_IXGRP: UInt = 0x8u

public const val S_IROTH: UInt = 0x004u

public const val S_IWOTH: UInt = 0x002u

public const val S_IXOTH: UInt = 0x001u

public const val POLLIN: Short = 0x01

public const val POLLOUT: Short = 0x04

public const val POLLHUP: Short = 0x10

public const val POLLERR: Short = 0x08

public const val POLLNVAL: Short = 0x20

public const val AF_UNIX: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_STREAM: Int = 1

public const val AF_INET: Int = 2

public const val AF_INET6: Int = 10

public const val MSG_PEEK: Int = 0x02

public const val SOL_SOCKET: Int = 1

public const val SHUT_WR: Int = 2

public const val SHUT_RD: Int = 1

public const val SHUT_RDWR: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_REUSEADDR: Int = 11

public const val SOMAXCONN: Int = 8

public const val SO_LINGER: Int = 6

public const val SO_RCVTIMEO: Int = 0xa

public const val SO_SNDTIMEO: Int = 0xe

public const val SO_BROADCAST: Int = 1

public const val TCP_NODELAY: Int = 0x10

public const val FIONBIO: Int = 0x30a

public const val _SC_PAGESIZE: Int = 0x36

public const val _SC_THREAD_STACK_MIN: Int = 0x58

public const val _SC_GETPW_R_SIZE_MAX: Int = 0x25

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGTRAP: Int = 5

public const val SIGABRT: Int = 6

public const val SIGBUS: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGUSR1: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGUSR2: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGSTKFLT: Int = 16

public const val SIGCHLD: Int = 17

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGURG: Int = 23

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGIO: Int = 29

public const val SIGPOLL: Int = SIGIO

public const val SIGPWR: Int = 30

public const val SIGSYS: Int = 31

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val IP_TTL: Int = 0x1e

public const val IPV6_V6ONLY: Int = 0x17

public const val IPV6_JOIN_GROUP: Int = 0x11

public const val IPV6_LEAVE_GROUP: Int = 0x12

public const val IP_MULTICAST_LOOP: Int = 0x13

public const val IPV6_MULTICAST_LOOP: Int = 0x15

public const val IP_MULTICAST_TTL: Int = 0x12

public const val IP_ADD_MEMBERSHIP: Int = 0x14

public const val IP_DROP_MEMBERSHIP: Int = 0x15
