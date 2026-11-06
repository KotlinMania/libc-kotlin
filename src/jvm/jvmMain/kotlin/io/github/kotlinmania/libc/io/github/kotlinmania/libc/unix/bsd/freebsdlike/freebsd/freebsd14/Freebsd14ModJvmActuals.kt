package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.COpaquePointer

internal object Freebsd14ModRawLibc {
    external fun setgrent()
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun freelocale(loc: Long)
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long
    external fun cpusetGetdomain(level: Long, which: Long, id: Long, setsize: Long, mask: Long, policy: Long): Int
    external fun cpusetSetdomain(level: Long, which: Long, id: Long, setsize: Long, mask: Long, policy: Int): Int
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun kvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    Freebsd14ModRawLibc.setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    Freebsd14ModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun freelocale(loc: LocaleT) {
    Freebsd14ModRawLibc.freelocale(loc)
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    Freebsd14ModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt?): CInt =
    Freebsd14ModRawLibc.cpusetGetdomain(level, which, id, setsize, mask?.toLong() ?: 0L, policy?.toLong() ?: 0L)

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt): CInt =
    Freebsd14ModRawLibc.cpusetSetdomain(level, which, id, setsize, mask?.toLong() ?: 0L, policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    Freebsd14ModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    Freebsd14ModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    Freebsd14ModRawLibc.qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun kvmKerndisp(kd: KvmT?): io.github.kotlinmania.libc.KssizeT =
    Freebsd14ModRawLibc.kvmKerndisp(kd?.toLong() ?: 0L)
