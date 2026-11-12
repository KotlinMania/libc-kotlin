package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// intentionally not public, only used for fdSet
// https://github.com/search?q=repo%3Atorvalds%2Flinux+%22%23define+_IOC_NONE%22&type=code
// LFS64 extensions
//
// * musl and Emscripten has 64-bit versions only so aliases the LFS64 symbols to the standard ones
// * ulibc doesn't have preadv64/pwritev64
// The statx syscall, available on some libcs.
// adapted from https://github.com/torvalds/linux/blob/8a696a29c6905594e4abf78eaafcb62165ac61f1/rust/kernel/ioctl.rs

/**
 * Build an ioctl number, analogous to the C macro of the same name.
 */
public fun ioc(dir: UInt, ty: UInt, nr: UInt, size: Int): Ioctl {
    check(dir <= IOC_DIRMASK)
    check(ty <= IOC_TYPEMASK)
    check(nr <= IOC_NRMASK)
    check(size <= (IOC_SIZEMASK.toInt()))
    return ((dir shl IOC_DIRSHIFT.toInt()) or (ty shl IOC_TYPESHIFT.toInt()) or (nr shl IOC_NRSHIFT.toInt()) or ((size.toUInt()) shl IOC_SIZESHIFT.toInt())).toULong()
}

/**
 * Build an ioctl number for an argumentless ioctl.
 */
public fun io(ty: UInt, nr: UInt): Ioctl = ioc(IOC_NONE, ty, nr, 0)

/**
 * Build an ioctl number for an read-only ioctl.
 */
public fun <T> ior(ty: UInt, nr: UInt, typeLayoutT: TypeLayout<T>): Ioctl = ioc(IOC_READ, ty, nr, sizeOf<T>(typeLayoutT = typeLayoutT))

/**
 * Build an ioctl number for an write-only ioctl.
 */
public fun <T> iow(ty: UInt, nr: UInt, typeLayoutT: TypeLayout<T>): Ioctl = ioc(IOC_WRITE, ty, nr, sizeOf<T>(typeLayoutT = typeLayoutT))

/**
 * Build an ioctl number for a read-write ioctl.
 */
public fun <T> iowr(ty: UInt, nr: UInt, typeLayoutT: TypeLayout<T>): Ioctl = ioc(IOC_READ or IOC_WRITE, ty, nr, sizeOf<T>(typeLayoutT = typeLayoutT))

public expect fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt

public fun cmsgAlign(len: Int): Int = (len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1) and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawAddress, ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawMeta)

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0uL
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun sigrtmax(): CInt = libcCurrentSigrtmax()

public fun sigrtmin(): CInt = libcCurrentSigrtmin()

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun wExitcode(ret: CInt, sig: CInt): CInt = (ret shl 8) or sig

public fun wStopcode(sig: CInt): CInt = (sig shl 8) or 0x7f

public fun qcmd(cmd: CInt, type: CInt): CInt = (cmd shl 8) or (type and 0x00ff)

public fun ipoptCopied(o: UByte): UByte = o and IPOPT_COPY

public fun ipoptClass(o: UByte): UByte = o and IPOPT_CLASS_MASK

public fun ipoptNumber(o: UByte): UByte = o and IPOPT_NUMBER_MASK

public fun iptosEcn(x: UByte): UByte = x and IPTOS_ECN_MASK

public fun kernelVersion(a: UInt, b: UInt, c: UInt): UInt =
    ((a shl 16) + (b shl 8)) +
        if (c > 255u) {
            255u
        } else {
            c
        }

public expect fun libcCurrentSigrtmax(): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun acct(filename: ConstPtr): CInt

public expect fun brk(addr: MutPtr): CInt

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun vfork(): PidT

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT

public expect fun loginTty(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun uname(buf: MutPtr): CInt

public expect fun strchrnul(s: ConstPtr, c: CInt): MutPtr

public expect fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT

public expect fun strftimeL(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr, locale: LocaleT): SizeT

public expect fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr, len: SizeT): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fstatfs64(fd: CInt, buf: MutPtr): CInt

public expect fun statvfs64(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatvfs64(fd: CInt, buf: MutPtr): CInt

public expect fun statfs64(path: ConstPtr, buf: MutPtr): CInt

public expect fun creat64(path: ConstPtr, mode: ModeT): CInt

public expect fun fstat64(fildes: CInt, buf: MutPtr): CInt

public expect fun fstatat64(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: ConstPtr, buf: MutPtr): CInt

public expect fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr

public expect fun open64(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun readdir64(dirp: MutPtr): MutPtr

public expect fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt

public expect fun stat64(path: ConstPtr, buf: MutPtr): CInt

public expect fun truncate64(path: ConstPtr, length: Off64T): CInt

public expect fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

// uclibc has separate non-const version of this function
public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT

// uclibc has separate non-const version of this function
public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

public expect fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt
