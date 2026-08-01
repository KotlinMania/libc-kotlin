// port-lint: source unix/linux_like/linux/musl/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.FposT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rlimit64
import io.github.kotlinmania.libc.SsizeT
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.Dirent
import io.github.kotlinmania.libc.Stat
import io.github.kotlinmania.libc.Statfs
import io.github.kotlinmania.libc.Statvfs
import io.github.kotlinmania.libc.unix.creat
import io.github.kotlinmania.libc.unix.fgetpos
import io.github.kotlinmania.libc.unix.fopen
import io.github.kotlinmania.libc.unix.freopen
import io.github.kotlinmania.libc.unix.fseeko
import io.github.kotlinmania.libc.unix.fsetpos
import io.github.kotlinmania.libc.unix.fstat
import io.github.kotlinmania.libc.unix.fstatat
import io.github.kotlinmania.libc.unix.fstatfs
import io.github.kotlinmania.libc.unix.fstatvfs
import io.github.kotlinmania.libc.unix.ftello
import io.github.kotlinmania.libc.unix.ftruncate
import io.github.kotlinmania.libc.unix.getrlimit
import io.github.kotlinmania.libc.unix.lseek
import io.github.kotlinmania.libc.unix.lstat
import io.github.kotlinmania.libc.unix.mmap
import io.github.kotlinmania.libc.unix.pread
import io.github.kotlinmania.libc.unix.pwrite
import io.github.kotlinmania.libc.unix.readdir
import io.github.kotlinmania.libc.unix.readdirR
import io.github.kotlinmania.libc.unix.setrlimit
import io.github.kotlinmania.libc.unix.stat
import io.github.kotlinmania.libc.unix.statfs
import io.github.kotlinmania.libc.unix.statvfs
import io.github.kotlinmania.libc.unix.tmpfile
import io.github.kotlinmania.libc.unix.truncate
import io.github.kotlinmania.libc.unix.linuxlike.preadv
import io.github.kotlinmania.libc.unix.linuxlike.pwritev
import io.github.kotlinmania.libc.unix.linuxlike.posixFadvise
import io.github.kotlinmania.libc.unix.linuxlike.linux.fallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.posixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.sendfile

// In musl, the LFS64 types are identical to their non-64 counterparts.
// These typealiases make the LFS64 wrappers type-compatible with the
// underlying functions.
public typealias Dir = DIR?

/**
 * LFS64 entry points. Each is a thin alias for its non-`64` counterpart.
 *
 * open64 / openat64 are variadic re-exports of open / openat (the `mode`
 * argument is optional), so they have no shim here.
 */

public fun creat64(path: String?, mode: ModeT): CInt = creat(path, mode)

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    fallocate(fd, mode, offset, len)

public fun fgetpos64(stream: FILE?, pos: FposT?): CInt = fgetpos(stream, pos)

public fun fopen64(pathname: String?, mode: String?): FILE? = fopen(pathname, mode)

public fun freopen64(pathname: String?, mode: String?, stream: FILE?): FILE? =
    freopen(pathname, mode, stream)

public fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt = fseeko(stream, offset, whence)

public fun fsetpos64(stream: FILE?, pos: FposT?): CInt = fsetpos(stream, pos)

public fun fstat64(fildes: CInt, buf: Stat?): CInt = fstat(fildes, buf)

public fun fstatat64(fd: CInt, path: String?, buf: Stat?, flag: CInt): CInt = fstatat(fd, path, buf, flag)

public fun fstatfs64(fd: CInt, buf: Statfs?): CInt = fstatfs(fd, buf)

public fun fstatvfs64(fd: CInt, buf: Statvfs?): CInt = fstatvfs(fd, buf)

public fun ftello64(stream: FILE?): Off64T = ftello(stream)

public fun ftruncate64(fd: CInt, length: Off64T): CInt = ftruncate(fd, length)

public fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    getrlimit(resource, rlim?.let { Rlimit(it.rlimCur, it.rlimMax) })

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T = lseek(fd, offset, whence)

public fun lstat64(path: String?, buf: Stat?): CInt = lstat(path, buf)

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
    prlimit(pid, resource, newLimit?.let { Rlimit(it.rlimCur, it.rlimMax) }, oldLimit?.let { Rlimit(it.rlimCur, it.rlimMax) })

public fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    pwrite(fd, buf, count, offset)

public fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: Dir?): Dirent? = readdir(dirp)

public fun readdir64R(dirp: Dir?, entry: Dirent?, result: Dirent?): CInt = readdirR(dirp, entry, result)

public fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    sendfile(outFd, inFd, offset, count)

public fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    setrlimit(resource, rlim?.let { Rlimit(it.rlimCur, it.rlimMax) })

public fun stat64(pathname: String?, statbuf: Stat?): CInt = stat(pathname, statbuf)

public fun statfs64(pathname: String?, buf: Statfs?): CInt = statfs(pathname, buf)

public fun statvfs64(path: String?, buf: Statvfs?): CInt = statvfs(path, buf)

public fun tmpfile64(): FILE? = tmpfile()

public fun truncate64(path: String?, length: Off64T): CInt = truncate(path, length)