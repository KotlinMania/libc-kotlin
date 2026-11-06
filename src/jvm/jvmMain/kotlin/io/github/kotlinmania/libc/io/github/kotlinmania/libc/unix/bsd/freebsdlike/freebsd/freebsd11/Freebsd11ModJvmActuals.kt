package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.COpaquePointer

internal object Freebsd11ModRawLibc {
    external fun setgrent(): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun freelocale(loc: Long): Int
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Int
    external fun dirname(path: String?): Long?
    external fun basename(path: String?): Long?
    external fun qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent(): CInt =
    Freebsd11ModRawLibc.setgrent()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    Freebsd11ModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun freelocale(loc: LocaleT): CInt =
    Freebsd11ModRawLibc.freelocale(loc)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    Freebsd11ModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun dirname(path: String?): COpaquePointer? =
    Freebsd11ModRawLibc.dirname(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    Freebsd11ModRawLibc.basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    Freebsd11ModRawLibc.qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)
}
