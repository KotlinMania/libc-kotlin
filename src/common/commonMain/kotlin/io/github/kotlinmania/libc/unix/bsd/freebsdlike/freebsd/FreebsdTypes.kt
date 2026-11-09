package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.UidT

public typealias FflagsT = UInt

public typealias VmProtT = UChar

public typealias KvaddrT = ULong

public typealias SegszT = Long

public typealias FixptT = UInt

public typealias LwpidT = Int

public typealias BlksizeT = Int

public typealias KsizeT = ULong

public typealias InpGenT = ULong

public typealias SoGenT = ULong

public typealias ClockidT = CInt

public typealias SemT = Sem

public typealias TimerT = COpaquePointer?

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias MsglenT = CUlong

public typealias MsgqnumT = CUlong

public typealias CpulevelT = CInt

public typealias CpuwhichT = CInt

public typealias MqdT = COpaquePointer?

public typealias PthreadSpinlockT = COpaquePointer?

public typealias PthreadBarrierattrT = CAnonymousPthreadBarrierattr?

public typealias PthreadBarrierT = CAnonymousPthreadBarrier?

public typealias UuidT = Uuid

public typealias UInt = CUint

public typealias UChar = CUchar

public typealias ULong = CUlong

public typealias UShort = CUshort

public typealias CaddrT = COpaquePointer?

public typealias FhandleT = Fhandle

public typealias AuIdT = UidT

public typealias AuAsidT = PidT

public typealias CpusetidT = CInt

public typealias SctpAssocT = UInt

public typealias EventfdT = ULong

public sealed class DevstatSupportFlags(public val value: UInt) {
    public data object DevstatAllSupported : DevstatSupportFlags(0x00u)
    public data object DevstatNoBlocksize : DevstatSupportFlags(0x01u)
    public data object DevstatNoOrderedTags : DevstatSupportFlags(0x02u)
    public data object DevstatBsUnavailable : DevstatSupportFlags(0x04u)

    public open fun clone(): DevstatSupportFlags {
        return this
    }
}

public sealed class DevstatTransFlags(public val value: UInt) {
    public data object DevstatNoData : DevstatTransFlags(0x00u)
    public data object DevstatRead : DevstatTransFlags(0x01u)
    public data object DevstatWrite : DevstatTransFlags(0x02u)
    public data object DevstatFree : DevstatTransFlags(0x03u)

    public open fun clone(): DevstatTransFlags {
        return this
    }
}

public sealed class DevstatTagType(public val value: UInt) {
    public data object DevstatTagSimple : DevstatTagType(0x00u)
    public data object DevstatTagHead : DevstatTagType(0x01u)
    public data object DevstatTagOrdered : DevstatTagType(0x02u)
    public data object DevstatTagNone : DevstatTagType(0x03u)

    public open fun clone(): DevstatTagType {
        return this
    }
}

public sealed class DevstatMatchFlags(public val value: UInt) {
    public data object DevstatMatchNone : DevstatMatchFlags(0x00u)
    public data object DevstatMatchType : DevstatMatchFlags(0x01u)
    public data object DevstatMatchIf : DevstatMatchFlags(0x02u)
    public data object DevstatMatchPass : DevstatMatchFlags(0x04u)

    public open fun clone(): DevstatMatchFlags {
        return this
    }
}

public sealed class DevstatPriority(public val value: UInt) {
    public data object DevstatPriorityMin : DevstatPriority(0x000u)
    public data object DevstatPriorityOther : DevstatPriority(0x020u)
    public data object DevstatPriorityPass : DevstatPriority(0x030u)
    public data object DevstatPriorityFd : DevstatPriority(0x040u)
    public data object DevstatPriorityWfd : DevstatPriority(0x050u)
    public data object DevstatPriorityTape : DevstatPriority(0x060u)
    public data object DevstatPriorityCd : DevstatPriority(0x090u)
    public data object DevstatPriorityDisk : DevstatPriority(0x110u)
    public data object DevstatPriorityArray : DevstatPriority(0x120u)
    public data object DevstatPriorityMax : DevstatPriority(0xfffu)

    public open fun clone(): DevstatPriority {
        return this
    }
}

public sealed class DevstatTypeFlags(public val value: UInt) {
    public data object DevstatTypeDirect : DevstatTypeFlags(0x000u)
    public data object DevstatTypeSequential : DevstatTypeFlags(0x001u)
    public data object DevstatTypePrinter : DevstatTypeFlags(0x002u)
    public data object DevstatTypeProcessor : DevstatTypeFlags(0x003u)
    public data object DevstatTypeWorm : DevstatTypeFlags(0x004u)
    public data object DevstatTypeCdrom : DevstatTypeFlags(0x005u)
    public data object DevstatTypeScanner : DevstatTypeFlags(0x006u)
    public data object DevstatTypeOptical : DevstatTypeFlags(0x007u)
    public data object DevstatTypeChanger : DevstatTypeFlags(0x008u)
    public data object DevstatTypeComm : DevstatTypeFlags(0x009u)
    public data object DevstatTypeAsc0 : DevstatTypeFlags(0x00au)
    public data object DevstatTypeAsc1 : DevstatTypeFlags(0x00bu)
    public data object DevstatTypeStorarray : DevstatTypeFlags(0x00cu)
    public data object DevstatTypeEnclosure : DevstatTypeFlags(0x00du)
    public data object DevstatTypeFloppy : DevstatTypeFlags(0x00eu)
    public data object DevstatTypeMask : DevstatTypeFlags(0x00fu)
    public data object DevstatTypeIfScsi : DevstatTypeFlags(0x010u)
    public data object DevstatTypeIfIde : DevstatTypeFlags(0x020u)
    public data object DevstatTypeIfOther : DevstatTypeFlags(0x030u)
    public data object DevstatTypeIfMask : DevstatTypeFlags(0x0f0u)
    public data object DevstatTypePass : DevstatTypeFlags(0x100u)

    public open fun clone(): DevstatTypeFlags {
        return this
    }
}

public sealed class DevstatMetric {
    public data object DsmNone : DevstatMetric()
    public data object DsmTotalBytes : DevstatMetric()
    public data object DsmTotalBytesRead : DevstatMetric()
    public data object DsmTotalBytesWrite : DevstatMetric()
    public data object DsmTotalTransfers : DevstatMetric()
    public data object DsmTotalTransfersRead : DevstatMetric()
    public data object DsmTotalTransfersWrite : DevstatMetric()
    public data object DsmTotalTransfersOther : DevstatMetric()
    public data object DsmTotalBlocks : DevstatMetric()
    public data object DsmTotalBlocksRead : DevstatMetric()
    public data object DsmTotalBlocksWrite : DevstatMetric()
    public data object DsmKbPerTransfer : DevstatMetric()
    public data object DsmKbPerTransferRead : DevstatMetric()
    public data object DsmKbPerTransferWrite : DevstatMetric()
    public data object DsmTransfersPerSecond : DevstatMetric()
    public data object DsmTransfersPerSecondRead : DevstatMetric()
    public data object DsmTransfersPerSecondWrite : DevstatMetric()
    public data object DsmTransfersPerSecondOther : DevstatMetric()
    public data object DsmMbPerSecond : DevstatMetric()
    public data object DsmMbPerSecondRead : DevstatMetric()
    public data object DsmMbPerSecondWrite : DevstatMetric()
    public data object DsmBlocksPerSecond : DevstatMetric()
    public data object DsmBlocksPerSecondRead : DevstatMetric()
    public data object DsmBlocksPerSecondWrite : DevstatMetric()
    public data object DsmMsPerTransaction : DevstatMetric()
    public data object DsmMsPerTransactionRead : DevstatMetric()
    public data object DsmMsPerTransactionWrite : DevstatMetric()
    public data object DsmSkip : DevstatMetric()
    public data object DsmTotalBytesFree : DevstatMetric()
    public data object DsmTotalTransfersFree : DevstatMetric()
    public data object DsmTotalBlocksFree : DevstatMetric()
    public data object DsmKbPerTransferFree : DevstatMetric()
    public data object DsmMbPerSecondFree : DevstatMetric()
    public data object DsmTransfersPerSecondFree : DevstatMetric()
    public data object DsmBlocksPerSecondFree : DevstatMetric()
    public data object DsmMsPerTransactionOther : DevstatMetric()
    public data object DsmMsPerTransactionFree : DevstatMetric()
    public data object DsmBusyPct : DevstatMetric()
    public data object DsmQueueLength : DevstatMetric()
    public data object DsmTotalDuration : DevstatMetric()
    public data object DsmTotalDurationRead : DevstatMetric()
    public data object DsmTotalDurationWrite : DevstatMetric()
    public data object DsmTotalDurationFree : DevstatMetric()
    public data object DsmTotalDurationOther : DevstatMetric()
    public data object DsmTotalBusyTime : DevstatMetric()
    public data object DsmMax : DevstatMetric()

    public open fun clone(): DevstatMetric {
        return this
    }
}

public sealed class DevstatSelectMode {
    public data object DsSelectAdd : DevstatSelectMode()
    public data object DsSelectOnly : DevstatSelectMode()
    public data object DsSelectRemove : DevstatSelectMode()
    public data object DsSelectAddonly : DevstatSelectMode()

    public open fun clone(): DevstatSelectMode {
        return this
    }
}

public sealed class Dot3Vendors(public val value: UInt) {
    public data object Dot3VendorAmd : Dot3Vendors(1u)
    public data object Dot3VendorIntel : Dot3Vendors(2u)
    public data object Dot3VendorNational : Dot3Vendors(4u)
    public data object Dot3VendorFujitsu : Dot3Vendors(5u)
    public data object Dot3VendorDigital : Dot3Vendors(6u)
    public data object Dot3VendorWesternDigital : Dot3Vendors(7u)

    public open fun clone(): Dot3Vendors {
        return this
    }
}
