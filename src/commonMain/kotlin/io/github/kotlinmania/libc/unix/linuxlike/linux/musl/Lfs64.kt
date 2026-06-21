// port-lint: source unix/linux_like/linux/musl/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * LFS64 entry points. Each is a thin alias for its non-`64` counterpart.
 *
 * open64 / openat64 are variadic re-exports of open / openat (the `mode`
 * argument is optional), so they have no shim here.
 */

public fun creat64(path: String?, mode: ModeT): CInt = creat(path, mode)

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    fallocate(fd, mode, offset, len)

public fun fgetpos64(stream: FILE?, pos: Fpos64T?): CInt = fgetpos(stream, pos)

public fun fopen64(pathname: String?, mode: String?): FILE? = fopen(pathname, mode)

public fun freopen64(pathname: String?, mode: String?, stream: FILE?): FILE? =
    freopen(pathname, mode, stream)

public fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt = fseeko(stream, offset, whence)

public fun fsetpos64(stream: FILE?, pos: Fpos64T?): CInt = fsetpos(stream, pos)

public fun fstat64(fildes: CInt, buf: Stat64?): CInt = fstat(fildes, buf)

public fun fstatat64(fd: CInt, path: String?, buf: Stat64?, flag: CInt): CInt = fstatat(fd, path, buf, flag)

public fun fstatfs64(fd: CInt, buf: Statfs64?): CInt = fstatfs(fd, buf)

public fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt = fstatvfs(fd, buf)

public fun ftello64(stream: FILE?): Off64T = ftello(stream)

public fun ftruncate64(fd: CInt, length: Off64T): CInt = ftruncate(fd, length)

public fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt = getrlimit(resource, rlim)

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T = lseek(fd, offset, whence)

public fun lstat64(path: String?, buf: Stat64?): CInt = lstat(path, buf)

public fun mmap64(
    addr: COpaquePointer?,
    length: ULong,
    prot: CInt,
    flags: CInt,
    fd: CInt,
    offset: Off64T,
): COpaquePointer? = mmap(addr, length, prot, flags, fd, offset)

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advice: CInt): CInt =
    posixFadvise(fd, offset, len, advice)

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt = posixFallocate(fd, offset, len)

public fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    pread(fd, buf, count, offset)

public fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    preadv(fd, iov, iovcnt, offset)

public fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    prlimit(pid, resource, newLimit, oldLimit)

public fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    pwrite(fd, buf, count, offset)

public fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: Dir?): Dirent64? = readdir(dirp)

public fun readdir64R(dirp: Dir?, entry: Dirent64?, result: Dirent64?): CInt = readdirR(dirp, entry, result)

public fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    sendfile(outFd, inFd, offset, count)

public fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt = setrlimit(resource, rlim)

public fun stat64(pathname: String?, statbuf: Stat64?): CInt = stat(pathname, statbuf)

public fun statfs64(pathname: String?, buf: Statfs64?): CInt = statfs(pathname, buf)

public fun statvfs64(path: String?, buf: Statvfs64?): CInt = statvfs(path, buf)

public fun tmpfile64(): FILE? = tmpfile()

public fun truncate64(path: String?, length: Off64T): CInt = truncate(path, length)
