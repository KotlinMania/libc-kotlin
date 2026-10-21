package consumer

import kotlin.test.Test

class PublishedLibcTest {
    @Test
    fun publishedAndroidApiUsesRealNativeMemory() = verifyHostMemory()

    @Test
    fun publishedAndroidApiUsesRealDescriptorsAndErrno() = verifyHostDescriptorIo("build/consumer-io")
}
