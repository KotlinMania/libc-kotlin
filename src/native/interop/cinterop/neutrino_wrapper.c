#include "neutrino_wrapper.h"
#include <errno.h>

int32_t libc_neutrino_channel_create(uint32_t __flags) {
    return (int32_t)ChannelCreate(__flags);
}

int32_t libc_neutrino_channel_create_r(uint32_t __flags) {
    return (int32_t)ChannelCreate_r(__flags);
}

int32_t libc_neutrino_channel_create_pulse_pool(uint32_t __flags, void* __config) {
    return (int32_t)ChannelCreatePulsePool(__flags, __config);
}

int32_t libc_neutrino_channel_create_ext(uint32_t __flags, uint32_t __mode, uint64_t __bufsize, uint32_t __maxnumbuf, void* __ev, void* __cred) {
    return (int32_t)ChannelCreateExt(__flags, __mode, __bufsize, __maxnumbuf, __ev, __cred);
}

int32_t libc_neutrino_channel_destroy(int32_t __chid) {
    return (int32_t)ChannelDestroy(__chid);
}

int32_t libc_neutrino_channel_destroy_r(int32_t __chid) {
    return (int32_t)ChannelDestroy_r(__chid);
}

int32_t libc_neutrino_connect_attach(uint32_t __nd, int32_t __pid, int32_t __chid, uint32_t __index, int32_t __flags) {
    return (int32_t)ConnectAttach(__nd, __pid, __chid, __index, __flags);
}

int32_t libc_neutrino_connect_attach_r(uint32_t __nd, int32_t __pid, int32_t __chid, uint32_t __index, int32_t __flags) {
    return (int32_t)ConnectAttach_r(__nd, __pid, __chid, __index, __flags);
}

int32_t libc_neutrino_connect_detach(int32_t __coid) {
    return (int32_t)ConnectDetach(__coid);
}

int32_t libc_neutrino_connect_detach_r(int32_t __coid) {
    return (int32_t)ConnectDetach_r(__coid);
}

int32_t libc_neutrino_connect_server_info(int32_t __pid, int32_t __coid, void* __info) {
    return (int32_t)ConnectServerInfo(__pid, __coid, __info);
}

int32_t libc_neutrino_connect_server_info_r(int32_t __pid, int32_t __coid, void* __info) {
    return (int32_t)ConnectServerInfo_r(__pid, __coid, __info);
}

int32_t libc_neutrino_connect_client_info_extra_args(int32_t __scoid, void* __info_pp, int32_t __ngroups, void* __abilities, int32_t __nable, void* __type_id) {
    return (int32_t)ConnectClientInfoExtraArgs(__scoid, __info_pp, __ngroups, __abilities, __nable, __type_id);
}

int32_t libc_neutrino_connect_client_info_extra_args_r(int32_t __scoid, void* __info_pp, int32_t __ngroups, void* __abilities, int32_t __nable, void* __type_id) {
    return (int32_t)ConnectClientInfoExtraArgs_r(__scoid, __info_pp, __ngroups, __abilities, __nable, __type_id);
}

int32_t libc_neutrino_connect_client_info(int32_t __scoid, void* __info, int32_t __ngroups) {
    return (int32_t)ConnectClientInfo(__scoid, __info, __ngroups);
}

int32_t libc_neutrino_connect_client_info_r(int32_t __scoid, void* __info, int32_t __ngroups) {
    return (int32_t)ConnectClientInfo_r(__scoid, __info, __ngroups);
}

int32_t libc_neutrino_connect_client_info_ext(int32_t __scoid, void* __info_pp, int32_t flags) {
    return (int32_t)ConnectClientInfoExt(__scoid, __info_pp, flags);
}

int32_t libc_neutrino_client_info_ext_free(void* __info_pp) {
    return (int32_t)ClientInfoExtFree(__info_pp);
}

int32_t libc_neutrino_connect_client_info_able(int32_t __scoid, void* __info_pp, int32_t flags, void* abilities, int32_t nable) {
    return (int32_t)ConnectClientInfoAble(__scoid, __info_pp, flags, abilities, nable);
}

int32_t libc_neutrino_connect_flags(int32_t __pid, int32_t __coid, uint32_t __mask, uint32_t __bits) {
    return (int32_t)ConnectFlags(__pid, __coid, __mask, __bits);
}

int32_t libc_neutrino_connect_flags_r(int32_t __pid, int32_t __coid, uint32_t __mask, uint32_t __bits) {
    return (int32_t)ConnectFlags_r(__pid, __coid, __mask, __bits);
}

int32_t libc_neutrino_channel_connect_attr(uint32_t __id, void* __old_attr, void* __new_attr, uint32_t __flags) {
    return (int32_t)ChannelConnectAttr(__id, __old_attr, __new_attr, __flags);
}

int64_t libc_neutrino_msg_send(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSend(__coid, __smsg, __sbytes, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_send_r(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSend_r(__coid, __smsg, __sbytes, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendnc(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendnc(__coid, __smsg, __sbytes, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendnc_r(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendnc_r(__coid, __smsg, __sbytes, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendsv(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendsv(__coid, __smsg, __sbytes, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendsv_r(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendsv_r(__coid, __smsg, __sbytes, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendsvnc(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendsvnc(__coid, __smsg, __sbytes, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendsvnc_r(int32_t __coid, void* __smsg, uint64_t __sbytes, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendsvnc_r(__coid, __smsg, __sbytes, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendvs(int32_t __coid, void* __siov, uint64_t __sparts, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendvs(__coid, __siov, __sparts, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendvs_r(int32_t __coid, void* __siov, uint64_t __sparts, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendvs_r(__coid, __siov, __sparts, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendvsnc(int32_t __coid, void* __siov, uint64_t __sparts, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendvsnc(__coid, __siov, __sparts, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendvsnc_r(int32_t __coid, void* __siov, uint64_t __sparts, void* __rmsg, uint64_t __rbytes) {
    return (int64_t)MsgSendvsnc_r(__coid, __siov, __sparts, __rmsg, __rbytes);
}

int64_t libc_neutrino_msg_sendv(int32_t __coid, void* __siov, uint64_t __sparts, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendv(__coid, __siov, __sparts, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendv_r(int32_t __coid, void* __siov, uint64_t __sparts, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendv_r(__coid, __siov, __sparts, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendvnc(int32_t __coid, void* __siov, uint64_t __sparts, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendvnc(__coid, __siov, __sparts, __riov, __rparts);
}

int64_t libc_neutrino_msg_sendvnc_r(int32_t __coid, void* __siov, uint64_t __sparts, void* __riov, uint64_t __rparts) {
    return (int64_t)MsgSendvnc_r(__coid, __siov, __sparts, __riov, __rparts);
}

int32_t libc_neutrino_msg_receive(int32_t __chid, void* __msg, uint64_t __bytes, void* __info) {
    return (int32_t)MsgReceive(__chid, __msg, __bytes, __info);
}

int32_t libc_neutrino_msg_receive_r(int32_t __chid, void* __msg, uint64_t __bytes, void* __info) {
    return (int32_t)MsgReceive_r(__chid, __msg, __bytes, __info);
}

int32_t libc_neutrino_msg_receivev(int32_t __chid, void* __iov, uint64_t __parts, void* __info) {
    return (int32_t)MsgReceivev(__chid, __iov, __parts, __info);
}

int32_t libc_neutrino_msg_receivev_r(int32_t __chid, void* __iov, uint64_t __parts, void* __info) {
    return (int32_t)MsgReceivev_r(__chid, __iov, __parts, __info);
}

int32_t libc_neutrino_msg_receive_pulse(int32_t __chid, void* __pulse, uint64_t __bytes, void* __info) {
    return (int32_t)MsgReceivePulse(__chid, __pulse, __bytes, __info);
}

int32_t libc_neutrino_msg_receive_pulse_r(int32_t __chid, void* __pulse, uint64_t __bytes, void* __info) {
    return (int32_t)MsgReceivePulse_r(__chid, __pulse, __bytes, __info);
}

int32_t libc_neutrino_msg_receive_pulsev(int32_t __chid, void* __iov, uint64_t __parts, void* __info) {
    return (int32_t)MsgReceivePulsev(__chid, __iov, __parts, __info);
}

int32_t libc_neutrino_msg_receive_pulsev_r(int32_t __chid, void* __iov, uint64_t __parts, void* __info) {
    return (int32_t)MsgReceivePulsev_r(__chid, __iov, __parts, __info);
}

int32_t libc_neutrino_msg_reply(int32_t __rcvid, int64_t __status, void* __msg, uint64_t __bytes) {
    return (int32_t)MsgReply(__rcvid, __status, __msg, __bytes);
}

int32_t libc_neutrino_msg_reply_r(int32_t __rcvid, int64_t __status, void* __msg, uint64_t __bytes) {
    return (int32_t)MsgReply_r(__rcvid, __status, __msg, __bytes);
}

int32_t libc_neutrino_msg_replyv(int32_t __rcvid, int64_t __status, void* __iov, uint64_t __parts) {
    return (int32_t)MsgReplyv(__rcvid, __status, __iov, __parts);
}

int32_t libc_neutrino_msg_replyv_r(int32_t __rcvid, int64_t __status, void* __iov, uint64_t __parts) {
    return (int32_t)MsgReplyv_r(__rcvid, __status, __iov, __parts);
}

int64_t libc_neutrino_msg_readiov(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset, int32_t __flags) {
    return (int64_t)MsgReadiov(__rcvid, __iov, __parts, __offset, __flags);
}

int64_t libc_neutrino_msg_readiov_r(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset, int32_t __flags) {
    return (int64_t)MsgReadiov_r(__rcvid, __iov, __parts, __offset, __flags);
}

int64_t libc_neutrino_msg_read(int32_t __rcvid, void* __msg, uint64_t __bytes, uint64_t __offset) {
    return (int64_t)MsgRead(__rcvid, __msg, __bytes, __offset);
}

int64_t libc_neutrino_msg_read_r(int32_t __rcvid, void* __msg, uint64_t __bytes, uint64_t __offset) {
    return (int64_t)MsgRead_r(__rcvid, __msg, __bytes, __offset);
}

int64_t libc_neutrino_msg_readv(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset) {
    return (int64_t)MsgReadv(__rcvid, __iov, __parts, __offset);
}

int64_t libc_neutrino_msg_readv_r(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset) {
    return (int64_t)MsgReadv_r(__rcvid, __iov, __parts, __offset);
}

int64_t libc_neutrino_msg_write(int32_t __rcvid, void* __msg, uint64_t __bytes, uint64_t __offset) {
    return (int64_t)MsgWrite(__rcvid, __msg, __bytes, __offset);
}

int64_t libc_neutrino_msg_write_r(int32_t __rcvid, void* __msg, uint64_t __bytes, uint64_t __offset) {
    return (int64_t)MsgWrite_r(__rcvid, __msg, __bytes, __offset);
}

int64_t libc_neutrino_msg_writev(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset) {
    return (int64_t)MsgWritev(__rcvid, __iov, __parts, __offset);
}

int64_t libc_neutrino_msg_writev_r(int32_t __rcvid, void* __iov, uint64_t __parts, uint64_t __offset) {
    return (int64_t)MsgWritev_r(__rcvid, __iov, __parts, __offset);
}

int32_t libc_neutrino_msg_send_pulse(int32_t __coid, int32_t __priority, int32_t __code, int32_t __value) {
    return (int32_t)MsgSendPulse(__coid, __priority, __code, __value);
}

int32_t libc_neutrino_msg_send_pulse_r(int32_t __coid, int32_t __priority, int32_t __code, int32_t __value) {
    return (int32_t)MsgSendPulse_r(__coid, __priority, __code, __value);
}

int32_t libc_neutrino_msg_send_pulse_ptr(int32_t __coid, int32_t __priority, int32_t __code, void* __value) {
    return (int32_t)MsgSendPulsePtr(__coid, __priority, __code, __value);
}

int32_t libc_neutrino_msg_send_pulse_ptr_r(int32_t __coid, int32_t __priority, int32_t __code, void* __value) {
    return (int32_t)MsgSendPulsePtr_r(__coid, __priority, __code, __value);
}

int32_t libc_neutrino_msg_deliver_event(int32_t __rcvid, void* __event) {
    return (int32_t)MsgDeliverEvent(__rcvid, __event);
}

int32_t libc_neutrino_msg_deliver_event_r(int32_t __rcvid, void* __event) {
    return (int32_t)MsgDeliverEvent_r(__rcvid, __event);
}

int32_t libc_neutrino_msg_verify_event(int32_t __rcvid, void* __event) {
    return (int32_t)MsgVerifyEvent(__rcvid, __event);
}

int32_t libc_neutrino_msg_verify_event_r(int32_t __rcvid, void* __event) {
    return (int32_t)MsgVerifyEvent_r(__rcvid, __event);
}

int32_t libc_neutrino_msg_register_event(void* __event, int32_t __coid) {
    return (int32_t)MsgRegisterEvent(__event, __coid);
}

int32_t libc_neutrino_msg_register_event_r(void* __event, int32_t __coid) {
    return (int32_t)MsgRegisterEvent_r(__event, __coid);
}

int32_t libc_neutrino_msg_unregister_event(void* __event) {
    return (int32_t)MsgUnregisterEvent(__event);
}

int32_t libc_neutrino_msg_unregister_event_r(void* __event) {
    return (int32_t)MsgUnregisterEvent_r(__event);
}

int32_t libc_neutrino_msg_info(int32_t __rcvid, void* __info) {
    return (int32_t)MsgInfo(__rcvid, __info);
}

int32_t libc_neutrino_msg_info_r(int32_t __rcvid, void* __info) {
    return (int32_t)MsgInfo_r(__rcvid, __info);
}

int32_t libc_neutrino_msg_key_data(int32_t __rcvid, int32_t __oper, uint32_t __key, void* __newkey, void* __iov, int32_t __parts) {
    return (int32_t)MsgKeyData(__rcvid, __oper, __key, __newkey, __iov, __parts);
}

int32_t libc_neutrino_msg_key_data_r(int32_t __rcvid, int32_t __oper, uint32_t __key, void* __newkey, void* __iov, int32_t __parts) {
    return (int32_t)MsgKeyData_r(__rcvid, __oper, __key, __newkey, __iov, __parts);
}

int32_t libc_neutrino_msg_error(int32_t __rcvid, int32_t __err) {
    return (int32_t)MsgError(__rcvid, __err);
}

int32_t libc_neutrino_msg_error_r(int32_t __rcvid, int32_t __err) {
    return (int32_t)MsgError_r(__rcvid, __err);
}

int32_t libc_neutrino_msg_current(int32_t __rcvid) {
    return (int32_t)MsgCurrent(__rcvid);
}

int32_t libc_neutrino_msg_current_r(int32_t __rcvid) {
    return (int32_t)MsgCurrent_r(__rcvid);
}

int32_t libc_neutrino_msg_send_async_gbl(int32_t __coid, void* __smsg, uint64_t __sbytes, uint32_t __msg_prio) {
    return (int32_t)MsgSendAsyncGbl(__coid, __smsg, __sbytes, __msg_prio);
}

int32_t libc_neutrino_msg_send_async(int32_t __coid) {
    return (int32_t)MsgSendAsync(__coid);
}

int32_t libc_neutrino_msg_receive_async_gbl(int32_t __chid, void* __rmsg, uint64_t __rbytes, void* __info, int32_t __coid) {
    return (int32_t)MsgReceiveAsyncGbl(__chid, __rmsg, __rbytes, __info, __coid);
}

int32_t libc_neutrino_msg_receive_async(int32_t __chid, void* __iov, uint32_t __parts) {
    return (int32_t)MsgReceiveAsync(__chid, __iov, __parts);
}

int32_t libc_neutrino_msg_pause(int32_t __rcvid, uint32_t __cookie) {
    return (int32_t)MsgPause(__rcvid, __cookie);
}

int32_t libc_neutrino_msg_pause_r(int32_t __rcvid, uint32_t __cookie) {
    return (int32_t)MsgPause_r(__rcvid, __cookie);
}

int32_t libc_neutrino_signal_kill(uint32_t __nd, int32_t __pid, int32_t __tid, int32_t __signo, int32_t __code, int32_t __value) {
    return (int32_t)SignalKill(__nd, __pid, __tid, __signo, __code, __value);
}

int32_t libc_neutrino_signal_kill_r(uint32_t __nd, int32_t __pid, int32_t __tid, int32_t __signo, int32_t __code, int32_t __value) {
    return (int32_t)SignalKill_r(__nd, __pid, __tid, __signo, __code, __value);
}

int32_t libc_neutrino_signal_kill_sigval(uint32_t __nd, int32_t __pid, int32_t __tid, int32_t __signo, int32_t __code, void* __value) {
    return (int32_t)SignalKillSigval(__nd, __pid, __tid, __signo, __code, __value);
}

int32_t libc_neutrino_signal_kill_sigval_r(uint32_t __nd, int32_t __pid, int32_t __tid, int32_t __signo, int32_t __code, void* __value) {
    return (int32_t)SignalKillSigval_r(__nd, __pid, __tid, __signo, __code, __value);
}

int32_t libc_neutrino_signal_return(void* __info) {
    return (int32_t)SignalReturn(__info);
}

int32_t libc_neutrino_signal_fault(uint32_t __sigcode, void* __regs, uint64_t __refaddr) {
    return (int32_t)SignalFault(__sigcode, __regs, __refaddr);
}

int32_t libc_neutrino_signal_action(int32_t __pid, int32_t __sigstub, int32_t __signo, void* __act, void* __oact) {
    return (int32_t)SignalAction(__pid, __sigstub, __signo, __act, __oact);
}

int32_t libc_neutrino_signal_action_r(int32_t __pid, int32_t __sigstub, int32_t __signo, void* __act, void* __oact) {
    return (int32_t)SignalAction_r(__pid, __sigstub, __signo, __act, __oact);
}

int32_t libc_neutrino_signal_procmask(int32_t __pid, int32_t __tid, int32_t __how, void* __set, void* __oldset) {
    return (int32_t)SignalProcmask(__pid, __tid, __how, __set, __oldset);
}

int32_t libc_neutrino_signal_procmask_r(int32_t __pid, int32_t __tid, int32_t __how, void* __set, void* __oldset) {
    return (int32_t)SignalProcmask_r(__pid, __tid, __how, __set, __oldset);
}

int32_t libc_neutrino_signal_suspend(void* __set) {
    return (int32_t)SignalSuspend(__set);
}

int32_t libc_neutrino_signal_suspend_r(void* __set) {
    return (int32_t)SignalSuspend_r(__set);
}

int32_t libc_neutrino_signal_waitinfo(void* __set, void* __info) {
    return (int32_t)SignalWaitinfo(__set, __info);
}

int32_t libc_neutrino_signal_waitinfo_r(void* __set, void* __info) {
    return (int32_t)SignalWaitinfo_r(__set, __info);
}

int32_t libc_neutrino_signal_waitinfo_mask(void* __set, void* __info, void* __mask) {
    return (int32_t)SignalWaitinfoMask(__set, __info, __mask);
}

int32_t libc_neutrino_signal_waitinfo_mask_r(void* __set, void* __info, void* __mask) {
    return (int32_t)SignalWaitinfoMask_r(__set, __info, __mask);
}

int32_t libc_neutrino_thread_create(int32_t __pid, int32_t __func, void* __arg, void* __attr) {
    return (int32_t)ThreadCreate(__pid, __func, __arg, __attr);
}

int32_t libc_neutrino_thread_create_r(int32_t __pid, int32_t __func, void* __arg, void* __attr) {
    return (int32_t)ThreadCreate_r(__pid, __func, __arg, __attr);
}

int32_t libc_neutrino_thread_destroy(int32_t __tid, int32_t __priority, void* __status) {
    return (int32_t)ThreadDestroy(__tid, __priority, __status);
}

int32_t libc_neutrino_thread_destroy_r(int32_t __tid, int32_t __priority, void* __status) {
    return (int32_t)ThreadDestroy_r(__tid, __priority, __status);
}

int32_t libc_neutrino_thread_detach(int32_t __tid) {
    return (int32_t)ThreadDetach(__tid);
}

int32_t libc_neutrino_thread_detach_r(int32_t __tid) {
    return (int32_t)ThreadDetach_r(__tid);
}

int32_t libc_neutrino_thread_join(int32_t __tid, void* __status) {
    return (int32_t)ThreadJoin(__tid, __status);
}

int32_t libc_neutrino_thread_join_r(int32_t __tid, void* __status) {
    return (int32_t)ThreadJoin_r(__tid, __status);
}

int32_t libc_neutrino_thread_cancel(int32_t __tid, int32_t __canstub) {
    return (int32_t)ThreadCancel(__tid, __canstub);
}

int32_t libc_neutrino_thread_cancel_r(int32_t __tid, int32_t __canstub) {
    return (int32_t)ThreadCancel_r(__tid, __canstub);
}

int32_t libc_neutrino_thread_ctl(int32_t __cmd, void* __data) {
    return (int32_t)ThreadCtl(__cmd, __data);
}

int32_t libc_neutrino_thread_ctl_r(int32_t __cmd, void* __data) {
    return (int32_t)ThreadCtl_r(__cmd, __data);
}

int32_t libc_neutrino_thread_ctl_ext(int32_t __pid, int32_t __tid, int32_t __cmd, void* __data) {
    return (int32_t)ThreadCtlExt(__pid, __tid, __cmd, __data);
}

int32_t libc_neutrino_thread_ctl_ext_r(int32_t __pid, int32_t __tid, int32_t __cmd, void* __data) {
    return (int32_t)ThreadCtlExt_r(__pid, __tid, __cmd, __data);
}

int32_t libc_neutrino_interrupt_hook_trace(void* __handler, uint32_t __flags) {
    return (int32_t)InterruptHookTrace(__handler, __flags);
}

int32_t libc_neutrino_interrupt_hook_idle(void* __handler, uint32_t __flags) {
    return (int32_t)InterruptHookIdle(__handler, __flags);
}

int32_t libc_neutrino_interrupt_hook_idle2(void* __handler, uint32_t __flags) {
    return (int32_t)InterruptHookIdle2(__handler, __flags);
}

int32_t libc_neutrino_interrupt_hook_overdrive_event(void* __event, uint32_t __flags) {
    return (int32_t)InterruptHookOverdriveEvent(__event, __flags);
}

int32_t libc_neutrino_interrupt_attach_event(int32_t __intr, void* __event, uint32_t __flags) {
    return (int32_t)InterruptAttachEvent(__intr, __event, __flags);
}

int32_t libc_neutrino_interrupt_attach_event_r(int32_t __intr, void* __event, uint32_t __flags) {
    return (int32_t)InterruptAttachEvent_r(__intr, __event, __flags);
}

int32_t libc_neutrino_interrupt_attach(int32_t __intr, void* __handler, void* __area, int32_t __size, uint32_t __flags) {
    return (int32_t)InterruptAttach(__intr, __handler, __area, __size, __flags);
}

int32_t libc_neutrino_interrupt_attach_r(int32_t __intr, void* __handler, void* __area, int32_t __size, uint32_t __flags) {
    return (int32_t)InterruptAttach_r(__intr, __handler, __area, __size, __flags);
}

int32_t libc_neutrino_interrupt_attach_array(int32_t __intr, void* __handler, void* __area, int32_t __size, uint32_t __flags) {
    return (int32_t)InterruptAttachArray(__intr, __handler, __area, __size, __flags);
}

int32_t libc_neutrino_interrupt_attach_array_r(int32_t __intr, void* __handler, void* __area, int32_t __size, uint32_t __flags) {
    return (int32_t)InterruptAttachArray_r(__intr, __handler, __area, __size, __flags);
}

int32_t libc_neutrino_interrupt_detach(int32_t __id) {
    return (int32_t)InterruptDetach(__id);
}

int32_t libc_neutrino_interrupt_detach_r(int32_t __id) {
    return (int32_t)InterruptDetach_r(__id);
}

int32_t libc_neutrino_interrupt_wait(int32_t __flags, void* __timeout) {
    return (int32_t)InterruptWait(__flags, __timeout);
}

int32_t libc_neutrino_interrupt_wait_r(int32_t __flags, void* __timeout) {
    return (int32_t)InterruptWait_r(__flags, __timeout);
}

int32_t libc_neutrino_interrupt_characteristic(int32_t __type, int32_t __id, void* __new, void* __old) {
    return (int32_t)InterruptCharacteristic(__type, __id, __new, __old);
}

int32_t libc_neutrino_interrupt_characteristic_r(int32_t __type, int32_t __id, void* __new, void* __old) {
    return (int32_t)InterruptCharacteristic_r(__type, __id, __new, __old);
}

int32_t libc_neutrino_sched_get(int32_t __pid, int32_t __tid, void* __param) {
    return (int32_t)SchedGet(__pid, __tid, __param);
}

int32_t libc_neutrino_sched_get_r(int32_t __pid, int32_t __tid, void* __param) {
    return (int32_t)SchedGet_r(__pid, __tid, __param);
}

uint32_t libc_neutrino_sched_get_cpu_num(void) {
    return (uint32_t)SchedGetCpuNum();
}

int32_t libc_neutrino_sched_set(int32_t __pid, int32_t __tid, int32_t __algorithm, void* __param) {
    return (int32_t)SchedSet(__pid, __tid, __algorithm, __param);
}

int32_t libc_neutrino_sched_set_r(int32_t __pid, int32_t __tid, int32_t __algorithm, void* __param) {
    return (int32_t)SchedSet_r(__pid, __tid, __algorithm, __param);
}

int32_t libc_neutrino_sched_info(int32_t __pid, int32_t __algorithm, void* __info) {
    return (int32_t)SchedInfo(__pid, __algorithm, __info);
}

int32_t libc_neutrino_sched_info_r(int32_t __pid, int32_t __algorithm, void* __info) {
    return (int32_t)SchedInfo_r(__pid, __algorithm, __info);
}

int32_t libc_neutrino_sched_yield(void) {
    return (int32_t)SchedYield();
}

int32_t libc_neutrino_sched_yield_r(void) {
    return (int32_t)SchedYield_r();
}

int32_t libc_neutrino_sched_ctl(int32_t __cmd, void* __data, uint64_t __length) {
    return (int32_t)SchedCtl(__cmd, __data, __length);
}

int32_t libc_neutrino_sched_ctl_r(int32_t __cmd, void* __data, uint64_t __length) {
    return (int32_t)SchedCtl_r(__cmd, __data, __length);
}

int32_t libc_neutrino_sched_job_create(void* __job) {
    return (int32_t)SchedJobCreate(__job);
}

int32_t libc_neutrino_sched_job_create_r(void* __job) {
    return (int32_t)SchedJobCreate_r(__job);
}

int32_t libc_neutrino_sched_job_destroy(void* __job) {
    return (int32_t)SchedJobDestroy(__job);
}

int32_t libc_neutrino_sched_job_destroy_r(void* __job) {
    return (int32_t)SchedJobDestroy_r(__job);
}

int32_t libc_neutrino_sched_waypoint(void* __job, void* __new, void* __max, void* __old) {
    return (int32_t)SchedWaypoint(__job, __new, __max, __old);
}

int32_t libc_neutrino_sched_waypoint_r(void* __job, void* __new, void* __max, void* __old) {
    return (int32_t)SchedWaypoint_r(__job, __new, __max, __old);
}

int32_t libc_neutrino_timer_create(int32_t __id, void* __notify) {
    return (int32_t)TimerCreate(__id, __notify);
}

int32_t libc_neutrino_timer_create_r(int32_t __id, void* __notify) {
    return (int32_t)TimerCreate_r(__id, __notify);
}

int32_t libc_neutrino_timer_destroy(int32_t __id) {
    return (int32_t)TimerDestroy(__id);
}

int32_t libc_neutrino_timer_destroy_r(int32_t __id) {
    return (int32_t)TimerDestroy_r(__id);
}

int32_t libc_neutrino_timer_settime(int32_t __id, int32_t __flags, void* __itime, void* __oitime) {
    return (int32_t)TimerSettime(__id, __flags, __itime, __oitime);
}

int32_t libc_neutrino_timer_settime_r(int32_t __id, int32_t __flags, void* __itime, void* __oitime) {
    return (int32_t)TimerSettime_r(__id, __flags, __itime, __oitime);
}

int32_t libc_neutrino_timer_info(int32_t __pid, int32_t __id, int32_t __flags, void* __info) {
    return (int32_t)TimerInfo(__pid, __id, __flags, __info);
}

int32_t libc_neutrino_timer_info_r(int32_t __pid, int32_t __id, int32_t __flags, void* __info) {
    return (int32_t)TimerInfo_r(__pid, __id, __flags, __info);
}

int32_t libc_neutrino_timer_alarm(int32_t __id, void* __itime, void* __otime) {
    return (int32_t)TimerAlarm(__id, __itime, __otime);
}

int32_t libc_neutrino_timer_alarm_r(int32_t __id, void* __itime, void* __otime) {
    return (int32_t)TimerAlarm_r(__id, __itime, __otime);
}

int32_t libc_neutrino_timer_timeout(int32_t __id, int32_t __flags, void* __notify, void* __ntime, void* __otime) {
    return (int32_t)TimerTimeout(__id, __flags, __notify, __ntime, __otime);
}

int32_t libc_neutrino_timer_timeout_r(int32_t __id, int32_t __flags, void* __notify, void* __ntime, void* __otime) {
    return (int32_t)TimerTimeout_r(__id, __flags, __notify, __ntime, __otime);
}

int32_t libc_neutrino_sync_type_create(uint32_t __type, void* __sync, void* __attr) {
    return (int32_t)SyncTypeCreate(__type, __sync, __attr);
}

int32_t libc_neutrino_sync_type_create_r(uint32_t __type, void* __sync, void* __attr) {
    return (int32_t)SyncTypeCreate_r(__type, __sync, __attr);
}

int32_t libc_neutrino_sync_destroy(void* __sync) {
    return (int32_t)SyncDestroy(__sync);
}

int32_t libc_neutrino_sync_destroy_r(void* __sync) {
    return (int32_t)SyncDestroy_r(__sync);
}

int32_t libc_neutrino_sync_ctl(int32_t __cmd, void* __sync, void* __data) {
    return (int32_t)SyncCtl(__cmd, __sync, __data);
}

int32_t libc_neutrino_sync_ctl_r(int32_t __cmd, void* __sync, void* __data) {
    return (int32_t)SyncCtl_r(__cmd, __sync, __data);
}

int32_t libc_neutrino_sync_mutex_event(void* __sync, void* event) {
    return (int32_t)SyncMutexEvent(__sync, event);
}

int32_t libc_neutrino_sync_mutex_event_r(void* __sync, void* event) {
    return (int32_t)SyncMutexEvent_r(__sync, event);
}

int32_t libc_neutrino_sync_mutex_lock(void* __sync) {
    return (int32_t)SyncMutexLock(__sync);
}

int32_t libc_neutrino_sync_mutex_lock_r(void* __sync) {
    return (int32_t)SyncMutexLock_r(__sync);
}

int32_t libc_neutrino_sync_mutex_unlock(void* __sync) {
    return (int32_t)SyncMutexUnlock(__sync);
}

int32_t libc_neutrino_sync_mutex_unlock_r(void* __sync) {
    return (int32_t)SyncMutexUnlock_r(__sync);
}

int32_t libc_neutrino_sync_mutex_revive(void* __sync) {
    return (int32_t)SyncMutexRevive(__sync);
}

int32_t libc_neutrino_sync_mutex_revive_r(void* __sync) {
    return (int32_t)SyncMutexRevive_r(__sync);
}

int32_t libc_neutrino_sync_condvar_wait(void* __sync, void* __mutex) {
    return (int32_t)SyncCondvarWait(__sync, __mutex);
}

int32_t libc_neutrino_sync_condvar_wait_r(void* __sync, void* __mutex) {
    return (int32_t)SyncCondvarWait_r(__sync, __mutex);
}

int32_t libc_neutrino_sync_condvar_signal(void* __sync, int32_t __all) {
    return (int32_t)SyncCondvarSignal(__sync, __all);
}

int32_t libc_neutrino_sync_condvar_signal_r(void* __sync, int32_t __all) {
    return (int32_t)SyncCondvarSignal_r(__sync, __all);
}

int32_t libc_neutrino_sync_sem_post(void* __sync) {
    return (int32_t)SyncSemPost(__sync);
}

int32_t libc_neutrino_sync_sem_post_r(void* __sync) {
    return (int32_t)SyncSemPost_r(__sync);
}

int32_t libc_neutrino_sync_sem_wait(void* __sync, int32_t __tryto) {
    return (int32_t)SyncSemWait(__sync, __tryto);
}

int32_t libc_neutrino_sync_sem_wait_r(void* __sync, int32_t __tryto) {
    return (int32_t)SyncSemWait_r(__sync, __tryto);
}

int32_t libc_neutrino_clock_time(int32_t __id, void* _new, void* __old) {
    return (int32_t)ClockTime(__id, _new, __old);
}

int32_t libc_neutrino_clock_time_r(int32_t __id, void* _new, void* __old) {
    return (int32_t)ClockTime_r(__id, _new, __old);
}

int32_t libc_neutrino_clock_adjust(int32_t __id, void* _new, void* __old) {
    return (int32_t)ClockAdjust(__id, _new, __old);
}

int32_t libc_neutrino_clock_adjust_r(int32_t __id, void* _new, void* __old) {
    return (int32_t)ClockAdjust_r(__id, _new, __old);
}

int32_t libc_neutrino_clock_period(int32_t __id, void* _new, void* __old, int32_t __reserved) {
    return (int32_t)ClockPeriod(__id, _new, __old, __reserved);
}

int32_t libc_neutrino_clock_period_r(int32_t __id, void* _new, void* __old, int32_t __reserved) {
    return (int32_t)ClockPeriod_r(__id, _new, __old, __reserved);
}

int32_t libc_neutrino_clock_id(int32_t __pid, int32_t __tid) {
    return (int32_t)ClockId(__pid, __tid);
}

int32_t libc_neutrino_clock_id_r(int32_t __pid, int32_t __tid) {
    return (int32_t)ClockId_r(__pid, __tid);
}

int32_t libc_neutrino_interrupt_mask(int32_t __intr, int32_t __id) {
    return (int32_t)InterruptMask(__intr, __id);
}

int32_t libc_neutrino_interrupt_unmask(int32_t __intr, int32_t __id) {
    return (int32_t)InterruptUnmask(__intr, __id);
}

