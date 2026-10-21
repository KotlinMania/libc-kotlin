package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*

public data class MallocZoneT(
    val size: MallocZoneSize?,
    val malloc: MallocZoneAllocate?,
    val calloc: MallocZoneCalloc?,
    val valloc: MallocZoneValloc?,
    val free: MallocZoneFree?,
    val realloc: MallocZoneReallocate?,
    val destroy: MallocZoneDestroy?,
    val zoneName: String?,
    val batchMalloc: MallocZoneBatchAllocate?,
    val batchFree: MallocZoneBatchFree?,
    val introspect: MallocIntrospectionT?,
    val version: UInt,
    val memalign: MallocZoneMemalign?,
    val freeDefiniteSize: MallocZoneFreeDefiniteSize?,
    val pressureRelief: MallocZonePressureRelief?,
    val claimedAddress: MallocZoneClaimedAddress?,
)
