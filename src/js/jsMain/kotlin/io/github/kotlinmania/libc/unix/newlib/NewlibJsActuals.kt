@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT

private val _unixNewlibNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixNewlibNapiAddon != null) {
        _unixNewlibNapiAddon.libc_unix_newlib_srand(seed.toInt())
    }
}

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) as Int) else 0

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_clockSettime(clockId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_clockGettime(clockId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_clockGetres(clockId.toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun closesocket(sockfd: CInt): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_closesocket(sockfd) as Int) else 0

public actual fun ioctl(fd: CInt, request: CUlong): CInt =
    0

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: COpaquePointer?, addrLen: COpaquePointer?): Long =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_recvfrom(fd, (buf?.value ?: 0L).toString(), n.toString(), flags, (addr?.value ?: 0L).toString(), (addrLen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getdtablesize() as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_pthreadKill(thread.toLong().toString(), sig) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_semUnlink(name) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_daemon(nochdir, noclose) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixNewlibNapiAddon != null) (_unixNewlibNapiAddon.libc_unix_newlib_uname((buf?.value ?: 0L).toString()) as Int) else 0
