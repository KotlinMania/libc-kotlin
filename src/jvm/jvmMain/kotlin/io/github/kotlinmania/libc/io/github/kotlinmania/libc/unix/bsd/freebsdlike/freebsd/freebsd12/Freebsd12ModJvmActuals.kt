package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.COpaquePointer

internal object Freebsd12ModRawLibc {
    external fun setgrent()
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun freelocale(loc: Long)
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent() {
    Freebsd12ModRawLibc.setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    Freebsd12ModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun freelocale(loc: LocaleT) {
    Freebsd12ModRawLibc.freelocale(loc)
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    Freebsd12ModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    Freebsd12ModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    Freebsd12ModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    Freebsd12ModRawLibc.qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)
}
