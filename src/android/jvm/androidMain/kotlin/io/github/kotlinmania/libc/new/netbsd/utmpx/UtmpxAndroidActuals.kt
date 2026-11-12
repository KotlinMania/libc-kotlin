@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
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

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxPututxline(ut.rawAddress))

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdwtmpx(file.rawAddress, ut.rawAddress)

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress))

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress)

public actual fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmp(ux.rawAddress, u.rawAddress)
}

public actual fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmpx(u.rawAddress, ux.rawAddress)
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUtmpxname(file.rawAddress)
