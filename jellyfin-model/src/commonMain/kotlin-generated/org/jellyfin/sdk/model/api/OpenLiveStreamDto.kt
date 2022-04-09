// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Open live stream dto.
 */
@Serializable
public data class OpenLiveStreamDto(
	/**
	 * Gets or sets the open token.
	 */
	@SerialName("OpenToken")
	public val openToken: String? = null,
	/**
	 * Gets or sets the user id.
	 */
	@SerialName("UserId")
	public val userId: UUID? = null,
	/**
	 * Gets or sets the play session id.
	 */
	@SerialName("PlaySessionId")
	public val playSessionId: String? = null,
	/**
	 * Gets or sets the max streaming bitrate.
	 */
	@SerialName("MaxStreamingBitrate")
	public val maxStreamingBitrate: Int? = null,
	/**
	 * Gets or sets the start time in ticks.
	 */
	@SerialName("StartTimeTicks")
	public val startTimeTicks: Long? = null,
	/**
	 * Gets or sets the audio stream index.
	 */
	@SerialName("AudioStreamIndex")
	public val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the subtitle stream index.
	 */
	@SerialName("SubtitleStreamIndex")
	public val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets the max audio channels.
	 */
	@SerialName("MaxAudioChannels")
	public val maxAudioChannels: Int? = null,
	/**
	 * Gets or sets the item id.
	 */
	@SerialName("ItemId")
	public val itemId: UUID? = null,
	/**
	 * Gets or sets a value indicating whether to enable direct play.
	 */
	@SerialName("EnableDirectPlay")
	public val enableDirectPlay: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to enale direct stream.
	 */
	@SerialName("EnableDirectStream")
	public val enableDirectStream: Boolean? = null,
	/**
	 * A MediaBrowser.Model.Dlna.DeviceProfile represents a set of metadata which determines which
	 * content a certain device is able to play.
	 *
	 *
	 * Specifically, it defines the supported containers
	 * (`P:MediaBrowser.Model.Dlna.DeviceProfile.ContainerProfiles`) and
	 * codecs (`P:MediaBrowser.Model.Dlna.DeviceProfile.CodecProfiles`) (video and/or audio, including
	 * codec profiles and levels)
	 * the device is able to direct play (without transcoding or remuxing),
	 * as well as which containers/codecs to transcode to
	 * (`P:MediaBrowser.Model.Dlna.DeviceProfile.TranscodingProfiles`) in case it isn't.
	 */
	@SerialName("DeviceProfile")
	public val deviceProfile: DeviceProfile? = null,
	/**
	 * Gets or sets the device play protocols.
	 */
	@SerialName("DirectPlayProtocols")
	public val directPlayProtocols: List<MediaProtocol>,
)
