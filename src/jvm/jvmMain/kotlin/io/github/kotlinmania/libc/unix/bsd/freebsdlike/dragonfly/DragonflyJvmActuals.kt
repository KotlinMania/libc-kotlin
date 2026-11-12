@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeDragonflyJniBridge {
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
        val stream = UnixBsdFreebsdlikeDragonflyJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdFreebsdlikeDragonflyErrnoLocation(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySetgrent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySetutxdb(type: Int, file: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyDevnameR(dev: Int, mode: Short, buf: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyWaitid(idtype: Int, id: Long, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyLwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyShmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyProcctl(idtype: Int, id: Long, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file: Long, ut: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname: Long, uid: Short, ll: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname: Long, uid: Short, ll: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr: Long, value: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp: Long, mntvbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyReallocf(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyFreezero(ptr: Long, size: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm: Long, map: Long, entry: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm: Long, map: Long, entry: Long): Long
}

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyErrnoLocation())

public actual fun setgrent() {
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySetgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun setutxdb(type: CUint, file: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySetutxdb(type.toInt(), file.rawAddress)

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp.rawAddress, timeout.rawAddress)

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: SizeT): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyDevnameR(dev.toInt(), mode.toShort(), buf.rawAddress, len.toLong()))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyWaitid(idtype.toInt(), id, infop.rawAddress, options)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyFreelocale(loc.rawAddress)
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyLwpRtprio(function, pid, lwpid, rtp.rawAddress)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyFstatfs(fd, buf.rawAddress)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUname(buf.rawAddress)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock.rawAddress)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid, cpusetsize.toLong(), mask.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr<CpuSetT>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid, cpusetsize.toLong(), mask.rawAddress)

public actual fun schedGetcpu(): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySchedGetcpu()

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyShmctl(shmid, cmd, buf.rawAddress)

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyProcctl(idtype.toInt(), id, cmd, data.rawAddress)

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file.rawAddress, ut.rawAddress)

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname.rawAddress, uid.toShort(), ll.rawAddress))

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname.rawAddress, uid.toShort(), ll.rawAddress)

public actual fun getutxuser(name: ConstPtr<CChar>): Utmpx =
    Utmpx()

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUtmpxname(file.rawAddress)

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: ConstPtr<CInt>, value: CInt, timeout: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr.rawAddress, value, timeout)

public actual fun umtxWakeup(ptr: ConstPtr<CInt>, count: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr.rawAddress, count)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyDirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyBasename(path.rawAddress))

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp.rawAddress, flags)

public actual fun getmntvinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mntvbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp.rawAddress, mntvbufp.rawAddress, flags)

public actual fun closefrom(lowfd: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioCancel(fd, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioError(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioFsync(op, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyReallocf(ptr.rawAddress, size.toLong()))

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyFreezero(ptr.rawAddress, size.toLong())
}

public actual fun kvmVmMapEntryFirst(kvm: MutPtr<KvmT>, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm.rawAddress, map.rawAddress, entry.rawAddress))

public actual fun kvmVmMapEntryNext(kvm: MutPtr<KvmT>, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(UnixBsdFreebsdlikeDragonflyJniBridge.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm.rawAddress, map.rawAddress, entry.rawAddress))
