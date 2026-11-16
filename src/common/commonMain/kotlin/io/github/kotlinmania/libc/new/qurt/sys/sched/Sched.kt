// port-lint: source new/qurt/sys/sched.rs
package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `sys / sched.h`
//
// QuRT scheduling parameters and functions.

// Scheduling policies (from QuRT sys/sched.h)
public val SCHED_FIFO: CInt = 0

public val SCHED_RR: CInt = 1

public val SCHED_SPORADIC: CInt = 2

public val SCHED_OTHER: CInt = 3

public class SchedParam internal constructor(
    unsupportedBranchCtorArg: MutPtr,
    public var schedPriority: CInt,
) {
    public var unsupportedBranch: MutPtr = unsupportedBranchCtorArg
        internal set

    public constructor() : this(
        unsupportedBranchCtorArg = MutPtr(0L),
        schedPriority = 0,
    )

    public operator fun component1(): MutPtr = this.unsupportedBranch

    public operator fun component2(): CInt = this.schedPriority

    public fun copy(unsupportedBranch: MutPtr = this.unsupportedBranch, schedPriority: CInt = this.schedPriority): SchedParam = SchedParam(unsupportedBranchCtorArg = unsupportedBranch, schedPriority = schedPriority)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.unsupportedBranch != other.unsupportedBranch) return false
        if (this.schedPriority != other.schedPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unsupportedBranch.hashCode()
        result = 31 * result + this.schedPriority.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.unsupportedBranch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.schedPriority)
                }
            }

        public operator fun invoke(
            unsupportedBranch: MutPtr = MutPtr(0L),
            schedPriority: CInt = 0,
        ): SchedParam =
            SchedParam(
                unsupportedBranchCtorArg = unsupportedBranch,
                schedPriority = schedPriority,
            )
    }
}

public expect fun schedYield(): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt
