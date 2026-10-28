@file:OptIn(kotlin.wasm.ExperimentalWasmInterop::class, kotlin.wasm.unsafe.UnsafeWasmMemoryApi::class)

package io.github.kotlinmania.libc.internal

import io.github.kotlinmania.libc.FILE
import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.withScopedMemoryAllocator

@WasmImport("wasi_snapshot_preview1", "fd_prestat_get")
private external fun prestatGet(fd: Int, result: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_prestat_dir_name")
private external fun prestatName(fd: Int, result: Int, length: Int): Int

@WasmImport("wasi_snapshot_preview1", "path_open")
private external fun pathOpen(fd: Int, lookup: Int, path: Int, length: Int, flags: Int, rights: Long, inheriting: Long, fdflags: Int, result: Int): Int

@WasmImport("wasi_snapshot_preview1", "path_unlink_file")
private external fun pathUnlink(fd: Int, path: Int, length: Int): Int

@WasmImport("wasi_snapshot_preview1", "path_rename")
private external fun pathRename(fromFd: Int, from: Int, fromLength: Int, toFd: Int, to: Int, toLength: Int): Int

@WasmImport("wasi_snapshot_preview1", "path_filestat_get")
private external fun pathStat(fd: Int, lookup: Int, path: Int, length: Int, result: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_close")
private external fun fdClose(fd: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_read")
private external fun fdRead(fd: Int, iov: Int, count: Int, result: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_write")
private external fun fdWrite(fd: Int, iov: Int, count: Int, result: Int): Int

internal object WasiFiles {
    private class Stream(
        val fd: Int,
        var eof: Boolean = false,
        var failed: Boolean = false,
    )
    private class Capability(
        val fd: Int,
        val path: String,
    )
    private val streams = mutableMapOf<Long, Stream>()

    private fun failure(code: Int): Int {
        WasiLibcEnv.setErrno(code)
        return -1
    }

    private fun capability(path: String): Capability? =
        withScopedMemoryAllocator { allocator ->
            var best: Capability? = null
            var bestPrefix = -1
            val stat = allocator.allocate(8)
            for (fd in 3 until 64) {
                if (prestatGet(fd, stat.address.toInt()) != 0 || stat.loadByte() != 0.toByte()) continue
                val length = (stat + 4).loadInt()
                if (length !in 1..1_048_576) continue
                val name = allocator.allocate(length)
                if (prestatName(fd, name.address.toInt(), length) != 0) continue
                val prefix = ByteArray(length) { (name + it).loadByte() }.decodeToString().trimEnd('/').ifEmpty { "/" }
                val relative =
                    when {
                        prefix == "." && !path.startsWith('/') -> path.removePrefix("./")
                        prefix == "/" && path.startsWith('/') -> path.removePrefix("/")
                        path.startsWith("$prefix/") -> path.substring(prefix.length + 1)
                        path == prefix -> "."
                        else -> continue
                    }
                if (relative.split('/').any { it == ".." }) continue
                if (prefix.length > bestPrefix) {
                    best = Capability(fd, relative)
                    bestPrefix = prefix.length
                }
            }
            best
        }

    fun open(path: String?, mode: String?): FILE? {
        if (path == null || mode.isNullOrEmpty() || mode[0] !in "rwa") {
            failure(28)
            return null
        }
        val capability = capability(path)
        if (capability == null) {
            failure(76)
            return null
        }
        val bytes = capability.path.encodeToByteArray()
        val fd =
            withScopedMemoryAllocator { allocator ->
                val name = allocator.allocate(bytes.size.coerceAtLeast(1))
                bytes.forEachIndexed { index, byte -> (name + index).storeByte(byte) }
                val output = allocator.allocate(4)
                val readable = mode[0] == 'r' || '+' in mode
                val writable = mode[0] != 'r' || '+' in mode
                val rights = (if (readable) 2L else 0L) or (if (writable) 64L else 0L) or 4L or 32L or (1L shl 21)
                val flags =
                    when (mode[0]) {
                        'w' -> 1 or 8
                        'a' -> 1
                        else -> 0
                    }
                val status = pathOpen(capability.fd, 1, name.address.toInt(), bytes.size, flags, rights, 0L, if (mode[0] == 'a') 1 else 0, output.address.toInt())
                if (status != 0) failure(status) else output.loadInt()
            }
        if (fd < 0) return null
        streams[fd.toLong()] = Stream(fd)
        return FILE(fd.toLong())
    }

    private fun stream(file: FILE?): Stream? {
        val result = streams[file?.handle]
        if (result == null) failure(8)
        return result
    }

    fun close(file: FILE?): Int {
        val stream = stream(file) ?: return -1
        val result = fdClose(stream.fd)
        if (result != 0) return failure(result)
        streams.remove(stream.fd.toLong())
        return 0
    }

    fun flush(file: FILE?): Int {
        if (file != null && stream(file) == null) return -1
        return 0
    }

    fun getc(file: FILE?): Int {
        val stream = stream(file) ?: return -1
        return withScopedMemoryAllocator { allocator ->
            val buffer = allocator.allocate(1)
            val iov = allocator.allocate(8)
            iov.storeInt(buffer.address.toInt())
            (iov + 4).storeInt(1)
            val count = allocator.allocate(4)
            val status = fdRead(stream.fd, iov.address.toInt(), 1, count.address.toInt())
            if (status != 0) {
                stream.failed = true
                failure(status)
            } else if (count.loadInt() == 0) {
                stream.eof = true
                -1
            } else {
                buffer.loadByte().toInt() and 255
            }
        }
    }

    private fun write(file: FILE?, bytes: ByteArray): Int {
        val stream = stream(file) ?: return -1
        return withScopedMemoryAllocator { allocator ->
            val buffer = allocator.allocate(bytes.size.coerceAtLeast(1))
            bytes.forEachIndexed { index, byte -> (buffer + index).storeByte(byte) }
            val iov = allocator.allocate(8)
            val count = allocator.allocate(4)
            var written = 0
            while (written < bytes.size) {
                iov.storeInt((buffer + written).address.toInt())
                (iov + 4).storeInt(bytes.size - written)
                val status = fdWrite(stream.fd, iov.address.toInt(), 1, count.address.toInt())
                if (status != 0 || count.loadInt() <= 0) {
                    stream.failed = true
                    return@withScopedMemoryAllocator failure(if (status != 0) status else 29)
                }
                written += count.loadInt()
            }
            written
        }
    }

    fun putc(value: Int, file: FILE?): Int =
        if (write(file, byteArrayOf(value.toByte())) < 0) -1 else value and 255

    fun puts(text: String?, file: FILE?): Int {
        if (text == null) return failure(21)
        return if (write(file, text.substringBefore('\u0000').encodeToByteArray()) < 0) -1 else 0
    }

    fun gets(size: Int, file: FILE?): String? {
        if (size <= 0) {
            failure(28)
            return null
        }
        if (stream(file) == null) return null
        val bytes = ByteArray(size - 1)
        var count = 0
        while (count < bytes.size) {
            val value = getc(file)
            if (value < 0) break
            bytes[count++] = value.toByte()
            if (value == 10) break
        }
        return if (count == 0 && size > 1) null else bytes.decodeToString(0, count)
    }

    fun eof(file: FILE?): Int = if (stream(file)?.eof == true) 1 else 0
    fun error(file: FILE?): Int = if (stream(file)?.failed == true) 1 else 0
    fun clearError(file: FILE?) {
        stream(file)?.let {
            it.eof = false
            it.failed = false
        }
    }

    fun unlink(path: String?): Int {
        if (path == null) return failure(21)
        val capability = capability(path) ?: return failure(76)
        val bytes = capability.path.encodeToByteArray()
        return withScopedMemoryAllocator { allocator ->
            val name = allocator.allocate(bytes.size.coerceAtLeast(1))
            bytes.forEachIndexed { index, byte -> (name + index).storeByte(byte) }
            val status = pathUnlink(capability.fd, name.address.toInt(), bytes.size)
            if (status == 0) 0 else failure(status)
        }
    }

    fun rename(from: String?, to: String?): Int {
        if (from == null || to == null) return failure(21)
        val source = capability(from) ?: return failure(76)
        val destination = capability(to) ?: return failure(76)
        return withScopedMemoryAllocator { allocator ->
            val fromBytes = source.path.encodeToByteArray()
            val toBytes = destination.path.encodeToByteArray()
            val fromName = allocator.allocate(fromBytes.size.coerceAtLeast(1))
            val toName = allocator.allocate(toBytes.size.coerceAtLeast(1))
            fromBytes.forEachIndexed { index, byte -> (fromName + index).storeByte(byte) }
            toBytes.forEachIndexed { index, byte -> (toName + index).storeByte(byte) }
            val status = pathRename(source.fd, fromName.address.toInt(), fromBytes.size, destination.fd, toName.address.toInt(), toBytes.size)
            if (status == 0) 0 else failure(status)
        }
    }

    fun access(path: String?, mode: Int): Int {
        require(mode == 0) { "WASI capabilities do not expose POSIX access permission bits" }
        if (path == null) return failure(21)
        val capability = capability(path) ?: return failure(76)
        val bytes = capability.path.encodeToByteArray()
        return withScopedMemoryAllocator { allocator ->
            val name = allocator.allocate(bytes.size.coerceAtLeast(1))
            bytes.forEachIndexed { index, byte -> (name + index).storeByte(byte) }
            val result = allocator.allocate(64)
            val status = pathStat(capability.fd, 1, name.address.toInt(), bytes.size, result.address.toInt())
            if (status == 0) 0 else failure(status)
        }
    }
}
