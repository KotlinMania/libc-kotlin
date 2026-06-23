// port-lint: source macros.rs
package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class S1(
    val a: UInt,
    val b: UInt,
)

public data class S2(
    val a: UInt,
    val b: UInt,
)

// C union; only one variant is valid at a time.
public data class U2(
    val a: UInt? = null,
    val b: Float? = null,
)

public typealias E = CUInt
public const val VAR0: E = 0u
public const val VAR1: E = 1u
public const val VAR2: E = 2u
public typealias E = CUInt
public const val VAR0: E = 0u
public typealias E = CUInt
public const val VAR2: E = 2u
public const val VAR3: E = 3u
public const val VAR4: E = 4u
public typealias E = CUInt
public const val VAR0: E = 0u
public const val VAR2_0: E = 2u
public const val VAR3_0: E = 3u
public const val VAR4_0: E = 4u
public const val VAR2_1: E = 2u
public const val VAR3_1: E = 3u
public const val VAR4_1: E = 4u
public typealias E1 = CUInt
public const val PRIV_ON_1: E1 = 10u
public const val PUB1: E1 = PRIV_ON_1 * 2
public typealias E2 = CUInt
public const val PRIV_ON_1: E2 = 42u
public const val PUB2: E2 = PRIV_ON_1 * 2
