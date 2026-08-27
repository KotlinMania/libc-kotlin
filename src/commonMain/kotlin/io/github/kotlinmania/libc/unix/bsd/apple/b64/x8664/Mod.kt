// port-lint: source libc/src/unix/bsd/apple/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664

import io.github.kotlinmania.libc.*

public typealias BooleanT = CUInt

public data class MallocIntrospectionT(
    val private: List<UintptrT>,
)

public data class MallocZoneT(
    val size: ((MallocZoneT?, COpaquePointer?) -> ULong)?,
    val malloc: ((MallocZoneT?, ULong) -> COpaquePointer?)?,
    val calloc: ((MallocZoneT?, ULong, ULong) -> COpaquePointer?)?,
    val valloc: ((MallocZoneT?, ULong) -> COpaquePointer?)?,
    val free: ((MallocZoneT?, COpaquePointer?) -> Unit)?,
    val realloc: ((MallocZoneT?, COpaquePointer?, ULong) -> COpaquePointer?)?,
    val destroy: ((MallocZoneT?) -> Unit)?,
    val zoneName: String?,
    val batchMalloc: ((MallocZoneT?, ULong, COpaquePointer?, CUInt) -> CUInt)?,
    val batchFree: (() -> Unit)?,
    val introspect: MallocIntrospectionT?,
    val version: CUInt,
    val memalign: ((MallocZoneT?, ULong, ULong) -> COpaquePointer?)?,
    val freeDefiniteSize: ((MallocZoneT?, COpaquePointer?, ULong) -> Unit)?,
    val pressureRelief: ((MallocZoneT?, ULong) -> ULong)?,
    val claimedAddress: ((MallocZoneT?, COpaquePointer?) -> BooleanT)?,
)

public data class MaxAlignT(
    val priv: List<Double>,
)
