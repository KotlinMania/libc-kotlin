package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import offT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs in FreeBSD 13 that have changed since 11.
public typealias NlinkT = ULong

public typealias DevT = ULong

public typealias InoT = ULong

public typealias ShmattT = CUint

public typealias KpaddrT = ULong

public typealias KssizeT = Long

public typealias DomainsetT = CAnonymousDomainset

public val RAND_MAX: CInt = 0x7fffffff

public val ELAST: CInt = 97

public val KF_TYPE_EVENTFD: CInt = 13

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 255

public val KI_NSPARE_PTR: Int = 5

/**
 * domainset policies
 */
public val DOMAINSET_POLICY_INVALID: CInt = 0

public val DOMAINSET_POLICY_ROUNDROBIN: CInt = 1

public val DOMAINSET_POLICY_FIRSTTOUCH: CInt = 2

public val DOMAINSET_POLICY_PREFER: CInt = 3

public val DOMAINSET_POLICY_INTERLEAVE: CInt = 4

public val MINCORE_SUPER: CInt = 0x20

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT {
    return LibcDynamicFfi.invoke("msgrcv", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgtyp, msgflg.toLong()))
}

public fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_5 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("cpuset_getdomain", -1, longArrayOf(__scratch_0, __scratch_1, id.toLong(), setsize.toLong(), mask?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("cpuset_setdomain", -1, longArrayOf(__scratch_0, __scratch_1, id.toLong(), setsize.toLong(), mask?.value ?: 0L, policy.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun basename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    LibcDynamicFfi.invoke("qsort_r@FBSD_1.0", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), arg?.value ?: 0L, compar?.value ?: 0L))
}

public fun kvmKerndisp(kd: KvmT?): KssizeT {
    return LibcDynamicFfi.invoke("kvm_kerndisp", -1, longArrayOf(kd?.value ?: 0L))
}
