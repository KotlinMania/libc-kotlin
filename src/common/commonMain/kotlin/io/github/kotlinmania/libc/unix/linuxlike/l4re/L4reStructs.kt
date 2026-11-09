package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

/**
 * CPU sets.
 */
public data class L4SchedCpuSetT(
    // from the L4Re docs
    /**
     * Combination of granularity and offset.
     *
     * The granularity defines how many CPUs each bit in map describes.
     * The offset is the number of the first CPU described by the first
     * bit in the bitmap.
     * offset must be a multiple of 2^graularity.
     *
     * | MSB              |                 LSB |
     * | ---------------- | ------------------- |
     * | 8bit granularity | 24bit offset ..     |
     */
    public var granOffset: L4UmwordT = 0uL,
    /**
     * Bitmap of CPUs.
     */
    public var map: L4UmwordT = 0uL,
)

public data class PthreadAttrT(
    public var detachstate: CInt = 0,
    public var schedpolicy: CInt = 0,
    public var schedparam: SchedParam = SchedParam(),
    public var inheritsched: CInt = 0,
    public var scope: CInt = 0,
    public var guardsize: SizeT = 0uL,
    public var stackaddrSet: CInt = 0,
    public var stackaddr: COpaquePointer? = null,
    // better don't use it
    public var stacksize: SizeT = 0uL,
    // L4Re specifics
    public var affinity: L4SchedCpuSetT = L4SchedCpuSetT(),
    public var createFlags: CUint = 0u,
)
