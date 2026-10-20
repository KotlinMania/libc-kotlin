package io.github.kotlinmania.libc.internal

internal actual object RawLibc {
    init {
        LibcJni.getErrno()
        check(abiVersion() == 2) { "The libc JNI payload does not match the Kotlin library ABI" }
    }

    private external fun abiVersion(): Int

    actual external fun allocate(size: Long): Long
    actual external fun allocateZeroed(count: Long, size: Long): Long
    actual external fun resize(address: Long, size: Long): Long
    actual external fun release(address: Long)
    actual external fun fill(address: Long, value: Int, size: Long): Long
    actual external fun copy(destination: Long, source: Long, size: Long): Long
    actual external fun compare(first: Long, second: Long, size: Long): Int
    actual fun open(path: String?, flags: Int, mode: Int): Int = openPath(path?.encodeToByteArray()?.plus(byteArrayOf(0)), flags, mode)
    private external fun openPath(path: ByteArray?, flags: Int, mode: Int): Int
    actual external fun close(fd: Int): Int
    actual external fun read(fd: Int, address: Long, size: Long): Long
    actual external fun write(fd: Int, address: Long, size: Long): Long
    actual external fun seek(fd: Int, offset: Long, whence: Int): Long
    actual external fun numericNameinfoFlags(): Int
    actual external fun errno(): Int
    actual external fun openFlags(): IntArray
    actual external fun descriptorCommands(): IntArray?
    actual external fun fcntlNoArgument(fd: Int, command: Int): Int
    actual external fun fcntlInteger(fd: Int, command: Int, argument: Int): Int
    actual external fun fcntlPointer(fd: Int, command: Int, address: Long): Int
}
