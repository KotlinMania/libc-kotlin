// port-lint: source fuchsia/riscv64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*


public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class IpcPerm(
    val ipcPermKey: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUShort,
)
