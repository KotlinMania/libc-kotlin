// port-lint: source unix/linux_like/emscripten/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.Dirent64
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.Fpos64T
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.Rlimit64
import io.github.kotlinmania.libc.Stat64
import io.github.kotlinmania.libc.Statfs64
import io.github.kotlinmania.libc.Statvfs64
import io.github.kotlinmania.libc.creat
import io.github.kotlinmania.libc.fgetpos
import io.github.kotlinmania.libc.fopen
import io.github.kotlinmania.libc.freopen
import io.github.kotlinmania.libc.fseeko
import io.github.kotlinmania.libc.fsetpos
import io.github.kotlinmania.libc.fstat
import io.github.kotlinmania.libc.fstatat
import io.github.kotlinmania.libc.fstatfs
import io.github.kotlinmania.libc.fstatvfs
import io.github.kotlinmania.libc.ftello
import io.github.kotlinmania.libc.ftruncate
import io.github.kotlinmania.libc.getrlimit
import io.github.kotlinmania.libc.lseek
import io.github.kotlinmania.libc.lstat
import io.github.kotlinmania.libc.mmap
import io.github.kotlinmania.libc.posixFadvise
import io.github.kotlinmania.libc.posixFallocate
import io.github.kotlinmania.libc.pread
import io.github.kotlinmania.libc.preadv
import io.github.kotlinmania.libc.pwrite
import io.github.kotlinmania.libc.pwritev
import io.github.kotlinmania.libc.readdir
import io.github.kotlinmania.libc.readdirR
import io.github.kotlinmania.libc.setrlimit
import io.github.kotlinmania.libc.stat
import io.github.kotlinmania.libc.statfs
import io.github.kotlinmania.libc.statvfs
import io.github.kotlinmania.libc.tmpfile
import io.github.kotlinmania.libc.truncate

// In-sync with ../linux/musl/lfs64.rs except for fallocate64, prlimit64 and sendfile64
public fun creat64(path: COpaquePointer?, mode: ModeT): CInt {
    return creat(path, mode)
}

public fun fgetpos64(stream: FILE?, pos: Fpos64T?): CInt {
    return fgetpos(stream, (pos)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun fopen64(pathname: COpaquePointer?, mode: COpaquePointer?): FILE? {
    return fopen(pathname, mode)
}

public fun freopen64(pathname: COpaquePointer?, mode: COpaquePointer?, stream: FILE?): FILE? {
    return freopen(pathname, mode, stream)
}

public fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt {
    return fseeko(stream, offset, whence)
}

public fun fsetpos64(stream: FILE?, pos: Fpos64T?): CInt {
    return fsetpos(stream, (pos)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun fstat64(fildes: CInt, buf: Stat64?): CInt {
    return fstat(fildes, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun fstatat64(fd: CInt, path: COpaquePointer?, buf: Stat64?, flag: CInt): CInt {
    return fstatat(fd, path, (buf)?.let { COpaquePointer(it.hashCode().toLong()) }, flag)
}

public fun fstatfs64(fd: CInt, buf: Statfs64?): CInt {
    return fstatfs(fd, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt {
    return fstatvfs(fd, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun ftello64(stream: FILE?): Off64T {
    return ftello(stream)
}

public fun ftruncate64(fd: CInt, length: Off64T): CInt {
    return ftruncate(fd, length)
}

public fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt {
    return getrlimit(resource, (rlim)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T {
    return lseek(fd, offset, whence)
}

public fun lstat64(path: COpaquePointer?, buf: Stat64?): CInt {
    return lstat(path, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun mmap64(addr: COpaquePointer?, length: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? {
    return mmap(addr, length, prot, flags, fd, offset)
}

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advice: CInt): CInt {
    return posixFadvise(fd, offset, len, advice)
}

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt {
    return posixFallocate(fd, offset, len)
}

public fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return pread(fd, buf, count, offset)
}

public fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return preadv(fd, iov, iovcnt, offset)
}

public fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return pwrite(fd, buf, count, offset)
}

public fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return pwritev(fd, iov, iovcnt, offset)
}

public fun readdir64(dirp: DIR?): Dirent64? {
    return (readdir(dirp) as COpaquePointer?)
}

public fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt {
    return readdirR(dirp, (entry)?.let { COpaquePointer(it.hashCode().toLong()) }, result)
}

public fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt {
    return setrlimit(resource, (rlim)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun stat64(pathname: COpaquePointer?, statbuf: Stat64?): CInt {
    return stat(pathname, (statbuf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun statfs64(pathname: COpaquePointer?, buf: Statfs64?): CInt {
    return statfs(pathname, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun statvfs64(path: COpaquePointer?, buf: Statvfs64?): CInt {
    return statvfs(path, (buf)?.let { COpaquePointer(it.hashCode().toLong()) })
}

public fun tmpfile64(): FILE? {
    return tmpfile()
}

public fun truncate64(path: COpaquePointer?, length: Off64T): CInt {
    return truncate(path, length)
}
