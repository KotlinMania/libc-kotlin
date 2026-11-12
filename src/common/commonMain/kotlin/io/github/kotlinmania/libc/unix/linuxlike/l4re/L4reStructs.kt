package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<L4SchedCpuSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<L4SchedCpuSetT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): L4SchedCpuSetT =
                    L4SchedCpuSetT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: L4SchedCpuSetT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.granOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.map)
                }
            }
    }
}

public class PthreadAttrT internal constructor(
    public var detachstate: CInt,
    public var schedpolicy: CInt,
    public var schedparam: SchedParam,
    public var inheritsched: CInt,
    public var scope: CInt,
    public var guardsize: SizeT,
    public var stackaddrSet: CInt,
    stackaddrCtorArg: MutPtr,
    // better don't use it
    public var stacksize: SizeT,
    // L4Re specifics
    public var affinity: L4SchedCpuSetT,
    public var createFlags: CUint,
) {
    public var stackaddr: MutPtr = stackaddrCtorArg
        internal set

    public constructor() : this(
        detachstate = 0,
        schedpolicy = 0,
        schedparam = SchedParam(),
        inheritsched = 0,
        scope = 0,
        guardsize = 0uL,
        stackaddrSet = 0,
        stackaddrCtorArg = MutPtr(0L),
        stacksize = 0uL,
        affinity = L4SchedCpuSetT(),
        createFlags = 0u,
    )

    public operator fun component1(): CInt = this.detachstate

    public operator fun component2(): CInt = this.schedpolicy

    public operator fun component3(): SchedParam = this.schedparam

    public operator fun component4(): CInt = this.inheritsched

    public operator fun component5(): CInt = this.scope

    public operator fun component6(): SizeT = this.guardsize

    public operator fun component7(): CInt = this.stackaddrSet

    public operator fun component8(): MutPtr = this.stackaddr

    public operator fun component9(): SizeT = this.stacksize

    public operator fun component10(): L4SchedCpuSetT = this.affinity

    public operator fun component11(): CUint = this.createFlags

    public fun copy(detachstate: CInt = this.detachstate, schedpolicy: CInt = this.schedpolicy, schedparam: SchedParam = this.schedparam, inheritsched: CInt = this.inheritsched, scope: CInt = this.scope, guardsize: SizeT = this.guardsize, stackaddrSet: CInt = this.stackaddrSet, stackaddr: MutPtr = this.stackaddr, stacksize: SizeT = this.stacksize, affinity: L4SchedCpuSetT = this.affinity, createFlags: CUint = this.createFlags): PthreadAttrT = PthreadAttrT(detachstate = detachstate, schedpolicy = schedpolicy, schedparam = schedparam, inheritsched = inheritsched, scope = scope, guardsize = guardsize, stackaddrSet = stackaddrSet, stackaddrCtorArg = stackaddr, stacksize = stacksize, affinity = affinity, createFlags = createFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.detachstate != other.detachstate) return false
        if (this.schedpolicy != other.schedpolicy) return false
        if (this.schedparam != other.schedparam) return false
        if (this.inheritsched != other.inheritsched) return false
        if (this.scope != other.scope) return false
        if (this.guardsize != other.guardsize) return false
        if (this.stackaddrSet != other.stackaddrSet) return false
        if (this.stackaddr != other.stackaddr) return false
        if (this.stacksize != other.stacksize) return false
        if (this.affinity != other.affinity) return false
        if (this.createFlags != other.createFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.detachstate.hashCode()
        result = 31 * result + this.schedpolicy.hashCode()
        result = 31 * result + this.schedparam.hashCode()
        result = 31 * result + this.inheritsched.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.guardsize.hashCode()
        result = 31 * result + this.stackaddrSet.hashCode()
        result = 31 * result + this.stackaddr.hashCode()
        result = 31 * result + this.stacksize.hashCode()
        result = 31 * result + this.affinity.hashCode()
        result = 31 * result + this.createFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            detachstate: CInt = 0,
            schedpolicy: CInt = 0,
            schedparam: SchedParam = SchedParam(),
            inheritsched: CInt = 0,
            scope: CInt = 0,
            guardsize: SizeT = 0uL,
            stackaddrSet: CInt = 0,
            stackaddr: MutPtr = MutPtr(0L),
            stacksize: SizeT = 0uL,
            affinity: L4SchedCpuSetT = L4SchedCpuSetT(),
            createFlags: CUint = 0u,
        ): PthreadAttrT =
            PthreadAttrT(
                detachstate = detachstate,
                schedpolicy = schedpolicy,
                schedparam = schedparam,
                inheritsched = inheritsched,
                scope = scope,
                guardsize = guardsize,
                stackaddrSet = stackaddrSet,
                stackaddrCtorArg = stackaddr,
                stacksize = stacksize,
                affinity = affinity,
                createFlags = createFlags,
            )
    }
}
