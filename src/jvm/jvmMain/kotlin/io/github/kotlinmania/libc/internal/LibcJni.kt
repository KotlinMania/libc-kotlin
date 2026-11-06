package io.github.kotlinmania.libc.internal

import java.io.File

internal object LibcJni {
    init {
        try {
            System.loadLibrary("libc_jni")
        } catch (error: UnsatisfiedLinkError) {
            val os = System.getProperty("os.name", "").lowercase()
            val arch =
                when (System.getProperty("os.arch", "").lowercase()) {
                    "aarch64", "arm64" -> "aarch64"
                    "amd64", "x86_64" -> "x86_64"
                    else -> throw UnsatisfiedLinkError("Unsupported JNI architecture: ${System.getProperty("os.arch")}")
                }
            val platform =
                when {
                    os.contains("mac") || os.contains("darwin") -> "macos"
                    os.contains("windows") -> "windows"
                    os.contains("linux") -> "linux"
                    else -> throw UnsatisfiedLinkError("Unsupported JNI host: $os")
                }
            val mapped = System.mapLibraryName("libc_jni")
            val resource = "/io/github/kotlinmania/libc/native/$platform-$arch/$mapped"
            val stream =
                LibcJni::class.java.getResourceAsStream(resource)
                    ?: throw UnsatisfiedLinkError("Missing packaged JNI library $resource").apply { initCause(error) }
            val extracted = File.createTempFile("kotlinmania-libc-", "." + mapped.substringAfterLast('.'))
            extracted.deleteOnExit()
            stream.use { input -> extracted.outputStream().use { input.copyTo(it) } }
            System.load(extracted.absolutePath)
        }
    }

    @JvmStatic
    external fun isHostAvailable(): Boolean

    @JvmStatic
    external fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long

    @JvmStatic
    external fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double

    @JvmStatic
    external fun resolveSymbolAddress(symbol: String): Long

    @JvmStatic
    external fun lastErrorNumber(): Int

    @JvmStatic
    external fun strlenAt(address: Long): Int

    @JvmStatic
    external fun allocZeroed(size: Int): Long

    @JvmStatic
    external fun freeMem(address: Long)

    @JvmStatic
    external fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray

    @JvmStatic
    external fun writeBytes(
        address: Long,
        source: ByteArray,
    )
}
