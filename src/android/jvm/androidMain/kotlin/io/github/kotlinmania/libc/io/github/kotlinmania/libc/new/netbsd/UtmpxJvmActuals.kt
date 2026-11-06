package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer

internal object UtmpxRawLibc {
    external fun setutxent()
    external fun endutxent()
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun updwtmpx(file: String?, ut: Long): Int
    external fun getlastlogx(fname: String?, uid: Int, ll: Long): Long?
    external fun updlastlogx(fname: String?, uid: Int, ll: Long): Int
    external fun getutmp(ux: Long, u: Long)
    external fun getutmpx(u: Long, ux: Long)
    external fun utmpxname(file: String?): Int
}

public actual fun setutxent() {
    UtmpxRawLibc.setutxent()
}

public actual fun endutxent() {
    UtmpxRawLibc.endutxent()
}

public actual fun getutxent(): Utmpx? =
    UtmpxRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    UtmpxRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    UtmpxRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    UtmpxRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    UtmpxRawLibc.updwtmpx(file, ut?.toLong() ?: 0L)

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    UtmpxRawLibc.getlastlogx(fname, uid, ll?.toLong() ?: 0L)

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    UtmpxRawLibc.updlastlogx(fname, uid, ll?.toLong() ?: 0L)

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    UtmpxRawLibc.getutmp(ux?.toLong() ?: 0L, u?.toLong() ?: 0L)
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    UtmpxRawLibc.getutmpx(u?.toLong() ?: 0L, ux?.toLong() ?: 0L)
}

public actual fun utmpxname(file: String?): CInt =
    UtmpxRawLibc.utmpxname(file)
