package io.github.kotlinmania.libc

import kotlin.jvm.JvmInline

// Pure Kotlin opaque pointer — platform-neutral pointer representation.
// On Native, cinterop provides kotlinx.cinterop.COpaquePointer; this class
// bridges the common API so expect/actual declarations work on all targets.
@JvmInline
public value class COpaquePointer(public val value: Long) {
    public val address: Long get() = value
}

public val Any.value: Long
    get() = when (this) {
        is COpaquePointer -> this.value
        is Number -> this.toLong()
        is UByte -> this.toLong()
        is UShort -> this.toLong()
        is UInt -> this.toLong()
        is ULong -> this.toLong()
        else -> this.hashCode().toLong()
    }
