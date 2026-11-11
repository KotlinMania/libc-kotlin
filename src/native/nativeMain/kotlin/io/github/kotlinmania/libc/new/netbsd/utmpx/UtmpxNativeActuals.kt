@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_endutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getlastlogx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getutmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getutmpx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getutxid
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_getutxline
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_pututxline
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_setutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_updlastlogx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_updwtmpx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libc_new_netbsd_utmpx_utmpxname
import io.github.kotlinmania.libc.new.qurt.UidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setutxent() {
    libc_new_netbsd_utmpx_setutxent()
}

public actual fun endutxent() {
    libc_new_netbsd_utmpx_endutxent()
}

public actual fun getutxent(): COpaquePointer? =
    libc_new_netbsd_utmpx_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    libc_new_netbsd_utmpx_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    libc_new_netbsd_utmpx_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    libc_new_netbsd_utmpx_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    libc_new_netbsd_utmpx_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    libc_new_netbsd_utmpx_getlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    libc_new_netbsd_utmpx_updlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    libc_new_netbsd_utmpx_getutmp(ux?.value?.toCPointer<ByteVar>(), u?.value?.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    libc_new_netbsd_utmpx_getutmpx(u?.value?.toCPointer<ByteVar>(), ux?.value?.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: String?): CInt =
    libc_new_netbsd_utmpx_utmpxname(file)
