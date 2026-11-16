@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixHurdJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = UnixHurdJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixHurdLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixHurdFutimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixHurdFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixHurdUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixHurdMkfifoat(fd: Int, path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcUnixHurdLibcCurrentSigrtmin(): Int

    @JvmStatic
    external fun libcUnixHurdLibcCurrentSigrtmax(): Int

    @JvmStatic
    external fun libcUnixHurdWait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libcUnixHurdWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixHurdSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixHurdSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixHurdSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHurdSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixHurdSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixHurdIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHurdPipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdDup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdPread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdPwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdReadv(fd: Int, iovec: Long, count: Int): Long

    @JvmStatic
    external fun libcUnixHurdWritev(fd: Int, iovec: Long, count: Int): Long

    @JvmStatic
    external fun libcUnixHurdPreadv(fd: Int, iovec: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdPwritev(fd: Int, iovec: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdPreadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdPwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdFreadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixHurdAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixHurdAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixHurdAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixHurdAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixHurdAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixHurdAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHurdAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixHurdLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixHurdMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixHurdMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixHurdMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixHurdMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixHurdMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixHurdMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixHurdMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixHurdMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixHurdLseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcUnixHurdLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcUnixHurdFgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixHurdFseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcUnixHurdFsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixHurdFtello64(stream: Long): Long

    @JvmStatic
    external fun libcUnixHurdBind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixHurdAccept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libcUnixHurdPpoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixHurdRecvmsg(fd: Int, message: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHurdSendmsg(fd: Int, message: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHurdRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixHurdSendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixHurdSendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixHurdShutdown(fd: Int, how: Int): Int

    @JvmStatic
    external fun libcUnixHurdSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdIfNameindex(): Long

    @JvmStatic
    external fun libcUnixHurdIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixHurdGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixHurdFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixHurdUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdGethostid(): Long

    @JvmStatic
    external fun libcUnixHurdSethostid(hostid: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetpwent()

    @JvmStatic
    external fun libcUnixHurdEndpwent()

    @JvmStatic
    external fun libcUnixHurdGetpwent(): Long

    @JvmStatic
    external fun libcUnixHurdSetgrent()

    @JvmStatic
    external fun libcUnixHurdEndgrent()

    @JvmStatic
    external fun libcUnixHurdGetgrent(): Long

    @JvmStatic
    external fun libcUnixHurdSetspent()

    @JvmStatic
    external fun libcUnixHurdEndspent()

    @JvmStatic
    external fun libcUnixHurdGetspent(): Long

    @JvmStatic
    external fun libcUnixHurdGetspnam(name: Long): Long

    @JvmStatic
    external fun libcUnixHurdGetpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdFgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdFgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdPutpwent(p: Long, stream: Long): Int

    @JvmStatic
    external fun libcUnixHurdPutgrent(grp: Long, stream: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdFgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixHurdSgetspentR(s: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetspnamR(name: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libcUnixHurdUtmpname(file: Long): Int

    @JvmStatic
    external fun libcUnixHurdUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetutxent(): Long

    @JvmStatic
    external fun libcUnixHurdGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixHurdGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixHurdPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixHurdSetutxent()

    @JvmStatic
    external fun libcUnixHurdEndutxent()

    @JvmStatic
    external fun libcUnixHurdGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libcUnixHurdSetresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libcUnixHurdInitgroups(user: Long, group: Int): Int

    @JvmStatic
    external fun libcUnixHurdGetgrgid(gid: Int): Long

    @JvmStatic
    external fun libcUnixHurdGetgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixHurdGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetgrouplist(user: Long, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixHurdAcct(filename: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetmntent(filename: Long, ty: Long): Long

    @JvmStatic
    external fun libcUnixHurdGetmntent(stream: Long): Long

    @JvmStatic
    external fun libcUnixHurdAddmntent(stream: Long, mnt: Long): Int

    @JvmStatic
    external fun libcUnixHurdEndmntent(streamp: Long): Int

    @JvmStatic
    external fun libcUnixHurdHasmntopt(mnt: Long, opt: Long): Long

    @JvmStatic
    external fun libcUnixHurdPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadKill(threadid: Long, signo: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadGetattrNp(thr: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadOnce(control: Long, routine: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSigmask(how: Int, newmask: Long, oldmask: Long): Int

    @JvmStatic
    external fun libcUnixHurdSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixHurdSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdPthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcUnixHurdSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixHurdSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixHurdSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixHurdSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixHurdClockGetres(clockId: Int, res: Long): Int

    @JvmStatic
    external fun libcUnixHurdClockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixHurdClockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixHurdClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixHurdClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixHurdGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixHurdSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixHurdAsctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixHurdCtimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixHurdStrftime(s: Long, max: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixHurdStrptime(s: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixHurdTimerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixHurdTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixHurdTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixHurdTimerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libcUnixHurdTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstat(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstat64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstatat(fd: Int, file: Long, buf: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixHurdFstatat64(fd: Int, file: Long, buf: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixHurdStatx(dirfd: Int, pathname: Long, flags: Int, mask: Int, statxbuf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcUnixHurdFtruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcUnixHurdTruncate64(file: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixHurdLstat(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdLstat64(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdStatfs64(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstatfs64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdStatvfs(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdStatvfs64(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstatvfs(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdFstatvfs64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdOpen(file: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHurdOpen64(file: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHurdOpenat(fd: Int, file: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHurdOpenat64(fd: Int, file: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHurdFopen64(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixHurdFreopen64(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcUnixHurdCreat64(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixHurdTmpfile64(): Long

    @JvmStatic
    external fun libcUnixHurdPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixHurdGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixHurdCloseRange(first: Int, last: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixHurdForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetpt(): Int

    @JvmStatic
    external fun libcUnixHurdPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixHurdLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixHurdCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixHurdClearenv(): Int

    @JvmStatic
    external fun libcUnixHurdExecveat(dirfd: Int, pathname: Long, argv: Long, envp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHurdFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHurdDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddchdirNp(actions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int

    @JvmStatic
    external fun libcUnixHurdShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixHurdEuidaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdEaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixHurdFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdStat(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdStat64(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixHurdReaddir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixHurdReaddir64(dirp: Long): Long

    @JvmStatic
    external fun libcUnixHurdReaddirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdReaddir64R(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHurdSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixHurdTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixHurdDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixHurdStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixHurdErrnoLocation(): Long

    @JvmStatic
    external fun libcUnixHurdMmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHurdMremap(addr: Long, len: Long, newLen: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixHurdMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixHurdMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdSync()

    @JvmStatic
    external fun libcUnixHurdSyncfs(fd: Int): Int

    @JvmStatic
    external fun libcUnixHurdFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixHurdFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHurdPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixHurdMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixHurdPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixHurdGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHurdSetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixHurdSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixHurdGetrandom(buffer: Long, length: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHurdGetentropy(buffer: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixHurdMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixHurdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixHurdStrchrnul(s: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixHurdAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixHurdLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixHurdRand(): Int

    @JvmStatic
    external fun libcUnixHurdSrand(seed: Int)

    @JvmStatic
    external fun libcUnixHurdDrand48(): Double

    @JvmStatic
    external fun libcUnixHurdErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixHurdLrand48(): Long

    @JvmStatic
    external fun libcUnixHurdNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHurdMrand48(): Long

    @JvmStatic
    external fun libcUnixHurdJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHurdSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixHurdSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHurdLcong48(p: Long)

    @JvmStatic
    external fun libcUnixHurdQsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixHurdBrk(addr: Long): Int

    @JvmStatic
    external fun libcUnixHurdSbrk(increment: Long): Long

    @JvmStatic
    external fun libcUnixHurdMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdMallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixHurdMallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libcUnixHurdMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixHurdMallocTrim(pad: Long): Int

    @JvmStatic
    external fun libcUnixHurdIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixHurdIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixHurdIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixHurdGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixHurdBacktrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libcUnixHurdReboot(howTo: Int): Int

    @JvmStatic
    external fun libcUnixHurdGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixHurdRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixHurdRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixHurdRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixHurdGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixHurdGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixHurdGlob64(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixHurdGlobfree64(pglob: Long)

    @JvmStatic
    external fun libcUnixHurdGetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdLgetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdFgetxattr(filedes: Int, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdSetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdLsetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdFsetxattr(filedes: Int, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdListxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdLlistxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdFlistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHurdRemovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixHurdLremovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixHurdFremovexattr(filedes: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixHurdDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixHurdPosixBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixHurdGnuBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixHurdDlmopen(lmid: Long, filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcUnixHurdDlinfo(handle: Long, request: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixHurdDladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHurdDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixHurdFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixHurdNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixHurdUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixHurdNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixHurdNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixHurdDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixHurdGnuGetLibcRelease(): Long

    @JvmStatic
    external fun libcUnixHurdGnuGetLibcVersion(): Long
}

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdLutimes(file.rawAddress, times.rawAddress)

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFutimes(fd, times.rawAddress)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun mkfifoat(fd: CInt, path: ConstPtr, mode: ModeT): CInt =
    UnixHurdJniBridge.libcUnixHurdMkfifoat(fd, path.rawAddress, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    UnixHurdJniBridge.libcUnixHurdMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun libcCurrentSigrtmin(): CInt =
    UnixHurdJniBridge.libcUnixHurdLibcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    UnixHurdJniBridge.libcUnixHurdLibcCurrentSigrtmax()

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    UnixHurdJniBridge.libcUnixHurdWait4(pid, status.rawAddress, options, rusage.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdWaitid(idtype.toInt(), id.toInt(), infop.rawAddress, options)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSigwait(set.rawAddress, sig.rawAddress)

public actual fun sigsuspend(mask: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSigsuspend(mask.rawAddress)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixHurdJniBridge.libcUnixHurdIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPipe2(fds.rawAddress, flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdDup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPread64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPwrite64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun readv(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    UnixHurdJniBridge.libcUnixHurdReadv(fd, iovec.rawAddress, count)

public actual fun writev(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    UnixHurdJniBridge.libcUnixHurdWritev(fd, iovec.rawAddress, count)

public actual fun preadv(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPreadv(fd, iovec.rawAddress, count, offset)

public actual fun pwritev(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPwritev(fd, iovec.rawAddress, count, offset)

public actual fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPreadv64(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libcUnixHurdPwritev64(fd, iov.rawAddress, iovcnt, offset)

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixHurdJniBridge.libcUnixHurdFreadUnlocked(buf.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioRead(aiocbp.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioWrite(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioFsync(op, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioError(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    UnixHurdJniBridge.libcUnixHurdAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAioCancel(fd, aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixHurdJniBridge.libcUnixHurdMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    UnixHurdJniBridge.libcUnixHurdMqClose(mqd.toLong())

public actual fun mqUnlink(name: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdMqUnlink(name.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    UnixHurdJniBridge.libcUnixHurdMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    UnixHurdJniBridge.libcUnixHurdMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixHurdJniBridge.libcUnixHurdMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixHurdJniBridge.libcUnixHurdLseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixHurdJniBridge.libcUnixHurdLseek(fd, offset, whence)

public actual fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFgetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFseeko64(stream.rawAddress, offset, whence)

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFsetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun ftello64(stream: MutPtr): Off64T =
    UnixHurdJniBridge.libcUnixHurdFtello64(stream.rawAddress)

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    UnixHurdJniBridge.libcUnixHurdBind(fd, addr.rawAddress, len.toInt())

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdAccept4(fd, addr.rawAddress, len.rawAddress, flg)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPpoll(fds.rawAddress, nfds.toLong(), timeout.rawAddress, sigmask.rawAddress)

public actual fun recvmsg(fd: CInt, message: MutPtr, flags: CInt): SsizeT =
    UnixHurdJniBridge.libcUnixHurdRecvmsg(fd, message.rawAddress, flags)

public actual fun sendmsg(fd: CInt, message: ConstPtr, flags: CInt): SsizeT =
    UnixHurdJniBridge.libcUnixHurdSendmsg(fd, message.rawAddress, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    UnixHurdJniBridge.libcUnixHurdRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdSendfile(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdSendfile64(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdShutdown(fd, how)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdSethostname(name.rawAddress, len.toLong())

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdSetdomainname(name.rawAddress, len.toLong())

public actual fun ifNameindex(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdIfFreenameindex(ptr.rawAddress)
}

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun getifaddrs(ifap: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdFreeifaddrs(ifa.rawAddress)
}

public actual fun uname(buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdUname(buf.rawAddress)

public actual fun gethostid(): CLong =
    UnixHurdJniBridge.libcUnixHurdGethostid()

public actual fun sethostid(hostid: CLong): CInt =
    UnixHurdJniBridge.libcUnixHurdSethostid(hostid)

public actual fun setpwent() {
    UnixHurdJniBridge.libcUnixHurdSetpwent()
}

public actual fun endpwent() {
    UnixHurdJniBridge.libcUnixHurdEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetpwent())

public actual fun setgrent() {
    UnixHurdJniBridge.libcUnixHurdSetgrent()
}

public actual fun endgrent() {
    UnixHurdJniBridge.libcUnixHurdEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetgrent())

public actual fun setspent() {
    UnixHurdJniBridge.libcUnixHurdSetspent()
}

public actual fun endspent() {
    UnixHurdJniBridge.libcUnixHurdEndspent()
}

public actual fun getspent(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetspent())

public actual fun getspnam(name: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetspnam(name.rawAddress))

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetpwentR(pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetgrentR(grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFgetpwentR(stream.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFgetgrentR(stream.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPutpwent(p.rawAddress, stream.rawAddress)

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPutgrent(grp.rawAddress, stream.rawAddress)

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetpwuidR(uid.toInt(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFgetspentR(fp.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSgetspentR(s.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetspentR(spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetspnamR(name.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetmntentR(stream.rawAddress, mntbuf.rawAddress, buf.rawAddress, buflen))

public actual fun utmpname(file: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdUtmpname(file.rawAddress)

public actual fun utmpxname(file: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdUtmpxname(file.rawAddress)

public actual fun getutxent(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetutxent())

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdPututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixHurdJniBridge.libcUnixHurdSetutxent()
}

public actual fun endutxent() {
    UnixHurdJniBridge.libcUnixHurdEndutxent()
}

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixHurdJniBridge.libcUnixHurdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixHurdJniBridge.libcUnixHurdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    UnixHurdJniBridge.libcUnixHurdInitgroups(user.rawAddress, group.toInt())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetgrgid(gid.toInt()))

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetgrgidR(gid.toInt(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetgrnam(name.rawAddress))

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetgrouplist(user.rawAddress, group.toInt(), groups.rawAddress, ngroups.rawAddress)

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSetgroups(ngroups.toLong(), ptr.rawAddress)

public actual fun acct(filename: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAcct(filename.rawAddress)

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdSetmntent(filename.rawAddress, ty.rawAddress))

public actual fun getmntent(stream: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGetmntent(stream.rawAddress))

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdAddmntent(stream.rawAddress, mnt.rawAddress)

public actual fun endmntent(streamp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdEndmntent(streamp.rawAddress)

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdHasmntopt(mnt.rawAddress, opt.rawAddress))

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadKill(threadid, signo)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCancel(thread)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadEqual(t1, t2)

public actual fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadGetattrNp(thr, attr.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadOnce(control: MutPtr, routine: PthreadOnceRoutineCallback): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadOnce(control.rawAddress, 0L)

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierattrGetpshared(attr.rawAddress, shared.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierattrSetpshared(attr.rawAddress, shared)

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadAtfork(0L, 0L, 0L)

public actual fun pthreadSigmask(how: CInt, newmask: ConstPtr, oldmask: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSigmask(how, newmask.rawAddress, oldmask.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSchedGetparam(pid, param.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSchedSetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixHurdJniBridge.libcUnixHurdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadGetschedparam(native, policy.rawAddress, param.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadSetschedparam(native, policy, param.rawAddress)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPthreadGetcpuclockid(thread, clkId.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    UnixHurdJniBridge.libcUnixHurdSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semDestroy(sem: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSemDestroy(sem.rawAddress)

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdClockGetres(clockId, res.rawAddress)

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdClockGettime(clockId, tp.rawAddress)

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdClockSettime(clockId, tp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdCtimeR(timep.rawAddress, buf.rawAddress))

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    UnixHurdJniBridge.libcUnixHurdStrftime(s.rawAddress, max.toLong(), format.rawAddress, tm.rawAddress).toULong()

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdTimerCreate(clockid, sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixHurdJniBridge.libcUnixHurdTimerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixHurdJniBridge.libcUnixHurdTimerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdTimerGettime(timerid.toLong(), currValue.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdTimerSettime(timerid.toLong(), flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun fstat(fd: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstat(fd, buf.rawAddress)

public actual fun fstat64(fd: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstat64(fd, buf.rawAddress)

public actual fun fstatat(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatat(fd, file.rawAddress, buf.rawAddress, flag)

public actual fun fstatat64(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatat64(fd, file.rawAddress, buf.rawAddress, flag)

public actual fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStatx(dirfd, pathname.rawAddress, flags, mask.toInt(), statxbuf.rawAddress)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixHurdJniBridge.libcUnixHurdFtruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixHurdJniBridge.libcUnixHurdFtruncate64(fd, length)

public actual fun truncate64(file: ConstPtr, length: Off64T): CInt =
    UnixHurdJniBridge.libcUnixHurdTruncate64(file.rawAddress, length)

public actual fun lstat(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdLstat(file.rawAddress, buf.rawAddress)

public actual fun lstat64(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdLstat64(file.rawAddress, buf.rawAddress)

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStatfs(path.rawAddress, buf.rawAddress)

public actual fun statfs64(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStatfs64(file.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatfs(fd, buf.rawAddress)

public actual fun fstatfs64(fildes: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatfs64(fildes, buf.rawAddress)

public actual fun statvfs(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStatvfs(file.rawAddress, buf.rawAddress)

public actual fun statvfs64(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStatvfs64(file.rawAddress, buf.rawAddress)

public actual fun fstatvfs(fildes: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatvfs(fildes, buf.rawAddress)

public actual fun fstatvfs64(fildes: CInt, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFstatvfs64(fildes, buf.rawAddress)

public actual fun open(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixHurdJniBridge.libcUnixHurdOpen(file.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun open64(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixHurdJniBridge.libcUnixHurdOpen64(file.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixHurdJniBridge.libcUnixHurdOpenat(fd, file.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixHurdJniBridge.libcUnixHurdOpenat64(fd, file.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdFopen64(filename.rawAddress, mode.rawAddress))

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdFreopen64(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun creat64(path: ConstPtr, mode: ModeT): CInt =
    UnixHurdJniBridge.libcUnixHurdCreat64(path.rawAddress, mode.toInt())

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMkostemps(template.rawAddress, suffixlen, flags)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMkstemps(template.rawAddress, suffixlen)

public actual fun tmpfile64(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdTmpfile64())

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdPopen(command.rawAddress, mode.rawAddress))

public actual fun getdtablesize(): CInt =
    UnixHurdJniBridge.libcUnixHurdGetdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdCloseRange(first.toInt(), last.toInt(), flags)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    UnixHurdJniBridge.libcUnixHurdForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun getpt(): CInt =
    UnixHurdJniBridge.libcUnixHurdGetpt()

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun loginTty(fd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdLoginTty(fd)

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdCtermid(s.rawAddress))

public actual fun clearenv(): CInt =
    UnixHurdJniBridge.libcUnixHurdClearenv()

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdExecveat(dirfd, pathname.rawAddress, argv.rawAddress, envp.rawAddress, flags)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdDaemon(nochdir, noclose)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddchdirNp(actions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions.rawAddress, from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress, tcfd)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixHurdJniBridge.libcUnixHurdShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdShmUnlink(name.rawAddress)

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdEuidaccess(pathname.rawAddress, mode)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdEaccess(pathname.rawAddress, mode)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun stat(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStat(file.rawAddress, buf.rawAddress)

public actual fun stat64(file: ConstPtr, buf: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdStat64(file.rawAddress, buf.rawAddress)

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdReaddir(dirp.rawAddress))

public actual fun readdir64(dirp: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdReaddir64(dirp.rawAddress))

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdReaddirR(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdReaddir64R(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    UnixHurdJniBridge.libcUnixHurdSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    UnixHurdJniBridge.libcUnixHurdTelldir(dirp.rawAddress)

public actual fun dirfd(dirp: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdDirfd(dirp.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun errnoLocation(): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdErrnoLocation())

public actual fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdMmap64(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdMremap(addr.rawAddress, len.toLong(), newLen.toLong(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMsync(addr.rawAddress, len.toLong(), flags)

public actual fun sync() {
    UnixHurdJniBridge.libcUnixHurdSync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdSyncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixHurdJniBridge.libcUnixHurdFallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixFallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixFadvise64(fd, offset, len, advise)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetrlimit(resource.toInt(), rlim.rawAddress)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetrlimit64(resource.toInt(), rlim.rawAddress)

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSetrlimit(resource.toInt(), rlim.rawAddress)

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdSetrlimit64(resource.toInt(), rlim.rawAddress)

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    UnixHurdJniBridge.libcUnixHurdGetpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdSetpriority(which.toInt(), who.toInt(), prio)

public actual fun getrandom(buffer: MutPtr, length: SizeT, flags: CUint): SsizeT =
    UnixHurdJniBridge.libcUnixHurdGetrandom(buffer.rawAddress, length.toLong(), flags.toInt())

public actual fun getentropy(buffer: MutPtr, length: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdGetentropy(buffer.rawAddress, length.toLong())

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdStrchrnul(s.rawAddress, c))

public actual fun abs(i: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixHurdJniBridge.libcUnixHurdLabs(i)

public actual fun rand(): CInt =
    UnixHurdJniBridge.libcUnixHurdRand()

public actual fun srand(seed: CUint) {
    UnixHurdJniBridge.libcUnixHurdSrand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixHurdJniBridge.libcUnixHurdDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    UnixHurdJniBridge.libcUnixHurdErand48(xseed.rawAddress)

public actual fun lrand48(): CLong =
    UnixHurdJniBridge.libcUnixHurdLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    UnixHurdJniBridge.libcUnixHurdNrand48(xseed.rawAddress)

public actual fun mrand48(): CLong =
    UnixHurdJniBridge.libcUnixHurdMrand48()

public actual fun jrand48(xseed: MutPtr): CLong =
    UnixHurdJniBridge.libcUnixHurdJrand48(xseed.rawAddress)

public actual fun srand48(seed: CLong) {
    UnixHurdJniBridge.libcUnixHurdSrand48(seed)
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdSeed48(xseed.rawAddress))

public actual fun lcong48(p: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdLcong48(p.rawAddress)
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdQsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun brk(addr: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdBrk(addr.rawAddress)

public actual fun sbrk(increment: IntptrT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdSbrk(increment))

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdMemalign(align.toLong(), size.toLong()))

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdMallopt(param, value)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdMallocInfo(options, stream.rawAddress)

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    UnixHurdJniBridge.libcUnixHurdMallocUsableSize(ptr.rawAddress).toULong()

public actual fun mallocTrim(pad: SizeT): CInt =
    UnixHurdJniBridge.libcUnixHurdMallocTrim(pad.toLong())

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(UnixHurdJniBridge.libcUnixHurdIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    UnixHurdJniBridge.libcUnixHurdIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixHurdJniBridge.libcUnixHurdIconvClose(cd.rawAddress)

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdBacktrace(buf.rawAddress, sz)

public actual fun reboot(howTo: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdReboot(howTo)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdGetloadavg(loadavg.rawAddress, nelem)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    UnixHurdJniBridge.libcUnixHurdRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdRegfree(preg.rawAddress)
}

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdGlobfree(pglob.rawAddress)
}

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdGlob64(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree64(pglob: MutPtr) {
    UnixHurdJniBridge.libcUnixHurdGlobfree64(pglob.rawAddress)
}

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdLgetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong())

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdLsetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdListxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdLlistxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    UnixHurdJniBridge.libcUnixHurdFlistxattr(filedes, list.rawAddress, size.toLong())

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdRemovexattr(path.rawAddress, name.rawAddress)

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdLremovexattr(path.rawAddress, name.rawAddress)

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdFremovexattr(filedes, name.rawAddress)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdDirname(path.rawAddress))

public actual fun posixBasename(path: MutPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdPosixBasename(path.rawAddress))

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdGnuBasename(path.rawAddress))

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdDlmopen(lmid, filename.rawAddress, flag))

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdDlinfo(handle.rawAddress, request, info.rawAddress)

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    UnixHurdJniBridge.libcUnixHurdDladdr1(addr.rawAddress, info.rawAddress, extraInfo.rawAddress, flags)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixHurdJniBridge.libcUnixHurdDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixHurdJniBridge.libcUnixHurdFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(UnixHurdJniBridge.libcUnixHurdNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixHurdJniBridge.libcUnixHurdUselocale(loc.rawAddress))

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdNlLanginfo(item))

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(UnixHurdJniBridge.libcUnixHurdNlLanginfoL(item, locale.rawAddress))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixHurdJniBridge.libcUnixHurdDlIteratePhdr(0L, data.rawAddress)

public actual fun gnuGetLibcRelease(): ConstPtr =
    ConstPtr(UnixHurdJniBridge.libcUnixHurdGnuGetLibcRelease())

public actual fun gnuGetLibcVersion(): ConstPtr =
    ConstPtr(UnixHurdJniBridge.libcUnixHurdGnuGetLibcVersion())
