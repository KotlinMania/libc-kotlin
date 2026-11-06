package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)") as SsizeT

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetGetdomain(level, which, id, setsize, mask?.toLong() ?: 0L, policy?.toLong() ?: 0L)") as CInt

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetSetdomain(level, which, id, setsize, mask?.toLong() ?: 0L, policy)") as CInt

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)")
}

public actual fun kvmKerndisp(kd: KvmT?): io.github.kotlinmania.libc.KssizeT =
    js("require('@kotlinmania/libc-native-bindings').kvmKerndisp(kd?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KssizeT
