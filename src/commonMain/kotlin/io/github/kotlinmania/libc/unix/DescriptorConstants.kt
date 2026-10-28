package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.internal.RawLibc

/** File-opening flags from the current host C runtime. */
public class FileOpenFlags internal constructor(
    public val readOnly: Int,
    public val writeOnly: Int,
    public val readWrite: Int,
    public val create: Int,
    public val truncate: Int,
    public val seekStart: Int,
    public val binary: Int,
)

/** Descriptor commands from a host supporting the POSIX descriptor API. */
public class DescriptorCommands internal constructor(
    public val getFlags: Int,
    public val setFlags: Int,
    public val closeOnExec: Int,
    public val badDescriptor: Int,
)

public fun fileOpenFlags(): FileOpenFlags {
    val flags = RawLibc.openFlags()
    return FileOpenFlags(flags[0], flags[1], flags[2], flags[3], flags[4], flags[5], flags[6])
}

/** Null when the host has no POSIX descriptor command facility. */
public fun descriptorCommands(): DescriptorCommands? =
    RawLibc.descriptorCommands()?.let { DescriptorCommands(it[0], it[1], it[2], it[3]) }

/** Error captured by the latest raw memory or descriptor operation on the current thread. */
public fun lastErrorNumber(): Int = RawLibc.errno()

/** Host flags requiring numeric host and service names from getnameinfo. */
public fun numericNameinfoFlags(): Int = RawLibc.numericNameinfoFlags()

internal inline fun <T> withDescriptorCommands(operation: () -> T): T {
    if (RawLibc.descriptorCommands() == null) throw UnsupportedOperationException("The host C runtime has no POSIX descriptor command facility")
    return operation()
}
