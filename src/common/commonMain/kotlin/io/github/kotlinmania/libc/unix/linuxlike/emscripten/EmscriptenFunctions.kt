package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.cmsgAlign
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        return MutPtr(0L)
    }
    val next = MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if ((MutPtr((next).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress.toInt() >= max) {
        MutPtr(0L)
    } else {
        next
    }
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0u
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U32)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1u shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U32)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1u shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U32)
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0u != (cpuset.bits[idx] and (1u shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

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

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): MutPtr

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

public expect fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt

public expect fun sync()

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

// grp.h
public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt
