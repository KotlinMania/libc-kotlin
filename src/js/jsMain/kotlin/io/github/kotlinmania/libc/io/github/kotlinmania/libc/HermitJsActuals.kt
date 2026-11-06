package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alloc(size, align)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').allocZeroed(size, align)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(ptr?.value ?: 0L, size, align, newSize)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    js("require('@kotlinmania/libc-native-bindings').dealloc(ptr?.value ?: 0L, size, align)")
}

public actual fun exit(status: Int): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(status)") as Nothing

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun errno(): Int =
    js("require('@kotlinmania/libc-native-bindings').errno()") as Int

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockid, tp?.toLong() ?: 0L)") as Int

public actual fun nanosleep(req: Timespec?): Int =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(req?.toLong() ?: 0L)") as Int

public actual fun availableParallelism(): ULong =
    js("require('@kotlinmania/libc-native-bindings').availableParallelism()") as ULong

public actual fun futexWait(address: UInt?, expected: UInt, timeout: Timespec?, flags: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').futexWait(address?.toLong() ?: 0L, expected, timeout?.toLong() ?: 0L, flags)") as Int

public actual fun futexWake(address: UInt?, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').futexWake(address?.toLong() ?: 0L, count)") as Int

public actual fun stat(path: String?, stat: Stat?): Int =
    js("require('@kotlinmania/libc-native-bindings').stat(path, stat?.toLong() ?: 0L)") as Int

public actual fun fstat(fd: Int, stat: Stat?): Int =
    js("require('@kotlinmania/libc-native-bindings').fstat(fd, stat?.toLong() ?: 0L)") as Int

public actual fun lstat(path: String?, stat: Stat?): Int =
    js("require('@kotlinmania/libc-native-bindings').lstat(path, stat?.toLong() ?: 0L)") as Int

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    js("require('@kotlinmania/libc-native-bindings').open(path, flags, mode)") as Int

public actual fun unlink(path: String?): Int =
    js("require('@kotlinmania/libc-native-bindings').unlink(path)") as Int

public actual fun mkdir(path: String?, mode: ModeT): Int =
    js("require('@kotlinmania/libc-native-bindings').mkdir(path, mode)") as Int

public actual fun rmdir(path: String?): Int =
    js("require('@kotlinmania/libc-native-bindings').rmdir(path)") as Int

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').read(fd, buf?.value ?: 0L, len)") as Long

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, len)") as Long

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as Long

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as Long

public actual fun close(fd: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as Int

public actual fun dup(fd: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').dup(fd)") as Int

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').fcntl(fd, cmd, arg)") as Int

public actual fun getdents64(fd: Int, dirp: Dirent64?, count: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').getdents64(fd, dirp?.toLong() ?: 0L, count)") as Long

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').getaddrinfo(nodename, servname, hints?.toLong() ?: 0L, res?.value ?: 0L)") as Int

public actual fun freeaddrinfo(ai: Addrinfo?) {
    js("require('@kotlinmania/libc-native-bindings').freeaddrinfo(ai?.toLong() ?: 0L)")
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').socket(domain, ty, protocol)") as Int

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').bind(sockfd, addr?.toLong() ?: 0L, addrlen)") as Int

public actual fun listen(sockfd: Int, backlog: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').listen(sockfd, backlog)") as Int

public actual fun accept(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').accept(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Int

public actual fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').connect(sockfd, addr?.toLong() ?: 0L, addrlen)") as Int

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    js("require('@kotlinmania/libc-native-bindings').recv(sockfd, buf?.value ?: 0L, len, flags)") as Long

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(sockfd, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Long

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    js("require('@kotlinmania/libc-native-bindings').send(sockfd, buf?.value ?: 0L, len, flags)") as Long

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, tolen: SocklenT): Long =
    js("require('@kotlinmania/libc-native-bindings').sendto(sockfd, buf?.value ?: 0L, len, flags, to?.toLong() ?: 0L, tolen)") as Long

public actual fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').getpeername(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Int

public actual fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').getsockname(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Int

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)") as Int

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').setsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen)") as Int

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').ioctl(sockfd, cmd, argp?.value ?: 0L)") as Int

public actual fun shutdown(sockfd: Int, how: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').shutdown(sockfd, how)") as Int

public actual fun eventfd(initval: ULong, flags: Short): Int =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as Int

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').poll(fds?.toLong() ?: 0L, nfds, timeout)") as Int
