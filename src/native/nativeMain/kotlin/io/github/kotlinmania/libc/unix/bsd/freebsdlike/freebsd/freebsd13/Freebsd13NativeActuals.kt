@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetGetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetSetdomain
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_kvmKerndisp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_msgrcv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_qsortR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.cinterop.libc_unix_bsd_freebsdlike_freebsd_freebsd13_setgrent
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetGetdomain(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_cpusetSetdomain(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    libc_unix_bsd_freebsdlike_freebsd_freebsd13_kvmKerndisp(kd?.value?.toCPointer<ByteVar>())
