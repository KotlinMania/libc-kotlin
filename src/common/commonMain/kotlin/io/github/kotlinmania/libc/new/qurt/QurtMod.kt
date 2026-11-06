package io.github.kotlinmania.libc.new.qurt

// QuRT (Qualcomm Real-Time OS) bindings
//
// QuRT is Qualcomm's real-time operating system for Hexagon DSP architectures.
// Headers available via the
// Hexagon SDK: https://softwarecenter.qualcomm.com/catalog/item/HexagonSdk

// Basic C types for QuRT
public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = CInt

// Process and system types
public typealias PidT = CInt

public typealias UidT = CUint

public typealias GidT = CUint

// Time types
public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public typealias ClockidT = CInt

public typealias TimerT = COpaquePointer?

// File system types
public typealias DevT = CUlonglong

public typealias InoT = CUlonglong

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias OffT = CLong

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

// Thread types based on QuRT pthread implementation
public typealias PthreadT = CUint

public typealias PthreadKeyT = CInt

public typealias PthreadOnceT = CInt

public typealias PthreadMutexT = CUint

public typealias PthreadMutexattrT = CUint

public typealias PthreadCondT = CUint

public typealias PthreadCondattrT = CUint

public typealias PthreadAttrT = CUint

public typealias PthreadRwlockT = CUint

public typealias PthreadRwlockattrT = CUint

public typealias PthreadSpinlockT = CUint

public typealias PthreadBarrierT = CUint

public typealias PthreadBarrierattrT = CUint

// Network types
public typealias SocklenT = CUint

public typealias SaFamilyT = CUshort

public typealias InAddrT = CUint

public typealias InPortT = CUshort

// File descriptor types
public typealias FdSet = CUlong

public typealias FposT = CLong

public typealias ClockT = CLong

// POSIX semaphore types
public typealias SemT = CUint

// Message queue types
public typealias MqdT = CInt

// Additional file system types
public typealias NfdsT = CUlong

// Signal types
public typealias SigsetT = CUlong

// Variadic argument list type
public typealias VaList = COpaquePointer?

// Additional missing types
public typealias CSchar = Byte

// Wide character type (hexagon-specific)
public typealias WcharT = UInt

// Error type (compatible with std expectations)
public typealias ErrnoT = CInt

// Resource limit type (for compatibility, not fully supported on QuRT)
public typealias RlimT = CUlong

// Terminal types (for compatibility, not fully supported on QuRT)
public typealias SpeedT = CUint

public typealias TcflagT = CUint

// Additional pthread constants
public val PTHREAD_NAME_LEN: CInt = 16

public val PTHREAD_MAX_THREADS: CUint = 512u

public val PTHREAD_MIN_STACKSIZE: CInt = 512

public val PTHREAD_MAX_STACKSIZE: CInt = 1048576

public val PTHREAD_DEFAULT_STACKSIZE: CInt = 16384

public val PTHREAD_DEFAULT_PRIORITY: CInt = 1

public val PTHREAD_SPINLOCK_UNLOCKED: CInt = 0

public val PTHREAD_SPINLOCK_LOCKED: CInt = 1

// Additional time constants
public val TIME_CONV_SCLK_FREQ: CInt = 19200000

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val CLOCK_BOOTTIME: ClockidT = 7

// Stdio constants
public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 25u

public val FOPEN_MAX: CUint = 20u

// Error constants
public val EOK: CInt = 0

// Semaphore constants
public val SEM_FAILED: CUint? = null

// Page size constants (hexagon-specific)
public val PAGESIZE: SizeT = 4096uL

public val PAGE_SIZE: SizeT = 4096uL

// Directory entry types (hexagon-specific)
public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

// Directory functions (dirent.h)
public fun opendir(name: String?): DIR? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("opendir", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else DIR(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun readdir(dirp: DIR?): Dirent? {
    val rawRet = LibcDynamicFfi.invoke("readdir", -1, longArrayOf(dirp?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun closedir(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("closedir", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun mkdir(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkdir", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Additional pthread functions
public fun pthreadAttrGetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(__slot_0, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadAttrSetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setstack", -1, longArrayOf(__slot_0, stackaddr?.value ?: 0L, stacksize.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// Additional time functions
public fun clockGetcpuclockid(pid: PidT, clockId: CInt?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// POSIX semaphore functions
public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CUint? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toUInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semClose(sem: CUint?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Additional stdlib functions
public fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(alignment.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// String functions (string.h)
public fun strlen(s: String?): SizeT {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dest?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dest?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(dest?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(dest?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcmp(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(s1: String?, s2: String?, n: SizeT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(dest?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(s: String?, accept: String?): SizeT {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (accept == null) 0L else LibcDynamicFfi.allocUtf8CString(accept)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(s: String?, reject: String?): SizeT {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (reject == null) 0L else LibcDynamicFfi.allocUtf8CString(reject)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strpbrk(s: String?, accept: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (accept == null) 0L else LibcDynamicFfi.allocUtf8CString(accept)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(haystack: String?, needle: String?): COpaquePointer? {
    val __cstr_0 = if (haystack == null) 0L else LibcDynamicFfi.allocUtf8CString(haystack)
    val __cstr_1 = if (needle == null) 0L else LibcDynamicFfi.allocUtf8CString(needle)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? {
    val __cstr_1 = if (delim == null) 0L else LibcDynamicFfi.allocUtf8CString(delim)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strerror(errnum: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(errnum.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(s?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(s1?.value ?: 0L, s2?.value ?: 0L, n.toLong())).toInt()
}

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(s?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// Additional unistd functions
public fun fork(): PidT {
    return LibcDynamicFfi.invoke("fork", -1, longArrayOf()).toInt()
}

public fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("execve", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Character classification functions (ctype.h)
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

public fun tolower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("tolower", -1, longArrayOf(c.toLong())).toInt()
}

public fun toupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("toupper", -1, longArrayOf(c.toLong())).toInt()
}
