@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT

public actual fun setgrent(): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun freelocale(loc: LocaleT): CInt =
    0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    0

public actual fun dirname(path: String?): COpaquePointer? =
    null

public actual fun basename(path: String?): COpaquePointer? =
    null

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: FnCallback?) {
}
