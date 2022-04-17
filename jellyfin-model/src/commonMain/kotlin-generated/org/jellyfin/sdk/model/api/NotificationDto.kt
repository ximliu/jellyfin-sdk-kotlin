// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(DateTimeSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.serializer.DateTimeSerializer

/**
 * The notification DTO.
 */
@Serializable
public data class NotificationDto(
	/**
	 * Gets or sets the notification ID. Defaults to an empty string.
	 */
	@SerialName("Id")
	public val id: String,
	/**
	 * Gets or sets the notification's user ID. Defaults to an empty string.
	 */
	@SerialName("UserId")
	public val userId: String,
	/**
	 * Gets or sets the notification date.
	 */
	@SerialName("Date")
	public val date: DateTime,
	/**
	 * Gets or sets a value indicating whether the notification has been read. Defaults to false.
	 */
	@SerialName("IsRead")
	public val isRead: Boolean,
	/**
	 * Gets or sets the notification's name. Defaults to an empty string.
	 */
	@SerialName("Name")
	public val name: String,
	/**
	 * Gets or sets the notification's description. Defaults to an empty string.
	 */
	@SerialName("Description")
	public val description: String,
	/**
	 * Gets or sets the notification's URL. Defaults to an empty string.
	 */
	@SerialName("Url")
	public val url: String,
	/**
	 * Gets or sets the notification level.
	 */
	@SerialName("Level")
	public val level: NotificationLevel,
)