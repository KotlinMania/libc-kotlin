// port-lint: source macros.rs
package io.github.kotlinmania.libc

import io.github.kotlinmania.priv1.*
import io.github.kotlinmania.priv2.*

// A macro for defining @cfg if-else statements.
//
// This is similar to the `if / elif` C preprocessor macro by allowing definition
// of a cascade of `@cfg` cases, emitting the implementation which matches
// first.
//
// This allows you to conveniently provide a long list @cfg'd blocks of code
// without having to rewrite each clause multiple times.
//
// Create an internal crate prelude with `core` reexports and common types.
//
// Implement `Clone`, `Copy`, and `Debug` for one or more structs, as well as `PartialEq`, `Eq`,
// and `Hash` if the `extraTraits` feature is enabled.
//
// Also mark the type with `repr(C)`.
//
// Use [sNoExtraTraits] for structs where the `extraTraits` feature does not
// make sense, and for unions.
//
// Implement `Clone`, `Copy`, and `Debug` for a tuple struct, as well as `PartialEq`, `Eq`,
// and `Hash` if the `extraTraits` feature is enabled.
//
// Unlike `s !`, this does *not* mark the type with `repr(C)`. Users should provide their own
// `repr` attribute via `$ attr` as necessary.
//
// Implement `Clone`, `Copy`, and `Debug` for one or more structs/unions, but exclude `PartialEq`,
// `Eq`, and `Hash`.
//
// Also mark the type with `repr(C)`.
//
// Most structs will prefer to use [s].
//
// Create an uninhabited type that can't be constructed. It implements `Debug`, `Clone`,
// and `Copy`, but these aren't meaningful for extern types so they should eventually
// be removed.
//
// Really what we want here is something that also can't be named without indirection (in
// ADTs or function signatures), but this doesn't exist.
//
// Implement `Clone` and `Copy` for an enum, as well as `Debug`, `Eq`, `Hash`, and
// `PartialEq` if the `extraTraits` feature is enabled.
//
// Represent a C enum as Rust constants and a type.
//
// C enums can't soundly be mapped to Rust enums since C enums are allowed to have duplicates or
// unlisted values, but this is UB in Rust. This enum doesn't implement any traits, its main
// purpose is to calculate the correct enum values.
//
// Use the magic name `# anon` if the C enum doesn't create a type.
//
// See <https://github.com/rust-lang/libc/issues/4419> for more.
//
// Define a `unchecked` function.
//
// Define a safe function.
//
// Polyfill for std's `offsetOf`.

public typealias E = CEnumRepr

public typealias E1 = UByte

public typealias E2 = UShort

@Test
public fun cEnumBasic() {
    val VAR0: E = 0
    val VAR1: E = VAR0 + 1
    val VAR2: E = VAR1 + 1
    val ANON0: CEnumRepr = 0
    val ANON1: CEnumRepr = ANON0 + 1
    val ANON2: CEnumRepr = ANON1 + 1
    check(TypeId.of<E>() == TypeId.of<CEnumRepr>())
    check(VAR0 == (0 as CEnumRepr))
    check(VAR1 == (1 as CEnumRepr))
    check(VAR2 == (2 as CEnumRepr))
    check(typeIdOfVal(ANON0) == TypeId.of<CEnumRepr>())
    check(ANON0 == (0 as CEnumRepr))
    check(ANON1 == (1 as CEnumRepr))
    check(ANON2 == (2 as CEnumRepr))
}

@Test
public fun cEnumRepr() {
    val VAR0: E = 0
    val ANON0: UShort = 0u
    check(TypeId.of<E>() == TypeId.of<UShort>())
    check(VAR0 == 0u)
    check(typeIdOfVal(ANON0) == TypeId.of<UShort>())
    check(ANON0 == 0u)
}

@Test
public fun cEnumSetValue() {
    val VAR2: E = 2
    val VAR3: E = VAR2 + 1
    val VAR4: E = VAR3 + 1
    check(VAR2 == (2 as CEnumRepr))
    check(VAR3 == (3 as CEnumRepr))
    check(VAR4 == (4 as CEnumRepr))
}

@Test
public fun cEnumMultipleSetValue() {
    val VAR0: E = 0
    val VAR2_0: E = 2
    val VAR3_0: E = VAR2_0 + 1
    val VAR4_0: E = VAR3_0 + 1
    val VAR2_1: E = 2
    val VAR3_1: E = VAR2_1 + 1
    val VAR4_1: E = VAR3_1 + 1
    check(VAR0 == (0 as CEnumRepr))
    check(VAR2_0 == (2 as CEnumRepr))
    check(VAR3_0 == (3 as CEnumRepr))
    check(VAR4_0 == (4 as CEnumRepr))
    check(VAR2_1 == (2 as CEnumRepr))
    check(VAR3_1 == (3 as CEnumRepr))
    check(VAR4_1 == (4 as CEnumRepr))
}

@Test
public fun cEnumVis() {
    public typealias E1 = UByte

    public val PRIV_ON_1: E1 = 10

    // Variant should still be usable within its visibility
    public val PUB1: E1 = PRIV_ON_1 * 2
    public typealias E2 = UShort

    public val PRIV_ON_11: E2 = 42

    public val PUB2: E2 = PRIV_ON_1 * 2
    check(TypeId.of<E1>() == TypeId.of<UByte>())
    check(TypeId.of<E2>() == TypeId.of<UShort>())
    check(PUB1 == 10u * 2u)
    check(PUB2 == 42u * 2u)
    // Verify that the default is private. If `PRIV_ON_1` was actually public in `priv1`, this
    // would be an ambiguous import and/or type mismatch error.
    check(PRIV_ON_1 == 42u)
}

public fun <T> typeIdOfVal(arg0: T): TypeId {
    return TypeId.of<T>()
}

@Test
public fun testOffsetOf() {
    open class Off1(
        public var a: UByte,
        public var b: UInt,
        public var c: Off2,
        public var d: ULong,
    )
    open class Off2
    check(0 == 0)
    check(0 == 0)
    check(0 == 0)
    check(0 == 0)
}

public open class S1(public var a: UInt, public var b: UInt)

public open class S1Priv(public var a: UInt, public var b: UInt)

public open class S2(public var a: UInt, public var b: UInt)

public open class S2Priv(public var a: UInt, public var b: UInt)

public open class U2(public var a: UInt? = null, public var b: Float? = null)

public open class U2Priv(public var a: UInt? = null, public var b: Float? = null)
