package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*

public data class MallocZoneT(
    val size: ((MallocZoneT?, COpaquePointer?) -> ULong)?,
    val malloc: ((MallocZoneT?, ULong) -> COpaquePointer?)?,
    val calloc: ((MallocZoneT?, ULong, ULong) -> COpaquePointer?)?,
    val valloc: ((MallocZoneT?, ULong) -> COpaquePointer?)?,
    val free: ((MallocZoneT?, COpaquePointer?) -> Unit)?,
    val realloc: ((MallocZoneT?, COpaquePointer?, ULong) -> COpaquePointer?)?,
    val destroy: ((MallocZoneT?) -> Unit)?,
    val zoneName: String?,
    val batchMalloc: ((MallocZoneT?, ULong, COpaquePointer?, UInt) -> UInt)?,
    val batchFree: (() -> Unit)?,
    val introspect: MallocIntrospectionT?,
    val version: UInt,
    val memalign: ((MallocZoneT?, ULong, ULong) -> COpaquePointer?)?,
    val freeDefiniteSize: ((MallocZoneT?, COpaquePointer?, ULong) -> Unit)?,
    val pressureRelief: ((MallocZoneT?, ULong) -> ULong)?,
    val claimedAddress: ((MallocZoneT?, COpaquePointer?) -> UInt)?,
)
