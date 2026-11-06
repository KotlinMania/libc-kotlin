// port-lint: source unix/linux_like/linux/musl/b64/b64_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.TimeT

public typealias RegoffT = CLong

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class PthreadAttrT(public var size: List<ULong>)

public open class SigsetT(public var value: List<CUlong>)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class SemT(public var value: List<CInt>)

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32
