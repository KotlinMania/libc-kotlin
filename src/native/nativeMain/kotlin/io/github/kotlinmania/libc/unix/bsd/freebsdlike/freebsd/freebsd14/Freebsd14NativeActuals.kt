@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetGetdomain(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetSetdomain(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd14_kvmKerndisp(kd?.value?.toCPointer<ByteVar>())
