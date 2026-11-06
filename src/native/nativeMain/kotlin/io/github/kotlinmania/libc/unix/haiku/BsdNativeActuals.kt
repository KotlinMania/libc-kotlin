@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_daemon(nochdir, noclose)

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_bsd_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(progname: String?) {
    io.github.kotlinmania.libc.cinterop.libc_bsd_setprogname(progname)
}

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_arc4random_uniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    io.github.kotlinmania.libc.cinterop.libc_bsd_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), n)
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.cinterop.libc_bsd_strtonum(nptr, minval, maxval, errstr?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_login_tty(fd)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.cinterop.libc_bsd_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_bsd_strsep(string?.value?.toCPointer<ByteVar>(), delimiters)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.cinterop.libc_bsd_explicit_bzero(buf?.value?.toCPointer<ByteVar>(), len)
}

public actual fun slInit(): Stringlist? =
    io.github.kotlinmania.libc.cinterop.libc_bsd_sl_init()?.let { COpaquePointer(it.toLong()) }

public actual fun slAdd(sl: Stringlist?, n: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_sl_add(sl?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>())

public actual fun slFree(sl: Stringlist?, i: CInt) {
    io.github.kotlinmania.libc.cinterop.libc_bsd_sl_free(sl?.value?.toCPointer<ByteVar>(), i)
}

public actual fun slFind(sl: Stringlist?, n: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_bsd_sl_find(sl?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kqueue(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_kqueue()

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_bsd_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_bsd_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_bsd_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    io.github.kotlinmania.libc.cinterop.libc_bsd_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())
