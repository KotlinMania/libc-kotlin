package io.github.kotlinmania.libc.internal

internal object LibcJni {
    init {
        try {
            System.loadLibrary("libc_jni")
        } catch (_: UnsatisfiedLinkError) {
            // Library not in java.library.path
        }
    }

    // --- Sockets ---

    @JvmStatic
    external fun socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun bind(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun connect(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun listen(fd: Int, backlog: Int): Int

    @JvmStatic
    external fun accept(fd: Int, addr: ByteArray?, addrlen: IntArray?): Int

    @JvmStatic
    external fun getsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: IntArray): Int

    @JvmStatic
    external fun setsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: Int): Int

    @JvmStatic
    external fun getsockname(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun getpeername(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun send(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun recv(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun sendto(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: Int): Long

    @JvmStatic
    external fun recvfrom(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: IntArray?): Long

    @JvmStatic
    external fun shutdown(fd: Int, how: Int): Int

    @JvmStatic
    external fun socketpair(domain: Int, type: Int, protocol: Int, sv: IntArray): Int

    // --- Polling & Select ---

    @JvmStatic
    external fun poll(fds: IntArray, events: ShortArray, revents: ShortArray, nfds: Int, timeout: Int): Int

    @JvmStatic
    external fun select(nfds: Int, readfds: IntArray?, writefds: IntArray?, exceptfds: IntArray?, timeoutSec: Long, timeoutUsec: Long): Int

    // --- Terminal Control & Window Sizing ---

    @JvmStatic
    external fun ioctl(fd: Int, request: Long, argp: ByteArray?): Int

    @JvmStatic
    external fun ioctlTiocgwinsz(fd: Int, winsize: ShortArray): Int

    @JvmStatic
    external fun tcgetattr(fd: Int, termios: ByteArray): Int

    @JvmStatic
    external fun tcsetattr(fd: Int, optionalActions: Int, termios: ByteArray): Int

    @JvmStatic
    external fun cfmakeraw(termios: ByteArray)

    // --- UDS, Memory Locking & Process Syscalls ---

    @JvmStatic
    external fun getpeereid(sockfd: Int, creds: IntArray): Int

    @JvmStatic
    external fun mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun sysconf(name: Int): Long

    @JvmStatic
    external fun getpid(): Int

    @JvmStatic
    external fun getppid(): Int

    @JvmStatic
    external fun geteuid(): Int

    @JvmStatic
    external fun getegid(): Int

    @JvmStatic
    external fun getuid(): Int

    @JvmStatic
    external fun getgid(): Int

    @JvmStatic
    external fun kill(pid: Int, sig: Int): Int
}
