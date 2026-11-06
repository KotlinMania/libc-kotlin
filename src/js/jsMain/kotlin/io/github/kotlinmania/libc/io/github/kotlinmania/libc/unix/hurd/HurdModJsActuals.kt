package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimes(fd, times?.toLong() ?: 0L)") as CInt

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(fd, path, mode)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun libcCurrentSigrtmin(): CInt =
    js("require('@kotlinmania/libc-native-bindings').libcCurrentSigrtmin()") as CInt

public actual fun libcCurrentSigrtmax(): CInt =
    js("require('@kotlinmania/libc-native-bindings').libcCurrentSigrtmax()") as CInt

public actual fun wait4(pid: io.github.kotlinmania.libc.PidT, status: CInt?, options: CInt, rusage: Rusage?): io.github.kotlinmania.libc.PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as io.github.kotlinmania.libc.PidT

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun sigwait(set: CUlong?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(oldfd, newfd, flags)") as CInt

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pread64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwrite64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun readv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iovec?.toLong() ?: 0L, count)") as SsizeT

public actual fun writev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iovec?.toLong() ?: 0L, count)") as SsizeT

public actual fun preadv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iovec?.toLong() ?: 0L, count, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iovec?.toLong() ?: 0L, count, offset)") as SsizeT

public actual fun preadv64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv64(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev64(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: io.github.kotlinmania.libc.Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    js("require('@kotlinmania/libc-native-bindings').lseek64(fd, offset, whence)") as Off64T

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, whence)") as OffT

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko64(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun ftello64(stream: FILE?): Off64T =
    js("require('@kotlinmania/libc-native-bindings').ftello64(stream?.toLong() ?: 0L)") as Off64T

public actual fun bind(fd: CInt, addr: Sockaddr?, len: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(fd, addr?.toLong() ?: 0L, len)") as CInt

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: CUint?, flg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)") as CInt

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, message?.toLong() ?: 0L, flags)") as SsizeT

public actual fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, message?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: SquadType?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shutdown(fd, how)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun sethostid(hostid: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)") as CInt

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun setspent() {
    js("require('@kotlinmania/libc-native-bindings').setspent()")
}

public actual fun endspent() {
    js("require('@kotlinmania/libc-native-bindings').endspent()")
}

public actual fun getspent(): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspent()") as Spwd?

public actual fun getspnam(name: String?): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspnam(name)") as Spwd?

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fgetpwentR(stream: FILE?, pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpwentR(stream?.toLong() ?: 0L, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetgrentR(stream?.toLong() ?: 0L, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun putpwent(p: io.github.kotlinmania.libc.Passwd?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putpwent(p?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as CInt

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putgrent(grp?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fgetspentR(fp: FILE?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetspentR(fp?.toLong() ?: 0L, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun sgetspentR(s: String?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sgetspentR(s, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun getspentR(spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspentR(spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspnamR(name, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun getmntentR(stream: FILE?, mntbuf: io.github.kotlinmania.libc.Mntent?, buf: COpaquePointer?, buflen: CInt): io.github.kotlinmania.libc.Mntent? =
    js("require('@kotlinmania/libc-native-bindings').getmntentR(stream?.toLong() ?: 0L, mntbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen)") as io.github.kotlinmania.libc.Mntent?

public actual fun utmpname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(file)") as CInt

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun getresuid(ruid: CUint?, euid: CUint?, suid: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun getresgid(rgid: CUint?, egid: CUint?, sgid: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, group)") as CInt

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CUint?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun setgroups(ngroups: SizeT, ptr: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun acct(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename)") as CInt

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').setmntent(filename, ty)") as FILE?

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    js("require('@kotlinmania/libc-native-bindings').getmntent(stream?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Mntent?

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').addmntent(stream?.toLong() ?: 0L, mnt?.toLong() ?: 0L)") as CInt

public actual fun endmntent(streamp: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').endmntent(streamp?.toLong() ?: 0L)") as CInt

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').hasmntopt(mnt?.toLong() ?: 0L, opt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCreate(native: CLong?, attr: PthreadAttr?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadKill(threadid: io.github.kotlinmania.libc.PthreadT, signo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(threadid, signo)") as CInt

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadEqual(t1, t2)") as CInt

public actual fun pthreadGetattrNp(thr: io.github.kotlinmania.libc.PthreadT, attr: PthreadAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(thr, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: PthreadAttr?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: PthreadAttr?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrGetstack(attr: PthreadAttr?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattr?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattr?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutex?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattr?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattr?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)") as CInt

public actual fun pthreadCondattrGetclock(attr: PthreadCondattr?, clockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattr?, clockId: ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattr?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattr?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadOnce(control: PthreadOnce?, routine: PthreadOnceRoutineCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadOnce(control?.toLong() ?: 0L, routine)") as CInt

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattr?, shared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattr?, shared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)") as CInt

public actual fun pthreadBarrierInit(barrier: PthreadBarrier?, attr: PthreadBarrierattr?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)") as CInt

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrier?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierDestroy(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierWait(barrier: PthreadBarrier?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierWait(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun pthreadSigmask(how: CInt, newmask: CUlong?, oldmask: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, newmask?.toLong() ?: 0L, oldmask?.toLong() ?: 0L)") as CInt

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clockId: ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clockId, res?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetcpuclockid(pid: io.github.kotlinmania.libc.PidT, clkId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)") as SizeT

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strptime(s, format, tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: UwordType?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)") as CInt

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun fstat(fd: CInt, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun fstat64(fd: CInt, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat64(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatat(fd, file, buf?.toLong() ?: 0L, flag)") as CInt

public actual fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatat64(fd, file, buf?.toLong() ?: 0L, flag)") as CInt

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statx(dirfd, pathname, flags, mask, statxbuf?.toLong() ?: 0L)") as CInt

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate(fd, length)") as CInt

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate64(fd, length)") as CInt

public actual fun truncate64(file: String?, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').truncate64(file, length)") as CInt

public actual fun lstat(file: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat(file, buf?.toLong() ?: 0L)") as CInt

public actual fun lstat64(file: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat64(file, buf?.toLong() ?: 0L)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun statfs64(file: String?, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs64(file, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs64(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun statvfs(file: String?, buf: Statvfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statvfs(file, buf?.toLong() ?: 0L)") as CInt

public actual fun statvfs64(file: String?, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statvfs64(file, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatvfs(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatvfs64(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen64(filename, mode)") as FILE?

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen64(filename, mode, file?.toLong() ?: 0L)") as FILE?

public actual fun creat64(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat64(path, mode)") as CInt

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun tmpfile64(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile64()") as FILE?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closeRange(first, last, flags)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): io.github.kotlinmania.libc.PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as io.github.kotlinmania.libc.PidT

public actual fun getpt(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpt()") as CInt

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as CInt

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').execveat(dirfd, pathname, argv?.value ?: 0L, envp?.value ?: 0L, flags)") as CInt

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun posixSpawn(pid: CInt?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: CInt?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: io.github.kotlinmania.libc.PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)") as CInt

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)") as CInt

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, from: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclosefromNp(actions?.toLong() ?: 0L, from)") as CInt

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddtcsetpgrpNp(actions?.toLong() ?: 0L, tcfd)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').euidaccess(pathname, mode)") as CInt

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eaccess(pathname, mode)") as CInt

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun stat(file: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(file, buf?.toLong() ?: 0L)") as CInt

public actual fun stat64(file: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat64(file, buf?.toLong() ?: 0L)") as CInt

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    js("require('@kotlinmania/libc-native-bindings').readdir(dirp?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Dirent?

public actual fun readdir64(dirp: DIR?): io.github.kotlinmania.libc.Dirent64? =
    js("require('@kotlinmania/libc-native-bindings').readdir64(dirp?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Dirent64?

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').readdirR(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)") as CInt

public actual fun readdir64R(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent64?, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').readdir64R(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap64(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun syncfs(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncfs(fd)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate64(fd, mode, offset, len)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate64(fd, offset, len)") as CInt

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise64(fd, offset, len, advise)") as CInt

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buffer?.value ?: 0L, length, flags)") as SsizeT

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buffer?.value ?: 0L, length)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchrnul(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun drand48(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as CDouble

public actual fun erand48(xseed: CUshort?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').erand48(xseed?.toLong() ?: 0L)") as CDouble

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun nrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun jrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun srand48(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(seed)")
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun lcong48(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(p?.toLong() ?: 0L)")
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)")
}

public actual fun brk(addr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as CInt

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallopt(param: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallopt(param, value)") as CInt

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    js("require('@kotlinmania/libc-native-bindings').mallinfo()") as io.github.kotlinmania.libc.Mallinfo

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    js("require('@kotlinmania/libc-native-bindings').mallinfo2()") as io.github.kotlinmania.libc.Mallinfo2

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallocInfo(options, stream?.toLong() ?: 0L)") as CInt

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun mallocTrim(pad: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallocTrim(pad)") as CInt

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtrace(buf?.value ?: 0L, sz)") as CInt

public actual fun reboot(howTo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(howTo)") as CInt

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getloadavg(loadavg?.toLong() ?: 0L, nelem)") as CInt

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: Glob64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree64(pglob: Glob64T?) {
    js("require('@kotlinmania/libc-native-bindings').globfree64(pglob?.toLong() ?: 0L)")
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').lgetxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fgetxattr(filedes, name, value?.value ?: 0L, size)") as SsizeT

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').lsetxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetxattr(filedes, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').listxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').llistxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').flistxattr(filedes, list?.value ?: 0L, size)") as SsizeT

public actual fun removexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').removexattr(path, name)") as CInt

public actual fun lremovexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lremovexattr(path, name)") as CInt

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fremovexattr(filedes, name)") as CInt

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').posixBasename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuBasename(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlmopen(lmid, filename, flag)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlinfo(handle?.value ?: 0L, request, info?.value ?: 0L)") as CInt

public actual fun dladdr1(addr: COpaquePointer?, info: io.github.kotlinmania.libc.DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dladdr1(addr?.value ?: 0L, info?.toLong() ?: 0L, extraInfo?.value ?: 0L, flags)") as CInt

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as io.github.kotlinmania.libc.LocaleT

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as io.github.kotlinmania.libc.LocaleT

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as io.github.kotlinmania.libc.LocaleT

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuGetLibcRelease()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuGetLibcVersion()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
