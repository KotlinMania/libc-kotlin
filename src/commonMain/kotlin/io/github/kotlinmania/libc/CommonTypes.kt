// port-lint: source types.rs
package io.github.kotlinmania.libc
import io.github.kotlinmania.libc.unix.Sigval

public const val O_NONBLOCK: Int = 2048
public const val NSIO: UInt = 0xb7u

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class InAddr(
    val sAddr: UInt,
)

public data class In6Addr(
    val s6Addr: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: UShort,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrUn(
    val sunFamily: UShort,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: UShort,
    val padding: ByteArray,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: UInt,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: Int,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr,
)

public data class Linger(
    val lOnoff: Int,
    val lLinger: Int,
)

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
)

public data class Timespec(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvNsec: Long,
)

public data class Tm(
    val tmSec: Int,
    val tmMin: Int,
    val tmHour: Int,
    val tmMday: Int,
    val tmMon: Int,
    val tmYear: Int,
    val tmWday: Int,
    val tmYday: Int,
    val tmIsdst: Int,
    val tmGmtoff: Long,
    val tmZone: String?,
)

public data class Timezone(
    val handle: Long = 0L,
    val tzMinuteswest: Int,
    val tzDsttime: Int,
)

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Rlimit(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Rlimit64(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: Long,
    val ruIxrss: Long,
    val ruIdrss: Long,
    val ruIsrss: Long,
    val ruMinflt: Long,
    val ruMajflt: Long,
    val ruNswap: Long,
    val ruInblock: Long,
    val ruOublock: Long,
    val ruMsgsnd: Long,
    val ruMsgrcv: Long,
    val ruNsignals: Long,
    val ruNvcsw: Long,
    val ruNivcsw: Long,
)

public data class FdSet(
    val fdsBits: ULongArray,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: Int,
    val cmsgType: Int,
    val handle: Long = 0L,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: COpaquePointer?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: Int,
    val handle: Long = 0L,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: UInt,
)

public data class Iovec(
    val handle: Long = 0L,
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: UInt,
    val grMem: List<String>,
)

public data class Passwd(
    var pwName: String? = null,
    var pwPasswd: String? = null,
    var pwUid: UInt = 0u,
    var pwGid: UInt = 0u,
    var pwGecos: String? = null,
    var pwDir: String? = null,
    var pwShell: String? = null,
)

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: Long,
    val spMin: Long,
    val spMax: Long,
    val spWarn: Long,
    val spInact: Long,
    val spExpire: Long,
    val spFlag: ULong,
)

public data class Addrinfo(
    var aiFlags: Int = 0,
    var aiFamily: Int = 0,
    var aiSocktype: Int = 0,
    var aiProtocol: Int = 0,
    var aiAddrlen: UInt = 0u,
    var aiAddr: COpaquePointer? = null,
    var aiCanonname: String? = null,
    var aiNext: Addrinfo? = null,
    var aiSockaddr: Sockaddr? = null,
)

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cLine: UByte,
    val cCc: UByteArray,
    val cIspeed: UInt,
    val cOspeed: UInt,
)

public data class Winsize(
    val wsRow: UShort,
    val wsCol: UShort,
    val wsXpixel: UShort,
    val wsYpixel: UShort,
)

public data class Sigval(
    val sivalInt: Int,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)

public data class SchedParam(
    val schedPriority: Int,
)

public data class Sigaction(
    val saHandler: ULong,
    val saMask: ULong,
    val saFlags: Int,
    val saRestorer: COpaquePointer?,
)

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray = ByteArray(256),
    val nodename: ByteArray = ByteArray(256),
    val release: ByteArray = ByteArray(256),
    val version: ByteArray = ByteArray(256),
    val machine: ByteArray = ByteArray(256),
    val domainname: ByteArray = ByteArray(256),
)

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class Aiocb(
    val aioFildes: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioReqprio: Int,
    val aiocbSigevent: COpaquePointer?,
    val aioOpcode: Int,
    val aioStatus: Int,
)

public data class Pollfd(
    val fd: Int,
    val events: Short,
    val revents: Short,
)

public data class EpollEvent(
    val events: UInt,
    val data: ULong,
)

public data class Kevent(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
)

public data class KinfoProc(
    val pPid: Int,
    val pPpid: Int,
    val pUid: UInt,
    val pGid: UInt,
)

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class Statfs(
    val fBsize: Long,
    val fIosize: Long,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fOwner: UInt,
    val fType: UInt,
    val fFlags: UInt,
    val fSyncwrites: Long,
    val fAsyncwrites: Long,
    val fSid: ByteArray,
    val fNamemax: Long,
    val fCharacterused: Long,
    val fSpare: ULongArray,
)

public data class Statfs64(
    val fBsize: Long,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
)

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)

public data class Statvfs64(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)

public data class Dirent64(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class IpcPerm(
    val key: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: UShort,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: Long,
    val msgRtime: Long,
    val msgCtime: Long,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgLspid: Int,
    val msgLRpid: Int,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: ULong,
)

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)

public data class Utmpx(
    val utType: Short,
    val utPid: Int,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: Short,
    val utSession: Int,
    val utTv: Timeval,
    val utAddrV6: UIntArray,
)

public data class Utmp(
    val utType: Short,
    val utPid: Int,
    val utLine: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: Short,
    val utSession: Int,
    val utTv: Timeval,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: List<String>?,
    val glOffs: ULong,
    val glFlags: Int,
)

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
)

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siErrno: Int,
    val siPid: Int,
    val siUid: UInt,
    val siStatus: Int,
    val siAddr: COpaquePointer?,
    val siValue: Sigval? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siValue(): Sigval? = siValue
    internal fun siPid(): Int = siPid
    internal fun siUid(): UInt = siUid
    internal fun siStatus(): Int = siStatus
    internal fun siUtime(): Long = siUtime ?: 0L
    internal fun siStime(): Long = siStime ?: 0L
}

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: Int,
    val sigevNotify: Int,
    val sigevNotifyAttributes: COpaquePointer?,
)

public data class Sigset64T(
    val sigSet: ULongArray,
)

public data class Timex(
    val modes: UInt,
    val offset: Long,
    val freq: Long,
    val maxerror: Long,
    val esterror: Long,
    val status: Int,
    val constant: Long,
    val precision: Long,
    val tolerance: Long,
    val time: Timeval,
    val tick: Long,
    val ppsfreq: Long,
    val jitter: Long,
    val shift: Int,
    val stabil: Long,
    val jitcnt: Long,
    val calcnt: Long,
    val errcnt: Long,
    val stbcnt: Long,
)

public data class Sysinfo(
    val uptime: Long,
    val loads: ULongArray,
    val totalram: ULong,
    val freeram: ULong,
    val sharedram: ULong,
    val bufferram: ULong,
    val totalswap: ULong,
    val freeswap: ULong,
    val procs: UShort,
    val totalhigh: ULong,
    val freehigh: ULong,
    val memUnit: UInt,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: Int,
    val mntPassno: Int,
)

public data class SockFilter(
    val code: UShort,
    val jt: UByte,
    val jf: UByte,
    val k: UInt,
)

public data class SockFprog(
    val len: UShort,
    val filter: COpaquePointer?,
)

public data class Rtprio(
    val typeField: UShort,
    val prio: UShort,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: Char,
    val fracDigits: Char,
    val pCsPrecedes: Char,
    val pSepBySpace: Char,
    val nCsPrecedes: Char,
    val nSepBySpace: Char,
    val pSignPosn: Char,
    val nSignPosn: Char,
    val intPCsPrecedes: Char,
    val intPSepBySpace: Char,
    val intNCsPrecedes: Char,
    val intNSepBySpace: Char,
    val intPSignPosn: Char,
    val intNSignPosn: Char,
)

public data class IfData(
    val ifiType: UShort,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiIndex: UShort,
    val ifiMtu: ULong,
    val ifiMetric: ULong,
    val ifiBaudrate: ULong,
    val ifiIpackets: ULong,
    val ifiIerrors: ULong,
    val ifiOpackets: ULong,
    val ifiOerrors: ULong,
    val ifiCollisions: ULong,
    val ifiIbytes: ULong,
    val ifiObytes: ULong,
    val ifiImcasts: ULong,
    val ifiOmcasts: ULong,
    val ifiIqdrops: ULong,
    val ifiOqdrops: ULong,
    val ifiNoproto: ULong,
)

// Sentinel for LC_GLOBAL_LOCALE — C defines it as ((locale_t) -1).
// Since COpaquePointer is a modeled opaque class (not a raw pointer),
// we use a dedicated singleton to represent this sentinel value.
public val LC_GLOBAL_LOCALE_SENTINEL: COpaquePointer = COpaquePointer()

public const val INT_MIN: Int = -2147483648
public const val INT_MAX: Int = 2147483647

public object AddrinfoRegistry {
    private var nextHandle: Long = 100_000L
    private val chains: MutableMap<Long, Addrinfo> = mutableMapOf()
    private val sockaddrs: MutableMap<Long, Sockaddr> = mutableMapOf()

    public fun registerChain(entries: List<Addrinfo>): Long {
        if (entries.isEmpty()) return 0L
        for (i in entries.indices) {
            val handle = nextHandle++
            val node = entries[i]
            node.aiAddr = COpaquePointer(handle)
            val sa = node.aiSockaddr
            if (sa != null) {
                sockaddrs[handle] = sa
            }
            if (i + 1 < entries.size) {
                node.aiNext = entries[i + 1]
            }
            chains[handle] = node
        }
        return entries[0].aiAddr?.value ?: 0L
    }

    public fun lookupChain(handle: Long): Addrinfo? = chains[handle]

    public fun lookupSockaddr(handle: Long): Sockaddr? = sockaddrs[handle] ?: chains[handle]?.aiSockaddr

    public fun freeChain(head: Addrinfo?) {
        var cur = head
        while (cur != null) {
            val h = cur.aiAddr?.value ?: 0L
            if (h != 0L) {
                chains.remove(h)
                sockaddrs.remove(h)
            }
            cur = cur.aiNext
        }
    }

    public fun parsePackedResult(
        raw: String,
        hints: Addrinfo?,
        res: COpaquePointer?,
    ): Int {
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.trim()?.toIntOrNull() ?: -1
        if (rc != 0) {
            res?.value = 0L
            return rc
        }
        val count = lines.getOrNull(1)?.trim()?.toIntOrNull() ?: 0
        val entries = mutableListOf<Addrinfo>()
        for (i in 0 until count) {
            val line = lines.getOrNull(2 + i)?.trim() ?: continue
            if (line.isEmpty()) continue
            val parts = line.split('\t')
            if (parts.size < 7) continue
            val flags = parts[0].toIntOrNull() ?: 0
            val family = parts[1].toIntOrNull() ?: 0
            val socktype = parts[2].toIntOrNull() ?: 0
            val protocol = parts[3].toIntOrNull() ?: 0
            val addrlen = parts[4].toUIntOrNull() ?: 0u
            val saFamily = (parts[5].toUIntOrNull() ?: family.toUInt()).toUShort()
            val hexData = parts[6]
            val saData = ByteArray(hexData.length / 2)
            for (b in saData.indices) {
                val hi = hexData[b * 2].digitToIntOrNull(16) ?: 0
                val lo = hexData[b * 2 + 1].digitToIntOrNull(16) ?: 0
                saData[b] = ((hi shl 4) or lo).toByte()
            }
            val canon = parts.getOrNull(7)?.takeIf { it.isNotEmpty() }
            val sockaddr = Sockaddr(saFamily = saFamily, saData = saData)
            entries.add(
                Addrinfo(
                    aiFlags = flags,
                    aiFamily = family,
                    aiSocktype = socktype,
                    aiProtocol = protocol,
                    aiAddrlen = addrlen,
                    aiCanonname = canon,
                    aiSockaddr = sockaddr,
                ),
            )
        }
        val headHandle = registerChain(entries)
        res?.value = headHandle
        if (hints != null && entries.isNotEmpty()) {
            hints.aiNext = entries[0]
        }
        return 0
    }

    public fun applyGetnameinfoResult(
        raw: String,
        host: ByteArray?,
        hostlen: UInt,
        serv: ByteArray?,
        servlen: UInt,
    ): Int {
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.trim()?.toIntOrNull() ?: -1
        if (rc != 0) return rc
        val hostStr = lines.getOrNull(1).orEmpty()
        val servStr = lines.getOrNull(2).orEmpty()
        if (host != null && hostlen > 0u) {
            host.fill(0)
            val bytes = hostStr.encodeToByteArray()
            val maxCopy = minOf(bytes.size, (minOf(host.size, hostlen.toInt()) - 1).coerceAtLeast(0))
            for (i in 0 until maxCopy) {
                host[i] = bytes[i]
            }
        }
        if (serv != null && servlen > 0u) {
            serv.fill(0)
            val bytes = servStr.encodeToByteArray()
            val maxCopy = minOf(bytes.size, (minOf(serv.size, servlen.toInt()) - 1).coerceAtLeast(0))
            for (i in 0 until maxCopy) {
                serv[i] = bytes[i]
            }
        }
        return 0
    }

    public fun encodeHex(bytes: ByteArray): String {
        val chars = CharArray(bytes.size * 2)
        val hexDigits = "0123456789abcdef"
        for (i in bytes.indices) {
            val v = bytes[i].toInt() and 0xFF
            chars[i * 2] = hexDigits[v ushr 4]
            chars[i * 2 + 1] = hexDigits[v and 0x0F]
        }
        return chars.concatToString()
    }
}

public fun COpaquePointer?.toAddrinfo(): Addrinfo? =
    if (this == null || this.value == 0L) null else AddrinfoRegistry.lookupChain(this.value)

public fun COpaquePointer?.toSockaddr(): Sockaddr? =
    if (this == null || this.value == 0L) null else AddrinfoRegistry.lookupSockaddr(this.value)
