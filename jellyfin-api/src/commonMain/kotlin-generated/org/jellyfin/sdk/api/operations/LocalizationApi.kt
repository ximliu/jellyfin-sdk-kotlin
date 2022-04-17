// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.model.api.CountryInfo
import org.jellyfin.sdk.model.api.CultureDto
import org.jellyfin.sdk.model.api.LocalizationOption
import org.jellyfin.sdk.model.api.ParentalRating

public class LocalizationApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Gets known countries.
	 */
	public suspend fun getCountries(): Response<List<CountryInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<CountryInfo>>("/Localization/Countries", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets known cultures.
	 */
	public suspend fun getCultures(): Response<List<CultureDto>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<CultureDto>>("/Localization/Cultures", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets localization options.
	 */
	public suspend fun getLocalizationOptions(): Response<List<LocalizationOption>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<LocalizationOption>>("/Localization/Options", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets known parental ratings.
	 */
	public suspend fun getParentalRatings(): Response<List<ParentalRating>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<ParentalRating>>("/Localization/ParentalRatings", pathParameters,
				queryParameters, data)
		return response
	}
}