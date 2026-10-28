package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public const val EXIT_SUCCESS: Int = 0

public const val EXIT_FAILURE: Int = 1

public const val STDIN_FILENO: Int = 0

public const val STDOUT_FILENO: Int = 1

public const val STDERR_FILENO: Int = 2

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val FD_CLOEXEC: Int = 1

public const val FD_SETSIZE: ULong = 1024uL

public const val O_APPEND: Int = 0x0001

public const val O_DSYNC: Int = 0x0002

public const val O_NONBLOCK: Int = 0x0004

public const val O_RSYNC: Int = 0x0008

public const val O_SYNC: Int = 0x0010

public val O_CREAT: Int = 0x0001 shl 12

public val O_DIRECTORY: Int = 0x0002 shl 12

public val O_EXCL: Int = 0x0004 shl 12

public val O_TRUNC: Int = 0x0008 shl 12

public const val O_NOFOLLOW: Int = 0x01000000

public const val O_EXEC: Int = 0x02000000

public const val O_RDONLY: Int = 0x04000000

public const val O_SEARCH: Int = 0x08000000

public const val O_WRONLY: Int = 0x10000000

public const val O_CLOEXEC: Int = 0x0

public val O_RDWR: Int = O_WRONLY or O_RDONLY

public val O_ACCMODE: Int = O_EXEC or O_RDWR or O_SEARCH

public const val O_NOCTTY: Int = 0x0

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_RANDOM: Int = 2

public const val POSIX_FADV_SEQUENTIAL: Int = 1

public const val POSIX_FADV_WILLNEED: Int = 3

public const val AT_FDCWD: Int = -2

public const val AT_EACCESS: Int = 0x0

public const val AT_SYMLINK_NOFOLLOW: Int = 0x1

public const val AT_SYMLINK_FOLLOW: Int = 0x2

public const val AT_REMOVEDIR: Int = 0x4

public const val UTIME_OMIT: Long = 0xfffffffe

public const val UTIME_NOW: Long = 0xffffffff

public const val S_IFIFO: UInt = 4096u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFDIR: UInt = 16384u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFMT: UInt = 61440u

public const val S_IRWXO: UInt = 7u

public const val S_IXOTH: UInt = 1u

public const val S_IWOTH: UInt = 2u

public const val S_IROTH: UInt = 4u

public const val S_IRWXG: UInt = 56u

public const val S_IXGRP: UInt = 8u

public const val S_IWGRP: UInt = 16u

public const val S_IRGRP: UInt = 32u

public const val S_IRWXU: UInt = 448u

public const val S_IXUSR: UInt = 64u

public const val S_IWUSR: UInt = 128u

public const val S_IRUSR: UInt = 256u

public const val S_ISVTX: UInt = 512u

public const val S_ISGID: UInt = 1024u

public const val S_ISUID: UInt = 2048u

public val DT_UNKNOWN: UByte = (0).toUByte()

public val DT_BLK: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (3).toUByte()

public val DT_REG: UByte = (4).toUByte()

public val DT_FIFO: UByte = (6).toUByte()

public val DT_LNK: UByte = (7).toUByte()

public val DT_SOCK: UByte = (20).toUByte()

public const val FIONREAD: Int = 1

public const val FIONBIO: Int = 2

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val POLLIN: Short = 0x1

public const val POLLOUT: Short = 0x2

public const val POLLERR: Short = 0x1000

public const val POLLHUP: Short = 0x2000

public const val POLLNVAL: Short = 0x4000

public const val POLLRDNORM: Short = 0x1

public const val POLLWRNORM: Short = 0x2

public const val E2BIG: Int = 1

public const val EACCES: Int = 2

public const val EADDRINUSE: Int = 3

public const val EADDRNOTAVAIL: Int = 4

public const val EAFNOSUPPORT: Int = 5

public const val EAGAIN: Int = 6

public const val EALREADY: Int = 7

public const val EBADF: Int = 8

public const val EBADMSG: Int = 9

public const val EBUSY: Int = 10

public const val ECANCELED: Int = 11

public const val ECHILD: Int = 12

public const val ECONNABORTED: Int = 13

public const val ECONNREFUSED: Int = 14

public const val ECONNRESET: Int = 15

public const val EDEADLK: Int = 16

public const val EDESTADDRREQ: Int = 17

public const val EDOM: Int = 18

public const val EDQUOT: Int = 19

public const val EEXIST: Int = 20

public const val EFAULT: Int = 21

public const val EFBIG: Int = 22

public const val EHOSTUNREACH: Int = 23

public const val EIDRM: Int = 24

public const val EILSEQ: Int = 25

public const val EINPROGRESS: Int = 26

public const val EINTR: Int = 27

public const val EINVAL: Int = 28

public const val EIO: Int = 29

public const val EISCONN: Int = 30

public const val EISDIR: Int = 31

public const val ELOOP: Int = 32

public const val EMFILE: Int = 33

public const val EMLINK: Int = 34

public const val EMSGSIZE: Int = 35

public const val EMULTIHOP: Int = 36

public const val ENAMETOOLONG: Int = 37

public const val ENETDOWN: Int = 38

public const val ENETRESET: Int = 39

public const val ENETUNREACH: Int = 40

public const val ENFILE: Int = 41

public const val ENOBUFS: Int = 42

public const val ENODEV: Int = 43

public const val ENOENT: Int = 44

public const val ENOEXEC: Int = 45

public const val ENOLCK: Int = 46

public const val ENOLINK: Int = 47

public const val ENOMEM: Int = 48

public const val ENOMSG: Int = 49

public const val ENOPROTOOPT: Int = 50

public const val ENOSPC: Int = 51

public const val ENOSYS: Int = 52

public const val ENOTCONN: Int = 53

public const val ENOTDIR: Int = 54

public const val ENOTEMPTY: Int = 55

public const val ENOTRECOVERABLE: Int = 56

public const val ENOTSOCK: Int = 57

public const val ENOTSUP: Int = 58

public const val ENOTTY: Int = 59

public const val ENXIO: Int = 60

public const val EOVERFLOW: Int = 61

public const val EOWNERDEAD: Int = 62

public const val EPERM: Int = 63

public const val EPIPE: Int = 64

public const val EPROTO: Int = 65

public const val EPROTONOSUPPORT: Int = 66

public const val EPROTOTYPE: Int = 67

public const val ERANGE: Int = 68

public const val EROFS: Int = 69

public const val ESPIPE: Int = 70

public const val ESRCH: Int = 71

public const val ESTALE: Int = 72

public const val ETIMEDOUT: Int = 73

public const val ETXTBSY: Int = 74

public const val EXDEV: Int = 75

public const val ENOTCAPABLE: Int = 76

public const val EOPNOTSUPP: Int = ENOTSUP

public const val EWOULDBLOCK: Int = EAGAIN

public const val _SC_PAGESIZE: Int = 30

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_IOV_MAX: Int = 60

public const val _SC_SYMLOOP_MAX: Int = 173

public const val ABDAY_1: Int = 0x20000

public const val ABDAY_2: Int = 0x20001

public const val ABDAY_3: Int = 0x20002

public const val ABDAY_4: Int = 0x20003

public const val ABDAY_5: Int = 0x20004

public const val ABDAY_6: Int = 0x20005

public const val ABDAY_7: Int = 0x20006

public const val DAY_1: Int = 0x20007

public const val DAY_2: Int = 0x20008

public const val DAY_3: Int = 0x20009

public const val DAY_4: Int = 0x2000A

public const val DAY_5: Int = 0x2000B

public const val DAY_6: Int = 0x2000C

public const val DAY_7: Int = 0x2000D

public const val ABMON_1: Int = 0x2000E

public const val ABMON_2: Int = 0x2000F

public const val ABMON_3: Int = 0x20010

public const val ABMON_4: Int = 0x20011

public const val ABMON_5: Int = 0x20012

public const val ABMON_6: Int = 0x20013

public const val ABMON_7: Int = 0x20014

public const val ABMON_8: Int = 0x20015

public const val ABMON_9: Int = 0x20016

public const val ABMON_10: Int = 0x20017

public const val ABMON_11: Int = 0x20018

public const val ABMON_12: Int = 0x20019

public const val MON_1: Int = 0x2001A

public const val MON_2: Int = 0x2001B

public const val MON_3: Int = 0x2001C

public const val MON_4: Int = 0x2001D

public const val MON_5: Int = 0x2001E

public const val MON_6: Int = 0x2001F

public const val MON_7: Int = 0x20020

public const val MON_8: Int = 0x20021

public const val MON_9: Int = 0x20022

public const val MON_10: Int = 0x20023

public const val MON_11: Int = 0x20024

public const val MON_12: Int = 0x20025

public const val AM_STR: Int = 0x20026

public const val PM_STR: Int = 0x20027

public const val D_T_FMT: Int = 0x20028

public const val D_FMT: Int = 0x20029

public const val T_FMT: Int = 0x2002A

public const val T_FMT_AMPM: Int = 0x2002B

public const val ERA: Int = 0x2002C

public const val ERA_D_FMT: Int = 0x2002E

public const val ALT_DIGITS: Int = 0x2002F

public const val ERA_D_T_FMT: Int = 0x20030

public const val ERA_T_FMT: Int = 0x20031

public const val CODESET: Int = 14

public const val CRNCYSTR: Int = 0x4000F

public const val RADIXCHAR: Int = 0x10000

public const val THOUSEP: Int = 0x10001

public const val YESEXPR: Int = 0x50000

public const val NOEXPR: Int = 0x50001

public const val YESSTR: Int = 0x50002

public const val NOSTR: Int = 0x50003

public const val PTHREAD_STACK_MIN: ULong = 2048uL

public const val TIMER_ABSTIME: Int = 1
