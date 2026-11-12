@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdArc4random
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdArc4randomBuf
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdArc4randomUniform
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdDaemon
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdDlIteratePhdr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdExplicitBzero
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdForkpty
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdGetprogname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdKevent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdKqueue
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdLoginTty
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdLutimes
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdMkstemps
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdOpenpty
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdPreadv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdPwritev
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdSetprogname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdSlAdd
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdSlFind
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdSlFree
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdSlInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdStrsep
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdStrtonum
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBsdWait4
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixHaikuBsdDaemon(nochdir, noclose)

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(libcUnixHaikuBsdGetprogname()?.toLong() ?: 0L)

public actual fun setprogname(progname: ConstPtr<CChar>) {
    libcUnixHaikuBsdSetprogname(progname.rawAddress.toCPointer<ByteVar>())
}

public actual fun arc4random(): UInt =
    libcUnixHaikuBsdArc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    libcUnixHaikuBsdArc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT) {
    libcUnixHaikuBsdArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), n)
}

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcUnixHaikuBsdMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong =
    libcUnixHaikuBsdStrtonum(nptr.rawAddress.toCPointer<ByteVar>(), minval, maxval, errstr.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    libcUnixHaikuBsdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixHaikuBsdLoginTty(fd)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    libcUnixHaikuBsdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delimiters: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHaikuBsdStrsep(string.rawAddress.toCPointer<ByteVar>(), delimiters.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun explicitBzero(buf: MutPtr<CVoid>, len: SizeT) {
    libcUnixHaikuBsdExplicitBzero(buf.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun slInit(): MutPtr<StringList> =
    MutPtr(libcUnixHaikuBsdSlInit()?.toLong() ?: 0L)

public actual fun slAdd(sl: MutPtr<StringList>, n: MutPtr<CChar>): CInt =
    libcUnixHaikuBsdSlAdd(sl.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>())

public actual fun slFree(sl: MutPtr<StringList>, i: CInt) {
    libcUnixHaikuBsdSlFree(sl.rawAddress.toCPointer<ByteVar>(), i)
}

public actual fun slFind(sl: MutPtr<StringList>, n: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHaikuBsdSlFind(sl.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kqueue(): CInt =
    libcUnixHaikuBsdKqueue()

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixHaikuBsdKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixHaikuBsdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixHaikuBsdLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixHaikuBsdPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixHaikuBsdPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    libcUnixHaikuBsdWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())
