// port-lint: source unix/linux_like/emscripten/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.bsd.apple.Stat
import io.github.kotlinmania.libc.unix.bsd.apple.Statvfs
import io.github.kotlinmania.libc.unix.creat
import io.github.kotlinmania.libc.unix.fgetpos
import io.github.kotlinmania.libc.unix.fopen
import io.github.kotlinmania.libc.unix.freopen
import io.github.kotlinmania.libc.unix.fseeko
import io.github.kotlinmania.libc.unix.fsetpos
import io.github.kotlinmania.libc.unix.fstat
import io.github.kotlinmania.libc.unix.fstatat
import io.github.kotlinmania.libc.unix.fstatvfs
import io.github.kotlinmania.libc.unix.ftello
import io.github.kotlinmania.libc.unix.ftruncate
import io.github.kotlinmania.libc.unix.linuxlike.Dirent
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.fstatfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statfs
import io.github.kotlinmania.libc.unix.linuxlike.posixFadvise
import io.github.kotlinmania.libc.unix.linuxlike.statfs
import io.github.kotlinmania.libc.unix.lseek
import io.github.kotlinmania.libc.unix.lstat
import io.github.kotlinmania.libc.unix.mmap
import io.github.kotlinmania.libc.unix.pread
import io.github.kotlinmania.libc.unix.pwrite
import io.github.kotlinmania.libc.unix.readdir
import io.github.kotlinmania.libc.unix.readdirR
import io.github.kotlinmania.libc.unix.stat
import io.github.kotlinmania.libc.unix.statvfs
import io.github.kotlinmania.libc.unix.tmpfile
import io.github.kotlinmania.libc.unix.truncate

/**
 * LFS64 entry points. Each is a thin alias for its non-64 counterpart.
 *
 * open64 / openat64 are variadic re-exports of open / openat (the `mode`
 * argument is optional), so they have no shim here.
 */

public fun creat64(path: String?, mode: UInt): Int = creat(path, mode)

public fun fgetpos64(stream: FILE?, pos: Long?): Int = fgetpos(stream, pos)

public fun fopen64(pathname: String?, mode: String?): FILE? = fopen(pathname, mode)

public fun freopen64(pathname: String?, mode: String?, stream: FILE?): FILE? =
    freopen(pathname, mode, stream)

public fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int = fseeko(stream, offset, whence)

public fun fsetpos64(stream: FILE?, pos: Long?): Int = fsetpos(stream, pos)

public fun fstat64(fildes: Int, buf: Stat?): Int = fstat(fildes, buf)

public fun fstatat64(fd: Int, path: String?, buf: Stat?, flag: Int): Int = fstatat(fd, path, buf, flag)

public fun fstatfs64(fd: Int, buf: Statfs?): Int = fstatfs(fd, buf)

public fun fstatvfs64(fd: Int, buf: Statvfs?): Int = fstatvfs(fd, buf)

public fun ftello64(stream: FILE?): Long = ftello(stream)

public fun ftruncate64(fd: Int, length: Long): Int = ftruncate(fd, length)

public fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    getrlimit(resource, rlim?.let { Rlimit(0L, it.rlimCur, it.rlimMax) })

public fun lseek64(fd: Int, offset: Long, whence: Int): Long = lseek(fd, offset, whence)

public fun lstat64(path: String?, buf: Stat?): Int = lstat(path, buf)

public fun mmap64(
    addr: COpaquePointer?,
    length: ULong,
    prot: Int,
    flags: Int,
    fd: Int,
    offset: Long,
): COpaquePointer? = mmap(addr, length, prot, flags, fd, offset)

public fun posixFadvise64(fd: Int, offset: Long, len: Long, advice: Int): Int =
    posixFadvise(fd, offset, len, advice)

public fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    posixFallocate(fd, offset, len)

public fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    pread(fd, buf, count, offset)

public fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    preadv(fd, iov, iovcnt, offset)

public fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    pwrite(fd, buf, count, offset)

public fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: DIR?): Dirent? = readdir(dirp)

public fun readdir64R(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int = readdirR(dirp, entry, result)

public fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    setrlimit(resource, rlim?.let { Rlimit(0L, it.rlimCur, it.rlimMax) })

public fun stat64(pathname: String?, statbuf: Stat?): Int = stat(pathname, statbuf)

public fun statfs64(pathname: String?, buf: Statfs?): Int = statfs(pathname, buf)

public fun statvfs64(path: String?, buf: Statvfs?): Int = statvfs(path, buf)

public fun tmpfile64(): FILE? = tmpfile()

public fun truncate64(path: String?, length: Long): Int = truncate(path, length)
