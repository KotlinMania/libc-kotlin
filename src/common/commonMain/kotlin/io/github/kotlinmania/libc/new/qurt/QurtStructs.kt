package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar

// Standard C library types
// Division result types and structures
public open class DivT(public var quot: CInt, public var rem: CInt)

public open class LdivT(public var quot: CLong, public var rem: CLong)

public open class LldivT(public var quot: CLonglong, public var rem: CLonglong)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stMtime: TimeT,
    public var stCtime: TimeT,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Dirent(public var dIno: CLong, public var dName: List<CChar>)

public open class DIR(public var index: CInt, public var entry: Dirent)

// Terminal I/O structure (for compatibility, limited support on QuRT)
public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CUchar>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

// Resource limit structures (for compatibility, limited support on QuRT)
public open class Rlimit(public var rlimCur: RlimT, public var rlimMax: RlimT)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
)

// File lock structure (for compatibility)
public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)
