// port-lint: source trusty.rs
package io.github.kotlinmania.libc

public typealias SizeT = ULong

public typealias SsizeT = Long

public typealias OffT = Long

public typealias CUint8T = UByte

public typealias CUint16T = UShort

public typealias CUint32T = UInt

public typealias CUint64T = ULong

public typealias CInt8T = Byte

public typealias CInt16T = Short

public typealias CInt32T = Int

public typealias CInt64T = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias TimeT = CLong

public typealias ClockidT = CInt

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public val PROT_READ: Int = 1

public val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public val CLOCK_BOOTTIME: ClockidT = 7

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val AT_PAGESZ: CUlong = 6uL

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

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

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(memptr?.value ?: 0L, align.toLong(), size.toLong())).toInt()
}

public fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(fd.toLong())).toInt()
}

public fun strlen(cs: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}

public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}
