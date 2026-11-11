@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracAddStreamData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracDecodeData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetAtracID
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetBitrate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetBufferInfoForReseting
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetChannel
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetInternalErrorInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetLoopStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetMaxSample
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetNextDecodePosition
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetNextSample
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetRemainFrame
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetSecondBufferInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetSoundSample
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetStreamDataInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracReleaseAtracID
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracResetPlayPosition
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetDataAndGetID
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetHalfwayBuffer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetHalfwayBufferAndGetID
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetLoopNum
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetSecondBuffer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioChRelease
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioChangeChannelVolume
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetChannelRestLen
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetChannelRestLength
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetInputLength
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioInputInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioInputInitEx
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2ChangeLength
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2GetRestSample
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2OutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2Release
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2Reserve
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputPanned
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputPannedBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioPollInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSRCChRelease
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSRCOutputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSetChannelDataLen
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioWaitInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetIdleCancelThreshold
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetSamplingCycle
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetSamplingMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekBufferNegative
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekBufferPositive
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekLatch
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadBufferNegative
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadBufferPositive
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadLatch
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlSetIdleCancelThreshold
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlSetSamplingCycle
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetAccumulatedHcount
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetCurrentHcount
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetFramePerSec
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetVcount
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayIsForeground
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayIsVblank
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblank
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankStartCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeBreak
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeContinue
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramGetAddr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramGetSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramSetAddrTranslation
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeGetCmd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeGetStack
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListDeQueue
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListEnQueue
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListEnQueueHead
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListUpdateStallAddr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeRestoreContext
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeSaveContext
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeSetCallback
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeUnsetCallback
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuAmbient
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuAmbientColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuBeginObject
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuBreak
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCallList
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCallMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCheckList
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClear
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearDepth
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearStencil
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClutLoad
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuColorMaterial
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuContinue
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthBuffer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthMask
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthOffset
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthRange
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDispBuffer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDisplay
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDrawBezier
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDrawSpline
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuEndObject
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFinish
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFinishId
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFog
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuGetAllStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuGetMemory
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuLightAtt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuLightColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuMaterial
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuModelColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuMorphWeight
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuOffset
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPatchDivide
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPatchFrontFace
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPixelMask
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuScissor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSetAllStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSpecular
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSwapBuffers
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexEnvColor
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexFlush
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexOffset
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexScale
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexSlope
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexSync
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuViewport
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumDrawBezier
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumDrawSpline
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumFastInverse
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumFullInverse
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumLoadIdentity
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumOrtho
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPerspective
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPopMatrix
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPushMatrix
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateX
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateY
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateZ
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumUpdateMatrix
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsHeadphoneExist
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsMicrophoneExist
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsRemoteExist
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmPeekCurrentKey
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmPeekLatch
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmReadLatch
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpAbortRequest
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpAddExtraHeader
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateConnection
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateConnectionWithURL
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateTemplate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteConnection
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteHeader
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteRequest
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteTemplate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableAuth
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableCache
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableCookie
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableKeepAlive
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableRedirect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableAuth
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableCache
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableCookie
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableKeepAlive
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableRedirect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEndCache
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetAllHeader
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetContentLength
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetNetworkErrno
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetProxy
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetStatusCode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpInitCache
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpLoadSystemCookie
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpReadData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSaveSystemCookie
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSendRequest
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetAuthInfoCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetConnectTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetMallocFunction
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetProxy
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetRecvTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResHeaderMaxSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResolveRetry
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResolveTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetSendTimeOut
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsLoadDefaultCert
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoChdir
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoChstat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoDevctl
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoGetstat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoMkdir
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRemove
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRename
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRmdir
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoSync
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoUnassign
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegCreateMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegDecodeMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegDeleteMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegFinishMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegInitMJpeg
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelChangeCurrentThreadAttr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCheckCallback
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCheckThreadStack
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuResumeIntr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuResumeIntrWithSync
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuSuspendIntr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCreateFpl
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackAll
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackInvalidateAll
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackRange
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelaySysClockThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelaySysClockThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelayThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelayThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDevkitVersion
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDisableSubIntr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelEnableSubIntr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitDeleteThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitGame
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetCompiledSdkVersion
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetModuleIdList
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTimeLow
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTimeWide
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetThreadCurrentPriority
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetThreadId
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIcacheInvalidateAll
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIcacheInvalidateRange
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIsCpuIntrEnable
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIsCpuIntrSuspended
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcClock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcGettimeofday
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLoadExec
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelMaxFreeMemSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferGlobalProfiler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferSystemStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferThreadProfiler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelRegisterSubIntrHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReleaseSubIntrHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelResumeDispatchThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelRotateThreadReadyQueue
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSelfStopUnloadModule
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSetCompiledSdkVersion
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSleepThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSleepThreadCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelStopUnloadSelfModule
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSuspendDispatchThread
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSysClock2USec
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSysClock2USecWide
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelTotalFreeMemSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUSec2SysClock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUSec2SysClockWide
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockResult
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5Digest
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMt19937Init
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMt19937UInt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockResult
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1Digest
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemLock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemTryLock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemUnlock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3InitResource
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3ReserveMp3Handle
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3TermResource
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseCscInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseCscVme
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseYCrCbCopyVme
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegFinish
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegQueryMemSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegQueryStreamSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferAvailableSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferConstruct
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferDestruct
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferPut
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferQueryMemSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegbaseBea18f91
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeCreateMaster
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeCreateReplica
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeDeleteMaster
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeDeleteReplica
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeUpdateMaster
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeUpdateReplica
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGetPdpStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGetPtpStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingAbortSendData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingCancelTarget
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingCancelTargetWithOpt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingDelete
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetHelloOpt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetMembers
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetPoolStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSelectTarget
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSendData
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSetHelloOpt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingStop
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpCreate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpDelete
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpRecv
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpSend
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpAccept
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpClose
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpConnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpFlush
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpListen
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpOpen
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpRecv
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpSend
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlAddHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlConnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlCreate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlCreateEnterGameMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlDelHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlDisconnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlExitGameMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetAddrByName
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetAdhocId
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetGameModeInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetNameByAddr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetParameter
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetPeerInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetPeerList
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetScanInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetState
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlJoin
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlJoinEnterGameMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlScan
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlAddHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlConnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlDelHandler
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlDisconnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlGetState
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetEtherNtostr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetEtherStrton
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetFreeThreadinfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetGetLocalEtherAddr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetGetMallocStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetAccept
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetBind
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetClose
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetConnect
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetGetErrno
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetGetsockopt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetListen
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetRecv
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetRecvfrom
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSend
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSendto
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSetsockopt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetShutdown
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSocket
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverCreate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverDelete
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStartAtoN
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStartNtoA
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStop
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetTerm
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetThreadAbort
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceOpenPSIDGetOpenPSID
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryChargingStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryElec
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryLifePercent
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryLifeTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryTemp
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryVolt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequencyFloat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequencyInt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequencyFloat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequencyInt
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetIdleTimer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIdleTimerDisable
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIdleTimerEnable
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsBatteryCharging
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsBatteryExist
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsLowBattery
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsPowerOnline
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerLock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerRequestStandby
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerRequestSuspend
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetBusClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetCpuClockFrequency
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerUnlock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerUnregisterCallback
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRegOpenRegistry
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRegRemoveRegistry
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcCheckValid
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcCompareTick
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcConvertLocalTimeToUTC
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcConvertUtcToLocalTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC2822
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC2822LocalTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC3339
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC3339LocalTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentClock
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentClockLocalTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentTick
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDayOfWeek
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDaysInMonth
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDosTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTick
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTickResolution
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTime64T
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTimeT
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetWin32FileTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcIsLeapYear
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcParseDateTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcParseRFC3339
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetDosTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTick
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTime64T
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTimeT
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetWin32FileTime
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddDays
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddHours
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMicroseconds
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMinutes
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMonths
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddSeconds
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddTicks
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddWeeks
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddYears
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslGetUsedMemoryCurrent
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslGetUsedMemoryMax
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslInit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdActivate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdCancelWaitDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdCheckMedium
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdDeactivate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetDiscInfo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetErrorStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdRegisterUMDCallBack
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdReplacePermit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdReplaceProhibit
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdUnRegisterUMDCallBack
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStat
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStatCB
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStatWithTimer
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbActivate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamAutoImageReverseSW
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetAutoImageReverseState
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetBrightness
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetContrast
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetEvLevel
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetImageEffectMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetLensDirection
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetReadVideoFrameSize
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetReverseMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetSaturation
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetSharpness
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetZoom
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamPollReadVideoFrameEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamReadVideoFrame
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamReadVideoFrameBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetBrightness
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetContrast
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetReverseMode
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetSaturation
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetSharpness
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetZoom
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupStill
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupStillEx
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupVideo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupVideoEx
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStartVideo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillCancelInput
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillGetInputLength
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillInput
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillInputBlocking
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillPollInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillWaitInputEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStopVideo
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamWaitReadVideoFrameEnd
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbDeactivate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbGetDrvState
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbGetState
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbStop
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbstorBootSetCapacity
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbstorBootUnregisterNotify
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCheckNetParam
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCopyNetParam
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCreateNetParam
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityDeleteNetParam
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogAbort
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataGetStatus
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataInitStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataShutdownStart
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataUpdate
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevAttach
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevDetach
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevIsPowerOn
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanGetEtherAddr
import io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanGetSwitchState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    libc_psp_sceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioOutput(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioOutputBlocking(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioOutputPanned(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    libc_psp_sceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    libc_psp_sceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    libc_psp_sceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    libc_psp_sceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    libc_psp_sceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    libc_psp_sceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    libc_psp_sceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioOutput2OutputBlocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutput2GetRestSample(): Int =
    libc_psp_sceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    libc_psp_sceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    libc_psp_sceAudioSRCOutputBlocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    libc_psp_sceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    libc_psp_sceAudioInputInitEx(params?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioGetInputLength(): Int =
    libc_psp_sceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    libc_psp_sceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    libc_psp_sceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    libc_psp_sceAtracGetAtracID(uiCodecType)

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    libc_psp_sceAtracSetDataAndGetID(buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    libc_psp_sceAtracDecodeData(atracId, outSamples?.value?.toCPointer<ByteVar>(), outN?.value?.toCPointer<ByteVar>(), outEnd?.value?.toCPointer<ByteVar>(), outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    libc_psp_sceAtracGetRemainFrame(atracId, outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    libc_psp_sceAtracGetStreamDataInfo(atracId, writePointer?.value?.toCPointer<ByteVar>(), availableBytes?.value?.toCPointer<ByteVar>(), readOffset?.value?.toCPointer<ByteVar>())

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    libc_psp_sceAtracAddStreamData(atracId, bytesToAdd)

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    libc_psp_sceAtracGetBitrate(atracId, outBitrate?.value?.toCPointer<ByteVar>())

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    libc_psp_sceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    libc_psp_sceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    libc_psp_sceAtracGetNextSample(atracId, outN?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    libc_psp_sceAtracGetMaxSample(atracId, outMax?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    libc_psp_sceAtracGetBufferInfoForReseting(atracId, uiSample, pbufferInfo?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    libc_psp_sceAtracGetChannel(atracId, puiChannel?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    libc_psp_sceAtracGetInternalErrorInfo(atracId, piResult?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    libc_psp_sceAtracGetLoopStatus(atracId, piLoopNum?.value?.toCPointer<ByteVar>(), puiLoopStatus?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    libc_psp_sceAtracGetNextDecodePosition(atracId, puiSamplePosition?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    libc_psp_sceAtracGetSecondBufferInfo(atracId, puiPosition?.value?.toCPointer<ByteVar>(), puiDataByte?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    libc_psp_sceAtracGetSoundSample(atracId, piEndSample?.value?.toCPointer<ByteVar>(), piLoopStartSample?.value?.toCPointer<ByteVar>(), piLoopEndSample?.value?.toCPointer<ByteVar>())

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    libc_psp_sceAtracResetPlayPosition(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    libc_psp_sceAtracSetData(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiBufferByte)

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    libc_psp_sceAtracSetHalfwayBuffer(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    libc_psp_sceAtracSetHalfwayBufferAndGetID(pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    libc_psp_sceAtracSetSecondBuffer(atracId, pucSecondBufferAddr?.value?.toCPointer<ByteVar>(), uiSecondBufferByte)

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    libc_psp_sceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    libc_psp_sceCtrlGetSamplingCycle(pcycle?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    libc_psp_sceCtrlGetSamplingMode(pmode?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    libc_psp_sceCtrlPeekBufferPositive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    libc_psp_sceCtrlPeekBufferNegative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    libc_psp_sceCtrlReadBufferPositive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    libc_psp_sceCtrlReadBufferNegative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    libc_psp_sceCtrlPeekLatch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    libc_psp_sceCtrlReadLatch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    libc_psp_sceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    libc_psp_sceCtrlGetIdleCancelThreshold(idlereset?.value?.toCPointer<ByteVar>(), idleback?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    libc_psp_sceDisplayGetMode(pmode?.value?.toCPointer<ByteVar>(), pwidth?.value?.toCPointer<ByteVar>(), pheight?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    libc_psp_sceDisplayGetVcount()

public actual fun sceDisplayWaitVblank(): Int =
    libc_psp_sceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    libc_psp_sceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    libc_psp_sceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    libc_psp_sceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    libc_psp_sceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    libc_psp_sceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    libc_psp_sceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    libc_psp_sceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    libc_psp_sceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    libc_psp_sceGeEdramGetSize()

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    libc_psp_sceGeEdramGetAddr()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    libc_psp_sceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    libc_psp_sceGeGetCmd(cmd)

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    libc_psp_sceGeGetStack(stackId, stack?.value?.toCPointer<ByteVar>())

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    libc_psp_sceGeSaveContext(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    libc_psp_sceGeRestoreContext(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    libc_psp_sceGeListEnQueue(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    libc_psp_sceGeListEnQueueHead(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListDeQueue(qid: Int): Int =
    libc_psp_sceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    libc_psp_sceGeListUpdateStallAddr(qid, stall?.value?.toCPointer<ByteVar>())

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    libc_psp_sceGeBreak(mode, pParam?.value?.toCPointer<ByteVar>())

public actual fun sceGeContinue(): Int =
    libc_psp_sceGeContinue()

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    libc_psp_sceGeSetCallback(cb?.value?.toCPointer<ByteVar>())

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    libc_psp_sceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    libc_psp_sceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    libc_psp_sceKernelLoadExec(file?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    null

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    libc_psp_sceKernelTotalFreeMemSize()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    libc_psp_sceKernelMaxFreeMemSize()

public actual fun sceKernelDevkitVersion(): UInt =
    libc_psp_sceKernelDevkitVersion()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    libc_psp_sceKernelSetCompiledSdkVersion(version)

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    libc_psp_sceKernelGetCompiledSdkVersion()

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    libc_psp_sceKernelLibcTime(t?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLibcClock(): UInt =
    libc_psp_sceKernelLibcClock()

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    libc_psp_sceKernelLibcGettimeofday(tp?.value?.toCPointer<ByteVar>(), tzp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDcacheWritebackAll() {
    libc_psp_sceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    libc_psp_sceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    libc_psp_sceKernelDcacheWritebackRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    libc_psp_sceKernelDcacheWritebackInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    libc_psp_sceKernelDcacheInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelIcacheInvalidateAll() {
    libc_psp_sceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    libc_psp_sceKernelIcacheInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    libc_psp_sceKernelUtilsMt19937Init(ctx?.value?.toCPointer<ByteVar>(), seed)

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    libc_psp_sceKernelUtilsMt19937UInt(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsMd5Digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsMd5BlockInit(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    libc_psp_sceKernelUtilsMd5BlockUpdate(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsMd5BlockResult(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsSha1Digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsSha1BlockInit(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    libc_psp_sceKernelUtilsSha1BlockUpdate(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    libc_psp_sceKernelUtilsSha1BlockResult(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    libc_psp_sceKernelRegisterSubIntrHandler(intNo, no, handler?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    libc_psp_sceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    libc_psp_sceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    libc_psp_sceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    libc_psp_sceKernelCpuSuspendIntr()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    libc_psp_sceKernelCpuResumeIntr(flags)
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    libc_psp_sceKernelCpuResumeIntrWithSync(flags)
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    libc_psp_sceKernelIsCpuIntrSuspended(flags)

public actual fun sceKernelIsCpuIntrEnable(): Int =
    libc_psp_sceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    0

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    libc_psp_sceKernelSelfStopUnloadModule(unknown, argSize, argp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    libc_psp_sceKernelStopUnloadSelfModule(argSize, argp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    libc_psp_sceKernelGetModuleIdList(readBuf?.value?.toCPointer<ByteVar>(), readBufSize, idCount?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    libc_psp_sceKernelVolatileMemLock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    libc_psp_sceKernelVolatileMemTryLock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    libc_psp_sceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    SceUid()

public actual fun sceKernelStdout(): SceUid =
    SceUid()

public actual fun sceKernelStderr(): SceUid =
    SceUid()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    SceKernelIdListType.entries.first()

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    0

public actual fun sceKernelExitThread(status: Int): Int =
    libc_psp_sceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    libc_psp_sceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    libc_psp_sceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    libc_psp_sceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    libc_psp_sceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    libc_psp_sceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    0

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    0

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelDelayThread(delay: UInt): Int =
    libc_psp_sceKernelDelayThread(delay)

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    libc_psp_sceKernelDelayThreadCB(delay)

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    libc_psp_sceKernelDelaySysClockThread(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    libc_psp_sceKernelDelaySysClockThreadCB(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    libc_psp_sceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    libc_psp_sceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    libc_psp_sceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    libc_psp_sceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    libc_psp_sceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    0

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    0

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    0

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    0

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: COpaquePointer?): Int =
    0

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    0

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: COpaquePointer?): Int =
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
    libc_psp_sceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    0

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    libc_psp_sceKernelReferSystemStatus(status?.value?.toCPointer<ByteVar>())

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    0

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: COpaquePointer?, recv: COpaquePointer?): Int =
    0

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    0

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelVpl(uid: SceUid, num: COpaquePointer?): Int =
    0

public actual fun sceKernelReferVplStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: COpaquePointer?): Int =
    libc_psp_sceKernelCreateFpl(name?.value?.toCPointer<ByteVar>(), part, attr, size, blocks, opt?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: COpaquePointer?): Int =
    0

public actual fun sceKernelReferFplStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: COpaquePointer?): Int =
    libc_psp_sceKernelUSec2SysClock(usec, clock?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    libc_psp_sceKernelUSec2SysClockWide(usec)

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    libc_psp_sceKernelSysClock2USec(clock?.value?.toCPointer<ByteVar>(), low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    libc_psp_sceKernelSysClock2USecWide(clock, low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    libc_psp_sceKernelGetSystemTime(time?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTimeWide(): Long =
    libc_psp_sceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    libc_psp_sceKernelGetSystemTimeLow()

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: COpaquePointer?): Int =
    0

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    0L

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    0

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    0L

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    0

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    0L

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: COpaquePointer?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    0

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadProfiler(): COpaquePointer? =
    libc_psp_sceKernelReferThreadProfiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    libc_psp_sceKernelReferGlobalProfiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    libc_psp_sceUsbStart(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    libc_psp_sceUsbStop(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbActivate(pid: UInt): Int =
    libc_psp_sceUsbActivate(pid)

public actual fun sceUsbDeactivate(pid: UInt): Int =
    libc_psp_sceUsbDeactivate(pid)

public actual fun sceUsbGetState(): Int =
    libc_psp_sceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    libc_psp_sceUsbGetDrvState(driverName?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    libc_psp_sceUsbCamSetupStill(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    libc_psp_sceUsbCamSetupStillEx(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    libc_psp_sceUsbCamStillInputBlocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    libc_psp_sceUsbCamStillInput(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    libc_psp_sceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    libc_psp_sceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    libc_psp_sceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    libc_psp_sceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    libc_psp_sceUsbCamSetupVideo(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    libc_psp_sceUsbCamSetupVideoEx(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    libc_psp_sceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    libc_psp_sceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    libc_psp_sceUsbCamReadVideoFrameBlocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    libc_psp_sceUsbCamReadVideoFrame(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    libc_psp_sceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    libc_psp_sceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    libc_psp_sceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    libc_psp_sceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    libc_psp_sceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    libc_psp_sceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    libc_psp_sceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    libc_psp_sceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    libc_psp_sceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetSaturation(saturation?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetBrightness(brightness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetContrast(contrast?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetSharpness(sharpness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetImageEffectMode(effectMode?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetEvLevel(exposureLevel?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetReverseMode(reverseFlags?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    libc_psp_sceUsbCamGetZoom(zoom?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    libc_psp_sceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    libc_psp_sceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    libc_psp_sceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    libc_psp_sceUsbstorBootUnregisterNotify(eventFlag)

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    libc_psp_sceUsbstorBootSetCapacity(size)

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    libc_psp_scePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    libc_psp_scePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    libc_psp_scePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    libc_psp_scePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    libc_psp_scePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    libc_psp_scePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    libc_psp_scePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    libc_psp_scePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    libc_psp_scePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    libc_psp_scePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    libc_psp_scePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    libc_psp_scePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    libc_psp_scePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    libc_psp_scePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    libc_psp_scePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    libc_psp_scePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    libc_psp_scePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    libc_psp_scePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    libc_psp_scePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    libc_psp_scePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    libc_psp_scePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    libc_psp_scePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    libc_psp_scePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    libc_psp_scePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    libc_psp_scePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    libc_psp_scePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    libc_psp_scePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    libc_psp_sceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    libc_psp_sceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    libc_psp_sceWlanGetEtherAddr(etherAddr?.value?.toCPointer<ByteVar>())

public actual fun sceWlanDevAttach(): Int =
    libc_psp_sceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    libc_psp_sceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    libc_psp_sceRtcGetTickResolution()

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    libc_psp_sceRtcGetCurrentTick(tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    libc_psp_sceRtcGetCurrentClock(tm?.value?.toCPointer<ByteVar>(), tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    libc_psp_sceRtcGetCurrentClockLocalTime(tm?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    libc_psp_sceRtcConvertUtcToLocalTime(tickUtc?.value?.toCPointer<ByteVar>(), tickLocal?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    libc_psp_sceRtcConvertLocalTimeToUTC(tickLocal?.value?.toCPointer<ByteVar>(), tickUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcIsLeapYear(year: Int): Int =
    libc_psp_sceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    libc_psp_sceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    libc_psp_sceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    libc_psp_sceRtcCheckValid(date?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    libc_psp_sceRtcSetTick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    libc_psp_sceRtcGetTick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    libc_psp_sceRtcCompareTick(tick1?.value?.toCPointer<ByteVar>(), tick2?.value?.toCPointer<ByteVar>())

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    libc_psp_sceRtcTickAddTicks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numTicks)

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    libc_psp_sceRtcTickAddMicroseconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMs)

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    libc_psp_sceRtcTickAddSeconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numSeconds)

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    libc_psp_sceRtcTickAddMinutes(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMinutes)

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    libc_psp_sceRtcTickAddHours(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numHours)

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    libc_psp_sceRtcTickAddDays(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numDays)

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    libc_psp_sceRtcTickAddWeeks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numWeeks)

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    libc_psp_sceRtcTickAddMonths(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMonths)

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    libc_psp_sceRtcTickAddYears(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numYears)

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    libc_psp_sceRtcSetTimeT(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    libc_psp_sceRtcGetTimeT(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    libc_psp_sceRtcSetTime64T(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    libc_psp_sceRtcGetTime64T(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    libc_psp_sceRtcSetDosTime(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    libc_psp_sceRtcGetDosTime(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    libc_psp_sceRtcSetWin32FileTime(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    libc_psp_sceRtcGetWin32FileTime(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    libc_psp_sceRtcParseDateTime(destTick?.value?.toCPointer<ByteVar>(), dateString?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    libc_psp_sceRtcFormatRFC3339(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    libc_psp_sceRtcFormatRFC3339LocalTime(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    libc_psp_sceRtcParseRFC3339(pUtc?.value?.toCPointer<ByteVar>(), pszDateTime?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    libc_psp_sceRtcFormatRFC2822(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    libc_psp_sceRtcFormatRFC2822LocalTime(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoClose(fd: SceUid): Int =
    0

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    0

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    0L

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    libc_psp_sceIoRemove(file?.value?.toCPointer<ByteVar>())

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    libc_psp_sceIoMkdir(dir?.value?.toCPointer<ByteVar>(), mode)

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    libc_psp_sceIoRmdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    libc_psp_sceIoChdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    libc_psp_sceIoRename(oldname?.value?.toCPointer<ByteVar>(), newname?.value?.toCPointer<ByteVar>())

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    libc_psp_sceIoDevctl(dev?.value?.toCPointer<ByteVar>(), cmd, indata?.value?.toCPointer<ByteVar>(), inlen, outdata?.value?.toCPointer<ByteVar>(), outlen)

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    libc_psp_sceIoUnassign(dev?.value?.toCPointer<ByteVar>())

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    libc_psp_sceIoGetstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    libc_psp_sceIoChstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>(), bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    libc_psp_sceIoSync(device?.value?.toCPointer<ByteVar>(), unk)

public actual fun sceIoWaitAsync(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoPollAsync(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: COpaquePointer?): Int =
    0

public actual fun sceIoCancel(fd: SceUid): Int =
    0

public actual fun sceIoGetDevType(fd: SceUid): Int =
    0

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    0

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    0

public actual fun sceJpegInitMJpeg(): Int =
    libc_psp_sceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    libc_psp_sceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    libc_psp_sceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    libc_psp_sceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    libc_psp_sceJpegDecodeMJpeg(jpegBuf?.value?.toCPointer<ByteVar>(), size, rgba?.value?.toCPointer<ByteVar>(), unk)

public actual fun sceUmdCheckMedium(): Int =
    libc_psp_sceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    libc_psp_sceUmdGetDiscInfo(info?.value?.toCPointer<ByteVar>())

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    libc_psp_sceUmdActivate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    libc_psp_sceUmdDeactivate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    libc_psp_sceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    libc_psp_sceUmdWaitDriveStatWithTimer(state, timeout)

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    libc_psp_sceUmdWaitDriveStatCB(state, timeout)

public actual fun sceUmdCancelWaitDriveStat(): Int =
    libc_psp_sceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    libc_psp_sceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    libc_psp_sceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    libc_psp_sceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    libc_psp_sceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    libc_psp_sceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    libc_psp_sceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    libc_psp_sceMpegInit()

public actual fun sceMpegFinish() {
    libc_psp_sceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    libc_psp_sceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    libc_psp_sceMpegRingbufferConstruct(ringbuffer?.value?.toCPointer<ByteVar>(), packets, data?.value?.toCPointer<ByteVar>(), size, 0L.toCPointer<ByteVar>(), cbParam?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
    libc_psp_sceMpegRingbufferDestruct(ringbuffer?.value?.toCPointer<ByteVar>())
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    libc_psp_sceMpegRingbufferAvailableSize(ringbuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    libc_psp_sceMpegRingbufferPut(ringbuffer?.value?.toCPointer<ByteVar>(), numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    libc_psp_sceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    libc_psp_sceMpegQueryStreamSize(buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    SceMpegStream()

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    0

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    null

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: COpaquePointer?, outSize: COpaquePointer?): Int =
    0

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: COpaquePointer?): Int =
    0

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: COpaquePointer?, iframeWidth: Int, buffer: COpaquePointer?, init: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: COpaquePointer?): Int =
    0

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    0

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: COpaquePointer?, buffer: COpaquePointer?, init: Int): Int =
    0

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: COpaquePointer?, type: Int): Int =
    libc_psp_sceMpegBaseYCrCbCopyVme(yuvBuffer?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    libc_psp_sceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    libc_psp_sceMpegBaseCscVme(rgbBuffer?.value?.toCPointer<ByteVar>(), rgbBuffer2?.value?.toCPointer<ByteVar>(), width, yCrCbBuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    libc_psp_sceMpegbaseBea18f91(lli?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    libc_psp_sceHprmPeekCurrentKey(key?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    libc_psp_sceHprmPeekLatch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    libc_psp_sceHprmReadLatch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmIsHeadphoneExist(): Int =
    libc_psp_sceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    libc_psp_sceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    libc_psp_sceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    libc_psp_sceGuDepthBuffer(zbp?.value?.toCPointer<ByteVar>(), zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    libc_psp_sceGuDispBuffer(width, height, dispbp?.value?.toCPointer<ByteVar>(), dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    libc_psp_sceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
    libc_psp_sceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    libc_psp_sceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    libc_psp_sceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    libc_psp_sceGuFog(near, far, color)
}

public actual fun sceGuInit() {
    libc_psp_sceGuInit()
}

public actual fun sceGuTerm() {
    libc_psp_sceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    libc_psp_sceGuBreak(mode)
}

public actual fun sceGuContinue() {
    libc_psp_sceGuContinue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    null

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    libc_psp_sceGuGetMemory(size)?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
}

public actual fun sceGuFinish(): Int =
    libc_psp_sceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    libc_psp_sceGuFinishId(id)

public actual fun sceGuCallList(list: COpaquePointer?) {
    libc_psp_sceGuCallList(list?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuCallMode(mode: Int) {
    libc_psp_sceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    libc_psp_sceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    libc_psp_sceGuSwapBuffers()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    GeListState.entries.first()

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    libc_psp_sceGuBeginObject(vtype, count, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuEndObject() {
    libc_psp_sceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
    libc_psp_sceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    libc_psp_sceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    libc_psp_sceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    libc_psp_sceGuLightColor(light, component, color)
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
    libc_psp_sceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    libc_psp_sceGuClearColor(color)
}

public actual fun sceGuClearDepth(depth: UInt) {
    libc_psp_sceGuClearDepth(depth)
}

public actual fun sceGuClearStencil(stencil: UInt) {
    libc_psp_sceGuClearStencil(stencil)
}

public actual fun sceGuPixelMask(mask: UInt) {
    libc_psp_sceGuPixelMask(mask)
}

public actual fun sceGuColor(color: UInt) {
    libc_psp_sceGuColor(color)
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
    libc_psp_sceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
    libc_psp_sceGuAmbient(color)
}

public actual fun sceGuAmbientColor(color: UInt) {
    libc_psp_sceGuAmbientColor(color)
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    libc_psp_sceGuMaterial(components, color)
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    libc_psp_sceGuModelColor(emissive, ambient, diffuse, specular)
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
    libc_psp_sceGuSpecular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
}

public actual fun sceGuTexEnvColor(color: UInt) {
    libc_psp_sceGuTexEnvColor(color)
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
    libc_psp_sceGuTexFlush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    libc_psp_sceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    libc_psp_sceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    libc_psp_sceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    libc_psp_sceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    libc_psp_sceGuClutLoad(numBlocks, cbp?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    libc_psp_sceGuOffset(x, y)
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    libc_psp_sceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    libc_psp_sceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    libc_psp_sceGuDrawBezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    libc_psp_sceGuPatchDivide(ulevel, vlevel)
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    libc_psp_sceGuPatchFrontFace(a0)
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    libc_psp_sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    libc_psp_sceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    libc_psp_sceGumDrawBezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    libc_psp_sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumFastInverse() {
    libc_psp_sceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    libc_psp_sceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    libc_psp_sceGumLoadIdentity()
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
    libc_psp_sceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    libc_psp_sceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    libc_psp_sceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    libc_psp_sceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    libc_psp_sceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    libc_psp_sceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    libc_psp_sceGumRotateZ(angle)
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
    libc_psp_sceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    libc_psp_sceMp3ReserveMp3Handle(args?.value?.toCPointer<ByteVar>())

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    libc_psp_sceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    libc_psp_sceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    0

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    0

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: COpaquePointer?, srcPos: COpaquePointer?): Int =
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

public actual fun sceRegOpenRegistry(reg: COpaquePointer?, mode: Int, handle: COpaquePointer?): Int =
    libc_psp_sceRegOpenRegistry(reg?.value?.toCPointer<ByteVar>(), mode, handle?.value?.toCPointer<ByteVar>())

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: COpaquePointer?): Int =
    0

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    0

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    0

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    0

public actual fun sceRegRemoveRegistry(key: COpaquePointer?): Int =
    libc_psp_sceRegRemoveRegistry(key?.value?.toCPointer<ByteVar>())

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    libc_psp_sceOpenPSIDGetOpenPSID(openpsid?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    libc_psp_sceUtilityMsgDialogInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogShutdownStart() {
    libc_psp_sceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    libc_psp_sceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    libc_psp_sceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    libc_psp_sceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    libc_psp_sceUtilityNetconfInitStart(data?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityNetconfShutdownStart(): Int =
    libc_psp_sceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    libc_psp_sceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    libc_psp_sceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    libc_psp_sceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    libc_psp_sceUtilitySavedataInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilitySavedataGetStatus(): Int =
    libc_psp_sceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    libc_psp_sceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    libc_psp_sceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    libc_psp_sceUtilityGameSharingInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityGameSharingShutdownStart() {
    libc_psp_sceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    libc_psp_sceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    libc_psp_sceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    libc_psp_sceUtilityHtmlViewerInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    libc_psp_sceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    libc_psp_sceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    libc_psp_sceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    libc_psp_sceUtilityOskInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityOskShutdownStart(): Int =
    libc_psp_sceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    libc_psp_sceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    libc_psp_sceUtilityOskGetStatus()

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
    libc_psp_sceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    libc_psp_sceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    libc_psp_sceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    libc_psp_sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    libc_psp_sceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    libc_psp_sceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    libc_psp_sceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    libc_psp_sceNetEtherStrton(name?.value?.toCPointer<ByteVar>(), mac?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    libc_psp_sceNetEtherNtostr(mac?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    libc_psp_sceNetGetLocalEtherAddr(mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    libc_psp_sceNetGetMallocStat(stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlInit(stacksize, priority, adhocId?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlTerm(): Int =
    libc_psp_sceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlConnect(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDisconnect(): Int =
    libc_psp_sceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetState(event?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlCreate(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlJoin(scaninfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetAdhocId(id?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    libc_psp_sceNetAdhocctlCreateEnterGameMode(name?.value?.toCPointer<ByteVar>(), unknown, num, macs?.value?.toCPointer<ByteVar>(), timeout, unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    libc_psp_sceNetAdhocctlJoinEnterGameMode(name?.value?.toCPointer<ByteVar>(), hostmac?.value?.toCPointer<ByteVar>(), timeout, unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetGameModeInfo(gamemodeinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlExitGameMode(): Int =
    libc_psp_sceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetPeerList(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetPeerInfo(mac?.value?.toCPointer<ByteVar>(), size, peerinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlScan(): Int =
    libc_psp_sceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetScanInfo(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlAddHandler(0L.toCPointer<ByteVar>(), unknown?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    libc_psp_sceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetNameByAddr(mac?.value?.toCPointer<ByteVar>(), nickname?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetAddrByName(nickname?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    libc_psp_sceNetAdhocctlGetParameter(params?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocInit(): Int =
    libc_psp_sceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    libc_psp_sceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    libc_psp_sceNetAdhocPdpCreate(mac?.value?.toCPointer<ByteVar>(), port, bufSize, unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    libc_psp_sceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPdpSend(id, destMacAddr?.value?.toCPointer<ByteVar>(), port, data?.value?.toCPointer<ByteVar>(), len, timeout, nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPdpRecv(id, srcMacAddr?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), dataLength?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    libc_psp_sceNetAdhocGetPdpStat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    libc_psp_sceNetAdhocGameModeCreateMaster(data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    libc_psp_sceNetAdhocGameModeCreateReplica(mac?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    libc_psp_sceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    libc_psp_sceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    libc_psp_sceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    libc_psp_sceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    libc_psp_sceNetAdhocPtpOpen(srcmac?.value?.toCPointer<ByteVar>(), srcport, destmac?.value?.toCPointer<ByteVar>(), destport, bufSize, delay, count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPtpConnect(id, timeout, nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    libc_psp_sceNetAdhocPtpListen(srcmac?.value?.toCPointer<ByteVar>(), srcport, bufSize, delay, count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPtpAccept(id, mac?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPtpSend(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPtpRecv(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    libc_psp_sceNetAdhocPtpFlush(id, timeout, nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    libc_psp_sceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    libc_psp_sceNetAdhocGetPtpStat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    libc_psp_sceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    libc_psp_sceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    libc_psp_sceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    libc_psp_sceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingSelectTarget(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingCancelTarget(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingSendData(matchingId, mac?.value?.toCPointer<ByteVar>(), dataLen, data?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingAbortSendData(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingGetHelloOpt(matchingId, optLen?.value?.toCPointer<ByteVar>(), optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingGetMembers(matchingId, length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    libc_psp_sceNetAdhocMatchingGetPoolStat(poolstat?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    libc_psp_sceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    libc_psp_sceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    libc_psp_sceNetApctlAddHandler(0L.toCPointer<ByteVar>(), parg?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    libc_psp_sceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    libc_psp_sceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    libc_psp_sceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    libc_psp_sceNetApctlGetState(pstate?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetInit(): Int =
    libc_psp_sceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    libc_psp_sceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    libc_psp_sceNetInetAccept(s, addr?.value?.toCPointer<ByteVar>(), addrLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    libc_psp_sceNetInetBind(s, myAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    libc_psp_sceNetInetConnect(s, servAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    libc_psp_sceNetInetGetsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optlEn?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    libc_psp_sceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    libc_psp_sceNetInetRecv(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    libc_psp_sceNetInetRecvfrom(s, buf?.value?.toCPointer<ByteVar>(), flags, arg1, from?.value?.toCPointer<ByteVar>(), fromLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    libc_psp_sceNetInetSend(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    libc_psp_sceNetInetSendto(s, buf?.value?.toCPointer<ByteVar>(), len, flags, to?.value?.toCPointer<ByteVar>(), toLen)

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    libc_psp_sceNetInetSetsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optLen)

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    libc_psp_sceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    libc_psp_sceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    libc_psp_sceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    libc_psp_sceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    libc_psp_sceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    libc_psp_sceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    libc_psp_sceSslGetUsedMemoryMax(memory?.value?.toCPointer<ByteVar>())

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    libc_psp_sceSslGetUsedMemoryCurrent(memory?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInit(unknown1: UInt): Int =
    libc_psp_sceHttpInit(unknown1)

public actual fun sceHttpEnd(): Int =
    libc_psp_sceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    libc_psp_sceHttpCreateTemplate(agent?.value?.toCPointer<ByteVar>(), unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    libc_psp_sceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    libc_psp_sceHttpCreateConnection(templateid, host?.value?.toCPointer<ByteVar>(), unknown1?.value?.toCPointer<ByteVar>(), port, unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    libc_psp_sceHttpCreateConnectionWithURL(templateid, url?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    libc_psp_sceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    libc_psp_sceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    libc_psp_sceHttpSendRequest(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    libc_psp_sceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    libc_psp_sceHttpReadData(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    libc_psp_sceHttpGetContentLength(requestId, contentLength?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    libc_psp_sceHttpGetStatusCode(requestId, statusCode?.value?.toCPointer<ByteVar>())

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    libc_psp_sceHttpSetResolveTimeOut(id, timeout)

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    libc_psp_sceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    libc_psp_sceHttpSetConnectTimeOut(id, timeout)

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    libc_psp_sceHttpSetSendTimeOut(id, timeout)

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    libc_psp_sceHttpSetRecvTimeOut(id, timeout)

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    libc_psp_sceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    libc_psp_sceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    libc_psp_sceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    libc_psp_sceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    libc_psp_sceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    libc_psp_sceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    libc_psp_sceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    libc_psp_sceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    libc_psp_sceHttpAddExtraHeader(id, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    libc_psp_sceHttpDeleteHeader(id, name?.value?.toCPointer<ByteVar>())

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    libc_psp_sceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    libc_psp_sceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    libc_psp_sceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    libc_psp_sceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    libc_psp_sceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    libc_psp_sceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    libc_psp_sceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    libc_psp_sceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    libc_psp_sceHttpGetAllHeader(request, header?.value?.toCPointer<ByteVar>(), headerSize?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    libc_psp_sceHttpGetNetworkErrno(request, errNum?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    libc_psp_sceHttpGetProxy(id, activateFlag?.value?.toCPointer<ByteVar>(), mode?.value?.toCPointer<ByteVar>(), proxyHost?.value?.toCPointer<ByteVar>(), len, proxyPort?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    libc_psp_sceHttpInitCache(maxSize)

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    libc_psp_sceHttpSetAuthInfoCB(id, 0L.toCPointer<ByteVar>())

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    libc_psp_sceHttpSetProxy(id, activateFlag, mode, newProxyHost?.value?.toCPointer<ByteVar>(), newProxyPort)

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    libc_psp_sceHttpSetResHeaderMaxSize(id, headerSize)

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    libc_psp_sceHttpSetMallocFunction(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun sceNetResolverInit(): Int =
    libc_psp_sceNetResolverInit()

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    libc_psp_sceNetResolverCreate(rid?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufLength)

public actual fun sceNetResolverDelete(rid: Int): Int =
    libc_psp_sceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    libc_psp_sceNetResolverStartNtoA(rid, hostname?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>(), timeout, retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    libc_psp_sceNetResolverStartAtoN(rid, addr?.value?.toCPointer<ByteVar>(), hostname?.value?.toCPointer<ByteVar>(), hostnameLen, timeout, retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    libc_psp_sceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    libc_psp_sceNetResolverTerm()
