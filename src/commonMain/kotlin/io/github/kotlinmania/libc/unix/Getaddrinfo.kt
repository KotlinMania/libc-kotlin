package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int

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
