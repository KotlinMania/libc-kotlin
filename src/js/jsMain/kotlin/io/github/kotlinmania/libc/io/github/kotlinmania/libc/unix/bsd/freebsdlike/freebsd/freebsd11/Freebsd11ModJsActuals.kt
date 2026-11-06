package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setgrent(): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgrent()") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun freelocale(loc: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)") as CInt

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)") as CInt

public actual fun dirname(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)")
}
