@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun setutxent() {
    io.github.kotlinmania.libc.cinterop.libc_utmpx_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.cinterop.libc_utmpx_endutxent()
}

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_updlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getutmp(ux?.value?.toCPointer<ByteVar>(), u?.value?.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    io.github.kotlinmania.libc.cinterop.libc_utmpx_getutmpx(u?.value?.toCPointer<ByteVar>(), ux?.value?.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_utmpx_utmpxname(file)
