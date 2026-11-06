package io.github.kotlinmania.libc

// Pure Kotlin opaque pointer — platform-neutral pointer representation.
// On Native, cinterop provides kotlinx.cinterop.COpaquePointer; this class
// bridges the common API so expect/actual declarations work on all targets.
@JvmInline
value class COpaquePointer(val value: Long)
