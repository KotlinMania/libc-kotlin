@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.SizeT

private val _unixHurdNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_futimes(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mkfifoat(fd, path, mode.toInt()) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) as Int) else 0

public actual fun libcCurrentSigrtmin(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_libcCurrentSigrtmin() as Int) else 0

public actual fun libcCurrentSigrtmax(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_libcCurrentSigrtmax() as Int) else 0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else 0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else 0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun ioctl(fd: CInt, request: CUlong): CInt =
    0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dup3(oldfd, newfd, flags) as Int) else 0

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pread64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pwrite64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0

public actual fun readv(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_readv(fd, (iovec?.value ?: 0L).toString(), count) as String).toLong() else 0

public actual fun writev(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_writev(fd, (iovec?.value ?: 0L).toString(), count) as String).toLong() else 0

public actual fun preadv(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_preadv(fd, (iovec?.value ?: 0L).toString(), count, offset.toString()) as String).toLong() else 0

public actual fun pwritev(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pwritev(fd, (iovec?.value ?: 0L).toString(), count, offset.toString()) as String).toLong() else 0

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_preadv64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pwritev64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioError((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else 0

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else 0

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqClose(mqd.toLong().toString()) as Int) else 0

public actual fun mqUnlink(name: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqUnlink(name) as Int) else 0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else 0

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else 0

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else 0

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else 0

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lseek64(fd, offset.toString(), whence) as String).toLong() else 0L

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lseek(fd, offset.toString(), whence) as String).toLong() else 0L

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fgetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fseeko64((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fsetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun ftello64(stream: FILE?): Off64T =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ftello64((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) as Int) else 0

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) as Int) else 0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun recvmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_recvmsg(fd, (message?.value ?: 0L).toString(), flags) as String).toLong() else 0

public actual fun sendmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sendmsg(fd, (message?.value ?: 0L).toString(), flags) as String).toLong() else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_shutdown(fd, how) as Int) else 0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sethostname(name, len.toString()) as Int) else 0

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setdomainname(name, len.toString()) as Int) else 0

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_ifFreenameindex((ptr?.value ?: 0L).toString())
    }
}

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else 0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_freeifaddrs((ifa?.value ?: 0L).toString())
    }
}

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun gethostid(): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_gethostid() as String).toLong() else 0L

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sethostid(hostid.toString()) as Int) else 0

public actual fun setpwent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_endpwent()
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgrent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_setgrent()
    }
}

public actual fun endgrent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setspent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_setspent()
    }
}

public actual fun endspent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_endspent()
    }
}

public actual fun getspent(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getspent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getspnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fgetpwentR((stream?.handle ?: 0L).toString(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fgetgrentR((stream?.handle ?: 0L).toString(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_putpwent((p?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_putgrent((grp?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fgetspentR((fp?.handle ?: 0L).toString(), (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else 0

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sgetspentR(s, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else 0

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getspentR((spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else 0

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getspnamR(name, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else 0

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getmntentR((stream?.handle ?: 0L).toString(), (mntbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun utmpname(file: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_utmpname(file) as Int) else 0

public actual fun utmpxname(file: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_utmpxname(file) as Int) else 0

public actual fun getutxent(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutxent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_setutxent()
    }
}

public actual fun endutxent() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_endutxent()
    }
}

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else 0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else 0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else 0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else 0

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_initgroups(user, group.toInt()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setgroups(ngroups.toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun acct(filename: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_acct(filename) as Int) else 0

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setmntent(filename, ty) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getmntent((stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_addmntent((stream?.handle ?: 0L).toString(), (mnt?.value ?: 0L).toString()) as Int) else 0

public actual fun endmntent(streamp: FILE?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_endmntent((streamp?.handle ?: 0L).toString()) as Int) else 0

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_hasmntopt((mnt?.value ?: 0L).toString(), opt) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadKill(threadid.toString(), signo) as Int) else 0

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCancel(thread.toString()) as Int) else 0

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadEqual(t1.toString(), t2.toString()) as Int) else 0

public actual fun pthreadGetattrNp(thr: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadGetattrNp(thr.toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadOnceRoutineCallback): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadOnce((control?.value ?: 0L).toString(), 0L.toString()) as Int) else 0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) as Int) else 0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadBarrierWait((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, newmask: COpaquePointer?, oldmask: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSigmask(how, (newmask?.value ?: 0L).toString(), (oldmask?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_schedGetscheduler(pid) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadGetschedparam(native.toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadSetschedparam(native.toString(), policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_pthreadGetcpuclockid(thread.toString(), (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clockGetres(clockId, (res?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clockGettime(clockId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clockSettime(clockId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_timerCreate(clockid, (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else 0

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_timerDelete(timerid.toLong().toString()) as Int) else 0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_timerGetoverrun(timerid.toLong().toString()) as Int) else 0

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_timerGettime(timerid.toLong().toString(), (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_timerSettime(timerid.toLong().toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun fstat(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstat(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstat64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstat64(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatat(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatat(fd, file, (buf?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun fstatat64(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatat64(fd, file, (buf?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_statx(dirfd, pathname, flags, mask.toInt(), (statxbuf?.value ?: 0L).toString()) as Int) else 0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ftruncate(fd, length.toString()) as Int) else 0

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ftruncate64(fd, length.toString()) as Int) else 0

public actual fun truncate64(file: String?, length: Off64T): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_truncate64(file, length.toString()) as Int) else 0

public actual fun lstat(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lstat(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun lstat64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lstat64(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_statfs(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun statfs64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_statfs64(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatfs64(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun statvfs(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_statvfs(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun statvfs64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_statvfs64(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatvfs(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatvfs(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatvfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fstatvfs64(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun open(file: String?, oflag: CInt): CInt =
    0

public actual fun open64(file: String?, oflag: CInt): CInt =
    0

public actual fun openat(fd: CInt, file: String?, oflag: CInt): CInt =
    0

public actual fun openat64(fd: CInt, file: String?, oflag: CInt): CInt =
    0

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fopen64(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_freopen64(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun creat64(path: String?, mode: ModeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_creat64(path, mode.toInt()) as Int) else 0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else 0

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun tmpfile64(): FILE? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_tmpfile64() as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun getdtablesize(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getdtablesize() as Int) else 0

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_closeRange(first.toInt(), last.toInt(), flags) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun getpt(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpt() as Int) else 0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun loginTty(fd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_loginTty(fd) as Int) else 0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun clearenv(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_clearenv() as Int) else 0

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_execveat(dirfd, pathname, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_daemon(nochdir, noclose) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) as Int) else 0

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L).toString(), from) as Int) else 0

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L).toString(), tcfd) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_shmUnlink(name) as Int) else 0

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_euidaccess(pathname, mode) as Int) else 0

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_eaccess(pathname, mode) as Int) else 0

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun stat(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_stat(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun stat64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_stat64(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_readdir((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_readdir64((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_readdir64R((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mmap64((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt): COpaquePointer? =
    null

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun sync() {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_sync()
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_syncfs(fd) as Int) else 0

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fdatasync(fd) as Int) else 0

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fallocate64(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixFallocate64(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getpriority(which.toInt(), who.toInt()) as Int) else 0

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setpriority(which.toInt(), who.toInt(), prio) as Int) else 0

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getrandom((buffer?.value ?: 0L).toString(), length.toString(), flags.toInt()) as String).toLong() else 0

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getentropy((buffer?.value ?: 0L).toString(), length.toString()) as Int) else 0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_strchrnul(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun abs(i: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_srand(seed.toInt())
    }
}

public actual fun drand48(): CDouble =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_drand48() as Double) else 0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_erand48((xseed?.value ?: 0L).toString()) as Double) else 0.0

public actual fun lrand48(): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lrand48() as String).toLong() else 0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mrand48(): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mrand48() as String).toLong() else 0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun srand48(seed: CLong) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_srand48(seed.toString())
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_lcong48((p?.value ?: 0L).toString())
    }
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    }
}

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_brk((addr?.value ?: 0L).toString()) as Int) else 0

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mallopt(param, value) as Int) else 0

public actual fun mallinfo(): Mallinfo =
    null as Mallinfo

public actual fun mallinfo2(): Mallinfo2 =
    null as Mallinfo2

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mallocInfo(options, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun mallocTrim(pad: SizeT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_mallocTrim(pad.toString()) as Int) else 0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_iconvOpen(tocode, fromcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_iconvClose((cd?.value ?: 0L).toString()) as Int) else 0

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else 0

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_backtrace((buf?.value ?: 0L).toString(), sz) as Int) else 0

public actual fun reboot(howTo: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_reboot(howTo) as Int) else 0

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else 0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else 0uL

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_regfree((preg?.value ?: 0L).toString())
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_globfree64((pglob?.value ?: 0L).toString())
    }
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) as Int) else 0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_listxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_removexattr(path, name) as Int) else 0

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_lremovexattr(path, name) as Int) else 0

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_fremovexattr(filedes, name) as Int) else 0

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_posixBasename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gnuBasename(path: String?): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_gnuBasename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dlmopen(lmid.toString(), filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dlinfo((handle?.value ?: 0L).toString(), request, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dladdr1((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (extraInfo?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_duplocale(base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun freelocale(loc: LocaleT) {
    if (_unixHurdNapiAddon != null) {
        _unixHurdNapiAddon.libc_unix_hurd_freelocale(loc.toLong().toString())
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_newlocale(mask, locale, base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_uselocale(loc.toLong().toString()) as String).toLong().toULong()() else null

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_nlLanginfoL(item, locale.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_gnuGetLibcRelease() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    if (_unixHurdNapiAddon != null) (_unixHurdNapiAddon.libc_unix_hurd_gnuGetLibcVersion() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null
