@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface MallocZoneTSizeCallback {
    public operator fun invoke(zone: MutPtr, ptr: ConstPtr): SizeT
}

public fun interface MallocZoneTMallocCallback {
    public operator fun invoke(zone: MutPtr, size: SizeT): MutPtr
}

public fun interface MallocZoneTCallocCallback {
    public operator fun invoke(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr
}

public fun interface MallocZoneTFreeCallback {
    public operator fun invoke(zone: MutPtr, ptr: MutPtr)
}

public fun interface MallocZoneTReallocCallback {
    public operator fun invoke(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr
}

public fun interface MallocZoneTDestroyCallback {
    public operator fun invoke(zone: MutPtr)
}

public fun interface MallocZoneTBatchMallocCallback {
    public operator fun invoke(zone: MutPtr, size: SizeT, results: MutPtr, numRequested: CUint): CUint
}

public fun interface MallocZoneTBatchFreeCallback {
    public operator fun invoke(zone: MutPtr, toBeFreed: MutPtr, numToBeFreed: CUint)
}

public fun interface MallocZoneTFreeDefiniteSizeCallback {
    public operator fun invoke(zone: MutPtr, ptr: MutPtr, size: SizeT)
}

public fun interface MallocZoneTPressureReliefCallback {
    public operator fun invoke(zone: MutPtr, goal: SizeT): SizeT
}

public fun interface MallocZoneTClaimedAddressCallback {
    public operator fun invoke(zone: MutPtr, ptr: MutPtr): BooleanT
}

public data class MallocIntrospectionT(
    public var private: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MallocIntrospectionT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int = this.private.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocIntrospectionT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocIntrospectionT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): MallocIntrospectionT =
                    MallocIntrospectionT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: MallocIntrospectionT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr, value.private.toList())
                }
            }
    }
}

public class MallocZoneT internal constructor(
    reserved1CtorArg: MutPtr,
    reserved2CtorArg: MutPtr,
    public var size: MallocZoneTSizeCallback?,
    public var malloc: MallocZoneTMallocCallback?,
    public var calloc: MallocZoneTCallocCallback?,
    public var valloc: MallocZoneTMallocCallback?,
    public var free: MallocZoneTFreeCallback?,
    public var realloc: MallocZoneTReallocCallback?,
    public var destroy: MallocZoneTDestroyCallback?,
    zoneNameCtorArg: ConstPtr,
    public var batchMalloc: MallocZoneTBatchMallocCallback?,
    public var batchFree: MallocZoneTBatchFreeCallback?,
    introspectCtorArg: MutPtr,
    public var version: CUint,
    public var memalign: MallocZoneTCallocCallback?,
    public var freeDefiniteSize: MallocZoneTFreeDefiniteSizeCallback?,
    public var pressureRelief: MallocZoneTPressureReliefCallback?,
    public var claimedAddress: MallocZoneTClaimedAddressCallback?,
) {
    public var reserved1: MutPtr = reserved1CtorArg
        internal set

    public var reserved2: MutPtr = reserved2CtorArg
        internal set

    public var zoneName: ConstPtr = zoneNameCtorArg
        internal set

    public var introspect: MutPtr = introspectCtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = MutPtr(0L),
        reserved2CtorArg = MutPtr(0L),
        size = null,
        malloc = null,
        calloc = null,
        valloc = null,
        free = null,
        realloc = null,
        destroy = null,
        zoneNameCtorArg = ConstPtr(0L),
        batchMalloc = null,
        batchFree = null,
        introspectCtorArg = MutPtr(0L),
        version = 0u,
        memalign = null,
        freeDefiniteSize = null,
        pressureRelief = null,
        claimedAddress = null,
    )

    public companion object {
        public operator fun invoke(
            reserved1: MutPtr = MutPtr(0L),
            reserved2: MutPtr = MutPtr(0L),
            size: MallocZoneTSizeCallback? = null,
            malloc: MallocZoneTMallocCallback? = null,
            calloc: MallocZoneTCallocCallback? = null,
            valloc: MallocZoneTMallocCallback? = null,
            free: MallocZoneTFreeCallback? = null,
            realloc: MallocZoneTReallocCallback? = null,
            destroy: MallocZoneTDestroyCallback? = null,
            zoneName: ConstPtr = ConstPtr(0L),
            batchMalloc: MallocZoneTBatchMallocCallback? = null,
            batchFree: MallocZoneTBatchFreeCallback? = null,
            introspect: MutPtr = MutPtr(0L),
            version: CUint = 0u,
            memalign: MallocZoneTCallocCallback? = null,
            freeDefiniteSize: MallocZoneTFreeDefiniteSizeCallback? = null,
            pressureRelief: MallocZoneTPressureReliefCallback? = null,
            claimedAddress: MallocZoneTClaimedAddressCallback? = null,
        ): MallocZoneT =
            MallocZoneT(
                reserved1CtorArg = reserved1,
                reserved2CtorArg = reserved2,
                size = size,
                malloc = malloc,
                calloc = calloc,
                valloc = valloc,
                free = free,
                realloc = realloc,
                destroy = destroy,
                zoneNameCtorArg = zoneName,
                batchMalloc = batchMalloc,
                batchFree = batchFree,
                introspectCtorArg = introspect,
                version = version,
                memalign = memalign,
                freeDefiniteSize = freeDefiniteSize,
                pressureRelief = pressureRelief,
                claimedAddress = claimedAddress,
            )
    }
}

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (2).toInt())
                        ).readNative(addr).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (2).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}
