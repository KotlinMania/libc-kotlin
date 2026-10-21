package io.github.kotlinmania.libc.internal

internal expect object RawLibc {
    fun allocate(size: Long): Long
    fun allocateZeroed(count: Long, size: Long): Long
    fun resize(address: Long, size: Long): Long
    fun release(address: Long)
    fun fill(address: Long, value: Int, size: Long): Long
    fun copy(destination: Long, source: Long, size: Long): Long
    fun compare(first: Long, second: Long, size: Long): Int
    fun open(path: String?, flags: Int, mode: Int): Int
    fun close(fd: Int): Int
    fun read(fd: Int, address: Long, size: Long): Long
    fun write(fd: Int, address: Long, size: Long): Long
    fun seek(fd: Int, offset: Long, whence: Int): Long
    fun numericNameinfoFlags(): Int
    fun errno(): Int
    fun openFlags(): IntArray
    fun descriptorCommands(): IntArray?
    fun fcntlNoArgument(fd: Int, command: Int): Int
    fun fcntlInteger(fd: Int, command: Int, argument: Int): Int
    fun fcntlPointer(fd: Int, command: Int, address: Long): Int
}

internal fun ULong.toRawSize(): Long = toLong()
