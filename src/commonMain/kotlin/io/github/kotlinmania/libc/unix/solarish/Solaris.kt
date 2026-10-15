// port-lint: source unix/solarish/solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class XrsT(
    val xrsId: ULong,
    val xrsPtr: String?,
)

public data class DoorDescTDDataDDesc(
    val dDescriptor: Int,
    val dId: ULong,
)

public data class DoorDescT(
    val dAttributes: UInt,
    val dData: DoorDescTDData,
)

public data class DoorArgT(
    val dataPtr: String?,
    val dataSize: ULong,
    val descPtr: DoorDescT?,
    val decNum: UInt,
    val rbuf: String?,
    val rsize: ULong,
)

// C union; only one variant is valid at a time.
public data class DoorDescTDData(
    val dDesc: DoorDescTDDataDDesc? = null,
    val dResv: IntArray? = null,
)

public const val _UTMP_USER_LEN: ULong = 32uL
public const val _UTMP_LINE_LEN: ULong = 32uL
public const val _UTMP_ID_LEN: ULong = 4uL
public const val PORT_SOURCE_POSTWAIT: Int = 8
public const val PORT_SOURCE_SIGNAL: Int = 9
public const val PRIV_PROC_SENSITIVE: UInt = 0x0008u
public const val PRIV_PFEXEC_AUTH: UInt = 0x0200u
public const val PRIV_PROC_TPD: UInt = 0x0400u
public const val PRIV_TPD_UNSAFE: UInt = 0x0800u
public const val PRIV_PROC_TPD_RESET: UInt = 0x1000u
public const val PRIV_TPD_KILLABLE: UInt = 0x2000u

public expect fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int

public expect fun doorCall(d: Int, params: DoorArgT?): Int

public expect fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: UInt): Int

public expect fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, UInt) -> Unit)?, cookie: COpaquePointer?, attributes: UInt): Int

public expect fun fattach(fildes: Int, path: String?): Int

public expect fun pthreadGetattrNp(thread: UInt, attr: PthreadAttrT?): Int

public expect fun euidaccess(path: String?, amode: Int): Int
