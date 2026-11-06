@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mkfifoat(fd, path, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mknodat(dirfd, pathname, mode, dev.toInt())

public actual fun libcCurrentSigrtmin(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_libc_current_sigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_libc_current_sigrtmax()

public actual fun wait4(pid: io.github.kotlinmania.libc.PidT, status: CInt?, options: CInt, rusage: Rusage?): io.github.kotlinmania.libc.PidT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun sigwait(set: CUlong?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun readv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_readv(fd, iovec?.value?.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_writev(fd, iovec?.value?.toCPointer<ByteVar>(), count)

public actual fun preadv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_preadv(fd, iovec?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pwritev(fd, iovec?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun preadv64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_preadv64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pwritev64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fread_unlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: io.github.kotlinmania.libc.Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_close(mqd)

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_unlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_receive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_timedreceive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_send(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_timedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_getattr(mqd, attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mq_setattr(mqd, newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lseek(fd, offset, whence)

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ftello64(stream?.handle?.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: Sockaddr?, len: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: CUint?, flg: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_recvmsg(fd, message?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sendmsg(fd, message?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: SquadType?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_shutdown(fd, how)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sethostname(name, len)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setdomainname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sethostid(hostid)

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setspent()
}

public actual fun endspent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_endspent()
}

public actual fun getspent(): Spwd? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspnam(name: String?): Spwd? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrent_r(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: FILE?, pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fgetpwent_r(stream?.handle?.toCPointer<ByteVar>(), pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fgetgrent_r(stream?.handle?.toCPointer<ByteVar>(), grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun putpwent(p: io.github.kotlinmania.libc.Passwd?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_putpwent(p?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_putgrent(grp?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetspentR(fp: FILE?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fgetspent_r(fp?.handle?.toCPointer<ByteVar>(), spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun sgetspentR(s: String?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sgetspent_r(s, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getspent_r(spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getspnam_r(name, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getmntentR(stream: FILE?, mntbuf: io.github.kotlinmania.libc.Mntent?, buf: COpaquePointer?, buflen: CInt): io.github.kotlinmania.libc.Mntent? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getmntent_r(stream?.handle?.toCPointer<ByteVar>(), mntbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_utmpxname(file)

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_endutxent()
}

public actual fun getresuid(ruid: CUint?, euid: CUint?, suid: CUint?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: CUint?, egid: CUint?, sgid: CUint?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setresuid(ruid, euid, suid)

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setresgid(rgid, egid, sgid)

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_initgroups(user, group)

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CUint?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun setgroups(ngroups: SizeT, ptr: CUint?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_acct(filename)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_addmntent(stream?.handle?.toCPointer<ByteVar>(), mnt?.value?.toCPointer<ByteVar>())

public actual fun endmntent(streamp: FILE?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCreate(native: CLong?, attr: PthreadAttr?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(threadid: io.github.kotlinmania.libc.PthreadT, signo: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_kill(threadid, signo)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_cancel(thread)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_equal(t1, t2)

public actual fun pthreadGetattrNp(thr: io.github.kotlinmania.libc.PthreadT, attr: PthreadAttr?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_getattr_np(thr, attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: PthreadAttr?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: PthreadAttr?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: PthreadAttr?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattr?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattr?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexTimedlock(lock: PthreadMutex?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattr?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattr?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattr?, clockId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattr?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattr?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattr?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadOnce(control: PthreadOnce?, routine: PthreadOnceRoutineCallback): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_once(control?.value?.toCPointer<ByteVar>(), routine.toInt())

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattr?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattr?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattr?, shared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattr?, shared: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: PthreadBarrier?, attr: PthreadBarrierattr?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrier?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: PthreadBarrier?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, newmask: CUlong?, oldmask: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_sigmask(how, newmask?.value?.toCPointer<ByteVar>(), oldmask?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sched_getscheduler(pid)

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_getschedparam(native, policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_setschedparam(native, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_pthread_getcpuclockid(thread, clkId?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clock_getres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clock_gettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clock_settime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: io.github.kotlinmania.libc.PidT, clkId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_asctime_r(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ctime_r(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: UwordType?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_timer_create(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_timer_delete(timerid.toInt())

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_timer_getoverrun(timerid.toInt())

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_timer_gettime(timerid.toInt(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_timer_settime(timerid.toInt(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstat(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstat64(fd: CInt, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstat64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatat(fd, file, buf?.value?.toCPointer<ByteVar>(), flag)

public actual fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatat64(fd, file, buf?.value?.toCPointer<ByteVar>(), flag)

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_statx(dirfd, pathname, flags, mask, statxbuf?.value?.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ftruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ftruncate64(fd, length)

public actual fun truncate64(file: String?, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_truncate64(file, length)

public actual fun lstat(file: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lstat(file, buf?.value?.toCPointer<ByteVar>())

public actual fun lstat64(file: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lstat64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(file: String?, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_statfs64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatfs64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs(file: String?, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_statvfs(file, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(file: String?, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_statvfs64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatvfs(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fstatvfs64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun creat64(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_creat64(path, mode)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun tmpfile64(): FILE? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_tmpfile64()?.let { FILE(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_close_range(first, last, flags)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): io.github.kotlinmania.libc.PidT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getpt(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpt()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_login_tty(fd)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_clearenv()

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_execveat(dirfd, pathname, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_daemon(nochdir, noclose)

public actual fun posixSpawn(pid: CInt?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: CInt?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addchdir_np(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addfchdir_np(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, from: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addclosefrom_np(actions?.value?.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_spawn_file_actions_addtcsetpgrp_np(actions?.value?.toCPointer<ByteVar>(), tcfd)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_shm_unlink(name)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_eaccess(pathname, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun stat(file: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_stat(file, buf?.value?.toCPointer<ByteVar>())

public actual fun stat64(file: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_stat64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdir64(dirp: DIR?): io.github.kotlinmania.libc.Dirent64? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_readdir64(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_readdir_r(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readdir64R(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent64?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_readdir64r(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mmap64(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sync() {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_syncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_fallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_fallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_fadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_fadvise64(fd, offset, len, advise)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setpriority(which, who, prio)

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getrandom(buffer?.value?.toCPointer<ByteVar>(), length, flags)

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getentropy(buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_srand(seed)
}

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: CUshort?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallopt(param: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mallopt(param, value)

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mallinfo()

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_mallinfo2()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_malloc_info(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun mallocTrim(pad: SizeT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_malloc_trim(pad)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_iconv_close(cd?.value?.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun reboot(howTo: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_reboot(howTo)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: Glob64T?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_glob64(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: Glob64T?) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_fremovexattr(filedes, name)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_posix_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_gnu_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dlmopen(lmid, filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dlinfo(handle?.value?.toCPointer<ByteVar>(), request, info?.value?.toCPointer<ByteVar>())

public actual fun dladdr1(addr: COpaquePointer?, info: io.github.kotlinmania.libc.DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dladdr1(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), extraInfo?.value?.toCPointer<ByteVar>(), flags)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_nl_langinfo_l(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_gnu_get_libc_release()?.let { COpaquePointer(it.toLong()) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.hurd.cinterop.libc_hurd_mod_gnu_get_libc_version()?.let { COpaquePointer(it.toLong()) }
