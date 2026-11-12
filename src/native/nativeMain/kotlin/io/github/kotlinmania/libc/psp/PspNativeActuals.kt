@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracAddStreamData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracDecodeData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetAtracID
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetBitrate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetBufferInfoForReseting
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetChannel
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetInternalErrorInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetLoopStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetMaxSample
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetNextDecodePosition
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetNextSample
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetRemainFrame
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetSecondBufferInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetSoundSample
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracGetStreamDataInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracReleaseAtracID
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracResetPlayPosition
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetDataAndGetID
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetHalfwayBuffer
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetHalfwayBufferAndGetID
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetLoopNum
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAtracSetSecondBuffer
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioChRelease
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioChangeChannelVolume
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioGetChannelRestLen
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioGetChannelRestLength
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioGetInputLength
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioInputInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioInputInitEx
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput2ChangeLength
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput2GetRestSample
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput2OutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput2Release
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutput2Reserve
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutputPanned
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioOutputPannedBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioPollInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioSRCChRelease
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioSRCOutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioSetChannelDataLen
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceAudioWaitInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlGetIdleCancelThreshold
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlGetSamplingCycle
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlGetSamplingMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlPeekBufferNegative
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlPeekBufferPositive
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlPeekLatch
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlReadBufferNegative
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlReadBufferPositive
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlReadLatch
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlSetIdleCancelThreshold
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceCtrlSetSamplingCycle
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayGetAccumulatedHcount
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayGetCurrentHcount
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayGetFramePerSec
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayGetMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayGetVcount
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayIsForeground
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayIsVblank
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayWaitVblank
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayWaitVblankCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayWaitVblankStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceDisplayWaitVblankStartCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeBreak
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeContinue
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeEdramGetAddr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeEdramGetSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeEdramSetAddrTranslation
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeGetCmd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeGetStack
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeListDeQueue
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeListEnQueue
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeListEnQueueHead
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeListUpdateStallAddr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeRestoreContext
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeSaveContext
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeSetCallback
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGeUnsetCallback
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuAmbient
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuAmbientColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuBeginObject
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuBreak
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuCallList
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuCallMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuCheckList
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuClear
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuClearColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuClearDepth
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuClearStencil
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuClutLoad
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuColorMaterial
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuContinue
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDepthBuffer
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDepthMask
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDepthOffset
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDepthRange
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDispBuffer
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDisplay
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDrawBezier
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuDrawSpline
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuEndObject
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuFinish
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuFinishId
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuFog
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuGetAllStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuGetMemory
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuLightAtt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuLightColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuMaterial
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuModelColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuMorphWeight
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuOffset
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuPatchDivide
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuPatchFrontFace
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuPixelMask
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuScissor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuSetAllStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuSpecular
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuSwapBuffers
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexEnvColor
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexFlush
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexOffset
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexScale
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexSlope
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuTexSync
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGuViewport
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumDrawBezier
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumDrawSpline
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumFastInverse
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumFullInverse
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumLoadIdentity
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumOrtho
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumPerspective
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumPopMatrix
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumPushMatrix
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumRotateX
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumRotateY
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumRotateZ
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceGumUpdateMatrix
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmIsHeadphoneExist
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmIsMicrophoneExist
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmIsRemoteExist
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmPeekCurrentKey
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmPeekLatch
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHprmReadLatch
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpAbortRequest
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpAddExtraHeader
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpCreateConnection
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpCreateConnectionWithURL
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpCreateTemplate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDeleteConnection
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDeleteHeader
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDeleteRequest
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDeleteTemplate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDisableAuth
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDisableCache
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDisableCookie
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDisableKeepAlive
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpDisableRedirect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnableAuth
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnableCache
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnableCookie
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnableKeepAlive
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnableRedirect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpEndCache
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpGetAllHeader
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpGetContentLength
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpGetNetworkErrno
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpGetProxy
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpGetStatusCode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpInitCache
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpLoadSystemCookie
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpReadData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSaveSystemCookie
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSendRequest
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetAuthInfoCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetConnectTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetMallocFunction
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetProxy
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetRecvTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetResHeaderMaxSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetResolveRetry
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetResolveTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpSetSendTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpsEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpsInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceHttpsLoadDefaultCert
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoChdir
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoChstat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoDevctl
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoGetstat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoMkdir
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoRemove
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoRename
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoRmdir
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoSync
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceIoUnassign
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceJpegCreateMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceJpegDecodeMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceJpegDeleteMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceJpegFinishMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceJpegInitMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelChangeCurrentThreadAttr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCheckCallback
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCheckThreadStack
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCpuResumeIntr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCpuResumeIntrWithSync
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCpuSuspendIntr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelCreateFpl
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDcacheInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDcacheWritebackAll
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDcacheWritebackInvalidateAll
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDcacheWritebackInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDcacheWritebackRange
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDelaySysClockThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDelaySysClockThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDelayThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDelayThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDevkitVersion
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelDisableSubIntr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelEnableSubIntr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelExitDeleteThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelExitGame
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelExitThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetCompiledSdkVersion
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetModuleIdList
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetSystemTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetSystemTimeLow
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetSystemTimeWide
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetThreadCurrentPriority
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelGetThreadId
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelIcacheInvalidateAll
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelIcacheInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelIsCpuIntrEnable
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelIsCpuIntrSuspended
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelLibcClock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelLibcGettimeofday
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelLibcTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelLoadExec
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelMaxFreeMemSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelReferGlobalProfiler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelReferSystemStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelReferThreadProfiler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelRegisterSubIntrHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelReleaseSubIntrHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelResumeDispatchThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelRotateThreadReadyQueue
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSelfStopUnloadModule
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSetCompiledSdkVersion
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSleepThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSleepThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelStopUnloadSelfModule
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSuspendDispatchThread
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSysClock2USec
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelSysClock2USecWide
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelTotalFreeMemSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUSec2SysClock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUSec2SysClockWide
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMd5BlockInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMd5BlockResult
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMd5BlockUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMd5Digest
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMt19937Init
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsMt19937UInt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsSha1BlockInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsSha1BlockResult
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsSha1BlockUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelUtilsSha1Digest
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelVolatileMemLock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelVolatileMemTryLock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceKernelVolatileMemUnlock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMp3InitResource
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMp3ReserveMp3Handle
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMp3TermResource
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegBaseCscInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegBaseCscVme
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegBaseYCrCbCopyVme
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegFinish
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegQueryMemSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegQueryStreamSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegRingbufferAvailableSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegRingbufferConstruct
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegRingbufferDestruct
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegRingbufferPut
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegRingbufferQueryMemSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceMpegbaseBea18f91
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeCreateMaster
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeCreateReplica
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeDeleteMaster
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeDeleteReplica
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeUpdateMaster
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGameModeUpdateReplica
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGetPdpStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocGetPtpStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingAbortSendData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingCancelTarget
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingCancelTargetWithOpt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingDelete
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingGetHelloOpt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingGetMembers
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingGetPoolMaxAlloc
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingGetPoolStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingSelectTarget
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingSendData
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingSetHelloOpt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingStop
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocMatchingTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPdpCreate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPdpDelete
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPdpRecv
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPdpSend
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpAccept
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpClose
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpConnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpFlush
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpListen
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpOpen
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpRecv
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocPtpSend
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlAddHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlConnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlCreate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlCreateEnterGameMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlDelHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlDisconnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlExitGameMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetAddrByName
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetAdhocId
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetGameModeInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetNameByAddr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetParameter
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetPeerInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetPeerList
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetScanInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlGetState
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlJoin
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlJoinEnterGameMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlScan
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetAdhocctlTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlAddHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlConnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlDelHandler
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlDisconnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlGetState
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetApctlTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetEtherNtostr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetEtherStrton
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetFreeThreadinfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetGetLocalEtherAddr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetGetMallocStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetAccept
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetBind
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetClose
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetConnect
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetGetErrno
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetGetsockopt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetListen
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetRecv
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetRecvfrom
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetSend
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetSendto
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetSetsockopt
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetShutdown
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetSocket
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInetTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverCreate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverDelete
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverStartAtoN
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverStartNtoA
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverStop
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetResolverTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetTerm
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceNetThreadAbort
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceOpenPSIDGetOpenPSID
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryChargingStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryElec
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryLifePercent
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryLifeTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryTemp
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBatteryVolt
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBusClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBusClockFrequencyFloat
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetBusClockFrequencyInt
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetCpuClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetCpuClockFrequencyFloat
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetCpuClockFrequencyInt
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerGetIdleTimer
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIdleTimerDisable
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIdleTimerEnable
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIsBatteryCharging
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIsBatteryExist
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIsLowBattery
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerIsPowerOnline
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerLock
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerRequestStandby
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerRequestSuspend
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerSetBusClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerSetClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerSetCpuClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerUnlock
import io.github.kotlinmania.libc.psp.cinterop.libcPspScePowerUnregisterCallback
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRegOpenRegistry
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRegRemoveRegistry
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcCheckValid
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcCompareTick
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcConvertLocalTimeToUTC
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcConvertUtcToLocalTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcFormatRFC2822
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcFormatRFC2822LocalTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcFormatRFC3339
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcFormatRFC3339LocalTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetCurrentClock
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetCurrentClockLocalTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetCurrentTick
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetDayOfWeek
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetDaysInMonth
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetDosTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetTick
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetTickResolution
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetTime64T
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetTimeT
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcGetWin32FileTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcIsLeapYear
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcParseDateTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcParseRFC3339
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcSetDosTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcSetTick
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcSetTime64T
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcSetTimeT
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcSetWin32FileTime
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddDays
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddHours
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddMicroseconds
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddMinutes
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddMonths
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddSeconds
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddTicks
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddWeeks
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceRtcTickAddYears
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceSslEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceSslGetUsedMemoryCurrent
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceSslGetUsedMemoryMax
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceSslInit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdActivate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdCancelWaitDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdCheckMedium
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdDeactivate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdGetDiscInfo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdGetDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdGetErrorStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdRegisterUMDCallBack
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdReplacePermit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdReplaceProhibit
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdUnRegisterUMDCallBack
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdWaitDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdWaitDriveStatCB
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUmdWaitDriveStatWithTimer
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbActivate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamAutoImageReverseSW
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetAutoImageReverseState
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetBrightness
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetContrast
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetEvLevel
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetImageEffectMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetLensDirection
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetReadVideoFrameSize
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetReverseMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetSaturation
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetSharpness
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamGetZoom
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamPollReadVideoFrameEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamReadVideoFrame
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamReadVideoFrameBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetBrightness
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetContrast
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetReverseMode
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetSaturation
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetSharpness
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetZoom
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetupStill
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetupStillEx
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetupVideo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamSetupVideoEx
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStartVideo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillCancelInput
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillGetInputLength
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillInput
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillInputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillPollInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStillWaitInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamStopVideo
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbCamWaitReadVideoFrameEnd
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbDeactivate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbGetDrvState
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbGetState
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbStop
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbstorBootSetCapacity
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUsbstorBootUnregisterNotify
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityCheckNetParam
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityCopyNetParam
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityCreateNetParam
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityDeleteNetParam
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityGameSharingGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityGameSharingInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityGameSharingShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityGameSharingUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityHtmlViewerGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityHtmlViewerInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityHtmlViewerShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityHtmlViewerUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityMsgDialogAbort
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityMsgDialogGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityMsgDialogInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityMsgDialogShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityMsgDialogUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityNetconfGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityNetconfInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityNetconfShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityNetconfUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityOskGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityOskInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityOskShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilityOskUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilitySavedataGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilitySavedataInitStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilitySavedataShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceUtilitySavedataUpdate
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceWlanDevAttach
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceWlanDevDetach
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceWlanDevIsPowerOn
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceWlanGetEtherAddr
import io.github.kotlinmania.libc.psp.cinterop.libcPspSceWlanGetSwitchState
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    libcPspSceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr): Int =
    libcPspSceAudioOutput(channel, vol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr): Int =
    libcPspSceAudioOutputBlocking(channel, vol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    libcPspSceAudioOutputPanned(channel, leftVol, rightVol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    libcPspSceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    libcPspSceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    libcPspSceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    libcPspSceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    libcPspSceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    libcPspSceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    libcPspSceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    libcPspSceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr): Int =
    libcPspSceAudioOutput2OutputBlocking(vol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioOutput2GetRestSample(): Int =
    libcPspSceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    libcPspSceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr): Int =
    libcPspSceAudioSRCOutputBlocking(vol, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    libcPspSceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: MutPtr): Int =
    libcPspSceAudioInputInitEx(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr) {
}

public actual fun sceAudioGetInputLength(): Int =
    libcPspSceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    libcPspSceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    libcPspSceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    libcPspSceAtracGetAtracID(uiCodecType)

public actual fun sceAtracSetDataAndGetID(buf: MutPtr, bufsize: ULong): Int =
    libcPspSceAtracSetDataAndGetID(buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr, outN: MutPtr, outEnd: MutPtr, outRemainFrame: MutPtr): Int =
    libcPspSceAtracDecodeData(atracId, outSamples.rawAddress.toCPointer<ByteVar>(), outN.rawAddress.toCPointer<ByteVar>(), outEnd.rawAddress.toCPointer<ByteVar>(), outRemainFrame.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr): Int =
    libcPspSceAtracGetRemainFrame(atracId, outRemainFrame.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr, availableBytes: MutPtr, readOffset: MutPtr): Int =
    libcPspSceAtracGetStreamDataInfo(atracId, writePointer.rawAddress.toCPointer<ByteVar>(), availableBytes.rawAddress.toCPointer<ByteVar>(), readOffset.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    libcPspSceAtracAddStreamData(atracId, bytesToAdd)

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr): Int =
    libcPspSceAtracGetBitrate(atracId, outBitrate.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    libcPspSceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    libcPspSceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: MutPtr): Int =
    libcPspSceAtracGetNextSample(atracId, outN.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr): Int =
    libcPspSceAtracGetMaxSample(atracId, outMax.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr): Int =
    libcPspSceAtracGetBufferInfoForReseting(atracId, uiSample, pbufferInfo.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr): Int =
    libcPspSceAtracGetChannel(atracId, puiChannel.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr): Int =
    libcPspSceAtracGetInternalErrorInfo(atracId, piResult.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr, puiLoopStatus: MutPtr): Int =
    libcPspSceAtracGetLoopStatus(atracId, piLoopNum.rawAddress.toCPointer<ByteVar>(), puiLoopStatus.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr): Int =
    libcPspSceAtracGetNextDecodePosition(atracId, puiSamplePosition.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr, puiDataByte: MutPtr): Int =
    libcPspSceAtracGetSecondBufferInfo(atracId, puiPosition.rawAddress.toCPointer<ByteVar>(), puiDataByte.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr, piLoopStartSample: MutPtr, piLoopEndSample: MutPtr): Int =
    libcPspSceAtracGetSoundSample(atracId, piEndSample.rawAddress.toCPointer<ByteVar>(), piLoopStartSample.rawAddress.toCPointer<ByteVar>(), piLoopEndSample.rawAddress.toCPointer<ByteVar>())

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    libcPspSceAtracResetPlayPosition(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr, uiBufferByte: UInt): Int =
    libcPspSceAtracSetData(atracId, pucBufferAddr.rawAddress.toCPointer<ByteVar>(), uiBufferByte)

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    libcPspSceAtracSetHalfwayBuffer(atracId, pucBufferAddr.rawAddress.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    libcPspSceAtracSetHalfwayBufferAndGetID(pucBufferAddr.rawAddress.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr, uiSecondBufferByte: UInt): Int =
    libcPspSceAtracSetSecondBuffer(atracId, pucSecondBufferAddr.rawAddress.toCPointer<ByteVar>(), uiSecondBufferByte)

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    libcPspSceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: MutPtr): Int =
    libcPspSceCtrlGetSamplingCycle(pcycle.rawAddress.toCPointer<ByteVar>())

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: MutPtr): Int =
    libcPspSceCtrlGetSamplingMode(pmode.rawAddress.toCPointer<ByteVar>())

public actual fun sceCtrlPeekBufferPositive(padData: MutPtr, count: Int): Int =
    libcPspSceCtrlPeekBufferPositive(padData.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekBufferNegative(padData: MutPtr, count: Int): Int =
    libcPspSceCtrlPeekBufferNegative(padData.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferPositive(padData: MutPtr, count: Int): Int =
    libcPspSceCtrlReadBufferPositive(padData.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferNegative(padData: MutPtr, count: Int): Int =
    libcPspSceCtrlReadBufferNegative(padData.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekLatch(latchData: MutPtr): Int =
    libcPspSceCtrlPeekLatch(latchData.rawAddress.toCPointer<ByteVar>())

public actual fun sceCtrlReadLatch(latchData: MutPtr): Int =
    libcPspSceCtrlReadLatch(latchData.rawAddress.toCPointer<ByteVar>())

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    libcPspSceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr, idleback: MutPtr): Int =
    libcPspSceCtrlGetIdleCancelThreshold(idlereset.rawAddress.toCPointer<ByteVar>(), idleback.rawAddress.toCPointer<ByteVar>())

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: MutPtr, pwidth: MutPtr, pheight: MutPtr): Int =
    libcPspSceDisplayGetMode(pmode.rawAddress.toCPointer<ByteVar>(), pwidth.rawAddress.toCPointer<ByteVar>(), pheight.rawAddress.toCPointer<ByteVar>())

public actual fun sceDisplaySetFrameBuf(topAddr: ConstPtr, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: MutPtr, bufferWidth: MutPtr, pixelFormat: MutPtr, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    libcPspSceDisplayGetVcount()

public actual fun sceDisplayWaitVblank(): Int =
    libcPspSceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    libcPspSceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    libcPspSceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    libcPspSceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    libcPspSceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    libcPspSceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    libcPspSceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    libcPspSceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    libcPspSceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    libcPspSceGeEdramGetSize()

public actual fun sceGeEdramGetAddr(): MutPtr =
    MutPtr(libcPspSceGeEdramGetAddr()?.toLong() ?: 0L)

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    libcPspSceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    libcPspSceGeGetCmd(cmd)

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: MutPtr): Int =
    libcPspSceGeGetStack(stackId, stack.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeSaveContext(context: MutPtr): Int =
    libcPspSceGeSaveContext(context.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeRestoreContext(context: ConstPtr): Int =
    libcPspSceGeRestoreContext(context.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeListEnQueue(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    libcPspSceGeListEnQueue(list.rawAddress.toCPointer<ByteVar>(), stall.rawAddress.toCPointer<ByteVar>(), cbid, arg.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeListEnQueueHead(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    libcPspSceGeListEnQueueHead(list.rawAddress.toCPointer<ByteVar>(), stall.rawAddress.toCPointer<ByteVar>(), cbid, arg.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeListDeQueue(qid: Int): Int =
    libcPspSceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr): Int =
    libcPspSceGeListUpdateStallAddr(qid, stall.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeBreak(mode: Int, pParam: MutPtr): Int =
    libcPspSceGeBreak(mode, pParam.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeContinue(): Int =
    libcPspSceGeContinue()

public actual fun sceGeSetCallback(cb: MutPtr): Int =
    libcPspSceGeSetCallback(cb.rawAddress.toCPointer<ByteVar>())

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    libcPspSceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    libcPspSceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: ConstPtr, param: MutPtr): Int =
    libcPspSceKernelLoadExec(file.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr =
    MutPtr(0L)

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    libcPspSceKernelTotalFreeMemSize()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    libcPspSceKernelMaxFreeMemSize()

public actual fun sceKernelDevkitVersion(): UInt =
    libcPspSceKernelDevkitVersion()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    libcPspSceKernelSetCompiledSdkVersion(version)

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    libcPspSceKernelGetCompiledSdkVersion()

public actual fun sceKernelLibcTime(t: MutPtr): Int =
    libcPspSceKernelLibcTime(t.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelLibcClock(): UInt =
    libcPspSceKernelLibcClock()

public actual fun sceKernelLibcGettimeofday(tp: MutPtr, tzp: MutPtr): Int =
    libcPspSceKernelLibcGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tzp.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelDcacheWritebackAll() {
    libcPspSceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    libcPspSceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: ConstPtr, size: UInt) {
    libcPspSceKernelDcacheWritebackRange(p.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr, size: UInt) {
    libcPspSceKernelDcacheWritebackInvalidateRange(p.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheInvalidateRange(p: ConstPtr, size: UInt) {
    libcPspSceKernelDcacheInvalidateRange(p.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelIcacheInvalidateAll() {
    libcPspSceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: ConstPtr, size: UInt) {
    libcPspSceKernelIcacheInvalidateRange(p.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelUtilsMt19937Init(ctx: MutPtr, seed: UInt): Int =
    libcPspSceKernelUtilsMt19937Init(ctx.rawAddress.toCPointer<ByteVar>(), seed)

public actual fun sceKernelUtilsMt19937UInt(ctx: MutPtr): UInt =
    libcPspSceKernelUtilsMt19937UInt(ctx.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    libcPspSceKernelUtilsMd5Digest(data.rawAddress.toCPointer<ByteVar>(), size, digest.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockInit(ctx: MutPtr): Int =
    libcPspSceKernelUtilsMd5BlockInit(ctx.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    libcPspSceKernelUtilsMd5BlockUpdate(ctx.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsMd5BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    libcPspSceKernelUtilsMd5BlockResult(ctx.rawAddress.toCPointer<ByteVar>(), digest.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    libcPspSceKernelUtilsSha1Digest(data.rawAddress.toCPointer<ByteVar>(), size, digest.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockInit(ctx: MutPtr): Int =
    libcPspSceKernelUtilsSha1BlockInit(ctx.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    libcPspSceKernelUtilsSha1BlockUpdate(ctx.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsSha1BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    libcPspSceKernelUtilsSha1BlockResult(ctx.rawAddress.toCPointer<ByteVar>(), digest.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr, arg: MutPtr): Int =
    libcPspSceKernelRegisterSubIntrHandler(intNo, no, handler.rawAddress.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    libcPspSceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    libcPspSceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    libcPspSceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    libcPspSceKernelCpuSuspendIntr()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    libcPspSceKernelCpuResumeIntr(flags)
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    libcPspSceKernelCpuResumeIntrWithSync(flags)
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    libcPspSceKernelIsCpuIntrSuspended(flags)

public actual fun sceKernelIsCpuIntrEnable(): Int =
    libcPspSceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleMs(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: MutPtr, flags: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    0

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    0

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    0

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: MutPtr): Int =
    libcPspSceKernelSelfStopUnloadModule(unknown, argSize, argp.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    libcPspSceKernelStopUnloadSelfModule(argSize, argp.rawAddress.toCPointer<ByteVar>(), status.rawAddress.toCPointer<ByteVar>(), option.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    libcPspSceKernelGetModuleIdList(readBuf.rawAddress.toCPointer<ByteVar>(), readBufSize, idCount.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    libcPspSceKernelVolatileMemLock(unk, ptr.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    libcPspSceKernelVolatileMemTryLock(unk, ptr.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    libcPspSceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    SceUid()

public actual fun sceKernelStdout(): SceUid =
    SceUid()

public actual fun sceKernelStderr(): SceUid =
    SceUid()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    SceKernelIdListType.entries.first()

public actual fun sceKernelCreateThread(name: ConstPtr, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: MutPtr): Int =
    0

public actual fun sceKernelExitThread(status: Int): Int =
    libcPspSceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    libcPspSceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    libcPspSceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    libcPspSceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    libcPspSceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    libcPspSceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    0

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    0

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: MutPtr): Int =
    0

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: MutPtr): Int =
    0

public actual fun sceKernelDelayThread(delay: UInt): Int =
    libcPspSceKernelDelayThread(delay)

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    libcPspSceKernelDelayThreadCB(delay)

public actual fun sceKernelDelaySysClockThread(delay: MutPtr): Int =
    libcPspSceKernelDelaySysClockThread(delay.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelDelaySysClockThreadCB(delay: MutPtr): Int =
    libcPspSceKernelDelaySysClockThreadCB(delay.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    libcPspSceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    libcPspSceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    libcPspSceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    libcPspSceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    libcPspSceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    0

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: MutPtr): Int =
    0

public actual fun sceKernelCreateSema(name: ConstPtr, attr: UInt, initVal: Int, maxVal: Int, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    0

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    0

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    0

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelCreateEventFlag(name: ConstPtr, attr: Int, bits: Int, opt: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr): Int =
    0

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    0

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: MutPtr): Int =
    0

public actual fun sceKernelCreateMbx(name: ConstPtr, attr: UInt, option: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    0

public actual fun sceKernelSendMbx(mbxId: SceUid, message: MutPtr): Int =
    0

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: MutPtr): Int =
    0

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: MutPtr): Int =
    0

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelSetSysClockAlarm(clock: MutPtr, handler: MutPtr, common: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    0

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelCreateCallback(name: ConstPtr, func: SceKernelCallbackFunction, arg: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: MutPtr): Int =
    0

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    0

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    0

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    0

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    0

public actual fun sceKernelCheckCallback(): Int =
    libcPspSceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    0

public actual fun sceKernelReferSystemStatus(status: MutPtr): Int =
    libcPspSceKernelReferSystemStatus(status.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelCreateMsgPipe(name: ConstPtr, part: Int, attr: Int, unk1: MutPtr, opt: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    0

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    0

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    0

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: MutPtr, recv: MutPtr): Int =
    0

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelCreateVpl(name: ConstPtr, part: Int, attr: Int, size: UInt, opt: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: MutPtr): Int =
    0

public actual fun sceKernelFreeVpl(uid: SceUid, data: MutPtr): Int =
    0

public actual fun sceKernelCancelVpl(uid: SceUid, num: MutPtr): Int =
    0

public actual fun sceKernelReferVplStatus(uid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelCreateFpl(name: ConstPtr, part: Int, attr: Int, size: UInt, blocks: UInt, opt: MutPtr): Int =
    libcPspSceKernelCreateFpl(name.rawAddress.toCPointer<ByteVar>(), part, attr, size, blocks, opt.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateFpl(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    0

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: MutPtr): Int =
    0

public actual fun sceKernelFreeFpl(uid: SceUid, data: MutPtr): Int =
    0

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: MutPtr): Int =
    0

public actual fun sceKernelReferFplStatus(uid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: MutPtr): Int =
    libcPspSceKernelUSec2SysClock(usec, clock.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    libcPspSceKernelUSec2SysClockWide(usec)

public actual fun sceKernelSysClock2USec(clock: MutPtr, low: MutPtr, high: MutPtr): Int =
    libcPspSceKernelSysClock2USec(clock.rawAddress.toCPointer<ByteVar>(), low.rawAddress.toCPointer<ByteVar>(), high.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr, high: MutPtr): Int =
    libcPspSceKernelSysClock2USecWide(clock, low.rawAddress.toCPointer<ByteVar>(), high.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTime(time: MutPtr): Int =
    libcPspSceKernelGetSystemTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTimeWide(): Long =
    libcPspSceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    libcPspSceKernelGetSystemTimeLow()

public actual fun sceKernelCreateVTimer(name: ConstPtr, opt: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: MutPtr): Int =
    0

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    0L

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: MutPtr): Int =
    0

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    0L

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: MutPtr): Int =
    0

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    0L

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: MutPtr, handler: SceKernelVTimerHandler, common: MutPtr): Int =
    0

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: MutPtr): Int =
    0

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelRegisterThreadEventHandler(name: ConstPtr, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: MutPtr): SceUid =
    SceUid()

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: MutPtr): Int =
    0

public actual fun sceKernelReferThreadProfiler(): MutPtr =
    MutPtr(libcPspSceKernelReferThreadProfiler()?.toLong() ?: 0L)

public actual fun sceKernelReferGlobalProfiler(): MutPtr =
    MutPtr(libcPspSceKernelReferGlobalProfiler()?.toLong() ?: 0L)

public actual fun sceUsbStart(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    libcPspSceUsbStart(driverName.rawAddress.toCPointer<ByteVar>(), size, args.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbStop(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    libcPspSceUsbStop(driverName.rawAddress.toCPointer<ByteVar>(), size, args.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbActivate(pid: UInt): Int =
    libcPspSceUsbActivate(pid)

public actual fun sceUsbDeactivate(pid: UInt): Int =
    libcPspSceUsbDeactivate(pid)

public actual fun sceUsbGetState(): Int =
    libcPspSceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: ConstPtr): Int =
    libcPspSceUsbGetDrvState(driverName.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStill(param: MutPtr): Int =
    libcPspSceUsbCamSetupStill(param.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStillEx(param: MutPtr): Int =
    libcPspSceUsbCamSetupStillEx(param.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamStillInputBlocking(buf: MutPtr, size: ULong): Int =
    libcPspSceUsbCamStillInputBlocking(buf.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillInput(buf: MutPtr, size: ULong): Int =
    libcPspSceUsbCamStillInput(buf.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    libcPspSceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    libcPspSceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    libcPspSceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    libcPspSceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    libcPspSceUsbCamSetupVideo(param.rawAddress.toCPointer<ByteVar>(), workArea.rawAddress.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    libcPspSceUsbCamSetupVideoEx(param.rawAddress.toCPointer<ByteVar>(), workArea.rawAddress.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    libcPspSceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    libcPspSceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr, size: ULong): Int =
    libcPspSceUsbCamReadVideoFrameBlocking(buf.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamReadVideoFrame(buf: MutPtr, size: ULong): Int =
    libcPspSceUsbCamReadVideoFrame(buf.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    libcPspSceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    libcPspSceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    libcPspSceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    libcPspSceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    libcPspSceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    libcPspSceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    libcPspSceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    libcPspSceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    libcPspSceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: MutPtr): Int =
    libcPspSceUsbCamGetSaturation(saturation.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetBrightness(brightness: MutPtr): Int =
    libcPspSceUsbCamGetBrightness(brightness.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetContrast(contrast: MutPtr): Int =
    libcPspSceUsbCamGetContrast(contrast.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetSharpness(sharpness: MutPtr): Int =
    libcPspSceUsbCamGetSharpness(sharpness.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetImageEffectMode(effectMode: MutPtr): Int =
    libcPspSceUsbCamGetImageEffectMode(effectMode.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetEvLevel(exposureLevel: MutPtr): Int =
    libcPspSceUsbCamGetEvLevel(exposureLevel.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetReverseMode(reverseFlags: MutPtr): Int =
    libcPspSceUsbCamGetReverseMode(reverseFlags.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamGetZoom(zoom: MutPtr): Int =
    libcPspSceUsbCamGetZoom(zoom.rawAddress.toCPointer<ByteVar>())

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    libcPspSceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    libcPspSceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    libcPspSceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    libcPspSceUsbstorBootUnregisterNotify(eventFlag)

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    libcPspSceUsbstorBootSetCapacity(size)

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    libcPspScePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    libcPspScePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    libcPspScePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    libcPspScePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    libcPspScePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    libcPspScePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    libcPspScePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    libcPspScePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    libcPspScePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    libcPspScePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    libcPspScePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    libcPspScePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    libcPspScePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    libcPspScePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    libcPspScePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    libcPspScePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    libcPspScePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    libcPspScePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    libcPspScePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    libcPspScePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    libcPspScePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    libcPspScePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    libcPspScePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    libcPspScePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    libcPspScePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    libcPspScePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    libcPspScePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    libcPspSceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    libcPspSceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: MutPtr): Int =
    libcPspSceWlanGetEtherAddr(etherAddr.rawAddress.toCPointer<ByteVar>())

public actual fun sceWlanDevAttach(): Int =
    libcPspSceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    libcPspSceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    libcPspSceRtcGetTickResolution()

public actual fun sceRtcGetCurrentTick(tick: MutPtr): Int =
    libcPspSceRtcGetCurrentTick(tick.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcGetCurrentClock(tm: MutPtr, tz: Int): Int =
    libcPspSceRtcGetCurrentClock(tm.rawAddress.toCPointer<ByteVar>(), tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: MutPtr): Int =
    libcPspSceRtcGetCurrentClockLocalTime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr, tickLocal: MutPtr): Int =
    libcPspSceRtcConvertUtcToLocalTime(tickUtc.rawAddress.toCPointer<ByteVar>(), tickLocal.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr, tickUtc: MutPtr): Int =
    libcPspSceRtcConvertLocalTimeToUTC(tickLocal.rawAddress.toCPointer<ByteVar>(), tickUtc.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcIsLeapYear(year: Int): Int =
    libcPspSceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    libcPspSceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    libcPspSceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: ConstPtr): Int =
    libcPspSceRtcCheckValid(date.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcSetTick(date: MutPtr, tick: ConstPtr): Int =
    libcPspSceRtcSetTick(date.rawAddress.toCPointer<ByteVar>(), tick.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcGetTick(date: ConstPtr, tick: MutPtr): Int =
    libcPspSceRtcGetTick(date.rawAddress.toCPointer<ByteVar>(), tick.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcCompareTick(tick1: ConstPtr, tick2: ConstPtr): Int =
    libcPspSceRtcCompareTick(tick1.rawAddress.toCPointer<ByteVar>(), tick2.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcTickAddTicks(destTick: MutPtr, srcTick: ConstPtr, numTicks: ULong): Int =
    libcPspSceRtcTickAddTicks(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numTicks)

public actual fun sceRtcTickAddMicroseconds(destTick: MutPtr, srcTick: ConstPtr, numMs: ULong): Int =
    libcPspSceRtcTickAddMicroseconds(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numMs)

public actual fun sceRtcTickAddSeconds(destTick: MutPtr, srcTick: ConstPtr, numSeconds: ULong): Int =
    libcPspSceRtcTickAddSeconds(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numSeconds)

public actual fun sceRtcTickAddMinutes(destTick: MutPtr, srcTick: ConstPtr, numMinutes: ULong): Int =
    libcPspSceRtcTickAddMinutes(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numMinutes)

public actual fun sceRtcTickAddHours(destTick: MutPtr, srcTick: ConstPtr, numHours: ULong): Int =
    libcPspSceRtcTickAddHours(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numHours)

public actual fun sceRtcTickAddDays(destTick: MutPtr, srcTick: ConstPtr, numDays: ULong): Int =
    libcPspSceRtcTickAddDays(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numDays)

public actual fun sceRtcTickAddWeeks(destTick: MutPtr, srcTick: ConstPtr, numWeeks: ULong): Int =
    libcPspSceRtcTickAddWeeks(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numWeeks)

public actual fun sceRtcTickAddMonths(destTick: MutPtr, srcTick: ConstPtr, numMonths: ULong): Int =
    libcPspSceRtcTickAddMonths(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numMonths)

public actual fun sceRtcTickAddYears(destTick: MutPtr, srcTick: ConstPtr, numYears: ULong): Int =
    libcPspSceRtcTickAddYears(destTick.rawAddress.toCPointer<ByteVar>(), srcTick.rawAddress.toCPointer<ByteVar>(), numYears)

public actual fun sceRtcSetTimeT(date: MutPtr, time: UInt): Int =
    libcPspSceRtcSetTimeT(date.rawAddress.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTimeT(date: ConstPtr, time: MutPtr): Int =
    libcPspSceRtcGetTimeT(date.rawAddress.toCPointer<ByteVar>(), time.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcSetTime64T(date: MutPtr, time: ULong): Int =
    libcPspSceRtcSetTime64T(date.rawAddress.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTime64T(date: ConstPtr, time: MutPtr): Int =
    libcPspSceRtcGetTime64T(date.rawAddress.toCPointer<ByteVar>(), time.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcSetDosTime(date: MutPtr, dosTime: UInt): Int =
    libcPspSceRtcSetDosTime(date.rawAddress.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcGetDosTime(date: MutPtr, dosTime: UInt): Int =
    libcPspSceRtcGetDosTime(date.rawAddress.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcSetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    libcPspSceRtcSetWin32FileTime(date.rawAddress.toCPointer<ByteVar>(), time.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcGetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    libcPspSceRtcGetWin32FileTime(date.rawAddress.toCPointer<ByteVar>(), time.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcParseDateTime(destTick: MutPtr, dateString: ConstPtr): Int =
    libcPspSceRtcParseDateTime(destTick.rawAddress.toCPointer<ByteVar>(), dateString.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC3339(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    libcPspSceRtcFormatRFC3339(pszDateTime.rawAddress.toCPointer<ByteVar>(), pUtc.rawAddress.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    libcPspSceRtcFormatRFC3339LocalTime(pszDateTime.rawAddress.toCPointer<ByteVar>(), pUtc.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcParseRFC3339(pUtc: MutPtr, pszDateTime: ConstPtr): Int =
    libcPspSceRtcParseRFC3339(pUtc.rawAddress.toCPointer<ByteVar>(), pszDateTime.rawAddress.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC2822(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    libcPspSceRtcFormatRFC2822(pszDateTime.rawAddress.toCPointer<ByteVar>(), pUtc.rawAddress.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    libcPspSceRtcFormatRFC2822LocalTime(pszDateTime.rawAddress.toCPointer<ByteVar>(), pUtc.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoOpen(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoOpenAsync(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoClose(fd: SceUid): Int =
    0

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    0

public actual fun sceIoRead(fd: SceUid, data: MutPtr, size: UInt): Int =
    0

public actual fun sceIoReadAsync(fd: SceUid, data: MutPtr, size: UInt): Int =
    0

public actual fun sceIoWrite(fd: SceUid, data: ConstPtr, size: ULong): Int =
    0

public actual fun sceIoWriteAsync(fd: SceUid, data: ConstPtr, size: UInt): Int =
    0

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    0L

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoRemove(file: ConstPtr): Int =
    libcPspSceIoRemove(file.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoMkdir(dir: ConstPtr, mode: IoPermissions): Int =
    libcPspSceIoMkdir(dir.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun sceIoRmdir(path: ConstPtr): Int =
    libcPspSceIoRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoChdir(path: ConstPtr): Int =
    libcPspSceIoChdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoRename(oldname: ConstPtr, newname: ConstPtr): Int =
    libcPspSceIoRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoDopen(dirname: ConstPtr): SceUid =
    SceUid()

public actual fun sceIoDread(fd: SceUid, dir: MutPtr): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: ConstPtr, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    libcPspSceIoDevctl(dev.rawAddress.toCPointer<ByteVar>(), cmd, indata.rawAddress.toCPointer<ByteVar>(), inlen, outdata.rawAddress.toCPointer<ByteVar>(), outlen)

public actual fun sceIoAssign(dev1: ConstPtr, dev2: ConstPtr, dev3: ConstPtr, mode: IoAssignPerms, unk1: MutPtr, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: ConstPtr): Int =
    libcPspSceIoUnassign(dev.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoGetstat(file: ConstPtr, stat: MutPtr): Int =
    libcPspSceIoGetstat(file.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>())

public actual fun sceIoChstat(file: ConstPtr, stat: MutPtr, bits: Int): Int =
    libcPspSceIoChstat(file.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>(), bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    0

public actual fun sceIoSync(device: ConstPtr, unk: UInt): Int =
    libcPspSceIoSync(device.rawAddress.toCPointer<ByteVar>(), unk)

public actual fun sceIoWaitAsync(fd: SceUid, res: MutPtr): Int =
    0

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: MutPtr): Int =
    0

public actual fun sceIoPollAsync(fd: SceUid, res: MutPtr): Int =
    0

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: MutPtr): Int =
    0

public actual fun sceIoCancel(fd: SceUid): Int =
    0

public actual fun sceIoGetDevType(fd: SceUid): Int =
    0

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    0

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: MutPtr): Int =
    0

public actual fun sceJpegInitMJpeg(): Int =
    libcPspSceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    libcPspSceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    libcPspSceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    libcPspSceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: MutPtr, size: ULong, rgba: MutPtr, unk: UInt): Int =
    libcPspSceJpegDecodeMJpeg(jpegBuf.rawAddress.toCPointer<ByteVar>(), size, rgba.rawAddress.toCPointer<ByteVar>(), unk)

public actual fun sceUmdCheckMedium(): Int =
    libcPspSceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: MutPtr): Int =
    libcPspSceUmdGetDiscInfo(info.rawAddress.toCPointer<ByteVar>())

public actual fun sceUmdActivate(unit: Int, drive: ConstPtr): Int =
    libcPspSceUmdActivate(unit, drive.rawAddress.toCPointer<ByteVar>())

public actual fun sceUmdDeactivate(unit: Int, drive: ConstPtr): Int =
    libcPspSceUmdDeactivate(unit, drive.rawAddress.toCPointer<ByteVar>())

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    libcPspSceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    libcPspSceUmdWaitDriveStatWithTimer(state, timeout)

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    libcPspSceUmdWaitDriveStatCB(state, timeout)

public actual fun sceUmdCancelWaitDriveStat(): Int =
    libcPspSceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    libcPspSceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    libcPspSceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    libcPspSceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    libcPspSceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    libcPspSceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    libcPspSceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    libcPspSceMpegInit()

public actual fun sceMpegFinish() {
    libcPspSceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    libcPspSceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: MutPtr, packets: Int, data: MutPtr, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr): Int =
    libcPspSceMpegRingbufferConstruct(ringbuffer.rawAddress.toCPointer<ByteVar>(), packets, data.rawAddress.toCPointer<ByteVar>(), size, 0L.toCPointer<ByteVar>(), cbParam.rawAddress.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferDestruct(ringbuffer: MutPtr) {
    libcPspSceMpegRingbufferDestruct(ringbuffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr): Int =
    libcPspSceMpegRingbufferAvailableSize(ringbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferPut(ringbuffer: MutPtr, numPackets: Int, available: Int): Int =
    libcPspSceMpegRingbufferPut(ringbuffer.rawAddress.toCPointer<ByteVar>(), numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    libcPspSceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: MutPtr, size: Int, ringbuffer: MutPtr, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr, offset: MutPtr): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: MutPtr, size: MutPtr): Int =
    libcPspSceMpegQueryStreamSize(buffer.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    SceMpegStream()

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    0

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): MutPtr =
    MutPtr(0L)

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: MutPtr) {
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: MutPtr, outSize: MutPtr): Int =
    0

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: MutPtr, au: MutPtr): Int =
    0

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    0

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: MutPtr): Int =
    0

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: MutPtr, iframeWidth: Int, buffer: MutPtr, init: MutPtr): Int =
    0

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: MutPtr, status: MutPtr): Int =
    0

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    0

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: MutPtr, buffer: MutPtr, init: Int): Int =
    0

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: MutPtr, buffer: MutPtr, type: Int): Int =
    libcPspSceMpegBaseYCrCbCopyVme(yuvBuffer.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    libcPspSceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: MutPtr, rgbBuffer2: MutPtr, width: Int, yCrCbBuffer: MutPtr): Int =
    libcPspSceMpegBaseCscVme(rgbBuffer.rawAddress.toCPointer<ByteVar>(), rgbBuffer2.rawAddress.toCPointer<ByteVar>(), width, yCrCbBuffer.rawAddress.toCPointer<ByteVar>())

public actual fun sceMpegbaseBea18f91(lli: MutPtr): Int =
    libcPspSceMpegbaseBea18f91(lli.rawAddress.toCPointer<ByteVar>())

public actual fun sceHprmPeekCurrentKey(key: MutPtr): Int =
    libcPspSceHprmPeekCurrentKey(key.rawAddress.toCPointer<ByteVar>())

public actual fun sceHprmPeekLatch(latch: MutPtr): Int =
    libcPspSceHprmPeekLatch(latch.rawAddress.toCPointer<ByteVar>())

public actual fun sceHprmReadLatch(latch: MutPtr): Int =
    libcPspSceHprmReadLatch(latch.rawAddress.toCPointer<ByteVar>())

public actual fun sceHprmIsHeadphoneExist(): Int =
    libcPspSceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    libcPspSceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    libcPspSceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: MutPtr, zbw: Int) {
    libcPspSceGuDepthBuffer(zbp.rawAddress.toCPointer<ByteVar>(), zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr, dispbw: Int) {
    libcPspSceGuDispBuffer(width, height, dispbp.rawAddress.toCPointer<ByteVar>(), dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    libcPspSceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
    libcPspSceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    libcPspSceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    libcPspSceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    libcPspSceGuFog(near, far, color)
}

public actual fun sceGuInit() {
    libcPspSceGuInit()
}

public actual fun sceGuTerm() {
    libcPspSceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    libcPspSceGuBreak(mode)
}

public actual fun sceGuContinue() {
    libcPspSceGuContinue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    null

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
}

public actual fun sceGuGetMemory(size: Int): MutPtr =
    MutPtr(libcPspSceGuGetMemory(size)?.toLong() ?: 0L)

public actual fun sceGuStart(contextType: GuContextType, list: MutPtr) {
}

public actual fun sceGuFinish(): Int =
    libcPspSceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    libcPspSceGuFinishId(id)

public actual fun sceGuCallList(list: ConstPtr) {
    libcPspSceGuCallList(list.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGuCallMode(mode: Int) {
    libcPspSceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    libcPspSceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: ConstPtr, context: MutPtr) {
}

public actual fun sceGuSwapBuffers(): MutPtr =
    MutPtr(libcPspSceGuSwapBuffers()?.toLong() ?: 0L)

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    GeListState.entries.first()

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr) {
    libcPspSceGuBeginObject(vtype, count, indices.rawAddress.toCPointer<ByteVar>(), vertices.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGuEndObject() {
    libcPspSceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
    libcPspSceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    libcPspSceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    libcPspSceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    libcPspSceGuLightColor(light, component, color)
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
    libcPspSceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    libcPspSceGuClearColor(color)
}

public actual fun sceGuClearDepth(depth: UInt) {
    libcPspSceGuClearDepth(depth)
}

public actual fun sceGuClearStencil(stencil: UInt) {
    libcPspSceGuClearStencil(stencil)
}

public actual fun sceGuPixelMask(mask: UInt) {
    libcPspSceGuPixelMask(mask)
}

public actual fun sceGuColor(color: UInt) {
    libcPspSceGuColor(color)
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
    libcPspSceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
    libcPspSceGuAmbient(color)
}

public actual fun sceGuAmbientColor(color: UInt) {
    libcPspSceGuAmbientColor(color)
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    libcPspSceGuMaterial(components, color)
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    libcPspSceGuModelColor(emissive, ambient, diffuse, specular)
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
    libcPspSceGuSpecular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: MutPtr, dx: Int, dy: Int, destw: Int, dest: MutPtr) {
}

public actual fun sceGuTexEnvColor(color: UInt) {
    libcPspSceGuTexEnvColor(color)
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
    libcPspSceGuTexFlush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: ConstPtr) {
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    libcPspSceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    libcPspSceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    libcPspSceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    libcPspSceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr) {
    libcPspSceGuClutLoad(numBlocks, cbp.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    libcPspSceGuOffset(x, y)
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    libcPspSceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    libcPspSceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    libcPspSceGuDrawBezier(vType, uCount, vCount, indices.rawAddress.toCPointer<ByteVar>(), vertices.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    libcPspSceGuPatchDivide(ulevel, vlevel)
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    libcPspSceGuPatchFrontFace(a0)
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    libcPspSceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toCPointer<ByteVar>(), vertices.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    libcPspSceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr, vertices: ConstPtr) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    libcPspSceGumDrawBezier(vType, uCount, vCount, indices.rawAddress.toCPointer<ByteVar>(), vertices.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    libcPspSceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toCPointer<ByteVar>(), vertices.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceGumFastInverse() {
    libcPspSceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    libcPspSceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    libcPspSceGumLoadIdentity()
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    libcPspSceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    libcPspSceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    libcPspSceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    libcPspSceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    libcPspSceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    libcPspSceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    libcPspSceGumRotateZ(angle)
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
}

public actual fun sceGumScale(v: ScePspFVector3) {
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
}

public actual fun sceGumUpdateMatrix() {
    libcPspSceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: MutPtr): Int =
    libcPspSceMp3ReserveMp3Handle(args.rawAddress.toCPointer<ByteVar>())

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    libcPspSceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    libcPspSceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    0

public actual fun sceMp3Decode(handle: Mp3Handle, dst: MutPtr): Int =
    0

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: MutPtr, toWrite: MutPtr, srcPos: MutPtr): Int =
    0

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    0

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    0

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    0

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    0

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    0

public actual fun sceRegOpenRegistry(reg: MutPtr, mode: Int, handle: MutPtr): Int =
    libcPspSceRegOpenRegistry(reg.rawAddress.toCPointer<ByteVar>(), mode, handle.rawAddress.toCPointer<ByteVar>())

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegOpenCategory(handle: RegHandle, name: ConstPtr, mode: Int, dirHandle: MutPtr): Int =
    0

public actual fun sceRegRemoveCategory(handle: RegHandle, name: ConstPtr): Int =
    0

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: ConstPtr, keyHandle: MutPtr, type: MutPtr, size: MutPtr): Int =
    0

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: ConstPtr, type: MutPtr, size: MutPtr): Int =
    0

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: MutPtr, size: ULong): Int =
    0

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: ConstPtr, buf: MutPtr, size: ULong): Int =
    0

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: ConstPtr, buf: ConstPtr, size: ULong): Int =
    0

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: MutPtr): Int =
    0

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: MutPtr, num: Int): Int =
    0

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: ConstPtr, type: Int, size: ULong): Int =
    0

public actual fun sceRegRemoveRegistry(key: MutPtr): Int =
    libcPspSceRegRemoveRegistry(key.rawAddress.toCPointer<ByteVar>())

public actual fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr): Int =
    libcPspSceOpenPSIDGetOpenPSID(openpsid.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogInitStart(params: MutPtr): Int =
    libcPspSceUtilityMsgDialogInitStart(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogShutdownStart() {
    libcPspSceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    libcPspSceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    libcPspSceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    libcPspSceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: MutPtr): Int =
    libcPspSceUtilityNetconfInitStart(data.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityNetconfShutdownStart(): Int =
    libcPspSceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    libcPspSceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    libcPspSceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    libcPspSceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: MutPtr): Int =
    libcPspSceUtilitySavedataInitStart(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilitySavedataGetStatus(): Int =
    libcPspSceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    libcPspSceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    libcPspSceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: MutPtr): Int =
    libcPspSceUtilityGameSharingInitStart(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityGameSharingShutdownStart() {
    libcPspSceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    libcPspSceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    libcPspSceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: MutPtr): Int =
    libcPspSceUtilityHtmlViewerInitStart(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    libcPspSceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    libcPspSceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    libcPspSceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: MutPtr): Int =
    libcPspSceUtilityOskInitStart(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceUtilityOskShutdownStart(): Int =
    libcPspSceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    libcPspSceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    libcPspSceUtilityOskGetStatus()

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    0

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    0

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    0

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    0

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    0

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    0

public actual fun sceUtilityLoadModule(module: Module): Int =
    0

public actual fun sceUtilityUnloadModule(module: Module): Int =
    0

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    libcPspSceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    libcPspSceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    libcPspSceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    libcPspSceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    libcPspSceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    libcPspSceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    libcPspSceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: MutPtr, mac: MutPtr) {
    libcPspSceNetEtherStrton(name.rawAddress.toCPointer<ByteVar>(), mac.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceNetEtherNtostr(mac: MutPtr, name: MutPtr) {
    libcPspSceNetEtherNtostr(mac.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
}

public actual fun sceNetGetLocalEtherAddr(mac: MutPtr): Int =
    libcPspSceNetGetLocalEtherAddr(mac.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetGetMallocStat(stat: MutPtr): Int =
    libcPspSceNetGetMallocStat(stat.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr): Int =
    libcPspSceNetAdhocctlInit(stacksize, priority, adhocId.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlTerm(): Int =
    libcPspSceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: ConstPtr): Int =
    libcPspSceNetAdhocctlConnect(name.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDisconnect(): Int =
    libcPspSceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: MutPtr): Int =
    libcPspSceNetAdhocctlGetState(event.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreate(name: ConstPtr): Int =
    libcPspSceNetAdhocctlCreate(name.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlJoin(scaninfo: MutPtr): Int =
    libcPspSceNetAdhocctlJoin(scaninfo.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAdhocId(id: MutPtr): Int =
    libcPspSceNetAdhocctlGetAdhocId(id.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr, unknown: Int, num: Int, macs: MutPtr, timeout: UInt, unknown2: Int): Int =
    libcPspSceNetAdhocctlCreateEnterGameMode(name.rawAddress.toCPointer<ByteVar>(), unknown, num, macs.rawAddress.toCPointer<ByteVar>(), timeout, unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr, hostmac: MutPtr, timeout: UInt, unknown: Int): Int =
    libcPspSceNetAdhocctlJoinEnterGameMode(name.rawAddress.toCPointer<ByteVar>(), hostmac.rawAddress.toCPointer<ByteVar>(), timeout, unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr): Int =
    libcPspSceNetAdhocctlGetGameModeInfo(gamemodeinfo.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlExitGameMode(): Int =
    libcPspSceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: MutPtr, buf: MutPtr): Int =
    libcPspSceNetAdhocctlGetPeerList(length.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetPeerInfo(mac: MutPtr, size: Int, peerinfo: MutPtr): Int =
    libcPspSceNetAdhocctlGetPeerInfo(mac.rawAddress.toCPointer<ByteVar>(), size, peerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlScan(): Int =
    libcPspSceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: MutPtr, buf: MutPtr): Int =
    libcPspSceNetAdhocctlGetScanInfo(length.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr): Int =
    libcPspSceNetAdhocctlAddHandler(0L.toCPointer<ByteVar>(), unknown.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    libcPspSceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: MutPtr, nickname: MutPtr): Int =
    libcPspSceNetAdhocctlGetNameByAddr(mac.rawAddress.toCPointer<ByteVar>(), nickname.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAddrByName(nickname: MutPtr, length: MutPtr, buf: MutPtr): Int =
    libcPspSceNetAdhocctlGetAddrByName(nickname.rawAddress.toCPointer<ByteVar>(), length.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetParameter(params: MutPtr): Int =
    libcPspSceNetAdhocctlGetParameter(params.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocInit(): Int =
    libcPspSceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    libcPspSceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: MutPtr, port: UShort, bufSize: UInt, unk1: Int): Int =
    libcPspSceNetAdhocPdpCreate(mac.rawAddress.toCPointer<ByteVar>(), port, bufSize, unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    libcPspSceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr, port: UShort, data: MutPtr, len: UInt, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPdpSend(id, destMacAddr.rawAddress.toCPointer<ByteVar>(), port, data.rawAddress.toCPointer<ByteVar>(), len, timeout, nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr, port: MutPtr, data: MutPtr, dataLength: MutPtr, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPdpRecv(id, srcMacAddr.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), dataLength.rawAddress.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocGetPdpStat(size: MutPtr, stat: MutPtr): Int =
    libcPspSceNetAdhocGetPdpStat(size.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocGameModeCreateMaster(data: MutPtr, size: Int): Int =
    libcPspSceNetAdhocGameModeCreateMaster(data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: MutPtr, data: MutPtr, size: Int): Int =
    libcPspSceNetAdhocGameModeCreateReplica(mac.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    libcPspSceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    libcPspSceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    libcPspSceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    libcPspSceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: MutPtr, srcport: UShort, destmac: MutPtr, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    libcPspSceNetAdhocPtpOpen(srcmac.rawAddress.toCPointer<ByteVar>(), srcport, destmac.rawAddress.toCPointer<ByteVar>(), destport, bufSize, delay, count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPtpConnect(id, timeout, nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: MutPtr, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    libcPspSceNetAdhocPtpListen(srcmac.rawAddress.toCPointer<ByteVar>(), srcport, bufSize, delay, count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr, port: MutPtr, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPtpAccept(id, mac.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPtpSend(id, data.rawAddress.toCPointer<ByteVar>(), dataSize.rawAddress.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPtpRecv(id, data.rawAddress.toCPointer<ByteVar>(), dataSize.rawAddress.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    libcPspSceNetAdhocPtpFlush(id, timeout, nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    libcPspSceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: MutPtr, stat: MutPtr): Int =
    libcPspSceNetAdhocGetPtpStat(size.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    libcPspSceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    libcPspSceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    libcPspSceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr): Int =
    libcPspSceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    libcPspSceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    libcPspSceNetAdhocMatchingSelectTarget(matchingId, mac.rawAddress.toCPointer<ByteVar>(), optLen, optData.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr): Int =
    libcPspSceNetAdhocMatchingCancelTarget(matchingId, mac.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    libcPspSceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac.rawAddress.toCPointer<ByteVar>(), optLen, optData.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr, dataLen: Int, data: MutPtr): Int =
    libcPspSceNetAdhocMatchingSendData(matchingId, mac.rawAddress.toCPointer<ByteVar>(), dataLen, data.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr): Int =
    libcPspSceNetAdhocMatchingAbortSendData(matchingId, mac.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr): Int =
    libcPspSceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr, optData: MutPtr): Int =
    libcPspSceNetAdhocMatchingGetHelloOpt(matchingId, optLen.rawAddress.toCPointer<ByteVar>(), optData.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr, buf: MutPtr): Int =
    libcPspSceNetAdhocMatchingGetMembers(matchingId, length.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    libcPspSceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr): Int =
    libcPspSceNetAdhocMatchingGetPoolStat(poolstat.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    libcPspSceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    libcPspSceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr): Int =
    libcPspSceNetApctlAddHandler(0L.toCPointer<ByteVar>(), parg.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    libcPspSceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    libcPspSceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    libcPspSceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: MutPtr): Int =
    libcPspSceNetApctlGetState(pstate.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetInetInit(): Int =
    libcPspSceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    libcPspSceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: MutPtr, addrLen: MutPtr): Int =
    libcPspSceNetInetAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrLen.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetInetBind(s: Int, myAddr: ConstPtr, addrLen: SocklenT): Int =
    libcPspSceNetInetBind(s, myAddr.rawAddress.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetConnect(s: Int, servAddr: ConstPtr, addrLen: SocklenT): Int =
    libcPspSceNetInetConnect(s, servAddr.rawAddress.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr, optlEn: MutPtr): Int =
    libcPspSceNetInetGetsockopt(s, level, optName, optVal.rawAddress.toCPointer<ByteVar>(), optlEn.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    libcPspSceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: MutPtr, len: ULong, flags: Int): ULong =
    libcPspSceNetInetRecv(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetRecvfrom(s: Int, buf: MutPtr, flags: ULong, arg1: Int, from: MutPtr, fromLen: MutPtr): ULong =
    libcPspSceNetInetRecvfrom(s, buf.rawAddress.toCPointer<ByteVar>(), flags, arg1, from.rawAddress.toCPointer<ByteVar>(), fromLen.rawAddress.toCPointer<ByteVar>())

public actual fun sceNetInetSend(s: Int, buf: ConstPtr, len: ULong, flags: Int): ULong =
    libcPspSceNetInetSend(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetSendto(s: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, toLen: SocklenT): ULong =
    libcPspSceNetInetSendto(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags, to.rawAddress.toCPointer<ByteVar>(), toLen)

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr, optLen: SocklenT): Int =
    libcPspSceNetInetSetsockopt(s, level, optName, optVal.rawAddress.toCPointer<ByteVar>(), optLen)

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    libcPspSceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    libcPspSceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    libcPspSceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    libcPspSceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    libcPspSceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    libcPspSceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: MutPtr): Int =
    libcPspSceSslGetUsedMemoryMax(memory.rawAddress.toCPointer<ByteVar>())

public actual fun sceSslGetUsedMemoryCurrent(memory: MutPtr): Int =
    libcPspSceSslGetUsedMemoryCurrent(memory.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpInit(unknown1: UInt): Int =
    libcPspSceHttpInit(unknown1)

public actual fun sceHttpEnd(): Int =
    libcPspSceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: MutPtr, unknown1: Int, unknown2: Int): Int =
    libcPspSceHttpCreateTemplate(agent.rawAddress.toCPointer<ByteVar>(), unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    libcPspSceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: MutPtr, unknown1: MutPtr, port: UShort, unknown2: Int): Int =
    libcPspSceHttpCreateConnection(templateid, host.rawAddress.toCPointer<ByteVar>(), unknown1.rawAddress.toCPointer<ByteVar>(), port, unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr, unknown1: Int): Int =
    libcPspSceHttpCreateConnectionWithURL(templateid, url.rawAddress.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    libcPspSceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    libcPspSceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    libcPspSceHttpSendRequest(requestId, data.rawAddress.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    libcPspSceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    libcPspSceHttpReadData(requestId, data.rawAddress.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr): Int =
    libcPspSceHttpGetContentLength(requestId, contentLength.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr): Int =
    libcPspSceHttpGetStatusCode(requestId, statusCode.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    libcPspSceHttpSetResolveTimeOut(id, timeout)

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    libcPspSceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    libcPspSceHttpSetConnectTimeOut(id, timeout)

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    libcPspSceHttpSetSendTimeOut(id, timeout)

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    libcPspSceHttpSetRecvTimeOut(id, timeout)

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    libcPspSceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    libcPspSceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    libcPspSceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    libcPspSceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    libcPspSceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    libcPspSceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    libcPspSceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    libcPspSceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: MutPtr, value: MutPtr, unknown1: Int): Int =
    libcPspSceHttpAddExtraHeader(id, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: ConstPtr): Int =
    libcPspSceHttpDeleteHeader(id, name.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    libcPspSceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    libcPspSceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    libcPspSceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    libcPspSceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    libcPspSceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    libcPspSceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    libcPspSceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    libcPspSceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: MutPtr, headerSize: MutPtr): Int =
    libcPspSceHttpGetAllHeader(request, header.rawAddress.toCPointer<ByteVar>(), headerSize.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr): Int =
    libcPspSceHttpGetNetworkErrno(request, errNum.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpGetProxy(id: Int, activateFlag: MutPtr, mode: MutPtr, proxyHost: MutPtr, len: ULong, proxyPort: MutPtr): Int =
    libcPspSceHttpGetProxy(id, activateFlag.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), proxyHost.rawAddress.toCPointer<ByteVar>(), len, proxyPort.rawAddress.toCPointer<ByteVar>())

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    libcPspSceHttpInitCache(maxSize)

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    libcPspSceHttpSetAuthInfoCB(id, 0L.toCPointer<ByteVar>())

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr, newProxyPort: UShort): Int =
    libcPspSceHttpSetProxy(id, activateFlag, mode, newProxyHost.rawAddress.toCPointer<ByteVar>(), newProxyPort)

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    libcPspSceHttpSetResHeaderMaxSize(id, headerSize)

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    libcPspSceHttpSetMallocFunction(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun sceNetResolverInit(): Int =
    libcPspSceNetResolverInit()

public actual fun sceNetResolverCreate(rid: MutPtr, buf: MutPtr, bufLength: UInt): Int =
    libcPspSceNetResolverCreate(rid.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufLength)

public actual fun sceNetResolverDelete(rid: Int): Int =
    libcPspSceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr, addr: MutPtr, timeout: UInt, retry: Int): Int =
    libcPspSceNetResolverStartNtoA(rid, hostname.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>(), timeout, retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr, hostname: MutPtr, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    libcPspSceNetResolverStartAtoN(rid, addr.rawAddress.toCPointer<ByteVar>(), hostname.rawAddress.toCPointer<ByteVar>(), hostnameLen, timeout, retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    libcPspSceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    libcPspSceNetResolverTerm()
