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
 * Enum ImageOutputFormat.
 */
@Serializable
public enum class ImageFormat(
	public val serialName: String,
) {
	@SerialName("Bmp")
	BMP("Bmp"),
	@SerialName("Gif")
	GIF("Gif"),
	@SerialName("Jpg")
	JPG("Jpg"),
	@SerialName("Png")
	PNG("Png"),
	@SerialName("Webp")
	WEBP("Webp"),
	;

	public override fun toString(): String = serialName
}
