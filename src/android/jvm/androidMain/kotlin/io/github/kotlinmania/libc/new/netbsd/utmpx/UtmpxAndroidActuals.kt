@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewNetbsdUtmpxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewNetbsdUtmpxSetutxent()

    @JvmStatic
    external fun libcNewNetbsdUtmpxEndutxent()

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxent(): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxPututxline(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxUpdwtmpx(file: Long, ut: Long): Int

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetlastlogx(fname: Long, uid: Int, ll: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxUpdlastlogx(fname: Long, uid: Int, ll: Long): Int

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutmp(ux: Long, u: Long)

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutmpx(u: Long, ux: Long)

    @JvmStatic
    external fun libcNewNetbsdUtmpxUtmpxname(file: Long): Int
}

public actual fun setutxent() {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxSetutxent()
}

public actual fun endutxent() {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxEndutxent()
}

public actual fun getutxent(): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxent())

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxPututxline(ut.rawAddress))

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdwtmpx(file.rawAddress, ut.rawAddress)

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress))

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress)

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmp(ux.rawAddress, u.rawAddress)
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmpx(u.rawAddress, ux.rawAddress)
}

public actual fun utmpxname(file: ConstPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUtmpxname(file.rawAddress)
