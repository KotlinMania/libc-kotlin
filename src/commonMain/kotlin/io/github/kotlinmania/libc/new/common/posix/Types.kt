// port-lint: source new/common/posix/mod.rs
package io.github.kotlinmania.libc.new.common.posix

/**
 * POSIX-common opaque types and lightweight value types.
 *
 * Each opaque type is declared as `expect class` here; per-target actuals reify
 * it to the platform's real representation (a `CPointer<...>` on Kotlin/Native,
 * a JNI handle on the JVM, an addon-supplied handle on Node, etc.).
 *
 * `Timespec` is a value type with the POSIX-mandated fields and constructor;
 * since POSIX requires `tv_sec: time_t` and `tv_nsec: long` semantics, it ports
 * to a plain Kotlin data class with `Long` fields on every target.
 */

/** `sched_param` — scheduling parameters object; POSIX mandates the `schedPriority` field. */
public data class SchedParam(
    public val schedPriority: Int,
)

/** `timespec` — POSIX time specification. */
public data class Timespec(
    public val tvSec: Long,
    public val tvNsec: Long,
)

/** `sigset_t` — opaque signal-mask bitset whose layout varies per platform. */
public expect class SigsetT
