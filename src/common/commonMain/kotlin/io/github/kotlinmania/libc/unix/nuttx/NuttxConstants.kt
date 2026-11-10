package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

// Reserved two pointer size for reserved area for some structures.
// This ensures that the size of these structures is large enough
// if more fields are added in the NuttX side.
//
// These structures are that defined by POSIX but only necessary fields are included,
// for example, struct passwd, https://pubs.opengroup.org/onlinepubs/009695399/basedefs/pwd.h.html,
// POSIX only defines following fields in struct passwd:
// char    *pwName   User's login name.
// char    *pwPasswd Encrypted password.
// uidT    pwUid    Numerical user ID.
// gidT    pwGid    Numerical group ID.
// char    *pwDir    Initial working directory.
// char    *pwShell  Program to use as shell.
// Other fields can be different depending on the implementation.
public val DEFAULT_RESERVED_SIZE: Int = 2

public val SOCKADDR_STORAGE_SIZE: Int = 36

public val PTHREAD_ATTR_SIZE: Int = 5

public val PTHREAD_MUTEX_SIZE: Int = 9

public val PTHREAD_COND_SIZE: Int = 7

public val PTHREAD_CONDATTR_SIZE: Int = 5

public val PTHREAD_RWLOCK_SIZE: Int = 17

public val SEM_SIZE: Int = 6

public val NAME_MAX: Int = 64

public val FDSET_SIZE: Int = 10

public val SIGSET_SIZE: Int = 8

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(value = IntArray(PTHREAD_COND_SIZE) { 0 })

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(value = IntArray(PTHREAD_MUTEX_SIZE) { 0 })

// stdlib.h
public val EXIT_SUCCESS: Int = 0

public val EXIT_FAILURE: Int = 1

// time.h
public val CLOCK_REALTIME: Int = 0

public val CLOCK_MONOTONIC: Int = 1

// errno.h
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

public val ELBIN: Int = 134

public val EFTYPE: Int = 135

public val ENMFILE: Int = 136

public val EPROCLIM: Int = 137

public val ENOTSUP: Int = 138

public val ENOSHARE: Int = 139

public val ECASECLASH: Int = 140

// fcntl.h
public val FIOCLEX: Int = 0x30b

public val F_SETFL: Int = 0x9

public val F_DUPFD_CLOEXEC: Int = 0x12

public val F_GETFD: Int = 0x1

public val F_GETFL: Int = 0x2

public val O_RDONLY: Int = 0x1

public val O_WRONLY: Int = 0x2

public val O_RDWR: Int = 0x3

public val O_CREAT: Int = 0x4

public val O_EXCL: Int = 0x8

public val O_NOCTTY: Int = 0x0

public val O_TRUNC: Int = 0x20

public val O_APPEND: Int = 0x10

public val O_NONBLOCK: Int = 0x40

public val O_DSYNC: Int = 0x80

public val O_DIRECT: Int = 0x200

public val O_LARGEFILE: Int = 0x2000

public val O_DIRECTORY: Int = 0x800

public val O_NOFOLLOW: Int = 0x1000

public val O_NOATIME: Int = 0x40000

public val O_CLOEXEC: Int = 0x400

public val O_ACCMODE: Int = 0x0003

public val AT_FDCWD: Int = -100

public val AT_REMOVEDIR: Int = 0x200

// sys/types.h
public val SEEK_SET: Int = 0

public val SEEK_CUR: Int = 1

public val SEEK_END: Int = 2

// sys/stat.h
public val S_IFDIR: UInt = 0x4000u

public val S_IFLNK: UInt = 0xA000u

public val S_IFREG: UInt = 0x8000u

public val S_IFMT: UInt = 0xF000u

public val S_IFIFO: UInt = 0x1000u

public val S_IFSOCK: UInt = 0xc000u

public val S_IFBLK: UInt = 0x6000u

public val S_IFCHR: UInt = 0x2000u

public val S_IRUSR: UInt = 0x100u

public val S_IWUSR: UInt = 0x80u

public val S_IXUSR: UInt = 0x40u

public val S_IRGRP: UInt = 0x20u

public val S_IWGRP: UInt = 0x10u

public val S_IXGRP: UInt = 0x8u

public val S_IROTH: UInt = 0x004u

public val S_IWOTH: UInt = 0x002u

public val S_IXOTH: UInt = 0x001u

// sys/poll.h
public val POLLIN: Short = 0x01

public val POLLOUT: Short = 0x04

public val POLLHUP: Short = 0x10

public val POLLERR: Short = 0x08

public val POLLNVAL: Short = 0x20

// sys/socket.h
public val AF_UNIX: Int = 1

public val SOCK_DGRAM: Int = 2

public val SOCK_STREAM: Int = 1

public val AF_INET: Int = 2

public val AF_INET6: Int = 10

public val MSG_PEEK: Int = 0x02

public val SOL_SOCKET: Int = 1

public val SHUT_WR: Int = 2

public val SHUT_RD: Int = 1

public val SHUT_RDWR: Int = 3

public val SO_ERROR: Int = 4

public val SO_REUSEADDR: Int = 11

public val SOMAXCONN: Int = 8

public val SO_LINGER: Int = 6

public val SO_RCVTIMEO: Int = 0xa

public val SO_SNDTIMEO: Int = 0xe

public val SO_BROADCAST: Int = 1

// netinet/tcp.h
public val TCP_NODELAY: Int = 0x10

// nuttx/fs/ioctl.h
public val FIONBIO: Int = 0x30a

// unistd.h
public val SC_PAGESIZE: Int = 0x36

public val SC_THREAD_STACK_MIN: Int = 0x58

public val SC_GETPW_R_SIZE_MAX: Int = 0x25

// signal.h
public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGBUS: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGUSR1: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGUSR2: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGSTKFLT: CInt = 16

public val SIGCHLD: CInt = 17

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGURG: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 29

public val SIGPOLL: CInt = SIGIO

public val SIGPWR: CInt = 30

public val SIGSYS: CInt = 31

// pthread.h
public val PTHREAD_MUTEX_NORMAL: Int = 0

// netinet/in.h
public val IP_TTL: Int = 0x1e

public val IPV6_V6ONLY: Int = 0x17

public val IPV6_JOIN_GROUP: Int = 0x11

public val IPV6_LEAVE_GROUP: Int = 0x12

public val IP_MULTICAST_LOOP: Int = 0x13

public val IPV6_MULTICAST_LOOP: Int = 0x15

public val IP_MULTICAST_TTL: Int = 0x12

public val IP_ADD_MEMBERSHIP: Int = 0x14

public val IP_DROP_MEMBERSHIP: Int = 0x15

// dlfcn.h
public val RTLD_DEFAULT: COpaquePointer? = null
