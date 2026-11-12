@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdNetbsdlikeOpenbsdJniBridge {
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
        val stream = UnixBsdNetbsdlikeOpenbsdJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdNetbsdlikeOpenbsdGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPledge(promises: Long, execpromises: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdUnveil(path: Long, permissions: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdStrtonum(nptr: Long, minval: Long, maxval: Long, errstr: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdChflags(path: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdFchflags(fd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdChflagsat(fd: Int, path: Long, flags: Int, atflag: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdKevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetthrid(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(tid: Long, name: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(tid: Long, name: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(thread: Long, sinfo: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdPtrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdUtrace(label: Long, addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdFreezero(ptr: Long, size: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdMallocConceal(size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdCallocConceal(nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(xseed: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdLsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdLfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdHcreate(nelt: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdHdestroy()

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdFutex(uaddr: Long, op: Int, value: Int, timeout: Long, uaddr2: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdMimmutable(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdReboot(mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdGetfsstat(buf: Long, bufsize: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(aux: Int, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdBacktrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(addrlist: Long, len: Long, fmt: Long): Long
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun pledge(promises: ConstPtr, execpromises: ConstPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPledge(promises.rawAddress, execpromises.rawAddress)

public actual fun unveil(path: ConstPtr, permissions: ConstPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdUnveil(path.rawAddress, permissions.rawAddress)

public actual fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdStrtonum(nptr.rawAddress, minval, maxval, errstr.rawAddress)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags)

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdChflags(path.rawAddress, flags.toInt())

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags.toInt())

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUint, atflag: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdChflagsat(fd, path.rawAddress, flags.toInt(), atflag)

public actual fun dirfd(dirp: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdDirfd(dirp.rawAddress)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toLong(), serv.rawAddress, servlen.toLong(), flags)

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdKevent(kq, changelist.rawAddress, nchanges, eventlist.rawAddress, nevents, timeout.rawAddress)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun getthrid(): PidT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetthrid()

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadMainNp(): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(tid.toLong(), name.rawAddress, len.toLong())
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(tid.toLong(), name.rawAddress)
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(thread.toLong(), sinfo.rawAddress)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSysctl(name.rawAddress, namelen.toInt(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdPtrace(request, pid, addr.rawAddress, data)

public actual fun utrace(label: ConstPtr, addr: ConstPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdUtrace(label.rawAddress, addr.rawAddress, len.toLong())

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(0L, data.rawAddress)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdUselocale(loc.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdDuplocale(base.rawAddress))

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(s.rawAddress, len.toLong())
}

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun freezero(ptr: MutPtr, size: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdFreezero(ptr.rawAddress, size.toLong())
}

public actual fun mallocConceal(size: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdMallocConceal(size.toLong()))

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdCallocConceal(nmemb.toLong(), size.toLong()))

public actual fun srand48Deterministic(seed: CLong) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed)
}

public actual fun seed48Deterministic(xseed: MutPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(xseed.rawAddress))

public actual fun lcong48Deterministic(p: MutPtr) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p.rawAddress)
}

public actual fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdLsearch(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdLfind(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun hcreate(nelt: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdHcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr =
    MutPtr(0L)

public actual fun futex(uaddr: MutPtr, op: CInt, value: CInt, timeout: ConstPtr, uaddr2: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdFutex(uaddr.rawAddress, op, value, timeout.rawAddress, uaddr2.rawAddress)

public actual fun mimmutable(addr: MutPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdMimmutable(addr.rawAddress, len.toLong())

public actual fun reboot(mode: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdReboot(mode)

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdFstatfs(fd, buf.rawAddress)

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(mntbufp.rawAddress, flags)

public actual fun getfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdGetfsstat(buf.rawAddress, bufsize.toLong(), flags)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(aux, buf.rawAddress, buflen)

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdBacktrace(addrlist.rawAddress, len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(addrlist.rawAddress, len.toLong()))

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(addrlist.rawAddress, len.toLong(), fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeOpenbsdJniBridge.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(addrlist.rawAddress, len.toLong(), fmt.rawAddress))
