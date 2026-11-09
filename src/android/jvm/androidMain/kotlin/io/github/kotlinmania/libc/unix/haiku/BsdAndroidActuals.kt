@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private object UnixHaikuBsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_haiku_bsd_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_getprogname(): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_setprogname(progname: String?)

    @JvmStatic
    external fun libc_unix_haiku_bsd_arc4random(): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_arc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_arc4randomBuf(buf: Long, n: Long)

    @JvmStatic
    external fun libc_unix_haiku_bsd_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_strtonum(nptr: String?, minval: Long, maxval: Long, errstr: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_strsep(string: Long, delimiters: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_explicitBzero(buf: Long, len: Long)

    @JvmStatic
    external fun libc_unix_haiku_bsd_slInit(): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_slAdd(sl: Long, n: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_slFree(sl: Long, i: Int)

    @JvmStatic
    external fun libc_unix_haiku_bsd_slFind(sl: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_kqueue(): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_bsd_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_bsd_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_daemon(nochdir, noclose)

public actual fun getprogname(): COpaquePointer? =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(progname: String?) {
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_setprogname(progname)
}

public actual fun arc4random(): UInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_arc4random().toUInt()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_arc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_arc4randomBuf((buf?.value ?: 0L), n.toLong())
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_strtonum(nptr, minval, maxval, (errstr?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun loginTty(fd: CInt): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_loginTty(fd)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_strsep((string?.value ?: 0L), delimiters).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_explicitBzero((buf?.value ?: 0L), len.toLong())
}

public actual fun slInit(): COpaquePointer? =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_slInit().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_slAdd((sl?.value ?: 0L), (n?.value ?: 0L))

public actual fun slFree(sl: COpaquePointer?, i: CInt) {
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_slFree((sl?.value ?: 0L), i)
}

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_slFind((sl?.value ?: 0L), (n?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kqueue(): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_kqueue()

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_kevent(kq, (changelist?.value ?: 0L), nchanges, (eventlist?.value ?: 0L), nevents, (timeout?.value ?: 0L))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_lutimes(file, (times?.value ?: 0L))

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixHaikuBsdJniBridge.libc_unix_haiku_bsd_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))
