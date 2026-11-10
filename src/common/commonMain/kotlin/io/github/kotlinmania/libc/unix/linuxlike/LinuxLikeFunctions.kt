package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
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
public fun io(ty: UInt, nr: UInt): Ioctl {
    return ioc(IOC_NONE, ty, nr, 0)
}

/**
 * Build an ioctl number for an read-only ioctl.
 */
public fun <T> ior(ty: UInt, nr: UInt): Ioctl {
    return ioc(IOC_READ, ty, nr, 8)
}

/**
 * Build an ioctl number for an write-only ioctl.
 */
public fun <T> iow(ty: UInt, nr: UInt): Ioctl {
    return ioc(IOC_WRITE, ty, nr, 8)
}

/**
 * Build an ioctl number for a read-write ioctl.
 */
public fun <T> iowr(ty: UInt, nr: UInt): Ioctl {
    return ioc(IOC_READ or IOC_WRITE, ty, nr, 8)
}

public expect fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt

public fun cmsgAlign(len: Int): Int {
    return (len + 8 - 1) and (8 - 1).inv()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= 8) {
        ((mhdr.msgControl as Any?) as Cmsghdr?)
    } else {
        null
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return COpaquePointer((cmsg).hashCode().toLong() + 1.toLong())
}

public fun cmsgSpace(length: CUint): CUint {
    return (cmsgAlign(length.toInt()) + cmsgAlign(8)).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return cmsgAlign(8).toUInt() + length
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0uL
    }
}

public fun sigrtmax(): CInt {
    return libcCurrentSigrtmax()
}

public fun sigrtmin(): CInt {
    return libcCurrentSigrtmin()
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 0x7f
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifcontinued(status: CInt): Boolean {
    return status == 0xffff
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0x7f) + 1).toByte() >= 2.toByte()
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7f
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0x7f) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x80) != 0
}

public fun wExitcode(ret: CInt, sig: CInt): CInt {
    return (ret shl 8) or sig
}

public fun wStopcode(sig: CInt): CInt {
    return (sig shl 8) or 0x7f
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public fun ipoptCopied(o: UByte): UByte {
    return o and IPOPT_COPY
}

public fun ipoptClass(o: UByte): UByte {
    return o and IPOPT_CLASS_MASK
}

public fun ipoptNumber(o: UByte): UByte {
    return o and IPOPT_NUMBER_MASK
}

public fun iptosEcn(x: UByte): UByte {
    return x and IPTOS_ECN_MASK
}

public fun kernelVersion(a: UInt, b: UInt, c: UInt): UInt {
    return ((a shl 16) + (b shl 8)) + if (c > 255u) {
        255u
    } else {
        c
    }
}

public expect fun libcCurrentSigrtmax(): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt

public expect fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt

public expect fun acct(filename: String?): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun vfork(): PidT

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT

public expect fun loginTty(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun strchrnul(s: String?, c: CInt): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT

public expect fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT

public expect fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer?

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt

public expect fun statvfs64(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt

public expect fun statfs64(path: String?, buf: COpaquePointer?): CInt

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt

public expect fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: String?, buf: COpaquePointer?): CInt

public expect fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer?

public expect fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun readdir64(dirp: DIR?): COpaquePointer?

public expect fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt

public expect fun stat64(path: String?, buf: COpaquePointer?): CInt

public expect fun truncate64(path: String?, length: Off64T): CInt

public expect fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT

// uclibc has separate non-const version of this function
public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

// uclibc has separate non-const version of this function
public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt
