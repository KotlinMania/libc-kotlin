@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun libcCurrentSigrtmax(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun libcCurrentSigrtmin(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freelocale(loc: LocaleT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vfork(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeifaddrs(ifa: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uname(buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ifNameindex(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ifFreenameindex(ptr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun truncate64(path: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
