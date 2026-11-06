// port-lint: source new/nto/net/if_.rs
package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.Sockaddr

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruBuffer: IfreqBuffer? = null,
    public var ifruFlags: List<CShort>? = null,
    public var ifruIndex: CShort? = null,
    public var ifruJid: CInt? = null,
    public var ifruMetric: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruPhys: CInt? = null,
    public var ifruMedia: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruCap: List<CInt>? = null,
    public var ifruFib: CUint? = null,
    public var ifruVlanPcp: CUchar? = null,
)

public open class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: CAnonymousIfrIfru,
)

public open class IfreqBuffer(public var length: SizeT, public var buffer: COpaquePointer?)
