// port-lint: source unix/linux_like/linux/musl/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun creat64(path: ConstPtr, mode: ModeT): CInt = creat(path, mode)

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt = fallocate(fd, mode, offset, len)

public fun fgetpos64(stream: MutPtr, pos: MutPtr): CInt = fgetpos(stream, MutPtr(pos.rawAddress, pos.rawMeta))

public fun fopen64(pathname: ConstPtr, mode: ConstPtr): MutPtr = fopen(pathname, mode)

public fun freopen64(pathname: ConstPtr, mode: ConstPtr, stream: MutPtr): MutPtr = freopen(pathname, mode, stream)

public fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt = fseeko(stream, offset, whence)

public fun fsetpos64(stream: MutPtr, pos: ConstPtr): CInt = fsetpos(stream, ConstPtr(pos.rawAddress, pos.rawMeta))

public fun fstat64(fildes: CInt, buf: MutPtr): CInt = fstat(fildes, MutPtr(buf.rawAddress, buf.rawMeta))

public fun fstatat64(fd: CInt, path: ConstPtr, buf: MutPtr, flag: CInt): CInt = fstatat(fd, path, MutPtr(buf.rawAddress, buf.rawMeta), flag)

public fun fstatfs64(fd: CInt, buf: MutPtr): CInt = fstatfs(fd, MutPtr(buf.rawAddress, buf.rawMeta))

public fun fstatvfs64(fd: CInt, buf: MutPtr): CInt = fstatvfs(fd, MutPtr(buf.rawAddress, buf.rawMeta))

public fun ftello64(stream: MutPtr): Off64T = ftello(stream)

public fun ftruncate64(fd: CInt, length: Off64T): CInt = ftruncate(fd, length)

public fun getrlimit64(resource: CInt, rlim: MutPtr): CInt = getrlimit(resource, MutPtr(rlim.rawAddress, rlim.rawMeta))

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T = lseek(fd, offset, whence)

public fun lstat64(path: ConstPtr, buf: MutPtr): CInt = lstat(path, MutPtr(buf.rawAddress, buf.rawMeta))

public fun mmap64(addr: MutPtr, length: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr = mmap(addr, length, prot, flags, fd, offset)

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advice: CInt): CInt = posixFadvise(fd, offset, len, advice)

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt = posixFallocate(fd, offset, len)

public fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT = pread(fd, buf, count, offset)

public fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT = preadv(fd, iov, iovcnt, offset)

public fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    prlimit(pid, resource, ConstPtr(newLimit.rawAddress, newLimit.rawMeta), MutPtr(oldLimit.rawAddress, oldLimit.rawMeta))

public fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT = pwrite(fd, buf, count, offset)

public fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT = pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: MutPtr): MutPtr {
    val res = readdir(dirp)
    return MutPtr(res.rawAddress, res.rawMeta)
}

public fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    readdirR(dirp, MutPtr(entry.rawAddress, entry.rawMeta), MutPtr(result.rawAddress, result.rawMeta))

public fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT = sendfile(outFd, inFd, offset, count)

public fun setrlimit64(resource: CInt, rlim: ConstPtr): CInt = setrlimit(resource, ConstPtr(rlim.rawAddress, rlim.rawMeta))

public fun stat64(pathname: ConstPtr, statbuf: MutPtr): CInt = stat(pathname, MutPtr(statbuf.rawAddress, statbuf.rawMeta))

public fun statfs64(pathname: ConstPtr, buf: MutPtr): CInt = statfs(pathname, MutPtr(buf.rawAddress, buf.rawMeta))

public fun statvfs64(path: ConstPtr, buf: MutPtr): CInt = statvfs(path, MutPtr(buf.rawAddress, buf.rawMeta))

public fun tmpfile64(): MutPtr = tmpfile()

public fun truncate64(path: ConstPtr, length: Off64T): CInt = truncate(path, length)
