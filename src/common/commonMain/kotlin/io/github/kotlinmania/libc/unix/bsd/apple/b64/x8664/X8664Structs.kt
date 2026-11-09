@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT

public fun interface MallocZoneTSizeCallback {
    public operator fun invoke(zone: COpaquePointer?, ptr: COpaquePointer?): SizeT
}

public fun interface MallocZoneTMallocCallback {
    public operator fun invoke(zone: COpaquePointer?, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTCallocCallback {
    public operator fun invoke(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTFreeCallback {
    public operator fun invoke(zone: COpaquePointer?, ptr: COpaquePointer?)
}

public fun interface MallocZoneTReallocCallback {
    public operator fun invoke(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer?
}

public fun interface MallocZoneTDestroyCallback {
    public operator fun invoke(zone: COpaquePointer?)
}

public fun interface MallocZoneTBatchMallocCallback {
    public operator fun invoke(zone: COpaquePointer?, size: SizeT, results: COpaquePointer?, numRequested: CUint): CUint
}

public fun interface MallocZoneTBatchFreeCallback {
    public operator fun invoke(zone: COpaquePointer?, toBeFreed: COpaquePointer?, numToBeFreed: CUint)
}

public fun interface MallocZoneTFreeDefiniteSizeCallback {
    public operator fun invoke(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT)
}

public fun interface MallocZoneTPressureReliefCallback {
    public operator fun invoke(zone: COpaquePointer?, goal: SizeT): SizeT
}

public fun interface MallocZoneTClaimedAddressCallback {
    public operator fun invoke(zone: COpaquePointer?, ptr: COpaquePointer?): BooleanT
}

public data class MallocIntrospectionT(public var private: ULongArray = ULongArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MallocIntrospectionT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.private.contentHashCode()
    }
}

public class MallocZoneT(
    public var reserved1: COpaquePointer? = null,
    public var reserved2: COpaquePointer? = null,
    public var size: MallocZoneTSizeCallback? = null,
    public var malloc: MallocZoneTMallocCallback? = null,
    public var calloc: MallocZoneTCallocCallback? = null,
    public var valloc: MallocZoneTMallocCallback? = null,
    public var free: MallocZoneTFreeCallback? = null,
    public var realloc: MallocZoneTReallocCallback? = null,
    public var destroy: MallocZoneTDestroyCallback? = null,
    public var zoneName: COpaquePointer? = null,
    public var batchMalloc: MallocZoneTBatchMallocCallback? = null,
    public var batchFree: MallocZoneTBatchFreeCallback? = null,
    public var introspect: MallocIntrospectionT? = null,
    public var version: CUint = 0u,
    public var memalign: MallocZoneTCallocCallback? = null,
    public var freeDefiniteSize: MallocZoneTFreeDefiniteSizeCallback? = null,
    public var pressureRelief: MallocZoneTPressureReliefCallback? = null,
    public var claimedAddress: MallocZoneTClaimedAddressCallback? = null,
)

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}
