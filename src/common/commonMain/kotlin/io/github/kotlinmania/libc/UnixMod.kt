package io.github.kotlinmania.libc

// Definitions found commonly among almost all Unix derivatives
//
// More functions and definitions can be found in the more specific modules
// according to the platform in question.

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = Int

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias LocaleT = COpaquePointer?

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (0.inv()).toULong()

public val SIGIOT: CInt = 6

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

public val LOG_KERN: CInt = 0

public val LOG_USER: CInt = 1 shl 3

public val LOG_MAIL: CInt = 2 shl 3

public val LOG_DAEMON: CInt = 3 shl 3

public val LOG_AUTH: CInt = 4 shl 3

public val LOG_SYSLOG: CInt = 5 shl 3

public val LOG_LPR: CInt = 6 shl 3

public val LOG_NEWS: CInt = 7 shl 3

public val LOG_UUCP: CInt = 8 shl 3

public val LOG_LOCAL0: CInt = 16 shl 3

public val LOG_LOCAL1: CInt = 17 shl 3

public val LOG_LOCAL2: CInt = 18 shl 3

public val LOG_LOCAL3: CInt = 19 shl 3

public val LOG_LOCAL4: CInt = 20 shl 3

public val LOG_LOCAL5: CInt = 21 shl 3

public val LOG_LOCAL6: CInt = 22 shl 3

public val LOG_LOCAL7: CInt = 23 shl 3

public val LOG_PRIMASK: CInt = 7

public val LOG_FACMASK: CInt = 0x3f8

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IP: CInt = 0

public val IPPROTO_IPV6: CInt = 41

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_ANY: InAddrT = 0u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

public val IN6ADDR_LOOPBACK_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1))

public val IN6ADDR_ANY_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val ARPOP_REQUEST: UShort = 1u

public val ARPOP_REPLY: UShort = 2u

public val ATF_COM: CInt = 0x02

public val ATF_PERM: CInt = 0x04

public val ATF_PUBL: CInt = 0x08

public val ATF_USETRAILERS: CInt = 0x10

public val FNM_NOMATCH: CInt = 1

public val IN6ADDR_LOOPBACK: In6Addr = null as In6Addr

public val IN6ADDR_ANY: In6Addr = null as In6Addr

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

public fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    LibcDynamicFfi.invoke("qsort", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L))
}

public fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("bsearch", -1, longArrayOf(key?.value ?: 0L, base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fopen(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, file?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fflush(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun fclose(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun remove(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(oldname: String?, newname: String?): CInt {
    val __cstr_0 = if (oldname == null) 0L else LibcDynamicFfi.allocUtf8CString(oldname)
    val __cstr_1 = if (newname == null) 0L else LibcDynamicFfi.allocUtf8CString(newname)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buf?.value ?: 0L))
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun putchar(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(c.toLong())).toInt()
}

public fun fgetc(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(buf?.value ?: 0L, n.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fputc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fputs(s: String?, stream: FILE?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, stream?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun puts(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ungetc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftell(stream: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun rewind(stream: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun fgetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun fsetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun feof(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun ferror(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun clearerr(stream: FILE?) {
    LibcDynamicFfi.invoke("clearerr", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun perror(s: String?) {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
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

public fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(nobj.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun malloc(size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(p: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(p?.value ?: 0L))
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun exit(status: CInt): Nothing {
    LibcDynamicFfi.invoke("exit", -1, longArrayOf(status.toLong()))
    error("unreachable")
}

public fun system(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("system", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
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

public fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("stpcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1))
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

public fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? {
    val __cstr_1 = if (t == null) 0L else LibcDynamicFfi.allocUtf8CString(t)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok_r", -1, longArrayOf(s?.value ?: 0L, __cstr_1, p?.value ?: 0L))
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

public fun strsignal(sig: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strsignal", -1, longArrayOf(sig.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wcslen(buf: WcharT?): SizeT {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("wcslen", -1, longArrayOf(__slot_0)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT {
    val __slot_1 = if (src == null) 0L else LibcDynamicFfi.allocScalarSlot(src.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs", -1, longArrayOf(dest?.value ?: 0L, __slot_1, n.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? {
    val __slot_0 = if (cx == null) 0L else LibcDynamicFfi.allocScalarSlot(cx.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wmemchr", -1, longArrayOf(__slot_0, c.toLong(), n.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
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

public fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memccpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getpwnam(name: String?): Passwd? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getpwnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuid(uid: UidT): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwuid", -1, longArrayOf(uid.toLong()))
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

public fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("socket", -1, longArrayOf(domain.toLong(), ty.toLong(), protocol.toLong())).toInt()
}

public fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt {
    return LibcDynamicFfi.invoke("connect", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, len.toLong())).toInt()
}

public fun listen(socket: CInt, backlog: CInt): CInt {
    return LibcDynamicFfi.invoke("listen", -1, longArrayOf(socket.toLong(), backlog.toLong())).toInt()
}

public fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeername", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockname", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("setsockopt", -1, longArrayOf(socket.toLong(), level.toLong(), name.toLong(), value?.value ?: 0L, optionLen.toLong())).toInt()
}

public fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt {
    val __slot_3 = if (socketVector == null) 0L else LibcDynamicFfi.allocScalarSlot(socketVector.toLong())
    try {
        return LibcDynamicFfi.invoke("socketpair", -1, longArrayOf(domain.toLong(), type.toLong(), protocol.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT {
    return LibcDynamicFfi.invoke("sendto", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, addrlen.toLong()))
}

public fun shutdown(socket: CInt, how: CInt): CInt {
    return LibcDynamicFfi.invoke("shutdown", -1, longArrayOf(socket.toLong(), how.toLong())).toInt()
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

public fun pclose(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("pclose", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
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

public fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchmodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fchown(fd: CInt, owner: UidT, group: GidT): CInt {
    return LibcDynamicFfi.invoke("fchown", -1, longArrayOf(fd.toLong(), owner.toLong(), group.toLong())).toInt()
}

public fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchownat", -1, longArrayOf(dirfd.toLong(), __cstr_1, owner.toLong(), group.toLong(), flags.toLong())).toInt()
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

public fun alarm(seconds: CUint): CUint {
    return LibcDynamicFfi.invoke("alarm", -1, longArrayOf(seconds.toLong())).toUInt()
}

public fun chdir(dir: String?): CInt {
    val __cstr_0 = if (dir == null) 0L else LibcDynamicFfi.allocUtf8CString(dir)
    try {
        return LibcDynamicFfi.invoke("chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fchdir(dirfd: CInt): CInt {
    return LibcDynamicFfi.invoke("fchdir", -1, longArrayOf(dirfd.toLong())).toInt()
}

public fun chown(path: String?, uid: UidT, gid: GidT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chown", -1, longArrayOf(__cstr_0, uid.toLong(), gid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lchown(path: String?, uid: UidT, gid: GidT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lchown", -1, longArrayOf(__cstr_0, uid.toLong(), gid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("dup", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup2(src: CInt, dst: CInt): CInt {
    return LibcDynamicFfi.invoke("dup2", -1, longArrayOf(src.toLong(), dst.toLong())).toInt()
}

public fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execl", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execle", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execlp", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun execv(prog: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("execv", -1, longArrayOf(__cstr_0, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("execve", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvp(c: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("execvp", -1, longArrayOf(__cstr_0, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fork(): PidT {
    return LibcDynamicFfi.invoke("fork", -1, longArrayOf()).toInt()
}

public fun fpathconf(filedes: CInt, name: CInt): CLong {
    return LibcDynamicFfi.invoke("fpathconf", -1, longArrayOf(filedes.toLong(), name.toLong()))
}

public fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getcwd", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getegid(): GidT {
    return LibcDynamicFfi.invoke("getegid", -1, longArrayOf()).toUShort()
}

public fun geteuid(): UidT {
    return LibcDynamicFfi.invoke("geteuid", -1, longArrayOf()).toUShort()
}

public fun getgid(): GidT {
    return LibcDynamicFfi.invoke("getgid", -1, longArrayOf()).toUShort()
}

public fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt {
    val __slot_1 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgroups", -1, longArrayOf(ngroupsMax.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getlogin(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getlogin", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt {
    val __cstr_2 = if (optstr == null) 0L else LibcDynamicFfi.allocUtf8CString(optstr)
    try {
        return LibcDynamicFfi.invoke("getopt", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getpgid(pid: PidT): PidT {
    return LibcDynamicFfi.invoke("getpgid", -1, longArrayOf(pid.toLong())).toInt()
}

public fun getpgrp(): PidT {
    return LibcDynamicFfi.invoke("getpgrp", -1, longArrayOf()).toInt()
}

public fun getpid(): PidT {
    return LibcDynamicFfi.invoke("getpid", -1, longArrayOf()).toInt()
}

public fun getppid(): PidT {
    return LibcDynamicFfi.invoke("getppid", -1, longArrayOf()).toInt()
}

public fun getuid(): UidT {
    return LibcDynamicFfi.invoke("getuid", -1, longArrayOf()).toUShort()
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

public fun pipe(fds: CInt?): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(memptr?.value ?: 0L, align.toLong(), size.toLong())).toInt()
}

public fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(alignment.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("read", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

public fun rmdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun seteuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("seteuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun setegid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setegid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setgid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setgid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setpgid(pid: PidT, pgid: PidT): CInt {
    return LibcDynamicFfi.invoke("setpgid", -1, longArrayOf(pid.toLong(), pgid.toLong())).toInt()
}

public fun setsid(): PidT {
    return LibcDynamicFfi.invoke("setsid", -1, longArrayOf()).toInt()
}

public fun setuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("setuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun setreuid(ruid: UidT, euid: UidT): CInt {
    return LibcDynamicFfi.invoke("setreuid", -1, longArrayOf(ruid.toLong(), euid.toLong())).toInt()
}

public fun setregid(rgid: GidT, egid: GidT): CInt {
    return LibcDynamicFfi.invoke("setregid", -1, longArrayOf(rgid.toLong(), egid.toLong())).toInt()
}

public fun sleep(secs: CUint): CUint {
    return LibcDynamicFfi.invoke("sleep", -1, longArrayOf(secs.toLong())).toUInt()
}

public fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun tcgetpgrp(fd: CInt): PidT {
    return LibcDynamicFfi.invoke("tcgetpgrp", -1, longArrayOf(fd.toLong())).toInt()
}

public fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt {
    return LibcDynamicFfi.invoke("tcsetpgrp", -1, longArrayOf(fd.toLong(), pgrp.toLong())).toInt()
}

public fun ttyname(fd: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ttyname", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ttyname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun unlink(c: String?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wait(status: CInt?): PidT {
    val __slot_0 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("waitpid", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pread", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwrite", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun umask(mask: ModeT): ModeT {
    return LibcDynamicFfi.invoke("umask", -1, longArrayOf(mask.toLong())).toUInt()
}

public fun utime(file: String?, buf: Utimbuf?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utime", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kill(pid: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("kill", -1, longArrayOf(pid.toLong(), sig.toLong())).toInt()
}

public fun killpg(pgrp: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("killpg", -1, longArrayOf(pgrp.toLong(), sig.toLong())).toInt()
}

public fun mlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("mlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun munlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mlockall(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mlockall", -1, longArrayOf(flags.toLong())).toInt()
}

public fun munlockall(): CInt {
    return LibcDynamicFfi.invoke("munlockall", -1, longArrayOf()).toInt()
}

public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun ifNametoindex(ifname: String?): CUint {
    val __cstr_0 = if (ifname == null) 0L else LibcDynamicFfi.allocUtf8CString(ifname)
    try {
        return LibcDynamicFfi.invoke("if_nametoindex", -1, longArrayOf(__cstr_0)).toUInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("if_indextoname", -1, longArrayOf(ifindex.toLong(), ifname?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
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

public fun setenv(name: String?, value: String?, overwrite: CInt): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (value == null) 0L else LibcDynamicFfi.allocUtf8CString(value)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, overwrite.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun unsetenv(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
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

public fun signal(signum: CInt, handler: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(signum.toLong(), handler.toLong())).toULong()
}

public fun getrusage(resource: CInt, usage: Rusage?): CInt {
    return LibcDynamicFfi.invoke("getrusage", -1, longArrayOf(resource.toLong(), usage?.value ?: 0L)).toInt()
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

public fun times(buf: Tms?): ClockT {
    LibcDynamicFfi.invoke("times", -1, longArrayOf(buf?.value ?: 0L))
    return null as ClockT
}

public fun pthreadSelf(): PthreadT {
    LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf())
    return null as PthreadT
}

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_equal", -1, longArrayOf(__scratch_0, __scratch_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(__scratch_0, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadExit(value: COpaquePointer?): Nothing {
    LibcDynamicFfi.invoke("pthread_exit", -1, longArrayOf(value?.value ?: 0L))
    error("unreachable")
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
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_detach", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

public fun pthreadKeyCreate(key: PthreadKeyT?, dtor: PthreadKeyCreateDtorCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(key?.value ?: 0L, dtor?.value ?: 0L)).toInt()
}

public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(__scratch_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(__scratch_0, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
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

public fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt {
    val __slot_4 = if (optlen == null) 0L else LibcDynamicFfi.allocScalarSlot(optlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockopt", -1, longArrayOf(sockfd.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun raise(signum: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(signum.toLong())).toInt()
}

public fun utimes(filename: String?, times: Timeval?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("utimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlopen", -1, longArrayOf(__cstr_0, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlerror(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dlerror", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlclose(handle: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dlclose", -1, longArrayOf(handle?.value ?: 0L)).toInt()
}

public fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt {
    val __cstr_0 = if (node == null) 0L else LibcDynamicFfi.allocUtf8CString(node)
    val __cstr_1 = if (service == null) 0L else LibcDynamicFfi.allocUtf8CString(service)
    try {
        return LibcDynamicFfi.invoke("getaddrinfo", -1, longArrayOf(__cstr_0, __cstr_1, hints?.value ?: 0L, res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freeaddrinfo(res: Addrinfo?) {
    LibcDynamicFfi.invoke("freeaddrinfo", -1, longArrayOf(res?.value ?: 0L))
}

public fun hstrerror(errcode: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("hstrerror", -1, longArrayOf(errcode.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun gaiStrerror(errcode: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gai_strerror", -1, longArrayOf(errcode.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun resInit(): CInt {
    return LibcDynamicFfi.invoke("res_init", -1, longArrayOf()).toInt()
}

public fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(timeP: TimeT?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mktime(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(tm?.value ?: 0L))
}

public fun time(time: TimeT?): TimeT {
    val __slot_0 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtime(timeP: TimeT?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(timeP: TimeT?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun difftime(time1: TimeT, time0: TimeT): CDouble {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(time1, time0))
}

public fun timegm(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("timegm", -1, longArrayOf(tm?.value ?: 0L))
}

public fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mknod", -1, longArrayOf(__cstr_0, mode.toLong(), __scratch_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun gethostname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("gethostname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun endservent() {
    LibcDynamicFfi.invoke("endservent", -1, longArrayOf())
}

public fun getservbyname(name: String?, proto: String?): Servent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (proto == null) 0L else LibcDynamicFfi.allocUtf8CString(proto)
    try {
        val rawRet = LibcDynamicFfi.invoke("getservbyname", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getservbyport(port: CInt, proto: String?): Servent? {
    val __cstr_1 = if (proto == null) 0L else LibcDynamicFfi.allocUtf8CString(proto)
    try {
        val rawRet = LibcDynamicFfi.invoke("getservbyport", -1, longArrayOf(port.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getservent(): Servent? {
    val rawRet = LibcDynamicFfi.invoke("getservent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setservent(stayopen: CInt) {
    LibcDynamicFfi.invoke("setservent", -1, longArrayOf(stayopen.toLong()))
}

public fun getprotobyname(name: String?): Protoent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getprotobyname", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getprotobynumber(proto: CInt): Protoent? {
    val rawRet = LibcDynamicFfi.invoke("getprotobynumber", -1, longArrayOf(proto.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun chroot(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("chroot", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun usleep(secs: UsecondsT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("usleep", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
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

public fun putenv(string: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("putenv", -1, longArrayOf(string?.value ?: 0L)).toInt()
}

public fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("poll", -1, longArrayOf(fds?.value ?: 0L, __scratch_1, timeout.toLong())).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt {
    return LibcDynamicFfi.invoke("select", -1, longArrayOf(nfds.toLong(), readfds?.value ?: 0L, writefds?.value ?: 0L, errorfds?.value ?: 0L, timeout?.value ?: 0L)).toInt()
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

public fun semWait(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_wait", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semTrywait(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_trywait", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semPost(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_post", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun statvfs(path: String?, buf: Statvfs?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("statvfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatvfs(fd: CInt, buf: Statvfs?): CInt {
    return LibcDynamicFfi.invoke("fstatvfs", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sigemptyset(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigemptyset", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun sigaddset(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigaddset", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigfillset(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigfillset", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun sigdelset(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigdelset", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigismember(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigismember", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigprocmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun sigpending(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigpending", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun sysconf(name: CInt): CLong {
    return LibcDynamicFfi.invoke("sysconf", -1, longArrayOf(name.toLong()))
}

public fun mkfifo(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkfifo", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftello(stream: FILE?): OffT {
    return LibcDynamicFfi.invoke("ftello", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun tcdrain(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("tcdrain", -1, longArrayOf(fd.toLong())).toInt()
}

public fun cfgetispeed(termios: Termios?): SpeedT {
    LibcDynamicFfi.invoke("cfgetispeed", -1, longArrayOf(termios?.value ?: 0L))
    return null as SpeedT
}

public fun cfgetospeed(termios: Termios?): SpeedT {
    LibcDynamicFfi.invoke("cfgetospeed", -1, longArrayOf(termios?.value ?: 0L))
    return null as SpeedT
}

public fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("cfsetispeed", -1, longArrayOf(termios?.value ?: 0L, __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("cfsetospeed", -1, longArrayOf(termios?.value ?: 0L, __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun tcgetattr(fd: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcgetattr", -1, longArrayOf(fd.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcsetattr", -1, longArrayOf(fd.toLong(), optionalActions.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcflow(fd: CInt, action: CInt): CInt {
    return LibcDynamicFfi.invoke("tcflow", -1, longArrayOf(fd.toLong(), action.toLong())).toInt()
}

public fun tcflush(fd: CInt, action: CInt): CInt {
    return LibcDynamicFfi.invoke("tcflush", -1, longArrayOf(fd.toLong(), action.toLong())).toInt()
}

public fun tcgetsid(fd: CInt): PidT {
    return LibcDynamicFfi.invoke("tcgetsid", -1, longArrayOf(fd.toLong())).toInt()
}

public fun tcsendbreak(fd: CInt, duration: CInt): CInt {
    return LibcDynamicFfi.invoke("tcsendbreak", -1, longArrayOf(fd.toLong(), duration.toLong())).toInt()
}

public fun mkstemp(template: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mkstemp", -1, longArrayOf(template?.value ?: 0L)).toInt()
}

public fun mkdtemp(template: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mkdtemp", -1, longArrayOf(template?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun tmpnam(ptr: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("tmpnam", -1, longArrayOf(ptr?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    val __cstr_0 = if (ident == null) 0L else LibcDynamicFfi.allocUtf8CString(ident)
    try {
        LibcDynamicFfi.invoke("openlog", -1, longArrayOf(__cstr_0, logopt.toLong(), facility.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun closelog() {
    LibcDynamicFfi.invoke("closelog", -1, longArrayOf())
}

public fun setlogmask(maskpri: CInt): CInt {
    return LibcDynamicFfi.invoke("setlogmask", -1, longArrayOf(maskpri.toLong())).toInt()
}

public fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    val __cstr_1 = if (message == null) 0L else LibcDynamicFfi.allocUtf8CString(message)
    try {
        LibcDynamicFfi.invoke("syslog", 2, longArrayOf(priority.toLong(), __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun nice(incr: CInt): CInt {
    return LibcDynamicFfi.invoke("nice", -1, longArrayOf(incr.toLong())).toInt()
}

public fun grantpt(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("grantpt", -1, longArrayOf(fd.toLong())).toInt()
}

public fun posixOpenpt(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_openpt", -1, longArrayOf(flags.toLong())).toInt()
}

public fun ptsname(fd: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ptsname", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun unlockpt(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("unlockpt", -1, longArrayOf(fd.toLong())).toInt()
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

public fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt {
    return LibcDynamicFfi.invoke("lockf", -1, longArrayOf(fd.toLong(), cmd.toLong(), len)).toInt()
}

public fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fnmatch", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}
