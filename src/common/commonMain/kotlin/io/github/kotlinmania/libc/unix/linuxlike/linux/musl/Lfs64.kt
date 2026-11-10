// port-lint: source unix/linux_like/linux/musl/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
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
import io.github.kotlinmania.libc.unix.linuxlike.fstatfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.fallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.posixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.sendfile
import io.github.kotlinmania.libc.unix.linuxlike.posixFadvise
import io.github.kotlinmania.libc.unix.linuxlike.preadv
import io.github.kotlinmania.libc.unix.linuxlike.pwritev
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

public fun creat64(path: String?, mode: ModeT): CInt = creat(path, mode)

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt = fallocate(fd, mode, offset, len)

public fun fgetpos64(stream: FILE?, pos: COpaquePointer?): CInt = fgetpos(stream, pos)

public fun fopen64(pathname: String?, mode: String?): FILE? = fopen(pathname, mode)

public fun freopen64(pathname: String?, mode: String?, stream: FILE?): FILE? = freopen(pathname, mode, stream)

public fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt = fseeko(stream, offset, whence)

public fun fsetpos64(stream: FILE?, pos: COpaquePointer?): CInt = fsetpos(stream, pos)

public fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt = fstat(fildes, buf)

public fun fstatat64(fd: CInt, path: String?, buf: COpaquePointer?, flag: CInt): CInt = fstatat(fd, path, buf, flag)

public fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt = fstatfs(fd, buf)

public fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt = fstatvfs(fd, buf)

public fun ftello64(stream: FILE?): Off64T = ftello(stream)

public fun ftruncate64(fd: CInt, length: Off64T): CInt = ftruncate(fd, length)

public fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt = getrlimit(resource, rlim)

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T = lseek(fd, offset, whence)

public fun lstat64(path: String?, buf: COpaquePointer?): CInt = lstat(path, buf)

public fun mmap64(addr: COpaquePointer?, length: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? = mmap(addr, length, prot, flags, fd, offset)

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advice: CInt): CInt = posixFadvise(fd, offset, len, advice)

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt = posixFallocate(fd, offset, len)

public fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT = pread(fd, buf, count, offset)

public fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT = preadv(fd, iov, iovcnt, offset)

public fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt = prlimit(pid, resource, newLimit, oldLimit)

public fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT = pwrite(fd, buf, count, offset)

public fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT = pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: DIR?): COpaquePointer? = readdir(dirp)

public fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt = readdirR(dirp, entry, result)

public fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT = sendfile(outFd, inFd, offset, count)

public fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt = setrlimit(resource, rlim)

public fun stat64(pathname: String?, statbuf: COpaquePointer?): CInt = stat(pathname, statbuf)

public fun statfs64(pathname: String?, buf: COpaquePointer?): CInt = statfs(pathname, buf)

public fun statvfs64(path: String?, buf: COpaquePointer?): CInt = statvfs(path, buf)

public fun tmpfile64(): FILE? = tmpfile()

public fun truncate64(path: String?, length: Off64T): CInt = truncate(path, length)
