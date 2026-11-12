// port-lint: source unix/linux_like/linux/musl/lfs64.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Iovec
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
import io.github.kotlinmania.libc.unix.linuxlike.Dirent64
import io.github.kotlinmania.libc.unix.linuxlike.Fpos64T
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.fstatfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.fallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.aarch64.Stat64
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt = creat(path, mode)

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt = fallocate(fd, mode, offset, len)

public fun fgetpos64(stream: MutPtr<FILE>, pos: MutPtr<Fpos64T>): CInt = fgetpos(stream, pos)

public fun fopen64(pathname: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> = fopen(pathname, mode)

public fun freopen64(pathname: ConstPtr<CChar>, mode: ConstPtr<CChar>, stream: MutPtr<FILE>): MutPtr<FILE> = freopen(pathname, mode, stream)

public fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt = fseeko(stream, offset, whence)

public fun fsetpos64(stream: MutPtr<FILE>, pos: ConstPtr<Fpos64T>): CInt = fsetpos(stream, MutPtr<Fpos64T>(pos.rawAddress, pos.rawMeta))

public fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt = fstat(fildes, buf)

public fun fstatat64(fd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flag: CInt): CInt = fstatat(fd, path, buf, flag)

public fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt = fstatfs(fd, buf)

public fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt = fstatvfs(fd, buf)

public fun ftello64(stream: MutPtr<FILE>): Off64T = ftello(stream)

public fun ftruncate64(fd: CInt, length: Off64T): CInt = ftruncate(fd, length)

public fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt = getrlimit(resource, rlim)

public fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T = lseek(fd, offset, whence)

public fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt = lstat(path, buf)

public fun mmap64(addr: MutPtr<CVoid>, length: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> = mmap(addr, length, prot, flags, fd, offset)

public fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advice: CInt): CInt = posixFadvise(fd, offset, len, advice)

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt = posixFallocate(fd, offset, len)

public fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT = pread(fd, buf, count, offset)

public fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT = preadv(fd, iov, iovcnt, offset)

public fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt = prlimit(pid, resource, MutPtr<Rlimit64>(newLimit.rawAddress, newLimit.rawMeta), oldLimit)

public fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT = pwrite(fd, buf, count, offset)

public fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT = pwritev(fd, iov, iovcnt, offset)

public fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> = readdir(dirp)

public fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt = readdirR(dirp, entry, result)

public fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT = sendfile(outFd, inFd, offset, count)

public fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt = setrlimit(resource, MutPtr<Rlimit64>(rlim.rawAddress, rlim.rawMeta))

public fun stat64(pathname: ConstPtr<CChar>, statbuf: MutPtr<Stat64>): CInt = stat(pathname, statbuf)

public fun statfs64(pathname: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt = statfs(pathname, buf)

public fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt = statvfs(path, buf)

public fun tmpfile64(): MutPtr<FILE> = tmpfile()

public fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt = truncate(path, length)
