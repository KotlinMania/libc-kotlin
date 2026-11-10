package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (((cmsg!!.cmsgLen).toInt()) < 8) {
        return null
    }
    val next: Cmsghdr? = null
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (((COpaquePointer((next).hashCode().toLong() + 1.toLong()))).rawValue.toInt() >= max) {
        null
    } else {
        ((next as Any?) as Cmsghdr?)
    }
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0u
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1u shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1u shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0u != (cpuset.bits[idx] and (1u shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits.contentEquals(set2.bits)
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major
    val minor1 = minor
    var dev = 0u
    dev = dev or ((major1 and 0xfffff000u) shl 31 shl 1)
    dev = dev or ((major1 and 0x00000fffu) shl 8)
    dev = dev or ((minor1 and 0xffffff00u) shl 12)
    dev = dev or (minor1 and 0x000000ffu)
    return dev
}

public fun major(dev: DevT): CUint {
    // see
    // https://github.com/emscripten-core/emscripten/blob/
    // main/system/lib/libc/musl/include/sys/sysmacros.h
    var major = 0u
    major = major or ((dev shr 31 shr 1) and 0xfffff000u)
    major = major or ((dev shr 8) and 0x00000fffu)
    return major
}

public fun minor(dev: DevT): CUint {
    // see
    // https://github.com/emscripten-core/emscripten/blob/
    // main/system/lib/libc/musl/include/sys/sysmacros.h
    var minor = 0u
    minor = minor or ((dev shr 12) and 0xffffff00u)
    minor = minor or (dev and 0x000000ffu)
    return minor
}

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): COpaquePointer?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): COpaquePointer?

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer?

public expect fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt

public expect fun sync()

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

// grp.h
public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt
