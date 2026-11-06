@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_freelocale(loc.toInt())
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_cpuset_getdomain(level.toInt(), which.toInt(), id, setsize, mask?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_cpuset_setdomain(level.toInt(), which.toInt(), id, setsize, mask?.value?.toCPointer<ByteVar>(), policy)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun kvmKerndisp(kd: KvmT?): io.github.kotlinmania.libc.KssizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.cinterop.libc_freebsd15_mod_kvm_kerndisp(kd?.value?.toCPointer<ByteVar>())
