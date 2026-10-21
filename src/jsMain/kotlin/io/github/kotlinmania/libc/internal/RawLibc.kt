package io.github.kotlinmania.libc.internal

private external interface RawBindings {
    fun rawAllocate(size: String): String
    fun rawAllocateZeroed(count: String, size: String): String
    fun rawResize(address: String, size: String): String
    fun rawRelease(address: String)
    fun rawFill(address: String, value: Int, size: String): String
    fun rawCopy(destination: String, source: String, size: String): String
    fun rawCompare(first: String, second: String, size: String): Int
    fun rawOpen(path: String?, flags: Int, mode: Int): Int
    fun rawClose(fd: Int): Int
    fun rawRead(fd: Int, address: String, size: String): String
    fun rawWrite(fd: Int, address: String, size: String): String
    fun rawSeek(fd: Int, offset: String, whence: Int): String
    fun rawKill(pid: Int, sig: Int): Int
    fun rawMlock(address: String, size: String): Int
    fun rawMunlock(address: String, size: String): Int
    fun rawNumericNameinfoFlags(): Int
    fun rawErrno(): Int
    fun rawOpenFlag(index: Int): Int
    fun rawDescriptorCommand(index: Int): Int
    fun rawFcntlNoArgument(fd: Int, command: Int): Int
    fun rawFcntlInteger(fd: Int, command: Int, argument: Int): Int
    fun rawFcntlPointer(fd: Int, command: Int, address: String): Int
}

private fun nodeRuntimeAvailable(): Boolean = js("typeof globalThis.process !== 'undefined' && typeof globalThis.process.getBuiltinModule === 'function'")

private fun loadRawBindings(): RawBindings =
    js(
        """(() => {
    const proc = globalThis.process;
    const modules = proc.getBuiltinModule("module");
    const path = proc.getBuiltinModule("path");
    const requireNative = modules.createRequire(path.join(proc.cwd(), "package.json"));
    const bindings = requireNative("@kotlinmania/libc-native-bindings");
    if (typeof bindings.rawAbiVersion !== "function" || bindings.rawAbiVersion() !== 2 || typeof bindings.rawAllocate !== "function" || typeof bindings.rawFcntlInteger !== "function" || typeof bindings.rawKill !== "function" || typeof bindings.rawMlock !== "function" || typeof bindings.rawMunlock !== "function") {
        throw new Error("libc native bindings lack the required raw-memory and process ABI; install the matching library artifact");
    }
    return bindings;
})()""",
    ).unsafeCast<RawBindings>()

private val rawBindings: RawBindings by lazy {
    if (!nodeRuntimeAvailable()) throw UnsupportedOperationException("Native libc memory and descriptor operations require Node.js; browsers cannot access host pointers or POSIX descriptors")
    loadRawBindings()
}

internal fun kill(pid: Int, sig: Int): Int = rawBindings.rawKill(pid, sig)
internal fun mlock(address: Long, size: ULong): Int = rawBindings.rawMlock(address.toULong().toString(), size.toString())
internal fun munlock(address: Long, size: ULong): Int = rawBindings.rawMunlock(address.toULong().toString(), size.toString())

internal actual object RawLibc {
    actual fun allocate(size: Long): Long = rawBindings.rawAllocate(size.toULong().toString()).toULong().toLong()
    actual fun allocateZeroed(count: Long, size: Long): Long = rawBindings.rawAllocateZeroed(count.toULong().toString(), size.toULong().toString()).toULong().toLong()
    actual fun resize(address: Long, size: Long): Long = rawBindings.rawResize(address.toULong().toString(), size.toULong().toString()).toULong().toLong()
    actual fun release(address: Long) = rawBindings.rawRelease(address.toULong().toString())
    actual fun fill(address: Long, value: Int, size: Long): Long = rawBindings.rawFill(address.toULong().toString(), value, size.toULong().toString()).toULong().toLong()
    actual fun copy(destination: Long, source: Long, size: Long): Long = rawBindings.rawCopy(destination.toULong().toString(), source.toULong().toString(), size.toULong().toString()).toULong().toLong()
    actual fun compare(first: Long, second: Long, size: Long): Int = rawBindings.rawCompare(first.toULong().toString(), second.toULong().toString(), size.toULong().toString())
    actual fun open(path: String?, flags: Int, mode: Int): Int = rawBindings.rawOpen(path, flags, mode)
    actual fun close(fd: Int): Int = rawBindings.rawClose(fd)
    actual fun read(fd: Int, address: Long, size: Long): Long = rawBindings.rawRead(fd, address.toULong().toString(), size.toULong().toString()).toLong()
    actual fun write(fd: Int, address: Long, size: Long): Long = rawBindings.rawWrite(fd, address.toULong().toString(), size.toULong().toString()).toLong()
    actual fun seek(fd: Int, offset: Long, whence: Int): Long = rawBindings.rawSeek(fd, offset.toString(), whence).toLong()
    actual fun numericNameinfoFlags(): Int = rawBindings.rawNumericNameinfoFlags()
    actual fun errno(): Int = rawBindings.rawErrno()
    actual fun openFlags(): IntArray = IntArray(7) { rawBindings.rawOpenFlag(it) }
    actual fun descriptorCommands(): IntArray? = if (rawBindings.rawDescriptorCommand(0) == -1) null else IntArray(4) { rawBindings.rawDescriptorCommand(it) }
    actual fun fcntlNoArgument(fd: Int, command: Int): Int = rawBindings.rawFcntlNoArgument(fd, command)
    actual fun fcntlInteger(fd: Int, command: Int, argument: Int): Int = rawBindings.rawFcntlInteger(fd, command, argument)
    actual fun fcntlPointer(fd: Int, command: Int, address: Long): Int = rawBindings.rawFcntlPointer(fd, command, address.toULong().toString())
}
