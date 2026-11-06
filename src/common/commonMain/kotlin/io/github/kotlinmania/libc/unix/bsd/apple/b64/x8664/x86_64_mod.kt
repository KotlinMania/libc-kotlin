// port-lint: source unix/bsd/apple/b64/x86_64/x86_64_mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.UintptrT

public fun interface MallocZoneTSizeCallback {
    public operator fun invoke(zone: MallocZoneT?, ptr: COpaquePointer?): SizeT
}

public fun interface MallocZoneTMallocCallback {
    public operator fun invoke(zone: MallocZoneT?, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTCallocCallback {
    public operator fun invoke(zone: MallocZoneT?, numItems: SizeT, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTFreeCallback {
    public operator fun invoke(zone: MallocZoneT?, ptr: COpaquePointer?)
}

public fun interface MallocZoneTReallocCallback {
    public operator fun invoke(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTDestroyCallback {
    public operator fun invoke(zone: MallocZoneT?)
}

public fun interface MallocZoneTBatchMallocCallback {
    public operator fun invoke(zone: MallocZoneT?, size: SizeT, results: COpaquePointer?, numRequested: CUint): CUint
}

public fun interface MallocZoneTBatchFreeCallback {
    public operator fun invoke(zone: MallocZoneT?, toBeFreed: COpaquePointer?, numToBeFreed: CUint)
}

public fun interface MallocZoneTFreeDefiniteSizeCallback {
    public operator fun invoke(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT)
}

public fun interface MallocZoneTPressureReliefCallback {
    public operator fun invoke(zone: MallocZoneT?, goal: SizeT): SizeT
}

public fun interface MallocZoneTClaimedAddressCallback {
    public operator fun invoke(zone: MallocZoneT?, ptr: COpaquePointer?): io.github.kotlinmania.libc.BooleanT
}

public typealias BooleanT = CUint

public open class MallocIntrospectionT(public var private: List<UintptrT>)

public open class MallocZoneT(
    public var reserved1: COpaquePointer?,
    public var reserved2: COpaquePointer?,
    public var size: MallocZoneTSizeCallback?,
    public var malloc: MallocZoneTMallocCallback?,
    public var calloc: MallocZoneTCallocCallback?,
    public var valloc: MallocZoneTMallocCallback?,
    public var free: MallocZoneTFreeCallback?,
    public var realloc: MallocZoneTReallocCallback?,
    public var destroy: MallocZoneTDestroyCallback?,
    public var zoneName: COpaquePointer?,
    public var batchMalloc: MallocZoneTBatchMallocCallback?,
    public var batchFree: MallocZoneTBatchFreeCallback?,
    public var introspect: MallocIntrospectionT?,
    public var version: CUint,
    public var memalign: MallocZoneTCallocCallback?,
    public var freeDefiniteSize: MallocZoneTFreeDefiniteSizeCallback?,
    public var pressureRelief: MallocZoneTPressureReliefCallback?,
    public var claimedAddress: MallocZoneTClaimedAddressCallback?,
)

public open class MaxAlignT(public var priv: List<Double>)
