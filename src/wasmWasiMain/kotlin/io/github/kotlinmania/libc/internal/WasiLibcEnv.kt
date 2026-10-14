// port-lint: source N/A
@file:OptIn(
    kotlin.wasm.ExperimentalWasmInterop::class,
    kotlin.wasm.unsafe.UnsafeWasmMemoryApi::class,
)

package io.github.kotlinmania.libc.internal

import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.withScopedMemoryAllocator

@WasmImport("wasi_snapshot_preview1", "environ_sizes_get")
private external fun wasiEnvironSizesGet(environCountPtr: Int, environBufSizePtr: Int): Int

@WasmImport("wasi_snapshot_preview1", "environ_get")
private external fun wasiEnvironGet(environPtr: Int, environBufPtr: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_fdstat_get")
private external fun wasiFdFdstatGet(fd: Int, statPtr: Int): Int

internal object WasiLibcEnv {
    private var initialized = false
    private val envMap = mutableMapOf<String, String>()

    private fun ensureInitialized() {
        if (initialized) return
        initialized = true
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
            for (i in 0 until count) {
                val entryAddr = (ptrs + i * 4).loadInt()
                val bytes = ByteArray(bufSize)
                var len = 0
                val baseAddr = buf.address.toInt()
                val offset = entryAddr - baseAddr
                if (offset in 0 until bufSize) {
                    while (offset + len < bufSize) {
                        val b = (buf + (offset + len)).loadByte()
                        if (b == 0.toByte()) break
                        bytes[len] = b
                        len++
                    }
                    val entry = bytes.decodeToString(0, len)
                    val eq = entry.indexOf('=')
                    if (eq > 0) {
                        envMap[entry.substring(0, eq)] = entry.substring(eq + 1)
                    }
                }
            }
        }
    }

    fun getenv(name: String?): String? {
        if (name == null) return null
        ensureInitialized()
        return envMap[name]
    }

    fun setenv(name: String?, value: String?, overwrite: Int): Int {
        if (name == null || value == null || name.isEmpty() || '=' in name) return -1
        ensureInitialized()
        if (overwrite != 0 || !envMap.containsKey(name)) {
            envMap[name] = value
        }
        return 0
    }

    fun unsetenv(name: String?): Int {
        if (name == null || name.isEmpty() || '=' in name) return -1
        ensureInitialized()
        envMap.remove(name)
        return 0
    }

    fun putenv(str: String?): Int {
        if (str == null) return -1
        ensureInitialized()
        val eq = str.indexOf('=')
        if (eq < 0) {
            envMap.remove(str)
            return 0
        }
        if (eq == 0) return -1
        envMap[str.substring(0, eq)] = str.substring(eq + 1)
        return 0
    }

    fun putenvS(name: String?, value: String?): Int {
        if (name == null || value == null || name.isEmpty() || '=' in name) return 22
        ensureInitialized()
        if (value.isEmpty()) {
            envMap.remove(name)
        } else {
            envMap[name] = value
        }
        return 0
    }

    fun clearenv(): Int {
        ensureInitialized()
        envMap.clear()
        return 0
    }

    fun isatty(fd: Int): Int =
        withScopedMemoryAllocator { allocator ->
            val statPtr = allocator.allocate(24)
            val rc = wasiFdFdstatGet(fd, statPtr.address.toInt())
            if (rc != 0) {
                0
            } else {
                val filetype = statPtr.loadByte().toInt() and 0xFF
                val rightsBase = (statPtr + 8).loadLong().toULong()
                val seekOrTell = (1uL shl 2) or (1uL shl 5)
                if (filetype == 2 && (rightsBase and seekOrTell) == 0uL) 1 else 0
            }
        }
}
