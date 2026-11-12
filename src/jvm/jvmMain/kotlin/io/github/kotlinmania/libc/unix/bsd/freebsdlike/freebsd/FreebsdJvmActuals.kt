@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Vnstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b64.Stat
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdJniBridge {
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
        val stream = UnixBsdFreebsdlikeFreebsdJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdFreebsdlikeFreebsdFhlink(fhp: Long, to: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp: Long, tofd: Int, to: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp: Long, buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfhat(fd: Int, path: Long, fhp: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdError(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd: Int, inoffp: Long, outfd: Int, outoffp: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevnameR(dev: Int, mode: Short, buf: Long, len: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd: Int, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFspacectl(fd: Int, cmd: Int, rqsr: Long, flags: Int, rmsr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJail(jail: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailAttach(jid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailRemove(jid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailGet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailSet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetutxuser(user: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetutxdb(type: Int, file: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp: Long, timeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdWaitid(idtype: Int, id: Long, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFtok(pathname: Long, projId: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemget(key: Long, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgget(key: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdfork(fdp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd: Int, pidp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdkill(fd: Int, signum: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRtprioThread(function: Int, lwpid: Int, rtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdUuidgen(store: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrKill(id: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrKill2(pid: Int, id: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrSelf(tid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr: Long, robust: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr: Long, robust: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdXuname(nmln: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhopen(fhp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhstat(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfh(path: Long, fhp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdLgetfh(path: Long, fhp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf: Long, bufsize: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMount(type: Long, dir: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdNmount(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRfork(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpuset(setid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level: Int, which: Int, id: Long, setid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which: Int, id: Long, setid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapEnter(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd: Int, fcntlrightsp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd: Int, fcntlrights: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd: Int, cmds: Long, maxcmds: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd: Int, cmds: Long, ncmds: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version: Int, rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version: Int, fd: Int, rightsp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd: Int, rights: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big: Long, little: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapSandboxed(): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfs(value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfsl(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfsll(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFls(value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlsl(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlsll(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(writeCb: Long, cbopaque: Long, opt: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctl(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name: Long, mibp: Long, miplen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib: Long, mible: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRallocx(ptr: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdXallocx(ptr: Long, size: Long, extra: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSallocx(ptr: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDallocx(ptr: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr: Long, size: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdNallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcctl(idtype: Int, id: Long, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetpagesize(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1: Long, arg2: Int, arg3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdStrchrnul(s: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path: Long, flags: Int, psind: Int, allocPolicy: Int, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom: Long, pathTo: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux: Int, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj: Long, op: Int, value: Long, uaddr: Long, uaddr2: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s: Int, id: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpBindx(s: Int, addrs: Long, num: Int, tpe: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s: Int, addrs: Long, addrcnt: Int, id: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family: Byte): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s: Int, id: Int, opt: Int, arg: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd: Int, iov: Long, iovcnt: Int, addrs: Long, addrcnt: Int, info: Long, infolen: Int, infotype: Int, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd: Int, iov: Long, iovcnt: Int, from: Long, fromlen: Long, info: Long, infolen: Long, infotype: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd: Int, highfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKcmp(pid1: Int, pid2: Int, type: Int, idx1: Long, idx2: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDlvsym(handle: Long, symbol: Long, version: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list: Long, allocator: Int, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd: Long, cpu: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd: Long, cpTime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd: Long, cpu: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd: Long, info: Long, maxswap: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNative(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd: Long, base: Long, buf: Long, size: Long, cpu: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd: Long, addr: Long, buf: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string: Long, attrnamespace: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRealhostname(host: Long, hsize: Long, ip: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host: Long, hsize: Long, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKldLoad(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdHexdump(ptr: Long, length: Int, hdr: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf: Long, len: Long, number: Long, suffix: Long, scale: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlopen(path: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlopenat(fd: Int, path: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetlocalbase(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path: Long, mode: Short, pidptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileClose(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat: Long, kp: Long, mmapped: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat: Long, head: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat: Long, what: Int, arg: Int, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat: Long, p: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat: Long, vmmap: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat: Long, groups: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat: Long, pl: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat: Long, kp: Long, osrelp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat: Long, kp: Long, pathname: Long, maxlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat: Long, kp: Long, which: Int, rlimit: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat: Long, kp: Long, maskp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf: Long, memf: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc: Long, fst: Long, sock: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc: Long, fst: Long, vn: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc: Long, fst: Long, pts: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc: Long, fst: Long, shm: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId: Int, evp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr: Long, matches: Long, numMatches: Long): Int
}

public actual fun fhlink(fhp: MutPtr<FhandleT>, to: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress, to.rawAddress)

public actual fun fhlinkat(fhp: MutPtr<FhandleT>, tofd: CInt, to: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress, tofd, to.rawAddress)

public actual fun fhreadlink(fhp: MutPtr<FhandleT>, buf: MutPtr<CChar>, bufsize: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress, buf.rawAddress, bufsize.toLong())

public actual fun getfhat(fd: CInt, path: MutPtr<CChar>, fhp: MutPtr<Fhandle>, flag: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress, fhp.rawAddress, flag)

public actual fun error(): MutPtr<CInt> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdError())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress)

public actual fun aioReadv(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress)

public actual fun aioWritev(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress)

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr<OffT>, outfd: CInt, outoffp: MutPtr<OffT>, len: SizeT, flags: CUint): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress, outfd, outoffp.rawAddress, len.toLong(), flags.toInt())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: CInt): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevnameR(dev.toInt(), mode.toShort(), buf.rawAddress, len))

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr<SpacectlRange>, flags: CInt, rmsr: MutPtr<SpacectlRange>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress, flags, rmsr.rawAddress)

public actual fun jail(jail: MutPtr<Jail>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress)

public actual fun jailAttach(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailRemove(jid)

public actual fun jailGet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress, niov.toInt(), flags)

public actual fun jailSet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress, niov.toInt(), flags)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun getutxuser(user: ConstPtr<CChar>): MutPtr<Utmpx> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress))

public actual fun setutxdb(type: CInt, file: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress)

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress, timeout.rawAddress)

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdWaitid(idtype.toInt(), id, infop.rawAddress, options)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun cfmakesane(termios: MutPtr<Termios>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress)
}

public actual fun pdfork(fdp: MutPtr<CInt>, flags: CInt): PidT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress, flags)

public actual fun pdgetpid(fd: CInt, pidp: MutPtr<PidT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress)

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress)

public actual fun uuidgen(store: MutPtr<Uuid>, count: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress, count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id, sig)

public actual fun thrSelf(tid: MutPtr<CLong>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress)

public actual fun pthreadGetthreadidNp(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong(), cpusetsize.toLong(), cpusetp.rawAddress)

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong(), cpusetsize.toLong(), cpusetp.rawAddress)

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz.toLong(), cpuset.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz.toLong(), cpuset.rawAddress)

public actual fun schedGetcpu(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu()

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: MutPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress, robust.rawAddress)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress, robust)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong(), retval.rawAddress, abstime.rawAddress)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress, vlen.toLong(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt, timeout: ConstPtr<Timespec>): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress, vlen.toLong(), flags, timeout.rawAddress)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun fhopen(fhp: ConstPtr<FhandleT>, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress, flags)

public actual fun fhstat(fhp: ConstPtr<Fhandle>, buf: MutPtr<Stat>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress, buf.rawAddress)

public actual fun fhstatfs(fhp: ConstPtr<FhandleT>, buf: MutPtr<Statfs>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress, buf.rawAddress)

public actual fun getfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress, fhp.rawAddress)

public actual fun lgetfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress, fhp.rawAddress)

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: CLong, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress, bufsize, mode)

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress, mode)

public actual fun mount(type: ConstPtr<CChar>, dir: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress, dir.rawAddress, flags, data.rawAddress)

public actual fun nmount(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress, niov.toInt(), flags)

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun rfork(flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id, setsize.toLong(), mask.rawAddress)

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<CpusetT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id, setsize.toLong(), mask.rawAddress)

public actual fun cpuset(setid: MutPtr<CpusetidT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress)

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr<CpusetidT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id, setid.rawAddress)

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapEnter()

public actual fun capGetmode(modep: MutPtr<CUint>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress)

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr<UInt>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress)

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt())

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr<ULong>, maxcmds: ULong): Long =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress, maxcmds.toLong())

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr<ULong>, ncmds: ULong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress, ncmds.toLong())

public actual fun capRightsInit(version: CInt, rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr<CapRightsT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress)

public actual fun capRightsSet(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsClear(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsIsSet(rights: ConstPtr<CapRightsT>, vararg variadicArgs: Long): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun capRightsIsValid(rights: ConstPtr<CapRightsT>): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress)

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr<CapRightsT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress)

public actual fun capRightsMerge(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress, src.rawAddress))

public actual fun capRightsRemove(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress, src.rawAddress))

public actual fun capRightsContains(big: ConstPtr<CapRightsT>, little: ConstPtr<CapRightsT>): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress, little.rawAddress)

public actual fun capSandboxed(): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapSandboxed()

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun ffs(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfsll(value)

public actual fun fls(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFls(value)

public actual fun flsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlsl(value)

public actual fun flsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr<CVoid>, opt: ConstPtr<CChar>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L, cbopaque.rawAddress, opt.rawAddress)
}

public actual fun mallctl(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun mallctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<SizeT>, miplen: MutPtr<SizeT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress, mibp.rawAddress, miplen.rawAddress)

public actual fun mallctlbymib(mib: ConstPtr<SizeT>, mible: SizeT, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress, mible.toLong(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallocx(size.toLong(), flags))

public actual fun rallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress, size.toLong(), flags))

public actual fun xallocx(ptr: MutPtr<CVoid>, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress, size.toLong(), extra.toLong(), flags).toULong()

public actual fun sallocx(ptr: ConstPtr<CVoid>, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress, flags).toULong()

public actual fun dallocx(ptr: MutPtr<CVoid>, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress, flags)
}

public actual fun sdallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress, size.toLong(), flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdNallocx(size.toLong(), flags).toULong()

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcctl(idtype.toInt(), id, cmd, data.rawAddress)

public actual fun getpagesize(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress, nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr<ClockidT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1, arg2, arg3.rawAddress)

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress, c))

public actual fun shmCreateLargepage(path: ConstPtr<CChar>, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress, flags, psind, allocPolicy, mode.toShort())

public actual fun shmRename(pathFrom: ConstPtr<CChar>, pathTo: ConstPtr<CChar>, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress, pathTo.rawAddress, flags)

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress, flags.toInt())

public actual fun setaudit(auditinfo: ConstPtr<AuditinfoT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toLong())

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress, buflen)

public actual fun setproctitleFast(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun umtxOp(obj: MutPtr<CVoid>, op: CInt, value: CUlong, uaddr: MutPtr<CVoid>, uaddr2: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress, op, value.toLong(), uaddr.rawAddress, uaddr2.rawAddress)

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt())

public actual fun sctpBindx(s: CInt, addrs: MutPtr<Sockaddr>, num: CInt, tpe: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress, num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr<Sockaddr>, addrcnt: CInt, id: MutPtr<SctpAssocT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress, addrcnt, id.rawAddress)

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toByte())

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid.toInt(), addrs.rawAddress)

public actual fun sctpFreepaddrs(addrs: MutPtr<Sockaddr>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress)
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid.toInt(), addrs.rawAddress)

public actual fun sctpFreeladdrs(addrs: MutPtr<Sockaddr>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress)
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr<CVoid>, size: MutPtr<SocklenT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id.toInt(), opt, arg.rawAddress, size.rawAddress)

public actual fun sctpSendv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, addrs: MutPtr<Sockaddr>, addrcnt: CInt, info: MutPtr<CVoid>, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress, iovcnt, addrs.rawAddress, addrcnt, info.rawAddress, infolen.toInt(), infotype.toInt(), flags)

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<SocklenT>, info: MutPtr<CVoid>, infolen: MutPtr<SocklenT>, infotype: MutPtr<CUint>, flags: MutPtr<CInt>): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress, iovcnt, from.rawAddress, fromlen.rawAddress, info.rawAddress, infolen.rawAddress, infotype.rawAddress, flags.rawAddress)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun closefrom(lowfd: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd.toInt(), highfd.toInt(), flags)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toLong(), idx2.toLong())

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress, symbol.rawAddress, version.rawAddress))

public actual fun memstatStrerror(error: CInt): ConstPtr<CChar> =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error))

public actual fun memstatMtlAlloc(): MutPtr<MemoryTypeList> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc())

public actual fun memstatMtlFirst(list: MutPtr<MemoryTypeList>): MutPtr<MemoryType> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress))

public actual fun memstatMtlNext(mtp: MutPtr<MemoryType>): MutPtr<MemoryType> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress))

public actual fun memstatMtlFind(list: MutPtr<MemoryTypeList>, allocator: CInt, name: ConstPtr<CChar>): MutPtr<MemoryType> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress, allocator, name.rawAddress))

public actual fun memstatMtlFree(list: MutPtr<MemoryTypeList>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress)
}

public actual fun memstatMtlGeterror(list: MutPtr<MemoryTypeList>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress)

public actual fun memstatGetName(mtp: ConstPtr<MemoryType>): ConstPtr<CChar> =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress))

public actual fun kvmDpcpuSetcpu(kd: MutPtr<KvmT>, cpu: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress, cpu.toInt())

public actual fun kvmGetargv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress, p.rawAddress, nchr))

public actual fun kvmGetcptime(kd: MutPtr<KvmT>, cpTime: MutPtr<CLong>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress, cpTime.rawAddress)

public actual fun kvmGetenvv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress, p.rawAddress, nchr))

public actual fun kvmGeterr(kd: MutPtr<KvmT>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress))

public actual fun kvmGetmaxcpu(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress)

public actual fun kvmGetncpus(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress)

public actual fun kvmGetpcpu(kd: MutPtr<KvmT>, cpu: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress, cpu))

public actual fun kvmCounterU64Fetch(kd: MutPtr<KvmT>, base: CUlong): ULong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress, base.toLong()).toULong()

public actual fun kvmGetswapinfo(kd: MutPtr<KvmT>, info: MutPtr<KvmSwap>, maxswap: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress, info.rawAddress, maxswap, flags)

public actual fun kvmNative(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress)

public actual fun kvmNlist(kd: MutPtr<KvmT>, nl: MutPtr<Nlist>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress, nl.rawAddress)

public actual fun kvmNlist2(kd: MutPtr<KvmT>, nl: MutPtr<KvmNlist>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress, nl.rawAddress)

public actual fun kvmReadZpcpu(kd: MutPtr<KvmT>, base: CUlong, buf: MutPtr<CVoid>, size: SizeT, cpu: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress, base.toLong(), buf.rawAddress, size.toLong(), cpu)

public actual fun kvmRead2(kd: MutPtr<KvmT>, addr: KvaddrT, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress, addr.toLong(), buf.rawAddress, nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress)

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress, attrnamespace.rawAddress)

public actual fun realhostname(host: MutPtr<CChar>, hsize: SizeT, ip: ConstPtr<InAddr>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress, hsize.toLong(), ip.rawAddress)

public actual fun realhostnameSa(host: MutPtr<CChar>, hsize: SizeT, addr: MutPtr<Sockaddr>, addrlen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress, hsize.toLong(), addr.rawAddress, addrlen)

public actual fun kldIsloaded(name: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress)

public actual fun kldLoad(name: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress)

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<CInt>): MutPtr<KinfoVmentry> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress))

public actual fun hexdump(ptr: ConstPtr<CVoid>, length: CInt, hdr: ConstPtr<CChar>, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress, length, hdr.rawAddress, flags)
}

public actual fun humanizeNumber(buf: MutPtr<CChar>, len: SizeT, number: Long, suffix: ConstPtr<CChar>, scale: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress, len.toLong(), number, suffix.rawAddress, scale, flags)

public actual fun flopen(path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun flopenat(fd: CInt, path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getlocalbase(): ConstPtr<CChar> =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetlocalbase())

public actual fun pidfileOpen(path: ConstPtr<CChar>, mode: ModeT, pidptr: MutPtr<PidT>): MutPtr<Pidfh> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress, mode.toShort(), pidptr.rawAddress))

public actual fun pidfileWrite(path: MutPtr<Pidfh>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress)

public actual fun pidfileClose(path: MutPtr<Pidfh>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress)

public actual fun pidfileRemove(path: MutPtr<Pidfh>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress)

public actual fun pidfileFileno(path: ConstPtr<Pidfh>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress)

public actual fun procstatOpenSysctl(): MutPtr<Procstat> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl())

public actual fun procstatGetfiles(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, mmapped: CInt): MutPtr<FilestatList> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress, kp.rawAddress, mmapped))

public actual fun procstatFreefiles(procstat: MutPtr<Procstat>, head: MutPtr<FilestatList>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress, head.rawAddress)
}

public actual fun procstatGetprocs(procstat: MutPtr<Procstat>, what: CInt, arg: CInt, count: MutPtr<CUint>): MutPtr<KinfoProc> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress, what, arg, count.rawAddress))

public actual fun procstatFreeprocs(procstat: MutPtr<Procstat>, p: MutPtr<KinfoProc>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress, p.rawAddress)
}

public actual fun procstatGetvmmap(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<KinfoVmentry> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress, kp.rawAddress, count.rawAddress))

public actual fun procstatFreevmmap(procstat: MutPtr<Procstat>, vmmap: MutPtr<KinfoVmentry>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress, vmmap.rawAddress)
}

public actual fun procstatClose(procstat: MutPtr<Procstat>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress)
}

public actual fun procstatFreeargv(procstat: MutPtr<Procstat>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress)
}

public actual fun procstatFreeenvv(procstat: MutPtr<Procstat>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress)
}

public actual fun procstatFreegroups(procstat: MutPtr<Procstat>, groups: MutPtr<GidT>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress, groups.rawAddress)
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr<Procstat>, pl: MutPtr<PtraceLwpinfo>) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress, pl.rawAddress)
}

public actual fun procstatGetargv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress, kp.rawAddress, nchr.toLong()))

public actual fun procstatGetenvv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress, kp.rawAddress, nchr.toLong()))

public actual fun procstatGetgroups(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<GidT> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress, kp.rawAddress, count.rawAddress))

public actual fun procstatGetosrel(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, osrelp: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress, kp.rawAddress, osrelp.rawAddress)

public actual fun procstatGetpathname(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, pathname: MutPtr<CChar>, maxlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress, kp.rawAddress, pathname.rawAddress, maxlen.toLong())

public actual fun procstatGetrlimit(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, which: CInt, rlimit: MutPtr<Rlimit>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress, kp.rawAddress, which, rlimit.rawAddress)

public actual fun procstatGetumask(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, maskp: MutPtr<CUshort>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress, kp.rawAddress, maskp.rawAddress)

public actual fun procstatOpenCore(filename: ConstPtr<CChar>): MutPtr<Procstat> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress))

public actual fun procstatOpenKvm(nlistf: ConstPtr<CChar>, memf: ConstPtr<CChar>): MutPtr<Procstat> =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress, memf.rawAddress))

public actual fun procstatGetSocketInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, sock: MutPtr<Sockstat>, errbuf: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress, fst.rawAddress, sock.rawAddress, errbuf.rawAddress)

public actual fun procstatGetVnodeInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, vn: MutPtr<Vnstat>, errbuf: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress, fst.rawAddress, vn.rawAddress, errbuf.rawAddress)

public actual fun procstatGetPtsInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, pts: MutPtr<Ptsstat>, errbuf: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress, fst.rawAddress, pts.rawAddress, errbuf.rawAddress)

public actual fun procstatGetShmInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, shm: MutPtr<Shmstat>, errbuf: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress, fst.rawAddress, shm.rawAddress, errbuf.rawAddress)

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress)

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress, value.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress, flags, value.rawAddress, ovalue.rawAddress)

public actual fun devstatGetnumdevs(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress)

public actual fun devstatGetgeneration(kd: MutPtr<KvmT>): CLong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress)

public actual fun devstatGetversion(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress)

public actual fun devstatCheckversion(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress)

public actual fun devstatSelectdevs(devSelect: MutPtr<MutPtr<DeviceSelection>>, numSelected: MutPtr<CInt>, numSelections: MutPtr<CInt>, selectGeneration: MutPtr<CLong>, currentGeneration: CLong, devices: MutPtr<Devstat>, numdevs: CInt, matches: MutPtr<DevstatMatch>, numMatches: CInt, devSelections: MutPtr<MutPtr<CChar>>, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: MutPtr<CChar>, matches: MutPtr<MutPtr<DevstatMatch>>, numMatches: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress, matches.rawAddress, numMatches.rawAddress)
