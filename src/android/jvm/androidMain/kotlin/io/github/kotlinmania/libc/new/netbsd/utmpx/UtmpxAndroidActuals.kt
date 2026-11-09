@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UidT

private object NewNetbsdUtmpxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_netbsd_utmpx_setutxent()

    @JvmStatic
    external fun libc_new_netbsd_utmpx_endutxent()

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getutxent(): Long

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_new_netbsd_utmpx_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_new_netbsd_utmpx_updwtmpx(file: String?, ut: Long): Int

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getlastlogx(fname: String?, uid: Int, ll: Long): Long

    @JvmStatic
    external fun libc_new_netbsd_utmpx_updlastlogx(fname: String?, uid: Int, ll: Long): Int

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getutmp(ux: Long, u: Long)

    @JvmStatic
    external fun libc_new_netbsd_utmpx_getutmpx(u: Long, ux: Long)

    @JvmStatic
    external fun libc_new_netbsd_utmpx_utmpxname(file: String?): Int
}

public actual fun setutxent() {
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_setutxent()
}

public actual fun endutxent() {
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_endutxent()
}

public actual fun getutxent(): COpaquePointer? =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_updwtmpx(file, (ut?.value ?: 0L))

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getlastlogx(fname, uid.toInt(), (ll?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_updlastlogx(fname, uid.toInt(), (ll?.value ?: 0L))

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getutmp((ux?.value ?: 0L), (u?.value ?: 0L))
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_getutmpx((u?.value ?: 0L), (ux?.value ?: 0L))
}

public actual fun utmpxname(file: String?): CInt =
    NewNetbsdUtmpxJniBridge.libc_new_netbsd_utmpx_utmpxname(file)
