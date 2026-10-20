package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.COpaquePointer

public fun interface MallocZoneSize {
    public operator fun invoke(zone: MallocZoneT?, pointer: COpaquePointer?): ULong
}

public fun interface MallocZoneAllocate {
    public operator fun invoke(zone: MallocZoneT?, size: ULong): COpaquePointer?
}

public fun interface MallocZoneCalloc {
    public operator fun invoke(zone: MallocZoneT?, count: ULong, size: ULong): COpaquePointer?
}

public fun interface MallocZoneValloc {
    public operator fun invoke(zone: MallocZoneT?, size: ULong): COpaquePointer?
}

public fun interface MallocZoneFree {
    public operator fun invoke(zone: MallocZoneT?, pointer: COpaquePointer?): Unit
}

public fun interface MallocZoneReallocate {
    public operator fun invoke(zone: MallocZoneT?, pointer: COpaquePointer?, size: ULong): COpaquePointer?
}

public fun interface MallocZoneDestroy {
    public operator fun invoke(zone: MallocZoneT?): Unit
}

public fun interface MallocZoneBatchAllocate {
    public operator fun invoke(zone: MallocZoneT?, size: ULong, results: COpaquePointer?, requestedCount: UInt): UInt
}

public fun interface MallocZoneBatchFree {
    public operator fun invoke(zone: MallocZoneT?, pointers: COpaquePointer?, count: UInt): Unit
}

public fun interface MallocZoneMemalign {
    public operator fun invoke(zone: MallocZoneT?, alignment: ULong, size: ULong): COpaquePointer?
}

public fun interface MallocZoneFreeDefiniteSize {
    public operator fun invoke(zone: MallocZoneT?, pointer: COpaquePointer?, size: ULong): Unit
}

public fun interface MallocZonePressureRelief {
    public operator fun invoke(zone: MallocZoneT?, goal: ULong): ULong
}

public fun interface MallocZoneClaimedAddress {
    public operator fun invoke(zone: MallocZoneT?, pointer: COpaquePointer?): UInt
}
