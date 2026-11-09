@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT

private object UnixNtoNeutrinoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelCreate(flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelCreateR(flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelCreatePulsePool(flags: Int, config: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelCreateExt(flags: Int, mode: Int, bufsize: Long, maxnumbuf: Int, ev: Long, cred: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelDestroy(chid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelDestroyR(chid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectAttach(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectAttachR(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectDetach(coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectDetachR(coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectServerInfo(pid: Int, coid: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectServerInfoR(pid: Int, coid: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfoExtraArgs(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfoExtraArgsR(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfo(scoid: Int, info: Long, ngroups: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfoR(scoid: Int, info: Long, ngroups: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfoExt(scoid: Int, infoPp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clientInfoExtFree(infoPp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectClientInfoAble(scoid: Int, infoPp: Long, flags: Int, abilities: Long, nable: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectFlags(pid: Int, coid: Int, mask: Int, bits: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_connectFlagsR(pid: Int, coid: Int, mask: Int, bits: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_channelConnectAttr(id: Int, oldAttr: Long, newAttr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSend(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendnc(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendncR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendsv(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendsvR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendsvnc(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendsvncR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvs(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvsR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvsnc(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvsncR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendv(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvnc(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendvncR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceive(chid: Int, msg: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceiveR(chid: Int, msg: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivev(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivevR(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivePulse(chid: Int, pulse: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivePulseR(chid: Int, pulse: Long, bytes: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivePulsev(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceivePulsevR(chid: Int, iov: Long, parts: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReply(rcvid: Int, status: Long, msg: Long, bytes: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReplyR(rcvid: Int, status: Long, msg: Long, bytes: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReplyv(rcvid: Int, status: Long, iov: Long, parts: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReplyvR(rcvid: Int, status: Long, iov: Long, parts: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReadiov(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReadiovR(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgRead(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReadR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReadv(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReadvR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgWrite(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgWriteR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgWritev(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgWritevR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgDeliverEvent(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgDeliverEventR(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgVerifyEvent(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgVerifyEventR(rcvid: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgRegisterEvent(event: Long, coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgRegisterEventR(event: Long, coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgUnregisterEvent(event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgUnregisterEventR(event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgInfo(rcvid: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgInfoR(rcvid: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgKeyData(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgKeyDataR(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgError(rcvid: Int, err: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgErrorR(rcvid: Int, err: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgCurrent(rcvid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgCurrentR(rcvid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendAsyncGbl(coid: Int, smsg: Long, sbytes: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgSendAsync(coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceiveAsyncGbl(chid: Int, rmsg: Long, rbytes: Long, info: Long, coid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgReceiveAsync(chid: Int, iov: Long, parts: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgPause(rcvid: Int, cookie: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_msgPauseR(rcvid: Int, cookie: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalKill(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalKillR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalKillSigval(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalKillSigvalR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalReturn(info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalFault(sigcode: Int, regs: Long, refaddr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalAction(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalActionR(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalProcmask(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalProcmaskR(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalSuspend(set: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalSuspendR(set: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalWaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalWaitinfoR(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalWaitinfoMask(set: Long, info: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_signalWaitinfoMaskR(set: Long, info: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCreate(pid: Int, func: Long, arg: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCreateR(pid: Int, func: Long, arg: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadDestroy(tid: Int, priority: Int, status: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadDestroyR(tid: Int, priority: Int, status: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadDetach(tid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadDetachR(tid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadJoin(tid: Int, status: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadJoinR(tid: Int, status: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCancel(tid: Int, canstub: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCancelR(tid: Int, canstub: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCtl(cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCtlR(cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCtlExt(pid: Int, tid: Int, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptHookTrace(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptHookIdle(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptHookIdle2(handler: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptHookOverdriveEvent(event: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttachEvent(intr: Int, event: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttachEventR(intr: Int, event: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttach(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttachR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttachArray(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptAttachArrayR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptDetach(id: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptDetachR(id: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptWait(flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptWaitR(flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptCharacteristic(type: Int, id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptCharacteristicR(type: Int, id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedGet(pid: Int, tid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedGetR(pid: Int, tid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedGetCpuNum(): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedSet(pid: Int, tid: Int, algorithm: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedSetR(pid: Int, tid: Int, algorithm: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedInfo(pid: Int, algorithm: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedInfoR(pid: Int, algorithm: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedYield(): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedYieldR(): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedCtl(cmd: Int, data: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedCtlR(cmd: Int, data: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedJobCreate(job: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedJobCreateR(job: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedJobDestroy(job: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedJobDestroyR(job: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedWaypoint(job: Long, new: Long, max: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_schedWaypointR(job: Long, new: Long, max: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerCreate(id: Int, notify: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerCreateR(id: Int, notify: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerDestroy(id: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerDestroyR(id: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerSettime(id: Long, flags: Int, itime: Long, oitime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerSettimeR(id: Long, flags: Int, itime: Long, oitime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerInfo(pid: Int, id: Long, flags: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerInfoR(pid: Int, id: Long, flags: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerAlarm(id: Int, itime: Long, otime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerAlarmR(id: Int, itime: Long, otime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerTimeout(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_timerTimeoutR(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncTypeCreate(type: Int, sync: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncTypeCreateR(type: Int, sync: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncDestroy(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncDestroyR(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCtl(cmd: Int, sync: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCtlR(cmd: Int, sync: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexEvent(sync: Long, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexEventR(sync: Long, event: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexLock(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexLockR(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexUnlock(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexUnlockR(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexRevive(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncMutexReviveR(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCondvarWait(sync: Long, mutex: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCondvarWaitR(sync: Long, mutex: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCondvarSignal(sync: Long, all: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncCondvarSignalR(sync: Long, all: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncSemPost(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncSemPostR(sync: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncSemWait(sync: Long, tryto: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_syncSemWaitR(sync: Long, tryto: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockTime(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockTimeR(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockAdjust(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockAdjustR(id: Int, new: Long, old: Long): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockPeriod(id: Int, new: Long, old: Long, reserved: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockPeriodR(id: Int, new: Long, old: Long, reserved: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockId(pid: Int, tid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_clockIdR(pid: Int, tid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptMask(intr: Int, id: Int): Int

    @JvmStatic
    external fun libc_unix_nto_neutrino_interruptUnmask(intr: Int, id: Int): Int
}

public actual fun channelCreate(flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelCreate(flags.toInt())

public actual fun channelCreateR(flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelCreateR(flags.toInt())

public actual fun channelCreatePulsePool(flags: CUint, config: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelCreatePulsePool(flags.toInt(), (config?.value ?: 0L))

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: COpaquePointer?, cred: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelCreateExt(flags.toInt(), mode.toInt(), bufsize.toLong(), maxnumbuf.toInt(), (ev?.value ?: 0L), (cred?.value ?: 0L))

public actual fun channelDestroy(chid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelDestroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelDestroyR(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectAttach(nd.toInt(), pid, chid, index.toInt(), flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectAttachR(nd.toInt(), pid, chid, index.toInt(), flags)

public actual fun connectDetach(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectDetach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectServerInfo(pid, coid, (info?.value ?: 0L))

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectServerInfoR(pid, coid, (info?.value ?: 0L))

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfoExtraArgs(scoid, (infoPp?.value ?: 0L), ngroups, (abilities?.value ?: 0L), nable, (typeId?.value ?: 0L))

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfoExtraArgsR(scoid, (infoPp?.value ?: 0L), ngroups, (abilities?.value ?: 0L), nable, (typeId?.value ?: 0L))

public actual fun connectClientInfo(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfo(scoid, (info?.value ?: 0L), ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfoR(scoid, (info?.value ?: 0L), ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfoExt(scoid, (infoPp?.value ?: 0L), flags)

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clientInfoExtFree((infoPp?.value ?: 0L))

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: COpaquePointer?, nable: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectClientInfoAble(scoid, (infoPp?.value ?: 0L), flags, (abilities?.value ?: 0L), nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectFlags(pid, coid, mask.toInt(), bits.toInt())

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_connectFlagsR(pid, coid, mask.toInt(), bits.toInt())

public actual fun channelConnectAttr(id: CUint, oldAttr: COpaquePointer?, newAttr: COpaquePointer?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_channelConnectAttr(id.toInt(), (oldAttr?.value ?: 0L), (newAttr?.value ?: 0L), flags.toInt())

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSend(coid, (smsg?.value ?: 0L), sbytes.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendR(coid, (smsg?.value ?: 0L), sbytes.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendnc(coid, (smsg?.value ?: 0L), sbytes.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendncR(coid, (smsg?.value ?: 0L), sbytes.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendsv(coid, (smsg?.value ?: 0L), sbytes.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendsvR(coid, (smsg?.value ?: 0L), sbytes.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendsvnc(coid, (smsg?.value ?: 0L), sbytes.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendsvncR(coid, (smsg?.value ?: 0L), sbytes.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendvs(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvs(coid, (siov?.value ?: 0L), sparts.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendvsR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvsR(coid, (siov?.value ?: 0L), sparts.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendvsnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvsnc(coid, (siov?.value ?: 0L), sparts.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendvsncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvsncR(coid, (siov?.value ?: 0L), sparts.toLong(), (rmsg?.value ?: 0L), rbytes.toLong())

public actual fun msgSendv(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendv(coid, (siov?.value ?: 0L), sparts.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendvR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvR(coid, (siov?.value ?: 0L), sparts.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendvnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvnc(coid, (siov?.value ?: 0L), sparts.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgSendvncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendvncR(coid, (siov?.value ?: 0L), sparts.toLong(), (riov?.value ?: 0L), rparts.toLong())

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceive(chid, (msg?.value ?: 0L), bytes.toLong(), (info?.value ?: 0L))

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceiveR(chid, (msg?.value ?: 0L), bytes.toLong(), (info?.value ?: 0L))

public actual fun msgReceivev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivev(chid, (iov?.value ?: 0L), parts.toLong(), (info?.value ?: 0L))

public actual fun msgReceivevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivevR(chid, (iov?.value ?: 0L), parts.toLong(), (info?.value ?: 0L))

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivePulse(chid, (pulse?.value ?: 0L), bytes.toLong(), (info?.value ?: 0L))

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivePulseR(chid, (pulse?.value ?: 0L), bytes.toLong(), (info?.value ?: 0L))

public actual fun msgReceivePulsev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivePulsev(chid, (iov?.value ?: 0L), parts.toLong(), (info?.value ?: 0L))

public actual fun msgReceivePulsevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceivePulsevR(chid, (iov?.value ?: 0L), parts.toLong(), (info?.value ?: 0L))

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReply(rcvid, status, (msg?.value ?: 0L), bytes.toLong())

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReplyR(rcvid, status, (msg?.value ?: 0L), bytes.toLong())

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReplyv(rcvid, status, (iov?.value ?: 0L), parts.toLong())

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReplyvR(rcvid, status, (iov?.value ?: 0L), parts.toLong())

public actual fun msgReadiov(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReadiov(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong(), flags)

public actual fun msgReadiovR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReadiovR(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong(), flags)

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgRead(rcvid, (msg?.value ?: 0L), bytes.toLong(), offset.toLong())

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReadR(rcvid, (msg?.value ?: 0L), bytes.toLong(), offset.toLong())

public actual fun msgReadv(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReadv(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong())

public actual fun msgReadvR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReadvR(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong())

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgWrite(rcvid, (msg?.value ?: 0L), bytes.toLong(), offset.toLong())

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgWriteR(rcvid, (msg?.value ?: 0L), bytes.toLong(), offset.toLong())

public actual fun msgWritev(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgWritev(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong())

public actual fun msgWritevR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgWritevR(rcvid, (iov?.value ?: 0L), parts.toLong(), offset.toLong())

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendPulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendPulsePtr(coid, priority, code, (value?.value ?: 0L))

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendPulsePtrR(coid, priority, code, (value?.value ?: 0L))

public actual fun msgDeliverEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgDeliverEvent(rcvid, (event?.value ?: 0L))

public actual fun msgDeliverEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgDeliverEventR(rcvid, (event?.value ?: 0L))

public actual fun msgVerifyEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgVerifyEvent(rcvid, (event?.value ?: 0L))

public actual fun msgVerifyEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgVerifyEventR(rcvid, (event?.value ?: 0L))

public actual fun msgRegisterEvent(event: COpaquePointer?, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgRegisterEvent((event?.value ?: 0L), coid)

public actual fun msgRegisterEventR(event: COpaquePointer?, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgRegisterEventR((event?.value ?: 0L), coid)

public actual fun msgUnregisterEvent(event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgUnregisterEvent((event?.value ?: 0L))

public actual fun msgUnregisterEventR(event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgUnregisterEventR((event?.value ?: 0L))

public actual fun msgInfo(rcvid: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgInfo(rcvid, (info?.value ?: 0L))

public actual fun msgInfoR(rcvid: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgInfoR(rcvid, (info?.value ?: 0L))

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgKeyData(rcvid, oper, key.toInt(), (newkey?.value ?: 0L), (iov?.value ?: 0L), parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgKeyDataR(rcvid, oper, key.toInt(), (newkey?.value ?: 0L), (iov?.value ?: 0L), parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgError(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgErrorR(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgCurrent(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendAsyncGbl(coid, (smsg?.value ?: 0L), sbytes.toLong(), msgPrio.toInt())

public actual fun msgSendAsync(coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: COpaquePointer?, coid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceiveAsyncGbl(chid, (rmsg?.value ?: 0L), rbytes.toLong(), (info?.value ?: 0L), coid)

public actual fun msgReceiveAsync(chid: CInt, iov: COpaquePointer?, parts: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgReceiveAsync(chid, (iov?.value ?: 0L), parts.toInt())

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgPause(rcvid, cookie.toInt())

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_msgPauseR(rcvid, cookie.toInt())

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalKill(nd.toInt(), pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalKillR(nd.toInt(), pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalKillSigval(nd.toInt(), pid, tid, signo, code, (value?.value ?: 0L))

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalKillSigvalR(nd.toInt(), pid, tid, signo, code, (value?.value ?: 0L))

public actual fun signalReturn(info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalReturn((info?.value ?: 0L))

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalFault(sigcode.toInt(), (regs?.value ?: 0L), refaddr.toLong())

public actual fun signalAction(pid: PidT, sigstub: FnCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalAction(pid, 0L, signo, (act?.value ?: 0L), (oact?.value ?: 0L))

public actual fun signalActionR(pid: PidT, sigstub: FnCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalActionR(pid, 0L, signo, (act?.value ?: 0L), (oact?.value ?: 0L))

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalProcmask(pid, tid, how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalProcmaskR(pid, tid, how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun signalSuspend(set: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalSuspend((set?.value ?: 0L))

public actual fun signalSuspendR(set: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalSuspendR((set?.value ?: 0L))

public actual fun signalWaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalWaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun signalWaitinfoR(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalWaitinfoR((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun signalWaitinfoMask(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalWaitinfoMask((set?.value ?: 0L), (info?.value ?: 0L), (mask?.value ?: 0L))

public actual fun signalWaitinfoMaskR(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_signalWaitinfoMaskR((set?.value ?: 0L), (info?.value ?: 0L), (mask?.value ?: 0L))

public actual fun threadCreate(pid: PidT, func: FnCallback1, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCreate(pid, 0L, (arg?.value ?: 0L), (attr?.value ?: 0L))

public actual fun threadCreateR(pid: PidT, func: FnCallback1, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCreateR(pid, 0L, (arg?.value ?: 0L), (attr?.value ?: 0L))

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadDestroy(tid, priority, (status?.value ?: 0L))

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadDestroyR(tid, priority, (status?.value ?: 0L))

public actual fun threadDetach(tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadDetach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadJoin(tid, (status?.value ?: 0L))

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadJoinR(tid, (status?.value ?: 0L))

public actual fun threadCancel(tid: CInt, canstub: FnCallback): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCancel(tid, 0L)

public actual fun threadCancelR(tid: CInt, canstub: FnCallback): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCancelR(tid, 0L)

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCtl(cmd, (data?.value ?: 0L))

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCtlR(cmd, (data?.value ?: 0L))

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCtlExt(pid, tid, cmd, (data?.value ?: 0L))

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_threadCtlExtR(pid, tid, cmd, (data?.value ?: 0L))

public actual fun interruptHookTrace(handler: FnCallback2?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptHookTrace(0L, flags.toInt())

public actual fun interruptHookIdle(handler: FnCallback3?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptHookIdle(0L, flags.toInt())

public actual fun interruptHookIdle2(handler: FnCallback4?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptHookIdle2(0L, flags.toInt())

public actual fun interruptHookOverdriveEvent(event: COpaquePointer?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptHookOverdriveEvent((event?.value ?: 0L), flags.toInt())

public actual fun interruptAttachEvent(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttachEvent(intr, (event?.value ?: 0L), flags.toInt())

public actual fun interruptAttachEventR(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttachEventR(intr, (event?.value ?: 0L), flags.toInt())

public actual fun interruptAttach(intr: CInt, handler: FnCallback5?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttach(intr, 0L, (area?.value ?: 0L), size, flags.toInt())

public actual fun interruptAttachR(intr: CInt, handler: FnCallback5?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttachR(intr, 0L, (area?.value ?: 0L), size, flags.toInt())

public actual fun interruptAttachArray(intr: CInt, handler: FnCallback5?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttachArray(intr, 0L, (area?.value ?: 0L), size, flags.toInt())

public actual fun interruptAttachArrayR(intr: CInt, handler: FnCallback5?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptAttachArrayR(intr, 0L, (area?.value ?: 0L), size, flags.toInt())

public actual fun interruptDetach(id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptDetach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptWait(flags, (timeout?.value ?: 0L))

public actual fun interruptWaitR(flags: CInt, timeout: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptWaitR(flags, (timeout?.value ?: 0L))

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptCharacteristic(type, id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptCharacteristicR(type, id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun schedGet(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedGet(pid, tid, (param?.value ?: 0L))

public actual fun schedGetR(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedGetR(pid, tid, (param?.value ?: 0L))

public actual fun schedGetCpuNum(): CUint =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedGetCpuNum().toUInt()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedSet(pid, tid, algorithm, (param?.value ?: 0L))

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedSetR(pid, tid, algorithm, (param?.value ?: 0L))

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedInfo(pid, algorithm, (info?.value ?: 0L))

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedInfoR(pid, algorithm, (info?.value ?: 0L))

public actual fun schedYield(): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedYield()

public actual fun schedYieldR(): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedYieldR()

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedCtl(cmd, (data?.value ?: 0L), length.toLong())

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedCtlR(cmd, (data?.value ?: 0L), length.toLong())

public actual fun schedJobCreate(job: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedJobCreate((job?.value ?: 0L))

public actual fun schedJobCreateR(job: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedJobCreateR((job?.value ?: 0L))

public actual fun schedJobDestroy(job: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedJobDestroy((job?.value ?: 0L))

public actual fun schedJobDestroyR(job: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedJobDestroyR((job?.value ?: 0L))

public actual fun schedWaypoint(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedWaypoint((job?.value ?: 0L), (new?.value ?: 0L), (max?.value ?: 0L), (old?.value ?: 0L))

public actual fun schedWaypointR(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_schedWaypointR((job?.value ?: 0L), (new?.value ?: 0L), (max?.value ?: 0L), (old?.value ?: 0L))

public actual fun timerCreate(id: ClockidT, notify: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerCreate(id, (notify?.value ?: 0L))

public actual fun timerCreateR(id: ClockidT, notify: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerCreateR(id, (notify?.value ?: 0L))

public actual fun timerDestroy(id: TimerT): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerDestroy(id.toLong())

public actual fun timerDestroyR(id: TimerT): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerDestroyR(id.toLong())

public actual fun timerSettime(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerSettime(id.toLong(), flags, (itime?.value ?: 0L), (oitime?.value ?: 0L))

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerSettimeR(id.toLong(), flags, (itime?.value ?: 0L), (oitime?.value ?: 0L))

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerInfo(pid, id.toLong(), flags, (info?.value ?: 0L))

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerInfoR(pid, id.toLong(), flags, (info?.value ?: 0L))

public actual fun timerAlarm(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerAlarm(id, (itime?.value ?: 0L), (otime?.value ?: 0L))

public actual fun timerAlarmR(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerAlarmR(id, (itime?.value ?: 0L), (otime?.value ?: 0L))

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerTimeout(id, flags, (notify?.value ?: 0L), (ntime?.value ?: 0L), (otime?.value ?: 0L))

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_timerTimeoutR(id, flags, (notify?.value ?: 0L), (ntime?.value ?: 0L), (otime?.value ?: 0L))

public actual fun syncTypeCreate(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncTypeCreate(type.toInt(), (sync?.value ?: 0L), (attr?.value ?: 0L))

public actual fun syncTypeCreateR(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncTypeCreateR(type.toInt(), (sync?.value ?: 0L), (attr?.value ?: 0L))

public actual fun syncDestroy(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncDestroy((sync?.value ?: 0L))

public actual fun syncDestroyR(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncDestroyR((sync?.value ?: 0L))

public actual fun syncCtl(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCtl(cmd, (sync?.value ?: 0L), (data?.value ?: 0L))

public actual fun syncCtlR(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCtlR(cmd, (sync?.value ?: 0L), (data?.value ?: 0L))

public actual fun syncMutexEvent(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexEvent((sync?.value ?: 0L), (event?.value ?: 0L))

public actual fun syncMutexEventR(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexEventR((sync?.value ?: 0L), (event?.value ?: 0L))

public actual fun syncMutexLock(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexLock((sync?.value ?: 0L))

public actual fun syncMutexLockR(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexLockR((sync?.value ?: 0L))

public actual fun syncMutexUnlock(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexUnlock((sync?.value ?: 0L))

public actual fun syncMutexUnlockR(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexUnlockR((sync?.value ?: 0L))

public actual fun syncMutexRevive(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexRevive((sync?.value ?: 0L))

public actual fun syncMutexReviveR(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncMutexReviveR((sync?.value ?: 0L))

public actual fun syncCondvarWait(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCondvarWait((sync?.value ?: 0L), (mutex?.value ?: 0L))

public actual fun syncCondvarWaitR(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCondvarWaitR((sync?.value ?: 0L), (mutex?.value ?: 0L))

public actual fun syncCondvarSignal(sync: COpaquePointer?, all: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCondvarSignal((sync?.value ?: 0L), all)

public actual fun syncCondvarSignalR(sync: COpaquePointer?, all: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncCondvarSignalR((sync?.value ?: 0L), all)

public actual fun syncSemPost(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncSemPost((sync?.value ?: 0L))

public actual fun syncSemPostR(sync: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncSemPostR((sync?.value ?: 0L))

public actual fun syncSemWait(sync: COpaquePointer?, tryto: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncSemWait((sync?.value ?: 0L), tryto)

public actual fun syncSemWaitR(sync: COpaquePointer?, tryto: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_syncSemWaitR((sync?.value ?: 0L), tryto)

public actual fun clockTime(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockTime(id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun clockTimeR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockTimeR(id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun clockAdjust(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockAdjust(id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun clockAdjustR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockAdjustR(id, (new?.value ?: 0L), (old?.value ?: 0L))

public actual fun clockPeriod(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockPeriod(id, (new?.value ?: 0L), (old?.value ?: 0L), reserved)

public actual fun clockPeriodR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockPeriodR(id, (new?.value ?: 0L), (old?.value ?: 0L), reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockId(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_clockIdR(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptMask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    UnixNtoNeutrinoJniBridge.libc_unix_nto_neutrino_interruptUnmask(intr, id)
