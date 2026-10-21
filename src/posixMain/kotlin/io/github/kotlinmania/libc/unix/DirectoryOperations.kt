@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.linuxlike.Dirent
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value

public actual fun opendir(dirname: String?): DIR? =
    libc.cinterop.libc_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun fdopendir(fd: Int): DIR? =
    libc.cinterop.libc_fdopendir(fd)?.let { DIR(it.toLong()) }

/** The returned snapshot owns its bytes independently of the stream's next read. */
public actual fun readdir(dirp: DIR?): Dirent? {
    val native = libc.cinterop.libc_readdir(requireNotNull(dirp).handle.toCPointer<ByteVar>()) ?: return null
    val readErrno = libc.cinterop.libc_get_errno()
    return try {
        directoryEntrySnapshot(native)
    } finally {
        libc.cinterop.libc_free(native)
        libc.cinterop.libc_set_errno(readErrno)
    }
}

/**
 * Writes into an entry supplied by [NativeDirectoryEntryBuffer]. The result is
 * the real address of that caller-owned storage, or zero at end of directory.
 * The caller must keep the buffer open while using the address. Reads through
 * these APIs are serialized. Foreign direct reads, sharing an output buffer,
 * and stream closure still require caller synchronization.
 */
public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int {
    requireNotNull(dirp)
    requireNotNull(entry)
    requireNotNull(result)
    require(entry.nativeStorage != 0L) { "Entry requires an open NativeDirectoryEntryBuffer" }
    val incomingErrno = libc.cinterop.libc_get_errno()
    return try {
        memScoped {
            val output = alloc<kotlinx.cinterop.COpaquePointerVar>()
            output.value = null
            val status =
                libc.cinterop.libc_readdir_r(
                    dirp.handle.toCPointer<ByteVar>(),
                    entry.nativeStorage.toCPointer<ByteVar>(),
                    output.ptr,
                )
            val nativeEntry = output.value
            result.value = nativeEntry?.toLong() ?: 0L
            if (status == 0 && nativeEntry != null) {
                val snapshot = directoryEntrySnapshot(nativeEntry)
                entry.dIno = snapshot.dIno
                entry.dOff = snapshot.dOff
                entry.dReclen = snapshot.dReclen
                entry.dType = snapshot.dType
                entry.dName = snapshot.dName
            }
            status
        }
    } finally {
        libc.cinterop.libc_set_errno(incomingErrno)
    }
}

private fun directoryEntrySnapshot(pointer: CPointer<*>): Dirent {
    val length = libc.cinterop.libc_dirent_name_length(pointer)
    check(length < Int.MAX_VALUE.toULong()) { "Directory entry name cannot fit in a Kotlin array" }
    val name = requireNotNull(libc.cinterop.libc_dirent_name(pointer))
    return Dirent(
        dIno = libc.cinterop.libc_dirent_inode(pointer),
        dOff = libc.cinterop.libc_dirent_offset(pointer),
        dReclen = libc.cinterop.libc_dirent_record_length(pointer),
        dType = libc.cinterop.libc_dirent_type(pointer),
        dName = ByteArray(length.toInt() + 1) { name[it] },
    )
}

/** Owns the native output storage required by the existing reentrant API. */
public class NativeDirectoryEntryBuffer(
    stream: DIR,
) : AutoCloseable {
    public val entry: Dirent = Dirent(0uL, 0L, 0u, 0u, byteArrayOf(0))
    private var storage: Long =
        checkNotNull(libc.cinterop.libc_dirent_allocate(stream.handle.toCPointer<ByteVar>())) {
            "Cannot allocate directory entry storage; errno=${libc.cinterop.libc_get_errno()}"
        }.toLong()

    public val address: Long get() = storage
    public val capacity: ULong get() = if (storage == 0L) 0uL else libc.cinterop.libc_dirent_capacity(storage.toCPointer<ByteVar>())

    init {
        entry.nativeStorage = storage
    }

    override fun close() {
        if (storage != 0L) {
            libc.cinterop.libc_dirent_release(storage.toCPointer<ByteVar>())
            storage = 0L
            entry.nativeStorage = 0L
        }
    }
}
