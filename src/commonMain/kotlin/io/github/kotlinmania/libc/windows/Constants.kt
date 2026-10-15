// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public const val INT_MIN: Int = -2147483648

public const val INT_MAX: Int = 2147483647

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 32767

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 4

public const val _IOLBF: Int = 64

public const val BUFSIZ: UInt = 512u

public const val FOPEN_MAX: UInt = 20u

public const val FILENAME_MAX: UInt = 260u

public const val O_RDONLY: Int = 0x0000

public const val O_WRONLY: Int = 0x0001

public const val O_RDWR: Int = 0x0002

public const val O_APPEND: Int = 0x0008

public const val O_CREAT: Int = 0x0100

public const val O_TRUNC: Int = 0x0200

public const val O_EXCL: Int = 0x0400

public const val O_TEXT: Int = 0x4000

public const val O_BINARY: Int = 0x8000

public const val _O_WTEXT: Int = 0x10000

public const val _O_U16TEXT: Int = 0x20000

public const val _O_U8TEXT: Int = 0x40000

public const val O_RAW: Int = O_BINARY

public const val O_NOINHERIT: Int = 0x0080

public const val O_TEMPORARY: Int = 0x0040

public const val _O_SHORT_LIVED: Int = 0x1000

public const val _O_OBTAIN_DIR: Int = 0x2000

public const val O_SEQUENTIAL: Int = 0x0020

public const val O_RANDOM: Int = 0x0010

public const val S_IFCHR: Int = 8192

public const val S_IFDIR: Int = 16384

public const val S_IFREG: Int = 32768

public const val S_IFMT: Int = 61440

public const val S_IEXEC: Int = 64

public const val S_IWRITE: Int = 128

public const val S_IREAD: Int = 256

public const val LC_ALL: Int = 0

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MONETARY: Int = 3

public const val LC_NUMERIC: Int = 4

public const val LC_TIME: Int = 5

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

public const val EFBIG: Int = 27

public const val ENOSPC: Int = 28

public const val ESPIPE: Int = 29

public const val EROFS: Int = 30

public const val EMLINK: Int = 31

public const val EPIPE: Int = 32

public const val EDOM: Int = 33

public const val ERANGE: Int = 34

public const val EDEADLK: Int = 36

public const val EDEADLOCK: Int = 36

public const val ENAMETOOLONG: Int = 38

public const val ENOLCK: Int = 39

public const val ENOSYS: Int = 40

public const val ENOTEMPTY: Int = 41

public const val EILSEQ: Int = 42

public const val STRUNCATE: Int = 80

public const val EADDRINUSE: Int = 100

public const val EADDRNOTAVAIL: Int = 101

public const val EAFNOSUPPORT: Int = 102

public const val EALREADY: Int = 103

public const val EBADMSG: Int = 104

public const val ECANCELED: Int = 105

public const val ECONNABORTED: Int = 106

public const val ECONNREFUSED: Int = 107

public const val ECONNRESET: Int = 108

public const val EDESTADDRREQ: Int = 109

public const val EHOSTUNREACH: Int = 110

public const val EIDRM: Int = 111

public const val EINPROGRESS: Int = 112

public const val EISCONN: Int = 113

public const val ELOOP: Int = 114

public const val EMSGSIZE: Int = 115

public const val ENETDOWN: Int = 116

public const val ENETRESET: Int = 117

public const val ENETUNREACH: Int = 118

public const val ENOBUFS: Int = 119

public const val ENODATA: Int = 120

public const val ENOLINK: Int = 121

public const val ENOMSG: Int = 122

public const val ENOPROTOOPT: Int = 123

public const val ENOSR: Int = 124

public const val ENOSTR: Int = 125

public const val ENOTCONN: Int = 126

public const val ENOTRECOVERABLE: Int = 127

public const val ENOTSOCK: Int = 128

public const val ENOTSUP: Int = 129

public const val EOPNOTSUPP: Int = 130

public const val EOVERFLOW: Int = 132

public const val EOWNERDEAD: Int = 133

public const val EPROTO: Int = 134

public const val EPROTONOSUPPORT: Int = 135

public const val EPROTOTYPE: Int = 136

public const val ETIME: Int = 137

public const val ETIMEDOUT: Int = 138

public const val ETXTBSY: Int = 139

public const val EWOULDBLOCK: Int = 140

public const val SIGINT: Int = 2

public const val SIGILL: Int = 4

public const val SIGFPE: Int = 8

public const val SIGSEGV: Int = 11

public const val SIGTERM: Int = 15

public const val SIGABRT: Int = 22

public const val NSIG: Int = 23

public const val SIG_ERR: Int = -1

public const val SIG_DFL: ULong = 0uL

public const val SIG_IGN: ULong = 1uL

public const val SIG_GET: ULong = 2uL

public const val SIG_SGE: ULong = 3uL

public const val SIG_ACK: ULong = 4uL

public const val L_tmpnam: UInt = 260u

public const val TMP_MAX: UInt = 0x7fffffffu
