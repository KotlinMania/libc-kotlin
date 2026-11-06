@file:OptIn(
    ExperimentalUnsignedTypes::class,
    kotlin.wasm.ExperimentalWasmInterop::class,
    kotlin.wasm.unsafe.UnsafeWasmMemoryApi::class,
)

package io.github.kotlinmania.libc

import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.withScopedMemoryAllocator

@WasmImport("wasi_snapshot_preview1", "environ_sizes_get")
private external fun wasiEnvironSizesGet(
    environCountPtr: Int,
    environBufSizePtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "environ_get")
private external fun wasiEnvironGet(
    environPtr: Int,
    environBufPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_fdstat_get")
private external fun wasiFdFdstatGet(
    fd: Int,
    statPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_close")
private external fun wasiFdClose(fd: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_prestat_get")
private external fun wasiPrestatGet(
    fd: Int,
    resultPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_prestat_dir_name")
private external fun wasiPrestatDirName(
    fd: Int,
    pathPtr: Int,
    pathLen: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "path_open")
private external fun wasiPathOpen(
    dirFd: Int,
    dirflags: Int,
    pathPtr: Int,
    pathLen: Int,
    oflags: Int,
    fsRightsBase: Long,
    fsRightsInheriting: Long,
    fdflags: Int,
    openedFdPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "path_unlink_file")
private external fun wasiPathUnlinkFile(
    dirFd: Int,
    pathPtr: Int,
    pathLen: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_read")
private external fun wasiFdRead(
    fd: Int,
    iovsPtr: Int,
    iovsLen: Int,
    nreadPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_write")
private external fun wasiFdWrite(
    fd: Int,
    iovsPtr: Int,
    iovsLen: Int,
    nwrittenPtr: Int,
): Int

@WasmImport("wasi_snapshot_preview1", "fd_seek")
private external fun wasiFdSeek(
    fd: Int,
    offset: Long,
    whence: Int,
    newoffsetPtr: Int,
): Int

internal actual object LibcDynamicFfiPlatform {
    private var arena = ByteArray(131072)
    private var arenaOffset = 64
    private val allocSizes = HashMap<Long, Int>()
    private var envInitialized = false
    private val envMap = LinkedHashMap<String, String>()
    private val stringPool = HashMap<String, Long>()
    private var lastErrno = 0

    private data class PreopenCapability(
        val dirFd: Int,
        val relativePath: String,
    )

    private fun ensureEnv() {
        if (envInitialized) return
        envInitialized = true
        withScopedMemoryAllocator { allocator ->
            val countPtr = allocator.allocate(4)
            val bufSizePtr = allocator.allocate(4)
            if (wasiEnvironSizesGet(countPtr.address.toInt(), bufSizePtr.address.toInt()) != 0) return
            val count = countPtr.loadInt()
            val bufSize = bufSizePtr.loadInt()
            if (count <= 0 || bufSize <= 0) return
            val ptrs = allocator.allocate(count * 4)
            val buf = allocator.allocate(bufSize)
            if (wasiEnvironGet(ptrs.address.toInt(), buf.address.toInt()) != 0) return
            val baseAddr = buf.address.toInt()
            for (i in 0 until count) {
                val entryAddr = (ptrs + i * 4).loadInt()
                val offset = entryAddr - baseAddr
                if (offset in 0 until bufSize) {
                    var len = 0
                    val tmp = ByteArray(bufSize - offset)
                    while (offset + len < bufSize) {
                        val b = (buf + (offset + len)).loadByte()
                        if (b == 0.toByte()) break
                        tmp[len] = b
                        len++
                    }
                    val entry = tmp.decodeToString(0, len)
                    val eq = entry.indexOf('=')
                    if (eq > 0) {
                        envMap[entry.substring(0, eq)] = entry.substring(eq + 1)
                    }
                }
            }
        }
    }

    private fun internCString(s: String): Long {
        stringPool[s]?.let { return it }
        val utf8 = s.encodeToByteArray()
        val ptr = allocZeroed(utf8.size + 1)
        if (utf8.isNotEmpty()) writeBytes(ptr, utf8)
        stringPool[s] = ptr
        return ptr
    }

    private fun decodeCStringAt(addr: Long): String? {
        if (addr == 0L) return null
        val len = strlenAt(addr)
        return if (len <= 0) "" else readBytes(addr, len).decodeToString()
    }

    private fun resolveCapability(path: String): PreopenCapability? =
        withScopedMemoryAllocator { allocator ->
            var best: PreopenCapability? = null
            var bestPrefixLen = -1
            val prestat = allocator.allocate(8)
            for (fd in 3 until 64) {
                if (wasiPrestatGet(fd, prestat.address.toInt()) != 0 || prestat.loadByte() != 0.toByte()) continue
                val nameLen = (prestat + 4).loadInt()
                if (nameLen !in 1..1_048_576) continue
                val dirBuf = allocator.allocate(nameLen)
                if (wasiPrestatDirName(fd, dirBuf.address.toInt(), nameLen) != 0) continue
                val prefix = ByteArray(nameLen) { (dirBuf + it).loadByte() }.decodeToString().trimEnd('/').ifEmpty { "/" }
                val rel =
                    when {
                        prefix == "." && !path.startsWith('/') -> path.removePrefix("./")
                        prefix == "/" && path.startsWith('/') -> path.removePrefix("/")
                        path.startsWith("$prefix/") -> path.substring(prefix.length + 1)
                        path == prefix -> "."
                        else -> continue
                    }
                if (rel.split('/').any { it == ".." }) continue
                if (prefix.length > bestPrefixLen) {
                    best = PreopenCapability(fd, rel)
                    bestPrefixLen = prefix.length
                }
            }
            best
        }

    actual fun isHostAvailable(): Boolean = true

    actual fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long {
        fun a(i: Int): Long = if (i < args.size) args[i] else 0L
        return when (symbol) {
            "malloc" -> {
                val sz = a(0).toInt().coerceAtLeast(1)
                allocZeroed(sz)
            }
            "calloc" -> {
                val total = (a(0) * a(1)).toInt().coerceAtLeast(1)
                allocZeroed(total)
            }
            "realloc" -> {
                val oldPtr = a(0)
                val newSz = a(1).toInt().coerceAtLeast(1)
                val newPtr = allocZeroed(newSz)
                if (oldPtr != 0L) {
                    val oldSz = allocSizes[oldPtr] ?: 0
                    val copyLen = minOf(oldSz, newSz)
                    if (copyLen > 0) {
                        arena.copyInto(arena, destinationOffset = newPtr.toInt(), startIndex = oldPtr.toInt(), endIndex = oldPtr.toInt() + copyLen)
                    }
                }
                newPtr
            }
            "free" -> 0L
            "memset" -> {
                val dst = a(0)
                val byteVal = (a(1).toInt() and 0xFF).toByte()
                val count = a(2).toInt()
                if (dst != 0L && count > 0) {
                    arena.fill(byteVal, dst.toInt(), dst.toInt() + count)
                }
                dst
            }
            "memcpy", "memmove" -> {
                val dst = a(0)
                val src = a(1)
                val count = a(2).toInt()
                if (dst != 0L && src != 0L && count > 0) {
                    arena.copyInto(arena, destinationOffset = dst.toInt(), startIndex = src.toInt(), endIndex = src.toInt() + count)
                }
                dst
            }
            "memcmp" -> {
                val cx = a(0).toInt()
                val ct = a(1).toInt()
                val n = a(2).toInt()
                var diff = 0L
                for (i in 0 until n) {
                    val b1 = arena[cx + i].toInt() and 0xFF
                    val b2 = arena[ct + i].toInt() and 0xFF
                    if (b1 != b2) {
                        diff = (b1 - b2).toLong()
                        break
                    }
                }
                diff
            }
            "getenv" -> {
                ensureEnv()
                val k = decodeCStringAt(a(0)) ?: return 0L
                val v = envMap[k] ?: return 0L
                internCString(v)
            }
            "setenv" -> {
                val k = decodeCStringAt(a(0))
                val v = decodeCStringAt(a(1))
                val overwrite = a(2).toInt()
                if (k.isNullOrEmpty() || v == null || '=' in k) {
                    lastErrno = 28
                    -1L
                } else {
                    ensureEnv()
                    if (overwrite != 0 || !envMap.containsKey(k)) {
                        envMap[k] = v
                    }
                    0L
                }
            }
            "unsetenv" -> {
                val k = decodeCStringAt(a(0))
                if (k.isNullOrEmpty() || '=' in k) {
                    lastErrno = 28
                    -1L
                } else {
                    ensureEnv()
                    envMap.remove(k)
                    0L
                }
            }
            "putenv", "_putenv" -> {
                val kv = decodeCStringAt(a(0))
                if (kv == null) {
                    lastErrno = 28
                    -1L
                } else {
                    ensureEnv()
                    val eq = kv.indexOf('=')
                    if (eq < 0) {
                        envMap.remove(kv)
                        0L
                    } else if (eq == 0) {
                        lastErrno = 28
                        -1L
                    } else {
                        envMap[kv.substring(0, eq)] = kv.substring(eq + 1)
                        0L
                    }
                }
            }
            "_putenv_s", "putenv_s" -> {
                val k = decodeCStringAt(a(0))
                val v = decodeCStringAt(a(1))
                if (k.isNullOrEmpty() || v == null || '=' in k) {
                    lastErrno = 28
                    28L
                } else {
                    ensureEnv()
                    if (v.isEmpty()) envMap.remove(k) else envMap[k] = v
                    0L
                }
            }
            "clearenv" -> {
                ensureEnv()
                envMap.clear()
                0L
            }
            "isatty", "_isatty" -> {
                val fd = a(0).toInt()
                withScopedMemoryAllocator { allocator ->
                    val statPtr = allocator.allocate(24)
                    val rc = wasiFdFdstatGet(fd, statPtr.address.toInt())
                    if (rc != 0) {
                        lastErrno = rc
                        0L
                    } else {
                        val filetype = statPtr.loadByte().toInt() and 0xFF
                        val rightsBase = (statPtr + 8).loadLong().toULong()
                        val seekOrTell = (1uL shl 2) or (1uL shl 5)
                        if (filetype == 2 && (rightsBase and seekOrTell) == 0uL) 1L else 0L
                    }
                }
            }
            "close", "_close", "fclose" -> {
                val fd = a(0).toInt()
                val rc = wasiFdClose(fd)
                if (rc != 0) {
                    lastErrno = rc
                    -1L
                } else {
                    0L
                }
            }
            "fopen" -> {
                val path = decodeCStringAt(a(0))
                val mode = decodeCStringAt(a(1))
                if (path == null || mode.isNullOrEmpty() || mode[0] !in "rwa") {
                    lastErrno = 28
                    return 0L
                }
                val cap = resolveCapability(path)
                if (cap == null) {
                    lastErrno = 76
                    return 0L
                }
                val bytes = cap.relativePath.encodeToByteArray()
                val opened =
                    withScopedMemoryAllocator { allocator ->
                        val pBuf = allocator.allocate(bytes.size.coerceAtLeast(1))
                        bytes.forEachIndexed { idx, b -> (pBuf + idx).storeByte(b) }
                        val outFd = allocator.allocate(4)
                        val readable = mode[0] == 'r' || '+' in mode
                        val writable = mode[0] != 'r' || '+' in mode
                        val rights = (if (readable) 2L else 0L) or (if (writable) 64L else 0L) or 4L or 32L or (1L shl 21)
                        val oflags =
                            when (mode[0]) {
                                'w' -> 1 or 8
                                'a' -> 1
                                else -> 0
                            }
                        val rc = wasiPathOpen(cap.dirFd, 1, pBuf.address.toInt(), bytes.size, oflags, rights, 0L, if (mode[0] == 'a') 1 else 0, outFd.address.toInt())
                        if (rc != 0) {
                            lastErrno = rc
                            -1
                        } else {
                            outFd.loadInt()
                        }
                    }
                if (opened < 0) 0L else opened.toLong()
            }
            "open", "_open" -> {
                val path = decodeCStringAt(a(0))
                val oflag = a(1).toInt()
                if (path == null) {
                    lastErrno = 21
                    return -1L
                }
                val cap = resolveCapability(path)
                if (cap == null) {
                    lastErrno = 76
                    return -1L
                }
                val bytes = cap.relativePath.encodeToByteArray()
                withScopedMemoryAllocator { allocator ->
                    val pBuf = allocator.allocate(bytes.size.coerceAtLeast(1))
                    bytes.forEachIndexed { idx, b -> (pBuf + idx).storeByte(b) }
                    val outFd = allocator.allocate(4)
                    val acc = oflag and 3
                    val readable = acc == 0 || acc == 2
                    val writable = acc == 1 || acc == 2
                    val rights = (if (readable) 2L else 0L) or (if (writable) 64L else 0L) or 4L or 32L or (1L shl 21)
                    val wasiOflags =
                        (if ((oflag and 0x0200) != 0 || (oflag and 0x0040) != 0 || (oflag and 0x0100) != 0) 1 else 0) or
                            (if ((oflag and 0x0400) != 0 || (oflag and 0x0200) != 0) 8 else 0)
                    val rc = wasiPathOpen(cap.dirFd, 1, pBuf.address.toInt(), bytes.size, wasiOflags, rights, 0L, 0, outFd.address.toInt())
                    if (rc != 0) {
                        lastErrno = rc
                        -1L
                    } else {
                        outFd.loadInt().toLong()
                    }
                }
            }
            "read", "_read" -> {
                val fd = a(0).toInt()
                val dst = a(1).toInt()
                val count = a(2).toInt()
                if (count <= 0) return 0L
                withScopedMemoryAllocator { allocator ->
                    val buf = allocator.allocate(count)
                    val iov = allocator.allocate(8)
                    iov.storeInt(buf.address.toInt())
                    (iov + 4).storeInt(count)
                    val nread = allocator.allocate(4)
                    val rc = wasiFdRead(fd, iov.address.toInt(), 1, nread.address.toInt())
                    if (rc != 0) {
                        lastErrno = rc
                        -1L
                    } else {
                        val n = nread.loadInt()
                        for (i in 0 until n) arena[dst + i] = (buf + i).loadByte()
                        n.toLong()
                    }
                }
            }
            "write", "_write" -> {
                val fd = a(0).toInt()
                val src = a(1).toInt()
                val count = a(2).toInt()
                if (count <= 0) return 0L
                withScopedMemoryAllocator { allocator ->
                    val buf = allocator.allocate(count)
                    for (i in 0 until count) (buf + i).storeByte(arena[src + i])
                    val iov = allocator.allocate(8)
                    iov.storeInt(buf.address.toInt())
                    (iov + 4).storeInt(count)
                    val nwritten = allocator.allocate(4)
                    val rc = wasiFdWrite(fd, iov.address.toInt(), 1, nwritten.address.toInt())
                    if (rc != 0) {
                        lastErrno = rc
                        -1L
                    } else {
                        nwritten.loadInt().toLong()
                    }
                }
            }
            "lseek", "_lseek", "lseek64" -> {
                val fd = a(0).toInt()
                val offset = a(1)
                val whence = a(2).toInt()
                withScopedMemoryAllocator { allocator ->
                    val newOff = allocator.allocate(8)
                    val rc = wasiFdSeek(fd, offset, whence, newOff.address.toInt())
                    if (rc != 0) {
                        lastErrno = rc
                        -1L
                    } else {
                        newOff.loadLong()
                    }
                }
            }
            "unlink", "_unlink", "remove" -> {
                val path = decodeCStringAt(a(0))
                if (path == null) {
                    lastErrno = 21
                    return -1L
                }
                val cap = resolveCapability(path)
                if (cap == null) {
                    lastErrno = 76
                    return -1L
                }
                val bytes = cap.relativePath.encodeToByteArray()
                withScopedMemoryAllocator { allocator ->
                    val pBuf = allocator.allocate(bytes.size.coerceAtLeast(1))
                    bytes.forEachIndexed { idx, b -> (pBuf + idx).storeByte(b) }
                    val rc = wasiPathUnlinkFile(cap.dirFd, pBuf.address.toInt(), bytes.size)
                    if (rc != 0) {
                        lastErrno = rc
                        -1L
                    } else {
                        0L
                    }
                }
            }
            "strerror" -> internCString("WASI error ${a(0).toInt()}")
            else -> throw UnsupportedOperationException("C symbol '$symbol' is unavailable on WASI preview1")
        }
    }

    actual fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double = throw UnsupportedOperationException("C symbol '$symbol' is unavailable on WASI preview1")

    actual fun resolveSymbolAddress(symbol: String): Long = 0L

    actual fun lastErrorNumber(): Int = lastErrno

    actual fun strlenAt(address: Long): Int {
        if (address == 0L) return 0
        var i = address.toInt()
        while (i < arena.size && arena[i] != 0.toByte()) i++
        return i - address.toInt()
    }

    actual fun allocZeroed(size: Int): Long {
        val n = maxOf(size, 1)
        val aligned = (arenaOffset + 7) and -8
        if (aligned + n > arena.size) {
            arena = arena.copyOf(maxOf(arena.size * 2, aligned + n + 4096))
        }
        arena.fill(0, aligned, aligned + n)
        arenaOffset = aligned + n
        val addr = aligned.toLong()
        allocSizes[addr] = n
        return addr
    }

    actual fun freeMem(address: Long) {
        if (address == 0L) return
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
