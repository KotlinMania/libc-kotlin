package io.github.kotlinmania.libc.wasi

// [wasi-libc](https://github.com/WebAssembly/wasi-libc) definitions.
//
// `wasi - libc` project provides multiple libraries including emulated features, but we list only
// basic features with `libc.a` here.

public fun interface AtexitACallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias SsizeT = Long

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias OffT = Long

public typealias PidT = Int

public typealias ClockT = CLonglong

public typealias TimeT = CLonglong

public typealias InoT = ULong

public typealias SigsetT = CUchar

public typealias SusecondsT = CLonglong

public typealias ModeT = UInt

public typealias DevT = ULong

public typealias UidT = UInt

public typealias GidT = UInt

public typealias NlinkT = ULong

public typealias BlksizeT = CLong

public typealias BlkcntT = Long

public typealias NfdsT = CUlong

public typealias WcharT = Int

public typealias NlItem = CInt

public typealias WasiRightsT = ULong

public typealias LocaleT = LocaleStruct?

public typealias PthreadT = COpaquePointer?

public typealias PthreadOnceT = CInt

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public sealed class FILE {
}

public sealed class DIR {
}

public sealed class LocaleStruct {
}

// Declare dirent outside of s! so that it doesn't implement Copy, Eq, Hash,
// etc., since it contains a flexible array member with a dynamic size.
public open class Dirent(
    public var dIno: InoT,
    public var dType: CUchar,
    /**
     * dName is declared in WASI libc as a flexible array member, which
     * can't be directly expressed in Rust. As an imperfect workaround,
     * declare it as a zero-length array instead.
     */
    public var dName: List<CChar>,
)

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

public fun exit(code: CInt): Nothing {
    LibcDynamicFfi.invoke("_Exit", -1, longArrayOf(code.toLong()))
    error("unreachable")
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(a.toLong(), b.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(amt.toLong(), amt2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(ptr: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun getenv(s: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun malloc(amt: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(amt.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun sbrk(increment: IntptrT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sbrk", -1, longArrayOf(increment))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("read", -1, longArrayOf(fd.toLong(), ptr?.value ?: 0L, size.toLong()))
}

public fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(ptr?.value ?: 0L, amt.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setenv(k: String?, v: String?, a: CInt): CInt {
    val __cstr_0 = if (k == null) 0L else LibcDynamicFfi.allocUtf8CString(k)
    val __cstr_1 = if (v == null) 0L else LibcDynamicFfi.allocUtf8CString(v)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, a.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun unsetenv(k: String?): CInt {
    val __cstr_0 = if (k == null) 0L else LibcDynamicFfi.allocUtf8CString(k)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(fd.toLong(), ptr?.value ?: 0L, size.toLong()))
}

private var __backing_ENVIRON: COpaquePointer? = null

public var ENVIRON: COpaquePointer?
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("environ")
        if (addr == 0L) return __backing_ENVIRON
        val ptr = LibcDynamicFfi.readScalarSlot(addr, 8)
        return if (ptr == 0L) null else COpaquePointer(ptr)
    }
    set(value) {
        __backing_ENVIRON = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("environ")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 8, value?.value ?: 0L)
    }

public fun fopen(a: String?, b: String?): FILE? {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    val __cstr_1 = if (b == null) 0L else LibcDynamicFfi.allocUtf8CString(b)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(a: String?, b: String?, f: FILE?): FILE? {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    val __cstr_1 = if (b == null) 0L else LibcDynamicFfi.allocUtf8CString(b)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, f?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fclose(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun remove(a: String?): CInt {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(a: String?, b: String?): CInt {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    val __cstr_1 = if (b == null) 0L else LibcDynamicFfi.allocUtf8CString(b)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun feof(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun ferror(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun fflush(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun clearerr(f: FILE?) {
    LibcDynamicFfi.invoke("clearerr", -1, longArrayOf(f?.handle ?: 0L))
}

public fun fseek(f: FILE?, b: CLong, c: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(f?.handle ?: 0L, b, c.toLong())).toInt()
}

public fun ftell(f: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(f?.handle ?: 0L))
}

public fun rewind(f: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(f?.handle ?: 0L))
}

public fun fgetpos(f: FILE?, pos: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(f?.handle ?: 0L, pos?.value ?: 0L)).toInt()
}

public fun fsetpos(f: FILE?, pos: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(f?.handle ?: 0L, pos?.value ?: 0L)).toInt()
}

public fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(buf?.value ?: 0L, a.toLong(), b.toLong(), f?.handle ?: 0L)).toULong()
}

public fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(buf?.value ?: 0L, a.toLong(), b.toLong(), f?.handle ?: 0L)).toULong()
}

public fun fgetc(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun getc(f: FILE?): CInt {
    return LibcDynamicFfi.invoke("getc", -1, longArrayOf(f?.handle ?: 0L)).toInt()
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun ungetc(a: CInt, f: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(a.toLong(), f?.handle ?: 0L)).toInt()
}

public fun fputc(a: CInt, f: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(a.toLong(), f?.handle ?: 0L)).toInt()
}

public fun putc(a: CInt, f: FILE?): CInt {
    return LibcDynamicFfi.invoke("putc", -1, longArrayOf(a.toLong(), f?.handle ?: 0L)).toInt()
}

public fun putchar(a: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(a.toLong())).toInt()
}

public fun fputs(a: String?, f: FILE?): CInt {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, f?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun puts(a: String?): CInt {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun perror(a: String?) {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun srand(a: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(a.toLong()))
}

public fun atexit(a: AtexitACallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun atQuickExit(a: AtexitACallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("at_quick_exit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun quickExit(a: CInt): Nothing {
    LibcDynamicFfi.invoke("quick_exit", -1, longArrayOf(a.toLong()))
    error("unreachable")
}

public fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(a?.value ?: 0L, b.toLong(), c.toLong())).toInt()
}

public fun randR(a: CUint?): CInt {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a.toLong())
    try {
        return LibcDynamicFfi.invoke("rand_r", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun random(): CLong {
    return LibcDynamicFfi.invoke("random", -1, longArrayOf())
}

public fun srandom(a: CUint) {
    LibcDynamicFfi.invoke("srandom", -1, longArrayOf(a.toLong()))
}

public fun putenv(a: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("putenv", -1, longArrayOf(a?.value ?: 0L)).toInt()
}

public fun clock(): ClockT {
    return LibcDynamicFfi.invoke("clock", -1, longArrayOf())
}

public fun time(a: CLonglong?): TimeT {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun difftime(a: TimeT, b: TimeT): CDouble {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(a, b))
}

public fun mktime(a: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(a?.value ?: 0L))
}

public fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: Tm?): SizeT {
    val __cstr_2 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(a?.value ?: 0L, b.toLong(), __cstr_2, d?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun gmtime(a: CLonglong?): Tm? {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtimeR(a: CLonglong?, b: Tm?): Tm? {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, b?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(a: CLonglong?): Tm? {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(a: CLonglong?, b: Tm?): Tm? {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, b?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun asctimeR(a: Tm?, b: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctimeR(a: CLonglong?, b: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (a == null) 0L else LibcDynamicFfi.allocScalarSlot(a)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, b?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public val CLOCK_MONOTONIC1: UByte
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("_CLOCK_MONOTONIC")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 1).toUByte() else 0u
    }

public val CLOCK_REALTIME1: UByte
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("_CLOCK_REALTIME")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 1).toUByte() else 0u
    }

public fun nanosleep(a: Timespec?, b: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L)).toInt()
}

public fun clockGetres(a: ClockidT, b: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(a.toLong(), b?.value ?: 0L)).toInt()
}

public fun clockGettime(a: ClockidT, b: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(a.toLong(), b?.value ?: 0L)).toInt()
}

public fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(a.toLong(), a2.toLong(), b?.value ?: 0L, c?.value ?: 0L)).toInt()
}

public fun isalnum(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalnum", -1, longArrayOf(c.toLong())).toInt()
}

public fun isalpha(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalpha", -1, longArrayOf(c.toLong())).toInt()
}

public fun iscntrl(c: CInt): CInt {
    return LibcDynamicFfi.invoke("iscntrl", -1, longArrayOf(c.toLong())).toInt()
}

public fun isdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isgraph(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isgraph", -1, longArrayOf(c.toLong())).toInt()
}

public fun islower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("islower", -1, longArrayOf(c.toLong())).toInt()
}

public fun isprint(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isprint", -1, longArrayOf(c.toLong())).toInt()
}

public fun ispunct(c: CInt): CInt {
    return LibcDynamicFfi.invoke("ispunct", -1, longArrayOf(c.toLong())).toInt()
}

public fun isspace(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isspace", -1, longArrayOf(c.toLong())).toInt()
}

public fun isupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun isxdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isxdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isblank(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isblank", -1, longArrayOf(c.toLong())).toInt()
}

public fun tolower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("tolower", -1, longArrayOf(c.toLong())).toInt()
}

public fun toupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("toupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buf?.value ?: 0L))
}

public fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(buf?.value ?: 0L, n.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun atof(s: String?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("atof", 0, false, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoi(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(s: String?): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoll(s: String?): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtod(s: String?, endp: COpaquePointer?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, endp?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtof(s: String?, endp: COpaquePointer?): CFloat {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, endp?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcmp(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(cs: String?, ct: String?, n: SizeT): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strdup(cs: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strndup(cs: String?, n: SizeT): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strndup", -1, longArrayOf(__cstr_0, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strpbrk(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcasecmp(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlen(cs: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strnlen(cs: String?, maxlen: SizeT): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, maxlen.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strerror(n: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? {
    val __cstr_1 = if (t == null) 0L else LibcDynamicFfi.allocUtf8CString(t)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(cx?.value ?: 0L, ct?.value ?: 0L, n.toLong())).toInt()
}

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(dest?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fprintf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun printf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(s?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fscanf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun scanf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sscanf", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getcharUnlocked(): CInt {
    return LibcDynamicFfi.invoke("getchar_unlocked", -1, longArrayOf()).toInt()
}

public fun putcharUnlocked(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar_unlocked", -1, longArrayOf(c.toLong())).toInt()
}

public fun shutdown(socket: CInt, how: CInt): CInt {
    return LibcDynamicFfi.invoke("shutdown", -1, longArrayOf(socket.toLong(), how.toLong())).toInt()
}

public fun fstat(fildes: CInt, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun mkdir(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkdir", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun stat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fdopen(fd: CInt, mode: String?): FILE? {
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fdopen", -1, longArrayOf(fd.toLong(), __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fileno(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fileno", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun creat(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("creat", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("fcntl", 2, longArrayOf(fd.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

public fun opendir(dirname: String?): DIR? {
    val __cstr_0 = if (dirname == null) 0L else LibcDynamicFfi.allocUtf8CString(dirname)
    try {
        val rawRet = LibcDynamicFfi.invoke("opendir", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else DIR(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fdopendir(fd: CInt): DIR? {
    val rawRet = LibcDynamicFfi.invoke("fdopendir", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else DIR(rawRet)
}

public fun readdir(dirp: DIR?): Dirent? {
    val rawRet = LibcDynamicFfi.invoke("readdir", -1, longArrayOf(dirp?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun closedir(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("closedir", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun rewinddir(dirp: DIR?) {
    LibcDynamicFfi.invoke("rewinddir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("openat", 3, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fstatat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("linkat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkdirat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("readlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, bufsiz.toLong()))
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("renameat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (linkpath == null) 0L else LibcDynamicFfi.allocUtf8CString(linkpath)
    try {
        return LibcDynamicFfi.invoke("symlinkat", -1, longArrayOf(__cstr_0, newdirfd.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("unlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun access(path: String?, amode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("access", -1, longArrayOf(__cstr_0, amode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fpathconf(filedes: CInt, name: CInt): CLong {
    return LibcDynamicFfi.invoke("fpathconf", -1, longArrayOf(filedes.toLong(), name.toLong()))
}

public fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt {
    val __cstr_2 = if (optstr == null) 0L else LibcDynamicFfi.allocUtf8CString(optstr)
    try {
        return LibcDynamicFfi.invoke("getopt", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun isatty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("isatty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun link(src: String?, dst: String?): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (dst == null) 0L else LibcDynamicFfi.allocUtf8CString(dst)
    try {
        return LibcDynamicFfi.invoke("link", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT {
    return LibcDynamicFfi.invoke("lseek", -1, longArrayOf(fd.toLong(), offset, whence.toLong()))
}

public fun pathconf(path: String?, name: CInt): CLong {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("pathconf", -1, longArrayOf(__cstr_0, name.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rmdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sleep(secs: CUint): CUint {
    return LibcDynamicFfi.invoke("sleep", -1, longArrayOf(secs.toLong())).toUInt()
}

public fun unlink(c: String?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pread", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwrite", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun lstat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lstat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fsync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fsync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun symlink(path1: String?, path2: String?): CInt {
    val __cstr_0 = if (path1 == null) 0L else LibcDynamicFfi.allocUtf8CString(path1)
    val __cstr_1 = if (path2 == null) 0L else LibcDynamicFfi.allocUtf8CString(path2)
    try {
        return LibcDynamicFfi.invoke("symlink", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun truncate(path: String?, length: OffT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("truncate", -1, longArrayOf(__cstr_0, length)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ftruncate(fd: CInt, length: OffT): CInt {
    return LibcDynamicFfi.invoke("ftruncate", -1, longArrayOf(fd.toLong(), length)).toInt()
}

public fun getrusage(resource: CInt, usage: Rusage?): CInt {
    return LibcDynamicFfi.invoke("getrusage", -1, longArrayOf(resource.toLong(), usage?.value ?: 0L)).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun times(buf: Tms?): ClockT {
    return LibcDynamicFfi.invoke("times", -1, longArrayOf(buf?.value ?: 0L))
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun usleep(secs: CUint): CInt {
    return LibcDynamicFfi.invoke("usleep", -1, longArrayOf(secs.toLong())).toInt()
}

public fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("send", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong()))
}

public fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recv", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong()))
}

public fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("poll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout.toLong())).toInt()
}

public fun setlocale(category: CInt, locale: String?): COpaquePointer? {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(category.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun localeconv(): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("readlink", -1, longArrayOf(__cstr_0, buf?.value ?: 0L, bufsz.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun timegm(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("timegm", -1, longArrayOf(tm?.value ?: 0L))
}

public fun sysconf(name: CInt): CLong {
    return LibcDynamicFfi.invoke("sysconf", -1, longArrayOf(name.toLong()))
}

public fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftello(stream: FILE?): OffT {
    return LibcDynamicFfi.invoke("ftello", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun strcasestr(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcasestr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT {
    val __slot_1 = if (n == null) 0L else LibcDynamicFfi.allocScalarSlot(n.toLong())
    try {
        return LibcDynamicFfi.invoke("getline", -1, longArrayOf(lineptr?.value ?: 0L, __slot_1, stream?.handle ?: 0L))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
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

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
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

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
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

public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

public fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getcwd", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun chdir(dir: String?): CInt {
    val __cstr_0 = if (dir == null) 0L else LibcDynamicFfi.allocUtf8CString(dir)
    try {
        return LibcDynamicFfi.invoke("chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item.toLong(), loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt {
    return LibcDynamicFfi.invoke("select", -1, longArrayOf(nfds.toLong(), readfds?.value ?: 0L, writefds?.value ?: 0L, errorfds?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_register_preopened_fd", -1, longArrayOf(fd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt {
    return LibcDynamicFfi.invoke("__wasilibc_fd_renumber", -1, longArrayOf(fd.toLong(), newfd.toLong())).toInt()
}

public fun wasilibcUnlinkat(fd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_unlinkat", -1, longArrayOf(fd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcRmdirat(fd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_rmdirat", -1, longArrayOf(fd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_find_relpath", -1, longArrayOf(__cstr_0, absPrefix?.value ?: 0L, relativePath?.value ?: 0L, relativePathLen.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wasilibcTell(fd: CInt): OffT {
    return LibcDynamicFfi.invoke("__wasilibc_tell", -1, longArrayOf(fd.toLong()))
}

public fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd___wasilibc_unlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd___wasilibc_rmdirat", -1, longArrayOf(dirfd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_linkat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_symlinkat", -1, longArrayOf(__cstr_0, dirfd.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_readlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, bufsize.toLong()))
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_renameat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_openat_nomode", -1, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_fstatat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_mkdirat_nomode", -1, longArrayOf(dirfd.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: Timespec?, flags: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_nocwd_utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("__wasilibc_nocwd_opendirat", -1, longArrayOf(dirfd.toLong(), __cstr_1))
        return if (rawRet == 0L) null else DIR(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_access", -1, longArrayOf(__cstr_0, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_stat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_utimens", -1, longArrayOf(__cstr_0, times?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt {
    val __cstr_0 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_1 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_link", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_2 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_link_oldat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, __cstr_2, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt {
    val __cstr_0 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_2 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_link_newat", -1, longArrayOf(__cstr_0, newdirfd.toLong(), __cstr_2, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_2 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_rename_oldat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, __cstr_2)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt {
    val __cstr_0 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_2 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("__wasilibc_rename_newat", -1, longArrayOf(__cstr_0, newdirfd.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(a?.value ?: 0L, b.toLong()))
}

public fun arc4randomUniform(a: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(a.toLong())).toUInt()
}

public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun chmod(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chmod", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fchmod(fd: CInt, mode: ModeT): CInt {
    return LibcDynamicFfi.invoke("fchmod", -1, longArrayOf(fd.toLong(), mode.toLong())).toInt()
}

public fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        val rawRet = LibcDynamicFfi.invoke("realpath", -1, longArrayOf(__cstr_0, resolved?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadSelf(): PthreadT {
    val rawRet = LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadCreate(native: COpaquePointer?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(native?.value ?: 0L, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_equal", -1, longArrayOf(t1?.value ?: 0L, t2?.value ?: 0L)).toInt()
}

public fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(native?.value ?: 0L, value?.value ?: 0L)).toInt()
}

public fun pthreadAttrInit(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt {
    val __slot_1 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstacksize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setstacksize", -1, longArrayOf(attr?.value ?: 0L, stackSize.toLong())).toInt()
}

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setdetachstate", -1, longArrayOf(attr?.value ?: 0L, state.toLong())).toInt()
}

public fun pthreadDetach(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_detach", -1, longArrayOf(thread?.value ?: 0L)).toInt()
}

public fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(__slot_0, dtor?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(key.toLong())).toInt()
}

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(key.toLong(), value?.value ?: 0L)).toInt()
}

public fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_init", -1, longArrayOf(lock?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexLock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_lock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_trylock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_settype", -1, longArrayOf(attr?.value ?: 0L, type.toLong())).toInt()
}

public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_init", -1, longArrayOf(cond?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_wait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L)).toInt()
}

public fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_timedwait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadCondSignal(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_signal", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_broadcast", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondDestroy(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_destroy", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_init", -1, longArrayOf(lock?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_rdlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_tryrdlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_wrlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_trywrlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}
