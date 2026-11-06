#include "psp_wrapper.h"
#include <errno.h>

int32_t libc_psp_sce_audio_ch_reserve(int32_t channel, int32_t sample_count, int32_t format) {
    return (int32_t)sceAudioChReserve(channel, sample_count, format);
}

int32_t libc_psp_sce_audio_ch_release(int32_t channel) {
    return (int32_t)sceAudioChRelease(channel);
}

int32_t libc_psp_sce_audio_output(int32_t channel, int32_t vol, void* buf) {
    return (int32_t)sceAudioOutput(channel, vol, buf);
}

int32_t libc_psp_sce_audio_output_blocking(int32_t channel, int32_t vol, void* buf) {
    return (int32_t)sceAudioOutputBlocking(channel, vol, buf);
}

int32_t libc_psp_sce_audio_output_panned(int32_t channel, int32_t left_vol, int32_t right_vol, void* buf) {
    return (int32_t)sceAudioOutputPanned(channel, left_vol, right_vol, buf);
}

int32_t libc_psp_sce_audio_output_panned_blocking(int32_t channel, int32_t left_vol, int32_t right_vol, void* buf) {
    return (int32_t)sceAudioOutputPannedBlocking(channel, left_vol, right_vol, buf);
}

int32_t libc_psp_sce_audio_get_channel_rest_len(int32_t channel) {
    return (int32_t)sceAudioGetChannelRestLen(channel);
}

int32_t libc_psp_sce_audio_get_channel_rest_length(int32_t channel) {
    return (int32_t)sceAudioGetChannelRestLength(channel);
}

int32_t libc_psp_sce_audio_set_channel_data_len(int32_t channel, int32_t sample_count) {
    return (int32_t)sceAudioSetChannelDataLen(channel, sample_count);
}

int32_t libc_psp_sce_audio_change_channel_config(int32_t channel, int32_t format) {
    return (int32_t)sceAudioChangeChannelConfig(channel, format);
}

int32_t libc_psp_sce_audio_change_channel_volume(int32_t channel, int32_t left_vol, int32_t right_vol) {
    return (int32_t)sceAudioChangeChannelVolume(channel, left_vol, right_vol);
}

int32_t libc_psp_sce_audio_output2reserve(int32_t sample_count) {
    return (int32_t)sceAudioOutput2Reserve(sample_count);
}

int32_t libc_psp_sce_audio_output2release(void) {
    return (int32_t)sceAudioOutput2Release();
}

int32_t libc_psp_sce_audio_output2change_length(int32_t sample_count) {
    return (int32_t)sceAudioOutput2ChangeLength(sample_count);
}

int32_t libc_psp_sce_audio_output2output_blocking(int32_t vol, void* buf) {
    return (int32_t)sceAudioOutput2OutputBlocking(vol, buf);
}

int32_t libc_psp_sce_audio_output2get_rest_sample(void) {
    return (int32_t)sceAudioOutput2GetRestSample();
}

int32_t libc_psp_sce_audio_srcch_reserve(int32_t sample_count, int32_t freq, int32_t channels) {
    return (int32_t)sceAudioSRCChReserve(sample_count, freq, channels);
}

int32_t libc_psp_sce_audio_srcch_release(void) {
    return (int32_t)sceAudioSRCChRelease();
}

int32_t libc_psp_sce_audio_srcoutput_blocking(int32_t vol, void* buf) {
    return (int32_t)sceAudioSRCOutputBlocking(vol, buf);
}

int32_t libc_psp_sce_audio_input_init(int32_t unknown1, int32_t gain, int32_t unknown2) {
    return (int32_t)sceAudioInputInit(unknown1, gain, unknown2);
}

int32_t libc_psp_sce_audio_input_init_ex(void* params) {
    return (int32_t)sceAudioInputInitEx(params);
}

void libc_psp_sce_audio_input_blocking(int32_t sample_count, int32_t freq, void* buf) {
    sceAudioInputBlocking(sample_count, freq, buf);
}

void libc_psp_sce_audio_input(int32_t sample_count, int32_t freq, void* buf) {
    sceAudioInput(sample_count, freq, buf);
}

int32_t libc_psp_sce_audio_get_input_length(void) {
    return (int32_t)sceAudioGetInputLength();
}

int32_t libc_psp_sce_audio_wait_input_end(void) {
    return (int32_t)sceAudioWaitInputEnd();
}

int32_t libc_psp_sce_audio_poll_input_end(void) {
    return (int32_t)sceAudioPollInputEnd();
}

int32_t libc_psp_sce_atrac_get_atrac_id(uint32_t ui_codec_type) {
    return (int32_t)sceAtracGetAtracID(ui_codec_type);
}

int32_t libc_psp_sce_atrac_set_data_and_get_id(void* buf, uint64_t bufsize) {
    return (int32_t)sceAtracSetDataAndGetID(buf, bufsize);
}

int32_t libc_psp_sce_atrac_decode_data(int32_t atrac_id, void* out_samples, void* out_n, void* out_end, void* out_remain_frame) {
    return (int32_t)sceAtracDecodeData(atrac_id, out_samples, out_n, out_end, out_remain_frame);
}

int32_t libc_psp_sce_atrac_get_remain_frame(int32_t atrac_id, void* out_remain_frame) {
    return (int32_t)sceAtracGetRemainFrame(atrac_id, out_remain_frame);
}

int32_t libc_psp_sce_atrac_get_stream_data_info(int32_t atrac_id, void* write_pointer, void* available_bytes, void* read_offset) {
    return (int32_t)sceAtracGetStreamDataInfo(atrac_id, write_pointer, available_bytes, read_offset);
}

int32_t libc_psp_sce_atrac_add_stream_data(int32_t atrac_id, uint32_t bytes_to_add) {
    return (int32_t)sceAtracAddStreamData(atrac_id, bytes_to_add);
}

int32_t libc_psp_sce_atrac_get_bitrate(int32_t atrac_id, void* out_bitrate) {
    return (int32_t)sceAtracGetBitrate(atrac_id, out_bitrate);
}

int32_t libc_psp_sce_atrac_set_loop_num(int32_t atrac_id, int32_t nloops) {
    return (int32_t)sceAtracSetLoopNum(atrac_id, nloops);
}

int32_t libc_psp_sce_atrac_release_atrac_id(int32_t atrac_id) {
    return (int32_t)sceAtracReleaseAtracID(atrac_id);
}

int32_t libc_psp_sce_atrac_get_next_sample(int32_t atrac_id, void* out_n) {
    return (int32_t)sceAtracGetNextSample(atrac_id, out_n);
}

int32_t libc_psp_sce_atrac_get_max_sample(int32_t atrac_id, void* out_max) {
    return (int32_t)sceAtracGetMaxSample(atrac_id, out_max);
}

int32_t libc_psp_sce_atrac_get_buffer_info_for_reseting(int32_t atrac_id, uint32_t ui_sample, void* pbuffer_info) {
    return (int32_t)sceAtracGetBufferInfoForReseting(atrac_id, ui_sample, pbuffer_info);
}

int32_t libc_psp_sce_atrac_get_channel(int32_t atrac_id, void* pui_channel) {
    return (int32_t)sceAtracGetChannel(atrac_id, pui_channel);
}

int32_t libc_psp_sce_atrac_get_internal_error_info(int32_t atrac_id, void* pi_result) {
    return (int32_t)sceAtracGetInternalErrorInfo(atrac_id, pi_result);
}

int32_t libc_psp_sce_atrac_get_loop_status(int32_t atrac_id, void* pi_loop_num, void* pui_loop_status) {
    return (int32_t)sceAtracGetLoopStatus(atrac_id, pi_loop_num, pui_loop_status);
}

int32_t libc_psp_sce_atrac_get_next_decode_position(int32_t atrac_id, void* pui_sample_position) {
    return (int32_t)sceAtracGetNextDecodePosition(atrac_id, pui_sample_position);
}

int32_t libc_psp_sce_atrac_get_second_buffer_info(int32_t atrac_id, void* pui_position, void* pui_data_byte) {
    return (int32_t)sceAtracGetSecondBufferInfo(atrac_id, pui_position, pui_data_byte);
}

int32_t libc_psp_sce_atrac_get_sound_sample(int32_t atrac_id, void* pi_end_sample, void* pi_loop_start_sample, void* pi_loop_end_sample) {
    return (int32_t)sceAtracGetSoundSample(atrac_id, pi_end_sample, pi_loop_start_sample, pi_loop_end_sample);
}

int32_t libc_psp_sce_atrac_reset_play_position(int32_t atrac_id, uint32_t ui_sample, uint32_t ui_write_byte_first_buf, uint32_t ui_write_byte_second_buf) {
    return (int32_t)sceAtracResetPlayPosition(atrac_id, ui_sample, ui_write_byte_first_buf, ui_write_byte_second_buf);
}

int32_t libc_psp_sce_atrac_set_data(int32_t atrac_id, void* puc_buffer_addr, uint32_t ui_buffer_byte) {
    return (int32_t)sceAtracSetData(atrac_id, puc_buffer_addr, ui_buffer_byte);
}

int32_t libc_psp_sce_atrac_set_halfway_buffer(int32_t atrac_id, void* puc_buffer_addr, uint32_t ui_read_byte, uint32_t ui_buffer_byte) {
    return (int32_t)sceAtracSetHalfwayBuffer(atrac_id, puc_buffer_addr, ui_read_byte, ui_buffer_byte);
}

int32_t libc_psp_sce_atrac_set_halfway_buffer_and_get_id(void* puc_buffer_addr, uint32_t ui_read_byte, uint32_t ui_buffer_byte) {
    return (int32_t)sceAtracSetHalfwayBufferAndGetID(puc_buffer_addr, ui_read_byte, ui_buffer_byte);
}

int32_t libc_psp_sce_atrac_set_second_buffer(int32_t atrac_id, void* puc_second_buffer_addr, uint32_t ui_second_buffer_byte) {
    return (int32_t)sceAtracSetSecondBuffer(atrac_id, puc_second_buffer_addr, ui_second_buffer_byte);
}

int32_t libc_psp_sce_ctrl_set_sampling_cycle(int32_t cycle) {
    return (int32_t)sceCtrlSetSamplingCycle(cycle);
}

int32_t libc_psp_sce_ctrl_get_sampling_cycle(void* pcycle) {
    return (int32_t)sceCtrlGetSamplingCycle(pcycle);
}

int32_t libc_psp_sce_ctrl_set_sampling_mode(int32_t mode) {
    return (int32_t)sceCtrlSetSamplingMode(mode);
}

int32_t libc_psp_sce_ctrl_get_sampling_mode(void* pmode) {
    return (int32_t)sceCtrlGetSamplingMode(pmode);
}

int32_t libc_psp_sce_ctrl_peek_buffer_positive(void* pad_data, int32_t count) {
    return (int32_t)sceCtrlPeekBufferPositive(pad_data, count);
}

int32_t libc_psp_sce_ctrl_peek_buffer_negative(void* pad_data, int32_t count) {
    return (int32_t)sceCtrlPeekBufferNegative(pad_data, count);
}

int32_t libc_psp_sce_ctrl_read_buffer_positive(void* pad_data, int32_t count) {
    return (int32_t)sceCtrlReadBufferPositive(pad_data, count);
}

int32_t libc_psp_sce_ctrl_read_buffer_negative(void* pad_data, int32_t count) {
    return (int32_t)sceCtrlReadBufferNegative(pad_data, count);
}

int32_t libc_psp_sce_ctrl_peek_latch(void* latch_data) {
    return (int32_t)sceCtrlPeekLatch(latch_data);
}

int32_t libc_psp_sce_ctrl_read_latch(void* latch_data) {
    return (int32_t)sceCtrlReadLatch(latch_data);
}

int32_t libc_psp_sce_ctrl_set_idle_cancel_threshold(int32_t idlereset, int32_t idleback) {
    return (int32_t)sceCtrlSetIdleCancelThreshold(idlereset, idleback);
}

int32_t libc_psp_sce_ctrl_get_idle_cancel_threshold(void* idlereset, void* idleback) {
    return (int32_t)sceCtrlGetIdleCancelThreshold(idlereset, idleback);
}

uint32_t libc_psp_sce_display_set_mode(int32_t mode, uint64_t width, uint64_t height) {
    return (uint32_t)sceDisplaySetMode(mode, width, height);
}

int32_t libc_psp_sce_display_get_mode(void* pmode, void* pwidth, void* pheight) {
    return (int32_t)sceDisplayGetMode(pmode, pwidth, pheight);
}

uint32_t libc_psp_sce_display_set_frame_buf(void* top_addr, uint64_t buffer_width, int32_t pixel_format, int32_t sync) {
    return (uint32_t)sceDisplaySetFrameBuf(top_addr, buffer_width, pixel_format, sync);
}

int32_t libc_psp_sce_display_get_frame_buf(void* top_addr, void* buffer_width, void* pixel_format, int32_t sync) {
    return (int32_t)sceDisplayGetFrameBuf(top_addr, buffer_width, pixel_format, sync);
}

uint32_t libc_psp_sce_display_get_vcount(void) {
    return (uint32_t)sceDisplayGetVcount();
}

int32_t libc_psp_sce_display_wait_vblank(void) {
    return (int32_t)sceDisplayWaitVblank();
}

int32_t libc_psp_sce_display_wait_vblank_cb(void) {
    return (int32_t)sceDisplayWaitVblankCB();
}

int32_t libc_psp_sce_display_wait_vblank_start(void) {
    return (int32_t)sceDisplayWaitVblankStart();
}

int32_t libc_psp_sce_display_wait_vblank_start_cb(void) {
    return (int32_t)sceDisplayWaitVblankStartCB();
}

int32_t libc_psp_sce_display_get_accumulated_hcount(void) {
    return (int32_t)sceDisplayGetAccumulatedHcount();
}

int32_t libc_psp_sce_display_get_current_hcount(void) {
    return (int32_t)sceDisplayGetCurrentHcount();
}

float libc_psp_sce_display_get_frame_per_sec(void) {
    return (float)sceDisplayGetFramePerSec();
}

int32_t libc_psp_sce_display_is_foreground(void) {
    return (int32_t)sceDisplayIsForeground();
}

int32_t libc_psp_sce_display_is_vblank(void) {
    return (int32_t)sceDisplayIsVblank();
}

uint32_t libc_psp_sce_ge_edram_get_size(void) {
    return (uint32_t)sceGeEdramGetSize();
}

void* libc_psp_sce_ge_edram_get_addr(void) {
    return (void*)sceGeEdramGetAddr();
}

int32_t libc_psp_sce_ge_edram_set_addr_translation(int32_t width) {
    return (int32_t)sceGeEdramSetAddrTranslation(width);
}

uint32_t libc_psp_sce_ge_get_cmd(int32_t cmd) {
    return (uint32_t)sceGeGetCmd(cmd);
}

int32_t libc_psp_sce_ge_get_mtx(int32_t type_, void* matrix) {
    return (int32_t)sceGeGetMtx(type_, matrix);
}

int32_t libc_psp_sce_ge_get_stack(int32_t stack_id, void* stack) {
    return (int32_t)sceGeGetStack(stack_id, stack);
}

int32_t libc_psp_sce_ge_save_context(void* context) {
    return (int32_t)sceGeSaveContext(context);
}

int32_t libc_psp_sce_ge_restore_context(void* context) {
    return (int32_t)sceGeRestoreContext(context);
}

int32_t libc_psp_sce_ge_list_en_queue(void* list, void* stall, int32_t cbid, void* arg) {
    return (int32_t)sceGeListEnQueue(list, stall, cbid, arg);
}

int32_t libc_psp_sce_ge_list_en_queue_head(void* list, void* stall, int32_t cbid, void* arg) {
    return (int32_t)sceGeListEnQueueHead(list, stall, cbid, arg);
}

int32_t libc_psp_sce_ge_list_de_queue(int32_t qid) {
    return (int32_t)sceGeListDeQueue(qid);
}

int32_t libc_psp_sce_ge_list_update_stall_addr(int32_t qid, void* stall) {
    return (int32_t)sceGeListUpdateStallAddr(qid, stall);
}

int32_t libc_psp_sce_ge_list_sync(int32_t qid, int32_t sync_type) {
    return (int32_t)sceGeListSync(qid, sync_type);
}

int32_t libc_psp_sce_ge_draw_sync(int32_t sync_type) {
    return (int32_t)sceGeDrawSync(sync_type);
}

int32_t libc_psp_sce_ge_break(int32_t mode, void* p_param) {
    return (int32_t)sceGeBreak(mode, p_param);
}

int32_t libc_psp_sce_ge_continue(void) {
    return (int32_t)sceGeContinue();
}

int32_t libc_psp_sce_ge_set_callback(void* cb) {
    return (int32_t)sceGeSetCallback(cb);
}

int32_t libc_psp_sce_ge_unset_callback(int32_t cbid) {
    return (int32_t)sceGeUnsetCallback(cbid);
}

void libc_psp_sce_kernel_exit_game(void) {
    sceKernelExitGame();
}

int32_t libc_psp_sce_kernel_register_exit_callback(int32_t id) {
    return (int32_t)sceKernelRegisterExitCallback(id);
}

int32_t libc_psp_sce_kernel_load_exec(void* file, void* param) {
    return (int32_t)sceKernelLoadExec(file, param);
}

int32_t libc_psp_sce_kernel_alloc_partition_memory(int32_t partition, void* name, int32_t type_, uint32_t size, void* addr) {
    return (int32_t)sceKernelAllocPartitionMemory(partition, name, type_, size, addr);
}

void* libc_psp_sce_kernel_get_block_head_addr(int32_t blockid) {
    return (void*)sceKernelGetBlockHeadAddr(blockid);
}

int32_t libc_psp_sce_kernel_free_partition_memory(int32_t blockid) {
    return (int32_t)sceKernelFreePartitionMemory(blockid);
}

uint64_t libc_psp_sce_kernel_total_free_mem_size(void) {
    return (uint64_t)sceKernelTotalFreeMemSize();
}

uint64_t libc_psp_sce_kernel_max_free_mem_size(void) {
    return (uint64_t)sceKernelMaxFreeMemSize();
}

uint32_t libc_psp_sce_kernel_devkit_version(void) {
    return (uint32_t)sceKernelDevkitVersion();
}

int32_t libc_psp_sce_kernel_set_compiled_sdk_version(uint32_t version) {
    return (int32_t)sceKernelSetCompiledSdkVersion(version);
}

uint32_t libc_psp_sce_kernel_get_compiled_sdk_version(void) {
    return (uint32_t)sceKernelGetCompiledSdkVersion();
}

int32_t libc_psp_sce_kernel_libc_time(void* t) {
    return (int32_t)sceKernelLibcTime(t);
}

uint32_t libc_psp_sce_kernel_libc_clock(void) {
    return (uint32_t)sceKernelLibcClock();
}

int32_t libc_psp_sce_kernel_libc_gettimeofday(void* tp, void* tzp) {
    return (int32_t)sceKernelLibcGettimeofday(tp, tzp);
}

void libc_psp_sce_kernel_dcache_writeback_all(void) {
    sceKernelDcacheWritebackAll();
}

void libc_psp_sce_kernel_dcache_writeback_invalidate_all(void) {
    sceKernelDcacheWritebackInvalidateAll();
}

void libc_psp_sce_kernel_dcache_writeback_range(void* p, uint32_t size) {
    sceKernelDcacheWritebackRange(p, size);
}

void libc_psp_sce_kernel_dcache_writeback_invalidate_range(void* p, uint32_t size) {
    sceKernelDcacheWritebackInvalidateRange(p, size);
}

void libc_psp_sce_kernel_dcache_invalidate_range(void* p, uint32_t size) {
    sceKernelDcacheInvalidateRange(p, size);
}

void libc_psp_sce_kernel_icache_invalidate_all(void) {
    sceKernelIcacheInvalidateAll();
}

void libc_psp_sce_kernel_icache_invalidate_range(void* p, uint32_t size) {
    sceKernelIcacheInvalidateRange(p, size);
}

int32_t libc_psp_sce_kernel_utils_mt19937init(void* ctx, uint32_t seed) {
    return (int32_t)sceKernelUtilsMt19937Init(ctx, seed);
}

uint32_t libc_psp_sce_kernel_utils_mt19937uint(void* ctx) {
    return (uint32_t)sceKernelUtilsMt19937UInt(ctx);
}

int32_t libc_psp_sce_kernel_utils_md5digest(void* data, uint32_t size, void* digest) {
    return (int32_t)sceKernelUtilsMd5Digest(data, size, digest);
}

int32_t libc_psp_sce_kernel_utils_md5block_init(void* ctx) {
    return (int32_t)sceKernelUtilsMd5BlockInit(ctx);
}

int32_t libc_psp_sce_kernel_utils_md5block_update(void* ctx, void* data, uint32_t size) {
    return (int32_t)sceKernelUtilsMd5BlockUpdate(ctx, data, size);
}

int32_t libc_psp_sce_kernel_utils_md5block_result(void* ctx, void* digest) {
    return (int32_t)sceKernelUtilsMd5BlockResult(ctx, digest);
}

int32_t libc_psp_sce_kernel_utils_sha1digest(void* data, uint32_t size, void* digest) {
    return (int32_t)sceKernelUtilsSha1Digest(data, size, digest);
}

int32_t libc_psp_sce_kernel_utils_sha1block_init(void* ctx) {
    return (int32_t)sceKernelUtilsSha1BlockInit(ctx);
}

int32_t libc_psp_sce_kernel_utils_sha1block_update(void* ctx, void* data, uint32_t size) {
    return (int32_t)sceKernelUtilsSha1BlockUpdate(ctx, data, size);
}

int32_t libc_psp_sce_kernel_utils_sha1block_result(void* ctx, void* digest) {
    return (int32_t)sceKernelUtilsSha1BlockResult(ctx, digest);
}

int32_t libc_psp_sce_kernel_register_sub_intr_handler(int32_t int_no, int32_t no, void* handler, void* arg) {
    return (int32_t)sceKernelRegisterSubIntrHandler(int_no, no, handler, arg);
}

int32_t libc_psp_sce_kernel_release_sub_intr_handler(int32_t int_no, int32_t no) {
    return (int32_t)sceKernelReleaseSubIntrHandler(int_no, no);
}

int32_t libc_psp_sce_kernel_enable_sub_intr(int32_t int_no, int32_t no) {
    return (int32_t)sceKernelEnableSubIntr(int_no, no);
}

int32_t libc_psp_sce_kernel_disable_sub_intr(int32_t int_no, int32_t no) {
    return (int32_t)sceKernelDisableSubIntr(int_no, no);
}

int32_t libc_psp_query_intr_handler_info(int32_t intr_code, int32_t sub_intr_code, void* data) {
    return (int32_t)QueryIntrHandlerInfo(intr_code, sub_intr_code, data);
}

uint32_t libc_psp_sce_kernel_cpu_suspend_intr(void) {
    return (uint32_t)sceKernelCpuSuspendIntr();
}

void libc_psp_sce_kernel_cpu_resume_intr(uint32_t flags) {
    sceKernelCpuResumeIntr(flags);
}

void libc_psp_sce_kernel_cpu_resume_intr_with_sync(uint32_t flags) {
    sceKernelCpuResumeIntrWithSync(flags);
}

int32_t libc_psp_sce_kernel_is_cpu_intr_suspended(uint32_t flags) {
    return (int32_t)sceKernelIsCpuIntrSuspended(flags);
}

int32_t libc_psp_sce_kernel_is_cpu_intr_enable(void) {
    return (int32_t)sceKernelIsCpuIntrEnable();
}

int32_t libc_psp_sce_kernel_load_module(void* path, int32_t flags, void* option) {
    return (int32_t)sceKernelLoadModule(path, flags, option);
}

int32_t libc_psp_sce_kernel_load_module_ms(void* path, int32_t flags, void* option) {
    return (int32_t)sceKernelLoadModuleMs(path, flags, option);
}

int32_t libc_psp_sce_kernel_load_module_by_id(int32_t fid, int32_t flags, void* option) {
    return (int32_t)sceKernelLoadModuleByID(fid, flags, option);
}

int32_t libc_psp_sce_kernel_load_module_buffer_usb_wlan(uint64_t buf_size, void* buf, int32_t flags, void* option) {
    return (int32_t)sceKernelLoadModuleBufferUsbWlan(buf_size, buf, flags, option);
}

int32_t libc_psp_sce_kernel_start_module(int32_t mod_id, uint64_t arg_size, void* argp, void* status, void* option) {
    return (int32_t)sceKernelStartModule(mod_id, arg_size, argp, status, option);
}

int32_t libc_psp_sce_kernel_stop_module(int32_t mod_id, uint64_t arg_size, void* argp, void* status, void* option) {
    return (int32_t)sceKernelStopModule(mod_id, arg_size, argp, status, option);
}

int32_t libc_psp_sce_kernel_unload_module(int32_t mod_id) {
    return (int32_t)sceKernelUnloadModule(mod_id);
}

int32_t libc_psp_sce_kernel_self_stop_unload_module(int32_t unknown, uint64_t arg_size, void* argp) {
    return (int32_t)sceKernelSelfStopUnloadModule(unknown, arg_size, argp);
}

int32_t libc_psp_sce_kernel_stop_unload_self_module(uint64_t arg_size, void* argp, void* status, void* option) {
    return (int32_t)sceKernelStopUnloadSelfModule(arg_size, argp, status, option);
}

int32_t libc_psp_sce_kernel_query_module_info(int32_t mod_id, void* info) {
    return (int32_t)sceKernelQueryModuleInfo(mod_id, info);
}

int32_t libc_psp_sce_kernel_get_module_id_list(void* read_buf, int32_t read_buf_size, void* id_count) {
    return (int32_t)sceKernelGetModuleIdList(read_buf, read_buf_size, id_count);
}

int32_t libc_psp_sce_kernel_volatile_mem_lock(int32_t unk, void* ptr, void* size) {
    return (int32_t)sceKernelVolatileMemLock(unk, ptr, size);
}

int32_t libc_psp_sce_kernel_volatile_mem_try_lock(int32_t unk, void* ptr, void* size) {
    return (int32_t)sceKernelVolatileMemTryLock(unk, ptr, size);
}

int32_t libc_psp_sce_kernel_volatile_mem_unlock(int32_t unk) {
    return (int32_t)sceKernelVolatileMemUnlock(unk);
}

int32_t libc_psp_sce_kernel_stdin(void) {
    return (int32_t)sceKernelStdin();
}

int32_t libc_psp_sce_kernel_stdout(void) {
    return (int32_t)sceKernelStdout();
}

int32_t libc_psp_sce_kernel_stderr(void) {
    return (int32_t)sceKernelStderr();
}

int32_t libc_psp_sce_kernel_get_threadman_id_type(int32_t uid) {
    return (int32_t)sceKernelGetThreadmanIdType(uid);
}

int32_t libc_psp_sce_kernel_create_thread(void* name, int32_t entry, int32_t init_priority, int32_t stack_size, int32_t attr, void* option) {
    return (int32_t)sceKernelCreateThread(name, entry, init_priority, stack_size, attr, option);
}

int32_t libc_psp_sce_kernel_delete_thread(int32_t thid) {
    return (int32_t)sceKernelDeleteThread(thid);
}

int32_t libc_psp_sce_kernel_start_thread(int32_t id, uint64_t arg_len, void* arg_p) {
    return (int32_t)sceKernelStartThread(id, arg_len, arg_p);
}

int32_t libc_psp_sce_kernel_exit_thread(int32_t status) {
    return (int32_t)sceKernelExitThread(status);
}

int32_t libc_psp_sce_kernel_exit_delete_thread(int32_t status) {
    return (int32_t)sceKernelExitDeleteThread(status);
}

int32_t libc_psp_sce_kernel_terminate_thread(int32_t thid) {
    return (int32_t)sceKernelTerminateThread(thid);
}

int32_t libc_psp_sce_kernel_terminate_delete_thread(int32_t thid) {
    return (int32_t)sceKernelTerminateDeleteThread(thid);
}

int32_t libc_psp_sce_kernel_suspend_dispatch_thread(void) {
    return (int32_t)sceKernelSuspendDispatchThread();
}

int32_t libc_psp_sce_kernel_resume_dispatch_thread(int32_t state) {
    return (int32_t)sceKernelResumeDispatchThread(state);
}

int32_t libc_psp_sce_kernel_sleep_thread(void) {
    return (int32_t)sceKernelSleepThread();
}

int32_t libc_psp_sce_kernel_sleep_thread_cb(void) {
    return (int32_t)sceKernelSleepThreadCB();
}

int32_t libc_psp_sce_kernel_wakeup_thread(int32_t thid) {
    return (int32_t)sceKernelWakeupThread(thid);
}

int32_t libc_psp_sce_kernel_cancel_wakeup_thread(int32_t thid) {
    return (int32_t)sceKernelCancelWakeupThread(thid);
}

int32_t libc_psp_sce_kernel_suspend_thread(int32_t thid) {
    return (int32_t)sceKernelSuspendThread(thid);
}

int32_t libc_psp_sce_kernel_resume_thread(int32_t thid) {
    return (int32_t)sceKernelResumeThread(thid);
}

int32_t libc_psp_sce_kernel_wait_thread_end(int32_t thid, void* timeout) {
    return (int32_t)sceKernelWaitThreadEnd(thid, timeout);
}

int32_t libc_psp_sce_kernel_wait_thread_end_cb(int32_t thid, void* timeout) {
    return (int32_t)sceKernelWaitThreadEndCB(thid, timeout);
}

int32_t libc_psp_sce_kernel_delay_thread(uint32_t delay) {
    return (int32_t)sceKernelDelayThread(delay);
}

int32_t libc_psp_sce_kernel_delay_thread_cb(uint32_t delay) {
    return (int32_t)sceKernelDelayThreadCB(delay);
}

int32_t libc_psp_sce_kernel_delay_sys_clock_thread(void* delay) {
    return (int32_t)sceKernelDelaySysClockThread(delay);
}

int32_t libc_psp_sce_kernel_delay_sys_clock_thread_cb(void* delay) {
    return (int32_t)sceKernelDelaySysClockThreadCB(delay);
}

int32_t libc_psp_sce_kernel_change_current_thread_attr(int32_t unknown, int32_t attr) {
    return (int32_t)sceKernelChangeCurrentThreadAttr(unknown, attr);
}

int32_t libc_psp_sce_kernel_change_thread_priority(int32_t thid, int32_t priority) {
    return (int32_t)sceKernelChangeThreadPriority(thid, priority);
}

int32_t libc_psp_sce_kernel_rotate_thread_ready_queue(int32_t priority) {
    return (int32_t)sceKernelRotateThreadReadyQueue(priority);
}

int32_t libc_psp_sce_kernel_release_wait_thread(int32_t thid) {
    return (int32_t)sceKernelReleaseWaitThread(thid);
}

int32_t libc_psp_sce_kernel_get_thread_id(void) {
    return (int32_t)sceKernelGetThreadId();
}

int32_t libc_psp_sce_kernel_get_thread_current_priority(void) {
    return (int32_t)sceKernelGetThreadCurrentPriority();
}

int32_t libc_psp_sce_kernel_get_thread_exit_status(int32_t thid) {
    return (int32_t)sceKernelGetThreadExitStatus(thid);
}

int32_t libc_psp_sce_kernel_check_thread_stack(void) {
    return (int32_t)sceKernelCheckThreadStack();
}

int32_t libc_psp_sce_kernel_get_thread_stack_free_size(int32_t thid) {
    return (int32_t)sceKernelGetThreadStackFreeSize(thid);
}

int32_t libc_psp_sce_kernel_refer_thread_status(int32_t thid, void* info) {
    return (int32_t)sceKernelReferThreadStatus(thid, info);
}

int32_t libc_psp_sce_kernel_refer_thread_run_status(int32_t thid, void* status) {
    return (int32_t)sceKernelReferThreadRunStatus(thid, status);
}

int32_t libc_psp_sce_kernel_create_sema(void* name, uint32_t attr, int32_t init_val, int32_t max_val, void* option) {
    return (int32_t)sceKernelCreateSema(name, attr, init_val, max_val, option);
}

int32_t libc_psp_sce_kernel_delete_sema(int32_t sema_id) {
    return (int32_t)sceKernelDeleteSema(sema_id);
}

int32_t libc_psp_sce_kernel_signal_sema(int32_t sema_id, int32_t signal) {
    return (int32_t)sceKernelSignalSema(sema_id, signal);
}

int32_t libc_psp_sce_kernel_wait_sema(int32_t sema_id, int32_t signal, void* timeout) {
    return (int32_t)sceKernelWaitSema(sema_id, signal, timeout);
}

int32_t libc_psp_sce_kernel_wait_sema_cb(int32_t sema_id, int32_t signal, void* timeout) {
    return (int32_t)sceKernelWaitSemaCB(sema_id, signal, timeout);
}

int32_t libc_psp_sce_kernel_poll_sema(int32_t sema_id, int32_t signal) {
    return (int32_t)sceKernelPollSema(sema_id, signal);
}

int32_t libc_psp_sce_kernel_refer_sema_status(int32_t sema_id, void* info) {
    return (int32_t)sceKernelReferSemaStatus(sema_id, info);
}

int32_t libc_psp_sce_kernel_create_event_flag(void* name, int32_t attr, int32_t bits, void* opt) {
    return (int32_t)sceKernelCreateEventFlag(name, attr, bits, opt);
}

int32_t libc_psp_sce_kernel_set_event_flag(int32_t ev_id, uint32_t bits) {
    return (int32_t)sceKernelSetEventFlag(ev_id, bits);
}

int32_t libc_psp_sce_kernel_clear_event_flag(int32_t ev_id, uint32_t bits) {
    return (int32_t)sceKernelClearEventFlag(ev_id, bits);
}

int32_t libc_psp_sce_kernel_poll_event_flag(int32_t ev_id, uint32_t bits, int32_t wait, void* out_bits) {
    return (int32_t)sceKernelPollEventFlag(ev_id, bits, wait, out_bits);
}

int32_t libc_psp_sce_kernel_wait_event_flag(int32_t ev_id, uint32_t bits, int32_t wait, void* out_bits, void* timeout) {
    return (int32_t)sceKernelWaitEventFlag(ev_id, bits, wait, out_bits, timeout);
}

int32_t libc_psp_sce_kernel_wait_event_flag_cb(int32_t ev_id, uint32_t bits, int32_t wait, void* out_bits, void* timeout) {
    return (int32_t)sceKernelWaitEventFlagCB(ev_id, bits, wait, out_bits, timeout);
}

int32_t libc_psp_sce_kernel_delete_event_flag(int32_t ev_id) {
    return (int32_t)sceKernelDeleteEventFlag(ev_id);
}

int32_t libc_psp_sce_kernel_refer_event_flag_status(int32_t event, void* status) {
    return (int32_t)sceKernelReferEventFlagStatus(event, status);
}

int32_t libc_psp_sce_kernel_create_mbx(void* name, uint32_t attr, void* option) {
    return (int32_t)sceKernelCreateMbx(name, attr, option);
}

int32_t libc_psp_sce_kernel_delete_mbx(int32_t mbx_id) {
    return (int32_t)sceKernelDeleteMbx(mbx_id);
}

int32_t libc_psp_sce_kernel_send_mbx(int32_t mbx_id, void* message) {
    return (int32_t)sceKernelSendMbx(mbx_id, message);
}

int32_t libc_psp_sce_kernel_receive_mbx(int32_t mbx_id, void* message, void* timeout) {
    return (int32_t)sceKernelReceiveMbx(mbx_id, message, timeout);
}

int32_t libc_psp_sce_kernel_receive_mbx_cb(int32_t mbx_id, void* message, void* timeout) {
    return (int32_t)sceKernelReceiveMbxCB(mbx_id, message, timeout);
}

int32_t libc_psp_sce_kernel_poll_mbx(int32_t mbx_id, void* pmessage) {
    return (int32_t)sceKernelPollMbx(mbx_id, pmessage);
}

int32_t libc_psp_sce_kernel_cancel_receive_mbx(int32_t mbx_id, void* num) {
    return (int32_t)sceKernelCancelReceiveMbx(mbx_id, num);
}

int32_t libc_psp_sce_kernel_refer_mbx_status(int32_t mbx_id, void* info) {
    return (int32_t)sceKernelReferMbxStatus(mbx_id, info);
}

int32_t libc_psp_sce_kernel_set_alarm(uint32_t clock, int32_t handler, void* common) {
    return (int32_t)sceKernelSetAlarm(clock, handler, common);
}

int32_t libc_psp_sce_kernel_set_sys_clock_alarm(void* clock, void* handler, void* common) {
    return (int32_t)sceKernelSetSysClockAlarm(clock, handler, common);
}

int32_t libc_psp_sce_kernel_cancel_alarm(int32_t alarm_id) {
    return (int32_t)sceKernelCancelAlarm(alarm_id);
}

int32_t libc_psp_sce_kernel_refer_alarm_status(int32_t alarm_id, void* info) {
    return (int32_t)sceKernelReferAlarmStatus(alarm_id, info);
}

int32_t libc_psp_sce_kernel_create_callback(void* name, int32_t func, void* arg) {
    return (int32_t)sceKernelCreateCallback(name, func, arg);
}

int32_t libc_psp_sce_kernel_refer_callback_status(int32_t cb, void* status) {
    return (int32_t)sceKernelReferCallbackStatus(cb, status);
}

int32_t libc_psp_sce_kernel_delete_callback(int32_t cb) {
    return (int32_t)sceKernelDeleteCallback(cb);
}

int32_t libc_psp_sce_kernel_notify_callback(int32_t cb, int32_t arg2) {
    return (int32_t)sceKernelNotifyCallback(cb, arg2);
}

int32_t libc_psp_sce_kernel_cancel_callback(int32_t cb) {
    return (int32_t)sceKernelCancelCallback(cb);
}

int32_t libc_psp_sce_kernel_get_callback_count(int32_t cb) {
    return (int32_t)sceKernelGetCallbackCount(cb);
}

int32_t libc_psp_sce_kernel_check_callback(void) {
    return (int32_t)sceKernelCheckCallback();
}

int32_t libc_psp_sce_kernel_get_threadman_id_list(int32_t type_, void* read_buf, int32_t read_buf_size, void* id_count) {
    return (int32_t)sceKernelGetThreadmanIdList(type_, read_buf, read_buf_size, id_count);
}

int32_t libc_psp_sce_kernel_refer_system_status(void* status) {
    return (int32_t)sceKernelReferSystemStatus(status);
}

int32_t libc_psp_sce_kernel_create_msg_pipe(void* name, int32_t part, int32_t attr, void* unk1, void* opt) {
    return (int32_t)sceKernelCreateMsgPipe(name, part, attr, unk1, opt);
}

int32_t libc_psp_sce_kernel_delete_msg_pipe(int32_t uid) {
    return (int32_t)sceKernelDeleteMsgPipe(uid);
}

int32_t libc_psp_sce_kernel_send_msg_pipe(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2, void* timeout) {
    return (int32_t)sceKernelSendMsgPipe(uid, message, size, unk1, unk2, timeout);
}

int32_t libc_psp_sce_kernel_send_msg_pipe_cb(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2, void* timeout) {
    return (int32_t)sceKernelSendMsgPipeCB(uid, message, size, unk1, unk2, timeout);
}

int32_t libc_psp_sce_kernel_try_send_msg_pipe(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2) {
    return (int32_t)sceKernelTrySendMsgPipe(uid, message, size, unk1, unk2);
}

int32_t libc_psp_sce_kernel_receive_msg_pipe(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2, void* timeout) {
    return (int32_t)sceKernelReceiveMsgPipe(uid, message, size, unk1, unk2, timeout);
}

int32_t libc_psp_sce_kernel_receive_msg_pipe_cb(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2, void* timeout) {
    return (int32_t)sceKernelReceiveMsgPipeCB(uid, message, size, unk1, unk2, timeout);
}

int32_t libc_psp_sce_kernel_try_receive_msg_pipe(int32_t uid, void* message, uint32_t size, int32_t unk1, void* unk2) {
    return (int32_t)sceKernelTryReceiveMsgPipe(uid, message, size, unk1, unk2);
}

int32_t libc_psp_sce_kernel_cancel_msg_pipe(int32_t uid, void* send, void* recv) {
    return (int32_t)sceKernelCancelMsgPipe(uid, send, recv);
}

int32_t libc_psp_sce_kernel_refer_msg_pipe_status(int32_t uid, void* info) {
    return (int32_t)sceKernelReferMsgPipeStatus(uid, info);
}

int32_t libc_psp_sce_kernel_create_vpl(void* name, int32_t part, int32_t attr, uint32_t size, void* opt) {
    return (int32_t)sceKernelCreateVpl(name, part, attr, size, opt);
}

int32_t libc_psp_sce_kernel_delete_vpl(int32_t uid) {
    return (int32_t)sceKernelDeleteVpl(uid);
}

int32_t libc_psp_sce_kernel_allocate_vpl(int32_t uid, uint32_t size, void* data, void* timeout) {
    return (int32_t)sceKernelAllocateVpl(uid, size, data, timeout);
}

int32_t libc_psp_sce_kernel_allocate_vpl_cb(int32_t uid, uint32_t size, void* data, void* timeout) {
    return (int32_t)sceKernelAllocateVplCB(uid, size, data, timeout);
}

int32_t libc_psp_sce_kernel_try_allocate_vpl(int32_t uid, uint32_t size, void* data) {
    return (int32_t)sceKernelTryAllocateVpl(uid, size, data);
}

int32_t libc_psp_sce_kernel_free_vpl(int32_t uid, void* data) {
    return (int32_t)sceKernelFreeVpl(uid, data);
}

int32_t libc_psp_sce_kernel_cancel_vpl(int32_t uid, void* num) {
    return (int32_t)sceKernelCancelVpl(uid, num);
}

int32_t libc_psp_sce_kernel_refer_vpl_status(int32_t uid, void* info) {
    return (int32_t)sceKernelReferVplStatus(uid, info);
}

int32_t libc_psp_sce_kernel_create_fpl(void* name, int32_t part, int32_t attr, uint32_t size, uint32_t blocks, void* opt) {
    return (int32_t)sceKernelCreateFpl(name, part, attr, size, blocks, opt);
}

int32_t libc_psp_sce_kernel_delete_fpl(int32_t uid) {
    return (int32_t)sceKernelDeleteFpl(uid);
}

int32_t libc_psp_sce_kernel_allocate_fpl(int32_t uid, void* data, void* timeout) {
    return (int32_t)sceKernelAllocateFpl(uid, data, timeout);
}

int32_t libc_psp_sce_kernel_allocate_fpl_cb(int32_t uid, void* data, void* timeout) {
    return (int32_t)sceKernelAllocateFplCB(uid, data, timeout);
}

int32_t libc_psp_sce_kernel_try_allocate_fpl(int32_t uid, void* data) {
    return (int32_t)sceKernelTryAllocateFpl(uid, data);
}

int32_t libc_psp_sce_kernel_free_fpl(int32_t uid, void* data) {
    return (int32_t)sceKernelFreeFpl(uid, data);
}

int32_t libc_psp_sce_kernel_cancel_fpl(int32_t uid, void* pnum) {
    return (int32_t)sceKernelCancelFpl(uid, pnum);
}

int32_t libc_psp_sce_kernel_refer_fpl_status(int32_t uid, void* info) {
    return (int32_t)sceKernelReferFplStatus(uid, info);
}

int32_t libc_psp_sce_kernel_usec2sys_clock(uint32_t usec, void* clock) {
    return (int32_t)sceKernelUSec2SysClock(usec, clock);
}

int64_t libc_psp_sce_kernel_usec2sys_clock_wide(uint32_t usec) {
    return (int64_t)sceKernelUSec2SysClockWide(usec);
}

int32_t libc_psp_sce_kernel_sys_clock2usec(void* clock, void* low, void* high) {
    return (int32_t)sceKernelSysClock2USec(clock, low, high);
}

int32_t libc_psp_sce_kernel_sys_clock2usec_wide(int64_t clock, void* low, void* high) {
    return (int32_t)sceKernelSysClock2USecWide(clock, low, high);
}

int32_t libc_psp_sce_kernel_get_system_time(void* time) {
    return (int32_t)sceKernelGetSystemTime(time);
}

int64_t libc_psp_sce_kernel_get_system_time_wide(void) {
    return (int64_t)sceKernelGetSystemTimeWide();
}

uint32_t libc_psp_sce_kernel_get_system_time_low(void) {
    return (uint32_t)sceKernelGetSystemTimeLow();
}

int32_t libc_psp_sce_kernel_create_vtimer(void* name, void* opt) {
    return (int32_t)sceKernelCreateVTimer(name, opt);
}

int32_t libc_psp_sce_kernel_delete_vtimer(int32_t uid) {
    return (int32_t)sceKernelDeleteVTimer(uid);
}

int32_t libc_psp_sce_kernel_get_vtimer_base(int32_t uid, void* base) {
    return (int32_t)sceKernelGetVTimerBase(uid, base);
}

int64_t libc_psp_sce_kernel_get_vtimer_base_wide(int32_t uid) {
    return (int64_t)sceKernelGetVTimerBaseWide(uid);
}

int32_t libc_psp_sce_kernel_get_vtimer_time(int32_t uid, void* time) {
    return (int32_t)sceKernelGetVTimerTime(uid, time);
}

int64_t libc_psp_sce_kernel_get_vtimer_time_wide(int32_t uid) {
    return (int64_t)sceKernelGetVTimerTimeWide(uid);
}

int32_t libc_psp_sce_kernel_set_vtimer_time(int32_t uid, void* time) {
    return (int32_t)sceKernelSetVTimerTime(uid, time);
}

int64_t libc_psp_sce_kernel_set_vtimer_time_wide(int32_t uid, int64_t time) {
    return (int64_t)sceKernelSetVTimerTimeWide(uid, time);
}

int32_t libc_psp_sce_kernel_start_vtimer(int32_t uid) {
    return (int32_t)sceKernelStartVTimer(uid);
}

int32_t libc_psp_sce_kernel_stop_vtimer(int32_t uid) {
    return (int32_t)sceKernelStopVTimer(uid);
}

int32_t libc_psp_sce_kernel_set_vtimer_handler(int32_t uid, void* time, int32_t handler, void* common) {
    return (int32_t)sceKernelSetVTimerHandler(uid, time, handler, common);
}

int32_t libc_psp_sce_kernel_set_vtimer_handler_wide(int32_t uid, int64_t time, int32_t handler, void* common) {
    return (int32_t)sceKernelSetVTimerHandlerWide(uid, time, handler, common);
}

int32_t libc_psp_sce_kernel_cancel_vtimer_handler(int32_t uid) {
    return (int32_t)sceKernelCancelVTimerHandler(uid);
}

int32_t libc_psp_sce_kernel_refer_vtimer_status(int32_t uid, void* info) {
    return (int32_t)sceKernelReferVTimerStatus(uid, info);
}

int32_t libc_psp_sce_kernel_register_thread_event_handler(void* name, int32_t thread_id, int32_t mask, int32_t handler, void* common) {
    return (int32_t)sceKernelRegisterThreadEventHandler(name, thread_id, mask, handler, common);
}

int32_t libc_psp_sce_kernel_release_thread_event_handler(int32_t uid) {
    return (int32_t)sceKernelReleaseThreadEventHandler(uid);
}

int32_t libc_psp_sce_kernel_refer_thread_event_handler_status(int32_t uid, void* info) {
    return (int32_t)sceKernelReferThreadEventHandlerStatus(uid, info);
}

void* libc_psp_sce_kernel_refer_thread_profiler(void) {
    return (void*)sceKernelReferThreadProfiler();
}

void* libc_psp_sce_kernel_refer_global_profiler(void) {
    return (void*)sceKernelReferGlobalProfiler();
}

int32_t libc_psp_sce_usb_start(void* driver_name, int32_t size, void* args) {
    return (int32_t)sceUsbStart(driver_name, size, args);
}

int32_t libc_psp_sce_usb_stop(void* driver_name, int32_t size, void* args) {
    return (int32_t)sceUsbStop(driver_name, size, args);
}

int32_t libc_psp_sce_usb_activate(uint32_t pid) {
    return (int32_t)sceUsbActivate(pid);
}

int32_t libc_psp_sce_usb_deactivate(uint32_t pid) {
    return (int32_t)sceUsbDeactivate(pid);
}

int32_t libc_psp_sce_usb_get_state(void) {
    return (int32_t)sceUsbGetState();
}

int32_t libc_psp_sce_usb_get_drv_state(void* driver_name) {
    return (int32_t)sceUsbGetDrvState(driver_name);
}

int32_t libc_psp_sce_usb_cam_setup_still(void* param) {
    return (int32_t)sceUsbCamSetupStill(param);
}

int32_t libc_psp_sce_usb_cam_setup_still_ex(void* param) {
    return (int32_t)sceUsbCamSetupStillEx(param);
}

int32_t libc_psp_sce_usb_cam_still_input_blocking(void* buf, uint64_t size) {
    return (int32_t)sceUsbCamStillInputBlocking(buf, size);
}

int32_t libc_psp_sce_usb_cam_still_input(void* buf, uint64_t size) {
    return (int32_t)sceUsbCamStillInput(buf, size);
}

int32_t libc_psp_sce_usb_cam_still_wait_input_end(void) {
    return (int32_t)sceUsbCamStillWaitInputEnd();
}

int32_t libc_psp_sce_usb_cam_still_poll_input_end(void) {
    return (int32_t)sceUsbCamStillPollInputEnd();
}

int32_t libc_psp_sce_usb_cam_still_cancel_input(void) {
    return (int32_t)sceUsbCamStillCancelInput();
}

int32_t libc_psp_sce_usb_cam_still_get_input_length(void) {
    return (int32_t)sceUsbCamStillGetInputLength();
}

int32_t libc_psp_sce_usb_cam_setup_video(void* param, void* work_area, int32_t work_area_size) {
    return (int32_t)sceUsbCamSetupVideo(param, work_area, work_area_size);
}

int32_t libc_psp_sce_usb_cam_setup_video_ex(void* param, void* work_area, int32_t work_area_size) {
    return (int32_t)sceUsbCamSetupVideoEx(param, work_area, work_area_size);
}

int32_t libc_psp_sce_usb_cam_start_video(void) {
    return (int32_t)sceUsbCamStartVideo();
}

int32_t libc_psp_sce_usb_cam_stop_video(void) {
    return (int32_t)sceUsbCamStopVideo();
}

int32_t libc_psp_sce_usb_cam_read_video_frame_blocking(void* buf, uint64_t size) {
    return (int32_t)sceUsbCamReadVideoFrameBlocking(buf, size);
}

int32_t libc_psp_sce_usb_cam_read_video_frame(void* buf, uint64_t size) {
    return (int32_t)sceUsbCamReadVideoFrame(buf, size);
}

int32_t libc_psp_sce_usb_cam_wait_read_video_frame_end(void) {
    return (int32_t)sceUsbCamWaitReadVideoFrameEnd();
}

int32_t libc_psp_sce_usb_cam_poll_read_video_frame_end(void) {
    return (int32_t)sceUsbCamPollReadVideoFrameEnd();
}

int32_t libc_psp_sce_usb_cam_get_read_video_frame_size(void) {
    return (int32_t)sceUsbCamGetReadVideoFrameSize();
}

int32_t libc_psp_sce_usb_cam_set_saturation(int32_t saturation) {
    return (int32_t)sceUsbCamSetSaturation(saturation);
}

int32_t libc_psp_sce_usb_cam_set_brightness(int32_t brightness) {
    return (int32_t)sceUsbCamSetBrightness(brightness);
}

int32_t libc_psp_sce_usb_cam_set_contrast(int32_t contrast) {
    return (int32_t)sceUsbCamSetContrast(contrast);
}

int32_t libc_psp_sce_usb_cam_set_sharpness(int32_t sharpness) {
    return (int32_t)sceUsbCamSetSharpness(sharpness);
}

int32_t libc_psp_sce_usb_cam_set_image_effect_mode(int32_t effect_mode) {
    return (int32_t)sceUsbCamSetImageEffectMode(effect_mode);
}

int32_t libc_psp_sce_usb_cam_set_ev_level(int32_t exposure_level) {
    return (int32_t)sceUsbCamSetEvLevel(exposure_level);
}

int32_t libc_psp_sce_usb_cam_set_reverse_mode(int32_t reverse_flags) {
    return (int32_t)sceUsbCamSetReverseMode(reverse_flags);
}

int32_t libc_psp_sce_usb_cam_set_zoom(int32_t zoom) {
    return (int32_t)sceUsbCamSetZoom(zoom);
}

int32_t libc_psp_sce_usb_cam_get_saturation(void* saturation) {
    return (int32_t)sceUsbCamGetSaturation(saturation);
}

int32_t libc_psp_sce_usb_cam_get_brightness(void* brightness) {
    return (int32_t)sceUsbCamGetBrightness(brightness);
}

int32_t libc_psp_sce_usb_cam_get_contrast(void* contrast) {
    return (int32_t)sceUsbCamGetContrast(contrast);
}

int32_t libc_psp_sce_usb_cam_get_sharpness(void* sharpness) {
    return (int32_t)sceUsbCamGetSharpness(sharpness);
}

int32_t libc_psp_sce_usb_cam_get_image_effect_mode(void* effect_mode) {
    return (int32_t)sceUsbCamGetImageEffectMode(effect_mode);
}

int32_t libc_psp_sce_usb_cam_get_ev_level(void* exposure_level) {
    return (int32_t)sceUsbCamGetEvLevel(exposure_level);
}

int32_t libc_psp_sce_usb_cam_get_reverse_mode(void* reverse_flags) {
    return (int32_t)sceUsbCamGetReverseMode(reverse_flags);
}

int32_t libc_psp_sce_usb_cam_get_zoom(void* zoom) {
    return (int32_t)sceUsbCamGetZoom(zoom);
}

int32_t libc_psp_sce_usb_cam_auto_image_reverse_sw(int32_t on) {
    return (int32_t)sceUsbCamAutoImageReverseSW(on);
}

int32_t libc_psp_sce_usb_cam_get_auto_image_reverse_state(void) {
    return (int32_t)sceUsbCamGetAutoImageReverseState();
}

int32_t libc_psp_sce_usb_cam_get_lens_direction(void) {
    return (int32_t)sceUsbCamGetLensDirection();
}

int32_t libc_psp_sce_usbstor_boot_register_notify(int32_t event_flag) {
    return (int32_t)sceUsbstorBootRegisterNotify(event_flag);
}

int32_t libc_psp_sce_usbstor_boot_unregister_notify(uint32_t event_flag) {
    return (int32_t)sceUsbstorBootUnregisterNotify(event_flag);
}

int32_t libc_psp_sce_usbstor_boot_set_capacity(uint32_t size) {
    return (int32_t)sceUsbstorBootSetCapacity(size);
}

int32_t libc_psp_sce_power_register_callback(int32_t slot, int32_t cbid) {
    return (int32_t)scePowerRegisterCallback(slot, cbid);
}

int32_t libc_psp_sce_power_unregister_callback(int32_t slot) {
    return (int32_t)scePowerUnregisterCallback(slot);
}

int32_t libc_psp_sce_power_is_power_online(void) {
    return (int32_t)scePowerIsPowerOnline();
}

int32_t libc_psp_sce_power_is_battery_exist(void) {
    return (int32_t)scePowerIsBatteryExist();
}

int32_t libc_psp_sce_power_is_battery_charging(void) {
    return (int32_t)scePowerIsBatteryCharging();
}

int32_t libc_psp_sce_power_get_battery_charging_status(void) {
    return (int32_t)scePowerGetBatteryChargingStatus();
}

int32_t libc_psp_sce_power_is_low_battery(void) {
    return (int32_t)scePowerIsLowBattery();
}

int32_t libc_psp_sce_power_get_battery_life_percent(void) {
    return (int32_t)scePowerGetBatteryLifePercent();
}

int32_t libc_psp_sce_power_get_battery_life_time(void) {
    return (int32_t)scePowerGetBatteryLifeTime();
}

int32_t libc_psp_sce_power_get_battery_temp(void) {
    return (int32_t)scePowerGetBatteryTemp();
}

int32_t libc_psp_sce_power_get_battery_elec(void) {
    return (int32_t)scePowerGetBatteryElec();
}

int32_t libc_psp_sce_power_get_battery_volt(void) {
    return (int32_t)scePowerGetBatteryVolt();
}

int32_t libc_psp_sce_power_set_cpu_clock_frequency(int32_t cpufreq) {
    return (int32_t)scePowerSetCpuClockFrequency(cpufreq);
}

int32_t libc_psp_sce_power_set_bus_clock_frequency(int32_t busfreq) {
    return (int32_t)scePowerSetBusClockFrequency(busfreq);
}

int32_t libc_psp_sce_power_get_cpu_clock_frequency(void) {
    return (int32_t)scePowerGetCpuClockFrequency();
}

int32_t libc_psp_sce_power_get_cpu_clock_frequency_int(void) {
    return (int32_t)scePowerGetCpuClockFrequencyInt();
}

float libc_psp_sce_power_get_cpu_clock_frequency_float(void) {
    return (float)scePowerGetCpuClockFrequencyFloat();
}

int32_t libc_psp_sce_power_get_bus_clock_frequency(void) {
    return (int32_t)scePowerGetBusClockFrequency();
}

int32_t libc_psp_sce_power_get_bus_clock_frequency_int(void) {
    return (int32_t)scePowerGetBusClockFrequencyInt();
}

float libc_psp_sce_power_get_bus_clock_frequency_float(void) {
    return (float)scePowerGetBusClockFrequencyFloat();
}

int32_t libc_psp_sce_power_set_clock_frequency(int32_t pllfreq, int32_t cpufreq, int32_t busfreq) {
    return (int32_t)scePowerSetClockFrequency(pllfreq, cpufreq, busfreq);
}

int32_t libc_psp_sce_power_lock(int32_t unknown) {
    return (int32_t)scePowerLock(unknown);
}

int32_t libc_psp_sce_power_unlock(int32_t unknown) {
    return (int32_t)scePowerUnlock(unknown);
}

int32_t libc_psp_sce_power_tick(int32_t t) {
    return (int32_t)scePowerTick(t);
}

int32_t libc_psp_sce_power_get_idle_timer(void) {
    return (int32_t)scePowerGetIdleTimer();
}

int32_t libc_psp_sce_power_idle_timer_enable(int32_t unknown) {
    return (int32_t)scePowerIdleTimerEnable(unknown);
}

int32_t libc_psp_sce_power_idle_timer_disable(int32_t unknown) {
    return (int32_t)scePowerIdleTimerDisable(unknown);
}

int32_t libc_psp_sce_power_request_standby(void) {
    return (int32_t)scePowerRequestStandby();
}

int32_t libc_psp_sce_power_request_suspend(void) {
    return (int32_t)scePowerRequestSuspend();
}

int32_t libc_psp_sce_wlan_dev_is_power_on(void) {
    return (int32_t)sceWlanDevIsPowerOn();
}

int32_t libc_psp_sce_wlan_get_switch_state(void) {
    return (int32_t)sceWlanGetSwitchState();
}

int32_t libc_psp_sce_wlan_get_ether_addr(void* ether_addr) {
    return (int32_t)sceWlanGetEtherAddr(ether_addr);
}

int32_t libc_psp_sce_wlan_dev_attach(void) {
    return (int32_t)sceWlanDevAttach();
}

int32_t libc_psp_sce_wlan_dev_detach(void) {
    return (int32_t)sceWlanDevDetach();
}

uint32_t libc_psp_sce_rtc_get_tick_resolution(void) {
    return (uint32_t)sceRtcGetTickResolution();
}

int32_t libc_psp_sce_rtc_get_current_tick(void* tick) {
    return (int32_t)sceRtcGetCurrentTick(tick);
}

int32_t libc_psp_sce_rtc_get_current_clock(void* tm, int32_t tz) {
    return (int32_t)sceRtcGetCurrentClock(tm, tz);
}

int32_t libc_psp_sce_rtc_get_current_clock_local_time(void* tm) {
    return (int32_t)sceRtcGetCurrentClockLocalTime(tm);
}

int32_t libc_psp_sce_rtc_convert_utc_to_local_time(void* tick_utc, void* tick_local) {
    return (int32_t)sceRtcConvertUtcToLocalTime(tick_utc, tick_local);
}

int32_t libc_psp_sce_rtc_convert_local_time_to_utc(void* tick_local, void* tick_utc) {
    return (int32_t)sceRtcConvertLocalTimeToUTC(tick_local, tick_utc);
}

int32_t libc_psp_sce_rtc_is_leap_year(int32_t year) {
    return (int32_t)sceRtcIsLeapYear(year);
}

int32_t libc_psp_sce_rtc_get_days_in_month(int32_t year, int32_t month) {
    return (int32_t)sceRtcGetDaysInMonth(year, month);
}

int32_t libc_psp_sce_rtc_get_day_of_week(int32_t year, int32_t month, int32_t day) {
    return (int32_t)sceRtcGetDayOfWeek(year, month, day);
}

int32_t libc_psp_sce_rtc_check_valid(void* date) {
    return (int32_t)sceRtcCheckValid(date);
}

int32_t libc_psp_sce_rtc_set_tick(void* date, void* tick) {
    return (int32_t)sceRtcSetTick(date, tick);
}

int32_t libc_psp_sce_rtc_get_tick(void* date, void* tick) {
    return (int32_t)sceRtcGetTick(date, tick);
}

int32_t libc_psp_sce_rtc_compare_tick(void* tick1, void* tick2) {
    return (int32_t)sceRtcCompareTick(tick1, tick2);
}

int32_t libc_psp_sce_rtc_tick_add_ticks(void* dest_tick, void* src_tick, uint64_t num_ticks) {
    return (int32_t)sceRtcTickAddTicks(dest_tick, src_tick, num_ticks);
}

int32_t libc_psp_sce_rtc_tick_add_microseconds(void* dest_tick, void* src_tick, uint64_t num_ms) {
    return (int32_t)sceRtcTickAddMicroseconds(dest_tick, src_tick, num_ms);
}

int32_t libc_psp_sce_rtc_tick_add_seconds(void* dest_tick, void* src_tick, uint64_t num_seconds) {
    return (int32_t)sceRtcTickAddSeconds(dest_tick, src_tick, num_seconds);
}

int32_t libc_psp_sce_rtc_tick_add_minutes(void* dest_tick, void* src_tick, uint64_t num_minutes) {
    return (int32_t)sceRtcTickAddMinutes(dest_tick, src_tick, num_minutes);
}

int32_t libc_psp_sce_rtc_tick_add_hours(void* dest_tick, void* src_tick, uint64_t num_hours) {
    return (int32_t)sceRtcTickAddHours(dest_tick, src_tick, num_hours);
}

int32_t libc_psp_sce_rtc_tick_add_days(void* dest_tick, void* src_tick, uint64_t num_days) {
    return (int32_t)sceRtcTickAddDays(dest_tick, src_tick, num_days);
}

int32_t libc_psp_sce_rtc_tick_add_weeks(void* dest_tick, void* src_tick, uint64_t num_weeks) {
    return (int32_t)sceRtcTickAddWeeks(dest_tick, src_tick, num_weeks);
}

int32_t libc_psp_sce_rtc_tick_add_months(void* dest_tick, void* src_tick, uint64_t num_months) {
    return (int32_t)sceRtcTickAddMonths(dest_tick, src_tick, num_months);
}

int32_t libc_psp_sce_rtc_tick_add_years(void* dest_tick, void* src_tick, uint64_t num_years) {
    return (int32_t)sceRtcTickAddYears(dest_tick, src_tick, num_years);
}

int32_t libc_psp_sce_rtc_set_time_t(void* date, uint32_t time) {
    return (int32_t)sceRtcSetTime_t(date, time);
}

int32_t libc_psp_sce_rtc_get_time_t(void* date, void* time) {
    return (int32_t)sceRtcGetTime_t(date, time);
}

int32_t libc_psp_sce_rtc_set_time64t(void* date, uint64_t time) {
    return (int32_t)sceRtcSetTime64_t(date, time);
}

int32_t libc_psp_sce_rtc_get_time64t(void* date, void* time) {
    return (int32_t)sceRtcGetTime64_t(date, time);
}

int32_t libc_psp_sce_rtc_set_dos_time(void* date, uint32_t dos_time) {
    return (int32_t)sceRtcSetDosTime(date, dos_time);
}

int32_t libc_psp_sce_rtc_get_dos_time(void* date, uint32_t dos_time) {
    return (int32_t)sceRtcGetDosTime(date, dos_time);
}

int32_t libc_psp_sce_rtc_set_win32file_time(void* date, void* time) {
    return (int32_t)sceRtcSetWin32FileTime(date, time);
}

int32_t libc_psp_sce_rtc_get_win32file_time(void* date, void* time) {
    return (int32_t)sceRtcGetWin32FileTime(date, time);
}

int32_t libc_psp_sce_rtc_parse_date_time(void* dest_tick, void* date_string) {
    return (int32_t)sceRtcParseDateTime(dest_tick, date_string);
}

int32_t libc_psp_sce_rtc_format_rfc3339(char* psz_date_time, void* p_utc, int32_t time_zone_minutes) {
    return (int32_t)sceRtcFormatRFC3339(psz_date_time, p_utc, time_zone_minutes);
}

int32_t libc_psp_sce_rtc_format_rfc3339local_time(char* psz_date_time, void* p_utc) {
    return (int32_t)sceRtcFormatRFC3339LocalTime(psz_date_time, p_utc);
}

int32_t libc_psp_sce_rtc_parse_rfc3339(void* p_utc, void* psz_date_time) {
    return (int32_t)sceRtcParseRFC3339(p_utc, psz_date_time);
}

int32_t libc_psp_sce_rtc_format_rfc2822(char* psz_date_time, void* p_utc, int32_t time_zone_minutes) {
    return (int32_t)sceRtcFormatRFC2822(psz_date_time, p_utc, time_zone_minutes);
}

int32_t libc_psp_sce_rtc_format_rfc2822local_time(char* psz_date_time, void* p_utc) {
    return (int32_t)sceRtcFormatRFC2822LocalTime(psz_date_time, p_utc);
}

int32_t libc_psp_sce_io_open(void* file, int32_t flags, int32_t permissions) {
    return (int32_t)sceIoOpen(file, flags, permissions);
}

int32_t libc_psp_sce_io_open_async(void* file, int32_t flags, int32_t permissions) {
    return (int32_t)sceIoOpenAsync(file, flags, permissions);
}

int32_t libc_psp_sce_io_close(int32_t fd) {
    return (int32_t)sceIoClose(fd);
}

int32_t libc_psp_sce_io_close_async(int32_t fd) {
    return (int32_t)sceIoCloseAsync(fd);
}

int32_t libc_psp_sce_io_read(int32_t fd, void* data, uint32_t size) {
    return (int32_t)sceIoRead(fd, data, size);
}

int32_t libc_psp_sce_io_read_async(int32_t fd, void* data, uint32_t size) {
    return (int32_t)sceIoReadAsync(fd, data, size);
}

int32_t libc_psp_sce_io_write(int32_t fd, void* data, uint64_t size) {
    return (int32_t)sceIoWrite(fd, data, size);
}

int32_t libc_psp_sce_io_write_async(int32_t fd, void* data, uint32_t size) {
    return (int32_t)sceIoWriteAsync(fd, data, size);
}

int64_t libc_psp_sce_io_lseek(int32_t fd, int64_t offset, int32_t whence) {
    return (int64_t)sceIoLseek(fd, offset, whence);
}

int32_t libc_psp_sce_io_lseek_async(int32_t fd, int64_t offset, int32_t whence) {
    return (int32_t)sceIoLseekAsync(fd, offset, whence);
}

int32_t libc_psp_sce_io_lseek32(int32_t fd, int32_t offset, int32_t whence) {
    return (int32_t)sceIoLseek32(fd, offset, whence);
}

int32_t libc_psp_sce_io_lseek32async(int32_t fd, int32_t offset, int32_t whence) {
    return (int32_t)sceIoLseek32Async(fd, offset, whence);
}

int32_t libc_psp_sce_io_remove(void* file) {
    return (int32_t)sceIoRemove(file);
}

int32_t libc_psp_sce_io_mkdir(void* dir, int32_t mode) {
    return (int32_t)sceIoMkdir(dir, mode);
}

int32_t libc_psp_sce_io_rmdir(void* path) {
    return (int32_t)sceIoRmdir(path);
}

int32_t libc_psp_sce_io_chdir(void* path) {
    return (int32_t)sceIoChdir(path);
}

int32_t libc_psp_sce_io_rename(void* oldname, void* newname) {
    return (int32_t)sceIoRename(oldname, newname);
}

int32_t libc_psp_sce_io_dopen(void* dirname) {
    return (int32_t)sceIoDopen(dirname);
}

int32_t libc_psp_sce_io_dread(int32_t fd, void* dir) {
    return (int32_t)sceIoDread(fd, dir);
}

int32_t libc_psp_sce_io_dclose(int32_t fd) {
    return (int32_t)sceIoDclose(fd);
}

int32_t libc_psp_sce_io_devctl(void* dev, uint32_t cmd, void* indata, int32_t inlen, void* outdata, int32_t outlen) {
    return (int32_t)sceIoDevctl(dev, cmd, indata, inlen, outdata, outlen);
}

int32_t libc_psp_sce_io_assign(void* dev1, void* dev2, void* dev3, int32_t mode, void* unk1, int32_t unk2) {
    return (int32_t)sceIoAssign(dev1, dev2, dev3, mode, unk1, unk2);
}

int32_t libc_psp_sce_io_unassign(void* dev) {
    return (int32_t)sceIoUnassign(dev);
}

int32_t libc_psp_sce_io_getstat(void* file, void* stat) {
    return (int32_t)sceIoGetstat(file, stat);
}

int32_t libc_psp_sce_io_chstat(void* file, void* stat, int32_t bits) {
    return (int32_t)sceIoChstat(file, stat, bits);
}

int32_t libc_psp_sce_io_ioctl(int32_t fd, uint32_t cmd, void* indata, int32_t inlen, void* outdata, int32_t outlen) {
    return (int32_t)sceIoIoctl(fd, cmd, indata, inlen, outdata, outlen);
}

int32_t libc_psp_sce_io_ioctl_async(int32_t fd, uint32_t cmd, void* indata, int32_t inlen, void* outdata, int32_t outlen) {
    return (int32_t)sceIoIoctlAsync(fd, cmd, indata, inlen, outdata, outlen);
}

int32_t libc_psp_sce_io_sync(void* device, uint32_t unk) {
    return (int32_t)sceIoSync(device, unk);
}

int32_t libc_psp_sce_io_wait_async(int32_t fd, void* res) {
    return (int32_t)sceIoWaitAsync(fd, res);
}

int32_t libc_psp_sce_io_wait_async_cb(int32_t fd, void* res) {
    return (int32_t)sceIoWaitAsyncCB(fd, res);
}

int32_t libc_psp_sce_io_poll_async(int32_t fd, void* res) {
    return (int32_t)sceIoPollAsync(fd, res);
}

int32_t libc_psp_sce_io_get_async_stat(int32_t fd, int32_t poll, void* res) {
    return (int32_t)sceIoGetAsyncStat(fd, poll, res);
}

int32_t libc_psp_sce_io_cancel(int32_t fd) {
    return (int32_t)sceIoCancel(fd);
}

int32_t libc_psp_sce_io_get_dev_type(int32_t fd) {
    return (int32_t)sceIoGetDevType(fd);
}

int32_t libc_psp_sce_io_change_async_priority(int32_t fd, int32_t pri) {
    return (int32_t)sceIoChangeAsyncPriority(fd, pri);
}

int32_t libc_psp_sce_io_set_async_callback(int32_t fd, int32_t cb, void* argp) {
    return (int32_t)sceIoSetAsyncCallback(fd, cb, argp);
}

int32_t libc_psp_sce_jpeg_init_mjpeg(void) {
    return (int32_t)sceJpegInitMJpeg();
}

int32_t libc_psp_sce_jpeg_finish_mjpeg(void) {
    return (int32_t)sceJpegFinishMJpeg();
}

int32_t libc_psp_sce_jpeg_create_mjpeg(int32_t width, int32_t height) {
    return (int32_t)sceJpegCreateMJpeg(width, height);
}

int32_t libc_psp_sce_jpeg_delete_mjpeg(void) {
    return (int32_t)sceJpegDeleteMJpeg();
}

int32_t libc_psp_sce_jpeg_decode_mjpeg(void* jpeg_buf, uint64_t size, void* rgba, uint32_t unk) {
    return (int32_t)sceJpegDecodeMJpeg(jpeg_buf, size, rgba, unk);
}

int32_t libc_psp_sce_umd_check_medium(void) {
    return (int32_t)sceUmdCheckMedium();
}

int32_t libc_psp_sce_umd_get_disc_info(void* info) {
    return (int32_t)sceUmdGetDiscInfo(info);
}

int32_t libc_psp_sce_umd_activate(int32_t unit, void* drive) {
    return (int32_t)sceUmdActivate(unit, drive);
}

int32_t libc_psp_sce_umd_deactivate(int32_t unit, void* drive) {
    return (int32_t)sceUmdDeactivate(unit, drive);
}

int32_t libc_psp_sce_umd_wait_drive_stat(int32_t state) {
    return (int32_t)sceUmdWaitDriveStat(state);
}

int32_t libc_psp_sce_umd_wait_drive_stat_with_timer(int32_t state, uint32_t timeout) {
    return (int32_t)sceUmdWaitDriveStatWithTimer(state, timeout);
}

int32_t libc_psp_sce_umd_wait_drive_stat_cb(int32_t state, uint32_t timeout) {
    return (int32_t)sceUmdWaitDriveStatCB(state, timeout);
}

int32_t libc_psp_sce_umd_cancel_wait_drive_stat(void) {
    return (int32_t)sceUmdCancelWaitDriveStat();
}

int32_t libc_psp_sce_umd_get_drive_stat(void) {
    return (int32_t)sceUmdGetDriveStat();
}

int32_t libc_psp_sce_umd_get_error_stat(void) {
    return (int32_t)sceUmdGetErrorStat();
}

int32_t libc_psp_sce_umd_register_umdcall_back(int32_t cbid) {
    return (int32_t)sceUmdRegisterUMDCallBack(cbid);
}

int32_t libc_psp_sce_umd_un_register_umdcall_back(int32_t cbid) {
    return (int32_t)sceUmdUnRegisterUMDCallBack(cbid);
}

int32_t libc_psp_sce_umd_replace_permit(void) {
    return (int32_t)sceUmdReplacePermit();
}

int32_t libc_psp_sce_umd_replace_prohibit(void) {
    return (int32_t)sceUmdReplaceProhibit();
}

int32_t libc_psp_sce_mpeg_init(void) {
    return (int32_t)sceMpegInit();
}

void libc_psp_sce_mpeg_finish(void) {
    sceMpegFinish();
}

int32_t libc_psp_sce_mpeg_ringbuffer_query_mem_size(int32_t packets) {
    return (int32_t)sceMpegRingbufferQueryMemSize(packets);
}

int32_t libc_psp_sce_mpeg_ringbuffer_construct(void* ringbuffer, int32_t packets, void* data, int32_t size, int32_t callback, void* cb_param) {
    return (int32_t)sceMpegRingbufferConstruct(ringbuffer, packets, data, size, callback, cb_param);
}

void libc_psp_sce_mpeg_ringbuffer_destruct(void* ringbuffer) {
    sceMpegRingbufferDestruct(ringbuffer);
}

int32_t libc_psp_sce_mpeg_ringbuffer_available_size(void* ringbuffer) {
    return (int32_t)sceMpegRingbufferAvailableSize(ringbuffer);
}

int32_t libc_psp_sce_mpeg_ringbuffer_put(void* ringbuffer, int32_t num_packets, int32_t available) {
    return (int32_t)sceMpegRingbufferPut(ringbuffer, num_packets, available);
}

int32_t libc_psp_sce_mpeg_query_mem_size(int32_t unk) {
    return (int32_t)sceMpegQueryMemSize(unk);
}

int32_t libc_psp_sce_mpeg_create(int32_t handle, void* data, int32_t size, void* ringbuffer, int32_t frame_width, int32_t unk1, int32_t unk2) {
    return (int32_t)sceMpegCreate(handle, data, size, ringbuffer, frame_width, unk1, unk2);
}

void libc_psp_sce_mpeg_delete(int32_t handle) {
    sceMpegDelete(handle);
}

int32_t libc_psp_sce_mpeg_query_stream_offset(int32_t handle, void* buffer, void* offset) {
    return (int32_t)sceMpegQueryStreamOffset(handle, buffer, offset);
}

int32_t libc_psp_sce_mpeg_query_stream_size(void* buffer, void* size) {
    return (int32_t)sceMpegQueryStreamSize(buffer, size);
}

int32_t libc_psp_sce_mpeg_regist_stream(int32_t handle, int32_t stream_id, int32_t unk) {
    return (int32_t)sceMpegRegistStream(handle, stream_id, unk);
}

void libc_psp_sce_mpeg_un_regist_stream(int32_t handle, int32_t stream) {
    sceMpegUnRegistStream(handle, stream);
}

int32_t libc_psp_sce_mpeg_flush_all_stream(int32_t handle) {
    return (int32_t)sceMpegFlushAllStream(handle);
}

void* libc_psp_sce_mpeg_malloc_avc_es_buf(int32_t handle) {
    return (void*)sceMpegMallocAvcEsBuf(handle);
}

void libc_psp_sce_mpeg_free_avc_es_buf(int32_t handle, void* buf) {
    sceMpegFreeAvcEsBuf(handle, buf);
}

int32_t libc_psp_sce_mpeg_query_atrac_es_size(int32_t handle, void* es_size, void* out_size) {
    return (int32_t)sceMpegQueryAtracEsSize(handle, es_size, out_size);
}

int32_t libc_psp_sce_mpeg_init_au(int32_t handle, void* es_buffer, void* au) {
    return (int32_t)sceMpegInitAu(handle, es_buffer, au);
}

int32_t libc_psp_sce_mpeg_get_avc_au(int32_t handle, int32_t stream, void* au, void* unk) {
    return (int32_t)sceMpegGetAvcAu(handle, stream, au, unk);
}

int32_t libc_psp_sce_mpeg_avc_decode_mode(int32_t handle, void* mode) {
    return (int32_t)sceMpegAvcDecodeMode(handle, mode);
}

int32_t libc_psp_sce_mpeg_avc_decode(int32_t handle, void* au, int32_t iframe_width, void* buffer, void* init) {
    return (int32_t)sceMpegAvcDecode(handle, au, iframe_width, buffer, init);
}

int32_t libc_psp_sce_mpeg_avc_decode_stop(int32_t handle, int32_t frame_width, void* buffer, void* status) {
    return (int32_t)sceMpegAvcDecodeStop(handle, frame_width, buffer, status);
}

int32_t libc_psp_sce_mpeg_get_atrac_au(int32_t handle, int32_t stream, void* au, void* unk) {
    return (int32_t)sceMpegGetAtracAu(handle, stream, au, unk);
}

int32_t libc_psp_sce_mpeg_atrac_decode(int32_t handle, void* au, void* buffer, int32_t init) {
    return (int32_t)sceMpegAtracDecode(handle, au, buffer, init);
}

int32_t libc_psp_sce_mpeg_base_ycr_cb_copy_vme(void* yuv_buffer, void* buffer, int32_t type_) {
    return (int32_t)sceMpegBaseYCrCbCopyVme(yuv_buffer, buffer, type_);
}

int32_t libc_psp_sce_mpeg_base_csc_init(int32_t width) {
    return (int32_t)sceMpegBaseCscInit(width);
}

int32_t libc_psp_sce_mpeg_base_csc_vme(void* rgb_buffer, void* rgb_buffer2, int32_t width, void* y_cr_cb_buffer) {
    return (int32_t)sceMpegBaseCscVme(rgb_buffer, rgb_buffer2, width, y_cr_cb_buffer);
}

int32_t libc_psp_sce_mpegbase_bea18f91(void* lli) {
    return (int32_t)sceMpegbase_BEA18F91(lli);
}

int32_t libc_psp_sce_hprm_peek_current_key(void* key) {
    return (int32_t)sceHprmPeekCurrentKey(key);
}

int32_t libc_psp_sce_hprm_peek_latch(void* latch) {
    return (int32_t)sceHprmPeekLatch(latch);
}

int32_t libc_psp_sce_hprm_read_latch(void* latch) {
    return (int32_t)sceHprmReadLatch(latch);
}

int32_t libc_psp_sce_hprm_is_headphone_exist(void) {
    return (int32_t)sceHprmIsHeadphoneExist();
}

int32_t libc_psp_sce_hprm_is_remote_exist(void) {
    return (int32_t)sceHprmIsRemoteExist();
}

int32_t libc_psp_sce_hprm_is_microphone_exist(void) {
    return (int32_t)sceHprmIsMicrophoneExist();
}

void libc_psp_sce_gu_depth_buffer(void* zbp, int32_t zbw) {
    sceGuDepthBuffer(zbp, zbw);
}

void libc_psp_sce_gu_disp_buffer(int32_t width, int32_t height, void* dispbp, int32_t dispbw) {
    sceGuDispBuffer(width, height, dispbp, dispbw);
}

void libc_psp_sce_gu_draw_buffer(int32_t psm, void* fbp, int32_t fbw) {
    sceGuDrawBuffer(psm, fbp, fbw);
}

void libc_psp_sce_gu_draw_buffer_list(int32_t psm, void* fbp, int32_t fbw) {
    sceGuDrawBufferList(psm, fbp, fbw);
}

bool libc_psp_sce_gu_display(bool state) {
    return (bool)sceGuDisplay(state);
}

void libc_psp_sce_gu_depth_func(void* function) {
    sceGuDepthFunc(function);
}

void libc_psp_sce_gu_depth_mask(int32_t mask) {
    sceGuDepthMask(mask);
}

void libc_psp_sce_gu_depth_offset(int32_t offset) {
    sceGuDepthOffset(offset);
}

void libc_psp_sce_gu_depth_range(int32_t near, int32_t far) {
    sceGuDepthRange(near, far);
}

void libc_psp_sce_gu_fog(float near, float far, uint32_t color) {
    sceGuFog(near, far, color);
}

void libc_psp_sce_gu_init(void) {
    sceGuInit();
}

void libc_psp_sce_gu_term(void) {
    sceGuTerm();
}

void libc_psp_sce_gu_break(int32_t mode) {
    sceGuBreak(mode);
}

void libc_psp_sce_gu_continue(void) {
    sceGuContinue();
}

int32_t libc_psp_sce_gu_set_callback(int32_t signal, void* callback) {
    return (int32_t)sceGuSetCallback(signal, callback);
}

void libc_psp_sce_gu_signal(int32_t behavior, int32_t signal) {
    sceGuSignal(behavior, signal);
}

void libc_psp_sce_gu_send_commandf(int32_t cmd, float argument) {
    sceGuSendCommandf(cmd, argument);
}

void libc_psp_sce_gu_send_commandi(int32_t cmd, int32_t argument) {
    sceGuSendCommandi(cmd, argument);
}

void* libc_psp_sce_gu_get_memory(int32_t size) {
    return (void*)sceGuGetMemory(size);
}

void libc_psp_sce_gu_start(int32_t context_type, void* list) {
    sceGuStart(context_type, list);
}

int32_t libc_psp_sce_gu_finish(void) {
    return (int32_t)sceGuFinish();
}

int32_t libc_psp_sce_gu_finish_id(uint32_t id) {
    return (int32_t)sceGuFinishId(id);
}

void libc_psp_sce_gu_call_list(void* list) {
    sceGuCallList(list);
}

void libc_psp_sce_gu_call_mode(int32_t mode) {
    sceGuCallMode(mode);
}

int32_t libc_psp_sce_gu_check_list(void) {
    return (int32_t)sceGuCheckList();
}

void libc_psp_sce_gu_send_list(int32_t mode, void* list, void* context) {
    sceGuSendList(mode, list, context);
}

void* libc_psp_sce_gu_swap_buffers(void) {
    return (void*)sceGuSwapBuffers();
}

int32_t libc_psp_sce_gu_sync(int32_t mode, int32_t behavior) {
    return (int32_t)sceGuSync(mode, behavior);
}

void libc_psp_sce_gu_draw_array(int32_t prim, int32_t vtype, int32_t count, void* indices, void* vertices) {
    sceGuDrawArray(prim, vtype, count, indices, vertices);
}

void libc_psp_sce_gu_begin_object(int32_t vtype, int32_t count, void* indices, void* vertices) {
    sceGuBeginObject(vtype, count, indices, vertices);
}

void libc_psp_sce_gu_end_object(void) {
    sceGuEndObject();
}

void libc_psp_sce_gu_set_status(int32_t state, int32_t status) {
    sceGuSetStatus(state, status);
}

bool libc_psp_sce_gu_get_status(int32_t state) {
    return (bool)sceGuGetStatus(state);
}

void libc_psp_sce_gu_set_all_status(int32_t status) {
    sceGuSetAllStatus(status);
}

int32_t libc_psp_sce_gu_get_all_status(void) {
    return (int32_t)sceGuGetAllStatus();
}

void libc_psp_sce_gu_enable(int32_t state) {
    sceGuEnable(state);
}

void libc_psp_sce_gu_disable(int32_t state) {
    sceGuDisable(state);
}

void libc_psp_sce_gu_light(int32_t light, int32_t type_, int32_t components, int32_t position) {
    sceGuLight(light, type_, components, position);
}

void libc_psp_sce_gu_light_att(int32_t light, float atten0, float atten1, float atten2) {
    sceGuLightAtt(light, atten0, atten1, atten2);
}

void libc_psp_sce_gu_light_color(int32_t light, int32_t component, uint32_t color) {
    sceGuLightColor(light, component, color);
}

void libc_psp_sce_gu_light_mode(int32_t mode) {
    sceGuLightMode(mode);
}

void libc_psp_sce_gu_light_spot(int32_t light, int32_t direction, float exponent, float cutoff) {
    sceGuLightSpot(light, direction, exponent, cutoff);
}

void libc_psp_sce_gu_clear(int32_t flags) {
    sceGuClear(flags);
}

void libc_psp_sce_gu_clear_color(uint32_t color) {
    sceGuClearColor(color);
}

void libc_psp_sce_gu_clear_depth(uint32_t depth) {
    sceGuClearDepth(depth);
}

void libc_psp_sce_gu_clear_stencil(uint32_t stencil) {
    sceGuClearStencil(stencil);
}

void libc_psp_sce_gu_pixel_mask(uint32_t mask) {
    sceGuPixelMask(mask);
}

void libc_psp_sce_gu_color(uint32_t color) {
    sceGuColor(color);
}

void libc_psp_sce_gu_color_func(int32_t func, uint32_t color, uint32_t mask) {
    sceGuColorFunc(func, color, mask);
}

void libc_psp_sce_gu_color_material(int32_t components) {
    sceGuColorMaterial(components);
}

void libc_psp_sce_gu_alpha_func(int32_t func, int32_t value, int32_t mask) {
    sceGuAlphaFunc(func, value, mask);
}

void libc_psp_sce_gu_ambient(uint32_t color) {
    sceGuAmbient(color);
}

void libc_psp_sce_gu_ambient_color(uint32_t color) {
    sceGuAmbientColor(color);
}

void libc_psp_sce_gu_blend_func(int32_t op, int32_t src, int32_t dest, uint32_t src_fix, uint32_t dest_fix) {
    sceGuBlendFunc(op, src, dest, src_fix, dest_fix);
}

void libc_psp_sce_gu_material(int32_t components, uint32_t color) {
    sceGuMaterial(components, color);
}

void libc_psp_sce_gu_model_color(uint32_t emissive, uint32_t ambient, uint32_t diffuse, uint32_t specular) {
    sceGuModelColor(emissive, ambient, diffuse, specular);
}

void libc_psp_sce_gu_stencil_func(int32_t func, int32_t ref_, int32_t mask) {
    sceGuStencilFunc(func, ref_, mask);
}

void libc_psp_sce_gu_stencil_op(int32_t fail, int32_t zfail, int32_t zpass) {
    sceGuStencilOp(fail, zfail, zpass);
}

void libc_psp_sce_gu_specular(float power) {
    sceGuSpecular(power);
}

void libc_psp_sce_gu_front_face(int32_t order) {
    sceGuFrontFace(order);
}

void libc_psp_sce_gu_logical_op(int32_t op) {
    sceGuLogicalOp(op);
}

void libc_psp_sce_gu_set_dither(int32_t matrix) {
    sceGuSetDither(matrix);
}

void libc_psp_sce_gu_shade_model(int32_t mode) {
    sceGuShadeModel(mode);
}

void libc_psp_sce_gu_copy_image(int32_t psm, int32_t sx, int32_t sy, int32_t width, int32_t height, int32_t srcw, void* src, int32_t dx, int32_t dy, int32_t destw, void* dest) {
    sceGuCopyImage(psm, sx, sy, width, height, srcw, src, dx, dy, destw, dest);
}

void libc_psp_sce_gu_tex_env_color(uint32_t color) {
    sceGuTexEnvColor(color);
}

void libc_psp_sce_gu_tex_filter(int32_t min, int32_t mag) {
    sceGuTexFilter(min, mag);
}

void libc_psp_sce_gu_tex_flush(void) {
    sceGuTexFlush();
}

void libc_psp_sce_gu_tex_func(int32_t tfx, int32_t tcc) {
    sceGuTexFunc(tfx, tcc);
}

void libc_psp_sce_gu_tex_image(int32_t mipmap, int32_t width, int32_t height, int32_t tbw, void* tbp) {
    sceGuTexImage(mipmap, width, height, tbw, tbp);
}

void libc_psp_sce_gu_tex_level_mode(int32_t mode, float bias) {
    sceGuTexLevelMode(mode, bias);
}

void libc_psp_sce_gu_tex_map_mode(int32_t mode, uint32_t a1, uint32_t a2) {
    sceGuTexMapMode(mode, a1, a2);
}

void libc_psp_sce_gu_tex_mode(int32_t tpsm, int32_t maxmips, int32_t a2, int32_t swizzle) {
    sceGuTexMode(tpsm, maxmips, a2, swizzle);
}

void libc_psp_sce_gu_tex_offset(float u, float v) {
    sceGuTexOffset(u, v);
}

void libc_psp_sce_gu_tex_proj_map_mode(int32_t mode) {
    sceGuTexProjMapMode(mode);
}

void libc_psp_sce_gu_tex_scale(float u, float v) {
    sceGuTexScale(u, v);
}

void libc_psp_sce_gu_tex_slope(float slope) {
    sceGuTexSlope(slope);
}

void libc_psp_sce_gu_tex_sync(void) {
    sceGuTexSync();
}

void libc_psp_sce_gu_tex_wrap(int32_t u, int32_t v) {
    sceGuTexWrap(u, v);
}

void libc_psp_sce_gu_clut_load(int32_t num_blocks, void* cbp) {
    sceGuClutLoad(num_blocks, cbp);
}

void libc_psp_sce_gu_clut_mode(int32_t cpsm, uint32_t shift, uint32_t mask, uint32_t a3) {
    sceGuClutMode(cpsm, shift, mask, a3);
}

void libc_psp_sce_gu_offset(uint32_t x, uint32_t y) {
    sceGuOffset(x, y);
}

void libc_psp_sce_gu_scissor(int32_t x, int32_t y, int32_t w, int32_t h) {
    sceGuScissor(x, y, w, h);
}

void libc_psp_sce_gu_viewport(int32_t cx, int32_t cy, int32_t width, int32_t height) {
    sceGuViewport(cx, cy, width, height);
}

void libc_psp_sce_gu_draw_bezier(int32_t v_type, int32_t u_count, int32_t v_count, void* indices, void* vertices) {
    sceGuDrawBezier(v_type, u_count, v_count, indices, vertices);
}

void libc_psp_sce_gu_patch_divide(uint32_t ulevel, uint32_t vlevel) {
    sceGuPatchDivide(ulevel, vlevel);
}

void libc_psp_sce_gu_patch_front_face(uint32_t a0) {
    sceGuPatchFrontFace(a0);
}

void libc_psp_sce_gu_patch_prim(int32_t prim) {
    sceGuPatchPrim(prim);
}

void libc_psp_sce_gu_draw_spline(int32_t v_type, int32_t u_count, int32_t v_count, int32_t u_edge, int32_t v_edge, void* indices, void* vertices) {
    sceGuDrawSpline(v_type, u_count, v_count, u_edge, v_edge, indices, vertices);
}

void libc_psp_sce_gu_set_matrix(int32_t type_, int32_t matrix) {
    sceGuSetMatrix(type_, matrix);
}

void libc_psp_sce_gu_bone_matrix(uint32_t index, int32_t matrix) {
    sceGuBoneMatrix(index, matrix);
}

void libc_psp_sce_gu_morph_weight(int32_t index, float weight) {
    sceGuMorphWeight(index, weight);
}

void libc_psp_sce_gu_draw_array_n(int32_t primitive_type, int32_t v_type, int32_t count, int32_t a3, void* indices, void* vertices) {
    sceGuDrawArrayN(primitive_type, v_type, count, a3, indices, vertices);
}

void libc_psp_sce_gum_draw_array(int32_t prim, int32_t v_type, int32_t count, void* indices, void* vertices) {
    sceGumDrawArray(prim, v_type, count, indices, vertices);
}

void libc_psp_sce_gum_draw_array_n(int32_t prim, int32_t v_type, int32_t count, int32_t a3, void* indices, void* vertices) {
    sceGumDrawArrayN(prim, v_type, count, a3, indices, vertices);
}

void libc_psp_sce_gum_draw_bezier(int32_t v_type, int32_t u_count, int32_t v_count, void* indices, void* vertices) {
    sceGumDrawBezier(v_type, u_count, v_count, indices, vertices);
}

void libc_psp_sce_gum_draw_spline(int32_t v_type, int32_t u_count, int32_t v_count, int32_t u_edge, int32_t v_edge, void* indices, void* vertices) {
    sceGumDrawSpline(v_type, u_count, v_count, u_edge, v_edge, indices, vertices);
}

void libc_psp_sce_gum_fast_inverse(void) {
    sceGumFastInverse();
}

void libc_psp_sce_gum_full_inverse(void) {
    sceGumFullInverse();
}

void libc_psp_sce_gum_load_identity(void) {
    sceGumLoadIdentity();
}

void libc_psp_sce_gum_load_matrix(int32_t m) {
    sceGumLoadMatrix(m);
}

void libc_psp_sce_gum_look_at(int32_t eye, int32_t center, int32_t up) {
    sceGumLookAt(eye, center, up);
}

void libc_psp_sce_gum_matrix_mode(int32_t mode) {
    sceGumMatrixMode(mode);
}

void libc_psp_sce_gum_mult_matrix(int32_t m) {
    sceGumMultMatrix(m);
}

void libc_psp_sce_gum_ortho(float left, float right, float bottom, float top, float near, float far) {
    sceGumOrtho(left, right, bottom, top, near, far);
}

void libc_psp_sce_gum_perspective(float fovy, float aspect, float near, float far) {
    sceGumPerspective(fovy, aspect, near, far);
}

void libc_psp_sce_gum_pop_matrix(void) {
    sceGumPopMatrix();
}

void libc_psp_sce_gum_push_matrix(void) {
    sceGumPushMatrix();
}

void libc_psp_sce_gum_rotate_x(float angle) {
    sceGumRotateX(angle);
}

void libc_psp_sce_gum_rotate_y(float angle) {
    sceGumRotateY(angle);
}

void libc_psp_sce_gum_rotate_z(float angle) {
    sceGumRotateZ(angle);
}

void libc_psp_sce_gum_rotate_xyz(int32_t v) {
    sceGumRotateXYZ(v);
}

void libc_psp_sce_gum_rotate_zyx(int32_t v) {
    sceGumRotateZYX(v);
}

void libc_psp_sce_gum_scale(int32_t v) {
    sceGumScale(v);
}

void libc_psp_sce_gum_store_matrix(int32_t m) {
    sceGumStoreMatrix(m);
}

void libc_psp_sce_gum_translate(int32_t v) {
    sceGumTranslate(v);
}

void libc_psp_sce_gum_update_matrix(void) {
    sceGumUpdateMatrix();
}

int32_t libc_psp_sce_mp3reserve_mp3handle(void* args) {
    return (int32_t)sceMp3ReserveMp3Handle(args);
}

int32_t libc_psp_sce_mp3release_mp3handle(int32_t handle) {
    return (int32_t)sceMp3ReleaseMp3Handle(handle);
}

int32_t libc_psp_sce_mp3init_resource(void) {
    return (int32_t)sceMp3InitResource();
}

int32_t libc_psp_sce_mp3term_resource(void) {
    return (int32_t)sceMp3TermResource();
}

int32_t libc_psp_sce_mp3init(int32_t handle) {
    return (int32_t)sceMp3Init(handle);
}

int32_t libc_psp_sce_mp3decode(int32_t handle, void* dst) {
    return (int32_t)sceMp3Decode(handle, dst);
}

int32_t libc_psp_sce_mp3get_info_to_add_stream_data(int32_t handle, void* dst, void* to_write, void* src_pos) {
    return (int32_t)sceMp3GetInfoToAddStreamData(handle, dst, to_write, src_pos);
}

int32_t libc_psp_sce_mp3notify_add_stream_data(int32_t handle, int32_t size) {
    return (int32_t)sceMp3NotifyAddStreamData(handle, size);
}

int32_t libc_psp_sce_mp3check_stream_data_needed(int32_t handle) {
    return (int32_t)sceMp3CheckStreamDataNeeded(handle);
}

int32_t libc_psp_sce_mp3set_loop_num(int32_t handle, int32_t loop_) {
    return (int32_t)sceMp3SetLoopNum(handle, loop_);
}

int32_t libc_psp_sce_mp3get_loop_num(int32_t handle) {
    return (int32_t)sceMp3GetLoopNum(handle);
}

int32_t libc_psp_sce_mp3get_sum_decoded_sample(int32_t handle) {
    return (int32_t)sceMp3GetSumDecodedSample(handle);
}

int32_t libc_psp_sce_mp3get_max_output_sample(int32_t handle) {
    return (int32_t)sceMp3GetMaxOutputSample(handle);
}

int32_t libc_psp_sce_mp3get_sampling_rate(int32_t handle) {
    return (int32_t)sceMp3GetSamplingRate(handle);
}

int32_t libc_psp_sce_mp3get_bit_rate(int32_t handle) {
    return (int32_t)sceMp3GetBitRate(handle);
}

int32_t libc_psp_sce_mp3get_mp3channel_num(int32_t handle) {
    return (int32_t)sceMp3GetMp3ChannelNum(handle);
}

int32_t libc_psp_sce_mp3reset_play_position(int32_t handle) {
    return (int32_t)sceMp3ResetPlayPosition(handle);
}

int32_t libc_psp_sce_reg_open_registry(void* reg, int32_t mode, void* handle) {
    return (int32_t)sceRegOpenRegistry(reg, mode, handle);
}

int32_t libc_psp_sce_reg_flush_registry(int32_t handle) {
    return (int32_t)sceRegFlushRegistry(handle);
}

int32_t libc_psp_sce_reg_close_registry(int32_t handle) {
    return (int32_t)sceRegCloseRegistry(handle);
}

int32_t libc_psp_sce_reg_open_category(int32_t handle, void* name, int32_t mode, void* dir_handle) {
    return (int32_t)sceRegOpenCategory(handle, name, mode, dir_handle);
}

int32_t libc_psp_sce_reg_remove_category(int32_t handle, void* name) {
    return (int32_t)sceRegRemoveCategory(handle, name);
}

int32_t libc_psp_sce_reg_close_category(int32_t dir_handle) {
    return (int32_t)sceRegCloseCategory(dir_handle);
}

int32_t libc_psp_sce_reg_flush_category(int32_t dir_handle) {
    return (int32_t)sceRegFlushCategory(dir_handle);
}

int32_t libc_psp_sce_reg_get_key_info(int32_t dir_handle, void* name, void* key_handle, void* type_, void* size) {
    return (int32_t)sceRegGetKeyInfo(dir_handle, name, key_handle, type_, size);
}

int32_t libc_psp_sce_reg_get_key_info_by_name(int32_t dir_handle, void* name, void* type_, void* size) {
    return (int32_t)sceRegGetKeyInfoByName(dir_handle, name, type_, size);
}

int32_t libc_psp_sce_reg_get_key_value(int32_t dir_handle, int32_t key_handle, void* buf, uint64_t size) {
    return (int32_t)sceRegGetKeyValue(dir_handle, key_handle, buf, size);
}

int32_t libc_psp_sce_reg_get_key_value_by_name(int32_t dir_handle, void* name, void* buf, uint64_t size) {
    return (int32_t)sceRegGetKeyValueByName(dir_handle, name, buf, size);
}

int32_t libc_psp_sce_reg_set_key_value(int32_t dir_handle, void* name, void* buf, uint64_t size) {
    return (int32_t)sceRegSetKeyValue(dir_handle, name, buf, size);
}

int32_t libc_psp_sce_reg_get_keys_num(int32_t dir_handle, void* num) {
    return (int32_t)sceRegGetKeysNum(dir_handle, num);
}

int32_t libc_psp_sce_reg_get_keys(int32_t dir_handle, void* buf, int32_t num) {
    return (int32_t)sceRegGetKeys(dir_handle, buf, num);
}

int32_t libc_psp_sce_reg_create_key(int32_t dir_handle, void* name, int32_t type_, uint64_t size) {
    return (int32_t)sceRegCreateKey(dir_handle, name, type_, size);
}

int32_t libc_psp_sce_reg_remove_registry(void* key) {
    return (int32_t)sceRegRemoveRegistry(key);
}

int32_t libc_psp_sce_open_psidget_open_psid(void* openpsid) {
    return (int32_t)sceOpenPSIDGetOpenPSID(openpsid);
}

int32_t libc_psp_sce_utility_msg_dialog_init_start(void* params) {
    return (int32_t)sceUtilityMsgDialogInitStart(params);
}

void libc_psp_sce_utility_msg_dialog_shutdown_start(void) {
    sceUtilityMsgDialogShutdownStart();
}

int32_t libc_psp_sce_utility_msg_dialog_get_status(void) {
    return (int32_t)sceUtilityMsgDialogGetStatus();
}

void libc_psp_sce_utility_msg_dialog_update(int32_t n) {
    sceUtilityMsgDialogUpdate(n);
}

int32_t libc_psp_sce_utility_msg_dialog_abort(void) {
    return (int32_t)sceUtilityMsgDialogAbort();
}

int32_t libc_psp_sce_utility_netconf_init_start(void* data) {
    return (int32_t)sceUtilityNetconfInitStart(data);
}

int32_t libc_psp_sce_utility_netconf_shutdown_start(void) {
    return (int32_t)sceUtilityNetconfShutdownStart();
}

int32_t libc_psp_sce_utility_netconf_update(int32_t unknown) {
    return (int32_t)sceUtilityNetconfUpdate(unknown);
}

int32_t libc_psp_sce_utility_netconf_get_status(void) {
    return (int32_t)sceUtilityNetconfGetStatus();
}

int32_t libc_psp_sce_utility_check_net_param(int32_t id) {
    return (int32_t)sceUtilityCheckNetParam(id);
}

int32_t libc_psp_sce_utility_get_net_param(int32_t conf, int32_t param, void* data) {
    return (int32_t)sceUtilityGetNetParam(conf, param, data);
}

int32_t libc_psp_sce_utility_savedata_init_start(void* params) {
    return (int32_t)sceUtilitySavedataInitStart(params);
}

int32_t libc_psp_sce_utility_savedata_get_status(void) {
    return (int32_t)sceUtilitySavedataGetStatus();
}

int32_t libc_psp_sce_utility_savedata_shutdown_start(void) {
    return (int32_t)sceUtilitySavedataShutdownStart();
}

void libc_psp_sce_utility_savedata_update(int32_t unknown) {
    sceUtilitySavedataUpdate(unknown);
}

int32_t libc_psp_sce_utility_game_sharing_init_start(void* params) {
    return (int32_t)sceUtilityGameSharingInitStart(params);
}

void libc_psp_sce_utility_game_sharing_shutdown_start(void) {
    sceUtilityGameSharingShutdownStart();
}

int32_t libc_psp_sce_utility_game_sharing_get_status(void) {
    return (int32_t)sceUtilityGameSharingGetStatus();
}

void libc_psp_sce_utility_game_sharing_update(int32_t n) {
    sceUtilityGameSharingUpdate(n);
}

int32_t libc_psp_sce_utility_html_viewer_init_start(void* params) {
    return (int32_t)sceUtilityHtmlViewerInitStart(params);
}

int32_t libc_psp_sce_utility_html_viewer_shutdown_start(void) {
    return (int32_t)sceUtilityHtmlViewerShutdownStart();
}

int32_t libc_psp_sce_utility_html_viewer_update(int32_t n) {
    return (int32_t)sceUtilityHtmlViewerUpdate(n);
}

int32_t libc_psp_sce_utility_html_viewer_get_status(void) {
    return (int32_t)sceUtilityHtmlViewerGetStatus();
}

int32_t libc_psp_sce_utility_set_system_param_int(int32_t id, int32_t value) {
    return (int32_t)sceUtilitySetSystemParamInt(id, value);
}

int32_t libc_psp_sce_utility_set_system_param_string(int32_t id, void* str) {
    return (int32_t)sceUtilitySetSystemParamString(id, str);
}

int32_t libc_psp_sce_utility_get_system_param_int(int32_t id, void* value) {
    return (int32_t)sceUtilityGetSystemParamInt(id, value);
}

int32_t libc_psp_sce_utility_get_system_param_string(int32_t id, void* str, int32_t len) {
    return (int32_t)sceUtilityGetSystemParamString(id, str, len);
}

int32_t libc_psp_sce_utility_osk_init_start(void* params) {
    return (int32_t)sceUtilityOskInitStart(params);
}

int32_t libc_psp_sce_utility_osk_shutdown_start(void) {
    return (int32_t)sceUtilityOskShutdownStart();
}

int32_t libc_psp_sce_utility_osk_update(int32_t n) {
    return (int32_t)sceUtilityOskUpdate(n);
}

int32_t libc_psp_sce_utility_osk_get_status(void) {
    return (int32_t)sceUtilityOskGetStatus();
}

int32_t libc_psp_sce_utility_load_net_module(int32_t module) {
    return (int32_t)sceUtilityLoadNetModule(module);
}

int32_t libc_psp_sce_utility_unload_net_module(int32_t module) {
    return (int32_t)sceUtilityUnloadNetModule(module);
}

int32_t libc_psp_sce_utility_load_av_module(int32_t module) {
    return (int32_t)sceUtilityLoadAvModule(module);
}

int32_t libc_psp_sce_utility_unload_av_module(int32_t module) {
    return (int32_t)sceUtilityUnloadAvModule(module);
}

int32_t libc_psp_sce_utility_load_usb_module(int32_t module) {
    return (int32_t)sceUtilityLoadUsbModule(module);
}

int32_t libc_psp_sce_utility_unload_usb_module(int32_t module) {
    return (int32_t)sceUtilityUnloadUsbModule(module);
}

int32_t libc_psp_sce_utility_load_module(int32_t module) {
    return (int32_t)sceUtilityLoadModule(module);
}

int32_t libc_psp_sce_utility_unload_module(int32_t module) {
    return (int32_t)sceUtilityUnloadModule(module);
}

int32_t libc_psp_sce_utility_create_net_param(int32_t conf) {
    return (int32_t)sceUtilityCreateNetParam(conf);
}

int32_t libc_psp_sce_utility_set_net_param(int32_t param, void* val) {
    return (int32_t)sceUtilitySetNetParam(param, val);
}

int32_t libc_psp_sce_utility_copy_net_param(int32_t src, int32_t dest) {
    return (int32_t)sceUtilityCopyNetParam(src, dest);
}

int32_t libc_psp_sce_utility_delete_net_param(int32_t conf) {
    return (int32_t)sceUtilityDeleteNetParam(conf);
}

int32_t libc_psp_sce_net_init(int32_t poolsize, int32_t calloutprio, int32_t calloutstack, int32_t netintrprio, int32_t netintrstack) {
    return (int32_t)sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack);
}

int32_t libc_psp_sce_net_term(void) {
    return (int32_t)sceNetTerm();
}

int32_t libc_psp_sce_net_free_threadinfo(int32_t thid) {
    return (int32_t)sceNetFreeThreadinfo(thid);
}

int32_t libc_psp_sce_net_thread_abort(int32_t thid) {
    return (int32_t)sceNetThreadAbort(thid);
}

void libc_psp_sce_net_ether_strton(void* name, void* mac) {
    sceNetEtherStrton(name, mac);
}

void libc_psp_sce_net_ether_ntostr(void* mac, void* name) {
    sceNetEtherNtostr(mac, name);
}

int32_t libc_psp_sce_net_get_local_ether_addr(void* mac) {
    return (int32_t)sceNetGetLocalEtherAddr(mac);
}

int32_t libc_psp_sce_net_get_malloc_stat(void* stat) {
    return (int32_t)sceNetGetMallocStat(stat);
}

int32_t libc_psp_sce_net_adhocctl_init(int32_t stacksize, int32_t priority, void* adhoc_id) {
    return (int32_t)sceNetAdhocctlInit(stacksize, priority, adhoc_id);
}

int32_t libc_psp_sce_net_adhocctl_term(void) {
    return (int32_t)sceNetAdhocctlTerm();
}

int32_t libc_psp_sce_net_adhocctl_connect(void* name) {
    return (int32_t)sceNetAdhocctlConnect(name);
}

int32_t libc_psp_sce_net_adhocctl_disconnect(void) {
    return (int32_t)sceNetAdhocctlDisconnect();
}

int32_t libc_psp_sce_net_adhocctl_get_state(void* event) {
    return (int32_t)sceNetAdhocctlGetState(event);
}

int32_t libc_psp_sce_net_adhocctl_create(void* name) {
    return (int32_t)sceNetAdhocctlCreate(name);
}

int32_t libc_psp_sce_net_adhocctl_join(void* scaninfo) {
    return (int32_t)sceNetAdhocctlJoin(scaninfo);
}

int32_t libc_psp_sce_net_adhocctl_get_adhoc_id(void* id) {
    return (int32_t)sceNetAdhocctlGetAdhocId(id);
}

int32_t libc_psp_sce_net_adhocctl_create_enter_game_mode(void* name, int32_t unknown, int32_t num, void* macs, uint32_t timeout, int32_t unknown2) {
    return (int32_t)sceNetAdhocctlCreateEnterGameMode(name, unknown, num, macs, timeout, unknown2);
}

int32_t libc_psp_sce_net_adhocctl_join_enter_game_mode(void* name, void* hostmac, uint32_t timeout, int32_t unknown) {
    return (int32_t)sceNetAdhocctlJoinEnterGameMode(name, hostmac, timeout, unknown);
}

int32_t libc_psp_sce_net_adhocctl_get_game_mode_info(void* gamemodeinfo) {
    return (int32_t)sceNetAdhocctlGetGameModeInfo(gamemodeinfo);
}

int32_t libc_psp_sce_net_adhocctl_exit_game_mode(void) {
    return (int32_t)sceNetAdhocctlExitGameMode();
}

int32_t libc_psp_sce_net_adhocctl_get_peer_list(void* length, void* buf) {
    return (int32_t)sceNetAdhocctlGetPeerList(length, buf);
}

int32_t libc_psp_sce_net_adhocctl_get_peer_info(void* mac, int32_t size, void* peerinfo) {
    return (int32_t)sceNetAdhocctlGetPeerInfo(mac, size, peerinfo);
}

int32_t libc_psp_sce_net_adhocctl_scan(void) {
    return (int32_t)sceNetAdhocctlScan();
}

int32_t libc_psp_sce_net_adhocctl_get_scan_info(void* length, void* buf) {
    return (int32_t)sceNetAdhocctlGetScanInfo(length, buf);
}

int32_t libc_psp_sce_net_adhocctl_add_handler(int32_t handler, void* unknown) {
    return (int32_t)sceNetAdhocctlAddHandler(handler, unknown);
}

int32_t libc_psp_sce_net_adhocctl_del_handler(int32_t id) {
    return (int32_t)sceNetAdhocctlDelHandler(id);
}

int32_t libc_psp_sce_net_adhocctl_get_name_by_addr(void* mac, void* nickname) {
    return (int32_t)sceNetAdhocctlGetNameByAddr(mac, nickname);
}

int32_t libc_psp_sce_net_adhocctl_get_addr_by_name(void* nickname, void* length, void* buf) {
    return (int32_t)sceNetAdhocctlGetAddrByName(nickname, length, buf);
}

int32_t libc_psp_sce_net_adhocctl_get_parameter(void* params) {
    return (int32_t)sceNetAdhocctlGetParameter(params);
}

int32_t libc_psp_sce_net_adhoc_init(void) {
    return (int32_t)sceNetAdhocInit();
}

int32_t libc_psp_sce_net_adhoc_term(void) {
    return (int32_t)sceNetAdhocTerm();
}

int32_t libc_psp_sce_net_adhoc_pdp_create(void* mac, uint16_t port, uint32_t buf_size, int32_t unk1) {
    return (int32_t)sceNetAdhocPdpCreate(mac, port, buf_size, unk1);
}

int32_t libc_psp_sce_net_adhoc_pdp_delete(int32_t id, int32_t unk1) {
    return (int32_t)sceNetAdhocPdpDelete(id, unk1);
}

int32_t libc_psp_sce_net_adhoc_pdp_send(int32_t id, void* dest_mac_addr, uint16_t port, void* data, uint32_t len, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPdpSend(id, dest_mac_addr, port, data, len, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_pdp_recv(int32_t id, void* src_mac_addr, void* port, void* data, void* data_length, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPdpRecv(id, src_mac_addr, port, data, data_length, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_get_pdp_stat(void* size, void* stat) {
    return (int32_t)sceNetAdhocGetPdpStat(size, stat);
}

int32_t libc_psp_sce_net_adhoc_game_mode_create_master(void* data, int32_t size) {
    return (int32_t)sceNetAdhocGameModeCreateMaster(data, size);
}

int32_t libc_psp_sce_net_adhoc_game_mode_create_replica(void* mac, void* data, int32_t size) {
    return (int32_t)sceNetAdhocGameModeCreateReplica(mac, data, size);
}

int32_t libc_psp_sce_net_adhoc_game_mode_update_master(void) {
    return (int32_t)sceNetAdhocGameModeUpdateMaster();
}

int32_t libc_psp_sce_net_adhoc_game_mode_update_replica(int32_t id, int32_t unk1) {
    return (int32_t)sceNetAdhocGameModeUpdateReplica(id, unk1);
}

int32_t libc_psp_sce_net_adhoc_game_mode_delete_master(void) {
    return (int32_t)sceNetAdhocGameModeDeleteMaster();
}

int32_t libc_psp_sce_net_adhoc_game_mode_delete_replica(int32_t id) {
    return (int32_t)sceNetAdhocGameModeDeleteReplica(id);
}

int32_t libc_psp_sce_net_adhoc_ptp_open(void* srcmac, uint16_t srcport, void* destmac, uint16_t destport, uint32_t buf_size, uint32_t delay, int32_t count, int32_t unk1) {
    return (int32_t)sceNetAdhocPtpOpen(srcmac, srcport, destmac, destport, buf_size, delay, count, unk1);
}

int32_t libc_psp_sce_net_adhoc_ptp_connect(int32_t id, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPtpConnect(id, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_ptp_listen(void* srcmac, uint16_t srcport, uint32_t buf_size, uint32_t delay, int32_t count, int32_t queue, int32_t unk1) {
    return (int32_t)sceNetAdhocPtpListen(srcmac, srcport, buf_size, delay, count, queue, unk1);
}

int32_t libc_psp_sce_net_adhoc_ptp_accept(int32_t id, void* mac, void* port, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPtpAccept(id, mac, port, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_ptp_send(int32_t id, void* data, void* data_size, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPtpSend(id, data, data_size, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_ptp_recv(int32_t id, void* data, void* data_size, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPtpRecv(id, data, data_size, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_ptp_flush(int32_t id, uint32_t timeout, int32_t nonblock) {
    return (int32_t)sceNetAdhocPtpFlush(id, timeout, nonblock);
}

int32_t libc_psp_sce_net_adhoc_ptp_close(int32_t id, int32_t unk1) {
    return (int32_t)sceNetAdhocPtpClose(id, unk1);
}

int32_t libc_psp_sce_net_adhoc_get_ptp_stat(void* size, void* stat) {
    return (int32_t)sceNetAdhocGetPtpStat(size, stat);
}

int32_t libc_psp_sce_net_adhoc_matching_init(int32_t memsize) {
    return (int32_t)sceNetAdhocMatchingInit(memsize);
}

int32_t libc_psp_sce_net_adhoc_matching_term(void) {
    return (int32_t)sceNetAdhocMatchingTerm();
}

int32_t libc_psp_sce_net_adhoc_matching_create(int32_t mode, int32_t max_peers, uint16_t port, int32_t buf_size, uint32_t hello_delay, uint32_t ping_delay, int32_t init_count, uint32_t msg_delay, void* callback) {
    return (int32_t)sceNetAdhocMatchingCreate(mode, max_peers, port, buf_size, hello_delay, ping_delay, init_count, msg_delay, callback);
}

int32_t libc_psp_sce_net_adhoc_matching_delete(int32_t matching_id) {
    return (int32_t)sceNetAdhocMatchingDelete(matching_id);
}

int32_t libc_psp_sce_net_adhoc_matching_start(int32_t matching_id, int32_t evth_pri, int32_t evth_stack, int32_t inth_pri, int32_t inth_stack, int32_t opt_len, void* opt_data) {
    return (int32_t)sceNetAdhocMatchingStart(matching_id, evth_pri, evth_stack, inth_pri, inth_stack, opt_len, opt_data);
}

int32_t libc_psp_sce_net_adhoc_matching_stop(int32_t matching_id) {
    return (int32_t)sceNetAdhocMatchingStop(matching_id);
}

int32_t libc_psp_sce_net_adhoc_matching_select_target(int32_t matching_id, void* mac, int32_t opt_len, void* opt_data) {
    return (int32_t)sceNetAdhocMatchingSelectTarget(matching_id, mac, opt_len, opt_data);
}

int32_t libc_psp_sce_net_adhoc_matching_cancel_target(int32_t matching_id, void* mac) {
    return (int32_t)sceNetAdhocMatchingCancelTarget(matching_id, mac);
}

int32_t libc_psp_sce_net_adhoc_matching_cancel_target_with_opt(int32_t matching_id, void* mac, int32_t opt_len, void* opt_data) {
    return (int32_t)sceNetAdhocMatchingCancelTargetWithOpt(matching_id, mac, opt_len, opt_data);
}

int32_t libc_psp_sce_net_adhoc_matching_send_data(int32_t matching_id, void* mac, int32_t data_len, void* data) {
    return (int32_t)sceNetAdhocMatchingSendData(matching_id, mac, data_len, data);
}

int32_t libc_psp_sce_net_adhoc_matching_abort_send_data(int32_t matching_id, void* mac) {
    return (int32_t)sceNetAdhocMatchingAbortSendData(matching_id, mac);
}

int32_t libc_psp_sce_net_adhoc_matching_set_hello_opt(int32_t matching_id, int32_t opt_len, void* opt_data) {
    return (int32_t)sceNetAdhocMatchingSetHelloOpt(matching_id, opt_len, opt_data);
}

int32_t libc_psp_sce_net_adhoc_matching_get_hello_opt(int32_t matching_id, void* opt_len, void* opt_data) {
    return (int32_t)sceNetAdhocMatchingGetHelloOpt(matching_id, opt_len, opt_data);
}

int32_t libc_psp_sce_net_adhoc_matching_get_members(int32_t matching_id, void* length, void* buf) {
    return (int32_t)sceNetAdhocMatchingGetMembers(matching_id, length, buf);
}

int32_t libc_psp_sce_net_adhoc_matching_get_pool_max_alloc(void) {
    return (int32_t)sceNetAdhocMatchingGetPoolMaxAlloc();
}

int32_t libc_psp_sce_net_adhoc_matching_get_pool_stat(void* poolstat) {
    return (int32_t)sceNetAdhocMatchingGetPoolStat(poolstat);
}

int32_t libc_psp_sce_net_apctl_init(int32_t stack_size, int32_t init_priority) {
    return (int32_t)sceNetApctlInit(stack_size, init_priority);
}

int32_t libc_psp_sce_net_apctl_term(void) {
    return (int32_t)sceNetApctlTerm();
}

int32_t libc_psp_sce_net_apctl_get_info(int32_t code, void* pinfo) {
    return (int32_t)sceNetApctlGetInfo(code, pinfo);
}

int32_t libc_psp_sce_net_apctl_add_handler(int32_t handler, void* parg) {
    return (int32_t)sceNetApctlAddHandler(handler, parg);
}

int32_t libc_psp_sce_net_apctl_del_handler(int32_t handler_id) {
    return (int32_t)sceNetApctlDelHandler(handler_id);
}

int32_t libc_psp_sce_net_apctl_connect(int32_t conn_index) {
    return (int32_t)sceNetApctlConnect(conn_index);
}

int32_t libc_psp_sce_net_apctl_disconnect(void) {
    return (int32_t)sceNetApctlDisconnect();
}

int32_t libc_psp_sce_net_apctl_get_state(void* pstate) {
    return (int32_t)sceNetApctlGetState(pstate);
}

int32_t libc_psp_sce_net_inet_init(void) {
    return (int32_t)sceNetInetInit();
}

int32_t libc_psp_sce_net_inet_term(void) {
    return (int32_t)sceNetInetTerm();
}

int32_t libc_psp_sce_net_inet_accept(int32_t s, void* addr, void* addr_len) {
    return (int32_t)sceNetInetAccept(s, addr, addr_len);
}

int32_t libc_psp_sce_net_inet_bind(int32_t s, void* my_addr, uint32_t addr_len) {
    return (int32_t)sceNetInetBind(s, my_addr, addr_len);
}

int32_t libc_psp_sce_net_inet_connect(int32_t s, void* serv_addr, uint32_t addr_len) {
    return (int32_t)sceNetInetConnect(s, serv_addr, addr_len);
}

int32_t libc_psp_sce_net_inet_getsockopt(int32_t s, int32_t level, int32_t opt_name, void* opt_val, void* optl_en) {
    return (int32_t)sceNetInetGetsockopt(s, level, opt_name, opt_val, optl_en);
}

int32_t libc_psp_sce_net_inet_listen(int32_t s, int32_t backlog) {
    return (int32_t)sceNetInetListen(s, backlog);
}

uint64_t libc_psp_sce_net_inet_recv(int32_t s, void* buf, uint64_t len, int32_t flags) {
    return (uint64_t)sceNetInetRecv(s, buf, len, flags);
}

uint64_t libc_psp_sce_net_inet_recvfrom(int32_t s, void* buf, uint64_t flags, int32_t arg1, void* from, void* from_len) {
    return (uint64_t)sceNetInetRecvfrom(s, buf, flags, arg1, from, from_len);
}

uint64_t libc_psp_sce_net_inet_send(int32_t s, void* buf, uint64_t len, int32_t flags) {
    return (uint64_t)sceNetInetSend(s, buf, len, flags);
}

uint64_t libc_psp_sce_net_inet_sendto(int32_t s, void* buf, uint64_t len, int32_t flags, void* to, uint32_t to_len) {
    return (uint64_t)sceNetInetSendto(s, buf, len, flags, to, to_len);
}

int32_t libc_psp_sce_net_inet_setsockopt(int32_t s, int32_t level, int32_t opt_name, void* opt_val, uint32_t opt_len) {
    return (int32_t)sceNetInetSetsockopt(s, level, opt_name, opt_val, opt_len);
}

int32_t libc_psp_sce_net_inet_shutdown(int32_t s, int32_t how) {
    return (int32_t)sceNetInetShutdown(s, how);
}

int32_t libc_psp_sce_net_inet_socket(int32_t domain, int32_t type_, int32_t protocol) {
    return (int32_t)sceNetInetSocket(domain, type_, protocol);
}

int32_t libc_psp_sce_net_inet_close(int32_t s) {
    return (int32_t)sceNetInetClose(s);
}

int32_t libc_psp_sce_net_inet_get_errno(void) {
    return (int32_t)sceNetInetGetErrno();
}

int32_t libc_psp_sce_ssl_init(int32_t unknown1) {
    return (int32_t)sceSslInit(unknown1);
}

int32_t libc_psp_sce_ssl_end(void) {
    return (int32_t)sceSslEnd();
}

int32_t libc_psp_sce_ssl_get_used_memory_max(void* memory) {
    return (int32_t)sceSslGetUsedMemoryMax(memory);
}

int32_t libc_psp_sce_ssl_get_used_memory_current(void* memory) {
    return (int32_t)sceSslGetUsedMemoryCurrent(memory);
}

int32_t libc_psp_sce_http_init(uint32_t unknown1) {
    return (int32_t)sceHttpInit(unknown1);
}

int32_t libc_psp_sce_http_end(void) {
    return (int32_t)sceHttpEnd();
}

int32_t libc_psp_sce_http_create_template(void* agent, int32_t unknown1, int32_t unknown2) {
    return (int32_t)sceHttpCreateTemplate(agent, unknown1, unknown2);
}

int32_t libc_psp_sce_http_delete_template(int32_t templateid) {
    return (int32_t)sceHttpDeleteTemplate(templateid);
}

int32_t libc_psp_sce_http_create_connection(int32_t templateid, void* host, void* unknown1, uint16_t port, int32_t unknown2) {
    return (int32_t)sceHttpCreateConnection(templateid, host, unknown1, port, unknown2);
}

int32_t libc_psp_sce_http_create_connection_with_url(int32_t templateid, void* url, int32_t unknown1) {
    return (int32_t)sceHttpCreateConnectionWithURL(templateid, url, unknown1);
}

int32_t libc_psp_sce_http_delete_connection(int32_t connection_id) {
    return (int32_t)sceHttpDeleteConnection(connection_id);
}

int32_t libc_psp_sce_http_create_request(int32_t connection_id, int32_t method, void* path, uint64_t content_length) {
    return (int32_t)sceHttpCreateRequest(connection_id, method, path, content_length);
}

int32_t libc_psp_sce_http_create_request_with_url(int32_t connection_id, int32_t method, void* url, uint64_t content_length) {
    return (int32_t)sceHttpCreateRequestWithURL(connection_id, method, url, content_length);
}

int32_t libc_psp_sce_http_delete_request(int32_t request_id) {
    return (int32_t)sceHttpDeleteRequest(request_id);
}

int32_t libc_psp_sce_http_send_request(int32_t request_id, void* data, uint32_t data_size) {
    return (int32_t)sceHttpSendRequest(request_id, data, data_size);
}

int32_t libc_psp_sce_http_abort_request(int32_t request_id) {
    return (int32_t)sceHttpAbortRequest(request_id);
}

int32_t libc_psp_sce_http_read_data(int32_t request_id, void* data, uint32_t data_size) {
    return (int32_t)sceHttpReadData(request_id, data, data_size);
}

int32_t libc_psp_sce_http_get_content_length(int32_t request_id, void* content_length) {
    return (int32_t)sceHttpGetContentLength(request_id, content_length);
}

int32_t libc_psp_sce_http_get_status_code(int32_t request_id, void* status_code) {
    return (int32_t)sceHttpGetStatusCode(request_id, status_code);
}

int32_t libc_psp_sce_http_set_resolve_time_out(int32_t id, uint32_t timeout) {
    return (int32_t)sceHttpSetResolveTimeOut(id, timeout);
}

int32_t libc_psp_sce_http_set_resolve_retry(int32_t id, int32_t count) {
    return (int32_t)sceHttpSetResolveRetry(id, count);
}

int32_t libc_psp_sce_http_set_connect_time_out(int32_t id, uint32_t timeout) {
    return (int32_t)sceHttpSetConnectTimeOut(id, timeout);
}

int32_t libc_psp_sce_http_set_send_time_out(int32_t id, uint32_t timeout) {
    return (int32_t)sceHttpSetSendTimeOut(id, timeout);
}

int32_t libc_psp_sce_http_set_recv_time_out(int32_t id, uint32_t timeout) {
    return (int32_t)sceHttpSetRecvTimeOut(id, timeout);
}

int32_t libc_psp_sce_http_enable_keep_alive(int32_t id) {
    return (int32_t)sceHttpEnableKeepAlive(id);
}

int32_t libc_psp_sce_http_disable_keep_alive(int32_t id) {
    return (int32_t)sceHttpDisableKeepAlive(id);
}

int32_t libc_psp_sce_http_enable_redirect(int32_t id) {
    return (int32_t)sceHttpEnableRedirect(id);
}

int32_t libc_psp_sce_http_disable_redirect(int32_t id) {
    return (int32_t)sceHttpDisableRedirect(id);
}

int32_t libc_psp_sce_http_enable_cookie(int32_t id) {
    return (int32_t)sceHttpEnableCookie(id);
}

int32_t libc_psp_sce_http_disable_cookie(int32_t id) {
    return (int32_t)sceHttpDisableCookie(id);
}

int32_t libc_psp_sce_http_save_system_cookie(void) {
    return (int32_t)sceHttpSaveSystemCookie();
}

int32_t libc_psp_sce_http_load_system_cookie(void) {
    return (int32_t)sceHttpLoadSystemCookie();
}

int32_t libc_psp_sce_http_add_extra_header(int32_t id, void* name, void* value, int32_t unknown1) {
    return (int32_t)sceHttpAddExtraHeader(id, name, value, unknown1);
}

int32_t libc_psp_sce_http_delete_header(int32_t id, void* name) {
    return (int32_t)sceHttpDeleteHeader(id, name);
}

int32_t libc_psp_sce_https_init(int32_t unknown1, int32_t unknown2, int32_t unknown3, int32_t unknown4) {
    return (int32_t)sceHttpsInit(unknown1, unknown2, unknown3, unknown4);
}

int32_t libc_psp_sce_https_end(void) {
    return (int32_t)sceHttpsEnd();
}

int32_t libc_psp_sce_https_load_default_cert(int32_t unknown1, int32_t unknown2) {
    return (int32_t)sceHttpsLoadDefaultCert(unknown1, unknown2);
}

int32_t libc_psp_sce_http_disable_auth(int32_t id) {
    return (int32_t)sceHttpDisableAuth(id);
}

int32_t libc_psp_sce_http_disable_cache(int32_t id) {
    return (int32_t)sceHttpDisableCache(id);
}

int32_t libc_psp_sce_http_enable_auth(int32_t id) {
    return (int32_t)sceHttpEnableAuth(id);
}

int32_t libc_psp_sce_http_enable_cache(int32_t id) {
    return (int32_t)sceHttpEnableCache(id);
}

int32_t libc_psp_sce_http_end_cache(void) {
    return (int32_t)sceHttpEndCache();
}

int32_t libc_psp_sce_http_get_all_header(int32_t request, void* header, void* header_size) {
    return (int32_t)sceHttpGetAllHeader(request, header, header_size);
}

int32_t libc_psp_sce_http_get_network_errno(int32_t request, void* err_num) {
    return (int32_t)sceHttpGetNetworkErrno(request, err_num);
}

int32_t libc_psp_sce_http_get_proxy(int32_t id, void* activate_flag, void* mode, void* proxy_host, uint64_t len, void* proxy_port) {
    return (int32_t)sceHttpGetProxy(id, activate_flag, mode, proxy_host, len, proxy_port);
}

int32_t libc_psp_sce_http_init_cache(uint64_t max_size) {
    return (int32_t)sceHttpInitCache(max_size);
}

int32_t libc_psp_sce_http_set_auth_info_cb(int32_t id, int32_t cbfunc) {
    return (int32_t)sceHttpSetAuthInfoCB(id, cbfunc);
}

int32_t libc_psp_sce_http_set_proxy(int32_t id, int32_t activate_flag, int32_t mode, void* new_proxy_host, uint16_t new_proxy_port) {
    return (int32_t)sceHttpSetProxy(id, activate_flag, mode, new_proxy_host, new_proxy_port);
}

int32_t libc_psp_sce_http_set_res_header_max_size(int32_t id, uint32_t header_size) {
    return (int32_t)sceHttpSetResHeaderMaxSize(id, header_size);
}

int32_t libc_psp_sce_http_set_malloc_function(int32_t malloc_func, int32_t free_func, int32_t realloc_func) {
    return (int32_t)sceHttpSetMallocFunction(malloc_func, free_func, realloc_func);
}

int32_t libc_psp_sce_net_resolver_init(void) {
    return (int32_t)sceNetResolverInit();
}

int32_t libc_psp_sce_net_resolver_create(void* rid, void* buf, uint32_t buf_length) {
    return (int32_t)sceNetResolverCreate(rid, buf, buf_length);
}

int32_t libc_psp_sce_net_resolver_delete(int32_t rid) {
    return (int32_t)sceNetResolverDelete(rid);
}

int32_t libc_psp_sce_net_resolver_start_nto_a(int32_t rid, void* hostname, void* addr, uint32_t timeout, int32_t retry) {
    return (int32_t)sceNetResolverStartNtoA(rid, hostname, addr, timeout, retry);
}

int32_t libc_psp_sce_net_resolver_start_ato_n(int32_t rid, void* addr, void* hostname, uint32_t hostname_len, uint32_t timeout, int32_t retry) {
    return (int32_t)sceNetResolverStartAtoN(rid, addr, hostname, hostname_len, timeout, retry);
}

int32_t libc_psp_sce_net_resolver_stop(int32_t rid) {
    return (int32_t)sceNetResolverStop(rid);
}

int32_t libc_psp_sce_net_resolver_term(void) {
    return (int32_t)sceNetResolverTerm();
}

