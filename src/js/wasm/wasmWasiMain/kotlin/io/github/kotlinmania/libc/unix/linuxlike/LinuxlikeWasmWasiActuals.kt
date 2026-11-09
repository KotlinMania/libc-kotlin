@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    0

public actual fun libcCurrentSigrtmax(): CInt =
    0

public actual fun libcCurrentSigrtmin(): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun clearenv(): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    0

public actual fun acct(filename: String?): CInt =
    0

public actual fun brk(addr: COpaquePointer?): CInt =
    0

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    null

public actual fun vfork(): PidT =
    0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    0

public actual fun loginTty(fd: CInt): CInt =
    0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    0uL

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT =
    0uL

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    null

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    0

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    0

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun creat64(path: String?, mode: ModeT): CInt =
    0

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    0

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    0L

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    null

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    0

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    0L

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    0L

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    null

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    0

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun truncate64(path: String?, length: Off64T): CInt =
    0

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    0L

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    0L

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    0
