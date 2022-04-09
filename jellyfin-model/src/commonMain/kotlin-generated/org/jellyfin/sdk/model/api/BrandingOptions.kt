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
 * The branding options.
 */
@Serializable
public data class BrandingOptions(
	/**
	 * Gets or sets the login disclaimer.
	 */
	@SerialName("LoginDisclaimer")
	public val loginDisclaimer: String? = null,
	/**
	 * Gets or sets the custom CSS.
	 */
	@SerialName("CustomCss")
	public val customCss: String? = null,
)
