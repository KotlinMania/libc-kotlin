// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.WasiLibcEnv

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on WASI — no C library access")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")

public actual fun sIGRTMAX(): Int =
    throw UnsupportedOperationException("sIGRTMAX not available on WASI — no C library access")

public actual fun sIGRTMIN(): Int =
    throw UnsupportedOperationException("sIGRTMIN not available on WASI — no C library access")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun libcCurrentSigrtmax(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmax not available on WASI — no C library access")

public actual fun libcCurrentSigrtmin(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmin not available on WASI — no C library access")

public actual fun semDestroy(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semDestroy not available on WASI — no C library access")

public actual fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on WASI — no C library access")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on WASI — no C library access")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): Int =
    throw UnsupportedOperationException("mincore not available on WASI — no C library access")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on WASI — no C library access")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on WASI — no C library access")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun setgroups(ngroups: ULong, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on WASI — no C library access")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on WASI — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on WASI — no C library access")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on WASI — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on WASI — no C library access")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat not available on WASI — no C library access")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR not available on WASI — no C library access")

public actual fun clearenv(): Int =
    WasiLibcEnv.clearenv()

public actual fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on WASI — no C library access")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid not available on WASI — no C library access")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid not available on WASI — no C library access")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on WASI — no C library access")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk not available on WASI — no C library access")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on WASI — no C library access")

public actual fun vfork(): Int =
    throw UnsupportedOperationException("vfork not available on WASI — no C library access")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid not available on WASI — no C library access")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid not available on WASI — no C library access")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on WASI — no C library access")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): Int =
    WasiLibcEnv.uname(buf)

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul not available on WASI — no C library access")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL not available on WASI — no C library access")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on WASI — no C library access")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname not available on WASI — no C library access")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    WasiLibcEnv.getpwnamR(name, pwd, buflen, result)

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    WasiLibcEnv.getpwuidR(uid, pwd, buflen, result)

public actual fun fstatfs64(fd: Int, buf: Statfs64?): Int =
    throw UnsupportedOperationException("fstatfs64 not available on WASI — no C library access")

public actual fun statvfs64(path: String?, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("statvfs64 not available on WASI — no C library access")

public actual fun fstatvfs64(fd: Int, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("fstatvfs64 not available on WASI — no C library access")

public actual fun statfs64(path: String?, buf: Statfs64?): Int =
    throw UnsupportedOperationException("statfs64 not available on WASI — no C library access")

public actual fun creat64(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat64 not available on WASI — no C library access")

public actual fun fstatat64(dirfd: Int, pathname: String?, buf: Stat64?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat64 not available on WASI — no C library access")

public actual fun ftruncate64(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate64 not available on WASI — no C library access")

public actual fun lseek64(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek64 not available on WASI — no C library access")

public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 not available on WASI — no C library access")

public actual fun openat64(fd: Int, path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat64 not available on WASI — no C library access")

public actual fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise64 not available on WASI — no C library access")

public actual fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread64 not available on WASI — no C library access")

public actual fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite64 not available on WASI — no C library access")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 not available on WASI — no C library access")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdir64R not available on WASI — no C library access")

public actual fun truncate64(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate64 not available on WASI — no C library access")

public actual fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv64 not available on WASI — no C library access")

public actual fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev64 not available on WASI — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun statx(dirfd: Int, pathname: String?, flags: Int, mask: UInt, statxbuf: Statx?): Int =
    throw UnsupportedOperationException("statx not available on WASI — no C library access")

public actual fun fstat64(fildes: Int, buf: Stat64?): Int =
    throw UnsupportedOperationException("fstat64 not available on WASI — no C library access")

public actual fun lstat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("lstat64 not available on WASI — no C library access")

public actual fun open64(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open64 not available on WASI — no C library access")

public actual fun stat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("stat64 not available on WASI — no C library access")
