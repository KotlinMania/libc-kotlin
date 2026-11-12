@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNtoNeutrinoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelCreate(flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelCreateR(flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelCreatePulsePool(flags: Int, config: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelCreateExt(flags: Int, mode: Int, bufsize: Long, maxnumbuf: Int, ev: Long, cred: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelDestroy(chid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelDestroyR(chid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectAttach(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectAttachR(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectDetach(coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectDetachR(coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectServerInfo(pid: Int, coid: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectServerInfoR(pid: Int, coid: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfoExtraArgs(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfoExtraArgsR(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfo(scoid: Int, info: Long, ngroups: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfoR(scoid: Int, info: Long, ngroups: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfoExt(scoid: Int, infoPp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClientInfoExtFree(infoPp: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectClientInfoAble(scoid: Int, infoPp: Long, flags: Int, abilities: Long, nable: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectFlags(pid: Int, coid: Int, mask: Int, bits: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoConnectFlagsR(pid: Int, coid: Int, mask: Int, bits: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoChannelConnectAttr(id: Int, oldAttr: Long, newAttr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSend(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendnc(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendncR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendsv(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendsvR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendsvnc(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendsvncR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvs(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvsR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvsnc(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvsncR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendv(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvnc(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendvncR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceive(chid: Int, msg: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceiveR(chid: Int, msg: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivev(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivevR(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivePulse(chid: Int, pulse: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivePulseR(chid: Int, pulse: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivePulsev(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceivePulsevR(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReply(rcvid: Int, status: Long, msg: Long, bytes: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReplyR(rcvid: Int, status: Long, msg: Long, bytes: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReplyv(rcvid: Int, status: Long, iov: Long, parts: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReplyvR(rcvid: Int, status: Long, iov: Long, parts: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReadiov(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReadiovR(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgRead(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReadR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReadv(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReadvR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgWrite(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgWriteR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgWritev(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgWritevR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendPulsePtr(coid: Int, priority: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgDeliverEvent(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgDeliverEventR(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgVerifyEvent(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgVerifyEventR(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgRegisterEvent(event: Long, coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgRegisterEventR(event: Long, coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgUnregisterEvent(event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgUnregisterEventR(event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgInfo(rcvid: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgInfoR(rcvid: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgKeyData(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgKeyDataR(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgError(rcvid: Int, err: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgErrorR(rcvid: Int, err: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgCurrent(rcvid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgCurrentR(rcvid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendAsyncGbl(coid: Int, smsg: Long, sbytes: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgSendAsync(coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceiveAsyncGbl(chid: Int, rmsg: Long, rbytes: Long, info: Long, coid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgReceiveAsync(chid: Int, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgPause(rcvid: Int, cookie: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoMsgPauseR(rcvid: Int, cookie: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalKill(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalKillR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalKillSigval(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalKillSigvalR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalReturn(info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalFault(sigcode: Int, regs: Long, refaddr: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalAction(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalActionR(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalProcmask(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalProcmaskR(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalSuspend(set: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalSuspendR(set: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalWaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalWaitinfoR(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalWaitinfoMask(set: Long, info: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSignalWaitinfoMaskR(set: Long, info: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCreate(pid: Int, func: Long, arg: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCreateR(pid: Int, func: Long, arg: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadDestroy(tid: Int, priority: Int, status: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadDestroyR(tid: Int, priority: Int, status: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadDetach(tid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadDetachR(tid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadJoin(tid: Int, status: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadJoinR(tid: Int, status: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCancel(tid: Int, canstub: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCancelR(tid: Int, canstub: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCtl(cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCtlR(cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCtlExt(pid: Int, tid: Int, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoThreadCtlExtR(pid: Int, tid: Int, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptHookTrace(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptHookIdle(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptHookIdle2(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptHookOverdriveEvent(event: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttachEvent(intr: Int, event: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttachEventR(intr: Int, event: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttach(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttachR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttachArray(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptAttachArrayR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptDetach(id: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptDetachR(id: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptWait(flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptWaitR(flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptCharacteristic(type: Int, id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptCharacteristicR(type: Int, id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedGet(pid: Int, tid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedGetR(pid: Int, tid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedGetCpuNum(): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedSet(pid: Int, tid: Int, algorithm: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedSetR(pid: Int, tid: Int, algorithm: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedInfo(pid: Int, algorithm: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedInfoR(pid: Int, algorithm: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedYield(): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedYieldR(): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedCtl(cmd: Int, data: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedCtlR(cmd: Int, data: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedJobCreate(job: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedJobCreateR(job: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedJobDestroy(job: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedJobDestroyR(job: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedWaypoint(job: Long, new: Long, max: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSchedWaypointR(job: Long, new: Long, max: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerCreate(id: Int, notify: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerCreateR(id: Int, notify: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerDestroy(id: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerDestroyR(id: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerSettime(id: Long, flags: Int, itime: Long, oitime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerSettimeR(id: Long, flags: Int, itime: Long, oitime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerInfo(pid: Int, id: Long, flags: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerInfoR(pid: Int, id: Long, flags: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerAlarm(id: Int, itime: Long, otime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerAlarmR(id: Int, itime: Long, otime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerTimeout(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoTimerTimeoutR(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncTypeCreate(type: Int, sync: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncTypeCreateR(type: Int, sync: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncDestroy(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncDestroyR(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCtl(cmd: Int, sync: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCtlR(cmd: Int, sync: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexEvent(sync: Long, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexEventR(sync: Long, event: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexLock(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexLockR(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexUnlock(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexUnlockR(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexRevive(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncMutexReviveR(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCondvarWait(sync: Long, mutex: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCondvarWaitR(sync: Long, mutex: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCondvarSignal(sync: Long, all: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncCondvarSignalR(sync: Long, all: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncSemPost(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncSemPostR(sync: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncSemWait(sync: Long, tryto: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoSyncSemWaitR(sync: Long, tryto: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockTime(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockTimeR(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockAdjust(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockAdjustR(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockPeriod(id: Int, new: Long, old: Long, reserved: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockPeriodR(id: Int, new: Long, old: Long, reserved: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockId(pid: Int, tid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoClockIdR(pid: Int, tid: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptMask(intr: Int, id: Int): Int

    @JvmStatic
    external fun libcUnixNtoNeutrinoInterruptUnmask(intr: Int, id: Int): Int
}

public actual fun channelCreate(flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelCreate(flags.toInt())

public actual fun channelCreateR(flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelCreateR(flags.toInt())

public actual fun channelCreatePulsePool(flags: CUint, config: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelCreatePulsePool(flags.toInt(), config.rawAddress)

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr, cred: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelCreateExt(flags.toInt(), mode.toInt(), bufsize.toLong(), maxnumbuf.toInt(), ev.rawAddress, cred.rawAddress)

public actual fun channelDestroy(chid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelDestroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelDestroyR(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectAttach(nd.toInt(), pid, chid, index.toInt(), flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectAttachR(nd.toInt(), pid, chid, index.toInt(), flags)

public actual fun connectDetach(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectDetach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectServerInfo(pid, coid, info.rawAddress)

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectServerInfoR(pid, coid, info.rawAddress)

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr, ngroups: CInt, abilities: MutPtr, nable: CInt, typeId: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfoExtraArgs(scoid, infoPp.rawAddress, ngroups, abilities.rawAddress, nable, typeId.rawAddress)

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr, ngroups: CInt, abilities: MutPtr, nable: CInt, typeId: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfoExtraArgsR(scoid, infoPp.rawAddress, ngroups, abilities.rawAddress, nable, typeId.rawAddress)

public actual fun connectClientInfo(scoid: CInt, info: MutPtr, ngroups: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfo(scoid, info.rawAddress, ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: MutPtr, ngroups: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfoR(scoid, info.rawAddress, ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfoExt(scoid, infoPp.rawAddress, flags)

public actual fun clientInfoExtFree(infoPp: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClientInfoExtFree(infoPp.rawAddress)

public actual fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr, flags: CInt, abilities: MutPtr, nable: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectClientInfoAble(scoid, infoPp.rawAddress, flags, abilities.rawAddress, nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectFlags(pid, coid, mask.toInt(), bits.toInt())

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoConnectFlagsR(pid, coid, mask.toInt(), bits.toInt())

public actual fun channelConnectAttr(id: CUint, oldAttr: MutPtr, newAttr: MutPtr, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoChannelConnectAttr(id.toInt(), oldAttr.rawAddress, newAttr.rawAddress, flags.toInt())

public actual fun msgSend(coid: CInt, smsg: ConstPtr, sbytes: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSend(coid, smsg.rawAddress, sbytes.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendR(coid: CInt, smsg: ConstPtr, sbytes: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendR(coid, smsg.rawAddress, sbytes.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendnc(coid: CInt, smsg: ConstPtr, sbytes: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendnc(coid, smsg.rawAddress, sbytes.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendncR(coid: CInt, smsg: ConstPtr, sbytes: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendncR(coid, smsg.rawAddress, sbytes.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendsv(coid: CInt, smsg: ConstPtr, sbytes: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendsv(coid, smsg.rawAddress, sbytes.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendsvR(coid: CInt, smsg: ConstPtr, sbytes: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendsvR(coid, smsg.rawAddress, sbytes.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendsvnc(coid: CInt, smsg: ConstPtr, sbytes: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendsvnc(coid, smsg.rawAddress, sbytes.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendsvncR(coid: CInt, smsg: ConstPtr, sbytes: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendsvncR(coid, smsg.rawAddress, sbytes.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendvs(coid: CInt, siov: ConstPtr, sparts: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvs(coid, siov.rawAddress, sparts.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendvsR(coid: CInt, siov: ConstPtr, sparts: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvsR(coid, siov.rawAddress, sparts.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendvsnc(coid: CInt, siov: ConstPtr, sparts: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvsnc(coid, siov.rawAddress, sparts.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendvsncR(coid: CInt, siov: ConstPtr, sparts: ULong, rmsg: MutPtr, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvsncR(coid, siov.rawAddress, sparts.toLong(), rmsg.rawAddress, rbytes.toLong())

public actual fun msgSendv(coid: CInt, siov: ConstPtr, sparts: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendv(coid, siov.rawAddress, sparts.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendvR(coid: CInt, siov: ConstPtr, sparts: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvR(coid, siov.rawAddress, sparts.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendvnc(coid: CInt, siov: ConstPtr, sparts: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvnc(coid, siov.rawAddress, sparts.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgSendvncR(coid: CInt, siov: ConstPtr, sparts: ULong, riov: ConstPtr, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendvncR(coid, siov.rawAddress, sparts.toLong(), riov.rawAddress, rparts.toLong())

public actual fun msgReceive(chid: CInt, msg: MutPtr, bytes: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceive(chid, msg.rawAddress, bytes.toLong(), info.rawAddress)

public actual fun msgReceiveR(chid: CInt, msg: MutPtr, bytes: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceiveR(chid, msg.rawAddress, bytes.toLong(), info.rawAddress)

public actual fun msgReceivev(chid: CInt, iov: ConstPtr, parts: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivev(chid, iov.rawAddress, parts.toLong(), info.rawAddress)

public actual fun msgReceivevR(chid: CInt, iov: ConstPtr, parts: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivevR(chid, iov.rawAddress, parts.toLong(), info.rawAddress)

public actual fun msgReceivePulse(chid: CInt, pulse: MutPtr, bytes: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivePulse(chid, pulse.rawAddress, bytes.toLong(), info.rawAddress)

public actual fun msgReceivePulseR(chid: CInt, pulse: MutPtr, bytes: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivePulseR(chid, pulse.rawAddress, bytes.toLong(), info.rawAddress)

public actual fun msgReceivePulsev(chid: CInt, iov: ConstPtr, parts: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivePulsev(chid, iov.rawAddress, parts.toLong(), info.rawAddress)

public actual fun msgReceivePulsevR(chid: CInt, iov: ConstPtr, parts: ULong, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceivePulsevR(chid, iov.rawAddress, parts.toLong(), info.rawAddress)

public actual fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr, bytes: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReply(rcvid, status, msg.rawAddress, bytes.toLong())

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr, bytes: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReplyR(rcvid, status, msg.rawAddress, bytes.toLong())

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr, parts: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReplyv(rcvid, status, iov.rawAddress, parts.toLong())

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr, parts: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReplyvR(rcvid, status, iov.rawAddress, parts.toLong())

public actual fun msgReadiov(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong, flags: CInt): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReadiov(rcvid, iov.rawAddress, parts.toLong(), offset.toLong(), flags)

public actual fun msgReadiovR(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong, flags: CInt): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReadiovR(rcvid, iov.rawAddress, parts.toLong(), offset.toLong(), flags)

public actual fun msgRead(rcvid: CInt, msg: MutPtr, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgRead(rcvid, msg.rawAddress, bytes.toLong(), offset.toLong())

public actual fun msgReadR(rcvid: CInt, msg: MutPtr, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReadR(rcvid, msg.rawAddress, bytes.toLong(), offset.toLong())

public actual fun msgReadv(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReadv(rcvid, iov.rawAddress, parts.toLong(), offset.toLong())

public actual fun msgReadvR(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReadvR(rcvid, iov.rawAddress, parts.toLong(), offset.toLong())

public actual fun msgWrite(rcvid: CInt, msg: ConstPtr, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgWrite(rcvid, msg.rawAddress, bytes.toLong(), offset.toLong())

public actual fun msgWriteR(rcvid: CInt, msg: ConstPtr, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgWriteR(rcvid, msg.rawAddress, bytes.toLong(), offset.toLong())

public actual fun msgWritev(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgWritev(rcvid, iov.rawAddress, parts.toLong(), offset.toLong())

public actual fun msgWritevR(rcvid: CInt, iov: ConstPtr, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgWritevR(rcvid, iov.rawAddress, parts.toLong(), offset.toLong())

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendPulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendPulsePtr(coid, priority, code, value.rawAddress)

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendPulsePtrR(coid, priority, code, value.rawAddress)

public actual fun msgDeliverEvent(rcvid: CInt, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgDeliverEvent(rcvid, event.rawAddress)

public actual fun msgDeliverEventR(rcvid: CInt, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgDeliverEventR(rcvid, event.rawAddress)

public actual fun msgVerifyEvent(rcvid: CInt, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgVerifyEvent(rcvid, event.rawAddress)

public actual fun msgVerifyEventR(rcvid: CInt, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgVerifyEventR(rcvid, event.rawAddress)

public actual fun msgRegisterEvent(event: MutPtr, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgRegisterEvent(event.rawAddress, coid)

public actual fun msgRegisterEventR(event: MutPtr, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgRegisterEventR(event.rawAddress, coid)

public actual fun msgUnregisterEvent(event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgUnregisterEvent(event.rawAddress)

public actual fun msgUnregisterEventR(event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgUnregisterEventR(event.rawAddress)

public actual fun msgInfo(rcvid: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgInfo(rcvid, info.rawAddress)

public actual fun msgInfoR(rcvid: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgInfoR(rcvid, info.rawAddress)

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr, iov: ConstPtr, parts: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgKeyData(rcvid, oper, key.toInt(), newkey.rawAddress, iov.rawAddress, parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr, iov: ConstPtr, parts: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgKeyDataR(rcvid, oper, key.toInt(), newkey.rawAddress, iov.rawAddress, parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgError(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgErrorR(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgCurrent(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr, sbytes: ULong, msgPrio: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendAsyncGbl(coid, smsg.rawAddress, sbytes.toLong(), msgPrio.toInt())

public actual fun msgSendAsync(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr, rbytes: ULong, info: MutPtr, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceiveAsyncGbl(chid, rmsg.rawAddress, rbytes.toLong(), info.rawAddress, coid)

public actual fun msgReceiveAsync(chid: CInt, iov: ConstPtr, parts: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgReceiveAsync(chid, iov.rawAddress, parts.toInt())

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgPause(rcvid, cookie.toInt())

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoMsgPauseR(rcvid, cookie.toInt())

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalKill(nd.toInt(), pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalKillR(nd.toInt(), pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalKillSigval(nd.toInt(), pid, tid, signo, code, value.rawAddress)

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalKillSigvalR(nd.toInt(), pid, tid, signo, code, value.rawAddress)

public actual fun signalReturn(info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalReturn(info.rawAddress)

public actual fun signalFault(sigcode: CUint, regs: MutPtr, refaddr: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalFault(sigcode.toInt(), regs.rawAddress, refaddr.toLong())

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr, oact: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalAction(pid, 0L, signo, act.rawAddress, oact.rawAddress)

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr, oact: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalActionR(pid, 0L, signo, act.rawAddress, oact.rawAddress)

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalProcmask(pid, tid, how, set.rawAddress, oldset.rawAddress)

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalProcmaskR(pid, tid, how, set.rawAddress, oldset.rawAddress)

public actual fun signalSuspend(set: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalSuspend(set.rawAddress)

public actual fun signalSuspendR(set: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalSuspendR(set.rawAddress)

public actual fun signalWaitinfo(set: ConstPtr, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalWaitinfo(set.rawAddress, info.rawAddress)

public actual fun signalWaitinfoR(set: ConstPtr, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalWaitinfoR(set.rawAddress, info.rawAddress)

public actual fun signalWaitinfoMask(set: ConstPtr, info: MutPtr, mask: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalWaitinfoMask(set.rawAddress, info.rawAddress, mask.rawAddress)

public actual fun signalWaitinfoMaskR(set: ConstPtr, info: MutPtr, mask: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSignalWaitinfoMaskR(set.rawAddress, info.rawAddress, mask.rawAddress)

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr, attr: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCreate(pid, 0L, arg.rawAddress, attr.rawAddress)

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr, attr: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCreateR(pid, 0L, arg.rawAddress, attr.rawAddress)

public actual fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadDestroy(tid, priority, status.rawAddress)

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadDestroyR(tid, priority, status.rawAddress)

public actual fun threadDetach(tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadDetach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadJoin(tid, status.rawAddress)

public actual fun threadJoinR(tid: CInt, status: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadJoinR(tid, status.rawAddress)

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCancel(tid, 0L)

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCancelR(tid, 0L)

public actual fun threadCtl(cmd: CInt, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCtl(cmd, data.rawAddress)

public actual fun threadCtlR(cmd: CInt, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCtlR(cmd, data.rawAddress)

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCtlExt(pid, tid, cmd, data.rawAddress)

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoThreadCtlExtR(pid, tid, cmd, data.rawAddress)

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptHookTrace(0L, flags.toInt())

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptHookIdle(0L, flags.toInt())

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptHookIdle2(0L, flags.toInt())

public actual fun interruptHookOverdriveEvent(event: ConstPtr, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptHookOverdriveEvent(event.rawAddress, flags.toInt())

public actual fun interruptAttachEvent(intr: CInt, event: ConstPtr, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttachEvent(intr, event.rawAddress, flags.toInt())

public actual fun interruptAttachEventR(intr: CInt, event: ConstPtr, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttachEventR(intr, event.rawAddress, flags.toInt())

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttach(intr, 0L, area.rawAddress, size, flags.toInt())

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttachR(intr, 0L, area.rawAddress, size, flags.toInt())

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttachArray(intr, 0L, area.rawAddress, size, flags.toInt())

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptAttachArrayR(intr, 0L, area.rawAddress, size, flags.toInt())

public actual fun interruptDetach(id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptDetach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptWait(flags, timeout.rawAddress)

public actual fun interruptWaitR(flags: CInt, timeout: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptWaitR(flags, timeout.rawAddress)

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptCharacteristic(type, id, new.rawAddress, old.rawAddress)

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptCharacteristicR(type, id, new.rawAddress, old.rawAddress)

public actual fun schedGet(pid: PidT, tid: CInt, param: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedGet(pid, tid, param.rawAddress)

public actual fun schedGetR(pid: PidT, tid: CInt, param: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedGetR(pid, tid, param.rawAddress)

public actual fun schedGetCpuNum(): CUint =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedGetCpuNum().toUInt()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedSet(pid, tid, algorithm, param.rawAddress)

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedSetR(pid, tid, algorithm, param.rawAddress)

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedInfo(pid, algorithm, info.rawAddress)

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedInfoR(pid, algorithm, info.rawAddress)

public actual fun schedYield(): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedYield()

public actual fun schedYieldR(): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedYieldR()

public actual fun schedCtl(cmd: CInt, data: MutPtr, length: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedCtl(cmd, data.rawAddress, length.toLong())

public actual fun schedCtlR(cmd: CInt, data: MutPtr, length: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedCtlR(cmd, data.rawAddress, length.toLong())

public actual fun schedJobCreate(job: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedJobCreate(job.rawAddress)

public actual fun schedJobCreateR(job: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedJobCreateR(job.rawAddress)

public actual fun schedJobDestroy(job: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedJobDestroy(job.rawAddress)

public actual fun schedJobDestroyR(job: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedJobDestroyR(job.rawAddress)

public actual fun schedWaypoint(job: MutPtr, new: ConstPtr, max: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedWaypoint(job.rawAddress, new.rawAddress, max.rawAddress, old.rawAddress)

public actual fun schedWaypointR(job: MutPtr, new: ConstPtr, max: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSchedWaypointR(job.rawAddress, new.rawAddress, max.rawAddress, old.rawAddress)

public actual fun timerCreate(id: ClockidT, notify: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerCreate(id, notify.rawAddress)

public actual fun timerCreateR(id: ClockidT, notify: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerCreateR(id, notify.rawAddress)

public actual fun timerDestroy(id: TimerT): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerDestroy(id.toLong())

public actual fun timerDestroyR(id: TimerT): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerDestroyR(id.toLong())

public actual fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr, oitime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerSettime(id.toLong(), flags, itime.rawAddress, oitime.rawAddress)

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr, oitime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerSettimeR(id.toLong(), flags, itime.rawAddress, oitime.rawAddress)

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerInfo(pid, id.toLong(), flags, info.rawAddress)

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerInfoR(pid, id.toLong(), flags, info.rawAddress)

public actual fun timerAlarm(id: ClockidT, itime: ConstPtr, otime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerAlarm(id, itime.rawAddress, otime.rawAddress)

public actual fun timerAlarmR(id: ClockidT, itime: ConstPtr, otime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerAlarmR(id, itime.rawAddress, otime.rawAddress)

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr, ntime: ConstPtr, otime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerTimeout(id, flags, notify.rawAddress, ntime.rawAddress, otime.rawAddress)

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr, ntime: ConstPtr, otime: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoTimerTimeoutR(id, flags, notify.rawAddress, ntime.rawAddress, otime.rawAddress)

public actual fun syncTypeCreate(type: CUint, sync: MutPtr, attr: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncTypeCreate(type.toInt(), sync.rawAddress, attr.rawAddress)

public actual fun syncTypeCreateR(type: CUint, sync: MutPtr, attr: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncTypeCreateR(type.toInt(), sync.rawAddress, attr.rawAddress)

public actual fun syncDestroy(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncDestroy(sync.rawAddress)

public actual fun syncDestroyR(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncDestroyR(sync.rawAddress)

public actual fun syncCtl(cmd: CInt, sync: MutPtr, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCtl(cmd, sync.rawAddress, data.rawAddress)

public actual fun syncCtlR(cmd: CInt, sync: MutPtr, data: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCtlR(cmd, sync.rawAddress, data.rawAddress)

public actual fun syncMutexEvent(sync: MutPtr, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexEvent(sync.rawAddress, event.rawAddress)

public actual fun syncMutexEventR(sync: MutPtr, event: ConstPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexEventR(sync.rawAddress, event.rawAddress)

public actual fun syncMutexLock(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexLock(sync.rawAddress)

public actual fun syncMutexLockR(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexLockR(sync.rawAddress)

public actual fun syncMutexUnlock(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexUnlock(sync.rawAddress)

public actual fun syncMutexUnlockR(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexUnlockR(sync.rawAddress)

public actual fun syncMutexRevive(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexRevive(sync.rawAddress)

public actual fun syncMutexReviveR(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncMutexReviveR(sync.rawAddress)

public actual fun syncCondvarWait(sync: MutPtr, mutex: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCondvarWait(sync.rawAddress, mutex.rawAddress)

public actual fun syncCondvarWaitR(sync: MutPtr, mutex: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCondvarWaitR(sync.rawAddress, mutex.rawAddress)

public actual fun syncCondvarSignal(sync: MutPtr, all: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCondvarSignal(sync.rawAddress, all)

public actual fun syncCondvarSignalR(sync: MutPtr, all: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncCondvarSignalR(sync.rawAddress, all)

public actual fun syncSemPost(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncSemPost(sync.rawAddress)

public actual fun syncSemPostR(sync: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncSemPostR(sync.rawAddress)

public actual fun syncSemWait(sync: MutPtr, tryto: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncSemWait(sync.rawAddress, tryto)

public actual fun syncSemWaitR(sync: MutPtr, tryto: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoSyncSemWaitR(sync.rawAddress, tryto)

public actual fun clockTime(id: ClockidT, new: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockTime(id, new.rawAddress, old.rawAddress)

public actual fun clockTimeR(id: ClockidT, new: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockTimeR(id, new.rawAddress, old.rawAddress)

public actual fun clockAdjust(id: ClockidT, new: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockAdjust(id, new.rawAddress, old.rawAddress)

public actual fun clockAdjustR(id: ClockidT, new: ConstPtr, old: MutPtr): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockAdjustR(id, new.rawAddress, old.rawAddress)

public actual fun clockPeriod(id: ClockidT, new: ConstPtr, old: MutPtr, reserved: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockPeriod(id, new.rawAddress, old.rawAddress, reserved)

public actual fun clockPeriodR(id: ClockidT, new: ConstPtr, old: MutPtr, reserved: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockPeriodR(id, new.rawAddress, old.rawAddress, reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockId(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoClockIdR(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptMask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libcUnixNtoNeutrinoInterruptUnmask(intr, id)
