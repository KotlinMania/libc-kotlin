@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_ch_reserve(channel, sampleCount, format.toInt())

public actual fun sceAudioChRelease(channel: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_ch_release(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output_blocking(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output_panned(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output_panned_blocking(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_get_channel_rest_len(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_get_channel_rest_length(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_set_channel_data_len(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_change_channel_config(channel, format.toInt())

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_change_channel_volume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output2reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output2release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output2change_length(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output2output_blocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutput2GetRestSample(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_output2get_rest_sample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_srcch_reserve(sampleCount, freq.toInt(), channels)

public actual fun sceAudioSRCChRelease(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_srcch_release()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_srcoutput_blocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_input_init(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: AudioInputParams?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_input_init_ex(params?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_input_blocking(sampleCount, freq.toInt(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_input(sampleCount, freq.toInt(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun sceAudioGetInputLength(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_get_input_length()

public actual fun sceAudioWaitInputEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_wait_input_end()

public actual fun sceAudioPollInputEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_audio_poll_input_end()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_atrac_id(uiCodecType)

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_data_and_get_id(buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_decode_data(atracId, outSamples?.value?.toCPointer<ByteVar>(), outN?.value?.toCPointer<ByteVar>(), outEnd?.value?.toCPointer<ByteVar>(), outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_remain_frame(atracId, outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_stream_data_info(atracId, writePointer?.value?.toCPointer<ByteVar>(), availableBytes?.value?.toCPointer<ByteVar>(), readOffset?.value?.toCPointer<ByteVar>())

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_add_stream_data(atracId, bytesToAdd)

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_bitrate(atracId, outBitrate?.value?.toCPointer<ByteVar>())

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_loop_num(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_release_atrac_id(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_next_sample(atracId, outN?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_max_sample(atracId, outMax?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_buffer_info_for_reseting(atracId, uiSample, pbufferInfo?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_channel(atracId, puiChannel?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_internal_error_info(atracId, piResult?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_loop_status(atracId, piLoopNum?.value?.toCPointer<ByteVar>(), puiLoopStatus?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_next_decode_position(atracId, puiSamplePosition?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_second_buffer_info(atracId, puiPosition?.value?.toCPointer<ByteVar>(), puiDataByte?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_get_sound_sample(atracId, piEndSample?.value?.toCPointer<ByteVar>(), piLoopStartSample?.value?.toCPointer<ByteVar>(), piLoopEndSample?.value?.toCPointer<ByteVar>())

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_reset_play_position(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_data(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiBufferByte)

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_halfway_buffer(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_halfway_buffer_and_get_id(pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_atrac_set_second_buffer(atracId, pucSecondBufferAddr?.value?.toCPointer<ByteVar>(), uiSecondBufferByte)

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_set_sampling_cycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_get_sampling_cycle(pcycle?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_set_sampling_mode(mode.toInt())

public actual fun sceCtrlGetSamplingMode(pmode: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_get_sampling_mode(pmode?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_peek_buffer_positive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_peek_buffer_negative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_read_buffer_positive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_read_buffer_negative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_peek_latch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_read_latch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_set_idle_cancel_threshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ctrl_get_idle_cancel_threshold(idlereset?.value?.toCPointer<ByteVar>(), idleback?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_set_mode(mode.toInt(), width, height)

public actual fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_mode(pmode?.value?.toCPointer<ByteVar>(), pwidth?.value?.toCPointer<ByteVar>(), pheight?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_set_frame_buf(topAddr?.value?.toCPointer<ByteVar>(), bufferWidth, pixelFormat.toInt(), sync.toInt())

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_frame_buf(topAddr?.value?.toCPointer<ByteVar>(), bufferWidth?.value?.toCPointer<ByteVar>(), pixelFormat?.value?.toCPointer<ByteVar>(), sync.toInt())

public actual fun sceDisplayGetVcount(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_vcount()

public actual fun sceDisplayWaitVblank(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_wait_vblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_wait_vblank_cb()

public actual fun sceDisplayWaitVblankStart(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_wait_vblank_start()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_wait_vblank_start_cb()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_accumulated_hcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_current_hcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_get_frame_per_sec()

public actual fun sceDisplayIsForeground(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_is_foreground()

public actual fun sceDisplayIsVblank(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_display_is_vblank()

public actual fun sceGeEdramGetSize(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_edram_get_size()

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_edram_get_addr()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_edram_set_addr_translation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_get_cmd(cmd)

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_get_mtx(type.toInt(), matrix?.value?.toCPointer<ByteVar>())

public actual fun sceGeGetStack(stackId: Int, stack: GeStack?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_get_stack(stackId, stack?.value?.toCPointer<ByteVar>())

public actual fun sceGeSaveContext(context: GeContext?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_save_context(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeRestoreContext(context: GeContext?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_restore_context(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_list_en_queue(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_list_en_queue_head(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListDeQueue(qid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_list_de_queue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_list_update_stall_addr(qid, stall?.value?.toCPointer<ByteVar>())

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_list_sync(qid, syncType)

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_draw_sync(syncType)

public actual fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_break(mode, pParam?.value?.toCPointer<ByteVar>())

public actual fun sceGeContinue(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_continue()

public actual fun sceGeSetCallback(cb: GeCallbackData?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_set_callback(cb?.value?.toCPointer<ByteVar>())

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ge_unset_callback(cbid)

public actual fun sceKernelExitGame() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_exit_game()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_register_exit_callback(id.toInt())

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_load_exec(file?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_alloc_partition_memory(partition.toInt(), name?.value?.toCPointer<ByteVar>(), type.toInt(), size, addr?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_block_head_addr(blockid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_free_partition_memory(blockid.toInt())

public actual fun sceKernelTotalFreeMemSize(): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_total_free_mem_size()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_max_free_mem_size()

public actual fun sceKernelDevkitVersion(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_devkit_version()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_compiled_sdk_version(version)

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_compiled_sdk_version()

public actual fun sceKernelLibcTime(t: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_libc_time(t?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLibcClock(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_libc_clock()

public actual fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_libc_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tzp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDcacheWritebackAll() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_dcache_writeback_all()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_dcache_writeback_invalidate_all()
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_dcache_writeback_range(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_dcache_writeback_invalidate_range(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_dcache_invalidate_range(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelIcacheInvalidateAll() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_icache_invalidate_all()
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_icache_invalidate_range(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_mt19937init(ctx?.value?.toCPointer<ByteVar>(), seed)

public actual fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_mt19937uint(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_md5digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_md5block_init(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_md5block_update(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_md5block_result(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_sha1digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_sha1block_init(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_sha1block_update(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_utils_sha1block_result(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_register_sub_intr_handler(intNo, no, handler?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_release_sub_intr_handler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_enable_sub_intr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_disable_sub_intr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_query_intr_handler_info(intrCode.toInt(), subIntrCode.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCpuSuspendIntr(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cpu_suspend_intr()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cpu_resume_intr(flags)
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cpu_resume_intr_with_sync(flags)
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_is_cpu_intr_suspended(flags)

public actual fun sceKernelIsCpuIntrEnable(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_is_cpu_intr_enable()

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_load_module(path?.value?.toCPointer<ByteVar>(), flags, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_load_module_ms(path?.value?.toCPointer<ByteVar>(), flags, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_load_module_by_id(fid.toInt(), flags, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_load_module_buffer_usb_wlan(bufSize, buf?.value?.toCPointer<ByteVar>(), flags, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_start_module(modId.toInt(), argSize, argp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stop_module(modId.toInt(), argSize, argp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_unload_module(modId.toInt())

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_self_stop_unload_module(unknown, argSize, argp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stop_unload_self_module(argSize, argp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_query_module_info(modId.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_module_id_list(readBuf?.value?.toCPointer<ByteVar>(), readBufSize, idCount?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_volatile_mem_lock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_volatile_mem_try_lock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_volatile_mem_unlock(unk)

public actual fun sceKernelStdin(): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stdin()

public actual fun sceKernelStdout(): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stdout()

public actual fun sceKernelStderr(): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stderr()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_threadman_id_type(uid.toInt())

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_thread(name?.value?.toCPointer<ByteVar>(), entry.toInt(), initPriority, stackSize, attr, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_thread(thid.toInt())

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_start_thread(id.toInt(), argLen, argP?.value?.toCPointer<ByteVar>())

public actual fun sceKernelExitThread(status: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_exit_thread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_exit_delete_thread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_terminate_thread(thid.toInt())

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_terminate_delete_thread(thid.toInt())

public actual fun sceKernelSuspendDispatchThread(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_suspend_dispatch_thread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_resume_dispatch_thread(state)

public actual fun sceKernelSleepThread(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_sleep_thread()

public actual fun sceKernelSleepThreadCB(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_sleep_thread_cb()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wakeup_thread(thid.toInt())

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_wakeup_thread(thid.toInt())

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_suspend_thread(thid.toInt())

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_resume_thread(thid.toInt())

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_thread_end(thid.toInt(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_thread_end_cb(thid.toInt(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDelayThread(delay: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delay_thread(delay)

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delay_thread_cb(delay)

public actual fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delay_sys_clock_thread(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delay_sys_clock_thread_cb(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_change_current_thread_attr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_change_thread_priority(thid.toInt(), priority)

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_rotate_thread_ready_queue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_release_wait_thread(thid.toInt())

public actual fun sceKernelGetThreadId(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_thread_id()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_thread_current_priority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_thread_exit_status(thid.toInt())

public actual fun sceKernelCheckThreadStack(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_check_thread_stack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_thread_stack_free_size(thid.toInt())

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_thread_status(thid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_thread_run_status(thid.toInt(), status?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_sema(name?.value?.toCPointer<ByteVar>(), attr, initVal, maxVal, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_sema(semaId.toInt())

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_signal_sema(semaId.toInt(), signal)

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_sema(semaId.toInt(), signal, timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_sema_cb(semaId.toInt(), signal, timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_poll_sema(semaId.toInt(), signal)

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_sema_status(semaId.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_event_flag(name?.value?.toCPointer<ByteVar>(), attr, bits, opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_event_flag(evId.toInt(), bits)

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_clear_event_flag(evId.toInt(), bits)

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_poll_event_flag(evId.toInt(), bits, wait, outBits?.value?.toCPointer<ByteVar>())

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_event_flag(evId.toInt(), bits, wait, outBits?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_wait_event_flag_cb(evId.toInt(), bits, wait, outBits?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_event_flag(evId.toInt())

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_event_flag_status(event.toInt(), status?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_mbx(name?.value?.toCPointer<ByteVar>(), attr, option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_mbx(mbxId.toInt())

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_send_mbx(mbxId.toInt(), message?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_receive_mbx(mbxId.toInt(), message?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_receive_mbx_cb(mbxId.toInt(), message?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_poll_mbx(mbxId.toInt(), pmessage?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_receive_mbx(mbxId.toInt(), num?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_mbx_status(mbxId.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_alarm(clock, handler.toInt(), common?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_sys_clock_alarm(clock?.value?.toCPointer<ByteVar>(), handler?.value?.toCPointer<ByteVar>(), common?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_alarm(alarmId.toInt())

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_alarm_status(alarmId.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_callback(name?.value?.toCPointer<ByteVar>(), func.toInt(), arg?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_callback_status(cb.toInt(), status?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_callback(cb.toInt())

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_notify_callback(cb.toInt(), arg2)

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_callback(cb.toInt())

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_callback_count(cb.toInt())

public actual fun sceKernelCheckCallback(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_check_callback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_threadman_id_list(type.toInt(), readBuf?.value?.toCPointer<ByteVar>(), readBufSize, idCount?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_system_status(status?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_msg_pipe(name?.value?.toCPointer<ByteVar>(), part, attr, unk1?.value?.toCPointer<ByteVar>(), opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_msg_pipe(uid.toInt())

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_send_msg_pipe(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_send_msg_pipe_cb(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_try_send_msg_pipe(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_receive_msg_pipe(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_receive_msg_pipe_cb(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_try_receive_msg_pipe(uid.toInt(), message?.value?.toCPointer<ByteVar>(), size, unk1, unk2?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_msg_pipe(uid.toInt(), send?.value?.toCPointer<ByteVar>(), recv?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_msg_pipe_status(uid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_vpl(name?.value?.toCPointer<ByteVar>(), part, attr, size, opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_vpl(uid.toInt())

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_allocate_vpl(uid.toInt(), size, data?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_allocate_vpl_cb(uid.toInt(), size, data?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_try_allocate_vpl(uid.toInt(), size, data?.value?.toCPointer<ByteVar>())

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_free_vpl(uid.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_vpl(uid.toInt(), num?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_vpl_status(uid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_fpl(name?.value?.toCPointer<ByteVar>(), part, attr, size, blocks, opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_fpl(uid.toInt())

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_allocate_fpl(uid.toInt(), data?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_allocate_fpl_cb(uid.toInt(), data?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_try_allocate_fpl(uid.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_free_fpl(uid.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_fpl(uid.toInt(), pnum?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_fpl_status(uid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_usec2sys_clock(usec, clock?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_usec2sys_clock_wide(usec)

public actual fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_sys_clock2usec(clock?.value?.toCPointer<ByteVar>(), low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_sys_clock2usec_wide(clock, low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_system_time(time?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTimeWide(): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_system_time_wide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_system_time_low()

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_create_vtimer(name?.value?.toCPointer<ByteVar>(), opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_delete_vtimer(uid.toInt())

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_vtimer_base(uid.toInt(), base?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_vtimer_base_wide(uid.toInt())

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_vtimer_time(uid.toInt(), time?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_get_vtimer_time_wide(uid.toInt())

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_vtimer_time(uid.toInt(), time?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_vtimer_time_wide(uid.toInt(), time)

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_start_vtimer(uid.toInt())

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_stop_vtimer(uid.toInt())

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_vtimer_handler(uid.toInt(), time?.value?.toCPointer<ByteVar>(), handler.toInt(), common?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_set_vtimer_handler_wide(uid.toInt(), time, handler.toInt(), common?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_cancel_vtimer_handler(uid.toInt())

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_vtimer_status(uid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_register_thread_event_handler(name?.value?.toCPointer<ByteVar>(), threadId.toInt(), mask, handler.toInt(), common?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_release_thread_event_handler(uid.toInt())

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_thread_event_handler_status(uid.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReferThreadProfiler(): DebugProfilerRegs? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_thread_profiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_kernel_refer_global_profiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_start(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_stop(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbActivate(pid: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_activate(pid)

public actual fun sceUsbDeactivate(pid: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_deactivate(pid)

public actual fun sceUsbGetState(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_get_state()

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_get_drv_state(driverName?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_setup_still(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_setup_still_ex(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_input_blocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_input(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_wait_input_end()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_poll_input_end()

public actual fun sceUsbCamStillCancelInput(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_cancel_input()

public actual fun sceUsbCamStillGetInputLength(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_still_get_input_length()

public actual fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_setup_video(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_setup_video_ex(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_start_video()

public actual fun sceUsbCamStopVideo(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_stop_video()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_read_video_frame_blocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_read_video_frame(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_wait_read_video_frame_end()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_poll_read_video_frame_end()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_read_video_frame_size()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_saturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_brightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_contrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_sharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_image_effect_mode(effectMode.toInt())

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_ev_level(exposureLevel.toInt())

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_reverse_mode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_set_zoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_saturation(saturation?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetBrightness(brightness: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_brightness(brightness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetContrast(contrast: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_contrast(contrast?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetSharpness(sharpness: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_sharpness(sharpness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_image_effect_mode(effectMode?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_ev_level(exposureLevel?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_reverse_mode(reverseFlags?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetZoom(zoom: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_zoom(zoom?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_auto_image_reverse_sw(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_auto_image_reverse_state()

public actual fun sceUsbCamGetLensDirection(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usb_cam_get_lens_direction()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usbstor_boot_register_notify(eventFlag.toInt())

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usbstor_boot_unregister_notify(eventFlag)

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_usbstor_boot_set_capacity(size)

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_register_callback(slot, cbid.toInt())

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_unregister_callback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_is_power_online()

public actual fun scePowerIsBatteryExist(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_is_battery_exist()

public actual fun scePowerIsBatteryCharging(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_is_battery_charging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_charging_status()

public actual fun scePowerIsLowBattery(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_is_low_battery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_life_percent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_life_time()

public actual fun scePowerGetBatteryTemp(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_temp()

public actual fun scePowerGetBatteryElec(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_elec()

public actual fun scePowerGetBatteryVolt(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_battery_volt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_set_cpu_clock_frequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_set_bus_clock_frequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_cpu_clock_frequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_cpu_clock_frequency_int()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_cpu_clock_frequency_float()

public actual fun scePowerGetBusClockFrequency(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_bus_clock_frequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_bus_clock_frequency_int()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_bus_clock_frequency_float()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_set_clock_frequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_lock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_unlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_tick(t.toInt())

public actual fun scePowerGetIdleTimer(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_get_idle_timer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_idle_timer_enable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_idle_timer_disable(unknown)

public actual fun scePowerRequestStandby(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_request_standby()

public actual fun scePowerRequestSuspend(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_power_request_suspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_wlan_dev_is_power_on()

public actual fun sceWlanGetSwitchState(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_wlan_get_switch_state()

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_wlan_get_ether_addr(etherAddr?.value?.toCPointer<ByteVar>())

public actual fun sceWlanDevAttach(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_wlan_dev_attach()

public actual fun sceWlanDevDetach(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_wlan_dev_detach()

public actual fun sceRtcGetTickResolution(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_tick_resolution()

public actual fun sceRtcGetCurrentTick(tick: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_current_tick(tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_current_clock(tm?.value?.toCPointer<ByteVar>(), tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_current_clock_local_time(tm?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_convert_utc_to_local_time(tickUtc?.value?.toCPointer<ByteVar>(), tickLocal?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_convert_local_time_to_utc(tickLocal?.value?.toCPointer<ByteVar>(), tickUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcIsLeapYear(year: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_is_leap_year(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_days_in_month(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_day_of_week(year, month, day)

public actual fun sceRtcCheckValid(date: ScePspDateTime?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_check_valid(date?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_set_tick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_tick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_compare_tick(tick1?.value?.toCPointer<ByteVar>(), tick2?.value?.toCPointer<ByteVar>())

public actual fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_ticks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numTicks)

public actual fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_microseconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMs)

public actual fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_seconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numSeconds)

public actual fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_minutes(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMinutes)

public actual fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_hours(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numHours)

public actual fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_days(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numDays)

public actual fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_weeks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numWeeks)

public actual fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_months(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMonths)

public actual fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_tick_add_years(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numYears)

public actual fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_set_time_t(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_time_t(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_set_time64t(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_time64t(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_set_dos_time(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_dos_time(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_set_win32file_time(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_get_win32file_time(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_parse_date_time(destTick?.value?.toCPointer<ByteVar>(), dateString?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_format_rfc3339(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_format_rfc3339local_time(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_parse_rfc3339(pUtc?.value?.toCPointer<ByteVar>(), pszDateTime?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_format_rfc2822(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_rtc_format_rfc2822local_time(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_open(file?.value?.toCPointer<ByteVar>(), flags, permissions)

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_open_async(file?.value?.toCPointer<ByteVar>(), flags, permissions)

public actual fun sceIoClose(fd: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_close(fd.toInt())

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_close_async(fd.toInt())

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_read(fd.toInt(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_read_async(fd.toInt(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_write(fd.toInt(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_write_async(fd.toInt(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_lseek(fd.toInt(), offset, whence.toInt())

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_lseek_async(fd.toInt(), offset, whence.toInt())

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_lseek32(fd.toInt(), offset, whence.toInt())

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_lseek32async(fd.toInt(), offset, whence.toInt())

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_remove(file?.value?.toCPointer<ByteVar>())

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_mkdir(dir?.value?.toCPointer<ByteVar>(), mode)

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_rmdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_chdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_rename(oldname?.value?.toCPointer<ByteVar>(), newname?.value?.toCPointer<ByteVar>())

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_dopen(dirname?.value?.toCPointer<ByteVar>())

public actual fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_dread(fd.toInt(), dir?.value?.toCPointer<ByteVar>())

public actual fun sceIoDclose(fd: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_dclose(fd.toInt())

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_devctl(dev?.value?.toCPointer<ByteVar>(), cmd, indata?.value?.toCPointer<ByteVar>(), inlen, outdata?.value?.toCPointer<ByteVar>(), outlen)

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_assign(dev1?.value?.toCPointer<ByteVar>(), dev2?.value?.toCPointer<ByteVar>(), dev3?.value?.toCPointer<ByteVar>(), mode.toInt(), unk1?.value?.toCPointer<ByteVar>(), unk2)

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_unassign(dev?.value?.toCPointer<ByteVar>())

public actual fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_getstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_chstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>(), bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_ioctl(fd.toInt(), cmd, indata?.value?.toCPointer<ByteVar>(), inlen, outdata?.value?.toCPointer<ByteVar>(), outlen)

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_ioctl_async(fd.toInt(), cmd, indata?.value?.toCPointer<ByteVar>(), inlen, outdata?.value?.toCPointer<ByteVar>(), outlen)

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_sync(device?.value?.toCPointer<ByteVar>(), unk)

public actual fun sceIoWaitAsync(fd: SceUid, res: Long?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_wait_async(fd.toInt(), res?.value?.toCPointer<ByteVar>())

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_wait_async_cb(fd.toInt(), res?.value?.toCPointer<ByteVar>())

public actual fun sceIoPollAsync(fd: SceUid, res: Long?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_poll_async(fd.toInt(), res?.value?.toCPointer<ByteVar>())

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_get_async_stat(fd.toInt(), poll, res?.value?.toCPointer<ByteVar>())

public actual fun sceIoCancel(fd: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_cancel(fd.toInt())

public actual fun sceIoGetDevType(fd: SceUid): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_get_dev_type(fd.toInt())

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_change_async_priority(fd.toInt(), pri)

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_io_set_async_callback(fd.toInt(), cb.toInt(), argp?.value?.toCPointer<ByteVar>())

public actual fun sceJpegInitMJpeg(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_jpeg_init_mjpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_jpeg_finish_mjpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_jpeg_create_mjpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_jpeg_delete_mjpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_jpeg_decode_mjpeg(jpegBuf?.value?.toCPointer<ByteVar>(), size, rgba?.value?.toCPointer<ByteVar>(), unk)

public actual fun sceUmdCheckMedium(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_check_medium()

public actual fun sceUmdGetDiscInfo(info: UmdInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_get_disc_info(info?.value?.toCPointer<ByteVar>())

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_activate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_deactivate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_wait_drive_stat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_wait_drive_stat_with_timer(state, timeout)

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_wait_drive_stat_cb(state, timeout)

public actual fun sceUmdCancelWaitDriveStat(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_cancel_wait_drive_stat()

public actual fun sceUmdGetDriveStat(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_get_drive_stat()

public actual fun sceUmdGetErrorStat(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_get_error_stat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_register_umdcall_back(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_un_register_umdcall_back(cbid)

public actual fun sceUmdReplacePermit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_replace_permit()

public actual fun sceUmdReplaceProhibit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_umd_replace_prohibit()

public actual fun sceMpegInit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_init()

public actual fun sceMpegFinish() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_finish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_ringbuffer_query_mem_size(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_ringbuffer_construct(ringbuffer?.value?.toCPointer<ByteVar>(), packets, data?.value?.toCPointer<ByteVar>(), size, callback.toInt(), cbParam?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_ringbuffer_destruct(ringbuffer?.value?.toCPointer<ByteVar>())
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_ringbuffer_available_size(ringbuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_ringbuffer_put(ringbuffer?.value?.toCPointer<ByteVar>(), numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_query_mem_size(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_create(handle.toInt(), data?.value?.toCPointer<ByteVar>(), size, ringbuffer?.value?.toCPointer<ByteVar>(), frameWidth, unk1, unk2)

public actual fun sceMpegDelete(handle: SceMpeg) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_delete(handle.toInt())
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_query_stream_offset(handle.toInt(), buffer?.value?.toCPointer<ByteVar>(), offset?.value?.toCPointer<ByteVar>())

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_query_stream_size(buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_regist_stream(handle.toInt(), streamId, unk)

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_un_regist_stream(handle.toInt(), stream.toInt())
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_flush_all_stream(handle.toInt())

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_malloc_avc_es_buf(handle.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_free_avc_es_buf(handle.toInt(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_query_atrac_es_size(handle.toInt(), esSize?.value?.toCPointer<ByteVar>(), outSize?.value?.toCPointer<ByteVar>())

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_init_au(handle.toInt(), esBuffer?.value?.toCPointer<ByteVar>(), au?.value?.toCPointer<ByteVar>())

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_get_avc_au(handle.toInt(), stream.toInt(), au?.value?.toCPointer<ByteVar>(), unk?.value?.toCPointer<ByteVar>())

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_avc_decode_mode(handle.toInt(), mode?.value?.toCPointer<ByteVar>())

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_avc_decode(handle.toInt(), au?.value?.toCPointer<ByteVar>(), iframeWidth, buffer?.value?.toCPointer<ByteVar>(), init?.value?.toCPointer<ByteVar>())

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_avc_decode_stop(handle.toInt(), frameWidth, buffer?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_get_atrac_au(handle.toInt(), stream.toInt(), au?.value?.toCPointer<ByteVar>(), unk?.value?.toCPointer<ByteVar>())

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_atrac_decode(handle.toInt(), au?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), init)

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_base_ycr_cb_copy_vme(yuvBuffer?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_base_csc_init(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpeg_base_csc_vme(rgbBuffer?.value?.toCPointer<ByteVar>(), rgbBuffer2?.value?.toCPointer<ByteVar>(), width, yCrCbBuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegbaseBea18f91(lli: SceMpegLLI?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mpegbase_bea18f91(lli?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekCurrentKey(key: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_peek_current_key(key?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekLatch(latch: List<UInt>?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_peek_latch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmReadLatch(latch: List<UInt>?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_read_latch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmIsHeadphoneExist(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_is_headphone_exist()

public actual fun sceHprmIsRemoteExist(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_is_remote_exist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_hprm_is_microphone_exist()

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_depth_buffer(zbp?.value?.toCPointer<ByteVar>(), zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_disp_buffer(width, height, dispbp?.value?.toCPointer<ByteVar>(), dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_buffer(psm.toInt(), fbp?.value?.toCPointer<ByteVar>(), fbw)
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_buffer_list(psm.toInt(), fbp?.value?.toCPointer<ByteVar>(), fbw)
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_display(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_depth_func(function.toInt())
}

public actual fun sceGuDepthMask(mask: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_depth_mask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_depth_offset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_depth_range(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_fog(near, far, color)
}

public actual fun sceGuInit() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_init()
}

public actual fun sceGuTerm() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_term()
}

public actual fun sceGuBreak(mode: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_break(mode)
}

public actual fun sceGuContinue() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_continue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_set_callback(signal.toInt(), callback.toInt())

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_signal(behavior.toInt(), signal)
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_send_commandf(cmd.toInt(), argument)
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_send_commandi(cmd.toInt(), argument)
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_get_memory(size)?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_start(contextType.toInt(), list?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuFinish(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_finish()

public actual fun sceGuFinishId(id: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_finish_id(id)

public actual fun sceGuCallList(list: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_call_list(list?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuCallMode(mode: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_call_mode(mode)
}

public actual fun sceGuCheckList(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_check_list()

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_send_list(mode.toInt(), list?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_swap_buffers()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_sync(mode.toInt(), behavior.toInt())

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_array(prim.toInt(), vtype, count, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_begin_object(vtype, count, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuEndObject() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_end_object()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_set_status(state.toInt(), status)
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_get_status(state.toInt())

public actual fun sceGuSetAllStatus(status: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_set_all_status(status)
}

public actual fun sceGuGetAllStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_get_all_status()

public actual fun sceGuEnable(state: GuState) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_enable(state.toInt())
}

public actual fun sceGuDisable(state: GuState) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_disable(state.toInt())
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_light(light, type.toInt(), components, position.toInt())
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_light_att(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_light_color(light, component, color)
}

public actual fun sceGuLightMode(mode: LightMode) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_light_mode(mode.toInt())
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_light_spot(light, direction.toInt(), exponent, cutoff)
}

public actual fun sceGuClear(flags: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clear_color(color)
}

public actual fun sceGuClearDepth(depth: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clear_depth(depth)
}

public actual fun sceGuClearStencil(stencil: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clear_stencil(stencil)
}

public actual fun sceGuPixelMask(mask: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_pixel_mask(mask)
}

public actual fun sceGuColor(color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_color(color)
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_color_func(func.toInt(), color, mask)
}

public actual fun sceGuColorMaterial(components: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_color_material(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_alpha_func(func.toInt(), value, mask)
}

public actual fun sceGuAmbient(color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_ambient(color)
}

public actual fun sceGuAmbientColor(color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_ambient_color(color)
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_blend_func(op.toInt(), src.toInt(), dest.toInt(), srcFix, destFix)
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_material(components, color)
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_model_color(emissive, ambient, diffuse, specular)
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_stencil_func(func.toInt(), ref, mask)
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_stencil_op(fail.toInt(), zfail.toInt(), zpass.toInt())
}

public actual fun sceGuSpecular(power: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_specular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_front_face(order.toInt())
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_logical_op(op.toInt())
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_set_dither(matrix.toInt())
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_shade_model(mode.toInt())
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_copy_image(psm.toInt(), sx, sy, width, height, srcw, src?.value?.toCPointer<ByteVar>(), dx, dy, destw, dest?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuTexEnvColor(color: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_env_color(color)
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_filter(min.toInt(), mag.toInt())
}

public actual fun sceGuTexFlush() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_flush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_func(tfx.toInt(), tcc.toInt())
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_image(mipmap.toInt(), width, height, tbw, tbp?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_level_mode(mode.toInt(), bias)
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_map_mode(mode.toInt(), a1, a2)
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_mode(tpsm.toInt(), maxmips, a2, swizzle)
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_offset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_proj_map_mode(mode.toInt())
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_scale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_slope(slope)
}

public actual fun sceGuTexSync() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_sync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_tex_wrap(u.toInt(), v.toInt())
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clut_load(numBlocks, cbp?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_clut_mode(cpsm.toInt(), shift, mask, a3)
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_offset(x, y)
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_scissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_viewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_bezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_patch_divide(ulevel, vlevel)
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_patch_front_face(a0)
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_patch_prim(prim.toInt())
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_spline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_set_matrix(type.toInt(), matrix.toInt())
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_bone_matrix(index, matrix.toInt())
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_morph_weight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gu_draw_array_n(primitiveType.toInt(), vType, count, a3, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_draw_array(prim.toInt(), vType, count, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_draw_array_n(prim.toInt(), vType, count, a3, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_draw_bezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_draw_spline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumFastInverse() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_fast_inverse()
}

public actual fun sceGumFullInverse() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_full_inverse()
}

public actual fun sceGumLoadIdentity() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_load_identity()
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_load_matrix(m.toInt())
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_look_at(eye.toInt(), center.toInt(), up.toInt())
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_matrix_mode(mode.toInt())
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_mult_matrix(m.toInt())
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_ortho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_perspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_pop_matrix()
}

public actual fun sceGumPushMatrix() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_push_matrix()
}

public actual fun sceGumRotateX(angle: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_rotate_x(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_rotate_y(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_rotate_z(angle)
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_rotate_xyz(v.toInt())
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_rotate_zyx(v.toInt())
}

public actual fun sceGumScale(v: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_scale(v.toInt())
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_store_matrix(m.toInt())
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_translate(v.toInt())
}

public actual fun sceGumUpdateMatrix() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_gum_update_matrix()
}

public actual fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3reserve_mp3handle(args?.value?.toCPointer<ByteVar>())

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3release_mp3handle(handle.toInt())

public actual fun sceMp3InitResource(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3init_resource()

public actual fun sceMp3TermResource(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3term_resource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3init(handle.toInt())

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3decode(handle.toInt(), dst?.value?.toCPointer<ByteVar>())

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_info_to_add_stream_data(handle.toInt(), dst?.value?.toCPointer<ByteVar>(), toWrite?.value?.toCPointer<ByteVar>(), srcPos?.value?.toCPointer<ByteVar>())

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3notify_add_stream_data(handle.toInt(), size)

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3check_stream_data_needed(handle.toInt())

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3set_loop_num(handle.toInt(), loop)

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_loop_num(handle.toInt())

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_sum_decoded_sample(handle.toInt())

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_max_output_sample(handle.toInt())

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_sampling_rate(handle.toInt())

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_bit_rate(handle.toInt())

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3get_mp3channel_num(handle.toInt())

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_mp3reset_play_position(handle.toInt())

public actual fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_open_registry(reg?.value?.toCPointer<ByteVar>(), mode, handle?.value?.toCPointer<ByteVar>())

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_flush_registry(handle.toInt())

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_close_registry(handle.toInt())

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_open_category(handle.toInt(), name?.value?.toCPointer<ByteVar>(), mode, dirHandle?.value?.toCPointer<ByteVar>())

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_remove_category(handle.toInt(), name?.value?.toCPointer<ByteVar>())

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_close_category(dirHandle.toInt())

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_flush_category(dirHandle.toInt())

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_key_info(dirHandle.toInt(), name?.value?.toCPointer<ByteVar>(), keyHandle?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_key_info_by_name(dirHandle.toInt(), name?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_key_value(dirHandle.toInt(), keyHandle.toInt(), buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_key_value_by_name(dirHandle.toInt(), name?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_set_key_value(dirHandle.toInt(), name?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_keys_num(dirHandle.toInt(), num?.value?.toCPointer<ByteVar>())

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_get_keys(dirHandle.toInt(), buf?.value?.toCPointer<ByteVar>(), num)

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_create_key(dirHandle.toInt(), name?.value?.toCPointer<ByteVar>(), type, size)

public actual fun sceRegRemoveRegistry(key: Key?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_reg_remove_registry(key?.value?.toCPointer<ByteVar>())

public actual fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_open_psidget_open_psid(openpsid?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_msg_dialog_init_start(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogShutdownStart() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_msg_dialog_shutdown_start()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_msg_dialog_get_status()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_msg_dialog_update(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_msg_dialog_abort()

public actual fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_netconf_init_start(data?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityNetconfShutdownStart(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_netconf_shutdown_start()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_netconf_update(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_netconf_get_status()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_check_net_param(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_get_net_param(conf, param.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_savedata_init_start(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilitySavedataGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_savedata_get_status()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_savedata_shutdown_start()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_savedata_update(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_game_sharing_init_start(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityGameSharingShutdownStart() {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_game_sharing_shutdown_start()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_game_sharing_get_status()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_game_sharing_update(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_html_viewer_init_start(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_html_viewer_shutdown_start()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_html_viewer_update(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_html_viewer_get_status()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_set_system_param_int(id.toInt(), value)

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_set_system_param_string(id.toInt(), str?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_get_system_param_int(id.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_get_system_param_string(id.toInt(), str?.value?.toCPointer<ByteVar>(), len)

public actual fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_osk_init_start(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityOskShutdownStart(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_osk_shutdown_start()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_osk_update(n)

public actual fun sceUtilityOskGetStatus(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_osk_get_status()

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_load_net_module(module.toInt())

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_unload_net_module(module.toInt())

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_load_av_module(module.toInt())

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_unload_av_module(module.toInt())

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_load_usb_module(module.toInt())

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_unload_usb_module(module.toInt())

public actual fun sceUtilityLoadModule(module: Module): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_load_module(module.toInt())

public actual fun sceUtilityUnloadModule(module: Module): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_unload_module(module.toInt())

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_create_net_param(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_set_net_param(param.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_copy_net_param(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_utility_delete_net_param(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_init(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_term()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_free_threadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_thread_abort(thid)

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_ether_strton(name?.value?.toCPointer<ByteVar>(), mac?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_ether_ntostr(mac?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_get_local_ether_addr(mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_get_malloc_stat(stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_init(stacksize, priority, adhocId?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_term()

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_connect(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDisconnect(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_disconnect()

public actual fun sceNetAdhocctlGetState(event: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_state(event?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_create(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_join(scaninfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_adhoc_id(id?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_create_enter_game_mode(name?.value?.toCPointer<ByteVar>(), unknown, num, macs?.value?.toCPointer<ByteVar>(), timeout, unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_join_enter_game_mode(name?.value?.toCPointer<ByteVar>(), hostmac?.value?.toCPointer<ByteVar>(), timeout, unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_game_mode_info(gamemodeinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlExitGameMode(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_exit_game_mode()

public actual fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_peer_list(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_peer_info(mac?.value?.toCPointer<ByteVar>(), size, peerinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlScan(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_scan()

public actual fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_scan_info(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_add_handler(handler.toInt(), unknown?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_del_handler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_name_by_addr(mac?.value?.toCPointer<ByteVar>(), nickname?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_addr_by_name(nickname?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhocctl_get_parameter(params?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocInit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_init()

public actual fun sceNetAdhocTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_term()

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_pdp_create(mac?.value?.toCPointer<ByteVar>(), port, bufSize, unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_pdp_delete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_pdp_send(id, destMacAddr?.value?.toCPointer<ByteVar>(), port, data?.value?.toCPointer<ByteVar>(), len, timeout, nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_pdp_recv(id, srcMacAddr?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), dataLength?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_get_pdp_stat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_create_master(data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_create_replica(mac?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_update_master()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_update_replica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_delete_master()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_game_mode_delete_replica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_open(srcmac?.value?.toCPointer<ByteVar>(), srcport, destmac?.value?.toCPointer<ByteVar>(), destport, bufSize, delay, count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_connect(id, timeout, nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_listen(srcmac?.value?.toCPointer<ByteVar>(), srcport, bufSize, delay, count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_accept(id, mac?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_send(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_recv(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_flush(id, timeout, nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_ptp_close(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_get_ptp_stat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_init(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_term()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_create(mode.toInt(), maxPeers, port, bufSize, helloDelay, pingDelay, initCount, msgDelay, callback.toInt())

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_delete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_start(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_stop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_select_target(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_cancel_target(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_cancel_target_with_opt(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_send_data(matchingId, mac?.value?.toCPointer<ByteVar>(), dataLen, data?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_abort_send_data(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_set_hello_opt(matchingId, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_get_hello_opt(matchingId, optLen?.value?.toCPointer<ByteVar>(), optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_get_members(matchingId, length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_get_pool_max_alloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_adhoc_matching_get_pool_stat(poolstat?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_init(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_term()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_get_info(code.toInt(), pinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_add_handler(handler.toInt(), parg?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_del_handler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_connect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_disconnect()

public actual fun sceNetApctlGetState(pstate: ApctlState?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_apctl_get_state(pstate?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetInit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_init()

public actual fun sceNetInetTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_term()

public actual fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_accept(s, addr?.value?.toCPointer<ByteVar>(), addrLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_bind(s, myAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_connect(s, servAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_getsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optlEn?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_listen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_recv(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: UInt?): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), flags, arg1, from?.value?.toCPointer<ByteVar>(), fromLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_send(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_sendto(s, buf?.value?.toCPointer<ByteVar>(), len, flags, to?.value?.toCPointer<ByteVar>(), toLen)

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_setsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optLen)

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_shutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_socket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_close(s)

public actual fun sceNetInetGetErrno(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_inet_get_errno()

public actual fun sceSslInit(unknown1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ssl_init(unknown1)

public actual fun sceSslEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ssl_end()

public actual fun sceSslGetUsedMemoryMax(memory: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ssl_get_used_memory_max(memory?.value?.toCPointer<ByteVar>())

public actual fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_ssl_get_used_memory_current(memory?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInit(unknown1: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_init(unknown1)

public actual fun sceHttpEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_end()

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_create_template(agent?.value?.toCPointer<ByteVar>(), unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_delete_template(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_create_connection(templateid, host?.value?.toCPointer<ByteVar>(), unknown1?.value?.toCPointer<ByteVar>(), port, unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_create_connection_with_url(templateid, url?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_delete_connection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_create_request(connectionId, method.toInt(), path?.value?.toCPointer<ByteVar>(), contentLength)

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_create_request_with_url(connectionId, method.toInt(), url?.value?.toCPointer<ByteVar>(), contentLength)

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_delete_request(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_send_request(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_abort_request(requestId)

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_read_data(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_get_content_length(requestId, contentLength?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_get_status_code(requestId, statusCode?.value?.toCPointer<ByteVar>())

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_resolve_time_out(id, timeout)

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_resolve_retry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_connect_time_out(id, timeout)

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_send_time_out(id, timeout)

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_recv_time_out(id, timeout)

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_enable_keep_alive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_disable_keep_alive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_enable_redirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_disable_redirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_enable_cookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_disable_cookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_save_system_cookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_load_system_cookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_add_extra_header(id, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_delete_header(id, name?.value?.toCPointer<ByteVar>())

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_https_init(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_https_end()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_https_load_default_cert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_disable_auth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_disable_cache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_enable_auth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_enable_cache(id)

public actual fun sceHttpEndCache(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_end_cache()

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_get_all_header(request, header?.value?.toCPointer<ByteVar>(), headerSize?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_get_network_errno(request, errNum?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_get_proxy(id, activateFlag?.value?.toCPointer<ByteVar>(), mode?.value?.toCPointer<ByteVar>(), proxyHost?.value?.toCPointer<ByteVar>(), len, proxyPort?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_init_cache(maxSize)

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_auth_info_cb(id, cbfunc.toInt())

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_proxy(id, activateFlag, mode, newProxyHost?.value?.toCPointer<ByteVar>(), newProxyPort)

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_res_header_max_size(id, headerSize)

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_http_set_malloc_function(mallocFunc.toInt(), freeFunc.toInt(), reallocFunc.toInt())

public actual fun sceNetResolverInit(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_init()

public actual fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_create(rid?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufLength)

public actual fun sceNetResolverDelete(rid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_delete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_start_nto_a(rid, hostname?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>(), timeout, retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_start_ato_n(rid, addr?.value?.toCPointer<ByteVar>(), hostname?.value?.toCPointer<ByteVar>(), hostnameLen, timeout, retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_stop(rid)

public actual fun sceNetResolverTerm(): Int =
    io.github.kotlinmania.libc.cinterop.libc_psp_sce_net_resolver_term()
