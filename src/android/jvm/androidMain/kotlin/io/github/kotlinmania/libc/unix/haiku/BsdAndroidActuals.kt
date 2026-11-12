@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixHaikuBsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixHaikuBsdDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixHaikuBsdGetprogname(): Long

    @JvmStatic
    external fun libcUnixHaikuBsdSetprogname(progname: Long)

    @JvmStatic
    external fun libcUnixHaikuBsdArc4random(): Int

    @JvmStatic
    external fun libcUnixHaikuBsdArc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libcUnixHaikuBsdArc4randomBuf(buf: Long, n: Long)

    @JvmStatic
    external fun libcUnixHaikuBsdMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixHaikuBsdStrtonum(nptr: Long, minval: Long, maxval: Long, errstr: Long): Long

    @JvmStatic
    external fun libcUnixHaikuBsdOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixHaikuBsdForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdStrsep(string: Long, delimiters: Long): Long

    @JvmStatic
    external fun libcUnixHaikuBsdExplicitBzero(buf: Long, len: Long)

    @JvmStatic
    external fun libcUnixHaikuBsdSlInit(): Long

    @JvmStatic
    external fun libcUnixHaikuBsdSlAdd(sl: Long, n: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdSlFree(sl: Long, i: Int)

    @JvmStatic
    external fun libcUnixHaikuBsdSlFind(sl: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixHaikuBsdKqueue(): Int

    @JvmStatic
    external fun libcUnixHaikuBsdKevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixHaikuBsdPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHaikuBsdPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixHaikuBsdWait4(pid: Int, status: Long, options: Int, rusage: Long): Int
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdDaemon(nochdir, noclose)

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(UnixHaikuBsdJniBridge.libcUnixHaikuBsdGetprogname())

public actual fun setprogname(progname: ConstPtr<CChar>) {
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdSetprogname(progname.rawAddress)
}

public actual fun arc4random(): UInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdArc4random().toUInt()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT) {
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdArc4randomBuf(buf.rawAddress, n.toLong())
}

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdMkstemps(template.rawAddress, suffixlen)

public actual fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdStrtonum(nptr.rawAddress, minval, maxval, errstr.rawAddress)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun loginTty(fd: CInt): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdLoginTty(fd)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delimiters: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixHaikuBsdJniBridge.libcUnixHaikuBsdStrsep(string.rawAddress, delimiters.rawAddress))

public actual fun explicitBzero(buf: MutPtr<CVoid>, len: SizeT) {
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdExplicitBzero(buf.rawAddress, len.toLong())
}

public actual fun slInit(): MutPtr<StringList> =
    MutPtr(UnixHaikuBsdJniBridge.libcUnixHaikuBsdSlInit())

public actual fun slAdd(sl: MutPtr<StringList>, n: MutPtr<CChar>): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdSlAdd(sl.rawAddress, n.rawAddress)

public actual fun slFree(sl: MutPtr<StringList>, i: CInt) {
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdSlFree(sl.rawAddress, i)
}

public actual fun slFind(sl: MutPtr<StringList>, n: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixHaikuBsdJniBridge.libcUnixHaikuBsdSlFind(sl.rawAddress, n.rawAddress))

public actual fun kqueue(): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdKqueue()

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdKevent(kq, changelist.rawAddress, nchanges, eventlist.rawAddress, nevents, timeout.rawAddress)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdDlIteratePhdr(0L, data.rawAddress)

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdLutimes(file.rawAddress, times.rawAddress)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    UnixHaikuBsdJniBridge.libcUnixHaikuBsdWait4(pid, status.rawAddress, options, rusage.rawAddress)
