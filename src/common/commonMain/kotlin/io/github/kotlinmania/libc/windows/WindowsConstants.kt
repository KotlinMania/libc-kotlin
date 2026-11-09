package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

public val INT_MIN: CInt = -2147483648.toInt()

public val INT_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 512u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 260u

// fcntl.h
public val O_RDONLY: CInt = 0x0000

public val O_WRONLY: CInt = 0x0001

public val O_RDWR: CInt = 0x0002

public val O_APPEND: CInt = 0x0008

public val O_CREAT: CInt = 0x0100

public val O_TRUNC: CInt = 0x0200

public val O_EXCL: CInt = 0x0400

public val O_TEXT: CInt = 0x4000

public val O_BINARY: CInt = 0x8000

public val O_WTEXT: CInt = 0x10000

public val O_U16TEXT: CInt = 0x20000

public val O_U8TEXT: CInt = 0x40000

public val O_RAW: CInt = O_BINARY

public val O_NOINHERIT: CInt = 0x0080

public val O_TEMPORARY: CInt = 0x0040

public val O_SHORT_LIVED: CInt = 0x1000

public val O_OBTAIN_DIR: CInt = 0x2000

public val O_SEQUENTIAL: CInt = 0x0020

public val O_RANDOM: CInt = 0x0010

public val S_IFCHR: CInt = 8192

public val S_IFDIR: CInt = 16384

public val S_IFREG: CInt = 32768

public val S_IFMT: CInt = 61440

public val S_IEXEC: CInt = 64

public val S_IWRITE: CInt = 128

public val S_IREAD: CInt = 256

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EDEADLK: CInt = 36

public val EDEADLOCK: CInt = 36

public val ENAMETOOLONG: CInt = 38

public val ENOLCK: CInt = 39

public val ENOSYS: CInt = 40

public val ENOTEMPTY: CInt = 41

public val EILSEQ: CInt = 42

public val STRUNCATE: CInt = 80

// POSIX Supplement (from errno.h)
public val EADDRINUSE: CInt = 100

public val EADDRNOTAVAIL: CInt = 101

public val EAFNOSUPPORT: CInt = 102

public val EALREADY: CInt = 103

public val EBADMSG: CInt = 104

public val ECANCELED: CInt = 105

public val ECONNABORTED: CInt = 106

public val ECONNREFUSED: CInt = 107

public val ECONNRESET: CInt = 108

public val EDESTADDRREQ: CInt = 109

public val EHOSTUNREACH: CInt = 110

public val EIDRM: CInt = 111

public val EINPROGRESS: CInt = 112

public val EISCONN: CInt = 113

public val ELOOP: CInt = 114

public val EMSGSIZE: CInt = 115

public val ENETDOWN: CInt = 116

public val ENETRESET: CInt = 117

public val ENETUNREACH: CInt = 118

public val ENOBUFS: CInt = 119

public val ENODATA: CInt = 120

public val ENOLINK: CInt = 121

public val ENOMSG: CInt = 122

public val ENOPROTOOPT: CInt = 123

public val ENOSR: CInt = 124

public val ENOSTR: CInt = 125

public val ENOTCONN: CInt = 126

public val ENOTRECOVERABLE: CInt = 127

public val ENOTSOCK: CInt = 128

public val ENOTSUP: CInt = 129

public val EOPNOTSUPP: CInt = 130

public val EOVERFLOW: CInt = 132

public val EOWNERDEAD: CInt = 133

public val EPROTO: CInt = 134

public val EPROTONOSUPPORT: CInt = 135

public val EPROTOTYPE: CInt = 136

public val ETIME: CInt = 137

public val ETIMEDOUT: CInt = 138

public val ETXTBSY: CInt = 139

public val EWOULDBLOCK: CInt = 140

// signal codes
public val SIGINT: CInt = 2

public val SIGILL: CInt = 4

public val SIGFPE: CInt = 8

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGABRT: CInt = 22

public val NSIG: CInt = 23

public val SIG_ERR: CInt = -1

public val SIG_DFL: SighandlerT = 0uL

public val SIG_IGN: SighandlerT = 1uL

public val SIG_GET: SighandlerT = 2uL

public val SIG_SGE: SighandlerT = 3uL

public val SIG_ACK: SighandlerT = 4uL

public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 0x7fffffffu
