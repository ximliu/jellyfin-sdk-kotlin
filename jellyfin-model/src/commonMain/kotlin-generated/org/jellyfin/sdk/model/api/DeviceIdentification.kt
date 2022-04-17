// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class DeviceIdentification(
	/**
	 * Gets or sets the name of the friendly.
	 */
	@SerialName("FriendlyName")
	public val friendlyName: String,
	/**
	 * Gets or sets the model number.
	 */
	@SerialName("ModelNumber")
	public val modelNumber: String,
	/**
	 * Gets or sets the serial number.
	 */
	@SerialName("SerialNumber")
	public val serialNumber: String,
	/**
	 * Gets or sets the name of the model.
	 */
	@SerialName("ModelName")
	public val modelName: String,
	/**
	 * Gets or sets the model description.
	 */
	@SerialName("ModelDescription")
	public val modelDescription: String,
	/**
	 * Gets or sets the model URL.
	 */
	@SerialName("ModelUrl")
	public val modelUrl: String,
	/**
	 * Gets or sets the manufacturer.
	 */
	@SerialName("Manufacturer")
	public val manufacturer: String,
	/**
	 * Gets or sets the manufacturer URL.
	 */
	@SerialName("ManufacturerUrl")
	public val manufacturerUrl: String,
	/**
	 * Gets or sets the headers.
	 */
	@SerialName("Headers")
	public val headers: List<HttpHeaderInfo>,
)