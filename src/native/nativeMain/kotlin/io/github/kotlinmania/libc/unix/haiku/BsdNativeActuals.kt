@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_daemon(nochdir, noclose)

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(progname: String?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_setprogname(progname)
}

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_arc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), n)
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_strtonum(nptr, minval, maxval, errstr?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_loginTty(fd)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_strsep(string?.value?.toCPointer<ByteVar>(), delimiters)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_explicitBzero(buf?.value?.toCPointer<ByteVar>(), len)
}

public actual fun slInit(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_slInit()?.let { COpaquePointer(it.toLong()) }

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_slAdd(sl?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>())

public actual fun slFree(sl: COpaquePointer?, i: CInt) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_slFree(sl?.value?.toCPointer<ByteVar>(), i)
}

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_slFind(sl?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kqueue(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_kqueue()

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bsd_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())
