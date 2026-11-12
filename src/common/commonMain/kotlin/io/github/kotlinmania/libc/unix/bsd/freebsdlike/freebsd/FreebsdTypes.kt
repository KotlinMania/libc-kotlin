package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public typealias TimerT = MutPtr

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias MsglenT = CUlong

public typealias MsgqnumT = CUlong

public typealias CpulevelT = CInt

public typealias CpuwhichT = CInt

public typealias MqdT = MutPtr

public typealias PthreadSpinlockT = MutPtr

public typealias PthreadBarrierattrT = MutPtr

public typealias PthreadBarrierT = MutPtr

public typealias UuidT = Uuid

public typealias UInt = CUint

public typealias UChar = CUchar

public typealias ULong = CUlong

public typealias UShort = CUshort

public typealias CaddrT = MutPtr

public typealias FhandleT = Fhandle

public typealias AuIdT = UidT

public typealias AuAsidT = PidT

public typealias CpusetidT = CInt

public typealias SctpAssocT = UInt

public typealias EventfdT = ULong

public enum class DevstatSupportFlags(
    public val value: UInt,
) {
    DEVSTAT_ALL_SUPPORTED(0x00u),
    DEVSTAT_NO_BLOCKSIZE(0x01u),
    DEVSTAT_NO_ORDERED_TAGS(0x02u),
    DEVSTAT_BS_UNAVAILABLE(0x04u),
}

public enum class DevstatTransFlags(
    public val value: UInt,
) {
    DEVSTAT_NO_DATA(0x00u),
    DEVSTAT_READ(0x01u),
    DEVSTAT_WRITE(0x02u),
    DEVSTAT_FREE(0x03u),
}

public enum class DevstatTagType(
    public val value: UInt,
) {
    DEVSTAT_TAG_SIMPLE(0x00u),
    DEVSTAT_TAG_HEAD(0x01u),
    DEVSTAT_TAG_ORDERED(0x02u),
    DEVSTAT_TAG_NONE(0x03u),
}

public enum class DevstatMatchFlags(
    public val value: UInt,
) {
    DEVSTAT_MATCH_NONE(0x00u),
    DEVSTAT_MATCH_TYPE(0x01u),
    DEVSTAT_MATCH_IF(0x02u),
    DEVSTAT_MATCH_PASS(0x04u),
}

public enum class DevstatPriority(
    public val value: UInt,
) {
    DEVSTAT_PRIORITY_MIN(0x000u),
    DEVSTAT_PRIORITY_OTHER(0x020u),
    DEVSTAT_PRIORITY_PASS(0x030u),
    DEVSTAT_PRIORITY_FD(0x040u),
    DEVSTAT_PRIORITY_WFD(0x050u),
    DEVSTAT_PRIORITY_TAPE(0x060u),
    DEVSTAT_PRIORITY_CD(0x090u),
    DEVSTAT_PRIORITY_DISK(0x110u),
    DEVSTAT_PRIORITY_ARRAY(0x120u),
    DEVSTAT_PRIORITY_MAX(0xfffu),
}

public enum class DevstatTypeFlags(
    public val value: UInt,
) {
    DEVSTAT_TYPE_DIRECT(0x000u),
    DEVSTAT_TYPE_SEQUENTIAL(0x001u),
    DEVSTAT_TYPE_PRINTER(0x002u),
    DEVSTAT_TYPE_PROCESSOR(0x003u),
    DEVSTAT_TYPE_WORM(0x004u),
    DEVSTAT_TYPE_CDROM(0x005u),
    DEVSTAT_TYPE_SCANNER(0x006u),
    DEVSTAT_TYPE_OPTICAL(0x007u),
    DEVSTAT_TYPE_CHANGER(0x008u),
    DEVSTAT_TYPE_COMM(0x009u),
    DEVSTAT_TYPE_ASC0(0x00au),
    DEVSTAT_TYPE_ASC1(0x00bu),
    DEVSTAT_TYPE_STORARRAY(0x00cu),
    DEVSTAT_TYPE_ENCLOSURE(0x00du),
    DEVSTAT_TYPE_FLOPPY(0x00eu),
    DEVSTAT_TYPE_MASK(0x00fu),
    DEVSTAT_TYPE_IF_SCSI(0x010u),
    DEVSTAT_TYPE_IF_IDE(0x020u),
    DEVSTAT_TYPE_IF_OTHER(0x030u),
    DEVSTAT_TYPE_IF_MASK(0x0f0u),
    DEVSTAT_TYPE_PASS(0x100u),
}

public enum class DevstatMetric(
    public val value: UInt,
) {
    DSM_NONE(0u),
    DSM_TOTAL_BYTES(1u),
    DSM_TOTAL_BYTES_READ(2u),
    DSM_TOTAL_BYTES_WRITE(3u),
    DSM_TOTAL_TRANSFERS(4u),
    DSM_TOTAL_TRANSFERS_READ(5u),
    DSM_TOTAL_TRANSFERS_WRITE(6u),
    DSM_TOTAL_TRANSFERS_OTHER(7u),
    DSM_TOTAL_BLOCKS(8u),
    DSM_TOTAL_BLOCKS_READ(9u),
    DSM_TOTAL_BLOCKS_WRITE(10u),
    DSM_KB_PER_TRANSFER(11u),
    DSM_KB_PER_TRANSFER_READ(12u),
    DSM_KB_PER_TRANSFER_WRITE(13u),
    DSM_TRANSFERS_PER_SECOND(14u),
    DSM_TRANSFERS_PER_SECOND_READ(15u),
    DSM_TRANSFERS_PER_SECOND_WRITE(16u),
    DSM_TRANSFERS_PER_SECOND_OTHER(17u),
    DSM_MB_PER_SECOND(18u),
    DSM_MB_PER_SECOND_READ(19u),
    DSM_MB_PER_SECOND_WRITE(20u),
    DSM_BLOCKS_PER_SECOND(21u),
    DSM_BLOCKS_PER_SECOND_READ(22u),
    DSM_BLOCKS_PER_SECOND_WRITE(23u),
    DSM_MS_PER_TRANSACTION(24u),
    DSM_MS_PER_TRANSACTION_READ(25u),
    DSM_MS_PER_TRANSACTION_WRITE(26u),
    DSM_SKIP(27u),
    DSM_TOTAL_BYTES_FREE(28u),
    DSM_TOTAL_TRANSFERS_FREE(29u),
    DSM_TOTAL_BLOCKS_FREE(30u),
    DSM_KB_PER_TRANSFER_FREE(31u),
    DSM_MB_PER_SECOND_FREE(32u),
    DSM_TRANSFERS_PER_SECOND_FREE(33u),
    DSM_BLOCKS_PER_SECOND_FREE(34u),
    DSM_MS_PER_TRANSACTION_OTHER(35u),
    DSM_MS_PER_TRANSACTION_FREE(36u),
    DSM_BUSY_PCT(37u),
    DSM_QUEUE_LENGTH(38u),
    DSM_TOTAL_DURATION(39u),
    DSM_TOTAL_DURATION_READ(40u),
    DSM_TOTAL_DURATION_WRITE(41u),
    DSM_TOTAL_DURATION_FREE(42u),
    DSM_TOTAL_DURATION_OTHER(43u),
    DSM_TOTAL_BUSY_TIME(44u),
    DSM_MAX(45u),
}

public enum class DevstatSelectMode(
    public val value: UInt,
) {
    DS_SELECT_ADD(0u),
    DS_SELECT_ONLY(1u),
    DS_SELECT_REMOVE(2u),
    DS_SELECT_ADDONLY(3u),
}

public enum class Dot3Vendors(
    public val value: UInt,
) {
    Dot3VendorAmd(1u),
    Dot3VendorIntel(2u),
    Dot3VendorNational(4u),
    Dot3VendorFujitsu(5u),
    Dot3VendorDigital(6u),
    Dot3VendorWesternDigital(7u),
}
