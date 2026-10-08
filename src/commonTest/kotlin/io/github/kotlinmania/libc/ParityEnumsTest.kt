package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import io.github.kotlinmania.libc.unix.bsd.apple.SysdirSearchPathDirectoryT
import io.github.kotlinmania.libc.unix.bsd.apple.SysdirSearchPathDomainMaskT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_match_flags`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_metric`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_priority`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_select_mode`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_support_flags`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_tag_type`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_trans_flags`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.`devstat_type_flags`
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.dot3Vendors
import io.github.kotlinmania.libc.vxworks.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ParityEnumsTest {
    @Test
    fun nfsStatusPreservesSubsystemAndErrorCodes() {
        assertEquals(0x00300063, S_nfsLib_NFSERR_WFLUSH)
        assertEquals(0x00300047, S_nfsLib_NFSERR_REMOTE)
        assertEquals(0x00302711, S_nfsLib_NFSERR_BADHANDLE)
        assertEquals(0x00302712, S_nfsLib_NFSERR_NOT_SYNC)
        assertEquals(0x00302713, S_nfsLib_NFSERR_BAD_COOKIE)
        assertEquals(0x00302715, S_nfsLib_NFSERR_TOOSMALL)
        assertEquals(0x00302717, S_nfsLib_NFSERR_BADTYPE)
        assertEquals(0x00302718, S_nfsLib_NFSERR_JUKEBOX)
    }

    @Test
    fun `devstat_support_flags`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 4u), `devstat_support_flags`.entries.map { it.value })
    }

    @Test
    fun `devstat_trans_flags`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 3u), `devstat_trans_flags`.entries.map { it.value })
    }

    @Test
    fun `devstat_tag_type`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 3u), `devstat_tag_type`.entries.map { it.value })
    }

    @Test
    fun `devstat_match_flags`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 4u), `devstat_match_flags`.entries.map { it.value })
    }

    @Test
    fun `devstat_priority`MatchesCValues() {
        assertEquals(listOf(0u, 32u, 48u, 64u, 80u, 96u, 144u, 272u, 288u, 4095u), `devstat_priority`.entries.map { it.value })
    }

    @Test
    fun `devstat_type_flags`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 3u, 4u, 5u, 6u, 7u, 8u, 9u, 10u, 11u, 12u, 13u, 14u, 15u, 16u, 32u, 48u, 240u, 256u), `devstat_type_flags`.entries.map { it.value })
    }

    @Test
    fun `devstat_metric`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 3u, 4u, 5u, 6u, 7u, 8u, 9u, 10u, 11u, 12u, 13u, 14u, 15u, 16u, 17u, 18u, 19u, 20u, 21u, 22u, 23u, 24u, 25u, 26u, 27u, 28u, 29u, 30u, 31u, 32u, 33u, 34u, 35u, 36u, 37u, 38u, 39u, 40u, 41u, 42u, 43u, 44u, 45u), `devstat_metric`.entries.map { it.value })
    }

    @Test
    fun `devstat_select_mode`MatchesCValues() {
        assertEquals(listOf(0u, 1u, 2u, 3u), `devstat_select_mode`.entries.map { it.value })
    }

    @Test
    fun dot3VendorsMatchesCValues() {
        assertEquals(listOf(1u, 2u, 4u, 5u, 6u, 7u), dot3Vendors.entries.map { it.value })
        assertEquals(1u, dot3Vendors.DOT3_VENDOR_AMD.value)
    }

    @Test
    fun `sysdir_search_path_directory_t`MatchesCValues() {
        assertEquals(listOf(1u, 2u, 3u, 4u, 5u, 6u, 7u, 8u, 9u, 10u, 11u, 12u, 13u, 14u, 15u, 16u, 17u, 18u, 19u, 20u, 21u, 22u, 100u, 101u), SysdirSearchPathDirectoryT.entries.map { it.value })
    }

    @Test
    fun `sysdir_search_path_domain_mask_t`MatchesCValues() {
        assertEquals(listOf(1u, 2u, 4u, 8u, 65535u), SysdirSearchPathDomainMaskT.entries.map { it.value })
    }

    @Test
    fun qosClassTMatchesCValues() {
        assertEquals(listOf(33u, 25u, 21u, 17u, 9u, 0u), QosClassT.entries.map { it.value })
    }
}
