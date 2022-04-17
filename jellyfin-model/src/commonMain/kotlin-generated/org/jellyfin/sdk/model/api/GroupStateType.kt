// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enum GroupState.
 */
@Serializable
public enum class GroupStateType(
	public val serialName: String,
) {
	@SerialName("Idle")
	IDLE("Idle"),
	@SerialName("Waiting")
	WAITING("Waiting"),
	@SerialName("Paused")
	PAUSED("Paused"),
	@SerialName("Playing")
	PLAYING("Playing"),
	;

	public override fun toString(): String = serialName
}