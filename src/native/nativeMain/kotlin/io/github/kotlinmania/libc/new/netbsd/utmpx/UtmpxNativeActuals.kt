@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxEndutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetlastlogx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetutmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetutmpx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetutxid
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxGetutxline
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxPututxline
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxSetutxent
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxUpdlastlogx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxUpdwtmpx
import io.github.kotlinmania.libc.new.netbsd.utmpx.cinterop.libcNewNetbsdUtmpxUtmpxname
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setutxent() {
    libcNewNetbsdUtmpxSetutxent()
}

public actual fun endutxent() {
    libcNewNetbsdUtmpxEndutxent()
}

public actual fun getutxent(): MutPtr =
    MutPtr(libcNewNetbsdUtmpxGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcNewNetbsdUtmpxGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcNewNetbsdUtmpxGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcNewNetbsdUtmpxPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    libcNewNetbsdUtmpxUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), ut.rawAddress.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    MutPtr(libcNewNetbsdUtmpxGetlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    libcNewNetbsdUtmpxUpdlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    libcNewNetbsdUtmpxGetutmp(ux.rawAddress.toCPointer<ByteVar>(), u.rawAddress.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    libcNewNetbsdUtmpxGetutmpx(u.rawAddress.toCPointer<ByteVar>(), ux.rawAddress.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: ConstPtr): CInt =
    libcNewNetbsdUtmpxUtmpxname(file.rawAddress.toCPointer<ByteVar>())
