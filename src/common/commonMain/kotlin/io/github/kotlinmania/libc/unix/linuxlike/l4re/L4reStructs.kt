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
public open class L4SchedCpuSetT(
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
    public var granOffset: L4UmwordT,
    /**
     * Bitmap of CPUs.
     */
    public var map: L4UmwordT,
)

public open class PthreadAttrT(
    public var detachstate: CInt,
    public var schedpolicy: CInt,
    public var schedparam: SchedParam,
    public var inheritsched: CInt,
    public var scope: CInt,
    public var guardsize: SizeT,
    public var stackaddrSet: CInt,
    public var stackaddr: COpaquePointer?,
    // better don't use it
    public var stacksize: SizeT,
    // L4Re specifics
    public var affinity: L4SchedCpuSetT,
    public var createFlags: CUint,
)
