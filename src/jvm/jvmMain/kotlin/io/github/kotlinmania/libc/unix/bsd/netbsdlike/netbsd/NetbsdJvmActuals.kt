@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdNetbsdlikeNetbsdJniBridge {
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
        val stream = UnixBsdNetbsdlikeNetbsdJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr: Long, number: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdChflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFchflags(fd: Int, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLchflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd: Int, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string: Long, attrnamespace: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname: Long, name: Long, namelenp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKevent(kq: Int, changelist: Long, nchanges: Long, eventlist: Long, nevents: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMount(src: Long, target: Long, flags: Int, data: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPtrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdUtrace(label: Long, addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t: Long, name: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetCreate(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetSize(set: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetZero(set: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKqueue1(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpSelf(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlauxinfo(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlvsym(handle: Long, symbol: Long, version: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b: Long, c: Int, len: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMremap(oldp: Long, oldsize: Long, newp: Long, newsize: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPollts(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdReboot(mode: Int, bootstr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpPark(clock: Int, flags: Int, ts: Long, unpark: Int, hint: Long, unparkhint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp: Int, hint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets: Long, ntargets: Long, hint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf: Long, bufsize: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfd(value: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd: Int, valp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdQsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEmalloc(n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEcalloc(n: Long, c: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdErealloc(p: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEreallocarr(p: Long, n: Long, s: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrdup(s: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrndup(s: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst: Long, src: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst: Long, src: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr: Long, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr: Long, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEasprintf(string: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEvasprintf(string: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEsetfunc(cb: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSecurePath(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSnprintb(buf: Long, buflen: Long, fmt: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf: Long, buflen: Long, fmt: Long, value: Long, max: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetbootfile(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetbyteorder(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf: Long, buflen: Long, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf: Long, buflen: Long, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf: Long, buflen: Long, spec: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStrpct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStrspct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogin(ut: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLoginx(ut: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogout(line: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogoutx(line: Long, status: Int, tpe: Int)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogwtmp(line: Long, name: Long, host: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line: Long, name: Long, host: Long, status: Int, tpe: Int)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLgetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes: Int, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSetxattr(path: Long, name: Long, value: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLsetxattr(path: Long, name: Long, value: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes: Int, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdListxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLlistxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdRemovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLremovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd: Int, path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP: Long, setp: Long, clrp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags: Long, def: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist: Long, len: Long, fmt: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist: Long, len: Long, fd: Int, fmt: Long): Int
}

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun reallocarr(ptr: MutPtr, number: SizeT, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress, number.toLong(), size.toLong())

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress, flags.toLong())

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags.toLong())

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress, flags.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress, attrnamespace.rawAddress)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress, times.rawAddress)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress, namelen.toInt(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlnametomib(sname: ConstPtr, name: MutPtr, namelenp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress, name.rawAddress, namelenp.rawAddress)

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: SizeT, eventlist: MutPtr, nevents: SizeT, timeout: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress, nchanges.toLong(), eventlist.rawAddress, nevents.toLong(), timeout.rawAddress)

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress, target.rawAddress, flags, data.rawAddress, size.toLong())

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong(), notification.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqUnlink(name: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress)

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress, data)

public actual fun utrace(label: ConstPtr, addr: MutPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress, addr.rawAddress, len.toLong())

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr, arg: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong(), name.rawAddress, arg.rawAddress)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong(), attr.rawAddress)

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong(), attr.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong(), size.toLong(), set.rawAddress)

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong(), size.toLong(), set.rawAddress)

public actual fun cpusetCreate(): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetCreate())

public actual fun cpusetDestroy(set: MutPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress)
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu.toLong(), set.rawAddress)

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu.toLong(), set.rawAddress)

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu.toLong(), set.rawAddress)

public actual fun cpusetSize(set: ConstPtr): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress).toULong()

public actual fun cpusetZero(set: MutPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress)
}

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress)
}

public actual fun localeconvL(loc: LocaleT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress))

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpSelf()

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L, data.rawAddress)

public actual fun dlauxinfo(): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlauxinfo())

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong(), currValue.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong(), flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress, symbol.rawAddress, version.rawAddress))

public actual fun explicitMemset(b: MutPtr, c: CInt, len: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress, c, len.toLong())
}

public actual fun consttimeMemequal(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress, b.rawAddress, len.toLong())

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mremap(oldp: MutPtr, oldsize: SizeT, newp: MutPtr, newsize: SizeT, flags: CInt): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress, oldsize.toLong(), newp.rawAddress, newsize.toLong(), flags))

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun pollts(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress, nfds.toInt(), ts.rawAddress, sigmask.rawAddress)

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun reboot(mode: CInt, bootstr: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress)

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr, unpark: LwpidT, hint: ConstPtr, unparkhint: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress, unpark, hint.rawAddress, unparkhint.rawAddress)

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress)

public actual fun lwpUnparkAll(targets: ConstPtr, ntargets: SizeT, hint: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress, ntargets.toLong(), hint.rawAddress)

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress, flags)

public actual fun getvfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress, bufsize.toLong(), flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfd(value.toInt(), flags)

public actual fun eventfdRead(efd: CInt, valp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress)

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value.toLong())

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun efopen(p: ConstPtr, m: ConstPtr): FILE =
    FILE()

public actual fun emalloc(n: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEmalloc(n.toLong()))

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEcalloc(n.toLong(), c.toLong()))

public actual fun erealloc(p: MutPtr, n: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress, n.toLong()))

public actual fun ereallocarr(p: MutPtr, n: SizeT, s: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress, n.toLong(), s.toLong())
}

public actual fun estrdup(s: ConstPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress))

public actual fun estrndup(s: ConstPtr, len: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress, len.toLong()))

public actual fun estrlcpy(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress, src.rawAddress, len.toLong()).toULong()

public actual fun estrlcat(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress, src.rawAddress, len.toLong()).toULong()

public actual fun estrtoi(nptr: ConstPtr, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress, base, lo, hi)

public actual fun estrtou(nptr: ConstPtr, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress, base, lo.toLong(), hi.toLong()).toULong()

public actual fun easprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun evasprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress)

public actual fun snprintb(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress, buflen.toLong(), fmt.rawAddress, value.toLong())

public actual fun snprintbM(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong, max: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress, buflen.toLong(), fmt.rawAddress, value.toLong(), max.toLong())

public actual fun getbootfile(): ConstPtr =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetbootfile())

public actual fun getbyteorder(): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetbyteorder()

public actual fun getdiskrawname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress, buflen.toLong(), name.rawAddress))

public actual fun getdiskcookedname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress, buflen.toLong(), name.rawAddress))

public actual fun getfsspecname(buf: MutPtr, buflen: SizeT, spec: ConstPtr): ConstPtr =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress, buflen.toLong(), spec.rawAddress))

public actual fun strpct(buf: MutPtr, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress, bufsiz.toLong(), numerator.toLong(), denominator.toLong(), precision.toLong()))

public actual fun strspct(buf: MutPtr, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress, bufsiz.toLong(), numerator, denominator, precision.toLong()))

public actual fun login(ut: ConstPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress)
}

public actual fun loginx(ut: ConstPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress)
}

public actual fun logout(line: ConstPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress)
}

public actual fun logoutx(line: ConstPtr, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress, status, tpe)
}

public actual fun logwtmp(line: ConstPtr, name: ConstPtr, host: ConstPtr) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress, name.rawAddress, host.rawAddress)
}

public actual fun logwtmpx(line: ConstPtr, name: ConstPtr, host: ConstPtr, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress, name.rawAddress, host.rawAddress, status, tpe)
}

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong())

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress, size.toLong())

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress, name.rawAddress)

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress, name.rawAddress)

public actual fun fremovexattr(fd: CInt, path: ConstPtr, name: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress, name.rawAddress)

public actual fun stringToFlags(stringP: MutPtr, setp: MutPtr, clrp: MutPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress, setp.rawAddress, clrp.rawAddress)

public actual fun flagsToString(flags: CUlong, def: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags.toLong(), def.rawAddress)

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress))

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress, len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress, len.toLong()))

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress, len.toLong(), fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress, len.toLong(), fmt.rawAddress))

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr, len: SizeT, fd: CInt, fmt: ConstPtr): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress, len.toLong(), fd, fmt.rawAddress)
