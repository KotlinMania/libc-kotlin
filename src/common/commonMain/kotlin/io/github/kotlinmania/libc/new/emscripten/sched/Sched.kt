// port-lint: source new/emscripten/sched.rs
package io.github.kotlinmania.libc.new.emscripten.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT

public open class CAnonSchedParamReserved2(public var reserved1: TimeT, public var reserved2: CLong)

public open class SchedParam(
    public var schedPriority: CInt,
    public var reserved1: CInt,
    public var reserved2: List<CLong>,
    public var reserved3: CInt,
)
