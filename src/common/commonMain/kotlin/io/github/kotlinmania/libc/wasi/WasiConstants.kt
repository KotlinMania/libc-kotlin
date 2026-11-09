package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val FD_CLOEXEC: CInt = 1

public val FD_SETSIZE: SizeT = 1024uL

public val O_APPEND: CInt = 0x0001

public val O_DSYNC: CInt = 0x0002

public val O_NONBLOCK: CInt = 0x0004

public val O_RSYNC: CInt = 0x0008

public val O_SYNC: CInt = 0x0010

public val O_CREAT: CInt = 0x0001 shl 12

public val O_DIRECTORY: CInt = 0x0002 shl 12

public val O_EXCL: CInt = 0x0004 shl 12

public val O_TRUNC: CInt = 0x0008 shl 12

public val O_NOFOLLOW: CInt = 0x01000000

public val O_EXEC: CInt = 0x02000000

public val O_RDONLY: CInt = 0x04000000

public val O_SEARCH: CInt = 0x08000000

public val O_WRONLY: CInt = 0x10000000

public val O_CLOEXEC: CInt = 0x0

public val O_RDWR: CInt = O_WRONLY or O_RDONLY

public val O_ACCMODE: CInt = O_EXEC or O_RDWR or O_SEARCH

public val O_NOCTTY: CInt = 0x0

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 2

public val POSIX_FADV_SEQUENTIAL: CInt = 1

public val POSIX_FADV_WILLNEED: CInt = 3

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 0x0

public val AT_SYMLINK_NOFOLLOW: CInt = 0x1

public val AT_SYMLINK_FOLLOW: CInt = 0x2

public val AT_REMOVEDIR: CInt = 0x4

public val UTIME_OMIT: CLong = 0xfffffffeL

public val UTIME_NOW: CLong = 0xffffffffL

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_ISVTX: ModeT = 512u

public val S_ISGID: ModeT = 1024u

public val S_ISUID: ModeT = 2048u

public val DT_UNKNOWN: UByte = 0u

public val DT_BLK: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 3u

public val DT_REG: UByte = 4u

public val DT_FIFO: UByte = 6u

public val DT_LNK: UByte = 7u

public val DT_SOCK: UByte = 20u

public val FIONREAD: CInt = 1

public val FIONBIO: CInt = 2

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val POLLIN: CShort = 0x1

public val POLLOUT: CShort = 0x2

public val POLLERR: CShort = 0x1000

public val POLLHUP: CShort = 0x2000

public val POLLNVAL: CShort = 0x4000

public val POLLRDNORM: CShort = 0x1

public val POLLWRNORM: CShort = 0x2

public val E2BIG: CInt = 1

public val EACCES: CInt = 2

public val EADDRINUSE: CInt = 3

public val EADDRNOTAVAIL: CInt = 4

public val EAFNOSUPPORT: CInt = 5

public val EAGAIN: CInt = 6

public val EALREADY: CInt = 7

public val EBADF: CInt = 8

public val EBADMSG: CInt = 9

public val EBUSY: CInt = 10

public val ECANCELED: CInt = 11

public val ECHILD: CInt = 12

public val ECONNABORTED: CInt = 13

public val ECONNREFUSED: CInt = 14

public val ECONNRESET: CInt = 15

public val EDEADLK: CInt = 16

public val EDESTADDRREQ: CInt = 17

public val EDOM: CInt = 18

public val EDQUOT: CInt = 19

public val EEXIST: CInt = 20

public val EFAULT: CInt = 21

public val EFBIG: CInt = 22

public val EHOSTUNREACH: CInt = 23

public val EIDRM: CInt = 24

public val EILSEQ: CInt = 25

public val EINPROGRESS: CInt = 26

public val EINTR: CInt = 27

public val EINVAL: CInt = 28

public val EIO: CInt = 29

public val EISCONN: CInt = 30

public val EISDIR: CInt = 31

public val ELOOP: CInt = 32

public val EMFILE: CInt = 33

public val EMLINK: CInt = 34

public val EMSGSIZE: CInt = 35

public val EMULTIHOP: CInt = 36

public val ENAMETOOLONG: CInt = 37

public val ENETDOWN: CInt = 38

public val ENETRESET: CInt = 39

public val ENETUNREACH: CInt = 40

public val ENFILE: CInt = 41

public val ENOBUFS: CInt = 42

public val ENODEV: CInt = 43

public val ENOENT: CInt = 44

public val ENOEXEC: CInt = 45

public val ENOLCK: CInt = 46

public val ENOLINK: CInt = 47

public val ENOMEM: CInt = 48

public val ENOMSG: CInt = 49

public val ENOPROTOOPT: CInt = 50

public val ENOSPC: CInt = 51

public val ENOSYS: CInt = 52

public val ENOTCONN: CInt = 53

public val ENOTDIR: CInt = 54

public val ENOTEMPTY: CInt = 55

public val ENOTRECOVERABLE: CInt = 56

public val ENOTSOCK: CInt = 57

public val ENOTSUP: CInt = 58

public val ENOTTY: CInt = 59

public val ENXIO: CInt = 60

public val EOVERFLOW: CInt = 61

public val EOWNERDEAD: CInt = 62

public val EPERM: CInt = 63

public val EPIPE: CInt = 64

public val EPROTO: CInt = 65

public val EPROTONOSUPPORT: CInt = 66

public val EPROTOTYPE: CInt = 67

public val ERANGE: CInt = 68

public val EROFS: CInt = 69

public val ESPIPE: CInt = 70

public val ESRCH: CInt = 71

public val ESTALE: CInt = 72

public val ETIMEDOUT: CInt = 73

public val ETXTBSY: CInt = 74

public val EXDEV: CInt = 75

public val ENOTCAPABLE: CInt = 76

public val EOPNOTSUPP: CInt = ENOTSUP

public val EWOULDBLOCK: CInt = EAGAIN

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_IOV_MAX: CInt = 60

public val SC_SYMLOOP_MAX: CInt = 173

// Note(msrv): `addrOf(EXTERN_STATIC)` is now safe; remove `unchecked` when MSRV >= 1.82
public var CLOCK_MONOTONIC: ClockidT = clockidT(addrOf(CLOCK_MONOTONIC))

public var CLOCK_REALTIME: ClockidT = clockidT(addrOf(CLOCK_REALTIME))

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

public val PTHREAD_STACK_MIN: Int = 2048

public val TIMER_ABSTIME: CInt = 1
