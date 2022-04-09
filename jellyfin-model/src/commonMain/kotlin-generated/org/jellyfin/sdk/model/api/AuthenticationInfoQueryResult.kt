// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Int
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class AuthenticationInfoQueryResult(
	/**
	 * Gets or sets the items.
	 */
	@SerialName("Items")
	public val items: List<AuthenticationInfo>? = null,
	/**
	 * Gets or sets the total number of records available.
	 */
	@SerialName("TotalRecordCount")
	public val totalRecordCount: Int,
	/**
	 * Gets or sets the index of the first record in Items.
	 */
	@SerialName("StartIndex")
	public val startIndex: Int,
)
