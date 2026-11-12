@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsArc4randomBuf
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsFutimens
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsGetentropy
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsPthreadCreate
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsReadv
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsSetgroups
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libcUnixNewlibRtemsWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixNewlibRtemsFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixNewlibRtemsWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixNewlibRtemsReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixNewlibRtemsPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixNewlibRtemsPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixNewlibRtemsGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT) {
    libcUnixNewlibRtemsArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), nbytes)
}

public actual fun setgroups(ngroups: CInt, grouplist: ConstPtr<GidT>): CInt =
    libcUnixNewlibRtemsSetgroups(ngroups, grouplist.rawAddress.toCPointer<ByteVar>())
